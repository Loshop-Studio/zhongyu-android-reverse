package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class VectorizedRepeatableSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    private final VectorizedDurationBasedAnimationSpec<V> animation;
    private final long durationNanos;
    private final long initialOffsetNanos;
    private final int iterations;
    private final RepeatMode repeatMode;

    public /* synthetic */ VectorizedRepeatableSpec(int i10, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j10, AbstractC9972n abstractC9972n) {
        this(i10, vectorizedDurationBasedAnimationSpec, repeatMode, j10);
    }

    private final long repetitionPlayTimeNanos(long j10) {
        long j11 = this.initialOffsetNanos;
        if (j10 + j11 <= 0) {
            return 0L;
        }
        long j12 = j10 + j11;
        long jMin = Math.min(j12 / this.durationNanos, this.iterations - 1);
        return (this.repeatMode == RepeatMode.Restart || jMin % ((long) 2) == 0) ? j12 - (jMin * this.durationNanos) : ((jMin + 1) * this.durationNanos) - j12;
    }

    private final V repetitionStartVelocity(long j10, V v10, V v11, V v12) {
        long j11 = this.initialOffsetNanos;
        long j12 = j10 + j11;
        long j13 = this.durationNanos;
        return j12 > j13 ? (V) getVelocityFromNanos(j13 - j11, v10, v11, v12) : v11;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V v10, V v11, V v12) {
        return (this.iterations * this.durationNanos) - this.initialOffsetNanos;
    }

    public final long getDurationNanos$animation_core_release() {
        return this.durationNanos;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j10, V v10, V v11, V v12) {
        return this.animation.getValueFromNanos(repetitionPlayTimeNanos(j10), v10, v11, repetitionStartVelocity(j10, v10, v12, v11));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j10, V v10, V v11, V v12) {
        return this.animation.getVelocityFromNanos(repetitionPlayTimeNanos(j10), v10, v11, repetitionStartVelocity(j10, v10, v12, v11));
    }

    private VectorizedRepeatableSpec(int i10, VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j10) {
        this.iterations = i10;
        this.animation = vectorizedDurationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        if (i10 < 1) {
            throw new IllegalArgumentException("Iterations count can't be less than 1");
        }
        this.durationNanos = (vectorizedDurationBasedAnimationSpec.getDelayMillis() + vectorizedDurationBasedAnimationSpec.getDurationMillis()) * AnimationKt.MillisToNanos;
        this.initialOffsetNanos = j10 * AnimationKt.MillisToNanos;
    }

    public /* synthetic */ VectorizedRepeatableSpec(int i10, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j10, int i11, AbstractC9972n abstractC9972n) {
        this(i10, vectorizedDurationBasedAnimationSpec, (i11 & 4) != 0 ? RepeatMode.Restart : repeatMode, (i11 & 8) != 0 ? StartOffset.m26881constructorimpl$default(0, 0, 2, null) : j10, (AbstractC9972n) null);
    }

    public /* synthetic */ VectorizedRepeatableSpec(int i10, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, int i11, AbstractC9972n abstractC9972n) {
        this(i10, vectorizedDurationBasedAnimationSpec, (i11 & 4) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @InterfaceC10770a
    public /* synthetic */ VectorizedRepeatableSpec(int i10, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode) {
        this(i10, vectorizedDurationBasedAnimationSpec, repeatMode, StartOffset.m26881constructorimpl$default(0, 0, 2, null), (AbstractC9972n) null);
    }
}
