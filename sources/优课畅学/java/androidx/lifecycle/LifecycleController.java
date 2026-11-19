package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;

@MainThread
/* loaded from: classes3.dex */
public final class LifecycleController {
    private final DispatchQueue dispatchQueue;
    private final Lifecycle lifecycle;
    private final Lifecycle.State minState;
    private final LifecycleEventObserver observer;

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State minState, DispatchQueue dispatchQueue, final InterfaceC9212n parentJob) {
        AbstractC9133u.m16133g(lifecycle, "lifecycle");
        AbstractC9133u.m16133g(minState, "minState");
        AbstractC9133u.m16133g(dispatchQueue, "dispatchQueue");
        AbstractC9133u.m16133g(parentJob, "parentJob");
        this.lifecycle = lifecycle;
        this.minState = minState;
        this.dispatchQueue = dispatchQueue;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.h
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LifecycleController.observer$lambda$0(this.f1708a, parentJob, lifecycleOwner, event);
            }
        };
        this.observer = lifecycleEventObserver;
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(lifecycleEventObserver);
        } else {
            InterfaceC9212n.a.m16777a(parentJob, null, 1, null);
            finish();
        }
    }

    private final void handleDestroy(InterfaceC9212n interfaceC9212n) {
        InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$0(LifecycleController lifecycleController, InterfaceC9212n interfaceC9212n, LifecycleOwner source, Lifecycle.Event event) {
        AbstractC9133u.m16133g(source, "source");
        AbstractC9133u.m16133g(event, "<unused var>");
        if (source.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
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
