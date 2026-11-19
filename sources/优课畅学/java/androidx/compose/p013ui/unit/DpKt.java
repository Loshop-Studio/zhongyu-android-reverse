package androidx.compose.p013ui.unit;

import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import p077d8.AbstractC8323h;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class DpKt {
    @Stable
    /* renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m26920DpOffsetYgX7TsA(float f10, float f11) {
        return DpOffset.m26955constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    @Stable
    /* renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m26921DpSizeYgX7TsA(float f10, float f11) {
        return DpSize.m26988constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    @Stable
    /* renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m26922coerceAtLeastYgX7TsA(float f10, float f11) {
        return C3156Dp.m26899constructorimpl(AbstractC8323h.m13509d(f10, f11));
    }

    @Stable
    /* renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m26923coerceAtMostYgX7TsA(float f10, float f11) {
        return C3156Dp.m26899constructorimpl(AbstractC8323h.m13512g(f10, f11));
    }

    @Stable
    /* renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m26924coerceIn2z7ARbQ(float f10, float f11, float f12) {
        return C3156Dp.m26899constructorimpl(AbstractC8323h.m13517l(f10, f11, f12));
    }

    /* renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m26925getCenterEaSLcWc(long j10) {
        float fM26899constructorimpl = C3156Dp.m26899constructorimpl(DpSize.m26997getWidthD9Ej5fM(j10) / 2.0f);
        float fM26899constructorimpl2 = C3156Dp.m26899constructorimpl(DpSize.m26995getHeightD9Ej5fM(j10) / 2.0f);
        return DpOffset.m26955constructorimpl((Float.floatToRawIntBits(fM26899constructorimpl2) & 4294967295L) | (Float.floatToRawIntBits(fM26899constructorimpl) << 32));
    }

    @Stable
    /* renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m26926getCenterEaSLcWc$annotations(long j10) {
    }

    public static final float getDp(int i10) {
        return C3156Dp.m26899constructorimpl(i10);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(double d10) {
    }

    public static final float getHeight(DpRect dpRect) {
        return C3156Dp.m26899constructorimpl(dpRect.m26981getBottomD9Ej5fM() - dpRect.m26984getTopD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static final long getSize(DpRect dpRect) {
        return m26921DpSizeYgX7TsA(C3156Dp.m26899constructorimpl(dpRect.m26983getRightD9Ej5fM() - dpRect.m26982getLeftD9Ej5fM()), C3156Dp.m26899constructorimpl(dpRect.m26981getBottomD9Ej5fM() - dpRect.m26984getTopD9Ej5fM()));
    }

    @Stable
    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static final float getWidth(DpRect dpRect) {
        return C3156Dp.m26899constructorimpl(dpRect.m26983getRightD9Ej5fM() - dpRect.m26982getLeftD9Ej5fM());
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m26927isFinite0680j_4(float f10) {
        return (Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) < 2139095040;
    }

    @Stable
    /* renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m26928isFinite0680j_4$annotations(float f10) {
    }

    /* renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m26929isSpecified0680j_4(float f10) {
        return !Float.isNaN(f10);
    }

    @Stable
    /* renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m26930isSpecified0680j_4$annotations(float f10) {
    }

    /* renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m26931isSpecifiedEaSLcWc(long j10) {
        return j10 != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m26932isSpecifiedEaSLcWc$annotations(long j10) {
    }

    /* renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m26933isSpecifiedjoFl9I(long j10) {
        return j10 != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m26934isSpecifiedjoFl9I$annotations(long j10) {
    }

    /* renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m26935isUnspecified0680j_4(float f10) {
        return Float.isNaN(f10);
    }

    @Stable
    /* renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m26936isUnspecified0680j_4$annotations(float f10) {
    }

    /* renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m26937isUnspecifiedEaSLcWc(long j10) {
        return j10 == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m26938isUnspecifiedEaSLcWc$annotations(long j10) {
    }

    /* renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m26939isUnspecifiedjoFl9I(long j10) {
        return j10 == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Stable
    /* renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m26940isUnspecifiedjoFl9I$annotations(long j10) {
    }

    @Stable
    /* renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m26941lerpIDex15A(long j10, long j11, float f10) {
        float fM26942lerpMdfbLM = m26942lerpMdfbLM(DpSize.m26997getWidthD9Ej5fM(j10), DpSize.m26997getWidthD9Ej5fM(j11), f10);
        float fM26942lerpMdfbLM2 = m26942lerpMdfbLM(DpSize.m26995getHeightD9Ej5fM(j10), DpSize.m26995getHeightD9Ej5fM(j11), f10);
        return DpSize.m26988constructorimpl((Float.floatToRawIntBits(fM26942lerpMdfbLM) << 32) | (Float.floatToRawIntBits(fM26942lerpMdfbLM2) & 4294967295L));
    }

    @Stable
    /* renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m26942lerpMdfbLM(float f10, float f11, float f12) {
        return C3156Dp.m26899constructorimpl(MathHelpersKt.lerp(f10, f11, f12));
    }

    @Stable
    /* renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m26943lerpxhh869w(long j10, long j11, float f10) {
        float fLerp = MathHelpersKt.lerp(DpOffset.m26960getXD9Ej5fM(j10), DpOffset.m26960getXD9Ej5fM(j11), f10);
        float fLerp2 = MathHelpersKt.lerp(DpOffset.m26962getYD9Ej5fM(j10), DpOffset.m26962getYD9Ej5fM(j11), f10);
        return DpOffset.m26955constructorimpl((Float.floatToRawIntBits(fLerp) << 32) | (Float.floatToRawIntBits(fLerp2) & 4294967295L));
    }

    @Stable
    /* renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m26944maxYgX7TsA(float f10, float f11) {
        return C3156Dp.m26899constructorimpl(Math.max(f10, f11));
    }

    @Stable
    /* renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m26945minYgX7TsA(float f10, float f11) {
        return C3156Dp.m26899constructorimpl(Math.min(f10, f11));
    }

    /* renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m26946takeOrElseD5KLDUw(float f10, InterfaceC10559a interfaceC10559a) {
        return !Float.isNaN(f10) ? f10 : ((C3156Dp) interfaceC10559a.invoke()).m26913unboximpl();
    }

    /* renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m26947takeOrElsegVKV90s(long j10, InterfaceC10559a interfaceC10559a) {
        return j10 != InlineClassHelperKt.UnspecifiedPackedFloats ? j10 : ((DpOffset) interfaceC10559a.invoke()).m26968unboximpl();
    }

    /* renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m26948takeOrElseitqla9I(long j10, InterfaceC10559a interfaceC10559a) {
        return j10 != InlineClassHelperKt.UnspecifiedPackedFloats ? j10 : ((DpSize) interfaceC10559a.invoke()).m27005unboximpl();
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m26950times3ABfNKs(float f10, float f11) {
        return C3156Dp.m26899constructorimpl(f10 * f11);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m26953times6HolHcs(int i10, long j10) {
        return DpSize.m27003timesGh9hcWk(j10, i10);
    }

    public static final float getDp(double d10) {
        return C3156Dp.m26899constructorimpl((float) d10);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(float f10) {
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m26949times3ABfNKs(double d10, float f10) {
        return C3156Dp.m26899constructorimpl(((float) d10) * f10);
    }

    @Stable
    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m26952times6HolHcs(float f10, long j10) {
        return DpSize.m27002timesGh9hcWk(j10, f10);
    }

    public static final float getDp(float f10) {
        return C3156Dp.m26899constructorimpl(f10);
    }

    @Stable
    public static /* synthetic */ void getDp$annotations(int i10) {
    }

    @Stable
    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m26951times3ABfNKs(int i10, float f10) {
        return C3156Dp.m26899constructorimpl(i10 * f10);
    }
}
