package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003J-\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\u0004R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\u0004\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, m7880d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "finalPosition", "", "(F)V", "value", "dampingRatio", "getDampingRatio", "()F", "setDampingRatio", "getFinalPosition", "setFinalPosition", "naturalFreq", "", "stiffness", "getStiffness", "setStiffness", "getAcceleration", "lastDisplacement", "lastVelocity", "updateValues", "Landroidx/compose/animation/core/Motion;", "timeElapsed", "", "updateValues-IJZedt4$animation_core_release", "(FFJ)J", "animation-core_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulation\n+ 2 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulationKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,152:1\n38#2:153\n53#3,3:154\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulation\n*L\n149#1:153\n149#1:154,3\n*E\n"})
/* loaded from: classes.dex */
public final class SpringSimulation {
    public static final int $stable = 8;
    private float finalPosition;
    private double naturalFreq = Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public SpringSimulation(float f6) {
        this.finalPosition = f6;
    }

    public final float getAcceleration(float lastDisplacement, float lastVelocity) {
        float f6 = lastDisplacement - this.finalPosition;
        double d6 = this.naturalFreq;
        return (float) (((-(d6 * d6)) * f6) - (((d6 * 2.0d) * this.dampingRatio) * lastVelocity));
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final float getStiffness() {
        double d6 = this.naturalFreq;
        return (float) (d6 * d6);
    }

    public final void setDampingRatio(float f6) {
        if (f6 < 0.0f) {
            PreconditionsKt.throwIllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f6;
    }

    public final void setFinalPosition(float f6) {
        this.finalPosition = f6;
    }

    public final void setStiffness(float f6) {
        if (getStiffness() <= 0.0f) {
            PreconditionsKt.throwIllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f6);
    }

    /* renamed from: updateValues-IJZedt4$animation_core_release, reason: not valid java name */
    public final long m10042updateValuesIJZedt4$animation_core_release(float lastDisplacement, float lastVelocity, long timeElapsed) {
        double dExp;
        double dExp2;
        float f6 = lastDisplacement - this.finalPosition;
        double d6 = timeElapsed / 1000.0d;
        float f7 = this.dampingRatio;
        double d7 = f7 * f7;
        double d8 = this.naturalFreq;
        double d9 = (-f7) * d8;
        if (f7 > 1.0f) {
            double dSqrt = d8 * Math.sqrt(d7 - 1);
            double d10 = d9 + dSqrt;
            double d11 = d9 - dSqrt;
            double d12 = f6;
            double d13 = ((d11 * d12) - lastVelocity) / (d11 - d10);
            double d14 = d12 - d13;
            double d15 = d11 * d6;
            double d16 = d6 * d10;
            dExp2 = (Math.exp(d15) * d14) + (Math.exp(d16) * d13);
            dExp = (d14 * d11 * Math.exp(d15)) + (d13 * d10 * Math.exp(d16));
        } else if (f7 == 1.0f) {
            double d17 = f6;
            double d18 = lastVelocity + (d8 * d17);
            double d19 = (-d8) * d6;
            double d20 = d17 + (d6 * d18);
            dExp2 = d20 * Math.exp(d19);
            dExp = (d20 * Math.exp(d19) * (-this.naturalFreq)) + (d18 * Math.exp(d19));
        } else {
            double d21 = 1;
            double dSqrt2 = d8 * Math.sqrt(d21 - d7);
            double d22 = f6;
            double d23 = (d21 / dSqrt2) * (((-d9) * d22) + lastVelocity);
            double d24 = dSqrt2 * d6;
            double d25 = d6 * d9;
            double dExp3 = Math.exp(d25) * ((Math.cos(d24) * d22) + (Math.sin(d24) * d23));
            dExp = (d9 * dExp3) + (Math.exp(d25) * (((-dSqrt2) * d22 * Math.sin(d24)) + (dSqrt2 * d23 * Math.cos(d24))));
            dExp2 = dExp3;
        }
        return Motion.m10033constructorimpl((Float.floatToRawIntBits((float) dExp) & 4294967295L) | (Float.floatToRawIntBits((float) (dExp2 + this.finalPosition)) << 32));
    }
}
