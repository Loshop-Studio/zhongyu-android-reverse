package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import p181hd.InterfaceC9540l;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
final class TargetApproachAnimation implements ApproachAnimation<Float, AnimationVector1D> {
    private final AnimationSpec<Float> animationSpec;

    public TargetApproachAnimation(AnimationSpec<Float> animationSpec) {
        this.animationSpec = animationSpec;
    }

    @Override // androidx.compose.foundation.gestures.snapping.ApproachAnimation
    public /* bridge */ /* synthetic */ Object approachAnimation(ScrollScope scrollScope, Float f10, Float f11, InterfaceC9540l interfaceC9540l, InterfaceC11588c interfaceC11588c) {
        return approachAnimation(scrollScope, f10.floatValue(), f11.floatValue(), interfaceC9540l, (InterfaceC11588c<? super AnimationResult<Float, AnimationVector1D>>) interfaceC11588c);
    }

    public Object approachAnimation(ScrollScope scrollScope, float f10, float f11, InterfaceC9540l interfaceC9540l, InterfaceC11588c<? super AnimationResult<Float, AnimationVector1D>> interfaceC11588c) throws Throwable {
        Object objAnimateWithTarget = SnapFlingBehaviorKt.animateWithTarget(scrollScope, Math.abs(f10) * Math.signum(f11), f10, AnimationStateKt.AnimationState$default(0.0f, f11, 0L, 0L, false, 28, null), this.animationSpec, interfaceC9540l, interfaceC11588c);
        return objAnimateWithTarget == AbstractC11725a.m25952f() ? objAnimateWithTarget : (AnimationResult) objAnimateWithTarget;
    }
}
