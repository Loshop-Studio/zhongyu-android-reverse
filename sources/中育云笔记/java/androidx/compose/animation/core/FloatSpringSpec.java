package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FloatSpringSpec implements FloatAnimationSpec {
    public static final int $stable = 8;
    private final float dampingRatio;
    private final SpringSimulation spring;
    private final float stiffness;
    private final float visibilityThreshold;

    public FloatSpringSpec() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f10, float f11, float f12) {
        float stiffness = this.spring.getStiffness();
        float dampingRatio = this.spring.getDampingRatio();
        float f13 = f10 - f11;
        float f14 = this.visibilityThreshold;
        return SpringEstimationKt.estimateAnimationDurationMillis(stiffness, dampingRatio, f12 / f14, f13 / f14, 1.0f) * AnimationKt.MillisToNanos;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getEndVelocity(float f10, float f11, float f12) {
        return 0.0f;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long j10, float f10, float f11, float f12) {
        long j11 = j10 / AnimationKt.MillisToNanos;
        this.spring.setFinalPosition(f11);
        return Float.intBitsToFloat((int) (this.spring.m26877updateValuesIJZedt4$animation_core_release(f10, f12, j11) >> 32));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long j10, float f10, float f11, float f12) {
        long j11 = j10 / AnimationKt.MillisToNanos;
        this.spring.setFinalPosition(f11);
        return Float.intBitsToFloat((int) (this.spring.m26877updateValuesIJZedt4$animation_core_release(f10, f12, j11) & 4294967295L));
    }

    public FloatSpringSpec(float f10, float f11, float f12) {
        this.dampingRatio = f10;
        this.stiffness = f11;
        this.visibilityThreshold = f12;
        SpringSimulation springSimulation = new SpringSimulation(1.0f);
        springSimulation.setDampingRatio(f10);
        springSimulation.setStiffness(f11);
        this.spring = springSimulation;
    }

    public /* synthetic */ FloatSpringSpec(float f10, float f11, float f12, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? 0.01f : f12);
    }
}
