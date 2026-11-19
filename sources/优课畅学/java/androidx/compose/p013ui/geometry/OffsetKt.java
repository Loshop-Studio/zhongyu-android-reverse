package androidx.compose.p013ui.geometry;

import androidx.compose.p013ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class OffsetKt {
    @Stable
    public static final long Offset(float f10, float f11) {
        return Offset.m24027constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    /* renamed from: isFinite-k-4lQ0M, reason: not valid java name */
    public static final boolean m24052isFinitek4lQ0M(long j10) {
        return ((((j10 & InlineClassHelperKt.DualFloatInfinityBase) ^ InlineClassHelperKt.DualFloatInfinityBase) - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0;
    }

    @Stable
    /* renamed from: isFinite-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m24053isFinitek4lQ0M$annotations(long j10) {
    }

    /* renamed from: isSpecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m24054isSpecifiedk4lQ0M(long j10) {
        return (j10 & 9223372034707292159L) != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isSpecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m24055isSpecifiedk4lQ0M$annotations(long j10) {
    }

    /* renamed from: isUnspecified-k-4lQ0M, reason: not valid java name */
    public static final boolean m24056isUnspecifiedk4lQ0M(long j10) {
        return (j10 & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isUnspecified-k-4lQ0M$annotations, reason: not valid java name */
    public static /* synthetic */ void m24057isUnspecifiedk4lQ0M$annotations(long j10) {
    }

    @Stable
    /* renamed from: lerp-Wko1d7g, reason: not valid java name */
    public static final long m24058lerpWko1d7g(long j10, long j11, float f10) {
        float fLerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10);
        float fLerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 & 4294967295L)), f10);
        return Offset.m24027constructorimpl((Float.floatToRawIntBits(fLerp) << 32) | (Float.floatToRawIntBits(fLerp2) & 4294967295L));
    }

    /* renamed from: takeOrElse-3MmeM6k, reason: not valid java name */
    public static final long m24059takeOrElse3MmeM6k(long j10, InterfaceC10559a interfaceC10559a) {
        return (9223372034707292159L & j10) != InlineClassHelperKt.UnspecifiedPackedFloats ? j10 : ((Offset) interfaceC10559a.invoke()).m24045unboximpl();
    }
}
