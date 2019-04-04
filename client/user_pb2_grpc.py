# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import user_pb2 as user__pb2


class UserServiceStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.GetUser = channel.unary_unary(
        '/protos.UserService/GetUser',
        request_serializer=user__pb2.GetUserRequest.SerializeToString,
        response_deserializer=user__pb2.GetUserResponse.FromString,
        )
    self.Healthcheck = channel.unary_unary(
        '/protos.UserService/Healthcheck',
        request_serializer=user__pb2.Ping.SerializeToString,
        response_deserializer=user__pb2.Pong.FromString,
        )


class UserServiceServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def GetUser(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Healthcheck(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_UserServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'GetUser': grpc.unary_unary_rpc_method_handler(
          servicer.GetUser,
          request_deserializer=user__pb2.GetUserRequest.FromString,
          response_serializer=user__pb2.GetUserResponse.SerializeToString,
      ),
      'Healthcheck': grpc.unary_unary_rpc_method_handler(
          servicer.Healthcheck,
          request_deserializer=user__pb2.Ping.FromString,
          response_serializer=user__pb2.Pong.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'protos.UserService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))