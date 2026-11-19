package p087d8;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;

/* renamed from: d8.d */
/* loaded from: classes5.dex */
public abstract class AbstractC7791d extends Table {
    /* renamed from: a */
    public static void m12134a(FlatBufferBuilder flatBufferBuilder, long j9) {
        flatBufferBuilder.addInt(5, (int) j9, 0);
    }

    /* renamed from: b */
    public static void m12135b(FlatBufferBuilder flatBufferBuilder, int i9) {
        flatBufferBuilder.addStruct(0, i9, 0);
    }

    /* renamed from: c */
    public static void m12136c(FlatBufferBuilder flatBufferBuilder, int i9) {
        flatBufferBuilder.addStruct(3, i9, 0);
    }

    /* renamed from: d */
    public static void m12137d(FlatBufferBuilder flatBufferBuilder, int i9) {
        flatBufferBuilder.addOffset(1, i9, 0);
    }

    /* renamed from: e */
    public static void m12138e(FlatBufferBuilder flatBufferBuilder, int i9) {
        flatBufferBuilder.addOffset(2, i9, 0);
    }

    /* renamed from: f */
    public static void m12139f(FlatBufferBuilder flatBufferBuilder, int i9) {
        flatBufferBuilder.addOffset(4, i9, 0);
    }

    /* renamed from: g */
    public static int m12140g(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    /* renamed from: h */
    public static void m12141h(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(7);
    }
}
