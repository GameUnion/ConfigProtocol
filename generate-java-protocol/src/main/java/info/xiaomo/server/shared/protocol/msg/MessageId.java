// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessageId.proto

package info.xiaomo.server.shared.protocol.msg;

public final class MessageId {
  private MessageId() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017MessageId.proto*G\n\007GMMsgId\022\013\n\007UNKNOWN\020" +
      "\000\022\026\n\022CloseServerRequest\020\001\022\027\n\023CloseServer" +
      "Response\020\002*?\n\tUserMsgId\022\t\n\005KNOWN\020\000\022\022\n\014Lo" +
      "ginRequest\020\241\234\001\022\023\n\rLoginResponse\020\242\234\001B*\n&i" +
      "nfo.xiaomo.server.shared.protocol.msgP\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
