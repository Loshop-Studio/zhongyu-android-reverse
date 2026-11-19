package p381w0;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p002a1.InterfaceC0037h;
import p109d1.AbstractC8910k;

/* renamed from: w0.s */
/* loaded from: classes3.dex */
public final class C11659s implements InterfaceC11652l {

    /* renamed from: c */
    public final Set f27684c = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i */
    public void m25796i() {
        this.f27684c.clear();
    }

    /* renamed from: j */
    public List m25797j() {
        return AbstractC8910k.m17479j(this.f27684c);
    }

    /* renamed from: k */
    public void m25798k(InterfaceC0037h interfaceC0037h) {
        this.f27684c.add(interfaceC0037h);
    }

    /* renamed from: l */
    public void m25799l(InterfaceC0037h interfaceC0037h) {
        this.f27684c.remove(interfaceC0037h);
    }

    @Override // p381w0.InterfaceC11652l
    public void onDestroy() {
        Iterator it = AbstractC8910k.m17479j(this.f27684c).iterator();
        while (it.hasNext()) {
            ((InterfaceC0037h) it.next()).onDestroy();
        }
    }

    @Override // p381w0.InterfaceC11652l
    public void onStart() {
        Iterator it = AbstractC8910k.m17479j(this.f27684c).iterator();
        while (it.hasNext()) {
            ((InterfaceC0037h) it.next()).onStart();
        }
    }

    @Override // p381w0.InterfaceC11652l
    public void onStop() {
        Iterator it = AbstractC8910k.m17479j(this.f27684c).iterator();
        while (it.hasNext()) {
            ((InterfaceC0037h) it.next()).onStop();
        }
    }
}
