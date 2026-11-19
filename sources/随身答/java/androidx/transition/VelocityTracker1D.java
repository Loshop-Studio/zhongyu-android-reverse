package androidx.transition;

import java.util.Arrays;

/* loaded from: classes3.dex */
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

    private float kineticEnergyToVelocity(float f10) {
        return (float) (Math.signum(f10) * Math.sqrt(Math.abs(f10) * 2.0f));
    }

    public void addDataPoint(long j9, float f10) {
        int i9 = (this.mIndex + 1) % 20;
        this.mIndex = i9;
        this.mTimeSamples[i9] = j9;
        this.mDataSamples[i9] = f10;
    }

    public float calculateVelocity() {
        float fKineticEnergyToVelocity;
        int i9 = this.mIndex;
        if (i9 == 0 && this.mTimeSamples[i9] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j9 = this.mTimeSamples[i9];
        int i10 = 0;
        long j10 = j9;
        while (true) {
            long j11 = this.mTimeSamples[i9];
            if (j11 == Long.MIN_VALUE) {
                break;
            }
            float f10 = j9 - j11;
            float fAbs = Math.abs(j11 - j10);
            if (f10 > 100.0f || fAbs > 40.0f) {
                break;
            }
            if (i9 == 0) {
                i9 = 20;
            }
            i9--;
            i10++;
            if (i10 >= 20) {
                break;
            }
            j10 = j11;
        }
        if (i10 < 2) {
            return 0.0f;
        }
        if (i10 == 2) {
            int i11 = this.mIndex;
            int i12 = i11 == 0 ? 19 : i11 - 1;
            long[] jArr = this.mTimeSamples;
            float f11 = jArr[i11] - jArr[i12];
            if (f11 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.mDataSamples;
            fKineticEnergyToVelocity = (fArr[i11] - fArr[i12]) / f11;
        } else {
            int i13 = this.mIndex;
            int i14 = ((i13 - i10) + 21) % 20;
            int i15 = (i13 + 21) % 20;
            long j12 = this.mTimeSamples[i14];
            float f12 = this.mDataSamples[i14];
            int i16 = i14 + 1;
            float fKineticEnergyToVelocity2 = 0.0f;
            for (int i17 = i16 % 20; i17 != i15; i17 = (i17 + 1) % 20) {
                long j13 = this.mTimeSamples[i17];
                float f13 = j13 - j12;
                if (f13 != 0.0f) {
                    float f14 = this.mDataSamples[i17];
                    float f15 = (f14 - f12) / f13;
                    fKineticEnergyToVelocity2 += (f15 - kineticEnergyToVelocity(fKineticEnergyToVelocity2)) * Math.abs(f15);
                    if (i17 == i16) {
                        fKineticEnergyToVelocity2 *= 0.5f;
                    }
                    f12 = f14;
                    j12 = j13;
                }
            }
            fKineticEnergyToVelocity = kineticEnergyToVelocity(fKineticEnergyToVelocity2);
        }
        return fKineticEnergyToVelocity * 1000.0f;
    }

    public void resetTracking() {
        this.mIndex = 0;
        Arrays.fill(this.mTimeSamples, Long.MIN_VALUE);
        Arrays.fill(this.mDataSamples, 0.0f);
    }
}
