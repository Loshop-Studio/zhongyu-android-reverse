package androidx.compose.p013ui.graphics;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Size;
import androidx.camera.video.AudioStats;
import androidx.compose.p013ui.graphics.colorspace.ColorModel;
import androidx.compose.p013ui.graphics.colorspace.ColorSpace;
import androidx.compose.p013ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p013ui.graphics.colorspace.DoubleFunction;
import androidx.compose.p013ui.graphics.colorspace.Rgb;
import androidx.compose.p013ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import com.google.android.material.color.utilities.Contrast;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8731k;
import p300x7.InterfaceC10559a;

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
    public static final long Color(float r20, float r21, float r22, float r23, androidx.compose.p013ui.graphics.colorspace.ColorSpace r24) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
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
    public static final long UncheckedColor(float r17, float r18, float r19, float r20, androidx.compose.p013ui.graphics.colorspace.ColorSpace r21) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.graphics.ColorKt.UncheckedColor(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
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
    public static final long m24321compositeOverOWjLjI(long j10, long j11) {
        long jM24273convertvNxB06k = Color.m24273convertvNxB06k(j10, Color.m24280getColorSpaceimpl(j11));
        float fM24278getAlphaimpl = Color.m24278getAlphaimpl(j11);
        float fM24278getAlphaimpl2 = Color.m24278getAlphaimpl(jM24273convertvNxB06k);
        float f10 = 1.0f - fM24278getAlphaimpl2;
        float f11 = (fM24278getAlphaimpl * f10) + fM24278getAlphaimpl2;
        return UncheckedColor(f11 == 0.0f ? 0.0f : ((Color.m24282getRedimpl(jM24273convertvNxB06k) * fM24278getAlphaimpl2) + ((Color.m24282getRedimpl(j11) * fM24278getAlphaimpl) * f10)) / f11, f11 == 0.0f ? 0.0f : ((Color.m24281getGreenimpl(jM24273convertvNxB06k) * fM24278getAlphaimpl2) + ((Color.m24281getGreenimpl(j11) * fM24278getAlphaimpl) * f10)) / f11, f11 != 0.0f ? ((Color.m24279getBlueimpl(jM24273convertvNxB06k) * fM24278getAlphaimpl2) + ((Color.m24279getBlueimpl(j11) * fM24278getAlphaimpl) * f10)) / f11 : 0.0f, f11, Color.m24280getColorSpaceimpl(j11));
    }

    @Size(4)
    /* renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m24322getComponents8_81llA(long j10) {
        return new float[]{Color.m24282getRedimpl(j10), Color.m24281getGreenimpl(j10), Color.m24279getBlueimpl(j10), Color.m24278getAlphaimpl(j10)};
    }

    public static /* synthetic */ void getUnspecifiedColor$annotations() {
    }

    /* renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m24323isSpecified8_81llA(long j10) {
        return j10 != 16;
    }

    @Stable
    /* renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m24324isSpecified8_81llA$annotations(long j10) {
    }

    /* renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m24325isUnspecified8_81llA(long j10) {
        return j10 == 16;
    }

    @Stable
    /* renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m24326isUnspecified8_81llA$annotations(long j10) {
    }

    @Stable
    /* renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m24327lerpjxsXWHM(long j10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long jM24273convertvNxB06k = Color.m24273convertvNxB06k(j10, oklab);
        long jM24273convertvNxB06k2 = Color.m24273convertvNxB06k(j11, oklab);
        float fM24278getAlphaimpl = Color.m24278getAlphaimpl(jM24273convertvNxB06k);
        float fM24282getRedimpl = Color.m24282getRedimpl(jM24273convertvNxB06k);
        float fM24281getGreenimpl = Color.m24281getGreenimpl(jM24273convertvNxB06k);
        float fM24279getBlueimpl = Color.m24279getBlueimpl(jM24273convertvNxB06k);
        float fM24278getAlphaimpl2 = Color.m24278getAlphaimpl(jM24273convertvNxB06k2);
        float fM24282getRedimpl2 = Color.m24282getRedimpl(jM24273convertvNxB06k2);
        float fM24281getGreenimpl2 = Color.m24281getGreenimpl(jM24273convertvNxB06k2);
        float fM24279getBlueimpl2 = Color.m24279getBlueimpl(jM24273convertvNxB06k2);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return Color.m24273convertvNxB06k(UncheckedColor(MathHelpersKt.lerp(fM24282getRedimpl, fM24282getRedimpl2, f10), MathHelpersKt.lerp(fM24281getGreenimpl, fM24281getGreenimpl2, f10), MathHelpersKt.lerp(fM24279getBlueimpl, fM24279getBlueimpl2, f10), MathHelpersKt.lerp(fM24278getAlphaimpl, fM24278getAlphaimpl2, f10), oklab), Color.m24280getColorSpaceimpl(j11));
    }

    @Stable
    /* renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m24328luminance8_81llA(long j10) {
        ColorSpace colorSpaceM24280getColorSpaceimpl = Color.m24280getColorSpaceimpl(j10);
        if (!ColorModel.m24683equalsimpl0(colorSpaceM24280getColorSpaceimpl.m24692getModelxdoWZVw(), ColorModel.Companion.m24690getRgbxdoWZVw())) {
            InlineClassHelperKt.throwIllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m24686toStringimpl(colorSpaceM24280getColorSpaceimpl.m24692getModelxdoWZVw())));
        }
        AbstractC9133u.m16131e(colorSpaceM24280getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction eotfFunc$ui_graphics_release = ((Rgb) colorSpaceM24280getColorSpaceimpl).getEotfFunc$ui_graphics_release();
        float fInvoke = (float) ((eotfFunc$ui_graphics_release.invoke(Color.m24282getRedimpl(j10)) * 0.2126d) + (eotfFunc$ui_graphics_release.invoke(Color.m24281getGreenimpl(j10)) * 0.7152d) + (eotfFunc$ui_graphics_release.invoke(Color.m24279getBlueimpl(j10)) * 0.0722d));
        if (fInvoke < 0.0f) {
            fInvoke = 0.0f;
        }
        if (fInvoke > 1.0f) {
            return 1.0f;
        }
        return fInvoke;
    }

    /* renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m24329takeOrElseDxMtmZc(long j10, InterfaceC10559a interfaceC10559a) {
        return j10 != 16 ? j10 : ((Color) interfaceC10559a.invoke()).m24286unboximpl();
    }

    @Stable
    @ColorInt
    /* renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m24330toArgb8_81llA(long j10) {
        return (int) C8731k.m14278b(Color.m24273convertvNxB06k(j10, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    public static /* synthetic */ long Color$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 255;
        }
        return Color(i10, i11, i12, i13);
    }

    @Stable
    public static final long Color(@ColorInt int i10) {
        return Color.m24272constructorimpl(C8731k.m14278b(C8731k.m14278b(i10) << 32));
    }

    @Stable
    public static final long Color(long j10) {
        return Color.m24272constructorimpl(C8731k.m14278b(j10 << 32));
    }

    @Stable
    public static final long Color(@IntRange(from = 0, m244to = 255) int i10, @IntRange(from = 0, m244to = 255) int i11, @IntRange(from = 0, m244to = 255) int i12, @IntRange(from = 0, m244to = 255) int i13) {
        return Color(((i10 & 255) << 16) | ((i13 & 255) << 24) | ((i11 & 255) << 8) | (i12 & 255));
    }
}
