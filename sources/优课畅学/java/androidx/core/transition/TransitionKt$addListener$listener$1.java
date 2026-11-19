package androidx.core.transition;

import android.transition.Transition;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    final /* synthetic */ InterfaceC10570l $onCancel;
    final /* synthetic */ InterfaceC10570l $onEnd;
    final /* synthetic */ InterfaceC10570l $onPause;
    final /* synthetic */ InterfaceC10570l $onResume;
    final /* synthetic */ InterfaceC10570l $onStart;

    public TransitionKt$addListener$listener$1(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3, InterfaceC10570l interfaceC10570l4, InterfaceC10570l interfaceC10570l5) {
        this.$onEnd = interfaceC10570l;
        this.$onResume = interfaceC10570l2;
        this.$onPause = interfaceC10570l3;
        this.$onCancel = interfaceC10570l4;
        this.$onStart = interfaceC10570l5;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
        this.$onCancel.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        this.$onEnd.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
        this.$onPause.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
        this.$onResume.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        this.$onStart.invoke(transition);
    }
}
