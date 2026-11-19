package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class BooleanVector extends BaseVector {
    public BooleanVector __assign(int i6, ByteBuffer byteBuffer) {
        __reset(i6, 1, byteBuffer);
        return this;
    }

    public boolean get(int i6) {
        return this.f552bb.get(__element(i6)) != 0;
    }
}
