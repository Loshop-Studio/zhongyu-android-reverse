package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class Struct {

    /* renamed from: bb */
    protected ByteBuffer f395bb;
    protected int bb_pos;

    public void __reset(int i4, ByteBuffer byteBuffer) {
        this.f395bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i4;
        } else {
            this.bb_pos = 0;
        }
    }

    public void __reset() {
        __reset(0, null);
    }
}
