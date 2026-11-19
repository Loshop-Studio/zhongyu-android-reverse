package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0014J'\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0019J'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b¨\u0006 "}, m5110d2 = {"Landroidx/compose/animation/core/MonoSpline;", "", "", "time", "", "y", "", "periodicBias", "<init>", "([F[[FF)V", "", "a", "b", "makeFloatArray", "(II)[[F", "v", "Ld6/s;", "getSlope", "(F[F)V", "j", "(FI)F", "t", "getPos", "Landroidx/compose/animation/core/AnimationVector;", "index", "(FLandroidx/compose/animation/core/AnimationVector;I)V", "timePoints", "[F", "values", "[[F", "tangents", "slopeTemp", "animation-core_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMonoSpline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonoSpline.kt\nandroidx/compose/animation/core/MonoSpline\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,303:1\n65#2,10:304\n65#2,10:314\n*S KotlinDebug\n*F\n+ 1 MonoSpline.kt\nandroidx/compose/animation/core/MonoSpline\n*L\n176#1:304,10\n244#1:314,10\n*E\n"})
/* loaded from: classes.dex */
public final class MonoSpline {
    public static final int $stable = 8;

    @NotNull
    private final float[] slopeTemp;

    @NotNull
    private final float[][] tangents;

    @NotNull
    private final float[] timePoints;

    @NotNull
    private final float[][] values;

    public MonoSpline(@NotNull float[] fArr, @NotNull float[][] fArr2, float f) {
        int i;
        int length = fArr.length;
        int i8 = 0;
        int length2 = fArr2[0].length;
        this.slopeTemp = new float[length2];
        int i9 = length - 1;
        float[][] fArrMakeFloatArray = makeFloatArray(i9, length2);
        float[][] fArrMakeFloatArray2 = makeFloatArray(length, length2);
        for (int i10 = 0; i10 < length2; i10++) {
            int i11 = 0;
            while (i11 < i9) {
                int i12 = i11 + 1;
                float f7 = fArr[i12] - fArr[i11];
                float[] fArr3 = fArrMakeFloatArray[i11];
                float f8 = (fArr2[i12][i10] - fArr2[i11][i10]) / f7;
                fArr3[i10] = f8;
                if (i11 == 0) {
                    fArrMakeFloatArray2[i11][i10] = f8;
                } else {
                    fArrMakeFloatArray2[i11][i10] = (fArrMakeFloatArray[i11 - 1][i10] + f8) * 0.5f;
                }
                i11 = i12;
            }
            fArrMakeFloatArray2[i9][i10] = fArrMakeFloatArray[length - 2][i10];
        }
        if (!Float.isNaN(f)) {
            for (int i13 = 0; i13 < length2; i13++) {
                float[] fArr4 = fArrMakeFloatArray[length - 2];
                float f9 = (1 - f) * fArr4[i13];
                float[] fArr5 = fArrMakeFloatArray[0];
                float f10 = (fArr5[i13] * f) + f9;
                fArr5[i13] = f10;
                fArr4[i13] = f10;
                fArrMakeFloatArray2[i9][i13] = f10;
                fArrMakeFloatArray2[0][i13] = f10;
            }
        }
        int i14 = 0;
        while (i14 < i9) {
            int i15 = i8;
            while (i15 < length2) {
                float f11 = fArrMakeFloatArray[i14][i15];
                if (f11 == 0.0f) {
                    fArrMakeFloatArray2[i14][i15] = 0.0f;
                    fArrMakeFloatArray2[i14 + 1][i15] = 0.0f;
                    i = length2;
                } else {
                    float f12 = fArrMakeFloatArray2[i14][i15] / f11;
                    int i16 = i14 + 1;
                    float f13 = fArrMakeFloatArray2[i16][i15] / f11;
                    i = length2;
                    float fHypot = (float) Math.hypot(f12, f13);
                    if (fHypot > 9.0d) {
                        float f14 = 3.0f / fHypot;
                        float[] fArr6 = fArrMakeFloatArray2[i14];
                        float[] fArr7 = fArrMakeFloatArray[i14];
                        fArr6[i15] = f12 * f14 * fArr7[i15];
                        fArrMakeFloatArray2[i16][i15] = f14 * f13 * fArr7[i15];
                    }
                }
                i15++;
                length2 = i;
            }
            i14++;
            i8 = 0;
        }
        this.timePoints = fArr;
        this.values = fArr2;
        this.tangents = fArrMakeFloatArray2;
    }

    public static /* synthetic */ void getPos$default(MonoSpline monoSpline, float f, AnimationVector animationVector, int i, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            i = 0;
        }
        monoSpline.getPos(f, animationVector, i);
    }

    private final void getSlope(float time, float[] v2) {
        int length = this.values[0].length;
        float[] fArr = this.timePoints;
        int length2 = fArr.length;
        float f = fArr[0];
        int i = length2 - 1;
        float f7 = fArr[i];
        if (time < f) {
            time = f;
        }
        if (time <= f7) {
            f7 = time;
        }
        if (v2.length < length) {
            return;
        }
        int i8 = 0;
        while (i8 < i) {
            float[] fArr2 = this.timePoints;
            int i9 = i8 + 1;
            float f8 = fArr2[i9];
            if (f7 <= f8) {
                float f9 = fArr2[i8];
                float f10 = f8 - f9;
                float f11 = (f7 - f9) / f10;
                for (int i10 = 0; i10 < length; i10++) {
                    float[][] fArr3 = this.values;
                    float f12 = fArr3[i8][i10];
                    float f13 = fArr3[i9][i10];
                    float[][] fArr4 = this.tangents;
                    v2[i10] = MonoSplineKt.hermiteDifferential(f10, f11, f12, f13, fArr4[i8][i10], fArr4[i9][i10]) / f10;
                }
                return;
            }
            i8 = i9;
        }
    }

    public static /* synthetic */ void getSlope$default(MonoSpline monoSpline, float f, AnimationVector animationVector, int i, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            i = 0;
        }
        monoSpline.getSlope(f, animationVector, i);
    }

    private final float[][] makeFloatArray(int a9, int b6) {
        float[][] fArr = new float[a9][];
        for (int i = 0; i < a9; i++) {
            fArr[i] = new float[b6];
        }
        return fArr;
    }

    public final float getPos(float t8, int j7) {
        int i;
        float[][] fArr = this.values;
        float[][] fArr2 = this.tangents;
        float[] fArr3 = this.timePoints;
        int length = fArr3.length;
        int i8 = 0;
        if (t8 <= fArr3[0]) {
            i = 0;
        } else {
            i = length - 1;
            if (t8 < fArr3[i]) {
                i = -1;
            }
        }
        if (i != -1) {
            float f = fArr[i][j7];
            float f7 = fArr3[i];
            return ((t8 - f7) * getSlope(f7, j7)) + f;
        }
        int i9 = length - 1;
        while (i8 < i9) {
            float[] fArr4 = this.timePoints;
            float f8 = fArr4[i8];
            if (t8 == f8) {
                return fArr[i8][j7];
            }
            int i10 = i8 + 1;
            float f9 = fArr4[i10];
            if (t8 < f9) {
                float f10 = f9 - f8;
                return MonoSplineKt.hermiteInterpolate(f10, (t8 - f8) / f10, fArr[i8][j7], fArr[i10][j7], fArr2[i8][j7], fArr2[i10][j7]);
            }
            i8 = i10;
        }
        return 0.0f;
    }

    public final void getSlope(float time, @NotNull AnimationVector v2, int index) {
        int i;
        float[] fArr = this.timePoints;
        float[][] fArr2 = this.values;
        float[][] fArr3 = this.tangents;
        int length = fArr.length;
        int i8 = 0;
        int length2 = fArr2[0].length;
        if (time <= fArr[0]) {
            i = 0;
        } else {
            i = length - 1;
            if (time < fArr[i]) {
                i = -1;
            }
        }
        if (i != -1) {
            float[] fArr4 = fArr3[i];
            if (fArr4.length < length2) {
                return;
            }
            while (i8 < length2) {
                v2.set$animation_core_release(i8, fArr4[i8]);
                i8++;
            }
            return;
        }
        int i9 = length - 1;
        int i10 = index;
        while (i10 < i9) {
            int i11 = i10 + 1;
            float f = fArr[i11];
            if (time <= f) {
                float f7 = fArr[i10];
                float f8 = f - f7;
                float f9 = (time - f7) / f8;
                while (i8 < length2) {
                    v2.set$animation_core_release(i8, MonoSplineKt.hermiteDifferential(f8, f9, fArr2[i10][i8], fArr2[i11][i8], fArr3[i10][i8], fArr3[i11][i8]) / f8);
                    i8++;
                }
                return;
            }
            i10 = i11;
        }
    }

    public final void getPos(float time, @NotNull AnimationVector v2, int index) {
        int i;
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i8 = 0;
        int length2 = this.values[0].length;
        if (time <= fArr[0]) {
            i = 0;
        } else {
            i = length - 1;
            if (time < fArr[i]) {
                i = -1;
            }
        }
        if (i != -1) {
            getSlope(fArr[i], this.slopeTemp);
            while (i8 < length2) {
                v2.set$animation_core_release(i8, ((time - this.timePoints[i]) * this.slopeTemp[i8]) + this.values[i][i8]);
                i8++;
            }
            return;
        }
        int i9 = length - 1;
        int i10 = index;
        while (i10 < i9) {
            float[] fArr2 = this.timePoints;
            float f = fArr2[i10];
            if (time == f) {
                while (i8 < length2) {
                    v2.set$animation_core_release(i8, this.values[i10][i8]);
                    i8++;
                }
                return;
            }
            int i11 = i10 + 1;
            float f7 = fArr2[i11];
            if (time < f7) {
                float f8 = f7 - f;
                float f9 = (time - f) / f8;
                while (i8 < length2) {
                    float[][] fArr3 = this.values;
                    float f10 = fArr3[i10][i8];
                    float f11 = fArr3[i11][i8];
                    float[][] fArr4 = this.tangents;
                    v2.set$animation_core_release(i8, MonoSplineKt.hermiteInterpolate(f8, f9, f10, f11, fArr4[i10][i8], fArr4[i11][i8]));
                    i8++;
                }
                return;
            }
            i10 = i11;
        }
    }

    private final float getSlope(float time, int j7) {
        float[] fArr = this.timePoints;
        float[][] fArr2 = this.values;
        float[][] fArr3 = this.tangents;
        int length = fArr.length;
        int i = 0;
        float f = fArr[0];
        int i8 = length - 1;
        float f7 = fArr[i8];
        if (time < f) {
            time = f;
        }
        if (time <= f7) {
            f7 = time;
        }
        while (i < i8) {
            int i9 = i + 1;
            float f8 = fArr[i9];
            if (f7 <= f8) {
                float f9 = fArr2[i][j7];
                float f10 = fArr2[i9][j7];
                float f11 = fArr3[i][j7];
                float f12 = fArr3[i9][j7];
                float f13 = fArr[i];
                float f14 = f8 - f13;
                return MonoSplineKt.hermiteDifferential(f14, (f7 - f13) / f14, f9, f10, f11, f12) / f14;
            }
            i = i9;
        }
        return 0.0f;
    }
}
