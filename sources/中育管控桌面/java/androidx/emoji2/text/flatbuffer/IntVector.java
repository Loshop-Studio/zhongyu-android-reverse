package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class IntVector extends BaseVector {
    public IntVector __assign(int i6, ByteBuffer byteBuffer) {
        __reset(i6, 4, byteBuffer);
        return this;
    }

    public int get(int i6) {
        return this.f552bb.getInt(__element(i6));
    }

    public long getAsUnsigned(int i6) {
        return get(i6) & 4294967295L;
    }
}
