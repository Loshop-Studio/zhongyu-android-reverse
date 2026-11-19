package androidx.compose.p013ui.graphics.colorspace;

import androidx.autofill.HintConstants;
import androidx.compose.p013ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0019J=\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, m13558d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", HintConstants.AUTOFILL_HINT_NAME, "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", "v", "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,133:1\n65#2,10:134\n65#2,10:144\n65#2,10:154\n65#2,10:164\n65#2,10:174\n65#2,10:187\n65#2,10:197\n65#2,10:207\n65#2,10:217\n65#2,10:227\n65#2,10:237\n65#2,10:247\n65#2,10:257\n53#3,3:184\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n39#1:134,10\n40#1:144,10\n41#1:154,10\n58#1:164,10\n59#1:174,10\n70#1:187,10\n71#1:197,10\n98#1:207,10\n99#1:217,10\n100#1:227,10\n119#1:237,10\n120#1:247,10\n121#1:257,10\n66#1:184,3\n*E\n"})
/* loaded from: classes2.dex */
public final class Lab extends ColorSpace {

    /* renamed from: A */
    private static final float f1323A = 0.008856452f;

    /* renamed from: B */
    private static final float f1324B = 7.787037f;

    /* renamed from: C */
    private static final float f1325C = 0.13793103f;

    /* renamed from: D */
    private static final float f1326D = 0.20689656f;

    public Lab(String str, int i10) {
        super(str, ColorModel.INSTANCE.m21389getLabxdoWZVw(), i10, null);
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] v9) {
        float f10 = v9[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f11 = f10 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f12 = v9[1] / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f13 = v9[2] / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fCbrt = f11 > f1323A ? (float) Math.cbrt(f11) : (f11 * f1324B) + f1325C;
        float fCbrt2 = f12 > f1323A ? (float) Math.cbrt(f12) : (f12 * f1324B) + f1325C;
        float fCbrt3 = f13 > f1323A ? (float) Math.cbrt(f13) : (f13 * f1324B) + f1325C;
        float f14 = (116.0f * fCbrt2) - 16.0f;
        float f15 = (fCbrt - fCbrt2) * 500.0f;
        float f16 = (fCbrt2 - fCbrt3) * 200.0f;
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > 100.0f) {
            f14 = 100.0f;
        }
        v9[0] = f14;
        if (f15 < -128.0f) {
            f15 = -128.0f;
        }
        if (f15 > 128.0f) {
            f15 = 128.0f;
        }
        v9[1] = f15;
        if (f16 < -128.0f) {
            f16 = -128.0f;
        }
        v9[2] = f16 <= 128.0f ? f16 : 128.0f;
        return v9;
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return component == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return component == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    /* renamed from: isWideGamut */
    public boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float v02, float v12, float v22) {
        if (v02 < 0.0f) {
            v02 = 0.0f;
        }
        if (v02 > 100.0f) {
            v02 = 100.0f;
        }
        if (v12 < -128.0f) {
            v12 = -128.0f;
        }
        if (v12 > 128.0f) {
            v12 = 128.0f;
        }
        float f10 = (v02 + 16.0f) / 116.0f;
        float f11 = (v12 * 0.002f) + f10;
        float f12 = f11 > f1326D ? f11 * f11 * f11 : (f11 - f1325C) * 0.12841855f;
        float f13 = f10 > f1326D ? f10 * f10 * f10 : (f10 - f1325C) * 0.12841855f;
        float f14 = f12 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        return (Float.floatToRawIntBits(f13 * r5.getD50Xyz$ui_graphics_release()[1]) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] v9) {
        float f10 = v9[0];
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        v9[0] = f10;
        float f11 = v9[1];
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        v9[1] = f11;
        float f12 = v9[2];
        float f13 = f12 >= -128.0f ? f12 : -128.0f;
        float f14 = f13 <= 128.0f ? f13 : 128.0f;
        v9[2] = f14;
        float f15 = (f10 + 16.0f) / 116.0f;
        float f16 = (f11 * 0.002f) + f15;
        float f17 = f15 - (f14 * 0.005f);
        float f18 = f16 > f1326D ? f16 * f16 * f16 : (f16 - f1325C) * 0.12841855f;
        float f19 = f15 > f1326D ? f15 * f15 * f15 : (f15 - f1325C) * 0.12841855f;
        float f20 = f17 > f1326D ? f17 * f17 * f17 : (f17 - f1325C) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        v9[0] = f18 * illuminant.getD50Xyz$ui_graphics_release()[0];
        v9[1] = f19 * illuminant.getD50Xyz$ui_graphics_release()[1];
        v9[2] = f20 * illuminant.getD50Xyz$ui_graphics_release()[2];
        return v9;
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float v02, float v12, float v22) {
        if (v02 < 0.0f) {
            v02 = 0.0f;
        }
        if (v02 > 100.0f) {
            v02 = 100.0f;
        }
        if (v22 < -128.0f) {
            v22 = -128.0f;
        }
        if (v22 > 128.0f) {
            v22 = 128.0f;
        }
        float f10 = ((v02 + 16.0f) / 116.0f) - (v22 * 0.005f);
        return (f10 > f1326D ? f10 * f10 * f10 : 0.12841855f * (f10 - f1325C)) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo21393xyzaToColorJlNiLsg$ui_graphics_release(float x9, float y9, float z9, float a10, ColorSpace colorSpace) {
        Illuminant illuminant = Illuminant.INSTANCE;
        float f10 = x9 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f11 = y9 / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f12 = z9 / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fCbrt = f10 > f1323A ? (float) Math.cbrt(f10) : (f10 * f1324B) + f1325C;
        float fCbrt2 = f11 > f1323A ? (float) Math.cbrt(f11) : (f11 * f1324B) + f1325C;
        float f13 = (116.0f * fCbrt2) - 16.0f;
        float f14 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f12 > f1323A ? (float) Math.cbrt(f12) : (f12 * f1324B) + f1325C)) * 200.0f;
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 100.0f) {
            f13 = 100.0f;
        }
        if (f14 < -128.0f) {
            f14 = -128.0f;
        }
        if (f14 > 128.0f) {
            f14 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return ColorKt.Color(f13, f14, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, a10, colorSpace);
    }
}
