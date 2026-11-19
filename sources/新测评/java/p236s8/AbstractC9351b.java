package p236s8;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Struct;

/* renamed from: s8.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9351b extends Struct {
    /* renamed from: a */
    public static int m15573a(FlatBufferBuilder flatBufferBuilder, long j10, long j11) {
        flatBufferBuilder.prep(8, 16);
        flatBufferBuilder.putLong(j11);
        flatBufferBuilder.pad(4);
        flatBufferBuilder.putInt((int) j10);
        return flatBufferBuilder.offset();
    }
}
