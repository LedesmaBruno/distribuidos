const PROTO_PATH = '..\\..\\protobuf\\users\\user.proto';
const config = require('../config');

const grpc = require('grpc');
const protoLoader = require('@grpc/proto-loader');

const packageDefinition = protoLoader.loadSync(
    PROTO_PATH,
    {
        keepCase: true
    });

const protoDescriptor = grpc.loadPackageDefinition(packageDefinition);
const userService = protoDescriptor.protos;

const _user = new userService.UserService(config.ip + ':' + config.port, grpc.credentials.createInsecure());

function getUser(id) {
    _user.GetUser({id: id}, function(err, response) {
        if (err) {
            handleError(err);
        } else {
            console.log(response);
        }
    });
}

function healthcheck() {
    _user.Healthcheck({}, function(err, response) {
        if (err) {
            handleError(err);
        } else {
            console.log(response);
        }
    });
}

function handleError(err) {
    console.error('Houston, we got a problem', err);
}

getUser(1);
healthcheck();
