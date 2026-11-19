package androidx.compose.p009ui.graphics.colorspace;

import androidx.autofill.HintConstants;
import androidx.compose.p009ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0010¢\u0006\u0002\b\u0019J=\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, m7880d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", HintConstants.AUTOFILL_HINT_NAME, "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", "v", "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,133:1\n65#2,10:134\n65#2,10:144\n65#2,10:154\n65#2,10:164\n65#2,10:174\n65#2,10:187\n65#2,10:197\n65#2,10:207\n65#2,10:217\n65#2,10:227\n65#2,10:237\n65#2,10:247\n65#2,10:257\n53#3,3:184\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n39#1:134,10\n40#1:144,10\n41#1:154,10\n58#1:164,10\n59#1:174,10\n70#1:187,10\n71#1:197,10\n98#1:207,10\n99#1:217,10\n100#1:227,10\n119#1:237,10\n120#1:247,10\n121#1:257,10\n66#1:184,3\n*E\n"})
/* loaded from: classes2.dex */
public final class Lab extends ColorSpace {

    /* renamed from: A */
    private static final float f184A = 0.008856452f;

    /* renamed from: B */
    private static final float f185B = 7.787037f;

    /* renamed from: C */
    private static final float f186C = 0.13793103f;

    /* renamed from: D */
    private static final float f187D = 0.20689656f;

    public Lab(String str, int i6) {
        super(str, ColorModel.INSTANCE.m14312getLabxdoWZVw(), i6, null);
    }

    @Override // androidx.compose.p009ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] v6) {
        float f6 = v6[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f7 = f6 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f8 = v6[1] / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f9 = v6[2] / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fCbrt = f7 > f184A ? (float) Math.cbrt(f7) : (f7 * f185B) + f186C;
        float fCbrt2 = f8 > f184A ? (float) Math.cbrt(f8) : (f8 * f185B) + f186C;
        float fCbrt3 = f9 > f184A ? (float) Math.cbrt(f9) : (f9 * f185B) + f186C;
        float f10 = (116.0f * fCbrt2) - 16.0f;
        float f11 = (fCbrt - fCbrt2) * 500.0f;
        float f12 = (fCbrt2 - fCbrt3) * 200.0f;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        v6[0] = f10;
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        v6[1] = f11;
        if (f12 < -128.0f) {
            f12 = -128.0f;
        }
        v6[2] = f12 <= 128.0f ? f12 : 128.0f;
        return v6;
    }

    @Override // androidx.compose.p009ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return component == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.p009ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return component == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.p009ui.graphics.colorspace.ColorSpace
    /* renamed from: isWideGamut */
    public boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.p009ui.graphics.colorspace.ColorSpace
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
        float f6 = (v02 + 16.0f) / 116.0f;
        float f7 = (v12 * 0.002f) + f6;
        float f8 = f7 > f187D ? f7 * f7 * f7 : (f7 - f186C) * 0.12841855f;
        float f9 = f6 > f187D ? f6 * f6 * f6 : (f6 - f186C) * 0.12841855f;
        float f10 = f8 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        return (Float.floatToRawIntBits(f9 * r5.getD50Xyz$ui_graphics_release()[1]) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    @Override // androidx.compose.p009ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] v6) {
        float f6 = v6[0];
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 100.0f) {
            f6 = 100.0f;
        }
        v6[0] = f6;
        float f7 = v6[1];
        if (f7 < -128.0f) {
            f7 = -128.0f;
        }
        if (f7 > 128.0f) {
            f7 = 128.0f;
        }
        v6[1] = f7;
        float f8 = v6[2];
        float f9 = f8 >= -128.0f ? f8 : -128.0f;
        float f10 = f9 <= 128.0f ? f9 : 128.0f;
        v6[2] = f10;
        float f11 = (f6 + 16.0f) / 116.0f;
        float f12 = (f7 * 0.002f) + f11;
        float f13 = f11 - (f10 * 0.005f);
        float f14 = f12 > f187D ? f12 * f12 * f12 : (f12 - f186C) * 0.12841855f;
        float f15 = f11 > f187D ? f11 * f11 * f11 : (f11 - f186C) * 0.12841855f;
        float f16 = f13 > f187D ? f13 * f13 * f13 : (f13 - f186C) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        v6[0] = f14 * illuminant.getD50Xyz$ui_graphics_release()[0];
        v6[1] = f15 * illuminant.getD50Xyz$ui_graphics_release()[1];
        v6[2] = f16 * illuminant.getD50Xyz$ui_graphics_release()[2];
        return v6;
    }

    @Override // androidx.compose.p009ui.graphics.colorspace.ColorSpace
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
        float f6 = ((v02 + 16.0f) / 116.0f) - (v22 * 0.005f);
        return (f6 > f187D ? f6 * f6 * f6 : 0.12841855f * (f6 - f186C)) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
    }

    @Override // androidx.compose.p009ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo14316xyzaToColorJlNiLsg$ui_graphics_release(float x6, float y6, float z6, float a7, ColorSpace colorSpace) {
        Illuminant illuminant = Illuminant.INSTANCE;
        float f6 = x6 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f7 = y6 / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f8 = z6 / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fCbrt = f6 > f184A ? (float) Math.cbrt(f6) : (f6 * f185B) + f186C;
        float fCbrt2 = f7 > f184A ? (float) Math.cbrt(f7) : (f7 * f185B) + f186C;
        float f9 = (116.0f * fCbrt2) - 16.0f;
        float f10 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f8 > f184A ? (float) Math.cbrt(f8) : (f8 * f185B) + f186C)) * 200.0f;
        if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        if (f9 > 100.0f) {
            f9 = 100.0f;
        }
        if (f10 < -128.0f) {
            f10 = -128.0f;
        }
        if (f10 > 128.0f) {
            f10 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return ColorKt.Color(f9, f10, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, a7, colorSpace);
    }
}
