// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: elide/meta/app.proto

package tools.elide.meta;

public final class App {
  private App() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_EndpointOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_EndpointOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_Endpoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_Endpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_BuildInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_BuildInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_AppInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_AppInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_AppInfo_EndpointsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_AppInfo_EndpointsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_meta_AppManifest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_meta_AppManifest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024elide/meta/app.proto\022\004meta\032\037google/pro" +
      "tobuf/timestamp.proto\":\n\017EndpointOptions" +
      "\022\020\n\010stateful\030\001 \001(\010\022\025\n\rprecompilable\030\002 \001(" +
      "\010\"\362\001\n\010Endpoint\022\013\n\003tag\030\001 \001(\t\022\021\n\004name\030\002 \001(" +
      "\tH\000\210\001\001\022 \n\004type\030\003 \001(\0162\022.meta.EndpointType" +
      "\022\014\n\004base\030\004 \001(\t\022\021\n\004tail\030\005 \001(\tH\001\210\001\001\022\020\n\010con" +
      "sumes\030\006 \003(\t\022\020\n\010produces\030\007 \003(\t\022%\n\006method\030" +
      "\010 \003(\0162\025.meta.EndpointMethods\022&\n\007options\030" +
      "\t \001(\0132\025.meta.EndpointOptionsB\007\n\005_nameB\007\n" +
      "\005_tail\"6\n\tBuildInfo\022)\n\005stamp\030\001 \001(\0132\032.goo" +
      "gle.protobuf.Timestamp\"\251\001\n\007AppInfo\022\017\n\007ve" +
      "rsion\030\001 \001(\t\022\021\n\004name\030\002 \001(\tH\000\210\001\001\022/\n\tendpoi" +
      "nts\030\003 \003(\0132\034.meta.AppInfo.EndpointsEntry\032" +
      "@\n\016EndpointsEntry\022\013\n\003key\030\001 \001(\t\022\035\n\005value\030" +
      "\002 \001(\0132\016.meta.Endpoint:\0028\001B\007\n\005_name\"I\n\013Ap" +
      "pManifest\022\032\n\003app\030\001 \001(\0132\r.meta.AppInfo\022\036\n" +
      "\005build\030\002 \001(\0132\017.meta.BuildInfo*K\n\014Endpoin" +
      "tType\022\035\n\031ENDPOINT_TYPE_UNSPECIFIED\020\000\022\010\n\004" +
      "PAGE\020\001\022\t\n\005ASSET\020\002\022\007\n\003API\020\003*D\n\017EndpointMe" +
      "thods\022\007\n\003GET\020\000\022\010\n\004POST\020\001\022\007\n\003PUT\020\002\022\t\n\005PAT" +
      "CH\020\003\022\n\n\006DELETE\020\005BX\n\020tools.elide.metaH\001P\001" +
      "\330\001\001\370\001\001\242\002\003ELD\252\002\nElide.Meta\272\002\005Elide\302\002\003ELD\312" +
      "\002\nElide\\Meta\352\002\013Elide::Metab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_meta_EndpointOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_meta_EndpointOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_EndpointOptions_descriptor,
        new java.lang.String[] { "Stateful", "Precompilable", });
    internal_static_meta_Endpoint_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_meta_Endpoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_Endpoint_descriptor,
        new java.lang.String[] { "Tag", "Name", "Type", "Base", "Tail", "Consumes", "Produces", "Method", "Options", "Name", "Tail", });
    internal_static_meta_BuildInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_meta_BuildInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_BuildInfo_descriptor,
        new java.lang.String[] { "Stamp", });
    internal_static_meta_AppInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_meta_AppInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_AppInfo_descriptor,
        new java.lang.String[] { "Version", "Name", "Endpoints", "Name", });
    internal_static_meta_AppInfo_EndpointsEntry_descriptor =
      internal_static_meta_AppInfo_descriptor.getNestedTypes().get(0);
    internal_static_meta_AppInfo_EndpointsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_AppInfo_EndpointsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_meta_AppManifest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_meta_AppManifest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_meta_AppManifest_descriptor,
        new java.lang.String[] { "App", "Build", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
