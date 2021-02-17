// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HallGuildMessage.proto

package info.xiaomo.server.shared.protocol.hall.guild;

/**
 * <pre>
 *创建公会
 * </pre>
 *
 * Protobuf type {@code CreateGuildResponse}
 */
public final class CreateGuildResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CreateGuildResponse)
    CreateGuildResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateGuildResponse.newBuilder() to construct.
  private CreateGuildResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateGuildResponse() {
    mid_ = 10034;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateGuildResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateGuildResponse(
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
          case 8: {
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            info.xiaomo.server.shared.protocol.Mid.MID value = info.xiaomo.server.shared.protocol.Mid.MID.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(1, rawValue);
            } else {
              bitField0_ |= 0x00000001;
              mid_ = rawValue;
            }
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            result_ = input.readInt32();
            break;
          }
          case 26: {
            info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) != 0)) {
              subBuilder = guildInfo_.toBuilder();
            }
            guildInfo_ = input.readMessage(info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(guildInfo_);
              guildInfo_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000004;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_CreateGuildResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_CreateGuildResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse.class, info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse.Builder.class);
  }

  private int bitField0_;
  public static final int MID_FIELD_NUMBER = 1;
  private int mid_;
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = CreateGuildRes];</code>
   * @return Whether the mid field is set.
   */
  @java.lang.Override public boolean hasMid() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = CreateGuildRes];</code>
   * @return The mid.
   */
  @java.lang.Override public info.xiaomo.server.shared.protocol.Mid.MID getMid() {
    @SuppressWarnings("deprecation")
    info.xiaomo.server.shared.protocol.Mid.MID result = info.xiaomo.server.shared.protocol.Mid.MID.valueOf(mid_);
    return result == null ? info.xiaomo.server.shared.protocol.Mid.MID.CreateGuildRes : result;
  }

  public static final int RESULT_FIELD_NUMBER = 2;
  private int result_;
  /**
   * <pre>
   *结果
   * </pre>
   *
   * <code>required int32 result = 2;</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   *结果
   * </pre>
   *
   * <code>required int32 result = 2;</code>
   * @return The result.
   */
  @java.lang.Override
  public int getResult() {
    return result_;
  }

  public static final int GUILDINFO_FIELD_NUMBER = 3;
  private info.xiaomo.server.shared.protocol.hall.guild.GuildInfo guildInfo_;
  /**
   * <pre>
   *公会信息
   * </pre>
   *
   * <code>optional .GuildInfo guildInfo = 3;</code>
   * @return Whether the guildInfo field is set.
   */
  @java.lang.Override
  public boolean hasGuildInfo() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   *公会信息
   * </pre>
   *
   * <code>optional .GuildInfo guildInfo = 3;</code>
   * @return The guildInfo.
   */
  @java.lang.Override
  public info.xiaomo.server.shared.protocol.hall.guild.GuildInfo getGuildInfo() {
    return guildInfo_ == null ? info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.getDefaultInstance() : guildInfo_;
  }
  /**
   * <pre>
   *公会信息
   * </pre>
   *
   * <code>optional .GuildInfo guildInfo = 3;</code>
   */
  @java.lang.Override
  public info.xiaomo.server.shared.protocol.hall.guild.GuildInfoOrBuilder getGuildInfoOrBuilder() {
    return guildInfo_ == null ? info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.getDefaultInstance() : guildInfo_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasResult()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (hasGuildInfo()) {
      if (!getGuildInfo().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeEnum(1, mid_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, result_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(3, getGuildInfo());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, mid_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, result_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getGuildInfo());
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
    if (!(obj instanceof info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse other = (info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse) obj;

    if (hasMid() != other.hasMid()) return false;
    if (hasMid()) {
      if (mid_ != other.mid_) return false;
    }
    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (getResult()
          != other.getResult()) return false;
    }
    if (hasGuildInfo() != other.hasGuildInfo()) return false;
    if (hasGuildInfo()) {
      if (!getGuildInfo()
          .equals(other.getGuildInfo())) return false;
    }
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
    if (hasMid()) {
      hash = (37 * hash) + MID_FIELD_NUMBER;
      hash = (53 * hash) + mid_;
    }
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult();
    }
    if (hasGuildInfo()) {
      hash = (37 * hash) + GUILDINFO_FIELD_NUMBER;
      hash = (53 * hash) + getGuildInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * <pre>
   *创建公会
   * </pre>
   *
   * Protobuf type {@code CreateGuildResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CreateGuildResponse)
      info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_CreateGuildResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_CreateGuildResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse.class, info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse.Builder.class);
    }

    // Construct using info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse.newBuilder()
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
        getGuildInfoFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      mid_ = 10034;
      bitField0_ = (bitField0_ & ~0x00000001);
      result_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      if (guildInfoBuilder_ == null) {
        guildInfo_ = null;
      } else {
        guildInfoBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_CreateGuildResponse_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse build() {
      info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse buildPartial() {
      info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse result = new info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.mid_ = mid_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.result_ = result_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        if (guildInfoBuilder_ == null) {
          result.guildInfo_ = guildInfo_;
        } else {
          result.guildInfo_ = guildInfoBuilder_.build();
        }
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse) {
        return mergeFrom((info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse other) {
      if (other == info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse.getDefaultInstance()) return this;
      if (other.hasMid()) {
        setMid(other.getMid());
      }
      if (other.hasResult()) {
        setResult(other.getResult());
      }
      if (other.hasGuildInfo()) {
        mergeGuildInfo(other.getGuildInfo());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasResult()) {
        return false;
      }
      if (hasGuildInfo()) {
        if (!getGuildInfo().isInitialized()) {
          return false;
        }
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int mid_ = 10034;
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>optional .MID mid = 1 [default = CreateGuildRes];</code>
     * @return Whether the mid field is set.
     */
    @java.lang.Override public boolean hasMid() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>optional .MID mid = 1 [default = CreateGuildRes];</code>
     * @return The mid.
     */
    @java.lang.Override
    public info.xiaomo.server.shared.protocol.Mid.MID getMid() {
      @SuppressWarnings("deprecation")
      info.xiaomo.server.shared.protocol.Mid.MID result = info.xiaomo.server.shared.protocol.Mid.MID.valueOf(mid_);
      return result == null ? info.xiaomo.server.shared.protocol.Mid.MID.CreateGuildRes : result;
    }
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>optional .MID mid = 1 [default = CreateGuildRes];</code>
     * @param value The mid to set.
     * @return This builder for chaining.
     */
    public Builder setMid(info.xiaomo.server.shared.protocol.Mid.MID value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      mid_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>optional .MID mid = 1 [default = CreateGuildRes];</code>
     * @return This builder for chaining.
     */
    public Builder clearMid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mid_ = 10034;
      onChanged();
      return this;
    }

    private int result_ ;
    /**
     * <pre>
     *结果
     * </pre>
     *
     * <code>required int32 result = 2;</code>
     * @return Whether the result field is set.
     */
    @java.lang.Override
    public boolean hasResult() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     *结果
     * </pre>
     *
     * <code>required int32 result = 2;</code>
     * @return The result.
     */
    @java.lang.Override
    public int getResult() {
      return result_;
    }
    /**
     * <pre>
     *结果
     * </pre>
     *
     * <code>required int32 result = 2;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(int value) {
      bitField0_ |= 0x00000002;
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *结果
     * </pre>
     *
     * <code>required int32 result = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      bitField0_ = (bitField0_ & ~0x00000002);
      result_ = 0;
      onChanged();
      return this;
    }

    private info.xiaomo.server.shared.protocol.hall.guild.GuildInfo guildInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        info.xiaomo.server.shared.protocol.hall.guild.GuildInfo, info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder, info.xiaomo.server.shared.protocol.hall.guild.GuildInfoOrBuilder> guildInfoBuilder_;
    /**
     * <pre>
     *公会信息
     * </pre>
     *
     * <code>optional .GuildInfo guildInfo = 3;</code>
     * @return Whether the guildInfo field is set.
     */
    public boolean hasGuildInfo() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     *公会信息
     * </pre>
     *
     * <code>optional .GuildInfo guildInfo = 3;</code>
     * @return The guildInfo.
     */
    public info.xiaomo.server.shared.protocol.hall.guild.GuildInfo getGuildInfo() {
      if (guildInfoBuilder_ == null) {
        return guildInfo_ == null ? info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.getDefaultInstance() : guildInfo_;
      } else {
        return guildInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *公会信息
     * </pre>
     *
     * <code>optional .GuildInfo guildInfo = 3;</code>
     */
    public Builder setGuildInfo(info.xiaomo.server.shared.protocol.hall.guild.GuildInfo value) {
      if (guildInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        guildInfo_ = value;
        onChanged();
      } else {
        guildInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     *公会信息
     * </pre>
     *
     * <code>optional .GuildInfo guildInfo = 3;</code>
     */
    public Builder setGuildInfo(
        info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder builderForValue) {
      if (guildInfoBuilder_ == null) {
        guildInfo_ = builderForValue.build();
        onChanged();
      } else {
        guildInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     *公会信息
     * </pre>
     *
     * <code>optional .GuildInfo guildInfo = 3;</code>
     */
    public Builder mergeGuildInfo(info.xiaomo.server.shared.protocol.hall.guild.GuildInfo value) {
      if (guildInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
            guildInfo_ != null &&
            guildInfo_ != info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.getDefaultInstance()) {
          guildInfo_ =
            info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.newBuilder(guildInfo_).mergeFrom(value).buildPartial();
        } else {
          guildInfo_ = value;
        }
        onChanged();
      } else {
        guildInfoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     *公会信息
     * </pre>
     *
     * <code>optional .GuildInfo guildInfo = 3;</code>
     */
    public Builder clearGuildInfo() {
      if (guildInfoBuilder_ == null) {
        guildInfo_ = null;
        onChanged();
      } else {
        guildInfoBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <pre>
     *公会信息
     * </pre>
     *
     * <code>optional .GuildInfo guildInfo = 3;</code>
     */
    public info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder getGuildInfoBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getGuildInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *公会信息
     * </pre>
     *
     * <code>optional .GuildInfo guildInfo = 3;</code>
     */
    public info.xiaomo.server.shared.protocol.hall.guild.GuildInfoOrBuilder getGuildInfoOrBuilder() {
      if (guildInfoBuilder_ != null) {
        return guildInfoBuilder_.getMessageOrBuilder();
      } else {
        return guildInfo_ == null ?
            info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.getDefaultInstance() : guildInfo_;
      }
    }
    /**
     * <pre>
     *公会信息
     * </pre>
     *
     * <code>optional .GuildInfo guildInfo = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        info.xiaomo.server.shared.protocol.hall.guild.GuildInfo, info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder, info.xiaomo.server.shared.protocol.hall.guild.GuildInfoOrBuilder> 
        getGuildInfoFieldBuilder() {
      if (guildInfoBuilder_ == null) {
        guildInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            info.xiaomo.server.shared.protocol.hall.guild.GuildInfo, info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder, info.xiaomo.server.shared.protocol.hall.guild.GuildInfoOrBuilder>(
                getGuildInfo(),
                getParentForChildren(),
                isClean());
        guildInfo_ = null;
      }
      return guildInfoBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:CreateGuildResponse)
  }

  // @@protoc_insertion_point(class_scope:CreateGuildResponse)
  private static final info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse();
  }

  public static info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<CreateGuildResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateGuildResponse>() {
    @java.lang.Override
    public CreateGuildResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateGuildResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateGuildResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateGuildResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.hall.guild.CreateGuildResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
