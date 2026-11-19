package androidx.compose.foundation.lazy.layout;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\fR\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\f¨\u0006\u0018"}, m5110d2 = {"Landroidx/compose/foundation/lazy/layout/Averages;", "", "<init>", "()V", "", "new", "current", "calculateAverageTime", "(JJ)J", "timeNanos", "Ld6/s;", "saveCompositionTimeNanos", "(J)V", "saveMeasureTimeNanos", "copy", "()Landroidx/compose/foundation/lazy/layout/Averages;", "compositionTimeNanos", "J", "getCompositionTimeNanos", "()J", "setCompositionTimeNanos", "measureTimeNanos", "getMeasureTimeNanos", "setMeasureTimeNanos", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class Averages {
    private long compositionTimeNanos;
    private long measureTimeNanos;

    private final long calculateAverageTime(long j7, long current) {
        if (current == 0) {
            return j7;
        }
        long j8 = 4;
        return (j7 / j8) + ((current / j8) * 3);
    }

    @NotNull
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

    public final void setCompositionTimeNanos(long j7) {
        this.compositionTimeNanos = j7;
    }

    public final void setMeasureTimeNanos(long j7) {
        this.measureTimeNanos = j7;
    }
}
