package androidx.compose.animation.core;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000(\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a0\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007\u001a8\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007\u001a0\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\fH\u0007\u001a(\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a@\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a0\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a0\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a9\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001aH\u0082\b\u001a\r\u0010\u001c\u001a\u00020\u001d*\u00020\u0004H\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m7880d2 = {"MAX_LONG_MILLIS", "", "estimateAnimationDurationMillis", "stiffness", "", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "springConstant", "dampingCoefficient", "mass", "", "estimateCriticallyDamped", "firstRootReal", "p0", "v0", "estimateDurationInternal", "firstRootImaginary", "secondRootReal", "initialPosition", "estimateOverDamped", "estimateUnderDamped", "iterateNewtonsMethod", "x", "fn", "Lkotlin/Function1;", "fnPrime", "isNotFinite", "", "animation-core_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nSpringEstimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,348:1\n347#1:349\n347#1:351\n344#1:353\n347#1:354\n347#1:356\n344#1:358\n150#2:350\n150#2:352\n150#2:355\n150#2:357\n150#2:359\n*S KotlinDebug\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n172#1:349\n173#1:351\n213#1:353\n247#1:354\n248#1:356\n294#1:358\n172#1:350\n173#1:352\n247#1:355\n248#1:357\n347#1:359\n*E\n"})
/* loaded from: classes.dex */
public final class SpringEstimationKt {
    private static final long MAX_LONG_MILLIS = 9223372036854L;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final long estimateAnimationDurationMillis(float f6, float f7, float f8, float f9, float f10) {
        return f7 == 0.0f ? MAX_LONG_MILLIS : estimateAnimationDurationMillis(f6, f7, f8, f9, f10);
    }

    private static final double estimateCriticallyDamped(double d6, double d7, double d8, double d9) {
        double d10 = d9;
        double d11 = d6 * d7;
        double d12 = d8 - d11;
        double dLog = Math.log(Math.abs(d10 / d7)) / d6;
        double dLog2 = Math.log(Math.abs(d10 / d12));
        int i6 = 0;
        double dLog3 = dLog2;
        for (int i7 = 0; i7 < 6; i7++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d6));
        }
        double d13 = dLog3 / d6;
        if (!((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) < 9218868437227405312L)) {
            dLog = d13;
        } else if ((Double.doubleToRawLongBits(d13) & Long.MAX_VALUE) < 9218868437227405312L) {
            dLog = Math.max(dLog, d13);
        }
        double d14 = (-(d11 + d12)) / (d6 * d12);
        double d15 = d6 * d14;
        double dExp = (Math.exp(d15) * d7) + (d12 * d14 * Math.exp(d15));
        if (Double.isNaN(d14) || d14 <= 0.0d) {
            d10 = -d10;
        } else if (d14 <= 0.0d || (-dExp) >= d10) {
            dLog = (-(2.0d / d6)) - (d7 / d12);
        } else {
            if (d12 < 0.0d && d7 > 0.0d) {
                dLog = 0.0d;
            }
            d10 = -d10;
        }
        double dAbs = Double.MAX_VALUE;
        while (dAbs > 0.001d && i6 < 100) {
            i6++;
            double d16 = d6 * dLog;
            double d17 = d10;
            double dExp2 = dLog - ((((d7 + (d12 * dLog)) * Math.exp(d16)) + d10) / ((((1 + d16) * d12) + d11) * Math.exp(d16)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
            d10 = d17;
        }
        return dLog;
    }

    private static final long estimateDurationInternal(double d6, double d7, double d8, double d9, double d10, double d11, double d12) {
        double d13 = d10;
        if (d11 == 0.0d && d13 == 0.0d) {
            return 0L;
        }
        if (d11 < 0.0d) {
            d13 = -d13;
        }
        double d14 = d13;
        double dAbs = Math.abs(d11);
        return (long) ((d9 > 1.0d ? estimateOverDamped(d6, d8, dAbs, d14, d12) : d9 < 1.0d ? estimateUnderDamped(d6, d7, dAbs, d14, d12) : estimateCriticallyDamped(d6, dAbs, d14, d12)) * 1000.0d);
    }

    private static final double estimateOverDamped(double d6, double d7, double d8, double d9, double d10) {
        double d11 = d10;
        double d12 = d6 - d7;
        double d13 = ((d6 * d8) - d9) / d12;
        double d14 = d8 - d13;
        double dLog = Math.log(Math.abs(d11 / d14)) / d6;
        double dLog2 = Math.log(Math.abs(d11 / d13)) / d7;
        if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) < 9218868437227405312L) {
            if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                dLog = Math.max(dLog, dLog2);
            }
        } else {
            dLog = dLog2;
        }
        double d15 = d14 * d6;
        double dLog3 = Math.log(d15 / ((-d13) * d7)) / (d7 - d6);
        if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
            d11 = -d11;
        } else if (dLog3 <= 0.0d || (-estimateOverDamped$xInflection(d14, d6, dLog3, d13, d7)) >= d11) {
            dLog = Math.log((-((d13 * d7) * d7)) / (d15 * d6)) / d12;
        } else {
            if (d13 > 0.0d && d14 < 0.0d) {
                dLog = 0.0d;
            }
            d11 = -d11;
        }
        double d16 = d13 * d7;
        if (Math.abs((Math.exp(d6 * dLog) * d15) + (Math.exp(d7 * dLog) * d16)) < 1.0E-4d) {
            return dLog;
        }
        double dAbs = Double.MAX_VALUE;
        int i6 = 0;
        while (dAbs > 0.001d && i6 < 100) {
            i6++;
            double d17 = d6 * dLog;
            double d18 = d7 * dLog;
            double dExp = dLog - ((((Math.exp(d17) * d14) + (Math.exp(d18) * d13)) + d11) / ((Math.exp(d17) * d15) + (Math.exp(d18) * d16)));
            dAbs = Math.abs(dLog - dExp);
            dLog = dExp;
        }
        return dLog;
    }

    private static final double estimateOverDamped$xInflection(double d6, double d7, double d8, double d9, double d10) {
        return (d6 * Math.exp(d7 * d8)) + (d9 * Math.exp(d10 * d8));
    }

    private static final double estimateUnderDamped(double d6, double d7, double d8, double d9, double d10) {
        double d11 = (d9 - (d6 * d8)) / d7;
        return Math.log(d10 / Math.sqrt((d8 * d8) + (d11 * d11))) / d6;
    }

    private static final boolean isNotFinite(double d6) {
        return !((Double.doubleToRawLongBits(d6) & Long.MAX_VALUE) < 9218868437227405312L);
    }

    private static final double iterateNewtonsMethod(double d6, Function1<? super Double, Double> function1, Function1<? super Double, Double> function12) {
        return d6 - (function1.invoke(Double.valueOf(d6)).doubleValue() / function12.invoke(Double.valueOf(d6)).doubleValue());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final long estimateAnimationDurationMillis(double d6, double d7, double d8, double d9, double d10) {
        double dSqrt = 2.0d * d7 * Math.sqrt(d6);
        double d11 = (dSqrt * dSqrt) - (4.0d * d6);
        double dSqrt2 = d11 < 0.0d ? 0.0d : Math.sqrt(d11);
        double d12 = -dSqrt;
        return estimateDurationInternal((d12 + dSqrt2) * 0.5d, (d11 < 0.0d ? Math.sqrt(Math.abs(d11)) : 0.0d) * 0.5d, (d12 - dSqrt2) * 0.5d, d7, d8, d9, d10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final long estimateAnimationDurationMillis(double d6, double d7, double d8, double d9, double d10, double d11) {
        double dSqrt = d7 / (Math.sqrt(d6 * d8) * 2.0d);
        double d12 = (d7 * d7) - ((4.0d * d8) * d6);
        double d13 = 1.0d / (2.0d * d8);
        double dSqrt2 = d12 < 0.0d ? 0.0d : Math.sqrt(d12);
        double d14 = -d7;
        return estimateDurationInternal((d14 + dSqrt2) * d13, (d12 < 0.0d ? Math.sqrt(Math.abs(d12)) : 0.0d) * d13, (d14 - dSqrt2) * d13, dSqrt, d9, d10, d11);
    }
}
