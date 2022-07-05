// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: elide/data/data.proto

package tools.elide.data;

/**
 * <pre>
 * Stores a generic cryptographic fingerprint of some arbitrary data. This is a utility record, which simply gathers the
 * specification of a hash algorithm with a raw data field storing the result of the hash.
 * </pre>
 *
 * Protobuf type {@code data.DataFingerprint}
 */
public final class DataFingerprint extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.DataFingerprint)
    DataFingerprintOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DataFingerprint.newBuilder() to construct.
  private DataFingerprint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DataFingerprint() {
    hash_ = 0;
    salt_ = com.google.protobuf.ByteString.EMPTY;
    fingerprint_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DataFingerprint();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DataFingerprint(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            hash_ = rawValue;
            break;
          }
          case 18: {

            salt_ = input.readBytes();
            break;
          }
          case 26: {

            fingerprint_ = input.readBytes();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return tools.elide.data.Data.internal_static_data_DataFingerprint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tools.elide.data.Data.internal_static_data_DataFingerprint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tools.elide.data.DataFingerprint.class, tools.elide.data.DataFingerprint.Builder.class);
  }

  public static final int HASH_FIELD_NUMBER = 1;
  private int hash_;
  /**
   * <pre>
   * Algorithm in use when fingerprinting the associated data.
   * </pre>
   *
   * <code>.crypto.HashAlgorithm hash = 1;</code>
   * @return The enum numeric value on the wire for hash.
   */
  @java.lang.Override public int getHashValue() {
    return hash_;
  }
  /**
   * <pre>
   * Algorithm in use when fingerprinting the associated data.
   * </pre>
   *
   * <code>.crypto.HashAlgorithm hash = 1;</code>
   * @return The hash.
   */
  @java.lang.Override public tools.elide.crypto.HashAlgorithm getHash() {
    @SuppressWarnings("deprecation")
    tools.elide.crypto.HashAlgorithm result = tools.elide.crypto.HashAlgorithm.valueOf(hash_);
    return result == null ? tools.elide.crypto.HashAlgorithm.UNRECOGNIZED : result;
  }

  public static final int SALT_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString salt_;
  /**
   * <pre>
   * Salt value used when fingerprinting the associated data, if applicable. Generally appended to the end of the data
   * to be fingerprinted.
   * </pre>
   *
   * <code>bytes salt = 2;</code>
   * @return The salt.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSalt() {
    return salt_;
  }

  public static final int FINGERPRINT_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString fingerprint_;
  /**
   * <pre>
   * Content of the fingerprint/checksum calculated as part of this data fingerprint.
   * </pre>
   *
   * <code>bytes fingerprint = 3;</code>
   * @return The fingerprint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFingerprint() {
    return fingerprint_;
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
    if (hash_ != tools.elide.crypto.HashAlgorithm.IDENTITY.getNumber()) {
      output.writeEnum(1, hash_);
    }
    if (!salt_.isEmpty()) {
      output.writeBytes(2, salt_);
    }
    if (!fingerprint_.isEmpty()) {
      output.writeBytes(3, fingerprint_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hash_ != tools.elide.crypto.HashAlgorithm.IDENTITY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, hash_);
    }
    if (!salt_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, salt_);
    }
    if (!fingerprint_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, fingerprint_);
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
    if (!(obj instanceof tools.elide.data.DataFingerprint)) {
      return super.equals(obj);
    }
    tools.elide.data.DataFingerprint other = (tools.elide.data.DataFingerprint) obj;

    if (hash_ != other.hash_) return false;
    if (!getSalt()
        .equals(other.getSalt())) return false;
    if (!getFingerprint()
        .equals(other.getFingerprint())) return false;
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
    hash = (37 * hash) + HASH_FIELD_NUMBER;
    hash = (53 * hash) + hash_;
    hash = (37 * hash) + SALT_FIELD_NUMBER;
    hash = (53 * hash) + getSalt().hashCode();
    hash = (37 * hash) + FINGERPRINT_FIELD_NUMBER;
    hash = (53 * hash) + getFingerprint().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tools.elide.data.DataFingerprint parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tools.elide.data.DataFingerprint parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tools.elide.data.DataFingerprint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tools.elide.data.DataFingerprint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tools.elide.data.DataFingerprint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tools.elide.data.DataFingerprint parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tools.elide.data.DataFingerprint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tools.elide.data.DataFingerprint parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tools.elide.data.DataFingerprint parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tools.elide.data.DataFingerprint parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tools.elide.data.DataFingerprint parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tools.elide.data.DataFingerprint parseFrom(
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
  public static Builder newBuilder(tools.elide.data.DataFingerprint prototype) {
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
   * Stores a generic cryptographic fingerprint of some arbitrary data. This is a utility record, which simply gathers the
   * specification of a hash algorithm with a raw data field storing the result of the hash.
   * </pre>
   *
   * Protobuf type {@code data.DataFingerprint}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.DataFingerprint)
      tools.elide.data.DataFingerprintOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tools.elide.data.Data.internal_static_data_DataFingerprint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tools.elide.data.Data.internal_static_data_DataFingerprint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tools.elide.data.DataFingerprint.class, tools.elide.data.DataFingerprint.Builder.class);
    }

    // Construct using tools.elide.data.DataFingerprint.newBuilder()
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
      hash_ = 0;

      salt_ = com.google.protobuf.ByteString.EMPTY;

      fingerprint_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tools.elide.data.Data.internal_static_data_DataFingerprint_descriptor;
    }

    @java.lang.Override
    public tools.elide.data.DataFingerprint getDefaultInstanceForType() {
      return tools.elide.data.DataFingerprint.getDefaultInstance();
    }

    @java.lang.Override
    public tools.elide.data.DataFingerprint build() {
      tools.elide.data.DataFingerprint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tools.elide.data.DataFingerprint buildPartial() {
      tools.elide.data.DataFingerprint result = new tools.elide.data.DataFingerprint(this);
      result.hash_ = hash_;
      result.salt_ = salt_;
      result.fingerprint_ = fingerprint_;
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
      if (other instanceof tools.elide.data.DataFingerprint) {
        return mergeFrom((tools.elide.data.DataFingerprint)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tools.elide.data.DataFingerprint other) {
      if (other == tools.elide.data.DataFingerprint.getDefaultInstance()) return this;
      if (other.hash_ != 0) {
        setHashValue(other.getHashValue());
      }
      if (other.getSalt() != com.google.protobuf.ByteString.EMPTY) {
        setSalt(other.getSalt());
      }
      if (other.getFingerprint() != com.google.protobuf.ByteString.EMPTY) {
        setFingerprint(other.getFingerprint());
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
      tools.elide.data.DataFingerprint parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (tools.elide.data.DataFingerprint) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int hash_ = 0;
    /**
     * <pre>
     * Algorithm in use when fingerprinting the associated data.
     * </pre>
     *
     * <code>.crypto.HashAlgorithm hash = 1;</code>
     * @return The enum numeric value on the wire for hash.
     */
    @java.lang.Override public int getHashValue() {
      return hash_;
    }
    /**
     * <pre>
     * Algorithm in use when fingerprinting the associated data.
     * </pre>
     *
     * <code>.crypto.HashAlgorithm hash = 1;</code>
     * @param value The enum numeric value on the wire for hash to set.
     * @return This builder for chaining.
     */
    public Builder setHashValue(int value) {
      
      hash_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Algorithm in use when fingerprinting the associated data.
     * </pre>
     *
     * <code>.crypto.HashAlgorithm hash = 1;</code>
     * @return The hash.
     */
    @java.lang.Override
    public tools.elide.crypto.HashAlgorithm getHash() {
      @SuppressWarnings("deprecation")
      tools.elide.crypto.HashAlgorithm result = tools.elide.crypto.HashAlgorithm.valueOf(hash_);
      return result == null ? tools.elide.crypto.HashAlgorithm.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Algorithm in use when fingerprinting the associated data.
     * </pre>
     *
     * <code>.crypto.HashAlgorithm hash = 1;</code>
     * @param value The hash to set.
     * @return This builder for chaining.
     */
    public Builder setHash(tools.elide.crypto.HashAlgorithm value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      hash_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Algorithm in use when fingerprinting the associated data.
     * </pre>
     *
     * <code>.crypto.HashAlgorithm hash = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHash() {
      
      hash_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString salt_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Salt value used when fingerprinting the associated data, if applicable. Generally appended to the end of the data
     * to be fingerprinted.
     * </pre>
     *
     * <code>bytes salt = 2;</code>
     * @return The salt.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSalt() {
      return salt_;
    }
    /**
     * <pre>
     * Salt value used when fingerprinting the associated data, if applicable. Generally appended to the end of the data
     * to be fingerprinted.
     * </pre>
     *
     * <code>bytes salt = 2;</code>
     * @param value The salt to set.
     * @return This builder for chaining.
     */
    public Builder setSalt(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      salt_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Salt value used when fingerprinting the associated data, if applicable. Generally appended to the end of the data
     * to be fingerprinted.
     * </pre>
     *
     * <code>bytes salt = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSalt() {
      
      salt_ = getDefaultInstance().getSalt();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString fingerprint_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Content of the fingerprint/checksum calculated as part of this data fingerprint.
     * </pre>
     *
     * <code>bytes fingerprint = 3;</code>
     * @return The fingerprint.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getFingerprint() {
      return fingerprint_;
    }
    /**
     * <pre>
     * Content of the fingerprint/checksum calculated as part of this data fingerprint.
     * </pre>
     *
     * <code>bytes fingerprint = 3;</code>
     * @param value The fingerprint to set.
     * @return This builder for chaining.
     */
    public Builder setFingerprint(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fingerprint_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Content of the fingerprint/checksum calculated as part of this data fingerprint.
     * </pre>
     *
     * <code>bytes fingerprint = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFingerprint() {
      
      fingerprint_ = getDefaultInstance().getFingerprint();
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


    // @@protoc_insertion_point(builder_scope:data.DataFingerprint)
  }

  // @@protoc_insertion_point(class_scope:data.DataFingerprint)
  private static final tools.elide.data.DataFingerprint DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tools.elide.data.DataFingerprint();
  }

  public static tools.elide.data.DataFingerprint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataFingerprint>
      PARSER = new com.google.protobuf.AbstractParser<DataFingerprint>() {
    @java.lang.Override
    public DataFingerprint parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DataFingerprint(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DataFingerprint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataFingerprint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tools.elide.data.DataFingerprint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
