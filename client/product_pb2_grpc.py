# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import product_pb2 as product__pb2


class ProductServiceStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.GetProduct = channel.unary_unary(
        '/catalog.ProductService/GetProduct',
        request_serializer=product__pb2.GetProductRequest.SerializeToString,
        response_deserializer=product__pb2.GetProductReply.FromString,
        )
    self.HealthCheck = channel.unary_unary(
        '/catalog.ProductService/HealthCheck',
        request_serializer=product__pb2.Ping.SerializeToString,
        response_deserializer=product__pb2.Pong.FromString,
        )


class ProductServiceServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def GetProduct(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def HealthCheck(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_ProductServiceServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'GetProduct': grpc.unary_unary_rpc_method_handler(
          servicer.GetProduct,
          request_deserializer=product__pb2.GetProductRequest.FromString,
          response_serializer=product__pb2.GetProductReply.SerializeToString,
      ),
      'HealthCheck': grpc.unary_unary_rpc_method_handler(
          servicer.HealthCheck,
          request_deserializer=product__pb2.Ping.FromString,
          response_serializer=product__pb2.Pong.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'catalog.ProductService', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))