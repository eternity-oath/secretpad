package org.secretflow.v1alpha1.kusciaapi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: kuscia/proto/api/v1alpha1/kusciaapi/domaindatagrant.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DomainDataGrantServiceGrpc {

  private DomainDataGrantServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "kuscia.proto.api.v1alpha1.kusciaapi.DomainDataGrantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantResponse> getCreateDomainDataGrantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDomainDataGrant",
      requestType = org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantResponse> getCreateDomainDataGrantMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantRequest, org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantResponse> getCreateDomainDataGrantMethod;
    if ((getCreateDomainDataGrantMethod = DomainDataGrantServiceGrpc.getCreateDomainDataGrantMethod) == null) {
      synchronized (DomainDataGrantServiceGrpc.class) {
        if ((getCreateDomainDataGrantMethod = DomainDataGrantServiceGrpc.getCreateDomainDataGrantMethod) == null) {
          DomainDataGrantServiceGrpc.getCreateDomainDataGrantMethod = getCreateDomainDataGrantMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantRequest, org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDomainDataGrant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainDataGrantServiceMethodDescriptorSupplier("CreateDomainDataGrant"))
              .build();
        }
      }
    }
    return getCreateDomainDataGrantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantResponse> getUpdateDomainDataGrantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDomainDataGrant",
      requestType = org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantResponse> getUpdateDomainDataGrantMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantRequest, org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantResponse> getUpdateDomainDataGrantMethod;
    if ((getUpdateDomainDataGrantMethod = DomainDataGrantServiceGrpc.getUpdateDomainDataGrantMethod) == null) {
      synchronized (DomainDataGrantServiceGrpc.class) {
        if ((getUpdateDomainDataGrantMethod = DomainDataGrantServiceGrpc.getUpdateDomainDataGrantMethod) == null) {
          DomainDataGrantServiceGrpc.getUpdateDomainDataGrantMethod = getUpdateDomainDataGrantMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantRequest, org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDomainDataGrant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainDataGrantServiceMethodDescriptorSupplier("UpdateDomainDataGrant"))
              .build();
        }
      }
    }
    return getUpdateDomainDataGrantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantResponse> getDeleteDomainDataGrantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDomainDataGrant",
      requestType = org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantResponse> getDeleteDomainDataGrantMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantRequest, org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantResponse> getDeleteDomainDataGrantMethod;
    if ((getDeleteDomainDataGrantMethod = DomainDataGrantServiceGrpc.getDeleteDomainDataGrantMethod) == null) {
      synchronized (DomainDataGrantServiceGrpc.class) {
        if ((getDeleteDomainDataGrantMethod = DomainDataGrantServiceGrpc.getDeleteDomainDataGrantMethod) == null) {
          DomainDataGrantServiceGrpc.getDeleteDomainDataGrantMethod = getDeleteDomainDataGrantMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantRequest, org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDomainDataGrant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainDataGrantServiceMethodDescriptorSupplier("DeleteDomainDataGrant"))
              .build();
        }
      }
    }
    return getDeleteDomainDataGrantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantResponse> getQueryDomainDataGrantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryDomainDataGrant",
      requestType = org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantResponse> getQueryDomainDataGrantMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantRequest, org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantResponse> getQueryDomainDataGrantMethod;
    if ((getQueryDomainDataGrantMethod = DomainDataGrantServiceGrpc.getQueryDomainDataGrantMethod) == null) {
      synchronized (DomainDataGrantServiceGrpc.class) {
        if ((getQueryDomainDataGrantMethod = DomainDataGrantServiceGrpc.getQueryDomainDataGrantMethod) == null) {
          DomainDataGrantServiceGrpc.getQueryDomainDataGrantMethod = getQueryDomainDataGrantMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantRequest, org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryDomainDataGrant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainDataGrantServiceMethodDescriptorSupplier("QueryDomainDataGrant"))
              .build();
        }
      }
    }
    return getQueryDomainDataGrantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantResponse> getBatchQueryDomainDataGrantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchQueryDomainDataGrant",
      requestType = org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantResponse> getBatchQueryDomainDataGrantMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantRequest, org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantResponse> getBatchQueryDomainDataGrantMethod;
    if ((getBatchQueryDomainDataGrantMethod = DomainDataGrantServiceGrpc.getBatchQueryDomainDataGrantMethod) == null) {
      synchronized (DomainDataGrantServiceGrpc.class) {
        if ((getBatchQueryDomainDataGrantMethod = DomainDataGrantServiceGrpc.getBatchQueryDomainDataGrantMethod) == null) {
          DomainDataGrantServiceGrpc.getBatchQueryDomainDataGrantMethod = getBatchQueryDomainDataGrantMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantRequest, org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchQueryDomainDataGrant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainDataGrantServiceMethodDescriptorSupplier("BatchQueryDomainDataGrant"))
              .build();
        }
      }
    }
    return getBatchQueryDomainDataGrantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantResponse> getListDomainDataGrantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDomainDataGrant",
      requestType = org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantRequest,
      org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantResponse> getListDomainDataGrantMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantRequest, org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantResponse> getListDomainDataGrantMethod;
    if ((getListDomainDataGrantMethod = DomainDataGrantServiceGrpc.getListDomainDataGrantMethod) == null) {
      synchronized (DomainDataGrantServiceGrpc.class) {
        if ((getListDomainDataGrantMethod = DomainDataGrantServiceGrpc.getListDomainDataGrantMethod) == null) {
          DomainDataGrantServiceGrpc.getListDomainDataGrantMethod = getListDomainDataGrantMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantRequest, org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDomainDataGrant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DomainDataGrantServiceMethodDescriptorSupplier("ListDomainDataGrant"))
              .build();
        }
      }
    }
    return getListDomainDataGrantMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DomainDataGrantServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainDataGrantServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainDataGrantServiceStub>() {
        @java.lang.Override
        public DomainDataGrantServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainDataGrantServiceStub(channel, callOptions);
        }
      };
    return DomainDataGrantServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DomainDataGrantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainDataGrantServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainDataGrantServiceBlockingStub>() {
        @java.lang.Override
        public DomainDataGrantServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainDataGrantServiceBlockingStub(channel, callOptions);
        }
      };
    return DomainDataGrantServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DomainDataGrantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DomainDataGrantServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DomainDataGrantServiceFutureStub>() {
        @java.lang.Override
        public DomainDataGrantServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DomainDataGrantServiceFutureStub(channel, callOptions);
        }
      };
    return DomainDataGrantServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createDomainDataGrant(org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDomainDataGrantMethod(), responseObserver);
    }

    /**
     */
    default void updateDomainDataGrant(org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDomainDataGrantMethod(), responseObserver);
    }

    /**
     */
    default void deleteDomainDataGrant(org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDomainDataGrantMethod(), responseObserver);
    }

    /**
     */
    default void queryDomainDataGrant(org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryDomainDataGrantMethod(), responseObserver);
    }

    /**
     */
    default void batchQueryDomainDataGrant(org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchQueryDomainDataGrantMethod(), responseObserver);
    }

    /**
     */
    default void listDomainDataGrant(org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDomainDataGrantMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DomainDataGrantService.
   */
  public static abstract class DomainDataGrantServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DomainDataGrantServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DomainDataGrantService.
   */
  public static final class DomainDataGrantServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DomainDataGrantServiceStub> {
    private DomainDataGrantServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainDataGrantServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainDataGrantServiceStub(channel, callOptions);
    }

    /**
     */
    public void createDomainDataGrant(org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDomainDataGrantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDomainDataGrant(org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDomainDataGrantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDomainDataGrant(org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDomainDataGrantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryDomainDataGrant(org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryDomainDataGrantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchQueryDomainDataGrant(org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchQueryDomainDataGrantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDomainDataGrant(org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDomainDataGrantMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DomainDataGrantService.
   */
  public static final class DomainDataGrantServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DomainDataGrantServiceBlockingStub> {
    private DomainDataGrantServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainDataGrantServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainDataGrantServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantResponse createDomainDataGrant(org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDomainDataGrantMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantResponse updateDomainDataGrant(org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDomainDataGrantMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantResponse deleteDomainDataGrant(org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDomainDataGrantMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantResponse queryDomainDataGrant(org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryDomainDataGrantMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantResponse batchQueryDomainDataGrant(org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchQueryDomainDataGrantMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantResponse listDomainDataGrant(org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDomainDataGrantMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DomainDataGrantService.
   */
  public static final class DomainDataGrantServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DomainDataGrantServiceFutureStub> {
    private DomainDataGrantServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DomainDataGrantServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DomainDataGrantServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantResponse> createDomainDataGrant(
        org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDomainDataGrantMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantResponse> updateDomainDataGrant(
        org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDomainDataGrantMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantResponse> deleteDomainDataGrant(
        org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDomainDataGrantMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantResponse> queryDomainDataGrant(
        org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryDomainDataGrantMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantResponse> batchQueryDomainDataGrant(
        org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchQueryDomainDataGrantMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantResponse> listDomainDataGrant(
        org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDomainDataGrantMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DOMAIN_DATA_GRANT = 0;
  private static final int METHODID_UPDATE_DOMAIN_DATA_GRANT = 1;
  private static final int METHODID_DELETE_DOMAIN_DATA_GRANT = 2;
  private static final int METHODID_QUERY_DOMAIN_DATA_GRANT = 3;
  private static final int METHODID_BATCH_QUERY_DOMAIN_DATA_GRANT = 4;
  private static final int METHODID_LIST_DOMAIN_DATA_GRANT = 5;

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
        case METHODID_CREATE_DOMAIN_DATA_GRANT:
          serviceImpl.createDomainDataGrant((org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantResponse>) responseObserver);
          break;
        case METHODID_UPDATE_DOMAIN_DATA_GRANT:
          serviceImpl.updateDomainDataGrant((org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantResponse>) responseObserver);
          break;
        case METHODID_DELETE_DOMAIN_DATA_GRANT:
          serviceImpl.deleteDomainDataGrant((org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantResponse>) responseObserver);
          break;
        case METHODID_QUERY_DOMAIN_DATA_GRANT:
          serviceImpl.queryDomainDataGrant((org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantResponse>) responseObserver);
          break;
        case METHODID_BATCH_QUERY_DOMAIN_DATA_GRANT:
          serviceImpl.batchQueryDomainDataGrant((org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantResponse>) responseObserver);
          break;
        case METHODID_LIST_DOMAIN_DATA_GRANT:
          serviceImpl.listDomainDataGrant((org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantResponse>) responseObserver);
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
          getCreateDomainDataGrantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantRequest,
              org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.CreateDomainDataGrantResponse>(
                service, METHODID_CREATE_DOMAIN_DATA_GRANT)))
        .addMethod(
          getUpdateDomainDataGrantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantRequest,
              org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.UpdateDomainDataGrantResponse>(
                service, METHODID_UPDATE_DOMAIN_DATA_GRANT)))
        .addMethod(
          getDeleteDomainDataGrantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantRequest,
              org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.DeleteDomainDataGrantResponse>(
                service, METHODID_DELETE_DOMAIN_DATA_GRANT)))
        .addMethod(
          getQueryDomainDataGrantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantRequest,
              org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.QueryDomainDataGrantResponse>(
                service, METHODID_QUERY_DOMAIN_DATA_GRANT)))
        .addMethod(
          getBatchQueryDomainDataGrantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantRequest,
              org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.BatchQueryDomainDataGrantResponse>(
                service, METHODID_BATCH_QUERY_DOMAIN_DATA_GRANT)))
        .addMethod(
          getListDomainDataGrantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantRequest,
              org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.ListDomainDataGrantResponse>(
                service, METHODID_LIST_DOMAIN_DATA_GRANT)))
        .build();
  }

  private static abstract class DomainDataGrantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DomainDataGrantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.secretflow.v1alpha1.kusciaapi.Domaindatagrant.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DomainDataGrantService");
    }
  }

  private static final class DomainDataGrantServiceFileDescriptorSupplier
      extends DomainDataGrantServiceBaseDescriptorSupplier {
    DomainDataGrantServiceFileDescriptorSupplier() {}
  }

  private static final class DomainDataGrantServiceMethodDescriptorSupplier
      extends DomainDataGrantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DomainDataGrantServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DomainDataGrantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DomainDataGrantServiceFileDescriptorSupplier())
              .addMethod(getCreateDomainDataGrantMethod())
              .addMethod(getUpdateDomainDataGrantMethod())
              .addMethod(getDeleteDomainDataGrantMethod())
              .addMethod(getQueryDomainDataGrantMethod())
              .addMethod(getBatchQueryDomainDataGrantMethod())
              .addMethod(getListDomainDataGrantMethod())
              .build();
        }
      }
    }
    return result;
  }
}
