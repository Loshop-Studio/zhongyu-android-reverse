package p001a0;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p081e0.InterfaceC8344i;
import p116h0.AbstractC8707k;

/* renamed from: a0.s */
/* loaded from: classes3.dex */
public final class C0019s implements InterfaceC0012l {

    /* renamed from: a */
    public final Set f54a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i */
    public void m40i() {
        this.f54a.clear();
    }

    /* renamed from: j */
    public List m41j() {
        return AbstractC8707k.m14192j(this.f54a);
    }

    /* renamed from: k */
    public void m42k(InterfaceC8344i interfaceC8344i) {
        this.f54a.add(interfaceC8344i);
    }

    /* renamed from: l */
    public void m43l(InterfaceC8344i interfaceC8344i) {
        this.f54a.remove(interfaceC8344i);
    }

    @Override // p001a0.InterfaceC0012l
    public void onDestroy() {
        Iterator it = AbstractC8707k.m14192j(this.f54a).iterator();
        while (it.hasNext()) {
            ((InterfaceC8344i) it.next()).onDestroy();
        }
    }

    @Override // p001a0.InterfaceC0012l
    public void onStart() {
        Iterator it = AbstractC8707k.m14192j(this.f54a).iterator();
        while (it.hasNext()) {
            ((InterfaceC8344i) it.next()).onStart();
        }
    }

    @Override // p001a0.InterfaceC0012l
    public void onStop() {
        Iterator it = AbstractC8707k.m14192j(this.f54a).iterator();
        while (it.hasNext()) {
            ((InterfaceC8344i) it.next()).onStop();
        }
    }
}
