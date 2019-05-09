package catalog;

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
    comments = "Source: product-catalog/product.proto")
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "catalog.ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<catalog.ProductOuterClass.SaveProductRequest,
      catalog.ProductOuterClass.Empty> getSaveProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveProduct",
      requestType = catalog.ProductOuterClass.SaveProductRequest.class,
      responseType = catalog.ProductOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<catalog.ProductOuterClass.SaveProductRequest,
      catalog.ProductOuterClass.Empty> getSaveProductMethod() {
    io.grpc.MethodDescriptor<catalog.ProductOuterClass.SaveProductRequest, catalog.ProductOuterClass.Empty> getSaveProductMethod;
    if ((getSaveProductMethod = ProductServiceGrpc.getSaveProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getSaveProductMethod = ProductServiceGrpc.getSaveProductMethod) == null) {
          ProductServiceGrpc.getSaveProductMethod = getSaveProductMethod = 
              io.grpc.MethodDescriptor.<catalog.ProductOuterClass.SaveProductRequest, catalog.ProductOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "catalog.ProductService", "SaveProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  catalog.ProductOuterClass.SaveProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  catalog.ProductOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("SaveProduct"))
                  .build();
          }
        }
     }
     return getSaveProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<catalog.ProductOuterClass.Empty,
      catalog.ProductOuterClass.AllProducts> getGetAllProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllProducts",
      requestType = catalog.ProductOuterClass.Empty.class,
      responseType = catalog.ProductOuterClass.AllProducts.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<catalog.ProductOuterClass.Empty,
      catalog.ProductOuterClass.AllProducts> getGetAllProductsMethod() {
    io.grpc.MethodDescriptor<catalog.ProductOuterClass.Empty, catalog.ProductOuterClass.AllProducts> getGetAllProductsMethod;
    if ((getGetAllProductsMethod = ProductServiceGrpc.getGetAllProductsMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetAllProductsMethod = ProductServiceGrpc.getGetAllProductsMethod) == null) {
          ProductServiceGrpc.getGetAllProductsMethod = getGetAllProductsMethod = 
              io.grpc.MethodDescriptor.<catalog.ProductOuterClass.Empty, catalog.ProductOuterClass.AllProducts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "catalog.ProductService", "GetAllProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  catalog.ProductOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  catalog.ProductOuterClass.AllProducts.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetAllProducts"))
                  .build();
          }
        }
     }
     return getGetAllProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<catalog.ProductOuterClass.GetProductRequest,
      catalog.ProductOuterClass.GetProductReply> getGetProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProduct",
      requestType = catalog.ProductOuterClass.GetProductRequest.class,
      responseType = catalog.ProductOuterClass.GetProductReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<catalog.ProductOuterClass.GetProductRequest,
      catalog.ProductOuterClass.GetProductReply> getGetProductMethod() {
    io.grpc.MethodDescriptor<catalog.ProductOuterClass.GetProductRequest, catalog.ProductOuterClass.GetProductReply> getGetProductMethod;
    if ((getGetProductMethod = ProductServiceGrpc.getGetProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductMethod = ProductServiceGrpc.getGetProductMethod) == null) {
          ProductServiceGrpc.getGetProductMethod = getGetProductMethod = 
              io.grpc.MethodDescriptor.<catalog.ProductOuterClass.GetProductRequest, catalog.ProductOuterClass.GetProductReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "catalog.ProductService", "GetProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  catalog.ProductOuterClass.GetProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  catalog.ProductOuterClass.GetProductReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetProduct"))
                  .build();
          }
        }
     }
     return getGetProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<catalog.ProductOuterClass.DeleteProductRequest,
      catalog.ProductOuterClass.Empty> getDeleteProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProduct",
      requestType = catalog.ProductOuterClass.DeleteProductRequest.class,
      responseType = catalog.ProductOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<catalog.ProductOuterClass.DeleteProductRequest,
      catalog.ProductOuterClass.Empty> getDeleteProductMethod() {
    io.grpc.MethodDescriptor<catalog.ProductOuterClass.DeleteProductRequest, catalog.ProductOuterClass.Empty> getDeleteProductMethod;
    if ((getDeleteProductMethod = ProductServiceGrpc.getDeleteProductMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getDeleteProductMethod = ProductServiceGrpc.getDeleteProductMethod) == null) {
          ProductServiceGrpc.getDeleteProductMethod = getDeleteProductMethod = 
              io.grpc.MethodDescriptor.<catalog.ProductOuterClass.DeleteProductRequest, catalog.ProductOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "catalog.ProductService", "DeleteProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  catalog.ProductOuterClass.DeleteProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  catalog.ProductOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("DeleteProduct"))
                  .build();
          }
        }
     }
     return getDeleteProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<catalog.ProductOuterClass.Ping,
      catalog.ProductOuterClass.Pong> getHealthCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HealthCheck",
      requestType = catalog.ProductOuterClass.Ping.class,
      responseType = catalog.ProductOuterClass.Pong.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<catalog.ProductOuterClass.Ping,
      catalog.ProductOuterClass.Pong> getHealthCheckMethod() {
    io.grpc.MethodDescriptor<catalog.ProductOuterClass.Ping, catalog.ProductOuterClass.Pong> getHealthCheckMethod;
    if ((getHealthCheckMethod = ProductServiceGrpc.getHealthCheckMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getHealthCheckMethod = ProductServiceGrpc.getHealthCheckMethod) == null) {
          ProductServiceGrpc.getHealthCheckMethod = getHealthCheckMethod = 
              io.grpc.MethodDescriptor.<catalog.ProductOuterClass.Ping, catalog.ProductOuterClass.Pong>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "catalog.ProductService", "HealthCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  catalog.ProductOuterClass.Ping.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  catalog.ProductOuterClass.Pong.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("HealthCheck"))
                  .build();
          }
        }
     }
     return getHealthCheckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    return new ProductServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProductServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveProduct(catalog.ProductOuterClass.SaveProductRequest request,
        io.grpc.stub.StreamObserver<catalog.ProductOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveProductMethod(), responseObserver);
    }

    /**
     */
    public void getAllProducts(catalog.ProductOuterClass.Empty request,
        io.grpc.stub.StreamObserver<catalog.ProductOuterClass.AllProducts> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllProductsMethod(), responseObserver);
    }

    /**
     */
    public void getProduct(catalog.ProductOuterClass.GetProductRequest request,
        io.grpc.stub.StreamObserver<catalog.ProductOuterClass.GetProductReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductMethod(), responseObserver);
    }

    /**
     */
    public void deleteProduct(catalog.ProductOuterClass.DeleteProductRequest request,
        io.grpc.stub.StreamObserver<catalog.ProductOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteProductMethod(), responseObserver);
    }

    /**
     */
    public void healthCheck(catalog.ProductOuterClass.Ping request,
        io.grpc.stub.StreamObserver<catalog.ProductOuterClass.Pong> responseObserver) {
      asyncUnimplementedUnaryCall(getHealthCheckMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                catalog.ProductOuterClass.SaveProductRequest,
                catalog.ProductOuterClass.Empty>(
                  this, METHODID_SAVE_PRODUCT)))
          .addMethod(
            getGetAllProductsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                catalog.ProductOuterClass.Empty,
                catalog.ProductOuterClass.AllProducts>(
                  this, METHODID_GET_ALL_PRODUCTS)))
          .addMethod(
            getGetProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                catalog.ProductOuterClass.GetProductRequest,
                catalog.ProductOuterClass.GetProductReply>(
                  this, METHODID_GET_PRODUCT)))
          .addMethod(
            getDeleteProductMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                catalog.ProductOuterClass.DeleteProductRequest,
                catalog.ProductOuterClass.Empty>(
                  this, METHODID_DELETE_PRODUCT)))
          .addMethod(
            getHealthCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                catalog.ProductOuterClass.Ping,
                catalog.ProductOuterClass.Pong>(
                  this, METHODID_HEALTH_CHECK)))
          .build();
    }
  }

  /**
   */
  public static final class ProductServiceStub extends io.grpc.stub.AbstractStub<ProductServiceStub> {
    private ProductServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void saveProduct(catalog.ProductOuterClass.SaveProductRequest request,
        io.grpc.stub.StreamObserver<catalog.ProductOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllProducts(catalog.ProductOuterClass.Empty request,
        io.grpc.stub.StreamObserver<catalog.ProductOuterClass.AllProducts> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProduct(catalog.ProductOuterClass.GetProductRequest request,
        io.grpc.stub.StreamObserver<catalog.ProductOuterClass.GetProductReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProduct(catalog.ProductOuterClass.DeleteProductRequest request,
        io.grpc.stub.StreamObserver<catalog.ProductOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void healthCheck(catalog.ProductOuterClass.Ping request,
        io.grpc.stub.StreamObserver<catalog.ProductOuterClass.Pong> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHealthCheckMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductServiceBlockingStub extends io.grpc.stub.AbstractStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public catalog.ProductOuterClass.Empty saveProduct(catalog.ProductOuterClass.SaveProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public catalog.ProductOuterClass.AllProducts getAllProducts(catalog.ProductOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllProductsMethod(), getCallOptions(), request);
    }

    /**
     */
    public catalog.ProductOuterClass.GetProductReply getProduct(catalog.ProductOuterClass.GetProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public catalog.ProductOuterClass.Empty deleteProduct(catalog.ProductOuterClass.DeleteProductRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public catalog.ProductOuterClass.Pong healthCheck(catalog.ProductOuterClass.Ping request) {
      return blockingUnaryCall(
          getChannel(), getHealthCheckMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductServiceFutureStub extends io.grpc.stub.AbstractStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<catalog.ProductOuterClass.Empty> saveProduct(
        catalog.ProductOuterClass.SaveProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<catalog.ProductOuterClass.AllProducts> getAllProducts(
        catalog.ProductOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllProductsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<catalog.ProductOuterClass.GetProductReply> getProduct(
        catalog.ProductOuterClass.GetProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<catalog.ProductOuterClass.Empty> deleteProduct(
        catalog.ProductOuterClass.DeleteProductRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<catalog.ProductOuterClass.Pong> healthCheck(
        catalog.ProductOuterClass.Ping request) {
      return futureUnaryCall(
          getChannel().newCall(getHealthCheckMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_PRODUCT = 0;
  private static final int METHODID_GET_ALL_PRODUCTS = 1;
  private static final int METHODID_GET_PRODUCT = 2;
  private static final int METHODID_DELETE_PRODUCT = 3;
  private static final int METHODID_HEALTH_CHECK = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_PRODUCT:
          serviceImpl.saveProduct((catalog.ProductOuterClass.SaveProductRequest) request,
              (io.grpc.stub.StreamObserver<catalog.ProductOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GET_ALL_PRODUCTS:
          serviceImpl.getAllProducts((catalog.ProductOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<catalog.ProductOuterClass.AllProducts>) responseObserver);
          break;
        case METHODID_GET_PRODUCT:
          serviceImpl.getProduct((catalog.ProductOuterClass.GetProductRequest) request,
              (io.grpc.stub.StreamObserver<catalog.ProductOuterClass.GetProductReply>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT:
          serviceImpl.deleteProduct((catalog.ProductOuterClass.DeleteProductRequest) request,
              (io.grpc.stub.StreamObserver<catalog.ProductOuterClass.Empty>) responseObserver);
          break;
        case METHODID_HEALTH_CHECK:
          serviceImpl.healthCheck((catalog.ProductOuterClass.Ping) request,
              (io.grpc.stub.StreamObserver<catalog.ProductOuterClass.Pong>) responseObserver);
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

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return catalog.ProductOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getSaveProductMethod())
              .addMethod(getGetAllProductsMethod())
              .addMethod(getGetProductMethod())
              .addMethod(getDeleteProductMethod())
              .addMethod(getHealthCheckMethod())
              .build();
        }
      }
    }
    return result;
  }
}
