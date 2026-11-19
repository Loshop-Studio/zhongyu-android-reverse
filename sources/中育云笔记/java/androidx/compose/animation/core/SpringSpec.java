package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@Immutable
/* loaded from: classes.dex */
public final class SpringSpec<T> implements FiniteAnimationSpec<T> {
    public static final int $stable = 0;
    private final float dampingRatio;
    private final float stiffness;
    private final T visibilityThreshold;

    public SpringSpec() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof SpringSpec) {
            SpringSpec springSpec = (SpringSpec) obj;
            if (springSpec.dampingRatio == this.dampingRatio && springSpec.stiffness == this.stiffness && AbstractC9979u.m20289b(springSpec.visibilityThreshold, this.visibilityThreshold)) {
                return true;
            }
        }
        return false;
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    public final T getVisibilityThreshold() {
        return this.visibilityThreshold;
    }

    public int hashCode() {
        T t10 = this.visibilityThreshold;
        return ((((t10 != null ? t10.hashCode() : 0) * 31) + Float.hashCode(this.dampingRatio)) * 31) + Float.hashCode(this.stiffness);
    }

    public SpringSpec(float f10, float f11, T t10) {
        this.dampingRatio = f10;
        this.stiffness = f11;
        this.visibilityThreshold = t10;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedSpringSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedSpringSpec<>(this.dampingRatio, this.stiffness, AnimationSpecKt.convert(twoWayConverter, this.visibilityThreshold));
    }

    public /* synthetic */ SpringSpec(float f10, float f11, Object obj, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : obj);
    }
}
