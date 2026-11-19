package androidx.core.content.res;

import androidx.camera.video.AudioStats;
import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;

/* loaded from: classes2.dex */
final class ViewingConditions {
    static final ViewingConditions DEFAULT = make(CamUtils.WHITE_POINT_D65, (float) ((CamUtils.yFromLStar(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float mAw;

    /* renamed from: mC */
    private final float f997mC;
    private final float mFl;
    private final float mFlRoot;

    /* renamed from: mN */
    private final float f998mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;

    /* renamed from: mZ */
    private final float f999mZ;

    private ViewingConditions(float f, float f7, float f8, float f9, float f10, float f11, float[] fArr, float f12, float f13, float f14) {
        this.f998mN = f;
        this.mAw = f7;
        this.mNbb = f8;
        this.mNcb = f9;
        this.f997mC = f10;
        this.mNc = f11;
        this.mRgbD = fArr;
        this.mFl = f12;
        this.mFlRoot = f13;
        this.f999mZ = f14;
    }

    public static ViewingConditions make(float[] fArr, float f, float f7, float f8, boolean z8) {
        float[][] fArr2 = CamUtils.XYZ_TO_CAM16RGB;
        float f9 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f10 = fArr3[0] * f9;
        float f11 = fArr[1];
        float f12 = (fArr3[1] * f11) + f10;
        float f13 = fArr[2];
        float f14 = (fArr3[2] * f13) + f12;
        float[] fArr4 = fArr2[1];
        float f15 = (fArr4[2] * f13) + (fArr4[1] * f11) + (fArr4[0] * f9);
        float[] fArr5 = fArr2[2];
        float f16 = (f13 * fArr5[2]) + (f11 * fArr5[1]) + (f9 * fArr5[0]);
        float f17 = (f8 / 10.0f) + 0.8f;
        float fLerp = ((double) f17) >= 0.9d ? CamUtils.lerp(0.59f, 0.69f, (f17 - 0.9f) * 10.0f) : CamUtils.lerp(0.525f, 0.59f, (f17 - 0.8f) * 10.0f);
        float fM1061y = z8 ? 1.0f : AbstractC1923c.m1061y((float) Math.exp(((-f) - 42.0f) / 92.0f), 0.2777778f, 1.0f, f17);
        double d9 = fM1061y;
        if (d9 > 1.0d) {
            fM1061y = 1.0f;
        } else if (d9 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            fM1061y = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f14) * fM1061y) + 1.0f) - fM1061y, (((100.0f / f15) * fM1061y) + 1.0f) - fM1061y, (((100.0f / f16) * fM1061y) + 1.0f) - fM1061y};
        float f18 = 1.0f / ((5.0f * f) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float fCbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(f * 5.0d))) + (f19 * f);
        float fYFromLStar = CamUtils.yFromLStar(f7) / fArr[1];
        double d10 = fYFromLStar;
        float fSqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * fCbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * fCbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * fCbrt) * f16) / 100.0d, 0.42d)};
        float f21 = fArr7[0];
        float f22 = (f21 * 400.0f) / (f21 + 27.13f);
        float f23 = fArr7[1];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr7[2];
        float[] fArr8 = {f22, f24, (400.0f * f25) / (f25 + 27.13f)};
        return new ViewingConditions(fYFromLStar, AbstractC0584a.m925z(fArr8[2], 0.05f, (fArr8[0] * 2.0f) + fArr8[1], fPow), fPow, fPow, fLerp, f17, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public float getAw() {
        return this.mAw;
    }

    public float getC() {
        return this.f997mC;
    }

    public float getFl() {
        return this.mFl;
    }

    public float getFlRoot() {
        return this.mFlRoot;
    }

    public float getN() {
        return this.f998mN;
    }

    public float getNbb() {
        return this.mNbb;
    }

    public float getNc() {
        return this.mNc;
    }

    public float getNcb() {
        return this.mNcb;
    }

    public float[] getRgbD() {
        return this.mRgbD;
    }

    public float getZ() {
        return this.f999mZ;
    }
}
