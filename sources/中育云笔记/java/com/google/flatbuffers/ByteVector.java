package com.google.flatbuffers;

import com.tendcloud.tenddata.C7863av;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class ByteVector extends BaseVector {
    public ByteVector __assign(int i10, ByteBuffer byteBuffer) {
        __reset(i10, 1, byteBuffer);
        return this;
    }

    public byte get(int i10) {
        return this.f11080bb.get(__element(i10));
    }

    public int getAsUnsigned(int i10) {
        return get(i10) & C7863av.f14384i;
    }
}
