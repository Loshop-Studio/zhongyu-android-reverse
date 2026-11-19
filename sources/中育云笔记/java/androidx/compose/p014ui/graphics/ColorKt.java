package androidx.compose.p014ui.graphics;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Size;
import androidx.camera.video.AudioStats;
import androidx.compose.p014ui.graphics.colorspace.ColorModel;
import androidx.compose.p014ui.graphics.colorspace.ColorSpace;
import androidx.compose.p014ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p014ui.graphics.colorspace.DoubleFunction;
import androidx.compose.p014ui.graphics.colorspace.Rgb;
import androidx.compose.p014ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import com.google.android.material.color.utilities.Contrast;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10781l;

/* loaded from: classes2.dex */
public final class ColorKt {
    public static final long UnspecifiedColor = 16;

    /* JADX WARN: Removed duplicated region for block: B:110:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0129  */
    @androidx.compose.runtime.Stable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long Color(float r20, float r21, float r22, float r23, androidx.compose.p014ui.graphics.colorspace.ColorSpace r24) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long Color$default(float f10, float f11, float f12, float f13, ColorSpace colorSpace, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f13 = 1.0f;
        }
        if ((i10 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f10, f11, f12, f13, colorSpace);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0  */
    @androidx.compose.runtime.Stable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long UncheckedColor(float r17, float r18, float r19, float r20, androidx.compose.p014ui.graphics.colorspace.ColorSpace r21) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.graphics.ColorKt.UncheckedColor(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long UncheckedColor$default(float f10, float f11, float f12, float f13, ColorSpace colorSpace, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f13 = 1.0f;
        }
        if ((i10 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return UncheckedColor(f10, f11, f12, f13, colorSpace);
    }

    private static final float compositeComponent(float f10, float f11, float f12, float f13, float f14) {
        if (f14 == 0.0f) {
            return 0.0f;
        }
        return ((f10 * f12) + ((f11 * f13) * (1.0f - f12))) / f14;
    }

    @Stable
    /* renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m30923compositeOverOWjLjI(long j10, long j11) {
        long jM30875convertvNxB06k = Color.m30875convertvNxB06k(j10, Color.m30882getColorSpaceimpl(j11));
        float fM30880getAlphaimpl = Color.m30880getAlphaimpl(j11);
        float fM30880getAlphaimpl2 = Color.m30880getAlphaimpl(jM30875convertvNxB06k);
        float f10 = 1.0f - fM30880getAlphaimpl2;
        float f11 = (fM30880getAlphaimpl * f10) + fM30880getAlphaimpl2;
        return UncheckedColor(f11 == 0.0f ? 0.0f : ((Color.m30884getRedimpl(jM30875convertvNxB06k) * fM30880getAlphaimpl2) + ((Color.m30884getRedimpl(j11) * fM30880getAlphaimpl) * f10)) / f11, f11 == 0.0f ? 0.0f : ((Color.m30883getGreenimpl(jM30875convertvNxB06k) * fM30880getAlphaimpl2) + ((Color.m30883getGreenimpl(j11) * fM30880getAlphaimpl) * f10)) / f11, f11 != 0.0f ? ((Color.m30881getBlueimpl(jM30875convertvNxB06k) * fM30880getAlphaimpl2) + ((Color.m30881getBlueimpl(j11) * fM30880getAlphaimpl) * f10)) / f11 : 0.0f, f11, Color.m30882getColorSpaceimpl(j11));
    }

    @Size(4)
    /* renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m30924getComponents8_81llA(long j10) {
        return new float[]{Color.m30884getRedimpl(j10), Color.m30883getGreenimpl(j10), Color.m30881getBlueimpl(j10), Color.m30880getAlphaimpl(j10)};
    }

    public static /* synthetic */ void getUnspecifiedColor$annotations() {
    }

    /* renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m30925isSpecified8_81llA(long j10) {
        return j10 != 16;
    }

    @Stable
    /* renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m30926isSpecified8_81llA$annotations(long j10) {
    }

    /* renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m30927isUnspecified8_81llA(long j10) {
        return j10 == 16;
    }

    @Stable
    /* renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m30928isUnspecified8_81llA$annotations(long j10) {
    }

    @Stable
    /* renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m30929lerpjxsXWHM(long j10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long jM30875convertvNxB06k = Color.m30875convertvNxB06k(j10, oklab);
        long jM30875convertvNxB06k2 = Color.m30875convertvNxB06k(j11, oklab);
        float fM30880getAlphaimpl = Color.m30880getAlphaimpl(jM30875convertvNxB06k);
        float fM30884getRedimpl = Color.m30884getRedimpl(jM30875convertvNxB06k);
        float fM30883getGreenimpl = Color.m30883getGreenimpl(jM30875convertvNxB06k);
        float fM30881getBlueimpl = Color.m30881getBlueimpl(jM30875convertvNxB06k);
        float fM30880getAlphaimpl2 = Color.m30880getAlphaimpl(jM30875convertvNxB06k2);
        float fM30884getRedimpl2 = Color.m30884getRedimpl(jM30875convertvNxB06k2);
        float fM30883getGreenimpl2 = Color.m30883getGreenimpl(jM30875convertvNxB06k2);
        float fM30881getBlueimpl2 = Color.m30881getBlueimpl(jM30875convertvNxB06k2);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return Color.m30875convertvNxB06k(UncheckedColor(MathHelpersKt.lerp(fM30884getRedimpl, fM30884getRedimpl2, f10), MathHelpersKt.lerp(fM30883getGreenimpl, fM30883getGreenimpl2, f10), MathHelpersKt.lerp(fM30881getBlueimpl, fM30881getBlueimpl2, f10), MathHelpersKt.lerp(fM30880getAlphaimpl, fM30880getAlphaimpl2, f10), oklab), Color.m30882getColorSpaceimpl(j11));
    }

    @Stable
    /* renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m30930luminance8_81llA(long j10) {
        ColorSpace colorSpaceM30882getColorSpaceimpl = Color.m30882getColorSpaceimpl(j10);
        if (!ColorModel.m31285equalsimpl0(colorSpaceM30882getColorSpaceimpl.m31294getModelxdoWZVw(), ColorModel.Companion.m31292getRgbxdoWZVw())) {
            InlineClassHelperKt.throwIllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m31288toStringimpl(colorSpaceM30882getColorSpaceimpl.m31294getModelxdoWZVw())));
        }
        AbstractC9979u.m20292e(colorSpaceM30882getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction eotfFunc$ui_graphics_release = ((Rgb) colorSpaceM30882getColorSpaceimpl).getEotfFunc$ui_graphics_release();
        float fInvoke = (float) ((eotfFunc$ui_graphics_release.invoke(Color.m30884getRedimpl(j10)) * 0.2126d) + (eotfFunc$ui_graphics_release.invoke(Color.m30883getGreenimpl(j10)) * 0.7152d) + (eotfFunc$ui_graphics_release.invoke(Color.m30881getBlueimpl(j10)) * 0.0722d));
        if (fInvoke < 0.0f) {
            fInvoke = 0.0f;
        }
        if (fInvoke > 1.0f) {
            return 1.0f;
        }
        return fInvoke;
    }

    /* renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m30931takeOrElseDxMtmZc(long j10, InterfaceC9529a interfaceC9529a) {
        return j10 != 16 ? j10 : ((Color) interfaceC9529a.invoke()).m30888unboximpl();
    }

    @Stable
    @ColorInt
    /* renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m30932toArgb8_81llA(long j10) {
        return (int) C10781l.m23023b(Color.m30875convertvNxB06k(j10, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    public static /* synthetic */ long Color$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 255;
        }
        return Color(i10, i11, i12, i13);
    }

    @Stable
    public static final long Color(@ColorInt int i10) {
        return Color.m30874constructorimpl(C10781l.m23023b(C10781l.m23023b(i10) << 32));
    }

    @Stable
    public static final long Color(long j10) {
        return Color.m30874constructorimpl(C10781l.m23023b(j10 << 32));
    }

    @Stable
    public static final long Color(@IntRange(from = 0, m338to = 255) int i10, @IntRange(from = 0, m338to = 255) int i11, @IntRange(from = 0, m338to = 255) int i12, @IntRange(from = 0, m338to = 255) int i13) {
        return Color(((i10 & 255) << 16) | ((i13 & 255) << 24) | ((i11 & 255) << 8) | (i12 & 255));
    }
}
