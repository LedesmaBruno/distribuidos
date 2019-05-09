package protos;

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
    comments = "Source: users/user.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "protos.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<protos.UserOuterClass.AddUserRequest,
      protos.UserOuterClass.AddUserResponse> getAddUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUser",
      requestType = protos.UserOuterClass.AddUserRequest.class,
      responseType = protos.UserOuterClass.AddUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.UserOuterClass.AddUserRequest,
      protos.UserOuterClass.AddUserResponse> getAddUserMethod() {
    io.grpc.MethodDescriptor<protos.UserOuterClass.AddUserRequest, protos.UserOuterClass.AddUserResponse> getAddUserMethod;
    if ((getAddUserMethod = UserServiceGrpc.getAddUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddUserMethod = UserServiceGrpc.getAddUserMethod) == null) {
          UserServiceGrpc.getAddUserMethod = getAddUserMethod = 
              io.grpc.MethodDescriptor.<protos.UserOuterClass.AddUserRequest, protos.UserOuterClass.AddUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protos.UserService", "AddUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.UserOuterClass.AddUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.UserOuterClass.AddUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AddUser"))
                  .build();
          }
        }
     }
     return getAddUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.UserOuterClass.GetUserRequest,
      protos.UserOuterClass.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = protos.UserOuterClass.GetUserRequest.class,
      responseType = protos.UserOuterClass.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.UserOuterClass.GetUserRequest,
      protos.UserOuterClass.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<protos.UserOuterClass.GetUserRequest, protos.UserOuterClass.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod = 
              io.grpc.MethodDescriptor.<protos.UserOuterClass.GetUserRequest, protos.UserOuterClass.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protos.UserService", "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.UserOuterClass.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.UserOuterClass.GetUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser"))
                  .build();
          }
        }
     }
     return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.UserOuterClass.DeleteUserRequest,
      protos.UserOuterClass.DeleteUserResponse> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = protos.UserOuterClass.DeleteUserRequest.class,
      responseType = protos.UserOuterClass.DeleteUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.UserOuterClass.DeleteUserRequest,
      protos.UserOuterClass.DeleteUserResponse> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<protos.UserOuterClass.DeleteUserRequest, protos.UserOuterClass.DeleteUserResponse> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
          UserServiceGrpc.getDeleteUserMethod = getDeleteUserMethod = 
              io.grpc.MethodDescriptor.<protos.UserOuterClass.DeleteUserRequest, protos.UserOuterClass.DeleteUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protos.UserService", "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.UserOuterClass.DeleteUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.UserOuterClass.DeleteUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteUser"))
                  .build();
          }
        }
     }
     return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.UserOuterClass.LastAccessRequest,
      protos.UserOuterClass.LastAccessResponse> getGetUsersByLastAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUsersByLastAccess",
      requestType = protos.UserOuterClass.LastAccessRequest.class,
      responseType = protos.UserOuterClass.LastAccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.UserOuterClass.LastAccessRequest,
      protos.UserOuterClass.LastAccessResponse> getGetUsersByLastAccessMethod() {
    io.grpc.MethodDescriptor<protos.UserOuterClass.LastAccessRequest, protos.UserOuterClass.LastAccessResponse> getGetUsersByLastAccessMethod;
    if ((getGetUsersByLastAccessMethod = UserServiceGrpc.getGetUsersByLastAccessMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUsersByLastAccessMethod = UserServiceGrpc.getGetUsersByLastAccessMethod) == null) {
          UserServiceGrpc.getGetUsersByLastAccessMethod = getGetUsersByLastAccessMethod = 
              io.grpc.MethodDescriptor.<protos.UserOuterClass.LastAccessRequest, protos.UserOuterClass.LastAccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protos.UserService", "GetUsersByLastAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.UserOuterClass.LastAccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.UserOuterClass.LastAccessResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUsersByLastAccess"))
                  .build();
          }
        }
     }
     return getGetUsersByLastAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<protos.UserOuterClass.Ping,
      protos.UserOuterClass.Pong> getHealthcheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Healthcheck",
      requestType = protos.UserOuterClass.Ping.class,
      responseType = protos.UserOuterClass.Pong.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<protos.UserOuterClass.Ping,
      protos.UserOuterClass.Pong> getHealthcheckMethod() {
    io.grpc.MethodDescriptor<protos.UserOuterClass.Ping, protos.UserOuterClass.Pong> getHealthcheckMethod;
    if ((getHealthcheckMethod = UserServiceGrpc.getHealthcheckMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getHealthcheckMethod = UserServiceGrpc.getHealthcheckMethod) == null) {
          UserServiceGrpc.getHealthcheckMethod = getHealthcheckMethod = 
              io.grpc.MethodDescriptor.<protos.UserOuterClass.Ping, protos.UserOuterClass.Pong>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "protos.UserService", "Healthcheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.UserOuterClass.Ping.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  protos.UserOuterClass.Pong.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Healthcheck"))
                  .build();
          }
        }
     }
     return getHealthcheckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addUser(protos.UserOuterClass.AddUserRequest request,
        io.grpc.stub.StreamObserver<protos.UserOuterClass.AddUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserMethod(), responseObserver);
    }

    /**
     */
    public void getUser(protos.UserOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<protos.UserOuterClass.GetUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(protos.UserOuterClass.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<protos.UserOuterClass.DeleteUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    public void getUsersByLastAccess(protos.UserOuterClass.LastAccessRequest request,
        io.grpc.stub.StreamObserver<protos.UserOuterClass.LastAccessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUsersByLastAccessMethod(), responseObserver);
    }

    /**
     */
    public void healthcheck(protos.UserOuterClass.Ping request,
        io.grpc.stub.StreamObserver<protos.UserOuterClass.Pong> responseObserver) {
      asyncUnimplementedUnaryCall(getHealthcheckMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.UserOuterClass.AddUserRequest,
                protos.UserOuterClass.AddUserResponse>(
                  this, METHODID_ADD_USER)))
          .addMethod(
            getGetUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.UserOuterClass.GetUserRequest,
                protos.UserOuterClass.GetUserResponse>(
                  this, METHODID_GET_USER)))
          .addMethod(
            getDeleteUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.UserOuterClass.DeleteUserRequest,
                protos.UserOuterClass.DeleteUserResponse>(
                  this, METHODID_DELETE_USER)))
          .addMethod(
            getGetUsersByLastAccessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.UserOuterClass.LastAccessRequest,
                protos.UserOuterClass.LastAccessResponse>(
                  this, METHODID_GET_USERS_BY_LAST_ACCESS)))
          .addMethod(
            getHealthcheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                protos.UserOuterClass.Ping,
                protos.UserOuterClass.Pong>(
                  this, METHODID_HEALTHCHECK)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void addUser(protos.UserOuterClass.AddUserRequest request,
        io.grpc.stub.StreamObserver<protos.UserOuterClass.AddUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUser(protos.UserOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<protos.UserOuterClass.GetUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(protos.UserOuterClass.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<protos.UserOuterClass.DeleteUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUsersByLastAccess(protos.UserOuterClass.LastAccessRequest request,
        io.grpc.stub.StreamObserver<protos.UserOuterClass.LastAccessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUsersByLastAccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void healthcheck(protos.UserOuterClass.Ping request,
        io.grpc.stub.StreamObserver<protos.UserOuterClass.Pong> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHealthcheckMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public protos.UserOuterClass.AddUserResponse addUser(protos.UserOuterClass.AddUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.UserOuterClass.GetUserResponse getUser(protos.UserOuterClass.GetUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.UserOuterClass.DeleteUserResponse deleteUser(protos.UserOuterClass.DeleteUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.UserOuterClass.LastAccessResponse getUsersByLastAccess(protos.UserOuterClass.LastAccessRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUsersByLastAccessMethod(), getCallOptions(), request);
    }

    /**
     */
    public protos.UserOuterClass.Pong healthcheck(protos.UserOuterClass.Ping request) {
      return blockingUnaryCall(
          getChannel(), getHealthcheckMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.UserOuterClass.AddUserResponse> addUser(
        protos.UserOuterClass.AddUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.UserOuterClass.GetUserResponse> getUser(
        protos.UserOuterClass.GetUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.UserOuterClass.DeleteUserResponse> deleteUser(
        protos.UserOuterClass.DeleteUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.UserOuterClass.LastAccessResponse> getUsersByLastAccess(
        protos.UserOuterClass.LastAccessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUsersByLastAccessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<protos.UserOuterClass.Pong> healthcheck(
        protos.UserOuterClass.Ping request) {
      return futureUnaryCall(
          getChannel().newCall(getHealthcheckMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_USER = 0;
  private static final int METHODID_GET_USER = 1;
  private static final int METHODID_DELETE_USER = 2;
  private static final int METHODID_GET_USERS_BY_LAST_ACCESS = 3;
  private static final int METHODID_HEALTHCHECK = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_USER:
          serviceImpl.addUser((protos.UserOuterClass.AddUserRequest) request,
              (io.grpc.stub.StreamObserver<protos.UserOuterClass.AddUserResponse>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((protos.UserOuterClass.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<protos.UserOuterClass.GetUserResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((protos.UserOuterClass.DeleteUserRequest) request,
              (io.grpc.stub.StreamObserver<protos.UserOuterClass.DeleteUserResponse>) responseObserver);
          break;
        case METHODID_GET_USERS_BY_LAST_ACCESS:
          serviceImpl.getUsersByLastAccess((protos.UserOuterClass.LastAccessRequest) request,
              (io.grpc.stub.StreamObserver<protos.UserOuterClass.LastAccessResponse>) responseObserver);
          break;
        case METHODID_HEALTHCHECK:
          serviceImpl.healthcheck((protos.UserOuterClass.Ping) request,
              (io.grpc.stub.StreamObserver<protos.UserOuterClass.Pong>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return protos.UserOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getAddUserMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getGetUsersByLastAccessMethod())
              .addMethod(getHealthcheckMethod())
              .build();
        }
      }
    }
    return result;
  }
}
