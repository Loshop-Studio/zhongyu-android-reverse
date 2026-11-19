package androidx.compose.foundation.gestures;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.input.pointer.PointerInputChange;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TouchSlopDetector {
    public static final int $stable = 8;
    private final Orientation orientation;
    private long totalPositionChange;

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j10, AbstractC9972n abstractC9972n) {
        this(orientation, j10);
    }

    /* renamed from: calculatePostSlopOffset-tuRUvjQ, reason: not valid java name */
    private final long m27253calculatePostSlopOffsettuRUvjQ(float f10) {
        if (this.orientation == null) {
            long j10 = this.totalPositionChange;
            return Offset.m30641minusMKHz9U(this.totalPositionChange, Offset.m30644timestuRUvjQ(Offset.m30632divtuRUvjQ(j10, Offset.m30635getDistanceimpl(j10)), f10));
        }
        float fM27256mainAxisk4lQ0M = m27256mainAxisk4lQ0M(this.totalPositionChange) - (Math.signum(m27256mainAxisk4lQ0M(this.totalPositionChange)) * f10);
        float fM27255crossAxisk4lQ0M = m27255crossAxisk4lQ0M(this.totalPositionChange);
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m30629constructorimpl((Float.floatToRawIntBits(fM27256mainAxisk4lQ0M) << 32) | (Float.floatToRawIntBits(fM27255crossAxisk4lQ0M) & 4294967295L));
        }
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(fM27255crossAxisk4lQ0M) << 32) | (Float.floatToRawIntBits(fM27256mainAxisk4lQ0M) & 4294967295L));
    }

    /* renamed from: addPointerInputChange-dBAh8RU, reason: not valid java name */
    public final long m27254addPointerInputChangedBAh8RU(PointerInputChange pointerInputChange, float f10) {
        long jM30642plusMKHz9U = Offset.m30642plusMKHz9U(this.totalPositionChange, Offset.m30641minusMKHz9U(pointerInputChange.m32104getPositionF1C5BW0(), pointerInputChange.m32105getPreviousPositionF1C5BW0()));
        this.totalPositionChange = jM30642plusMKHz9U;
        return (this.orientation == null ? Offset.m30635getDistanceimpl(jM30642plusMKHz9U) : Math.abs(m27256mainAxisk4lQ0M(jM30642plusMKHz9U))) >= f10 ? m27253calculatePostSlopOffsettuRUvjQ(f10) : Offset.Companion.m30652getUnspecifiedF1C5BW0();
    }

    /* renamed from: crossAxis-k-4lQ0M, reason: not valid java name */
    public final float m27255crossAxisk4lQ0M(long j10) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j10 & 4294967295L : j10 >> 32));
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    public final float m27256mainAxisk4lQ0M(long j10) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j10 >> 32 : j10 & 4294967295L));
    }

    public final void reset() {
        this.totalPositionChange = Offset.Companion.m30653getZeroF1C5BW0();
    }

    private TouchSlopDetector(Orientation orientation, long j10) {
        this.orientation = orientation;
        this.totalPositionChange = j10;
    }

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j10, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : orientation, (i10 & 2) != 0 ? Offset.Companion.m30653getZeroF1C5BW0() : j10, null);
    }
}
