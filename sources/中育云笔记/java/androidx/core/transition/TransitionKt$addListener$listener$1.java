package androidx.core.transition;

import android.transition.Transition;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    final /* synthetic */ InterfaceC9540l $onCancel;
    final /* synthetic */ InterfaceC9540l $onEnd;
    final /* synthetic */ InterfaceC9540l $onPause;
    final /* synthetic */ InterfaceC9540l $onResume;
    final /* synthetic */ InterfaceC9540l $onStart;

    public TransitionKt$addListener$listener$1(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5) {
        this.$onEnd = interfaceC9540l;
        this.$onResume = interfaceC9540l2;
        this.$onPause = interfaceC9540l3;
        this.$onCancel = interfaceC9540l4;
        this.$onStart = interfaceC9540l5;
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
