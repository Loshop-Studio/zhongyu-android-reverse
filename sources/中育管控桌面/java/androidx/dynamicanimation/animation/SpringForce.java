package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* loaded from: classes2.dex */
public final class SpringForce implements Force {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    private static final double UNSET = Double.MAX_VALUE;
    private static final double VELOCITY_THRESHOLD_MULTIPLIER = 62.5d;
    private double mDampedFreq;
    double mDampingRatio;
    private double mFinalPosition;
    private double mGammaMinus;
    private double mGammaPlus;
    private boolean mInitialized;
    private final DynamicAnimation.MassState mMassState;
    double mNaturalFreq;
    private double mValueThreshold;
    private double mVelocityThreshold;

    public SpringForce() {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = Double.MAX_VALUE;
        this.mMassState = new DynamicAnimation.MassState();
    }

    private void init() {
        if (this.mInitialized) {
            return;
        }
        if (this.mFinalPosition == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d6 = this.mDampingRatio;
        if (d6 > 1.0d) {
            double d7 = this.mNaturalFreq;
            this.mGammaPlus = ((-d6) * d7) + (d7 * Math.sqrt((d6 * d6) - 1.0d));
            double d8 = this.mDampingRatio;
            double d9 = this.mNaturalFreq;
            this.mGammaMinus = ((-d8) * d9) - (d9 * Math.sqrt((d8 * d8) - 1.0d));
        } else if (d6 >= 0.0d && d6 < 1.0d) {
            this.mDampedFreq = this.mNaturalFreq * Math.sqrt(1.0d - (d6 * d6));
        }
        this.mInitialized = true;
    }

    @Override // androidx.dynamicanimation.animation.Force
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public float getAcceleration(float f6, float f7) {
        float finalPosition = f6 - getFinalPosition();
        double d6 = this.mNaturalFreq;
        return (float) (((-(d6 * d6)) * finalPosition) - (((d6 * 2.0d) * this.mDampingRatio) * f7));
    }

    public float getDampingRatio() {
        return (float) this.mDampingRatio;
    }

    public float getFinalPosition() {
        return (float) this.mFinalPosition;
    }

    public float getStiffness() {
        double d6 = this.mNaturalFreq;
        return (float) (d6 * d6);
    }

    @Override // androidx.dynamicanimation.animation.Force
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean isAtEquilibrium(float f6, float f7) {
        return ((double) Math.abs(f7)) < this.mVelocityThreshold && ((double) Math.abs(f6 - getFinalPosition())) < this.mValueThreshold;
    }

    public SpringForce setDampingRatio(@FloatRange(from = 0.0d) float f6) {
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.mDampingRatio = f6;
        this.mInitialized = false;
        return this;
    }

    public SpringForce setFinalPosition(float f6) {
        this.mFinalPosition = f6;
        return this;
    }

    public SpringForce setStiffness(@FloatRange(from = 0.0d, fromInclusive = false) float f6) {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.mNaturalFreq = Math.sqrt(f6);
        this.mInitialized = false;
        return this;
    }

    public void setValueThreshold(double d6) {
        double dAbs = Math.abs(d6);
        this.mValueThreshold = dAbs;
        this.mVelocityThreshold = dAbs * VELOCITY_THRESHOLD_MULTIPLIER;
    }

    public DynamicAnimation.MassState updateValues(double d6, double d7, long j6) {
        double dPow;
        double dCos;
        init();
        double d8 = j6 / 1000.0d;
        double d9 = d6 - this.mFinalPosition;
        double d10 = this.mDampingRatio;
        if (d10 > 1.0d) {
            double d11 = this.mGammaMinus;
            double d12 = this.mGammaPlus;
            double d13 = d9 - (((d11 * d9) - d7) / (d11 - d12));
            double d14 = ((d9 * d11) - d7) / (d11 - d12);
            dPow = (Math.pow(2.718281828459045d, d11 * d8) * d13) + (Math.pow(2.718281828459045d, this.mGammaPlus * d8) * d14);
            double d15 = this.mGammaMinus;
            double dPow2 = d13 * d15 * Math.pow(2.718281828459045d, d15 * d8);
            double d16 = this.mGammaPlus;
            dCos = dPow2 + (d14 * d16 * Math.pow(2.718281828459045d, d16 * d8));
        } else if (d10 == 1.0d) {
            double d17 = this.mNaturalFreq;
            double d18 = d7 + (d17 * d9);
            double d19 = d9 + (d18 * d8);
            dPow = Math.pow(2.718281828459045d, (-d17) * d8) * d19;
            double dPow3 = d19 * Math.pow(2.718281828459045d, (-this.mNaturalFreq) * d8);
            double d20 = this.mNaturalFreq;
            dCos = (d18 * Math.pow(2.718281828459045d, (-d20) * d8)) + (dPow3 * (-d20));
        } else {
            double d21 = 1.0d / this.mDampedFreq;
            double d22 = this.mNaturalFreq;
            double d23 = d21 * ((d10 * d22 * d9) + d7);
            dPow = Math.pow(2.718281828459045d, (-d10) * d22 * d8) * ((Math.cos(this.mDampedFreq * d8) * d9) + (Math.sin(this.mDampedFreq * d8) * d23));
            double d24 = this.mNaturalFreq;
            double d25 = this.mDampingRatio;
            double dPow4 = Math.pow(2.718281828459045d, (-d25) * d24 * d8);
            double d26 = this.mDampedFreq;
            double dSin = (-d26) * d9 * Math.sin(d26 * d8);
            double d27 = this.mDampedFreq;
            dCos = ((-d24) * dPow * d25) + (dPow4 * (dSin + (d23 * d27 * Math.cos(d27 * d8))));
        }
        DynamicAnimation.MassState massState = this.mMassState;
        massState.mValue = (float) (dPow + this.mFinalPosition);
        massState.mVelocity = (float) dCos;
        return massState;
    }

    public SpringForce(float f6) {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = Double.MAX_VALUE;
        this.mMassState = new DynamicAnimation.MassState();
        this.mFinalPosition = f6;
    }
}
