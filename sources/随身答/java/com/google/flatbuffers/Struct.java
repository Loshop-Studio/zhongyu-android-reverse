package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class Struct {

    /* renamed from: bb */
    protected ByteBuffer f5064bb;
    protected int bb_pos;

    public void __reset(int i9, ByteBuffer byteBuffer) {
        this.f5064bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i9;
        } else {
            this.bb_pos = 0;
        }
    }

    public void __reset() {
        __reset(0, null);
    }
}
