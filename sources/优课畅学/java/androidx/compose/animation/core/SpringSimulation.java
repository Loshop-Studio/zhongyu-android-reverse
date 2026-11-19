package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SpringSimulation {
    public static final int $stable = 8;
    private float finalPosition;
    private double naturalFreq = Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public SpringSimulation(float f10) {
        this.finalPosition = f10;
    }

    public final float getAcceleration(float f10, float f11) {
        float f12 = f10 - this.finalPosition;
        double d10 = this.naturalFreq;
        return (float) (((-(d10 * d10)) * f12) - (((d10 * 2.0d) * this.dampingRatio) * f11));
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final float getStiffness() {
        double d10 = this.naturalFreq;
        return (float) (d10 * d10);
    }

    public final void setDampingRatio(float f10) {
        if (f10 < 0.0f) {
            PreconditionsKt.throwIllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f10;
    }

    public final void setFinalPosition(float f10) {
        this.finalPosition = f10;
    }

    public final void setStiffness(float f10) {
        if (getStiffness() <= 0.0f) {
            PreconditionsKt.throwIllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f10);
    }

    /* renamed from: updateValues-IJZedt4$animation_core_release, reason: not valid java name */
    public final long m20275updateValuesIJZedt4$animation_core_release(float f10, float f11, long j10) {
        double dExp;
        double dExp2;
        float f12 = f10 - this.finalPosition;
        double d10 = j10 / 1000.0d;
        float f13 = this.dampingRatio;
        double d11 = f13 * f13;
        double d12 = this.naturalFreq;
        double d13 = (-f13) * d12;
        if (f13 > 1.0f) {
            double dSqrt = d12 * Math.sqrt(d11 - 1);
            double d14 = d13 + dSqrt;
            double d15 = d13 - dSqrt;
            double d16 = f12;
            double d17 = ((d15 * d16) - f11) / (d15 - d14);
            double d18 = d16 - d17;
            double d19 = d15 * d10;
            double d20 = d10 * d14;
            dExp2 = (Math.exp(d19) * d18) + (Math.exp(d20) * d17);
            dExp = (d18 * d15 * Math.exp(d19)) + (d17 * d14 * Math.exp(d20));
        } else if (f13 == 1.0f) {
            double d21 = f12;
            double d22 = f11 + (d12 * d21);
            double d23 = (-d12) * d10;
            double d24 = d21 + (d10 * d22);
            dExp2 = d24 * Math.exp(d23);
            dExp = (d24 * Math.exp(d23) * (-this.naturalFreq)) + (d22 * Math.exp(d23));
        } else {
            double d25 = 1;
            double dSqrt2 = d12 * Math.sqrt(d25 - d11);
            double d26 = f12;
            double d27 = (d25 / dSqrt2) * (((-d13) * d26) + f11);
            double d28 = dSqrt2 * d10;
            double d29 = d10 * d13;
            double dExp3 = Math.exp(d29) * ((Math.cos(d28) * d26) + (Math.sin(d28) * d27));
            dExp = (d13 * dExp3) + (Math.exp(d29) * (((-dSqrt2) * d26 * Math.sin(d28)) + (dSqrt2 * d27 * Math.cos(d28))));
            dExp2 = dExp3;
        }
        return Motion.m20265constructorimpl((Float.floatToRawIntBits((float) dExp) & 4294967295L) | (Float.floatToRawIntBits((float) (dExp2 + this.finalPosition)) << 32));
    }
}
