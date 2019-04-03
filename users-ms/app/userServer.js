const PROTO_PATH =  '..\\..\\protobuf\\users\\user.proto';

const grpc = require('grpc');
const protoLoader = require('@grpc/proto-loader');
const config = require('../config.json');
const db = require('../db');

const packageDefinition = protoLoader.loadSync(PROTO_PATH, { keepCase: true });
const protoDescriptor = grpc.loadPackageDefinition(packageDefinition);
const services = protoDescriptor.protos;

async function GetUser(call, callback) {
    const res = await getResponse(call.request);
    callback(null, res);
}

function Healthcheck(call, callback) {
    callback(null, { response: 'service healthy' });
}

async function getResponse(getUserRequest) {
    const res = await db.getUserById(getUserRequest.id);
    return { user: res };
}

function getServer() {
    const server = new grpc.Server();
    server.addService(services.UserService.service, {
        GetUser: GetUser,
        Healthcheck: Healthcheck
    });
    return server;
}

const routeServer = getServer();
routeServer.bind(config.ip + ':' + config.port, grpc.ServerCredentials.createInsecure());
console.log('Running...');
routeServer.start();