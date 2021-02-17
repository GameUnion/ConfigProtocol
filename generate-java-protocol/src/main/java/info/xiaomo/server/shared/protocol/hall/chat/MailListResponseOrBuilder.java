// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HallChatMessage.proto

package info.xiaomo.server.shared.protocol.hall.chat;

public interface MailListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MailListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = MailListRes];</code>
   * @return Whether the mid field is set.
   */
  boolean hasMid();
  /**
   * <pre>
   *消息id
   * </pre>
   *
   * <code>optional .MID mid = 1 [default = MailListRes];</code>
   * @return The mid.
   */
  info.xiaomo.server.shared.protocol.Mid.MID getMid();

  /**
   * <pre>
   *邮件列表
   * </pre>
   *
   * <code>repeated .MailInfo mails = 2;</code>
   */
  java.util.List<info.xiaomo.server.shared.protocol.hall.chat.MailInfo> 
      getMailsList();
  /**
   * <pre>
   *邮件列表
   * </pre>
   *
   * <code>repeated .MailInfo mails = 2;</code>
   */
  info.xiaomo.server.shared.protocol.hall.chat.MailInfo getMails(int index);
  /**
   * <pre>
   *邮件列表
   * </pre>
   *
   * <code>repeated .MailInfo mails = 2;</code>
   */
  int getMailsCount();
  /**
   * <pre>
   *邮件列表
   * </pre>
   *
   * <code>repeated .MailInfo mails = 2;</code>
   */
  java.util.List<? extends info.xiaomo.server.shared.protocol.hall.chat.MailInfoOrBuilder> 
      getMailsOrBuilderList();
  /**
   * <pre>
   *邮件列表
   * </pre>
   *
   * <code>repeated .MailInfo mails = 2;</code>
   */
  info.xiaomo.server.shared.protocol.hall.chat.MailInfoOrBuilder getMailsOrBuilder(
      int index);
}