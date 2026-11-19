package androidx.compose.animation;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
final class EnterTransitionImpl extends EnterTransition {
    private final TransitionData data;

    public EnterTransitionImpl(TransitionData transitionData) {
        super(null);
        this.data = transitionData;
    }

    @Override // androidx.compose.animation.EnterTransition
    public TransitionData getData$animation_release() {
        return this.data;
    }
}
