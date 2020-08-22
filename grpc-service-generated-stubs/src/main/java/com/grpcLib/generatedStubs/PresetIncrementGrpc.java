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
public final class PresetIncrementGrpc {

  private PresetIncrementGrpc() {}

  public static final String SERVICE_NAME = "com.protolib.PresetIncrement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest,
      com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> getIncrementByFiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "incrementByFive",
      requestType = com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest.class,
      responseType = com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest,
      com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> getIncrementByFiveMethod() {
    io.grpc.MethodDescriptor<com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest, com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> getIncrementByFiveMethod;
    if ((getIncrementByFiveMethod = PresetIncrementGrpc.getIncrementByFiveMethod) == null) {
      synchronized (PresetIncrementGrpc.class) {
        if ((getIncrementByFiveMethod = PresetIncrementGrpc.getIncrementByFiveMethod) == null) {
          PresetIncrementGrpc.getIncrementByFiveMethod = getIncrementByFiveMethod =
              io.grpc.MethodDescriptor.<com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest, com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "incrementByFive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply.getDefaultInstance()))
              .setSchemaDescriptor(new PresetIncrementMethodDescriptorSupplier("incrementByFive"))
              .build();
        }
      }
    }
    return getIncrementByFiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest,
      com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> getIncrementBySevenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "incrementBySeven",
      requestType = com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest.class,
      responseType = com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest,
      com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> getIncrementBySevenMethod() {
    io.grpc.MethodDescriptor<com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest, com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> getIncrementBySevenMethod;
    if ((getIncrementBySevenMethod = PresetIncrementGrpc.getIncrementBySevenMethod) == null) {
      synchronized (PresetIncrementGrpc.class) {
        if ((getIncrementBySevenMethod = PresetIncrementGrpc.getIncrementBySevenMethod) == null) {
          PresetIncrementGrpc.getIncrementBySevenMethod = getIncrementBySevenMethod =
              io.grpc.MethodDescriptor.<com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest, com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "incrementBySeven"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply.getDefaultInstance()))
              .setSchemaDescriptor(new PresetIncrementMethodDescriptorSupplier("incrementBySeven"))
              .build();
        }
      }
    }
    return getIncrementBySevenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest,
      com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> getIncrementByTenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "incrementByTen",
      requestType = com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest.class,
      responseType = com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest,
      com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> getIncrementByTenMethod() {
    io.grpc.MethodDescriptor<com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest, com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> getIncrementByTenMethod;
    if ((getIncrementByTenMethod = PresetIncrementGrpc.getIncrementByTenMethod) == null) {
      synchronized (PresetIncrementGrpc.class) {
        if ((getIncrementByTenMethod = PresetIncrementGrpc.getIncrementByTenMethod) == null) {
          PresetIncrementGrpc.getIncrementByTenMethod = getIncrementByTenMethod =
              io.grpc.MethodDescriptor.<com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest, com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "incrementByTen"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply.getDefaultInstance()))
              .setSchemaDescriptor(new PresetIncrementMethodDescriptorSupplier("incrementByTen"))
              .build();
        }
      }
    }
    return getIncrementByTenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PresetIncrementStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PresetIncrementStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PresetIncrementStub>() {
        @java.lang.Override
        public PresetIncrementStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PresetIncrementStub(channel, callOptions);
        }
      };
    return PresetIncrementStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PresetIncrementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PresetIncrementBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PresetIncrementBlockingStub>() {
        @java.lang.Override
        public PresetIncrementBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PresetIncrementBlockingStub(channel, callOptions);
        }
      };
    return PresetIncrementBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PresetIncrementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PresetIncrementFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PresetIncrementFutureStub>() {
        @java.lang.Override
        public PresetIncrementFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PresetIncrementFutureStub(channel, callOptions);
        }
      };
    return PresetIncrementFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PresetIncrementImplBase implements io.grpc.BindableService {

    /**
     */
    public void incrementByFive(com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest request,
        io.grpc.stub.StreamObserver<com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> responseObserver) {
      asyncUnimplementedUnaryCall(getIncrementByFiveMethod(), responseObserver);
    }

    /**
     */
    public void incrementBySeven(com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest request,
        io.grpc.stub.StreamObserver<com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> responseObserver) {
      asyncUnimplementedUnaryCall(getIncrementBySevenMethod(), responseObserver);
    }

    /**
     */
    public void incrementByTen(com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest request,
        io.grpc.stub.StreamObserver<com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> responseObserver) {
      asyncUnimplementedUnaryCall(getIncrementByTenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIncrementByFiveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest,
                com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply>(
                  this, METHODID_INCREMENT_BY_FIVE)))
          .addMethod(
            getIncrementBySevenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest,
                com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply>(
                  this, METHODID_INCREMENT_BY_SEVEN)))
          .addMethod(
            getIncrementByTenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest,
                com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply>(
                  this, METHODID_INCREMENT_BY_TEN)))
          .build();
    }
  }

  /**
   */
  public static final class PresetIncrementStub extends io.grpc.stub.AbstractAsyncStub<PresetIncrementStub> {
    private PresetIncrementStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PresetIncrementStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PresetIncrementStub(channel, callOptions);
    }

    /**
     */
    public void incrementByFive(com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest request,
        io.grpc.stub.StreamObserver<com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIncrementByFiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void incrementBySeven(com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest request,
        io.grpc.stub.StreamObserver<com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIncrementBySevenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void incrementByTen(com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest request,
        io.grpc.stub.StreamObserver<com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIncrementByTenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PresetIncrementBlockingStub extends io.grpc.stub.AbstractBlockingStub<PresetIncrementBlockingStub> {
    private PresetIncrementBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PresetIncrementBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PresetIncrementBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply incrementByFive(com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest request) {
      return blockingUnaryCall(
          getChannel(), getIncrementByFiveMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply incrementBySeven(com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest request) {
      return blockingUnaryCall(
          getChannel(), getIncrementBySevenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply incrementByTen(com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest request) {
      return blockingUnaryCall(
          getChannel(), getIncrementByTenMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PresetIncrementFutureStub extends io.grpc.stub.AbstractFutureStub<PresetIncrementFutureStub> {
    private PresetIncrementFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PresetIncrementFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PresetIncrementFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> incrementByFive(
        com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIncrementByFiveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> incrementBySeven(
        com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIncrementBySevenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply> incrementByTen(
        com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIncrementByTenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INCREMENT_BY_FIVE = 0;
  private static final int METHODID_INCREMENT_BY_SEVEN = 1;
  private static final int METHODID_INCREMENT_BY_TEN = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PresetIncrementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PresetIncrementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INCREMENT_BY_FIVE:
          serviceImpl.incrementByFive((com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest) request,
              (io.grpc.stub.StreamObserver<com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply>) responseObserver);
          break;
        case METHODID_INCREMENT_BY_SEVEN:
          serviceImpl.incrementBySeven((com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest) request,
              (io.grpc.stub.StreamObserver<com.grpcLib.generatedStubs.IncrementBuilder.IncrementReply>) responseObserver);
          break;
        case METHODID_INCREMENT_BY_TEN:
          serviceImpl.incrementByTen((com.grpcLib.generatedStubs.IncrementBuilder.PresetIncrementRequest) request,
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

  private static abstract class PresetIncrementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PresetIncrementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpcLib.generatedStubs.IncrementBuilder.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PresetIncrement");
    }
  }

  private static final class PresetIncrementFileDescriptorSupplier
      extends PresetIncrementBaseDescriptorSupplier {
    PresetIncrementFileDescriptorSupplier() {}
  }

  private static final class PresetIncrementMethodDescriptorSupplier
      extends PresetIncrementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PresetIncrementMethodDescriptorSupplier(String methodName) {
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
      synchronized (PresetIncrementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PresetIncrementFileDescriptorSupplier())
              .addMethod(getIncrementByFiveMethod())
              .addMethod(getIncrementBySevenMethod())
              .addMethod(getIncrementByTenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
