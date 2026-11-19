package p001a0;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p116h0.AbstractC8707k;

/* renamed from: a0.k */
/* loaded from: classes3.dex */
public final class C0011k implements InterfaceC0010j, LifecycleObserver {

    /* renamed from: a */
    public final Set f23a = new HashSet();

    /* renamed from: b */
    public final Lifecycle f24b;

    public C0011k(Lifecycle lifecycle) {
        this.f24b = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // p001a0.InterfaceC0010j
    /* renamed from: a */
    public void mo0a(InterfaceC0012l interfaceC0012l) {
        this.f23a.add(interfaceC0012l);
        if (this.f24b.getCurrentState() == Lifecycle.State.DESTROYED) {
            interfaceC0012l.onDestroy();
        } else if (this.f24b.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            interfaceC0012l.onStart();
        } else {
            interfaceC0012l.onStop();
        }
    }

    @Override // p001a0.InterfaceC0010j
    /* renamed from: b */
    public void mo1b(InterfaceC0012l interfaceC0012l) {
        this.f23a.remove(interfaceC0012l);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = AbstractC8707k.m14192j(this.f23a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0012l) it.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = AbstractC8707k.m14192j(this.f23a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0012l) it.next()).onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = AbstractC8707k.m14192j(this.f23a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0012l) it.next()).onStop();
        }
    }
}
