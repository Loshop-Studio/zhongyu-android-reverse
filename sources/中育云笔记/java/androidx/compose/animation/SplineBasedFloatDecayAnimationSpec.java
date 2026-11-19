package androidx.compose.animation;

import androidx.compose.animation.core.AnimationKt;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    public static final int $stable = 0;
    private final FlingCalculator flingCalculator;

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        this.flingCalculator = new FlingCalculator(SplineBasedFloatDecayAnimationSpec_androidKt.getPlatformFlingScrollFriction(), density);
    }

    private final float flingDistance(float f10) {
        return this.flingCalculator.flingDistance(f10) * Math.signum(f10);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f10, float f11) {
        return this.flingCalculator.flingDuration(f11) * AnimationKt.MillisToNanos;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f10, float f11) {
        return f10 + flingDistance(f11);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j10, float f10, float f11) {
        return f10 + this.flingCalculator.flingInfo(f11).position(j10 / AnimationKt.MillisToNanos);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j10, float f10, float f11) {
        return this.flingCalculator.flingInfo(f11).velocity(j10 / AnimationKt.MillisToNanos);
    }
}
