package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* loaded from: classes.dex */
public interface VectorizedAnimationSpec<V extends AnimationVector> {

    public static final class DefaultImpls {
        @Deprecated
        public static <V extends AnimationVector> V getEndVelocity(VectorizedAnimationSpec<V> vectorizedAnimationSpec, V v10, V v11, V v12) {
            return (V) VectorizedAnimationSpec.super.getEndVelocity(v10, v11, v12);
        }
    }

    long getDurationNanos(V v10, V v11, V v12);

    default V getEndVelocity(V v10, V v11, V v12) {
        return (V) getVelocityFromNanos(getDurationNanos(v10, v11, v12), v10, v11, v12);
    }

    V getValueFromNanos(long j10, V v10, V v11, V v12);

    V getVelocityFromNanos(long j10, V v10, V v11, V v12);

    boolean isInfinite();
}
