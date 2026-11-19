package androidx.compose.p014ui.util;

import androidx.collection.SieveCacheKt;

/* loaded from: classes2.dex */
public final class InlineClassHelperKt {
    public static final long packFloats(float f10, float f11) {
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final long packInts(int i10, int i11) {
        return (i11 & 4294967295L) | (i10 << 32);
    }

    public static final float unpackAbsFloat1(long j10) {
        return Float.intBitsToFloat((int) ((j10 >> 32) & SieveCacheKt.NodeLinkMask));
    }

    public static final float unpackAbsFloat2(long j10) {
        return Float.intBitsToFloat((int) (j10 & SieveCacheKt.NodeLinkMask));
    }

    public static final float unpackFloat1(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float unpackFloat2(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static final int unpackInt1(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int unpackInt2(long j10) {
        return (int) (j10 & 4294967295L);
    }
}
