package p236s8;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

/* renamed from: s8.e */
/* loaded from: classes5.dex */
public abstract class AbstractC9354e extends Table {
    /* renamed from: a */
    public static void m15591a(FlatBufferBuilder flatBufferBuilder, long j10) {
        flatBufferBuilder.addInt(3, (int) j10, 0);
    }

    /* renamed from: b */
    public static void m15592b(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addStruct(0, i10, 0);
    }

    /* renamed from: c */
    public static void m15593c(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addStruct(4, i10, 0);
    }

    /* renamed from: d */
    public static void m15594d(FlatBufferBuilder flatBufferBuilder, long j10) {
        flatBufferBuilder.addInt(8, (int) j10, 0);
    }

    /* renamed from: e */
    public static void m15595e(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addOffset(1, i10, 0);
    }

    /* renamed from: f */
    public static void m15596f(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addOffset(7, i10, 0);
    }

    /* renamed from: g */
    public static void m15597g(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addOffset(5, i10, 0);
    }

    /* renamed from: h */
    public static void m15598h(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addShort(2, (short) i10, 0);
    }

    /* renamed from: i */
    public static void m15599i(FlatBufferBuilder flatBufferBuilder, int i10) {
        flatBufferBuilder.addOffset(6, i10, 0);
    }

    /* renamed from: j */
    public static int m15600j(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    /* renamed from: k */
    public static void m15601k(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(9);
    }
}
