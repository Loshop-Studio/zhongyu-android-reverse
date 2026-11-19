package p236s8;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

/* renamed from: s8.d */
/* loaded from: classes5.dex */
public abstract class AbstractC9353d extends Table {
    /* renamed from: a */
    public static void m15583a(FlatBufferBuilder flatBufferBuilder, long j10) {
        flatBufferBuilder.addInt(5, (int) j10, 0);
    }

    /* renamed from: b */
    public static void m15584b(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addStruct(0, i10, 0);
    }

    /* renamed from: c */
    public static void m15585c(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addStruct(3, i10, 0);
    }

    /* renamed from: d */
    public static void m15586d(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addOffset(1, i10, 0);
    }

    /* renamed from: e */
    public static void m15587e(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addOffset(2, i10, 0);
    }

    /* renamed from: f */
    public static void m15588f(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addOffset(4, i10, 0);
    }

    /* renamed from: g */
    public static int m15589g(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    /* renamed from: h */
    public static void m15590h(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(7);
    }
}
