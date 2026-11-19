package p160u0;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p016b1.AbstractC4409k;

/* renamed from: u0.k */
/* loaded from: classes3.dex */
public final class C7758k implements InterfaceC7757j, LifecycleObserver {

    /* renamed from: a */
    public final Set f10251a = new HashSet();

    /* renamed from: b */
    public final Lifecycle f10252b;

    public C7758k(Lifecycle lifecycle) {
        this.f10252b = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // p160u0.InterfaceC7757j
    /* renamed from: a */
    public void mo9257a(InterfaceC7759l interfaceC7759l) {
        this.f10251a.remove(interfaceC7759l);
    }

    @Override // p160u0.InterfaceC7757j
    /* renamed from: b */
    public void mo9258b(InterfaceC7759l interfaceC7759l) {
        this.f10251a.add(interfaceC7759l);
        if (this.f10252b.getCurrentState() == Lifecycle.State.DESTROYED) {
            interfaceC7759l.mo2533d();
        } else if (this.f10252b.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            interfaceC7759l.onStart();
        } else {
            interfaceC7759l.onStop();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = AbstractC4409k.m1449j(this.f10251a).iterator();
        while (it.hasNext()) {
            ((InterfaceC7759l) it.next()).mo2533d();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = AbstractC4409k.m1449j(this.f10251a).iterator();
        while (it.hasNext()) {
            ((InterfaceC7759l) it.next()).onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = AbstractC4409k.m1449j(this.f10251a).iterator();
        while (it.hasNext()) {
            ((InterfaceC7759l) it.next()).onStop();
        }
    }
}
