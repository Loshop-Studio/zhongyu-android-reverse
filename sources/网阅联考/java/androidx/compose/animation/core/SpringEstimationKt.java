package androidx.compose.animation.core;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u00002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000b\u001a4\u0010\f\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a<\u0010\u0012\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a4\u0010\u0014\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a4\u0010\u0015\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002\u001a9\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0019H\u0082\b\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0003H\u0082\b¨\u0006\u001d"}, m5175d2 = {"estimateAnimationDurationMillis", "", "stiffness", "", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "springConstant", "dampingCoefficient", "mass", "", "estimateCriticallyDamped", "roots", "Lkotlin/Pair;", "Landroidx/compose/animation/core/ComplexDouble;", "p0", "v0", "estimateDurationInternal", "initialPosition", "estimateOverDamped", "estimateUnderDamped", "iterateNewtonsMethod", "x", "fn", "Lkotlin/Function1;", "fnPrime", "isNotFinite", "", "animation-core_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSpringEstimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n1#1,318:1\n317#1:319\n317#1:320\n313#1:321\n317#1:322\n317#1:323\n313#1:324\n*S KotlinDebug\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n141#1:319\n142#1:320\n183#1:321\n211#1:322\n212#1:323\n259#1:324\n*E\n"})
/* loaded from: classes.dex */
public final class SpringEstimationKt {
    public static final long estimateAnimationDurationMillis(float f4, float f5, float f6, float f7, float f8) {
        return estimateAnimationDurationMillis(f4, f5, f6, f7, f8);
    }

    private static final double estimateCriticallyDamped(Pair<ComplexDouble, ComplexDouble> pair, final double d4, double d5, double d6) {
        double d7;
        final double d8;
        final double real = pair.getFirst().getReal();
        double d9 = real * d4;
        final double d10 = d5 - d9;
        double dLog = Math.log(Math.abs(d6 / d4)) / real;
        double dEstimateCriticallyDamped$t2Iterate = estimateCriticallyDamped$t2Iterate(Math.log(Math.abs(d6 / d10)), real) / real;
        int i4 = 0;
        if (!((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true)) {
            d7 = dEstimateCriticallyDamped$t2Iterate;
        } else {
            if (!(!((Double.isInfinite(dEstimateCriticallyDamped$t2Iterate) || Double.isNaN(dEstimateCriticallyDamped$t2Iterate)) ? false : true))) {
                dLog = Math.max(dLog, dEstimateCriticallyDamped$t2Iterate);
            }
            d7 = dLog;
        }
        double d11 = (-(d9 + d10)) / (real * d10);
        if (Double.isNaN(d11) || d11 <= 0.0d) {
            d8 = -d6;
        } else if (d11 <= 0.0d || (-estimateCriticallyDamped$xInflection(d4, real, d11, d10)) >= d6) {
            d7 = (-(2.0d / real)) - (d4 / d10);
            d8 = d6;
        } else {
            if (d10 < 0.0d && d4 > 0.0d) {
                d7 = 0.0d;
            }
            d8 = -d6;
        }
        Function1<Double, Double> function1 = new Function1<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fn$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Double invoke(double d12) {
                return Double.valueOf(((d4 + (d10 * d12)) * Math.exp(real * d12)) + d8);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d12) {
                return invoke(d12.doubleValue());
            }
        };
        Function1<Double, Double> function12 = new Function1<Double, Double>() { // from class: androidx.compose.animation.core.SpringEstimationKt$estimateCriticallyDamped$fnPrime$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Double invoke(double d12) {
                double d13 = d10;
                double d14 = real;
                return Double.valueOf(((d13 * ((d14 * d12) + 1)) + (d4 * d14)) * Math.exp(d14 * d12));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Double invoke(Double d12) {
                return invoke(d12.doubleValue());
            }
        };
        double d12 = Double.MAX_VALUE;
        while (d12 > 0.001d && i4 < 100) {
            i4++;
            double dDoubleValue = d7 - (function1.invoke(Double.valueOf(d7)).doubleValue() / function12.invoke(Double.valueOf(d7)).doubleValue());
            double dAbs = Math.abs(d7 - dDoubleValue);
            d7 = dDoubleValue;
            d12 = dAbs;
        }
        return d7;
    }

    private static final double estimateCriticallyDamped$t2Iterate(double d4, double d5) {
        double dLog = d4;
        for (int i4 = 0; i4 < 6; i4++) {
            dLog = d4 - Math.log(Math.abs(dLog / d5));
        }
        return dLog;
    }

    private static final double estimateCriticallyDamped$xInflection(double d4, double d5, double d6, double d7) {
        double d8 = d5 * d6;
        return (d4 * Math.exp(d8)) + (d7 * d6 * Math.exp(d8));
    }

    private static final long estimateDurationInternal(Pair<ComplexDouble, ComplexDouble> pair, double d4, double d5, double d6, double d7) {
        if (d6 == 0.0d) {
            if (d5 == 0.0d) {
                return 0L;
            }
        }
        if (d6 < 0.0d) {
            d5 = -d5;
        }
        double d8 = d5;
        double dAbs = Math.abs(d6);
        return (long) ((d4 > 1.0d ? estimateOverDamped(pair, dAbs, d8, d7) : d4 < 1.0d ? estimateUnderDamped(pair, dAbs, d8, d7) : estimateCriticallyDamped(pair, dAbs, d8, d7)) * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final double estimateOverDamped(kotlin.Pair<androidx.compose.animation.core.ComplexDouble, androidx.compose.animation.core.ComplexDouble> r31, double r32, double r34, double r36) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SpringEstimationKt.estimateOverDamped(kotlin.Pair, double, double, double):double");
    }

    private static final double estimateOverDamped$xInflection$0(double d4, double d5, double d6, double d7, double d8) {
        return (d4 * Math.exp(d5 * d6)) + (d7 * Math.exp(d8 * d6));
    }

    private static final double estimateUnderDamped(Pair<ComplexDouble, ComplexDouble> pair, double d4, double d5, double d6) {
        double real = pair.getFirst().getReal();
        double imaginary = (d5 - (real * d4)) / pair.getFirst().getImaginary();
        return Math.log(d6 / Math.sqrt((d4 * d4) + (imaginary * imaginary))) / real;
    }

    private static final boolean isNotFinite(double d4) {
        return !((Double.isInfinite(d4) || Double.isNaN(d4)) ? false : true);
    }

    private static final double iterateNewtonsMethod(double d4, Function1<? super Double, Double> function1, Function1<? super Double, Double> function12) {
        return d4 - (function1.invoke(Double.valueOf(d4)).doubleValue() / function12.invoke(Double.valueOf(d4)).doubleValue());
    }

    public static final long estimateAnimationDurationMillis(double d4, double d5, double d6, double d7, double d8) {
        return estimateDurationInternal(ComplexDoubleKt.complexQuadraticFormula(1.0d, 2.0d * d5 * Math.sqrt(d4), d4), d5, d6, d7, d8);
    }

    public static final long estimateAnimationDurationMillis(double d4, double d5, double d6, double d7, double d8, double d9) {
        return estimateDurationInternal(ComplexDoubleKt.complexQuadraticFormula(d6, d5, d4), d5 / (Math.sqrt(d4 * d6) * 2.0d), d7, d8, d9);
    }
}
