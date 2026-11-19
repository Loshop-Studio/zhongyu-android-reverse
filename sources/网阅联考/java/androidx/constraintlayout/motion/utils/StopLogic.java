package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.motion.widget.MotionInterpolator;

/* loaded from: classes.dex */
public class StopLogic extends MotionInterpolator {
    private boolean mBackwards = false;
    private float mLastPosition;
    private int mNumberOfStages;
    private float mStage1Duration;
    private float mStage1EndPosition;
    private float mStage1Velocity;
    private float mStage2Duration;
    private float mStage2EndPosition;
    private float mStage2Velocity;
    private float mStage3Duration;
    private float mStage3EndPosition;
    private float mStage3Velocity;
    private float mStartPosition;
    private String mType;

    private float calcY(float f4) {
        float f5 = this.mStage1Duration;
        if (f4 <= f5) {
            float f6 = this.mStage1Velocity;
            return (f6 * f4) + ((((this.mStage2Velocity - f6) * f4) * f4) / (f5 * 2.0f));
        }
        int i4 = this.mNumberOfStages;
        if (i4 == 1) {
            return this.mStage1EndPosition;
        }
        float f7 = f4 - f5;
        float f8 = this.mStage2Duration;
        if (f7 < f8) {
            float f9 = this.mStage1EndPosition;
            float f10 = this.mStage2Velocity;
            return f9 + (f10 * f7) + ((((this.mStage3Velocity - f10) * f7) * f7) / (f8 * 2.0f));
        }
        if (i4 == 2) {
            return this.mStage2EndPosition;
        }
        float f11 = f7 - f8;
        float f12 = this.mStage3Duration;
        if (f11 >= f12) {
            return this.mStage3EndPosition;
        }
        float f13 = this.mStage2EndPosition;
        float f14 = this.mStage3Velocity;
        return (f13 + (f14 * f11)) - (((f14 * f11) * f11) / (f12 * 2.0f));
    }

    private void setup(float f4, float f5, float f6, float f7, float f8) {
        if (f4 == 0.0f) {
            f4 = 1.0E-4f;
        }
        this.mStage1Velocity = f4;
        float f9 = f4 / f6;
        float f10 = (f9 * f4) / 2.0f;
        if (f4 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f5 - ((((-f4) / f6) * f4) / 2.0f)) * f6);
            if (fSqrt < f7) {
                this.mType = "backward accelerate, decelerate";
                this.mNumberOfStages = 2;
                this.mStage1Velocity = f4;
                this.mStage2Velocity = fSqrt;
                this.mStage3Velocity = 0.0f;
                float f11 = (fSqrt - f4) / f6;
                this.mStage1Duration = f11;
                this.mStage2Duration = fSqrt / f6;
                this.mStage1EndPosition = ((f4 + fSqrt) * f11) / 2.0f;
                this.mStage2EndPosition = f5;
                this.mStage3EndPosition = f5;
                return;
            }
            this.mType = "backward accelerate cruse decelerate";
            this.mNumberOfStages = 3;
            this.mStage1Velocity = f4;
            this.mStage2Velocity = f7;
            this.mStage3Velocity = f7;
            float f12 = (f7 - f4) / f6;
            this.mStage1Duration = f12;
            float f13 = f7 / f6;
            this.mStage3Duration = f13;
            float f14 = ((f4 + f7) * f12) / 2.0f;
            float f15 = (f13 * f7) / 2.0f;
            this.mStage2Duration = ((f5 - f14) - f15) / f7;
            this.mStage1EndPosition = f14;
            this.mStage2EndPosition = f5 - f15;
            this.mStage3EndPosition = f5;
            return;
        }
        if (f10 >= f5) {
            this.mType = "hard stop";
            this.mNumberOfStages = 1;
            this.mStage1Velocity = f4;
            this.mStage2Velocity = 0.0f;
            this.mStage1EndPosition = f5;
            this.mStage1Duration = (2.0f * f5) / f4;
            return;
        }
        float f16 = f5 - f10;
        float f17 = f16 / f4;
        if (f17 + f9 < f8) {
            this.mType = "cruse decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f4;
            this.mStage2Velocity = f4;
            this.mStage3Velocity = 0.0f;
            this.mStage1EndPosition = f16;
            this.mStage2EndPosition = f5;
            this.mStage1Duration = f17;
            this.mStage2Duration = f9;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f6 * f5) + ((f4 * f4) / 2.0f));
        float f18 = (fSqrt2 - f4) / f6;
        this.mStage1Duration = f18;
        float f19 = fSqrt2 / f6;
        this.mStage2Duration = f19;
        if (fSqrt2 < f7) {
            this.mType = "accelerate decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f4;
            this.mStage2Velocity = fSqrt2;
            this.mStage3Velocity = 0.0f;
            this.mStage1Duration = f18;
            this.mStage2Duration = f19;
            this.mStage1EndPosition = ((f4 + fSqrt2) * f18) / 2.0f;
            this.mStage2EndPosition = f5;
            return;
        }
        this.mType = "accelerate cruse decelerate";
        this.mNumberOfStages = 3;
        this.mStage1Velocity = f4;
        this.mStage2Velocity = f7;
        this.mStage3Velocity = f7;
        float f20 = (f7 - f4) / f6;
        this.mStage1Duration = f20;
        float f21 = f7 / f6;
        this.mStage3Duration = f21;
        float f22 = ((f4 + f7) * f20) / 2.0f;
        float f23 = (f21 * f7) / 2.0f;
        this.mStage2Duration = ((f5 - f22) - f23) / f7;
        this.mStage1EndPosition = f22;
        this.mStage2EndPosition = f5 - f23;
        this.mStage3EndPosition = f5;
    }

    public void config(float f4, float f5, float f6, float f7, float f8, float f9) {
        this.mStartPosition = f4;
        boolean z3 = f4 > f5;
        this.mBackwards = z3;
        if (z3) {
            setup(-f6, f4 - f5, f8, f9, f7);
        } else {
            setup(f6, f5 - f4, f8, f9, f7);
        }
    }

    public void debug(String str, String str2, float f4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" ===== ");
        sb.append(this.mType);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(this.mBackwards ? "backwards" : "forward ");
        sb2.append(" time = ");
        sb2.append(f4);
        sb2.append("  stages ");
        sb2.append(this.mNumberOfStages);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append(" dur ");
        sb3.append(this.mStage1Duration);
        sb3.append(" vel ");
        sb3.append(this.mStage1Velocity);
        sb3.append(" pos ");
        sb3.append(this.mStage1EndPosition);
        if (this.mNumberOfStages > 1) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            sb4.append(" dur ");
            sb4.append(this.mStage2Duration);
            sb4.append(" vel ");
            sb4.append(this.mStage2Velocity);
            sb4.append(" pos ");
            sb4.append(this.mStage2EndPosition);
        }
        if (this.mNumberOfStages > 2) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str2);
            sb5.append(" dur ");
            sb5.append(this.mStage3Duration);
            sb5.append(" vel ");
            sb5.append(this.mStage3Velocity);
            sb5.append(" pos ");
            sb5.append(this.mStage3EndPosition);
        }
        float f5 = this.mStage1Duration;
        if (f4 <= f5) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str2);
            sb6.append("stage 0");
            return;
        }
        int i4 = this.mNumberOfStages;
        if (i4 == 1) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str2);
            sb7.append("end stage 0");
            return;
        }
        float f6 = f4 - f5;
        float f7 = this.mStage2Duration;
        if (f6 < f7) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append(str2);
            sb8.append(" stage 1");
        } else if (i4 == 2) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str2);
            sb9.append("end stage 1");
        } else if (f6 - f7 < this.mStage3Duration) {
            StringBuilder sb10 = new StringBuilder();
            sb10.append(str2);
            sb10.append(" stage 2");
        } else {
            StringBuilder sb11 = new StringBuilder();
            sb11.append(str2);
            sb11.append(" end stage 2");
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
    public float getInterpolation(float f4) {
        float fCalcY = calcY(f4);
        this.mLastPosition = f4;
        return this.mBackwards ? this.mStartPosition - fCalcY : this.mStartPosition + fCalcY;
    }

    public float getVelocity(float f4) {
        float f5 = this.mStage1Duration;
        if (f4 <= f5) {
            float f6 = this.mStage1Velocity;
            return f6 + (((this.mStage2Velocity - f6) * f4) / f5);
        }
        int i4 = this.mNumberOfStages;
        if (i4 == 1) {
            return 0.0f;
        }
        float f7 = f4 - f5;
        float f8 = this.mStage2Duration;
        if (f7 < f8) {
            float f9 = this.mStage2Velocity;
            return f9 + (((this.mStage3Velocity - f9) * f7) / f8);
        }
        if (i4 == 2) {
            return this.mStage2EndPosition;
        }
        float f10 = f7 - f8;
        float f11 = this.mStage3Duration;
        if (f10 >= f11) {
            return this.mStage3EndPosition;
        }
        float f12 = this.mStage3Velocity;
        return f12 - ((f10 * f12) / f11);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
    public float getVelocity() {
        return this.mBackwards ? -getVelocity(this.mLastPosition) : getVelocity(this.mLastPosition);
    }
}
