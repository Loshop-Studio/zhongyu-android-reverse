package androidx.constraintlayout.core.motion.utils;

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
    private float f366mV;
    double mDamping = 0.5d;
    private boolean mInitialized = false;
    private int mBoundaryMode = 0;

    private void compute(double d6) {
        if (d6 <= 0.0d) {
            return;
        }
        double d7 = this.mStiffness;
        double d8 = this.mDamping;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d7 / this.mMass) * d6) * 4.0d)) + 1.0d);
        double d9 = d6 / iSqrt;
        int i6 = 0;
        while (i6 < iSqrt) {
            float f6 = this.mPos;
            double d10 = this.mTargetPos;
            float f7 = this.f366mV;
            double d11 = d7;
            double d12 = ((-d7) * (f6 - d10)) - (f7 * d8);
            float f8 = this.mMass;
            double d13 = d8;
            double d14 = f7 + (((d12 / f8) * d9) / 2.0d);
            double d15 = ((((-((f6 + ((d9 * d14) / 2.0d)) - d10)) * d11) - (d14 * d13)) / f8) * d9;
            double d16 = f7 + (d15 / 2.0d);
            float f9 = f7 + ((float) d15);
            this.f366mV = f9;
            float f10 = f6 + ((float) (d16 * d9));
            this.mPos = f10;
            int i7 = this.mBoundaryMode;
            if (i7 > 0) {
                if (f10 < 0.0f && (i7 & 1) == 1) {
                    this.mPos = -f10;
                    this.f366mV = -f9;
                }
                float f11 = this.mPos;
                if (f11 > 1.0f && (i7 & 2) == 2) {
                    this.mPos = 2.0f - f11;
                    this.f366mV = -this.f366mV;
                }
            }
            i6++;
            d7 = d11;
            d8 = d13;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f6) {
        return null;
    }

    public float getAcceleration() {
        return ((float) (((-this.mStiffness) * (this.mPos - this.mTargetPos)) - (this.mDamping * this.f366mV))) / this.mMass;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f6) {
        compute(f6 - this.mLastTime);
        this.mLastTime = f6;
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
        double d6 = this.mPos - this.mTargetPos;
        double d7 = this.mStiffness;
        double d8 = this.f366mV;
        return Math.sqrt((((d8 * d8) * ((double) this.mMass)) + ((d7 * d6) * d6)) / d7) <= ((double) this.mStopThreshold);
    }

    public void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "() ";
        System.out.println(str2 + str);
    }

    public void springConfig(float f6, float f7, float f8, float f9, float f10, float f11, float f12, int i6) {
        this.mTargetPos = f7;
        this.mDamping = f11;
        this.mInitialized = false;
        this.mPos = f6;
        this.mLastVelocity = f8;
        this.mStiffness = f10;
        this.mMass = f9;
        this.mStopThreshold = f12;
        this.mBoundaryMode = i6;
        this.mLastTime = 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f6) {
        return this.f366mV;
    }
}
