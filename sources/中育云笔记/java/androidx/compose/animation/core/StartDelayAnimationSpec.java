package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9979u;

@Immutable
/* loaded from: classes.dex */
final class StartDelayAnimationSpec<T> implements AnimationSpec<T> {
    private final AnimationSpec<T> animationSpec;
    private final long startDelayNanos;

    public StartDelayAnimationSpec(AnimationSpec<T> animationSpec, long j10) {
        this.animationSpec = animationSpec;
        this.startDelayNanos = j10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StartDelayAnimationSpec)) {
            return false;
        }
        StartDelayAnimationSpec startDelayAnimationSpec = (StartDelayAnimationSpec) obj;
        return startDelayAnimationSpec.startDelayNanos == this.startDelayNanos && AbstractC9979u.m20289b(startDelayAnimationSpec.animationSpec, this.animationSpec);
    }

    public final AnimationSpec<T> getAnimationSpec() {
        return this.animationSpec;
    }

    public final long getStartDelayNanos() {
        return this.startDelayNanos;
    }

    public int hashCode() {
        return (this.animationSpec.hashCode() * 31) + Long.hashCode(this.startDelayNanos);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        return new StartDelayVectorizedAnimationSpec(this.animationSpec.vectorize(twoWayConverter), this.startDelayNanos);
    }
}
