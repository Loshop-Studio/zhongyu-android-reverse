package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class DoubleVector extends BaseVector {
    public DoubleVector __assign(int i10, ByteBuffer byteBuffer) {
        __reset(i10, 8, byteBuffer);
        return this;
    }

    public double get(int i10) {
        return this.f11080bb.getDouble(__element(i10));
    }
}
