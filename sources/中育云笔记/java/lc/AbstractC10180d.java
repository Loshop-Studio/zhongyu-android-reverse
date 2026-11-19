package lc;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

/* renamed from: lc.d */
/* loaded from: classes6.dex */
public abstract class AbstractC10180d extends Table {
    /* renamed from: a */
    public static void m21234a(FlatBufferBuilder flatBufferBuilder, long j10) {
        flatBufferBuilder.addInt(5, (int) j10, 0);
    }

    /* renamed from: b */
    public static void m21235b(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addStruct(0, i10, 0);
    }

    /* renamed from: c */
    public static void m21236c(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addStruct(3, i10, 0);
    }

    /* renamed from: d */
    public static void m21237d(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addOffset(1, i10, 0);
    }

    /* renamed from: e */
    public static void m21238e(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addOffset(2, i10, 0);
    }

    /* renamed from: f */
    public static void m21239f(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addOffset(4, i10, 0);
    }

    /* renamed from: g */
    public static int m21240g(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    /* renamed from: h */
    public static void m21241h(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(7);
    }
}
