package androidx.core.animation;

import android.animation.Animator;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class AnimatorKt$addListener$listener$1 implements Animator.AnimatorListener {
    final /* synthetic */ InterfaceC9540l $onCancel;
    final /* synthetic */ InterfaceC9540l $onEnd;
    final /* synthetic */ InterfaceC9540l $onRepeat;
    final /* synthetic */ InterfaceC9540l $onStart;

    public AnimatorKt$addListener$listener$1(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4) {
        this.$onRepeat = interfaceC9540l;
        this.$onEnd = interfaceC9540l2;
        this.$onCancel = interfaceC9540l3;
        this.$onStart = interfaceC9540l4;
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
