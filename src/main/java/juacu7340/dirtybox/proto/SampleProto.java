// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: juacu7340/dirtybox/proto/Sample.proto
// Protobuf Java Version: 4.29.2

package juacu7340.dirtybox.proto;

public final class SampleProto {
  private SampleProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      SampleProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SampleOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Sample)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string data = 1;</code>
     * @return The data.
     */
    java.lang.String getData();
    /**
     * <code>string data = 1;</code>
     * @return The bytes for data.
     */
    com.google.protobuf.ByteString
        getDataBytes();
  }
  /**
   * Protobuf type {@code Sample}
   */
  public static final class Sample extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Sample)
      SampleOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 2,
        /* suffix= */ "",
        Sample.class.getName());
    }
    // Use Sample.newBuilder() to construct.
    private Sample(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private Sample() {
      data_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return juacu7340.dirtybox.proto.SampleProto.internal_static_Sample_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return juacu7340.dirtybox.proto.SampleProto.internal_static_Sample_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              juacu7340.dirtybox.proto.SampleProto.Sample.class, juacu7340.dirtybox.proto.SampleProto.Sample.Builder.class);
    }

    public static final int DATA_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object data_ = "";
    /**
     * <code>string data = 1;</code>
     * @return The data.
     */
    @java.lang.Override
    public java.lang.String getData() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        data_ = s;
        return s;
      }
    }
    /**
     * <code>string data = 1;</code>
     * @return The bytes for data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDataBytes() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(data_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, data_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(data_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, data_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof juacu7340.dirtybox.proto.SampleProto.Sample)) {
        return super.equals(obj);
      }
      juacu7340.dirtybox.proto.SampleProto.Sample other = (juacu7340.dirtybox.proto.SampleProto.Sample) obj;

      if (!getData()
          .equals(other.getData())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static juacu7340.dirtybox.proto.SampleProto.Sample parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static juacu7340.dirtybox.proto.SampleProto.Sample parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static juacu7340.dirtybox.proto.SampleProto.Sample parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static juacu7340.dirtybox.proto.SampleProto.Sample parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static juacu7340.dirtybox.proto.SampleProto.Sample parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static juacu7340.dirtybox.proto.SampleProto.Sample parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static juacu7340.dirtybox.proto.SampleProto.Sample parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static juacu7340.dirtybox.proto.SampleProto.Sample parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static juacu7340.dirtybox.proto.SampleProto.Sample parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static juacu7340.dirtybox.proto.SampleProto.Sample parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static juacu7340.dirtybox.proto.SampleProto.Sample parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static juacu7340.dirtybox.proto.SampleProto.Sample parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(juacu7340.dirtybox.proto.SampleProto.Sample prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Sample}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Sample)
        juacu7340.dirtybox.proto.SampleProto.SampleOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return juacu7340.dirtybox.proto.SampleProto.internal_static_Sample_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return juacu7340.dirtybox.proto.SampleProto.internal_static_Sample_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                juacu7340.dirtybox.proto.SampleProto.Sample.class, juacu7340.dirtybox.proto.SampleProto.Sample.Builder.class);
      }

      // Construct using juacu7340.dirtybox.proto.SampleProto.Sample.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        data_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return juacu7340.dirtybox.proto.SampleProto.internal_static_Sample_descriptor;
      }

      @java.lang.Override
      public juacu7340.dirtybox.proto.SampleProto.Sample getDefaultInstanceForType() {
        return juacu7340.dirtybox.proto.SampleProto.Sample.getDefaultInstance();
      }

      @java.lang.Override
      public juacu7340.dirtybox.proto.SampleProto.Sample build() {
        juacu7340.dirtybox.proto.SampleProto.Sample result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public juacu7340.dirtybox.proto.SampleProto.Sample buildPartial() {
        juacu7340.dirtybox.proto.SampleProto.Sample result = new juacu7340.dirtybox.proto.SampleProto.Sample(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(juacu7340.dirtybox.proto.SampleProto.Sample result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.data_ = data_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof juacu7340.dirtybox.proto.SampleProto.Sample) {
          return mergeFrom((juacu7340.dirtybox.proto.SampleProto.Sample)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(juacu7340.dirtybox.proto.SampleProto.Sample other) {
        if (other == juacu7340.dirtybox.proto.SampleProto.Sample.getDefaultInstance()) return this;
        if (!other.getData().isEmpty()) {
          data_ = other.data_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                data_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object data_ = "";
      /**
       * <code>string data = 1;</code>
       * @return The data.
       */
      public java.lang.String getData() {
        java.lang.Object ref = data_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          data_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string data = 1;</code>
       * @return The bytes for data.
       */
      public com.google.protobuf.ByteString
          getDataBytes() {
        java.lang.Object ref = data_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          data_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string data = 1;</code>
       * @param value The data to set.
       * @return This builder for chaining.
       */
      public Builder setData(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        data_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string data = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearData() {
        data_ = getDefaultInstance().getData();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string data = 1;</code>
       * @param value The bytes for data to set.
       * @return This builder for chaining.
       */
      public Builder setDataBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        data_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Sample)
    }

    // @@protoc_insertion_point(class_scope:Sample)
    private static final juacu7340.dirtybox.proto.SampleProto.Sample DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new juacu7340.dirtybox.proto.SampleProto.Sample();
    }

    public static juacu7340.dirtybox.proto.SampleProto.Sample getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Sample>
        PARSER = new com.google.protobuf.AbstractParser<Sample>() {
      @java.lang.Override
      public Sample parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Sample> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Sample> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public juacu7340.dirtybox.proto.SampleProto.Sample getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Sample_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Sample_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%juacu7340/dirtybox/proto/Sample.proto\"" +
      "\026\n\006Sample\022\014\n\004data\030\001 \001(\tB\'\n\030juacu7340.dir" +
      "tybox.protoB\013SampleProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Sample_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Sample_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Sample_descriptor,
        new java.lang.String[] { "Data", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
