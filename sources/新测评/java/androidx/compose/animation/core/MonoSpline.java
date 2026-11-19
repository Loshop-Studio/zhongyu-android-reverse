package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0013J \u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0002\u0010\u001aR\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001b"}, m13558d2 = {"Landroidx/compose/animation/core/MonoSpline;", "", "time", "", "y", "", "periodicBias", "", "([F[[FF)V", "slopeTemp", "tangents", "[[F", "timePoints", "values", "getPos", "", "v", "Landroidx/compose/animation/core/AnimationVector;", "index", "", "t", "j", "getSlope", "makeFloatArray", "a", "b", "(II)[[F", "animation-core_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nMonoSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonoSpline.kt\nandroidx/compose/animation/core/MonoSpline\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,303:1\n65#2,10:304\n65#2,10:314\n*S KotlinDebug\n*F\n+ 1 MonoSpline.kt\nandroidx/compose/animation/core/MonoSpline\n*L\n176#1:304,10\n244#1:314,10\n*E\n"})
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

    private final void getSlope(float time, float[] v9) {
        int length = this.values[0].length;
        float[] fArr = this.timePoints;
        int length2 = fArr.length;
        float f10 = fArr[0];
        int i10 = length2 - 1;
        float f11 = fArr[i10];
        if (time < f10) {
            time = f10;
        }
        if (time <= f11) {
            f11 = time;
        }
        if (v9.length < length) {
            return;
        }
        int i11 = 0;
        while (i11 < i10) {
            float[] fArr2 = this.timePoints;
            int i12 = i11 + 1;
            float f12 = fArr2[i12];
            if (f11 <= f12) {
                float f13 = fArr2[i11];
                float f14 = f12 - f13;
                float f15 = (f11 - f13) / f14;
                for (int i13 = 0; i13 < length; i13++) {
                    float[][] fArr3 = this.values;
                    float f16 = fArr3[i11][i13];
                    float f17 = fArr3[i12][i13];
                    float[][] fArr4 = this.tangents;
                    v9[i13] = MonoSplineKt.hermiteDifferential(f14, f15, f16, f17, fArr4[i11][i13], fArr4[i12][i13]) / f14;
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

    private final float[][] makeFloatArray(int a10, int b10) {
        float[][] fArr = new float[a10][];
        for (int i10 = 0; i10 < a10; i10++) {
            fArr[i10] = new float[b10];
        }
        return fArr;
    }

    public final float getPos(float t10, int j10) {
        int i10;
        float[][] fArr = this.values;
        float[][] fArr2 = this.tangents;
        float[] fArr3 = this.timePoints;
        int length = fArr3.length;
        int i11 = 0;
        if (t10 <= fArr3[0]) {
            i10 = 0;
        } else {
            i10 = length - 1;
            if (t10 < fArr3[i10]) {
                i10 = -1;
            }
        }
        if (i10 != -1) {
            float f10 = fArr[i10][j10];
            float f11 = fArr3[i10];
            return f10 + ((t10 - f11) * getSlope(f11, j10));
        }
        int i12 = length - 1;
        while (i11 < i12) {
            float[] fArr4 = this.timePoints;
            float f12 = fArr4[i11];
            if (t10 == f12) {
                return fArr[i11][j10];
            }
            int i13 = i11 + 1;
            float f13 = fArr4[i13];
            if (t10 < f13) {
                float f14 = f13 - f12;
                return MonoSplineKt.hermiteInterpolate(f14, (t10 - f12) / f14, fArr[i11][j10], fArr[i13][j10], fArr2[i11][j10], fArr2[i13][j10]);
            }
            i11 = i13;
        }
        return 0.0f;
    }

    public final void getSlope(float time, AnimationVector v9, int index) {
        int i10;
        float[] fArr = this.timePoints;
        float[][] fArr2 = this.values;
        float[][] fArr3 = this.tangents;
        int length = fArr.length;
        int i11 = 0;
        int length2 = fArr2[0].length;
        if (time <= fArr[0]) {
            i10 = 0;
        } else {
            i10 = length - 1;
            if (time < fArr[i10]) {
                i10 = -1;
            }
        }
        if (i10 != -1) {
            float[] fArr4 = fArr3[i10];
            if (fArr4.length < length2) {
                return;
            }
            while (i11 < length2) {
                v9.set$animation_core_release(i11, fArr4[i11]);
                i11++;
            }
            return;
        }
        int i12 = length - 1;
        int i13 = index;
        while (i13 < i12) {
            int i14 = i13 + 1;
            float f10 = fArr[i14];
            if (time <= f10) {
                float f11 = fArr[i13];
                float f12 = f10 - f11;
                float f13 = (time - f11) / f12;
                while (i11 < length2) {
                    v9.set$animation_core_release(i11, MonoSplineKt.hermiteDifferential(f12, f13, fArr2[i13][i11], fArr2[i14][i11], fArr3[i13][i11], fArr3[i14][i11]) / f12);
                    i11++;
                }
                return;
            }
            i13 = i14;
        }
    }

    public final void getPos(float time, AnimationVector v9, int index) {
        int i10;
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i11 = 0;
        int length2 = this.values[0].length;
        if (time <= fArr[0]) {
            i10 = 0;
        } else {
            i10 = length - 1;
            if (time < fArr[i10]) {
                i10 = -1;
            }
        }
        if (i10 != -1) {
            getSlope(fArr[i10], this.slopeTemp);
            while (i11 < length2) {
                v9.set$animation_core_release(i11, this.values[i10][i11] + ((time - this.timePoints[i10]) * this.slopeTemp[i11]));
                i11++;
            }
            return;
        }
        int i12 = length - 1;
        int i13 = index;
        while (i13 < i12) {
            float[] fArr2 = this.timePoints;
            float f10 = fArr2[i13];
            if (time == f10) {
                while (i11 < length2) {
                    v9.set$animation_core_release(i11, this.values[i13][i11]);
                    i11++;
                }
                return;
            }
            int i14 = i13 + 1;
            float f11 = fArr2[i14];
            if (time < f11) {
                float f12 = f11 - f10;
                float f13 = (time - f10) / f12;
                while (i11 < length2) {
                    float[][] fArr3 = this.values;
                    float f14 = fArr3[i13][i11];
                    float f15 = fArr3[i14][i11];
                    float[][] fArr4 = this.tangents;
                    v9.set$animation_core_release(i11, MonoSplineKt.hermiteInterpolate(f12, f13, f14, f15, fArr4[i13][i11], fArr4[i14][i11]));
                    i11++;
                }
                return;
            }
            i13 = i14;
        }
    }

    private final float getSlope(float time, int j10) {
        float[] fArr = this.timePoints;
        float[][] fArr2 = this.values;
        float[][] fArr3 = this.tangents;
        int length = fArr.length;
        int i10 = 0;
        float f10 = fArr[0];
        int i11 = length - 1;
        float f11 = fArr[i11];
        if (time < f10) {
            time = f10;
        }
        if (time <= f11) {
            f11 = time;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            float f12 = fArr[i12];
            if (f11 <= f12) {
                float f13 = fArr2[i10][j10];
                float f14 = fArr2[i12][j10];
                float f15 = fArr3[i10][j10];
                float f16 = fArr3[i12][j10];
                float f17 = fArr[i10];
                float f18 = f12 - f17;
                return MonoSplineKt.hermiteDifferential(f18, (f11 - f17) / f18, f13, f14, f15, f16) / f18;
            }
            i10 = i12;
        }
        return 0.0f;
    }
}
