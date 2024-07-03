package org.secretflow.v1alpha1.kusciaapi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: kuscia/proto/api/v1alpha1/kusciaapi/domain_route.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DomainRouteServiceGrpc {

  private DomainRouteServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "kuscia.proto.api.v1alpha1.kusciaapi.DomainRouteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteRequest,
      org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteResponse> getCreateDomainRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDomainRoute",
      requestType = org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteRequest,
      org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteResponse> getCreateDomainRouteMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteRequest, org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteResponse> getCreateDomainRouteMethod;
    if ((getCreateDomainRouteMethod = DomainRouteServiceGrpc.getCreateDomainRouteMethod) == null) {
      synchronized (DomainRouteServiceGrpc.class) {
        if ((getCreateDomainRouteMethod = DomainRouteServiceGrpc.getCreateDomainRouteMethod) == null) {
          DomainRouteServiceGrpc.getCreateDomainRouteMethod = getCreateDomainRouteMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteRequest, org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDomainRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainRouteServiceMethodDescriptorSupplier("CreateDomainRoute"))
              .build();
        }
      }
    }
    return getCreateDomainRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteRequest,
      org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteResponse> getDeleteDomainRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDomainRoute",
      requestType = org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteRequest,
      org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteResponse> getDeleteDomainRouteMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteRequest, org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteResponse> getDeleteDomainRouteMethod;
    if ((getDeleteDomainRouteMethod = DomainRouteServiceGrpc.getDeleteDomainRouteMethod) == null) {
      synchronized (DomainRouteServiceGrpc.class) {
        if ((getDeleteDomainRouteMethod = DomainRouteServiceGrpc.getDeleteDomainRouteMethod) == null) {
          DomainRouteServiceGrpc.getDeleteDomainRouteMethod = getDeleteDomainRouteMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteRequest, org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDomainRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainRouteServiceMethodDescriptorSupplier("DeleteDomainRoute"))
              .build();
        }
      }
    }
    return getDeleteDomainRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteRequest,
      org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteResponse> getQueryDomainRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryDomainRoute",
      requestType = org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteRequest,
      org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteResponse> getQueryDomainRouteMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteRequest, org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteResponse> getQueryDomainRouteMethod;
    if ((getQueryDomainRouteMethod = DomainRouteServiceGrpc.getQueryDomainRouteMethod) == null) {
      synchronized (DomainRouteServiceGrpc.class) {
        if ((getQueryDomainRouteMethod = DomainRouteServiceGrpc.getQueryDomainRouteMethod) == null) {
          DomainRouteServiceGrpc.getQueryDomainRouteMethod = getQueryDomainRouteMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteRequest, org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryDomainRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainRouteServiceMethodDescriptorSupplier("QueryDomainRoute"))
              .build();
        }
      }
    }
    return getQueryDomainRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusRequest,
      org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusResponse> getBatchQueryDomainRouteStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchQueryDomainRouteStatus",
      requestType = org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusRequest,
      org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusResponse> getBatchQueryDomainRouteStatusMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusRequest, org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusResponse> getBatchQueryDomainRouteStatusMethod;
    if ((getBatchQueryDomainRouteStatusMethod = DomainRouteServiceGrpc.getBatchQueryDomainRouteStatusMethod) == null) {
      synchronized (DomainRouteServiceGrpc.class) {
        if ((getBatchQueryDomainRouteStatusMethod = DomainRouteServiceGrpc.getBatchQueryDomainRouteStatusMethod) == null) {
          DomainRouteServiceGrpc.getBatchQueryDomainRouteStatusMethod = getBatchQueryDomainRouteStatusMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusRequest, org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchQueryDomainRouteStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainRouteServiceMethodDescriptorSupplier("BatchQueryDomainRouteStatus"))
              .build();
        }
      }
    }
    return getBatchQueryDomainRouteStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DomainRouteServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainRouteServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainRouteServiceStub>() {
        @java.lang.Override
        public DomainRouteServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainRouteServiceStub(channel, callOptions);
        }
      };
    return DomainRouteServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DomainRouteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainRouteServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainRouteServiceBlockingStub>() {
        @java.lang.Override
        public DomainRouteServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainRouteServiceBlockingStub(channel, callOptions);
        }
      };
    return DomainRouteServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DomainRouteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainRouteServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainRouteServiceFutureStub>() {
        @java.lang.Override
        public DomainRouteServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainRouteServiceFutureStub(channel, callOptions);
        }
      };
    return DomainRouteServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createDomainRoute(org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDomainRouteMethod(), responseObserver);
    }

    /**
     */
    default void deleteDomainRoute(org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDomainRouteMethod(), responseObserver);
    }

    /**
     */
    default void queryDomainRoute(org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryDomainRouteMethod(), responseObserver);
    }

    /**
     */
    default void batchQueryDomainRouteStatus(org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchQueryDomainRouteStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DomainRouteService.
   */
  public static abstract class DomainRouteServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DomainRouteServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DomainRouteService.
   */
  public static final class DomainRouteServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DomainRouteServiceStub> {
    private DomainRouteServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainRouteServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainRouteServiceStub(channel, callOptions);
    }

    /**
     */
    public void createDomainRoute(org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDomainRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDomainRoute(org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDomainRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDomainRoute(org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryDomainRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchQueryDomainRouteStatus(org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchQueryDomainRouteStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DomainRouteService.
   */
  public static final class DomainRouteServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DomainRouteServiceBlockingStub> {
    private DomainRouteServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainRouteServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainRouteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteResponse createDomainRoute(org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDomainRouteMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteResponse deleteDomainRoute(org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDomainRouteMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteResponse queryDomainRoute(org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryDomainRouteMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusResponse batchQueryDomainRouteStatus(org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchQueryDomainRouteStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DomainRouteService.
   */
  public static final class DomainRouteServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DomainRouteServiceFutureStub> {
    private DomainRouteServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainRouteServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainRouteServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteResponse> createDomainRoute(
        org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDomainRouteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteResponse> deleteDomainRoute(
        org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDomainRouteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteResponse> queryDomainRoute(
        org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryDomainRouteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusResponse> batchQueryDomainRouteStatus(
        org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchQueryDomainRouteStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DOMAIN_ROUTE = 0;
  private static final int METHODID_DELETE_DOMAIN_ROUTE = 1;
  private static final int METHODID_QUERY_DOMAIN_ROUTE = 2;
  private static final int METHODID_BATCH_QUERY_DOMAIN_ROUTE_STATUS = 3;

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
        case METHODID_CREATE_DOMAIN_ROUTE:
          serviceImpl.createDomainRoute((org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteResponse>) responseObserver);
          break;
        case METHODID_DELETE_DOMAIN_ROUTE:
          serviceImpl.deleteDomainRoute((org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteResponse>) responseObserver);
          break;
        case METHODID_QUERY_DOMAIN_ROUTE:
          serviceImpl.queryDomainRoute((org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteResponse>) responseObserver);
          break;
        case METHODID_BATCH_QUERY_DOMAIN_ROUTE_STATUS:
          serviceImpl.batchQueryDomainRouteStatus((org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusResponse>) responseObserver);
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
          getCreateDomainRouteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteRequest,
              org.secretflow.v1alpha1.kusciaapi.DomainRoute.CreateDomainRouteResponse>(
                service, METHODID_CREATE_DOMAIN_ROUTE)))
        .addMethod(
          getDeleteDomainRouteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteRequest,
              org.secretflow.v1alpha1.kusciaapi.DomainRoute.DeleteDomainRouteResponse>(
                service, METHODID_DELETE_DOMAIN_ROUTE)))
        .addMethod(
          getQueryDomainRouteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteRequest,
              org.secretflow.v1alpha1.kusciaapi.DomainRoute.QueryDomainRouteResponse>(
                service, METHODID_QUERY_DOMAIN_ROUTE)))
        .addMethod(
          getBatchQueryDomainRouteStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusRequest,
              org.secretflow.v1alpha1.kusciaapi.DomainRoute.BatchQueryDomainRouteStatusResponse>(
                service, METHODID_BATCH_QUERY_DOMAIN_ROUTE_STATUS)))
        .build();
  }

  private static abstract class DomainRouteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DomainRouteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.secretflow.v1alpha1.kusciaapi.DomainRoute.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DomainRouteService");
    }
  }

  private static final class DomainRouteServiceFileDescriptorSupplier
      extends DomainRouteServiceBaseDescriptorSupplier {
    DomainRouteServiceFileDescriptorSupplier() {}
  }

  private static final class DomainRouteServiceMethodDescriptorSupplier
      extends DomainRouteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DomainRouteServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DomainRouteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DomainRouteServiceFileDescriptorSupplier())
              .addMethod(getCreateDomainRouteMethod())
              .addMethod(getDeleteDomainRouteMethod())
              .addMethod(getQueryDomainRouteMethod())
              .addMethod(getBatchQueryDomainRouteStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
