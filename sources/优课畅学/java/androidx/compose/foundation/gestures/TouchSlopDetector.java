package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.PointerInputChange;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TouchSlopDetector {
    public static final int $stable = 8;
    private final Orientation orientation;
    private long totalPositionChange;

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j10, AbstractC9126n abstractC9126n) {
        this(orientation, j10);
    }

    /* renamed from: calculatePostSlopOffset-tuRUvjQ, reason: not valid java name */
    private final long m20651calculatePostSlopOffsettuRUvjQ(float f10) {
        if (this.orientation == null) {
            long j10 = this.totalPositionChange;
            return Offset.m24039minusMKHz9U(this.totalPositionChange, Offset.m24042timestuRUvjQ(Offset.m24030divtuRUvjQ(j10, Offset.m24033getDistanceimpl(j10)), f10));
        }
        float fM20654mainAxisk4lQ0M = m20654mainAxisk4lQ0M(this.totalPositionChange) - (Math.signum(m20654mainAxisk4lQ0M(this.totalPositionChange)) * f10);
        float fM20653crossAxisk4lQ0M = m20653crossAxisk4lQ0M(this.totalPositionChange);
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m24027constructorimpl((Float.floatToRawIntBits(fM20654mainAxisk4lQ0M) << 32) | (Float.floatToRawIntBits(fM20653crossAxisk4lQ0M) & 4294967295L));
        }
        return Offset.m24027constructorimpl((Float.floatToRawIntBits(fM20653crossAxisk4lQ0M) << 32) | (Float.floatToRawIntBits(fM20654mainAxisk4lQ0M) & 4294967295L));
    }

    /* renamed from: addPointerInputChange-dBAh8RU, reason: not valid java name */
    public final long m20652addPointerInputChangedBAh8RU(PointerInputChange pointerInputChange, float f10) {
        long jM24040plusMKHz9U = Offset.m24040plusMKHz9U(this.totalPositionChange, Offset.m24039minusMKHz9U(pointerInputChange.m25502getPositionF1C5BW0(), pointerInputChange.m25503getPreviousPositionF1C5BW0()));
        this.totalPositionChange = jM24040plusMKHz9U;
        return (this.orientation == null ? Offset.m24033getDistanceimpl(jM24040plusMKHz9U) : Math.abs(m20654mainAxisk4lQ0M(jM24040plusMKHz9U))) >= f10 ? m20651calculatePostSlopOffsettuRUvjQ(f10) : Offset.Companion.m24050getUnspecifiedF1C5BW0();
    }

    /* renamed from: crossAxis-k-4lQ0M, reason: not valid java name */
    public final float m20653crossAxisk4lQ0M(long j10) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j10 & 4294967295L : j10 >> 32));
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    public final float m20654mainAxisk4lQ0M(long j10) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j10 >> 32 : j10 & 4294967295L));
    }

    public final void reset() {
        this.totalPositionChange = Offset.Companion.m24051getZeroF1C5BW0();
    }

    private TouchSlopDetector(Orientation orientation, long j10) {
        this.orientation = orientation;
        this.totalPositionChange = j10;
    }

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j10, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : orientation, (i10 & 2) != 0 ? Offset.Companion.m24051getZeroF1C5BW0() : j10, null);
    }
}
