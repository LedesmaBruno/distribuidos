package GrpcWishlist;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: wishlist/wishlist.proto")
public final class WishlistServiceGrpc {

  private WishlistServiceGrpc() {}

  public static final String SERVICE_NAME = "GrpcWishlist.WishlistService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GrpcWishlist.Wishlist.Ping,
      GrpcWishlist.Wishlist.Pong> getGetPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPing",
      requestType = GrpcWishlist.Wishlist.Ping.class,
      responseType = GrpcWishlist.Wishlist.Pong.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcWishlist.Wishlist.Ping,
      GrpcWishlist.Wishlist.Pong> getGetPingMethod() {
    io.grpc.MethodDescriptor<GrpcWishlist.Wishlist.Ping, GrpcWishlist.Wishlist.Pong> getGetPingMethod;
    if ((getGetPingMethod = WishlistServiceGrpc.getGetPingMethod) == null) {
      synchronized (WishlistServiceGrpc.class) {
        if ((getGetPingMethod = WishlistServiceGrpc.getGetPingMethod) == null) {
          WishlistServiceGrpc.getGetPingMethod = getGetPingMethod = 
              io.grpc.MethodDescriptor.<GrpcWishlist.Wishlist.Ping, GrpcWishlist.Wishlist.Pong>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "GrpcWishlist.WishlistService", "GetPing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcWishlist.Wishlist.Ping.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcWishlist.Wishlist.Pong.getDefaultInstance()))
                  .setSchemaDescriptor(new WishlistServiceMethodDescriptorSupplier("GetPing"))
                  .build();
          }
        }
     }
     return getGetPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcWishlist.Wishlist.WishlistRequest,
      GrpcWishlist.Wishlist.WishlistResponse> getGetWishlistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWishlist",
      requestType = GrpcWishlist.Wishlist.WishlistRequest.class,
      responseType = GrpcWishlist.Wishlist.WishlistResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcWishlist.Wishlist.WishlistRequest,
      GrpcWishlist.Wishlist.WishlistResponse> getGetWishlistMethod() {
    io.grpc.MethodDescriptor<GrpcWishlist.Wishlist.WishlistRequest, GrpcWishlist.Wishlist.WishlistResponse> getGetWishlistMethod;
    if ((getGetWishlistMethod = WishlistServiceGrpc.getGetWishlistMethod) == null) {
      synchronized (WishlistServiceGrpc.class) {
        if ((getGetWishlistMethod = WishlistServiceGrpc.getGetWishlistMethod) == null) {
          WishlistServiceGrpc.getGetWishlistMethod = getGetWishlistMethod = 
              io.grpc.MethodDescriptor.<GrpcWishlist.Wishlist.WishlistRequest, GrpcWishlist.Wishlist.WishlistResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "GrpcWishlist.WishlistService", "GetWishlist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcWishlist.Wishlist.WishlistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcWishlist.Wishlist.WishlistResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WishlistServiceMethodDescriptorSupplier("GetWishlist"))
                  .build();
          }
        }
     }
     return getGetWishlistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcWishlist.Wishlist.WishlistAddRequest,
      GrpcWishlist.Wishlist.Response> getAddToWishListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddToWishList",
      requestType = GrpcWishlist.Wishlist.WishlistAddRequest.class,
      responseType = GrpcWishlist.Wishlist.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcWishlist.Wishlist.WishlistAddRequest,
      GrpcWishlist.Wishlist.Response> getAddToWishListMethod() {
    io.grpc.MethodDescriptor<GrpcWishlist.Wishlist.WishlistAddRequest, GrpcWishlist.Wishlist.Response> getAddToWishListMethod;
    if ((getAddToWishListMethod = WishlistServiceGrpc.getAddToWishListMethod) == null) {
      synchronized (WishlistServiceGrpc.class) {
        if ((getAddToWishListMethod = WishlistServiceGrpc.getAddToWishListMethod) == null) {
          WishlistServiceGrpc.getAddToWishListMethod = getAddToWishListMethod = 
              io.grpc.MethodDescriptor.<GrpcWishlist.Wishlist.WishlistAddRequest, GrpcWishlist.Wishlist.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "GrpcWishlist.WishlistService", "AddToWishList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcWishlist.Wishlist.WishlistAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcWishlist.Wishlist.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new WishlistServiceMethodDescriptorSupplier("AddToWishList"))
                  .build();
          }
        }
     }
     return getAddToWishListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcWishlist.Wishlist.WishlistAddRequest,
      GrpcWishlist.Wishlist.Response> getRemoveFromWishlistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveFromWishlist",
      requestType = GrpcWishlist.Wishlist.WishlistAddRequest.class,
      responseType = GrpcWishlist.Wishlist.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcWishlist.Wishlist.WishlistAddRequest,
      GrpcWishlist.Wishlist.Response> getRemoveFromWishlistMethod() {
    io.grpc.MethodDescriptor<GrpcWishlist.Wishlist.WishlistAddRequest, GrpcWishlist.Wishlist.Response> getRemoveFromWishlistMethod;
    if ((getRemoveFromWishlistMethod = WishlistServiceGrpc.getRemoveFromWishlistMethod) == null) {
      synchronized (WishlistServiceGrpc.class) {
        if ((getRemoveFromWishlistMethod = WishlistServiceGrpc.getRemoveFromWishlistMethod) == null) {
          WishlistServiceGrpc.getRemoveFromWishlistMethod = getRemoveFromWishlistMethod = 
              io.grpc.MethodDescriptor.<GrpcWishlist.Wishlist.WishlistAddRequest, GrpcWishlist.Wishlist.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "GrpcWishlist.WishlistService", "RemoveFromWishlist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcWishlist.Wishlist.WishlistAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcWishlist.Wishlist.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new WishlistServiceMethodDescriptorSupplier("RemoveFromWishlist"))
                  .build();
          }
        }
     }
     return getRemoveFromWishlistMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WishlistServiceStub newStub(io.grpc.Channel channel) {
    return new WishlistServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WishlistServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WishlistServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WishlistServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WishlistServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class WishlistServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPing(GrpcWishlist.Wishlist.Ping request,
        io.grpc.stub.StreamObserver<GrpcWishlist.Wishlist.Pong> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPingMethod(), responseObserver);
    }

    /**
     */
    public void getWishlist(GrpcWishlist.Wishlist.WishlistRequest request,
        io.grpc.stub.StreamObserver<GrpcWishlist.Wishlist.WishlistResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWishlistMethod(), responseObserver);
    }

    /**
     */
    public void addToWishList(GrpcWishlist.Wishlist.WishlistAddRequest request,
        io.grpc.stub.StreamObserver<GrpcWishlist.Wishlist.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getAddToWishListMethod(), responseObserver);
    }

    /**
     */
    public void removeFromWishlist(GrpcWishlist.Wishlist.WishlistAddRequest request,
        io.grpc.stub.StreamObserver<GrpcWishlist.Wishlist.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveFromWishlistMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcWishlist.Wishlist.Ping,
                GrpcWishlist.Wishlist.Pong>(
                  this, METHODID_GET_PING)))
          .addMethod(
            getGetWishlistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcWishlist.Wishlist.WishlistRequest,
                GrpcWishlist.Wishlist.WishlistResponse>(
                  this, METHODID_GET_WISHLIST)))
          .addMethod(
            getAddToWishListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcWishlist.Wishlist.WishlistAddRequest,
                GrpcWishlist.Wishlist.Response>(
                  this, METHODID_ADD_TO_WISH_LIST)))
          .addMethod(
            getRemoveFromWishlistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcWishlist.Wishlist.WishlistAddRequest,
                GrpcWishlist.Wishlist.Response>(
                  this, METHODID_REMOVE_FROM_WISHLIST)))
          .build();
    }
  }

  /**
   */
  public static final class WishlistServiceStub extends io.grpc.stub.AbstractStub<WishlistServiceStub> {
    private WishlistServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WishlistServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WishlistServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WishlistServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPing(GrpcWishlist.Wishlist.Ping request,
        io.grpc.stub.StreamObserver<GrpcWishlist.Wishlist.Pong> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWishlist(GrpcWishlist.Wishlist.WishlistRequest request,
        io.grpc.stub.StreamObserver<GrpcWishlist.Wishlist.WishlistResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWishlistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addToWishList(GrpcWishlist.Wishlist.WishlistAddRequest request,
        io.grpc.stub.StreamObserver<GrpcWishlist.Wishlist.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddToWishListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeFromWishlist(GrpcWishlist.Wishlist.WishlistAddRequest request,
        io.grpc.stub.StreamObserver<GrpcWishlist.Wishlist.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveFromWishlistMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WishlistServiceBlockingStub extends io.grpc.stub.AbstractStub<WishlistServiceBlockingStub> {
    private WishlistServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WishlistServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WishlistServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WishlistServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public GrpcWishlist.Wishlist.Pong getPing(GrpcWishlist.Wishlist.Ping request) {
      return blockingUnaryCall(
          getChannel(), getGetPingMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcWishlist.Wishlist.WishlistResponse getWishlist(GrpcWishlist.Wishlist.WishlistRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWishlistMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcWishlist.Wishlist.Response addToWishList(GrpcWishlist.Wishlist.WishlistAddRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddToWishListMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcWishlist.Wishlist.Response removeFromWishlist(GrpcWishlist.Wishlist.WishlistAddRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveFromWishlistMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WishlistServiceFutureStub extends io.grpc.stub.AbstractStub<WishlistServiceFutureStub> {
    private WishlistServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WishlistServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WishlistServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WishlistServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcWishlist.Wishlist.Pong> getPing(
        GrpcWishlist.Wishlist.Ping request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcWishlist.Wishlist.WishlistResponse> getWishlist(
        GrpcWishlist.Wishlist.WishlistRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWishlistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcWishlist.Wishlist.Response> addToWishList(
        GrpcWishlist.Wishlist.WishlistAddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddToWishListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcWishlist.Wishlist.Response> removeFromWishlist(
        GrpcWishlist.Wishlist.WishlistAddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveFromWishlistMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PING = 0;
  private static final int METHODID_GET_WISHLIST = 1;
  private static final int METHODID_ADD_TO_WISH_LIST = 2;
  private static final int METHODID_REMOVE_FROM_WISHLIST = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WishlistServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WishlistServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PING:
          serviceImpl.getPing((GrpcWishlist.Wishlist.Ping) request,
              (io.grpc.stub.StreamObserver<GrpcWishlist.Wishlist.Pong>) responseObserver);
          break;
        case METHODID_GET_WISHLIST:
          serviceImpl.getWishlist((GrpcWishlist.Wishlist.WishlistRequest) request,
              (io.grpc.stub.StreamObserver<GrpcWishlist.Wishlist.WishlistResponse>) responseObserver);
          break;
        case METHODID_ADD_TO_WISH_LIST:
          serviceImpl.addToWishList((GrpcWishlist.Wishlist.WishlistAddRequest) request,
              (io.grpc.stub.StreamObserver<GrpcWishlist.Wishlist.Response>) responseObserver);
          break;
        case METHODID_REMOVE_FROM_WISHLIST:
          serviceImpl.removeFromWishlist((GrpcWishlist.Wishlist.WishlistAddRequest) request,
              (io.grpc.stub.StreamObserver<GrpcWishlist.Wishlist.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WishlistServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WishlistServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcWishlist.Wishlist.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WishlistService");
    }
  }

  private static final class WishlistServiceFileDescriptorSupplier
      extends WishlistServiceBaseDescriptorSupplier {
    WishlistServiceFileDescriptorSupplier() {}
  }

  private static final class WishlistServiceMethodDescriptorSupplier
      extends WishlistServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WishlistServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WishlistServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WishlistServiceFileDescriptorSupplier())
              .addMethod(getGetPingMethod())
              .addMethod(getGetWishlistMethod())
              .addMethod(getAddToWishListMethod())
              .addMethod(getRemoveFromWishlistMethod())
              .build();
        }
      }
    }
    return result;
  }
}
