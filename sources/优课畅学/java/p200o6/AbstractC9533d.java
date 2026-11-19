package p200o6;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

/* renamed from: o6.d */
/* loaded from: classes5.dex */
public abstract class AbstractC9533d extends Table {
    /* renamed from: a */
    public static void m17772a(FlatBufferBuilder flatBufferBuilder, long j10) {
        flatBufferBuilder.addInt(5, (int) j10, 0);
    }

    /* renamed from: b */
    public static void m17773b(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addStruct(0, i10, 0);
    }

    /* renamed from: c */
    public static void m17774c(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addStruct(3, i10, 0);
    }

    /* renamed from: d */
    public static void m17775d(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addOffset(1, i10, 0);
    }

    /* renamed from: e */
    public static void m17776e(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addOffset(2, i10, 0);
    }

    /* renamed from: f */
    public static void m17777f(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addOffset(4, i10, 0);
    }

    /* renamed from: g */
    public static int m17778g(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    /* renamed from: h */
    public static void m17779h(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(7);
    }
}
