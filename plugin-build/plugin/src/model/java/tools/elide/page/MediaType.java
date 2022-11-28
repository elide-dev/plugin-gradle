// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: elide/page/media.proto

package tools.elide.page;

/**
 * <pre>
 * Defines broad types of media that may be expressed.
 * </pre>
 *
 * Protobuf enum {@code page.MediaType}
 */
public enum MediaType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * This media is an image asset of some kind.
   * </pre>
   *
   * <code>IMAGE = 0;</code>
   */
  IMAGE(0),
  /**
   * <pre>
   * This media is a video asset of some kind.
   * </pre>
   *
   * <code>VIDEO = 1;</code>
   */
  VIDEO(1),
  /**
   * <pre>
   * This media is an audio asset of some kind.
   * </pre>
   *
   * <code>AUDIO = 2;</code>
   */
  AUDIO(2),
  /**
   * <pre>
   * The media is a link to another asset or page of some kind.
   * </pre>
   *
   * <code>LINK = 3;</code>
   */
  LINK(3),
  /**
   * <pre>
   * The media is an arbitrary kind of digital document.
   * </pre>
   *
   * <code>DOCUMENT = 4;</code>
   */
  DOCUMENT(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * This media is an image asset of some kind.
   * </pre>
   *
   * <code>IMAGE = 0;</code>
   */
  public static final int IMAGE_VALUE = 0;
  /**
   * <pre>
   * This media is a video asset of some kind.
   * </pre>
   *
   * <code>VIDEO = 1;</code>
   */
  public static final int VIDEO_VALUE = 1;
  /**
   * <pre>
   * This media is an audio asset of some kind.
   * </pre>
   *
   * <code>AUDIO = 2;</code>
   */
  public static final int AUDIO_VALUE = 2;
  /**
   * <pre>
   * The media is a link to another asset or page of some kind.
   * </pre>
   *
   * <code>LINK = 3;</code>
   */
  public static final int LINK_VALUE = 3;
  /**
   * <pre>
   * The media is an arbitrary kind of digital document.
   * </pre>
   *
   * <code>DOCUMENT = 4;</code>
   */
  public static final int DOCUMENT_VALUE = 4;


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
  public static MediaType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MediaType forNumber(int value) {
    switch (value) {
      case 0: return IMAGE;
      case 1: return VIDEO;
      case 2: return AUDIO;
      case 3: return LINK;
      case 4: return DOCUMENT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MediaType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MediaType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MediaType>() {
          public MediaType findValueByNumber(int number) {
            return MediaType.forNumber(number);
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
    return tools.elide.page.WebMedia.getDescriptor().getEnumTypes().get(1);
  }

  private static final MediaType[] VALUES = values();

  public static MediaType valueOf(
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

  private MediaType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:page.MediaType)
}
