package p247t8;

import io.objectbox.BoxStore;
import io.objectbox.query.Query;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p214q8.C8980a;
import p258u8.AbstractC9591c;
import p258u8.InterfaceC9589a;
import p258u8.InterfaceC9590b;
import p258u8.InterfaceC9592d;

/* renamed from: t8.j */
/* loaded from: classes5.dex */
public class C9503j implements InterfaceC9590b {

    /* renamed from: a */
    public final Query f16598a;

    /* renamed from: b */
    public final C8980a f16599b;

    /* renamed from: c */
    public final Set f16600c = new CopyOnWriteArraySet();

    /* renamed from: d */
    public InterfaceC9589a f16601d;

    /* renamed from: e */
    public InterfaceC9592d f16602e;

    public C9503j(Query query, C8980a c8980a) {
        this.f16598a = query;
        this.f16599b = c8980a;
    }

    /* renamed from: d */
    public static /* synthetic */ void m15862d(C9503j c9503j) {
        List listM13031n = c9503j.f16598a.m13031n();
        Iterator it = c9503j.f16600c.iterator();
        while (it.hasNext()) {
            ((InterfaceC9589a) it.next()).mo13021b(listM13031n);
        }
    }

    @Override // p258u8.InterfaceC9590b
    /* renamed from: a */
    public synchronized void mo15089a(InterfaceC9589a interfaceC9589a, Object obj) {
        AbstractC9591c.m15985a(this.f16600c, interfaceC9589a);
        if (this.f16600c.isEmpty()) {
            this.f16602e.cancel();
            this.f16602e = null;
        }
    }

    @Override // p258u8.InterfaceC9590b
    /* renamed from: b */
    public synchronized void mo15090b(InterfaceC9589a interfaceC9589a, Object obj) {
        try {
            BoxStore boxStoreM15040g = this.f16599b.m15040g();
            if (this.f16601d == null) {
                this.f16601d = new InterfaceC9589a() { // from class: t8.h
                    @Override // p258u8.InterfaceC9589a
                    /* renamed from: b */
                    public final void mo13021b(Object obj2) {
                        this.f16596a.m15865g();
                    }
                };
            }
            if (this.f16600c.isEmpty()) {
                if (this.f16602e != null) {
                    throw new IllegalStateException("Existing subscription found");
                }
                this.f16602e = boxStoreM15040g.m12976J(this.f16599b.m15038e()).m15989c().m15988b().m15987a(this.f16601d);
            }
            this.f16600c.add(interfaceC9589a);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p258u8.InterfaceC9590b
    /* renamed from: c */
    public void mo15091c(final InterfaceC9589a interfaceC9589a, Object obj) {
        this.f16599b.m15040g().m12970B(new Runnable() { // from class: t8.g
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC9589a.mo13021b(this.f16594a.f16598a.m13031n());
            }
        });
    }

    /* renamed from: g */
    public void m15865g() {
        this.f16599b.m15040g().m12970B(new Runnable() { // from class: t8.i
            @Override // java.lang.Runnable
            public final void run() {
                C9503j.m15862d(this.f16597a);
            }
        });
    }
}
