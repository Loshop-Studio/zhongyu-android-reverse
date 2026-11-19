package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class BaseVector {

    /* renamed from: bb */
    protected ByteBuffer f552bb;
    private int element_size;
    private int length;
    private int vector;

    public int __element(int i6) {
        return this.vector + (i6 * this.element_size);
    }

    public void __reset(int i6, int i7, ByteBuffer byteBuffer) {
        this.f552bb = byteBuffer;
        if (byteBuffer != null) {
            this.vector = i6;
            this.length = byteBuffer.getInt(i6 - 4);
            this.element_size = i7;
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
