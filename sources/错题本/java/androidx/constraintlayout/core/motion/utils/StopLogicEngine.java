package androidx.constraintlayout.core.motion.utils;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.material3.AbstractC1923c;
import com.alibaba.sdk.android.oss.signer.SignParameters;

/* loaded from: classes2.dex */
public class StopLogicEngine implements StopEngine {
    private static final float EPSILON = 1.0E-5f;
    private boolean mBackwards = false;
    private boolean mDone = false;
    private float mLastPosition;
    private float mLastTime;
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

    private float calcY(float f) {
        this.mDone = false;
        float f7 = this.mStage1Duration;
        if (f <= f7) {
            float f8 = this.mStage1Velocity;
            return ((((this.mStage2Velocity - f8) * f) * f) / (f7 * 2.0f)) + (f8 * f);
        }
        int i = this.mNumberOfStages;
        if (i == 1) {
            return this.mStage1EndPosition;
        }
        float f9 = f - f7;
        float f10 = this.mStage2Duration;
        if (f9 < f10) {
            float f11 = this.mStage1EndPosition;
            float f12 = this.mStage2Velocity;
            return ((((this.mStage3Velocity - f12) * f9) * f9) / (f10 * 2.0f)) + (f12 * f9) + f11;
        }
        if (i == 2) {
            return this.mStage2EndPosition;
        }
        float f13 = f9 - f10;
        float f14 = this.mStage3Duration;
        if (f13 > f14) {
            this.mDone = true;
            return this.mStage3EndPosition;
        }
        float f15 = this.mStage2EndPosition;
        float f16 = this.mStage3Velocity;
        return ((f16 * f13) + f15) - (((f16 * f13) * f13) / (f14 * 2.0f));
    }

    private void setup(float f, float f7, float f8, float f9, float f10) {
        this.mDone = false;
        this.mStage3EndPosition = f7;
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        float f11 = f / f8;
        float f12 = (f11 * f) / 2.0f;
        if (f < 0.0f) {
            float fSqrt = (float) Math.sqrt((f7 - ((((-f) / f8) * f) / 2.0f)) * f8);
            if (fSqrt < f9) {
                this.mType = "backward accelerate, decelerate";
                this.mNumberOfStages = 2;
                this.mStage1Velocity = f;
                this.mStage2Velocity = fSqrt;
                this.mStage3Velocity = 0.0f;
                float f13 = (fSqrt - f) / f8;
                this.mStage1Duration = f13;
                this.mStage2Duration = fSqrt / f8;
                this.mStage1EndPosition = ((f + fSqrt) * f13) / 2.0f;
                this.mStage2EndPosition = f7;
                this.mStage3EndPosition = f7;
                return;
            }
            this.mType = "backward accelerate cruse decelerate";
            this.mNumberOfStages = 3;
            this.mStage1Velocity = f;
            this.mStage2Velocity = f9;
            this.mStage3Velocity = f9;
            float f14 = (f9 - f) / f8;
            this.mStage1Duration = f14;
            float f15 = f9 / f8;
            this.mStage3Duration = f15;
            float f16 = ((f + f9) * f14) / 2.0f;
            float f17 = (f15 * f9) / 2.0f;
            this.mStage2Duration = ((f7 - f16) - f17) / f9;
            this.mStage1EndPosition = f16;
            this.mStage2EndPosition = f7 - f17;
            this.mStage3EndPosition = f7;
            return;
        }
        if (f12 >= f7) {
            this.mType = "hard stop";
            this.mNumberOfStages = 1;
            this.mStage1Velocity = f;
            this.mStage2Velocity = 0.0f;
            this.mStage1EndPosition = f7;
            this.mStage1Duration = (2.0f * f7) / f;
            return;
        }
        float f18 = f7 - f12;
        float f19 = f18 / f;
        if (f19 + f11 < f10) {
            this.mType = "cruse decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f;
            this.mStage2Velocity = f;
            this.mStage3Velocity = 0.0f;
            this.mStage1EndPosition = f18;
            this.mStage2EndPosition = f7;
            this.mStage1Duration = f19;
            this.mStage2Duration = f11;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f * f) / 2.0f) + (f8 * f7));
        float f20 = (fSqrt2 - f) / f8;
        this.mStage1Duration = f20;
        float f21 = fSqrt2 / f8;
        this.mStage2Duration = f21;
        if (fSqrt2 < f9) {
            this.mType = "accelerate decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f;
            this.mStage2Velocity = fSqrt2;
            this.mStage3Velocity = 0.0f;
            this.mStage1Duration = f20;
            this.mStage2Duration = f21;
            this.mStage1EndPosition = ((f + fSqrt2) * f20) / 2.0f;
            this.mStage2EndPosition = f7;
            return;
        }
        this.mType = "accelerate cruse decelerate";
        this.mNumberOfStages = 3;
        this.mStage1Velocity = f;
        this.mStage2Velocity = f9;
        this.mStage3Velocity = f9;
        float f22 = (f9 - f) / f8;
        this.mStage1Duration = f22;
        float f23 = f9 / f8;
        this.mStage3Duration = f23;
        float f24 = ((f + f9) * f22) / 2.0f;
        float f25 = (f23 * f9) / 2.0f;
        this.mStage2Duration = ((f7 - f24) - f25) / f9;
        this.mStage1EndPosition = f24;
        this.mStage2EndPosition = f7 - f25;
        this.mStage3EndPosition = f7;
    }

    public void config(float f, float f7, float f8, float f9, float f10, float f11) {
        this.mDone = false;
        this.mStartPosition = f;
        boolean z8 = f > f7;
        this.mBackwards = z8;
        if (z8) {
            setup(-f8, f - f7, f10, f11, f9);
        } else {
            setup(f8, f7 - f, f10, f11, f9);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f) {
        StringBuilder sbM98w = AbstractC0037f.m98w(AbstractC0037f.m91p(AbstractC0037f.m98w(str, " ===== "), this.mType, SignParameters.NEW_LINE), str);
        sbM98w.append(this.mBackwards ? "backwards" : "forward ");
        sbM98w.append(" time = ");
        sbM98w.append(f);
        sbM98w.append("  stages ");
        String strM90o = AbstractC0037f.m90o(sbM98w, SignParameters.NEW_LINE, this.mNumberOfStages);
        StringBuilder sb = new StringBuilder();
        sb.append(strM90o);
        sb.append(str);
        sb.append(" dur ");
        sb.append(this.mStage1Duration);
        sb.append(" vel ");
        sb.append(this.mStage1Velocity);
        sb.append(" pos ");
        String strM89n = AbstractC0037f.m89n(sb, SignParameters.NEW_LINE, this.mStage1EndPosition);
        if (this.mNumberOfStages > 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strM89n);
            sb2.append(str);
            sb2.append(" dur ");
            sb2.append(this.mStage2Duration);
            sb2.append(" vel ");
            sb2.append(this.mStage2Velocity);
            sb2.append(" pos ");
            strM89n = AbstractC0037f.m89n(sb2, SignParameters.NEW_LINE, this.mStage2EndPosition);
        }
        if (this.mNumberOfStages > 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strM89n);
            sb3.append(str);
            sb3.append(" dur ");
            sb3.append(this.mStage3Duration);
            sb3.append(" vel ");
            sb3.append(this.mStage3Velocity);
            sb3.append(" pos ");
            strM89n = AbstractC0037f.m89n(sb3, SignParameters.NEW_LINE, this.mStage3EndPosition);
        }
        float f7 = this.mStage1Duration;
        if (f <= f7) {
            return AbstractC0037f.m75D(strM89n, str, "stage 0\n");
        }
        int i = this.mNumberOfStages;
        if (i == 1) {
            return AbstractC0037f.m75D(strM89n, str, "end stage 0\n");
        }
        float f8 = f - f7;
        float f9 = this.mStage2Duration;
        return f8 < f9 ? AbstractC0037f.m75D(strM89n, str, " stage 1\n") : i == 2 ? AbstractC0037f.m75D(strM89n, str, "end stage 1\n") : f8 - f9 < this.mStage3Duration ? AbstractC0037f.m75D(strM89n, str, " stage 2\n") : AbstractC0037f.m75D(strM89n, str, " end stage 2\n");
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f) {
        float fCalcY = calcY(f);
        this.mLastPosition = fCalcY;
        this.mLastTime = f;
        return this.mBackwards ? this.mStartPosition - fCalcY : this.mStartPosition + fCalcY;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f) {
        float f7;
        float f8;
        float f9 = this.mStage1Duration;
        if (f <= f9) {
            f7 = this.mStage1Velocity;
            f8 = this.mStage2Velocity;
        } else {
            int i = this.mNumberOfStages;
            if (i == 1) {
                return 0.0f;
            }
            f -= f9;
            f9 = this.mStage2Duration;
            if (f >= f9) {
                if (i == 2) {
                    return 0.0f;
                }
                float f10 = f - f9;
                float f11 = this.mStage3Duration;
                if (f10 >= f11) {
                    return 0.0f;
                }
                float f12 = this.mStage3Velocity;
                return AbstractC1923c.m1036D(f12, f10, f11, f12);
            }
            f7 = this.mStage2Velocity;
            f8 = this.mStage3Velocity;
        }
        return (((f8 - f7) * f) / f9) + f7;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        return getVelocity() < EPSILON && Math.abs(this.mStage3EndPosition - this.mLastPosition) < EPSILON;
    }

    public static class Decelerate implements StopEngine {
        private float mAcceleration;
        private float mDestination;
        private boolean mDone = false;
        private float mDuration;
        private float mInitialPos;
        private float mInitialVelocity;
        private float mLastVelocity;

        public void config(float f, float f7, float f8) {
            this.mDone = false;
            this.mDestination = f7;
            this.mInitialVelocity = f8;
            this.mInitialPos = f;
            float f9 = (f7 - f) / (f8 / 2.0f);
            this.mDuration = f9;
            this.mAcceleration = (-f8) / f9;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public String debug(String str, float f) {
            return this.mDuration + " " + this.mLastVelocity;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getInterpolation(float f) {
            if (f > this.mDuration) {
                this.mDone = true;
                return this.mDestination;
            }
            getVelocity(f);
            return ((((this.mAcceleration * f) / 2.0f) + this.mInitialVelocity) * f) + this.mInitialPos;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getVelocity(float f) {
            if (f > this.mDuration) {
                return 0.0f;
            }
            float f7 = (this.mAcceleration * f) + this.mInitialVelocity;
            this.mLastVelocity = f7;
            return f7;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public boolean isStopped() {
            return this.mDone;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getVelocity() {
            return this.mLastVelocity;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return this.mBackwards ? -getVelocity(this.mLastTime) : getVelocity(this.mLastTime);
    }
}
