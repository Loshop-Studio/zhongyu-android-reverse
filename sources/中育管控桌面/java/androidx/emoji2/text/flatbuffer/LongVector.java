package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class LongVector extends BaseVector {
    public LongVector __assign(int i6, ByteBuffer byteBuffer) {
        __reset(i6, 8, byteBuffer);
        return this;
    }

    public long get(int i6) {
        return this.f552bb.getLong(__element(i6));
    }
}
