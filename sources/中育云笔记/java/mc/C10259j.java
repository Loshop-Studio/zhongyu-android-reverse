package mc;

import io.objectbox.BoxStore;
import io.objectbox.query.Query;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import nc.AbstractC10390c;
import nc.InterfaceC10388a;
import nc.InterfaceC10389b;
import nc.InterfaceC10391d;
import p210jc.C9710a;

/* renamed from: mc.j */
/* loaded from: classes6.dex */
public class C10259j implements InterfaceC10389b {

    /* renamed from: c */
    public final Query f24373c;

    /* renamed from: d */
    public final C9710a f24374d;

    /* renamed from: e */
    public final Set f24375e = new CopyOnWriteArraySet();

    /* renamed from: f */
    public InterfaceC10388a f24376f;

    /* renamed from: g */
    public InterfaceC10391d f24377g;

    public C10259j(Query query, C9710a c9710a) {
        this.f24373c = query;
        this.f24374d = c9710a;
    }

    /* renamed from: d */
    public static /* synthetic */ void m21358d(C10259j c10259j) {
        List listM19003l = c10259j.f24373c.m19003l();
        Iterator it = c10259j.f24375e.iterator();
        while (it.hasNext()) {
            ((InterfaceC10388a) it.next()).mo18993b(listM19003l);
        }
    }

    @Override // nc.InterfaceC10389b
    /* renamed from: a */
    public synchronized void mo19273a(InterfaceC10388a interfaceC10388a, Object obj) {
        AbstractC10390c.m21714a(this.f24375e, interfaceC10388a);
        if (this.f24375e.isEmpty()) {
            this.f24377g.cancel();
            this.f24377g = null;
        }
    }

    @Override // nc.InterfaceC10389b
    /* renamed from: b */
    public void mo19274b(final InterfaceC10388a interfaceC10388a, Object obj) {
        this.f24374d.m19222h().m18943D(new Runnable() { // from class: mc.g
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC10388a.mo18993b(this.f24369c.f24373c.m19003l());
            }
        });
    }

    @Override // nc.InterfaceC10389b
    /* renamed from: c */
    public synchronized void mo19275c(InterfaceC10388a interfaceC10388a, Object obj) {
        try {
            BoxStore boxStoreM19222h = this.f24374d.m19222h();
            if (this.f24376f == null) {
                this.f24376f = new InterfaceC10388a() { // from class: mc.h
                    @Override // nc.InterfaceC10388a
                    /* renamed from: b */
                    public final void mo18993b(Object obj2) {
                        this.f24371a.m21361g();
                    }
                };
            }
            if (this.f24375e.isEmpty()) {
                if (this.f24377g != null) {
                    throw new IllegalStateException("Existing subscription found");
                }
                this.f24377g = boxStoreM19222h.m18949L(this.f24374d.m19220f()).m21718c().m21717b().m21716a(this.f24376f);
            }
            this.f24375e.add(interfaceC10388a);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: g */
    public void m21361g() {
        this.f24374d.m19222h().m18943D(new Runnable() { // from class: mc.i
            @Override // java.lang.Runnable
            public final void run() {
                C10259j.m21358d(this.f24372c);
            }
        });
    }
}
