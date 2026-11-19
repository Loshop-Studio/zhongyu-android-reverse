package androidx.compose.animation.core;

import androidx.annotation.RestrictTo;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a7\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\n\u001a?\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000e\u001a7\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0014\u001aG\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a@\u0010 \u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001dH\u0082\b¢\u0006\u0004\b \u0010!\u001a\u0014\u0010#\u001a\u00020\"*\u00020\tH\u0082\b¢\u0006\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, m5110d2 = {"", "stiffness", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "", "estimateAnimationDurationMillis", "(FFFFF)J", "", "(DDDDD)J", "springConstant", "dampingCoefficient", "mass", "(DDDDDD)J", "firstRootReal", "firstRootImaginary", "p0", "v0", "estimateUnderDamped", "(DDDDD)D", "estimateCriticallyDamped", "(DDDD)D", "secondRootReal", "estimateOverDamped", "initialPosition", "estimateDurationInternal", "(DDDDDDD)J", "x", "Lkotlin/Function1;", "fn", "fnPrime", "iterateNewtonsMethod", "(DLr6/c;Lr6/c;)D", "", "isNotFinite", "(D)Z", "MAX_LONG_MILLIS", "J", "animation-core_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSpringEstimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,348:1\n347#1:349\n347#1:351\n344#1:353\n347#1:354\n347#1:356\n344#1:358\n150#2:350\n150#2:352\n150#2:355\n150#2:357\n150#2:359\n*S KotlinDebug\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n172#1:349\n173#1:351\n213#1:353\n247#1:354\n248#1:356\n294#1:358\n172#1:350\n173#1:352\n247#1:355\n248#1:357\n347#1:359\n*E\n"})
/* loaded from: classes.dex */
public final class SpringEstimationKt {
    private static final long MAX_LONG_MILLIS = 9223372036854L;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final long estimateAnimationDurationMillis(float f, float f7, float f8, float f9, float f10) {
        return f7 == 0.0f ? MAX_LONG_MILLIS : estimateAnimationDurationMillis(f, f7, f8, f9, f10);
    }

    private static final double estimateCriticallyDamped(double d9, double d10, double d11, double d12) {
        double d13 = d12;
        double d14 = d9 * d10;
        double d15 = d11 - d14;
        double dLog = Math.log(Math.abs(d13 / d10)) / d9;
        double dLog2 = Math.log(Math.abs(d13 / d15));
        int i = 0;
        double dLog3 = dLog2;
        for (int i8 = 0; i8 < 6; i8++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / d9));
        }
        double d16 = dLog3 / d9;
        if (!((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) < 9218868437227405312L)) {
            dLog = d16;
        } else if ((Double.doubleToRawLongBits(d16) & Long.MAX_VALUE) < 9218868437227405312L) {
            dLog = Math.max(dLog, d16);
        }
        double d17 = (-(d14 + d15)) / (d9 * d15);
        double d18 = d9 * d17;
        double dExp = (Math.exp(d18) * d15 * d17) + (Math.exp(d18) * d10);
        if (Double.isNaN(d17) || d17 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            d13 = -d13;
        } else if (d17 <= AudioStats.AUDIO_AMPLITUDE_NONE || (-dExp) >= d13) {
            dLog = (-(2.0d / d9)) - (d10 / d15);
        } else {
            if (d15 < AudioStats.AUDIO_AMPLITUDE_NONE && d10 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                dLog = 0.0d;
            }
            d13 = -d13;
        }
        double dAbs = Double.MAX_VALUE;
        while (dAbs > 0.001d && i < 100) {
            i++;
            double d19 = d9 * dLog;
            double dExp2 = dLog - (((Math.exp(d19) * ((d15 * dLog) + d10)) + d13) / (Math.exp(d19) * (((1 + d19) * d15) + d14)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
        }
        return dLog;
    }

    private static final long estimateDurationInternal(double d9, double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d13;
        if (d14 == AudioStats.AUDIO_AMPLITUDE_NONE && d16 == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return 0L;
        }
        if (d14 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            d16 = -d16;
        }
        double d17 = d16;
        double dAbs = Math.abs(d14);
        return (long) ((d12 > 1.0d ? estimateOverDamped(d9, d11, dAbs, d17, d15) : d12 < 1.0d ? estimateUnderDamped(d9, d10, dAbs, d17, d15) : estimateCriticallyDamped(d9, dAbs, d17, d15)) * 1000.0d);
    }

    private static final double estimateOverDamped(double d9, double d10, double d11, double d12, double d13) {
        double d14 = d13;
        double d15 = d9 - d10;
        double d16 = ((d9 * d11) - d12) / d15;
        double d17 = d11 - d16;
        double dLog = Math.log(Math.abs(d14 / d17)) / d9;
        double dLog2 = Math.log(Math.abs(d14 / d16)) / d10;
        if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) < 9218868437227405312L) {
            if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                dLog = Math.max(dLog, dLog2);
            }
        } else {
            dLog = dLog2;
        }
        double d18 = d17 * d9;
        double dLog3 = Math.log(d18 / ((-d16) * d10)) / (d10 - d9);
        if (Double.isNaN(dLog3) || dLog3 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            d14 = -d14;
        } else if (dLog3 <= AudioStats.AUDIO_AMPLITUDE_NONE || (-estimateOverDamped$xInflection(d17, d9, dLog3, d16, d10)) >= d14) {
            dLog = Math.log((-((d16 * d10) * d10)) / (d18 * d9)) / d15;
        } else {
            if (d16 > AudioStats.AUDIO_AMPLITUDE_NONE && d17 < AudioStats.AUDIO_AMPLITUDE_NONE) {
                dLog = 0.0d;
            }
            d14 = -d14;
        }
        double d19 = d16 * d10;
        if (Math.abs((Math.exp(d10 * dLog) * d19) + (Math.exp(d9 * dLog) * d18)) < 1.0E-4d) {
            return dLog;
        }
        double dAbs = Double.MAX_VALUE;
        int i = 0;
        while (dAbs > 0.001d && i < 100) {
            i++;
            double d20 = d9 * dLog;
            double d21 = d10 * dLog;
            double dExp = dLog - ((((Math.exp(d21) * d16) + (Math.exp(d20) * d17)) + d14) / ((Math.exp(d21) * d19) + (Math.exp(d20) * d18)));
            dAbs = Math.abs(dLog - dExp);
            dLog = dExp;
        }
        return dLog;
    }

    private static final double estimateOverDamped$xInflection(double d9, double d10, double d11, double d12, double d13) {
        return (Math.exp(d13 * d11) * d12) + (Math.exp(d10 * d11) * d9);
    }

    private static final double estimateUnderDamped(double d9, double d10, double d11, double d12, double d13) {
        double d14 = (d12 - (d9 * d11)) / d10;
        return Math.log(d13 / Math.sqrt((d14 * d14) + (d11 * d11))) / d9;
    }

    private static final boolean isNotFinite(double d9) {
        return !((Double.doubleToRawLongBits(d9) & Long.MAX_VALUE) < 9218868437227405312L);
    }

    private static final double iterateNewtonsMethod(double d9, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2) {
        return d9 - (((Number) interfaceC6471c.invoke(Double.valueOf(d9))).doubleValue() / ((Number) interfaceC6471c2.invoke(Double.valueOf(d9))).doubleValue());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final long estimateAnimationDurationMillis(double d9, double d10, double d11, double d12, double d13) {
        double dSqrt = Math.sqrt(d9) * 2.0d * d10;
        double d14 = (dSqrt * dSqrt) - (4.0d * d9);
        double dSqrt2 = AudioStats.AUDIO_AMPLITUDE_NONE;
        double dSqrt3 = d14 < AudioStats.AUDIO_AMPLITUDE_NONE ? 0.0d : Math.sqrt(d14);
        if (d14 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            dSqrt2 = Math.sqrt(Math.abs(d14));
        }
        double d15 = -dSqrt;
        return estimateDurationInternal((d15 + dSqrt3) * 0.5d, dSqrt2 * 0.5d, (d15 - dSqrt3) * 0.5d, d10, d11, d12, d13);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final long estimateAnimationDurationMillis(double d9, double d10, double d11, double d12, double d13, double d14) {
        double dSqrt = d10 / (Math.sqrt(d9 * d11) * 2.0d);
        double d15 = (d10 * d10) - ((4.0d * d11) * d9);
        double d16 = 1.0d / (2.0d * d11);
        double dSqrt2 = AudioStats.AUDIO_AMPLITUDE_NONE;
        double dSqrt3 = d15 < AudioStats.AUDIO_AMPLITUDE_NONE ? 0.0d : Math.sqrt(d15);
        if (d15 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            dSqrt2 = Math.sqrt(Math.abs(d15));
        }
        double d17 = -d10;
        return estimateDurationInternal((d17 + dSqrt3) * d16, dSqrt2 * d16, (d17 - dSqrt3) * d16, dSqrt, d12, d13, d14);
    }
}
