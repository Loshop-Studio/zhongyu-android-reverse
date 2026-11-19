package p020b1;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p084f1.InterfaceC7431h;
import p117i1.AbstractC7652k;

/* renamed from: b1.s */
/* loaded from: classes3.dex */
public final class C4960s implements InterfaceC4953l {

    /* renamed from: a */
    public final Set f2392a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i */
    public void m2368i() {
        this.f2392a.clear();
    }

    /* renamed from: j */
    public List m2369j() {
        return AbstractC7652k.m12694j(this.f2392a);
    }

    /* renamed from: k */
    public void m2370k(InterfaceC7431h interfaceC7431h) {
        this.f2392a.add(interfaceC7431h);
    }

    /* renamed from: l */
    public void m2371l(InterfaceC7431h interfaceC7431h) {
        this.f2392a.remove(interfaceC7431h);
    }

    @Override // p020b1.InterfaceC4953l
    public void onDestroy() {
        Iterator it = AbstractC7652k.m12694j(this.f2392a).iterator();
        while (it.hasNext()) {
            ((InterfaceC7431h) it.next()).onDestroy();
        }
    }

    @Override // p020b1.InterfaceC4953l
    public void onStart() {
        Iterator it = AbstractC7652k.m12694j(this.f2392a).iterator();
        while (it.hasNext()) {
            ((InterfaceC7431h) it.next()).onStart();
        }
    }

    @Override // p020b1.InterfaceC4953l
    public void onStop() {
        Iterator it = AbstractC7652k.m12694j(this.f2392a).iterator();
        while (it.hasNext()) {
            ((InterfaceC7431h) it.next()).onStop();
        }
    }
}
