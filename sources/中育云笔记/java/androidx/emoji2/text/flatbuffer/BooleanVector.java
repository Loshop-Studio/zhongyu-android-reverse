package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class BooleanVector extends BaseVector {
    public BooleanVector __assign(int i10, ByteBuffer byteBuffer) {
        __reset(i10, 1, byteBuffer);
        return this;
    }

    public boolean get(int i10) {
        return this.f1467bb.get(__element(i10)) != 0;
    }
}
