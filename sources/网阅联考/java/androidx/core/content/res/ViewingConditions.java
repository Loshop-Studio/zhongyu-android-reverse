package androidx.core.content.res;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
final class ViewingConditions {
    static final ViewingConditions DEFAULT = make(CamUtils.WHITE_POINT_D65, (float) ((CamUtils.yFromLStar(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float mAw;

    /* renamed from: mC */
    private final float f296mC;
    private final float mFl;
    private final float mFlRoot;

    /* renamed from: mN */
    private final float f297mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;

    /* renamed from: mZ */
    private final float f298mZ;

    private ViewingConditions(float f4, float f5, float f6, float f7, float f8, float f9, float[] fArr, float f10, float f11, float f12) {
        this.f297mN = f4;
        this.mAw = f5;
        this.mNbb = f6;
        this.mNcb = f7;
        this.f296mC = f8;
        this.mNc = f9;
        this.mRgbD = fArr;
        this.mFl = f10;
        this.mFlRoot = f11;
        this.f298mZ = f12;
    }

    @NonNull
    public static ViewingConditions make(@NonNull float[] fArr, float f4, float f5, float f6, boolean z3) {
        float[][] fArr2 = CamUtils.XYZ_TO_CAM16RGB;
        float f7 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f8 = fArr3[0] * f7;
        float f9 = fArr[1];
        float f10 = f8 + (fArr3[1] * f9);
        float f11 = fArr[2];
        float f12 = f10 + (fArr3[2] * f11);
        float[] fArr4 = fArr2[1];
        float f13 = (fArr4[0] * f7) + (fArr4[1] * f9) + (fArr4[2] * f11);
        float[] fArr5 = fArr2[2];
        float f14 = (f7 * fArr5[0]) + (f9 * fArr5[1]) + (f11 * fArr5[2]);
        float f15 = (f6 / 10.0f) + 0.8f;
        float fLerp = ((double) f15) >= 0.9d ? CamUtils.lerp(0.59f, 0.69f, (f15 - 0.9f) * 10.0f) : CamUtils.lerp(0.525f, 0.59f, (f15 - 0.8f) * 10.0f);
        float fExp = z3 ? 1.0f : (1.0f - (((float) Math.exp(((-f4) - 42.0f) / 92.0f)) * 0.2777778f)) * f15;
        double d4 = fExp;
        if (d4 > 1.0d) {
            fExp = 1.0f;
        } else if (d4 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f12) * fExp) + 1.0f) - fExp, (((100.0f / f13) * fExp) + 1.0f) - fExp, (((100.0f / f14) * fExp) + 1.0f) - fExp};
        float f16 = 1.0f / ((5.0f * f4) + 1.0f);
        float f17 = f16 * f16 * f16 * f16;
        float f18 = 1.0f - f17;
        float fCbrt = (f17 * f4) + (0.1f * f18 * f18 * ((float) Math.cbrt(f4 * 5.0d)));
        float fYFromLStar = CamUtils.yFromLStar(f5) / fArr[1];
        double d5 = fYFromLStar;
        float fSqrt = ((float) Math.sqrt(d5)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d5, 0.2d));
        float fPow2 = (float) Math.pow(((fArr6[2] * fCbrt) * f14) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * fCbrt) * f12) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * fCbrt) * f13) / 100.0d, 0.42d), fPow2};
        float f19 = fArr7[0];
        float f20 = fArr7[1];
        return new ViewingConditions(fYFromLStar, ((((f19 * 400.0f) / (f19 + 27.13f)) * 2.0f) + ((f20 * 400.0f) / (f20 + 27.13f)) + (((400.0f * fPow2) / (fPow2 + 27.13f)) * 0.05f)) * fPow, fPow, fPow, fLerp, f15, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public float getAw() {
        return this.mAw;
    }

    public float getC() {
        return this.f296mC;
    }

    public float getFl() {
        return this.mFl;
    }

    public float getFlRoot() {
        return this.mFlRoot;
    }

    public float getN() {
        return this.f297mN;
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

    @NonNull
    public float[] getRgbD() {
        return this.mRgbD;
    }

    public float getZ() {
        return this.f298mZ;
    }
}
