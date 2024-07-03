// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secretflow/spec/v1/data.proto

package com.secretflow.spec.v1;

public interface StorageConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:secretflow.spec.v1.StorageConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * enum[local_fs, s3]
   * </pre>
   *
   * <code>string type = 1;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * enum[local_fs, s3]
   * </pre>
   *
   * <code>string type = 1;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * local_fs config.
   * </pre>
   *
   * <code>.secretflow.spec.v1.StorageConfig.LocalFSConfig local_fs = 2;</code>
   * @return Whether the localFs field is set.
   */
  boolean hasLocalFs();
  /**
   * <pre>
   * local_fs config.
   * </pre>
   *
   * <code>.secretflow.spec.v1.StorageConfig.LocalFSConfig local_fs = 2;</code>
   * @return The localFs.
   */
  com.secretflow.spec.v1.StorageConfig.LocalFSConfig getLocalFs();
  /**
   * <pre>
   * local_fs config.
   * </pre>
   *
   * <code>.secretflow.spec.v1.StorageConfig.LocalFSConfig local_fs = 2;</code>
   */
  com.secretflow.spec.v1.StorageConfig.LocalFSConfigOrBuilder getLocalFsOrBuilder();

  /**
   * <pre>
   * s3 config
   * </pre>
   *
   * <code>.secretflow.spec.v1.StorageConfig.S3Config s3 = 3;</code>
   * @return Whether the s3 field is set.
   */
  boolean hasS3();
  /**
   * <pre>
   * s3 config
   * </pre>
   *
   * <code>.secretflow.spec.v1.StorageConfig.S3Config s3 = 3;</code>
   * @return The s3.
   */
  com.secretflow.spec.v1.StorageConfig.S3Config getS3();
  /**
   * <pre>
   * s3 config
   * </pre>
   *
   * <code>.secretflow.spec.v1.StorageConfig.S3Config s3 = 3;</code>
   */
  com.secretflow.spec.v1.StorageConfig.S3ConfigOrBuilder getS3OrBuilder();
}