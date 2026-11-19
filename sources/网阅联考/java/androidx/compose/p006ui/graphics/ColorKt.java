package androidx.compose.p006ui.graphics;

import androidx.compose.p006ui.graphics.colorspace.ColorModel;
import androidx.compose.p006ui.graphics.colorspace.ColorSpace;
import androidx.compose.p006ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p006ui.graphics.colorspace.DoubleFunction;
import androidx.compose.p006ui.graphics.colorspace.Rgb;
import androidx.compose.p006ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a<\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a2\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a1\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0082\b\u001a-\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u0010\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0002\u001a!\u0010'\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u0019\u0010+\u001a\u00020,*\u00020\u0002H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u0019\u0010/\u001a\u00020\f*\u00020\u0002H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a+\u00102\u001a\u00020\u0002*\u00020\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000204H\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a\u0019\u00107\u001a\u00020\u0014*\u00020\u0002H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\"\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006:"}, m5175d2 = {"isSpecified", "", "Landroidx/compose/ui/graphics/Color;", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified-8_81llA", "(J)Z", "isUnspecified", "isUnspecified-8_81llA$annotations", "isUnspecified-8_81llA", "Color", "red", "", "green", "blue", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "color", "", "(I)J", "(IIII)J", "", "(J)J", "compositeComponent", "fgC", "bgC", "fgA", "bgA", C3335ai.f1705at, "lerp", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "saturate", C3335ai.f1662aC, "compositeOver", "background", "compositeOver--OWjLjI", "(JJ)J", "getComponents", "", "getComponents-8_81llA", "(J)[F", "luminance", "luminance-8_81llA", "(J)F", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "toArgb", "toArgb-8_81llA", "(J)I", "ui-graphics_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,659:1\n587#1:660\n587#1:661\n587#1:662\n646#1:663\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n567#1:660\n568#1:661\n569#1:662\n658#1:663\n*E\n"})
/* loaded from: classes.dex */
public final class ColorKt {
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    @androidx.compose.runtime.Stable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long Color(float r9, float r10, float r11, float r12, androidx.compose.p006ui.graphics.colorspace.ColorSpace r13) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long Color$default(float f4, float f5, float f6, float f7, ColorSpace colorSpace, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            f7 = 1.0f;
        }
        if ((i4 & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f4, f5, f6, f7, colorSpace);
    }

    private static final float compositeComponent(float f4, float f5, float f6, float f7, float f8) {
        if (f8 == 0.0f) {
            return 0.0f;
        }
        return ((f4 * f6) + ((f5 * f7) * (1.0f - f6))) / f8;
    }

    @Stable
    /* renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m9223compositeOverOWjLjI(long j4, long j5) {
        long jM9175convertvNxB06k = Color.m9175convertvNxB06k(j4, Color.m9182getColorSpaceimpl(j5));
        float fM9180getAlphaimpl = Color.m9180getAlphaimpl(j5);
        float fM9180getAlphaimpl2 = Color.m9180getAlphaimpl(jM9175convertvNxB06k);
        float f4 = 1.0f - fM9180getAlphaimpl2;
        float f5 = (fM9180getAlphaimpl * f4) + fM9180getAlphaimpl2;
        return Color((f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1)) == 0 ? 0.0f : ((Color.m9184getRedimpl(jM9175convertvNxB06k) * fM9180getAlphaimpl2) + ((Color.m9184getRedimpl(j5) * fM9180getAlphaimpl) * f4)) / f5, (f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1)) == 0 ? 0.0f : ((Color.m9183getGreenimpl(jM9175convertvNxB06k) * fM9180getAlphaimpl2) + ((Color.m9183getGreenimpl(j5) * fM9180getAlphaimpl) * f4)) / f5, f5 == 0.0f ? 0.0f : ((Color.m9181getBlueimpl(jM9175convertvNxB06k) * fM9180getAlphaimpl2) + ((Color.m9181getBlueimpl(j5) * fM9180getAlphaimpl) * f4)) / f5, f5, Color.m9182getColorSpaceimpl(j5));
    }

    /* renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m9224getComponents8_81llA(long j4) {
        return new float[]{Color.m9184getRedimpl(j4), Color.m9183getGreenimpl(j4), Color.m9181getBlueimpl(j4), Color.m9180getAlphaimpl(j4)};
    }

    /* renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m9225isSpecified8_81llA(long j4) {
        return j4 != Color.INSTANCE.m9214getUnspecified0d7_KjU();
    }

    @Stable
    /* renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m9226isSpecified8_81llA$annotations(long j4) {
    }

    /* renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m9227isUnspecified8_81llA(long j4) {
        return j4 == Color.INSTANCE.m9214getUnspecified0d7_KjU();
    }

    @Stable
    /* renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m9228isUnspecified8_81llA$annotations(long j4) {
    }

    @Stable
    /* renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m9229lerpjxsXWHM(long j4, long j5, float f4) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long jM9175convertvNxB06k = Color.m9175convertvNxB06k(j4, oklab);
        long jM9175convertvNxB06k2 = Color.m9175convertvNxB06k(j5, oklab);
        float fM9180getAlphaimpl = Color.m9180getAlphaimpl(jM9175convertvNxB06k);
        float fM9184getRedimpl = Color.m9184getRedimpl(jM9175convertvNxB06k);
        float fM9183getGreenimpl = Color.m9183getGreenimpl(jM9175convertvNxB06k);
        float fM9181getBlueimpl = Color.m9181getBlueimpl(jM9175convertvNxB06k);
        float fM9180getAlphaimpl2 = Color.m9180getAlphaimpl(jM9175convertvNxB06k2);
        float fM9184getRedimpl2 = Color.m9184getRedimpl(jM9175convertvNxB06k2);
        float fM9183getGreenimpl2 = Color.m9183getGreenimpl(jM9175convertvNxB06k2);
        float fM9181getBlueimpl2 = Color.m9181getBlueimpl(jM9175convertvNxB06k2);
        return Color.m9175convertvNxB06k(Color(MathHelpersKt.lerp(fM9184getRedimpl, fM9184getRedimpl2, f4), MathHelpersKt.lerp(fM9183getGreenimpl, fM9183getGreenimpl2, f4), MathHelpersKt.lerp(fM9181getBlueimpl, fM9181getBlueimpl2, f4), MathHelpersKt.lerp(fM9180getAlphaimpl, fM9180getAlphaimpl2, f4), oklab), Color.m9182getColorSpaceimpl(j5));
    }

    @Stable
    /* renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m9230luminance8_81llA(long j4) {
        ColorSpace colorSpaceM9182getColorSpaceimpl = Color.m9182getColorSpaceimpl(j4);
        if (!ColorModel.m9555equalsimpl0(colorSpaceM9182getColorSpaceimpl.getModel(), ColorModel.INSTANCE.m9562getRgbxdoWZVw())) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m9558toStringimpl(colorSpaceM9182getColorSpaceimpl.getModel()))).toString());
        }
        Intrinsics.checkNotNull(colorSpaceM9182getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction eotfFunc$ui_graphics_release = ((Rgb) colorSpaceM9182getColorSpaceimpl).getEotfFunc();
        return saturate((float) ((eotfFunc$ui_graphics_release.invoke(Color.m9184getRedimpl(j4)) * 0.2126d) + (eotfFunc$ui_graphics_release.invoke(Color.m9183getGreenimpl(j4)) * 0.7152d) + (eotfFunc$ui_graphics_release.invoke(Color.m9181getBlueimpl(j4)) * 0.0722d)));
    }

    private static final float saturate(float f4) {
        float f5 = 0.0f;
        if (f4 > 0.0f) {
            f5 = 1.0f;
            if (f4 < 1.0f) {
                return f4;
            }
        }
        return f5;
    }

    /* renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m9231takeOrElseDxMtmZc(long j4, Function0<Color> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return (j4 > Color.INSTANCE.m9214getUnspecified0d7_KjU() ? 1 : (j4 == Color.INSTANCE.m9214getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j4 : block.invoke().m9188unboximpl();
    }

    @Stable
    /* renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m9232toArgb8_81llA(long j4) {
        return (int) ULong.m11962constructorimpl(Color.m9175convertvNxB06k(j4, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    public static /* synthetic */ long Color$default(int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            i7 = 255;
        }
        return Color(i4, i5, i6, i7);
    }

    @Stable
    public static final long Color(int i4) {
        return Color.m9174constructorimpl(ULong.m11962constructorimpl(ULong.m11962constructorimpl(i4) << 32));
    }

    @Stable
    public static final long Color(long j4) {
        return Color.m9174constructorimpl(ULong.m11962constructorimpl(ULong.m11962constructorimpl(ULong.m11962constructorimpl(j4) & 4294967295L) << 32));
    }

    @Stable
    public static final long Color(int i4, int i5, int i6, int i7) {
        return Color(((i4 & 255) << 16) | ((i7 & 255) << 24) | ((i5 & 255) << 8) | (i6 & 255));
    }
}
