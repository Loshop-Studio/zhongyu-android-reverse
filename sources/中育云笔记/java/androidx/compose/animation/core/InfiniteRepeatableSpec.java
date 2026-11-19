package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class InfiniteRepeatableSpec<T> implements AnimationSpec<T> {
    public static final int $stable = 8;
    private final DurationBasedAnimationSpec<T> animation;
    private final long initialStartOffset;
    private final RepeatMode repeatMode;

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j10, AbstractC9972n abstractC9972n) {
        this(durationBasedAnimationSpec, repeatMode, j10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof InfiniteRepeatableSpec) {
            InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) obj;
            if (AbstractC9979u.m20289b(infiniteRepeatableSpec.animation, this.animation) && infiniteRepeatableSpec.repeatMode == this.repeatMode && StartOffset.m26883equalsimpl0(infiniteRepeatableSpec.initialStartOffset, this.initialStartOffset)) {
                return true;
            }
        }
        return false;
    }

    public final DurationBasedAnimationSpec<T> getAnimation() {
        return this.animation;
    }

    /* renamed from: getInitialStartOffset-Rmkjzm4, reason: not valid java name */
    public final long m26861getInitialStartOffsetRmkjzm4() {
        return this.initialStartOffset;
    }

    public final RepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    public int hashCode() {
        return (((this.animation.hashCode() * 31) + this.repeatMode.hashCode()) * 31) + StartOffset.m26886hashCodeimpl(this.initialStartOffset);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedInfiniteRepeatableSpec(this.animation.vectorize((TwoWayConverter) twoWayConverter), this.repeatMode, this.initialStartOffset, (AbstractC9972n) null);
    }

    private InfiniteRepeatableSpec(DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j10) {
        this.animation = durationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        this.initialStartOffset = j10;
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j10, int i10, AbstractC9972n abstractC9972n) {
        this(durationBasedAnimationSpec, (i10 & 2) != 0 ? RepeatMode.Restart : repeatMode, (i10 & 4) != 0 ? StartOffset.m26881constructorimpl$default(0, 0, 2, null) : j10, (AbstractC9972n) null);
    }

    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i10, AbstractC9972n abstractC9972n) {
        this(durationBasedAnimationSpec, (i10 & 2) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @InterfaceC10770a
    public /* synthetic */ InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        this(durationBasedAnimationSpec, repeatMode, StartOffset.m26881constructorimpl$default(0, 0, 2, null), (AbstractC9972n) null);
    }
}
