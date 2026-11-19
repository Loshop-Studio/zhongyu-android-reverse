package p381w0;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p109d1.AbstractC8910k;

/* renamed from: w0.k */
/* loaded from: classes3.dex */
public final class C11651k implements InterfaceC11650j, LifecycleObserver {

    /* renamed from: c */
    public final Set f27653c = new HashSet();

    /* renamed from: d */
    public final Lifecycle f27654d;

    public C11651k(Lifecycle lifecycle) {
        this.f27654d = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // p381w0.InterfaceC11650j
    /* renamed from: a */
    public void mo25758a(InterfaceC11652l interfaceC11652l) {
        this.f27653c.add(interfaceC11652l);
        if (this.f27654d.getCurrentState() == Lifecycle.State.DESTROYED) {
            interfaceC11652l.onDestroy();
        } else if (this.f27654d.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            interfaceC11652l.onStart();
        } else {
            interfaceC11652l.onStop();
        }
    }

    @Override // p381w0.InterfaceC11650j
    /* renamed from: b */
    public void mo25759b(InterfaceC11652l interfaceC11652l) {
        this.f27653c.remove(interfaceC11652l);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = AbstractC8910k.m17479j(this.f27653c).iterator();
        while (it.hasNext()) {
            ((InterfaceC11652l) it.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = AbstractC8910k.m17479j(this.f27653c).iterator();
        while (it.hasNext()) {
            ((InterfaceC11652l) it.next()).onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = AbstractC8910k.m17479j(this.f27653c).iterator();
        while (it.hasNext()) {
            ((InterfaceC11652l) it.next()).onStop();
        }
    }
}
