// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

/**
 *
 *
 * <pre>
 * A BigQuery destination.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1.BigQueryDestination}
 */
public final class BigQueryDestination extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1.BigQueryDestination)
    BigQueryDestinationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BigQueryDestination.newBuilder() to construct.
  private BigQueryDestination(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BigQueryDestination() {
    dataset_ = "";
    table_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BigQueryDestination(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              dataset_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              table_ = s;
              break;
            }
          case 24:
            {
              force_ = input.readBool();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_BigQueryDestination_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_BigQueryDestination_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1.BigQueryDestination.class,
            com.google.cloud.asset.v1.BigQueryDestination.Builder.class);
  }

  public static final int DATASET_FIELD_NUMBER = 1;
  private volatile java.lang.Object dataset_;
  /**
   *
   *
   * <pre>
   * Required. The BigQuery dataset in format
   * "projects/projectId/datasets/datasetId", to which the snapshot result
   * should be exported. If this dataset does not exist, the export call returns
   * an error.
   * </pre>
   *
   * <code>string dataset = 1;</code>
   */
  public java.lang.String getDataset() {
    java.lang.Object ref = dataset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataset_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The BigQuery dataset in format
   * "projects/projectId/datasets/datasetId", to which the snapshot result
   * should be exported. If this dataset does not exist, the export call returns
   * an error.
   * </pre>
   *
   * <code>string dataset = 1;</code>
   */
  public com.google.protobuf.ByteString getDatasetBytes() {
    java.lang.Object ref = dataset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      dataset_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TABLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object table_;
  /**
   *
   *
   * <pre>
   * Required. The BigQuery table to which the snapshot result should be
   * written. If this table does not exist, a new table with the given name
   * will be created.
   * </pre>
   *
   * <code>string table = 2;</code>
   */
  public java.lang.String getTable() {
    java.lang.Object ref = table_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      table_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The BigQuery table to which the snapshot result should be
   * written. If this table does not exist, a new table with the given name
   * will be created.
   * </pre>
   *
   * <code>string table = 2;</code>
   */
  public com.google.protobuf.ByteString getTableBytes() {
    java.lang.Object ref = table_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      table_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORCE_FIELD_NUMBER = 3;
  private boolean force_;
  /**
   *
   *
   * <pre>
   * If the destination table already exists and this flag is `TRUE`, the
   * table will be overwritten by the contents of assets snapshot. If the flag
   * is not set and the destination table already exists, the export call
   * returns an error.
   * </pre>
   *
   * <code>bool force = 3;</code>
   */
  public boolean getForce() {
    return force_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getDatasetBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dataset_);
    }
    if (!getTableBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, table_);
    }
    if (force_ != false) {
      output.writeBool(3, force_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDatasetBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dataset_);
    }
    if (!getTableBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, table_);
    }
    if (force_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, force_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.asset.v1.BigQueryDestination)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1.BigQueryDestination other =
        (com.google.cloud.asset.v1.BigQueryDestination) obj;

    if (!getDataset().equals(other.getDataset())) return false;
    if (!getTable().equals(other.getTable())) return false;
    if (getForce() != other.getForce()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DATASET_FIELD_NUMBER;
    hash = (53 * hash) + getDataset().hashCode();
    hash = (37 * hash) + TABLE_FIELD_NUMBER;
    hash = (53 * hash) + getTable().hashCode();
    hash = (37 * hash) + FORCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getForce());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1.BigQueryDestination parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.BigQueryDestination parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.BigQueryDestination parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.BigQueryDestination parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.BigQueryDestination parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.BigQueryDestination parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.BigQueryDestination parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.BigQueryDestination parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.BigQueryDestination parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.BigQueryDestination parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.BigQueryDestination parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.BigQueryDestination parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.asset.v1.BigQueryDestination prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A BigQuery destination.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1.BigQueryDestination}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1.BigQueryDestination)
      com.google.cloud.asset.v1.BigQueryDestinationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_BigQueryDestination_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_BigQueryDestination_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1.BigQueryDestination.class,
              com.google.cloud.asset.v1.BigQueryDestination.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1.BigQueryDestination.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      dataset_ = "";

      table_ = "";

      force_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_BigQueryDestination_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.BigQueryDestination getDefaultInstanceForType() {
      return com.google.cloud.asset.v1.BigQueryDestination.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.BigQueryDestination build() {
      com.google.cloud.asset.v1.BigQueryDestination result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.BigQueryDestination buildPartial() {
      com.google.cloud.asset.v1.BigQueryDestination result =
          new com.google.cloud.asset.v1.BigQueryDestination(this);
      result.dataset_ = dataset_;
      result.table_ = table_;
      result.force_ = force_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.asset.v1.BigQueryDestination) {
        return mergeFrom((com.google.cloud.asset.v1.BigQueryDestination) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1.BigQueryDestination other) {
      if (other == com.google.cloud.asset.v1.BigQueryDestination.getDefaultInstance()) return this;
      if (!other.getDataset().isEmpty()) {
        dataset_ = other.dataset_;
        onChanged();
      }
      if (!other.getTable().isEmpty()) {
        table_ = other.table_;
        onChanged();
      }
      if (other.getForce() != false) {
        setForce(other.getForce());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.asset.v1.BigQueryDestination parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.asset.v1.BigQueryDestination) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object dataset_ = "";
    /**
     *
     *
     * <pre>
     * Required. The BigQuery dataset in format
     * "projects/projectId/datasets/datasetId", to which the snapshot result
     * should be exported. If this dataset does not exist, the export call returns
     * an error.
     * </pre>
     *
     * <code>string dataset = 1;</code>
     */
    public java.lang.String getDataset() {
      java.lang.Object ref = dataset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery dataset in format
     * "projects/projectId/datasets/datasetId", to which the snapshot result
     * should be exported. If this dataset does not exist, the export call returns
     * an error.
     * </pre>
     *
     * <code>string dataset = 1;</code>
     */
    public com.google.protobuf.ByteString getDatasetBytes() {
      java.lang.Object ref = dataset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        dataset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery dataset in format
     * "projects/projectId/datasets/datasetId", to which the snapshot result
     * should be exported. If this dataset does not exist, the export call returns
     * an error.
     * </pre>
     *
     * <code>string dataset = 1;</code>
     */
    public Builder setDataset(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      dataset_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery dataset in format
     * "projects/projectId/datasets/datasetId", to which the snapshot result
     * should be exported. If this dataset does not exist, the export call returns
     * an error.
     * </pre>
     *
     * <code>string dataset = 1;</code>
     */
    public Builder clearDataset() {

      dataset_ = getDefaultInstance().getDataset();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery dataset in format
     * "projects/projectId/datasets/datasetId", to which the snapshot result
     * should be exported. If this dataset does not exist, the export call returns
     * an error.
     * </pre>
     *
     * <code>string dataset = 1;</code>
     */
    public Builder setDatasetBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      dataset_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object table_ = "";
    /**
     *
     *
     * <pre>
     * Required. The BigQuery table to which the snapshot result should be
     * written. If this table does not exist, a new table with the given name
     * will be created.
     * </pre>
     *
     * <code>string table = 2;</code>
     */
    public java.lang.String getTable() {
      java.lang.Object ref = table_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        table_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery table to which the snapshot result should be
     * written. If this table does not exist, a new table with the given name
     * will be created.
     * </pre>
     *
     * <code>string table = 2;</code>
     */
    public com.google.protobuf.ByteString getTableBytes() {
      java.lang.Object ref = table_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        table_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery table to which the snapshot result should be
     * written. If this table does not exist, a new table with the given name
     * will be created.
     * </pre>
     *
     * <code>string table = 2;</code>
     */
    public Builder setTable(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      table_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery table to which the snapshot result should be
     * written. If this table does not exist, a new table with the given name
     * will be created.
     * </pre>
     *
     * <code>string table = 2;</code>
     */
    public Builder clearTable() {

      table_ = getDefaultInstance().getTable();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery table to which the snapshot result should be
     * written. If this table does not exist, a new table with the given name
     * will be created.
     * </pre>
     *
     * <code>string table = 2;</code>
     */
    public Builder setTableBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      table_ = value;
      onChanged();
      return this;
    }

    private boolean force_;
    /**
     *
     *
     * <pre>
     * If the destination table already exists and this flag is `TRUE`, the
     * table will be overwritten by the contents of assets snapshot. If the flag
     * is not set and the destination table already exists, the export call
     * returns an error.
     * </pre>
     *
     * <code>bool force = 3;</code>
     */
    public boolean getForce() {
      return force_;
    }
    /**
     *
     *
     * <pre>
     * If the destination table already exists and this flag is `TRUE`, the
     * table will be overwritten by the contents of assets snapshot. If the flag
     * is not set and the destination table already exists, the export call
     * returns an error.
     * </pre>
     *
     * <code>bool force = 3;</code>
     */
    public Builder setForce(boolean value) {

      force_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If the destination table already exists and this flag is `TRUE`, the
     * table will be overwritten by the contents of assets snapshot. If the flag
     * is not set and the destination table already exists, the export call
     * returns an error.
     * </pre>
     *
     * <code>bool force = 3;</code>
     */
    public Builder clearForce() {

      force_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1.BigQueryDestination)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1.BigQueryDestination)
  private static final com.google.cloud.asset.v1.BigQueryDestination DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1.BigQueryDestination();
  }

  public static com.google.cloud.asset.v1.BigQueryDestination getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BigQueryDestination> PARSER =
      new com.google.protobuf.AbstractParser<BigQueryDestination>() {
        @java.lang.Override
        public BigQueryDestination parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BigQueryDestination(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BigQueryDestination> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BigQueryDestination> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1.BigQueryDestination getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
