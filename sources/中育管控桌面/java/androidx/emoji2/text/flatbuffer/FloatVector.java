package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class FloatVector extends BaseVector {
    public FloatVector __assign(int i6, ByteBuffer byteBuffer) {
        __reset(i6, 4, byteBuffer);
        return this;
    }

    public float get(int i6) {
        return this.f552bb.getFloat(__element(i6));
    }
}
