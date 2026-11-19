package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import kotlin.UShort;

/* loaded from: classes2.dex */
public final class ShortVector extends BaseVector {
    public ShortVector __assign(int i6, ByteBuffer byteBuffer) {
        __reset(i6, 2, byteBuffer);
        return this;
    }

    public short get(int i6) {
        return this.f552bb.getShort(__element(i6));
    }

    public int getAsUnsigned(int i6) {
        return get(i6) & UShort.MAX_VALUE;
    }
}
