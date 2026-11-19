package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class HistoricalChange {
    public static final int $stable = 0;
    private long originalEventPosition;
    private final long position;
    private final long uptimeMillis;

    public /* synthetic */ HistoricalChange(long j10, long j11, long j12, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12);
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui_release, reason: not valid java name */
    public final long m25424getOriginalEventPositionF1C5BW0$ui_release() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m25425getPositionF1C5BW0() {
        return this.position;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m24043toStringimpl(this.position)) + ')';
    }

    public /* synthetic */ HistoricalChange(long j10, long j11, AbstractC9126n abstractC9126n) {
        this(j10, j11);
    }

    private HistoricalChange(long j10, long j11) {
        this.uptimeMillis = j10;
        this.position = j11;
        this.originalEventPosition = Offset.Companion.m24051getZeroF1C5BW0();
    }

    private HistoricalChange(long j10, long j11, long j12) {
        this(j10, j11, (AbstractC9126n) null);
        this.originalEventPosition = j12;
    }
}
