const messages = require('../protoc/user_pb');
const services = require('../protoc/user_grpc_pb');

const grpc = require('grpc');
const config = require('./config.js');
const db = require('./db.js');
const Etcd = require('node-etcd');
const Ip = require('ip');

function GetUser(call, callback) {

    db.getUserById(call.request.getId(), (err, res) => {

        const reply = new messages.GetUserResponse();

        if (res.rows.length === 0) {
            reply.setUser(null);
            callback(err, reply);
            return;
        }

        const user = new messages.User();
        user.setId(res.rows[0].id);
        user.setName(res.rows[0].user_name);
        user.setSurname(res.rows[0].user_surname);
        user.setEmail(res.rows[0].user_email);
        user.setLastAccess(Number(res.rows[0].user_last_access));

        reply.setUser(user);

        callback(err, reply);
    });
}

function AddUser(call, callback) {
    db.addUser({
        name: call.request.getName(),
        surname: call.request.getSurname(),
        email: call.request.getEmail(),
        lastAccess: new Date()
    }, (err, res) => {
        const reply = new messages.AddUserResponse();
        reply.setId(res.rows[0].id);
        callback(err, reply);
    });
}

function DeleteUser(call, callback) {
    db.deleteUser(call.request.getId(), (err, res) => {
        const reply = new messages.DeleteUserResponse();
        reply.setId(call.request.getId());

        if (res.rowCount === 0) {
            reply.setId(-1);
        }

        callback(err, reply);
    });
}

function GetUsersByLastAccess(call, callback) {
    const before = new Date(call.request.getBefore());
    const after = new Date(call.request.getAfter());

    db.getUsersByLastAccess(before, after, (err, res) => {
        const reply = new messages.LastAccessResponse();
        const users = [];

        for (let i = 0; i < res.rows.length; i++) {
            const user = new messages.User();
            user.setId(res.rows[i].id);
            user.setName(res.rows[i].user_name);
            user.setSurname(res.rows[i].user_surname);
            user.setEmail(res.rows[i].user_email);
            user.setLastAccess(Number(res.rows[i].user_last_access));
            users.push(user);
        }

        reply.setUserList(users);
        callback(null, reply);
    });
}

function Healthcheck(call, callback) {
    callback(null, new messages.Pong());
}

function configETCD() {
    const ip = Ip.address();
    const key = '/services/users' + host;
    const value = String(ip + ':' + config.port);

    const etcd = new Etcd(config.etcd.hosts);
    etcd.set(key, value, console.log);

    // para hacer un get
    // etcd.get(key, (err, res) => console.log(res.node.nodes.map(r => r.value)));
}

function main() {
    configETCD();
    const server = new grpc.Server();
    server.addService(services.UserServiceService, {
        addUser: AddUser,
        getUser: GetUser,
        deleteUser: DeleteUser,
        getUsersByLastAccess: GetUsersByLastAccess,
        healthcheck: Healthcheck
    });
    
    server.bind(config.ip + ':' + config.port, grpc.ServerCredentials.createInsecure());
    console.log("Running...");
    server.start();
}

main();