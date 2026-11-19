package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes.dex */
public final class SnapSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final int delay;

    public SnapSpec() {
        this(0, 1, null);
    }

    public boolean equals(Object obj) {
        return (obj instanceof SnapSpec) && ((SnapSpec) obj).delay == this.delay;
    }

    public final int getDelay() {
        return this.delay;
    }

    public int hashCode() {
        return this.delay;
    }

    public SnapSpec(int i10) {
        this.delay = i10;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedSnapSpec(this.delay);
    }

    public /* synthetic */ SnapSpec(int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
