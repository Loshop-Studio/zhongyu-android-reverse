package androidx.compose.p014ui.input.pointer;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class HistoricalChange {
    public static final int $stable = 0;
    private long originalEventPosition;
    private final long position;
    private final long uptimeMillis;

    public /* synthetic */ HistoricalChange(long j10, long j11, long j12, AbstractC9972n abstractC9972n) {
        this(j10, j11, j12);
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui_release, reason: not valid java name */
    public final long m32026getOriginalEventPositionF1C5BW0$ui_release() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m32027getPositionF1C5BW0() {
        return this.position;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m30645toStringimpl(this.position)) + ')';
    }

    public /* synthetic */ HistoricalChange(long j10, long j11, AbstractC9972n abstractC9972n) {
        this(j10, j11);
    }

    private HistoricalChange(long j10, long j11) {
        this.uptimeMillis = j10;
        this.position = j11;
        this.originalEventPosition = Offset.Companion.m30653getZeroF1C5BW0();
    }

    private HistoricalChange(long j10, long j11, long j12) {
        this(j10, j11, (AbstractC9972n) null);
        this.originalEventPosition = j12;
    }
}
