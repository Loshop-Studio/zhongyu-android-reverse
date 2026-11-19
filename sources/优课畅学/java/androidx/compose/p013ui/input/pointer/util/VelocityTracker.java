package androidx.compose.p013ui.input.pointer.util;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.unit.Velocity;
import androidx.compose.p013ui.unit.VelocityKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class VelocityTracker {
    public static final int $stable = 8;
    private long currentPointerPositionAccumulator;
    private long lastMoveEventTimeStamp;
    private final VelocityTracker1D.Strategy strategy;
    private final VelocityTracker1D xVelocityTracker;
    private final VelocityTracker1D yVelocityTracker;

    public VelocityTracker() {
        VelocityTracker1D.Strategy strategy = VelocityTrackerKt.getVelocityTrackerStrategyUseImpulse() ? VelocityTracker1D.Strategy.Impulse : VelocityTracker1D.Strategy.Lsq2;
        this.strategy = strategy;
        this.xVelocityTracker = new VelocityTracker1D(false, strategy, 1, null);
        this.yVelocityTracker = new VelocityTracker1D(false, strategy, 1, null);
        this.currentPointerPositionAccumulator = Offset.Companion.m24051getZeroF1C5BW0();
    }

    /* renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void m25598addPositionUv8p0NA(long j10, long j11) {
        this.xVelocityTracker.addDataPoint(j10, Float.intBitsToFloat((int) (j11 >> 32)));
        this.yVelocityTracker.addDataPoint(j10, Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    /* renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m25599calculateVelocity9UxMQ8M() {
        return m25600calculateVelocityAH228Gc(VelocityKt.Velocity(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    /* renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public final long m25600calculateVelocityAH228Gc(long j10) {
        if (!(Velocity.m27137getXimpl(j10) > 0.0f && Velocity.m27138getYimpl(j10) > 0.0f)) {
            InlineClassHelperKt.throwIllegalStateException("maximumVelocity should be a positive value. You specified=" + ((Object) Velocity.m27144toStringimpl(j10)));
        }
        return VelocityKt.Velocity(this.xVelocityTracker.calculateVelocity(Velocity.m27137getXimpl(j10)), this.yVelocityTracker.calculateVelocity(Velocity.m27138getYimpl(j10)));
    }

    /* renamed from: getCurrentPointerPositionAccumulator-F1C5BW0$ui_release, reason: not valid java name */
    public final long m25601getCurrentPointerPositionAccumulatorF1C5BW0$ui_release() {
        return this.currentPointerPositionAccumulator;
    }

    public final long getLastMoveEventTimeStamp$ui_release() {
        return this.lastMoveEventTimeStamp;
    }

    public final void resetTracking() {
        this.xVelocityTracker.resetTracking();
        this.yVelocityTracker.resetTracking();
        this.lastMoveEventTimeStamp = 0L;
    }

    /* renamed from: setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release, reason: not valid java name */
    public final void m25602setCurrentPointerPositionAccumulatork4lQ0M$ui_release(long j10) {
        this.currentPointerPositionAccumulator = j10;
    }

    public final void setLastMoveEventTimeStamp$ui_release(long j10) {
        this.lastMoveEventTimeStamp = j10;
    }
}
