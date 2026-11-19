package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0013J \u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0002\u0010\u001aR\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001b"}, m13413d2 = {"Landroidx/compose/animation/core/MonoSpline;", "", "time", "", "y", "", "periodicBias", "", "([F[[FF)V", "slopeTemp", "tangents", "[[F", "timePoints", "values", "getPos", "", "v", "Landroidx/compose/animation/core/AnimationVector;", "index", "", "t", "j", "getSlope", "makeFloatArray", "a", "b", "(II)[[F", "animation-core_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMonoSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonoSpline.kt\nandroidx/compose/animation/core/MonoSpline\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,303:1\n65#2,10:304\n65#2,10:314\n*S KotlinDebug\n*F\n+ 1 MonoSpline.kt\nandroidx/compose/animation/core/MonoSpline\n*L\n176#1:304,10\n244#1:314,10\n*E\n"})
/* loaded from: classes.dex */
public final class MonoSpline {
    public static final int $stable = 8;
    private final float[] slopeTemp;
    private final float[][] tangents;
    private final float[] timePoints;
    private final float[][] values;

    public MonoSpline(float[] fArr, float[][] fArr2, float f10) {
        int i9;
        int length = fArr.length;
        int i10 = 0;
        int length2 = fArr2[0].length;
        this.slopeTemp = new float[length2];
        int i11 = length - 1;
        float[][] fArrMakeFloatArray = makeFloatArray(i11, length2);
        float[][] fArrMakeFloatArray2 = makeFloatArray(length, length2);
        for (int i12 = 0; i12 < length2; i12++) {
            int i13 = 0;
            while (i13 < i11) {
                int i14 = i13 + 1;
                float f11 = fArr[i14] - fArr[i13];
                float[] fArr3 = fArrMakeFloatArray[i13];
                float f12 = (fArr2[i14][i12] - fArr2[i13][i12]) / f11;
                fArr3[i12] = f12;
                if (i13 == 0) {
                    fArrMakeFloatArray2[i13][i12] = f12;
                } else {
                    fArrMakeFloatArray2[i13][i12] = (fArrMakeFloatArray[i13 - 1][i12] + f12) * 0.5f;
                }
                i13 = i14;
            }
            fArrMakeFloatArray2[i11][i12] = fArrMakeFloatArray[length - 2][i12];
        }
        if (!Float.isNaN(f10)) {
            for (int i15 = 0; i15 < length2; i15++) {
                float[] fArr4 = fArrMakeFloatArray[length - 2];
                float f13 = fArr4[i15] * (1 - f10);
                float[] fArr5 = fArrMakeFloatArray[0];
                float f14 = f13 + (fArr5[i15] * f10);
                fArr5[i15] = f14;
                fArr4[i15] = f14;
                fArrMakeFloatArray2[i11][i15] = f14;
                fArrMakeFloatArray2[0][i15] = f14;
            }
        }
        int i16 = 0;
        while (i16 < i11) {
            int i17 = i10;
            while (i17 < length2) {
                float f15 = fArrMakeFloatArray[i16][i17];
                if (f15 == 0.0f) {
                    fArrMakeFloatArray2[i16][i17] = 0.0f;
                    fArrMakeFloatArray2[i16 + 1][i17] = 0.0f;
                    i9 = length2;
                } else {
                    float f16 = fArrMakeFloatArray2[i16][i17] / f15;
                    int i18 = i16 + 1;
                    float f17 = fArrMakeFloatArray2[i18][i17] / f15;
                    i9 = length2;
                    float fHypot = (float) Math.hypot(f16, f17);
                    if (fHypot > 9.0d) {
                        float f18 = 3.0f / fHypot;
                        float[] fArr6 = fArrMakeFloatArray2[i16];
                        float[] fArr7 = fArrMakeFloatArray[i16];
                        fArr6[i17] = f16 * f18 * fArr7[i17];
                        fArrMakeFloatArray2[i18][i17] = f18 * f17 * fArr7[i17];
                    }
                }
                i17++;
                length2 = i9;
            }
            i16++;
            i10 = 0;
        }
        this.timePoints = fArr;
        this.values = fArr2;
        this.tangents = fArrMakeFloatArray2;
    }

    public static /* synthetic */ void getPos$default(MonoSpline monoSpline, float f10, AnimationVector animationVector, int i9, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            i9 = 0;
        }
        monoSpline.getPos(f10, animationVector, i9);
    }

    private final void getSlope(float time, float[] v9) {
        int length = this.values[0].length;
        float[] fArr = this.timePoints;
        int length2 = fArr.length;
        float f10 = fArr[0];
        int i9 = length2 - 1;
        float f11 = fArr[i9];
        if (time < f10) {
            time = f10;
        }
        if (time <= f11) {
            f11 = time;
        }
        if (v9.length < length) {
            return;
        }
        int i10 = 0;
        while (i10 < i9) {
            float[] fArr2 = this.timePoints;
            int i11 = i10 + 1;
            float f12 = fArr2[i11];
            if (f11 <= f12) {
                float f13 = fArr2[i10];
                float f14 = f12 - f13;
                float f15 = (f11 - f13) / f14;
                for (int i12 = 0; i12 < length; i12++) {
                    float[][] fArr3 = this.values;
                    float f16 = fArr3[i10][i12];
                    float f17 = fArr3[i11][i12];
                    float[][] fArr4 = this.tangents;
                    v9[i12] = MonoSplineKt.hermiteDifferential(f14, f15, f16, f17, fArr4[i10][i12], fArr4[i11][i12]) / f14;
                }
                return;
            }
            i10 = i11;
        }
    }

    public static /* synthetic */ void getSlope$default(MonoSpline monoSpline, float f10, AnimationVector animationVector, int i9, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            i9 = 0;
        }
        monoSpline.getSlope(f10, animationVector, i9);
    }

    private final float[][] makeFloatArray(int a10, int b10) {
        float[][] fArr = new float[a10][];
        for (int i9 = 0; i9 < a10; i9++) {
            fArr[i9] = new float[b10];
        }
        return fArr;
    }

    public final float getPos(float t9, int j9) {
        int i9;
        float[][] fArr = this.values;
        float[][] fArr2 = this.tangents;
        float[] fArr3 = this.timePoints;
        int length = fArr3.length;
        int i10 = 0;
        if (t9 <= fArr3[0]) {
            i9 = 0;
        } else {
            i9 = length - 1;
            if (t9 < fArr3[i9]) {
                i9 = -1;
            }
        }
        if (i9 != -1) {
            float f10 = fArr[i9][j9];
            float f11 = fArr3[i9];
            return f10 + ((t9 - f11) * getSlope(f11, j9));
        }
        int i11 = length - 1;
        while (i10 < i11) {
            float[] fArr4 = this.timePoints;
            float f12 = fArr4[i10];
            if (t9 == f12) {
                return fArr[i10][j9];
            }
            int i12 = i10 + 1;
            float f13 = fArr4[i12];
            if (t9 < f13) {
                float f14 = f13 - f12;
                return MonoSplineKt.hermiteInterpolate(f14, (t9 - f12) / f14, fArr[i10][j9], fArr[i12][j9], fArr2[i10][j9], fArr2[i12][j9]);
            }
            i10 = i12;
        }
        return 0.0f;
    }

    public final void getSlope(float time, AnimationVector v9, int index) {
        int i9;
        float[] fArr = this.timePoints;
        float[][] fArr2 = this.values;
        float[][] fArr3 = this.tangents;
        int length = fArr.length;
        int i10 = 0;
        int length2 = fArr2[0].length;
        if (time <= fArr[0]) {
            i9 = 0;
        } else {
            i9 = length - 1;
            if (time < fArr[i9]) {
                i9 = -1;
            }
        }
        if (i9 != -1) {
            float[] fArr4 = fArr3[i9];
            if (fArr4.length < length2) {
                return;
            }
            while (i10 < length2) {
                v9.set$animation_core_release(i10, fArr4[i10]);
                i10++;
            }
            return;
        }
        int i11 = length - 1;
        int i12 = index;
        while (i12 < i11) {
            int i13 = i12 + 1;
            float f10 = fArr[i13];
            if (time <= f10) {
                float f11 = fArr[i12];
                float f12 = f10 - f11;
                float f13 = (time - f11) / f12;
                while (i10 < length2) {
                    v9.set$animation_core_release(i10, MonoSplineKt.hermiteDifferential(f12, f13, fArr2[i12][i10], fArr2[i13][i10], fArr3[i12][i10], fArr3[i13][i10]) / f12);
                    i10++;
                }
                return;
            }
            i12 = i13;
        }
    }

    public final void getPos(float time, AnimationVector v9, int index) {
        int i9;
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i10 = 0;
        int length2 = this.values[0].length;
        if (time <= fArr[0]) {
            i9 = 0;
        } else {
            i9 = length - 1;
            if (time < fArr[i9]) {
                i9 = -1;
            }
        }
        if (i9 != -1) {
            getSlope(fArr[i9], this.slopeTemp);
            while (i10 < length2) {
                v9.set$animation_core_release(i10, this.values[i9][i10] + ((time - this.timePoints[i9]) * this.slopeTemp[i10]));
                i10++;
            }
            return;
        }
        int i11 = length - 1;
        int i12 = index;
        while (i12 < i11) {
            float[] fArr2 = this.timePoints;
            float f10 = fArr2[i12];
            if (time == f10) {
                while (i10 < length2) {
                    v9.set$animation_core_release(i10, this.values[i12][i10]);
                    i10++;
                }
                return;
            }
            int i13 = i12 + 1;
            float f11 = fArr2[i13];
            if (time < f11) {
                float f12 = f11 - f10;
                float f13 = (time - f10) / f12;
                while (i10 < length2) {
                    float[][] fArr3 = this.values;
                    float f14 = fArr3[i12][i10];
                    float f15 = fArr3[i13][i10];
                    float[][] fArr4 = this.tangents;
                    v9.set$animation_core_release(i10, MonoSplineKt.hermiteInterpolate(f12, f13, f14, f15, fArr4[i12][i10], fArr4[i13][i10]));
                    i10++;
                }
                return;
            }
            i12 = i13;
        }
    }

    private final float getSlope(float time, int j9) {
        float[] fArr = this.timePoints;
        float[][] fArr2 = this.values;
        float[][] fArr3 = this.tangents;
        int length = fArr.length;
        int i9 = 0;
        float f10 = fArr[0];
        int i10 = length - 1;
        float f11 = fArr[i10];
        if (time < f10) {
            time = f10;
        }
        if (time <= f11) {
            f11 = time;
        }
        while (i9 < i10) {
            int i11 = i9 + 1;
            float f12 = fArr[i11];
            if (f11 <= f12) {
                float f13 = fArr2[i9][j9];
                float f14 = fArr2[i11][j9];
                float f15 = fArr3[i9][j9];
                float f16 = fArr3[i11][j9];
                float f17 = fArr[i9];
                float f18 = f12 - f17;
                return MonoSplineKt.hermiteDifferential(f18, (f11 - f17) / f18, f13, f14, f15, f16) / f18;
            }
            i9 = i11;
        }
        return 0.0f;
    }
}
