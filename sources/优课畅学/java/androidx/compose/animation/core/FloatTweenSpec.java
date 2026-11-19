package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class FloatTweenSpec implements FloatAnimationSpec {
    public static final int $stable = 0;
    private final int delay;
    private final long delayNanos;
    private final int duration;
    private final long durationNanos;
    private final Easing easing;

    public FloatTweenSpec() {
        this(0, 0, null, 7, null);
    }

    private final long clampPlayTimeNanos(long j10) {
        long j11 = j10 - this.delayNanos;
        long j12 = this.durationNanos;
        if (j11 < 0) {
            j11 = 0;
        }
        return j11 > j12 ? j12 : j11;
    }

    public final int getDelay() {
        return this.delay;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f10, float f11, float f12) {
        return this.delayNanos + this.durationNanos;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long j10, float f10, float f11, float f12) {
        long j11 = j10 - this.delayNanos;
        long j12 = this.durationNanos;
        if (j11 < 0) {
            j11 = 0;
        }
        if (j11 > j12) {
            j11 = j12;
        }
        float fTransform = this.easing.transform(this.duration == 0 ? 1.0f : j11 / j12);
        return (f10 * (1 - fTransform)) + (f11 * fTransform);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long j10, float f10, float f11, float f12) {
        long j11 = j10 - this.delayNanos;
        long j12 = this.durationNanos;
        if (j11 < 0) {
            j11 = 0;
        }
        long j13 = j11 > j12 ? j12 : j11;
        if (j13 == 0) {
            return f12;
        }
        return (getValueFromNanos(j13, f10, f11, f12) - getValueFromNanos(j13 - AnimationKt.MillisToNanos, f10, f11, f12)) * 1000.0f;
    }

    public FloatTweenSpec(int i10, int i11, Easing easing) {
        this.duration = i10;
        this.delay = i11;
        this.easing = easing;
        this.durationNanos = i10 * AnimationKt.MillisToNanos;
        this.delayNanos = i11 * AnimationKt.MillisToNanos;
    }

    public /* synthetic */ FloatTweenSpec(int i10, int i11, Easing easing, int i12, AbstractC9126n abstractC9126n) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing);
    }
}
