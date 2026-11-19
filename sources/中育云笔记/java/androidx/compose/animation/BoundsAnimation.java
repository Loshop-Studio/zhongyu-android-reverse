package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@ExperimentalSharedTransitionApi
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class BoundsAnimation {
    public static final int $stable = 8;
    private final MutableState animation$delegate;
    private FiniteAnimationSpec<Rect> animationSpec = BoundsAnimationKt.DefaultBoundsAnimation;
    private final MutableState animationState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState boundsTransform$delegate;
    private final Transition<Boolean> transition;
    private final SharedTransitionScope transitionScope;

    public BoundsAnimation(SharedTransitionScope sharedTransitionScope, Transition<Boolean> transition, Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimation, BoundsTransform boundsTransform) {
        this.transitionScope = sharedTransitionScope;
        this.transition = transition;
        this.animation$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(deferredAnimation, null, 2, null);
        this.boundsTransform$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundsTransform, null, 2, null);
    }

    private final BoundsTransform getBoundsTransform() {
        return (BoundsTransform) this.boundsTransform$delegate.getValue();
    }

    private final void setAnimation(Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimation) {
        this.animation$delegate.setValue(deferredAnimation);
    }

    private final void setBoundsTransform(BoundsTransform boundsTransform) {
        this.boundsTransform$delegate.setValue(boundsTransform);
    }

    public final void animate(final Rect rect, final Rect rect2) {
        if (this.transitionScope.isTransitionActive()) {
            if (getAnimationState() == null) {
                this.animationSpec = getBoundsTransform().transform(rect, rect2);
            }
            setAnimationState(getAnimation().animate(new InterfaceC9540l() { // from class: androidx.compose.animation.BoundsAnimation.animate.1
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final FiniteAnimationSpec<Rect> invoke(Transition.Segment<Boolean> segment) {
                    return BoundsAnimation.this.getAnimationSpec();
                }
            }, new InterfaceC9540l() { // from class: androidx.compose.animation.BoundsAnimation.animate.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Boolean) obj).booleanValue());
                }

                public final Rect invoke(boolean z10) {
                    return z10 == BoundsAnimation.this.getTransition().getTargetState().booleanValue() ? rect2 : rect;
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> getAnimation() {
        return (Transition.DeferredAnimation) this.animation$delegate.getValue();
    }

    public final FiniteAnimationSpec<Rect> getAnimationSpec() {
        return this.animationSpec;
    }

    public final State<Rect> getAnimationState() {
        return (State) this.animationState$delegate.getValue();
    }

    public final boolean getTarget() {
        return this.transition.getTargetState().booleanValue();
    }

    public final Transition<Boolean> getTransition() {
        return this.transition;
    }

    public final SharedTransitionScope getTransitionScope() {
        return this.transitionScope;
    }

    public final Rect getValue() {
        State<Rect> animationState;
        if (!this.transitionScope.isTransitionActive() || (animationState = getAnimationState()) == null) {
            return null;
        }
        return animationState.getValue();
    }

    public final boolean isRunning() {
        Transition parentTransition = this.transition;
        while (parentTransition.getParentTransition() != null) {
            parentTransition = parentTransition.getParentTransition();
            AbstractC9979u.m20291d(parentTransition);
        }
        return !AbstractC9979u.m20289b(parentTransition.getCurrentState(), parentTransition.getTargetState());
    }

    public final void setAnimationSpec(FiniteAnimationSpec<Rect> finiteAnimationSpec) {
        this.animationSpec = finiteAnimationSpec;
    }

    public final void setAnimationState(State<Rect> state) {
        this.animationState$delegate.setValue(state);
    }

    public final void updateAnimation(Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimation, BoundsTransform boundsTransform) {
        if (!AbstractC9979u.m20289b(getAnimation(), deferredAnimation)) {
            setAnimation(deferredAnimation);
            setAnimationState(null);
            this.animationSpec = BoundsAnimationKt.DefaultBoundsAnimation;
        }
        setBoundsTransform(boundsTransform);
    }
}
