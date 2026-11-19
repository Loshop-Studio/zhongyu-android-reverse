package androidx.compose.p014ui.graphics.colorspace;

import androidx.compose.p014ui.graphics.ColorKt;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class Lab extends ColorSpace {

    /* renamed from: A */
    private static final float f1150A = 0.008856452f;

    /* renamed from: B */
    private static final float f1151B = 7.787037f;

    /* renamed from: C */
    private static final float f1152C = 0.13793103f;
    public static final Companion Companion = new Companion(null);

    /* renamed from: D */
    private static final float f1153D = 0.20689656f;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public Lab(String str, int i10) {
        super(str, ColorModel.Companion.m31291getLabxdoWZVw(), i10, null);
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        float f10 = fArr[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f11 = f10 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f12 = fArr[1] / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f13 = fArr[2] / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fCbrt = f11 > f1150A ? (float) Math.cbrt(f11) : (f11 * f1151B) + f1152C;
        float fCbrt2 = f12 > f1150A ? (float) Math.cbrt(f12) : (f12 * f1151B) + f1152C;
        float fCbrt3 = f13 > f1150A ? (float) Math.cbrt(f13) : (f13 * f1151B) + f1152C;
        float f14 = (116.0f * fCbrt2) - 16.0f;
        float f15 = (fCbrt - fCbrt2) * 500.0f;
        float f16 = (fCbrt2 - fCbrt3) * 200.0f;
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f14 > 100.0f) {
            f14 = 100.0f;
        }
        fArr[0] = f14;
        if (f15 < -128.0f) {
            f15 = -128.0f;
        }
        if (f15 > 128.0f) {
            f15 = 128.0f;
        }
        fArr[1] = f15;
        if (f16 < -128.0f) {
            f16 = -128.0f;
        }
        fArr[2] = f16 <= 128.0f ? f16 : 128.0f;
        return fArr;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i10) {
        return i10 == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i10) {
        return i10 == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        float f13 = (f10 + 16.0f) / 116.0f;
        float f14 = (f11 * 0.002f) + f13;
        float f15 = f14 > f1153D ? f14 * f14 * f14 : (f14 - f1152C) * 0.12841855f;
        float f16 = f13 > f1153D ? f13 * f13 * f13 : (f13 - f1152C) * 0.12841855f;
        float f17 = f15 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        return (Float.floatToRawIntBits(f16 * r5.getD50Xyz$ui_graphics_release()[1]) & 4294967295L) | (Float.floatToRawIntBits(f17) << 32);
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        float f10 = fArr[0];
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        fArr[0] = f10;
        float f11 = fArr[1];
        if (f11 < -128.0f) {
            f11 = -128.0f;
        }
        if (f11 > 128.0f) {
            f11 = 128.0f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -128.0f ? f12 : -128.0f;
        float f14 = f13 <= 128.0f ? f13 : 128.0f;
        fArr[2] = f14;
        float f15 = (f10 + 16.0f) / 116.0f;
        float f16 = (f11 * 0.002f) + f15;
        float f17 = f15 - (f14 * 0.005f);
        float f18 = f16 > f1153D ? f16 * f16 * f16 : (f16 - f1152C) * 0.12841855f;
        float f19 = f15 > f1153D ? f15 * f15 * f15 : (f15 - f1152C) * 0.12841855f;
        float f20 = f17 > f1153D ? f17 * f17 * f17 : (f17 - f1152C) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        fArr[0] = f18 * illuminant.getD50Xyz$ui_graphics_release()[0];
        fArr[1] = f19 * illuminant.getD50Xyz$ui_graphics_release()[1];
        fArr[2] = f20 * illuminant.getD50Xyz$ui_graphics_release()[2];
        return fArr;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 100.0f) {
            f10 = 100.0f;
        }
        if (f12 < -128.0f) {
            f12 = -128.0f;
        }
        if (f12 > 128.0f) {
            f12 = 128.0f;
        }
        float f13 = ((f10 + 16.0f) / 116.0f) - (f12 * 0.005f);
        return (f13 > f1153D ? f13 * f13 * f13 : 0.12841855f * (f13 - f1152C)) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo31295xyzaToColorJlNiLsg$ui_graphics_release(float f10, float f11, float f12, float f13, ColorSpace colorSpace) {
        Illuminant illuminant = Illuminant.INSTANCE;
        float f14 = f10 / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f15 = f11 / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f16 = f12 / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fCbrt = f14 > f1150A ? (float) Math.cbrt(f14) : (f14 * f1151B) + f1152C;
        float fCbrt2 = f15 > f1150A ? (float) Math.cbrt(f15) : (f15 * f1151B) + f1152C;
        float f17 = (116.0f * fCbrt2) - 16.0f;
        float f18 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f16 > f1150A ? (float) Math.cbrt(f16) : (f16 * f1151B) + f1152C)) * 200.0f;
        if (f17 < 0.0f) {
            f17 = 0.0f;
        }
        if (f17 > 100.0f) {
            f17 = 100.0f;
        }
        if (f18 < -128.0f) {
            f18 = -128.0f;
        }
        if (f18 > 128.0f) {
            f18 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return ColorKt.Color(f17, f18, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f13, colorSpace);
    }
}
