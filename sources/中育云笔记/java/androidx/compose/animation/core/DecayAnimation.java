package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import p265nd.AbstractC10410o;

@StabilityInferred(parameters = 3)
/* loaded from: classes.dex */
public final class DecayAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    public static final int $stable = 0;
    private final VectorizedDecayAnimationSpec<V> animationSpec;
    private final long durationNanos;
    private final V endVelocity;
    private final T initialValue;
    private final V initialValueVector;
    private final V initialVelocityVector;
    private final boolean isInfinite;
    private final T targetValue;
    private final TwoWayConverter<T, V> typeConverter;

    public DecayAnimation(VectorizedDecayAnimationSpec<V> vectorizedDecayAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t10, V v10) {
        this.animationSpec = vectorizedDecayAnimationSpec;
        this.typeConverter = twoWayConverter;
        this.initialValue = t10;
        V v11 = (V) getTypeConverter().getConvertToVector().invoke(t10);
        this.initialValueVector = v11;
        this.initialVelocityVector = (V) AnimationVectorsKt.copy(v10);
        this.targetValue = (T) getTypeConverter().getConvertFromVector().invoke(vectorizedDecayAnimationSpec.getTargetValue(v11, v10));
        this.durationNanos = vectorizedDecayAnimationSpec.getDurationNanos(v11, v10);
        V v12 = (V) AnimationVectorsKt.copy(vectorizedDecayAnimationSpec.getVelocityFromNanos(getDurationNanos(), v11, v10));
        this.endVelocity = v12;
        int size$animation_core_release = v12.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            V v13 = this.endVelocity;
            v13.set$animation_core_release(i10, AbstractC10410o.m21760m(v13.get$animation_core_release(i10), -this.animationSpec.getAbsVelocityThreshold(), this.animationSpec.getAbsVelocityThreshold()));
        }
    }

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        return this.durationNanos;
    }

    public final T getInitialValue() {
        return this.initialValue;
    }

    public final V getInitialVelocityVector() {
        return this.initialVelocityVector;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getTargetValue() {
        return this.targetValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getValueFromNanos(long j10) {
        return !isFinishedFromNanos(j10) ? (T) getTypeConverter().getConvertFromVector().invoke(this.animationSpec.getValueFromNanos(j10, this.initialValueVector, this.initialVelocityVector)) : getTargetValue();
    }

    @Override // androidx.compose.animation.core.Animation
    public V getVelocityVectorFromNanos(long j10) {
        return !isFinishedFromNanos(j10) ? (V) this.animationSpec.getVelocityFromNanos(j10, this.initialValueVector, this.initialVelocityVector) : this.endVelocity;
    }

    @Override // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return this.isInfinite;
    }

    public DecayAnimation(DecayAnimationSpec<T> decayAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t10, V v10) {
        this(decayAnimationSpec.vectorize(twoWayConverter), twoWayConverter, t10, v10);
    }

    public DecayAnimation(DecayAnimationSpec<T> decayAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t10, T t11) {
        this(decayAnimationSpec.vectorize(twoWayConverter), twoWayConverter, t10, (AnimationVector) twoWayConverter.getConvertToVector().invoke(t11));
    }
}
