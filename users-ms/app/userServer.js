const messages = require('../protoc/user_pb');
const services = require('../protoc/user_grpc_pb');

const grpc = require('grpc');
const config = require('../config');

function GetUser(call, callback) {
    const reply = new messages.GetUserResponse();
    const user = new messages.User();
    user.setId(1);
    user.setName('Bruno');
    reply.setUser(user);
    callback(null, reply);
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
        healthcheck: Healthcheck
    });
    
    server.bind(config.ip + ':' + config.port, grpc.ServerCredentials.createInsecure());
    console.log("Running...");
    server.start();
}

main();