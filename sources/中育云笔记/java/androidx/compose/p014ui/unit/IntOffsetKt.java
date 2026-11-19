package androidx.compose.p014ui.unit;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;

/* loaded from: classes2.dex */
public final class IntOffsetKt {
    @Stable
    public static final long IntOffset(int i10, int i11) {
        return IntOffset.m33623constructorimpl((i11 & 4294967295L) | (i10 << 32));
    }

    @Stable
    /* renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m33641lerp81ZRxRo(long j10, long j11, float f10) {
        return IntOffset.m33623constructorimpl((MathHelpersKt.lerp(IntOffset.m33629getXimpl(j10), IntOffset.m33629getXimpl(j11), f10) << 32) | (MathHelpersKt.lerp(IntOffset.m33630getYimpl(j10), IntOffset.m33630getYimpl(j11), f10) & 4294967295L));
    }

    @Stable
    /* renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m33642minusNvtHpc(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - IntOffset.m33629getXimpl(j11);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - IntOffset.m33630getYimpl(j11);
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m33643minusoCl6YwE(long j10, long j11) {
        float fM33629getXimpl = IntOffset.m33629getXimpl(j10) - Float.intBitsToFloat((int) (j11 >> 32));
        float fM33630getYimpl = IntOffset.m33630getYimpl(j10) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(fM33629getXimpl) << 32) | (Float.floatToRawIntBits(fM33630getYimpl) & 4294967295L));
    }

    @Stable
    /* renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m33644plusNvtHpc(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + IntOffset.m33629getXimpl(j11);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) + IntOffset.m33630getYimpl(j11);
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    @Stable
    /* renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m33645plusoCl6YwE(long j10, long j11) {
        float fM33629getXimpl = IntOffset.m33629getXimpl(j10) + Float.intBitsToFloat((int) (j11 >> 32));
        float fM33630getYimpl = IntOffset.m33630getYimpl(j10) + Float.intBitsToFloat((int) (j11 & 4294967295L));
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(fM33629getXimpl) << 32) | (Float.floatToRawIntBits(fM33630getYimpl) & 4294967295L));
    }

    @Stable
    /* renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m33646roundk4lQ0M(long j10) {
        return IntOffset.m33623constructorimpl((Math.round(Float.intBitsToFloat((int) (j10 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j10 >> 32))) << 32));
    }

    @Stable
    /* renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m33647toOffsetgyyYBs(long j10) {
        float fM33629getXimpl = IntOffset.m33629getXimpl(j10);
        float fM33630getYimpl = IntOffset.m33630getYimpl(j10);
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(fM33630getYimpl) & 4294967295L) | (Float.floatToRawIntBits(fM33629getXimpl) << 32));
    }
}
