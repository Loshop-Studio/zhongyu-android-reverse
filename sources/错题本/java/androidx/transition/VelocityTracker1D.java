package androidx.transition;

import java.util.Arrays;

/* loaded from: classes2.dex */
class VelocityTracker1D {
    private static final int ASSUME_POINTER_MOVE_STOPPED_MILLIS = 40;
    private static final int HISTORY_SIZE = 20;
    private static final int HORIZON_MILLIS = 100;
    private float[] mDataSamples = new float[20];
    private int mIndex = 0;
    private long[] mTimeSamples;

    public VelocityTracker1D() {
        long[] jArr = new long[20];
        this.mTimeSamples = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    private float kineticEnergyToVelocity(float f) {
        return (float) (Math.sqrt(Math.abs(f) * 2.0f) * Math.signum(f));
    }

    public void addDataPoint(long j7, float f) {
        int i = (this.mIndex + 1) % 20;
        this.mIndex = i;
        this.mTimeSamples[i] = j7;
        this.mDataSamples[i] = f;
    }

    public float calculateVelocity() {
        float fKineticEnergyToVelocity;
        int i = this.mIndex;
        if (i == 0 && this.mTimeSamples[i] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j7 = this.mTimeSamples[i];
        int i8 = 0;
        long j8 = j7;
        while (true) {
            long j9 = this.mTimeSamples[i];
            if (j9 == Long.MIN_VALUE) {
                break;
            }
            float f = j7 - j9;
            float fAbs = Math.abs(j9 - j8);
            if (f > 100.0f || fAbs > 40.0f) {
                break;
            }
            if (i == 0) {
                i = 20;
            }
            i--;
            i8++;
            if (i8 >= 20) {
                break;
            }
            j8 = j9;
        }
        if (i8 < 2) {
            return 0.0f;
        }
        if (i8 == 2) {
            int i9 = this.mIndex;
            int i10 = i9 == 0 ? 19 : i9 - 1;
            long[] jArr = this.mTimeSamples;
            float f7 = jArr[i9] - jArr[i10];
            if (f7 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.mDataSamples;
            fKineticEnergyToVelocity = (fArr[i9] - fArr[i10]) / f7;
        } else {
            int i11 = this.mIndex;
            int i12 = ((i11 - i8) + 21) % 20;
            int i13 = (i11 + 21) % 20;
            long j10 = this.mTimeSamples[i12];
            float f8 = this.mDataSamples[i12];
            int i14 = i12 + 1;
            float f9 = 0.0f;
            for (int i15 = i14 % 20; i15 != i13; i15 = (i15 + 1) % 20) {
                long j11 = this.mTimeSamples[i15];
                float f10 = j11 - j10;
                if (f10 != 0.0f) {
                    float f11 = this.mDataSamples[i15];
                    float f12 = (f11 - f8) / f10;
                    float fAbs2 = (Math.abs(f12) * (f12 - kineticEnergyToVelocity(f9))) + f9;
                    if (i15 == i14) {
                        fAbs2 *= 0.5f;
                    }
                    f9 = fAbs2;
                    f8 = f11;
                    j10 = j11;
                }
            }
            fKineticEnergyToVelocity = kineticEnergyToVelocity(f9);
        }
        return fKineticEnergyToVelocity * 1000.0f;
    }

    public void resetTracking() {
        this.mIndex = 0;
        Arrays.fill(this.mTimeSamples, Long.MIN_VALUE);
        Arrays.fill(this.mDataSamples, 0.0f);
    }
}
