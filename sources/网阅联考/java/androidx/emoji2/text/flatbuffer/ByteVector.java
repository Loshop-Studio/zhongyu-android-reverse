package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class ByteVector extends BaseVector {
    public ByteVector __assign(int i4, ByteBuffer byteBuffer) {
        __reset(i4, 1, byteBuffer);
        return this;
    }

    public byte get(int i4) {
        return this.f390bb.get(__element(i4));
    }

    public int getAsUnsigned(int i4) {
        return get(i4) & UByte.MAX_VALUE;
    }
}
