package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class BaseVector {

    /* renamed from: bb */
    protected ByteBuffer f390bb;
    private int element_size;
    private int length;
    private int vector;

    public int __element(int i4) {
        return this.vector + (i4 * this.element_size);
    }

    public void __reset(int i4, int i5, ByteBuffer byteBuffer) {
        this.f390bb = byteBuffer;
        if (byteBuffer != null) {
            this.vector = i4;
            this.length = byteBuffer.getInt(i4 - 4);
            this.element_size = i5;
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
