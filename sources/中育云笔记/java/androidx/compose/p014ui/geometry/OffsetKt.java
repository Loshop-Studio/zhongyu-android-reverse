package androidx.compose.p014ui.geometry;

import androidx.compose.p014ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class OffsetKt {
    @Stable
    public static final long Offset(float f10, float f11) {
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    /* renamed from: isFinite-k-4lQ0M, reason: not valid java name */
    public static final boolean m30654isFinitek4lQ0M(long j10) {
        return ((((j10 & InlineClassHelperKt.DualFloatInfinityBase) ^ InlineClassHelperKt.DualFloatInfinityBase) - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0;
    }

    @Stable
    /* renamed from: isFinite-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m30655isFinitek4lQ0M$annotations(long j10) {
    }

    /* renamed from: isSpecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m30656isSpecifiedk4lQ0M(long j10) {
        return (j10 & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isSpecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m30657isSpecifiedk4lQ0M$annotations(long j10) {
    }

    /* renamed from: isUnspecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m30658isUnspecifiedk4lQ0M(long j10) {
        return (j10 & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isUnspecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m30659isUnspecifiedk4lQ0M$annotations(long j10) {
    }

    @Stable
    /* renamed from: lerp-Wko1d7g, reason: not valid java name */
    public static final long m30660lerpWko1d7g(long j10, long j11, float f10) {
        float fLerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10);
        float fLerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 & 4294967295L)), f10);
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(fLerp) << 32) | (Float.floatToRawIntBits(fLerp2) & 4294967295L));
    }

    /* renamed from: takeOrElse-3MmeM6k, reason: not valid java name */
    public static final long m30661takeOrElse3MmeM6k(long j10, InterfaceC9529a interfaceC9529a) {
        return (9223372034707292159L & j10) != InlineClassHelperKt.UnspecifiedPackedFloats ? j10 : ((Offset) interfaceC9529a.invoke()).m30647unboximpl();
    }
}
