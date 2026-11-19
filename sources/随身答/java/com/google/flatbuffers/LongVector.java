package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class LongVector extends BaseVector {
    public LongVector __assign(int i9, ByteBuffer byteBuffer) {
        __reset(i9, 8, byteBuffer);
        return this;
    }

    public long get(int i9) {
        return this.f5059bb.getLong(__element(i9));
    }
}
