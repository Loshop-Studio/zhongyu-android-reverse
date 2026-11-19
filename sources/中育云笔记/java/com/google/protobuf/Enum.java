package com.google.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Descriptors;
import com.google.protobuf.EnumValue;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Option;
import com.google.protobuf.RuntimeVersion;
import com.google.protobuf.SourceContext;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class Enum extends GeneratedMessage implements EnumOrBuilder {
    private static final Enum DEFAULT_INSTANCE;
    public static final int EDITION_FIELD_NUMBER = 6;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final Parser<Enum> PARSER;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private volatile Object edition_;
    private List<EnumValue> enumvalue_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private List<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 1, "", Enum.class.getName());
        DEFAULT_INSTANCE = new Enum();
        PARSER = new AbstractParser<Enum>() { // from class: com.google.protobuf.Enum.1
            @Override // com.google.protobuf.Parser
            public Enum parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Enum.newBuilder();
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

    public static /* synthetic */ int access$976(Enum r12, int i10) {
        int i11 = i10 | r12.bitField0_;
        r12.bitField0_ = i11;
        return i11;
    }

    public static Enum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return TypeProto.internal_static_google_protobuf_Enum_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Enum parseDelimitedFrom(InputStream inputStream) {
        return (Enum) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer) {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<Enum> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Enum)) {
            return super.equals(obj);
        }
        Enum r52 = (Enum) obj;
        if (getName().equals(r52.getName()) && getEnumvalueList().equals(r52.getEnumvalueList()) && getOptionsList().equals(r52.getOptionsList()) && hasSourceContext() == r52.hasSourceContext()) {
            return (!hasSourceContext() || getSourceContext().equals(r52.getSourceContext())) && this.syntax_ == r52.syntax_ && getEdition().equals(r52.getEdition()) && getUnknownFields().equals(r52.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public String getEdition() {
        Object obj = this.edition_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.edition_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public ByteString getEditionBytes() {
        Object obj = this.edition_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.edition_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public EnumValue getEnumvalue(int i10) {
        return this.enumvalue_.get(i10);
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public List<EnumValue> getEnumvalueList() {
        return this.enumvalue_;
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public EnumValueOrBuilder getEnumvalueOrBuilder(int i10) {
        return this.enumvalue_.get(i10);
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public List<? extends EnumValueOrBuilder> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public Option getOptions(int i10) {
        return this.options_.get(i10);
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public OptionOrBuilder getOptionsOrBuilder(int i10) {
        return this.options_.get(i10);
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Enum> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.name_) ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        for (int i11 = 0; i11 < this.enumvalue_.size(); i11++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(2, this.enumvalue_.get(i11));
        }
        for (int i12 = 0; i12 < this.options_.size(); i12++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(3, this.options_.get(i12));
        }
        if ((this.bitField0_ & 1) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(4, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(5, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            iComputeStringSize += GeneratedMessage.computeStringSize(6, this.edition_);
        }
        int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public SourceContextOrBuilder getSourceContextOrBuilder() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.EnumOrBuilder
    public boolean hasSourceContext() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode();
        if (getEnumvalueCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getEnumvalueList().hashCode();
        }
        if (getOptionsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getOptionsList().hashCode();
        }
        if (hasSourceContext()) {
            iHashCode = (((iHashCode * 37) + 4) * 53) + getSourceContext().hashCode();
        }
        int iHashCode2 = (((((((((iHashCode * 37) + 5) * 53) + this.syntax_) * 37) + 6) * 53) + getEdition().hashCode()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return TypeProto.internal_static_google_protobuf_Enum_fieldAccessorTable.ensureFieldAccessorsInitialized(Enum.class, Builder.class);
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
        if (!GeneratedMessage.isStringEmpty(this.name_)) {
            GeneratedMessage.writeString(codedOutputStream, 1, this.name_);
        }
        for (int i10 = 0; i10 < this.enumvalue_.size(); i10++) {
            codedOutputStream.writeMessage(2, this.enumvalue_.get(i10));
        }
        for (int i11 = 0; i11 < this.options_.size(); i11++) {
            codedOutputStream.writeMessage(3, this.options_.get(i11));
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(4, getSourceContext());
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            codedOutputStream.writeEnum(5, this.syntax_);
        }
        if (!GeneratedMessage.isStringEmpty(this.edition_)) {
            GeneratedMessage.writeString(codedOutputStream, 6, this.edition_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessage.Builder<Builder> implements EnumOrBuilder {
        private int bitField0_;
        private Object edition_;
        private RepeatedFieldBuilder<EnumValue, EnumValue.Builder, EnumValueOrBuilder> enumvalueBuilder_;
        private List<EnumValue> enumvalue_;
        private Object name_;
        private RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> optionsBuilder_;
        private List<Option> options_;
        private SingleFieldBuilder<SourceContext, SourceContext.Builder, SourceContextOrBuilder> sourceContextBuilder_;
        private SourceContext sourceContext_;
        private int syntax_;

        private void buildPartial0(Enum r42) {
            int i10;
            int i11 = this.bitField0_;
            if ((i11 & 1) != 0) {
                r42.name_ = this.name_;
            }
            if ((i11 & 8) != 0) {
                SingleFieldBuilder<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilder = this.sourceContextBuilder_;
                r42.sourceContext_ = singleFieldBuilder == null ? this.sourceContext_ : (SourceContext) singleFieldBuilder.build();
                i10 = 1;
            } else {
                i10 = 0;
            }
            if ((i11 & 16) != 0) {
                r42.syntax_ = this.syntax_;
            }
            if ((i11 & 32) != 0) {
                r42.edition_ = this.edition_;
            }
            Enum.access$976(r42, i10);
        }

        private void buildPartialRepeatedFields(Enum r22) {
            RepeatedFieldBuilder<EnumValue, EnumValue.Builder, EnumValueOrBuilder> repeatedFieldBuilder = this.enumvalueBuilder_;
            if (repeatedFieldBuilder == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.enumvalue_ = Collections.unmodifiableList(this.enumvalue_);
                    this.bitField0_ &= -3;
                }
                r22.enumvalue_ = this.enumvalue_;
            } else {
                r22.enumvalue_ = repeatedFieldBuilder.build();
            }
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder2 = this.optionsBuilder_;
            if (repeatedFieldBuilder2 != null) {
                r22.options_ = repeatedFieldBuilder2.build();
                return;
            }
            if ((this.bitField0_ & 4) != 0) {
                this.options_ = Collections.unmodifiableList(this.options_);
                this.bitField0_ &= -5;
            }
            r22.options_ = this.options_;
        }

        private void ensureEnumvalueIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.enumvalue_ = new ArrayList(this.enumvalue_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureOptionsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.options_ = new ArrayList(this.options_);
                this.bitField0_ |= 4;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return TypeProto.internal_static_google_protobuf_Enum_descriptor;
        }

        private RepeatedFieldBuilder<EnumValue, EnumValue.Builder, EnumValueOrBuilder> internalGetEnumvalueFieldBuilder() {
            if (this.enumvalueBuilder_ == null) {
                this.enumvalueBuilder_ = new RepeatedFieldBuilder<>(this.enumvalue_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.enumvalue_ = null;
            }
            return this.enumvalueBuilder_;
        }

        private RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> internalGetOptionsFieldBuilder() {
            if (this.optionsBuilder_ == null) {
                this.optionsBuilder_ = new RepeatedFieldBuilder<>(this.options_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                this.options_ = null;
            }
            return this.optionsBuilder_;
        }

        private SingleFieldBuilder<SourceContext, SourceContext.Builder, SourceContextOrBuilder> internalGetSourceContextFieldBuilder() {
            if (this.sourceContextBuilder_ == null) {
                this.sourceContextBuilder_ = new SingleFieldBuilder<>(getSourceContext(), getParentForChildren(), isClean());
                this.sourceContext_ = null;
            }
            return this.sourceContextBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessage.alwaysUseFieldBuilders) {
                internalGetEnumvalueFieldBuilder();
                internalGetOptionsFieldBuilder();
                internalGetSourceContextFieldBuilder();
            }
        }

        public Builder addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
            RepeatedFieldBuilder<EnumValue, EnumValue.Builder, EnumValueOrBuilder> repeatedFieldBuilder = this.enumvalueBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.addAllMessages(iterable);
                return this;
            }
            ensureEnumvalueIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.enumvalue_);
            onChanged();
            return this;
        }

        public Builder addAllOptions(Iterable<? extends Option> iterable) {
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder = this.optionsBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.addAllMessages(iterable);
                return this;
            }
            ensureOptionsIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.options_);
            onChanged();
            return this;
        }

        public Builder addEnumvalue(EnumValue enumValue) {
            RepeatedFieldBuilder<EnumValue, EnumValue.Builder, EnumValueOrBuilder> repeatedFieldBuilder = this.enumvalueBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.addMessage(enumValue);
                return this;
            }
            enumValue.getClass();
            ensureEnumvalueIsMutable();
            this.enumvalue_.add(enumValue);
            onChanged();
            return this;
        }

        public EnumValue.Builder addEnumvalueBuilder() {
            return (EnumValue.Builder) internalGetEnumvalueFieldBuilder().addBuilder(EnumValue.getDefaultInstance());
        }

        public Builder addOptions(Option option) {
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder = this.optionsBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.addMessage(option);
                return this;
            }
            option.getClass();
            ensureOptionsIsMutable();
            this.options_.add(option);
            onChanged();
            return this;
        }

        public Option.Builder addOptionsBuilder() {
            return (Option.Builder) internalGetOptionsFieldBuilder().addBuilder(Option.getDefaultInstance());
        }

        public Builder clearEdition() {
            this.edition_ = Enum.getDefaultInstance().getEdition();
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public Builder clearEnumvalue() {
            RepeatedFieldBuilder<EnumValue, EnumValue.Builder, EnumValueOrBuilder> repeatedFieldBuilder = this.enumvalueBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.clear();
                return this;
            }
            this.enumvalue_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearName() {
            this.name_ = Enum.getDefaultInstance().getName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearOptions() {
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder = this.optionsBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.clear();
                return this;
            }
            this.options_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder clearSourceContext() {
            this.bitField0_ &= -9;
            this.sourceContext_ = null;
            SingleFieldBuilder<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilder = this.sourceContextBuilder_;
            if (singleFieldBuilder != null) {
                singleFieldBuilder.dispose();
                this.sourceContextBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Builder clearSyntax() {
            this.bitField0_ &= -17;
            this.syntax_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return TypeProto.internal_static_google_protobuf_Enum_descriptor;
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public String getEdition() {
            Object obj = this.edition_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.edition_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public ByteString getEditionBytes() {
            Object obj = this.edition_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.edition_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public EnumValue getEnumvalue(int i10) {
            RepeatedFieldBuilder<EnumValue, EnumValue.Builder, EnumValueOrBuilder> repeatedFieldBuilder = this.enumvalueBuilder_;
            return repeatedFieldBuilder == null ? this.enumvalue_.get(i10) : (EnumValue) repeatedFieldBuilder.getMessage(i10);
        }

        public EnumValue.Builder getEnumvalueBuilder(int i10) {
            return (EnumValue.Builder) internalGetEnumvalueFieldBuilder().getBuilder(i10);
        }

        public List<EnumValue.Builder> getEnumvalueBuilderList() {
            return internalGetEnumvalueFieldBuilder().getBuilderList();
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public int getEnumvalueCount() {
            RepeatedFieldBuilder<EnumValue, EnumValue.Builder, EnumValueOrBuilder> repeatedFieldBuilder = this.enumvalueBuilder_;
            return repeatedFieldBuilder == null ? this.enumvalue_.size() : repeatedFieldBuilder.getCount();
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public List<EnumValue> getEnumvalueList() {
            RepeatedFieldBuilder<EnumValue, EnumValue.Builder, EnumValueOrBuilder> repeatedFieldBuilder = this.enumvalueBuilder_;
            return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.enumvalue_) : repeatedFieldBuilder.getMessageList();
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public EnumValueOrBuilder getEnumvalueOrBuilder(int i10) {
            RepeatedFieldBuilder<EnumValue, EnumValue.Builder, EnumValueOrBuilder> repeatedFieldBuilder = this.enumvalueBuilder_;
            return repeatedFieldBuilder == null ? this.enumvalue_.get(i10) : (EnumValueOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i10);
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public List<? extends EnumValueOrBuilder> getEnumvalueOrBuilderList() {
            RepeatedFieldBuilder<EnumValue, EnumValue.Builder, EnumValueOrBuilder> repeatedFieldBuilder = this.enumvalueBuilder_;
            return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.enumvalue_);
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public Option getOptions(int i10) {
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder = this.optionsBuilder_;
            return repeatedFieldBuilder == null ? this.options_.get(i10) : (Option) repeatedFieldBuilder.getMessage(i10);
        }

        public Option.Builder getOptionsBuilder(int i10) {
            return (Option.Builder) internalGetOptionsFieldBuilder().getBuilder(i10);
        }

        public List<Option.Builder> getOptionsBuilderList() {
            return internalGetOptionsFieldBuilder().getBuilderList();
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public int getOptionsCount() {
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder = this.optionsBuilder_;
            return repeatedFieldBuilder == null ? this.options_.size() : repeatedFieldBuilder.getCount();
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public List<Option> getOptionsList() {
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder = this.optionsBuilder_;
            return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.options_) : repeatedFieldBuilder.getMessageList();
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public OptionOrBuilder getOptionsOrBuilder(int i10) {
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder = this.optionsBuilder_;
            return repeatedFieldBuilder == null ? this.options_.get(i10) : (OptionOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i10);
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder = this.optionsBuilder_;
            return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public SourceContext getSourceContext() {
            SingleFieldBuilder<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilder = this.sourceContextBuilder_;
            if (singleFieldBuilder != null) {
                return (SourceContext) singleFieldBuilder.getMessage();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        public SourceContext.Builder getSourceContextBuilder() {
            this.bitField0_ |= 8;
            onChanged();
            return (SourceContext.Builder) internalGetSourceContextFieldBuilder().getBuilder();
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public SourceContextOrBuilder getSourceContextOrBuilder() {
            SingleFieldBuilder<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilder = this.sourceContextBuilder_;
            if (singleFieldBuilder != null) {
                return (SourceContextOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public Syntax getSyntax() {
            Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
            return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public int getSyntaxValue() {
            return this.syntax_;
        }

        @Override // com.google.protobuf.EnumOrBuilder
        public boolean hasSourceContext() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return TypeProto.internal_static_google_protobuf_Enum_fieldAccessorTable.ensureFieldAccessorsInitialized(Enum.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeSourceContext(SourceContext sourceContext) {
            SourceContext sourceContext2;
            SingleFieldBuilder<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilder = this.sourceContextBuilder_;
            if (singleFieldBuilder != null) {
                singleFieldBuilder.mergeFrom(sourceContext);
            } else if ((this.bitField0_ & 8) == 0 || (sourceContext2 = this.sourceContext_) == null || sourceContext2 == SourceContext.getDefaultInstance()) {
                this.sourceContext_ = sourceContext;
            } else {
                getSourceContextBuilder().mergeFrom(sourceContext);
            }
            if (this.sourceContext_ != null) {
                this.bitField0_ |= 8;
                onChanged();
            }
            return this;
        }

        public Builder removeEnumvalue(int i10) {
            RepeatedFieldBuilder<EnumValue, EnumValue.Builder, EnumValueOrBuilder> repeatedFieldBuilder = this.enumvalueBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.remove(i10);
                return this;
            }
            ensureEnumvalueIsMutable();
            this.enumvalue_.remove(i10);
            onChanged();
            return this;
        }

        public Builder removeOptions(int i10) {
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder = this.optionsBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.remove(i10);
                return this;
            }
            ensureOptionsIsMutable();
            this.options_.remove(i10);
            onChanged();
            return this;
        }

        public Builder setEdition(String str) {
            str.getClass();
            this.edition_ = str;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder setEditionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.edition_ = byteString;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder setEnumvalue(int i10, EnumValue enumValue) {
            RepeatedFieldBuilder<EnumValue, EnumValue.Builder, EnumValueOrBuilder> repeatedFieldBuilder = this.enumvalueBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.setMessage(i10, enumValue);
                return this;
            }
            enumValue.getClass();
            ensureEnumvalueIsMutable();
            this.enumvalue_.set(i10, enumValue);
            onChanged();
            return this;
        }

        public Builder setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setOptions(int i10, Option option) {
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder = this.optionsBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.setMessage(i10, option);
                return this;
            }
            option.getClass();
            ensureOptionsIsMutable();
            this.options_.set(i10, option);
            onChanged();
            return this;
        }

        public Builder setSourceContext(SourceContext sourceContext) {
            SingleFieldBuilder<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilder = this.sourceContextBuilder_;
            if (singleFieldBuilder == null) {
                sourceContext.getClass();
                this.sourceContext_ = sourceContext;
            } else {
                singleFieldBuilder.setMessage(sourceContext);
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setSyntax(Syntax syntax) {
            syntax.getClass();
            this.bitField0_ |= 16;
            this.syntax_ = syntax.getNumber();
            onChanged();
            return this;
        }

        public Builder setSyntaxValue(int i10) {
            this.syntax_ = i10;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        private Builder() {
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.enumvalue_ = list;
            this.options_ = list;
            this.syntax_ = 0;
            this.edition_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Enum build() {
            Enum enumBuildPartial = buildPartial();
            if (enumBuildPartial.isInitialized()) {
                return enumBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) enumBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Enum buildPartial() {
            Enum r02 = new Enum(this);
            buildPartialRepeatedFields(r02);
            if (this.bitField0_ != 0) {
                buildPartial0(r02);
            }
            onBuilt();
            return r02;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Enum getDefaultInstanceForType() {
            return Enum.getDefaultInstance();
        }

        public EnumValue.Builder addEnumvalueBuilder(int i10) {
            return (EnumValue.Builder) internalGetEnumvalueFieldBuilder().addBuilder(i10, EnumValue.getDefaultInstance());
        }

        public Option.Builder addOptionsBuilder(int i10) {
            return (Option.Builder) internalGetOptionsFieldBuilder().addBuilder(i10, Option.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.name_ = "";
            RepeatedFieldBuilder<EnumValue, EnumValue.Builder, EnumValueOrBuilder> repeatedFieldBuilder = this.enumvalueBuilder_;
            if (repeatedFieldBuilder == null) {
                this.enumvalue_ = Collections.EMPTY_LIST;
            } else {
                this.enumvalue_ = null;
                repeatedFieldBuilder.clear();
            }
            this.bitField0_ &= -3;
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder2 = this.optionsBuilder_;
            if (repeatedFieldBuilder2 == null) {
                this.options_ = Collections.EMPTY_LIST;
            } else {
                this.options_ = null;
                repeatedFieldBuilder2.clear();
            }
            this.bitField0_ &= -5;
            this.sourceContext_ = null;
            SingleFieldBuilder<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilder = this.sourceContextBuilder_;
            if (singleFieldBuilder != null) {
                singleFieldBuilder.dispose();
                this.sourceContextBuilder_ = null;
            }
            this.syntax_ = 0;
            this.edition_ = "";
            return this;
        }

        public Builder addEnumvalue(int i10, EnumValue enumValue) {
            RepeatedFieldBuilder<EnumValue, EnumValue.Builder, EnumValueOrBuilder> repeatedFieldBuilder = this.enumvalueBuilder_;
            if (repeatedFieldBuilder == null) {
                enumValue.getClass();
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(i10, enumValue);
                onChanged();
                return this;
            }
            repeatedFieldBuilder.addMessage(i10, enumValue);
            return this;
        }

        public Builder addOptions(int i10, Option option) {
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder = this.optionsBuilder_;
            if (repeatedFieldBuilder == null) {
                option.getClass();
                ensureOptionsIsMutable();
                this.options_.add(i10, option);
                onChanged();
                return this;
            }
            repeatedFieldBuilder.addMessage(i10, option);
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Enum) {
                return mergeFrom((Enum) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setEnumvalue(int i10, EnumValue.Builder builder) {
            RepeatedFieldBuilder<EnumValue, EnumValue.Builder, EnumValueOrBuilder> repeatedFieldBuilder = this.enumvalueBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureEnumvalueIsMutable();
                this.enumvalue_.set(i10, builder.build());
                onChanged();
                return this;
            }
            repeatedFieldBuilder.setMessage(i10, builder.build());
            return this;
        }

        public Builder setOptions(int i10, Option.Builder builder) {
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder = this.optionsBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureOptionsIsMutable();
                this.options_.set(i10, builder.build());
                onChanged();
                return this;
            }
            repeatedFieldBuilder.setMessage(i10, builder.build());
            return this;
        }

        public Builder setSourceContext(SourceContext.Builder builder) {
            SingleFieldBuilder<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilder = this.sourceContextBuilder_;
            if (singleFieldBuilder == null) {
                this.sourceContext_ = builder.build();
            } else {
                singleFieldBuilder.setMessage(builder.build());
            }
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        private Builder(AbstractMessage.BuilderParent builderParent) {
            super(builderParent);
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.enumvalue_ = list;
            this.options_ = list;
            this.syntax_ = 0;
            this.edition_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(Enum r42) {
            if (r42 == Enum.getDefaultInstance()) {
                return this;
            }
            if (!r42.getName().isEmpty()) {
                this.name_ = r42.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (this.enumvalueBuilder_ == null) {
                if (!r42.enumvalue_.isEmpty()) {
                    if (this.enumvalue_.isEmpty()) {
                        this.enumvalue_ = r42.enumvalue_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureEnumvalueIsMutable();
                        this.enumvalue_.addAll(r42.enumvalue_);
                    }
                    onChanged();
                }
            } else if (!r42.enumvalue_.isEmpty()) {
                if (!this.enumvalueBuilder_.isEmpty()) {
                    this.enumvalueBuilder_.addAllMessages(r42.enumvalue_);
                } else {
                    this.enumvalueBuilder_.dispose();
                    this.enumvalueBuilder_ = null;
                    this.enumvalue_ = r42.enumvalue_;
                    this.bitField0_ &= -3;
                    this.enumvalueBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetEnumvalueFieldBuilder() : null;
                }
            }
            if (this.optionsBuilder_ == null) {
                if (!r42.options_.isEmpty()) {
                    if (this.options_.isEmpty()) {
                        this.options_ = r42.options_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureOptionsIsMutable();
                        this.options_.addAll(r42.options_);
                    }
                    onChanged();
                }
            } else if (!r42.options_.isEmpty()) {
                if (!this.optionsBuilder_.isEmpty()) {
                    this.optionsBuilder_.addAllMessages(r42.options_);
                } else {
                    this.optionsBuilder_.dispose();
                    this.optionsBuilder_ = null;
                    this.options_ = r42.options_;
                    this.bitField0_ &= -5;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                }
            }
            if (r42.hasSourceContext()) {
                mergeSourceContext(r42.getSourceContext());
            }
            if (r42.syntax_ != 0) {
                setSyntaxValue(r42.getSyntaxValue());
            }
            if (!r42.getEdition().isEmpty()) {
                this.edition_ = r42.edition_;
                this.bitField0_ |= 32;
                onChanged();
            }
            mergeUnknownFields(r42.getUnknownFields());
            onChanged();
            return this;
        }

        public Builder addEnumvalue(EnumValue.Builder builder) {
            RepeatedFieldBuilder<EnumValue, EnumValue.Builder, EnumValueOrBuilder> repeatedFieldBuilder = this.enumvalueBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(builder.build());
                onChanged();
                return this;
            }
            repeatedFieldBuilder.addMessage(builder.build());
            return this;
        }

        public Builder addOptions(Option.Builder builder) {
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder = this.optionsBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureOptionsIsMutable();
                this.options_.add(builder.build());
                onChanged();
                return this;
            }
            repeatedFieldBuilder.addMessage(builder.build());
            return this;
        }

        public Builder addEnumvalue(int i10, EnumValue.Builder builder) {
            RepeatedFieldBuilder<EnumValue, EnumValue.Builder, EnumValueOrBuilder> repeatedFieldBuilder = this.enumvalueBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureEnumvalueIsMutable();
                this.enumvalue_.add(i10, builder.build());
                onChanged();
                return this;
            }
            repeatedFieldBuilder.addMessage(i10, builder.build());
            return this;
        }

        public Builder addOptions(int i10, Option.Builder builder) {
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder = this.optionsBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureOptionsIsMutable();
                this.options_.add(i10, builder.build());
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
                            if (tag == 10) {
                                this.name_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                EnumValue enumValue = (EnumValue) codedInputStream.readMessage(EnumValue.parser(), extensionRegistryLite);
                                RepeatedFieldBuilder<EnumValue, EnumValue.Builder, EnumValueOrBuilder> repeatedFieldBuilder = this.enumvalueBuilder_;
                                if (repeatedFieldBuilder == null) {
                                    ensureEnumvalueIsMutable();
                                    this.enumvalue_.add(enumValue);
                                } else {
                                    repeatedFieldBuilder.addMessage(enumValue);
                                }
                            } else if (tag == 26) {
                                Option option = (Option) codedInputStream.readMessage(Option.parser(), extensionRegistryLite);
                                RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder2 = this.optionsBuilder_;
                                if (repeatedFieldBuilder2 == null) {
                                    ensureOptionsIsMutable();
                                    this.options_.add(option);
                                } else {
                                    repeatedFieldBuilder2.addMessage(option);
                                }
                            } else if (tag == 34) {
                                codedInputStream.readMessage(internalGetSourceContextFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 8;
                            } else if (tag == 40) {
                                this.syntax_ = codedInputStream.readEnum();
                                this.bitField0_ |= 16;
                            } else if (tag != 50) {
                                if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.edition_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 32;
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

    private Enum(GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.name_ = "";
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(Enum r12) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(r12);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Enum) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Enum parseFrom(ByteString byteString) {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Enum getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Enum parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Enum parseFrom(byte[] bArr) {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.AbstractMessage
    public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static Enum parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    private Enum() {
        this.name_ = "";
        this.syntax_ = 0;
        this.edition_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        List list = Collections.EMPTY_LIST;
        this.enumvalue_ = list;
        this.options_ = list;
        this.syntax_ = 0;
        this.edition_ = "";
    }

    public static Enum parseFrom(InputStream inputStream) {
        return (Enum) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Enum parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Enum) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Enum parseFrom(CodedInputStream codedInputStream) {
        return (Enum) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
    }

    public static Enum parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Enum) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
