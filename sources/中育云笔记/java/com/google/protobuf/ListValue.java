package com.google.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.RuntimeVersion;
import com.google.protobuf.Value;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class ListValue extends GeneratedMessage implements ListValueOrBuilder {
    private static final ListValue DEFAULT_INSTANCE;
    private static final Parser<ListValue> PARSER;
    public static final int VALUES_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    private List<Value> values_;

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 1, "", ListValue.class.getName());
        DEFAULT_INSTANCE = new ListValue();
        PARSER = new AbstractParser<ListValue>() { // from class: com.google.protobuf.ListValue.1
            @Override // com.google.protobuf.Parser
            public ListValue parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ListValue.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
    }

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return StructProto.internal_static_google_protobuf_ListValue_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) {
        return (ListValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<ListValue> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListValue)) {
            return super.equals(obj);
        }
        ListValue listValue = (ListValue) obj;
        return getValuesList().equals(listValue.getValuesList()) && getUnknownFields().equals(listValue.getUnknownFields());
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<ListValue> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeMessageSize = 0;
        for (int i11 = 0; i11 < this.values_.size(); i11++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.values_.get(i11));
        }
        int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.ListValueOrBuilder
    public Value getValues(int i10) {
        return this.values_.get(i10);
    }

    @Override // com.google.protobuf.ListValueOrBuilder
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // com.google.protobuf.ListValueOrBuilder
    public List<Value> getValuesList() {
        return this.values_;
    }

    @Override // com.google.protobuf.ListValueOrBuilder
    public ValueOrBuilder getValuesOrBuilder(int i10) {
        return this.values_.get(i10);
    }

    @Override // com.google.protobuf.ListValueOrBuilder
    public List<? extends ValueOrBuilder> getValuesOrBuilderList() {
        return this.values_;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getValuesCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getValuesList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return StructProto.internal_static_google_protobuf_ListValue_fieldAccessorTable.ensureFieldAccessorsInitialized(ListValue.class, Builder.class);
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.memoizedIsInitialized;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i10 = 0; i10 < this.values_.size(); i10++) {
            codedOutputStream.writeMessage(1, this.values_.get(i10));
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessage.Builder<Builder> implements ListValueOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilder<Value, Value.Builder, ValueOrBuilder> valuesBuilder_;
        private List<Value> values_;

        private void buildPartial0(ListValue listValue) {
        }

        private void buildPartialRepeatedFields(ListValue listValue) {
            RepeatedFieldBuilder<Value, Value.Builder, ValueOrBuilder> repeatedFieldBuilder = this.valuesBuilder_;
            if (repeatedFieldBuilder != null) {
                listValue.values_ = repeatedFieldBuilder.build();
                return;
            }
            if ((this.bitField0_ & 1) != 0) {
                this.values_ = Collections.unmodifiableList(this.values_);
                this.bitField0_ &= -2;
            }
            listValue.values_ = this.values_;
        }

        private void ensureValuesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.values_ = new ArrayList(this.values_);
                this.bitField0_ |= 1;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return StructProto.internal_static_google_protobuf_ListValue_descriptor;
        }

        private RepeatedFieldBuilder<Value, Value.Builder, ValueOrBuilder> internalGetValuesFieldBuilder() {
            if (this.valuesBuilder_ == null) {
                this.valuesBuilder_ = new RepeatedFieldBuilder<>(this.values_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.values_ = null;
            }
            return this.valuesBuilder_;
        }

        public Builder addAllValues(Iterable<? extends Value> iterable) {
            RepeatedFieldBuilder<Value, Value.Builder, ValueOrBuilder> repeatedFieldBuilder = this.valuesBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.addAllMessages(iterable);
                return this;
            }
            ensureValuesIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.values_);
            onChanged();
            return this;
        }

        public Builder addValues(Value value) {
            RepeatedFieldBuilder<Value, Value.Builder, ValueOrBuilder> repeatedFieldBuilder = this.valuesBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.addMessage(value);
                return this;
            }
            value.getClass();
            ensureValuesIsMutable();
            this.values_.add(value);
            onChanged();
            return this;
        }

        public Value.Builder addValuesBuilder() {
            return (Value.Builder) internalGetValuesFieldBuilder().addBuilder(Value.getDefaultInstance());
        }

        public Builder clearValues() {
            RepeatedFieldBuilder<Value, Value.Builder, ValueOrBuilder> repeatedFieldBuilder = this.valuesBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.clear();
                return this;
            }
            this.values_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return StructProto.internal_static_google_protobuf_ListValue_descriptor;
        }

        @Override // com.google.protobuf.ListValueOrBuilder
        public Value getValues(int i10) {
            RepeatedFieldBuilder<Value, Value.Builder, ValueOrBuilder> repeatedFieldBuilder = this.valuesBuilder_;
            return repeatedFieldBuilder == null ? this.values_.get(i10) : (Value) repeatedFieldBuilder.getMessage(i10);
        }

        public Value.Builder getValuesBuilder(int i10) {
            return (Value.Builder) internalGetValuesFieldBuilder().getBuilder(i10);
        }

        public List<Value.Builder> getValuesBuilderList() {
            return internalGetValuesFieldBuilder().getBuilderList();
        }

        @Override // com.google.protobuf.ListValueOrBuilder
        public int getValuesCount() {
            RepeatedFieldBuilder<Value, Value.Builder, ValueOrBuilder> repeatedFieldBuilder = this.valuesBuilder_;
            return repeatedFieldBuilder == null ? this.values_.size() : repeatedFieldBuilder.getCount();
        }

        @Override // com.google.protobuf.ListValueOrBuilder
        public List<Value> getValuesList() {
            RepeatedFieldBuilder<Value, Value.Builder, ValueOrBuilder> repeatedFieldBuilder = this.valuesBuilder_;
            return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.values_) : repeatedFieldBuilder.getMessageList();
        }

        @Override // com.google.protobuf.ListValueOrBuilder
        public ValueOrBuilder getValuesOrBuilder(int i10) {
            RepeatedFieldBuilder<Value, Value.Builder, ValueOrBuilder> repeatedFieldBuilder = this.valuesBuilder_;
            return repeatedFieldBuilder == null ? this.values_.get(i10) : (ValueOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i10);
        }

        @Override // com.google.protobuf.ListValueOrBuilder
        public List<? extends ValueOrBuilder> getValuesOrBuilderList() {
            RepeatedFieldBuilder<Value, Value.Builder, ValueOrBuilder> repeatedFieldBuilder = this.valuesBuilder_;
            return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.values_);
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return StructProto.internal_static_google_protobuf_ListValue_fieldAccessorTable.ensureFieldAccessorsInitialized(ListValue.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder removeValues(int i10) {
            RepeatedFieldBuilder<Value, Value.Builder, ValueOrBuilder> repeatedFieldBuilder = this.valuesBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.remove(i10);
                return this;
            }
            ensureValuesIsMutable();
            this.values_.remove(i10);
            onChanged();
            return this;
        }

        public Builder setValues(int i10, Value value) {
            RepeatedFieldBuilder<Value, Value.Builder, ValueOrBuilder> repeatedFieldBuilder = this.valuesBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.setMessage(i10, value);
                return this;
            }
            value.getClass();
            ensureValuesIsMutable();
            this.values_.set(i10, value);
            onChanged();
            return this;
        }

        private Builder() {
            this.values_ = Collections.EMPTY_LIST;
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ListValue build() {
            ListValue listValueBuildPartial = buildPartial();
            if (listValueBuildPartial.isInitialized()) {
                return listValueBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) listValueBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ListValue buildPartial() {
            ListValue listValue = new ListValue(this);
            buildPartialRepeatedFields(listValue);
            if (this.bitField0_ != 0) {
                buildPartial0(listValue);
            }
            onBuilt();
            return listValue;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ListValue getDefaultInstanceForType() {
            return ListValue.getDefaultInstance();
        }

        public Value.Builder addValuesBuilder(int i10) {
            return (Value.Builder) internalGetValuesFieldBuilder().addBuilder(i10, Value.getDefaultInstance());
        }

        private Builder(AbstractMessage.BuilderParent builderParent) {
            super(builderParent);
            this.values_ = Collections.EMPTY_LIST;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            RepeatedFieldBuilder<Value, Value.Builder, ValueOrBuilder> repeatedFieldBuilder = this.valuesBuilder_;
            if (repeatedFieldBuilder == null) {
                this.values_ = Collections.EMPTY_LIST;
            } else {
                this.values_ = null;
                repeatedFieldBuilder.clear();
            }
            this.bitField0_ &= -2;
            return this;
        }

        public Builder addValues(int i10, Value value) {
            RepeatedFieldBuilder<Value, Value.Builder, ValueOrBuilder> repeatedFieldBuilder = this.valuesBuilder_;
            if (repeatedFieldBuilder == null) {
                value.getClass();
                ensureValuesIsMutable();
                this.values_.add(i10, value);
                onChanged();
                return this;
            }
            repeatedFieldBuilder.addMessage(i10, value);
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof ListValue) {
                return mergeFrom((ListValue) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setValues(int i10, Value.Builder builder) {
            RepeatedFieldBuilder<Value, Value.Builder, ValueOrBuilder> repeatedFieldBuilder = this.valuesBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureValuesIsMutable();
                this.values_.set(i10, builder.build());
                onChanged();
                return this;
            }
            repeatedFieldBuilder.setMessage(i10, builder.build());
            return this;
        }

        public Builder mergeFrom(ListValue listValue) {
            if (listValue == ListValue.getDefaultInstance()) {
                return this;
            }
            if (this.valuesBuilder_ == null) {
                if (!listValue.values_.isEmpty()) {
                    if (this.values_.isEmpty()) {
                        this.values_ = listValue.values_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureValuesIsMutable();
                        this.values_.addAll(listValue.values_);
                    }
                    onChanged();
                }
            } else if (!listValue.values_.isEmpty()) {
                if (!this.valuesBuilder_.isEmpty()) {
                    this.valuesBuilder_.addAllMessages(listValue.values_);
                } else {
                    this.valuesBuilder_.dispose();
                    this.valuesBuilder_ = null;
                    this.values_ = listValue.values_;
                    this.bitField0_ &= -2;
                    this.valuesBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetValuesFieldBuilder() : null;
                }
            }
            mergeUnknownFields(listValue.getUnknownFields());
            onChanged();
            return this;
        }

        public Builder addValues(Value.Builder builder) {
            RepeatedFieldBuilder<Value, Value.Builder, ValueOrBuilder> repeatedFieldBuilder = this.valuesBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureValuesIsMutable();
                this.values_.add(builder.build());
                onChanged();
                return this;
            }
            repeatedFieldBuilder.addMessage(builder.build());
            return this;
        }

        public Builder addValues(int i10, Value.Builder builder) {
            RepeatedFieldBuilder<Value, Value.Builder, ValueOrBuilder> repeatedFieldBuilder = this.valuesBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureValuesIsMutable();
                this.values_.add(i10, builder.build());
                onChanged();
                return this;
            }
            repeatedFieldBuilder.addMessage(i10, builder.build());
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                Value value = (Value) codedInputStream.readMessage(Value.parser(), extensionRegistryLite);
                                RepeatedFieldBuilder<Value, Value.Builder, ValueOrBuilder> repeatedFieldBuilder = this.valuesBuilder_;
                                if (repeatedFieldBuilder == null) {
                                    ensureValuesIsMutable();
                                    this.values_.add(value);
                                } else {
                                    repeatedFieldBuilder.addMessage(value);
                                }
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.unwrapIOException();
                    }
                } catch (Throwable th) {
                    onChanged();
                    throw th;
                }
            }
            onChanged();
            return this;
        }
    }

    private ListValue(GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(ListValue listValue) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(listValue);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ListValue) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ListValue parseFrom(ByteString byteString) {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public ListValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    private ListValue() {
        this.memoizedIsInitialized = (byte) -1;
        this.values_ = Collections.EMPTY_LIST;
    }

    public static ListValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static ListValue parseFrom(byte[] bArr) {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.AbstractMessage
    public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static ListValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ListValue parseFrom(InputStream inputStream) {
        return (ListValue) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static ListValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ListValue) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ListValue parseFrom(CodedInputStream codedInputStream) {
        return (ListValue) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
    }

    public static ListValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ListValue) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
