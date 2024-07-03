package org.secretflow.v1alpha1.kusciaapi;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: kuscia/proto/api/v1alpha1/kusciaapi/job.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class JobServiceGrpc {

  private JobServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "kuscia.proto.api.v1alpha1.kusciaapi.JobService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.CreateJobRequest,
      org.secretflow.v1alpha1.kusciaapi.Job.CreateJobResponse> getCreateJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateJob",
      requestType = org.secretflow.v1alpha1.kusciaapi.Job.CreateJobRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Job.CreateJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.CreateJobRequest,
      org.secretflow.v1alpha1.kusciaapi.Job.CreateJobResponse> getCreateJobMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.CreateJobRequest, org.secretflow.v1alpha1.kusciaapi.Job.CreateJobResponse> getCreateJobMethod;
    if ((getCreateJobMethod = JobServiceGrpc.getCreateJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getCreateJobMethod = JobServiceGrpc.getCreateJobMethod) == null) {
          JobServiceGrpc.getCreateJobMethod = getCreateJobMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Job.CreateJobRequest, org.secretflow.v1alpha1.kusciaapi.Job.CreateJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Job.CreateJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Job.CreateJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("CreateJob"))
              .build();
        }
      }
    }
    return getCreateJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.QueryJobRequest,
      org.secretflow.v1alpha1.kusciaapi.Job.QueryJobResponse> getQueryJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "QueryJob",
      requestType = org.secretflow.v1alpha1.kusciaapi.Job.QueryJobRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Job.QueryJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.QueryJobRequest,
      org.secretflow.v1alpha1.kusciaapi.Job.QueryJobResponse> getQueryJobMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.QueryJobRequest, org.secretflow.v1alpha1.kusciaapi.Job.QueryJobResponse> getQueryJobMethod;
    if ((getQueryJobMethod = JobServiceGrpc.getQueryJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getQueryJobMethod = JobServiceGrpc.getQueryJobMethod) == null) {
          JobServiceGrpc.getQueryJobMethod = getQueryJobMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Job.QueryJobRequest, org.secretflow.v1alpha1.kusciaapi.Job.QueryJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "QueryJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Job.QueryJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Job.QueryJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("QueryJob"))
              .build();
        }
      }
    }
    return getQueryJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusRequest,
      org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusResponse> getBatchQueryJobStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchQueryJobStatus",
      requestType = org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusRequest,
      org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusResponse> getBatchQueryJobStatusMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusRequest, org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusResponse> getBatchQueryJobStatusMethod;
    if ((getBatchQueryJobStatusMethod = JobServiceGrpc.getBatchQueryJobStatusMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getBatchQueryJobStatusMethod = JobServiceGrpc.getBatchQueryJobStatusMethod) == null) {
          JobServiceGrpc.getBatchQueryJobStatusMethod = getBatchQueryJobStatusMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusRequest, org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchQueryJobStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("BatchQueryJobStatus"))
              .build();
        }
      }
    }
    return getBatchQueryJobStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.StopJobRequest,
      org.secretflow.v1alpha1.kusciaapi.Job.StopJobResponse> getStopJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopJob",
      requestType = org.secretflow.v1alpha1.kusciaapi.Job.StopJobRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Job.StopJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.StopJobRequest,
      org.secretflow.v1alpha1.kusciaapi.Job.StopJobResponse> getStopJobMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.StopJobRequest, org.secretflow.v1alpha1.kusciaapi.Job.StopJobResponse> getStopJobMethod;
    if ((getStopJobMethod = JobServiceGrpc.getStopJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getStopJobMethod = JobServiceGrpc.getStopJobMethod) == null) {
          JobServiceGrpc.getStopJobMethod = getStopJobMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Job.StopJobRequest, org.secretflow.v1alpha1.kusciaapi.Job.StopJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Job.StopJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Job.StopJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("StopJob"))
              .build();
        }
      }
    }
    return getStopJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobRequest,
      org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobResponse> getDeleteJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteJob",
      requestType = org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobRequest,
      org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobResponse> getDeleteJobMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobRequest, org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobResponse> getDeleteJobMethod;
    if ((getDeleteJobMethod = JobServiceGrpc.getDeleteJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getDeleteJobMethod = JobServiceGrpc.getDeleteJobMethod) == null) {
          JobServiceGrpc.getDeleteJobMethod = getDeleteJobMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobRequest, org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("DeleteJob"))
              .build();
        }
      }
    }
    return getDeleteJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.WatchJobRequest,
      org.secretflow.v1alpha1.kusciaapi.Job.WatchJobEventResponse> getWatchJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WatchJob",
      requestType = org.secretflow.v1alpha1.kusciaapi.Job.WatchJobRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Job.WatchJobEventResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.WatchJobRequest,
      org.secretflow.v1alpha1.kusciaapi.Job.WatchJobEventResponse> getWatchJobMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.WatchJobRequest, org.secretflow.v1alpha1.kusciaapi.Job.WatchJobEventResponse> getWatchJobMethod;
    if ((getWatchJobMethod = JobServiceGrpc.getWatchJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getWatchJobMethod = JobServiceGrpc.getWatchJobMethod) == null) {
          JobServiceGrpc.getWatchJobMethod = getWatchJobMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Job.WatchJobRequest, org.secretflow.v1alpha1.kusciaapi.Job.WatchJobEventResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WatchJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Job.WatchJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Job.WatchJobEventResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("WatchJob"))
              .build();
        }
      }
    }
    return getWatchJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobRequest,
      org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobResponse> getApproveJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApproveJob",
      requestType = org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobRequest.class,
      responseType = org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobRequest,
      org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobResponse> getApproveJobMethod() {
    io.grpc.MethodDescriptor<org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobRequest, org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobResponse> getApproveJobMethod;
    if ((getApproveJobMethod = JobServiceGrpc.getApproveJobMethod) == null) {
      synchronized (JobServiceGrpc.class) {
        if ((getApproveJobMethod = JobServiceGrpc.getApproveJobMethod) == null) {
          JobServiceGrpc.getApproveJobMethod = getApproveJobMethod =
              io.grpc.MethodDescriptor.<org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobRequest, org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApproveJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JobServiceMethodDescriptorSupplier("ApproveJob"))
              .build();
        }
      }
    }
    return getApproveJobMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobServiceStub>() {
        @java.lang.Override
        public JobServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobServiceStub(channel, callOptions);
        }
      };
    return JobServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobServiceBlockingStub>() {
        @java.lang.Override
        public JobServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobServiceBlockingStub(channel, callOptions);
        }
      };
    return JobServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobServiceFutureStub>() {
        @java.lang.Override
        public JobServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobServiceFutureStub(channel, callOptions);
        }
      };
    return JobServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createJob(org.secretflow.v1alpha1.kusciaapi.Job.CreateJobRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.CreateJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateJobMethod(), responseObserver);
    }

    /**
     */
    default void queryJob(org.secretflow.v1alpha1.kusciaapi.Job.QueryJobRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.QueryJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryJobMethod(), responseObserver);
    }

    /**
     */
    default void batchQueryJobStatus(org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchQueryJobStatusMethod(), responseObserver);
    }

    /**
     */
    default void stopJob(org.secretflow.v1alpha1.kusciaapi.Job.StopJobRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.StopJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopJobMethod(), responseObserver);
    }

    /**
     */
    default void deleteJob(org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteJobMethod(), responseObserver);
    }

    /**
     */
    default void watchJob(org.secretflow.v1alpha1.kusciaapi.Job.WatchJobRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.WatchJobEventResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWatchJobMethod(), responseObserver);
    }

    /**
     */
    default void approveJob(org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApproveJobMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service JobService.
   */
  public static abstract class JobServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return JobServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service JobService.
   */
  public static final class JobServiceStub
      extends io.grpc.stub.AbstractAsyncStub<JobServiceStub> {
    private JobServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceStub(channel, callOptions);
    }

    /**
     */
    public void createJob(org.secretflow.v1alpha1.kusciaapi.Job.CreateJobRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.CreateJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryJob(org.secretflow.v1alpha1.kusciaapi.Job.QueryJobRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.QueryJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchQueryJobStatus(org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchQueryJobStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopJob(org.secretflow.v1alpha1.kusciaapi.Job.StopJobRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.StopJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteJob(org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void watchJob(org.secretflow.v1alpha1.kusciaapi.Job.WatchJobRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.WatchJobEventResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getWatchJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void approveJob(org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobRequest request,
        io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApproveJobMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service JobService.
   */
  public static final class JobServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<JobServiceBlockingStub> {
    private JobServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Job.CreateJobResponse createJob(org.secretflow.v1alpha1.kusciaapi.Job.CreateJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Job.QueryJobResponse queryJob(org.secretflow.v1alpha1.kusciaapi.Job.QueryJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusResponse batchQueryJobStatus(org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchQueryJobStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Job.StopJobResponse stopJob(org.secretflow.v1alpha1.kusciaapi.Job.StopJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobResponse deleteJob(org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.secretflow.v1alpha1.kusciaapi.Job.WatchJobEventResponse> watchJob(
        org.secretflow.v1alpha1.kusciaapi.Job.WatchJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getWatchJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobResponse approveJob(org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApproveJobMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service JobService.
   */
  public static final class JobServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<JobServiceFutureStub> {
    private JobServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Job.CreateJobResponse> createJob(
        org.secretflow.v1alpha1.kusciaapi.Job.CreateJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Job.QueryJobResponse> queryJob(
        org.secretflow.v1alpha1.kusciaapi.Job.QueryJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusResponse> batchQueryJobStatus(
        org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchQueryJobStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Job.StopJobResponse> stopJob(
        org.secretflow.v1alpha1.kusciaapi.Job.StopJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobResponse> deleteJob(
        org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobResponse> approveJob(
        org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApproveJobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_JOB = 0;
  private static final int METHODID_QUERY_JOB = 1;
  private static final int METHODID_BATCH_QUERY_JOB_STATUS = 2;
  private static final int METHODID_STOP_JOB = 3;
  private static final int METHODID_DELETE_JOB = 4;
  private static final int METHODID_WATCH_JOB = 5;
  private static final int METHODID_APPROVE_JOB = 6;

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
        case METHODID_CREATE_JOB:
          serviceImpl.createJob((org.secretflow.v1alpha1.kusciaapi.Job.CreateJobRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.CreateJobResponse>) responseObserver);
          break;
        case METHODID_QUERY_JOB:
          serviceImpl.queryJob((org.secretflow.v1alpha1.kusciaapi.Job.QueryJobRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.QueryJobResponse>) responseObserver);
          break;
        case METHODID_BATCH_QUERY_JOB_STATUS:
          serviceImpl.batchQueryJobStatus((org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusResponse>) responseObserver);
          break;
        case METHODID_STOP_JOB:
          serviceImpl.stopJob((org.secretflow.v1alpha1.kusciaapi.Job.StopJobRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.StopJobResponse>) responseObserver);
          break;
        case METHODID_DELETE_JOB:
          serviceImpl.deleteJob((org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobResponse>) responseObserver);
          break;
        case METHODID_WATCH_JOB:
          serviceImpl.watchJob((org.secretflow.v1alpha1.kusciaapi.Job.WatchJobRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.WatchJobEventResponse>) responseObserver);
          break;
        case METHODID_APPROVE_JOB:
          serviceImpl.approveJob((org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobRequest) request,
              (io.grpc.stub.StreamObserver<org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobResponse>) responseObserver);
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
          getCreateJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Job.CreateJobRequest,
              org.secretflow.v1alpha1.kusciaapi.Job.CreateJobResponse>(
                service, METHODID_CREATE_JOB)))
        .addMethod(
          getQueryJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Job.QueryJobRequest,
              org.secretflow.v1alpha1.kusciaapi.Job.QueryJobResponse>(
                service, METHODID_QUERY_JOB)))
        .addMethod(
          getBatchQueryJobStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusRequest,
              org.secretflow.v1alpha1.kusciaapi.Job.BatchQueryJobStatusResponse>(
                service, METHODID_BATCH_QUERY_JOB_STATUS)))
        .addMethod(
          getStopJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Job.StopJobRequest,
              org.secretflow.v1alpha1.kusciaapi.Job.StopJobResponse>(
                service, METHODID_STOP_JOB)))
        .addMethod(
          getDeleteJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobRequest,
              org.secretflow.v1alpha1.kusciaapi.Job.DeleteJobResponse>(
                service, METHODID_DELETE_JOB)))
        .addMethod(
          getWatchJobMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Job.WatchJobRequest,
              org.secretflow.v1alpha1.kusciaapi.Job.WatchJobEventResponse>(
                service, METHODID_WATCH_JOB)))
        .addMethod(
          getApproveJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobRequest,
              org.secretflow.v1alpha1.kusciaapi.Job.ApproveJobResponse>(
                service, METHODID_APPROVE_JOB)))
        .build();
  }

  private static abstract class JobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.secretflow.v1alpha1.kusciaapi.Job.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JobService");
    }
  }

  private static final class JobServiceFileDescriptorSupplier
      extends JobServiceBaseDescriptorSupplier {
    JobServiceFileDescriptorSupplier() {}
  }

  private static final class JobServiceMethodDescriptorSupplier
      extends JobServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    JobServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (JobServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobServiceFileDescriptorSupplier())
              .addMethod(getCreateJobMethod())
              .addMethod(getQueryJobMethod())
              .addMethod(getBatchQueryJobStatusMethod())
              .addMethod(getStopJobMethod())
              .addMethod(getDeleteJobMethod())
              .addMethod(getWatchJobMethod())
              .addMethod(getApproveJobMethod())
              .build();
        }
      }
    }
    return result;
  }
}
