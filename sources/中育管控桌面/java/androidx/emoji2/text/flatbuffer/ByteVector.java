package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: classes2.dex */
public final class ByteVector extends BaseVector {
    public ByteVector __assign(int i6, ByteBuffer byteBuffer) {
        __reset(i6, 1, byteBuffer);
        return this;
    }

    public byte get(int i6) {
        return this.f552bb.get(__element(i6));
    }

    public int getAsUnsigned(int i6) {
        return get(i6) & UByte.MAX_VALUE;
    }
}
