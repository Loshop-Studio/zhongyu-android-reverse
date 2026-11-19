package p136i9;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p147j9.AbstractC9041k;
import p192n9.C9487n;

/* renamed from: i9.p */
/* loaded from: classes5.dex */
public final class C8918p {

    /* renamed from: c */
    public Runnable f16774c;

    /* renamed from: d */
    public ExecutorService f16775d;

    /* renamed from: a */
    public int f16772a = 64;

    /* renamed from: b */
    public int f16773b = 5;

    /* renamed from: e */
    public final ArrayDeque f16776e = new ArrayDeque();

    /* renamed from: f */
    public final ArrayDeque f16777f = new ArrayDeque();

    /* renamed from: g */
    public final ArrayDeque f16778g = new ArrayDeque();

    /* renamed from: a */
    public final void m15212a(C9487n.a call) {
        C9487n.a aVarM15215d;
        AbstractC9133u.m16133g(call, "call");
        synchronized (this) {
            try {
                this.f16776e.add(call);
                if (!call.m17538d().m17524o() && (aVarM15215d = m15215d(call.m17540f())) != null) {
                    call.m17541g(aVarM15215d);
                }
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
        m15219h();
    }

    /* renamed from: b */
    public final synchronized boolean m15213b(C9487n call) {
        AbstractC9133u.m16133g(call, "call");
        return this.f16778g.add(call);
    }

    /* renamed from: c */
    public final synchronized ExecutorService m15214c() {
        ExecutorService executorService;
        try {
            if (this.f16775d == null) {
                this.f16775d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), AbstractC9041k.m15786p(AbstractC9041k.f17266c + " Dispatcher", false));
            }
            executorService = this.f16775d;
            AbstractC9133u.m16130d(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    /* renamed from: d */
    public final C9487n.a m15215d(String str) {
        Iterator it = this.f16777f.iterator();
        AbstractC9133u.m16132f(it, "iterator(...)");
        while (it.hasNext()) {
            C9487n.a aVar = (C9487n.a) it.next();
            if (AbstractC9133u.m16128b(aVar.m17540f(), str)) {
                return aVar;
            }
        }
        Iterator it2 = this.f16776e.iterator();
        AbstractC9133u.m16132f(it2, "iterator(...)");
        while (it2.hasNext()) {
            C9487n.a aVar2 = (C9487n.a) it2.next();
            if (AbstractC9133u.m16128b(aVar2.m17540f(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m15216e(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f16774c;
            C8736p c8736p = C8736p.f16368a;
        }
        if (m15219h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* renamed from: f */
    public final void m15217f(C9487n.a call) {
        AbstractC9133u.m16133g(call, "call");
        call.m17539e().decrementAndGet();
        m15216e(this.f16777f, call);
    }

    /* renamed from: g */
    public final void m15218g(C9487n call) {
        AbstractC9133u.m16133g(call, "call");
        m15216e(this.f16778g, call);
    }

    /* renamed from: h */
    public final boolean m15219h() {
        int i10;
        boolean z10;
        AbstractC9041k.m15775e(this);
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f16776e.iterator();
                AbstractC9133u.m16132f(it, "iterator(...)");
                while (it.hasNext()) {
                    C9487n.a aVar = (C9487n.a) it.next();
                    if (this.f16777f.size() >= this.f16772a) {
                        break;
                    }
                    if (aVar.m17539e().get() < this.f16773b) {
                        it.remove();
                        aVar.m17539e().incrementAndGet();
                        AbstractC9133u.m16130d(aVar);
                        arrayList.add(aVar);
                        this.f16777f.add(aVar);
                    }
                }
                i10 = 0;
                z10 = m15220i() > 0;
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (m15214c().isShutdown()) {
            int size = arrayList.size();
            while (i10 < size) {
                C9487n.a aVar2 = (C9487n.a) arrayList.get(i10);
                aVar2.m17539e().decrementAndGet();
                synchronized (this) {
                    this.f16777f.remove(aVar2);
                }
                C9487n.a.m17535c(aVar2, null, 1, null);
                i10++;
            }
            Runnable runnable = this.f16774c;
            if (runnable != null) {
                runnable.run();
                return z10;
            }
        } else {
            int size2 = arrayList.size();
            while (i10 < size2) {
                ((C9487n.a) arrayList.get(i10)).m17536a(m15214c());
                i10++;
            }
        }
        return z10;
    }

    /* renamed from: i */
    public final synchronized int m15220i() {
        return this.f16777f.size() + this.f16778g.size();
    }

    /* renamed from: j */
    public final void m15221j(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(("max < 1: " + i10).toString());
        }
        synchronized (this) {
            this.f16772a = i10;
            C8736p c8736p = C8736p.f16368a;
        }
        m15219h();
    }

    /* renamed from: k */
    public final void m15222k(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(("max < 1: " + i10).toString());
        }
        synchronized (this) {
            this.f16773b = i10;
            C8736p c8736p = C8736p.f16368a;
        }
        m15219h();
    }
}
