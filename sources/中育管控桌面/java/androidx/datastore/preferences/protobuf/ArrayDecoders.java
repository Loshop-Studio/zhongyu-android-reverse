package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

@CheckReturnValue
/* loaded from: classes2.dex */
final class ArrayDecoders {
    static final int DEFAULT_RECURSION_LIMIT = 100;
    private static volatile int recursionLimit = 100;

    /* renamed from: androidx.datastore.preferences.protobuf.ArrayDecoders$1 */
    public static /* synthetic */ class C31541 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BOOL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private ArrayDecoders() {
    }

    private static void checkRecursionLimit(int i6) throws InvalidProtocolBufferException {
        if (i6 >= recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    public static int decodeBoolList(int i6, byte[] bArr, int i7, int i8, Internal.ProtobufList<?> protobufList, Registers registers) {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i7, registers);
        booleanArrayList.addBoolean(registers.long1 != 0);
        while (iDecodeVarint64 < i8) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i6 != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        return iDecodeVarint64;
    }

    public static int decodeBytes(byte[] bArr, int i6, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i6, registers);
        int i7 = registers.int1;
        if (i7 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i7 > bArr.length - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i7 == 0) {
            registers.object1 = ByteString.EMPTY;
            return iDecodeVarint32;
        }
        registers.object1 = ByteString.copyFrom(bArr, iDecodeVarint32, i7);
        return iDecodeVarint32 + i7;
    }

    public static int decodeBytesList(int i6, byte[] bArr, int i7, int i8, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i7, registers);
        int i9 = registers.int1;
        if (i9 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i9 > bArr.length - iDecodeVarint32) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i9 == 0) {
            protobufList.add(ByteString.EMPTY);
        } else {
            protobufList.add(ByteString.copyFrom(bArr, iDecodeVarint32, i9));
            iDecodeVarint32 += i9;
        }
        while (iDecodeVarint32 < i8) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i6 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            int i10 = registers.int1;
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i10 > bArr.length - iDecodeVarint32) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i10 == 0) {
                protobufList.add(ByteString.EMPTY);
            } else {
                protobufList.add(ByteString.copyFrom(bArr, iDecodeVarint32, i10));
                iDecodeVarint32 += i10;
            }
        }
        return iDecodeVarint32;
    }

    public static double decodeDouble(byte[] bArr, int i6) {
        return Double.longBitsToDouble(decodeFixed64(bArr, i6));
    }

    public static int decodeDoubleList(int i6, byte[] bArr, int i7, int i8, Internal.ProtobufList<?> protobufList, Registers registers) {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        doubleArrayList.addDouble(decodeDouble(bArr, i7));
        int i9 = i7 + 8;
        while (i9 < i8) {
            int iDecodeVarint32 = decodeVarint32(bArr, i9, registers);
            if (i6 != registers.int1) {
                break;
            }
            doubleArrayList.addDouble(decodeDouble(bArr, iDecodeVarint32));
            i9 = iDecodeVarint32 + 8;
        }
        return i9;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int decodeExtension(int i6, byte[] bArr, int i7, int i8, GeneratedMessageLite.ExtendableMessage<?, ?> extendableMessage, GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) throws InvalidProtocolBufferException {
        int i9;
        int i10;
        FieldSet<GeneratedMessageLite.ExtensionDescriptor> fieldSet = extendableMessage.extensions;
        int i11 = i6 >>> 3;
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (C31541.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    DoubleArrayList doubleArrayList = new DoubleArrayList();
                    int iDecodePackedDoubleList = decodePackedDoubleList(bArr, i7, doubleArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, doubleArrayList);
                    return iDecodePackedDoubleList;
                case 2:
                    FloatArrayList floatArrayList = new FloatArrayList();
                    int iDecodePackedFloatList = decodePackedFloatList(bArr, i7, floatArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, floatArrayList);
                    return iDecodePackedFloatList;
                case 3:
                case 4:
                    LongArrayList longArrayList = new LongArrayList();
                    int iDecodePackedVarint64List = decodePackedVarint64List(bArr, i7, longArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList);
                    return iDecodePackedVarint64List;
                case 5:
                case 6:
                    IntArrayList intArrayList = new IntArrayList();
                    int iDecodePackedVarint32List = decodePackedVarint32List(bArr, i7, intArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList);
                    return iDecodePackedVarint32List;
                case 7:
                case 8:
                    LongArrayList longArrayList2 = new LongArrayList();
                    int iDecodePackedFixed64List = decodePackedFixed64List(bArr, i7, longArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList2);
                    return iDecodePackedFixed64List;
                case 9:
                case 10:
                    IntArrayList intArrayList2 = new IntArrayList();
                    int iDecodePackedFixed32List = decodePackedFixed32List(bArr, i7, intArrayList2, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList2);
                    return iDecodePackedFixed32List;
                case 11:
                    BooleanArrayList booleanArrayList = new BooleanArrayList();
                    int iDecodePackedBoolList = decodePackedBoolList(bArr, i7, booleanArrayList, registers);
                    fieldSet.setField(generatedExtension.descriptor, booleanArrayList);
                    return iDecodePackedBoolList;
                case 12:
                    IntArrayList intArrayList3 = new IntArrayList();
                    int iDecodePackedSInt32List = decodePackedSInt32List(bArr, i7, intArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList3);
                    return iDecodePackedSInt32List;
                case 13:
                    LongArrayList longArrayList3 = new LongArrayList();
                    int iDecodePackedSInt64List = decodePackedSInt64List(bArr, i7, longArrayList3, registers);
                    fieldSet.setField(generatedExtension.descriptor, longArrayList3);
                    return iDecodePackedSInt64List;
                case 14:
                    IntArrayList intArrayList4 = new IntArrayList();
                    int iDecodePackedVarint32List2 = decodePackedVarint32List(bArr, i7, intArrayList4, registers);
                    SchemaUtil.filterUnknownEnumList((Object) extendableMessage, i11, (List<Integer>) intArrayList4, generatedExtension.descriptor.getEnumType(), (Object) null, (UnknownFieldSchema<UT, Object>) unknownFieldSchema);
                    fieldSet.setField(generatedExtension.descriptor, intArrayList4);
                    return iDecodePackedVarint32List2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
        }
        Object objValueOf = null;
        if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
            i7 = decodeVarint32(bArr, i7, registers);
            if (generatedExtension.descriptor.getEnumType().findValueByNumber(registers.int1) == null) {
                SchemaUtil.storeUnknownEnum(extendableMessage, i11, registers.int1, null, unknownFieldSchema);
                return i7;
            }
            objValueOf = Integer.valueOf(registers.int1);
        } else {
            switch (C31541.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    i9 = i7;
                    objValueOf = Double.valueOf(decodeDouble(bArr, i9));
                    i7 = i9 + 8;
                    break;
                case 2:
                    i10 = i7;
                    objValueOf = Float.valueOf(decodeFloat(bArr, i10));
                    i7 = i10 + 4;
                    break;
                case 3:
                case 4:
                    i7 = decodeVarint64(bArr, i7, registers);
                    objValueOf = Long.valueOf(registers.long1);
                    break;
                case 5:
                case 6:
                    i7 = decodeVarint32(bArr, i7, registers);
                    objValueOf = Integer.valueOf(registers.int1);
                    break;
                case 7:
                case 8:
                    i9 = i7;
                    objValueOf = Long.valueOf(decodeFixed64(bArr, i9));
                    i7 = i9 + 8;
                    break;
                case 9:
                case 10:
                    i10 = i7;
                    objValueOf = Integer.valueOf(decodeFixed32(bArr, i10));
                    i7 = i10 + 4;
                    break;
                case 11:
                    i7 = decodeVarint64(bArr, i7, registers);
                    objValueOf = Boolean.valueOf(registers.long1 != 0);
                    break;
                case 12:
                    i7 = decodeVarint32(bArr, i7, registers);
                    objValueOf = Integer.valueOf(CodedInputStream.decodeZigZag32(registers.int1));
                    break;
                case 13:
                    i7 = decodeVarint64(bArr, i7, registers);
                    objValueOf = Long.valueOf(CodedInputStream.decodeZigZag64(registers.long1));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i7 = decodeBytes(bArr, i7, registers);
                    objValueOf = registers.object1;
                    break;
                case 16:
                    i7 = decodeString(bArr, i7, registers);
                    objValueOf = registers.object1;
                    break;
                case 17:
                    int i12 = (i11 << 3) | 4;
                    Schema schemaSchemaFor = Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int iDecodeGroupField = decodeGroupField(schemaSchemaFor, bArr, i7, i8, i12, registers);
                        fieldSet.addRepeatedField(generatedExtension.descriptor, registers.object1);
                        return iDecodeGroupField;
                    }
                    Object field = fieldSet.getField(generatedExtension.descriptor);
                    if (field == null) {
                        field = schemaSchemaFor.newInstance();
                        fieldSet.setField(generatedExtension.descriptor, field);
                    }
                    return mergeGroupField(field, schemaSchemaFor, bArr, i7, i8, i12, registers);
                case 18:
                    Schema schemaSchemaFor2 = Protobuf.getInstance().schemaFor((Class) generatedExtension.getMessageDefaultInstance().getClass());
                    if (generatedExtension.isRepeated()) {
                        int iDecodeMessageField = decodeMessageField(schemaSchemaFor2, bArr, i7, i8, registers);
                        fieldSet.addRepeatedField(generatedExtension.descriptor, registers.object1);
                        return iDecodeMessageField;
                    }
                    Object field2 = fieldSet.getField(generatedExtension.descriptor);
                    if (field2 == null) {
                        field2 = schemaSchemaFor2.newInstance();
                        fieldSet.setField(generatedExtension.descriptor, field2);
                    }
                    return mergeMessageField(field2, schemaSchemaFor2, bArr, i7, i8, registers);
            }
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.addRepeatedField(generatedExtension.descriptor, objValueOf);
            return i7;
        }
        fieldSet.setField(generatedExtension.descriptor, objValueOf);
        return i7;
    }

    public static int decodeExtensionOrUnknownField(int i6, byte[] bArr, int i7, int i8, Object obj, MessageLite messageLite, UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> unknownFieldSchema, Registers registers) {
        GeneratedMessageLite.GeneratedExtension generatedExtensionFindLiteExtensionByNumber = registers.extensionRegistry.findLiteExtensionByNumber(messageLite, i6 >>> 3);
        if (generatedExtensionFindLiteExtensionByNumber == null) {
            return decodeUnknownField(i6, bArr, i7, i8, MessageSchema.getMutableUnknownFields(obj), registers);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        return decodeExtension(i6, bArr, i7, i8, extendableMessage, generatedExtensionFindLiteExtensionByNumber, unknownFieldSchema, registers);
    }

    public static int decodeFixed32(byte[] bArr, int i6) {
        return ((bArr[i6 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i6] & UByte.MAX_VALUE) | ((bArr[i6 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i6 + 2] & UByte.MAX_VALUE) << 16);
    }

    public static int decodeFixed32List(int i6, byte[] bArr, int i7, int i8, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        intArrayList.addInt(decodeFixed32(bArr, i7));
        int i9 = i7 + 4;
        while (i9 < i8) {
            int iDecodeVarint32 = decodeVarint32(bArr, i9, registers);
            if (i6 != registers.int1) {
                break;
            }
            intArrayList.addInt(decodeFixed32(bArr, iDecodeVarint32));
            i9 = iDecodeVarint32 + 4;
        }
        return i9;
    }

    public static long decodeFixed64(byte[] bArr, int i6) {
        return ((bArr[i6 + 7] & 255) << 56) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48);
    }

    public static int decodeFixed64List(int i6, byte[] bArr, int i7, int i8, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        longArrayList.addLong(decodeFixed64(bArr, i7));
        int i9 = i7 + 8;
        while (i9 < i8) {
            int iDecodeVarint32 = decodeVarint32(bArr, i9, registers);
            if (i6 != registers.int1) {
                break;
            }
            longArrayList.addLong(decodeFixed64(bArr, iDecodeVarint32));
            i9 = iDecodeVarint32 + 8;
        }
        return i9;
    }

    public static float decodeFloat(byte[] bArr, int i6) {
        return Float.intBitsToFloat(decodeFixed32(bArr, i6));
    }

    public static int decodeFloatList(int i6, byte[] bArr, int i7, int i8, Internal.ProtobufList<?> protobufList, Registers registers) {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        floatArrayList.addFloat(decodeFloat(bArr, i7));
        int i9 = i7 + 4;
        while (i9 < i8) {
            int iDecodeVarint32 = decodeVarint32(bArr, i9, registers);
            if (i6 != registers.int1) {
                break;
            }
            floatArrayList.addFloat(decodeFloat(bArr, iDecodeVarint32));
            i9 = iDecodeVarint32 + 4;
        }
        return i9;
    }

    public static int decodeGroupField(Schema schema, byte[] bArr, int i6, int i7, int i8, Registers registers) throws InvalidProtocolBufferException {
        Object objNewInstance = schema.newInstance();
        int iMergeGroupField = mergeGroupField(objNewInstance, schema, bArr, i6, i7, i8, registers);
        schema.makeImmutable(objNewInstance);
        registers.object1 = objNewInstance;
        return iMergeGroupField;
    }

    public static int decodeGroupList(Schema schema, int i6, byte[] bArr, int i7, int i8, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int i9 = (i6 & (-8)) | 4;
        int iDecodeGroupField = decodeGroupField(schema, bArr, i7, i8, i9, registers);
        protobufList.add(registers.object1);
        while (iDecodeGroupField < i8) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeGroupField, registers);
            if (i6 != registers.int1) {
                break;
            }
            iDecodeGroupField = decodeGroupField(schema, bArr, iDecodeVarint32, i8, i9, registers);
            protobufList.add(registers.object1);
        }
        return iDecodeGroupField;
    }

    public static int decodeMessageField(Schema schema, byte[] bArr, int i6, int i7, Registers registers) throws InvalidProtocolBufferException {
        Object objNewInstance = schema.newInstance();
        int iMergeMessageField = mergeMessageField(objNewInstance, schema, bArr, i6, i7, registers);
        schema.makeImmutable(objNewInstance);
        registers.object1 = objNewInstance;
        return iMergeMessageField;
    }

    public static int decodeMessageList(Schema<?> schema, int i6, byte[] bArr, int i7, int i8, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeMessageField = decodeMessageField(schema, bArr, i7, i8, registers);
        protobufList.add(registers.object1);
        while (iDecodeMessageField < i8) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeMessageField, registers);
            if (i6 != registers.int1) {
                break;
            }
            iDecodeMessageField = decodeMessageField(schema, bArr, iDecodeVarint32, i8, registers);
            protobufList.add(registers.object1);
        }
        return iDecodeMessageField;
    }

    public static int decodePackedBoolList(byte[] bArr, int i6, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        BooleanArrayList booleanArrayList = (BooleanArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i6, registers);
        int i7 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i7) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            booleanArrayList.addBoolean(registers.long1 != 0);
        }
        if (iDecodeVarint32 == i7) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedDoubleList(byte[] bArr, int i6, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        DoubleArrayList doubleArrayList = (DoubleArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i6, registers);
        int i7 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i7) {
            doubleArrayList.addDouble(decodeDouble(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i7) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFixed32List(byte[] bArr, int i6, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i6, registers);
        int i7 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i7) {
            intArrayList.addInt(decodeFixed32(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i7) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFixed64List(byte[] bArr, int i6, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i6, registers);
        int i7 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i7) {
            longArrayList.addLong(decodeFixed64(bArr, iDecodeVarint32));
            iDecodeVarint32 += 8;
        }
        if (iDecodeVarint32 == i7) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedFloatList(byte[] bArr, int i6, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        FloatArrayList floatArrayList = (FloatArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i6, registers);
        int i7 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i7) {
            floatArrayList.addFloat(decodeFloat(bArr, iDecodeVarint32));
            iDecodeVarint32 += 4;
        }
        if (iDecodeVarint32 == i7) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedSInt32List(byte[] bArr, int i6, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i6, registers);
        int i7 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i7) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        if (iDecodeVarint32 == i7) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedSInt64List(byte[] bArr, int i6, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i6, registers);
        int i7 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i7) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        if (iDecodeVarint32 == i7) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedVarint32List(byte[] bArr, int i6, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i6, registers);
        int i7 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i7) {
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint32, registers);
            intArrayList.addInt(registers.int1);
        }
        if (iDecodeVarint32 == i7) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodePackedVarint64List(byte[] bArr, int i6, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i6, registers);
        int i7 = registers.int1 + iDecodeVarint32;
        while (iDecodeVarint32 < i7) {
            iDecodeVarint32 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        if (iDecodeVarint32 == i7) {
            return iDecodeVarint32;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static int decodeSInt32List(int i6, byte[] bArr, int i7, int i8, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i7, registers);
        intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        while (iDecodeVarint32 < i8) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i6 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            intArrayList.addInt(CodedInputStream.decodeZigZag32(registers.int1));
        }
        return iDecodeVarint32;
    }

    public static int decodeSInt64List(int i6, byte[] bArr, int i7, int i8, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i7, registers);
        longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        while (iDecodeVarint64 < i8) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i6 != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(CodedInputStream.decodeZigZag64(registers.long1));
        }
        return iDecodeVarint64;
    }

    public static int decodeString(byte[] bArr, int i6, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i6, registers);
        int i7 = registers.int1;
        if (i7 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i7 == 0) {
            registers.object1 = "";
            return iDecodeVarint32;
        }
        registers.object1 = new String(bArr, iDecodeVarint32, i7, Internal.UTF_8);
        return iDecodeVarint32 + i7;
    }

    public static int decodeStringList(int i6, byte[] bArr, int i7, int i8, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i7, registers);
        int i9 = registers.int1;
        if (i9 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i9 == 0) {
            protobufList.add("");
        } else {
            protobufList.add(new String(bArr, iDecodeVarint32, i9, Internal.UTF_8));
            iDecodeVarint32 += i9;
        }
        while (iDecodeVarint32 < i8) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i6 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            int i10 = registers.int1;
            if (i10 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i10 == 0) {
                protobufList.add("");
            } else {
                protobufList.add(new String(bArr, iDecodeVarint32, i10, Internal.UTF_8));
                iDecodeVarint32 += i10;
            }
        }
        return iDecodeVarint32;
    }

    public static int decodeStringListRequireUtf8(int i6, byte[] bArr, int i7, int i8, Internal.ProtobufList<?> protobufList, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i7, registers);
        int i9 = registers.int1;
        if (i9 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i9 == 0) {
            protobufList.add("");
        } else {
            int i10 = iDecodeVarint32 + i9;
            if (!Utf8.isValidUtf8(bArr, iDecodeVarint32, i10)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            protobufList.add(new String(bArr, iDecodeVarint32, i9, Internal.UTF_8));
            iDecodeVarint32 = i10;
        }
        while (iDecodeVarint32 < i8) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i6 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            int i11 = registers.int1;
            if (i11 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i11 == 0) {
                protobufList.add("");
            } else {
                int i12 = iDecodeVarint32 + i11;
                if (!Utf8.isValidUtf8(bArr, iDecodeVarint32, i12)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                protobufList.add(new String(bArr, iDecodeVarint32, i11, Internal.UTF_8));
                iDecodeVarint32 = i12;
            }
        }
        return iDecodeVarint32;
    }

    public static int decodeStringRequireUtf8(byte[] bArr, int i6, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = decodeVarint32(bArr, i6, registers);
        int i7 = registers.int1;
        if (i7 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        if (i7 == 0) {
            registers.object1 = "";
            return iDecodeVarint32;
        }
        registers.object1 = Utf8.decodeUtf8(bArr, iDecodeVarint32, i7);
        return iDecodeVarint32 + i7;
    }

    public static int decodeUnknownField(int i6, byte[] bArr, int i7, int i8, UnknownFieldSetLite unknownFieldSetLite, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i6) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i6);
        if (tagWireType == 0) {
            int iDecodeVarint64 = decodeVarint64(bArr, i7, registers);
            unknownFieldSetLite.storeField(i6, Long.valueOf(registers.long1));
            return iDecodeVarint64;
        }
        if (tagWireType == 1) {
            unknownFieldSetLite.storeField(i6, Long.valueOf(decodeFixed64(bArr, i7)));
            return i7 + 8;
        }
        if (tagWireType == 2) {
            int iDecodeVarint32 = decodeVarint32(bArr, i7, registers);
            int i9 = registers.int1;
            if (i9 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (i9 > bArr.length - iDecodeVarint32) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i9 == 0) {
                unknownFieldSetLite.storeField(i6, ByteString.EMPTY);
            } else {
                unknownFieldSetLite.storeField(i6, ByteString.copyFrom(bArr, iDecodeVarint32, i9));
            }
            return iDecodeVarint32 + i9;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidTag();
            }
            unknownFieldSetLite.storeField(i6, Integer.valueOf(decodeFixed32(bArr, i7)));
            return i7 + 4;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        int i10 = (i6 & (-8)) | 4;
        int i11 = registers.recursionDepth + 1;
        registers.recursionDepth = i11;
        checkRecursionLimit(i11);
        int i12 = 0;
        while (true) {
            if (i7 >= i8) {
                break;
            }
            int iDecodeVarint322 = decodeVarint32(bArr, i7, registers);
            i12 = registers.int1;
            if (i12 == i10) {
                i7 = iDecodeVarint322;
                break;
            }
            i7 = decodeUnknownField(i12, bArr, iDecodeVarint322, i8, unknownFieldSetLiteNewInstance, registers);
        }
        registers.recursionDepth--;
        if (i7 > i8 || i12 != i10) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        unknownFieldSetLite.storeField(i6, unknownFieldSetLiteNewInstance);
        return i7;
    }

    public static int decodeVarint32(byte[] bArr, int i6, Registers registers) {
        int i7 = i6 + 1;
        byte b7 = bArr[i6];
        if (b7 < 0) {
            return decodeVarint32(b7, bArr, i7, registers);
        }
        registers.int1 = b7;
        return i7;
    }

    public static int decodeVarint32List(int i6, byte[] bArr, int i7, int i8, Internal.ProtobufList<?> protobufList, Registers registers) {
        IntArrayList intArrayList = (IntArrayList) protobufList;
        int iDecodeVarint32 = decodeVarint32(bArr, i7, registers);
        intArrayList.addInt(registers.int1);
        while (iDecodeVarint32 < i8) {
            int iDecodeVarint322 = decodeVarint32(bArr, iDecodeVarint32, registers);
            if (i6 != registers.int1) {
                break;
            }
            iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint322, registers);
            intArrayList.addInt(registers.int1);
        }
        return iDecodeVarint32;
    }

    public static int decodeVarint64(byte[] bArr, int i6, Registers registers) {
        int i7 = i6 + 1;
        long j6 = bArr[i6];
        if (j6 < 0) {
            return decodeVarint64(j6, bArr, i7, registers);
        }
        registers.long1 = j6;
        return i7;
    }

    public static int decodeVarint64List(int i6, byte[] bArr, int i7, int i8, Internal.ProtobufList<?> protobufList, Registers registers) {
        LongArrayList longArrayList = (LongArrayList) protobufList;
        int iDecodeVarint64 = decodeVarint64(bArr, i7, registers);
        longArrayList.addLong(registers.long1);
        while (iDecodeVarint64 < i8) {
            int iDecodeVarint32 = decodeVarint32(bArr, iDecodeVarint64, registers);
            if (i6 != registers.int1) {
                break;
            }
            iDecodeVarint64 = decodeVarint64(bArr, iDecodeVarint32, registers);
            longArrayList.addLong(registers.long1);
        }
        return iDecodeVarint64;
    }

    public static int mergeGroupField(Object obj, Schema schema, byte[] bArr, int i6, int i7, int i8, Registers registers) throws InvalidProtocolBufferException {
        int i9 = registers.recursionDepth + 1;
        registers.recursionDepth = i9;
        checkRecursionLimit(i9);
        int message = ((MessageSchema) schema).parseMessage(obj, bArr, i6, i7, i8, registers);
        registers.recursionDepth--;
        registers.object1 = obj;
        return message;
    }

    public static int mergeMessageField(Object obj, Schema schema, byte[] bArr, int i6, int i7, Registers registers) throws InvalidProtocolBufferException {
        int iDecodeVarint32 = i6 + 1;
        int i8 = bArr[i6];
        if (i8 < 0) {
            iDecodeVarint32 = decodeVarint32(i8, bArr, iDecodeVarint32, registers);
            i8 = registers.int1;
        }
        int i9 = iDecodeVarint32;
        if (i8 < 0 || i8 > i7 - i9) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i10 = registers.recursionDepth + 1;
        registers.recursionDepth = i10;
        checkRecursionLimit(i10);
        int i11 = i9 + i8;
        schema.mergeFrom(obj, bArr, i9, i11, registers);
        registers.recursionDepth--;
        registers.object1 = obj;
        return i11;
    }

    public static void setRecursionLimit(int i6) {
        recursionLimit = i6;
    }

    public static int skipField(int i6, byte[] bArr, int i7, int i8, Registers registers) throws InvalidProtocolBufferException {
        if (WireFormat.getTagFieldNumber(i6) == 0) {
            throw InvalidProtocolBufferException.invalidTag();
        }
        int tagWireType = WireFormat.getTagWireType(i6);
        if (tagWireType == 0) {
            return decodeVarint64(bArr, i7, registers);
        }
        if (tagWireType == 1) {
            return i7 + 8;
        }
        if (tagWireType == 2) {
            return decodeVarint32(bArr, i7, registers) + registers.int1;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                return i7 + 4;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }
        int i9 = (i6 & (-8)) | 4;
        int i10 = 0;
        while (i7 < i8) {
            i7 = decodeVarint32(bArr, i7, registers);
            i10 = registers.int1;
            if (i10 == i9) {
                break;
            }
            i7 = skipField(i10, bArr, i7, i8, registers);
        }
        if (i7 > i8 || i10 != i9) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        return i7;
    }

    public static final class Registers {
        public final ExtensionRegistryLite extensionRegistry;
        public int int1;
        public long long1;
        public Object object1;
        public int recursionDepth;

        public Registers() {
            this.extensionRegistry = ExtensionRegistryLite.getEmptyRegistry();
        }

        public Registers(ExtensionRegistryLite extensionRegistryLite) {
            extensionRegistryLite.getClass();
            this.extensionRegistry = extensionRegistryLite;
        }
    }

    public static int decodeVarint32(int i6, byte[] bArr, int i7, Registers registers) {
        int i8 = i6 & 127;
        int i9 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 >= 0) {
            registers.int1 = i8 | (b7 << 7);
            return i9;
        }
        int i10 = i8 | ((b7 & ByteCompanionObject.MAX_VALUE) << 7);
        int i11 = i7 + 2;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            registers.int1 = i10 | (b8 << 14);
            return i11;
        }
        int i12 = i10 | ((b8 & ByteCompanionObject.MAX_VALUE) << 14);
        int i13 = i7 + 3;
        byte b9 = bArr[i11];
        if (b9 >= 0) {
            registers.int1 = i12 | (b9 << 21);
            return i13;
        }
        int i14 = i12 | ((b9 & ByteCompanionObject.MAX_VALUE) << 21);
        int i15 = i7 + 4;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            registers.int1 = i14 | (b10 << 28);
            return i15;
        }
        int i16 = i14 | ((b10 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i17 = i15 + 1;
            if (bArr[i15] >= 0) {
                registers.int1 = i16;
                return i17;
            }
            i15 = i17;
        }
    }

    public static int decodeVarint64(long j6, byte[] bArr, int i6, Registers registers) {
        int i7 = i6 + 1;
        byte b7 = bArr[i6];
        long j7 = (j6 & 127) | ((b7 & ByteCompanionObject.MAX_VALUE) << 7);
        int i8 = 7;
        while (b7 < 0) {
            int i9 = i7 + 1;
            byte b8 = bArr[i7];
            i8 += 7;
            j7 |= (b8 & ByteCompanionObject.MAX_VALUE) << i8;
            i7 = i9;
            b7 = b8;
        }
        registers.long1 = j7;
        return i7;
    }
}
