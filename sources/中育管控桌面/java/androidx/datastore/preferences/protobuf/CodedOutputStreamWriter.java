package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@CheckReturnValue
/* loaded from: classes2.dex */
final class CodedOutputStreamWriter implements Writer {
    private final CodedOutputStream output;

    /* renamed from: androidx.datastore.preferences.protobuf.CodedOutputStreamWriter$1 */
    public static /* synthetic */ class C31661 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 5;
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) Internal.checkNotNull(codedOutputStream, "output");
        this.output = codedOutputStream2;
        codedOutputStream2.wrapper = this;
    }

    public static CodedOutputStreamWriter forCodedOutput(CodedOutputStream codedOutputStream) {
        CodedOutputStreamWriter codedOutputStreamWriter = codedOutputStream.wrapper;
        return codedOutputStreamWriter != null ? codedOutputStreamWriter : new CodedOutputStreamWriter(codedOutputStream);
    }

    private void writeBoolListInternal(int i6, BooleanArrayList booleanArrayList, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < booleanArrayList.size()) {
                this.output.writeBool(i6, booleanArrayList.getBoolean(i7));
                i7++;
            }
            return;
        }
        this.output.writeTag(i6, 2);
        int iComputeBoolSizeNoTag = 0;
        for (int i8 = 0; i8 < booleanArrayList.size(); i8++) {
            iComputeBoolSizeNoTag += CodedOutputStream.computeBoolSizeNoTag(booleanArrayList.getBoolean(i8));
        }
        this.output.writeUInt32NoTag(iComputeBoolSizeNoTag);
        while (i7 < booleanArrayList.size()) {
            this.output.writeBoolNoTag(booleanArrayList.getBoolean(i7));
            i7++;
        }
    }

    private <V> void writeDeterministicBooleanMapEntry(int i6, boolean z6, V v6, MapEntryLite.Metadata<Boolean, V> metadata) {
        this.output.writeTag(i6, 2);
        this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Boolean.valueOf(z6), v6));
        MapEntryLite.writeTo(this.output, metadata, Boolean.valueOf(z6), v6);
    }

    private <V> void writeDeterministicIntegerMap(int i6, MapEntryLite.Metadata<Integer, V> metadata, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = it.next().intValue();
            i7++;
        }
        Arrays.sort(iArr);
        for (int i8 = 0; i8 < size; i8++) {
            int i9 = iArr[i8];
            V v6 = map.get(Integer.valueOf(i9));
            this.output.writeTag(i6, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Integer.valueOf(i9), v6));
            MapEntryLite.writeTo(this.output, metadata, Integer.valueOf(i9), v6);
        }
    }

    private <V> void writeDeterministicLongMap(int i6, MapEntryLite.Metadata<Long, V> metadata, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            jArr[i7] = it.next().longValue();
            i7++;
        }
        Arrays.sort(jArr);
        for (int i8 = 0; i8 < size; i8++) {
            long j6 = jArr[i8];
            V v6 = map.get(Long.valueOf(j6));
            this.output.writeTag(i6, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Long.valueOf(j6), v6));
            MapEntryLite.writeTo(this.output, metadata, Long.valueOf(j6), v6);
        }
    }

    private <K, V> void writeDeterministicMap(int i6, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) {
        switch (C31661.$SwitchMap$com$google$protobuf$WireFormat$FieldType[metadata.keyType.ordinal()]) {
            case 1:
                V v6 = map.get(Boolean.FALSE);
                if (v6 != null) {
                    writeDeterministicBooleanMapEntry(i6, false, v6, metadata);
                }
                V v7 = map.get(Boolean.TRUE);
                if (v7 != null) {
                    writeDeterministicBooleanMapEntry(i6, true, v7, metadata);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                writeDeterministicIntegerMap(i6, metadata, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                writeDeterministicLongMap(i6, metadata, map);
                return;
            case 12:
                writeDeterministicStringMap(i6, metadata, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + metadata.keyType);
        }
    }

    private <V> void writeDeterministicStringMap(int i6, MapEntryLite.Metadata<String, V> metadata, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            strArr[i7] = it.next();
            i7++;
        }
        Arrays.sort(strArr);
        for (int i8 = 0; i8 < size; i8++) {
            String str = strArr[i8];
            V v6 = map.get(str);
            this.output.writeTag(i6, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, str, v6));
            MapEntryLite.writeTo(this.output, metadata, str, v6);
        }
    }

    private void writeDoubleListInternal(int i6, DoubleArrayList doubleArrayList, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < doubleArrayList.size()) {
                this.output.writeDouble(i6, doubleArrayList.getDouble(i7));
                i7++;
            }
            return;
        }
        this.output.writeTag(i6, 2);
        int iComputeDoubleSizeNoTag = 0;
        for (int i8 = 0; i8 < doubleArrayList.size(); i8++) {
            iComputeDoubleSizeNoTag += CodedOutputStream.computeDoubleSizeNoTag(doubleArrayList.getDouble(i8));
        }
        this.output.writeUInt32NoTag(iComputeDoubleSizeNoTag);
        while (i7 < doubleArrayList.size()) {
            this.output.writeDoubleNoTag(doubleArrayList.getDouble(i7));
            i7++;
        }
    }

    private void writeEnumListInternal(int i6, IntArrayList intArrayList, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < intArrayList.size()) {
                this.output.writeEnum(i6, intArrayList.getInt(i7));
                i7++;
            }
            return;
        }
        this.output.writeTag(i6, 2);
        int iComputeEnumSizeNoTag = 0;
        for (int i8 = 0; i8 < intArrayList.size(); i8++) {
            iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(intArrayList.getInt(i8));
        }
        this.output.writeUInt32NoTag(iComputeEnumSizeNoTag);
        while (i7 < intArrayList.size()) {
            this.output.writeEnumNoTag(intArrayList.getInt(i7));
            i7++;
        }
    }

    private void writeFixed32ListInternal(int i6, IntArrayList intArrayList, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < intArrayList.size()) {
                this.output.writeFixed32(i6, intArrayList.getInt(i7));
                i7++;
            }
            return;
        }
        this.output.writeTag(i6, 2);
        int iComputeFixed32SizeNoTag = 0;
        for (int i8 = 0; i8 < intArrayList.size(); i8++) {
            iComputeFixed32SizeNoTag += CodedOutputStream.computeFixed32SizeNoTag(intArrayList.getInt(i8));
        }
        this.output.writeUInt32NoTag(iComputeFixed32SizeNoTag);
        while (i7 < intArrayList.size()) {
            this.output.writeFixed32NoTag(intArrayList.getInt(i7));
            i7++;
        }
    }

    private void writeFixed64ListInternal(int i6, LongArrayList longArrayList, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < longArrayList.size()) {
                this.output.writeFixed64(i6, longArrayList.getLong(i7));
                i7++;
            }
            return;
        }
        this.output.writeTag(i6, 2);
        int iComputeFixed64SizeNoTag = 0;
        for (int i8 = 0; i8 < longArrayList.size(); i8++) {
            iComputeFixed64SizeNoTag += CodedOutputStream.computeFixed64SizeNoTag(longArrayList.getLong(i8));
        }
        this.output.writeUInt32NoTag(iComputeFixed64SizeNoTag);
        while (i7 < longArrayList.size()) {
            this.output.writeFixed64NoTag(longArrayList.getLong(i7));
            i7++;
        }
    }

    private void writeFloatListInternal(int i6, FloatArrayList floatArrayList, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < floatArrayList.size()) {
                this.output.writeFloat(i6, floatArrayList.getFloat(i7));
                i7++;
            }
            return;
        }
        this.output.writeTag(i6, 2);
        int iComputeFloatSizeNoTag = 0;
        for (int i8 = 0; i8 < floatArrayList.size(); i8++) {
            iComputeFloatSizeNoTag += CodedOutputStream.computeFloatSizeNoTag(floatArrayList.getFloat(i8));
        }
        this.output.writeUInt32NoTag(iComputeFloatSizeNoTag);
        while (i7 < floatArrayList.size()) {
            this.output.writeFloatNoTag(floatArrayList.getFloat(i7));
            i7++;
        }
    }

    private void writeInt32ListInternal(int i6, IntArrayList intArrayList, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < intArrayList.size()) {
                this.output.writeInt32(i6, intArrayList.getInt(i7));
                i7++;
            }
            return;
        }
        this.output.writeTag(i6, 2);
        int iComputeInt32SizeNoTag = 0;
        for (int i8 = 0; i8 < intArrayList.size(); i8++) {
            iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(intArrayList.getInt(i8));
        }
        this.output.writeUInt32NoTag(iComputeInt32SizeNoTag);
        while (i7 < intArrayList.size()) {
            this.output.writeInt32NoTag(intArrayList.getInt(i7));
            i7++;
        }
    }

    private void writeInt64ListInternal(int i6, LongArrayList longArrayList, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < longArrayList.size()) {
                this.output.writeInt64(i6, longArrayList.getLong(i7));
                i7++;
            }
            return;
        }
        this.output.writeTag(i6, 2);
        int iComputeInt64SizeNoTag = 0;
        for (int i8 = 0; i8 < longArrayList.size(); i8++) {
            iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(longArrayList.getLong(i8));
        }
        this.output.writeUInt32NoTag(iComputeInt64SizeNoTag);
        while (i7 < longArrayList.size()) {
            this.output.writeInt64NoTag(longArrayList.getLong(i7));
            i7++;
        }
    }

    private void writeLazyString(int i6, Object obj) {
        if (obj instanceof String) {
            this.output.writeString(i6, (String) obj);
        } else {
            this.output.writeBytes(i6, (ByteString) obj);
        }
    }

    private void writeSFixed32ListInternal(int i6, IntArrayList intArrayList, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < intArrayList.size()) {
                this.output.writeSFixed32(i6, intArrayList.getInt(i7));
                i7++;
            }
            return;
        }
        this.output.writeTag(i6, 2);
        int iComputeSFixed32SizeNoTag = 0;
        for (int i8 = 0; i8 < intArrayList.size(); i8++) {
            iComputeSFixed32SizeNoTag += CodedOutputStream.computeSFixed32SizeNoTag(intArrayList.getInt(i8));
        }
        this.output.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
        while (i7 < intArrayList.size()) {
            this.output.writeSFixed32NoTag(intArrayList.getInt(i7));
            i7++;
        }
    }

    private void writeSFixed64ListInternal(int i6, LongArrayList longArrayList, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < longArrayList.size()) {
                this.output.writeSFixed64(i6, longArrayList.getLong(i7));
                i7++;
            }
            return;
        }
        this.output.writeTag(i6, 2);
        int iComputeSFixed64SizeNoTag = 0;
        for (int i8 = 0; i8 < longArrayList.size(); i8++) {
            iComputeSFixed64SizeNoTag += CodedOutputStream.computeSFixed64SizeNoTag(longArrayList.getLong(i8));
        }
        this.output.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
        while (i7 < longArrayList.size()) {
            this.output.writeSFixed64NoTag(longArrayList.getLong(i7));
            i7++;
        }
    }

    private void writeSInt32ListInternal(int i6, IntArrayList intArrayList, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < intArrayList.size()) {
                this.output.writeSInt32(i6, intArrayList.getInt(i7));
                i7++;
            }
            return;
        }
        this.output.writeTag(i6, 2);
        int iComputeSInt32SizeNoTag = 0;
        for (int i8 = 0; i8 < intArrayList.size(); i8++) {
            iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(intArrayList.getInt(i8));
        }
        this.output.writeUInt32NoTag(iComputeSInt32SizeNoTag);
        while (i7 < intArrayList.size()) {
            this.output.writeSInt32NoTag(intArrayList.getInt(i7));
            i7++;
        }
    }

    private void writeSInt64ListInternal(int i6, LongArrayList longArrayList, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < longArrayList.size()) {
                this.output.writeSInt64(i6, longArrayList.getLong(i7));
                i7++;
            }
            return;
        }
        this.output.writeTag(i6, 2);
        int iComputeSInt64SizeNoTag = 0;
        for (int i8 = 0; i8 < longArrayList.size(); i8++) {
            iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(longArrayList.getLong(i8));
        }
        this.output.writeUInt32NoTag(iComputeSInt64SizeNoTag);
        while (i7 < longArrayList.size()) {
            this.output.writeSInt64NoTag(longArrayList.getLong(i7));
            i7++;
        }
    }

    private void writeUInt32ListInternal(int i6, IntArrayList intArrayList, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < intArrayList.size()) {
                this.output.writeUInt32(i6, intArrayList.getInt(i7));
                i7++;
            }
            return;
        }
        this.output.writeTag(i6, 2);
        int iComputeUInt32SizeNoTag = 0;
        for (int i8 = 0; i8 < intArrayList.size(); i8++) {
            iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(intArrayList.getInt(i8));
        }
        this.output.writeUInt32NoTag(iComputeUInt32SizeNoTag);
        while (i7 < intArrayList.size()) {
            this.output.writeUInt32NoTag(intArrayList.getInt(i7));
            i7++;
        }
    }

    private void writeUInt64ListInternal(int i6, LongArrayList longArrayList, boolean z6) {
        int i7 = 0;
        if (!z6) {
            while (i7 < longArrayList.size()) {
                this.output.writeUInt64(i6, longArrayList.getLong(i7));
                i7++;
            }
            return;
        }
        this.output.writeTag(i6, 2);
        int iComputeUInt64SizeNoTag = 0;
        for (int i8 = 0; i8 < longArrayList.size(); i8++) {
            iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(longArrayList.getLong(i8));
        }
        this.output.writeUInt32NoTag(iComputeUInt64SizeNoTag);
        while (i7 < longArrayList.size()) {
            this.output.writeUInt64NoTag(longArrayList.getLong(i7));
            i7++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.ASCENDING;
    }

    public int getTotalBytesWritten() {
        return this.output.getTotalBytesWritten();
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBool(int i6, boolean z6) {
        this.output.writeBool(i6, z6);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBoolList(int i6, List<Boolean> list, boolean z6) {
        if (list instanceof BooleanArrayList) {
            writeBoolListInternal(i6, (BooleanArrayList) list, z6);
        } else {
            writeBoolListInternal(i6, list, z6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBytes(int i6, ByteString byteString) {
        this.output.writeBytes(i6, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeBytesList(int i6, List<ByteString> list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            this.output.writeBytes(i6, list.get(i7));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeDouble(int i6, double d6) {
        this.output.writeDouble(i6, d6);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeDoubleList(int i6, List<Double> list, boolean z6) {
        if (list instanceof DoubleArrayList) {
            writeDoubleListInternal(i6, (DoubleArrayList) list, z6);
        } else {
            writeDoubleListInternal(i6, list, z6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void writeEndGroup(int i6) {
        this.output.writeTag(i6, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeEnum(int i6, int i7) {
        this.output.writeEnum(i6, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeEnumList(int i6, List<Integer> list, boolean z6) {
        if (list instanceof IntArrayList) {
            writeEnumListInternal(i6, (IntArrayList) list, z6);
        } else {
            writeEnumListInternal(i6, list, z6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed32(int i6, int i7) {
        this.output.writeFixed32(i6, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed32List(int i6, List<Integer> list, boolean z6) {
        if (list instanceof IntArrayList) {
            writeFixed32ListInternal(i6, (IntArrayList) list, z6);
        } else {
            writeFixed32ListInternal(i6, list, z6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed64(int i6, long j6) {
        this.output.writeFixed64(i6, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFixed64List(int i6, List<Long> list, boolean z6) {
        if (list instanceof LongArrayList) {
            writeFixed64ListInternal(i6, (LongArrayList) list, z6);
        } else {
            writeFixed64ListInternal(i6, list, z6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFloat(int i6, float f6) {
        this.output.writeFloat(i6, f6);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeFloatList(int i6, List<Float> list, boolean z6) {
        if (list instanceof FloatArrayList) {
            writeFloatListInternal(i6, (FloatArrayList) list, z6);
        } else {
            writeFloatListInternal(i6, list, z6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void writeGroup(int i6, Object obj) {
        this.output.writeGroup(i6, (MessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void writeGroupList(int i6, List<?> list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            writeGroup(i6, list.get(i7));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32(int i6, int i7) {
        this.output.writeInt32(i6, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt32List(int i6, List<Integer> list, boolean z6) {
        if (list instanceof IntArrayList) {
            writeInt32ListInternal(i6, (IntArrayList) list, z6);
        } else {
            writeInt32ListInternal(i6, list, z6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt64(int i6, long j6) {
        this.output.writeInt64(i6, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeInt64List(int i6, List<Long> list, boolean z6) {
        if (list instanceof LongArrayList) {
            writeInt64ListInternal(i6, (LongArrayList) list, z6);
        } else {
            writeInt64ListInternal(i6, list, z6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public <K, V> void writeMap(int i6, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) {
        if (this.output.isSerializationDeterministic()) {
            writeDeterministicMap(i6, metadata, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.output.writeTag(i6, 2);
            this.output.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
            MapEntryLite.writeTo(this.output, metadata, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessage(int i6, Object obj) {
        this.output.writeMessage(i6, (MessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessageList(int i6, List<?> list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            writeMessage(i6, list.get(i7));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageSetItem(int i6, Object obj) {
        if (obj instanceof ByteString) {
            this.output.writeRawMessageSetExtension(i6, (ByteString) obj);
        } else {
            this.output.writeMessageSetExtension(i6, (MessageLite) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed32(int i6, int i7) {
        this.output.writeSFixed32(i6, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed32List(int i6, List<Integer> list, boolean z6) {
        if (list instanceof IntArrayList) {
            writeSFixed32ListInternal(i6, (IntArrayList) list, z6);
        } else {
            writeSFixed32ListInternal(i6, list, z6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed64(int i6, long j6) {
        this.output.writeSFixed64(i6, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSFixed64List(int i6, List<Long> list, boolean z6) {
        if (list instanceof LongArrayList) {
            writeSFixed64ListInternal(i6, (LongArrayList) list, z6);
        } else {
            writeSFixed64ListInternal(i6, list, z6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt32(int i6, int i7) {
        this.output.writeSInt32(i6, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt32List(int i6, List<Integer> list, boolean z6) {
        if (list instanceof IntArrayList) {
            writeSInt32ListInternal(i6, (IntArrayList) list, z6);
        } else {
            writeSInt32ListInternal(i6, list, z6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt64(int i6, long j6) {
        this.output.writeSInt64(i6, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeSInt64List(int i6, List<Long> list, boolean z6) {
        if (list instanceof LongArrayList) {
            writeSInt64ListInternal(i6, (LongArrayList) list, z6);
        } else {
            writeSInt64ListInternal(i6, list, z6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    @Deprecated
    public void writeStartGroup(int i6) {
        this.output.writeTag(i6, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeString(int i6, String str) {
        this.output.writeString(i6, str);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeStringList(int i6, List<String> list) {
        int i7 = 0;
        if (!(list instanceof LazyStringList)) {
            while (i7 < list.size()) {
                this.output.writeString(i6, list.get(i7));
                i7++;
            }
        } else {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i7 < list.size()) {
                writeLazyString(i6, lazyStringList.getRaw(i7));
                i7++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt32(int i6, int i7) {
        this.output.writeUInt32(i6, i7);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt32List(int i6, List<Integer> list, boolean z6) {
        if (list instanceof IntArrayList) {
            writeUInt32ListInternal(i6, (IntArrayList) list, z6);
        } else {
            writeUInt32ListInternal(i6, list, z6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt64(int i6, long j6) {
        this.output.writeUInt64(i6, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeUInt64List(int i6, List<Long> list, boolean z6) {
        if (list instanceof LongArrayList) {
            writeUInt64ListInternal(i6, (LongArrayList) list, z6);
        } else {
            writeUInt64ListInternal(i6, list, z6);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeGroup(int i6, Object obj, Schema schema) {
        this.output.writeGroup(i6, (MessageLite) obj, schema);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessage(int i6, Object obj, Schema schema) {
        this.output.writeMessage(i6, (MessageLite) obj, schema);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeGroupList(int i6, List<?> list, Schema schema) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            writeGroup(i6, list.get(i7), schema);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public void writeMessageList(int i6, List<?> list, Schema schema) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            writeMessage(i6, list.get(i7), schema);
        }
    }

    private void writeBoolListInternal(int i6, List<Boolean> list, boolean z6) {
        int i7 = 0;
        if (z6) {
            this.output.writeTag(i6, 2);
            int iComputeBoolSizeNoTag = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iComputeBoolSizeNoTag += CodedOutputStream.computeBoolSizeNoTag(list.get(i8).booleanValue());
            }
            this.output.writeUInt32NoTag(iComputeBoolSizeNoTag);
            while (i7 < list.size()) {
                this.output.writeBoolNoTag(list.get(i7).booleanValue());
                i7++;
            }
            return;
        }
        while (i7 < list.size()) {
            this.output.writeBool(i6, list.get(i7).booleanValue());
            i7++;
        }
    }

    private void writeDoubleListInternal(int i6, List<Double> list, boolean z6) {
        int i7 = 0;
        if (z6) {
            this.output.writeTag(i6, 2);
            int iComputeDoubleSizeNoTag = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iComputeDoubleSizeNoTag += CodedOutputStream.computeDoubleSizeNoTag(list.get(i8).doubleValue());
            }
            this.output.writeUInt32NoTag(iComputeDoubleSizeNoTag);
            while (i7 < list.size()) {
                this.output.writeDoubleNoTag(list.get(i7).doubleValue());
                i7++;
            }
            return;
        }
        while (i7 < list.size()) {
            this.output.writeDouble(i6, list.get(i7).doubleValue());
            i7++;
        }
    }

    private void writeEnumListInternal(int i6, List<Integer> list, boolean z6) {
        int i7 = 0;
        if (z6) {
            this.output.writeTag(i6, 2);
            int iComputeEnumSizeNoTag = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(list.get(i8).intValue());
            }
            this.output.writeUInt32NoTag(iComputeEnumSizeNoTag);
            while (i7 < list.size()) {
                this.output.writeEnumNoTag(list.get(i7).intValue());
                i7++;
            }
            return;
        }
        while (i7 < list.size()) {
            this.output.writeEnum(i6, list.get(i7).intValue());
            i7++;
        }
    }

    private void writeFixed32ListInternal(int i6, List<Integer> list, boolean z6) {
        int i7 = 0;
        if (z6) {
            this.output.writeTag(i6, 2);
            int iComputeFixed32SizeNoTag = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iComputeFixed32SizeNoTag += CodedOutputStream.computeFixed32SizeNoTag(list.get(i8).intValue());
            }
            this.output.writeUInt32NoTag(iComputeFixed32SizeNoTag);
            while (i7 < list.size()) {
                this.output.writeFixed32NoTag(list.get(i7).intValue());
                i7++;
            }
            return;
        }
        while (i7 < list.size()) {
            this.output.writeFixed32(i6, list.get(i7).intValue());
            i7++;
        }
    }

    private void writeFixed64ListInternal(int i6, List<Long> list, boolean z6) {
        int i7 = 0;
        if (z6) {
            this.output.writeTag(i6, 2);
            int iComputeFixed64SizeNoTag = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iComputeFixed64SizeNoTag += CodedOutputStream.computeFixed64SizeNoTag(list.get(i8).longValue());
            }
            this.output.writeUInt32NoTag(iComputeFixed64SizeNoTag);
            while (i7 < list.size()) {
                this.output.writeFixed64NoTag(list.get(i7).longValue());
                i7++;
            }
            return;
        }
        while (i7 < list.size()) {
            this.output.writeFixed64(i6, list.get(i7).longValue());
            i7++;
        }
    }

    private void writeFloatListInternal(int i6, List<Float> list, boolean z6) {
        int i7 = 0;
        if (z6) {
            this.output.writeTag(i6, 2);
            int iComputeFloatSizeNoTag = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iComputeFloatSizeNoTag += CodedOutputStream.computeFloatSizeNoTag(list.get(i8).floatValue());
            }
            this.output.writeUInt32NoTag(iComputeFloatSizeNoTag);
            while (i7 < list.size()) {
                this.output.writeFloatNoTag(list.get(i7).floatValue());
                i7++;
            }
            return;
        }
        while (i7 < list.size()) {
            this.output.writeFloat(i6, list.get(i7).floatValue());
            i7++;
        }
    }

    private void writeInt32ListInternal(int i6, List<Integer> list, boolean z6) {
        int i7 = 0;
        if (z6) {
            this.output.writeTag(i6, 2);
            int iComputeInt32SizeNoTag = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(list.get(i8).intValue());
            }
            this.output.writeUInt32NoTag(iComputeInt32SizeNoTag);
            while (i7 < list.size()) {
                this.output.writeInt32NoTag(list.get(i7).intValue());
                i7++;
            }
            return;
        }
        while (i7 < list.size()) {
            this.output.writeInt32(i6, list.get(i7).intValue());
            i7++;
        }
    }

    private void writeInt64ListInternal(int i6, List<Long> list, boolean z6) {
        int i7 = 0;
        if (z6) {
            this.output.writeTag(i6, 2);
            int iComputeInt64SizeNoTag = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(list.get(i8).longValue());
            }
            this.output.writeUInt32NoTag(iComputeInt64SizeNoTag);
            while (i7 < list.size()) {
                this.output.writeInt64NoTag(list.get(i7).longValue());
                i7++;
            }
            return;
        }
        while (i7 < list.size()) {
            this.output.writeInt64(i6, list.get(i7).longValue());
            i7++;
        }
    }

    private void writeSFixed32ListInternal(int i6, List<Integer> list, boolean z6) {
        int i7 = 0;
        if (z6) {
            this.output.writeTag(i6, 2);
            int iComputeSFixed32SizeNoTag = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iComputeSFixed32SizeNoTag += CodedOutputStream.computeSFixed32SizeNoTag(list.get(i8).intValue());
            }
            this.output.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
            while (i7 < list.size()) {
                this.output.writeSFixed32NoTag(list.get(i7).intValue());
                i7++;
            }
            return;
        }
        while (i7 < list.size()) {
            this.output.writeSFixed32(i6, list.get(i7).intValue());
            i7++;
        }
    }

    private void writeSFixed64ListInternal(int i6, List<Long> list, boolean z6) {
        int i7 = 0;
        if (z6) {
            this.output.writeTag(i6, 2);
            int iComputeSFixed64SizeNoTag = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iComputeSFixed64SizeNoTag += CodedOutputStream.computeSFixed64SizeNoTag(list.get(i8).longValue());
            }
            this.output.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
            while (i7 < list.size()) {
                this.output.writeSFixed64NoTag(list.get(i7).longValue());
                i7++;
            }
            return;
        }
        while (i7 < list.size()) {
            this.output.writeSFixed64(i6, list.get(i7).longValue());
            i7++;
        }
    }

    private void writeSInt64ListInternal(int i6, List<Long> list, boolean z6) {
        int i7 = 0;
        if (z6) {
            this.output.writeTag(i6, 2);
            int iComputeSInt64SizeNoTag = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(list.get(i8).longValue());
            }
            this.output.writeUInt32NoTag(iComputeSInt64SizeNoTag);
            while (i7 < list.size()) {
                this.output.writeSInt64NoTag(list.get(i7).longValue());
                i7++;
            }
            return;
        }
        while (i7 < list.size()) {
            this.output.writeSInt64(i6, list.get(i7).longValue());
            i7++;
        }
    }

    private void writeUInt64ListInternal(int i6, List<Long> list, boolean z6) {
        int i7 = 0;
        if (z6) {
            this.output.writeTag(i6, 2);
            int iComputeUInt64SizeNoTag = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(list.get(i8).longValue());
            }
            this.output.writeUInt32NoTag(iComputeUInt64SizeNoTag);
            while (i7 < list.size()) {
                this.output.writeUInt64NoTag(list.get(i7).longValue());
                i7++;
            }
            return;
        }
        while (i7 < list.size()) {
            this.output.writeUInt64(i6, list.get(i7).longValue());
            i7++;
        }
    }

    public void writeSInt32ListInternal(int i6, List<Integer> list, boolean z6) {
        int i7 = 0;
        if (z6) {
            this.output.writeTag(i6, 2);
            int iComputeSInt32SizeNoTag = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(list.get(i8).intValue());
            }
            this.output.writeUInt32NoTag(iComputeSInt32SizeNoTag);
            while (i7 < list.size()) {
                this.output.writeSInt32NoTag(list.get(i7).intValue());
                i7++;
            }
            return;
        }
        while (i7 < list.size()) {
            this.output.writeSInt32(i6, list.get(i7).intValue());
            i7++;
        }
    }

    public void writeUInt32ListInternal(int i6, List<Integer> list, boolean z6) {
        int i7 = 0;
        if (z6) {
            this.output.writeTag(i6, 2);
            int iComputeUInt32SizeNoTag = 0;
            for (int i8 = 0; i8 < list.size(); i8++) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(list.get(i8).intValue());
            }
            this.output.writeUInt32NoTag(iComputeUInt32SizeNoTag);
            while (i7 < list.size()) {
                this.output.writeUInt32NoTag(list.get(i7).intValue());
                i7++;
            }
            return;
        }
        while (i7 < list.size()) {
            this.output.writeUInt32(i6, list.get(i7).intValue());
            i7++;
        }
    }
}
