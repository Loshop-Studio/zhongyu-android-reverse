package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0013J \u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0002\u0010\u001aR\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001b"}, m7880d2 = {"Landroidx/compose/animation/core/MonoSpline;", "", "time", "", "y", "", "periodicBias", "", "([F[[FF)V", "slopeTemp", "tangents", "[[F", "timePoints", "values", "getPos", "", "v", "Landroidx/compose/animation/core/AnimationVector;", "index", "", "t", "j", "getSlope", "makeFloatArray", "a", "b", "(II)[[F", "animation-core_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nMonoSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonoSpline.kt\nandroidx/compose/animation/core/MonoSpline\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,303:1\n65#2,10:304\n65#2,10:314\n*S KotlinDebug\n*F\n+ 1 MonoSpline.kt\nandroidx/compose/animation/core/MonoSpline\n*L\n176#1:304,10\n244#1:314,10\n*E\n"})
/* loaded from: classes.dex */
public final class MonoSpline {
    public static final int $stable = 8;
    private final float[] slopeTemp;
    private final float[][] tangents;
    private final float[] timePoints;
    private final float[][] values;

    public MonoSpline(float[] fArr, float[][] fArr2, float f6) {
        int i6;
        int length = fArr.length;
        int i7 = 0;
        int length2 = fArr2[0].length;
        this.slopeTemp = new float[length2];
        int i8 = length - 1;
        float[][] fArrMakeFloatArray = makeFloatArray(i8, length2);
        float[][] fArrMakeFloatArray2 = makeFloatArray(length, length2);
        for (int i9 = 0; i9 < length2; i9++) {
            int i10 = 0;
            while (i10 < i8) {
                int i11 = i10 + 1;
                float f7 = fArr[i11] - fArr[i10];
                float[] fArr3 = fArrMakeFloatArray[i10];
                float f8 = (fArr2[i11][i9] - fArr2[i10][i9]) / f7;
                fArr3[i9] = f8;
                if (i10 == 0) {
                    fArrMakeFloatArray2[i10][i9] = f8;
                } else {
                    fArrMakeFloatArray2[i10][i9] = (fArrMakeFloatArray[i10 - 1][i9] + f8) * 0.5f;
                }
                i10 = i11;
            }
            fArrMakeFloatArray2[i8][i9] = fArrMakeFloatArray[length - 2][i9];
        }
        if (!Float.isNaN(f6)) {
            for (int i12 = 0; i12 < length2; i12++) {
                float[] fArr4 = fArrMakeFloatArray[length - 2];
                float f9 = fArr4[i12] * (1 - f6);
                float[] fArr5 = fArrMakeFloatArray[0];
                float f10 = f9 + (fArr5[i12] * f6);
                fArr5[i12] = f10;
                fArr4[i12] = f10;
                fArrMakeFloatArray2[i8][i12] = f10;
                fArrMakeFloatArray2[0][i12] = f10;
            }
        }
        int i13 = 0;
        while (i13 < i8) {
            int i14 = i7;
            while (i14 < length2) {
                float f11 = fArrMakeFloatArray[i13][i14];
                if (f11 == 0.0f) {
                    fArrMakeFloatArray2[i13][i14] = 0.0f;
                    fArrMakeFloatArray2[i13 + 1][i14] = 0.0f;
                    i6 = length2;
                } else {
                    float f12 = fArrMakeFloatArray2[i13][i14] / f11;
                    int i15 = i13 + 1;
                    float f13 = fArrMakeFloatArray2[i15][i14] / f11;
                    i6 = length2;
                    float fHypot = (float) Math.hypot(f12, f13);
                    if (fHypot > 9.0d) {
                        float f14 = 3.0f / fHypot;
                        float[] fArr6 = fArrMakeFloatArray2[i13];
                        float[] fArr7 = fArrMakeFloatArray[i13];
                        fArr6[i14] = f12 * f14 * fArr7[i14];
                        fArrMakeFloatArray2[i15][i14] = f14 * f13 * fArr7[i14];
                    }
                }
                i14++;
                length2 = i6;
            }
            i13++;
            i7 = 0;
        }
        this.timePoints = fArr;
        this.values = fArr2;
        this.tangents = fArrMakeFloatArray2;
    }

    public static /* synthetic */ void getPos$default(MonoSpline monoSpline, float f6, AnimationVector animationVector, int i6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            i6 = 0;
        }
        monoSpline.getPos(f6, animationVector, i6);
    }

    private final void getSlope(float time, float[] v6) {
        int length = this.values[0].length;
        float[] fArr = this.timePoints;
        int length2 = fArr.length;
        float f6 = fArr[0];
        int i6 = length2 - 1;
        float f7 = fArr[i6];
        if (time < f6) {
            time = f6;
        }
        if (time <= f7) {
            f7 = time;
        }
        if (v6.length < length) {
            return;
        }
        int i7 = 0;
        while (i7 < i6) {
            float[] fArr2 = this.timePoints;
            int i8 = i7 + 1;
            float f8 = fArr2[i8];
            if (f7 <= f8) {
                float f9 = fArr2[i7];
                float f10 = f8 - f9;
                float f11 = (f7 - f9) / f10;
                for (int i9 = 0; i9 < length; i9++) {
                    float[][] fArr3 = this.values;
                    float f12 = fArr3[i7][i9];
                    float f13 = fArr3[i8][i9];
                    float[][] fArr4 = this.tangents;
                    v6[i9] = MonoSplineKt.hermiteDifferential(f10, f11, f12, f13, fArr4[i7][i9], fArr4[i8][i9]) / f10;
                }
                return;
            }
            i7 = i8;
        }
    }

    public static /* synthetic */ void getSlope$default(MonoSpline monoSpline, float f6, AnimationVector animationVector, int i6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            i6 = 0;
        }
        monoSpline.getSlope(f6, animationVector, i6);
    }

    private final float[][] makeFloatArray(int a7, int b7) {
        float[][] fArr = new float[a7][];
        for (int i6 = 0; i6 < a7; i6++) {
            fArr[i6] = new float[b7];
        }
        return fArr;
    }

    public final float getPos(float t6, int j6) {
        int i6;
        float[][] fArr = this.values;
        float[][] fArr2 = this.tangents;
        float[] fArr3 = this.timePoints;
        int length = fArr3.length;
        int i7 = 0;
        if (t6 <= fArr3[0]) {
            i6 = 0;
        } else {
            i6 = length - 1;
            if (t6 < fArr3[i6]) {
                i6 = -1;
            }
        }
        if (i6 != -1) {
            float f6 = fArr[i6][j6];
            float f7 = fArr3[i6];
            return f6 + ((t6 - f7) * getSlope(f7, j6));
        }
        int i8 = length - 1;
        while (i7 < i8) {
            float[] fArr4 = this.timePoints;
            float f8 = fArr4[i7];
            if (t6 == f8) {
                return fArr[i7][j6];
            }
            int i9 = i7 + 1;
            float f9 = fArr4[i9];
            if (t6 < f9) {
                float f10 = f9 - f8;
                return MonoSplineKt.hermiteInterpolate(f10, (t6 - f8) / f10, fArr[i7][j6], fArr[i9][j6], fArr2[i7][j6], fArr2[i9][j6]);
            }
            i7 = i9;
        }
        return 0.0f;
    }

    public final void getSlope(float time, AnimationVector v6, int index) {
        int i6;
        float[] fArr = this.timePoints;
        float[][] fArr2 = this.values;
        float[][] fArr3 = this.tangents;
        int length = fArr.length;
        int i7 = 0;
        int length2 = fArr2[0].length;
        if (time <= fArr[0]) {
            i6 = 0;
        } else {
            i6 = length - 1;
            if (time < fArr[i6]) {
                i6 = -1;
            }
        }
        if (i6 != -1) {
            float[] fArr4 = fArr3[i6];
            if (fArr4.length < length2) {
                return;
            }
            while (i7 < length2) {
                v6.set$animation_core_release(i7, fArr4[i7]);
                i7++;
            }
            return;
        }
        int i8 = length - 1;
        int i9 = index;
        while (i9 < i8) {
            int i10 = i9 + 1;
            float f6 = fArr[i10];
            if (time <= f6) {
                float f7 = fArr[i9];
                float f8 = f6 - f7;
                float f9 = (time - f7) / f8;
                while (i7 < length2) {
                    v6.set$animation_core_release(i7, MonoSplineKt.hermiteDifferential(f8, f9, fArr2[i9][i7], fArr2[i10][i7], fArr3[i9][i7], fArr3[i10][i7]) / f8);
                    i7++;
                }
                return;
            }
            i9 = i10;
        }
    }

    public final void getPos(float time, AnimationVector v6, int index) {
        int i6;
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i7 = 0;
        int length2 = this.values[0].length;
        if (time <= fArr[0]) {
            i6 = 0;
        } else {
            i6 = length - 1;
            if (time < fArr[i6]) {
                i6 = -1;
            }
        }
        if (i6 != -1) {
            getSlope(fArr[i6], this.slopeTemp);
            while (i7 < length2) {
                v6.set$animation_core_release(i7, this.values[i6][i7] + ((time - this.timePoints[i6]) * this.slopeTemp[i7]));
                i7++;
            }
            return;
        }
        int i8 = length - 1;
        int i9 = index;
        while (i9 < i8) {
            float[] fArr2 = this.timePoints;
            float f6 = fArr2[i9];
            if (time == f6) {
                while (i7 < length2) {
                    v6.set$animation_core_release(i7, this.values[i9][i7]);
                    i7++;
                }
                return;
            }
            int i10 = i9 + 1;
            float f7 = fArr2[i10];
            if (time < f7) {
                float f8 = f7 - f6;
                float f9 = (time - f6) / f8;
                while (i7 < length2) {
                    float[][] fArr3 = this.values;
                    float f10 = fArr3[i9][i7];
                    float f11 = fArr3[i10][i7];
                    float[][] fArr4 = this.tangents;
                    v6.set$animation_core_release(i7, MonoSplineKt.hermiteInterpolate(f8, f9, f10, f11, fArr4[i9][i7], fArr4[i10][i7]));
                    i7++;
                }
                return;
            }
            i9 = i10;
        }
    }

    private final float getSlope(float time, int j6) {
        float[] fArr = this.timePoints;
        float[][] fArr2 = this.values;
        float[][] fArr3 = this.tangents;
        int length = fArr.length;
        int i6 = 0;
        float f6 = fArr[0];
        int i7 = length - 1;
        float f7 = fArr[i7];
        if (time < f6) {
            time = f6;
        }
        if (time <= f7) {
            f7 = time;
        }
        while (i6 < i7) {
            int i8 = i6 + 1;
            float f8 = fArr[i8];
            if (f7 <= f8) {
                float f9 = fArr2[i6][j6];
                float f10 = fArr2[i8][j6];
                float f11 = fArr3[i6][j6];
                float f12 = fArr3[i8][j6];
                float f13 = fArr[i6];
                float f14 = f8 - f13;
                return MonoSplineKt.hermiteDifferential(f14, (f7 - f13) / f14, f9, f10, f11, f12) / f14;
            }
            i6 = i8;
        }
        return 0.0f;
    }
}
