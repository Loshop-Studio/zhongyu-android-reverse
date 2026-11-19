package androidx.constraintlayout.core.motion.utils;

import androidx.camera.video.AudioStats;

/* loaded from: classes2.dex */
public class SpringStopEngine implements StopEngine {
    private static final double UNSET = Double.MAX_VALUE;
    private float mLastTime;
    private double mLastVelocity;
    private float mMass;
    private float mPos;
    private double mStiffness;
    private float mStopThreshold;
    private double mTargetPos;

    /* renamed from: mV */
    private float f1317mV;
    double mDamping = 0.5d;
    private boolean mInitialized = false;
    private int mBoundaryMode = 0;

    private void compute(double d10) {
        if (d10 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            return;
        }
        double d11 = this.mStiffness;
        double d12 = this.mDamping;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d11 / this.mMass) * d10) * 4.0d)) + 1.0d);
        double d13 = d10 / iSqrt;
        int i9 = 0;
        while (i9 < iSqrt) {
            float f10 = this.mPos;
            double d14 = this.mTargetPos;
            float f11 = this.f1317mV;
            double d15 = d11;
            double d16 = ((-d11) * (f10 - d14)) - (f11 * d12);
            float f12 = this.mMass;
            double d17 = d12;
            double d18 = f11 + (((d16 / f12) * d13) / 2.0d);
            double d19 = ((((-((f10 + ((d13 * d18) / 2.0d)) - d14)) * d15) - (d18 * d17)) / f12) * d13;
            double d20 = f11 + (d19 / 2.0d);
            float f13 = f11 + ((float) d19);
            this.f1317mV = f13;
            float f14 = f10 + ((float) (d20 * d13));
            this.mPos = f14;
            int i10 = this.mBoundaryMode;
            if (i10 > 0) {
                if (f14 < 0.0f && (i10 & 1) == 1) {
                    this.mPos = -f14;
                    this.f1317mV = -f13;
                }
                float f15 = this.mPos;
                if (f15 > 1.0f && (i10 & 2) == 2) {
                    this.mPos = 2.0f - f15;
                    this.f1317mV = -this.f1317mV;
                }
            }
            i9++;
            d11 = d15;
            d12 = d17;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f10) {
        return null;
    }

    public float getAcceleration() {
        return ((float) (((-this.mStiffness) * (this.mPos - this.mTargetPos)) - (this.mDamping * this.f1317mV))) / this.mMass;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f10) {
        compute(f10 - this.mLastTime);
        this.mLastTime = f10;
        if (isStopped()) {
            this.mPos = (float) this.mTargetPos;
        }
        return this.mPos;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        double d10 = this.mPos - this.mTargetPos;
        double d11 = this.mStiffness;
        double d12 = this.f1317mV;
        return Math.sqrt((((d12 * d12) * ((double) this.mMass)) + ((d11 * d10) * d10)) / d11) <= ((double) this.mStopThreshold);
    }

    public void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ";
        System.out.println(str2 + str);
    }

    public void springConfig(float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i9) {
        this.mTargetPos = f11;
        this.mDamping = f15;
        this.mInitialized = false;
        this.mPos = f10;
        this.mLastVelocity = f12;
        this.mStiffness = f14;
        this.mMass = f13;
        this.mStopThreshold = f16;
        this.mBoundaryMode = i9;
        this.mLastTime = 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f10) {
        return this.f1317mV;
    }
}
