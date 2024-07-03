package org.secretflow.v1alpha1.kusciaapi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: kuscia/proto/api/v1alpha1/kusciaapi/domaindata.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DomainDataServiceGrpc {

  private DomainDataServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "kuscia.proto.api.v1alpha1.kusciaapi.DomainDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataResponse> getCreateDomainDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDomainData",
      requestType = org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataResponse> getCreateDomainDataMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataRequest, org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataResponse> getCreateDomainDataMethod;
    if ((getCreateDomainDataMethod = DomainDataServiceGrpc.getCreateDomainDataMethod) == null) {
      synchronized (DomainDataServiceGrpc.class) {
        if ((getCreateDomainDataMethod = DomainDataServiceGrpc.getCreateDomainDataMethod) == null) {
          DomainDataServiceGrpc.getCreateDomainDataMethod = getCreateDomainDataMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataRequest, org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDomainData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainDataServiceMethodDescriptorSupplier("CreateDomainData"))
              .build();
        }
      }
    }
    return getCreateDomainDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataResponse> getUpdateDomainDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDomainData",
      requestType = org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataResponse> getUpdateDomainDataMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataRequest, org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataResponse> getUpdateDomainDataMethod;
    if ((getUpdateDomainDataMethod = DomainDataServiceGrpc.getUpdateDomainDataMethod) == null) {
      synchronized (DomainDataServiceGrpc.class) {
        if ((getUpdateDomainDataMethod = DomainDataServiceGrpc.getUpdateDomainDataMethod) == null) {
          DomainDataServiceGrpc.getUpdateDomainDataMethod = getUpdateDomainDataMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataRequest, org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDomainData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainDataServiceMethodDescriptorSupplier("UpdateDomainData"))
              .build();
        }
      }
    }
    return getUpdateDomainDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataResponse> getDeleteDomainDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDomainData",
      requestType = org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataResponse> getDeleteDomainDataMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataRequest, org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataResponse> getDeleteDomainDataMethod;
    if ((getDeleteDomainDataMethod = DomainDataServiceGrpc.getDeleteDomainDataMethod) == null) {
      synchronized (DomainDataServiceGrpc.class) {
        if ((getDeleteDomainDataMethod = DomainDataServiceGrpc.getDeleteDomainDataMethod) == null) {
          DomainDataServiceGrpc.getDeleteDomainDataMethod = getDeleteDomainDataMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataRequest, org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDomainData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainDataServiceMethodDescriptorSupplier("DeleteDomainData"))
              .build();
        }
      }
    }
    return getDeleteDomainDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataResponse> getQueryDomainDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryDomainData",
      requestType = org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataResponse> getQueryDomainDataMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataRequest, org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataResponse> getQueryDomainDataMethod;
    if ((getQueryDomainDataMethod = DomainDataServiceGrpc.getQueryDomainDataMethod) == null) {
      synchronized (DomainDataServiceGrpc.class) {
        if ((getQueryDomainDataMethod = DomainDataServiceGrpc.getQueryDomainDataMethod) == null) {
          DomainDataServiceGrpc.getQueryDomainDataMethod = getQueryDomainDataMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataRequest, org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryDomainData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainDataServiceMethodDescriptorSupplier("QueryDomainData"))
              .build();
        }
      }
    }
    return getQueryDomainDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataResponse> getBatchQueryDomainDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchQueryDomainData",
      requestType = org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataResponse> getBatchQueryDomainDataMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataRequest, org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataResponse> getBatchQueryDomainDataMethod;
    if ((getBatchQueryDomainDataMethod = DomainDataServiceGrpc.getBatchQueryDomainDataMethod) == null) {
      synchronized (DomainDataServiceGrpc.class) {
        if ((getBatchQueryDomainDataMethod = DomainDataServiceGrpc.getBatchQueryDomainDataMethod) == null) {
          DomainDataServiceGrpc.getBatchQueryDomainDataMethod = getBatchQueryDomainDataMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataRequest, org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchQueryDomainData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainDataServiceMethodDescriptorSupplier("BatchQueryDomainData"))
              .build();
        }
      }
    }
    return getBatchQueryDomainDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataResponse> getListDomainDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDomainData",
      requestType = org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataResponse> getListDomainDataMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataRequest, org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataResponse> getListDomainDataMethod;
    if ((getListDomainDataMethod = DomainDataServiceGrpc.getListDomainDataMethod) == null) {
      synchronized (DomainDataServiceGrpc.class) {
        if ((getListDomainDataMethod = DomainDataServiceGrpc.getListDomainDataMethod) == null) {
          DomainDataServiceGrpc.getListDomainDataMethod = getListDomainDataMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataRequest, org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDomainData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainDataServiceMethodDescriptorSupplier("ListDomainData"))
              .build();
        }
      }
    }
    return getListDomainDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DomainDataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainDataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainDataServiceStub>() {
        @java.lang.Override
        public DomainDataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainDataServiceStub(channel, callOptions);
        }
      };
    return DomainDataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DomainDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainDataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainDataServiceBlockingStub>() {
        @java.lang.Override
        public DomainDataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainDataServiceBlockingStub(channel, callOptions);
        }
      };
    return DomainDataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DomainDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainDataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainDataServiceFutureStub>() {
        @java.lang.Override
        public DomainDataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainDataServiceFutureStub(channel, callOptions);
        }
      };
    return DomainDataServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createDomainData(org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDomainDataMethod(), responseObserver);
    }

    /**
     */
    default void updateDomainData(org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDomainDataMethod(), responseObserver);
    }

    /**
     */
    default void deleteDomainData(org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDomainDataMethod(), responseObserver);
    }

    /**
     */
    default void queryDomainData(org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryDomainDataMethod(), responseObserver);
    }

    /**
     */
    default void batchQueryDomainData(org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchQueryDomainDataMethod(), responseObserver);
    }

    /**
     */
    default void listDomainData(org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDomainDataMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DomainDataService.
   */
  public static abstract class DomainDataServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DomainDataServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DomainDataService.
   */
  public static final class DomainDataServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DomainDataServiceStub> {
    private DomainDataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainDataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainDataServiceStub(channel, callOptions);
    }

    /**
     */
    public void createDomainData(org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDomainDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDomainData(org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDomainDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDomainData(org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDomainDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDomainData(org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryDomainDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchQueryDomainData(org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchQueryDomainDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDomainData(org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDomainDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DomainDataService.
   */
  public static final class DomainDataServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DomainDataServiceBlockingStub> {
    private DomainDataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainDataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainDataServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataResponse createDomainData(org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDomainDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataResponse updateDomainData(org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDomainDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataResponse deleteDomainData(org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDomainDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataResponse queryDomainData(org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryDomainDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataResponse batchQueryDomainData(org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchQueryDomainDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataResponse listDomainData(org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDomainDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DomainDataService.
   */
  public static final class DomainDataServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DomainDataServiceFutureStub> {
    private DomainDataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainDataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainDataServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataResponse> createDomainData(
        org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDomainDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataResponse> updateDomainData(
        org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDomainDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataResponse> deleteDomainData(
        org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDomainDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataResponse> queryDomainData(
        org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryDomainDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataResponse> batchQueryDomainData(
        org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchQueryDomainDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataResponse> listDomainData(
        org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDomainDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DOMAIN_DATA = 0;
  private static final int METHODID_UPDATE_DOMAIN_DATA = 1;
  private static final int METHODID_DELETE_DOMAIN_DATA = 2;
  private static final int METHODID_QUERY_DOMAIN_DATA = 3;
  private static final int METHODID_BATCH_QUERY_DOMAIN_DATA = 4;
  private static final int METHODID_LIST_DOMAIN_DATA = 5;

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
        case METHODID_CREATE_DOMAIN_DATA:
          serviceImpl.createDomainData((org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DOMAIN_DATA:
          serviceImpl.updateDomainData((org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataResponse>) responseObserver);
          break;
        case METHODID_DELETE_DOMAIN_DATA:
          serviceImpl.deleteDomainData((org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataResponse>) responseObserver);
          break;
        case METHODID_QUERY_DOMAIN_DATA:
          serviceImpl.queryDomainData((org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataResponse>) responseObserver);
          break;
        case METHODID_BATCH_QUERY_DOMAIN_DATA:
          serviceImpl.batchQueryDomainData((org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataResponse>) responseObserver);
          break;
        case METHODID_LIST_DOMAIN_DATA:
          serviceImpl.listDomainData((org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataResponse>) responseObserver);
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
          getCreateDomainDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataRequest,
              org.secretflow.v1alpha1.kusciaapi.Domaindata.CreateDomainDataResponse>(
                service, METHODID_CREATE_DOMAIN_DATA)))
        .addMethod(
          getUpdateDomainDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataRequest,
              org.secretflow.v1alpha1.kusciaapi.Domaindata.UpdateDomainDataResponse>(
                service, METHODID_UPDATE_DOMAIN_DATA)))
        .addMethod(
          getDeleteDomainDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataRequest,
              org.secretflow.v1alpha1.kusciaapi.Domaindata.DeleteDomainDataResponse>(
                service, METHODID_DELETE_DOMAIN_DATA)))
        .addMethod(
          getQueryDomainDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataRequest,
              org.secretflow.v1alpha1.kusciaapi.Domaindata.QueryDomainDataResponse>(
                service, METHODID_QUERY_DOMAIN_DATA)))
        .addMethod(
          getBatchQueryDomainDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataRequest,
              org.secretflow.v1alpha1.kusciaapi.Domaindata.BatchQueryDomainDataResponse>(
                service, METHODID_BATCH_QUERY_DOMAIN_DATA)))
        .addMethod(
          getListDomainDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataRequest,
              org.secretflow.v1alpha1.kusciaapi.Domaindata.ListDomainDataResponse>(
                service, METHODID_LIST_DOMAIN_DATA)))
        .build();
  }

  private static abstract class DomainDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DomainDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.secretflow.v1alpha1.kusciaapi.Domaindata.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DomainDataService");
    }
  }

  private static final class DomainDataServiceFileDescriptorSupplier
      extends DomainDataServiceBaseDescriptorSupplier {
    DomainDataServiceFileDescriptorSupplier() {}
  }

  private static final class DomainDataServiceMethodDescriptorSupplier
      extends DomainDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DomainDataServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DomainDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DomainDataServiceFileDescriptorSupplier())
              .addMethod(getCreateDomainDataMethod())
              .addMethod(getUpdateDomainDataMethod())
              .addMethod(getDeleteDomainDataMethod())
              .addMethod(getQueryDomainDataMethod())
              .addMethod(getBatchQueryDomainDataMethod())
              .addMethod(getListDomainDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
