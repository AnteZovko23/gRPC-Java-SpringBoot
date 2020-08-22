package com.grpcLib.generatedStubs;

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
    value = "by gRPC proto compiler (version 1.31.1)",
    comments = "Source: ConnectToServer.proto")
public final class ConnectToServerGrpc {

  private ConnectToServerGrpc() {}

  public static final String SERVICE_NAME = "com.protolib.ConnectToServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectRequest,
      com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectReply> getConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "connection",
      requestType = com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectRequest.class,
      responseType = com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectRequest,
      com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectReply> getConnectionMethod() {
    io.grpc.MethodDescriptor<com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectRequest, com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectReply> getConnectionMethod;
    if ((getConnectionMethod = ConnectToServerGrpc.getConnectionMethod) == null) {
      synchronized (ConnectToServerGrpc.class) {
        if ((getConnectionMethod = ConnectToServerGrpc.getConnectionMethod) == null) {
          ConnectToServerGrpc.getConnectionMethod = getConnectionMethod =
              io.grpc.MethodDescriptor.<com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectRequest, com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "connection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectReply.getDefaultInstance()))
              .setSchemaDescriptor(new ConnectToServerMethodDescriptorSupplier("connection"))
              .build();
        }
      }
    }
    return getConnectionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConnectToServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectToServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectToServerStub>() {
        @java.lang.Override
        public ConnectToServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectToServerStub(channel, callOptions);
        }
      };
    return ConnectToServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConnectToServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectToServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectToServerBlockingStub>() {
        @java.lang.Override
        public ConnectToServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectToServerBlockingStub(channel, callOptions);
        }
      };
    return ConnectToServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConnectToServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ConnectToServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ConnectToServerFutureStub>() {
        @java.lang.Override
        public ConnectToServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ConnectToServerFutureStub(channel, callOptions);
        }
      };
    return ConnectToServerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ConnectToServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void connection(com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectRequest request,
        io.grpc.stub.StreamObserver<com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectReply> responseObserver) {
      asyncUnimplementedUnaryCall(getConnectionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConnectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectRequest,
                com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectReply>(
                  this, METHODID_CONNECTION)))
          .build();
    }
  }

  /**
   */
  public static final class ConnectToServerStub extends io.grpc.stub.AbstractAsyncStub<ConnectToServerStub> {
    private ConnectToServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectToServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectToServerStub(channel, callOptions);
    }

    /**
     */
    public void connection(com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectRequest request,
        io.grpc.stub.StreamObserver<com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConnectionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ConnectToServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<ConnectToServerBlockingStub> {
    private ConnectToServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectToServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectToServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectReply connection(com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectRequest request) {
      return blockingUnaryCall(
          getChannel(), getConnectionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ConnectToServerFutureStub extends io.grpc.stub.AbstractFutureStub<ConnectToServerFutureStub> {
    private ConnectToServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConnectToServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ConnectToServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectReply> connection(
        com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConnectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONNECTION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConnectToServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConnectToServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONNECTION:
          serviceImpl.connection((com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectRequest) request,
              (io.grpc.stub.StreamObserver<com.grpcLib.generatedStubs.ConnectToServerBuilder.ConnectReply>) responseObserver);
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

  private static abstract class ConnectToServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConnectToServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpcLib.generatedStubs.ConnectToServerBuilder.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConnectToServer");
    }
  }

  private static final class ConnectToServerFileDescriptorSupplier
      extends ConnectToServerBaseDescriptorSupplier {
    ConnectToServerFileDescriptorSupplier() {}
  }

  private static final class ConnectToServerMethodDescriptorSupplier
      extends ConnectToServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConnectToServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConnectToServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConnectToServerFileDescriptorSupplier())
              .addMethod(getConnectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
