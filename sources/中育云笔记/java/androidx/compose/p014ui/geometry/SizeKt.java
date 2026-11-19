package androidx.compose.p014ui.geometry;

import androidx.compose.p014ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class SizeKt {
    @Stable
    public static final long Size(float f10, float f11) {
        return Size.m30697constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    /* renamed from: getCenter-uvyYCjk, reason: not valid java name */
    public static final long m30716getCenteruvyYCjk(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) / 2.0f;
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    @Stable
    /* renamed from: getCenter-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m30717getCenteruvyYCjk$annotations(long j10) {
    }

    /* renamed from: isSpecified-uvyYCjk, reason: not valid java name */
    public static final boolean m30718isSpecifieduvyYCjk(long j10) {
        return j10 != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isSpecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m30719isSpecifieduvyYCjk$annotations(long j10) {
    }

    /* renamed from: isUnspecified-uvyYCjk, reason: not valid java name */
    public static final boolean m30720isUnspecifieduvyYCjk(long j10) {
        return j10 == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isUnspecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m30721isUnspecifieduvyYCjk$annotations(long j10) {
    }

    @Stable
    /* renamed from: lerp-VgWVRYQ, reason: not valid java name */
    public static final long m30722lerpVgWVRYQ(long j10, long j11, float f10) {
        float fLerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10);
        float fLerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 & 4294967295L)), f10);
        return Size.m30697constructorimpl((Float.floatToRawIntBits(fLerp) << 32) | (Float.floatToRawIntBits(fLerp2) & 4294967295L));
    }

    /* renamed from: takeOrElse-TmRCtEA, reason: not valid java name */
    public static final long m30723takeOrElseTmRCtEA(long j10, InterfaceC9529a interfaceC9529a) {
        return j10 != InlineClassHelperKt.UnspecifiedPackedFloats ? j10 : ((Size) interfaceC9529a.invoke()).m30711unboximpl();
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m30726timesd16Qtg0(int i10, long j10) {
        return Size.m30709times7Ah8Wj8(j10, i10);
    }

    @Stable
    /* renamed from: toRect-uvyYCjk, reason: not valid java name */
    public static final Rect m30727toRectuvyYCjk(long j10) {
        return RectKt.m30677Recttz77jQw(Offset.Companion.m30653getZeroF1C5BW0(), j10);
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m30724timesd16Qtg0(double d10, long j10) {
        return Size.m30709times7Ah8Wj8(j10, (float) d10);
    }

    @Stable
    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m30725timesd16Qtg0(float f10, long j10) {
        return Size.m30709times7Ah8Wj8(j10, f10);
    }
}
