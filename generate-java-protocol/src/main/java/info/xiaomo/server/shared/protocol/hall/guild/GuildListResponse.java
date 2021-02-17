// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HallGuildMessage.proto

package info.xiaomo.server.shared.protocol.hall.guild;

/**
 * <pre>
 *帮会列表，加入时的申请列表
 * </pre>
 *
 * Protobuf type {@code GuildListResponse}
 */
public final class GuildListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GuildListResponse)
    GuildListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GuildListResponse.newBuilder() to construct.
  private GuildListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GuildListResponse() {
    mid_ = 10028;
    guilds_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GuildListResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GuildListResponse(
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
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              guilds_ = new java.util.ArrayList<info.xiaomo.server.shared.protocol.hall.guild.GuildInfo>();
              mutable_bitField0_ |= 0x00000002;
            }
            guilds_.add(
                input.readMessage(info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.PARSER, extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        guilds_ = java.util.Collections.unmodifiableList(guilds_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse.class, info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse.Builder.class);
  }

  private int bitField0_;
  public static final int MID_FIELD_NUMBER = 1;
  private int mid_;
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = GuildListRes];</code>
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
   * <code>optional .MID mid = 1 [default = GuildListRes];</code>
   * @return The mid.
   */
  @java.lang.Override public info.xiaomo.server.shared.protocol.Mid.MID getMid() {
    @SuppressWarnings("deprecation")
    info.xiaomo.server.shared.protocol.Mid.MID result = info.xiaomo.server.shared.protocol.Mid.MID.valueOf(mid_);
    return result == null ? info.xiaomo.server.shared.protocol.Mid.MID.GuildListRes : result;
  }

  public static final int GUILDS_FIELD_NUMBER = 2;
  private java.util.List<info.xiaomo.server.shared.protocol.hall.guild.GuildInfo> guilds_;
  /**
   * <pre>
   *帮会列表，不传人员
   * </pre>
   *
   * <code>repeated .GuildInfo guilds = 2;</code>
   */
  @java.lang.Override
  public java.util.List<info.xiaomo.server.shared.protocol.hall.guild.GuildInfo> getGuildsList() {
    return guilds_;
  }
  /**
   * <pre>
   *帮会列表，不传人员
   * </pre>
   *
   * <code>repeated .GuildInfo guilds = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends info.xiaomo.server.shared.protocol.hall.guild.GuildInfoOrBuilder> 
      getGuildsOrBuilderList() {
    return guilds_;
  }
  /**
   * <pre>
   *帮会列表，不传人员
   * </pre>
   *
   * <code>repeated .GuildInfo guilds = 2;</code>
   */
  @java.lang.Override
  public int getGuildsCount() {
    return guilds_.size();
  }
  /**
   * <pre>
   *帮会列表，不传人员
   * </pre>
   *
   * <code>repeated .GuildInfo guilds = 2;</code>
   */
  @java.lang.Override
  public info.xiaomo.server.shared.protocol.hall.guild.GuildInfo getGuilds(int index) {
    return guilds_.get(index);
  }
  /**
   * <pre>
   *帮会列表，不传人员
   * </pre>
   *
   * <code>repeated .GuildInfo guilds = 2;</code>
   */
  @java.lang.Override
  public info.xiaomo.server.shared.protocol.hall.guild.GuildInfoOrBuilder getGuildsOrBuilder(
      int index) {
    return guilds_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    for (int i = 0; i < getGuildsCount(); i++) {
      if (!getGuilds(i).isInitialized()) {
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
    for (int i = 0; i < guilds_.size(); i++) {
      output.writeMessage(2, guilds_.get(i));
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
    for (int i = 0; i < guilds_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, guilds_.get(i));
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
    if (!(obj instanceof info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse other = (info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse) obj;

    if (hasMid() != other.hasMid()) return false;
    if (hasMid()) {
      if (mid_ != other.mid_) return false;
    }
    if (!getGuildsList()
        .equals(other.getGuildsList())) return false;
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
    if (getGuildsCount() > 0) {
      hash = (37 * hash) + GUILDS_FIELD_NUMBER;
      hash = (53 * hash) + getGuildsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse parseFrom(
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
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse prototype) {
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
   *帮会列表，加入时的申请列表
   * </pre>
   *
   * Protobuf type {@code GuildListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GuildListResponse)
      info.xiaomo.server.shared.protocol.hall.guild.GuildListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse.class, info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse.Builder.class);
    }

    // Construct using info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse.newBuilder()
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
        getGuildsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      mid_ = 10028;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (guildsBuilder_ == null) {
        guilds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        guildsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.hall.guild.HallGuildMessage.internal_static_GuildListResponse_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse build() {
      info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse buildPartial() {
      info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse result = new info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.mid_ = mid_;
      if (guildsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          guilds_ = java.util.Collections.unmodifiableList(guilds_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.guilds_ = guilds_;
      } else {
        result.guilds_ = guildsBuilder_.build();
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
      if (other instanceof info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse) {
        return mergeFrom((info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse other) {
      if (other == info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse.getDefaultInstance()) return this;
      if (other.hasMid()) {
        setMid(other.getMid());
      }
      if (guildsBuilder_ == null) {
        if (!other.guilds_.isEmpty()) {
          if (guilds_.isEmpty()) {
            guilds_ = other.guilds_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureGuildsIsMutable();
            guilds_.addAll(other.guilds_);
          }
          onChanged();
        }
      } else {
        if (!other.guilds_.isEmpty()) {
          if (guildsBuilder_.isEmpty()) {
            guildsBuilder_.dispose();
            guildsBuilder_ = null;
            guilds_ = other.guilds_;
            bitField0_ = (bitField0_ & ~0x00000002);
            guildsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGuildsFieldBuilder() : null;
          } else {
            guildsBuilder_.addAllMessages(other.guilds_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      for (int i = 0; i < getGuildsCount(); i++) {
        if (!getGuilds(i).isInitialized()) {
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
      info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int mid_ = 10028;
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>optional .MID mid = 1 [default = GuildListRes];</code>
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
     * <code>optional .MID mid = 1 [default = GuildListRes];</code>
     * @return The mid.
     */
    @java.lang.Override
    public info.xiaomo.server.shared.protocol.Mid.MID getMid() {
      @SuppressWarnings("deprecation")
      info.xiaomo.server.shared.protocol.Mid.MID result = info.xiaomo.server.shared.protocol.Mid.MID.valueOf(mid_);
      return result == null ? info.xiaomo.server.shared.protocol.Mid.MID.GuildListRes : result;
    }
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>optional .MID mid = 1 [default = GuildListRes];</code>
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
     * <code>optional .MID mid = 1 [default = GuildListRes];</code>
     * @return This builder for chaining.
     */
    public Builder clearMid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mid_ = 10028;
      onChanged();
      return this;
    }

    private java.util.List<info.xiaomo.server.shared.protocol.hall.guild.GuildInfo> guilds_ =
      java.util.Collections.emptyList();
    private void ensureGuildsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        guilds_ = new java.util.ArrayList<info.xiaomo.server.shared.protocol.hall.guild.GuildInfo>(guilds_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        info.xiaomo.server.shared.protocol.hall.guild.GuildInfo, info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder, info.xiaomo.server.shared.protocol.hall.guild.GuildInfoOrBuilder> guildsBuilder_;

    /**
     * <pre>
     *帮会列表，不传人员
     * </pre>
     *
     * <code>repeated .GuildInfo guilds = 2;</code>
     */
    public java.util.List<info.xiaomo.server.shared.protocol.hall.guild.GuildInfo> getGuildsList() {
      if (guildsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(guilds_);
      } else {
        return guildsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *帮会列表，不传人员
     * </pre>
     *
     * <code>repeated .GuildInfo guilds = 2;</code>
     */
    public int getGuildsCount() {
      if (guildsBuilder_ == null) {
        return guilds_.size();
      } else {
        return guildsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *帮会列表，不传人员
     * </pre>
     *
     * <code>repeated .GuildInfo guilds = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.hall.guild.GuildInfo getGuilds(int index) {
      if (guildsBuilder_ == null) {
        return guilds_.get(index);
      } else {
        return guildsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *帮会列表，不传人员
     * </pre>
     *
     * <code>repeated .GuildInfo guilds = 2;</code>
     */
    public Builder setGuilds(
        int index, info.xiaomo.server.shared.protocol.hall.guild.GuildInfo value) {
      if (guildsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGuildsIsMutable();
        guilds_.set(index, value);
        onChanged();
      } else {
        guildsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *帮会列表，不传人员
     * </pre>
     *
     * <code>repeated .GuildInfo guilds = 2;</code>
     */
    public Builder setGuilds(
        int index, info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder builderForValue) {
      if (guildsBuilder_ == null) {
        ensureGuildsIsMutable();
        guilds_.set(index, builderForValue.build());
        onChanged();
      } else {
        guildsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *帮会列表，不传人员
     * </pre>
     *
     * <code>repeated .GuildInfo guilds = 2;</code>
     */
    public Builder addGuilds(info.xiaomo.server.shared.protocol.hall.guild.GuildInfo value) {
      if (guildsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGuildsIsMutable();
        guilds_.add(value);
        onChanged();
      } else {
        guildsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *帮会列表，不传人员
     * </pre>
     *
     * <code>repeated .GuildInfo guilds = 2;</code>
     */
    public Builder addGuilds(
        int index, info.xiaomo.server.shared.protocol.hall.guild.GuildInfo value) {
      if (guildsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGuildsIsMutable();
        guilds_.add(index, value);
        onChanged();
      } else {
        guildsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *帮会列表，不传人员
     * </pre>
     *
     * <code>repeated .GuildInfo guilds = 2;</code>
     */
    public Builder addGuilds(
        info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder builderForValue) {
      if (guildsBuilder_ == null) {
        ensureGuildsIsMutable();
        guilds_.add(builderForValue.build());
        onChanged();
      } else {
        guildsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *帮会列表，不传人员
     * </pre>
     *
     * <code>repeated .GuildInfo guilds = 2;</code>
     */
    public Builder addGuilds(
        int index, info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder builderForValue) {
      if (guildsBuilder_ == null) {
        ensureGuildsIsMutable();
        guilds_.add(index, builderForValue.build());
        onChanged();
      } else {
        guildsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *帮会列表，不传人员
     * </pre>
     *
     * <code>repeated .GuildInfo guilds = 2;</code>
     */
    public Builder addAllGuilds(
        java.lang.Iterable<? extends info.xiaomo.server.shared.protocol.hall.guild.GuildInfo> values) {
      if (guildsBuilder_ == null) {
        ensureGuildsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, guilds_);
        onChanged();
      } else {
        guildsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *帮会列表，不传人员
     * </pre>
     *
     * <code>repeated .GuildInfo guilds = 2;</code>
     */
    public Builder clearGuilds() {
      if (guildsBuilder_ == null) {
        guilds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        guildsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *帮会列表，不传人员
     * </pre>
     *
     * <code>repeated .GuildInfo guilds = 2;</code>
     */
    public Builder removeGuilds(int index) {
      if (guildsBuilder_ == null) {
        ensureGuildsIsMutable();
        guilds_.remove(index);
        onChanged();
      } else {
        guildsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *帮会列表，不传人员
     * </pre>
     *
     * <code>repeated .GuildInfo guilds = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder getGuildsBuilder(
        int index) {
      return getGuildsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *帮会列表，不传人员
     * </pre>
     *
     * <code>repeated .GuildInfo guilds = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.hall.guild.GuildInfoOrBuilder getGuildsOrBuilder(
        int index) {
      if (guildsBuilder_ == null) {
        return guilds_.get(index);  } else {
        return guildsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *帮会列表，不传人员
     * </pre>
     *
     * <code>repeated .GuildInfo guilds = 2;</code>
     */
    public java.util.List<? extends info.xiaomo.server.shared.protocol.hall.guild.GuildInfoOrBuilder> 
         getGuildsOrBuilderList() {
      if (guildsBuilder_ != null) {
        return guildsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(guilds_);
      }
    }
    /**
     * <pre>
     *帮会列表，不传人员
     * </pre>
     *
     * <code>repeated .GuildInfo guilds = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder addGuildsBuilder() {
      return getGuildsFieldBuilder().addBuilder(
          info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.getDefaultInstance());
    }
    /**
     * <pre>
     *帮会列表，不传人员
     * </pre>
     *
     * <code>repeated .GuildInfo guilds = 2;</code>
     */
    public info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder addGuildsBuilder(
        int index) {
      return getGuildsFieldBuilder().addBuilder(
          index, info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.getDefaultInstance());
    }
    /**
     * <pre>
     *帮会列表，不传人员
     * </pre>
     *
     * <code>repeated .GuildInfo guilds = 2;</code>
     */
    public java.util.List<info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder> 
         getGuildsBuilderList() {
      return getGuildsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        info.xiaomo.server.shared.protocol.hall.guild.GuildInfo, info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder, info.xiaomo.server.shared.protocol.hall.guild.GuildInfoOrBuilder> 
        getGuildsFieldBuilder() {
      if (guildsBuilder_ == null) {
        guildsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            info.xiaomo.server.shared.protocol.hall.guild.GuildInfo, info.xiaomo.server.shared.protocol.hall.guild.GuildInfo.Builder, info.xiaomo.server.shared.protocol.hall.guild.GuildInfoOrBuilder>(
                guilds_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        guilds_ = null;
      }
      return guildsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:GuildListResponse)
  }

  // @@protoc_insertion_point(class_scope:GuildListResponse)
  private static final info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse();
  }

  public static info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GuildListResponse>
      PARSER = new com.google.protobuf.AbstractParser<GuildListResponse>() {
    @java.lang.Override
    public GuildListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GuildListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GuildListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GuildListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.hall.guild.GuildListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
