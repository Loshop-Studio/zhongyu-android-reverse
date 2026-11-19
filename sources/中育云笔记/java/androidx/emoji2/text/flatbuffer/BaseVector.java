package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class BaseVector {

    /* renamed from: bb */
    protected ByteBuffer f1467bb;
    private int element_size;
    private int length;
    private int vector;

    public int __element(int i10) {
        return this.vector + (i10 * this.element_size);
    }

    public void __reset(int i10, int i11, ByteBuffer byteBuffer) {
        this.f1467bb = byteBuffer;
        if (byteBuffer != null) {
            this.vector = i10;
            this.length = byteBuffer.getInt(i10 - 4);
            this.element_size = i11;
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
