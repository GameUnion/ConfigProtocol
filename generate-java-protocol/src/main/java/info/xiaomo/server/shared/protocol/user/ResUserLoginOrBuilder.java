// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserMessage.proto

package info.xiaomo.server.shared.protocol.user;

public interface ResUserLoginOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ResUserLogin)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.UserMsgId msgId = 1;</code>
   * @return The enum numeric value on the wire for msgId.
   */
  int getMsgIdValue();
  /**
   * <code>.UserMsgId msgId = 1;</code>
   * @return The msgId.
   */
  info.xiaomo.server.shared.protocol.msg.UserMsgId getMsgId();

  /**
   * <code>int32 sex = 2;</code>
   * @return The sex.
   */
  int getSex();

  /**
   * <code>int64 userId = 3;</code>
   * @return The userId.
   */
  long getUserId();

  /**
   * <code>string loginName = 4;</code>
   * @return The loginName.
   */
  java.lang.String getLoginName();
  /**
   * <code>string loginName = 4;</code>
   * @return The bytes for loginName.
   */
  com.google.protobuf.ByteString
      getLoginNameBytes();
}
