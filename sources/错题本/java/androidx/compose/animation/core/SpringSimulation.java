package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003J-\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\u0004R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\u0004\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, m5110d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "finalPosition", "", "(F)V", "value", "dampingRatio", "getDampingRatio", "()F", "setDampingRatio", "getFinalPosition", "setFinalPosition", "naturalFreq", "", "stiffness", "getStiffness", "setStiffness", "getAcceleration", "lastDisplacement", "lastVelocity", "updateValues", "Landroidx/compose/animation/core/Motion;", "timeElapsed", "", "updateValues-IJZedt4$animation_core_release", "(FFJ)J", "animation-core_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulation\n+ 2 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulationKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,152:1\n38#2:153\n53#3,3:154\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulation\n*L\n149#1:153\n149#1:154,3\n*E\n"})
/* loaded from: classes.dex */
public final class SpringSimulation {
    public static final int $stable = 8;
    private float finalPosition;
    private double naturalFreq = Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public SpringSimulation(float f) {
        this.finalPosition = f;
    }

    public final float getAcceleration(float lastDisplacement, float lastVelocity) {
        float f = lastDisplacement - this.finalPosition;
        double d9 = this.naturalFreq;
        return (float) (((-(d9 * d9)) * f) - (((d9 * 2.0d) * this.dampingRatio) * lastVelocity));
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final float getStiffness() {
        double d9 = this.naturalFreq;
        return (float) (d9 * d9);
    }

    public final void setDampingRatio(float f) {
        if (f < 0.0f) {
            PreconditionsKt.throwIllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f;
    }

    public final void setFinalPosition(float f) {
        this.finalPosition = f;
    }

    public final void setStiffness(float f) {
        if (getStiffness() <= 0.0f) {
            PreconditionsKt.throwIllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f);
    }

    /* renamed from: updateValues-IJZedt4$animation_core_release, reason: not valid java name */
    public final long m6681updateValuesIJZedt4$animation_core_release(float lastDisplacement, float lastVelocity, long timeElapsed) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f = lastDisplacement - this.finalPosition;
        double d9 = timeElapsed / 1000.0d;
        float f7 = this.dampingRatio;
        double d10 = f7 * f7;
        double d11 = this.naturalFreq;
        double d12 = (-f7) * d11;
        if (f7 > 1.0f) {
            double dSqrt = Math.sqrt(d10 - 1) * d11;
            double d13 = d12 + dSqrt;
            double d14 = d12 - dSqrt;
            double d15 = f;
            double d16 = ((d14 * d15) - lastVelocity) / (d14 - d13);
            double d17 = d15 - d16;
            double d18 = d14 * d9;
            double d19 = d9 * d13;
            dSin = (Math.exp(d19) * d16) + (Math.exp(d18) * d17);
            dExp = Math.exp(d18) * d17 * d14;
            dExp2 = Math.exp(d19) * d16 * d13;
        } else {
            if (f7 != 1.0f) {
                double d20 = 1;
                double dSqrt2 = Math.sqrt(d20 - d10) * d11;
                double d21 = f;
                double d22 = (((-d12) * d21) + lastVelocity) * (d20 / dSqrt2);
                double d23 = dSqrt2 * d9;
                double d24 = d9 * d12;
                dSin = ((Math.sin(d23) * d22) + (Math.cos(d23) * d21)) * Math.exp(d24);
                dCos = (((Math.cos(d23) * dSqrt2 * d22) + (Math.sin(d23) * (-dSqrt2) * d21)) * Math.exp(d24)) + (d12 * dSin);
                float f8 = (float) dCos;
                return Motion.m6671constructorimpl((Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + this.finalPosition)) << 32));
            }
            double d25 = f;
            double d26 = (d11 * d25) + lastVelocity;
            double d27 = (-d11) * d9;
            double d28 = (d9 * d26) + d25;
            dSin = Math.exp(d27) * d28;
            dExp = Math.exp(d27) * d28 * (-this.naturalFreq);
            dExp2 = Math.exp(d27) * d26;
        }
        dCos = dExp2 + dExp;
        float f82 = (float) dCos;
        return Motion.m6671constructorimpl((Float.floatToRawIntBits(f82) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + this.finalPosition)) << 32));
    }
}
