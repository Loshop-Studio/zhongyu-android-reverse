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

    private float kineticEnergyToVelocity(float f6) {
        return (float) (Math.signum(f6) * Math.sqrt(Math.abs(f6) * 2.0f));
    }

    public void addDataPoint(long j6, float f6) {
        int i6 = (this.mIndex + 1) % 20;
        this.mIndex = i6;
        this.mTimeSamples[i6] = j6;
        this.mDataSamples[i6] = f6;
    }

    public float calculateVelocity() {
        float fKineticEnergyToVelocity;
        int i6 = this.mIndex;
        if (i6 == 0 && this.mTimeSamples[i6] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j6 = this.mTimeSamples[i6];
        int i7 = 0;
        long j7 = j6;
        while (true) {
            long j8 = this.mTimeSamples[i6];
            if (j8 == Long.MIN_VALUE) {
                break;
            }
            float f6 = j6 - j8;
            float fAbs = Math.abs(j8 - j7);
            if (f6 > 100.0f || fAbs > 40.0f) {
                break;
            }
            if (i6 == 0) {
                i6 = 20;
            }
            i6--;
            i7++;
            if (i7 >= 20) {
                break;
            }
            j7 = j8;
        }
        if (i7 < 2) {
            return 0.0f;
        }
        if (i7 == 2) {
            int i8 = this.mIndex;
            int i9 = i8 == 0 ? 19 : i8 - 1;
            long[] jArr = this.mTimeSamples;
            float f7 = jArr[i8] - jArr[i9];
            if (f7 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.mDataSamples;
            fKineticEnergyToVelocity = (fArr[i8] - fArr[i9]) / f7;
        } else {
            int i10 = this.mIndex;
            int i11 = ((i10 - i7) + 21) % 20;
            int i12 = (i10 + 21) % 20;
            long j9 = this.mTimeSamples[i11];
            float f8 = this.mDataSamples[i11];
            int i13 = i11 + 1;
            float fKineticEnergyToVelocity2 = 0.0f;
            for (int i14 = i13 % 20; i14 != i12; i14 = (i14 + 1) % 20) {
                long j10 = this.mTimeSamples[i14];
                float f9 = j10 - j9;
                if (f9 != 0.0f) {
                    float f10 = this.mDataSamples[i14];
                    float f11 = (f10 - f8) / f9;
                    fKineticEnergyToVelocity2 += (f11 - kineticEnergyToVelocity(fKineticEnergyToVelocity2)) * Math.abs(f11);
                    if (i14 == i13) {
                        fKineticEnergyToVelocity2 *= 0.5f;
                    }
                    f8 = f10;
                    j9 = j10;
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
