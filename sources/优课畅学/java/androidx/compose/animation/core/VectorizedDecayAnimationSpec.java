package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;

/* loaded from: classes.dex */
public interface VectorizedDecayAnimationSpec<V extends AnimationVector> {
    float getAbsVelocityThreshold();

    long getDurationNanos(V v10, V v11);

    V getTargetValue(V v10, V v11);

    V getValueFromNanos(long j10, V v10, V v11);

    V getVelocityFromNanos(long j10, V v10, V v11);
}
