// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessageId.proto

package info.xiaomo.server.shared.protocol.msg;

/**
 * Protobuf enum {@code GMMsgId}
 */
public enum GMMsgId
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <code>CloseServerRequest = 1;</code>
   */
  CloseServerRequest(1),
  /**
   * <code>CloseServerResponse = 2;</code>
   */
  CloseServerResponse(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <code>CloseServerRequest = 1;</code>
   */
  public static final int CloseServerRequest_VALUE = 1;
  /**
   * <code>CloseServerResponse = 2;</code>
   */
  public static final int CloseServerResponse_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static GMMsgId valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GMMsgId forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return CloseServerRequest;
      case 2: return CloseServerResponse;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GMMsgId>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GMMsgId> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GMMsgId>() {
          public GMMsgId findValueByNumber(int number) {
            return GMMsgId.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return info.xiaomo.server.shared.protocol.msg.MessageId.getDescriptor().getEnumTypes().get(0);
  }

  private static final GMMsgId[] VALUES = values();

  public static GMMsgId valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private GMMsgId(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:GMMsgId)
}

