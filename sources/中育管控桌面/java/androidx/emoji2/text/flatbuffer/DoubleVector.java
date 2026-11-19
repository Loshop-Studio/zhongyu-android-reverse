package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class DoubleVector extends BaseVector {
    public DoubleVector __assign(int i6, ByteBuffer byteBuffer) {
        __reset(i6, 8, byteBuffer);
        return this;
    }

    public double get(int i6) {
        return this.f552bb.getDouble(__element(i6));
    }
}
