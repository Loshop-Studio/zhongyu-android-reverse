package p146z;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p047d0.InterfaceC3698h;
import p062g0.AbstractC3750j;

/* renamed from: z.p */
/* loaded from: classes2.dex */
public final class C4704p implements InterfaceC4697i {

    /* renamed from: a */
    public final Set f6063a = Collections.newSetFromMap(new WeakHashMap());

    @Override // p146z.InterfaceC4697i
    /* renamed from: c */
    public void mo1732c() {
        Iterator it = AbstractC3750j.m4778i(this.f6063a).iterator();
        while (it.hasNext()) {
            ((InterfaceC3698h) it.next()).mo1732c();
        }
    }

    /* renamed from: j */
    public void m6704j() {
        this.f6063a.clear();
    }

    /* renamed from: k */
    public List m6705k() {
        return AbstractC3750j.m4778i(this.f6063a);
    }

    /* renamed from: l */
    public void m6706l(InterfaceC3698h interfaceC3698h) {
        this.f6063a.add(interfaceC3698h);
    }

    /* renamed from: m */
    public void m6707m(InterfaceC3698h interfaceC3698h) {
        this.f6063a.remove(interfaceC3698h);
    }

    @Override // p146z.InterfaceC4697i
    public void onStart() {
        Iterator it = AbstractC3750j.m4778i(this.f6063a).iterator();
        while (it.hasNext()) {
            ((InterfaceC3698h) it.next()).onStart();
        }
    }

    @Override // p146z.InterfaceC4697i
    public void onStop() {
        Iterator it = AbstractC3750j.m4778i(this.f6063a).iterator();
        while (it.hasNext()) {
            ((InterfaceC3698h) it.next()).onStop();
        }
    }
}
