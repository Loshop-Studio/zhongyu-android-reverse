package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MonoSpline {
    public static final int $stable = 8;
    private final float[] slopeTemp;
    private final float[][] tangents;
    private final float[] timePoints;
    private final float[][] values;

    public MonoSpline(float[] fArr, float[][] fArr2, float f10) {
        int i10;
        int length = fArr.length;
        int i11 = 0;
        int length2 = fArr2[0].length;
        this.slopeTemp = new float[length2];
        int i12 = length - 1;
        float[][] fArrMakeFloatArray = makeFloatArray(i12, length2);
        float[][] fArrMakeFloatArray2 = makeFloatArray(length, length2);
        for (int i13 = 0; i13 < length2; i13++) {
            int i14 = 0;
            while (i14 < i12) {
                int i15 = i14 + 1;
                float f11 = fArr[i15] - fArr[i14];
                float[] fArr3 = fArrMakeFloatArray[i14];
                float f12 = (fArr2[i15][i13] - fArr2[i14][i13]) / f11;
                fArr3[i13] = f12;
                if (i14 == 0) {
                    fArrMakeFloatArray2[i14][i13] = f12;
                } else {
                    fArrMakeFloatArray2[i14][i13] = (fArrMakeFloatArray[i14 - 1][i13] + f12) * 0.5f;
                }
                i14 = i15;
            }
            fArrMakeFloatArray2[i12][i13] = fArrMakeFloatArray[length - 2][i13];
        }
        if (!Float.isNaN(f10)) {
            for (int i16 = 0; i16 < length2; i16++) {
                float[] fArr4 = fArrMakeFloatArray[length - 2];
                float f13 = fArr4[i16] * (1 - f10);
                float[] fArr5 = fArrMakeFloatArray[0];
                float f14 = f13 + (fArr5[i16] * f10);
                fArr5[i16] = f14;
                fArr4[i16] = f14;
                fArrMakeFloatArray2[i12][i16] = f14;
                fArrMakeFloatArray2[0][i16] = f14;
            }
        }
        int i17 = 0;
        while (i17 < i12) {
            int i18 = i11;
            while (i18 < length2) {
                float f15 = fArrMakeFloatArray[i17][i18];
                if (f15 == 0.0f) {
                    fArrMakeFloatArray2[i17][i18] = 0.0f;
                    fArrMakeFloatArray2[i17 + 1][i18] = 0.0f;
                    i10 = length2;
                } else {
                    float f16 = fArrMakeFloatArray2[i17][i18] / f15;
                    int i19 = i17 + 1;
                    float f17 = fArrMakeFloatArray2[i19][i18] / f15;
                    i10 = length2;
                    float fHypot = (float) Math.hypot(f16, f17);
                    if (fHypot > 9.0d) {
                        float f18 = 3.0f / fHypot;
                        float[] fArr6 = fArrMakeFloatArray2[i17];
                        float[] fArr7 = fArrMakeFloatArray[i17];
                        fArr6[i18] = f16 * f18 * fArr7[i18];
                        fArrMakeFloatArray2[i19][i18] = f18 * f17 * fArr7[i18];
                    }
                }
                i18++;
                length2 = i10;
            }
            i17++;
            i11 = 0;
        }
        this.timePoints = fArr;
        this.values = fArr2;
        this.tangents = fArrMakeFloatArray2;
    }

    public static /* synthetic */ void getPos$default(MonoSpline monoSpline, float f10, AnimationVector animationVector, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        monoSpline.getPos(f10, animationVector, i10);
    }

    private final void getSlope(float f10, float[] fArr) {
        int length = this.values[0].length;
        float[] fArr2 = this.timePoints;
        int length2 = fArr2.length;
        float f11 = fArr2[0];
        int i10 = length2 - 1;
        float f12 = fArr2[i10];
        if (f10 < f11) {
            f10 = f11;
        }
        if (f10 <= f12) {
            f12 = f10;
        }
        if (fArr.length < length) {
            return;
        }
        int i11 = 0;
        while (i11 < i10) {
            float[] fArr3 = this.timePoints;
            int i12 = i11 + 1;
            float f13 = fArr3[i12];
            if (f12 <= f13) {
                float f14 = fArr3[i11];
                float f15 = f13 - f14;
                float f16 = (f12 - f14) / f15;
                for (int i13 = 0; i13 < length; i13++) {
                    float[][] fArr4 = this.values;
                    float f17 = fArr4[i11][i13];
                    float f18 = fArr4[i12][i13];
                    float[][] fArr5 = this.tangents;
                    fArr[i13] = MonoSplineKt.hermiteDifferential(f15, f16, f17, f18, fArr5[i11][i13], fArr5[i12][i13]) / f15;
                }
                return;
            }
            i11 = i12;
        }
    }

    public static /* synthetic */ void getSlope$default(MonoSpline monoSpline, float f10, AnimationVector animationVector, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        monoSpline.getSlope(f10, animationVector, i10);
    }

    private final float[][] makeFloatArray(int i10, int i11) {
        float[][] fArr = new float[i10][];
        for (int i12 = 0; i12 < i10; i12++) {
            fArr[i12] = new float[i11];
        }
        return fArr;
    }

    public final float getPos(float f10, int i10) {
        int i11;
        float[][] fArr = this.values;
        float[][] fArr2 = this.tangents;
        float[] fArr3 = this.timePoints;
        int length = fArr3.length;
        int i12 = 0;
        if (f10 <= fArr3[0]) {
            i11 = 0;
        } else {
            i11 = length - 1;
            if (f10 < fArr3[i11]) {
                i11 = -1;
            }
        }
        if (i11 != -1) {
            float f11 = fArr[i11][i10];
            float f12 = fArr3[i11];
            return f11 + ((f10 - f12) * getSlope(f12, i10));
        }
        int i13 = length - 1;
        while (i12 < i13) {
            float[] fArr4 = this.timePoints;
            float f13 = fArr4[i12];
            if (f10 == f13) {
                return fArr[i12][i10];
            }
            int i14 = i12 + 1;
            float f14 = fArr4[i14];
            if (f10 < f14) {
                float f15 = f14 - f13;
                return MonoSplineKt.hermiteInterpolate(f15, (f10 - f13) / f15, fArr[i12][i10], fArr[i14][i10], fArr2[i12][i10], fArr2[i14][i10]);
            }
            i12 = i14;
        }
        return 0.0f;
    }

    public final void getSlope(float f10, AnimationVector animationVector, int i10) {
        int i11;
        float[] fArr = this.timePoints;
        float[][] fArr2 = this.values;
        float[][] fArr3 = this.tangents;
        int length = fArr.length;
        int i12 = 0;
        int length2 = fArr2[0].length;
        if (f10 <= fArr[0]) {
            i11 = 0;
        } else {
            i11 = length - 1;
            if (f10 < fArr[i11]) {
                i11 = -1;
            }
        }
        if (i11 != -1) {
            float[] fArr4 = fArr3[i11];
            if (fArr4.length < length2) {
                return;
            }
            while (i12 < length2) {
                animationVector.set$animation_core_release(i12, fArr4[i12]);
                i12++;
            }
            return;
        }
        int i13 = length - 1;
        int i14 = i10;
        while (i14 < i13) {
            int i15 = i14 + 1;
            float f11 = fArr[i15];
            if (f10 <= f11) {
                float f12 = fArr[i14];
                float f13 = f11 - f12;
                float f14 = (f10 - f12) / f13;
                while (i12 < length2) {
                    animationVector.set$animation_core_release(i12, MonoSplineKt.hermiteDifferential(f13, f14, fArr2[i14][i12], fArr2[i15][i12], fArr3[i14][i12], fArr3[i15][i12]) / f13);
                    i12++;
                }
                return;
            }
            i14 = i15;
        }
    }

    public final void getPos(float f10, AnimationVector animationVector, int i10) {
        int i11;
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i12 = 0;
        int length2 = this.values[0].length;
        if (f10 <= fArr[0]) {
            i11 = 0;
        } else {
            i11 = length - 1;
            if (f10 < fArr[i11]) {
                i11 = -1;
            }
        }
        if (i11 != -1) {
            getSlope(fArr[i11], this.slopeTemp);
            while (i12 < length2) {
                animationVector.set$animation_core_release(i12, this.values[i11][i12] + ((f10 - this.timePoints[i11]) * this.slopeTemp[i12]));
                i12++;
            }
            return;
        }
        int i13 = length - 1;
        int i14 = i10;
        while (i14 < i13) {
            float[] fArr2 = this.timePoints;
            float f11 = fArr2[i14];
            if (f10 == f11) {
                while (i12 < length2) {
                    animationVector.set$animation_core_release(i12, this.values[i14][i12]);
                    i12++;
                }
                return;
            }
            int i15 = i14 + 1;
            float f12 = fArr2[i15];
            if (f10 < f12) {
                float f13 = f12 - f11;
                float f14 = (f10 - f11) / f13;
                while (i12 < length2) {
                    float[][] fArr3 = this.values;
                    float f15 = fArr3[i14][i12];
                    float f16 = fArr3[i15][i12];
                    float[][] fArr4 = this.tangents;
                    animationVector.set$animation_core_release(i12, MonoSplineKt.hermiteInterpolate(f13, f14, f15, f16, fArr4[i14][i12], fArr4[i15][i12]));
                    i12++;
                }
                return;
            }
            i14 = i15;
        }
    }

    private final float getSlope(float f10, int i10) {
        float[] fArr = this.timePoints;
        float[][] fArr2 = this.values;
        float[][] fArr3 = this.tangents;
        int length = fArr.length;
        int i11 = 0;
        float f11 = fArr[0];
        int i12 = length - 1;
        float f12 = fArr[i12];
        if (f10 < f11) {
            f10 = f11;
        }
        if (f10 <= f12) {
            f12 = f10;
        }
        while (i11 < i12) {
            int i13 = i11 + 1;
            float f13 = fArr[i13];
            if (f12 <= f13) {
                float f14 = fArr2[i11][i10];
                float f15 = fArr2[i13][i10];
                float f16 = fArr3[i11][i10];
                float f17 = fArr3[i13][i10];
                float f18 = fArr[i11];
                float f19 = f13 - f18;
                return MonoSplineKt.hermiteDifferential(f19, (f12 - f18) / f19, f14, f15, f16, f17) / f19;
            }
            i11 = i13;
        }
        return 0.0f;
    }
}
