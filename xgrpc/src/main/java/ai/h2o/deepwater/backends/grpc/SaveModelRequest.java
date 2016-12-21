// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc_service.proto

package ai.h2o.deepwater.backends.grpc;

/**
 * Protobuf type {@code deepwater.SaveModelRequest}
 */
public  final class SaveModelRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:deepwater.SaveModelRequest)
    SaveModelRequestOrBuilder {
  // Use SaveModelRequest.newBuilder() to construct.
  private SaveModelRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SaveModelRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SaveModelRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            ai.h2o.deepwater.backends.grpc.Session.Builder subBuilder = null;
            if (session_ != null) {
              subBuilder = session_.toBuilder();
            }
            session_ = input.readMessage(ai.h2o.deepwater.backends.grpc.Session.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(session_);
              session_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            ai.h2o.deepwater.backends.grpc.BackendModel.Builder subBuilder = null;
            if (model_ != null) {
              subBuilder = model_.toBuilder();
            }
            model_ = input.readMessage(ai.h2o.deepwater.backends.grpc.BackendModel.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(model_);
              model_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              params_ = com.google.protobuf.MapField.newMapField(
                  ParamsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000004;
            }
            com.google.protobuf.MapEntry<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
            params__ = input.readMessage(
                ParamsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            params_.getMutableMap().put(
                params__.getKey(), params__.getValue());
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_SaveModelRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 3:
        return internalGetParams();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_SaveModelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ai.h2o.deepwater.backends.grpc.SaveModelRequest.class, ai.h2o.deepwater.backends.grpc.SaveModelRequest.Builder.class);
  }

  private int bitField0_;
  public static final int SESSION_FIELD_NUMBER = 1;
  private ai.h2o.deepwater.backends.grpc.Session session_;
  /**
   * <code>optional .deepwater.Session session = 1;</code>
   */
  public boolean hasSession() {
    return session_ != null;
  }
  /**
   * <code>optional .deepwater.Session session = 1;</code>
   */
  public ai.h2o.deepwater.backends.grpc.Session getSession() {
    return session_ == null ? ai.h2o.deepwater.backends.grpc.Session.getDefaultInstance() : session_;
  }
  /**
   * <code>optional .deepwater.Session session = 1;</code>
   */
  public ai.h2o.deepwater.backends.grpc.SessionOrBuilder getSessionOrBuilder() {
    return getSession();
  }

  public static final int MODEL_FIELD_NUMBER = 2;
  private ai.h2o.deepwater.backends.grpc.BackendModel model_;
  /**
   * <code>optional .deepwater.BackendModel model = 2;</code>
   */
  public boolean hasModel() {
    return model_ != null;
  }
  /**
   * <code>optional .deepwater.BackendModel model = 2;</code>
   */
  public ai.h2o.deepwater.backends.grpc.BackendModel getModel() {
    return model_ == null ? ai.h2o.deepwater.backends.grpc.BackendModel.getDefaultInstance() : model_;
  }
  /**
   * <code>optional .deepwater.BackendModel model = 2;</code>
   */
  public ai.h2o.deepwater.backends.grpc.BackendModelOrBuilder getModelOrBuilder() {
    return getModel();
  }

  public static final int PARAMS_FIELD_NUMBER = 3;
  private static final class ParamsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>newDefaultInstance(
                ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_SaveModelRequest_ParamsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                ai.h2o.deepwater.backends.grpc.ParamValue.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> params_;
  private com.google.protobuf.MapField<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
  internalGetParams() {
    if (params_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ParamsDefaultEntryHolder.defaultEntry);
    }
    return params_;
  }

  public int getParamsCount() {
    return internalGetParams().getMap().size();
  }
  /**
   * <code>map&lt;string, .deepwater.ParamValue&gt; params = 3;</code>
   */

  public boolean containsParams(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetParams().getMap().containsKey(key);
  }
  /**
   * Use {@link #getParamsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> getParams() {
    return getParamsMap();
  }
  /**
   * <code>map&lt;string, .deepwater.ParamValue&gt; params = 3;</code>
   */

  public java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> getParamsMap() {
    return internalGetParams().getMap();
  }
  /**
   * <code>map&lt;string, .deepwater.ParamValue&gt; params = 3;</code>
   */

  public ai.h2o.deepwater.backends.grpc.ParamValue getParamsOrDefault(
      java.lang.String key,
      ai.h2o.deepwater.backends.grpc.ParamValue defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> map =
        internalGetParams().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .deepwater.ParamValue&gt; params = 3;</code>
   */

  public ai.h2o.deepwater.backends.grpc.ParamValue getParamsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> map =
        internalGetParams().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (session_ != null) {
      output.writeMessage(1, getSession());
    }
    if (model_ != null) {
      output.writeMessage(2, getModel());
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetParams(),
        ParamsDefaultEntryHolder.defaultEntry,
        3);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (session_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSession());
    }
    if (model_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getModel());
    }
    for (java.util.Map.Entry<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> entry
         : internalGetParams().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
      params__ = ParamsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, params__);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ai.h2o.deepwater.backends.grpc.SaveModelRequest)) {
      return super.equals(obj);
    }
    ai.h2o.deepwater.backends.grpc.SaveModelRequest other = (ai.h2o.deepwater.backends.grpc.SaveModelRequest) obj;

    boolean result = true;
    result = result && (hasSession() == other.hasSession());
    if (hasSession()) {
      result = result && getSession()
          .equals(other.getSession());
    }
    result = result && (hasModel() == other.hasModel());
    if (hasModel()) {
      result = result && getModel()
          .equals(other.getModel());
    }
    result = result && internalGetParams().equals(
        other.internalGetParams());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasSession()) {
      hash = (37 * hash) + SESSION_FIELD_NUMBER;
      hash = (53 * hash) + getSession().hashCode();
    }
    if (hasModel()) {
      hash = (37 * hash) + MODEL_FIELD_NUMBER;
      hash = (53 * hash) + getModel().hashCode();
    }
    if (!internalGetParams().getMap().isEmpty()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetParams().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ai.h2o.deepwater.backends.grpc.SaveModelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.h2o.deepwater.backends.grpc.SaveModelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.h2o.deepwater.backends.grpc.SaveModelRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ai.h2o.deepwater.backends.grpc.SaveModelRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ai.h2o.deepwater.backends.grpc.SaveModelRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.h2o.deepwater.backends.grpc.SaveModelRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.h2o.deepwater.backends.grpc.SaveModelRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ai.h2o.deepwater.backends.grpc.SaveModelRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ai.h2o.deepwater.backends.grpc.SaveModelRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ai.h2o.deepwater.backends.grpc.SaveModelRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ai.h2o.deepwater.backends.grpc.SaveModelRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code deepwater.SaveModelRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:deepwater.SaveModelRequest)
      ai.h2o.deepwater.backends.grpc.SaveModelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_SaveModelRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetParams();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMutableParams();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_SaveModelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ai.h2o.deepwater.backends.grpc.SaveModelRequest.class, ai.h2o.deepwater.backends.grpc.SaveModelRequest.Builder.class);
    }

    // Construct using ai.h2o.deepwater.backends.grpc.SaveModelRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (sessionBuilder_ == null) {
        session_ = null;
      } else {
        session_ = null;
        sessionBuilder_ = null;
      }
      if (modelBuilder_ == null) {
        model_ = null;
      } else {
        model_ = null;
        modelBuilder_ = null;
      }
      internalGetMutableParams().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ai.h2o.deepwater.backends.grpc.DeepWaterGRPCService.internal_static_deepwater_SaveModelRequest_descriptor;
    }

    public ai.h2o.deepwater.backends.grpc.SaveModelRequest getDefaultInstanceForType() {
      return ai.h2o.deepwater.backends.grpc.SaveModelRequest.getDefaultInstance();
    }

    public ai.h2o.deepwater.backends.grpc.SaveModelRequest build() {
      ai.h2o.deepwater.backends.grpc.SaveModelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ai.h2o.deepwater.backends.grpc.SaveModelRequest buildPartial() {
      ai.h2o.deepwater.backends.grpc.SaveModelRequest result = new ai.h2o.deepwater.backends.grpc.SaveModelRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (sessionBuilder_ == null) {
        result.session_ = session_;
      } else {
        result.session_ = sessionBuilder_.build();
      }
      if (modelBuilder_ == null) {
        result.model_ = model_;
      } else {
        result.model_ = modelBuilder_.build();
      }
      result.params_ = internalGetParams();
      result.params_.makeImmutable();
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ai.h2o.deepwater.backends.grpc.SaveModelRequest) {
        return mergeFrom((ai.h2o.deepwater.backends.grpc.SaveModelRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ai.h2o.deepwater.backends.grpc.SaveModelRequest other) {
      if (other == ai.h2o.deepwater.backends.grpc.SaveModelRequest.getDefaultInstance()) return this;
      if (other.hasSession()) {
        mergeSession(other.getSession());
      }
      if (other.hasModel()) {
        mergeModel(other.getModel());
      }
      internalGetMutableParams().mergeFrom(
          other.internalGetParams());
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ai.h2o.deepwater.backends.grpc.SaveModelRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ai.h2o.deepwater.backends.grpc.SaveModelRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private ai.h2o.deepwater.backends.grpc.Session session_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.h2o.deepwater.backends.grpc.Session, ai.h2o.deepwater.backends.grpc.Session.Builder, ai.h2o.deepwater.backends.grpc.SessionOrBuilder> sessionBuilder_;
    /**
     * <code>optional .deepwater.Session session = 1;</code>
     */
    public boolean hasSession() {
      return sessionBuilder_ != null || session_ != null;
    }
    /**
     * <code>optional .deepwater.Session session = 1;</code>
     */
    public ai.h2o.deepwater.backends.grpc.Session getSession() {
      if (sessionBuilder_ == null) {
        return session_ == null ? ai.h2o.deepwater.backends.grpc.Session.getDefaultInstance() : session_;
      } else {
        return sessionBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .deepwater.Session session = 1;</code>
     */
    public Builder setSession(ai.h2o.deepwater.backends.grpc.Session value) {
      if (sessionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        session_ = value;
        onChanged();
      } else {
        sessionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .deepwater.Session session = 1;</code>
     */
    public Builder setSession(
        ai.h2o.deepwater.backends.grpc.Session.Builder builderForValue) {
      if (sessionBuilder_ == null) {
        session_ = builderForValue.build();
        onChanged();
      } else {
        sessionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .deepwater.Session session = 1;</code>
     */
    public Builder mergeSession(ai.h2o.deepwater.backends.grpc.Session value) {
      if (sessionBuilder_ == null) {
        if (session_ != null) {
          session_ =
            ai.h2o.deepwater.backends.grpc.Session.newBuilder(session_).mergeFrom(value).buildPartial();
        } else {
          session_ = value;
        }
        onChanged();
      } else {
        sessionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .deepwater.Session session = 1;</code>
     */
    public Builder clearSession() {
      if (sessionBuilder_ == null) {
        session_ = null;
        onChanged();
      } else {
        session_ = null;
        sessionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .deepwater.Session session = 1;</code>
     */
    public ai.h2o.deepwater.backends.grpc.Session.Builder getSessionBuilder() {
      
      onChanged();
      return getSessionFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .deepwater.Session session = 1;</code>
     */
    public ai.h2o.deepwater.backends.grpc.SessionOrBuilder getSessionOrBuilder() {
      if (sessionBuilder_ != null) {
        return sessionBuilder_.getMessageOrBuilder();
      } else {
        return session_ == null ?
            ai.h2o.deepwater.backends.grpc.Session.getDefaultInstance() : session_;
      }
    }
    /**
     * <code>optional .deepwater.Session session = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.h2o.deepwater.backends.grpc.Session, ai.h2o.deepwater.backends.grpc.Session.Builder, ai.h2o.deepwater.backends.grpc.SessionOrBuilder> 
        getSessionFieldBuilder() {
      if (sessionBuilder_ == null) {
        sessionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.h2o.deepwater.backends.grpc.Session, ai.h2o.deepwater.backends.grpc.Session.Builder, ai.h2o.deepwater.backends.grpc.SessionOrBuilder>(
                getSession(),
                getParentForChildren(),
                isClean());
        session_ = null;
      }
      return sessionBuilder_;
    }

    private ai.h2o.deepwater.backends.grpc.BackendModel model_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.h2o.deepwater.backends.grpc.BackendModel, ai.h2o.deepwater.backends.grpc.BackendModel.Builder, ai.h2o.deepwater.backends.grpc.BackendModelOrBuilder> modelBuilder_;
    /**
     * <code>optional .deepwater.BackendModel model = 2;</code>
     */
    public boolean hasModel() {
      return modelBuilder_ != null || model_ != null;
    }
    /**
     * <code>optional .deepwater.BackendModel model = 2;</code>
     */
    public ai.h2o.deepwater.backends.grpc.BackendModel getModel() {
      if (modelBuilder_ == null) {
        return model_ == null ? ai.h2o.deepwater.backends.grpc.BackendModel.getDefaultInstance() : model_;
      } else {
        return modelBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .deepwater.BackendModel model = 2;</code>
     */
    public Builder setModel(ai.h2o.deepwater.backends.grpc.BackendModel value) {
      if (modelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        model_ = value;
        onChanged();
      } else {
        modelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .deepwater.BackendModel model = 2;</code>
     */
    public Builder setModel(
        ai.h2o.deepwater.backends.grpc.BackendModel.Builder builderForValue) {
      if (modelBuilder_ == null) {
        model_ = builderForValue.build();
        onChanged();
      } else {
        modelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .deepwater.BackendModel model = 2;</code>
     */
    public Builder mergeModel(ai.h2o.deepwater.backends.grpc.BackendModel value) {
      if (modelBuilder_ == null) {
        if (model_ != null) {
          model_ =
            ai.h2o.deepwater.backends.grpc.BackendModel.newBuilder(model_).mergeFrom(value).buildPartial();
        } else {
          model_ = value;
        }
        onChanged();
      } else {
        modelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .deepwater.BackendModel model = 2;</code>
     */
    public Builder clearModel() {
      if (modelBuilder_ == null) {
        model_ = null;
        onChanged();
      } else {
        model_ = null;
        modelBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .deepwater.BackendModel model = 2;</code>
     */
    public ai.h2o.deepwater.backends.grpc.BackendModel.Builder getModelBuilder() {
      
      onChanged();
      return getModelFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .deepwater.BackendModel model = 2;</code>
     */
    public ai.h2o.deepwater.backends.grpc.BackendModelOrBuilder getModelOrBuilder() {
      if (modelBuilder_ != null) {
        return modelBuilder_.getMessageOrBuilder();
      } else {
        return model_ == null ?
            ai.h2o.deepwater.backends.grpc.BackendModel.getDefaultInstance() : model_;
      }
    }
    /**
     * <code>optional .deepwater.BackendModel model = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ai.h2o.deepwater.backends.grpc.BackendModel, ai.h2o.deepwater.backends.grpc.BackendModel.Builder, ai.h2o.deepwater.backends.grpc.BackendModelOrBuilder> 
        getModelFieldBuilder() {
      if (modelBuilder_ == null) {
        modelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ai.h2o.deepwater.backends.grpc.BackendModel, ai.h2o.deepwater.backends.grpc.BackendModel.Builder, ai.h2o.deepwater.backends.grpc.BackendModelOrBuilder>(
                getModel(),
                getParentForChildren(),
                isClean());
        model_ = null;
      }
      return modelBuilder_;
    }

    private com.google.protobuf.MapField<
        java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> params_;
    private com.google.protobuf.MapField<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
    internalGetParams() {
      if (params_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ParamsDefaultEntryHolder.defaultEntry);
      }
      return params_;
    }
    private com.google.protobuf.MapField<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
    internalGetMutableParams() {
      onChanged();;
      if (params_ == null) {
        params_ = com.google.protobuf.MapField.newMapField(
            ParamsDefaultEntryHolder.defaultEntry);
      }
      if (!params_.isMutable()) {
        params_ = params_.copy();
      }
      return params_;
    }

    public int getParamsCount() {
      return internalGetParams().getMap().size();
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 3;</code>
     */

    public boolean containsParams(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetParams().getMap().containsKey(key);
    }
    /**
     * Use {@link #getParamsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> getParams() {
      return getParamsMap();
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 3;</code>
     */

    public java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> getParamsMap() {
      return internalGetParams().getMap();
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 3;</code>
     */

    public ai.h2o.deepwater.backends.grpc.ParamValue getParamsOrDefault(
        java.lang.String key,
        ai.h2o.deepwater.backends.grpc.ParamValue defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> map =
          internalGetParams().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 3;</code>
     */

    public ai.h2o.deepwater.backends.grpc.ParamValue getParamsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> map =
          internalGetParams().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearParams() {
      getMutableParams().clear();
      return this;
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 3;</code>
     */

    public Builder removeParams(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      getMutableParams().remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue>
    getMutableParams() {
      return internalGetMutableParams().getMutableMap();
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 3;</code>
     */
    public Builder putParams(
        java.lang.String key,
        ai.h2o.deepwater.backends.grpc.ParamValue value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      getMutableParams().put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .deepwater.ParamValue&gt; params = 3;</code>
     */

    public Builder putAllParams(
        java.util.Map<java.lang.String, ai.h2o.deepwater.backends.grpc.ParamValue> values) {
      getMutableParams().putAll(values);
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:deepwater.SaveModelRequest)
  }

  // @@protoc_insertion_point(class_scope:deepwater.SaveModelRequest)
  private static final ai.h2o.deepwater.backends.grpc.SaveModelRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ai.h2o.deepwater.backends.grpc.SaveModelRequest();
  }

  public static ai.h2o.deepwater.backends.grpc.SaveModelRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SaveModelRequest>
      PARSER = new com.google.protobuf.AbstractParser<SaveModelRequest>() {
    public SaveModelRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SaveModelRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SaveModelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SaveModelRequest> getParserForType() {
    return PARSER;
  }

  public ai.h2o.deepwater.backends.grpc.SaveModelRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

