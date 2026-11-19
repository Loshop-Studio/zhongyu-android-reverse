package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;
import androidx.work.WorkRequest;

/* loaded from: classes.dex */
final class LongRational {
    private final long mDenominator;
    private final long mNumerator;

    public LongRational(long j9, long j10) {
        this.mNumerator = j9;
        this.mDenominator = j10;
    }

    public long getDenominator() {
        return this.mDenominator;
    }

    public long getNumerator() {
        return this.mNumerator;
    }

    public double toDouble() {
        return this.mNumerator / this.mDenominator;
    }

    @NonNull
    public String toString() {
        return this.mNumerator + "/" + this.mDenominator;
    }

    public LongRational(double d10) {
        this((long) (d10 * 10000.0d), WorkRequest.MIN_BACKOFF_MILLIS);
    }
}
