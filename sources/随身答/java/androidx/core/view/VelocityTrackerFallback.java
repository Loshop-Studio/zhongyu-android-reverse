package androidx.core.view;

import android.view.MotionEvent;

/* loaded from: classes2.dex */
class VelocityTrackerFallback {
    private static final long ASSUME_POINTER_STOPPED_MS = 40;
    private static final int HISTORY_SIZE = 20;
    private static final long RANGE_MS = 100;
    private final float[] mMovements = new float[20];
    private final long[] mEventTimes = new long[20];
    private float mLastComputedVelocity = 0.0f;
    private int mDataPointsBufferSize = 0;
    private int mDataPointsBufferLastUsedIndex = 0;

    private void clear() {
        this.mDataPointsBufferSize = 0;
        this.mLastComputedVelocity = 0.0f;
    }

    private float getCurrentVelocity() {
        long[] jArr;
        long j9;
        int i9 = this.mDataPointsBufferSize;
        if (i9 < 2) {
            return 0.0f;
        }
        int i10 = this.mDataPointsBufferLastUsedIndex;
        int i11 = ((i10 + 20) - (i9 - 1)) % 20;
        long j10 = this.mEventTimes[i10];
        while (true) {
            jArr = this.mEventTimes;
            j9 = jArr[i11];
            if (j10 - j9 <= RANGE_MS) {
                break;
            }
            this.mDataPointsBufferSize--;
            i11 = (i11 + 1) % 20;
        }
        int i12 = this.mDataPointsBufferSize;
        if (i12 < 2) {
            return 0.0f;
        }
        if (i12 == 2) {
            int i13 = (i11 + 1) % 20;
            if (j9 == jArr[i13]) {
                return 0.0f;
            }
            return this.mMovements[i13] / (r2 - j9);
        }
        float fAbs = 0.0f;
        int i14 = 0;
        for (int i15 = 0; i15 < this.mDataPointsBufferSize - 1; i15++) {
            int i16 = i15 + i11;
            long[] jArr2 = this.mEventTimes;
            long j11 = jArr2[i16 % 20];
            int i17 = (i16 + 1) % 20;
            if (jArr2[i17] != j11) {
                i14++;
                float fKineticEnergyToVelocity = kineticEnergyToVelocity(fAbs);
                float f10 = this.mMovements[i17] / (this.mEventTimes[i17] - j11);
                fAbs += (f10 - fKineticEnergyToVelocity) * Math.abs(f10);
                if (i14 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return kineticEnergyToVelocity(fAbs);
    }

    private static float kineticEnergyToVelocity(float f10) {
        return (f10 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f10) * 2.0f));
    }

    public void addMovement(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.mDataPointsBufferSize != 0 && eventTime - this.mEventTimes[this.mDataPointsBufferLastUsedIndex] > 40) {
            clear();
        }
        int i9 = (this.mDataPointsBufferLastUsedIndex + 1) % 20;
        this.mDataPointsBufferLastUsedIndex = i9;
        int i10 = this.mDataPointsBufferSize;
        if (i10 != 20) {
            this.mDataPointsBufferSize = i10 + 1;
        }
        this.mMovements[i9] = motionEvent.getAxisValue(26);
        this.mEventTimes[this.mDataPointsBufferLastUsedIndex] = eventTime;
    }

    public void computeCurrentVelocity(int i9) {
        computeCurrentVelocity(i9, Float.MAX_VALUE);
    }

    public float getAxisVelocity(int i9) {
        if (i9 != 26) {
            return 0.0f;
        }
        return this.mLastComputedVelocity;
    }

    public void computeCurrentVelocity(int i9, float f10) {
        float currentVelocity = getCurrentVelocity() * i9;
        this.mLastComputedVelocity = currentVelocity;
        if (currentVelocity < (-Math.abs(f10))) {
            this.mLastComputedVelocity = -Math.abs(f10);
        } else if (this.mLastComputedVelocity > Math.abs(f10)) {
            this.mLastComputedVelocity = Math.abs(f10);
        }
    }
}
