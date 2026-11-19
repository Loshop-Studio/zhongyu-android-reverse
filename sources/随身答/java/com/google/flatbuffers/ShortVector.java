package com.google.flatbuffers;

import java.nio.ByteBuffer;
import kotlin.UShort;

/* loaded from: classes3.dex */
public final class ShortVector extends BaseVector {
    public ShortVector __assign(int i9, ByteBuffer byteBuffer) {
        __reset(i9, 2, byteBuffer);
        return this;
    }

    public short get(int i9) {
        return this.f5059bb.getShort(__element(i9));
    }

    public int getAsUnsigned(int i9) {
        return get(i9) & UShort.MAX_VALUE;
    }
}
