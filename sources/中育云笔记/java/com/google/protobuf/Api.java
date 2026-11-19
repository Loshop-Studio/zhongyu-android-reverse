package com.google.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Descriptors;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.Method;
import com.google.protobuf.Mixin;
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
public final class Api extends GeneratedMessage implements ApiOrBuilder {
    private static final Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static final Parser<Api> PARSER;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private List<Method> methods_;
    private List<Mixin> mixins_;
    private volatile Object name_;
    private List<Option> options_;
    private SourceContext sourceContext_;
    private int syntax_;
    private volatile Object version_;

    static {
        RuntimeVersion.validateProtobufGencodeVersion(RuntimeVersion.RuntimeDomain.PUBLIC, 4, 31, 1, "", Api.class.getName());
        DEFAULT_INSTANCE = new Api();
        PARSER = new AbstractParser<Api>() { // from class: com.google.protobuf.Api.1
            @Override // com.google.protobuf.Parser
            public Api parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Api.newBuilder();
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

    public static /* synthetic */ int access$1076(Api api, int i10) {
        int i11 = i10 | api.bitField0_;
        api.bitField0_ = i11;
        return i11;
    }

    public static Api getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ApiProto.internal_static_google_protobuf_Api_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Api parseDelimitedFrom(InputStream inputStream) {
        return (Api) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Api parseFrom(ByteBuffer byteBuffer) {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<Api> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Api)) {
            return super.equals(obj);
        }
        Api api = (Api) obj;
        if (getName().equals(api.getName()) && getMethodsList().equals(api.getMethodsList()) && getOptionsList().equals(api.getOptionsList()) && getVersion().equals(api.getVersion()) && hasSourceContext() == api.hasSourceContext()) {
            return (!hasSourceContext() || getSourceContext().equals(api.getSourceContext())) && getMixinsList().equals(api.getMixinsList()) && this.syntax_ == api.syntax_ && getUnknownFields().equals(api.getUnknownFields());
        }
        return false;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public Method getMethods(int i10) {
        return this.methods_.get(i10);
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public int getMethodsCount() {
        return this.methods_.size();
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public List<Method> getMethodsList() {
        return this.methods_;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public MethodOrBuilder getMethodsOrBuilder(int i10) {
        return this.methods_.get(i10);
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public List<? extends MethodOrBuilder> getMethodsOrBuilderList() {
        return this.methods_;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public Mixin getMixins(int i10) {
        return this.mixins_.get(i10);
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public List<Mixin> getMixinsList() {
        return this.mixins_;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public MixinOrBuilder getMixinsOrBuilder(int i10) {
        return this.mixins_.get(i10);
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public List<? extends MixinOrBuilder> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public Option getOptions(int i10) {
        return this.options_.get(i10);
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public List<Option> getOptionsList() {
        return this.options_;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public OptionOrBuilder getOptionsOrBuilder(int i10) {
        return this.options_.get(i10);
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Api> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.name_) ? GeneratedMessage.computeStringSize(1, this.name_) : 0;
        for (int i11 = 0; i11 < this.methods_.size(); i11++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(2, this.methods_.get(i11));
        }
        for (int i12 = 0; i12 < this.options_.size(); i12++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(3, this.options_.get(i12));
        }
        if (!GeneratedMessage.isStringEmpty(this.version_)) {
            iComputeStringSize += GeneratedMessage.computeStringSize(4, this.version_);
        }
        if ((1 & this.bitField0_) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(5, getSourceContext());
        }
        for (int i13 = 0; i13 < this.mixins_.size(); i13++) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(6, this.mixins_.get(i13));
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(7, this.syntax_);
        }
        int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public SourceContextOrBuilder getSourceContextOrBuilder() {
        SourceContext sourceContext = this.sourceContext_;
        return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public Syntax getSyntax() {
        Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
        return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public String getVersion() {
        Object obj = this.version_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.version_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.google.protobuf.ApiOrBuilder
    public ByteString getVersionBytes() {
        Object obj = this.version_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.version_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.ApiOrBuilder
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
        if (getMethodsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getMethodsList().hashCode();
        }
        if (getOptionsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getOptionsList().hashCode();
        }
        int iHashCode2 = (((iHashCode * 37) + 4) * 53) + getVersion().hashCode();
        if (hasSourceContext()) {
            iHashCode2 = (((iHashCode2 * 37) + 5) * 53) + getSourceContext().hashCode();
        }
        if (getMixinsCount() > 0) {
            iHashCode2 = (((iHashCode2 * 37) + 6) * 53) + getMixinsList().hashCode();
        }
        int iHashCode3 = (((((iHashCode2 * 37) + 7) * 53) + this.syntax_) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.google.protobuf.GeneratedMessage
    public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return ApiProto.internal_static_google_protobuf_Api_fieldAccessorTable.ensureFieldAccessorsInitialized(Api.class, Builder.class);
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
        for (int i10 = 0; i10 < this.methods_.size(); i10++) {
            codedOutputStream.writeMessage(2, this.methods_.get(i10));
        }
        for (int i11 = 0; i11 < this.options_.size(); i11++) {
            codedOutputStream.writeMessage(3, this.options_.get(i11));
        }
        if (!GeneratedMessage.isStringEmpty(this.version_)) {
            GeneratedMessage.writeString(codedOutputStream, 4, this.version_);
        }
        if ((1 & this.bitField0_) != 0) {
            codedOutputStream.writeMessage(5, getSourceContext());
        }
        for (int i12 = 0; i12 < this.mixins_.size(); i12++) {
            codedOutputStream.writeMessage(6, this.mixins_.get(i12));
        }
        if (this.syntax_ != Syntax.SYNTAX_PROTO2.getNumber()) {
            codedOutputStream.writeEnum(7, this.syntax_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessage.Builder<Builder> implements ApiOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilder<Method, Method.Builder, MethodOrBuilder> methodsBuilder_;
        private List<Method> methods_;
        private RepeatedFieldBuilder<Mixin, Mixin.Builder, MixinOrBuilder> mixinsBuilder_;
        private List<Mixin> mixins_;
        private Object name_;
        private RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> optionsBuilder_;
        private List<Option> options_;
        private SingleFieldBuilder<SourceContext, SourceContext.Builder, SourceContextOrBuilder> sourceContextBuilder_;
        private SourceContext sourceContext_;
        private int syntax_;
        private Object version_;

        private void buildPartial0(Api api) {
            int i10;
            int i11 = this.bitField0_;
            if ((i11 & 1) != 0) {
                api.name_ = this.name_;
            }
            if ((i11 & 8) != 0) {
                api.version_ = this.version_;
            }
            if ((i11 & 16) != 0) {
                SingleFieldBuilder<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilder = this.sourceContextBuilder_;
                api.sourceContext_ = singleFieldBuilder == null ? this.sourceContext_ : (SourceContext) singleFieldBuilder.build();
                i10 = 1;
            } else {
                i10 = 0;
            }
            if ((i11 & 64) != 0) {
                api.syntax_ = this.syntax_;
            }
            Api.access$1076(api, i10);
        }

        private void buildPartialRepeatedFields(Api api) {
            RepeatedFieldBuilder<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilder = this.methodsBuilder_;
            if (repeatedFieldBuilder == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.methods_ = Collections.unmodifiableList(this.methods_);
                    this.bitField0_ &= -3;
                }
                api.methods_ = this.methods_;
            } else {
                api.methods_ = repeatedFieldBuilder.build();
            }
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder2 = this.optionsBuilder_;
            if (repeatedFieldBuilder2 == null) {
                if ((this.bitField0_ & 4) != 0) {
                    this.options_ = Collections.unmodifiableList(this.options_);
                    this.bitField0_ &= -5;
                }
                api.options_ = this.options_;
            } else {
                api.options_ = repeatedFieldBuilder2.build();
            }
            RepeatedFieldBuilder<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilder3 = this.mixinsBuilder_;
            if (repeatedFieldBuilder3 != null) {
                api.mixins_ = repeatedFieldBuilder3.build();
                return;
            }
            if ((this.bitField0_ & 32) != 0) {
                this.mixins_ = Collections.unmodifiableList(this.mixins_);
                this.bitField0_ &= -33;
            }
            api.mixins_ = this.mixins_;
        }

        private void ensureMethodsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.methods_ = new ArrayList(this.methods_);
                this.bitField0_ |= 2;
            }
        }

        private void ensureMixinsIsMutable() {
            if ((this.bitField0_ & 32) == 0) {
                this.mixins_ = new ArrayList(this.mixins_);
                this.bitField0_ |= 32;
            }
        }

        private void ensureOptionsIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.options_ = new ArrayList(this.options_);
                this.bitField0_ |= 4;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ApiProto.internal_static_google_protobuf_Api_descriptor;
        }

        private RepeatedFieldBuilder<Method, Method.Builder, MethodOrBuilder> internalGetMethodsFieldBuilder() {
            if (this.methodsBuilder_ == null) {
                this.methodsBuilder_ = new RepeatedFieldBuilder<>(this.methods_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.methods_ = null;
            }
            return this.methodsBuilder_;
        }

        private RepeatedFieldBuilder<Mixin, Mixin.Builder, MixinOrBuilder> internalGetMixinsFieldBuilder() {
            if (this.mixinsBuilder_ == null) {
                this.mixinsBuilder_ = new RepeatedFieldBuilder<>(this.mixins_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
                this.mixins_ = null;
            }
            return this.mixinsBuilder_;
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
                internalGetMethodsFieldBuilder();
                internalGetOptionsFieldBuilder();
                internalGetSourceContextFieldBuilder();
                internalGetMixinsFieldBuilder();
            }
        }

        public Builder addAllMethods(Iterable<? extends Method> iterable) {
            RepeatedFieldBuilder<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilder = this.methodsBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.addAllMessages(iterable);
                return this;
            }
            ensureMethodsIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.methods_);
            onChanged();
            return this;
        }

        public Builder addAllMixins(Iterable<? extends Mixin> iterable) {
            RepeatedFieldBuilder<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilder = this.mixinsBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.addAllMessages(iterable);
                return this;
            }
            ensureMixinsIsMutable();
            AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.mixins_);
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

        public Builder addMethods(Method method) {
            RepeatedFieldBuilder<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilder = this.methodsBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.addMessage(method);
                return this;
            }
            method.getClass();
            ensureMethodsIsMutable();
            this.methods_.add(method);
            onChanged();
            return this;
        }

        public Method.Builder addMethodsBuilder() {
            return (Method.Builder) internalGetMethodsFieldBuilder().addBuilder(Method.getDefaultInstance());
        }

        public Builder addMixins(Mixin mixin) {
            RepeatedFieldBuilder<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilder = this.mixinsBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.addMessage(mixin);
                return this;
            }
            mixin.getClass();
            ensureMixinsIsMutable();
            this.mixins_.add(mixin);
            onChanged();
            return this;
        }

        public Mixin.Builder addMixinsBuilder() {
            return (Mixin.Builder) internalGetMixinsFieldBuilder().addBuilder(Mixin.getDefaultInstance());
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

        public Builder clearMethods() {
            RepeatedFieldBuilder<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilder = this.methodsBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.clear();
                return this;
            }
            this.methods_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearMixins() {
            RepeatedFieldBuilder<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilder = this.mixinsBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.clear();
                return this;
            }
            this.mixins_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public Builder clearName() {
            this.name_ = Api.getDefaultInstance().getName();
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
            this.bitField0_ &= -17;
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
            this.bitField0_ &= -65;
            this.syntax_ = 0;
            onChanged();
            return this;
        }

        public Builder clearVersion() {
            this.version_ = Api.getDefaultInstance().getVersion();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ApiProto.internal_static_google_protobuf_Api_descriptor;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public Method getMethods(int i10) {
            RepeatedFieldBuilder<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilder = this.methodsBuilder_;
            return repeatedFieldBuilder == null ? this.methods_.get(i10) : (Method) repeatedFieldBuilder.getMessage(i10);
        }

        public Method.Builder getMethodsBuilder(int i10) {
            return (Method.Builder) internalGetMethodsFieldBuilder().getBuilder(i10);
        }

        public List<Method.Builder> getMethodsBuilderList() {
            return internalGetMethodsFieldBuilder().getBuilderList();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public int getMethodsCount() {
            RepeatedFieldBuilder<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilder = this.methodsBuilder_;
            return repeatedFieldBuilder == null ? this.methods_.size() : repeatedFieldBuilder.getCount();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public List<Method> getMethodsList() {
            RepeatedFieldBuilder<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilder = this.methodsBuilder_;
            return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.methods_) : repeatedFieldBuilder.getMessageList();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public MethodOrBuilder getMethodsOrBuilder(int i10) {
            RepeatedFieldBuilder<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilder = this.methodsBuilder_;
            return repeatedFieldBuilder == null ? this.methods_.get(i10) : (MethodOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i10);
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public List<? extends MethodOrBuilder> getMethodsOrBuilderList() {
            RepeatedFieldBuilder<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilder = this.methodsBuilder_;
            return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.methods_);
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public Mixin getMixins(int i10) {
            RepeatedFieldBuilder<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilder = this.mixinsBuilder_;
            return repeatedFieldBuilder == null ? this.mixins_.get(i10) : (Mixin) repeatedFieldBuilder.getMessage(i10);
        }

        public Mixin.Builder getMixinsBuilder(int i10) {
            return (Mixin.Builder) internalGetMixinsFieldBuilder().getBuilder(i10);
        }

        public List<Mixin.Builder> getMixinsBuilderList() {
            return internalGetMixinsFieldBuilder().getBuilderList();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public int getMixinsCount() {
            RepeatedFieldBuilder<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilder = this.mixinsBuilder_;
            return repeatedFieldBuilder == null ? this.mixins_.size() : repeatedFieldBuilder.getCount();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public List<Mixin> getMixinsList() {
            RepeatedFieldBuilder<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilder = this.mixinsBuilder_;
            return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.mixins_) : repeatedFieldBuilder.getMessageList();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public MixinOrBuilder getMixinsOrBuilder(int i10) {
            RepeatedFieldBuilder<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilder = this.mixinsBuilder_;
            return repeatedFieldBuilder == null ? this.mixins_.get(i10) : (MixinOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i10);
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public List<? extends MixinOrBuilder> getMixinsOrBuilderList() {
            RepeatedFieldBuilder<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilder = this.mixinsBuilder_;
            return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.mixins_);
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.ApiOrBuilder
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

        @Override // com.google.protobuf.ApiOrBuilder
        public int getOptionsCount() {
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder = this.optionsBuilder_;
            return repeatedFieldBuilder == null ? this.options_.size() : repeatedFieldBuilder.getCount();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public List<Option> getOptionsList() {
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder = this.optionsBuilder_;
            return repeatedFieldBuilder == null ? Collections.unmodifiableList(this.options_) : repeatedFieldBuilder.getMessageList();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public OptionOrBuilder getOptionsOrBuilder(int i10) {
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder = this.optionsBuilder_;
            return repeatedFieldBuilder == null ? this.options_.get(i10) : (OptionOrBuilder) repeatedFieldBuilder.getMessageOrBuilder(i10);
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public List<? extends OptionOrBuilder> getOptionsOrBuilderList() {
            RepeatedFieldBuilder<Option, Option.Builder, OptionOrBuilder> repeatedFieldBuilder = this.optionsBuilder_;
            return repeatedFieldBuilder != null ? repeatedFieldBuilder.getMessageOrBuilderList() : Collections.unmodifiableList(this.options_);
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public SourceContext getSourceContext() {
            SingleFieldBuilder<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilder = this.sourceContextBuilder_;
            if (singleFieldBuilder != null) {
                return (SourceContext) singleFieldBuilder.getMessage();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        public SourceContext.Builder getSourceContextBuilder() {
            this.bitField0_ |= 16;
            onChanged();
            return (SourceContext.Builder) internalGetSourceContextFieldBuilder().getBuilder();
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public SourceContextOrBuilder getSourceContextOrBuilder() {
            SingleFieldBuilder<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilder = this.sourceContextBuilder_;
            if (singleFieldBuilder != null) {
                return (SourceContextOrBuilder) singleFieldBuilder.getMessageOrBuilder();
            }
            SourceContext sourceContext = this.sourceContext_;
            return sourceContext == null ? SourceContext.getDefaultInstance() : sourceContext;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public Syntax getSyntax() {
            Syntax syntaxForNumber = Syntax.forNumber(this.syntax_);
            return syntaxForNumber == null ? Syntax.UNRECOGNIZED : syntaxForNumber;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public int getSyntaxValue() {
            return this.syntax_;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public String getVersion() {
            Object obj = this.version_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.version_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public ByteString getVersionBytes() {
            Object obj = this.version_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.version_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.ApiOrBuilder
        public boolean hasSourceContext() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder
        public GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return ApiProto.internal_static_google_protobuf_Api_fieldAccessorTable.ensureFieldAccessorsInitialized(Api.class, Builder.class);
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
            } else if ((this.bitField0_ & 16) == 0 || (sourceContext2 = this.sourceContext_) == null || sourceContext2 == SourceContext.getDefaultInstance()) {
                this.sourceContext_ = sourceContext;
            } else {
                getSourceContextBuilder().mergeFrom(sourceContext);
            }
            if (this.sourceContext_ != null) {
                this.bitField0_ |= 16;
                onChanged();
            }
            return this;
        }

        public Builder removeMethods(int i10) {
            RepeatedFieldBuilder<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilder = this.methodsBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.remove(i10);
                return this;
            }
            ensureMethodsIsMutable();
            this.methods_.remove(i10);
            onChanged();
            return this;
        }

        public Builder removeMixins(int i10) {
            RepeatedFieldBuilder<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilder = this.mixinsBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.remove(i10);
                return this;
            }
            ensureMixinsIsMutable();
            this.mixins_.remove(i10);
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

        public Builder setMethods(int i10, Method method) {
            RepeatedFieldBuilder<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilder = this.methodsBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.setMessage(i10, method);
                return this;
            }
            method.getClass();
            ensureMethodsIsMutable();
            this.methods_.set(i10, method);
            onChanged();
            return this;
        }

        public Builder setMixins(int i10, Mixin mixin) {
            RepeatedFieldBuilder<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilder = this.mixinsBuilder_;
            if (repeatedFieldBuilder != null) {
                repeatedFieldBuilder.setMessage(i10, mixin);
                return this;
            }
            mixin.getClass();
            ensureMixinsIsMutable();
            this.mixins_.set(i10, mixin);
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
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setSyntax(Syntax syntax) {
            syntax.getClass();
            this.bitField0_ |= 64;
            this.syntax_ = syntax.getNumber();
            onChanged();
            return this;
        }

        public Builder setSyntaxValue(int i10) {
            this.syntax_ = i10;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder setVersion(String str) {
            str.getClass();
            this.version_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setVersionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.version_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        private Builder() {
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.methods_ = list;
            this.options_ = list;
            this.version_ = "";
            this.mixins_ = list;
            this.syntax_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Api build() {
            Api apiBuildPartial = buildPartial();
            if (apiBuildPartial.isInitialized()) {
                return apiBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) apiBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Api buildPartial() {
            Api api = new Api(this);
            buildPartialRepeatedFields(api);
            if (this.bitField0_ != 0) {
                buildPartial0(api);
            }
            onBuilt();
            return api;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Api getDefaultInstanceForType() {
            return Api.getDefaultInstance();
        }

        public Method.Builder addMethodsBuilder(int i10) {
            return (Method.Builder) internalGetMethodsFieldBuilder().addBuilder(i10, Method.getDefaultInstance());
        }

        public Mixin.Builder addMixinsBuilder(int i10) {
            return (Mixin.Builder) internalGetMixinsFieldBuilder().addBuilder(i10, Mixin.getDefaultInstance());
        }

        public Option.Builder addOptionsBuilder(int i10) {
            return (Option.Builder) internalGetOptionsFieldBuilder().addBuilder(i10, Option.getDefaultInstance());
        }

        @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.name_ = "";
            RepeatedFieldBuilder<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilder = this.methodsBuilder_;
            if (repeatedFieldBuilder == null) {
                this.methods_ = Collections.EMPTY_LIST;
            } else {
                this.methods_ = null;
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
            this.version_ = "";
            this.sourceContext_ = null;
            SingleFieldBuilder<SourceContext, SourceContext.Builder, SourceContextOrBuilder> singleFieldBuilder = this.sourceContextBuilder_;
            if (singleFieldBuilder != null) {
                singleFieldBuilder.dispose();
                this.sourceContextBuilder_ = null;
            }
            RepeatedFieldBuilder<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilder3 = this.mixinsBuilder_;
            if (repeatedFieldBuilder3 == null) {
                this.mixins_ = Collections.EMPTY_LIST;
            } else {
                this.mixins_ = null;
                repeatedFieldBuilder3.clear();
            }
            this.bitField0_ &= -33;
            this.syntax_ = 0;
            return this;
        }

        public Builder addMethods(int i10, Method method) {
            RepeatedFieldBuilder<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilder = this.methodsBuilder_;
            if (repeatedFieldBuilder == null) {
                method.getClass();
                ensureMethodsIsMutable();
                this.methods_.add(i10, method);
                onChanged();
                return this;
            }
            repeatedFieldBuilder.addMessage(i10, method);
            return this;
        }

        public Builder addMixins(int i10, Mixin mixin) {
            RepeatedFieldBuilder<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilder = this.mixinsBuilder_;
            if (repeatedFieldBuilder == null) {
                mixin.getClass();
                ensureMixinsIsMutable();
                this.mixins_.add(i10, mixin);
                onChanged();
                return this;
            }
            repeatedFieldBuilder.addMessage(i10, mixin);
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
            if (message instanceof Api) {
                return mergeFrom((Api) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setMethods(int i10, Method.Builder builder) {
            RepeatedFieldBuilder<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilder = this.methodsBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureMethodsIsMutable();
                this.methods_.set(i10, builder.build());
                onChanged();
                return this;
            }
            repeatedFieldBuilder.setMessage(i10, builder.build());
            return this;
        }

        public Builder setMixins(int i10, Mixin.Builder builder) {
            RepeatedFieldBuilder<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilder = this.mixinsBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureMixinsIsMutable();
                this.mixins_.set(i10, builder.build());
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
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder mergeFrom(Api api) {
            if (api == Api.getDefaultInstance()) {
                return this;
            }
            if (!api.getName().isEmpty()) {
                this.name_ = api.name_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (this.methodsBuilder_ == null) {
                if (!api.methods_.isEmpty()) {
                    if (this.methods_.isEmpty()) {
                        this.methods_ = api.methods_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureMethodsIsMutable();
                        this.methods_.addAll(api.methods_);
                    }
                    onChanged();
                }
            } else if (!api.methods_.isEmpty()) {
                if (!this.methodsBuilder_.isEmpty()) {
                    this.methodsBuilder_.addAllMessages(api.methods_);
                } else {
                    this.methodsBuilder_.dispose();
                    this.methodsBuilder_ = null;
                    this.methods_ = api.methods_;
                    this.bitField0_ &= -3;
                    this.methodsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetMethodsFieldBuilder() : null;
                }
            }
            if (this.optionsBuilder_ == null) {
                if (!api.options_.isEmpty()) {
                    if (this.options_.isEmpty()) {
                        this.options_ = api.options_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureOptionsIsMutable();
                        this.options_.addAll(api.options_);
                    }
                    onChanged();
                }
            } else if (!api.options_.isEmpty()) {
                if (!this.optionsBuilder_.isEmpty()) {
                    this.optionsBuilder_.addAllMessages(api.options_);
                } else {
                    this.optionsBuilder_.dispose();
                    this.optionsBuilder_ = null;
                    this.options_ = api.options_;
                    this.bitField0_ &= -5;
                    this.optionsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetOptionsFieldBuilder() : null;
                }
            }
            if (!api.getVersion().isEmpty()) {
                this.version_ = api.version_;
                this.bitField0_ |= 8;
                onChanged();
            }
            if (api.hasSourceContext()) {
                mergeSourceContext(api.getSourceContext());
            }
            if (this.mixinsBuilder_ == null) {
                if (!api.mixins_.isEmpty()) {
                    if (this.mixins_.isEmpty()) {
                        this.mixins_ = api.mixins_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureMixinsIsMutable();
                        this.mixins_.addAll(api.mixins_);
                    }
                    onChanged();
                }
            } else if (!api.mixins_.isEmpty()) {
                if (!this.mixinsBuilder_.isEmpty()) {
                    this.mixinsBuilder_.addAllMessages(api.mixins_);
                } else {
                    this.mixinsBuilder_.dispose();
                    this.mixinsBuilder_ = null;
                    this.mixins_ = api.mixins_;
                    this.bitField0_ &= -33;
                    this.mixinsBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? internalGetMixinsFieldBuilder() : null;
                }
            }
            if (api.syntax_ != 0) {
                setSyntaxValue(api.getSyntaxValue());
            }
            mergeUnknownFields(api.getUnknownFields());
            onChanged();
            return this;
        }

        private Builder(AbstractMessage.BuilderParent builderParent) {
            super(builderParent);
            this.name_ = "";
            List list = Collections.EMPTY_LIST;
            this.methods_ = list;
            this.options_ = list;
            this.version_ = "";
            this.mixins_ = list;
            this.syntax_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder addMethods(Method.Builder builder) {
            RepeatedFieldBuilder<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilder = this.methodsBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureMethodsIsMutable();
                this.methods_.add(builder.build());
                onChanged();
                return this;
            }
            repeatedFieldBuilder.addMessage(builder.build());
            return this;
        }

        public Builder addMixins(Mixin.Builder builder) {
            RepeatedFieldBuilder<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilder = this.mixinsBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureMixinsIsMutable();
                this.mixins_.add(builder.build());
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

        public Builder addMethods(int i10, Method.Builder builder) {
            RepeatedFieldBuilder<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilder = this.methodsBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureMethodsIsMutable();
                this.methods_.add(i10, builder.build());
                onChanged();
                return this;
            }
            repeatedFieldBuilder.addMessage(i10, builder.build());
            return this;
        }

        public Builder addMixins(int i10, Mixin.Builder builder) {
            RepeatedFieldBuilder<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilder = this.mixinsBuilder_;
            if (repeatedFieldBuilder == null) {
                ensureMixinsIsMutable();
                this.mixins_.add(i10, builder.build());
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
                                Method method = (Method) codedInputStream.readMessage(Method.parser(), extensionRegistryLite);
                                RepeatedFieldBuilder<Method, Method.Builder, MethodOrBuilder> repeatedFieldBuilder = this.methodsBuilder_;
                                if (repeatedFieldBuilder == null) {
                                    ensureMethodsIsMutable();
                                    this.methods_.add(method);
                                } else {
                                    repeatedFieldBuilder.addMessage(method);
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
                                this.version_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 8;
                            } else if (tag == 42) {
                                codedInputStream.readMessage(internalGetSourceContextFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 16;
                            } else if (tag == 50) {
                                Mixin mixin = (Mixin) codedInputStream.readMessage(Mixin.parser(), extensionRegistryLite);
                                RepeatedFieldBuilder<Mixin, Mixin.Builder, MixinOrBuilder> repeatedFieldBuilder3 = this.mixinsBuilder_;
                                if (repeatedFieldBuilder3 == null) {
                                    ensureMixinsIsMutable();
                                    this.mixins_.add(mixin);
                                } else {
                                    repeatedFieldBuilder3.addMessage(mixin);
                                }
                            } else if (tag != 56) {
                                if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.syntax_ = codedInputStream.readEnum();
                                this.bitField0_ |= 64;
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

    private Api(GeneratedMessage.Builder<?> builder) {
        super(builder);
        this.name_ = "";
        this.version_ = "";
        this.syntax_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(Api api) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(api);
    }

    public static Api parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Api parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Api) GeneratedMessage.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Api parseFrom(ByteString byteString) {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Api getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Api parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Api parseFrom(byte[] bArr) {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.AbstractMessage
    public Builder newBuilderForType(AbstractMessage.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static Api parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    private Api() {
        this.name_ = "";
        this.version_ = "";
        this.syntax_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.name_ = "";
        List list = Collections.EMPTY_LIST;
        this.methods_ = list;
        this.options_ = list;
        this.version_ = "";
        this.mixins_ = list;
        this.syntax_ = 0;
    }

    public static Api parseFrom(InputStream inputStream) {
        return (Api) GeneratedMessage.parseWithIOException(PARSER, inputStream);
    }

    public static Api parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Api) GeneratedMessage.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Api parseFrom(CodedInputStream codedInputStream) {
        return (Api) GeneratedMessage.parseWithIOException(PARSER, codedInputStream);
    }

    public static Api parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Api) GeneratedMessage.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
