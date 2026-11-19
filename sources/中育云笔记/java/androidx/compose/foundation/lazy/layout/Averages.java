package androidx.compose.foundation.lazy.layout;

/* loaded from: classes.dex */
final class Averages {
    private long compositionTimeNanos;
    private long measureTimeNanos;

    private final long calculateAverageTime(long j10, long j11) {
        if (j11 == 0) {
            return j10;
        }
        long j12 = 4;
        return ((j11 / j12) * 3) + (j10 / j12);
    }

    public final Averages copy() {
        Averages averages = new Averages();
        averages.compositionTimeNanos = this.compositionTimeNanos;
        averages.measureTimeNanos = this.measureTimeNanos;
        return averages;
    }

    public final long getCompositionTimeNanos() {
        return this.compositionTimeNanos;
    }

    public final long getMeasureTimeNanos() {
        return this.measureTimeNanos;
    }

    public final void saveCompositionTimeNanos(long j10) {
        this.compositionTimeNanos = calculateAverageTime(j10, this.compositionTimeNanos);
    }

    public final void saveMeasureTimeNanos(long j10) {
        this.measureTimeNanos = calculateAverageTime(j10, this.measureTimeNanos);
    }

    public final void setCompositionTimeNanos(long j10) {
        this.compositionTimeNanos = j10;
    }

    public final void setMeasureTimeNanos(long j10) {
        this.measureTimeNanos = j10;
    }
}
