package com.google.flatbuffers;

import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class ByteVector extends BaseVector {
    public ByteVector __assign(int i9, ByteBuffer byteBuffer) {
        __reset(i9, 1, byteBuffer);
        return this;
    }

    public byte get(int i9) {
        return this.f5059bb.get(__element(i9));
    }

    public int getAsUnsigned(int i9) {
        return get(i9) & UByte.MAX_VALUE;
    }
}
