package p098e8;

import io.objectbox.BoxStore;
import io.objectbox.query.Query;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p026b8.C5206a;
import p109f8.AbstractC7950c;
import p109f8.InterfaceC7948a;
import p109f8.InterfaceC7949b;
import p109f8.InterfaceC7951d;

/* renamed from: e8.j */
/* loaded from: classes5.dex */
public class C7892j implements InterfaceC7949b {

    /* renamed from: a */
    public final Query f13265a;

    /* renamed from: b */
    public final C5206a f13266b;

    /* renamed from: c */
    public final Set f13267c = new CopyOnWriteArraySet();

    /* renamed from: d */
    public InterfaceC7948a f13268d;

    /* renamed from: e */
    public InterfaceC7951d f13269e;

    public C7892j(Query query, C5206a c5206a) {
        this.f13265a = query;
        this.f13266b = c5206a;
    }

    /* renamed from: d */
    public static /* synthetic */ void m12364d(C7892j c7892j) {
        List listM13150n = c7892j.f13265a.m13150n();
        Iterator it = c7892j.f13267c.iterator();
        while (it.hasNext()) {
            ((InterfaceC7948a) it.next()).mo12363b(listM13150n);
        }
    }

    @Override // p109f8.InterfaceC7949b
    /* renamed from: a */
    public synchronized void mo2300a(InterfaceC7948a interfaceC7948a, Object obj) {
        try {
            BoxStore boxStoreM2250g = this.f13266b.m2250g();
            if (this.f13268d == null) {
                this.f13268d = new InterfaceC7948a() { // from class: e8.h
                    @Override // p109f8.InterfaceC7948a
                    /* renamed from: b */
                    public final void mo12363b(Object obj2) {
                        this.f13263a.m12367g();
                    }
                };
            }
            if (this.f13267c.isEmpty()) {
                if (this.f13269e != null) {
                    throw new IllegalStateException("Existing subscription found");
                }
                this.f13269e = boxStoreM2250g.m13096J(this.f13266b.m2248e()).m12500c().m12499b().m12498a(this.f13268d);
            }
            this.f13267c.add(interfaceC7948a);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p109f8.InterfaceC7949b
    /* renamed from: b */
    public void mo2301b(final InterfaceC7948a interfaceC7948a, Object obj) {
        this.f13266b.m2250g().m13090B(new Runnable() { // from class: e8.g
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC7948a.mo12363b(this.f13261a.f13265a.m13150n());
            }
        });
    }

    @Override // p109f8.InterfaceC7949b
    /* renamed from: c */
    public synchronized void mo2302c(InterfaceC7948a interfaceC7948a, Object obj) {
        AbstractC7950c.m12496a(this.f13267c, interfaceC7948a);
        if (this.f13267c.isEmpty()) {
            this.f13269e.cancel();
            this.f13269e = null;
        }
    }

    /* renamed from: g */
    public void m12367g() {
        this.f13266b.m2250g().m13090B(new Runnable() { // from class: e8.i
            @Override // java.lang.Runnable
            public final void run() {
                C7892j.m12364d(this.f13264a);
            }
        });
    }
}
