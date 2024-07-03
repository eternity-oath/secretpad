package org.secretflow.v1alpha1.kusciaapi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: kuscia/proto/api/v1alpha1/kusciaapi/certificate.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CertificateServiceGrpc {

  private CertificateServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "kuscia.proto.api.v1alpha1.kusciaapi.CertificateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsRequest,
      org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsResponse> getGenerateKeyCertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateKeyCerts",
      requestType = org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsRequest,
      org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsResponse> getGenerateKeyCertsMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsRequest, org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsResponse> getGenerateKeyCertsMethod;
    if ((getGenerateKeyCertsMethod = CertificateServiceGrpc.getGenerateKeyCertsMethod) == null) {
      synchronized (CertificateServiceGrpc.class) {
        if ((getGenerateKeyCertsMethod = CertificateServiceGrpc.getGenerateKeyCertsMethod) == null) {
          CertificateServiceGrpc.getGenerateKeyCertsMethod = getGenerateKeyCertsMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsRequest, org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateKeyCerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CertificateServiceMethodDescriptorSupplier("GenerateKeyCerts"))
              .build();
        }
      }
    }
    return getGenerateKeyCertsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CertificateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CertificateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CertificateServiceStub>() {
        @java.lang.Override
        public CertificateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CertificateServiceStub(channel, callOptions);
        }
      };
    return CertificateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CertificateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CertificateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CertificateServiceBlockingStub>() {
        @java.lang.Override
        public CertificateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CertificateServiceBlockingStub(channel, callOptions);
        }
      };
    return CertificateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CertificateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CertificateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CertificateServiceFutureStub>() {
        @java.lang.Override
        public CertificateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CertificateServiceFutureStub(channel, callOptions);
        }
      };
    return CertificateServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void generateKeyCerts(org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateKeyCertsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CertificateService.
   */
  public static abstract class CertificateServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CertificateServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CertificateService.
   */
  public static final class CertificateServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CertificateServiceStub> {
    private CertificateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CertificateServiceStub(channel, callOptions);
    }

    /**
     */
    public void generateKeyCerts(org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateKeyCertsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CertificateService.
   */
  public static final class CertificateServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CertificateServiceBlockingStub> {
    private CertificateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CertificateServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsResponse generateKeyCerts(org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateKeyCertsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CertificateService.
   */
  public static final class CertificateServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CertificateServiceFutureStub> {
    private CertificateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CertificateServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsResponse> generateKeyCerts(
        org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateKeyCertsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GENERATE_KEY_CERTS = 0;

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
        case METHODID_GENERATE_KEY_CERTS:
          serviceImpl.generateKeyCerts((org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsResponse>) responseObserver);
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
          getGenerateKeyCertsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsRequest,
              org.secretflow.v1alpha1.kusciaapi.Certificate.GenerateKeyCertsResponse>(
                service, METHODID_GENERATE_KEY_CERTS)))
        .build();
  }

  private static abstract class CertificateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CertificateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.secretflow.v1alpha1.kusciaapi.Certificate.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CertificateService");
    }
  }

  private static final class CertificateServiceFileDescriptorSupplier
      extends CertificateServiceBaseDescriptorSupplier {
    CertificateServiceFileDescriptorSupplier() {}
  }

  private static final class CertificateServiceMethodDescriptorSupplier
      extends CertificateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CertificateServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CertificateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CertificateServiceFileDescriptorSupplier())
              .addMethod(getGenerateKeyCertsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
