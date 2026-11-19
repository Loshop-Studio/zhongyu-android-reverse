package androidx.compose.p013ui.graphics;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Size;
import androidx.camera.video.AudioStats;
import androidx.collection.ScatterMapKt;
import androidx.compose.p013ui.graphics.colorspace.ColorModel;
import androidx.compose.p013ui.graphics.colorspace.ColorSpace;
import androidx.compose.p013ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p013ui.graphics.colorspace.DoubleFunction;
import androidx.compose.p013ui.graphics.colorspace.Rgb;
import androidx.compose.p013ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.material.color.utilities.Contrast;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a\u0017\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001a\u001a5\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00192\b\b\u0001\u0010\u0012\u001a\u00020\u00192\b\b\u0001\u0010\u0013\u001a\u00020\u00192\b\b\u0003\u0010\u0014\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010\u001b\u001a\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a9\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\u0010\u0017\u001a1\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0011H\u0082\b\u001a,\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\b\b\u0001\u0010(\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u001e\u0010+\u001a\u00020\u0007*\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u0016\u0010/\u001a\u000200*\u00020\u0007H\u0003ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u0016\u00103\u001a\u00020\u0011*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a%\u00106\u001a\u00020\u0007*\u00020\u00072\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000708H\u0086\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a\u0016\u0010;\u001a\u00020\u0019*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=\"\u0018\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\n\n\u0002\u0010\u0004\u0012\u0004\b\u0002\u0010\u0003\"\u001f\u0010\u0005\u001a\u00020\u0006*\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001f\u0010\f\u001a\u00020\u0006*\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, m13558d2 = {"UnspecifiedColor", "Lkotlin/ULong;", "getUnspecifiedColor$annotations", "()V", "J", "isSpecified", "", "Landroidx/compose/ui/graphics/Color;", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified-8_81llA", "(J)Z", "isUnspecified", "isUnspecified-8_81llA$annotations", "isUnspecified-8_81llA", "Color", "red", "", "green", "blue", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", TypedValues.Custom.S_COLOR, "", "(I)J", "(IIII)J", "", "(J)J", "UncheckedColor", "compositeComponent", "fgC", "bgC", "fgA", "bgA", "a", "lerp", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "compositeOver", "background", "compositeOver--OWjLjI", "(JJ)J", "getComponents", "", "getComponents-8_81llA", "(J)[F", "luminance", "luminance-8_81llA", "(J)F", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "toArgb", "toArgb-8_81llA", "(J)I", "ui-graphics_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n+ 4 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n*L\n1#1,659:1\n583#1:988\n583#1:989\n583#1:990\n635#1:1006\n65#2,10:660\n65#2,10:670\n65#2,10:680\n65#2,10:690\n65#2,10:710\n65#2,10:758\n65#2,10:806\n65#2,10:854\n65#2,10:978\n65#2,10:996\n33#3,5:700\n33#3,5:705\n33#3,5:991\n535#4,38:720\n535#4,38:768\n535#4,38:816\n535#4,38:864\n535#4,38:902\n535#4,38:940\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n568#1:988\n569#1:989\n570#1:990\n646#1:1006\n387#1:660,10\n388#1:670,10\n389#1:680,10\n390#1:690,10\n403#1:710,10\n404#1:758,10\n405#1:806,10\n406#1:854,10\n537#1:978,10\n617#1:996,10\n394#1:700,5\n399#1:705,5\n607#1:991,5\n403#1:720,38\n404#1:768,38\n405#1:816,38\n441#1:864,38\n442#1:902,38\n443#1:940,38\n*E\n"})
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
    public static final long m21021compositeOverOWjLjI(long j10, long j11) {
        long jM20973convertvNxB06k = Color.m20973convertvNxB06k(j10, Color.m20980getColorSpaceimpl(j11));
        float fM20978getAlphaimpl = Color.m20978getAlphaimpl(j11);
        float fM20978getAlphaimpl2 = Color.m20978getAlphaimpl(jM20973convertvNxB06k);
        float f10 = 1.0f - fM20978getAlphaimpl2;
        float f11 = (fM20978getAlphaimpl * f10) + fM20978getAlphaimpl2;
        return UncheckedColor(f11 == 0.0f ? 0.0f : ((Color.m20982getRedimpl(jM20973convertvNxB06k) * fM20978getAlphaimpl2) + ((Color.m20982getRedimpl(j11) * fM20978getAlphaimpl) * f10)) / f11, f11 == 0.0f ? 0.0f : ((Color.m20981getGreenimpl(jM20973convertvNxB06k) * fM20978getAlphaimpl2) + ((Color.m20981getGreenimpl(j11) * fM20978getAlphaimpl) * f10)) / f11, f11 != 0.0f ? ((Color.m20979getBlueimpl(jM20973convertvNxB06k) * fM20978getAlphaimpl2) + ((Color.m20979getBlueimpl(j11) * fM20978getAlphaimpl) * f10)) / f11 : 0.0f, f11, Color.m20980getColorSpaceimpl(j11));
    }

    @Size(4)
    /* renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m21022getComponents8_81llA(long j10) {
        return new float[]{Color.m20982getRedimpl(j10), Color.m20981getGreenimpl(j10), Color.m20979getBlueimpl(j10), Color.m20978getAlphaimpl(j10)};
    }

    @PublishedApi
    public static /* synthetic */ void getUnspecifiedColor$annotations() {
    }

    /* renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m21023isSpecified8_81llA(long j10) {
        return j10 != 16;
    }

    @Stable
    /* renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m21024isSpecified8_81llA$annotations(long j10) {
    }

    /* renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m21025isUnspecified8_81llA(long j10) {
        return j10 == 16;
    }

    @Stable
    /* renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m21026isUnspecified8_81llA$annotations(long j10) {
    }

    @Stable
    /* renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m21027lerpjxsXWHM(long j10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float f10) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long jM20973convertvNxB06k = Color.m20973convertvNxB06k(j10, oklab);
        long jM20973convertvNxB06k2 = Color.m20973convertvNxB06k(j11, oklab);
        float fM20978getAlphaimpl = Color.m20978getAlphaimpl(jM20973convertvNxB06k);
        float fM20982getRedimpl = Color.m20982getRedimpl(jM20973convertvNxB06k);
        float fM20981getGreenimpl = Color.m20981getGreenimpl(jM20973convertvNxB06k);
        float fM20979getBlueimpl = Color.m20979getBlueimpl(jM20973convertvNxB06k);
        float fM20978getAlphaimpl2 = Color.m20978getAlphaimpl(jM20973convertvNxB06k2);
        float fM20982getRedimpl2 = Color.m20982getRedimpl(jM20973convertvNxB06k2);
        float fM20981getGreenimpl2 = Color.m20981getGreenimpl(jM20973convertvNxB06k2);
        float fM20979getBlueimpl2 = Color.m20979getBlueimpl(jM20973convertvNxB06k2);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return Color.m20973convertvNxB06k(UncheckedColor(MathHelpersKt.lerp(fM20982getRedimpl, fM20982getRedimpl2, f10), MathHelpersKt.lerp(fM20981getGreenimpl, fM20981getGreenimpl2, f10), MathHelpersKt.lerp(fM20979getBlueimpl, fM20979getBlueimpl2, f10), MathHelpersKt.lerp(fM20978getAlphaimpl, fM20978getAlphaimpl2, f10), oklab), Color.m20980getColorSpaceimpl(j11));
    }

    @Stable
    /* renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m21028luminance8_81llA(long j10) {
        ColorSpace colorSpaceM20980getColorSpaceimpl = Color.m20980getColorSpaceimpl(j10);
        if (!ColorModel.m21383equalsimpl0(colorSpaceM20980getColorSpaceimpl.getModel(), ColorModel.INSTANCE.m21390getRgbxdoWZVw())) {
            InlineClassHelperKt.throwIllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m21386toStringimpl(colorSpaceM20980getColorSpaceimpl.getModel())));
        }
        Intrinsics.checkNotNull(colorSpaceM20980getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction eotfFunc$ui_graphics_release = ((Rgb) colorSpaceM20980getColorSpaceimpl).getEotfFunc();
        float fInvoke = (float) ((eotfFunc$ui_graphics_release.invoke(Color.m20982getRedimpl(j10)) * 0.2126d) + (eotfFunc$ui_graphics_release.invoke(Color.m20981getGreenimpl(j10)) * 0.7152d) + (eotfFunc$ui_graphics_release.invoke(Color.m20979getBlueimpl(j10)) * 0.0722d));
        if (fInvoke < 0.0f) {
            fInvoke = 0.0f;
        }
        if (fInvoke > 1.0f) {
            return 1.0f;
        }
        return fInvoke;
    }

    /* renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m21029takeOrElseDxMtmZc(long j10, Function0<Color> function0) {
        return j10 != 16 ? j10 : function0.invoke().m20986unboximpl();
    }

    @Stable
    @ColorInt
    /* renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m21030toArgb8_81llA(long j10) {
        return (int) ULong.m24473constructorimpl(Color.m20973convertvNxB06k(j10, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    public static /* synthetic */ long Color$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 255;
        }
        return Color(i10, i11, i12, i13);
    }

    @Stable
    public static final long Color(@ColorInt int i10) {
        return Color.m20972constructorimpl(ULong.m24473constructorimpl(ULong.m24473constructorimpl(i10) << 32));
    }

    @Stable
    public static final long Color(long j10) {
        return Color.m20972constructorimpl(ULong.m24473constructorimpl(j10 << 32));
    }

    @Stable
    public static final long Color(@IntRange(from = 0, m488to = ScatterMapKt.Sentinel) int i10, @IntRange(from = 0, m488to = ScatterMapKt.Sentinel) int i11, @IntRange(from = 0, m488to = ScatterMapKt.Sentinel) int i12, @IntRange(from = 0, m488to = ScatterMapKt.Sentinel) int i13) {
        return Color(((i10 & 255) << 16) | ((i13 & 255) << 24) | ((i11 & 255) << 8) | (i12 & 255));
    }
}
