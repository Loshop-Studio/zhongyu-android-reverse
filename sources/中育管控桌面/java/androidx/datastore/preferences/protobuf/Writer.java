package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import java.util.List;
import java.util.Map;

@CheckReturnValue
/* loaded from: classes2.dex */
interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    FieldOrder fieldOrder();

    void writeBool(int i6, boolean z6);

    void writeBoolList(int i6, List<Boolean> list, boolean z6);

    void writeBytes(int i6, ByteString byteString);

    void writeBytesList(int i6, List<ByteString> list);

    void writeDouble(int i6, double d6);

    void writeDoubleList(int i6, List<Double> list, boolean z6);

    @Deprecated
    void writeEndGroup(int i6);

    void writeEnum(int i6, int i7);

    void writeEnumList(int i6, List<Integer> list, boolean z6);

    void writeFixed32(int i6, int i7);

    void writeFixed32List(int i6, List<Integer> list, boolean z6);

    void writeFixed64(int i6, long j6);

    void writeFixed64List(int i6, List<Long> list, boolean z6);

    void writeFloat(int i6, float f6);

    void writeFloatList(int i6, List<Float> list, boolean z6);

    @Deprecated
    void writeGroup(int i6, Object obj);

    @Deprecated
    void writeGroup(int i6, Object obj, Schema schema);

    @Deprecated
    void writeGroupList(int i6, List<?> list);

    @Deprecated
    void writeGroupList(int i6, List<?> list, Schema schema);

    void writeInt32(int i6, int i7);

    void writeInt32List(int i6, List<Integer> list, boolean z6);

    void writeInt64(int i6, long j6);

    void writeInt64List(int i6, List<Long> list, boolean z6);

    <K, V> void writeMap(int i6, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map);

    void writeMessage(int i6, Object obj);

    void writeMessage(int i6, Object obj, Schema schema);

    void writeMessageList(int i6, List<?> list);

    void writeMessageList(int i6, List<?> list, Schema schema);

    void writeMessageSetItem(int i6, Object obj);

    void writeSFixed32(int i6, int i7);

    void writeSFixed32List(int i6, List<Integer> list, boolean z6);

    void writeSFixed64(int i6, long j6);

    void writeSFixed64List(int i6, List<Long> list, boolean z6);

    void writeSInt32(int i6, int i7);

    void writeSInt32List(int i6, List<Integer> list, boolean z6);

    void writeSInt64(int i6, long j6);

    void writeSInt64List(int i6, List<Long> list, boolean z6);

    @Deprecated
    void writeStartGroup(int i6);

    void writeString(int i6, String str);

    void writeStringList(int i6, List<String> list);

    void writeUInt32(int i6, int i7);

    void writeUInt32List(int i6, List<Integer> list, boolean z6);

    void writeUInt64(int i6, long j6);

    void writeUInt64List(int i6, List<Long> list, boolean z6);
}
