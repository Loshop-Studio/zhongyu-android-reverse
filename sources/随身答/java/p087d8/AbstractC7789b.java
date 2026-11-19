package p087d8;

import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Struct;

/* renamed from: d8.b */
/* loaded from: classes5.dex */
public abstract class AbstractC7789b extends Struct {
    /* renamed from: a */
    public static int m12124a(FlatBufferBuilder flatBufferBuilder, long j9, long j10) {
        flatBufferBuilder.prep(8, 16);
        flatBufferBuilder.putLong(j10);
        flatBufferBuilder.pad(4);
        flatBufferBuilder.putInt((int) j9);
        return flatBufferBuilder.offset();
    }
}
