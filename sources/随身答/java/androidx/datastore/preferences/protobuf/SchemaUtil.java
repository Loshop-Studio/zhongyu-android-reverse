package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.Internal;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

@CheckReturnValue
/* loaded from: classes3.dex */
final class SchemaUtil {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_FULL_SCHEMA = getUnknownFieldSetSchema();
    private static final UnknownFieldSchema<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = new UnknownFieldSetLiteSchema();

    private SchemaUtil() {
    }

    public static int computeSizeBoolList(int i9, List<?> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z9 ? CodedOutputStream.computeTagSize(i9) + CodedOutputStream.computeLengthDelimitedFieldSize(size) : size * CodedOutputStream.computeBoolSize(i9, true);
    }

    public static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    public static int computeSizeByteStringList(int i9, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = size * CodedOutputStream.computeTagSize(i9);
        for (int i10 = 0; i10 < list.size(); i10++) {
            iComputeTagSize += CodedOutputStream.computeBytesSizeNoTag(list.get(i10));
        }
        return iComputeTagSize;
    }

    public static int computeSizeEnumList(int i9, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        return z9 ? CodedOutputStream.computeTagSize(i9) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeEnumListNoTag) : iComputeSizeEnumListNoTag + (size * CodedOutputStream.computeTagSize(i9));
    }

    public static int computeSizeEnumListNoTag(List<Integer> list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iComputeEnumSizeNoTag = 0;
            while (i9 < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(list.get(i9).intValue());
                i9++;
            }
            return iComputeEnumSizeNoTag;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iComputeEnumSizeNoTag2 = 0;
        while (i9 < size) {
            iComputeEnumSizeNoTag2 += CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i9));
            i9++;
        }
        return iComputeEnumSizeNoTag2;
    }

    public static int computeSizeFixed32List(int i9, List<?> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z9 ? CodedOutputStream.computeTagSize(i9) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 4) : size * CodedOutputStream.computeFixed32Size(i9, 0);
    }

    public static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() * 4;
    }

    public static int computeSizeFixed64List(int i9, List<?> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z9 ? CodedOutputStream.computeTagSize(i9) + CodedOutputStream.computeLengthDelimitedFieldSize(size * 8) : size * CodedOutputStream.computeFixed64Size(i9, 0L);
    }

    public static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() * 8;
    }

    public static int computeSizeGroupList(int i9, List<MessageLite> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(i9, list.get(i10));
        }
        return iComputeGroupSize;
    }

    public static int computeSizeInt32List(int i9, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        return z9 ? CodedOutputStream.computeTagSize(i9) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt32ListNoTag) : iComputeSizeInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i9));
    }

    public static int computeSizeInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iComputeInt32SizeNoTag = 0;
            while (i9 < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(list.get(i9).intValue());
                i9++;
            }
            return iComputeInt32SizeNoTag;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iComputeInt32SizeNoTag2 = 0;
        while (i9 < size) {
            iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i9));
            i9++;
        }
        return iComputeInt32SizeNoTag2;
    }

    public static int computeSizeInt64List(int i9, List<Long> list, boolean z9) {
        if (list.size() == 0) {
            return 0;
        }
        int iComputeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        return z9 ? CodedOutputStream.computeTagSize(i9) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt64ListNoTag) : iComputeSizeInt64ListNoTag + (list.size() * CodedOutputStream.computeTagSize(i9));
    }

    public static int computeSizeInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iComputeInt64SizeNoTag = 0;
            while (i9 < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(list.get(i9).longValue());
                i9++;
            }
            return iComputeInt64SizeNoTag;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iComputeInt64SizeNoTag2 = 0;
        while (i9 < size) {
            iComputeInt64SizeNoTag2 += CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i9));
            i9++;
        }
        return iComputeInt64SizeNoTag2;
    }

    public static int computeSizeMessage(int i9, Object obj, Schema schema) {
        return obj instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSize(i9, (LazyFieldLite) obj) : CodedOutputStream.computeMessageSize(i9, (MessageLite) obj, schema);
    }

    public static int computeSizeMessageList(int i9, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i9) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            iComputeTagSize += obj instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
        }
        return iComputeTagSize;
    }

    public static int computeSizeSInt32List(int i9, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        return z9 ? CodedOutputStream.computeTagSize(i9) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt32ListNoTag) : iComputeSizeSInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i9));
    }

    public static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iComputeSInt32SizeNoTag = 0;
            while (i9 < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(list.get(i9).intValue());
                i9++;
            }
            return iComputeSInt32SizeNoTag;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iComputeSInt32SizeNoTag2 = 0;
        while (i9 < size) {
            iComputeSInt32SizeNoTag2 += CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i9));
            i9++;
        }
        return iComputeSInt32SizeNoTag2;
    }

    public static int computeSizeSInt64List(int i9, List<Long> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        return z9 ? CodedOutputStream.computeTagSize(i9) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt64ListNoTag) : iComputeSizeSInt64ListNoTag + (size * CodedOutputStream.computeTagSize(i9));
    }

    public static int computeSizeSInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iComputeSInt64SizeNoTag = 0;
            while (i9 < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(list.get(i9).longValue());
                i9++;
            }
            return iComputeSInt64SizeNoTag;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iComputeSInt64SizeNoTag2 = 0;
        while (i9 < size) {
            iComputeSInt64SizeNoTag2 += CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i9));
            i9++;
        }
        return iComputeSInt64SizeNoTag2;
    }

    public static int computeSizeStringList(int i9, List<?> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i9) * size;
        if (!(list instanceof LazyStringList)) {
            while (i10 < size) {
                Object obj = list.get(i10);
                iComputeTagSize += obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
                i10++;
            }
            return iComputeTagSize;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        while (i10 < size) {
            Object raw = lazyStringList.getRaw(i10);
            iComputeTagSize += raw instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) raw) : CodedOutputStream.computeStringSizeNoTag((String) raw);
            i10++;
        }
        return iComputeTagSize;
    }

    public static int computeSizeUInt32List(int i9, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        return z9 ? CodedOutputStream.computeTagSize(i9) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt32ListNoTag) : iComputeSizeUInt32ListNoTag + (size * CodedOutputStream.computeTagSize(i9));
    }

    public static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iComputeUInt32SizeNoTag = 0;
            while (i9 < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(list.get(i9).intValue());
                i9++;
            }
            return iComputeUInt32SizeNoTag;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iComputeUInt32SizeNoTag2 = 0;
        while (i9 < size) {
            iComputeUInt32SizeNoTag2 += CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i9));
            i9++;
        }
        return iComputeUInt32SizeNoTag2;
    }

    public static int computeSizeUInt64List(int i9, List<Long> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        return z9 ? CodedOutputStream.computeTagSize(i9) + CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt64ListNoTag) : iComputeSizeUInt64ListNoTag + (size * CodedOutputStream.computeTagSize(i9));
    }

    public static int computeSizeUInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iComputeUInt64SizeNoTag = 0;
            while (i9 < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(list.get(i9).longValue());
                i9++;
            }
            return iComputeUInt64SizeNoTag;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iComputeUInt64SizeNoTag2 = 0;
        while (i9 < size) {
            iComputeUInt64SizeNoTag2 += CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i9));
            i9++;
        }
        return iComputeUInt64SizeNoTag2;
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i9, List<Integer> list, Internal.EnumLiteMap<?> enumLiteMap, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumLiteMap == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (enumLiteMap.findValueByNumber(iIntValue) == null) {
                    ub = (UB) storeUnknownEnum(obj, i9, iIntValue, ub, unknownFieldSchema);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = list.get(i11);
            int iIntValue2 = num.intValue();
            if (enumLiteMap.findValueByNumber(iIntValue2) != null) {
                if (i11 != i10) {
                    list.set(i10, num);
                }
                i10++;
            } else {
                ub = (UB) storeUnknownEnum(obj, i9, iIntValue2, ub, unknownFieldSchema);
            }
        }
        if (i10 != size) {
            list.subList(i10, size).clear();
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

    public static <T, FT extends FieldSet.FieldDescriptorLite<FT>> void mergeExtensions(ExtensionSchema<FT> extensionSchema, T t9, T t10) {
        FieldSet<T> extensions = extensionSchema.getExtensions(t10);
        if (extensions.isEmpty()) {
            return;
        }
        extensionSchema.getMutableExtensions(t9).mergeFrom(extensions);
    }

    public static <T> void mergeMap(MapFieldSchema mapFieldSchema, T t9, T t10, long j9) {
        UnsafeUtil.putObject(t9, j9, mapFieldSchema.mergeFrom(UnsafeUtil.getObject(t9, j9), UnsafeUtil.getObject(t10, j9)));
    }

    public static <T, UT, UB> void mergeUnknownFields(UnknownFieldSchema<UT, UB> unknownFieldSchema, T t9, T t10) {
        unknownFieldSchema.setToMessage(t9, unknownFieldSchema.merge(unknownFieldSchema.getFromMessage(t9), unknownFieldSchema.getFromMessage(t10)));
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

    public static boolean shouldUseTableSwitch(int i9, int i10, int i11) {
        if (i10 < 40) {
            return true;
        }
        long j9 = i10 - i9;
        long j10 = i11;
        return j9 + 10 <= ((2 * j10) + 3) + ((j10 + 3) * 3);
    }

    @CanIgnoreReturnValue
    public static <UT, UB> UB storeUnknownEnum(Object obj, int i9, int i10, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (ub == null) {
            ub = unknownFieldSchema.getBuilderFromMessage(obj);
        }
        unknownFieldSchema.addVarint(ub, i9, i10);
        return ub;
    }

    public static String toCamelCase(String str, boolean z9) {
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < str.length(); i9++) {
            char cCharAt = str.charAt(i9);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb.append(cCharAt);
                    }
                    z9 = true;
                } else if (i9 != 0 || z9) {
                    sb.append(cCharAt);
                } else {
                    sb.append((char) (cCharAt + ' '));
                }
            } else if (z9) {
                sb.append((char) (cCharAt - ' '));
            } else {
                sb.append(cCharAt);
            }
            z9 = false;
        }
        return sb.toString();
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetFullSchema() {
        return UNKNOWN_FIELD_SET_FULL_SCHEMA;
    }

    public static UnknownFieldSchema<?, ?> unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int i9, boolean z9, Writer writer) throws IOException {
        if (z9) {
            writer.writeBool(i9, true);
        }
    }

    public static void writeBoolList(int i9, List<Boolean> list, Writer writer, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBoolList(i9, list, z9);
    }

    public static void writeBytes(int i9, ByteString byteString, Writer writer) throws IOException {
        if (byteString == null || byteString.isEmpty()) {
            return;
        }
        writer.writeBytes(i9, byteString);
    }

    public static void writeBytesList(int i9, List<ByteString> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeBytesList(i9, list);
    }

    public static void writeDouble(int i9, double d10, Writer writer) throws IOException {
        if (Double.doubleToRawLongBits(d10) != 0) {
            writer.writeDouble(i9, d10);
        }
    }

    public static void writeDoubleList(int i9, List<Double> list, Writer writer, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeDoubleList(i9, list, z9);
    }

    public static void writeEnum(int i9, int i10, Writer writer) throws IOException {
        if (i10 != 0) {
            writer.writeEnum(i9, i10);
        }
    }

    public static void writeEnumList(int i9, List<Integer> list, Writer writer, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeEnumList(i9, list, z9);
    }

    public static void writeFixed32(int i9, int i10, Writer writer) throws IOException {
        if (i10 != 0) {
            writer.writeFixed32(i9, i10);
        }
    }

    public static void writeFixed32List(int i9, List<Integer> list, Writer writer, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed32List(i9, list, z9);
    }

    public static void writeFixed64(int i9, long j9, Writer writer) throws IOException {
        if (j9 != 0) {
            writer.writeFixed64(i9, j9);
        }
    }

    public static void writeFixed64List(int i9, List<Long> list, Writer writer, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFixed64List(i9, list, z9);
    }

    public static void writeFloat(int i9, float f10, Writer writer) throws IOException {
        if (Float.floatToRawIntBits(f10) != 0) {
            writer.writeFloat(i9, f10);
        }
    }

    public static void writeFloatList(int i9, List<Float> list, Writer writer, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeFloatList(i9, list, z9);
    }

    public static void writeGroupList(int i9, List<?> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeGroupList(i9, list);
    }

    public static void writeInt32(int i9, int i10, Writer writer) throws IOException {
        if (i10 != 0) {
            writer.writeInt32(i9, i10);
        }
    }

    public static void writeInt32List(int i9, List<Integer> list, Writer writer, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt32List(i9, list, z9);
    }

    public static void writeInt64(int i9, long j9, Writer writer) throws IOException {
        if (j9 != 0) {
            writer.writeInt64(i9, j9);
        }
    }

    public static void writeInt64List(int i9, List<Long> list, Writer writer, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeInt64List(i9, list, z9);
    }

    public static void writeLazyFieldList(int i9, List<?> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            ((LazyFieldLite) it.next()).writeTo(writer, i9);
        }
    }

    public static void writeMessage(int i9, Object obj, Writer writer) throws IOException {
        if (obj != null) {
            writer.writeMessage(i9, obj);
        }
    }

    public static void writeMessageList(int i9, List<?> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeMessageList(i9, list);
    }

    public static void writeSFixed32(int i9, int i10, Writer writer) throws IOException {
        if (i10 != 0) {
            writer.writeSFixed32(i9, i10);
        }
    }

    public static void writeSFixed32List(int i9, List<Integer> list, Writer writer, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed32List(i9, list, z9);
    }

    public static void writeSFixed64(int i9, long j9, Writer writer) throws IOException {
        if (j9 != 0) {
            writer.writeSFixed64(i9, j9);
        }
    }

    public static void writeSFixed64List(int i9, List<Long> list, Writer writer, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSFixed64List(i9, list, z9);
    }

    public static void writeSInt32(int i9, int i10, Writer writer) throws IOException {
        if (i10 != 0) {
            writer.writeSInt32(i9, i10);
        }
    }

    public static void writeSInt32List(int i9, List<Integer> list, Writer writer, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt32List(i9, list, z9);
    }

    public static void writeSInt64(int i9, long j9, Writer writer) throws IOException {
        if (j9 != 0) {
            writer.writeSInt64(i9, j9);
        }
    }

    public static void writeSInt64List(int i9, List<Long> list, Writer writer, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeSInt64List(i9, list, z9);
    }

    public static void writeString(int i9, Object obj, Writer writer) throws IOException {
        if (obj instanceof String) {
            writeStringInternal(i9, (String) obj, writer);
        } else {
            writeBytes(i9, (ByteString) obj, writer);
        }
    }

    private static void writeStringInternal(int i9, String str, Writer writer) throws IOException {
        if (str == null || str.isEmpty()) {
            return;
        }
        writer.writeString(i9, str);
    }

    public static void writeStringList(int i9, List<String> list, Writer writer) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeStringList(i9, list);
    }

    public static void writeUInt32(int i9, int i10, Writer writer) throws IOException {
        if (i10 != 0) {
            writer.writeUInt32(i9, i10);
        }
    }

    public static void writeUInt32List(int i9, List<Integer> list, Writer writer, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt32List(i9, list, z9);
    }

    public static void writeUInt64(int i9, long j9, Writer writer) throws IOException {
        if (j9 != 0) {
            writer.writeUInt64(i9, j9);
        }
    }

    public static void writeUInt64List(int i9, List<Long> list, Writer writer, boolean z9) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeUInt64List(i9, list, z9);
    }

    public static boolean shouldUseTableSwitch(FieldInfo[] fieldInfoArr) {
        if (fieldInfoArr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(fieldInfoArr[0].getFieldNumber(), fieldInfoArr[fieldInfoArr.length - 1].getFieldNumber(), fieldInfoArr.length);
    }

    public static int computeSizeGroupList(int i9, List<MessageLite> list, Schema schema) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(i9, list.get(i10), schema);
        }
        return iComputeGroupSize;
    }

    public static void writeGroupList(int i9, List<?> list, Writer writer, Schema schema) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeGroupList(i9, list, schema);
    }

    public static void writeMessageList(int i9, List<?> list, Writer writer, Schema schema) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.writeMessageList(i9, list, schema);
    }

    public static int computeSizeMessageList(int i9, List<?> list, Schema schema) {
        int iComputeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i9) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
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
    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i9, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub, UnknownFieldSchema<UT, UB> unknownFieldSchema) {
        if (enumVerifier == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = list.get(i11);
                int iIntValue = num.intValue();
                if (enumVerifier.isInRange(iIntValue)) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i9, iIntValue, ub, unknownFieldSchema);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
            }
            return ub;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            if (!enumVerifier.isInRange(iIntValue2)) {
                ub = (UB) storeUnknownEnum(obj, i9, iIntValue2, ub, unknownFieldSchema);
                it.remove();
            }
        }
        return ub;
    }
}
