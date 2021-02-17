// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HallLoginMessage.proto

package info.xiaomo.server.shared.protocol.hall.login;

/**
 * Protobuf type {@code LoginResponse}
 */
public final class LoginResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LoginResponse)
    LoginResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoginResponse.newBuilder() to construct.
  private LoginResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoginResponse() {
    mid_ = 10002;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LoginResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LoginResponse(
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
            isOk_ = input.readBool();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            uid_ = input.readInt64();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            rid_ = input.readInt64();
            break;
          }
          case 40: {
            bitField0_ |= 0x00000010;
            sessionId_ = input.readInt64();
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
    return info.xiaomo.server.shared.protocol.hall.login.HallLoginMessage.internal_static_LoginResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.hall.login.HallLoginMessage.internal_static_LoginResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.hall.login.LoginResponse.class, info.xiaomo.server.shared.protocol.hall.login.LoginResponse.Builder.class);
  }

  private int bitField0_;
  public static final int MID_FIELD_NUMBER = 1;
  private int mid_;
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = LoginRes];</code>
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
   * <code>optional .MID mid = 1 [default = LoginRes];</code>
   * @return The mid.
   */
  @java.lang.Override public info.xiaomo.server.shared.protocol.Mid.MID getMid() {
    @SuppressWarnings("deprecation")
    info.xiaomo.server.shared.protocol.Mid.MID result = info.xiaomo.server.shared.protocol.Mid.MID.valueOf(mid_);
    return result == null ? info.xiaomo.server.shared.protocol.Mid.MID.LoginRes : result;
  }

  public static final int ISOK_FIELD_NUMBER = 2;
  private boolean isOk_;
  /**
   * <pre>
   *请求是否发送成功
   * </pre>
   *
   * <code>optional bool isOk = 2;</code>
   * @return Whether the isOk field is set.
   */
  @java.lang.Override
  public boolean hasIsOk() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   *请求是否发送成功
   * </pre>
   *
   * <code>optional bool isOk = 2;</code>
   * @return The isOk.
   */
  @java.lang.Override
  public boolean getIsOk() {
    return isOk_;
  }

  public static final int UID_FIELD_NUMBER = 3;
  private long uid_;
  /**
   * <pre>
   *用户id
   * </pre>
   *
   * <code>optional int64 uid = 3;</code>
   * @return Whether the uid field is set.
   */
  @java.lang.Override
  public boolean hasUid() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   *用户id
   * </pre>
   *
   * <code>optional int64 uid = 3;</code>
   * @return The uid.
   */
  @java.lang.Override
  public long getUid() {
    return uid_;
  }

  public static final int RID_FIELD_NUMBER = 4;
  private long rid_;
  /**
   * <pre>
   *角色ID
   * </pre>
   *
   * <code>optional int64 rid = 4;</code>
   * @return Whether the rid field is set.
   */
  @java.lang.Override
  public boolean hasRid() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   *角色ID
   * </pre>
   *
   * <code>optional int64 rid = 4;</code>
   * @return The rid.
   */
  @java.lang.Override
  public long getRid() {
    return rid_;
  }

  public static final int SESSIONID_FIELD_NUMBER = 5;
  private long sessionId_;
  /**
   * <pre>
   *会话ID
   * </pre>
   *
   * <code>optional int64 sessionId = 5;</code>
   * @return Whether the sessionId field is set.
   */
  @java.lang.Override
  public boolean hasSessionId() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <pre>
   *会话ID
   * </pre>
   *
   * <code>optional int64 sessionId = 5;</code>
   * @return The sessionId.
   */
  @java.lang.Override
  public long getSessionId() {
    return sessionId_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeEnum(1, mid_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeBool(2, isOk_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt64(3, uid_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt64(4, rid_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      output.writeInt64(5, sessionId_);
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
        .computeBoolSize(2, isOk_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, uid_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, rid_);
    }
    if (((bitField0_ & 0x00000010) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, sessionId_);
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
    if (!(obj instanceof info.xiaomo.server.shared.protocol.hall.login.LoginResponse)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.hall.login.LoginResponse other = (info.xiaomo.server.shared.protocol.hall.login.LoginResponse) obj;

    if (hasMid() != other.hasMid()) return false;
    if (hasMid()) {
      if (mid_ != other.mid_) return false;
    }
    if (hasIsOk() != other.hasIsOk()) return false;
    if (hasIsOk()) {
      if (getIsOk()
          != other.getIsOk()) return false;
    }
    if (hasUid() != other.hasUid()) return false;
    if (hasUid()) {
      if (getUid()
          != other.getUid()) return false;
    }
    if (hasRid() != other.hasRid()) return false;
    if (hasRid()) {
      if (getRid()
          != other.getRid()) return false;
    }
    if (hasSessionId() != other.hasSessionId()) return false;
    if (hasSessionId()) {
      if (getSessionId()
          != other.getSessionId()) return false;
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
    if (hasIsOk()) {
      hash = (37 * hash) + ISOK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOk());
    }
    if (hasUid()) {
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getUid());
    }
    if (hasRid()) {
      hash = (37 * hash) + RID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getRid());
    }
    if (hasSessionId()) {
      hash = (37 * hash) + SESSIONID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSessionId());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.hall.login.LoginResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.login.LoginResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.login.LoginResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.login.LoginResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.login.LoginResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.hall.login.LoginResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.login.LoginResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.login.LoginResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.login.LoginResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.login.LoginResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.hall.login.LoginResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.hall.login.LoginResponse parseFrom(
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
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.hall.login.LoginResponse prototype) {
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
   * Protobuf type {@code LoginResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LoginResponse)
      info.xiaomo.server.shared.protocol.hall.login.LoginResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.hall.login.HallLoginMessage.internal_static_LoginResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.hall.login.HallLoginMessage.internal_static_LoginResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.hall.login.LoginResponse.class, info.xiaomo.server.shared.protocol.hall.login.LoginResponse.Builder.class);
    }

    // Construct using info.xiaomo.server.shared.protocol.hall.login.LoginResponse.newBuilder()
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
      mid_ = 10002;
      bitField0_ = (bitField0_ & ~0x00000001);
      isOk_ = false;
      bitField0_ = (bitField0_ & ~0x00000002);
      uid_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      rid_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000008);
      sessionId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.hall.login.HallLoginMessage.internal_static_LoginResponse_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.login.LoginResponse getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.hall.login.LoginResponse.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.login.LoginResponse build() {
      info.xiaomo.server.shared.protocol.hall.login.LoginResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.hall.login.LoginResponse buildPartial() {
      info.xiaomo.server.shared.protocol.hall.login.LoginResponse result = new info.xiaomo.server.shared.protocol.hall.login.LoginResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.mid_ = mid_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.isOk_ = isOk_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.uid_ = uid_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.rid_ = rid_;
        to_bitField0_ |= 0x00000008;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.sessionId_ = sessionId_;
        to_bitField0_ |= 0x00000010;
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
      if (other instanceof info.xiaomo.server.shared.protocol.hall.login.LoginResponse) {
        return mergeFrom((info.xiaomo.server.shared.protocol.hall.login.LoginResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.hall.login.LoginResponse other) {
      if (other == info.xiaomo.server.shared.protocol.hall.login.LoginResponse.getDefaultInstance()) return this;
      if (other.hasMid()) {
        setMid(other.getMid());
      }
      if (other.hasIsOk()) {
        setIsOk(other.getIsOk());
      }
      if (other.hasUid()) {
        setUid(other.getUid());
      }
      if (other.hasRid()) {
        setRid(other.getRid());
      }
      if (other.hasSessionId()) {
        setSessionId(other.getSessionId());
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
      info.xiaomo.server.shared.protocol.hall.login.LoginResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.hall.login.LoginResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int mid_ = 10002;
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>optional .MID mid = 1 [default = LoginRes];</code>
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
     * <code>optional .MID mid = 1 [default = LoginRes];</code>
     * @return The mid.
     */
    @java.lang.Override
    public info.xiaomo.server.shared.protocol.Mid.MID getMid() {
      @SuppressWarnings("deprecation")
      info.xiaomo.server.shared.protocol.Mid.MID result = info.xiaomo.server.shared.protocol.Mid.MID.valueOf(mid_);
      return result == null ? info.xiaomo.server.shared.protocol.Mid.MID.LoginRes : result;
    }
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>optional .MID mid = 1 [default = LoginRes];</code>
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
     * <code>optional .MID mid = 1 [default = LoginRes];</code>
     * @return This builder for chaining.
     */
    public Builder clearMid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mid_ = 10002;
      onChanged();
      return this;
    }

    private boolean isOk_ ;
    /**
     * <pre>
     *请求是否发送成功
     * </pre>
     *
     * <code>optional bool isOk = 2;</code>
     * @return Whether the isOk field is set.
     */
    @java.lang.Override
    public boolean hasIsOk() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     *请求是否发送成功
     * </pre>
     *
     * <code>optional bool isOk = 2;</code>
     * @return The isOk.
     */
    @java.lang.Override
    public boolean getIsOk() {
      return isOk_;
    }
    /**
     * <pre>
     *请求是否发送成功
     * </pre>
     *
     * <code>optional bool isOk = 2;</code>
     * @param value The isOk to set.
     * @return This builder for chaining.
     */
    public Builder setIsOk(boolean value) {
      bitField0_ |= 0x00000002;
      isOk_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *请求是否发送成功
     * </pre>
     *
     * <code>optional bool isOk = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsOk() {
      bitField0_ = (bitField0_ & ~0x00000002);
      isOk_ = false;
      onChanged();
      return this;
    }

    private long uid_ ;
    /**
     * <pre>
     *用户id
     * </pre>
     *
     * <code>optional int64 uid = 3;</code>
     * @return Whether the uid field is set.
     */
    @java.lang.Override
    public boolean hasUid() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     *用户id
     * </pre>
     *
     * <code>optional int64 uid = 3;</code>
     * @return The uid.
     */
    @java.lang.Override
    public long getUid() {
      return uid_;
    }
    /**
     * <pre>
     *用户id
     * </pre>
     *
     * <code>optional int64 uid = 3;</code>
     * @param value The uid to set.
     * @return This builder for chaining.
     */
    public Builder setUid(long value) {
      bitField0_ |= 0x00000004;
      uid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *用户id
     * </pre>
     *
     * <code>optional int64 uid = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUid() {
      bitField0_ = (bitField0_ & ~0x00000004);
      uid_ = 0L;
      onChanged();
      return this;
    }

    private long rid_ ;
    /**
     * <pre>
     *角色ID
     * </pre>
     *
     * <code>optional int64 rid = 4;</code>
     * @return Whether the rid field is set.
     */
    @java.lang.Override
    public boolean hasRid() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     *角色ID
     * </pre>
     *
     * <code>optional int64 rid = 4;</code>
     * @return The rid.
     */
    @java.lang.Override
    public long getRid() {
      return rid_;
    }
    /**
     * <pre>
     *角色ID
     * </pre>
     *
     * <code>optional int64 rid = 4;</code>
     * @param value The rid to set.
     * @return This builder for chaining.
     */
    public Builder setRid(long value) {
      bitField0_ |= 0x00000008;
      rid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *角色ID
     * </pre>
     *
     * <code>optional int64 rid = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRid() {
      bitField0_ = (bitField0_ & ~0x00000008);
      rid_ = 0L;
      onChanged();
      return this;
    }

    private long sessionId_ ;
    /**
     * <pre>
     *会话ID
     * </pre>
     *
     * <code>optional int64 sessionId = 5;</code>
     * @return Whether the sessionId field is set.
     */
    @java.lang.Override
    public boolean hasSessionId() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     *会话ID
     * </pre>
     *
     * <code>optional int64 sessionId = 5;</code>
     * @return The sessionId.
     */
    @java.lang.Override
    public long getSessionId() {
      return sessionId_;
    }
    /**
     * <pre>
     *会话ID
     * </pre>
     *
     * <code>optional int64 sessionId = 5;</code>
     * @param value The sessionId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionId(long value) {
      bitField0_ |= 0x00000010;
      sessionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *会话ID
     * </pre>
     *
     * <code>optional int64 sessionId = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionId() {
      bitField0_ = (bitField0_ & ~0x00000010);
      sessionId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:LoginResponse)
  }

  // @@protoc_insertion_point(class_scope:LoginResponse)
  private static final info.xiaomo.server.shared.protocol.hall.login.LoginResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.hall.login.LoginResponse();
  }

  public static info.xiaomo.server.shared.protocol.hall.login.LoginResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<LoginResponse>
      PARSER = new com.google.protobuf.AbstractParser<LoginResponse>() {
    @java.lang.Override
    public LoginResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LoginResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LoginResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoginResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.hall.login.LoginResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
