package org.secretflow.v1alpha1.kusciaapi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: kuscia/proto/api/v1alpha1/kusciaapi/serving.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ServingServiceGrpc {

  private ServingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "kuscia.proto.api.v1alpha1.kusciaapi.ServingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingRequest,
      org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingResponse> getCreateServingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateServing",
      requestType = org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingRequest,
      org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingResponse> getCreateServingMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingRequest, org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingResponse> getCreateServingMethod;
    if ((getCreateServingMethod = ServingServiceGrpc.getCreateServingMethod) == null) {
      synchronized (ServingServiceGrpc.class) {
        if ((getCreateServingMethod = ServingServiceGrpc.getCreateServingMethod) == null) {
          ServingServiceGrpc.getCreateServingMethod = getCreateServingMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingRequest, org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateServing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServingServiceMethodDescriptorSupplier("CreateServing"))
              .build();
        }
      }
    }
    return getCreateServingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingRequest,
      org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingResponse> getQueryServingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryServing",
      requestType = org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingRequest,
      org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingResponse> getQueryServingMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingRequest, org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingResponse> getQueryServingMethod;
    if ((getQueryServingMethod = ServingServiceGrpc.getQueryServingMethod) == null) {
      synchronized (ServingServiceGrpc.class) {
        if ((getQueryServingMethod = ServingServiceGrpc.getQueryServingMethod) == null) {
          ServingServiceGrpc.getQueryServingMethod = getQueryServingMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingRequest, org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryServing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServingServiceMethodDescriptorSupplier("QueryServing"))
              .build();
        }
      }
    }
    return getQueryServingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingRequest,
      org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingResponse> getUpdateServingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateServing",
      requestType = org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingRequest,
      org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingResponse> getUpdateServingMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingRequest, org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingResponse> getUpdateServingMethod;
    if ((getUpdateServingMethod = ServingServiceGrpc.getUpdateServingMethod) == null) {
      synchronized (ServingServiceGrpc.class) {
        if ((getUpdateServingMethod = ServingServiceGrpc.getUpdateServingMethod) == null) {
          ServingServiceGrpc.getUpdateServingMethod = getUpdateServingMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingRequest, org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateServing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServingServiceMethodDescriptorSupplier("UpdateServing"))
              .build();
        }
      }
    }
    return getUpdateServingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingRequest,
      org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingResponse> getDeleteServingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteServing",
      requestType = org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingRequest,
      org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingResponse> getDeleteServingMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingRequest, org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingResponse> getDeleteServingMethod;
    if ((getDeleteServingMethod = ServingServiceGrpc.getDeleteServingMethod) == null) {
      synchronized (ServingServiceGrpc.class) {
        if ((getDeleteServingMethod = ServingServiceGrpc.getDeleteServingMethod) == null) {
          ServingServiceGrpc.getDeleteServingMethod = getDeleteServingMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingRequest, org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteServing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServingServiceMethodDescriptorSupplier("DeleteServing"))
              .build();
        }
      }
    }
    return getDeleteServingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusRequest,
      org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusResponse> getBatchQueryServingStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchQueryServingStatus",
      requestType = org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusRequest,
      org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusResponse> getBatchQueryServingStatusMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusRequest, org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusResponse> getBatchQueryServingStatusMethod;
    if ((getBatchQueryServingStatusMethod = ServingServiceGrpc.getBatchQueryServingStatusMethod) == null) {
      synchronized (ServingServiceGrpc.class) {
        if ((getBatchQueryServingStatusMethod = ServingServiceGrpc.getBatchQueryServingStatusMethod) == null) {
          ServingServiceGrpc.getBatchQueryServingStatusMethod = getBatchQueryServingStatusMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusRequest, org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchQueryServingStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServingServiceMethodDescriptorSupplier("BatchQueryServingStatus"))
              .build();
        }
      }
    }
    return getBatchQueryServingStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServingServiceStub>() {
        @java.lang.Override
        public ServingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServingServiceStub(channel, callOptions);
        }
      };
    return ServingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServingServiceBlockingStub>() {
        @java.lang.Override
        public ServingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServingServiceBlockingStub(channel, callOptions);
        }
      };
    return ServingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServingServiceFutureStub>() {
        @java.lang.Override
        public ServingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServingServiceFutureStub(channel, callOptions);
        }
      };
    return ServingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createServing(org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateServingMethod(), responseObserver);
    }

    /**
     */
    default void queryServing(org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryServingMethod(), responseObserver);
    }

    /**
     */
    default void updateServing(org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateServingMethod(), responseObserver);
    }

    /**
     */
    default void deleteServing(org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteServingMethod(), responseObserver);
    }

    /**
     */
    default void batchQueryServingStatus(org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchQueryServingStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ServingService.
   */
  public static abstract class ServingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ServingService.
   */
  public static final class ServingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ServingServiceStub> {
    private ServingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServingServiceStub(channel, callOptions);
    }

    /**
     */
    public void createServing(org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateServingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryServing(org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryServingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateServing(org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateServingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteServing(org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteServingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchQueryServingStatus(org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchQueryServingStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ServingService.
   */
  public static final class ServingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServingServiceBlockingStub> {
    private ServingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingResponse createServing(org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateServingMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingResponse queryServing(org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryServingMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingResponse updateServing(org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateServingMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingResponse deleteServing(org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteServingMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusResponse batchQueryServingStatus(org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchQueryServingStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ServingService.
   */
  public static final class ServingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServingServiceFutureStub> {
    private ServingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingResponse> createServing(
        org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateServingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingResponse> queryServing(
        org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryServingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingResponse> updateServing(
        org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateServingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingResponse> deleteServing(
        org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteServingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusResponse> batchQueryServingStatus(
        org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchQueryServingStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SERVING = 0;
  private static final int METHODID_QUERY_SERVING = 1;
  private static final int METHODID_UPDATE_SERVING = 2;
  private static final int METHODID_DELETE_SERVING = 3;
  private static final int METHODID_BATCH_QUERY_SERVING_STATUS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SERVING:
          serviceImpl.createServing((org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingResponse>) responseObserver);
          break;
        case METHODID_QUERY_SERVING:
          serviceImpl.queryServing((org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SERVING:
          serviceImpl.updateServing((org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingResponse>) responseObserver);
          break;
        case METHODID_DELETE_SERVING:
          serviceImpl.deleteServing((org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingResponse>) responseObserver);
          break;
        case METHODID_BATCH_QUERY_SERVING_STATUS:
          serviceImpl.batchQueryServingStatus((org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateServingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingRequest,
              org.secretflow.v1alpha1.kusciaapi.Serving.CreateServingResponse>(
                service, METHODID_CREATE_SERVING)))
        .addMethod(
          getQueryServingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingRequest,
              org.secretflow.v1alpha1.kusciaapi.Serving.QueryServingResponse>(
                service, METHODID_QUERY_SERVING)))
        .addMethod(
          getUpdateServingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingRequest,
              org.secretflow.v1alpha1.kusciaapi.Serving.UpdateServingResponse>(
                service, METHODID_UPDATE_SERVING)))
        .addMethod(
          getDeleteServingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingRequest,
              org.secretflow.v1alpha1.kusciaapi.Serving.DeleteServingResponse>(
                service, METHODID_DELETE_SERVING)))
        .addMethod(
          getBatchQueryServingStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusRequest,
              org.secretflow.v1alpha1.kusciaapi.Serving.BatchQueryServingStatusResponse>(
                service, METHODID_BATCH_QUERY_SERVING_STATUS)))
        .build();
  }

  private static abstract class ServingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.secretflow.v1alpha1.kusciaapi.Serving.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServingService");
    }
  }

  private static final class ServingServiceFileDescriptorSupplier
      extends ServingServiceBaseDescriptorSupplier {
    ServingServiceFileDescriptorSupplier() {}
  }

  private static final class ServingServiceMethodDescriptorSupplier
      extends ServingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ServingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ServingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServingServiceFileDescriptorSupplier())
              .addMethod(getCreateServingMethod())
              .addMethod(getQueryServingMethod())
              .addMethod(getUpdateServingMethod())
              .addMethod(getDeleteServingMethod())
              .addMethod(getBatchQueryServingStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
