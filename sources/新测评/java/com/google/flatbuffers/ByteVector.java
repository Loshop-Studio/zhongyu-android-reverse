package com.google.flatbuffers;

import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class ByteVector extends BaseVector {
    public ByteVector __assign(int i10, ByteBuffer byteBuffer) {
        __reset(i10, 1, byteBuffer);
        return this;
    }

    public byte get(int i10) {
        return this.f4454bb.get(__element(i10));
    }

    public int getAsUnsigned(int i10) {
        return get(i10) & UByte.MAX_VALUE;
    }
}
