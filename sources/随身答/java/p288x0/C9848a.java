package p288x0;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p091e1.AbstractC7838j;

/* renamed from: x0.a */
/* loaded from: classes3.dex */
public class C9848a implements InterfaceC9855h {

    /* renamed from: a */
    public final Set f17578a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public boolean f17579b;

    /* renamed from: c */
    public boolean f17580c;

    @Override // p288x0.InterfaceC9855h
    /* renamed from: a */
    public void mo16786a(InterfaceC9856i interfaceC9856i) {
        this.f17578a.remove(interfaceC9856i);
    }

    @Override // p288x0.InterfaceC9855h
    /* renamed from: b */
    public void mo16787b(InterfaceC9856i interfaceC9856i) {
        this.f17578a.add(interfaceC9856i);
        if (this.f17580c) {
            interfaceC9856i.onDestroy();
        } else if (this.f17579b) {
            interfaceC9856i.onStart();
        } else {
            interfaceC9856i.onStop();
        }
    }

    /* renamed from: c */
    public void m16788c() {
        this.f17580c = true;
        Iterator it = AbstractC7838j.m12266i(this.f17578a).iterator();
        while (it.hasNext()) {
            ((InterfaceC9856i) it.next()).onDestroy();
        }
    }

    /* renamed from: d */
    public void m16789d() {
        this.f17579b = true;
        Iterator it = AbstractC7838j.m12266i(this.f17578a).iterator();
        while (it.hasNext()) {
            ((InterfaceC9856i) it.next()).onStart();
        }
    }

    /* renamed from: e */
    public void m16790e() {
        this.f17579b = false;
        Iterator it = AbstractC7838j.m12266i(this.f17578a).iterator();
        while (it.hasNext()) {
            ((InterfaceC9856i) it.next()).onStop();
        }
    }
}
