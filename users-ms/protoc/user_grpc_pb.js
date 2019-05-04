// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var user_pb = require('./user_pb.js');

function serialize_protos_AddUserRequest(arg) {
  if (!(arg instanceof user_pb.AddUserRequest)) {
    throw new Error('Expected argument of type protos.AddUserRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_protos_AddUserRequest(buffer_arg) {
  return user_pb.AddUserRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_protos_AddUserResponse(arg) {
  if (!(arg instanceof user_pb.AddUserResponse)) {
    throw new Error('Expected argument of type protos.AddUserResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_protos_AddUserResponse(buffer_arg) {
  return user_pb.AddUserResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_protos_DeleteUserRequest(arg) {
  if (!(arg instanceof user_pb.DeleteUserRequest)) {
    throw new Error('Expected argument of type protos.DeleteUserRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_protos_DeleteUserRequest(buffer_arg) {
  return user_pb.DeleteUserRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_protos_DeleteUserResponse(arg) {
  if (!(arg instanceof user_pb.DeleteUserResponse)) {
    throw new Error('Expected argument of type protos.DeleteUserResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_protos_DeleteUserResponse(buffer_arg) {
  return user_pb.DeleteUserResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

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

function serialize_protos_LastAccessRequest(arg) {
  if (!(arg instanceof user_pb.LastAccessRequest)) {
    throw new Error('Expected argument of type protos.LastAccessRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_protos_LastAccessRequest(buffer_arg) {
  return user_pb.LastAccessRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_protos_LastAccessResponse(arg) {
  if (!(arg instanceof user_pb.LastAccessResponse)) {
    throw new Error('Expected argument of type protos.LastAccessResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_protos_LastAccessResponse(buffer_arg) {
  return user_pb.LastAccessResponse.deserializeBinary(new Uint8Array(buffer_arg));
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
  addUser: {
    path: '/protos.UserService/AddUser',
    requestStream: false,
    responseStream: false,
    requestType: user_pb.AddUserRequest,
    responseType: user_pb.AddUserResponse,
    requestSerialize: serialize_protos_AddUserRequest,
    requestDeserialize: deserialize_protos_AddUserRequest,
    responseSerialize: serialize_protos_AddUserResponse,
    responseDeserialize: deserialize_protos_AddUserResponse,
  },
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
  deleteUser: {
    path: '/protos.UserService/DeleteUser',
    requestStream: false,
    responseStream: false,
    requestType: user_pb.DeleteUserRequest,
    responseType: user_pb.DeleteUserResponse,
    requestSerialize: serialize_protos_DeleteUserRequest,
    requestDeserialize: deserialize_protos_DeleteUserRequest,
    responseSerialize: serialize_protos_DeleteUserResponse,
    responseDeserialize: deserialize_protos_DeleteUserResponse,
  },
  getUsersByLastAccess: {
    path: '/protos.UserService/GetUsersByLastAccess',
    requestStream: false,
    responseStream: false,
    requestType: user_pb.LastAccessRequest,
    responseType: user_pb.LastAccessResponse,
    requestSerialize: serialize_protos_LastAccessRequest,
    requestDeserialize: deserialize_protos_LastAccessRequest,
    responseSerialize: serialize_protos_LastAccessResponse,
    responseDeserialize: deserialize_protos_LastAccessResponse,
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
