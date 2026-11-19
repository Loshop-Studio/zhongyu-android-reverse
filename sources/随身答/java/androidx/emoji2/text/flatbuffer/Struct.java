package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class Struct {

    /* renamed from: bb */
    protected ByteBuffer f1507bb;
    protected int bb_pos;

    public void __reset(int i9, ByteBuffer byteBuffer) {
        this.f1507bb = byteBuffer;
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
