package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import kotlin.UShort;

/* loaded from: classes2.dex */
public final class ShortVector extends BaseVector {
    public ShortVector __assign(int i10, ByteBuffer byteBuffer) {
        __reset(i10, 2, byteBuffer);
        return this;
    }

    public short get(int i10) {
        return this.f1657bb.getShort(__element(i10));
    }

    public int getAsUnsigned(int i10) {
        return get(i10) & UShort.MAX_VALUE;
    }
}
