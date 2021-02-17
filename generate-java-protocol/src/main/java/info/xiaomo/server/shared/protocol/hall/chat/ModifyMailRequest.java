// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HallChatMessage.proto

package info.xiaomo.server.shared.protocol.hall.chat;

/**
 * <pre>
 *修改邮件状态
 * </pre>
 *
 * Protobuf type {@code ModifyMailRequest}
 */
public final class ModifyMailRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ModifyMailRequest)
    ModifyMailRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModifyMailRequest.newBuilder() to construct.
  private ModifyMailRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModifyMailRequest() {
    mid_ = 10023;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ModifyMailRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ModifyMailRequest(
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
            mailId_ = input.readInt64();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            state_ = input.readInt32();
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
    return info.xiaomo.server.shared.protocol.hall.chat.HallChatMessage.internal_static_ModifyMailRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.hall.chat.HallChatMessage.internal_static_ModifyMailRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest.class, info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest.Builder.class);
  }

  private int bitField0_;
  public static final int MID_FIELD_NUMBER = 1;
  private int mid_;
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = ModifyMailReq];</code>
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
   * <code>optional .MID mid = 1 [default = ModifyMailReq];</code>
   * @return The mid.
   */
  @java.lang.Override public info.xiaomo.server.shared.protocol.Mid.MID getMid() {
    @SuppressWarnings("deprecation")
    info.xiaomo.server.shared.protocol.Mid.MID result = info.xiaomo.server.shared.protocol.Mid.MID.valueOf(mid_);
    return result == null ? info.xiaomo.server.shared.protocol.Mid.MID.ModifyMailReq : result;
  }

  public static final int MAILID_FIELD_NUMBER = 2;
  private long mailId_;
  /**
   * <pre>
   *邮件ID
   * </pre>
   *
   * <code>required int64 mailId = 2;</code>
   * @return Whether the mailId field is set.
   */
  @java.lang.Override
  public boolean hasMailId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   *邮件ID
   * </pre>
   *
   * <code>required int64 mailId = 2;</code>
   * @return The mailId.
   */
  @java.lang.Override
  public long getMailId() {
    return mailId_;
  }

  public static final int STATE_FIELD_NUMBER = 3;
  private int state_;
  /**
   * <pre>
   *状态 0新邮件、1已读、2已领取道具、3删除
   * </pre>
   *
   * <code>required int32 state = 3;</code>
   * @return Whether the state field is set.
   */
  @java.lang.Override
  public boolean hasState() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   *状态 0新邮件、1已读、2已领取道具、3删除
   * </pre>
   *
   * <code>required int32 state = 3;</code>
   * @return The state.
   */
  @java.lang.Override
  public int getState() {
    return state_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasMailId()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasState()) {
      memoizedIsInitialized = 0;
      return false;
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
      output.writeInt64(2, mailId_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt32(3, state_);
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
        .computeInt64Size(2, mailId_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, state_);
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
    if (!(obj instanceof info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest other = (info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest) obj;

    if (hasMid() != other.hasMid()) return false;
    if (hasMid()) {
      if (mid_ != other.mid_) return false;
    }
    if (hasMailId() != other.hasMailId()) return false;
    if (hasMailId()) {
      if (getMailId()
          != other.getMailId()) return false;
    }
    if (hasState() != other.hasState()) return false;
    if (hasState()) {
      if (getState()
          != other.getState()) return false;
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
    if (hasMailId()) {
      hash = (37 * hash) + MAILID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMailId());
    }
    if (hasState()) {
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest parseFrom(
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
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest prototype) {
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
   *修改邮件状态
   * </pre>
   *
   * Protobuf type {@code ModifyMailRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ModifyMailRequest)
      info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.hall.chat.HallChatMessage.internal_static_ModifyMailRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.hall.chat.HallChatMessage.internal_static_ModifyMailRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest.class, info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest.Builder.class);
    }

    // Construct using info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      mid_ = 10023;
      bitField0_ = (bitField0_ & ~0x00000001);
      mailId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      state_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.hall.chat.HallChatMessage.internal_static_ModifyMailRequest_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest build() {
      info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest buildPartial() {
      info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest result = new info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.mid_ = mid_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.mailId_ = mailId_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.state_ = state_;
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
      if (other instanceof info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest) {
        return mergeFrom((info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest other) {
      if (other == info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest.getDefaultInstance()) return this;
      if (other.hasMid()) {
        setMid(other.getMid());
      }
      if (other.hasMailId()) {
        setMailId(other.getMailId());
      }
      if (other.hasState()) {
        setState(other.getState());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      if (!hasMailId()) {
        return false;
      }
      if (!hasState()) {
        return false;
      }
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int mid_ = 10023;
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>optional .MID mid = 1 [default = ModifyMailReq];</code>
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
     * <code>optional .MID mid = 1 [default = ModifyMailReq];</code>
     * @return The mid.
     */
    @java.lang.Override
    public info.xiaomo.server.shared.protocol.Mid.MID getMid() {
      @SuppressWarnings("deprecation")
      info.xiaomo.server.shared.protocol.Mid.MID result = info.xiaomo.server.shared.protocol.Mid.MID.valueOf(mid_);
      return result == null ? info.xiaomo.server.shared.protocol.Mid.MID.ModifyMailReq : result;
    }
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>optional .MID mid = 1 [default = ModifyMailReq];</code>
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
     * <code>optional .MID mid = 1 [default = ModifyMailReq];</code>
     * @return This builder for chaining.
     */
    public Builder clearMid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mid_ = 10023;
      onChanged();
      return this;
    }

    private long mailId_ ;
    /**
     * <pre>
     *邮件ID
     * </pre>
     *
     * <code>required int64 mailId = 2;</code>
     * @return Whether the mailId field is set.
     */
    @java.lang.Override
    public boolean hasMailId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     *邮件ID
     * </pre>
     *
     * <code>required int64 mailId = 2;</code>
     * @return The mailId.
     */
    @java.lang.Override
    public long getMailId() {
      return mailId_;
    }
    /**
     * <pre>
     *邮件ID
     * </pre>
     *
     * <code>required int64 mailId = 2;</code>
     * @param value The mailId to set.
     * @return This builder for chaining.
     */
    public Builder setMailId(long value) {
      bitField0_ |= 0x00000002;
      mailId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *邮件ID
     * </pre>
     *
     * <code>required int64 mailId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMailId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      mailId_ = 0L;
      onChanged();
      return this;
    }

    private int state_ ;
    /**
     * <pre>
     *状态 0新邮件、1已读、2已领取道具、3删除
     * </pre>
     *
     * <code>required int32 state = 3;</code>
     * @return Whether the state field is set.
     */
    @java.lang.Override
    public boolean hasState() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     *状态 0新邮件、1已读、2已领取道具、3删除
     * </pre>
     *
     * <code>required int32 state = 3;</code>
     * @return The state.
     */
    @java.lang.Override
    public int getState() {
      return state_;
    }
    /**
     * <pre>
     *状态 0新邮件、1已读、2已领取道具、3删除
     * </pre>
     *
     * <code>required int32 state = 3;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(int value) {
      bitField0_ |= 0x00000004;
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *状态 0新邮件、1已读、2已领取道具、3删除
     * </pre>
     *
     * <code>required int32 state = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000004);
      state_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:ModifyMailRequest)
  }

  // @@protoc_insertion_point(class_scope:ModifyMailRequest)
  private static final info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest();
  }

  public static info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<ModifyMailRequest>
      PARSER = new com.google.protobuf.AbstractParser<ModifyMailRequest>() {
    @java.lang.Override
    public ModifyMailRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ModifyMailRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ModifyMailRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModifyMailRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.hall.chat.ModifyMailRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
