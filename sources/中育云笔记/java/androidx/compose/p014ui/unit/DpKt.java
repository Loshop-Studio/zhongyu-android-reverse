package androidx.compose.p014ui.unit;

import androidx.compose.p014ui.geometry.InlineClassHelperKt;
import androidx.compose.p014ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import p181hd.InterfaceC9529a;
import p265nd.AbstractC10410o;

/* loaded from: classes2.dex */
public final class DpKt {
    @Stable
    /* renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m33522DpOffsetYgX7TsA(float f10, float f11) {
        return DpOffset.m33557constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    @Stable
    /* renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m33523DpSizeYgX7TsA(float f10, float f11) {
        return DpSize.m33590constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    @Stable
    /* renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m33524coerceAtLeastYgX7TsA(float f10, float f11) {
        return C3186Dp.m33501constructorimpl(AbstractC10410o.m21751d(f10, f11));
    }

    @Stable
    /* renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m33525coerceAtMostYgX7TsA(float f10, float f11) {
        return C3186Dp.m33501constructorimpl(AbstractC10410o.m21755h(f10, f11));
    }

    @Stable
    /* renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m33526coerceIn2z7ARbQ(float f10, float f11, float f12) {
        return C3186Dp.m33501constructorimpl(AbstractC10410o.m21760m(f10, f11, f12));
    }

    /* renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m33527getCenterEaSLcWc(long j10) {
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(DpSize.m33599getWidthD9Ej5fM(j10) / 2.0f);
        float fM33501constructorimpl2 = C3186Dp.m33501constructorimpl(DpSize.m33597getHeightD9Ej5fM(j10) / 2.0f);
        return DpOffset.m33557constructorimpl((Float.floatToRawIntBits(fM33501constructorimpl2) & 4294967295L) | (Float.floatToRawIntBits(fM33501constructorimpl) << 32));
    }

    @Stable
    /* renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m33528getCenterEaSLcWc$annotations(long j10) {
    }

    public static final float getDp(int i10) {
        return C3186Dp.m33501constructorimpl(i10);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d10) {
    }

    public static final float getHeight(DpRect dpRect) {
        return C3186Dp.m33501constructorimpl(dpRect.m33583getBottomD9Ej5fM() - dpRect.m33586getTopD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static final long getSize(DpRect dpRect) {
        return m33523DpSizeYgX7TsA(C3186Dp.m33501constructorimpl(dpRect.m33585getRightD9Ej5fM() - dpRect.m33584getLeftD9Ej5fM()), C3186Dp.m33501constructorimpl(dpRect.m33583getBottomD9Ej5fM() - dpRect.m33586getTopD9Ej5fM()));
    }

    @Stable
    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static final float getWidth(DpRect dpRect) {
        return C3186Dp.m33501constructorimpl(dpRect.m33585getRightD9Ej5fM() - dpRect.m33584getLeftD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m33529isFinite0680j_4(float f10) {
        return (Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) < 2139095040;
    }

    @Stable
    /* renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m33530isFinite0680j_4$annotations(float f10) {
    }

    /* renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m33531isSpecified0680j_4(float f10) {
        return !Float.isNaN(f10);
    }

    @Stable
    /* renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m33532isSpecified0680j_4$annotations(float f10) {
    }

    /* renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m33533isSpecifiedEaSLcWc(long j10) {
        return j10 != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m33534isSpecifiedEaSLcWc$annotations(long j10) {
    }

    /* renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m33535isSpecifiedjoFl9I(long j10) {
        return j10 != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m33536isSpecifiedjoFl9I$annotations(long j10) {
    }

    /* renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m33537isUnspecified0680j_4(float f10) {
        return Float.isNaN(f10);
    }

    @Stable
    /* renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m33538isUnspecified0680j_4$annotations(float f10) {
    }

    /* renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m33539isUnspecifiedEaSLcWc(long j10) {
        return j10 == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m33540isUnspecifiedEaSLcWc$annotations(long j10) {
    }

    /* renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m33541isUnspecifiedjoFl9I(long j10) {
        return j10 == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m33542isUnspecifiedjoFl9I$annotations(long j10) {
    }

    @Stable
    /* renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m33543lerpIDex15A(long j10, long j11, float f10) {
        float fM33544lerpMdfbLM = m33544lerpMdfbLM(DpSize.m33599getWidthD9Ej5fM(j10), DpSize.m33599getWidthD9Ej5fM(j11), f10);
        float fM33544lerpMdfbLM2 = m33544lerpMdfbLM(DpSize.m33597getHeightD9Ej5fM(j10), DpSize.m33597getHeightD9Ej5fM(j11), f10);
        return DpSize.m33590constructorimpl((Float.floatToRawIntBits(fM33544lerpMdfbLM) << 32) | (Float.floatToRawIntBits(fM33544lerpMdfbLM2) & 4294967295L));
    }

    @Stable
    /* renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m33544lerpMdfbLM(float f10, float f11, float f12) {
        return C3186Dp.m33501constructorimpl(MathHelpersKt.lerp(f10, f11, f12));
    }

    @Stable
    /* renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m33545lerpxhh869w(long j10, long j11, float f10) {
        float fLerp = MathHelpersKt.lerp(DpOffset.m33562getXD9Ej5fM(j10), DpOffset.m33562getXD9Ej5fM(j11), f10);
        float fLerp2 = MathHelpersKt.lerp(DpOffset.m33564getYD9Ej5fM(j10), DpOffset.m33564getYD9Ej5fM(j11), f10);
        return DpOffset.m33557constructorimpl((Float.floatToRawIntBits(fLerp) << 32) | (Float.floatToRawIntBits(fLerp2) & 4294967295L));
    }

    @Stable
    /* renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m33546maxYgX7TsA(float f10, float f11) {
        return C3186Dp.m33501constructorimpl(Math.max(f10, f11));
    }

    @Stable
    /* renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m33547minYgX7TsA(float f10, float f11) {
        return C3186Dp.m33501constructorimpl(Math.min(f10, f11));
    }

    /* renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m33548takeOrElseD5KLDUw(float f10, InterfaceC9529a interfaceC9529a) {
        return !Float.isNaN(f10) ? f10 : ((C3186Dp) interfaceC9529a.invoke()).m33515unboximpl();
    }

    /* renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m33549takeOrElsegVKV90s(long j10, InterfaceC9529a interfaceC9529a) {
        return j10 != InlineClassHelperKt.UnspecifiedPackedFloats ? j10 : ((DpOffset) interfaceC9529a.invoke()).m33570unboximpl();
    }

    /* renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m33550takeOrElseitqla9I(long j10, InterfaceC9529a interfaceC9529a) {
        return j10 != InlineClassHelperKt.UnspecifiedPackedFloats ? j10 : ((DpSize) interfaceC9529a.invoke()).m33607unboximpl();
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m33552times3ABfNKs(float f10, float f11) {
        return C3186Dp.m33501constructorimpl(f10 * f11);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m33555times6HolHcs(int i10, long j10) {
        return DpSize.m33605timesGh9hcWk(j10, i10);
    }

    public static final float getDp(double d10) {
        return C3186Dp.m33501constructorimpl((float) d10);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f10) {
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m33551times3ABfNKs(double d10, float f10) {
        return C3186Dp.m33501constructorimpl(((float) d10) * f10);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m33554times6HolHcs(float f10, long j10) {
        return DpSize.m33604timesGh9hcWk(j10, f10);
    }

    public static final float getDp(float f10) {
        return C3186Dp.m33501constructorimpl(f10);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i10) {
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m33553times3ABfNKs(int i10, float f10) {
        return C3186Dp.m33501constructorimpl(i10 * f10);
    }
}
