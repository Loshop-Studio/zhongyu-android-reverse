package androidx.emoji2.text.flatbuffer;

import com.tencent.smtt.export.external.interfaces.ISelectionInterface;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class ShortVector extends BaseVector {
    public ShortVector __assign(int i10, ByteBuffer byteBuffer) {
        __reset(i10, 2, byteBuffer);
        return this;
    }

    public short get(int i10) {
        return this.f1569bb.getShort(__element(i10));
    }

    public int getAsUnsigned(int i10) {
        return get(i10) & ISelectionInterface.HELD_NOTHING;
    }
}
