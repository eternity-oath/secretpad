package org.secretflow.v1alpha1.kusciaapi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: kuscia/proto/api/v1alpha1/kusciaapi/domain.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DomainServiceGrpc {

  private DomainServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "kuscia.proto.api.v1alpha1.kusciaapi.DomainService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainRequest,
      org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainResponse> getCreateDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDomain",
      requestType = org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainRequest,
      org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainResponse> getCreateDomainMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainRequest, org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainResponse> getCreateDomainMethod;
    if ((getCreateDomainMethod = DomainServiceGrpc.getCreateDomainMethod) == null) {
      synchronized (DomainServiceGrpc.class) {
        if ((getCreateDomainMethod = DomainServiceGrpc.getCreateDomainMethod) == null) {
          DomainServiceGrpc.getCreateDomainMethod = getCreateDomainMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainRequest, org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainServiceMethodDescriptorSupplier("CreateDomain"))
              .build();
        }
      }
    }
    return getCreateDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainRequest,
      org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainResponse> getQueryDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryDomain",
      requestType = org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainRequest,
      org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainResponse> getQueryDomainMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainRequest, org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainResponse> getQueryDomainMethod;
    if ((getQueryDomainMethod = DomainServiceGrpc.getQueryDomainMethod) == null) {
      synchronized (DomainServiceGrpc.class) {
        if ((getQueryDomainMethod = DomainServiceGrpc.getQueryDomainMethod) == null) {
          DomainServiceGrpc.getQueryDomainMethod = getQueryDomainMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainRequest, org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainServiceMethodDescriptorSupplier("QueryDomain"))
              .build();
        }
      }
    }
    return getQueryDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainRequest,
      org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainResponse> getUpdateDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDomain",
      requestType = org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainRequest,
      org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainResponse> getUpdateDomainMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainRequest, org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainResponse> getUpdateDomainMethod;
    if ((getUpdateDomainMethod = DomainServiceGrpc.getUpdateDomainMethod) == null) {
      synchronized (DomainServiceGrpc.class) {
        if ((getUpdateDomainMethod = DomainServiceGrpc.getUpdateDomainMethod) == null) {
          DomainServiceGrpc.getUpdateDomainMethod = getUpdateDomainMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainRequest, org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainServiceMethodDescriptorSupplier("UpdateDomain"))
              .build();
        }
      }
    }
    return getUpdateDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainRequest,
      org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainResponse> getDeleteDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDomain",
      requestType = org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainRequest,
      org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainResponse> getDeleteDomainMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainRequest, org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainResponse> getDeleteDomainMethod;
    if ((getDeleteDomainMethod = DomainServiceGrpc.getDeleteDomainMethod) == null) {
      synchronized (DomainServiceGrpc.class) {
        if ((getDeleteDomainMethod = DomainServiceGrpc.getDeleteDomainMethod) == null) {
          DomainServiceGrpc.getDeleteDomainMethod = getDeleteDomainMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainRequest, org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainServiceMethodDescriptorSupplier("DeleteDomain"))
              .build();
        }
      }
    }
    return getDeleteDomainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainRequest,
      org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainResponse> getBatchQueryDomainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchQueryDomain",
      requestType = org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainRequest,
      org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainResponse> getBatchQueryDomainMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainRequest, org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainResponse> getBatchQueryDomainMethod;
    if ((getBatchQueryDomainMethod = DomainServiceGrpc.getBatchQueryDomainMethod) == null) {
      synchronized (DomainServiceGrpc.class) {
        if ((getBatchQueryDomainMethod = DomainServiceGrpc.getBatchQueryDomainMethod) == null) {
          DomainServiceGrpc.getBatchQueryDomainMethod = getBatchQueryDomainMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainRequest, org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchQueryDomain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainServiceMethodDescriptorSupplier("BatchQueryDomain"))
              .build();
        }
      }
    }
    return getBatchQueryDomainMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DomainServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainServiceStub>() {
        @java.lang.Override
        public DomainServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainServiceStub(channel, callOptions);
        }
      };
    return DomainServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DomainServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainServiceBlockingStub>() {
        @java.lang.Override
        public DomainServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainServiceBlockingStub(channel, callOptions);
        }
      };
    return DomainServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DomainServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainServiceFutureStub>() {
        @java.lang.Override
        public DomainServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainServiceFutureStub(channel, callOptions);
        }
      };
    return DomainServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createDomain(org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDomainMethod(), responseObserver);
    }

    /**
     */
    default void queryDomain(org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryDomainMethod(), responseObserver);
    }

    /**
     */
    default void updateDomain(org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDomainMethod(), responseObserver);
    }

    /**
     */
    default void deleteDomain(org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDomainMethod(), responseObserver);
    }

    /**
     */
    default void batchQueryDomain(org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchQueryDomainMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DomainService.
   */
  public static abstract class DomainServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DomainServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DomainService.
   */
  public static final class DomainServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DomainServiceStub> {
    private DomainServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainServiceStub(channel, callOptions);
    }

    /**
     */
    public void createDomain(org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDomain(org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDomain(org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDomain(org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDomainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchQueryDomain(org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchQueryDomainMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DomainService.
   */
  public static final class DomainServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DomainServiceBlockingStub> {
    private DomainServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainResponse createDomain(org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDomainMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainResponse queryDomain(org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryDomainMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainResponse updateDomain(org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDomainMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainResponse deleteDomain(org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDomainMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainResponse batchQueryDomain(org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchQueryDomainMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DomainService.
   */
  public static final class DomainServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DomainServiceFutureStub> {
    private DomainServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainResponse> createDomain(
        org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDomainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainResponse> queryDomain(
        org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryDomainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainResponse> updateDomain(
        org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDomainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainResponse> deleteDomain(
        org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDomainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainResponse> batchQueryDomain(
        org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchQueryDomainMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DOMAIN = 0;
  private static final int METHODID_QUERY_DOMAIN = 1;
  private static final int METHODID_UPDATE_DOMAIN = 2;
  private static final int METHODID_DELETE_DOMAIN = 3;
  private static final int METHODID_BATCH_QUERY_DOMAIN = 4;

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
        case METHODID_CREATE_DOMAIN:
          serviceImpl.createDomain((org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainResponse>) responseObserver);
          break;
        case METHODID_QUERY_DOMAIN:
          serviceImpl.queryDomain((org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DOMAIN:
          serviceImpl.updateDomain((org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainResponse>) responseObserver);
          break;
        case METHODID_DELETE_DOMAIN:
          serviceImpl.deleteDomain((org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainResponse>) responseObserver);
          break;
        case METHODID_BATCH_QUERY_DOMAIN:
          serviceImpl.batchQueryDomain((org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainResponse>) responseObserver);
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
          getCreateDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainRequest,
              org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.CreateDomainResponse>(
                service, METHODID_CREATE_DOMAIN)))
        .addMethod(
          getQueryDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainRequest,
              org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.QueryDomainResponse>(
                service, METHODID_QUERY_DOMAIN)))
        .addMethod(
          getUpdateDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainRequest,
              org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.UpdateDomainResponse>(
                service, METHODID_UPDATE_DOMAIN)))
        .addMethod(
          getDeleteDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainRequest,
              org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.DeleteDomainResponse>(
                service, METHODID_DELETE_DOMAIN)))
        .addMethod(
          getBatchQueryDomainMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainRequest,
              org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.BatchQueryDomainResponse>(
                service, METHODID_BATCH_QUERY_DOMAIN)))
        .build();
  }

  private static abstract class DomainServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DomainServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.secretflow.v1alpha1.kusciaapi.DomainOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DomainService");
    }
  }

  private static final class DomainServiceFileDescriptorSupplier
      extends DomainServiceBaseDescriptorSupplier {
    DomainServiceFileDescriptorSupplier() {}
  }

  private static final class DomainServiceMethodDescriptorSupplier
      extends DomainServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DomainServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DomainServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DomainServiceFileDescriptorSupplier())
              .addMethod(getCreateDomainMethod())
              .addMethod(getQueryDomainMethod())
              .addMethod(getUpdateDomainMethod())
              .addMethod(getDeleteDomainMethod())
              .addMethod(getBatchQueryDomainMethod())
              .build();
        }
      }
    }
    return result;
  }
}
