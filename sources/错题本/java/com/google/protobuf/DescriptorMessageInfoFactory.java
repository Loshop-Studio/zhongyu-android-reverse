package com.google.protobuf;

import android.support.v4.media.AbstractC0037f;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.StructuralMessageInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
final class DescriptorMessageInfoFactory implements MessageInfoFactory {
    private static final String GET_DEFAULT_INSTANCE_METHOD_NAME = "getDefaultInstance";

    /* renamed from: a */
    public static final /* synthetic */ int f3061a = 0;
    private static final DescriptorMessageInfoFactory instance = new DescriptorMessageInfoFactory();
    private static final Set<String> specialFieldNames = new HashSet(Arrays.asList("Class", "DefaultInstanceForType", "ParserForType", "SerializedSize", "AllFields", "DescriptorForType", "InitializationErrorString", "UnknownFields", "CachedSize"));
    private static IsInitializedCheckAnalyzer isInitializedCheckAnalyzer = new IsInitializedCheckAnalyzer();

    /* renamed from: com.google.protobuf.DescriptorMessageInfoFactory$3 */
    public static /* synthetic */ class C38893 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FileDescriptor$Syntax;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$JavaType;

        static {
            int[] iArr = new int[Descriptors.FieldDescriptor.Type.values().length];
            $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = iArr;
            try {
                iArr[Descriptors.FieldDescriptor.Type.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.GROUP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.INT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.INT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.MESSAGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.UINT32.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[Descriptors.FieldDescriptor.Type.UINT64.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[JavaType.values().length];
            $SwitchMap$com$google$protobuf$JavaType = iArr2;
            try {
                iArr2[JavaType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$JavaType[JavaType.BYTE_STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$JavaType[JavaType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$JavaType[JavaType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$protobuf$JavaType[JavaType.ENUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$google$protobuf$JavaType[JavaType.INT.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$google$protobuf$JavaType[JavaType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$google$protobuf$JavaType[JavaType.STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$google$protobuf$JavaType[JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
            int[] iArr3 = new int[Descriptors.FileDescriptor.Syntax.values().length];
            $SwitchMap$com$google$protobuf$Descriptors$FileDescriptor$Syntax = iArr3;
            try {
                iArr3[Descriptors.FileDescriptor.Syntax.PROTO2.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FileDescriptor$Syntax[Descriptors.FileDescriptor.Syntax.PROTO3.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$google$protobuf$Descriptors$FileDescriptor$Syntax[Descriptors.FileDescriptor.Syntax.EDITIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
        }
    }

    public static class IsInitializedCheckAnalyzer {
        private final Map<Descriptors.Descriptor, Boolean> resultCache = new ConcurrentHashMap();
        private int index = 0;
        private final Stack<Node> stack = new Stack<>();
        private final Map<Descriptors.Descriptor, Node> nodeCache = new HashMap();

        public static class Node {
            StronglyConnectedComponent component = null;
            final Descriptors.Descriptor descriptor;
            final int index;
            int lowLink;

            public Node(Descriptors.Descriptor descriptor, int i) {
                this.descriptor = descriptor;
                this.index = i;
                this.lowLink = i;
            }
        }

        public static class StronglyConnectedComponent {
            final List<Descriptors.Descriptor> messages;
            boolean needsIsInitializedCheck;

            private StronglyConnectedComponent() {
                this.messages = new ArrayList();
                this.needsIsInitializedCheck = false;
            }
        }

        private void analyze(StronglyConnectedComponent stronglyConnectedComponent) {
            boolean z8;
            StronglyConnectedComponent stronglyConnectedComponent2;
            Iterator<Descriptors.Descriptor> it = stronglyConnectedComponent.messages.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    z8 = false;
                    break;
                }
                Descriptors.Descriptor next = it.next();
                z8 = true;
                if (next.isExtendable()) {
                    break;
                }
                for (Descriptors.FieldDescriptor fieldDescriptor : next.getFields()) {
                    if (fieldDescriptor.isRequired() || (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE && (stronglyConnectedComponent2 = this.nodeCache.get(fieldDescriptor.getMessageType()).component) != stronglyConnectedComponent && stronglyConnectedComponent2.needsIsInitializedCheck)) {
                        break loop0;
                    }
                }
            }
            stronglyConnectedComponent.needsIsInitializedCheck = z8;
            Iterator<Descriptors.Descriptor> it2 = stronglyConnectedComponent.messages.iterator();
            while (it2.hasNext()) {
                this.resultCache.put(it2.next(), Boolean.valueOf(stronglyConnectedComponent.needsIsInitializedCheck));
            }
        }

        private Node dfs(Descriptors.Descriptor descriptor) {
            Node nodePop;
            int i = this.index;
            this.index = i + 1;
            Node node = new Node(descriptor, i);
            this.stack.push(node);
            this.nodeCache.put(descriptor, node);
            for (Descriptors.FieldDescriptor fieldDescriptor : descriptor.getFields()) {
                if (fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    Node node2 = this.nodeCache.get(fieldDescriptor.getMessageType());
                    if (node2 == null) {
                        node.lowLink = Math.min(node.lowLink, dfs(fieldDescriptor.getMessageType()).lowLink);
                    } else if (node2.component == null) {
                        node.lowLink = Math.min(node.lowLink, node2.lowLink);
                    }
                }
            }
            if (node.index == node.lowLink) {
                StronglyConnectedComponent stronglyConnectedComponent = new StronglyConnectedComponent();
                do {
                    nodePop = this.stack.pop();
                    nodePop.component = stronglyConnectedComponent;
                    stronglyConnectedComponent.messages.add(nodePop.descriptor);
                } while (nodePop != node);
                analyze(stronglyConnectedComponent);
            }
            return node;
        }

        public boolean needsIsInitializedCheck(Descriptors.Descriptor descriptor) {
            Boolean bool = this.resultCache.get(descriptor);
            if (bool != null) {
                return bool.booleanValue();
            }
            synchronized (this) {
                try {
                    Boolean bool2 = this.resultCache.get(descriptor);
                    if (bool2 != null) {
                        return bool2.booleanValue();
                    }
                    return dfs(descriptor).component.needsIsInitializedCheck;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class OneofState {
        private OneofInfo[] oneofs;

        private OneofState() {
            this.oneofs = new OneofInfo[2];
        }

        private static OneofInfo newInfo(Class<?> cls, Descriptors.OneofDescriptor oneofDescriptor) {
            String strSnakeCaseToLowerCamelCase = DescriptorMessageInfoFactory.snakeCaseToLowerCamelCase(oneofDescriptor.getName());
            String strM74C = AbstractC0037f.m74C(strSnakeCaseToLowerCamelCase, "_");
            return new OneofInfo(oneofDescriptor.getIndex(), DescriptorMessageInfoFactory.field(cls, AbstractC0037f.m74C(strSnakeCaseToLowerCamelCase, "Case_")), DescriptorMessageInfoFactory.field(cls, strM74C));
        }

        public OneofInfo getOneof(Class<?> cls, Descriptors.OneofDescriptor oneofDescriptor) {
            int index = oneofDescriptor.getIndex();
            OneofInfo[] oneofInfoArr = this.oneofs;
            if (index >= oneofInfoArr.length) {
                this.oneofs = (OneofInfo[]) Arrays.copyOf(oneofInfoArr, index * 2);
            }
            OneofInfo oneofInfo = this.oneofs[index];
            if (oneofInfo != null) {
                return oneofInfo;
            }
            OneofInfo oneofInfoNewInfo = newInfo(cls, oneofDescriptor);
            this.oneofs[index] = oneofInfoNewInfo;
            return oneofInfoNewInfo;
        }
    }

    private DescriptorMessageInfoFactory() {
    }

    private static java.lang.reflect.Field bitField(Class<?> cls, int i) {
        return field(cls, AbstractC0037f.m82g(i, "bitField", "_"));
    }

    private static FieldInfo buildOneofMember(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor, OneofState oneofState, boolean z8, Internal.EnumVerifier enumVerifier) {
        OneofInfo oneof = oneofState.getOneof(cls, fieldDescriptor.getContainingOneof());
        FieldType fieldType = getFieldType(fieldDescriptor);
        return FieldInfo.forOneofMemberField(fieldDescriptor.getNumber(), fieldType, oneof, getOneofStoredType(cls, fieldDescriptor, fieldType), z8, enumVerifier);
    }

    private static java.lang.reflect.Field cachedSizeField(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor) {
        return field(cls, getCachedSizeFieldName(fieldDescriptor));
    }

    private static MessageInfo convert(Class<?> cls, Descriptors.Descriptor descriptor) {
        java.lang.reflect.Field field;
        FieldInfo fieldInfoForExplicitPresenceField;
        FieldInfo fieldInfoForRepeatedMessageField;
        List<Descriptors.FieldDescriptor> fields = descriptor.getFields();
        StructuralMessageInfo.Builder builderNewBuilder = StructuralMessageInfo.newBuilder(fields.size());
        builderNewBuilder.withDefaultInstance(getDefaultInstance(cls));
        builderNewBuilder.withSyntax(convertSyntax(descriptor.getFile().getSyntax()));
        builderNewBuilder.withMessageSetWireFormat(descriptor.getOptions().getMessageSetWireFormat());
        C38871 c38871 = null;
        OneofState oneofState = new OneofState();
        java.lang.reflect.Field fieldBitField = null;
        int i = 0;
        int i8 = 0;
        int i9 = 1;
        while (i < fields.size()) {
            final Descriptors.FieldDescriptor fieldDescriptor = fields.get(i);
            boolean zNeedsUtf8Check = fieldDescriptor.needsUtf8Check();
            Descriptors.FieldDescriptor.JavaType javaType = fieldDescriptor.getJavaType();
            Descriptors.FieldDescriptor.JavaType javaType2 = Descriptors.FieldDescriptor.JavaType.ENUM;
            Internal.EnumVerifier enumVerifier = (javaType == javaType2 && fieldDescriptor.legacyEnumFieldTreatedAsClosed()) ? new Internal.EnumVerifier() { // from class: com.google.protobuf.DescriptorMessageInfoFactory.1
                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return fieldDescriptor.getEnumType().findValueByNumber(i10) != null;
                }
            } : c38871;
            if (fieldDescriptor.getRealContainingOneof() != null) {
                builderNewBuilder.withField(buildOneofMember(cls, fieldDescriptor, oneofState, zNeedsUtf8Check, enumVerifier));
            } else {
                java.lang.reflect.Field field2 = field(cls, fieldDescriptor);
                int number = fieldDescriptor.getNumber();
                FieldType fieldType = getFieldType(fieldDescriptor);
                if (fieldDescriptor.hasPresence()) {
                    if (fieldBitField == null) {
                        fieldBitField = bitField(cls, i8);
                    }
                    if (fieldDescriptor.isRequired()) {
                        field = fieldBitField;
                        fieldInfoForExplicitPresenceField = FieldInfo.forLegacyRequiredField(field2, number, fieldType, field, i9, zNeedsUtf8Check, enumVerifier);
                    } else {
                        field = fieldBitField;
                        fieldInfoForExplicitPresenceField = FieldInfo.forExplicitPresenceField(field2, number, fieldType, field, i9, zNeedsUtf8Check, enumVerifier);
                    }
                    builderNewBuilder.withField(fieldInfoForExplicitPresenceField);
                    i9 <<= 1;
                    if (i9 == 0) {
                        i8++;
                        fieldBitField = null;
                        i9 = 1;
                    } else {
                        fieldBitField = field;
                    }
                } else {
                    if (fieldDescriptor.isMapField()) {
                        final Descriptors.FieldDescriptor fieldDescriptorFindFieldByNumber = fieldDescriptor.getMessageType().findFieldByNumber(2);
                        if (fieldDescriptorFindFieldByNumber.getJavaType() == javaType2 && fieldDescriptorFindFieldByNumber.legacyEnumFieldTreatedAsClosed()) {
                            enumVerifier = new Internal.EnumVerifier() { // from class: com.google.protobuf.DescriptorMessageInfoFactory.2
                                @Override // com.google.protobuf.Internal.EnumVerifier
                                public boolean isInRange(int i10) {
                                    return fieldDescriptorFindFieldByNumber.getEnumType().findValueByNumber(i10) != null;
                                }
                            };
                        }
                        fieldInfoForRepeatedMessageField = FieldInfo.forMapField(field2, number, SchemaUtil.getMapDefaultEntry(cls, fieldDescriptor.getName()), enumVerifier);
                    } else {
                        fieldInfoForRepeatedMessageField = (fieldDescriptor.isRepeated() && fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) ? FieldInfo.forRepeatedMessageField(field2, number, fieldType, getTypeForRepeatedMessageField(cls, fieldDescriptor)) : fieldDescriptor.isPacked() ? enumVerifier != null ? FieldInfo.forPackedFieldWithEnumVerifier(field2, number, fieldType, enumVerifier, cachedSizeField(cls, fieldDescriptor)) : FieldInfo.forPackedField(field2, number, fieldType, cachedSizeField(cls, fieldDescriptor)) : enumVerifier != null ? FieldInfo.forFieldWithEnumVerifier(field2, number, fieldType, enumVerifier) : FieldInfo.forField(field2, number, fieldType, zNeedsUtf8Check);
                    }
                    builderNewBuilder.withField(fieldInfoForRepeatedMessageField);
                }
            }
            i++;
            c38871 = null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < fields.size(); i10++) {
            Descriptors.FieldDescriptor fieldDescriptor2 = fields.get(i10);
            if (fieldDescriptor2.isRequired() || (fieldDescriptor2.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE && needsIsInitializedCheck(fieldDescriptor2.getMessageType()))) {
                arrayList.add(Integer.valueOf(fieldDescriptor2.getNumber()));
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        if (size > 0) {
            builderNewBuilder.withCheckInitialized(iArr);
        }
        return builderNewBuilder.build();
    }

    private static ProtoSyntax convertSyntax(Descriptors.FileDescriptor.Syntax syntax) {
        int i = C38893.$SwitchMap$com$google$protobuf$Descriptors$FileDescriptor$Syntax[syntax.ordinal()];
        if (i == 1) {
            return ProtoSyntax.PROTO2;
        }
        if (i == 2) {
            return ProtoSyntax.PROTO3;
        }
        if (i == 3) {
            return ProtoSyntax.EDITIONS;
        }
        throw new IllegalArgumentException("Unsupported syntax: " + syntax);
    }

    private static Descriptors.Descriptor descriptorForType(Class<?> cls) {
        return getDefaultInstance(cls).getDescriptorForType();
    }

    private static java.lang.reflect.Field field(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor) {
        return field(cls, getFieldName(fieldDescriptor));
    }

    private static String getCachedSizeFieldName(Descriptors.FieldDescriptor fieldDescriptor) {
        return AbstractC0037f.m91p(new StringBuilder(), snakeCaseToLowerCamelCase(fieldDescriptor.getName()), "MemoizedSerializedSize");
    }

    private static Message getDefaultInstance(Class<?> cls) {
        try {
            return (Message) cls.getDeclaredMethod(GET_DEFAULT_INSTANCE_METHOD_NAME, null).invoke(null, null);
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to get default instance for message class ".concat(cls.getName()), e);
        }
    }

    public static String getFieldName(Descriptors.FieldDescriptor fieldDescriptor) {
        String name = fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP ? fieldDescriptor.getMessageType().getName() : fieldDescriptor.getName();
        return AbstractC0037f.m91p(new StringBuilder(), snakeCaseToLowerCamelCase(name), specialFieldNames.contains(snakeCaseToUpperCamelCase(name)) ? "__" : "_");
    }

    private static FieldType getFieldType(Descriptors.FieldDescriptor fieldDescriptor) {
        switch (C38893.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[fieldDescriptor.getType().ordinal()]) {
            case 1:
                return !fieldDescriptor.isRepeated() ? FieldType.BOOL : fieldDescriptor.isPacked() ? FieldType.BOOL_LIST_PACKED : FieldType.BOOL_LIST;
            case 2:
                return fieldDescriptor.isRepeated() ? FieldType.BYTES_LIST : FieldType.BYTES;
            case 3:
                return !fieldDescriptor.isRepeated() ? FieldType.DOUBLE : fieldDescriptor.isPacked() ? FieldType.DOUBLE_LIST_PACKED : FieldType.DOUBLE_LIST;
            case 4:
                return !fieldDescriptor.isRepeated() ? FieldType.ENUM : fieldDescriptor.isPacked() ? FieldType.ENUM_LIST_PACKED : FieldType.ENUM_LIST;
            case 5:
                return !fieldDescriptor.isRepeated() ? FieldType.FIXED32 : fieldDescriptor.isPacked() ? FieldType.FIXED32_LIST_PACKED : FieldType.FIXED32_LIST;
            case 6:
                return !fieldDescriptor.isRepeated() ? FieldType.FIXED64 : fieldDescriptor.isPacked() ? FieldType.FIXED64_LIST_PACKED : FieldType.FIXED64_LIST;
            case 7:
                return !fieldDescriptor.isRepeated() ? FieldType.FLOAT : fieldDescriptor.isPacked() ? FieldType.FLOAT_LIST_PACKED : FieldType.FLOAT_LIST;
            case 8:
                return fieldDescriptor.isRepeated() ? FieldType.GROUP_LIST : FieldType.GROUP;
            case 9:
                return !fieldDescriptor.isRepeated() ? FieldType.INT32 : fieldDescriptor.isPacked() ? FieldType.INT32_LIST_PACKED : FieldType.INT32_LIST;
            case 10:
                return !fieldDescriptor.isRepeated() ? FieldType.INT64 : fieldDescriptor.isPacked() ? FieldType.INT64_LIST_PACKED : FieldType.INT64_LIST;
            case 11:
                return fieldDescriptor.isMapField() ? FieldType.MAP : fieldDescriptor.isRepeated() ? FieldType.MESSAGE_LIST : FieldType.MESSAGE;
            case 12:
                return !fieldDescriptor.isRepeated() ? FieldType.SFIXED32 : fieldDescriptor.isPacked() ? FieldType.SFIXED32_LIST_PACKED : FieldType.SFIXED32_LIST;
            case 13:
                return !fieldDescriptor.isRepeated() ? FieldType.SFIXED64 : fieldDescriptor.isPacked() ? FieldType.SFIXED64_LIST_PACKED : FieldType.SFIXED64_LIST;
            case 14:
                return !fieldDescriptor.isRepeated() ? FieldType.SINT32 : fieldDescriptor.isPacked() ? FieldType.SINT32_LIST_PACKED : FieldType.SINT32_LIST;
            case 15:
                return !fieldDescriptor.isRepeated() ? FieldType.SINT64 : fieldDescriptor.isPacked() ? FieldType.SINT64_LIST_PACKED : FieldType.SINT64_LIST;
            case 16:
                return fieldDescriptor.isRepeated() ? FieldType.STRING_LIST : FieldType.STRING;
            case 17:
                return !fieldDescriptor.isRepeated() ? FieldType.UINT32 : fieldDescriptor.isPacked() ? FieldType.UINT32_LIST_PACKED : FieldType.UINT32_LIST;
            case 18:
                return !fieldDescriptor.isRepeated() ? FieldType.UINT64 : fieldDescriptor.isPacked() ? FieldType.UINT64_LIST_PACKED : FieldType.UINT64_LIST;
            default:
                throw new IllegalArgumentException("Unsupported field type: " + fieldDescriptor.getType());
        }
    }

    public static DescriptorMessageInfoFactory getInstance() {
        return instance;
    }

    private static Class<?> getOneofStoredType(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor, FieldType fieldType) {
        switch (C38893.$SwitchMap$com$google$protobuf$JavaType[fieldType.getJavaType().ordinal()]) {
            case 1:
                return Boolean.class;
            case 2:
                return ByteString.class;
            case 3:
                return Double.class;
            case 4:
                return Float.class;
            case 5:
            case 6:
                return Integer.class;
            case 7:
                return Long.class;
            case 8:
                return String.class;
            case 9:
                return getOneofStoredTypeForMessage(cls, fieldDescriptor);
            default:
                throw new IllegalArgumentException("Invalid type for oneof: " + fieldType);
        }
    }

    private static Class<?> getOneofStoredTypeForMessage(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor) {
        try {
            return cls.getDeclaredMethod(getterForField(fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP ? fieldDescriptor.getMessageType().getName() : fieldDescriptor.getName()), null).getReturnType();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static Class<?> getTypeForRepeatedMessageField(Class<?> cls, Descriptors.FieldDescriptor fieldDescriptor) {
        try {
            return cls.getDeclaredMethod(getterForField(fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP ? fieldDescriptor.getMessageType().getName() : fieldDescriptor.getName()), Integer.TYPE).getReturnType();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String getterForField(String str) {
        String strSnakeCaseToLowerCamelCase = snakeCaseToLowerCamelCase(str);
        return "get" + Character.toUpperCase(strSnakeCaseToLowerCamelCase.charAt(0)) + strSnakeCaseToLowerCamelCase.substring(1, strSnakeCaseToLowerCamelCase.length());
    }

    private static boolean needsIsInitializedCheck(Descriptors.Descriptor descriptor) {
        return isInitializedCheckAnalyzer.needsIsInitializedCheck(descriptor);
    }

    private static String snakeCaseToCamelCase(String str, boolean z8) {
        StringBuilder sb = new StringBuilder(str.length() + 1);
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '_') {
                z8 = true;
            } else if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
                z8 = true;
            } else if (z8) {
                sb.append(Character.toUpperCase(cCharAt));
                z8 = false;
            } else if (i == 0) {
                sb.append(Character.toLowerCase(cCharAt));
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String snakeCaseToLowerCamelCase(String str) {
        return snakeCaseToCamelCase(str, false);
    }

    private static String snakeCaseToUpperCamelCase(String str) {
        return snakeCaseToCamelCase(str, true);
    }

    @Override // com.google.protobuf.MessageInfoFactory
    public boolean isSupported(Class<?> cls) {
        return GeneratedMessageV3.class.isAssignableFrom(cls);
    }

    @Override // com.google.protobuf.MessageInfoFactory
    public MessageInfo messageInfoFor(Class<?> cls) {
        if (GeneratedMessageV3.class.isAssignableFrom(cls)) {
            return convert(cls, descriptorForType(cls));
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Field field(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception unused) {
            StringBuilder sbM100y = AbstractC0037f.m100y("Unable to find field ", str, " in message class ");
            sbM100y.append(cls.getName());
            throw new IllegalArgumentException(sbM100y.toString());
        }
    }
}
