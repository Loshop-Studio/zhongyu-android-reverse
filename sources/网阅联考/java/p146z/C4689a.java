package p146z;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import p062g0.AbstractC3750j;

/* renamed from: z.a */
/* loaded from: classes2.dex */
public class C4689a implements InterfaceC4696h {

    /* renamed from: a */
    public final Set f6035a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public boolean f6036b;

    /* renamed from: c */
    public boolean f6037c;

    @Override // p146z.InterfaceC4696h
    /* renamed from: a */
    public void mo6653a(InterfaceC4697i interfaceC4697i) {
        this.f6035a.remove(interfaceC4697i);
    }

    @Override // p146z.InterfaceC4696h
    /* renamed from: b */
    public void mo6654b(InterfaceC4697i interfaceC4697i) {
        this.f6035a.add(interfaceC4697i);
        if (this.f6037c) {
            interfaceC4697i.mo1732c();
        } else if (this.f6036b) {
            interfaceC4697i.onStart();
        } else {
            interfaceC4697i.onStop();
        }
    }

    /* renamed from: c */
    public void m6655c() {
        this.f6037c = true;
        Iterator it = AbstractC3750j.m4778i(this.f6035a).iterator();
        while (it.hasNext()) {
            ((InterfaceC4697i) it.next()).mo1732c();
        }
    }

    /* renamed from: d */
    public void m6656d() {
        this.f6036b = true;
        Iterator it = AbstractC3750j.m4778i(this.f6035a).iterator();
        while (it.hasNext()) {
            ((InterfaceC4697i) it.next()).onStart();
        }
    }

    /* renamed from: e */
    public void m6657e() {
        this.f6036b = false;
        Iterator it = AbstractC3750j.m4778i(this.f6035a).iterator();
        while (it.hasNext()) {
            ((InterfaceC4697i) it.next()).onStop();
        }
    }
}
