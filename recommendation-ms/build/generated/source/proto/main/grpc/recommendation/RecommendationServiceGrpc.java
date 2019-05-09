package recommendation;

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
    comments = "Source: recommendation/recommendation.proto")
public final class RecommendationServiceGrpc {

  private RecommendationServiceGrpc() {}

  public static final String SERVICE_NAME = "recommendation.RecommendationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<recommendation.Recommendation.Ping,
      recommendation.Recommendation.Pong> getHealthCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HealthCheck",
      requestType = recommendation.Recommendation.Ping.class,
      responseType = recommendation.Recommendation.Pong.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<recommendation.Recommendation.Ping,
      recommendation.Recommendation.Pong> getHealthCheckMethod() {
    io.grpc.MethodDescriptor<recommendation.Recommendation.Ping, recommendation.Recommendation.Pong> getHealthCheckMethod;
    if ((getHealthCheckMethod = RecommendationServiceGrpc.getHealthCheckMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getHealthCheckMethod = RecommendationServiceGrpc.getHealthCheckMethod) == null) {
          RecommendationServiceGrpc.getHealthCheckMethod = getHealthCheckMethod = 
              io.grpc.MethodDescriptor.<recommendation.Recommendation.Ping, recommendation.Recommendation.Pong>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "recommendation.RecommendationService", "HealthCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  recommendation.Recommendation.Ping.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  recommendation.Recommendation.Pong.getDefaultInstance()))
                  .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("HealthCheck"))
                  .build();
          }
        }
     }
     return getHealthCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<recommendation.Recommendation.SupplyRecommendationRequest,
      recommendation.Recommendation.Empty> getSupplyRecommendationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SupplyRecommendation",
      requestType = recommendation.Recommendation.SupplyRecommendationRequest.class,
      responseType = recommendation.Recommendation.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<recommendation.Recommendation.SupplyRecommendationRequest,
      recommendation.Recommendation.Empty> getSupplyRecommendationMethod() {
    io.grpc.MethodDescriptor<recommendation.Recommendation.SupplyRecommendationRequest, recommendation.Recommendation.Empty> getSupplyRecommendationMethod;
    if ((getSupplyRecommendationMethod = RecommendationServiceGrpc.getSupplyRecommendationMethod) == null) {
      synchronized (RecommendationServiceGrpc.class) {
        if ((getSupplyRecommendationMethod = RecommendationServiceGrpc.getSupplyRecommendationMethod) == null) {
          RecommendationServiceGrpc.getSupplyRecommendationMethod = getSupplyRecommendationMethod = 
              io.grpc.MethodDescriptor.<recommendation.Recommendation.SupplyRecommendationRequest, recommendation.Recommendation.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "recommendation.RecommendationService", "SupplyRecommendation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  recommendation.Recommendation.SupplyRecommendationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  recommendation.Recommendation.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new RecommendationServiceMethodDescriptorSupplier("SupplyRecommendation"))
                  .build();
          }
        }
     }
     return getSupplyRecommendationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RecommendationServiceStub newStub(io.grpc.Channel channel) {
    return new RecommendationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RecommendationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RecommendationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RecommendationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RecommendationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RecommendationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void healthCheck(recommendation.Recommendation.Ping request,
        io.grpc.stub.StreamObserver<recommendation.Recommendation.Pong> responseObserver) {
      asyncUnimplementedUnaryCall(getHealthCheckMethod(), responseObserver);
    }

    /**
     */
    public void supplyRecommendation(recommendation.Recommendation.SupplyRecommendationRequest request,
        io.grpc.stub.StreamObserver<recommendation.Recommendation.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSupplyRecommendationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHealthCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                recommendation.Recommendation.Ping,
                recommendation.Recommendation.Pong>(
                  this, METHODID_HEALTH_CHECK)))
          .addMethod(
            getSupplyRecommendationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                recommendation.Recommendation.SupplyRecommendationRequest,
                recommendation.Recommendation.Empty>(
                  this, METHODID_SUPPLY_RECOMMENDATION)))
          .build();
    }
  }

  /**
   */
  public static final class RecommendationServiceStub extends io.grpc.stub.AbstractStub<RecommendationServiceStub> {
    private RecommendationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecommendationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecommendationServiceStub(channel, callOptions);
    }

    /**
     */
    public void healthCheck(recommendation.Recommendation.Ping request,
        io.grpc.stub.StreamObserver<recommendation.Recommendation.Pong> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHealthCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void supplyRecommendation(recommendation.Recommendation.SupplyRecommendationRequest request,
        io.grpc.stub.StreamObserver<recommendation.Recommendation.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSupplyRecommendationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RecommendationServiceBlockingStub extends io.grpc.stub.AbstractStub<RecommendationServiceBlockingStub> {
    private RecommendationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecommendationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecommendationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public recommendation.Recommendation.Pong healthCheck(recommendation.Recommendation.Ping request) {
      return blockingUnaryCall(
          getChannel(), getHealthCheckMethod(), getCallOptions(), request);
    }

    /**
     */
    public recommendation.Recommendation.Empty supplyRecommendation(recommendation.Recommendation.SupplyRecommendationRequest request) {
      return blockingUnaryCall(
          getChannel(), getSupplyRecommendationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RecommendationServiceFutureStub extends io.grpc.stub.AbstractStub<RecommendationServiceFutureStub> {
    private RecommendationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecommendationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecommendationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<recommendation.Recommendation.Pong> healthCheck(
        recommendation.Recommendation.Ping request) {
      return futureUnaryCall(
          getChannel().newCall(getHealthCheckMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<recommendation.Recommendation.Empty> supplyRecommendation(
        recommendation.Recommendation.SupplyRecommendationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSupplyRecommendationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HEALTH_CHECK = 0;
  private static final int METHODID_SUPPLY_RECOMMENDATION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RecommendationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RecommendationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HEALTH_CHECK:
          serviceImpl.healthCheck((recommendation.Recommendation.Ping) request,
              (io.grpc.stub.StreamObserver<recommendation.Recommendation.Pong>) responseObserver);
          break;
        case METHODID_SUPPLY_RECOMMENDATION:
          serviceImpl.supplyRecommendation((recommendation.Recommendation.SupplyRecommendationRequest) request,
              (io.grpc.stub.StreamObserver<recommendation.Recommendation.Empty>) responseObserver);
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

  private static abstract class RecommendationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RecommendationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return recommendation.Recommendation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RecommendationService");
    }
  }

  private static final class RecommendationServiceFileDescriptorSupplier
      extends RecommendationServiceBaseDescriptorSupplier {
    RecommendationServiceFileDescriptorSupplier() {}
  }

  private static final class RecommendationServiceMethodDescriptorSupplier
      extends RecommendationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RecommendationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RecommendationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RecommendationServiceFileDescriptorSupplier())
              .addMethod(getHealthCheckMethod())
              .addMethod(getSupplyRecommendationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
