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
public final class ItemsServiceGrpc {

  private ItemsServiceGrpc() {}

  public static final String SERVICE_NAME = "GrpcWishlist.ItemsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GrpcWishlist.Wishlist.ItemsRequest,
      GrpcWishlist.Wishlist.ItemsResponse> getGetItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetItems",
      requestType = GrpcWishlist.Wishlist.ItemsRequest.class,
      responseType = GrpcWishlist.Wishlist.ItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcWishlist.Wishlist.ItemsRequest,
      GrpcWishlist.Wishlist.ItemsResponse> getGetItemsMethod() {
    io.grpc.MethodDescriptor<GrpcWishlist.Wishlist.ItemsRequest, GrpcWishlist.Wishlist.ItemsResponse> getGetItemsMethod;
    if ((getGetItemsMethod = ItemsServiceGrpc.getGetItemsMethod) == null) {
      synchronized (ItemsServiceGrpc.class) {
        if ((getGetItemsMethod = ItemsServiceGrpc.getGetItemsMethod) == null) {
          ItemsServiceGrpc.getGetItemsMethod = getGetItemsMethod = 
              io.grpc.MethodDescriptor.<GrpcWishlist.Wishlist.ItemsRequest, GrpcWishlist.Wishlist.ItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "GrpcWishlist.ItemsService", "GetItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcWishlist.Wishlist.ItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcWishlist.Wishlist.ItemsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ItemsServiceMethodDescriptorSupplier("GetItems"))
                  .build();
          }
        }
     }
     return getGetItemsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ItemsServiceStub newStub(io.grpc.Channel channel) {
    return new ItemsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ItemsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ItemsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ItemsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ItemsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ItemsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getItems(GrpcWishlist.Wishlist.ItemsRequest request,
        io.grpc.stub.StreamObserver<GrpcWishlist.Wishlist.ItemsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetItemsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetItemsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                GrpcWishlist.Wishlist.ItemsRequest,
                GrpcWishlist.Wishlist.ItemsResponse>(
                  this, METHODID_GET_ITEMS)))
          .build();
    }
  }

  /**
   */
  public static final class ItemsServiceStub extends io.grpc.stub.AbstractStub<ItemsServiceStub> {
    private ItemsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemsServiceStub(channel, callOptions);
    }

    /**
     */
    public void getItems(GrpcWishlist.Wishlist.ItemsRequest request,
        io.grpc.stub.StreamObserver<GrpcWishlist.Wishlist.ItemsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetItemsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ItemsServiceBlockingStub extends io.grpc.stub.AbstractStub<ItemsServiceBlockingStub> {
    private ItemsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public GrpcWishlist.Wishlist.ItemsResponse getItems(GrpcWishlist.Wishlist.ItemsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetItemsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ItemsServiceFutureStub extends io.grpc.stub.AbstractStub<ItemsServiceFutureStub> {
    private ItemsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ItemsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ItemsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ItemsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcWishlist.Wishlist.ItemsResponse> getItems(
        GrpcWishlist.Wishlist.ItemsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetItemsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ITEMS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ItemsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ItemsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ITEMS:
          serviceImpl.getItems((GrpcWishlist.Wishlist.ItemsRequest) request,
              (io.grpc.stub.StreamObserver<GrpcWishlist.Wishlist.ItemsResponse>) responseObserver);
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

  private static abstract class ItemsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ItemsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcWishlist.Wishlist.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ItemsService");
    }
  }

  private static final class ItemsServiceFileDescriptorSupplier
      extends ItemsServiceBaseDescriptorSupplier {
    ItemsServiceFileDescriptorSupplier() {}
  }

  private static final class ItemsServiceMethodDescriptorSupplier
      extends ItemsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ItemsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ItemsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ItemsServiceFileDescriptorSupplier())
              .addMethod(getGetItemsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
