package androidx.compose.p014ui.platform;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class ViewCompositionStrategy_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC9529a installForLifecycle(final AbstractComposeView abstractComposeView, final Lifecycle lifecycle) {
        if (lifecycle.getCurrentState().compareTo(Lifecycle.State.DESTROYED) > 0) {
            final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.compose.ui.platform.d1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    ViewCompositionStrategy_androidKt.installForLifecycle$lambda$1(abstractComposeView, lifecycleOwner, event);
                }
            };
            lifecycle.addObserver(lifecycleEventObserver);
            return new InterfaceC9529a() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt.installForLifecycle.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m32706invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m32706invoke() {
                    lifecycle.removeObserver(lifecycleEventObserver);
                }
            };
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void installForLifecycle$lambda$1(AbstractComposeView abstractComposeView, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            abstractComposeView.disposeComposition();
        }
    }
}
