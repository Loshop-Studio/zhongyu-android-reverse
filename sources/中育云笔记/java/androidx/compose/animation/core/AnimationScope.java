package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9529a;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AnimationScope<T, V extends AnimationVector> {
    public static final int $stable = 8;
    private long finishedTimeNanos = Long.MIN_VALUE;
    private final MutableState isRunning$delegate;
    private long lastFrameTimeNanos;
    private final InterfaceC9529a onCancel;
    private final long startTimeNanos;
    private final T targetValue;
    private final TwoWayConverter<T, V> typeConverter;
    private final MutableState value$delegate;
    private V velocityVector;

    public AnimationScope(T t10, TwoWayConverter<T, V> twoWayConverter, V v10, long j10, T t11, long j11, boolean z10, InterfaceC9529a interfaceC9529a) {
        this.typeConverter = twoWayConverter;
        this.targetValue = t11;
        this.startTimeNanos = j11;
        this.onCancel = interfaceC9529a;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
        this.velocityVector = (V) AnimationVectorsKt.copy(v10);
        this.lastFrameTimeNanos = j10;
        this.isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z10), null, 2, null);
    }

    public final void cancelAnimation() {
        setRunning$animation_core_release(false);
        this.onCancel.invoke();
    }

    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final long getStartTimeNanos() {
        return this.startTimeNanos;
    }

    public final T getTargetValue() {
        return this.targetValue;
    }

    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getValue() {
        return this.value$delegate.getValue();
    }

    public final T getVelocity() {
        return (T) this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
    }

    public final V getVelocityVector() {
        return this.velocityVector;
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final void setFinishedTimeNanos$animation_core_release(long j10) {
        this.finishedTimeNanos = j10;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long j10) {
        this.lastFrameTimeNanos = j10;
    }

    public final void setRunning$animation_core_release(boolean z10) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setValue$animation_core_release(T t10) {
        this.value$delegate.setValue(t10);
    }

    public final void setVelocityVector$animation_core_release(V v10) {
        this.velocityVector = v10;
    }

    public final AnimationState<T, V> toAnimationState() {
        return new AnimationState<>(this.typeConverter, getValue(), this.velocityVector, this.lastFrameTimeNanos, this.finishedTimeNanos, isRunning());
    }
}
