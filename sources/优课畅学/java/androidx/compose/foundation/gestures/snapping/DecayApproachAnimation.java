package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class DecayApproachAnimation implements ApproachAnimation<Float, AnimationVector1D> {
    private final DecayAnimationSpec<Float> decayAnimationSpec;

    public DecayApproachAnimation(DecayAnimationSpec<Float> decayAnimationSpec) {
        this.decayAnimationSpec = decayAnimationSpec;
    }

    @Override // androidx.compose.foundation.gestures.snapping.ApproachAnimation
    public /* bridge */ /* synthetic */ Object approachAnimation(ScrollScope scrollScope, Float f10, Float f11, InterfaceC10570l interfaceC10570l, InterfaceC9324c interfaceC9324c) {
        return approachAnimation(scrollScope, f10.floatValue(), f11.floatValue(), interfaceC10570l, (InterfaceC9324c<? super AnimationResult<Float, AnimationVector1D>>) interfaceC9324c);
    }

    public Object approachAnimation(ScrollScope scrollScope, float f10, float f11, InterfaceC10570l interfaceC10570l, InterfaceC9324c<? super AnimationResult<Float, AnimationVector1D>> interfaceC9324c) throws Throwable {
        Object objAnimateDecay = SnapFlingBehaviorKt.animateDecay(scrollScope, f10, AnimationStateKt.AnimationState$default(0.0f, f11, 0L, 0L, false, 28, null), this.decayAnimationSpec, interfaceC10570l, interfaceC9324c);
        return objAnimateDecay == AbstractC9434a.m17291f() ? objAnimateDecay : (AnimationResult) objAnimateDecay;
    }
}
