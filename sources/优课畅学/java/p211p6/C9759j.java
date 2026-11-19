package p211p6;

import io.objectbox.BoxStore;
import io.objectbox.C8957a;
import io.objectbox.query.Query;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p222q6.AbstractC9836c;
import p222q6.InterfaceC9834a;
import p222q6.InterfaceC9835b;
import p222q6.InterfaceC9837d;

/* renamed from: p6.j */
/* loaded from: classes5.dex */
public class C9759j implements InterfaceC9835b {

    /* renamed from: a */
    public final Query f19477a;

    /* renamed from: b */
    public final C8957a f19478b;

    /* renamed from: c */
    public final Set f19479c = new CopyOnWriteArraySet();

    /* renamed from: d */
    public InterfaceC9834a f19480d;

    /* renamed from: e */
    public InterfaceC9837d f19481e;

    public C9759j(Query query, C8957a c8957a) {
        this.f19477a = query;
        this.f19478b = c8957a;
    }

    /* renamed from: d */
    public static /* synthetic */ void m18274d(C9759j c9759j) {
        List listM15478j = c9759j.f19477a.m15478j();
        Iterator it = c9759j.f19479c.iterator();
        while (it.hasNext()) {
            ((InterfaceC9834a) it.next()).mo15425b(listM15478j);
        }
    }

    @Override // p222q6.InterfaceC9835b
    /* renamed from: a */
    public synchronized void mo15463a(InterfaceC9834a interfaceC9834a, Object obj) {
        AbstractC9836c.m18358a(this.f19479c, interfaceC9834a);
        if (this.f19479c.isEmpty()) {
            this.f19481e.cancel();
            this.f19481e = null;
        }
    }

    @Override // p222q6.InterfaceC9835b
    /* renamed from: b */
    public void mo15464b(final InterfaceC9834a interfaceC9834a, Object obj) {
        this.f19478b.m15409g().m15387x(new Runnable() { // from class: p6.g
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC9834a.mo15425b(this.f19473a.f19477a.m15478j());
            }
        });
    }

    @Override // p222q6.InterfaceC9835b
    /* renamed from: c */
    public synchronized void mo15465c(InterfaceC9834a interfaceC9834a, Object obj) {
        try {
            BoxStore boxStoreM15409g = this.f19478b.m15409g();
            if (this.f19480d == null) {
                this.f19480d = new InterfaceC9834a() { // from class: p6.h
                    @Override // p222q6.InterfaceC9834a
                    /* renamed from: b */
                    public final void mo15425b(Object obj2) {
                        this.f19475a.m18277g();
                    }
                };
            }
            if (this.f19479c.isEmpty()) {
                if (this.f19481e != null) {
                    throw new IllegalStateException("Existing subscription found");
                }
                this.f19481e = boxStoreM15409g.m15365E(this.f19478b.m15407e()).m18362c().m18361b().m18360a(this.f19480d);
            }
            this.f19479c.add(interfaceC9834a);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: g */
    public void m18277g() {
        this.f19478b.m15409g().m15387x(new Runnable() { // from class: p6.i
            @Override // java.lang.Runnable
            public final void run() {
                C9759j.m18274d(this.f19476a);
            }
        });
    }
}
