package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class UnionVector extends BaseVector {
    public UnionVector __assign(int i6, int i7, ByteBuffer byteBuffer) {
        __reset(i6, i7, byteBuffer);
        return this;
    }

    public Table get(Table table, int i6) {
        return Table.__union(table, __element(i6), this.f552bb);
    }
}
