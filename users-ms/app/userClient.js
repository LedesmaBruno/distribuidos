const messages = require('../protoc/user_pb');
const services = require('../protoc/user_grpc_pb');

const grpc = require('grpc');
const config = require('./config.js');

function main() {
    const client = new services.UserServiceClient(config.ip + ':' + config.port, 
        grpc.credentials.createInsecure());

    const userRequest = new messages.GetUserRequest();
    userRequest.setId(1);
    
    client.getUser(userRequest, (err, response) => {
        if (err) {
            console.error(err);
        }
        else {
            console.log(response.getUser().toObject());
        }
    });

    const ping = new messages.Ping();

    client.healthcheck(ping, (err, response) => {
        if (err) {
            console.error(err);
        }
        else {
            console.log(response.toObject());
        }
    });
}

main();