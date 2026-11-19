package androidx.compose.p011ui.graphics;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Size;
import androidx.camera.video.AudioStats;
import androidx.collection.ScatterMapKt;
import androidx.compose.p011ui.graphics.colorspace.ColorModel;
import androidx.compose.p011ui.graphics.colorspace.ColorSpace;
import androidx.compose.p011ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p011ui.graphics.colorspace.DoubleFunction;
import androidx.compose.p011ui.graphics.colorspace.Rgb;
import androidx.compose.p011ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u001a;\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\t\u001a\u0019\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\r\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\b\u0010\u000f\u001a7\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0001\u001a\u00020\u000b2\b\b\u0001\u0010\u0002\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u000b2\b\b\u0003\u0010\u0004\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\b\u0010\u0010\u001a,\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001e\u0010\u001a\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a8\u0010 \u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b \u0010!\u001a\u0016\u0010%\u001a\u00020\"*\u00020\u0007H\u0003ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u0016\u0010(\u001a\u00020\u0000*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0016\u0010+\u001a\u00020\u000b*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a%\u00100\u001a\u00020\u0007*\u00020\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070,H\u0086\bø\u0001\u0000¢\u0006\u0004\b.\u0010/\"\u001a\u00102\u001a\u0002018\u0000X\u0081T¢\u0006\f\n\u0004\b2\u00103\u0012\u0004\b4\u00105\"\u001f\u0010;\u001a\u000206*\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010:\u001a\u0004\b7\u00108\"\u001f\u0010>\u001a\u000206*\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010:\u001a\u0004\b<\u00108\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?"}, m5110d2 = {"", "red", "green", "blue", "alpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "Color", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "UncheckedColor", "", TypedValues.Custom.S_COLOR, "(I)J", "", "(J)J", "(IIII)J", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "lerp", "background", "compositeOver--OWjLjI", "(JJ)J", "compositeOver", "fgC", "bgC", "fgA", "bgA", "a", "compositeComponent", "(FFFFF)F", "", "getComponents-8_81llA", "(J)[F", "getComponents", "luminance-8_81llA", "(J)F", "luminance", "toArgb-8_81llA", "(J)I", "toArgb", "Lkotlin/Function0;", "block", "takeOrElse-DxMtmZc", "(JLr6/a;)J", "takeOrElse", "Ld6/n;", "UnspecifiedColor", "J", "getUnspecifiedColor$annotations", "()V", "", "isSpecified-8_81llA", "(J)Z", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified", "isUnspecified-8_81llA", "isUnspecified-8_81llA$annotations", "isUnspecified", "ui-graphics_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n+ 4 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n*L\n1#1,659:1\n583#1:988\n583#1:989\n583#1:990\n635#1:1006\n65#2,10:660\n65#2,10:670\n65#2,10:680\n65#2,10:690\n65#2,10:710\n65#2,10:758\n65#2,10:806\n65#2,10:854\n65#2,10:978\n65#2,10:996\n33#3,5:700\n33#3,5:705\n33#3,5:991\n535#4,38:720\n535#4,38:768\n535#4,38:816\n535#4,38:864\n535#4,38:902\n535#4,38:940\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n568#1:988\n569#1:989\n570#1:990\n646#1:1006\n387#1:660,10\n388#1:670,10\n389#1:680,10\n390#1:690,10\n403#1:710,10\n404#1:758,10\n405#1:806,10\n406#1:854,10\n537#1:978,10\n617#1:996,10\n394#1:700,5\n399#1:705,5\n607#1:991,5\n403#1:720,38\n404#1:768,38\n405#1:816,38\n441#1:864,38\n442#1:902,38\n443#1:940,38\n*E\n"})
/* loaded from: classes.dex */
public final class ColorKt {
    public static final long UnspecifiedColor = 16;

    /* JADX WARN: Removed duplicated region for block: B:110:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0121  */
    @androidx.compose.runtime.Stable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long Color(float r20, float r21, float r22, float r23, @org.jetbrains.annotations.NotNull androidx.compose.p011ui.graphics.colorspace.ColorSpace r24) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long Color$default(float f, float f7, float f8, float f9, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f9 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f, f7, f8, f9, colorSpace);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    @androidx.compose.runtime.Stable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long UncheckedColor(float r17, float r18, float r19, float r20, @org.jetbrains.annotations.NotNull androidx.compose.p011ui.graphics.colorspace.ColorSpace r21) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.graphics.ColorKt.UncheckedColor(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long UncheckedColor$default(float f, float f7, float f8, float f9, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f9 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return UncheckedColor(f, f7, f8, f9, colorSpace);
    }

    private static final float compositeComponent(float f, float f7, float f8, float f9, float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return (((1.0f - f8) * (f7 * f9)) + (f * f8)) / f10;
    }

    @Stable
    /* renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m10727compositeOverOWjLjI(long j7, long j8) {
        float f;
        float f7;
        long jM10679convertvNxB06k = Color.m10679convertvNxB06k(j7, Color.m10686getColorSpaceimpl(j8));
        float fM10684getAlphaimpl = Color.m10684getAlphaimpl(j8);
        float fM10684getAlphaimpl2 = Color.m10684getAlphaimpl(jM10679convertvNxB06k);
        float f8 = 1.0f - fM10684getAlphaimpl2;
        float f9 = (fM10684getAlphaimpl * f8) + fM10684getAlphaimpl2;
        float fM10688getRedimpl = Color.m10688getRedimpl(jM10679convertvNxB06k);
        float fM10688getRedimpl2 = Color.m10688getRedimpl(j8);
        float f10 = 0.0f;
        if (f9 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((fM10688getRedimpl2 * fM10684getAlphaimpl) * f8) + (fM10688getRedimpl * fM10684getAlphaimpl2)) / f9;
        }
        float fM10687getGreenimpl = Color.m10687getGreenimpl(jM10679convertvNxB06k);
        float fM10687getGreenimpl2 = Color.m10687getGreenimpl(j8);
        if (f9 == 0.0f) {
            f7 = 0.0f;
        } else {
            f7 = (((fM10687getGreenimpl2 * fM10684getAlphaimpl) * f8) + (fM10687getGreenimpl * fM10684getAlphaimpl2)) / f9;
        }
        float fM10685getBlueimpl = Color.m10685getBlueimpl(jM10679convertvNxB06k);
        float fM10685getBlueimpl2 = Color.m10685getBlueimpl(j8);
        if (f9 != 0.0f) {
            f10 = (((fM10685getBlueimpl2 * fM10684getAlphaimpl) * f8) + (fM10685getBlueimpl * fM10684getAlphaimpl2)) / f9;
        }
        return UncheckedColor(f, f7, f10, f9, Color.m10686getColorSpaceimpl(j8));
    }

    @Size(4)
    /* renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m10728getComponents8_81llA(long j7) {
        return new float[]{Color.m10688getRedimpl(j7), Color.m10687getGreenimpl(j7), Color.m10685getBlueimpl(j7), Color.m10684getAlphaimpl(j7)};
    }

    @PublishedApi
    public static /* synthetic */ void getUnspecifiedColor$annotations() {
    }

    /* renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m10729isSpecified8_81llA(long j7) {
        return j7 != 16;
    }

    @Stable
    /* renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m10730isSpecified8_81llA$annotations(long j7) {
    }

    /* renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m10731isUnspecified8_81llA(long j7) {
        return j7 == 16;
    }

    @Stable
    /* renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m10732isUnspecified8_81llA$annotations(long j7) {
    }

    @Stable
    /* renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m10733lerpjxsXWHM(long j7, long j8, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float f) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long jM10679convertvNxB06k = Color.m10679convertvNxB06k(j7, oklab);
        long jM10679convertvNxB06k2 = Color.m10679convertvNxB06k(j8, oklab);
        float fM10684getAlphaimpl = Color.m10684getAlphaimpl(jM10679convertvNxB06k);
        float fM10688getRedimpl = Color.m10688getRedimpl(jM10679convertvNxB06k);
        float fM10687getGreenimpl = Color.m10687getGreenimpl(jM10679convertvNxB06k);
        float fM10685getBlueimpl = Color.m10685getBlueimpl(jM10679convertvNxB06k);
        float fM10684getAlphaimpl2 = Color.m10684getAlphaimpl(jM10679convertvNxB06k2);
        float fM10688getRedimpl2 = Color.m10688getRedimpl(jM10679convertvNxB06k2);
        float fM10687getGreenimpl2 = Color.m10687getGreenimpl(jM10679convertvNxB06k2);
        float fM10685getBlueimpl2 = Color.m10685getBlueimpl(jM10679convertvNxB06k2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return Color.m10679convertvNxB06k(UncheckedColor(MathHelpersKt.lerp(fM10688getRedimpl, fM10688getRedimpl2, f), MathHelpersKt.lerp(fM10687getGreenimpl, fM10687getGreenimpl2, f), MathHelpersKt.lerp(fM10685getBlueimpl, fM10685getBlueimpl2, f), MathHelpersKt.lerp(fM10684getAlphaimpl, fM10684getAlphaimpl2, f), oklab), Color.m10686getColorSpaceimpl(j8));
    }

    @Stable
    /* renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m10734luminance8_81llA(long j7) {
        ColorSpace colorSpaceM10686getColorSpaceimpl = Color.m10686getColorSpaceimpl(j7);
        if (!ColorModel.m11089equalsimpl0(colorSpaceM10686getColorSpaceimpl.getModel(), ColorModel.INSTANCE.m11096getRgbxdoWZVw())) {
            InlineClassHelperKt.throwIllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m11092toStringimpl(colorSpaceM10686getColorSpaceimpl.getModel())));
        }
        DoubleFunction eotfFunc = ((Rgb) colorSpaceM10686getColorSpaceimpl).getEotfFunc();
        double dInvoke = eotfFunc.invoke(Color.m10688getRedimpl(j7));
        float fInvoke = (float) ((eotfFunc.invoke(Color.m10685getBlueimpl(j7)) * 0.0722d) + (eotfFunc.invoke(Color.m10687getGreenimpl(j7)) * 0.7152d) + (dInvoke * 0.2126d));
        if (fInvoke < 0.0f) {
            fInvoke = 0.0f;
        }
        if (fInvoke > 1.0f) {
            return 1.0f;
        }
        return fInvoke;
    }

    /* renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m10735takeOrElseDxMtmZc(long j7, @NotNull InterfaceC6469a interfaceC6469a) {
        return j7 != 16 ? j7 : ((Color) interfaceC6469a.invoke()).m10692unboximpl();
    }

    @Stable
    @ColorInt
    /* renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m10736toArgb8_81llA(long j7) {
        return (int) (Color.m10679convertvNxB06k(j7, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    public static /* synthetic */ long Color$default(int i, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i10 = 255;
        }
        return Color(i, i8, i9, i10);
    }

    @Stable
    public static final long Color(@ColorInt int i) {
        return Color.m10678constructorimpl(i << 32);
    }

    @Stable
    public static final long Color(long j7) {
        return Color.m10678constructorimpl(j7 << 32);
    }

    @Stable
    public static final long Color(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m247to = ScatterMapKt.Sentinel) int i, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m247to = ScatterMapKt.Sentinel) int i8, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m247to = ScatterMapKt.Sentinel) int i9, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, m247to = ScatterMapKt.Sentinel) int i10) {
        return Color(((i & 255) << 16) | ((i10 & 255) << 24) | ((i8 & 255) << 8) | (i9 & 255));
    }
}
