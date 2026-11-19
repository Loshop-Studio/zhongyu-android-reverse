package androidx.compose.animation.core;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class FloatExponentialDecaySpec implements FloatDecayAnimationSpec {
    public static final int $stable = 0;
    private final float absVelocityThreshold;
    private final float friction;

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatExponentialDecaySpec() {
        float f10 = 0.0f;
        this(f10, f10, 3, null);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f10, float f11) {
        return ((long) ((((float) Math.log(getAbsVelocityThreshold() / Math.abs(f11))) * 1000.0f) / this.friction)) * AnimationKt.MillisToNanos;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f10, float f11) {
        if (Math.abs(f11) <= getAbsVelocityThreshold()) {
            return f10;
        }
        double dLog = Math.log(Math.abs(getAbsVelocityThreshold() / f11));
        float f12 = this.friction;
        return (f10 - (f11 / f12)) + ((f11 / f12) * ((float) Math.exp((f12 * ((dLog / f12) * 1000)) / 1000.0f)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j10, float f10, float f11) {
        long j11 = j10 / AnimationKt.MillisToNanos;
        float f12 = this.friction;
        return (f10 - (f11 / f12)) + ((f11 / f12) * ((float) Math.exp((f12 * j11) / 1000.0f)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j10, float f10, float f11) {
        return f11 * ((float) Math.exp(((j10 / AnimationKt.MillisToNanos) / 1000.0f) * this.friction));
    }

    public FloatExponentialDecaySpec(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false) float f11) {
        this.absVelocityThreshold = Math.max(1.0E-7f, Math.abs(f11));
        this.friction = Math.max(1.0E-4f, f10) * (-4.2f);
    }

    public /* synthetic */ FloatExponentialDecaySpec(float f10, float f11, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 0.1f : f11);
    }
}
