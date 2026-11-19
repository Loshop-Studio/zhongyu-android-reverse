package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9979u;

@Immutable
/* loaded from: classes.dex */
final class StartDelayVectorizedAnimationSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {
    private final long startDelayNanos;
    private final VectorizedAnimationSpec<V> vectorizedAnimationSpec;

    public StartDelayVectorizedAnimationSpec(VectorizedAnimationSpec<V> vectorizedAnimationSpec, long j10) {
        this.vectorizedAnimationSpec = vectorizedAnimationSpec;
        this.startDelayNanos = j10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StartDelayVectorizedAnimationSpec)) {
            return false;
        }
        StartDelayVectorizedAnimationSpec startDelayVectorizedAnimationSpec = (StartDelayVectorizedAnimationSpec) obj;
        return startDelayVectorizedAnimationSpec.startDelayNanos == this.startDelayNanos && AbstractC9979u.m20289b(startDelayVectorizedAnimationSpec.vectorizedAnimationSpec, this.vectorizedAnimationSpec);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V v10, V v11, V v12) {
        return this.vectorizedAnimationSpec.getDurationNanos(v10, v11, v12) + this.startDelayNanos;
    }

    public final long getStartDelayNanos() {
        return this.startDelayNanos;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j10, V v10, V v11, V v12) {
        long j11 = this.startDelayNanos;
        return j10 < j11 ? v10 : (V) this.vectorizedAnimationSpec.getValueFromNanos(j10 - j11, v10, v11, v12);
    }

    public final VectorizedAnimationSpec<V> getVectorizedAnimationSpec() {
        return this.vectorizedAnimationSpec;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j10, V v10, V v11, V v12) {
        long j11 = this.startDelayNanos;
        return j10 < j11 ? v12 : (V) this.vectorizedAnimationSpec.getVelocityFromNanos(j10 - j11, v10, v11, v12);
    }

    public int hashCode() {
        return (this.vectorizedAnimationSpec.hashCode() * 31) + Long.hashCode(this.startDelayNanos);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        return this.vectorizedAnimationSpec.isInfinite();
    }
}
