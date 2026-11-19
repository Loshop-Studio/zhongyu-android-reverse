package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TargetBasedAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    public static final int $stable = 8;
    private long _durationNanos;
    private V _endVelocity;
    private final VectorizedAnimationSpec<V> animationSpec;
    private V initialValueVector;
    private final V initialVelocityVector;
    private T mutableInitialValue;
    private T mutableTargetValue;
    private V targetValueVector;
    private final TwoWayConverter<T, V> typeConverter;

    public TargetBasedAnimation(VectorizedAnimationSpec<V> vectorizedAnimationSpec, TwoWayConverter<T, V> twoWayConverter, T t10, T t11, V v10) {
        V v11;
        this.animationSpec = vectorizedAnimationSpec;
        this.typeConverter = twoWayConverter;
        this.mutableTargetValue = t11;
        this.mutableInitialValue = t10;
        this.initialValueVector = (V) getTypeConverter().getConvertToVector().invoke(t10);
        this.targetValueVector = (V) getTypeConverter().getConvertToVector().invoke(t11);
        this.initialVelocityVector = (v10 == null || (v11 = (V) AnimationVectorsKt.copy(v10)) == null) ? (V) AnimationVectorsKt.newInstance((AnimationVector) getTypeConverter().getConvertToVector().invoke(t10)) : v11;
        this._durationNanos = -1L;
    }

    private final V getEndVelocity() {
        V v10 = this._endVelocity;
        if (v10 != null) {
            return v10;
        }
        V v11 = (V) this.animationSpec.getEndVelocity(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        this._endVelocity = v11;
        return v11;
    }

    public final VectorizedAnimationSpec<V> getAnimationSpec$animation_core_release() {
        return this.animationSpec;
    }

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        if (this._durationNanos < 0) {
            this._durationNanos = this.animationSpec.getDurationNanos(this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        }
        return this._durationNanos;
    }

    public final T getInitialValue() {
        return this.mutableInitialValue;
    }

    public final T getMutableInitialValue$animation_core_release() {
        return this.mutableInitialValue;
    }

    public final T getMutableTargetValue$animation_core_release() {
        return this.mutableTargetValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getTargetValue() {
        return this.mutableTargetValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getValueFromNanos(long j10) {
        if (isFinishedFromNanos(j10)) {
            return getTargetValue();
        }
        AnimationVector valueFromNanos = this.animationSpec.getValueFromNanos(j10, this.initialValueVector, this.targetValueVector, this.initialVelocityVector);
        int size$animation_core_release = valueFromNanos.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            if (Float.isNaN(valueFromNanos.get$animation_core_release(i10))) {
                PreconditionsKt.throwIllegalStateException("AnimationVector cannot contain a NaN. " + valueFromNanos + ". Animation: " + this + ", playTimeNanos: " + j10);
            }
        }
        return (T) getTypeConverter().getConvertFromVector().invoke(valueFromNanos);
    }

    @Override // androidx.compose.animation.core.Animation
    public V getVelocityVectorFromNanos(long j10) {
        return !isFinishedFromNanos(j10) ? (V) this.animationSpec.getVelocityFromNanos(j10, this.initialValueVector, this.targetValueVector, this.initialVelocityVector) : (V) getEndVelocity();
    }

    @Override // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return this.animationSpec.isInfinite();
    }

    public final void setMutableInitialValue$animation_core_release(T t10) {
        if (AbstractC9979u.m20289b(t10, this.mutableInitialValue)) {
            return;
        }
        this.mutableInitialValue = t10;
        this.initialValueVector = (V) getTypeConverter().getConvertToVector().invoke(t10);
        this._endVelocity = null;
        this._durationNanos = -1L;
    }

    public final void setMutableTargetValue$animation_core_release(T t10) {
        if (AbstractC9979u.m20289b(this.mutableTargetValue, t10)) {
            return;
        }
        this.mutableTargetValue = t10;
        this.targetValueVector = (V) getTypeConverter().getConvertToVector().invoke(t10);
        this._endVelocity = null;
        this._durationNanos = -1L;
    }

    public String toString() {
        return "TargetBasedAnimation: " + getInitialValue() + " -> " + getTargetValue() + ",initial velocity: " + this.initialVelocityVector + ", duration: " + AnimationKt.getDurationMillis(this) + " ms,animationSpec: " + this.animationSpec;
    }

    public /* synthetic */ TargetBasedAnimation(VectorizedAnimationSpec vectorizedAnimationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i10, AbstractC9972n abstractC9972n) {
        this((VectorizedAnimationSpec<AnimationVector>) vectorizedAnimationSpec, (TwoWayConverter<Object, AnimationVector>) twoWayConverter, obj, obj2, (i10 & 16) != 0 ? null : animationVector);
    }

    public /* synthetic */ TargetBasedAnimation(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i10, AbstractC9972n abstractC9972n) {
        this((AnimationSpec<Object>) animationSpec, (TwoWayConverter<Object, AnimationVector>) twoWayConverter, obj, obj2, (i10 & 16) != 0 ? null : animationVector);
    }

    public TargetBasedAnimation(AnimationSpec<T> animationSpec, TwoWayConverter<T, V> twoWayConverter, T t10, T t11, V v10) {
        this(animationSpec.vectorize(twoWayConverter), twoWayConverter, t10, t11, v10);
    }
}
