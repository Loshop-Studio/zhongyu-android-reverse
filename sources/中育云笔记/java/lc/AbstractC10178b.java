package lc;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Struct;

/* renamed from: lc.b */
/* loaded from: classes6.dex */
public abstract class AbstractC10178b extends Struct {
    /* renamed from: a */
    public static int m21224a(FlatBufferBuilder flatBufferBuilder, long j10, long j11) {
        flatBufferBuilder.prep(8, 16);
        flatBufferBuilder.putLong(j11);
        flatBufferBuilder.pad(4);
        flatBufferBuilder.putInt((int) j10);
        return flatBufferBuilder.offset();
    }
}
