package androidx.compose.animation.core;

import androidx.collection.IntListKt;
import androidx.collection.IntObjectMapKt;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Immutable
@ExperimentalAnimationSpecApi
/* loaded from: classes.dex */
public final class ArcAnimationSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;
    private final int delayMillis;
    private final int durationMillis;
    private final Easing easing;
    private final int mode;

    public /* synthetic */ ArcAnimationSpec(int i10, int i11, int i12, Easing easing, AbstractC9126n abstractC9126n) {
        this(i10, i11, i12, easing);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArcAnimationSpec)) {
            return false;
        }
        ArcAnimationSpec arcAnimationSpec = (ArcAnimationSpec) obj;
        if (ArcMode.m20252equalsimpl0(this.mode, arcAnimationSpec.mode) && this.durationMillis == arcAnimationSpec.durationMillis && this.delayMillis == arcAnimationSpec.delayMillis) {
            return AbstractC9133u.m16128b(this.easing, arcAnimationSpec.easing);
        }
        return false;
    }

    public final int getDelayMillis() {
        return this.delayMillis;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final Easing getEasing() {
        return this.easing;
    }

    /* renamed from: getMode--9T-Mq4, reason: not valid java name */
    public final int m20248getMode9TMq4() {
        return this.mode;
    }

    public int hashCode() {
        return (((((ArcMode.m20253hashCodeimpl(this.mode) * 31) + this.durationMillis) * 31) + this.delayMillis) * 31) + this.easing.hashCode();
    }

    private ArcAnimationSpec(int i10, int i11, int i12, Easing easing) {
        this.mode = i10;
        this.durationMillis = i11;
        this.delayMillis = i12;
        this.easing = easing;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public <V extends AnimationVector> VectorizedDurationBasedAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter) {
        return new VectorizedKeyframesSpec(IntListKt.intListOf(0, this.durationMillis), IntObjectMapKt.emptyIntObjectMap(), this.durationMillis, this.delayMillis, this.easing, this.mode, null);
    }

    public /* synthetic */ ArcAnimationSpec(int i10, int i11, int i12, Easing easing, int i13, AbstractC9126n abstractC9126n) {
        this((i13 & 1) != 0 ? ArcMode.Companion.m20257getArcBelow9TMq4() : i10, (i13 & 2) != 0 ? 300 : i11, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? EasingKt.getFastOutSlowInEasing() : easing, null);
    }
}
