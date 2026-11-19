package androidx.compose.animation.core;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m5174d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0002J0\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u0004R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\u0004\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, m5175d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "finalPosition", "", "(F)V", "dampedFreq", "", "value", "dampingRatio", "getDampingRatio", "()F", "setDampingRatio", "getFinalPosition", "setFinalPosition", "gammaMinus", "gammaPlus", "initialized", "", "naturalFreq", "stiffness", "getStiffness", "setStiffness", "getAcceleration", "lastDisplacement", "lastVelocity", "init", "", "updateValues", "Landroidx/compose/animation/core/Motion;", "timeElapsed", "", "updateValues-IJZedt4$animation_core_release", "(FFJ)J", "animation-core_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SpringSimulation {
    private double dampedFreq;
    private float finalPosition;
    private double gammaMinus;
    private double gammaPlus;
    private boolean initialized;
    private double naturalFreq = Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public SpringSimulation(float f4) {
        this.finalPosition = f4;
    }

    private final void init() {
        if (this.initialized) {
            return;
        }
        if (this.finalPosition == SpringSimulationKt.getUNSET()) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f4 = this.dampingRatio;
        double d4 = f4 * f4;
        if (f4 > 1.0f) {
            double d5 = this.naturalFreq;
            double d6 = d4 - 1;
            this.gammaPlus = ((-f4) * d5) + (d5 * Math.sqrt(d6));
            double d7 = -this.dampingRatio;
            double d8 = this.naturalFreq;
            this.gammaMinus = (d7 * d8) - (d8 * Math.sqrt(d6));
        } else if (f4 >= 0.0f && f4 < 1.0f) {
            this.dampedFreq = this.naturalFreq * Math.sqrt(1 - d4);
        }
        this.initialized = true;
    }

    public final float getAcceleration(float lastDisplacement, float lastVelocity) {
        float f4 = lastDisplacement - this.finalPosition;
        double d4 = this.naturalFreq;
        return (float) (((-(d4 * d4)) * f4) - (((d4 * 2.0d) * this.dampingRatio) * lastVelocity));
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final float getStiffness() {
        double d4 = this.naturalFreq;
        return (float) (d4 * d4);
    }

    public final void setDampingRatio(float f4) {
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f4;
        this.initialized = false;
    }

    public final void setFinalPosition(float f4) {
        this.finalPosition = f4;
    }

    public final void setStiffness(float f4) {
        if (getStiffness() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f4);
        this.initialized = false;
    }

    /* renamed from: updateValues-IJZedt4$animation_core_release, reason: not valid java name */
    public final long m7024updateValuesIJZedt4$animation_core_release(float lastDisplacement, float lastVelocity, long timeElapsed) {
        double dCos;
        double dExp;
        init();
        float f4 = lastDisplacement - this.finalPosition;
        double d4 = timeElapsed / 1000.0d;
        float f5 = this.dampingRatio;
        if (f5 > 1.0f) {
            double d5 = f4;
            double d6 = this.gammaMinus;
            double d7 = lastVelocity;
            double d8 = this.gammaPlus;
            double d9 = d5 - (((d6 * d5) - d7) / (d6 - d8));
            double d10 = ((d5 * d6) - d7) / (d6 - d8);
            dExp = (Math.exp(d6 * d4) * d9) + (Math.exp(this.gammaPlus * d4) * d10);
            double d11 = this.gammaMinus;
            double dExp2 = d9 * d11 * Math.exp(d11 * d4);
            double d12 = this.gammaPlus;
            dCos = dExp2 + (d10 * d12 * Math.exp(d12 * d4));
        } else {
            if (f5 == 1.0f) {
                double d13 = this.naturalFreq;
                double d14 = f4;
                double d15 = lastVelocity + (d13 * d14);
                double d16 = d14 + (d15 * d4);
                double dExp3 = Math.exp((-d13) * d4) * d16;
                double dExp4 = d16 * Math.exp((-this.naturalFreq) * d4);
                double d17 = this.naturalFreq;
                dCos = (dExp4 * (-d17)) + (d15 * Math.exp((-d17) * d4));
                dExp = dExp3;
            } else {
                double d18 = 1 / this.dampedFreq;
                double d19 = this.naturalFreq;
                double d20 = f4;
                double d21 = d18 * ((f5 * d19 * d20) + lastVelocity);
                double dExp5 = Math.exp((-f5) * d19 * d4) * ((Math.cos(this.dampedFreq * d4) * d20) + (Math.sin(this.dampedFreq * d4) * d21));
                double d22 = this.naturalFreq;
                double d23 = (-d22) * dExp5 * this.dampingRatio;
                double dExp6 = Math.exp((-r5) * d22 * d4);
                double d24 = this.dampedFreq;
                double dSin = (-d24) * d20 * Math.sin(d24 * d4);
                double d25 = this.dampedFreq;
                dCos = d23 + (dExp6 * (dSin + (d21 * d25 * Math.cos(d25 * d4))));
                dExp = dExp5;
            }
        }
        return SpringSimulationKt.Motion((float) (dExp + this.finalPosition), (float) dCos);
    }
}
