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
    comments = "Source: Increment.proto")
public final class DynamicIncrementGrpc {

  private DynamicIncrementGrpc() {}

  public static final String SERVICE_NAME = "com.protolib.DynamicIncrement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest,
      com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> getIncrementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "increment",
      requestType = com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest.class,
      responseType = com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest,
      com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> getIncrementMethod() {
    io.grpc.MethodDescriptor<com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest, com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> getIncrementMethod;
    if ((getIncrementMethod = DynamicIncrementGrpc.getIncrementMethod) == null) {
      synchronized (DynamicIncrementGrpc.class) {
        if ((getIncrementMethod = DynamicIncrementGrpc.getIncrementMethod) == null) {
          DynamicIncrementGrpc.getIncrementMethod = getIncrementMethod =
              io.grpc.MethodDescriptor.<com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest, com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "increment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply.getDefaultInstance()))
              .setSchemaDescriptor(new DynamicIncrementMethodDescriptorSupplier("increment"))
              .build();
        }
      }
    }
    return getIncrementMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DynamicIncrementStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DynamicIncrementStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DynamicIncrementStub>() {
        @java.lang.Override
        public DynamicIncrementStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DynamicIncrementStub(channel, callOptions);
        }
      };
    return DynamicIncrementStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DynamicIncrementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DynamicIncrementBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DynamicIncrementBlockingStub>() {
        @java.lang.Override
        public DynamicIncrementBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DynamicIncrementBlockingStub(channel, callOptions);
        }
      };
    return DynamicIncrementBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DynamicIncrementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DynamicIncrementFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DynamicIncrementFutureStub>() {
        @java.lang.Override
        public DynamicIncrementFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DynamicIncrementFutureStub(channel, callOptions);
        }
      };
    return DynamicIncrementFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DynamicIncrementImplBase implements io.grpc.BindableService {

    /**
     */
    public void increment(com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest request,
        io.grpc.stub.StreamObserver<com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> responseObserver) {
      asyncUnimplementedUnaryCall(getIncrementMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIncrementMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest,
                com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply>(
                  this, METHODID_INCREMENT)))
          .build();
    }
  }

  /**
   */
  public static final class DynamicIncrementStub extends io.grpc.stub.AbstractAsyncStub<DynamicIncrementStub> {
    private DynamicIncrementStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DynamicIncrementStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DynamicIncrementStub(channel, callOptions);
    }

    /**
     */
    public void increment(com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest request,
        io.grpc.stub.StreamObserver<com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIncrementMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DynamicIncrementBlockingStub extends io.grpc.stub.AbstractBlockingStub<DynamicIncrementBlockingStub> {
    private DynamicIncrementBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DynamicIncrementBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DynamicIncrementBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply increment(com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest request) {
      return blockingUnaryCall(
          getChannel(), getIncrementMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DynamicIncrementFutureStub extends io.grpc.stub.AbstractFutureStub<DynamicIncrementFutureStub> {
    private DynamicIncrementFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DynamicIncrementFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DynamicIncrementFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> increment(
        com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIncrementMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INCREMENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DynamicIncrementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DynamicIncrementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INCREMENT:
          serviceImpl.increment((com.grpcLib.generatedStubs.IncrementBuilder.DynamicIncrementRequest) request,
              (io.grpc.stub.StreamObserver<com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply>) responseObserver);
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

  private static abstract class DynamicIncrementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DynamicIncrementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpcLib.generatedStubs.IncrementBuilder.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DynamicIncrement");
    }
  }

  private static final class DynamicIncrementFileDescriptorSupplier
      extends DynamicIncrementBaseDescriptorSupplier {
    DynamicIncrementFileDescriptorSupplier() {}
  }

  private static final class DynamicIncrementMethodDescriptorSupplier
      extends DynamicIncrementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DynamicIncrementMethodDescriptorSupplier(String methodName) {
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
      synchronized (DynamicIncrementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DynamicIncrementFileDescriptorSupplier())
              .addMethod(getIncrementMethod())
              .build();
        }
      }
    }
    return result;
  }
}
