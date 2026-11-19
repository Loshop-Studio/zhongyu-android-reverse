package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import p181hd.InterfaceC9540l;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
final class DecayApproachAnimation implements ApproachAnimation<Float, AnimationVector1D> {
    private final DecayAnimationSpec<Float> decayAnimationSpec;

    public DecayApproachAnimation(DecayAnimationSpec<Float> decayAnimationSpec) {
        this.decayAnimationSpec = decayAnimationSpec;
    }

    @Override // androidx.compose.foundation.gestures.snapping.ApproachAnimation
    public /* bridge */ /* synthetic */ Object approachAnimation(ScrollScope scrollScope, Float f10, Float f11, InterfaceC9540l interfaceC9540l, InterfaceC11588c interfaceC11588c) {
        return approachAnimation(scrollScope, f10.floatValue(), f11.floatValue(), interfaceC9540l, (InterfaceC11588c<? super AnimationResult<Float, AnimationVector1D>>) interfaceC11588c);
    }

    public Object approachAnimation(ScrollScope scrollScope, float f10, float f11, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super AnimationResult<Float, AnimationVector1D>> interfaceC11588c) throws Throwable {
        Object objAnimateDecay = SnapFlingBehaviorKt.animateDecay(scrollScope, f10, AnimationStateKt.AnimationState$default(0.0f, f11, 0L, 0L, false, 28, null), this.decayAnimationSpec, interfaceC9540l, interfaceC11588c);
        return objAnimateDecay == AbstractC11725a.m25952f() ? objAnimateDecay : (AnimationResult) objAnimateDecay;
    }
}
