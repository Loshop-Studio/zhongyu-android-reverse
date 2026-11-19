package p288x0;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p019b1.InterfaceC5097h;
import p091e1.AbstractC7838j;

/* renamed from: x0.p */
/* loaded from: classes3.dex */
public final class C9863p implements InterfaceC9856i {

    /* renamed from: a */
    public final Set f17606a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i */
    public void m16837i() {
        this.f17606a.clear();
    }

    /* renamed from: j */
    public List m16838j() {
        return AbstractC7838j.m12266i(this.f17606a);
    }

    /* renamed from: k */
    public void m16839k(InterfaceC5097h interfaceC5097h) {
        this.f17606a.add(interfaceC5097h);
    }

    /* renamed from: l */
    public void m16840l(InterfaceC5097h interfaceC5097h) {
        this.f17606a.remove(interfaceC5097h);
    }

    @Override // p288x0.InterfaceC9856i
    public void onDestroy() {
        Iterator it = AbstractC7838j.m12266i(this.f17606a).iterator();
        while (it.hasNext()) {
            ((InterfaceC5097h) it.next()).onDestroy();
        }
    }

    @Override // p288x0.InterfaceC9856i
    public void onStart() {
        Iterator it = AbstractC7838j.m12266i(this.f17606a).iterator();
        while (it.hasNext()) {
            ((InterfaceC5097h) it.next()).onStart();
        }
    }

    @Override // p288x0.InterfaceC9856i
    public void onStop() {
        Iterator it = AbstractC7838j.m12266i(this.f17606a).iterator();
        while (it.hasNext()) {
            ((InterfaceC5097h) it.next()).onStop();
        }
    }
}
