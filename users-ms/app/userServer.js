const messages = require('../protoc/user_pb');
const services = require('../protoc/user_grpc_pb');

const grpc = require('grpc');
const config = require('./config.js');
const db = require('./db.js');

function GetUser(call, callback) {

    const userFromDB = db.getUserById(call.request.getId());

    const reply = new messages.GetUserResponse();
    const user = new messages.User();
    user.setId(userFromDB.id);
    user.setName(userFromDB.name);
    reply.setUser(user);

    callback(null, reply);
}

function GetUsersByLastAccess(call, callback) {
    const users = db.getUsersByLastAccess(call.request.getBefore(), call.request.getAfter());

    for(user in users) {
        const reply = new messages.GetUserResponse();
        const user = new messages.User();
        user.setId(user.id);
        user.setName(user.name);
        user.surname(user.surname);
        user.email(user.email);
        user.lastAccess(user.lastAccess);
        reply.setUser(user);
        callback(null, reply);
    }
}

function Healthcheck(call, callback) {
    const reply = new messages.Pong();
    reply.setResponse('esta todo bien');
    callback(null, reply);
}

function main() {
    const server = new grpc.Server();
    server.addService(services.UserServiceService, {
        getUser: GetUser,
        getUsersByLastAccess: GetUsersByLastAccess,
        healthcheck: Healthcheck
    });
    
    server.bind(config.ip + ':' + config.port, grpc.ServerCredentials.createInsecure());
    console.log("Running...");
    server.start();
}

main();