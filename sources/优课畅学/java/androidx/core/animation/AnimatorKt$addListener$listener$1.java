package androidx.core.animation;

import android.animation.Animator;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class AnimatorKt$addListener$listener$1 implements Animator.AnimatorListener {
    final /* synthetic */ InterfaceC10570l $onCancel;
    final /* synthetic */ InterfaceC10570l $onEnd;
    final /* synthetic */ InterfaceC10570l $onRepeat;
    final /* synthetic */ InterfaceC10570l $onStart;

    public AnimatorKt$addListener$listener$1(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3, InterfaceC10570l interfaceC10570l4) {
        this.$onRepeat = interfaceC10570l;
        this.$onEnd = interfaceC10570l2;
        this.$onCancel = interfaceC10570l3;
        this.$onStart = interfaceC10570l4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.$onCancel.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.$onEnd.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        this.$onRepeat.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.$onStart.invoke(animator);
    }
}
