package androidx.compose.p014ui.graphics.colorspace;

import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.util.MathHelpersKt;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class Oklab extends ColorSpace {
    public static final Companion Companion = new Companion(null);
    private static final float[] InverseM1;
    private static final float[] InverseM2;

    /* renamed from: M1 */
    private static final float[] f1154M1;

    /* renamed from: M2 */
    private static final float[] f1155M2;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    static {
        float[] transform$ui_graphics_release = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
        Illuminant illuminant = Illuminant.INSTANCE;
        float[] fArrMul3x3 = ColorSpaceKt.mul3x3(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release, illuminant.getD50().toXyz$ui_graphics_release(), illuminant.getD65().toXyz$ui_graphics_release()));
        f1154M1 = fArrMul3x3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f1155M2 = fArr;
        InverseM1 = ColorSpaceKt.inverse3x3(fArrMul3x3);
        InverseM2 = ColorSpaceKt.inverse3x3(fArr);
    }

    public Oklab(String str, int i10) {
        super(str, ColorModel.Companion.m31291getLabxdoWZVw(), i10, null);
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        ColorSpaceKt.mul3x3Float3(f1154M1, fArr);
        fArr[0] = MathHelpersKt.fastCbrt(fArr[0]);
        fArr[1] = MathHelpersKt.fastCbrt(fArr[1]);
        fArr[2] = MathHelpersKt.fastCbrt(fArr[2]);
        ColorSpaceKt.mul3x3Float3(f1155M2, fArr);
        return fArr;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i10) {
        return i10 == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i10) {
        return i10 == 0 ? 0.0f : -0.5f;
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
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = InverseM2;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f13);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f13);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f13);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float f19 = f16 * f16 * f16;
        float[] fArr2 = InverseM1;
        return (Float.floatToRawIntBits(((fArr2[0] * f17) + (fArr2[3] * f18)) + (fArr2[6] * f19)) << 32) | (Float.floatToRawIntBits((fArr2[1] * f17) + (fArr2[4] * f18) + (fArr2[7] * f19)) & 4294967295L);
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        float f10 = fArr[0];
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        fArr[0] = f10;
        float f11 = fArr[1];
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -0.5f ? f12 : -0.5f;
        fArr[2] = f13 <= 0.5f ? f13 : 0.5f;
        ColorSpaceKt.mul3x3Float3(InverseM2, fArr);
        float f14 = fArr[0];
        fArr[0] = f14 * f14 * f14;
        float f15 = fArr[1];
        fArr[1] = f15 * f15 * f15;
        float f16 = fArr[2];
        fArr[2] = f16 * f16 * f16;
        ColorSpaceKt.mul3x3Float3(InverseM1, fArr);
        return fArr;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f10, float f11, float f12) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f11 < -0.5f) {
            f11 = -0.5f;
        }
        if (f11 > 0.5f) {
            f11 = 0.5f;
        }
        if (f12 < -0.5f) {
            f12 = -0.5f;
        }
        float f13 = f12 <= 0.5f ? f12 : 0.5f;
        float[] fArr = InverseM2;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f13);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f13);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f13);
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        float[] fArr2 = InverseM1;
        return (fArr2[2] * f17) + (fArr2[5] * f18) + (fArr2[8] * f16 * f16 * f16);
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo31295xyzaToColorJlNiLsg$ui_graphics_release(float f10, float f11, float f12, float f13, ColorSpace colorSpace) {
        float[] fArr = f1154M1;
        float f14 = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12);
        float f15 = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12);
        float f16 = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
        float fFastCbrt = MathHelpersKt.fastCbrt(f14);
        float fFastCbrt2 = MathHelpersKt.fastCbrt(f15);
        float fFastCbrt3 = MathHelpersKt.fastCbrt(f16);
        float[] fArr2 = f1155M2;
        return ColorKt.Color((fArr2[0] * fFastCbrt) + (fArr2[3] * fFastCbrt2) + (fArr2[6] * fFastCbrt3), (fArr2[1] * fFastCbrt) + (fArr2[4] * fFastCbrt2) + (fArr2[7] * fFastCbrt3), (fArr2[2] * fFastCbrt) + (fArr2[5] * fFastCbrt2) + (fArr2[8] * fFastCbrt3), f13, colorSpace);
    }
}
