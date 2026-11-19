package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.Internal;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

@CheckReturnValue
/* loaded from: classes2.dex */
final class SchemaUtil {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_FULL_SCHEMA = getUnknownFieldSetSchema();
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = new UnknownFieldSetLiteSchema();

    private SchemaUtil() {
    }

    public static int computeSizeBoolList(int i6, List<?> list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z6 ? CodedOutputStream.computeTagSize(i6) + CodedOutputStream.computeLengthDelimitedFieldSize(size) : size * CodedOutputStream.computeBoolSize(i6, true);
    }

    public static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    public static int computeSizeByteStringList(int i6, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = size * CodedOutputStream.computeTagSize(i6);
        for (int i7 = 0; i7 < list.size(); i7++) {
            iComputeTagSize += CodedOutputStream.computeBytesSizeNoTag(list.get(i7));
        }
        return iComputeTagSize;
    }

    public static int computeSizeEnumList(int i6, List<Integer> list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        return z6 ? CodedOutputStream.computeTagSize(i6) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeEnumListNoTag) : iComputeSizeEnumListNoTag + (size * CodedOutputStream.computeTagSize(i6));
    }

    public static int computeSizeEnumListNoTag(List<Integer> list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iComputeEnumSizeNoTag = 0;
            while (i6 < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(list.get(i6).intValue());
                i6++;
            }
            return iComputeEnumSizeNoTag;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iComputeEnumSizeNoTag2 = 0;
        while (i6 < size) {
            iComputeEnumSizeNoTag2 += CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i6));
            i6++;
        }
        return iComputeEnumSizeNoTag2;
    }

    public static int computeSizeFixed32List(int i6, List<?> list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z6 ? CodedOutputStream.computeTagSize(i6) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 4) : size * CodedOutputStream.computeFixed32Size(i6, 0);
    }

    public static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() * 4;
    }

    public static int computeSizeFixed64List(int i6, List<?> list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z6 ? CodedOutputStream.computeTagSize(i6) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 8) : size * CodedOutputStream.computeFixed64Size(i6, 0L);
    }

    public static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() * 8;
    }

    public static int computeSizeGroupList(int i6, List<MessageLite> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(i6, list.get(i7));
        }
        return iComputeGroupSize;
    }

    public static int computeSizeInt32List(int i6, List<Integer> list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        return z6 ? CodedOutputStream.computeTagSize(i6) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt32ListNoTag) : iComputeSizeInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i6));
    }

    public static int computeSizeInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iComputeInt32SizeNoTag = 0;
            while (i6 < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(list.get(i6).intValue());
                i6++;
            }
            return iComputeInt32SizeNoTag;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iComputeInt32SizeNoTag2 = 0;
        while (i6 < size) {
            iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i6));
            i6++;
        }
        return iComputeInt32SizeNoTag2;
    }

    public static int computeSizeInt64List(int i6, List<Long> list, boolean z6) {
        if (list.size() == 0) {
            return 0;
        }
        int iComputeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        return z6 ? CodedOutputStream.computeTagSize(i6) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt64ListNoTag) : iComputeSizeInt64ListNoTag + (list.size() * CodedOutputStream.computeTagSize(i6));
    }

    public static int computeSizeInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iComputeInt64SizeNoTag = 0;
            while (i6 < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(list.get(i6).longValue());
                i6++;
            }
            return iComputeInt64SizeNoTag;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iComputeInt64SizeNoTag2 = 0;
        while (i6 < size) {
            iComputeInt64SizeNoTag2 += CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i6));
            i6++;
        }
        return iComputeInt64SizeNoTag2;
    }

    public static int computeSizeMessage(int i6, Object obj, Schema schema) {
        return obj instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSize(i6, (LazyFieldLite) obj) : CodedOutputStream.computeMessageSize(i6, (MessageLite) obj, schema);
    }

    public static int computeSizeMessageList(int i6, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i6) * size;
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = list.get(i7);
            iComputeTagSize += obj instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
        }
        return iComputeTagSize;
    }

    public static int computeSizeSInt32List(int i6, List<Integer> list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        return z6 ? CodedOutputStream.computeTagSize(i6) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt32ListNoTag) : iComputeSizeSInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i6));
    }

    public static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iComputeSInt32SizeNoTag = 0;
            while (i6 < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(list.get(i6).intValue());
                i6++;
            }
            return iComputeSInt32SizeNoTag;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iComputeSInt32SizeNoTag2 = 0;
        while (i6 < size) {
            iComputeSInt32SizeNoTag2 += CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i6));
            i6++;
        }
        return iComputeSInt32SizeNoTag2;
    }

    public static int computeSizeSInt64List(int i6, List<Long> list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        return z6 ? CodedOutputStream.computeTagSize(i6) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt64ListNoTag) : iComputeSizeSInt64ListNoTag + (size * CodedOutputStream.computeTagSize(i6));
    }

    public static int computeSizeSInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iComputeSInt64SizeNoTag = 0;
            while (i6 < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(list.get(i6).longValue());
                i6++;
            }
            return iComputeSInt64SizeNoTag;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iComputeSInt64SizeNoTag2 = 0;
        while (i6 < size) {
            iComputeSInt64SizeNoTag2 += CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i6));
            i6++;
        }
        return iComputeSInt64SizeNoTag2;
    }

    public static int computeSizeStringList(int i6, List<?> list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i6) * size;
        if (!(list instanceof LazyStringList)) {
            while (i7 < size) {
                Object obj = list.get(i7);
                iComputeTagSize += obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
                i7++;
            }
            return iComputeTagSize;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        while (i7 < size) {
            Object raw = lazyStringList.getRaw(i7);
            iComputeTagSize += raw instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) raw) : CodedOutputStream.computeStringSizeNoTag((String) raw);
            i7++;
        }
        return iComputeTagSize;
    }

    public static int computeSizeUInt32List(int i6, List<Integer> list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        return z6 ? CodedOutputStream.computeTagSize(i6) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt32ListNoTag) : iComputeSizeUInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i6));
    }

    public static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iComputeUInt32SizeNoTag = 0;
            while (i6 < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(list.get(i6).intValue());
                i6++;
            }
            return iComputeUInt32SizeNoTag;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iComputeUInt32SizeNoTag2 = 0;
        while (i6 < size) {
            iComputeUInt32SizeNoTag2 += CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i6));
            i6++;
        }
        return iComputeUInt32SizeNoTag2;
    }

    public static int computeSizeUInt64List(int i6, List<Long> list, boolean z6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        return z6 ? CodedOutputStream.computeTagSize(i6) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt64ListNoTag) : iComputeSizeUInt64ListNoTag + (size * CodedOutputStream.computeTagSize(i6));
    }

    public static int computeSizeUInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iComputeUInt64SizeNoTag = 0;
            while (i6 < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(list.get(i6).longValue());
                i6++;
            }
            return iComputeUInt64SizeNoTag;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iComputeUInt64SizeNoTag2 = 0;
        while (i6 < size) {
            iComputeUInt64SizeNoTag2 += CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i6));
            i6++;
        }
        return iComputeUInt64SizeNoTag2;
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i6, List<Integer> list, Internal.EnumLiteMap<?> enumLiteMap, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumLiteMap == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (enumLiteMap.findValueByNumber(iIntValue) == null) {
                    ub = (UB) storeUnknownEnum(obj, i6, iIntValue, ub, unknownFieldSchema);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Integer num = list.get(i8);
            int iIntValue2 = num.intValue();
            if (enumLiteMap.findValueByNumber(iIntValue2) != null) {
                if (i8 != i7) {
                    list.set(i7, num);
                }
                i7++;
            } else {
                ub = (UB) storeUnknownEnum(obj, i6, iIntValue2, ub, unknownFieldSchema);
            }
        }
        if (i7 != size) {
            list.subList(i7, size).clear();
        }
        return ub;
    }

    private static Class<?> getGeneratedMessageClass() {
        if (Protobuf.assumeLiteRuntime) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object getMapDefaultEntry(Class<?> cls, String str) {
        try {
            java.lang.reflect.Field[] declaredFields = Class.forName(cls.getName() + "$" + toCamelCase(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return UnsafeUtil.getStaticObject(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    private static UnknownFieldSchema<?, ?> getUnknownFieldSetSchema() {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (UnknownFieldSchema) unknownFieldSetSchemaClass.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
        if (Protobuf.assumeLiteRuntime) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends FieldSet.FieldDescriptorLite<FT>> void mergeExtensions(ExtensionSchema<FT> extensionSchema, T t6, T t7) {
        FieldSet<T> extensions = extensionSchema.getExtensions(t7);
        if (extensions.isEmpty()) {
            return;
        }
        extensionSchema.getMutableExtensions(t6).mergeFrom(extensions);
    }

    public static <T> void mergeMap(MapFieldSchema mapFieldSchema, T t6, T t7, long j6) {
        UnsafeUtil.putObject(t6, j6, mapFieldSchema.mergeFrom(UnsafeUtil.getObject(t6, j6), UnsafeUtil.getObject(t7, j6)));
    }

    public static <T, UT, UB> void mergeUnknownFields(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t6, T t7) {
        unknownFieldSchema.setToMessage(t6, unknownFieldSchema.merge(unknownFieldSchema.getFromMessage(t6), unknownFieldSchema.getFromMessage(t7)));
    }

    public static void requireGeneratedMessage(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && !Protobuf.assumeLiteRuntime && (cls2 = GENERATED_MESSAGE_CLASS) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean safeEquals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean shouldUseTableSwitch(int i6, int i7, int i8) {
        if (i7 < 40) {
            return true;
        }
        long j6 = i7 - i6;
        long j7 = i8;
        return j6 + 10 <= ((2 * j7) + 3) + ((j7 + 3) * 3);
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB storeUnknownEnum(Object obj, int i6, int i7, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (ub == null) {
            ub = unknownFieldSchema.getBuilderFromMessage(obj);
        }
        unknownFieldSchema.addVarint(ub, i6, i7);
        return ub;
    }

    public static String toCamelCase(String str, boolean z6) {
        StringBuilder sb = new StringBuilder();
        for (int i6 = 0; i6 < str.length(); i6++) {
            char cCharAt = str.charAt(i6);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb.append(cCharAt);
                    }
                    z6 = true;
                } else if (i6 != 0 || z6) {
                    sb.append(cCharAt);
                } else {
                    sb.append((char) (cCharAt + ' '));
                }
            } else if (z6) {
                sb.append((char) (cCharAt - ' '));
            } else {
                sb.append(cCharAt);
            }
            z6 = false;
        }
        return sb.toString();
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetFullSchema() {
        return UNKNOWN_FIELD_SET_FULL_SCHEMA;
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int i6, boolean z6, Writer writer) {
        if (z6) {
            writer.writeBool(i6, true);
        }
    }

    public static void writeBoolList(int i6, List<Boolean> list, Writer writer, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBoolList(i6, list, z6);
    }

    public static void writeBytes(int i6, ByteString byteString, Writer writer) {
        if (byteString == null || byteString.isEmpty()) {
            return;
        }
        writer.writeBytes(i6, byteString);
    }

    public static void writeBytesList(int i6, List<ByteString> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBytesList(i6, list);
    }

    public static void writeDouble(int i6, double d6, Writer writer) {
        if (Double.doubleToRawLongBits(d6) != 0) {
            writer.writeDouble(i6, d6);
        }
    }

    public static void writeDoubleList(int i6, List<Double> list, Writer writer, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeDoubleList(i6, list, z6);
    }

    public static void writeEnum(int i6, int i7, Writer writer) {
        if (i7 != 0) {
            writer.writeEnum(i6, i7);
        }
    }

    public static void writeEnumList(int i6, List<Integer> list, Writer writer, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeEnumList(i6, list, z6);
    }

    public static void writeFixed32(int i6, int i7, Writer writer) {
        if (i7 != 0) {
            writer.writeFixed32(i6, i7);
        }
    }

    public static void writeFixed32List(int i6, List<Integer> list, Writer writer, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed32List(i6, list, z6);
    }

    public static void writeFixed64(int i6, long j6, Writer writer) {
        if (j6 != 0) {
            writer.writeFixed64(i6, j6);
        }
    }

    public static void writeFixed64List(int i6, List<Long> list, Writer writer, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed64List(i6, list, z6);
    }

    public static void writeFloat(int i6, float f6, Writer writer) {
        if (Float.floatToRawIntBits(f6) != 0) {
            writer.writeFloat(i6, f6);
        }
    }

    public static void writeFloatList(int i6, List<Float> list, Writer writer, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFloatList(i6, list, z6);
    }

    public static void writeGroupList(int i6, List<?> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeGroupList(i6, list);
    }

    public static void writeInt32(int i6, int i7, Writer writer) {
        if (i7 != 0) {
            writer.writeInt32(i6, i7);
        }
    }

    public static void writeInt32List(int i6, List<Integer> list, Writer writer, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt32List(i6, list, z6);
    }

    public static void writeInt64(int i6, long j6, Writer writer) {
        if (j6 != 0) {
            writer.writeInt64(i6, j6);
        }
    }

    public static void writeInt64List(int i6, List<Long> list, Writer writer, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt64List(i6, list, z6);
    }

    public static void writeLazyFieldList(int i6, List<?> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            ((LazyFieldLite) it.next()).writeTo(writer, i6);
        }
    }

    public static void writeMessage(int i6, Object obj, Writer writer) {
        if (obj != null) {
            writer.writeMessage(i6, obj);
        }
    }

    public static void writeMessageList(int i6, List<?> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeMessageList(i6, list);
    }

    public static void writeSFixed32(int i6, int i7, Writer writer) {
        if (i7 != 0) {
            writer.writeSFixed32(i6, i7);
        }
    }

    public static void writeSFixed32List(int i6, List<Integer> list, Writer writer, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(i6, list, z6);
    }

    public static void writeSFixed64(int i6, long j6, Writer writer) {
        if (j6 != 0) {
            writer.writeSFixed64(i6, j6);
        }
    }

    public static void writeSFixed64List(int i6, List<Long> list, Writer writer, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(i6, list, z6);
    }

    public static void writeSInt32(int i6, int i7, Writer writer) {
        if (i7 != 0) {
            writer.writeSInt32(i6, i7);
        }
    }

    public static void writeSInt32List(int i6, List<Integer> list, Writer writer, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt32List(i6, list, z6);
    }

    public static void writeSInt64(int i6, long j6, Writer writer) {
        if (j6 != 0) {
            writer.writeSInt64(i6, j6);
        }
    }

    public static void writeSInt64List(int i6, List<Long> list, Writer writer, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt64List(i6, list, z6);
    }

    public static void writeString(int i6, Object obj, Writer writer) {
        if (obj instanceof String) {
            writeStringInternal(i6, (String) obj, writer);
        } else {
            writeBytes(i6, (ByteString) obj, writer);
        }
    }

    private static void writeStringInternal(int i6, String str, Writer writer) {
        if (str == null || str.isEmpty()) {
            return;
        }
        writer.writeString(i6, str);
    }

    public static void writeStringList(int i6, List<String> list, Writer writer) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeStringList(i6, list);
    }

    public static void writeUInt32(int i6, int i7, Writer writer) {
        if (i7 != 0) {
            writer.writeUInt32(i6, i7);
        }
    }

    public static void writeUInt32List(int i6, List<Integer> list, Writer writer, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt32List(i6, list, z6);
    }

    public static void writeUInt64(int i6, long j6, Writer writer) {
        if (j6 != 0) {
            writer.writeUInt64(i6, j6);
        }
    }

    public static void writeUInt64List(int i6, List<Long> list, Writer writer, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt64List(i6, list, z6);
    }

    public static boolean shouldUseTableSwitch(FieldInfo[] fieldInfoArr) {
        if (fieldInfoArr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(fieldInfoArr[0].getFieldNumber(), fieldInfoArr[fieldInfoArr.length - 1].getFieldNumber(), fieldInfoArr.length);
    }

    public static int computeSizeGroupList(int i6, List<MessageLite> list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(i6, list.get(i7), schema);
        }
        return iComputeGroupSize;
    }

    public static void writeGroupList(int i6, List<?> list, Writer writer, Schema schema) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeGroupList(i6, list, schema);
    }

    public static void writeMessageList(int i6, List<?> list, Writer writer, Schema schema) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeMessageList(i6, list, schema);
    }

    public static int computeSizeMessageList(int i6, List<?> list, Schema schema) {
        int iComputeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i6) * size;
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = list.get(i7);
            if (obj instanceof LazyFieldLite) {
                iComputeMessageSizeNoTag = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj);
            } else {
                iComputeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj, schema);
            }
            iComputeTagSize += iComputeMessageSizeNoTag;
        }
        return iComputeTagSize;
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i6, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumVerifier == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i7 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                Integer num = list.get(i8);
                int iIntValue = num.intValue();
                if (enumVerifier.isInRange(iIntValue)) {
                    if (i8 != i7) {
                        list.set(i7, num);
                    }
                    i7++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i6, iIntValue, ub, unknownFieldSchema);
                }
            }
            if (i7 != size) {
                list.subList(i7, size).clear();
            }
            return ub;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            if (!enumVerifier.isInRange(iIntValue2)) {
                ub = (UB) storeUnknownEnum(obj, i6, iIntValue2, ub, unknownFieldSchema);
                it.remove();
            }
        }
        return ub;
    }
}
