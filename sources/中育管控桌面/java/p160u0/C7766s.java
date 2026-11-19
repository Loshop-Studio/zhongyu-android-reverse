package p160u0;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p016b1.AbstractC4409k;
import p188y0.InterfaceC7894h;

/* renamed from: u0.s */
/* loaded from: classes3.dex */
public final class C7766s implements InterfaceC7759l {

    /* renamed from: a */
    public final Set f10282a = Collections.newSetFromMap(new WeakHashMap());

    @Override // p160u0.InterfaceC7759l
    /* renamed from: d */
    public void mo2533d() {
        Iterator it = AbstractC4409k.m1449j(this.f10282a).iterator();
        while (it.hasNext()) {
            ((InterfaceC7894h) it.next()).mo2533d();
        }
    }

    /* renamed from: j */
    public void m9295j() {
        this.f10282a.clear();
    }

    /* renamed from: k */
    public List m9296k() {
        return AbstractC4409k.m1449j(this.f10282a);
    }

    /* renamed from: l */
    public void m9297l(InterfaceC7894h interfaceC7894h) {
        this.f10282a.add(interfaceC7894h);
    }

    /* renamed from: m */
    public void m9298m(InterfaceC7894h interfaceC7894h) {
        this.f10282a.remove(interfaceC7894h);
    }

    @Override // p160u0.InterfaceC7759l
    public void onStart() {
        Iterator it = AbstractC4409k.m1449j(this.f10282a).iterator();
        while (it.hasNext()) {
            ((InterfaceC7894h) it.next()).onStart();
        }
    }

    @Override // p160u0.InterfaceC7759l
    public void onStop() {
        Iterator it = AbstractC4409k.m1449j(this.f10282a).iterator();
        while (it.hasNext()) {
            ((InterfaceC7894h) it.next()).onStop();
        }
    }
}
