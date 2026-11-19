package p020b1;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p117i1.AbstractC7652k;

/* renamed from: b1.k */
/* loaded from: classes3.dex */
public final class C4952k implements InterfaceC4951j, LifecycleObserver {

    /* renamed from: a */
    public final Set f2361a = new HashSet();

    /* renamed from: b */
    public final Lifecycle f2362b;

    public C4952k(Lifecycle lifecycle) {
        this.f2362b = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // p020b1.InterfaceC4951j
    /* renamed from: a */
    public void mo2328a(InterfaceC4953l interfaceC4953l) {
        this.f2361a.remove(interfaceC4953l);
    }

    @Override // p020b1.InterfaceC4951j
    /* renamed from: b */
    public void mo2329b(InterfaceC4953l interfaceC4953l) {
        this.f2361a.add(interfaceC4953l);
        if (this.f2362b.getCurrentState() == Lifecycle.State.DESTROYED) {
            interfaceC4953l.onDestroy();
        } else if (this.f2362b.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            interfaceC4953l.onStart();
        } else {
            interfaceC4953l.onStop();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = AbstractC7652k.m12694j(this.f2361a).iterator();
        while (it.hasNext()) {
            ((InterfaceC4953l) it.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = AbstractC7652k.m12694j(this.f2361a).iterator();
        while (it.hasNext()) {
            ((InterfaceC4953l) it.next()).onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = AbstractC7652k.m12694j(this.f2361a).iterator();
        while (it.hasNext()) {
            ((InterfaceC4953l) it.next()).onStop();
        }
    }
}
