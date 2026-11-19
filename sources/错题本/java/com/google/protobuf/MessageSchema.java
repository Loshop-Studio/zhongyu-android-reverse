package com.google.protobuf;

import android.support.v4.media.AbstractC0037f;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.ByteString;
import com.google.protobuf.Internal;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

@CheckReturnValue
/* loaded from: classes3.dex */
final class MessageSchema<T> implements Schema<T> {
    private static final int CHECK_INITIALIZED_BIT = 1024;
    private static final int ENFORCE_UTF8_MASK = 536870912;
    private static final int FIELD_TYPE_MASK = 267386880;
    private static final int HAS_HAS_BIT = 4096;
    private static final int INTS_PER_FIELD = 3;
    private static final int LEGACY_ENUM_IS_CLOSED_BIT = 2048;
    private static final int LEGACY_ENUM_IS_CLOSED_MASK = Integer.MIN_VALUE;
    private static final int NO_PRESENCE_SENTINEL = 1048575;
    private static final int OFFSET_BITS = 20;
    private static final int OFFSET_MASK = 1048575;
    static final int ONEOF_TYPE_OFFSET = 51;
    private static final int REQUIRED_BIT = 256;
    private static final int REQUIRED_MASK = 268435456;
    private static final int UTF8_CHECK_BIT = 512;
    private final int[] buffer;
    private final int checkInitializedCount;
    private final MessageLite defaultInstance;
    private final ExtensionSchema<?> extensionSchema;
    private final boolean hasExtensions;
    private final int[] intArray;
    private final ListFieldSchema listFieldSchema;
    private final boolean lite;
    private final MapFieldSchema mapFieldSchema;
    private final int maxFieldNumber;
    private final int minFieldNumber;
    private final NewInstanceSchema newInstanceSchema;
    private final Object[] objects;
    private final int repeatedFieldOffsetStart;
    private final ProtoSyntax syntax;
    private final UnknownFieldSchema<?, ?> unknownFieldSchema;
    private final boolean useCachedSizeField;
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final Unsafe UNSAFE = UnsafeUtil.getUnsafe();

    /* renamed from: com.google.protobuf.MessageSchema$1 */
    public static /* synthetic */ class C39851 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private MessageSchema(int[] iArr, Object[] objArr, int i, int i8, MessageLite messageLite, ProtoSyntax protoSyntax, boolean z8, int[] iArr2, int i9, int i10, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        this.buffer = iArr;
        this.objects = objArr;
        this.minFieldNumber = i;
        this.maxFieldNumber = i8;
        this.lite = messageLite instanceof GeneratedMessageLite;
        this.syntax = protoSyntax;
        this.hasExtensions = extensionSchema != null && extensionSchema.hasExtensions(messageLite);
        this.useCachedSizeField = z8;
        this.intArray = iArr2;
        this.checkInitializedCount = i9;
        this.repeatedFieldOffsetStart = i10;
        this.newInstanceSchema = newInstanceSchema;
        this.listFieldSchema = listFieldSchema;
        this.unknownFieldSchema = unknownFieldSchema;
        this.extensionSchema = extensionSchema;
        this.defaultInstance = messageLite;
        this.mapFieldSchema = mapFieldSchema;
    }

    private boolean arePresentForEquals(T t8, T t9, int i) {
        return isFieldPresent(t8, i) == isFieldPresent(t9, i);
    }

    private static <T> boolean booleanAt(T t8, long j7) {
        return UnsafeUtil.getBoolean(t8, j7);
    }

    private static void checkMutable(Object obj) {
        if (!isMutable(obj)) {
            throw new IllegalArgumentException(AbstractC0037f.m84i(obj, "Mutating immutable message: "));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int decodeMapEntry(byte[] bArr, int i, int i8, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
        int i9 = registers.int1;
        if (i9 < 0 || i9 > i8 - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i10 = iDecodeVarint32 + i9;
        Object obj = metadata.defaultKey;
        Object obj2 = metadata.defaultValue;
        while (iDecodeVarint32 < i10) {
            int iDecodeVarint322 = iDecodeVarint32 + 1;
            int i11 = bArr[iDecodeVarint32];
            if (i11 < 0) {
                iDecodeVarint322 = ArrayDecoders.decodeVarint32(i11, bArr, iDecodeVarint322, registers);
                i11 = registers.int1;
            }
            int i12 = iDecodeVarint322;
            int i13 = i11 >>> 3;
            int i14 = i11 & 7;
            if (i13 != 1) {
                if (i13 == 2 && i14 == metadata.valueType.getWireType()) {
                    iDecodeVarint32 = decodeMapEntryValue(bArr, i12, i8, metadata.valueType, metadata.defaultValue.getClass(), registers);
                    obj2 = registers.object1;
                } else {
                    iDecodeVarint32 = ArrayDecoders.skipField(i11, bArr, i12, i8, registers);
                }
            } else if (i14 == metadata.keyType.getWireType()) {
                iDecodeVarint32 = decodeMapEntryValue(bArr, i12, i8, metadata.keyType, null, registers);
                obj = registers.object1;
            } else {
                iDecodeVarint32 = ArrayDecoders.skipField(i11, bArr, i12, i8, registers);
            }
        }
        if (iDecodeVarint32 != i10) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        map.put(obj, obj2);
        return i10;
    }

    private int decodeMapEntryValue(byte[] bArr, int i, int i8, WireFormat.FieldType fieldType, Class<?> cls, ArrayDecoders.Registers registers) throws IOException {
        switch (C39851.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = Boolean.valueOf(registers.long1 != 0);
                return iDecodeVarint64;
            case 2:
                return ArrayDecoders.decodeBytes(bArr, i, registers);
            case 3:
                registers.object1 = Double.valueOf(ArrayDecoders.decodeDouble(bArr, i));
                return i + 8;
            case 4:
            case 5:
                registers.object1 = Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i));
                return i + 4;
            case 6:
            case 7:
                registers.object1 = Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i));
                return i + 8;
            case 8:
                registers.object1 = Float.valueOf(ArrayDecoders.decodeFloat(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                registers.object1 = Integer.valueOf(registers.int1);
                return iDecodeVarint32;
            case 12:
            case 13:
                int iDecodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = Long.valueOf(registers.long1);
                return iDecodeVarint642;
            case 14:
                return ArrayDecoders.decodeMessageField(Protobuf.getInstance().schemaFor((Class) cls), bArr, i, i8, registers);
            case 15:
                int iDecodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                registers.object1 = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                return iDecodeVarint322;
            case 16:
                int iDecodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                registers.object1 = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                return iDecodeVarint643;
            case 17:
                return ArrayDecoders.decodeStringRequireUtf8(bArr, i, registers);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static <T> double doubleAt(T t8, long j7) {
        return UnsafeUtil.getDouble(t8, j7);
    }

    private <UT, UB> UB filterMapUnknownEnumValues(Object obj, int i, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj2) {
        Internal.EnumVerifier enumFieldVerifier;
        int iNumberAt = numberAt(i);
        Object object = UnsafeUtil.getObject(obj, offset(typeAndOffsetAt(i)));
        return (object == null || (enumFieldVerifier = getEnumFieldVerifier(i)) == null) ? ub : (UB) filterUnknownEnumMap(i, iNumberAt, this.mapFieldSchema.forMutableMapData(object), enumFieldVerifier, ub, unknownFieldSchema, obj2);
    }

    private <K, V, UT, UB> UB filterUnknownEnumMap(int i, int i8, Map<K, V> map, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema, Object obj) {
        MapEntryLite.Metadata<?, ?> metadataForMapMetadata = this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = unknownFieldSchema.getBuilderFromMessage(obj);
                }
                ByteString.CodedBuilder codedBuilderNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadataForMapMetadata, next.getKey(), next.getValue()));
                try {
                    MapEntryLite.writeTo(codedBuilderNewCodedBuilder.getCodedOutput(), metadataForMapMetadata, next.getKey(), next.getValue());
                    unknownFieldSchema.addLengthDelimited(ub, i8, codedBuilderNewCodedBuilder.build());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private static <T> float floatAt(T t8, long j7) {
        return UnsafeUtil.getFloat(t8, j7);
    }

    private Internal.EnumVerifier getEnumFieldVerifier(int i) {
        return (Internal.EnumVerifier) this.objects[((i / 3) * 2) + 1];
    }

    private Object getMapFieldDefaultEntry(int i) {
        return this.objects[(i / 3) * 2];
    }

    private Schema getMessageFieldSchema(int i) {
        int i8 = (i / 3) * 2;
        Schema schema = (Schema) this.objects[i8];
        if (schema != null) {
            return schema;
        }
        Schema<T> schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) this.objects[i8 + 1]);
        this.objects[i8] = schemaSchemaFor;
        return schemaSchemaFor;
    }

    public static UnknownFieldSetLite getMutableUnknownFields(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    private <UT, UB> int getUnknownFieldsSerializedSize(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t8) {
        return unknownFieldSchema.getSerializedSize(unknownFieldSchema.getFromMessage(t8));
    }

    private static <T> int intAt(T t8, long j7) {
        return UnsafeUtil.getInt(t8, j7);
    }

    private static boolean isEnforceUtf8(int i) {
        return (i & ENFORCE_UTF8_MASK) != 0;
    }

    private boolean isFieldPresent(T t8, int i, int i8, int i9, int i10) {
        return i8 == 1048575 ? isFieldPresent(t8, i) : (i9 & i10) != 0;
    }

    private static boolean isLegacyEnumIsClosed(int i) {
        return (i & Integer.MIN_VALUE) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean isListInitialized(Object obj, int i, int i8) {
        List list = (List) UnsafeUtil.getObject(obj, offset(i));
        if (list.isEmpty()) {
            return true;
        }
        Schema messageFieldSchema = getMessageFieldSchema(i8);
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (!messageFieldSchema.isInitialized(list.get(i9))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.Schema] */
    private boolean isMapInitialized(T t8, int i, int i8) {
        Map<?, ?> mapForMapData = this.mapFieldSchema.forMapData(UnsafeUtil.getObject(t8, offset(i)));
        if (mapForMapData.isEmpty()) {
            return true;
        }
        if (this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i8)).valueType.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        ?? SchemaFor = 0;
        for (Object obj : mapForMapData.values()) {
            SchemaFor = SchemaFor;
            if (SchemaFor == 0) {
                SchemaFor = Protobuf.getInstance().schemaFor((Class) obj.getClass());
            }
            if (!SchemaFor.isInitialized(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isMutable(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    private boolean isOneofCaseEqual(T t8, T t9, int i) {
        long jPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i) & 1048575;
        return UnsafeUtil.getInt(t8, jPresenceMaskAndOffsetAt) == UnsafeUtil.getInt(t9, jPresenceMaskAndOffsetAt);
    }

    private boolean isOneofPresent(T t8, int i, int i8) {
        return UnsafeUtil.getInt(t8, (long) (presenceMaskAndOffsetAt(i8) & 1048575)) == i;
    }

    private static boolean isRequired(int i) {
        return (i & REQUIRED_MASK) != 0;
    }

    private static <T> long longAt(T t8, long j7) {
        return UnsafeUtil.getLong(t8, j7);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private <UT, UB, ET extends com.google.protobuf.FieldSet.FieldDescriptorLite<ET>> void mergeFromHelper(com.google.protobuf.UnknownFieldSchema<UT, UB> r18, com.google.protobuf.ExtensionSchema<ET> r19, T r20, com.google.protobuf.Reader r21, com.google.protobuf.ExtensionRegistryLite r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.mergeFromHelper(com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, java.lang.Object, com.google.protobuf.Reader, com.google.protobuf.ExtensionRegistryLite):void");
    }

    private final <K, V> void mergeMap(Object obj, int i, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) throws IOException {
        long jOffset = offset(typeAndOffsetAt(i));
        Object object = UnsafeUtil.getObject(obj, jOffset);
        if (object == null) {
            object = this.mapFieldSchema.newMapField(obj2);
            UnsafeUtil.putObject(obj, jOffset, object);
        } else if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(obj2);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            UnsafeUtil.putObject(obj, jOffset, objNewMapField);
            object = objNewMapField;
        }
        reader.readMap(this.mapFieldSchema.forMutableMapData(object), this.mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeMessage(T t8, T t9, int i) {
        if (isFieldPresent(t9, i)) {
            long jOffset = offset(typeAndOffsetAt(i));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t9, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t9);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isFieldPresent(t8, i)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t8, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t8, jOffset, object);
                }
                setFieldPresent(t8, i);
                return;
            }
            Object object2 = unsafe.getObject(t8, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t8, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void mergeOneofMessage(T t8, T t9, int i) {
        int iNumberAt = numberAt(i);
        if (isOneofPresent(t9, iNumberAt, i)) {
            long jOffset = offset(typeAndOffsetAt(i));
            Unsafe unsafe = UNSAFE;
            Object object = unsafe.getObject(t9, jOffset);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + numberAt(i) + " is present but null: " + t9);
            }
            Schema messageFieldSchema = getMessageFieldSchema(i);
            if (!isOneofPresent(t8, iNumberAt, i)) {
                if (isMutable(object)) {
                    Object objNewInstance = messageFieldSchema.newInstance();
                    messageFieldSchema.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t8, jOffset, objNewInstance);
                } else {
                    unsafe.putObject(t8, jOffset, object);
                }
                setOneofPresent(t8, iNumberAt, i);
                return;
            }
            Object object2 = unsafe.getObject(t8, jOffset);
            if (!isMutable(object2)) {
                Object objNewInstance2 = messageFieldSchema.newInstance();
                messageFieldSchema.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t8, jOffset, objNewInstance2);
                object2 = objNewInstance2;
            }
            messageFieldSchema.mergeFrom(object2, object);
        }
    }

    private void mergeSingleField(T t8, T t9, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        int iNumberAt = numberAt(i);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (isFieldPresent(t9, i)) {
                    UnsafeUtil.putDouble(t8, jOffset, UnsafeUtil.getDouble(t9, jOffset));
                    setFieldPresent(t8, i);
                    break;
                }
                break;
            case 1:
                if (isFieldPresent(t9, i)) {
                    UnsafeUtil.putFloat(t8, jOffset, UnsafeUtil.getFloat(t9, jOffset));
                    setFieldPresent(t8, i);
                    break;
                }
                break;
            case 2:
                if (isFieldPresent(t9, i)) {
                    UnsafeUtil.putLong(t8, jOffset, UnsafeUtil.getLong(t9, jOffset));
                    setFieldPresent(t8, i);
                    break;
                }
                break;
            case 3:
                if (isFieldPresent(t9, i)) {
                    UnsafeUtil.putLong(t8, jOffset, UnsafeUtil.getLong(t9, jOffset));
                    setFieldPresent(t8, i);
                    break;
                }
                break;
            case 4:
                if (isFieldPresent(t9, i)) {
                    UnsafeUtil.putInt(t8, jOffset, UnsafeUtil.getInt(t9, jOffset));
                    setFieldPresent(t8, i);
                    break;
                }
                break;
            case 5:
                if (isFieldPresent(t9, i)) {
                    UnsafeUtil.putLong(t8, jOffset, UnsafeUtil.getLong(t9, jOffset));
                    setFieldPresent(t8, i);
                    break;
                }
                break;
            case 6:
                if (isFieldPresent(t9, i)) {
                    UnsafeUtil.putInt(t8, jOffset, UnsafeUtil.getInt(t9, jOffset));
                    setFieldPresent(t8, i);
                    break;
                }
                break;
            case 7:
                if (isFieldPresent(t9, i)) {
                    UnsafeUtil.putBoolean(t8, jOffset, UnsafeUtil.getBoolean(t9, jOffset));
                    setFieldPresent(t8, i);
                    break;
                }
                break;
            case 8:
                if (isFieldPresent(t9, i)) {
                    UnsafeUtil.putObject(t8, jOffset, UnsafeUtil.getObject(t9, jOffset));
                    setFieldPresent(t8, i);
                    break;
                }
                break;
            case 9:
                mergeMessage(t8, t9, i);
                break;
            case 10:
                if (isFieldPresent(t9, i)) {
                    UnsafeUtil.putObject(t8, jOffset, UnsafeUtil.getObject(t9, jOffset));
                    setFieldPresent(t8, i);
                    break;
                }
                break;
            case 11:
                if (isFieldPresent(t9, i)) {
                    UnsafeUtil.putInt(t8, jOffset, UnsafeUtil.getInt(t9, jOffset));
                    setFieldPresent(t8, i);
                    break;
                }
                break;
            case 12:
                if (isFieldPresent(t9, i)) {
                    UnsafeUtil.putInt(t8, jOffset, UnsafeUtil.getInt(t9, jOffset));
                    setFieldPresent(t8, i);
                    break;
                }
                break;
            case 13:
                if (isFieldPresent(t9, i)) {
                    UnsafeUtil.putInt(t8, jOffset, UnsafeUtil.getInt(t9, jOffset));
                    setFieldPresent(t8, i);
                    break;
                }
                break;
            case 14:
                if (isFieldPresent(t9, i)) {
                    UnsafeUtil.putLong(t8, jOffset, UnsafeUtil.getLong(t9, jOffset));
                    setFieldPresent(t8, i);
                    break;
                }
                break;
            case 15:
                if (isFieldPresent(t9, i)) {
                    UnsafeUtil.putInt(t8, jOffset, UnsafeUtil.getInt(t9, jOffset));
                    setFieldPresent(t8, i);
                    break;
                }
                break;
            case 16:
                if (isFieldPresent(t9, i)) {
                    UnsafeUtil.putLong(t8, jOffset, UnsafeUtil.getLong(t9, jOffset));
                    setFieldPresent(t8, i);
                    break;
                }
                break;
            case 17:
                mergeMessage(t8, t9, i);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                this.listFieldSchema.mergeListsAt(t8, t9, jOffset);
                break;
            case 50:
                SchemaUtil.mergeMap(this.mapFieldSchema, t8, t9, jOffset);
                break;
            case 51:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
            case 56:
            case 57:
            case 58:
            case 59:
                if (isOneofPresent(t9, iNumberAt, i)) {
                    UnsafeUtil.putObject(t8, jOffset, UnsafeUtil.getObject(t9, jOffset));
                    setOneofPresent(t8, iNumberAt, i);
                    break;
                }
                break;
            case 60:
                mergeOneofMessage(t8, t9, i);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                if (isOneofPresent(t9, iNumberAt, i)) {
                    UnsafeUtil.putObject(t8, jOffset, UnsafeUtil.getObject(t9, jOffset));
                    setOneofPresent(t8, iNumberAt, i);
                    break;
                }
                break;
            case 68:
                mergeOneofMessage(t8, t9, i);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableMessageFieldForMerge(T t8, int i) {
        Schema messageFieldSchema = getMessageFieldSchema(i);
        long jOffset = offset(typeAndOffsetAt(i));
        if (!isFieldPresent(t8, i)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t8, jOffset);
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object mutableOneofMessageFieldForMerge(T t8, int i, int i8) {
        Schema messageFieldSchema = getMessageFieldSchema(i8);
        if (!isOneofPresent(t8, i, i8)) {
            return messageFieldSchema.newInstance();
        }
        Object object = UNSAFE.getObject(t8, offset(typeAndOffsetAt(i8)));
        if (isMutable(object)) {
            return object;
        }
        Object objNewInstance = messageFieldSchema.newInstance();
        if (object != null) {
            messageFieldSchema.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public static <T> MessageSchema<T> newSchema(Class<T> cls, MessageInfo messageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        return messageInfo instanceof RawMessageInfo ? newSchemaForRawMessageInfo((RawMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema) : newSchemaForMessageInfo((StructuralMessageInfo) messageInfo, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static <T> MessageSchema<T> newSchemaForMessageInfo(StructuralMessageInfo structuralMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema<?, ?> unknownFieldSchema, ExtensionSchema<?> extensionSchema, MapFieldSchema mapFieldSchema) {
        int fieldNumber;
        int fieldNumber2;
        int i;
        FieldInfo[] fields = structuralMessageInfo.getFields();
        if (fields.length == 0) {
            fieldNumber = 0;
            fieldNumber2 = 0;
        } else {
            fieldNumber = fields[0].getFieldNumber();
            fieldNumber2 = fields[fields.length - 1].getFieldNumber();
        }
        int length = fields.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i8 = 0;
        int i9 = 0;
        for (FieldInfo fieldInfo : fields) {
            if (fieldInfo.getType() == FieldType.MAP) {
                i8++;
            } else if (fieldInfo.getType().m2825id() >= 18 && fieldInfo.getType().m2825id() <= 49) {
                i9++;
            }
        }
        int[] iArr2 = i8 > 0 ? new int[i8] : null;
        int[] iArr3 = i9 > 0 ? new int[i9] : null;
        int[] checkInitialized = structuralMessageInfo.getCheckInitialized();
        if (checkInitialized == null) {
            checkInitialized = EMPTY_INT_ARRAY;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i10 < fields.length) {
            FieldInfo fieldInfo2 = fields[i10];
            int fieldNumber3 = fieldInfo2.getFieldNumber();
            storeFieldData(fieldInfo2, iArr, i11, objArr);
            if (i12 < checkInitialized.length && checkInitialized[i12] == fieldNumber3) {
                checkInitialized[i12] = i11;
                i12++;
            }
            if (fieldInfo2.getType() == FieldType.MAP) {
                iArr2[i13] = i11;
                i13++;
            } else {
                if (fieldInfo2.getType().m2825id() >= 18 && fieldInfo2.getType().m2825id() <= 49) {
                    i = i11;
                    iArr3[i14] = (int) UnsafeUtil.objectFieldOffset(fieldInfo2.getField());
                    i14++;
                }
                i10++;
                i11 = i + 3;
            }
            i = i11;
            i10++;
            i11 = i + 3;
        }
        if (iArr2 == null) {
            iArr2 = EMPTY_INT_ARRAY;
        }
        if (iArr3 == null) {
            iArr3 = EMPTY_INT_ARRAY;
        }
        int[] iArr4 = new int[checkInitialized.length + iArr2.length + iArr3.length];
        System.arraycopy(checkInitialized, 0, iArr4, 0, checkInitialized.length);
        System.arraycopy(iArr2, 0, iArr4, checkInitialized.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr4, checkInitialized.length + iArr2.length, iArr3.length);
        return new MessageSchema<>(iArr, objArr, fieldNumber, fieldNumber2, structuralMessageInfo.getDefaultInstance(), structuralMessageInfo.getSyntax(), true, iArr4, checkInitialized.length, checkInitialized.length + iArr2.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0376  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.google.protobuf.MessageSchema<T> newSchemaForRawMessageInfo(com.google.protobuf.RawMessageInfo r32, com.google.protobuf.NewInstanceSchema r33, com.google.protobuf.ListFieldSchema r34, com.google.protobuf.UnknownFieldSchema<?, ?> r35, com.google.protobuf.ExtensionSchema<?> r36, com.google.protobuf.MapFieldSchema r37) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.newSchemaForRawMessageInfo(com.google.protobuf.RawMessageInfo, com.google.protobuf.NewInstanceSchema, com.google.protobuf.ListFieldSchema, com.google.protobuf.UnknownFieldSchema, com.google.protobuf.ExtensionSchema, com.google.protobuf.MapFieldSchema):com.google.protobuf.MessageSchema");
    }

    private int numberAt(int i) {
        return this.buffer[i];
    }

    private static long offset(int i) {
        return i & 1048575;
    }

    private static <T> boolean oneofBooleanAt(T t8, long j7) {
        return ((Boolean) UnsafeUtil.getObject(t8, j7)).booleanValue();
    }

    private static <T> double oneofDoubleAt(T t8, long j7) {
        return ((Double) UnsafeUtil.getObject(t8, j7)).doubleValue();
    }

    private static <T> float oneofFloatAt(T t8, long j7) {
        return ((Float) UnsafeUtil.getObject(t8, j7)).floatValue();
    }

    private static <T> int oneofIntAt(T t8, long j7) {
        return ((Integer) UnsafeUtil.getObject(t8, j7)).intValue();
    }

    private static <T> long oneofLongAt(T t8, long j7) {
        return ((Long) UnsafeUtil.getObject(t8, j7)).longValue();
    }

    private <K, V> int parseMapField(T t8, byte[] bArr, int i, int i8, int i9, long j7, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        Object mapFieldDefaultEntry = getMapFieldDefaultEntry(i9);
        Object object = unsafe.getObject(t8, j7);
        if (this.mapFieldSchema.isImmutable(object)) {
            Object objNewMapField = this.mapFieldSchema.newMapField(mapFieldDefaultEntry);
            this.mapFieldSchema.mergeFrom(objNewMapField, object);
            unsafe.putObject(t8, j7, objNewMapField);
            object = objNewMapField;
        }
        return decodeMapEntry(bArr, i, i8, this.mapFieldSchema.forMapMetadata(mapFieldDefaultEntry), this.mapFieldSchema.forMutableMapData(object), registers);
    }

    private int parseOneofField(T t8, byte[] bArr, int i, int i8, int i9, int i10, int i11, int i12, int i13, long j7, int i14, ArrayDecoders.Registers registers) throws IOException {
        Unsafe unsafe = UNSAFE;
        long j8 = this.buffer[i14 + 2] & 1048575;
        switch (i13) {
            case 51:
                if (i11 != 1) {
                    return i;
                }
                unsafe.putObject(t8, j7, Double.valueOf(ArrayDecoders.decodeDouble(bArr, i)));
                int i15 = i + 8;
                unsafe.putInt(t8, j8, i10);
                return i15;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                if (i11 != 5) {
                    return i;
                }
                unsafe.putObject(t8, j7, Float.valueOf(ArrayDecoders.decodeFloat(bArr, i)));
                int i16 = i + 4;
                unsafe.putInt(t8, j8, i10);
                return i16;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                if (i11 != 0) {
                    return i;
                }
                int iDecodeVarint64 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                unsafe.putObject(t8, j7, Long.valueOf(registers.long1));
                unsafe.putInt(t8, j8, i10);
                return iDecodeVarint64;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
            case 62:
                if (i11 != 0) {
                    return i;
                }
                int iDecodeVarint32 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                unsafe.putObject(t8, j7, Integer.valueOf(registers.int1));
                unsafe.putInt(t8, j8, i10);
                return iDecodeVarint32;
            case 56:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                if (i11 != 1) {
                    return i;
                }
                unsafe.putObject(t8, j7, Long.valueOf(ArrayDecoders.decodeFixed64(bArr, i)));
                int i17 = i + 8;
                unsafe.putInt(t8, j8, i10);
                return i17;
            case 57:
            case 64:
                if (i11 != 5) {
                    return i;
                }
                unsafe.putObject(t8, j7, Integer.valueOf(ArrayDecoders.decodeFixed32(bArr, i)));
                int i18 = i + 4;
                unsafe.putInt(t8, j8, i10);
                return i18;
            case 58:
                if (i11 != 0) {
                    return i;
                }
                int iDecodeVarint642 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                unsafe.putObject(t8, j7, Boolean.valueOf(registers.long1 != 0));
                unsafe.putInt(t8, j8, i10);
                return iDecodeVarint642;
            case 59:
                if (i11 != 2) {
                    return i;
                }
                int iDecodeVarint322 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                int i19 = registers.int1;
                if (i19 == 0) {
                    unsafe.putObject(t8, j7, "");
                } else {
                    if ((i12 & ENFORCE_UTF8_MASK) != 0 && !Utf8.isValidUtf8(bArr, iDecodeVarint322, iDecodeVarint322 + i19)) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putObject(t8, j7, new String(bArr, iDecodeVarint322, i19, Internal.UTF_8));
                    iDecodeVarint322 += i19;
                }
                unsafe.putInt(t8, j8, i10);
                return iDecodeVarint322;
            case 60:
                if (i11 != 2) {
                    return i;
                }
                Object objMutableOneofMessageFieldForMerge = mutableOneofMessageFieldForMerge(t8, i10, i14);
                int iMergeMessageField = ArrayDecoders.mergeMessageField(objMutableOneofMessageFieldForMerge, getMessageFieldSchema(i14), bArr, i, i8, registers);
                storeOneofMessageField(t8, i10, i14, objMutableOneofMessageFieldForMerge);
                return iMergeMessageField;
            case 61:
                if (i11 != 2) {
                    return i;
                }
                int iDecodeBytes = ArrayDecoders.decodeBytes(bArr, i, registers);
                unsafe.putObject(t8, j7, registers.object1);
                unsafe.putInt(t8, j8, i10);
                return iDecodeBytes;
            case 63:
                if (i11 != 0) {
                    return i;
                }
                int iDecodeVarint323 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                int i20 = registers.int1;
                Internal.EnumVerifier enumFieldVerifier = getEnumFieldVerifier(i14);
                if (enumFieldVerifier != null && !enumFieldVerifier.isInRange(i20)) {
                    getMutableUnknownFields(t8).storeField(i9, Long.valueOf(i20));
                    return iDecodeVarint323;
                }
                unsafe.putObject(t8, j7, Integer.valueOf(i20));
                unsafe.putInt(t8, j8, i10);
                return iDecodeVarint323;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                if (i11 != 0) {
                    return i;
                }
                int iDecodeVarint324 = ArrayDecoders.decodeVarint32(bArr, i, registers);
                unsafe.putObject(t8, j7, Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1)));
                unsafe.putInt(t8, j8, i10);
                return iDecodeVarint324;
            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                if (i11 != 0) {
                    return i;
                }
                int iDecodeVarint643 = ArrayDecoders.decodeVarint64(bArr, i, registers);
                unsafe.putObject(t8, j7, Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1)));
                unsafe.putInt(t8, j8, i10);
                return iDecodeVarint643;
            case 68:
                if (i11 == 3) {
                    Object objMutableOneofMessageFieldForMerge2 = mutableOneofMessageFieldForMerge(t8, i10, i14);
                    int iMergeGroupField = ArrayDecoders.mergeGroupField(objMutableOneofMessageFieldForMerge2, getMessageFieldSchema(i14), bArr, i, i8, (i9 & (-8)) | 4, registers);
                    storeOneofMessageField(t8, i10, i14, objMutableOneofMessageFieldForMerge2);
                    return iMergeGroupField;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int parseRepeatedField(T t8, byte[] bArr, int i, int i8, int i9, int i10, int i11, int i12, long j7, int i13, long j8, ArrayDecoders.Registers registers) throws IOException {
        int iDecodeVarint32List;
        Unsafe unsafe = UNSAFE;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(t8, j8);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t8, j8, protobufListMutableCopyWithCapacity2);
        }
        Internal.ProtobufList protobufList = protobufListMutableCopyWithCapacity2;
        switch (i13) {
            case 18:
            case 35:
                if (i11 == 2) {
                    return ArrayDecoders.decodePackedDoubleList(bArr, i, protobufList, registers);
                }
                if (i11 == 1) {
                    return ArrayDecoders.decodeDoubleList(i9, bArr, i, i8, protobufList, registers);
                }
                return i;
            case 19:
            case 36:
                if (i11 == 2) {
                    return ArrayDecoders.decodePackedFloatList(bArr, i, protobufList, registers);
                }
                if (i11 == 5) {
                    return ArrayDecoders.decodeFloatList(i9, bArr, i, i8, protobufList, registers);
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i11 == 2) {
                    return ArrayDecoders.decodePackedVarint64List(bArr, i, protobufList, registers);
                }
                if (i11 == 0) {
                    return ArrayDecoders.decodeVarint64List(i9, bArr, i, i8, protobufList, registers);
                }
                return i;
            case 22:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
            case 39:
            case 43:
                if (i11 == 2) {
                    return ArrayDecoders.decodePackedVarint32List(bArr, i, protobufList, registers);
                }
                if (i11 == 0) {
                    return ArrayDecoders.decodeVarint32List(i9, bArr, i, i8, protobufList, registers);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i11 == 2) {
                    return ArrayDecoders.decodePackedFixed64List(bArr, i, protobufList, registers);
                }
                if (i11 == 1) {
                    return ArrayDecoders.decodeFixed64List(i9, bArr, i, i8, protobufList, registers);
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i11 == 2) {
                    return ArrayDecoders.decodePackedFixed32List(bArr, i, protobufList, registers);
                }
                if (i11 == 5) {
                    return ArrayDecoders.decodeFixed32List(i9, bArr, i, i8, protobufList, registers);
                }
                return i;
            case 25:
            case 42:
                if (i11 == 2) {
                    return ArrayDecoders.decodePackedBoolList(bArr, i, protobufList, registers);
                }
                if (i11 == 0) {
                    return ArrayDecoders.decodeBoolList(i9, bArr, i, i8, protobufList, registers);
                }
                return i;
            case 26:
                if (i11 == 2) {
                    return (j7 & 536870912) == 0 ? ArrayDecoders.decodeStringList(i9, bArr, i, i8, protobufList, registers) : ArrayDecoders.decodeStringListRequireUtf8(i9, bArr, i, i8, protobufList, registers);
                }
                return i;
            case 27:
                if (i11 == 2) {
                    return ArrayDecoders.decodeMessageList(getMessageFieldSchema(i12), i9, bArr, i, i8, protobufList, registers);
                }
                return i;
            case 28:
                if (i11 == 2) {
                    return ArrayDecoders.decodeBytesList(i9, bArr, i, i8, protobufList, registers);
                }
                return i;
            case 30:
            case 44:
                if (i11 != 2) {
                    if (i11 == 0) {
                        iDecodeVarint32List = ArrayDecoders.decodeVarint32List(i9, bArr, i, i8, protobufList, registers);
                    }
                    return i;
                }
                iDecodeVarint32List = ArrayDecoders.decodePackedVarint32List(bArr, i, protobufList, registers);
                SchemaUtil.filterUnknownEnumList((Object) t8, i10, (List<Integer>) protobufList, getEnumFieldVerifier(i12), (Object) null, (UnknownFieldSchema<UT, Object>) this.unknownFieldSchema);
                return iDecodeVarint32List;
            case 33:
            case 47:
                if (i11 == 2) {
                    return ArrayDecoders.decodePackedSInt32List(bArr, i, protobufList, registers);
                }
                if (i11 == 0) {
                    return ArrayDecoders.decodeSInt32List(i9, bArr, i, i8, protobufList, registers);
                }
                return i;
            case 34:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                if (i11 == 2) {
                    return ArrayDecoders.decodePackedSInt64List(bArr, i, protobufList, registers);
                }
                if (i11 == 0) {
                    return ArrayDecoders.decodeSInt64List(i9, bArr, i, i8, protobufList, registers);
                }
                return i;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                if (i11 == 3) {
                    return ArrayDecoders.decodeGroupList(getMessageFieldSchema(i12), i9, bArr, i, i8, protobufList, registers);
                }
                return i;
            default:
                return i;
        }
    }

    private int positionForFieldNumber(int i) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, 0);
    }

    private int presenceMaskAndOffsetAt(int i) {
        return this.buffer[i + 2];
    }

    private <E> void readGroupList(Object obj, long j7, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readGroupList(this.listFieldSchema.mutableListAt(obj, j7), schema, extensionRegistryLite);
    }

    private <E> void readMessageList(Object obj, int i, Reader reader, Schema<E> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        reader.readMessageList(this.listFieldSchema.mutableListAt(obj, offset(i)), schema, extensionRegistryLite);
    }

    private void readString(Object obj, int i, Reader reader) throws IOException {
        if (isEnforceUtf8(i)) {
            UnsafeUtil.putObject(obj, offset(i), reader.readStringRequireUtf8());
        } else if (this.lite) {
            UnsafeUtil.putObject(obj, offset(i), reader.readString());
        } else {
            UnsafeUtil.putObject(obj, offset(i), reader.readBytes());
        }
    }

    private void readStringList(Object obj, int i, Reader reader) throws IOException {
        if (isEnforceUtf8(i)) {
            reader.readStringListRequireUtf8(this.listFieldSchema.mutableListAt(obj, offset(i)));
        } else {
            reader.readStringList(this.listFieldSchema.mutableListAt(obj, offset(i)));
        }
    }

    private static java.lang.reflect.Field reflectField(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbM100y = AbstractC0037f.m100y("Field ", str, " for ");
            sbM100y.append(cls.getName());
            sbM100y.append(" not found. Known fields are ");
            sbM100y.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbM100y.toString());
        }
    }

    private void setFieldPresent(T t8, int i) {
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j7 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j7 == 1048575) {
            return;
        }
        UnsafeUtil.putInt(t8, j7, (1 << (iPresenceMaskAndOffsetAt >>> 20)) | UnsafeUtil.getInt(t8, j7));
    }

    private void setOneofPresent(T t8, int i, int i8) {
        UnsafeUtil.putInt(t8, presenceMaskAndOffsetAt(i8) & 1048575, i);
    }

    private int slowPositionForFieldNumber(int i, int i8) {
        int length = (this.buffer.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int iNumberAt = numberAt(i10);
            if (i == iNumberAt) {
                return i10;
            }
            if (i < iNumberAt) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void storeFieldData(com.google.protobuf.FieldInfo r8, int[] r9, int r10, java.lang.Object[] r11) {
        /*
            com.google.protobuf.OneofInfo r0 = r8.getOneof()
            r1 = 0
            if (r0 == 0) goto L25
            com.google.protobuf.FieldType r2 = r8.getType()
            int r2 = r2.m2825id()
            int r2 = r2 + 51
            java.lang.reflect.Field r3 = r0.getValueField()
            long r3 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r3)
            int r3 = (int) r3
            java.lang.reflect.Field r0 = r0.getCaseField()
            long r4 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r0)
        L22:
            int r0 = (int) r4
            r4 = r1
            goto L6c
        L25:
            com.google.protobuf.FieldType r0 = r8.getType()
            java.lang.reflect.Field r2 = r8.getField()
            long r2 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r2)
            int r3 = (int) r2
            int r2 = r0.m2825id()
            boolean r4 = r0.isList()
            if (r4 != 0) goto L5a
            boolean r0 = r0.isMap()
            if (r0 != 0) goto L5a
            java.lang.reflect.Field r0 = r8.getPresenceField()
            if (r0 != 0) goto L4c
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L51
        L4c:
            long r4 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r0)
            int r0 = (int) r4
        L51:
            int r4 = r8.getPresenceMask()
            int r4 = java.lang.Integer.numberOfTrailingZeros(r4)
            goto L6c
        L5a:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            if (r0 != 0) goto L63
            r0 = r1
            r4 = r0
            goto L6c
        L63:
            java.lang.reflect.Field r0 = r8.getCachedSizeField()
            long r4 = com.google.protobuf.UnsafeUtil.objectFieldOffset(r0)
            goto L22
        L6c:
            int r5 = r8.getFieldNumber()
            r9[r10] = r5
            int r5 = r10 + 1
            boolean r6 = r8.isEnforceUtf8()
            if (r6 == 0) goto L7d
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L7e
        L7d:
            r6 = r1
        L7e:
            boolean r7 = r8.isRequired()
            if (r7 == 0) goto L86
            r1 = 268435456(0x10000000, float:2.524355E-29)
        L86:
            r1 = r1 | r6
            int r2 = r2 << 20
            r1 = r1 | r2
            r1 = r1 | r3
            r9[r5] = r1
            int r1 = r10 + 2
            int r2 = r4 << 20
            r0 = r0 | r2
            r9[r1] = r0
            java.lang.Class r9 = r8.getMessageFieldClass()
            java.lang.Object r0 = r8.getMapDefaultEntry()
            if (r0 == 0) goto Lbe
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r0 = r8.getMapDefaultEntry()
            r11[r10] = r0
            if (r9 == 0) goto Laf
            int r10 = r10 + 1
            r11[r10] = r9
            return
        Laf:
            com.google.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 + 1
            com.google.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
            return
        Lbe:
            if (r9 == 0) goto Lc9
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r11[r10] = r9
            return
        Lc9:
            com.google.protobuf.Internal$EnumVerifier r9 = r8.getEnumVerifier()
            if (r9 == 0) goto Ldb
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            com.google.protobuf.Internal$EnumVerifier r8 = r8.getEnumVerifier()
            r11[r10] = r8
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.storeFieldData(com.google.protobuf.FieldInfo, int[], int, java.lang.Object[]):void");
    }

    private void storeMessageField(T t8, int i, Object obj) {
        UNSAFE.putObject(t8, offset(typeAndOffsetAt(i)), obj);
        setFieldPresent(t8, i);
    }

    private void storeOneofMessageField(T t8, int i, int i8, Object obj) {
        UNSAFE.putObject(t8, offset(typeAndOffsetAt(i8)), obj);
        setOneofPresent(t8, i, i8);
    }

    private static int type(int i) {
        return (i & FIELD_TYPE_MASK) >>> 20;
    }

    private int typeAndOffsetAt(int i) {
        return this.buffer[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInAscendingOrder(T r19, com.google.protobuf.Writer r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.writeFieldsInAscendingOrder(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void writeFieldsInDescendingOrder(T r11, com.google.protobuf.Writer r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.writeFieldsInDescendingOrder(java.lang.Object, com.google.protobuf.Writer):void");
    }

    private <K, V> void writeMapHelper(Writer writer, int i, Object obj, int i8) throws IOException {
        if (obj != null) {
            writer.writeMap(i, this.mapFieldSchema.forMapMetadata(getMapFieldDefaultEntry(i8)), this.mapFieldSchema.forMapData(obj));
        }
    }

    private void writeString(int i, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writer.writeString(i, (String) obj);
        } else {
            writer.writeBytes(i, (ByteString) obj);
        }
    }

    private <UT, UB> void writeUnknownInMessageTo(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t8, Writer writer) throws IOException {
        unknownFieldSchema.writeTo(unknownFieldSchema.getFromMessage(t8), writer);
    }

    @Override // com.google.protobuf.Schema
    public boolean equals(T t8, T t9) {
        int length = this.buffer.length;
        for (int i = 0; i < length; i += 3) {
            if (!equals(t8, t9, i)) {
                return false;
            }
        }
        if (!this.unknownFieldSchema.getFromMessage(t8).equals(this.unknownFieldSchema.getFromMessage(t9))) {
            return false;
        }
        if (this.hasExtensions) {
            return this.extensionSchema.getExtensions(t8).equals(this.extensionSchema.getExtensions(t9));
        }
        return true;
    }

    public int getSchemaSize() {
        return this.buffer.length * 3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0559 A[PHI: r0 r1
      0x0559: PHI (r0v2 com.google.protobuf.MessageSchema<T>) = 
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v26 com.google.protobuf.MessageSchema<T>)
      (r0v32 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
      (r0v1 com.google.protobuf.MessageSchema<T>)
     binds: [B:22:0x005b, B:249:0x054f, B:218:0x04b0, B:204:0x0467, B:196:0x0440, B:189:0x0419, B:166:0x0330, B:160:0x0312, B:154:0x02f4, B:148:0x02d6, B:142:0x02b8, B:136:0x029a, B:130:0x027c, B:124:0x025e, B:118:0x0240, B:112:0x0223, B:106:0x0206, B:100:0x01e9, B:94:0x01cc, B:87:0x01aa, B:82:0x0176, B:79:0x016a, B:76:0x015a, B:73:0x014a, B:70:0x013a, B:67:0x012e, B:64:0x0122, B:61:0x0115, B:54:0x00f5, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0559: PHI (r1v4 T) = 
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v5 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
      (r1v1 T)
     binds: [B:22:0x005b, B:249:0x054f, B:218:0x04b0, B:204:0x0467, B:196:0x0440, B:189:0x0419, B:166:0x0330, B:160:0x0312, B:154:0x02f4, B:148:0x02d6, B:142:0x02b8, B:136:0x029a, B:130:0x027c, B:124:0x025e, B:118:0x0240, B:112:0x0223, B:106:0x0206, B:100:0x01e9, B:94:0x01cc, B:87:0x01aa, B:82:0x0176, B:79:0x016a, B:76:0x015a, B:73:0x014a, B:70:0x013a, B:67:0x012e, B:64:0x0122, B:61:0x0115, B:54:0x00f5, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getSerializedSize(T r18) {
        /*
            Method dump skipped, instructions count: 1546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.getSerializedSize(java.lang.Object):int");
    }

    @Override // com.google.protobuf.Schema
    public int hashCode(T t8) {
        int i;
        int iHashLong;
        int i8;
        int iOneofIntAt;
        int length = this.buffer.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iTypeAndOffsetAt = typeAndOffsetAt(i10);
            int iNumberAt = numberAt(i10);
            long jOffset = offset(iTypeAndOffsetAt);
            int iHashCode = 37;
            switch (type(iTypeAndOffsetAt)) {
                case 0:
                    i = i9 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(UnsafeUtil.getDouble(t8, jOffset)));
                    i9 = iHashLong + i;
                    break;
                case 1:
                    i = i9 * 53;
                    iHashLong = Float.floatToIntBits(UnsafeUtil.getFloat(t8, jOffset));
                    i9 = iHashLong + i;
                    break;
                case 2:
                    i = i9 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t8, jOffset));
                    i9 = iHashLong + i;
                    break;
                case 3:
                    i = i9 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t8, jOffset));
                    i9 = iHashLong + i;
                    break;
                case 4:
                    i8 = i9 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t8, jOffset);
                    i9 = i8 + iOneofIntAt;
                    break;
                case 5:
                    i = i9 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t8, jOffset));
                    i9 = iHashLong + i;
                    break;
                case 6:
                    i8 = i9 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t8, jOffset);
                    i9 = i8 + iOneofIntAt;
                    break;
                case 7:
                    i = i9 * 53;
                    iHashLong = Internal.hashBoolean(UnsafeUtil.getBoolean(t8, jOffset));
                    i9 = iHashLong + i;
                    break;
                case 8:
                    i = i9 * 53;
                    iHashLong = ((String) UnsafeUtil.getObject(t8, jOffset)).hashCode();
                    i9 = iHashLong + i;
                    break;
                case 9:
                    Object object = UnsafeUtil.getObject(t8, jOffset);
                    if (object != null) {
                        iHashCode = object.hashCode();
                    }
                    i9 = (i9 * 53) + iHashCode;
                    break;
                case 10:
                    i = i9 * 53;
                    iHashLong = UnsafeUtil.getObject(t8, jOffset).hashCode();
                    i9 = iHashLong + i;
                    break;
                case 11:
                    i8 = i9 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t8, jOffset);
                    i9 = i8 + iOneofIntAt;
                    break;
                case 12:
                    i8 = i9 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t8, jOffset);
                    i9 = i8 + iOneofIntAt;
                    break;
                case 13:
                    i8 = i9 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t8, jOffset);
                    i9 = i8 + iOneofIntAt;
                    break;
                case 14:
                    i = i9 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t8, jOffset));
                    i9 = iHashLong + i;
                    break;
                case 15:
                    i8 = i9 * 53;
                    iOneofIntAt = UnsafeUtil.getInt(t8, jOffset);
                    i9 = i8 + iOneofIntAt;
                    break;
                case 16:
                    i = i9 * 53;
                    iHashLong = Internal.hashLong(UnsafeUtil.getLong(t8, jOffset));
                    i9 = iHashLong + i;
                    break;
                case 17:
                    Object object2 = UnsafeUtil.getObject(t8, jOffset);
                    if (object2 != null) {
                        iHashCode = object2.hashCode();
                    }
                    i9 = (i9 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i = i9 * 53;
                    iHashLong = UnsafeUtil.getObject(t8, jOffset).hashCode();
                    i9 = iHashLong + i;
                    break;
                case 50:
                    i = i9 * 53;
                    iHashLong = UnsafeUtil.getObject(t8, jOffset).hashCode();
                    i9 = iHashLong + i;
                    break;
                case 51:
                    if (isOneofPresent(t8, iNumberAt, i10)) {
                        i = i9 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(oneofDoubleAt(t8, jOffset)));
                        i9 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (isOneofPresent(t8, iNumberAt, i10)) {
                        i = i9 * 53;
                        iHashLong = Float.floatToIntBits(oneofFloatAt(t8, jOffset));
                        i9 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (isOneofPresent(t8, iNumberAt, i10)) {
                        i = i9 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t8, jOffset));
                        i9 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (isOneofPresent(t8, iNumberAt, i10)) {
                        i = i9 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t8, jOffset));
                        i9 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (isOneofPresent(t8, iNumberAt, i10)) {
                        i8 = i9 * 53;
                        iOneofIntAt = oneofIntAt(t8, jOffset);
                        i9 = i8 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (isOneofPresent(t8, iNumberAt, i10)) {
                        i = i9 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t8, jOffset));
                        i9 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (isOneofPresent(t8, iNumberAt, i10)) {
                        i8 = i9 * 53;
                        iOneofIntAt = oneofIntAt(t8, jOffset);
                        i9 = i8 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (isOneofPresent(t8, iNumberAt, i10)) {
                        i = i9 * 53;
                        iHashLong = Internal.hashBoolean(oneofBooleanAt(t8, jOffset));
                        i9 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (isOneofPresent(t8, iNumberAt, i10)) {
                        i = i9 * 53;
                        iHashLong = ((String) UnsafeUtil.getObject(t8, jOffset)).hashCode();
                        i9 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (isOneofPresent(t8, iNumberAt, i10)) {
                        i = i9 * 53;
                        iHashLong = UnsafeUtil.getObject(t8, jOffset).hashCode();
                        i9 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (isOneofPresent(t8, iNumberAt, i10)) {
                        i = i9 * 53;
                        iHashLong = UnsafeUtil.getObject(t8, jOffset).hashCode();
                        i9 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (isOneofPresent(t8, iNumberAt, i10)) {
                        i8 = i9 * 53;
                        iOneofIntAt = oneofIntAt(t8, jOffset);
                        i9 = i8 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (isOneofPresent(t8, iNumberAt, i10)) {
                        i8 = i9 * 53;
                        iOneofIntAt = oneofIntAt(t8, jOffset);
                        i9 = i8 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (isOneofPresent(t8, iNumberAt, i10)) {
                        i8 = i9 * 53;
                        iOneofIntAt = oneofIntAt(t8, jOffset);
                        i9 = i8 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (isOneofPresent(t8, iNumberAt, i10)) {
                        i = i9 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t8, jOffset));
                        i9 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (isOneofPresent(t8, iNumberAt, i10)) {
                        i8 = i9 * 53;
                        iOneofIntAt = oneofIntAt(t8, jOffset);
                        i9 = i8 + iOneofIntAt;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (isOneofPresent(t8, iNumberAt, i10)) {
                        i = i9 * 53;
                        iHashLong = Internal.hashLong(oneofLongAt(t8, jOffset));
                        i9 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (isOneofPresent(t8, iNumberAt, i10)) {
                        i = i9 * 53;
                        iHashLong = UnsafeUtil.getObject(t8, jOffset).hashCode();
                        i9 = iHashLong + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.unknownFieldSchema.getFromMessage(t8).hashCode() + (i9 * 53);
        return this.hasExtensions ? (iHashCode2 * 53) + this.extensionSchema.getExtensions(t8).hashCode() : iHashCode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInitialized(T r15) {
        /*
            r14 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r3 = r0
            r2 = r1
            r4 = r2
        L7:
            int r5 = r14.checkInitializedCount
            r6 = 1
            if (r2 >= r5) goto L9b
            int[] r5 = r14.intArray
            r9 = r5[r2]
            int r5 = r14.numberAt(r9)
            int r13 = r14.typeAndOffsetAt(r9)
            int[] r7 = r14.buffer
            int r8 = r9 + 2
            r7 = r7[r8]
            r8 = r7 & r0
            int r7 = r7 >>> 20
            int r12 = r6 << r7
            if (r8 == r3) goto L32
            if (r8 == r0) goto L2f
            sun.misc.Unsafe r3 = com.google.protobuf.MessageSchema.UNSAFE
            long r6 = (long) r8
            int r4 = r3.getInt(r15, r6)
        L2f:
            r11 = r4
            r10 = r8
            goto L34
        L32:
            r10 = r3
            r11 = r4
        L34:
            boolean r3 = isRequired(r13)
            r7 = r14
            r8 = r15
            if (r3 == 0) goto L43
            boolean r15 = r7.isFieldPresent(r8, r9, r10, r11, r12)
            if (r15 != 0) goto L43
            return r1
        L43:
            int r15 = type(r13)
            r3 = 9
            if (r15 == r3) goto L83
            r3 = 17
            if (r15 == r3) goto L83
            r3 = 27
            if (r15 == r3) goto L7c
            r3 = 60
            if (r15 == r3) goto L6b
            r3 = 68
            if (r15 == r3) goto L6b
            r3 = 49
            if (r15 == r3) goto L7c
            r3 = 50
            if (r15 == r3) goto L64
            goto L94
        L64:
            boolean r15 = r14.isMapInitialized(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L6b:
            boolean r15 = r14.isOneofPresent(r8, r5, r9)
            if (r15 == 0) goto L94
            com.google.protobuf.Schema r15 = r14.getMessageFieldSchema(r9)
            boolean r15 = isInitialized(r8, r13, r15)
            if (r15 != 0) goto L94
            return r1
        L7c:
            boolean r15 = r14.isListInitialized(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L83:
            boolean r15 = r7.isFieldPresent(r8, r9, r10, r11, r12)
            if (r15 == 0) goto L94
            com.google.protobuf.Schema r15 = r14.getMessageFieldSchema(r9)
            boolean r15 = isInitialized(r8, r13, r15)
            if (r15 != 0) goto L94
            return r1
        L94:
            int r2 = r2 + 1
            r15 = r8
            r3 = r10
            r4 = r11
            goto L7
        L9b:
            r7 = r14
            r8 = r15
            boolean r15 = r7.hasExtensions
            if (r15 == 0) goto Lae
            com.google.protobuf.ExtensionSchema<?> r15 = r7.extensionSchema
            com.google.protobuf.FieldSet r15 = r15.getExtensions(r8)
            boolean r15 = r15.isInitialized()
            if (r15 != 0) goto Lae
            return r1
        Lae:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.isInitialized(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    @Override // com.google.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void makeImmutable(T r8) {
        /*
            r7 = this;
            boolean r0 = isMutable(r8)
            if (r0 != 0) goto L8
            goto L8e
        L8:
            boolean r0 = r8 instanceof com.google.protobuf.GeneratedMessageLite
            if (r0 == 0) goto L18
            r0 = r8
            com.google.protobuf.GeneratedMessageLite r0 = (com.google.protobuf.GeneratedMessageLite) r0
            r0.clearMemoizedSerializedSize()
            r0.clearMemoizedHashCode()
            r0.markImmutable()
        L18:
            int[] r0 = r7.buffer
            int r0 = r0.length
            r1 = 0
        L1c:
            if (r1 >= r0) goto L80
            int r2 = r7.typeAndOffsetAt(r1)
            long r3 = offset(r2)
            int r2 = type(r2)
            r5 = 9
            if (r2 == r5) goto L6a
            r5 = 60
            if (r2 == r5) goto L52
            r5 = 68
            if (r2 == r5) goto L52
            switch(r2) {
                case 17: goto L6a;
                case 18: goto L4c;
                case 19: goto L4c;
                case 20: goto L4c;
                case 21: goto L4c;
                case 22: goto L4c;
                case 23: goto L4c;
                case 24: goto L4c;
                case 25: goto L4c;
                case 26: goto L4c;
                case 27: goto L4c;
                case 28: goto L4c;
                case 29: goto L4c;
                case 30: goto L4c;
                case 31: goto L4c;
                case 32: goto L4c;
                case 33: goto L4c;
                case 34: goto L4c;
                case 35: goto L4c;
                case 36: goto L4c;
                case 37: goto L4c;
                case 38: goto L4c;
                case 39: goto L4c;
                case 40: goto L4c;
                case 41: goto L4c;
                case 42: goto L4c;
                case 43: goto L4c;
                case 44: goto L4c;
                case 45: goto L4c;
                case 46: goto L4c;
                case 47: goto L4c;
                case 48: goto L4c;
                case 49: goto L4c;
                case 50: goto L3a;
                default: goto L39;
            }
        L39:
            goto L7d
        L3a:
            sun.misc.Unsafe r2 = com.google.protobuf.MessageSchema.UNSAFE
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L7d
            com.google.protobuf.MapFieldSchema r6 = r7.mapFieldSchema
            java.lang.Object r5 = r6.toImmutable(r5)
            r2.putObject(r8, r3, r5)
            goto L7d
        L4c:
            com.google.protobuf.ListFieldSchema r2 = r7.listFieldSchema
            r2.makeImmutableListAt(r8, r3)
            goto L7d
        L52:
            int r2 = r7.numberAt(r1)
            boolean r2 = r7.isOneofPresent(r8, r2, r1)
            if (r2 == 0) goto L7d
            com.google.protobuf.Schema r2 = r7.getMessageFieldSchema(r1)
            sun.misc.Unsafe r5 = com.google.protobuf.MessageSchema.UNSAFE
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.makeImmutable(r3)
            goto L7d
        L6a:
            boolean r2 = r7.isFieldPresent(r8, r1)
            if (r2 == 0) goto L7d
            com.google.protobuf.Schema r2 = r7.getMessageFieldSchema(r1)
            sun.misc.Unsafe r5 = com.google.protobuf.MessageSchema.UNSAFE
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.makeImmutable(r3)
        L7d:
            int r1 = r1 + 3
            goto L1c
        L80:
            com.google.protobuf.UnknownFieldSchema<?, ?> r0 = r7.unknownFieldSchema
            r0.makeImmutable(r8)
            boolean r0 = r7.hasExtensions
            if (r0 == 0) goto L8e
            com.google.protobuf.ExtensionSchema<?> r0 = r7.extensionSchema
            r0.makeImmutable(r8)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.makeImmutable(java.lang.Object):void");
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t8, T t9) {
        checkMutable(t8);
        t9.getClass();
        for (int i = 0; i < this.buffer.length; i += 3) {
            mergeSingleField(t8, t9, i);
        }
        SchemaUtil.mergeUnknownFields(this.unknownFieldSchema, t8, t9);
        if (this.hasExtensions) {
            SchemaUtil.mergeExtensions(this.extensionSchema, t8, t9);
        }
    }

    @Override // com.google.protobuf.Schema
    public T newInstance() {
        return (T) this.newInstanceSchema.newInstance(this.defaultInstance);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x009d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x043e  */
    @com.google.protobuf.CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int parseMessage(T r27, byte[] r28, int r29, int r30, int r31, com.google.protobuf.ArrayDecoders.Registers r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageSchema.parseMessage(java.lang.Object, byte[], int, int, int, com.google.protobuf.ArrayDecoders$Registers):int");
    }

    @Override // com.google.protobuf.Schema
    public void writeTo(T t8, Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            writeFieldsInDescendingOrder(t8, writer);
        } else {
            writeFieldsInAscendingOrder(t8, writer);
        }
    }

    private boolean isFieldPresent(T t8, int i) {
        boolean zEquals;
        int iPresenceMaskAndOffsetAt = presenceMaskAndOffsetAt(i);
        long j7 = 1048575 & iPresenceMaskAndOffsetAt;
        if (j7 != 1048575) {
            return (UnsafeUtil.getInt(t8, j7) & (1 << (iPresenceMaskAndOffsetAt >>> 20))) != 0;
        }
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                return Double.doubleToRawLongBits(UnsafeUtil.getDouble(t8, jOffset)) != 0;
            case 1:
                return Float.floatToRawIntBits(UnsafeUtil.getFloat(t8, jOffset)) != 0;
            case 2:
                return UnsafeUtil.getLong(t8, jOffset) != 0;
            case 3:
                return UnsafeUtil.getLong(t8, jOffset) != 0;
            case 4:
                return UnsafeUtil.getInt(t8, jOffset) != 0;
            case 5:
                return UnsafeUtil.getLong(t8, jOffset) != 0;
            case 6:
                return UnsafeUtil.getInt(t8, jOffset) != 0;
            case 7:
                return UnsafeUtil.getBoolean(t8, jOffset);
            case 8:
                Object object = UnsafeUtil.getObject(t8, jOffset);
                if (object instanceof String) {
                    zEquals = ((String) object).isEmpty();
                    break;
                } else {
                    if (!(object instanceof ByteString)) {
                        throw new IllegalArgumentException();
                    }
                    zEquals = ByteString.EMPTY.equals(object);
                    break;
                }
            case 9:
                return UnsafeUtil.getObject(t8, jOffset) != null;
            case 10:
                zEquals = ByteString.EMPTY.equals(UnsafeUtil.getObject(t8, jOffset));
                break;
            case 11:
                return UnsafeUtil.getInt(t8, jOffset) != 0;
            case 12:
                return UnsafeUtil.getInt(t8, jOffset) != 0;
            case 13:
                return UnsafeUtil.getInt(t8, jOffset) != 0;
            case 14:
                return UnsafeUtil.getLong(t8, jOffset) != 0;
            case 15:
                return UnsafeUtil.getInt(t8, jOffset) != 0;
            case 16:
                return UnsafeUtil.getLong(t8, jOffset) != 0;
            case 17:
                return UnsafeUtil.getObject(t8, jOffset) != null;
            default:
                throw new IllegalArgumentException();
        }
        return !zEquals;
    }

    private int positionForFieldNumber(int i, int i8) {
        if (i < this.minFieldNumber || i > this.maxFieldNumber) {
            return -1;
        }
        return slowPositionForFieldNumber(i, i8);
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t8, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        extensionRegistryLite.getClass();
        checkMutable(t8);
        mergeFromHelper(this.unknownFieldSchema, this.extensionSchema, t8, reader, extensionRegistryLite);
    }

    private boolean equals(T t8, T t9, int i) {
        int iTypeAndOffsetAt = typeAndOffsetAt(i);
        long jOffset = offset(iTypeAndOffsetAt);
        switch (type(iTypeAndOffsetAt)) {
            case 0:
                if (!arePresentForEquals(t8, t9, i) || Double.doubleToLongBits(UnsafeUtil.getDouble(t8, jOffset)) != Double.doubleToLongBits(UnsafeUtil.getDouble(t9, jOffset))) {
                }
                break;
            case 1:
                if (!arePresentForEquals(t8, t9, i) || Float.floatToIntBits(UnsafeUtil.getFloat(t8, jOffset)) != Float.floatToIntBits(UnsafeUtil.getFloat(t9, jOffset))) {
                }
                break;
            case 2:
                if (!arePresentForEquals(t8, t9, i) || UnsafeUtil.getLong(t8, jOffset) != UnsafeUtil.getLong(t9, jOffset)) {
                }
                break;
            case 3:
                if (!arePresentForEquals(t8, t9, i) || UnsafeUtil.getLong(t8, jOffset) != UnsafeUtil.getLong(t9, jOffset)) {
                }
                break;
            case 4:
                if (!arePresentForEquals(t8, t9, i) || UnsafeUtil.getInt(t8, jOffset) != UnsafeUtil.getInt(t9, jOffset)) {
                }
                break;
            case 5:
                if (!arePresentForEquals(t8, t9, i) || UnsafeUtil.getLong(t8, jOffset) != UnsafeUtil.getLong(t9, jOffset)) {
                }
                break;
            case 6:
                if (!arePresentForEquals(t8, t9, i) || UnsafeUtil.getInt(t8, jOffset) != UnsafeUtil.getInt(t9, jOffset)) {
                }
                break;
            case 7:
                if (!arePresentForEquals(t8, t9, i) || UnsafeUtil.getBoolean(t8, jOffset) != UnsafeUtil.getBoolean(t9, jOffset)) {
                }
                break;
            case 8:
                if (!arePresentForEquals(t8, t9, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t8, jOffset), UnsafeUtil.getObject(t9, jOffset))) {
                }
                break;
            case 9:
                if (!arePresentForEquals(t8, t9, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t8, jOffset), UnsafeUtil.getObject(t9, jOffset))) {
                }
                break;
            case 10:
                if (!arePresentForEquals(t8, t9, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t8, jOffset), UnsafeUtil.getObject(t9, jOffset))) {
                }
                break;
            case 11:
                if (!arePresentForEquals(t8, t9, i) || UnsafeUtil.getInt(t8, jOffset) != UnsafeUtil.getInt(t9, jOffset)) {
                }
                break;
            case 12:
                if (!arePresentForEquals(t8, t9, i) || UnsafeUtil.getInt(t8, jOffset) != UnsafeUtil.getInt(t9, jOffset)) {
                }
                break;
            case 13:
                if (!arePresentForEquals(t8, t9, i) || UnsafeUtil.getInt(t8, jOffset) != UnsafeUtil.getInt(t9, jOffset)) {
                }
                break;
            case 14:
                if (!arePresentForEquals(t8, t9, i) || UnsafeUtil.getLong(t8, jOffset) != UnsafeUtil.getLong(t9, jOffset)) {
                }
                break;
            case 15:
                if (!arePresentForEquals(t8, t9, i) || UnsafeUtil.getInt(t8, jOffset) != UnsafeUtil.getInt(t9, jOffset)) {
                }
                break;
            case 16:
                if (!arePresentForEquals(t8, t9, i) || UnsafeUtil.getLong(t8, jOffset) != UnsafeUtil.getLong(t9, jOffset)) {
                }
                break;
            case 17:
                if (!arePresentForEquals(t8, t9, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t8, jOffset), UnsafeUtil.getObject(t9, jOffset))) {
                }
                break;
            case 51:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
            case 68:
                if (!isOneofCaseEqual(t8, t9, i) || !SchemaUtil.safeEquals(UnsafeUtil.getObject(t8, jOffset), UnsafeUtil.getObject(t9, jOffset))) {
                }
                break;
        }
        return true;
    }

    @Override // com.google.protobuf.Schema
    public void mergeFrom(T t8, byte[] bArr, int i, int i8, ArrayDecoders.Registers registers) throws IOException {
        parseMessage(t8, bArr, i, i8, 0, registers);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isInitialized(Object obj, int i, Schema schema) {
        return schema.isInitialized(UnsafeUtil.getObject(obj, offset(i)));
    }
}
