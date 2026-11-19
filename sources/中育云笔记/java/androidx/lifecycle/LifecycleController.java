package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;

@MainThread
/* loaded from: classes2.dex */
public final class LifecycleController {
    private final DispatchQueue dispatchQueue;
    private final Lifecycle lifecycle;
    private final Lifecycle.State minState;
    private final LifecycleEventObserver observer;

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State minState, DispatchQueue dispatchQueue, final InterfaceC10045g parentJob) {
        AbstractC9979u.m20294g(lifecycle, "lifecycle");
        AbstractC9979u.m20294g(minState, "minState");
        AbstractC9979u.m20294g(dispatchQueue, "dispatchQueue");
        AbstractC9979u.m20294g(parentJob, "parentJob");
        this.lifecycle = lifecycle;
        this.minState = minState;
        this.dispatchQueue = dispatchQueue;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.h
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LifecycleController.observer$lambda$0(this.f1607c, parentJob, lifecycleOwner, event);
            }
        };
        this.observer = lifecycleEventObserver;
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(lifecycleEventObserver);
        } else {
            InterfaceC10045g.a.m20900a(parentJob, null, 1, null);
            finish();
        }
    }

    private final void handleDestroy(InterfaceC10045g interfaceC10045g) {
        InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$0(LifecycleController lifecycleController, InterfaceC10045g interfaceC10045g, LifecycleOwner source, Lifecycle.Event event) {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(event, "<unused var>");
        if (source.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
            lifecycleController.finish();
        } else if (source.getLifecycle().getCurrentState().compareTo(lifecycleController.minState) < 0) {
            lifecycleController.dispatchQueue.pause();
        } else {
            lifecycleController.dispatchQueue.resume();
        }
    }

    @MainThread
    public final void finish() {
        this.lifecycle.removeObserver(this.observer);
        this.dispatchQueue.finish();
    }
}
