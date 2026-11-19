package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class VectorizedInfiniteRepeatableSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {
    public static final int $stable = 8;
    private final VectorizedDurationBasedAnimationSpec<V> animation;
    private final long durationNanos;
    private final long initialOffsetNanos;
    private final RepeatMode repeatMode;

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j10, AbstractC9972n abstractC9972n) {
        this(vectorizedDurationBasedAnimationSpec, repeatMode, j10);
    }

    private final long repetitionPlayTimeNanos(long j10) {
        long j11 = this.initialOffsetNanos;
        if (j10 + j11 <= 0) {
            return 0L;
        }
        long j12 = j10 + j11;
        long j13 = this.durationNanos;
        long j14 = j12 / j13;
        return (this.repeatMode == RepeatMode.Restart || j14 % ((long) 2) == 0) ? j12 - (j14 * j13) : ((j14 + 1) * j13) - j12;
    }

    private final V repetitionStartVelocity(long j10, V v10, V v11, V v12) {
        long j11 = this.initialOffsetNanos;
        long j12 = j10 + j11;
        long j13 = this.durationNanos;
        return j12 > j13 ? this.animation.getVelocityFromNanos(j13 - j11, v10, v12, v11) : v11;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V v10, V v11, V v12) {
        return Long.MAX_VALUE;
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

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        return true;
    }

    private VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j10) {
        this.animation = vectorizedDurationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        this.durationNanos = (vectorizedDurationBasedAnimationSpec.getDelayMillis() + vectorizedDurationBasedAnimationSpec.getDurationMillis()) * AnimationKt.MillisToNanos;
        this.initialOffsetNanos = j10 * AnimationKt.MillisToNanos;
    }

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j10, int i10, AbstractC9972n abstractC9972n) {
        this(vectorizedDurationBasedAnimationSpec, (i10 & 2) != 0 ? RepeatMode.Restart : repeatMode, (i10 & 4) != 0 ? StartOffset.m26881constructorimpl$default(0, 0, 2, null) : j10, (AbstractC9972n) null);
    }

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, int i10, AbstractC9972n abstractC9972n) {
        this(vectorizedDurationBasedAnimationSpec, (i10 & 2) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @InterfaceC10770a
    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode) {
        this(vectorizedDurationBasedAnimationSpec, repeatMode, StartOffset.m26881constructorimpl$default(0, 0, 2, null), (AbstractC9972n) null);
    }
}
