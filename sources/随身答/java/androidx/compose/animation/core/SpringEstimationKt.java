package androidx.compose.animation.core;

import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000(\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a0\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007\u001a8\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007\u001a0\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\fH\u0007\u001a(\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a@\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a0\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a0\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a9\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001aH\u0082\b\u001a\r\u0010\u001c\u001a\u00020\u001d*\u00020\u0004H\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m13413d2 = {"MAX_LONG_MILLIS", "", "estimateAnimationDurationMillis", "stiffness", "", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "springConstant", "dampingCoefficient", "mass", "", "estimateCriticallyDamped", "firstRootReal", "p0", "v0", "estimateDurationInternal", "firstRootImaginary", "secondRootReal", "initialPosition", "estimateOverDamped", "estimateUnderDamped", "iterateNewtonsMethod", "x", "fn", "Lkotlin/Function1;", "fnPrime", "isNotFinite", "", "animation-core_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSpringEstimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,348:1\n347#1:349\n347#1:351\n344#1:353\n347#1:354\n347#1:356\n344#1:358\n150#2:350\n150#2:352\n150#2:355\n150#2:357\n150#2:359\n*S KotlinDebug\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n172#1:349\n173#1:351\n213#1:353\n247#1:354\n248#1:356\n294#1:358\n172#1:350\n173#1:352\n247#1:355\n248#1:357\n347#1:359\n*E\n"})
/* loaded from: classes.dex */
public final class SpringEstimationKt {
    private static final long MAX_LONG_MILLIS = 9223372036854L;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final long estimateAnimationDurationMillis(float f10, float f11, float f12, float f13, float f14) {
        return f11 == 0.0f ? MAX_LONG_MILLIS : estimateAnimationDurationMillis(f10, f11, f12, f13, f14);
    }

    private static final double estimateCriticallyDamped(double d10, double d11, double d12, double d13) {
        double d14 = d13;
        double d15 = d10 * d11;
        double d16 = d12 - d15;
        double dLog = Math.log(Math.abs(d14 / d11)) / d10;
        double dLog2 = Math.log(Math.abs(d14 / d16));
        int i9 = 0;
        double dLog3 = dLog2;
        for (int i10 = 0; i10 < 6; i10++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d10));
        }
        double d17 = dLog3 / d10;
        if (!((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) < 9218868437227405312L)) {
            dLog = d17;
        } else if ((Double.doubleToRawLongBits(d17) & Long.MAX_VALUE) < 9218868437227405312L) {
            dLog = Math.max(dLog, d17);
        }
        double d18 = (-(d15 + d16)) / (d10 * d16);
        double d19 = d10 * d18;
        double dExp = (Math.exp(d19) * d11) + (d16 * d18 * Math.exp(d19));
        if (Double.isNaN(d18) || d18 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            d14 = -d14;
        } else if (d18 <= AudioStats.AUDIO_AMPLITUDE_NONE || (-dExp) >= d14) {
            dLog = (-(2.0d / d10)) - (d11 / d16);
        } else {
            if (d16 < AudioStats.AUDIO_AMPLITUDE_NONE && d11 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                dLog = 0.0d;
            }
            d14 = -d14;
        }
        double dAbs = Double.MAX_VALUE;
        while (dAbs > 0.001d && i9 < 100) {
            i9++;
            double d20 = d10 * dLog;
            double d21 = d14;
            double dExp2 = dLog - ((((d11 + (d16 * dLog)) * Math.exp(d20)) + d14) / ((((1 + d20) * d16) + d15) * Math.exp(d20)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
            d14 = d21;
        }
        return dLog;
    }

    private static final long estimateDurationInternal(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        double d17 = d14;
        if (d15 == AudioStats.AUDIO_AMPLITUDE_NONE && d17 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return 0L;
        }
        if (d15 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            d17 = -d17;
        }
        double d18 = d17;
        double dAbs = Math.abs(d15);
        return (long) ((d13 > 1.0d ? estimateOverDamped(d10, d12, dAbs, d18, d16) : d13 < 1.0d ? estimateUnderDamped(d10, d11, dAbs, d18, d16) : estimateCriticallyDamped(d10, dAbs, d18, d16)) * 1000.0d);
    }

    private static final double estimateOverDamped(double d10, double d11, double d12, double d13, double d14) {
        double d15 = d14;
        double d16 = d10 - d11;
        double d17 = ((d10 * d12) - d13) / d16;
        double d18 = d12 - d17;
        double dLog = Math.log(Math.abs(d15 / d18)) / d10;
        double dLog2 = Math.log(Math.abs(d15 / d17)) / d11;
        if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) < 9218868437227405312L) {
            if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                dLog = Math.max(dLog, dLog2);
            }
        } else {
            dLog = dLog2;
        }
        double d19 = d18 * d10;
        double dLog3 = Math.log(d19 / ((-d17) * d11)) / (d11 - d10);
        if (Double.isNaN(dLog3) || dLog3 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            d15 = -d15;
        } else if (dLog3 <= AudioStats.AUDIO_AMPLITUDE_NONE || (-estimateOverDamped$xInflection(d18, d10, dLog3, d17, d11)) >= d15) {
            dLog = Math.log((-((d17 * d11) * d11)) / (d19 * d10)) / d16;
        } else {
            if (d17 > AudioStats.AUDIO_AMPLITUDE_NONE && d18 < AudioStats.AUDIO_AMPLITUDE_NONE) {
                dLog = 0.0d;
            }
            d15 = -d15;
        }
        double d20 = d17 * d11;
        if (Math.abs((Math.exp(d10 * dLog) * d19) + (Math.exp(d11 * dLog) * d20)) < 1.0E-4d) {
            return dLog;
        }
        double dAbs = Double.MAX_VALUE;
        int i9 = 0;
        while (dAbs > 0.001d && i9 < 100) {
            i9++;
            double d21 = d10 * dLog;
            double d22 = d11 * dLog;
            double dExp = dLog - ((((Math.exp(d21) * d18) + (Math.exp(d22) * d17)) + d15) / ((Math.exp(d21) * d19) + (Math.exp(d22) * d20)));
            dAbs = Math.abs(dLog - dExp);
            dLog = dExp;
        }
        return dLog;
    }

    private static final double estimateOverDamped$xInflection(double d10, double d11, double d12, double d13, double d14) {
        return (d10 * Math.exp(d11 * d12)) + (d13 * Math.exp(d14 * d12));
    }

    private static final double estimateUnderDamped(double d10, double d11, double d12, double d13, double d14) {
        double d15 = (d13 - (d10 * d12)) / d11;
        return Math.log(d14 / Math.sqrt((d12 * d12) + (d15 * d15))) / d10;
    }

    private static final boolean isNotFinite(double d10) {
        return !((Double.doubleToRawLongBits(d10) & Long.MAX_VALUE) < 9218868437227405312L);
    }

    private static final double iterateNewtonsMethod(double d10, Function1<? super Double, Double> function1, Function1<? super Double, Double> function12) {
        return d10 - (function1.invoke(Double.valueOf(d10)).doubleValue() / function12.invoke(Double.valueOf(d10)).doubleValue());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final long estimateAnimationDurationMillis(double d10, double d11, double d12, double d13, double d14) {
        double dSqrt = 2.0d * d11 * Math.sqrt(d10);
        double d15 = (dSqrt * dSqrt) - (4.0d * d10);
        double dSqrt2 = AudioStats.AUDIO_AMPLITUDE_NONE;
        double dSqrt3 = d15 < AudioStats.AUDIO_AMPLITUDE_NONE ? 0.0d : Math.sqrt(d15);
        if (d15 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            dSqrt2 = Math.sqrt(Math.abs(d15));
        }
        double d16 = -dSqrt;
        return estimateDurationInternal((d16 + dSqrt3) * 0.5d, dSqrt2 * 0.5d, (d16 - dSqrt3) * 0.5d, d11, d12, d13, d14);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final long estimateAnimationDurationMillis(double d10, double d11, double d12, double d13, double d14, double d15) {
        double dSqrt = d11 / (Math.sqrt(d10 * d12) * 2.0d);
        double d16 = (d11 * d11) - ((4.0d * d12) * d10);
        double d17 = 1.0d / (2.0d * d12);
        double dSqrt2 = AudioStats.AUDIO_AMPLITUDE_NONE;
        double dSqrt3 = d16 < AudioStats.AUDIO_AMPLITUDE_NONE ? 0.0d : Math.sqrt(d16);
        if (d16 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            dSqrt2 = Math.sqrt(Math.abs(d16));
        }
        double d18 = -d11;
        return estimateDurationInternal((d18 + dSqrt3) * d17, dSqrt2 * d17, (d18 - dSqrt3) * d17, dSqrt, d13, d14, d15);
    }
}
