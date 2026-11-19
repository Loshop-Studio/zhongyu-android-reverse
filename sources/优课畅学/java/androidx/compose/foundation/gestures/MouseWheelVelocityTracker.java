package androidx.compose.foundation.gestures;

import androidx.compose.p013ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.p013ui.unit.VelocityKt;

/* loaded from: classes.dex */
final class MouseWheelVelocityTracker {
    private final VelocityTracker1D xVelocityTracker = new VelocityTracker1D(true);
    private final VelocityTracker1D yVelocityTracker = new VelocityTracker1D(true);

    /* renamed from: addDelta-Uv8p0NA, reason: not valid java name */
    public final void m20597addDeltaUv8p0NA(long j10, long j11) {
        this.xVelocityTracker.addDataPoint(j10, Float.intBitsToFloat((int) (j11 >> 32)));
        this.yVelocityTracker.addDataPoint(j10, Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    /* renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m20598calculateVelocity9UxMQ8M() {
        return VelocityKt.Velocity(this.xVelocityTracker.calculateVelocity(Float.MAX_VALUE), this.yVelocityTracker.calculateVelocity(Float.MAX_VALUE));
    }
}
