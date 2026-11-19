package androidx.compose.p013ui.graphics;

import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;
import androidx.collection.FloatFloatPair;
import androidx.compose.p013ui.graphics.PathSegment;
import androidx.compose.p013ui.util.MathHelpersKt;
import kotlin.NoWhenBranchMatchedException;
import p134i7.AbstractC8797p;

/* loaded from: classes2.dex */
public final class BezierKt {
    private static final double Epsilon = 1.0E-7d;
    private static final float FloatEpsilon = 1.05E-6f;
    private static final double Tau = 6.283185307179586d;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PathSegment.Type.Conic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PathSegment.Type.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PathSegment.Type.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final float clampValidRootInUnitRange(float f10) {
        float f11 = f10 >= 0.0f ? f10 : 0.0f;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (Math.abs(f11 - f10) > FloatEpsilon) {
            return Float.NaN;
        }
        return f11;
    }

    public static final boolean closeTo(double d10, double d11) {
        return Math.abs(d10 - d11) < Epsilon;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final long computeCubicVerticalBounds(float f10, float f11, float f12, float f13, float[] fArr, int i10) {
        float f14 = (f11 - f10) * 3.0f;
        float f15 = (f12 - f11) * 3.0f;
        float f16 = (f13 - f12) * 3.0f;
        int iFindQuadraticRoots = findQuadraticRoots(f14, f15, f16, fArr, i10);
        float f17 = (f15 - f14) * 2.0f;
        int iWriteValidRootInUnitRange = iFindQuadraticRoots + writeValidRootInUnitRange((-f17) / (((f16 - f15) * 2.0f) - f17), fArr, i10 + iFindQuadraticRoots);
        float fMin = Math.min(f10, f13);
        float fMax = Math.max(f10, f13);
        for (int i11 = 0; i11 < iWriteValidRootInUnitRange; i11++) {
            float fEvaluateCubic = evaluateCubic(f10, f11, f12, f13, fArr[i11]);
            fMin = Math.min(fMin, fEvaluateCubic);
            fMax = Math.max(fMax, fEvaluateCubic);
        }
        return FloatFloatPair.m20111constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeCubicVerticalBounds$default(float f10, float f11, float f12, float f13, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            i10 = 0;
        }
        return computeCubicVerticalBounds(f10, f11, f12, f13, fArr, i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final long computeHorizontalBounds(PathSegment pathSegment, float[] fArr, int i10) {
        int iFindDerivativeRoots = findDerivativeRoots(pathSegment, true, fArr, i10);
        float fMin = Math.min(pathSegment.getPoints()[0], getEndX(pathSegment));
        float fMax = Math.max(pathSegment.getPoints()[0], getEndX(pathSegment));
        for (int i11 = 0; i11 < iFindDerivativeRoots; i11++) {
            float fEvaluateX = evaluateX(pathSegment, fArr[i11]);
            fMin = Math.min(fMin, fEvaluateX);
            fMax = Math.max(fMax, fEvaluateX);
        }
        return FloatFloatPair.m20111constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeHorizontalBounds$default(PathSegment pathSegment, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return computeHorizontalBounds(pathSegment, fArr, i10);
    }

    public static final long computeVerticalBounds(PathSegment pathSegment, float[] fArr, int i10) {
        int iFindDerivativeRoots = findDerivativeRoots(pathSegment, false, fArr, i10);
        float fMin = Math.min(pathSegment.getPoints()[1], getEndY(pathSegment));
        float fMax = Math.max(pathSegment.getPoints()[1], getEndY(pathSegment));
        for (int i11 = 0; i11 < iFindDerivativeRoots; i11++) {
            float fEvaluateY = evaluateY(pathSegment, fArr[i11]);
            fMin = Math.min(fMin, fEvaluateY);
            fMax = Math.max(fMax, fEvaluateY);
        }
        return FloatFloatPair.m20111constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeVerticalBounds$default(PathSegment pathSegment, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return computeVerticalBounds(pathSegment, fArr, i10);
    }

    public static final float cubicArea(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((((((((f17 - f11) * (f12 + f14)) - ((f16 - f10) * (f13 + f15))) + (f13 * (f10 - f14))) - (f12 * (f11 - f15))) + (f17 * (f14 + (f10 / 3.0f)))) - (f16 * (f15 + (f11 / 3.0f)))) * 3.0f) / 20.0f;
    }

    private static final int cubicToMonotonicCubics(float[] fArr, float[] fArr2, float[] fArr3) {
        int iFindCubicExtremaY = findCubicExtremaY(fArr, fArr3);
        int i10 = 0;
        if (iFindCubicExtremaY == 0) {
            if (fArr2.length < 8) {
                return 0;
            }
            AbstractC8797p.m14646m(fArr, fArr2, 0, 0, 8);
            return iFindCubicExtremaY;
        }
        int i11 = 0;
        float f10 = 0.0f;
        while (i10 < iFindCubicExtremaY) {
            float f11 = (fArr3[i10] - f10) / (1.0f - f10);
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            f10 = f11 > 1.0f ? 1.0f : f11;
            splitCubicAt(fArr, i11, fArr2, i11, f10);
            i11 += 6;
            i10++;
            fArr = fArr2;
        }
        return iFindCubicExtremaY;
    }

    public static final int cubicWinding(float[] fArr, float f10, float f11, float[] fArr2, float[] fArr3) {
        int iCubicToMonotonicCubics = cubicToMonotonicCubics(fArr, fArr2, fArr3);
        int iMonotonicCubicWinding = 0;
        if (iCubicToMonotonicCubics >= 0) {
            int i10 = 0;
            while (true) {
                iMonotonicCubicWinding += monotonicCubicWinding(fArr2, i10 * 6, f10, f11);
                if (i10 == iCubicToMonotonicCubics) {
                    break;
                }
                i10++;
            }
        }
        return iMonotonicCubicWinding;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float evaluateCubic(float f10, float f11, float f12) {
        return ((((((f10 - f11) + 0.33333334f) * f12) + (f11 - (2.0f * f10))) * f12) + f10) * 3.0f * f12;
    }

    private static final float evaluateLine(float f10, float f11, float f12) {
        return ((f11 - f10) * f12) + f10;
    }

    private static final float evaluateQuadratic(float f10, float f11, float f12, float f13) {
        return (((((f12 - (f11 * 2.0f)) + f10) * f13) + ((f11 - f10) * 2.0f)) * f13) + f10;
    }

    private static final float evaluateX(PathSegment pathSegment, float f10) {
        float[] points = pathSegment.getPoints();
        int i10 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        if (i10 == 1) {
            return points[0];
        }
        if (i10 == 2) {
            return evaluateLine(points[0], points[2], f10);
        }
        if (i10 == 3) {
            return evaluateQuadratic(points[0], points[2], points[4], f10);
        }
        if (i10 != 4) {
            return Float.NaN;
        }
        return evaluateCubic(points[0], points[2], points[4], points[6], f10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float evaluateY(PathSegment pathSegment, float f10) {
        float[] points = pathSegment.getPoints();
        int i10 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        if (i10 == 1) {
            return points[1];
        }
        if (i10 == 2) {
            return evaluateLine(points[1], points[3], f10);
        }
        if (i10 == 3) {
            return evaluateQuadratic(points[1], points[3], points[5], f10);
        }
        if (i10 != 4) {
            return Float.NaN;
        }
        return evaluateCubic(points[1], points[3], points[5], points[7], f10);
    }

    private static final int findCubicExtremaY(float[] fArr, float[] fArr2) {
        float f10 = fArr[1];
        float f11 = fArr[3];
        float f12 = fArr[5];
        return findQuadraticRoots((fArr[7] - f10) + ((f11 - f12) * 3.0f), (((f10 - f11) - f11) - f12) * 2.0f, f11 - f10, fArr2, 0);
    }

    private static final int findDerivativeRoots(PathSegment pathSegment, boolean z10, float[] fArr, int i10) {
        int i11 = !z10 ? 1 : 0;
        float[] points = pathSegment.getPoints();
        int i12 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
        if (i12 == 3) {
            float f10 = 2;
            float f11 = points[i11 + 2];
            float f12 = (f11 - points[i11]) * f10;
            return writeValidRootInUnitRange((-f12) / ((f10 * (points[i11 + 4] - f11)) - f12), fArr, i10);
        }
        if (i12 != 4) {
            return 0;
        }
        float f13 = points[i11 + 2];
        float f14 = (f13 - points[i11]) * 3.0f;
        float f15 = points[i11 + 4];
        float f16 = (f15 - f13) * 3.0f;
        float f17 = (points[i11 + 6] - f15) * 3.0f;
        int iFindQuadraticRoots = findQuadraticRoots(f14, f16, f17, fArr, i10);
        float f18 = (f16 - f14) * 2.0f;
        return iFindQuadraticRoots + writeValidRootInUnitRange((-f18) / (((f17 - f16) * 2.0f) - f18), fArr, i10 + iFindQuadraticRoots);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float findFirstCubicRoot(float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        double d10 = f10;
        double d11 = ((d10 - (f11 * 2.0d)) + f12) * 3.0d;
        double d12 = (f11 - f10) * 3.0d;
        double d13 = (-f10) + ((f11 - f12) * 3.0d) + f13;
        if (Math.abs(d13 - AudioStats.AUDIO_AMPLITUDE_NONE) < Epsilon) {
            if (Math.abs(d11 - AudioStats.AUDIO_AMPLITUDE_NONE) < Epsilon) {
                if (Math.abs(d12 - AudioStats.AUDIO_AMPLITUDE_NONE) < Epsilon) {
                    return Float.NaN;
                }
                float f16 = (float) ((-d10) / d12);
                f14 = f16 >= 0.0f ? f16 : 0.0f;
                f15 = f14 <= 1.0f ? f14 : 1.0f;
                if (Math.abs(f15 - f16) > FloatEpsilon) {
                    return Float.NaN;
                }
                return f15;
            }
            double dSqrt = Math.sqrt((d12 * d12) - ((4.0d * d11) * d10));
            double d14 = d11 * 2.0d;
            float f17 = (float) ((dSqrt - d12) / d14);
            float f18 = f17 < 0.0f ? 0.0f : f17;
            if (f18 > 1.0f) {
                f18 = 1.0f;
            }
            if (Math.abs(f18 - f17) > FloatEpsilon) {
                f18 = Float.NaN;
            }
            if (!Float.isNaN(f18)) {
                return f18;
            }
            float f19 = (float) (((-d12) - dSqrt) / d14);
            f14 = f19 >= 0.0f ? f19 : 0.0f;
            f15 = f14 <= 1.0f ? f14 : 1.0f;
            if (Math.abs(f15 - f19) > FloatEpsilon) {
                return Float.NaN;
            }
            return f15;
        }
        double d15 = d11 / d13;
        double d16 = d12 / d13;
        double d17 = d10 / d13;
        double d18 = ((d16 * 3.0d) - (d15 * d15)) / 9.0d;
        double d19 = (((((2.0d * d15) * d15) * d15) - ((9.0d * d15) * d16)) + (d17 * 27.0d)) / 54.0d;
        double d20 = d18 * d18 * d18;
        double d21 = (d19 * d19) + d20;
        double d22 = d15 / 3.0d;
        if (d21 >= AudioStats.AUDIO_AMPLITUDE_NONE) {
            if (d21 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                double dSqrt2 = Math.sqrt(d21);
                float fFastCbrt = (float) ((MathHelpersKt.fastCbrt((float) ((-d19) + dSqrt2)) - MathHelpersKt.fastCbrt((float) (d19 + dSqrt2))) - d22);
                f14 = fFastCbrt >= 0.0f ? fFastCbrt : 0.0f;
                f15 = f14 <= 1.0f ? f14 : 1.0f;
                if (Math.abs(f15 - fFastCbrt) > FloatEpsilon) {
                    return Float.NaN;
                }
                return f15;
            }
            float f20 = -MathHelpersKt.fastCbrt((float) d19);
            float f21 = (float) d22;
            float f22 = (2.0f * f20) - f21;
            float f23 = f22 < 0.0f ? 0.0f : f22;
            if (f23 > 1.0f) {
                f23 = 1.0f;
            }
            if (Math.abs(f23 - f22) > FloatEpsilon) {
                f23 = Float.NaN;
            }
            if (!Float.isNaN(f23)) {
                return f23;
            }
            float f24 = (-f20) - f21;
            f14 = f24 >= 0.0f ? f24 : 0.0f;
            f15 = f14 <= 1.0f ? f14 : 1.0f;
            if (Math.abs(f15 - f24) > FloatEpsilon) {
                return Float.NaN;
            }
            return f15;
        }
        double dSqrt3 = Math.sqrt(-d20);
        double d23 = (-d19) / dSqrt3;
        if (d23 < -1.0d) {
            d23 = -1.0d;
        }
        if (d23 > 1.0d) {
            d23 = 1.0d;
        }
        double dAcos = Math.acos(d23);
        double dFastCbrt = MathHelpersKt.fastCbrt((float) dSqrt3) * 2.0f;
        float fCos = (float) ((Math.cos(dAcos / 3.0d) * dFastCbrt) - d22);
        float f25 = fCos < 0.0f ? 0.0f : fCos;
        if (f25 > 1.0f) {
            f25 = 1.0f;
        }
        if (Math.abs(f25 - fCos) > FloatEpsilon) {
            f25 = Float.NaN;
        }
        if (!Float.isNaN(f25)) {
            return f25;
        }
        float fCos2 = (float) ((Math.cos((Tau + dAcos) / 3.0d) * dFastCbrt) - d22);
        float f26 = fCos2 < 0.0f ? 0.0f : fCos2;
        if (f26 > 1.0f) {
            f26 = 1.0f;
        }
        if (Math.abs(f26 - fCos2) > FloatEpsilon) {
            f26 = Float.NaN;
        }
        if (!Float.isNaN(f26)) {
            return f26;
        }
        float fCos3 = (float) ((dFastCbrt * Math.cos((dAcos + 12.566370614359172d) / 3.0d)) - d22);
        f14 = fCos3 >= 0.0f ? fCos3 : 0.0f;
        f15 = f14 <= 1.0f ? f14 : 1.0f;
        if (Math.abs(f15 - fCos3) > FloatEpsilon) {
            return Float.NaN;
        }
        return f15;
    }

    private static final float findFirstLineRoot(float f10, float f11) {
        float f12 = (-f10) / (f11 - f10);
        float f13 = f12 >= 0.0f ? f12 : 0.0f;
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        if (Math.abs(f13 - f12) > FloatEpsilon) {
            return Float.NaN;
        }
        return f13;
    }

    private static final float findFirstQuadraticRoot(float f10, float f11, float f12) {
        float f13;
        float f14;
        double d10 = f10;
        double d11 = f11;
        double d12 = f12;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            if (d11 == d12) {
                return Float.NaN;
            }
            float f15 = (float) ((d13 - d12) / (d13 - (d12 * 2.0d)));
            f13 = f15 >= 0.0f ? f15 : 0.0f;
            f14 = f13 <= 1.0f ? f13 : 1.0f;
            if (Math.abs(f14 - f15) > FloatEpsilon) {
                return Float.NaN;
            }
            return f14;
        }
        double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
        double d16 = (-d10) + d11;
        float f16 = (float) ((-(d15 + d16)) / d14);
        float f17 = f16 < 0.0f ? 0.0f : f16;
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        if (Math.abs(f17 - f16) > FloatEpsilon) {
            f17 = Float.NaN;
        }
        if (!Float.isNaN(f17)) {
            return f17;
        }
        float f18 = (float) ((d15 - d16) / d14);
        f13 = f18 >= 0.0f ? f18 : 0.0f;
        f14 = f13 <= 1.0f ? f13 : 1.0f;
        if (Math.abs(f14 - f18) > FloatEpsilon) {
            return Float.NaN;
        }
        return f14;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final float findFirstRoot(PathSegment pathSegment, float f10) {
        float[] points = pathSegment.getPoints();
        switch (WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()]) {
            case 1:
                return Float.NaN;
            case 2:
                float f11 = points[0] - f10;
                float f12 = (-f11) / ((points[2] - f10) - f11);
                float f13 = f12 >= 0.0f ? f12 : 0.0f;
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                }
                if (Math.abs(f13 - f12) > FloatEpsilon) {
                    return Float.NaN;
                }
                return f13;
            case 3:
                return findFirstQuadraticRoot(points[0] - f10, points[2] - f10, points[4] - f10);
            case 4:
                return findFirstCubicRoot(points[0] - f10, points[2] - f10, points[4] - f10, points[6] - f10);
            case 5:
            case 6:
            case 7:
                return Float.NaN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final int findLineRoot(float f10, float f11, float[] fArr, int i10) {
        return writeValidRootInUnitRange((-f10) / (f11 - f10), fArr, i10);
    }

    public static /* synthetic */ int findLineRoot$default(float f10, float f11, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        return writeValidRootInUnitRange((-f10) / (f11 - f10), fArr, i10);
    }

    private static final int findQuadraticRoots(float f10, float f11, float f12, float[] fArr, int i10) {
        double d10 = f10;
        double d11 = f11;
        double d12 = f12;
        double d13 = d11 * 2.0d;
        double d14 = (d10 - d13) + d12;
        if (d14 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            if (d11 == d12) {
                return 0;
            }
            return writeValidRootInUnitRange((float) ((d13 - d12) / (d13 - (d12 * 2.0d))), fArr, i10);
        }
        double d15 = -Math.sqrt((d11 * d11) - (d12 * d10));
        double d16 = (-d10) + d11;
        int iWriteValidRootInUnitRange = writeValidRootInUnitRange((float) ((-(d15 + d16)) / d14), fArr, i10);
        int iWriteValidRootInUnitRange2 = iWriteValidRootInUnitRange + writeValidRootInUnitRange((float) ((d15 - d16) / d14), fArr, i10 + iWriteValidRootInUnitRange);
        if (iWriteValidRootInUnitRange2 <= 1) {
            return iWriteValidRootInUnitRange2;
        }
        float f13 = fArr[i10];
        int i11 = i10 + 1;
        float f14 = fArr[i11];
        if (f13 <= f14) {
            return f13 == f14 ? iWriteValidRootInUnitRange2 - 1 : iWriteValidRootInUnitRange2;
        }
        fArr[i10] = f14;
        fArr[i11] = f13;
        return iWriteValidRootInUnitRange2;
    }

    public static /* synthetic */ int findQuadraticRoots$default(float f10, float f11, float f12, float[] fArr, int i10, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            i10 = 0;
        }
        return findQuadraticRoots(f10, f11, f12, fArr, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float getEndX(androidx.compose.p013ui.graphics.PathSegment r3) {
        /*
            float[] r0 = r3.getPoints()
            androidx.compose.ui.graphics.PathSegment$Type r3 = r3.getType()
            int[] r1 = androidx.compose.ui.graphics.BezierKt.WhenMappings.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r1[r3]
            r1 = 2
            if (r3 == r1) goto L21
            r1 = 3
            r2 = 4
            if (r3 == r1) goto L1e
            if (r3 == r2) goto L20
            r1 = 5
            if (r3 == r1) goto L1e
            r1 = 0
            goto L21
        L1e:
            r1 = r2
            goto L21
        L20:
            r1 = 6
        L21:
            r3 = r0[r1]
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.graphics.BezierKt.getEndX(androidx.compose.ui.graphics.PathSegment):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final float getEndY(androidx.compose.p013ui.graphics.PathSegment r3) {
        /*
            float[] r0 = r3.getPoints()
            androidx.compose.ui.graphics.PathSegment$Type r3 = r3.getType()
            int[] r1 = androidx.compose.ui.graphics.BezierKt.WhenMappings.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r1[r3]
            r1 = 2
            r2 = 3
            if (r3 == r1) goto L21
            r1 = 5
            if (r3 == r2) goto L1e
            r2 = 4
            if (r3 == r2) goto L20
            if (r3 == r1) goto L1e
            r2 = 0
            goto L21
        L1e:
            r2 = r1
            goto L21
        L20:
            r2 = 7
        L21:
            r3 = r0[r2]
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.graphics.BezierKt.getEndY(androidx.compose.ui.graphics.PathSegment):float");
    }

    private static final float getStartX(PathSegment pathSegment) {
        return pathSegment.getPoints()[0];
    }

    private static final float getStartY(PathSegment pathSegment) {
        return pathSegment.getPoints()[1];
    }

    private static final boolean isQuadraticMonotonic(float f10, float f11, float f12) {
        return !(Math.signum(f10 - f11) + Math.signum(f11 - f12) == 0.0f);
    }

    public static final int lineWinding(float[] fArr, float f10, float f11) {
        int i10;
        float f12;
        if (fArr.length < 4) {
            return 0;
        }
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[2];
        float f16 = fArr[3];
        float f17 = f16 - f14;
        if (f14 > f16) {
            i10 = -1;
            f12 = f14;
        } else {
            i10 = 1;
            f12 = f16;
            f16 = f14;
        }
        if (f11 < f16 || f11 >= f12) {
            return 0;
        }
        float f18 = ((f15 - f13) * (f11 - f14)) - (f17 * (f10 - f13));
        if (f18 == 0.0f || ((int) Math.signum(f18)) == i10) {
            return 0;
        }
        return i10;
    }

    private static final int monotonicCubicWinding(float[] fArr, int i10, float f10, float f11) {
        int i11;
        int i12 = i10 + 1;
        float f12 = fArr[i12];
        int i13 = i10 + 7;
        float f13 = fArr[i13];
        if (f12 > f13) {
            i11 = -1;
            f13 = f12;
            f12 = f13;
        } else {
            i11 = 1;
        }
        if (f11 >= f12 && f11 < f13) {
            float f14 = fArr[i10];
            float f15 = fArr[i10 + 2];
            float f16 = fArr[i10 + 4];
            float f17 = fArr[i10 + 6];
            if (f10 < Math.min(f14, Math.min(f15, Math.min(f16, f17)))) {
                return 0;
            }
            if (f10 <= Math.max(f14, Math.max(f15, Math.max(f16, f17)))) {
                float f18 = fArr[i12];
                float f19 = fArr[i10 + 3];
                float f20 = fArr[i10 + 5];
                float f21 = fArr[i13];
                float fFindFirstCubicRoot = findFirstCubicRoot(f18 - f11, f19 - f11, f20 - f11, f21 - f11);
                if (Float.isNaN(fFindFirstCubicRoot)) {
                    return 0;
                }
                float fEvaluateCubic = evaluateCubic(f14, f15, f16, f17, fFindFirstCubicRoot);
                if ((Math.abs(fEvaluateCubic - f10) >= FloatEpsilon || (f10 == f17 && f11 == f21)) && fEvaluateCubic < f10) {
                }
            }
            return i11;
        }
        return 0;
    }

    private static final int monotonicQuadraticWinding(float[] fArr, int i10, float f10, float f11, float[] fArr2) {
        int i11;
        float f12;
        float f13;
        float f14 = fArr[i10 + 1];
        float f15 = fArr[i10 + 5];
        if (f14 > f15) {
            i11 = -1;
            f13 = f14;
            f12 = f15;
        } else {
            i11 = 1;
            f12 = f14;
            f13 = f15;
        }
        if (f11 >= f12 && f11 < f13) {
            float f16 = fArr[i10 + 3];
            float fEvaluateQuadratic = findQuadraticRoots$default((f14 - (f16 * 2.0f)) + f15, (f16 - f14) * 2.0f, f14 - f11, fArr2, 0, 16, null) == 0 ? fArr[(1 - i11) * 2] : evaluateQuadratic(fArr[0], fArr[2], fArr[4], fArr2[0]);
            if ((Math.abs(fEvaluateQuadratic - f10) >= FloatEpsilon || (f10 == fArr[4] && f11 == f15)) && fEvaluateQuadratic < f10) {
                return i11;
            }
        }
        return 0;
    }

    private static final int quadraticToMonotonicQuadratics(float[] fArr, float[] fArr2) {
        if (fArr.length < 6 || fArr2.length < 6) {
            return 0;
        }
        float f10 = fArr[1];
        float f11 = fArr[3];
        float f12 = fArr[5];
        if (!isQuadraticMonotonic(f10, f11, f12)) {
            float f13 = f10 - f11;
            float fUnitDivide = unitDivide(f13, (f13 - f11) + f12);
            if (!Float.isNaN(fUnitDivide)) {
                splitQuadraticAt(fArr, fArr2, fUnitDivide);
                return 1;
            }
            if (Math.abs(f13) >= Math.abs(f11 - f12)) {
                f10 = f12;
            }
            f11 = f10;
        }
        AbstractC8797p.m14646m(fArr, fArr2, 0, 0, 6);
        fArr2[3] = f11;
        return 0;
    }

    public static final int quadraticWinding(float[] fArr, float f10, float f11, float[] fArr2, float[] fArr3) {
        if (isQuadraticMonotonic(fArr[1], fArr[3], fArr[5])) {
            return monotonicQuadraticWinding(fArr, 0, f10, f11, fArr3);
        }
        int iQuadraticToMonotonicQuadratics = quadraticToMonotonicQuadratics(fArr, fArr2);
        int iMonotonicQuadraticWinding = monotonicQuadraticWinding(fArr2, 0, f10, f11, fArr3);
        return iQuadraticToMonotonicQuadratics > 0 ? iMonotonicQuadraticWinding + monotonicQuadraticWinding(fArr2, 4, f10, f11, fArr3) : iMonotonicQuadraticWinding;
    }

    private static final void splitCubicAt(float[] fArr, int i10, float[] fArr2, int i11, float f10) {
        if (fArr.length >= i10 + 8 && fArr2.length >= i11 + 14) {
            if (f10 >= 1.0f) {
                AbstractC8797p.m14646m(fArr, fArr2, i11, i10, 8);
                float f11 = fArr[i10 + 6];
                float f12 = fArr[i10 + 7];
                fArr2[i11 + 8] = f11;
                fArr2[i11 + 9] = f12;
                fArr2[i11 + 10] = f11;
                fArr2[i11 + 11] = f12;
                fArr2[i11 + 12] = f11;
                fArr2[i11 + 13] = f12;
                return;
            }
            float f13 = fArr[i10];
            float f14 = fArr[i10 + 1];
            fArr2[i11] = f13;
            fArr2[i11 + 1] = f14;
            float f15 = fArr[i10 + 2];
            float f16 = fArr[i10 + 3];
            float fLerp = MathHelpersKt.lerp(f13, f15, f10);
            float fLerp2 = MathHelpersKt.lerp(f14, f16, f10);
            fArr2[i11 + 2] = fLerp;
            fArr2[i11 + 3] = fLerp2;
            float f17 = fArr[i10 + 4];
            float f18 = fArr[i10 + 5];
            float fLerp3 = MathHelpersKt.lerp(f15, f17, f10);
            float fLerp4 = MathHelpersKt.lerp(f16, f18, f10);
            float fLerp5 = MathHelpersKt.lerp(fLerp, fLerp3, f10);
            float fLerp6 = MathHelpersKt.lerp(fLerp2, fLerp4, f10);
            fArr2[i11 + 4] = fLerp5;
            fArr2[i11 + 5] = fLerp6;
            float f19 = fArr[i10 + 6];
            float f20 = fArr[i10 + 7];
            float fLerp7 = MathHelpersKt.lerp(f17, f19, f10);
            float fLerp8 = MathHelpersKt.lerp(f18, f20, f10);
            float fLerp9 = MathHelpersKt.lerp(fLerp3, fLerp7, f10);
            float fLerp10 = MathHelpersKt.lerp(fLerp4, fLerp8, f10);
            float fLerp11 = MathHelpersKt.lerp(fLerp5, fLerp9, f10);
            float fLerp12 = MathHelpersKt.lerp(fLerp6, fLerp10, f10);
            fArr2[i11 + 6] = fLerp11;
            fArr2[i11 + 7] = fLerp12;
            fArr2[i11 + 8] = fLerp9;
            fArr2[i11 + 9] = fLerp10;
            fArr2[i11 + 10] = fLerp7;
            fArr2[i11 + 11] = fLerp8;
            fArr2[i11 + 12] = f19;
            fArr2[i11 + 13] = f20;
        }
    }

    private static final void splitQuadraticAt(float[] fArr, float[] fArr2, float f10) {
        if (fArr.length >= 6 && fArr2.length >= 10) {
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[2];
            float f14 = fArr[3];
            float f15 = fArr[4];
            float f16 = fArr[5];
            float fLerp = MathHelpersKt.lerp(f11, f13, f10);
            float fLerp2 = MathHelpersKt.lerp(f12, f14, f10);
            fArr2[0] = f11;
            fArr2[1] = f12;
            fArr2[2] = fLerp;
            fArr2[3] = fLerp2;
            float fLerp3 = MathHelpersKt.lerp(f13, f15, f10);
            float fLerp4 = MathHelpersKt.lerp(f14, f16, f10);
            float fLerp5 = MathHelpersKt.lerp(fLerp, fLerp3, f10);
            float fLerp6 = MathHelpersKt.lerp(fLerp2, fLerp4, f10);
            fArr2[4] = fLerp5;
            fArr2[5] = fLerp6;
            fArr2[6] = fLerp3;
            fArr2[7] = fLerp4;
            fArr2[8] = f15;
            fArr2[9] = f16;
        }
    }

    private static final float unitDivide(float f10, float f11) {
        if (f10 < 0.0f) {
            f10 = -f10;
            f11 = -f11;
        }
        if (f11 == 0.0f || f10 == 0.0f || f10 >= f11) {
            return Float.NaN;
        }
        float f12 = f10 / f11;
        if (f12 == 0.0f) {
            return Float.NaN;
        }
        return f12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int writeValidRootInUnitRange(float f10, float[] fArr, int i10) {
        float f11 = f10 >= 0.0f ? f10 : 0.0f;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (Math.abs(f11 - f10) > FloatEpsilon) {
            f11 = Float.NaN;
        }
        fArr[i10] = f11;
        return !Float.isNaN(f11) ? 1 : 0;
    }

    public static final boolean closeTo(float f10, float f11) {
        return Math.abs(f10 - f11) < FloatEpsilon;
    }

    private static final float evaluateCubic(float f10, float f11, float f12, float f13, float f14) {
        float f15 = (f13 + ((f11 - f12) * 3.0f)) - f10;
        return (((((f15 * f14) + (((f12 - (2.0f * f11)) + f10) * 3.0f)) * f14) + ((f11 - f10) * 3.0f)) * f14) + f10;
    }
}
