// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BydrFightMessage.proto

package info.xiaomo.server.shared.protocol.gameserver.fight;

/**
 * <pre>
 *伤害结果
 * </pre>
 *
 * Protobuf type {@code FireResultRequest}
 */
public final class FireResultRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FireResultRequest)
    FireResultRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FireResultRequest.newBuilder() to construct.
  private FireResultRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FireResultRequest() {
    mid_ = 20017;
    targetFishId_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FireResultRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FireResultRequest(
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
          case 24: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              targetFishId_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            targetFishId_.addLong(input.readInt64());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              targetFishId_ = newLongList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              targetFishId_.addLong(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 32: {
            bitField0_ |= 0x00000002;
            multiple_ = input.readInt32();
            break;
          }
          case 40: {
            bitField0_ |= 0x00000004;
            specialFishId_ = input.readInt64();
            break;
          }
          case 48: {
            bitField0_ |= 0x00000008;
            fireGold_ = input.readInt32();
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
        targetFishId_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return info.xiaomo.server.shared.protocol.gameserver.fight.BydrFightMessage.internal_static_FireResultRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return info.xiaomo.server.shared.protocol.gameserver.fight.BydrFightMessage.internal_static_FireResultRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest.class, info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest.Builder.class);
  }

  private int bitField0_;
  public static final int MID_FIELD_NUMBER = 1;
  private int mid_;
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = FireResultReq];</code>
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
   * <code>optional .MID mid = 1 [default = FireResultReq];</code>
   * @return The mid.
   */
  @java.lang.Override public info.xiaomo.server.shared.protocol.Mid.MID getMid() {
    @SuppressWarnings("deprecation")
    info.xiaomo.server.shared.protocol.Mid.MID result = info.xiaomo.server.shared.protocol.Mid.MID.valueOf(mid_);
    return result == null ? info.xiaomo.server.shared.protocol.Mid.MID.FireResultReq : result;
  }

  public static final int TARGETFISHID_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.LongList targetFishId_;
  /**
   * <pre>
   *击中目标鱼ID
   * </pre>
   *
   * <code>repeated int64 targetFishId = 3;</code>
   * @return A list containing the targetFishId.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getTargetFishIdList() {
    return targetFishId_;
  }
  /**
   * <pre>
   *击中目标鱼ID
   * </pre>
   *
   * <code>repeated int64 targetFishId = 3;</code>
   * @return The count of targetFishId.
   */
  public int getTargetFishIdCount() {
    return targetFishId_.size();
  }
  /**
   * <pre>
   *击中目标鱼ID
   * </pre>
   *
   * <code>repeated int64 targetFishId = 3;</code>
   * @param index The index of the element to return.
   * @return The targetFishId at the given index.
   */
  public long getTargetFishId(int index) {
    return targetFishId_.getLong(index);
  }

  public static final int MULTIPLE_FIELD_NUMBER = 4;
  private int multiple_;
  /**
   * <pre>
   *特殊鱼计算的倍数 0普通鱼
   * </pre>
   *
   * <code>optional int32 multiple = 4;</code>
   * @return Whether the multiple field is set.
   */
  @java.lang.Override
  public boolean hasMultiple() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   *特殊鱼计算的倍数 0普通鱼
   * </pre>
   *
   * <code>optional int32 multiple = 4;</code>
   * @return The multiple.
   */
  @java.lang.Override
  public int getMultiple() {
    return multiple_;
  }

  public static final int SPECIALFISHID_FIELD_NUMBER = 5;
  private long specialFishId_;
  /**
   * <pre>
   *特殊鱼ID
   * </pre>
   *
   * <code>optional int64 specialFishId = 5;</code>
   * @return Whether the specialFishId field is set.
   */
  @java.lang.Override
  public boolean hasSpecialFishId() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   *特殊鱼ID
   * </pre>
   *
   * <code>optional int64 specialFishId = 5;</code>
   * @return The specialFishId.
   */
  @java.lang.Override
  public long getSpecialFishId() {
    return specialFishId_;
  }

  public static final int FIREGOLD_FIELD_NUMBER = 6;
  private int fireGold_;
  /**
   * <pre>
   *开炮金币
   * </pre>
   *
   * <code>optional int32 fireGold = 6;</code>
   * @return Whether the fireGold field is set.
   */
  @java.lang.Override
  public boolean hasFireGold() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <pre>
   *开炮金币
   * </pre>
   *
   * <code>optional int32 fireGold = 6;</code>
   * @return The fireGold.
   */
  @java.lang.Override
  public int getFireGold() {
    return fireGold_;
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
    for (int i = 0; i < targetFishId_.size(); i++) {
      output.writeInt64(3, targetFishId_.getLong(i));
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(4, multiple_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt64(5, specialFishId_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeInt32(6, fireGold_);
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
    {
      int dataSize = 0;
      for (int i = 0; i < targetFishId_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(targetFishId_.getLong(i));
      }
      size += dataSize;
      size += 1 * getTargetFishIdList().size();
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, multiple_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, specialFishId_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, fireGold_);
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
    if (!(obj instanceof info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest)) {
      return super.equals(obj);
    }
    info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest other = (info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest) obj;

    if (hasMid() != other.hasMid()) return false;
    if (hasMid()) {
      if (mid_ != other.mid_) return false;
    }
    if (!getTargetFishIdList()
        .equals(other.getTargetFishIdList())) return false;
    if (hasMultiple() != other.hasMultiple()) return false;
    if (hasMultiple()) {
      if (getMultiple()
          != other.getMultiple()) return false;
    }
    if (hasSpecialFishId() != other.hasSpecialFishId()) return false;
    if (hasSpecialFishId()) {
      if (getSpecialFishId()
          != other.getSpecialFishId()) return false;
    }
    if (hasFireGold() != other.hasFireGold()) return false;
    if (hasFireGold()) {
      if (getFireGold()
          != other.getFireGold()) return false;
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
    if (getTargetFishIdCount() > 0) {
      hash = (37 * hash) + TARGETFISHID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetFishIdList().hashCode();
    }
    if (hasMultiple()) {
      hash = (37 * hash) + MULTIPLE_FIELD_NUMBER;
      hash = (53 * hash) + getMultiple();
    }
    if (hasSpecialFishId()) {
      hash = (37 * hash) + SPECIALFISHID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSpecialFishId());
    }
    if (hasFireGold()) {
      hash = (37 * hash) + FIREGOLD_FIELD_NUMBER;
      hash = (53 * hash) + getFireGold();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest parseFrom(
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
  public static Builder newBuilder(info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest prototype) {
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
   *伤害结果
   * </pre>
   *
   * Protobuf type {@code FireResultRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FireResultRequest)
      info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return info.xiaomo.server.shared.protocol.gameserver.fight.BydrFightMessage.internal_static_FireResultRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return info.xiaomo.server.shared.protocol.gameserver.fight.BydrFightMessage.internal_static_FireResultRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest.class, info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest.Builder.class);
    }

    // Construct using info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest.newBuilder()
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
      mid_ = 20017;
      bitField0_ = (bitField0_ & ~0x00000001);
      targetFishId_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      multiple_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      specialFishId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000008);
      fireGold_ = 0;
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return info.xiaomo.server.shared.protocol.gameserver.fight.BydrFightMessage.internal_static_FireResultRequest_descriptor;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest getDefaultInstanceForType() {
      return info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest.getDefaultInstance();
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest build() {
      info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest buildPartial() {
      info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest result = new info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.mid_ = mid_;
      if (((bitField0_ & 0x00000002) != 0)) {
        targetFishId_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.targetFishId_ = targetFishId_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.multiple_ = multiple_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.specialFishId_ = specialFishId_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.fireGold_ = fireGold_;
        to_bitField0_ |= 0x00000008;
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
      if (other instanceof info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest) {
        return mergeFrom((info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest other) {
      if (other == info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest.getDefaultInstance()) return this;
      if (other.hasMid()) {
        setMid(other.getMid());
      }
      if (!other.targetFishId_.isEmpty()) {
        if (targetFishId_.isEmpty()) {
          targetFishId_ = other.targetFishId_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureTargetFishIdIsMutable();
          targetFishId_.addAll(other.targetFishId_);
        }
        onChanged();
      }
      if (other.hasMultiple()) {
        setMultiple(other.getMultiple());
      }
      if (other.hasSpecialFishId()) {
        setSpecialFishId(other.getSpecialFishId());
      }
      if (other.hasFireGold()) {
        setFireGold(other.getFireGold());
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
      info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int mid_ = 20017;
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>optional .MID mid = 1 [default = FireResultReq];</code>
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
     * <code>optional .MID mid = 1 [default = FireResultReq];</code>
     * @return The mid.
     */
    @java.lang.Override
    public info.xiaomo.server.shared.protocol.Mid.MID getMid() {
      @SuppressWarnings("deprecation")
      info.xiaomo.server.shared.protocol.Mid.MID result = info.xiaomo.server.shared.protocol.Mid.MID.valueOf(mid_);
      return result == null ? info.xiaomo.server.shared.protocol.Mid.MID.FireResultReq : result;
    }
    /**
     * <pre>
     *消息id
     * </pre>
     *
     * <code>optional .MID mid = 1 [default = FireResultReq];</code>
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
     * <code>optional .MID mid = 1 [default = FireResultReq];</code>
     * @return This builder for chaining.
     */
    public Builder clearMid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mid_ = 20017;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList targetFishId_ = emptyLongList();
    private void ensureTargetFishIdIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        targetFishId_ = mutableCopy(targetFishId_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     *击中目标鱼ID
     * </pre>
     *
     * <code>repeated int64 targetFishId = 3;</code>
     * @return A list containing the targetFishId.
     */
    public java.util.List<java.lang.Long>
        getTargetFishIdList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(targetFishId_) : targetFishId_;
    }
    /**
     * <pre>
     *击中目标鱼ID
     * </pre>
     *
     * <code>repeated int64 targetFishId = 3;</code>
     * @return The count of targetFishId.
     */
    public int getTargetFishIdCount() {
      return targetFishId_.size();
    }
    /**
     * <pre>
     *击中目标鱼ID
     * </pre>
     *
     * <code>repeated int64 targetFishId = 3;</code>
     * @param index The index of the element to return.
     * @return The targetFishId at the given index.
     */
    public long getTargetFishId(int index) {
      return targetFishId_.getLong(index);
    }
    /**
     * <pre>
     *击中目标鱼ID
     * </pre>
     *
     * <code>repeated int64 targetFishId = 3;</code>
     * @param index The index to set the value at.
     * @param value The targetFishId to set.
     * @return This builder for chaining.
     */
    public Builder setTargetFishId(
        int index, long value) {
      ensureTargetFishIdIsMutable();
      targetFishId_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *击中目标鱼ID
     * </pre>
     *
     * <code>repeated int64 targetFishId = 3;</code>
     * @param value The targetFishId to add.
     * @return This builder for chaining.
     */
    public Builder addTargetFishId(long value) {
      ensureTargetFishIdIsMutable();
      targetFishId_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *击中目标鱼ID
     * </pre>
     *
     * <code>repeated int64 targetFishId = 3;</code>
     * @param values The targetFishId to add.
     * @return This builder for chaining.
     */
    public Builder addAllTargetFishId(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureTargetFishIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, targetFishId_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *击中目标鱼ID
     * </pre>
     *
     * <code>repeated int64 targetFishId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTargetFishId() {
      targetFishId_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private int multiple_ ;
    /**
     * <pre>
     *特殊鱼计算的倍数 0普通鱼
     * </pre>
     *
     * <code>optional int32 multiple = 4;</code>
     * @return Whether the multiple field is set.
     */
    @java.lang.Override
    public boolean hasMultiple() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     *特殊鱼计算的倍数 0普通鱼
     * </pre>
     *
     * <code>optional int32 multiple = 4;</code>
     * @return The multiple.
     */
    @java.lang.Override
    public int getMultiple() {
      return multiple_;
    }
    /**
     * <pre>
     *特殊鱼计算的倍数 0普通鱼
     * </pre>
     *
     * <code>optional int32 multiple = 4;</code>
     * @param value The multiple to set.
     * @return This builder for chaining.
     */
    public Builder setMultiple(int value) {
      bitField0_ |= 0x00000004;
      multiple_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *特殊鱼计算的倍数 0普通鱼
     * </pre>
     *
     * <code>optional int32 multiple = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMultiple() {
      bitField0_ = (bitField0_ & ~0x00000004);
      multiple_ = 0;
      onChanged();
      return this;
    }

    private long specialFishId_ ;
    /**
     * <pre>
     *特殊鱼ID
     * </pre>
     *
     * <code>optional int64 specialFishId = 5;</code>
     * @return Whether the specialFishId field is set.
     */
    @java.lang.Override
    public boolean hasSpecialFishId() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     *特殊鱼ID
     * </pre>
     *
     * <code>optional int64 specialFishId = 5;</code>
     * @return The specialFishId.
     */
    @java.lang.Override
    public long getSpecialFishId() {
      return specialFishId_;
    }
    /**
     * <pre>
     *特殊鱼ID
     * </pre>
     *
     * <code>optional int64 specialFishId = 5;</code>
     * @param value The specialFishId to set.
     * @return This builder for chaining.
     */
    public Builder setSpecialFishId(long value) {
      bitField0_ |= 0x00000008;
      specialFishId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *特殊鱼ID
     * </pre>
     *
     * <code>optional int64 specialFishId = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpecialFishId() {
      bitField0_ = (bitField0_ & ~0x00000008);
      specialFishId_ = 0L;
      onChanged();
      return this;
    }

    private int fireGold_ ;
    /**
     * <pre>
     *开炮金币
     * </pre>
     *
     * <code>optional int32 fireGold = 6;</code>
     * @return Whether the fireGold field is set.
     */
    @java.lang.Override
    public boolean hasFireGold() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     *开炮金币
     * </pre>
     *
     * <code>optional int32 fireGold = 6;</code>
     * @return The fireGold.
     */
    @java.lang.Override
    public int getFireGold() {
      return fireGold_;
    }
    /**
     * <pre>
     *开炮金币
     * </pre>
     *
     * <code>optional int32 fireGold = 6;</code>
     * @param value The fireGold to set.
     * @return This builder for chaining.
     */
    public Builder setFireGold(int value) {
      bitField0_ |= 0x00000010;
      fireGold_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *开炮金币
     * </pre>
     *
     * <code>optional int32 fireGold = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearFireGold() {
      bitField0_ = (bitField0_ & ~0x00000010);
      fireGold_ = 0;
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


    // @@protoc_insertion_point(builder_scope:FireResultRequest)
  }

  // @@protoc_insertion_point(class_scope:FireResultRequest)
  private static final info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest();
  }

  public static info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<FireResultRequest>
      PARSER = new com.google.protobuf.AbstractParser<FireResultRequest>() {
    @java.lang.Override
    public FireResultRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FireResultRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FireResultRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FireResultRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public info.xiaomo.server.shared.protocol.gameserver.fight.FireResultRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
