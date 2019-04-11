// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var user_pb = require('./user_pb.js');

function serialize_protos_GetUserRequest(arg) {
  if (!(arg instanceof user_pb.GetUserRequest)) {
    throw new Error('Expected argument of type protos.GetUserRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_protos_GetUserRequest(buffer_arg) {
  return user_pb.GetUserRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_protos_GetUserResponse(arg) {
  if (!(arg instanceof user_pb.GetUserResponse)) {
    throw new Error('Expected argument of type protos.GetUserResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_protos_GetUserResponse(buffer_arg) {
  return user_pb.GetUserResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_protos_Ping(arg) {
  if (!(arg instanceof user_pb.Ping)) {
    throw new Error('Expected argument of type protos.Ping');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_protos_Ping(buffer_arg) {
  return user_pb.Ping.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_protos_Pong(arg) {
  if (!(arg instanceof user_pb.Pong)) {
    throw new Error('Expected argument of type protos.Pong');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_protos_Pong(buffer_arg) {
  return user_pb.Pong.deserializeBinary(new Uint8Array(buffer_arg));
}


var UserServiceService = exports.UserServiceService = {
  getUser: {
    path: '/protos.UserService/GetUser',
    requestStream: false,
    responseStream: false,
    requestType: user_pb.GetUserRequest,
    responseType: user_pb.GetUserResponse,
    requestSerialize: serialize_protos_GetUserRequest,
    requestDeserialize: deserialize_protos_GetUserRequest,
    responseSerialize: serialize_protos_GetUserResponse,
    responseDeserialize: deserialize_protos_GetUserResponse,
  },
  healthcheck: {
    path: '/protos.UserService/Healthcheck',
    requestStream: false,
    responseStream: false,
    requestType: user_pb.Ping,
    responseType: user_pb.Pong,
    requestSerialize: serialize_protos_Ping,
    requestDeserialize: deserialize_protos_Ping,
    responseSerialize: serialize_protos_Pong,
    responseDeserialize: deserialize_protos_Pong,
  },
};

exports.UserServiceClient = grpc.makeGenericClientConstructor(UserServiceService);
