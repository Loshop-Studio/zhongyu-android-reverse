package com.google.protobuf;

import androidx.collection.SieveCacheKt;
import anetwork.channel.util.RequestConstant;
import com.alibaba.android.arouter.utils.Consts;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.protobuf.Descriptors;
import com.google.protobuf.DynamicMessage;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.Message;
import com.google.protobuf.MessageReflection;
import com.google.protobuf.TextFormatParseInfoTree;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.lang.Character;
import java.math.BigInteger;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes5.dex */
public final class TextFormat {
    private static final String DEBUG_STRING_SILENT_MARKER = " \t ";
    private static final String REDACTED_MARKER = "[REDACTED]";
    private static final Logger logger = Logger.getLogger(TextFormat.class.getName());
    private static final Parser PARSER = Parser.newBuilder().build();

    /* renamed from: com.google.protobuf.TextFormat$1 */
    public static /* synthetic */ class C71821 {

        /* renamed from: $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType */
        static final /* synthetic */ int[] f11153xdde82548;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.Type.values().length];
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.Type.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SINT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SFIXED32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.INT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SINT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SFIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.DOUBLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.STRING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.ENUM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.GROUP.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[Descriptors.FieldDescriptor.JavaType.values().length];
            f11153xdde82548 = iArr2;
            try {
                iArr2[Descriptors.FieldDescriptor.JavaType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f11153xdde82548[Descriptors.FieldDescriptor.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f11153xdde82548[Descriptors.FieldDescriptor.JavaType.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f11153xdde82548[Descriptors.FieldDescriptor.JavaType.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public static class InvalidEscapeSequenceException extends IOException {
        private static final long serialVersionUID = -8164033650142593304L;

        public InvalidEscapeSequenceException(String str) {
            super(str);
        }
    }

    public static class ParseException extends IOException {
        private static final long serialVersionUID = 3196188060225107702L;
        private final int column;
        private final int line;

        public ParseException(String str) {
            this(-1, -1, str);
        }

        public int getColumn() {
            return this.column;
        }

        public int getLine() {
            return this.line;
        }

        public ParseException(int i10, int i11, String str) {
            super(Integer.toString(i10) + ":" + i11 + ": " + str);
            this.line = i10;
            this.column = i11;
        }
    }

    public static class Parser {
        private static final int BUFFER_SIZE = 4096;
        private final boolean allowUnknownEnumValues;
        private final boolean allowUnknownExtensions;
        private final boolean allowUnknownFields;
        private TextFormatParseInfoTree.Builder parseInfoTreeBuilder;
        private final int recursionLimit;
        private final SingularOverwritePolicy singularOverwritePolicy;
        private final TypeRegistry typeRegistry;

        public static class Builder {
            private boolean allowUnknownFields = false;
            private boolean allowUnknownEnumValues = false;
            private boolean allowUnknownExtensions = false;
            private SingularOverwritePolicy singularOverwritePolicy = SingularOverwritePolicy.ALLOW_SINGULAR_OVERWRITES;
            private TextFormatParseInfoTree.Builder parseInfoTreeBuilder = null;
            private TypeRegistry typeRegistry = TypeRegistry.getEmptyTypeRegistry();
            private int recursionLimit = 100;

            public Parser build() {
                return new Parser(this.typeRegistry, this.allowUnknownFields, this.allowUnknownEnumValues, this.allowUnknownExtensions, this.singularOverwritePolicy, this.parseInfoTreeBuilder, this.recursionLimit, null);
            }

            public Builder setAllowUnknownExtensions(boolean z10) {
                this.allowUnknownExtensions = z10;
                return this;
            }

            public Builder setAllowUnknownFields(boolean z10) {
                this.allowUnknownFields = z10;
                return this;
            }

            public Builder setParseInfoTreeBuilder(TextFormatParseInfoTree.Builder builder) {
                this.parseInfoTreeBuilder = builder;
                return this;
            }

            public Builder setRecursionLimit(int i10) {
                this.recursionLimit = i10;
                return this;
            }

            public Builder setSingularOverwritePolicy(SingularOverwritePolicy singularOverwritePolicy) {
                this.singularOverwritePolicy = singularOverwritePolicy;
                return this;
            }

            public Builder setTypeRegistry(TypeRegistry typeRegistry) {
                this.typeRegistry = typeRegistry;
                return this;
            }
        }

        public enum SingularOverwritePolicy {
            ALLOW_SINGULAR_OVERWRITES,
            FORBID_SINGULAR_OVERWRITES
        }

        public static final class UnknownField {
            final String message;
            final Type type;

            public enum Type {
                FIELD,
                EXTENSION
            }

            public UnknownField(String str, Type type) {
                this.message = str;
                this.type = type;
            }
        }

        public /* synthetic */ Parser(TypeRegistry typeRegistry, boolean z10, boolean z11, boolean z12, SingularOverwritePolicy singularOverwritePolicy, TextFormatParseInfoTree.Builder builder, int i10, C71821 c71821) {
            this(typeRegistry, z10, z11, z12, singularOverwritePolicy, builder, i10);
        }

        private void checkUnknownFields(List<UnknownField> list) throws ParseException {
            int i10;
            if (list.isEmpty()) {
                return;
            }
            StringBuilder sb2 = new StringBuilder("Input contains unknown fields and/or extensions:");
            for (UnknownField unknownField : list) {
                sb2.append('\n');
                sb2.append(unknownField.message);
            }
            if (this.allowUnknownFields) {
                TextFormat.logger.warning(sb2.toString());
                return;
            }
            if (this.allowUnknownExtensions) {
                Iterator<UnknownField> it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (it.next().type != UnknownField.Type.FIELD) {
                        i10++;
                    }
                }
                TextFormat.logger.warning(sb2.toString());
                return;
            }
            i10 = 0;
            String[] strArrSplit = list.get(i10).message.split(":");
            throw new ParseException(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), sb2.toString());
        }

        private void consumeFieldValue(Tokenizer tokenizer, ExtensionRegistry extensionRegistry, MessageReflection.MergeTarget mergeTarget, Descriptors.FieldDescriptor fieldDescriptor, ExtensionRegistry.ExtensionInfo extensionInfo, TextFormatParseInfoTree.Builder builder, List<UnknownField> list, int i10) throws ParseException {
            String str;
            if (this.singularOverwritePolicy == SingularOverwritePolicy.FORBID_SINGULAR_OVERWRITES && !fieldDescriptor.isRepeated()) {
                if (mergeTarget.hasField(fieldDescriptor)) {
                    throw tokenizer.parseExceptionPreviousToken("Non-repeated field \"" + fieldDescriptor.getFullName() + "\" cannot be overwritten.");
                }
                if (fieldDescriptor.getContainingOneof() != null && mergeTarget.hasOneof(fieldDescriptor.getContainingOneof())) {
                    Descriptors.OneofDescriptor containingOneof = fieldDescriptor.getContainingOneof();
                    throw tokenizer.parseExceptionPreviousToken("Field \"" + fieldDescriptor.getFullName() + "\" is specified along with field \"" + mergeTarget.getOneofFieldDescriptor(containingOneof).getFullName() + "\", another member of oneof \"" + containingOneof.getName() + "\".");
                }
            }
            Object objValueOf = null;
            if (fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                switch (C71821.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[fieldDescriptor.getType().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        objValueOf = Integer.valueOf(tokenizer.consumeInt32());
                        break;
                    case 4:
                    case 5:
                    case 6:
                        objValueOf = Long.valueOf(tokenizer.consumeInt64());
                        break;
                    case 7:
                        objValueOf = Boolean.valueOf(tokenizer.consumeBoolean());
                        break;
                    case 8:
                        objValueOf = Float.valueOf(tokenizer.consumeFloat());
                        break;
                    case 9:
                        objValueOf = Double.valueOf(tokenizer.consumeDouble());
                        break;
                    case 10:
                    case 11:
                        objValueOf = Integer.valueOf(tokenizer.consumeUInt32());
                        break;
                    case 12:
                    case 13:
                        objValueOf = Long.valueOf(tokenizer.consumeUInt64());
                        break;
                    case 14:
                        objValueOf = tokenizer.consumeString();
                        break;
                    case 15:
                        objValueOf = tokenizer.consumeByteString();
                        break;
                    case 16:
                        Descriptors.EnumDescriptor enumType = fieldDescriptor.getEnumType();
                        if (tokenizer.lookingAtInteger()) {
                            int iConsumeInt32 = tokenizer.consumeInt32();
                            objValueOf = enumType.isClosed() ? enumType.findValueByNumber(iConsumeInt32) : enumType.findValueByNumberCreatingIfUnknown(iConsumeInt32);
                            if (objValueOf == null) {
                                String str2 = "Enum type \"" + enumType.getFullName() + "\" has no value with number " + iConsumeInt32 + '.';
                                if (this.allowUnknownEnumValues) {
                                    TextFormat.logger.warning(str2);
                                    return;
                                }
                                throw tokenizer.parseExceptionPreviousToken("Enum type \"" + enumType.getFullName() + "\" has no value with number " + iConsumeInt32 + '.');
                            }
                        } else {
                            String strConsumeIdentifier = tokenizer.consumeIdentifier();
                            objValueOf = enumType.findValueByName(strConsumeIdentifier);
                            if (objValueOf == null) {
                                String str3 = "Enum type \"" + enumType.getFullName() + "\" has no value named \"" + strConsumeIdentifier + "\".";
                                if (!this.allowUnknownEnumValues) {
                                    throw tokenizer.parseExceptionPreviousToken(str3);
                                }
                                TextFormat.logger.warning(str3);
                                return;
                            }
                        }
                        break;
                    case 17:
                    case 18:
                        throw new RuntimeException("Can't get here.");
                }
            } else {
                if (i10 < 1) {
                    throw tokenizer.parseException("Message is nested too deep");
                }
                if (tokenizer.tryConsume("<")) {
                    str = ">";
                } else {
                    tokenizer.consume("{");
                    str = "}";
                }
                String str4 = str;
                MessageReflection.MergeTarget mergeTargetNewMergeTargetForField = mergeTarget.newMergeTargetForField(fieldDescriptor, extensionInfo != null ? extensionInfo.defaultInstance : null);
                while (!tokenizer.tryConsume(str4)) {
                    if (tokenizer.atEnd()) {
                        throw tokenizer.parseException("Expected \"" + str4 + "\".");
                    }
                    mergeField(tokenizer, extensionRegistry, mergeTargetNewMergeTargetForField, builder, list, i10 - 1);
                }
                objValueOf = mergeTargetNewMergeTargetForField.finish();
            }
            if (fieldDescriptor.isRepeated()) {
                mergeTarget.addRepeatedField(fieldDescriptor, objValueOf);
            } else {
                mergeTarget.setField(fieldDescriptor, objValueOf);
            }
        }

        private void consumeFieldValues(Tokenizer tokenizer, ExtensionRegistry extensionRegistry, MessageReflection.MergeTarget mergeTarget, Descriptors.FieldDescriptor fieldDescriptor, ExtensionRegistry.ExtensionInfo extensionInfo, TextFormatParseInfoTree.Builder builder, List<UnknownField> list, int i10) throws ParseException {
            if (!fieldDescriptor.isRepeated() || !tokenizer.tryConsume("[")) {
                consumeFieldValue(tokenizer, extensionRegistry, mergeTarget, fieldDescriptor, extensionInfo, builder, list, i10);
            } else {
                if (tokenizer.tryConsume("]")) {
                    return;
                }
                while (true) {
                    consumeFieldValue(tokenizer, extensionRegistry, mergeTarget, fieldDescriptor, extensionInfo, builder, list, i10);
                    if (tokenizer.tryConsume("]")) {
                        return;
                    } else {
                        tokenizer.consume(",");
                    }
                }
            }
        }

        private String consumeFullTypeName(Tokenizer tokenizer) throws ParseException {
            if (!tokenizer.tryConsume("[")) {
                return tokenizer.consumeIdentifier();
            }
            String strConsumeIdentifier = tokenizer.consumeIdentifier();
            while (tokenizer.tryConsume(Consts.DOT)) {
                strConsumeIdentifier = strConsumeIdentifier + Consts.DOT + tokenizer.consumeIdentifier();
            }
            if (tokenizer.tryConsume(MqttTopic.TOPIC_LEVEL_SEPARATOR)) {
                strConsumeIdentifier = strConsumeIdentifier + MqttTopic.TOPIC_LEVEL_SEPARATOR + tokenizer.consumeIdentifier();
                while (tokenizer.tryConsume(Consts.DOT)) {
                    strConsumeIdentifier = strConsumeIdentifier + Consts.DOT + tokenizer.consumeIdentifier();
                }
            }
            tokenizer.consume("]");
            return strConsumeIdentifier;
        }

        private void detectSilentMarker(Tokenizer tokenizer, Descriptors.Descriptor descriptor, String str) {
        }

        private void guessFieldTypeAndSkip(Tokenizer tokenizer, Descriptors.Descriptor descriptor, int i10) throws ParseException {
            boolean zTryConsume = tokenizer.tryConsume(":");
            if (tokenizer.lookingAt("[")) {
                skipFieldShortFormedRepeated(tokenizer, zTryConsume, descriptor, i10);
                return;
            }
            if (zTryConsume && !tokenizer.lookingAt("{") && !tokenizer.lookingAt("<")) {
                skipFieldValue(tokenizer);
            } else {
                if (i10 < 1) {
                    throw tokenizer.parseException("Message is nested too deep");
                }
                skipFieldMessage(tokenizer, descriptor, i10 - 1);
            }
        }

        private void mergeAnyFieldValue(Tokenizer tokenizer, ExtensionRegistry extensionRegistry, MessageReflection.MergeTarget mergeTarget, TextFormatParseInfoTree.Builder builder, List<UnknownField> list, Descriptors.Descriptor descriptor, int i10) throws ParseException {
            String str;
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                sb2.append(tokenizer.consumeIdentifier());
                if (tokenizer.tryConsume("]")) {
                    detectSilentMarker(tokenizer, descriptor, sb2.toString());
                    tokenizer.tryConsume(":");
                    if (tokenizer.tryConsume("<")) {
                        str = ">";
                    } else {
                        tokenizer.consume("{");
                        str = "}";
                    }
                    String string = sb2.toString();
                    try {
                        Descriptors.Descriptor descriptorForTypeUrl = this.typeRegistry.getDescriptorForTypeUrl(string);
                        if (descriptorForTypeUrl == null) {
                            throw tokenizer.parseException("Unable to parse Any of type: " + string + ". Please make sure that the TypeRegistry contains the descriptors for the given types.");
                        }
                        DynamicMessage.Builder builderNewBuilderForType = DynamicMessage.getDefaultInstance(descriptorForTypeUrl).newBuilderForType();
                        MessageReflection.BuilderAdapter builderAdapter = new MessageReflection.BuilderAdapter(builderNewBuilderForType);
                        while (!tokenizer.tryConsume(str)) {
                            mergeField(tokenizer, extensionRegistry, builderAdapter, builder, list, i10);
                        }
                        mergeTarget.setField(descriptor.findFieldByName("type_url"), sb2.toString());
                        mergeTarget.setField(descriptor.findFieldByName("value"), builderNewBuilderForType.build().toByteString());
                        return;
                    } catch (InvalidProtocolBufferException unused) {
                        throw tokenizer.parseException("Invalid valid type URL. Found: " + string);
                    }
                }
                if (tokenizer.tryConsume(MqttTopic.TOPIC_LEVEL_SEPARATOR)) {
                    sb2.append(MqttTopic.TOPIC_LEVEL_SEPARATOR);
                } else {
                    if (!tokenizer.tryConsume(Consts.DOT)) {
                        throw tokenizer.parseExceptionPreviousToken("Expected a valid type URL.");
                    }
                    sb2.append(Consts.DOT);
                }
            }
        }

        private void mergeField(Tokenizer tokenizer, ExtensionRegistry extensionRegistry, MessageReflection.MergeTarget mergeTarget, List<UnknownField> list, int i10) throws ParseException {
            mergeField(tokenizer, extensionRegistry, mergeTarget, this.parseInfoTreeBuilder, list, i10);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        private void skipField(Tokenizer tokenizer, Descriptors.Descriptor descriptor, int i10) {
            detectSilentMarker(tokenizer, descriptor, consumeFullTypeName(tokenizer));
            guessFieldTypeAndSkip(tokenizer, descriptor, i10);
            if (tokenizer.tryConsume(";")) {
                return;
            }
            tokenizer.tryConsume(",");
        }

        private void skipFieldMessage(Tokenizer tokenizer, Descriptors.Descriptor descriptor, int i10) throws ParseException {
            String str;
            if (tokenizer.tryConsume("<")) {
                str = ">";
            } else {
                tokenizer.consume("{");
                str = "}";
            }
            while (!tokenizer.lookingAt(">") && !tokenizer.lookingAt("}")) {
                skipField(tokenizer, descriptor, i10);
            }
            tokenizer.consume(str);
        }

        private void skipFieldShortFormedRepeated(Tokenizer tokenizer, boolean z10, Descriptors.Descriptor descriptor, int i10) throws ParseException {
            if (!tokenizer.tryConsume("[") || tokenizer.tryConsume("]")) {
                return;
            }
            while (true) {
                if (tokenizer.lookingAt("{") || tokenizer.lookingAt("<")) {
                    if (i10 < 1) {
                        throw tokenizer.parseException("Message is nested too deep");
                    }
                    skipFieldMessage(tokenizer, descriptor, i10 - 1);
                } else {
                    if (!z10) {
                        throw tokenizer.parseException("Invalid repeated scalar field: missing \":\" before \"[\".");
                    }
                    skipFieldValue(tokenizer);
                }
                if (tokenizer.tryConsume("]")) {
                    return;
                } else {
                    tokenizer.consume(",");
                }
            }
        }

        private void skipFieldValue(Tokenizer tokenizer) throws ParseException {
            if (tokenizer.tryConsumeByteString() || tokenizer.tryConsumeIdentifier() || tokenizer.tryConsumeInt64() || tokenizer.tryConsumeUInt64() || tokenizer.tryConsumeDouble() || tokenizer.tryConsumeFloat()) {
                return;
            }
            throw tokenizer.parseException("Invalid field value: " + tokenizer.currentToken);
        }

        private static StringBuilder toStringBuilder(Readable readable) throws IOException {
            StringBuilder sb2 = new StringBuilder();
            CharBuffer charBufferAllocate = CharBuffer.allocate(4096);
            while (true) {
                int i10 = readable.read(charBufferAllocate);
                if (i10 == -1) {
                    return sb2;
                }
                Java8Compatibility.flip(charBufferAllocate);
                sb2.append((CharSequence) charBufferAllocate, 0, i10);
            }
        }

        public void merge(Readable readable, Message.Builder builder) throws ParseException {
            merge(readable, ExtensionRegistry.getEmptyRegistry(), builder);
        }

        private Parser(TypeRegistry typeRegistry, boolean z10, boolean z11, boolean z12, SingularOverwritePolicy singularOverwritePolicy, TextFormatParseInfoTree.Builder builder, int i10) {
            this.typeRegistry = typeRegistry;
            this.allowUnknownFields = z10;
            this.allowUnknownEnumValues = z11;
            this.allowUnknownExtensions = z12;
            this.singularOverwritePolicy = singularOverwritePolicy;
            this.parseInfoTreeBuilder = builder;
            this.recursionLimit = i10;
        }

        private void mergeField(Tokenizer tokenizer, ExtensionRegistry extensionRegistry, MessageReflection.MergeTarget mergeTarget, TextFormatParseInfoTree.Builder builder, List<UnknownField> list, int i10) throws ParseException {
            ExtensionRegistry extensionRegistry2;
            String strConsumeIdentifier;
            Descriptors.FieldDescriptor fieldDescriptor;
            ExtensionRegistry.ExtensionInfo extensionInfoFindExtensionByName;
            TextFormatParseInfoTree.Builder builder2;
            Descriptors.FieldDescriptor fieldDescriptor2;
            Tokenizer tokenizer2 = tokenizer;
            int line = tokenizer2.getLine();
            int column = tokenizer2.getColumn();
            Descriptors.Descriptor descriptorForType = mergeTarget.getDescriptorForType();
            if ("google.protobuf.Any".equals(descriptorForType.getFullName()) && tokenizer2.tryConsume("[")) {
                if (i10 < 1) {
                    throw tokenizer2.parseException("Message is nested too deep");
                }
                mergeAnyFieldValue(tokenizer2, extensionRegistry, mergeTarget, builder, list, descriptorForType, i10 - 1);
                return;
            }
            if (tokenizer2.tryConsume("[")) {
                StringBuilder sb2 = new StringBuilder(tokenizer2.consumeIdentifier());
                while (tokenizer2.tryConsume(Consts.DOT)) {
                    sb2.append('.');
                    sb2.append(tokenizer2.consumeIdentifier());
                }
                strConsumeIdentifier = sb2.toString();
                extensionRegistry2 = extensionRegistry;
                extensionInfoFindExtensionByName = mergeTarget.findExtensionByName(extensionRegistry2, strConsumeIdentifier);
                if (extensionInfoFindExtensionByName == null) {
                    list.add(new UnknownField((tokenizer2.getPreviousLine() + 1) + ":" + (tokenizer2.getPreviousColumn() + 1) + ":\t" + descriptorForType.getFullName() + ".[" + strConsumeIdentifier + "]", UnknownField.Type.EXTENSION));
                    fieldDescriptor2 = null;
                } else {
                    if (extensionInfoFindExtensionByName.descriptor.getContainingType() != descriptorForType) {
                        throw tokenizer2.parseExceptionPreviousToken("Extension \"" + strConsumeIdentifier + "\" does not extend message type \"" + descriptorForType.getFullName() + "\".");
                    }
                    fieldDescriptor2 = extensionInfoFindExtensionByName.descriptor;
                }
                tokenizer2.consume("]");
                fieldDescriptor = fieldDescriptor2;
            } else {
                extensionRegistry2 = extensionRegistry;
                strConsumeIdentifier = tokenizer2.consumeIdentifier();
                Descriptors.FieldDescriptor fieldDescriptorFindFieldByName = descriptorForType.findFieldByName(strConsumeIdentifier);
                if (fieldDescriptorFindFieldByName == null) {
                    fieldDescriptorFindFieldByName = descriptorForType.findFieldByName(strConsumeIdentifier.toLowerCase(Locale.US));
                    if (fieldDescriptorFindFieldByName != null && !fieldDescriptorFindFieldByName.isGroupLike()) {
                        fieldDescriptorFindFieldByName = null;
                    }
                    if (fieldDescriptorFindFieldByName != null && !fieldDescriptorFindFieldByName.getMessageType().getName().equals(strConsumeIdentifier)) {
                        fieldDescriptorFindFieldByName = null;
                    }
                }
                if (fieldDescriptorFindFieldByName == null) {
                    list.add(new UnknownField((tokenizer2.getPreviousLine() + 1) + ":" + (tokenizer2.getPreviousColumn() + 1) + ":\t" + descriptorForType.getFullName() + Consts.DOT + strConsumeIdentifier, UnknownField.Type.FIELD));
                }
                fieldDescriptor = fieldDescriptorFindFieldByName;
                extensionInfoFindExtensionByName = null;
            }
            if (fieldDescriptor == null) {
                detectSilentMarker(tokenizer2, descriptorForType, strConsumeIdentifier);
                guessFieldTypeAndSkip(tokenizer2, descriptorForType, i10);
                return;
            }
            if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                detectSilentMarker(tokenizer2, descriptorForType, fieldDescriptor.getFullName());
                tokenizer2.tryConsume(":");
                if (builder != null) {
                    consumeFieldValues(tokenizer2, extensionRegistry2, mergeTarget, fieldDescriptor, extensionInfoFindExtensionByName, builder.getBuilderForSubMessageField(fieldDescriptor), list, i10);
                    tokenizer2 = tokenizer;
                    builder2 = builder;
                } else {
                    consumeFieldValues(tokenizer2, extensionRegistry2, mergeTarget, fieldDescriptor, extensionInfoFindExtensionByName, builder, list, i10);
                    builder2 = builder;
                }
            } else {
                detectSilentMarker(tokenizer2, descriptorForType, fieldDescriptor.getFullName());
                tokenizer2.consume(":");
                builder2 = builder;
                consumeFieldValues(tokenizer2, extensionRegistry, mergeTarget, fieldDescriptor, extensionInfoFindExtensionByName, builder2, list, i10);
            }
            if (builder2 != null) {
                builder2.setLocation(fieldDescriptor, TextFormatParseLocation.create(line, column));
            }
            if (tokenizer2.tryConsume(";")) {
                return;
            }
            tokenizer2.tryConsume(",");
        }

        public void merge(CharSequence charSequence, Message.Builder builder) throws ParseException {
            merge(charSequence, ExtensionRegistry.getEmptyRegistry(), builder);
        }

        public void merge(Readable readable, ExtensionRegistry extensionRegistry, Message.Builder builder) throws ParseException {
            merge(toStringBuilder(readable), extensionRegistry, builder);
        }

        public void merge(CharSequence charSequence, ExtensionRegistry extensionRegistry, Message.Builder builder) throws ParseException {
            Tokenizer tokenizer = new Tokenizer(charSequence, null);
            MessageReflection.BuilderAdapter builderAdapter = new MessageReflection.BuilderAdapter(builder);
            ArrayList arrayList = new ArrayList();
            while (!tokenizer.atEnd()) {
                mergeField(tokenizer, extensionRegistry, builderAdapter, arrayList, this.recursionLimit);
            }
            checkUnknownFields(arrayList);
        }
    }

    public static final class Printer {
        private final boolean enablingSafeDebugFormat;
        private final boolean escapeNonAscii;
        private final ExtensionRegistryLite extensionRegistry;
        private final boolean singleLine;
        private final TypeRegistry typeRegistry;
        private final boolean useShortRepeatedPrimitives;
        private static final Printer DEFAULT_TEXT_FORMAT = new Printer(true, false, TypeRegistry.getEmptyTypeRegistry(), ExtensionRegistryLite.getEmptyRegistry(), false, false);
        private static final Printer DEFAULT_DEBUG_FORMAT = new Printer(true, false, TypeRegistry.getEmptyTypeRegistry(), ExtensionRegistryLite.getEmptyRegistry(), true, false);
        private static final ThreadLocal<FieldReporterLevel> sensitiveFieldReportingLevel = new ThreadLocal<FieldReporterLevel>() { // from class: com.google.protobuf.TextFormat.Printer.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.lang.ThreadLocal
            public FieldReporterLevel initialValue() {
                return FieldReporterLevel.ABSTRACT_TO_STRING;
            }
        };

        public enum FieldReporterLevel {
            REPORT_ALL(0),
            TEXT_GENERATOR(1),
            PRINT(2),
            PRINTER_PRINT_TO_STRING(3),
            TEXTFORMAT_PRINT_TO_STRING(4),
            PRINT_UNICODE(5),
            SHORT_DEBUG_STRING(6),
            LEGACY_MULTILINE(7),
            LEGACY_SINGLE_LINE(8),
            DEBUG_MULTILINE(9),
            DEBUG_SINGLE_LINE(10),
            ABSTRACT_TO_STRING(11),
            ABSTRACT_BUILDER_TO_STRING(12),
            ABSTRACT_MUTABLE_TO_STRING(13),
            REPORT_NONE(14);

            private final int index;

            FieldReporterLevel(int i10) {
                this.index = i10;
            }
        }

        public static class MapEntryAdapter implements Comparable<MapEntryAdapter> {
            private Object entry;
            private final Descriptors.FieldDescriptor keyField;
            private Message messageEntry;

            public MapEntryAdapter(Object obj, Descriptors.FieldDescriptor fieldDescriptor) {
                if (obj instanceof Message) {
                    this.messageEntry = (Message) obj;
                } else {
                    this.entry = obj;
                }
                this.keyField = fieldDescriptor.getMessageType().findFieldByName("key");
            }

            public Object getEntry() {
                Message message = this.messageEntry;
                return message != null ? message : this.entry;
            }

            public Object getKey() {
                Descriptors.FieldDescriptor fieldDescriptor;
                Message message = this.messageEntry;
                if (message == null || (fieldDescriptor = this.keyField) == null) {
                    return null;
                }
                return message.getField(fieldDescriptor);
            }

            @Override // java.lang.Comparable
            public int compareTo(MapEntryAdapter mapEntryAdapter) {
                Object key = getKey();
                Object key2 = mapEntryAdapter.getKey();
                if (key == null && key2 == null) {
                    return 0;
                }
                if (key == null) {
                    return -1;
                }
                if (key2 == null) {
                    return 1;
                }
                int i10 = C71821.f11153xdde82548[this.keyField.getJavaType().ordinal()];
                if (i10 == 1) {
                    return ((Boolean) key).compareTo((Boolean) key2);
                }
                if (i10 == 2) {
                    return ((Long) key).compareTo((Long) key2);
                }
                if (i10 == 3) {
                    return ((Integer) key).compareTo((Integer) key2);
                }
                if (i10 != 4) {
                    return 0;
                }
                return ((String) key).compareTo((String) key2);
            }
        }

        private Printer(boolean z10, boolean z11, TypeRegistry typeRegistry, ExtensionRegistryLite extensionRegistryLite, boolean z12, boolean z13) {
            this.escapeNonAscii = z10;
            this.useShortRepeatedPrimitives = z11;
            this.typeRegistry = typeRegistry;
            this.extensionRegistry = extensionRegistryLite;
            this.enablingSafeDebugFormat = z12;
            this.singleLine = z13;
        }

        private void applyUnstablePrefix(Appendable appendable) throws IOException {
            try {
                appendable.append("");
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        private boolean printAny(MessageOrBuilder messageOrBuilder, TextGenerator textGenerator) throws IOException {
            Descriptors.Descriptor descriptorForType = messageOrBuilder.getDescriptorForType();
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByNumber = descriptorForType.findFieldByNumber(1);
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByNumber2 = descriptorForType.findFieldByNumber(2);
            if (fieldDescriptorFindFieldByNumber != null && fieldDescriptorFindFieldByNumber.getType() == Descriptors.FieldDescriptor.Type.STRING && fieldDescriptorFindFieldByNumber2 != null && fieldDescriptorFindFieldByNumber2.getType() == Descriptors.FieldDescriptor.Type.BYTES) {
                String str = (String) messageOrBuilder.getField(fieldDescriptorFindFieldByNumber);
                if (str.isEmpty()) {
                    return false;
                }
                Object field = messageOrBuilder.getField(fieldDescriptorFindFieldByNumber2);
                try {
                    Descriptors.Descriptor descriptorForTypeUrl = this.typeRegistry.getDescriptorForTypeUrl(str);
                    if (descriptorForTypeUrl == null) {
                        return false;
                    }
                    DynamicMessage.Builder builderNewBuilderForType = DynamicMessage.getDefaultInstance(descriptorForTypeUrl).newBuilderForType();
                    builderNewBuilderForType.mergeFrom((ByteString) field, this.extensionRegistry);
                    textGenerator.print("[");
                    textGenerator.print(str);
                    textGenerator.print("] {");
                    textGenerator.eol();
                    textGenerator.indent();
                    print(builderNewBuilderForType, textGenerator);
                    textGenerator.outdent();
                    textGenerator.print("}");
                    textGenerator.eol();
                    return true;
                } catch (InvalidProtocolBufferException unused) {
                }
            }
            return false;
        }

        private void printMessage(MessageOrBuilder messageOrBuilder, TextGenerator textGenerator) throws IOException {
            for (Map.Entry<Descriptors.FieldDescriptor, Object> entry : messageOrBuilder.getAllFields().entrySet()) {
                printField(entry.getKey(), entry.getValue(), textGenerator);
            }
            printUnknownFields(messageOrBuilder.getUnknownFields(), textGenerator, this.enablingSafeDebugFormat);
        }

        private void printShortRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            textGenerator.print(fieldDescriptor.getName());
            textGenerator.print(": ");
            textGenerator.print("[");
            String str = "";
            for (Object obj2 : (List) obj) {
                textGenerator.print(str);
                printFieldValue(fieldDescriptor, obj2, textGenerator);
                str = ", ";
            }
            textGenerator.print("]");
            textGenerator.eol();
        }

        private void printSingleField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            if (fieldDescriptor.isExtension()) {
                textGenerator.print("[");
                if (fieldDescriptor.getContainingType().getOptions().getMessageSetWireFormat() && fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && fieldDescriptor.isOptional() && fieldDescriptor.getExtensionScope() == fieldDescriptor.getMessageType()) {
                    textGenerator.print(fieldDescriptor.getMessageType().getFullName());
                } else {
                    textGenerator.print(fieldDescriptor.getFullName());
                }
                textGenerator.print("]");
            } else if (fieldDescriptor.isGroupLike()) {
                textGenerator.print(fieldDescriptor.getMessageType().getName());
            } else {
                textGenerator.print(fieldDescriptor.getName());
            }
            Descriptors.FieldDescriptor.JavaType javaType = fieldDescriptor.getJavaType();
            Descriptors.FieldDescriptor.JavaType javaType2 = Descriptors.FieldDescriptor.JavaType.MESSAGE;
            if (javaType == javaType2) {
                textGenerator.print(" {");
                textGenerator.eol();
                textGenerator.indent();
            } else {
                textGenerator.print(": ");
            }
            printFieldValue(fieldDescriptor, obj, textGenerator);
            if (fieldDescriptor.getJavaType() == javaType2) {
                textGenerator.outdent();
                textGenerator.print("}");
            }
            textGenerator.eol();
        }

        private static void printUnknownField(int i10, int i11, List<?> list, TextGenerator textGenerator, boolean z10) throws IOException {
            for (Object obj : list) {
                textGenerator.print(String.valueOf(i10));
                textGenerator.print(": ");
                printUnknownFieldValue(i11, obj, textGenerator, z10);
                textGenerator.eol();
            }
        }

        private static void printUnknownFieldValue(int i10, Object obj, TextGenerator textGenerator, boolean z10) throws IOException {
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                textGenerator.print(z10 ? String.format("UNKNOWN_VARINT %s", TextFormat.REDACTED_MARKER) : TextFormat.unsignedToString(((Long) obj).longValue()));
                return;
            }
            if (tagWireType == 1) {
                textGenerator.print(z10 ? String.format("UNKNOWN_FIXED64 %s", TextFormat.REDACTED_MARKER) : String.format(null, "0x%016x", (Long) obj));
                return;
            }
            if (tagWireType != 2) {
                if (tagWireType == 3) {
                    printUnknownFields((UnknownFieldSet) obj, textGenerator, z10);
                    return;
                } else {
                    if (tagWireType == 5) {
                        textGenerator.print(z10 ? String.format("UNKNOWN_FIXED32 %s", TextFormat.REDACTED_MARKER) : String.format(null, "0x%08x", (Integer) obj));
                        return;
                    }
                    throw new IllegalArgumentException("Bad tag: " + i10);
                }
            }
            try {
                UnknownFieldSet from = UnknownFieldSet.parseFrom((ByteString) obj);
                textGenerator.print("{");
                textGenerator.eol();
                textGenerator.indent();
                printUnknownFields(from, textGenerator, z10);
                textGenerator.outdent();
                textGenerator.print("}");
            } catch (InvalidProtocolBufferException unused) {
                if (z10) {
                    textGenerator.print(String.format("UNKNOWN_STRING %s", TextFormat.REDACTED_MARKER));
                    return;
                }
                textGenerator.print("\"");
                textGenerator.print(TextFormat.escapeBytes((ByteString) obj));
                textGenerator.print("\"");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void printUnknownFields(UnknownFieldSet unknownFieldSet, TextGenerator textGenerator, boolean z10) throws IOException {
            if (unknownFieldSet.isEmpty()) {
                return;
            }
            for (Map.Entry<Integer, UnknownFieldSet.Field> entry : unknownFieldSet.asMap().entrySet()) {
                int iIntValue = entry.getKey().intValue();
                UnknownFieldSet.Field value = entry.getValue();
                printUnknownField(iIntValue, 0, value.getVarintList(), textGenerator, z10);
                printUnknownField(iIntValue, 5, value.getFixed32List(), textGenerator, z10);
                printUnknownField(iIntValue, 1, value.getFixed64List(), textGenerator, z10);
                printUnknownField(iIntValue, 2, value.getLengthDelimitedList(), textGenerator, z10);
                for (UnknownFieldSet unknownFieldSet2 : value.getGroupList()) {
                    textGenerator.print(entry.getKey().toString());
                    textGenerator.print(" {");
                    textGenerator.eol();
                    textGenerator.indent();
                    printUnknownFields(unknownFieldSet2, textGenerator, z10);
                    textGenerator.outdent();
                    textGenerator.print("}");
                    textGenerator.eol();
                }
            }
        }

        private boolean shouldRedact(Descriptors.FieldDescriptor fieldDescriptor, TextGenerator textGenerator) {
            return this.enablingSafeDebugFormat && fieldDescriptor.isSensitive();
        }

        public Printer emittingSingleLine(boolean z10) {
            return new Printer(this.escapeNonAscii, this.useShortRepeatedPrimitives, this.typeRegistry, this.extensionRegistry, this.enablingSafeDebugFormat, z10);
        }

        public Printer enablingSafeDebugFormat(boolean z10) {
            return new Printer(this.escapeNonAscii, this.useShortRepeatedPrimitives, this.typeRegistry, this.extensionRegistry, z10, this.singleLine);
        }

        public Printer escapingNonAscii(boolean z10) {
            return new Printer(z10, this.useShortRepeatedPrimitives, this.typeRegistry, this.extensionRegistry, this.enablingSafeDebugFormat, this.singleLine);
        }

        public void print(MessageOrBuilder messageOrBuilder, Appendable appendable) throws IOException {
            print(messageOrBuilder, appendable, FieldReporterLevel.PRINT);
        }

        public void printField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
            printField(fieldDescriptor, obj, TextFormat.setSingleLineOutput(appendable, this.singleLine));
        }

        public String printFieldToString(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            try {
                StringBuilder sb2 = new StringBuilder();
                if (this.enablingSafeDebugFormat) {
                    applyUnstablePrefix(sb2);
                }
                printField(fieldDescriptor, obj, sb2);
                return sb2.toString();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        public void printFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, Appendable appendable) throws IOException {
            printFieldValue(fieldDescriptor, obj, TextFormat.setSingleLineOutput(appendable, this.singleLine));
        }

        public String printToString(MessageOrBuilder messageOrBuilder) {
            return printToString(messageOrBuilder, FieldReporterLevel.PRINTER_PRINT_TO_STRING);
        }

        public void setSensitiveFieldReportingLevel(FieldReporterLevel fieldReporterLevel) {
            sensitiveFieldReportingLevel.set(fieldReporterLevel);
        }

        @Deprecated
        public String shortDebugString(MessageOrBuilder messageOrBuilder) {
            return emittingSingleLine(true).printToString(messageOrBuilder, FieldReporterLevel.SHORT_DEBUG_STRING);
        }

        public Printer usingExtensionRegistry(ExtensionRegistryLite extensionRegistryLite) {
            if (this.extensionRegistry == ExtensionRegistryLite.getEmptyRegistry()) {
                return new Printer(this.escapeNonAscii, this.useShortRepeatedPrimitives, this.typeRegistry, extensionRegistryLite, this.enablingSafeDebugFormat, this.singleLine);
            }
            throw new IllegalArgumentException("Only one extensionRegistry is allowed.");
        }

        public Printer usingShortRepeatedPrimitives(boolean z10) {
            return new Printer(this.escapeNonAscii, z10, this.typeRegistry, this.extensionRegistry, this.enablingSafeDebugFormat, this.singleLine);
        }

        public Printer usingTypeRegistry(TypeRegistry typeRegistry) {
            if (this.typeRegistry == TypeRegistry.getEmptyTypeRegistry()) {
                return new Printer(this.escapeNonAscii, this.useShortRepeatedPrimitives, typeRegistry, this.extensionRegistry, this.enablingSafeDebugFormat, this.singleLine);
            }
            throw new IllegalArgumentException("Only one typeRegistry is allowed.");
        }

        private void printField(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            if (!fieldDescriptor.isMapField()) {
                if (!fieldDescriptor.isRepeated()) {
                    printSingleField(fieldDescriptor, obj, textGenerator);
                    return;
                }
                if (this.useShortRepeatedPrimitives && fieldDescriptor.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    printShortRepeatedField(fieldDescriptor, obj, textGenerator);
                    return;
                }
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    printSingleField(fieldDescriptor, it.next(), textGenerator);
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                arrayList.add(new MapEntryAdapter(it2.next(), fieldDescriptor));
            }
            Collections.sort(arrayList);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                printSingleField(fieldDescriptor, ((MapEntryAdapter) obj2).getEntry(), textGenerator);
            }
        }

        private void printFieldValue(Descriptors.FieldDescriptor fieldDescriptor, Object obj, TextGenerator textGenerator) throws IOException {
            if (shouldRedact(fieldDescriptor, textGenerator)) {
                textGenerator.print(TextFormat.REDACTED_MARKER);
                if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    textGenerator.eol();
                }
                return;
            }
            switch (C71821.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[fieldDescriptor.getType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    textGenerator.print(((Integer) obj).toString());
                    break;
                case 4:
                case 5:
                case 6:
                    textGenerator.print(((Long) obj).toString());
                    break;
                case 7:
                    textGenerator.print(((Boolean) obj).toString());
                    break;
                case 8:
                    textGenerator.print(((Float) obj).toString());
                    break;
                case 9:
                    textGenerator.print(((Double) obj).toString());
                    break;
                case 10:
                case 11:
                    textGenerator.print(TextFormat.unsignedToString(((Integer) obj).intValue()));
                    break;
                case 12:
                case 13:
                    textGenerator.print(TextFormat.unsignedToString(((Long) obj).longValue()));
                    break;
                case 14:
                    textGenerator.print("\"");
                    textGenerator.print(this.escapeNonAscii ? TextFormatEscaper.escapeText((String) obj) : TextFormat.escapeDoubleQuotesAndBackslashes((String) obj).replace(SignParameters.NEW_LINE, "\\n"));
                    textGenerator.print("\"");
                    break;
                case 15:
                    textGenerator.print("\"");
                    if (obj instanceof ByteString) {
                        textGenerator.print(TextFormat.escapeBytes((ByteString) obj));
                    } else {
                        textGenerator.print(TextFormat.escapeBytes((byte[]) obj));
                    }
                    textGenerator.print("\"");
                    break;
                case 16:
                    Descriptors.EnumValueDescriptor enumValueDescriptor = (Descriptors.EnumValueDescriptor) obj;
                    if (enumValueDescriptor.getIndex() != -1) {
                        textGenerator.print(enumValueDescriptor.getName());
                        break;
                    } else {
                        textGenerator.print(Integer.toString(enumValueDescriptor.getNumber()));
                        break;
                    }
                case 17:
                case 18:
                    print((MessageOrBuilder) obj, textGenerator);
                    break;
            }
        }

        public void print(MessageOrBuilder messageOrBuilder, Appendable appendable, FieldReporterLevel fieldReporterLevel) throws IOException {
            print(messageOrBuilder, TextFormat.setSingleLineOutput(appendable, this.singleLine, messageOrBuilder.getDescriptorForType(), fieldReporterLevel));
        }

        public String printToString(MessageOrBuilder messageOrBuilder, FieldReporterLevel fieldReporterLevel) {
            try {
                StringBuilder sb2 = new StringBuilder();
                if (this.enablingSafeDebugFormat) {
                    applyUnstablePrefix(sb2);
                }
                print(messageOrBuilder, sb2, fieldReporterLevel);
                return sb2.toString();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @InlineMe(replacement = "this.emittingSingleLine(true).printFieldToString(field, value)")
        @Deprecated
        public String shortDebugString(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return emittingSingleLine(true).printFieldToString(fieldDescriptor, obj);
        }

        @InlineMe(replacement = "this.emittingSingleLine(true).printToString(fields)")
        @Deprecated
        public String shortDebugString(UnknownFieldSet unknownFieldSet) {
            return emittingSingleLine(true).printToString(unknownFieldSet);
        }

        public void print(UnknownFieldSet unknownFieldSet, Appendable appendable) throws IOException {
            printUnknownFields(unknownFieldSet, TextFormat.setSingleLineOutput(appendable, this.singleLine), this.enablingSafeDebugFormat);
        }

        private void print(MessageOrBuilder messageOrBuilder, TextGenerator textGenerator) throws IOException {
            if (messageOrBuilder.getDescriptorForType().getFullName().equals("google.protobuf.Any") && printAny(messageOrBuilder, textGenerator)) {
                return;
            }
            printMessage(messageOrBuilder, textGenerator);
        }

        public String printToString(UnknownFieldSet unknownFieldSet) {
            try {
                StringBuilder sb2 = new StringBuilder();
                if (this.enablingSafeDebugFormat) {
                    applyUnstablePrefix(sb2);
                }
                print(unknownFieldSet, sb2);
                return sb2.toString();
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public static final class TextGenerator {
        private boolean atStartOfLine;
        private final Printer.FieldReporterLevel fieldReporterLevel;
        private final StringBuilder indent;
        private final Appendable output;
        private final Descriptors.Descriptor rootMessageType;
        private final boolean singleLineMode;

        public /* synthetic */ TextGenerator(Appendable appendable, boolean z10, Descriptors.Descriptor descriptor, Printer.FieldReporterLevel fieldReporterLevel, C71821 c71821) {
            this(appendable, z10, descriptor, fieldReporterLevel);
        }

        public void eol() throws IOException {
            if (!this.singleLineMode) {
                this.output.append(SignParameters.NEW_LINE);
            }
            this.atStartOfLine = true;
        }

        public void indent() {
            this.indent.append("  ");
        }

        public void outdent() {
            int length = this.indent.length();
            if (length == 0) {
                throw new IllegalArgumentException(" Outdent() without matching Indent().");
            }
            this.indent.setLength(length - 2);
        }

        public void print(CharSequence charSequence) throws IOException {
            if (this.atStartOfLine) {
                this.atStartOfLine = false;
                this.output.append(this.singleLineMode ? " " : this.indent);
            }
            this.output.append(charSequence);
        }

        private TextGenerator(Appendable appendable, boolean z10, Descriptors.Descriptor descriptor, Printer.FieldReporterLevel fieldReporterLevel) {
            this.indent = new StringBuilder();
            this.atStartOfLine = false;
            this.output = appendable;
            this.singleLineMode = z10;
            this.rootMessageType = descriptor;
            this.fieldReporterLevel = fieldReporterLevel;
        }
    }

    public static final class Tokenizer {
        private int column;
        private boolean containsSilentMarkerAfterCurrentToken;
        private boolean containsSilentMarkerAfterPrevToken;
        private String currentToken;
        private int line;
        private int lineInfoTrackingPos;
        private int pos;
        private int previousColumn;
        private int previousLine;
        private final CharSequence text;

        public /* synthetic */ Tokenizer(CharSequence charSequence, C71821 c71821) {
            this(charSequence);
        }

        private ParseException floatParseException(NumberFormatException numberFormatException) {
            return parseException("Couldn't parse number: " + numberFormatException.getMessage());
        }

        private ParseException integerParseException(NumberFormatException numberFormatException) {
            return parseException("Couldn't parse integer: " + numberFormatException.getMessage());
        }

        private static boolean isAlphaUnder(char c10) {
            if ('a' > c10 || c10 > 'z') {
                return ('A' <= c10 && c10 <= 'Z') || c10 == '_';
            }
            return true;
        }

        private static boolean isDigitPlusMinus(char c10) {
            return ('0' <= c10 && c10 <= '9') || c10 == '+' || c10 == '-';
        }

        private static boolean isWhitespace(char c10) {
            return c10 == ' ' || c10 == '\f' || c10 == '\n' || c10 == '\r' || c10 == '\t';
        }

        private String nextTokenInternal() {
            int i10;
            int length = this.text.length();
            int i11 = this.pos;
            char cCharAt = this.text.charAt(i11);
            int i12 = this.pos;
            if (isAlphaUnder(cCharAt)) {
                while (true) {
                    i12++;
                    if (i12 == length) {
                        break;
                    }
                    char cCharAt2 = this.text.charAt(i12);
                    if (!isAlphaUnder(cCharAt2) && !isDigitPlusMinus(cCharAt2)) {
                        break;
                    }
                }
            } else if (isDigitPlusMinus(cCharAt) || cCharAt == '.') {
                if (cCharAt == '.') {
                    i12++;
                    if (i12 == length) {
                        return nextTokenSingleChar();
                    }
                    if (!isDigitPlusMinus(this.text.charAt(i12))) {
                        return nextTokenSingleChar();
                    }
                }
                while (true) {
                    i12++;
                    if (i12 == length) {
                        break;
                    }
                    char cCharAt3 = this.text.charAt(i12);
                    if (!isDigitPlusMinus(cCharAt3) && !isAlphaUnder(cCharAt3) && cCharAt3 != '.') {
                        break;
                    }
                }
            } else {
                if (cCharAt != '\"' && cCharAt != '\'') {
                    return nextTokenSingleChar();
                }
                while (true) {
                    i10 = i12 + 1;
                    if (i10 == length) {
                        break;
                    }
                    char cCharAt4 = this.text.charAt(i10);
                    if (cCharAt4 == cCharAt) {
                        i12 += 2;
                        break;
                    }
                    if (cCharAt4 == '\n') {
                        break;
                    }
                    if (cCharAt4 == '\\') {
                        i12 += 2;
                        if (i12 == length || this.text.charAt(i12) == '\n') {
                            break;
                        }
                    } else {
                        i12 = i10;
                    }
                }
                i12 = i10;
            }
            this.pos = i12;
            return this.text.subSequence(i11, i12).toString();
        }

        private String nextTokenSingleChar() {
            CharSequence charSequence = this.text;
            int i10 = this.pos;
            this.pos = i10 + 1;
            char cCharAt = charSequence.charAt(i10);
            return cCharAt != ',' ? cCharAt != ':' ? cCharAt != '<' ? cCharAt != '>' ? cCharAt != '[' ? cCharAt != ']' ? cCharAt != '{' ? cCharAt != '}' ? String.valueOf(cCharAt) : "}" : "{" : "]" : "[" : ">" : "<" : ":" : ",";
        }

        private void skipWhitespace() {
            int length = this.text.length();
            int i10 = this.pos - 1;
            while (true) {
                i10++;
                if (i10 != length) {
                    char cCharAt = this.text.charAt(i10);
                    if (cCharAt != '#') {
                        if (!isWhitespace(cCharAt)) {
                            break;
                        }
                    } else {
                        do {
                            i10++;
                            if (i10 == length) {
                                break;
                            }
                        } while (this.text.charAt(i10) != '\n');
                        if (i10 == length) {
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            this.pos = i10;
        }

        public boolean atEnd() {
            return this.currentToken.length() == 0;
        }

        public void consume(String str) throws ParseException {
            if (tryConsume(str)) {
                return;
            }
            throw parseException("Expected \"" + str + "\".");
        }

        public boolean consumeBoolean() throws ParseException {
            if (this.currentToken.equals(RequestConstant.TRUE) || this.currentToken.equals("True") || this.currentToken.equals("t") || this.currentToken.equals("1")) {
                nextToken();
                return true;
            }
            if (this.currentToken.equals(RequestConstant.FALSE) || this.currentToken.equals("False") || this.currentToken.equals("f") || this.currentToken.equals("0")) {
                nextToken();
                return false;
            }
            throw parseException("Expected \"true\" or \"false\". Found \"" + this.currentToken + "\".");
        }

        @CanIgnoreReturnValue
        public ByteString consumeByteString() throws ParseException {
            ArrayList arrayList = new ArrayList();
            consumeByteString(arrayList);
            while (true) {
                if (!this.currentToken.startsWith("'") && !this.currentToken.startsWith("\"")) {
                    return ByteString.copyFrom(arrayList);
                }
                consumeByteString(arrayList);
            }
        }

        public double consumeDouble() throws ParseException, NumberFormatException {
            String lowerCase = this.currentToken.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            switch (lowerCase) {
                case "inf":
                case "infinity":
                    nextToken();
                    return Double.POSITIVE_INFINITY;
                case "nan":
                    nextToken();
                    return Double.NaN;
                case "-inf":
                case "-infinity":
                    nextToken();
                    return Double.NEGATIVE_INFINITY;
                default:
                    try {
                        double d10 = Double.parseDouble(this.currentToken);
                        nextToken();
                        return d10;
                    } catch (NumberFormatException e10) {
                        throw floatParseException(e10);
                    }
            }
        }

        public float consumeFloat() throws ParseException, NumberFormatException {
            String lowerCase = this.currentToken.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            switch (lowerCase) {
                case "inf":
                case "inff":
                case "infinity":
                case "infinityf":
                    nextToken();
                    return Float.POSITIVE_INFINITY;
                case "nan":
                case "nanf":
                    nextToken();
                    return Float.NaN;
                case "-inf":
                case "-inff":
                case "-infinity":
                case "-infinityf":
                    nextToken();
                    return Float.NEGATIVE_INFINITY;
                default:
                    try {
                        float f10 = Float.parseFloat(this.currentToken);
                        nextToken();
                        return f10;
                    } catch (NumberFormatException e10) {
                        throw floatParseException(e10);
                    }
            }
        }

        public String consumeIdentifier() throws ParseException {
            for (int i10 = 0; i10 < this.currentToken.length(); i10++) {
                char cCharAt = this.currentToken.charAt(i10);
                if (!isAlphaUnder(cCharAt) && (('0' > cCharAt || cCharAt > '9') && cCharAt != '.')) {
                    throw parseException("Expected identifier. Found '" + this.currentToken + "'");
                }
            }
            String str = this.currentToken;
            nextToken();
            return str;
        }

        public int consumeInt32() throws ParseException {
            try {
                int int32 = TextFormat.parseInt32(this.currentToken);
                nextToken();
                return int32;
            } catch (NumberFormatException e10) {
                throw integerParseException(e10);
            }
        }

        public long consumeInt64() throws ParseException {
            try {
                long int64 = TextFormat.parseInt64(this.currentToken);
                nextToken();
                return int64;
            } catch (NumberFormatException e10) {
                throw integerParseException(e10);
            }
        }

        public String consumeString() {
            return consumeByteString().toStringUtf8();
        }

        public int consumeUInt32() throws ParseException {
            try {
                int uInt32 = TextFormat.parseUInt32(this.currentToken);
                nextToken();
                return uInt32;
            } catch (NumberFormatException e10) {
                throw integerParseException(e10);
            }
        }

        public long consumeUInt64() throws ParseException {
            try {
                long uInt64 = TextFormat.parseUInt64(this.currentToken);
                nextToken();
                return uInt64;
            } catch (NumberFormatException e10) {
                throw integerParseException(e10);
            }
        }

        public int getColumn() {
            return this.column;
        }

        public boolean getContainsSilentMarkerAfterCurrentToken() {
            return this.containsSilentMarkerAfterCurrentToken;
        }

        public boolean getContainsSilentMarkerAfterPrevToken() {
            return this.containsSilentMarkerAfterPrevToken;
        }

        public int getLine() {
            return this.line;
        }

        public int getPreviousColumn() {
            return this.previousColumn;
        }

        public int getPreviousLine() {
            return this.previousLine;
        }

        public boolean lookingAt(String str) {
            return this.currentToken.equals(str);
        }

        public boolean lookingAtInteger() {
            if (this.currentToken.length() == 0) {
                return false;
            }
            return isDigitPlusMinus(this.currentToken.charAt(0));
        }

        public void nextToken() {
            int i10;
            this.previousLine = this.line;
            this.previousColumn = this.column;
            while (true) {
                int i11 = this.lineInfoTrackingPos;
                i10 = this.pos;
                if (i11 >= i10) {
                    break;
                }
                if (this.text.charAt(i11) == '\n') {
                    this.line++;
                    this.column = 0;
                } else {
                    this.column++;
                }
                this.lineInfoTrackingPos++;
            }
            if (i10 == this.text.length()) {
                this.currentToken = "";
            } else {
                this.currentToken = nextTokenInternal();
                skipWhitespace();
            }
        }

        public ParseException parseException(String str) {
            return new ParseException(this.line + 1, this.column + 1, str);
        }

        public ParseException parseExceptionPreviousToken(String str) {
            return new ParseException(this.previousLine + 1, this.previousColumn + 1, str);
        }

        public boolean tryConsume(String str) {
            if (!this.currentToken.equals(str)) {
                return false;
            }
            nextToken();
            return true;
        }

        public boolean tryConsumeByteString() {
            try {
                consumeByteString();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public boolean tryConsumeDouble() throws NumberFormatException {
            try {
                consumeDouble();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public boolean tryConsumeFloat() throws NumberFormatException {
            try {
                consumeFloat();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public boolean tryConsumeIdentifier() {
            try {
                consumeIdentifier();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public boolean tryConsumeInt64() {
            try {
                consumeInt64();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        public boolean tryConsumeUInt64() {
            try {
                consumeUInt64();
                return true;
            } catch (ParseException unused) {
                return false;
            }
        }

        private Tokenizer(CharSequence charSequence) {
            this.pos = 0;
            this.line = 0;
            this.column = 0;
            this.lineInfoTrackingPos = 0;
            this.previousLine = 0;
            this.previousColumn = 0;
            this.containsSilentMarkerAfterCurrentToken = false;
            this.containsSilentMarkerAfterPrevToken = false;
            this.text = charSequence;
            skipWhitespace();
            nextToken();
        }

        private void consumeByteString(List<ByteString> list) throws ParseException {
            char cCharAt = this.currentToken.length() > 0 ? this.currentToken.charAt(0) : (char) 0;
            if (cCharAt != '\"' && cCharAt != '\'') {
                throw parseException("Expected string.");
            }
            if (this.currentToken.length() >= 2) {
                String str = this.currentToken;
                if (str.charAt(str.length() - 1) == cCharAt) {
                    try {
                        String str2 = this.currentToken;
                        ByteString byteStringUnescapeBytes = TextFormat.unescapeBytes(str2.substring(1, str2.length() - 1));
                        nextToken();
                        list.add(byteStringUnescapeBytes);
                        return;
                    } catch (InvalidEscapeSequenceException e10) {
                        throw parseException(e10.getMessage());
                    }
                }
            }
            throw parseException("String missing ending quote.");
        }
    }

    @Deprecated
    public static class UnknownFieldParseException extends ParseException {
        private final String unknownField;

        public UnknownFieldParseException(String str) {
            this(-1, -1, "", str);
        }

        public String getUnknownField() {
            return this.unknownField;
        }

        public UnknownFieldParseException(int i10, int i11, String str, String str2) {
            super(i10, i11, str2);
            this.unknownField = str;
        }
    }

    private TextFormat() {
    }

    public static Printer debugFormatPrinter() {
        return Printer.DEFAULT_DEBUG_FORMAT;
    }

    private static int digitValue(byte b10) {
        return (48 > b10 || b10 > 57) ? (97 > b10 || b10 > 122) ? b10 - 55 : b10 - 87 : b10 - 48;
    }

    public static String escapeBytes(ByteString byteString) {
        return TextFormatEscaper.escapeBytes(byteString);
    }

    public static String escapeDoubleQuotesAndBackslashes(String str) {
        return TextFormatEscaper.escapeDoubleQuotesAndBackslashes(str);
    }

    public static String escapeText(String str) {
        return escapeBytes(ByteString.copyFromUtf8(str));
    }

    public static Parser getParser() {
        return PARSER;
    }

    private static boolean isHex(byte b10) {
        if (48 <= b10 && b10 <= 57) {
            return true;
        }
        if (97 > b10 || b10 > 102) {
            return 65 <= b10 && b10 <= 70;
        }
        return true;
    }

    private static boolean isOctal(byte b10) {
        return 48 <= b10 && b10 <= 55;
    }

    public static void merge(Readable readable, Message.Builder builder) throws ParseException {
        PARSER.merge(readable, builder);
    }

    public static <T extends Message> T parse(CharSequence charSequence, Class<T> cls) throws ParseException {
        Message.Builder builderNewBuilderForType = ((Message) Internal.getDefaultInstance(cls)).newBuilderForType();
        merge(charSequence, builderNewBuilderForType);
        return (T) builderNewBuilderForType.build();
    }

    public static int parseInt32(String str) {
        return (int) parseInteger(str, true, false);
    }

    public static long parseInt64(String str) {
        return parseInteger(str, true, true);
    }

    private static long parseInteger(String str, boolean z10, boolean z11) throws NumberFormatException {
        int i10;
        int i11 = 0;
        if (str.startsWith("-", 0)) {
            if (!z10) {
                throw new NumberFormatException("Number must be positive: " + str);
            }
            i11 = 1;
        }
        int i12 = i11;
        if (str.startsWith("0x", i11)) {
            i11 += 2;
            i10 = 16;
        } else {
            i10 = str.startsWith("0", i11) ? 8 : 10;
        }
        String strSubstring = str.substring(i11);
        if (strSubstring.length() < 16) {
            long j10 = Long.parseLong(strSubstring, i10);
            if (i12 != 0) {
                j10 = -j10;
            }
            if (!z11) {
                if (z10) {
                    if (j10 > SieveCacheKt.NodeLinkMask || j10 < SieveCacheKt.NodeMetaAndPreviousMask) {
                        throw new NumberFormatException("Number out of range for 32-bit signed integer: " + str);
                    }
                } else if (j10 >= IjkMediaMeta.AV_CH_WIDE_RIGHT || j10 < 0) {
                    throw new NumberFormatException("Number out of range for 32-bit unsigned integer: " + str);
                }
            }
            return j10;
        }
        BigInteger bigInteger = new BigInteger(strSubstring, i10);
        if (i12 != 0) {
            bigInteger = bigInteger.negate();
        }
        if (z11) {
            if (z10) {
                if (bigInteger.bitLength() > 63) {
                    throw new NumberFormatException("Number out of range for 64-bit signed integer: " + str);
                }
            } else if (bigInteger.bitLength() > 64) {
                throw new NumberFormatException("Number out of range for 64-bit unsigned integer: " + str);
            }
        } else if (z10) {
            if (bigInteger.bitLength() > 31) {
                throw new NumberFormatException("Number out of range for 32-bit signed integer: " + str);
            }
        } else if (bigInteger.bitLength() > 32) {
            throw new NumberFormatException("Number out of range for 32-bit unsigned integer: " + str);
        }
        return bigInteger.longValue();
    }

    public static int parseUInt32(String str) {
        return (int) parseInteger(str, false, false);
    }

    public static long parseUInt64(String str) {
        return parseInteger(str, false, true);
    }

    public static void printUnknownFieldValue(int i10, Object obj, Appendable appendable) throws IOException {
        printUnknownFieldValue(i10, obj, setSingleLineOutput(appendable, false), false);
    }

    public static Printer printer() {
        return Printer.DEFAULT_TEXT_FORMAT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TextGenerator setSingleLineOutput(Appendable appendable, boolean z10) {
        return new TextGenerator(appendable, z10, null, Printer.FieldReporterLevel.TEXT_GENERATOR, null);
    }

    @Deprecated
    public static String shortDebugString(MessageOrBuilder messageOrBuilder) {
        return printer().emittingSingleLine(true).printToString(messageOrBuilder, Printer.FieldReporterLevel.SHORT_DEBUG_STRING);
    }

    public static ByteString unescapeBytes(CharSequence charSequence) throws InvalidEscapeSequenceException {
        int i10;
        int i11;
        int length;
        int i12;
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8(charSequence.toString());
        int size = byteStringCopyFromUtf8.size();
        byte[] bArr = new byte[size];
        int i13 = 0;
        int i14 = 0;
        while (i13 < byteStringCopyFromUtf8.size()) {
            byte bByteAt = byteStringCopyFromUtf8.byteAt(i13);
            if (bByteAt == 92) {
                int i15 = i13 + 1;
                if (i15 >= byteStringCopyFromUtf8.size()) {
                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\' at end of string.");
                }
                byte bByteAt2 = byteStringCopyFromUtf8.byteAt(i15);
                if (isOctal(bByteAt2)) {
                    int iDigitValue = digitValue(bByteAt2);
                    int i16 = i13 + 2;
                    if (i16 < byteStringCopyFromUtf8.size() && isOctal(byteStringCopyFromUtf8.byteAt(i16))) {
                        iDigitValue = (iDigitValue * 8) + digitValue(byteStringCopyFromUtf8.byteAt(i16));
                        i15 = i16;
                    }
                    i13 = i15 + 1;
                    if (i13 >= byteStringCopyFromUtf8.size() || !isOctal(byteStringCopyFromUtf8.byteAt(i13))) {
                        i13 = i15;
                    } else {
                        iDigitValue = (iDigitValue * 8) + digitValue(byteStringCopyFromUtf8.byteAt(i13));
                    }
                    i12 = i14 + 1;
                    bArr[i14] = (byte) iDigitValue;
                } else {
                    if (bByteAt2 == 34) {
                        i10 = i14 + 1;
                        bArr[i14] = 34;
                    } else if (bByteAt2 == 39) {
                        i10 = i14 + 1;
                        bArr[i14] = 39;
                    } else if (bByteAt2 != 63) {
                        if (bByteAt2 == 85) {
                            int i17 = i13 + 2;
                            i11 = i13 + 9;
                            if (i11 >= byteStringCopyFromUtf8.size()) {
                                throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U' with too few hex chars");
                            }
                            int iDigitValue2 = 0;
                            int i18 = i17;
                            while (true) {
                                int i19 = i13 + 10;
                                if (i18 < i19) {
                                    byte bByteAt3 = byteStringCopyFromUtf8.byteAt(i18);
                                    if (!isHex(bByteAt3)) {
                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U' with too few hex chars");
                                    }
                                    iDigitValue2 = (iDigitValue2 << 4) | digitValue(bByteAt3);
                                    i18++;
                                } else {
                                    if (!Character.isValidCodePoint(iDigitValue2)) {
                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U" + byteStringCopyFromUtf8.substring(i17, i19).toStringUtf8() + "' is not a valid code point value");
                                    }
                                    Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(iDigitValue2);
                                    if (unicodeBlockOf != null && (unicodeBlockOf.equals(Character.UnicodeBlock.LOW_SURROGATES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_SURROGATES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES))) {
                                        throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\U" + byteStringCopyFromUtf8.substring(i17, i19).toStringUtf8() + "' refers to a surrogate code unit");
                                    }
                                    byte[] bytes = new String(new int[]{iDigitValue2}, 0, 1).getBytes(Internal.UTF_8);
                                    System.arraycopy(bytes, 0, bArr, i14, bytes.length);
                                    length = bytes.length;
                                }
                            }
                        } else if (bByteAt2 == 92) {
                            i10 = i14 + 1;
                            bArr[i14] = 92;
                        } else if (bByteAt2 == 102) {
                            i10 = i14 + 1;
                            bArr[i14] = MqttWireMessage.MESSAGE_TYPE_PINGREQ;
                        } else if (bByteAt2 == 110) {
                            i10 = i14 + 1;
                            bArr[i14] = 10;
                        } else if (bByteAt2 == 114) {
                            i10 = i14 + 1;
                            bArr[i14] = 13;
                        } else if (bByteAt2 == 120) {
                            int i20 = i13 + 2;
                            if (i20 >= byteStringCopyFromUtf8.size() || !isHex(byteStringCopyFromUtf8.byteAt(i20))) {
                                throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\x' with no digits");
                            }
                            int iDigitValue3 = digitValue(byteStringCopyFromUtf8.byteAt(i20));
                            i13 += 3;
                            if (i13 >= byteStringCopyFromUtf8.size() || !isHex(byteStringCopyFromUtf8.byteAt(i13))) {
                                i13 = i20;
                            } else {
                                iDigitValue3 = (iDigitValue3 * 16) + digitValue(byteStringCopyFromUtf8.byteAt(i13));
                            }
                            i12 = i14 + 1;
                            bArr[i14] = (byte) iDigitValue3;
                        } else if (bByteAt2 == 97) {
                            i10 = i14 + 1;
                            bArr[i14] = 7;
                        } else if (bByteAt2 != 98) {
                            switch (bByteAt2) {
                                case 116:
                                    i10 = i14 + 1;
                                    bArr[i14] = 9;
                                    break;
                                case 117:
                                    int i21 = i13 + 2;
                                    i11 = i13 + 5;
                                    if (i11 < byteStringCopyFromUtf8.size() && isHex(byteStringCopyFromUtf8.byteAt(i21))) {
                                        int i22 = i13 + 3;
                                        if (isHex(byteStringCopyFromUtf8.byteAt(i22))) {
                                            int i23 = i13 + 4;
                                            if (isHex(byteStringCopyFromUtf8.byteAt(i23)) && isHex(byteStringCopyFromUtf8.byteAt(i11))) {
                                                char cDigitValue = (char) ((digitValue(byteStringCopyFromUtf8.byteAt(i23)) << 4) | (digitValue(byteStringCopyFromUtf8.byteAt(i21)) << 12) | (digitValue(byteStringCopyFromUtf8.byteAt(i22)) << 8) | digitValue(byteStringCopyFromUtf8.byteAt(i11)));
                                                if (cDigitValue >= 55296 && cDigitValue <= 57343) {
                                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\u' refers to a surrogate");
                                                }
                                                byte[] bytes2 = Character.toString(cDigitValue).getBytes(Internal.UTF_8);
                                                System.arraycopy(bytes2, 0, bArr, i14, bytes2.length);
                                                length = bytes2.length;
                                                break;
                                            }
                                        }
                                    }
                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\u' with too few hex chars");
                                case 118:
                                    i10 = i14 + 1;
                                    bArr[i14] = MqttWireMessage.MESSAGE_TYPE_UNSUBACK;
                                    break;
                                default:
                                    throw new InvalidEscapeSequenceException("Invalid escape sequence: '\\" + ((char) bByteAt2) + '\'');
                            }
                        } else {
                            i10 = i14 + 1;
                            bArr[i14] = 8;
                        }
                        i14 += length;
                        i13 = i11;
                    } else {
                        i10 = i14 + 1;
                        bArr[i14] = okio.Utf8.REPLACEMENT_BYTE;
                    }
                    i14 = i10;
                    i13 = i15;
                }
                i14 = i12;
            } else {
                bArr[i14] = bByteAt;
                i14++;
            }
            i13++;
        }
        return size == i14 ? ByteString.wrap(bArr) : ByteString.copyFrom(bArr, 0, i14);
    }

    public static String unescapeText(String str) {
        return unescapeBytes(str).toStringUtf8();
    }

    public static String unsignedToString(int i10) {
        return i10 >= 0 ? Integer.toString(i10) : Long.toString(i10 & 4294967295L);
    }

    public static String escapeBytes(byte[] bArr) {
        return TextFormatEscaper.escapeBytes(bArr);
    }

    public static void merge(CharSequence charSequence, Message.Builder builder) throws ParseException {
        PARSER.merge(charSequence, builder);
    }

    private static void printUnknownFieldValue(int i10, Object obj, TextGenerator textGenerator, boolean z10) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i10);
        if (tagWireType == 0) {
            textGenerator.print(unsignedToString(((Long) obj).longValue()));
            return;
        }
        if (tagWireType == 1) {
            textGenerator.print(String.format(null, "0x%016x", (Long) obj));
            return;
        }
        if (tagWireType != 2) {
            if (tagWireType == 3) {
                Printer.printUnknownFields((UnknownFieldSet) obj, textGenerator, z10);
                return;
            } else {
                if (tagWireType == 5) {
                    textGenerator.print(String.format(null, "0x%08x", (Integer) obj));
                    return;
                }
                throw new IllegalArgumentException("Bad tag: " + i10);
            }
        }
        try {
            UnknownFieldSet from = UnknownFieldSet.parseFrom((ByteString) obj);
            textGenerator.print("{");
            textGenerator.eol();
            textGenerator.indent();
            Printer.printUnknownFields(from, textGenerator, z10);
            textGenerator.outdent();
            textGenerator.print("}");
        } catch (InvalidProtocolBufferException unused) {
            textGenerator.print("\"");
            textGenerator.print(escapeBytes((ByteString) obj));
            textGenerator.print("\"");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TextGenerator setSingleLineOutput(Appendable appendable, boolean z10, Descriptors.Descriptor descriptor, Printer.FieldReporterLevel fieldReporterLevel) {
        return new TextGenerator(appendable, z10, descriptor, fieldReporterLevel, null);
    }

    public static void merge(Readable readable, ExtensionRegistry extensionRegistry, Message.Builder builder) throws ParseException {
        PARSER.merge(readable, extensionRegistry, builder);
    }

    public static String unsignedToString(long j10) {
        if (j10 >= 0) {
            return Long.toString(j10);
        }
        return BigInteger.valueOf(j10 & Long.MAX_VALUE).setBit(63).toString();
    }

    public static void merge(CharSequence charSequence, ExtensionRegistry extensionRegistry, Message.Builder builder) throws ParseException {
        PARSER.merge(charSequence, extensionRegistry, builder);
    }

    public static <T extends Message> T parse(CharSequence charSequence, ExtensionRegistry extensionRegistry, Class<T> cls) throws ParseException {
        Message.Builder builderNewBuilderForType = ((Message) Internal.getDefaultInstance(cls)).newBuilderForType();
        merge(charSequence, extensionRegistry, builderNewBuilderForType);
        return (T) builderNewBuilderForType.build();
    }
}
