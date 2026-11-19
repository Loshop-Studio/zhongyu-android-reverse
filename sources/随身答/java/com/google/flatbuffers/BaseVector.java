package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class BaseVector {

    /* renamed from: bb */
    protected ByteBuffer f5059bb;
    private int element_size;
    private int length;
    private int vector;

    public int __element(int i9) {
        return this.vector + (i9 * this.element_size);
    }

    public void __reset(int i9, int i10, ByteBuffer byteBuffer) {
        this.f5059bb = byteBuffer;
        if (byteBuffer != null) {
            this.vector = i9;
            this.length = byteBuffer.getInt(i9 - 4);
            this.element_size = i10;
        } else {
            this.vector = 0;
            this.length = 0;
            this.element_size = 0;
        }
    }

    public int __vector() {
        return this.vector;
    }

    public int length() {
        return this.length;
    }

    public void reset() {
        __reset(0, 0, null);
    }
}
