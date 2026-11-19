package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class Struct {

    /* renamed from: bb */
    protected ByteBuffer f4459bb;
    protected int bb_pos;

    public void __reset(int i10, ByteBuffer byteBuffer) {
        this.f4459bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i10;
        } else {
            this.bb_pos = 0;
        }
    }

    public void __reset() {
        __reset(0, null);
    }
}
