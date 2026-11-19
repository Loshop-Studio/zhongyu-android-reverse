package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
final class LongRational {
    private final long mDenominator;
    private final long mNumerator;

    public LongRational(long j7, long j8) {
        this.mNumerator = j7;
        this.mDenominator = j8;
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

    public LongRational(double d9) {
        this((long) (d9 * 10000.0d), 10000L);
    }
}
