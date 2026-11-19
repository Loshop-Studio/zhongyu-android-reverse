package androidx.compose.foundation.lazy.layout;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0006\u0010\u000f\u001a\u00020\u0000J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0014"}, m13413d2 = {"Landroidx/compose/foundation/lazy/layout/Averages;", "", "()V", "compositionTimeNanos", "", "getCompositionTimeNanos", "()J", "setCompositionTimeNanos", "(J)V", "measureTimeNanos", "getMeasureTimeNanos", "setMeasureTimeNanos", "calculateAverageTime", "new", "current", "copy", "saveCompositionTimeNanos", "", "timeNanos", "saveMeasureTimeNanos", "foundation_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class Averages {
    private long compositionTimeNanos;
    private long measureTimeNanos;

    private final long calculateAverageTime(long j9, long current) {
        if (current == 0) {
            return j9;
        }
        long j10 = 4;
        return ((current / j10) * 3) + (j9 / j10);
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

    public final void saveCompositionTimeNanos(long timeNanos) {
        this.compositionTimeNanos = calculateAverageTime(timeNanos, this.compositionTimeNanos);
    }

    public final void saveMeasureTimeNanos(long timeNanos) {
        this.measureTimeNanos = calculateAverageTime(timeNanos, this.measureTimeNanos);
    }

    public final void setCompositionTimeNanos(long j9) {
        this.compositionTimeNanos = j9;
    }

    public final void setMeasureTimeNanos(long j9) {
        this.measureTimeNanos = j9;
    }
}
