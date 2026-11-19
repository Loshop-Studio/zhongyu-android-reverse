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
    private float f960mV;
    double mDamping = 0.5d;
    private boolean mInitialized = false;
    private int mBoundaryMode = 0;

    private void compute(double d9) {
        if (d9 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            return;
        }
        double d10 = this.mStiffness;
        double d11 = this.mDamping;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d10 / this.mMass) * d9) * 4.0d)) + 1.0d);
        double d12 = d9 / iSqrt;
        int i = 0;
        while (i < iSqrt) {
            float f = this.mPos;
            double d13 = this.mTargetPos;
            float f7 = this.f960mV;
            double d14 = d10;
            double d15 = ((-d10) * (f - d13)) - (f7 * d11);
            float f8 = this.mMass;
            double d16 = d11;
            double d17 = (((d15 / f8) * d12) / 2.0d) + f7;
            double d18 = ((((-((((d12 * d17) / 2.0d) + f) - d13)) * d14) - (d17 * d16)) / f8) * d12;
            double d19 = (d18 / 2.0d) + f7;
            float f9 = f7 + ((float) d18);
            this.f960mV = f9;
            float f10 = f + ((float) (d19 * d12));
            this.mPos = f10;
            int i8 = this.mBoundaryMode;
            if (i8 > 0) {
                if (f10 < 0.0f && (i8 & 1) == 1) {
                    this.mPos = -f10;
                    this.f960mV = -f9;
                }
                float f11 = this.mPos;
                if (f11 > 1.0f && (i8 & 2) == 2) {
                    this.mPos = 2.0f - f11;
                    this.f960mV = -this.f960mV;
                }
            }
            i++;
            d10 = d14;
            d11 = d16;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f) {
        return null;
    }

    public float getAcceleration() {
        return ((float) (((-this.mStiffness) * (this.mPos - this.mTargetPos)) - (this.mDamping * this.f960mV))) / this.mMass;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f) {
        compute(f - this.mLastTime);
        this.mLastTime = f;
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
        double d9 = this.mPos - this.mTargetPos;
        double d10 = this.mStiffness;
        double d11 = this.f960mV;
        return Math.sqrt((((d10 * d9) * d9) + ((d11 * d11) * ((double) this.mMass))) / d10) <= ((double) this.mStopThreshold);
    }

    public void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ";
        System.out.println(str2 + str);
    }

    public void springConfig(float f, float f7, float f8, float f9, float f10, float f11, float f12, int i) {
        this.mTargetPos = f7;
        this.mDamping = f11;
        this.mInitialized = false;
        this.mPos = f;
        this.mLastVelocity = f8;
        this.mStiffness = f10;
        this.mMass = f9;
        this.mStopThreshold = f12;
        this.mBoundaryMode = i;
        this.mLastTime = 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f) {
        return this.f960mV;
    }
}
