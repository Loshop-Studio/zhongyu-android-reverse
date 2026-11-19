package je;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9979u;
import p281oe.C10487e;
import p309qc.C10786q;

/* renamed from: je.m */
/* loaded from: classes6.dex */
public final class C9733m {

    /* renamed from: c */
    public Runnable f22729c;

    /* renamed from: d */
    public ExecutorService f22730d;

    /* renamed from: a */
    public int f22727a = 64;

    /* renamed from: b */
    public int f22728b = 5;

    /* renamed from: e */
    public final ArrayDeque f22731e = new ArrayDeque();

    /* renamed from: f */
    public final ArrayDeque f22732f = new ArrayDeque();

    /* renamed from: g */
    public final ArrayDeque f22733g = new ArrayDeque();

    /* renamed from: a */
    public final void m19343a(C10487e.a call) {
        C10487e.a aVarM19346d;
        AbstractC9979u.m20294g(call, "call");
        synchronized (this) {
            try {
                this.f22731e.add(call);
                if (!call.m21914b().m21901o() && (aVarM19346d = m19346d(call.m21916d())) != null) {
                    call.m21917e(aVarM19346d);
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
        m19350h();
    }

    /* renamed from: b */
    public final synchronized void m19344b(C10487e call) {
        AbstractC9979u.m20294g(call, "call");
        this.f22733g.add(call);
    }

    /* renamed from: c */
    public final synchronized ExecutorService m19345c() {
        ExecutorService executorService;
        try {
            if (this.f22730d == null) {
                this.f22730d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), AbstractC9920d.m20005M(AbstractC9920d.f23249i + " Dispatcher", false));
            }
            executorService = this.f22730d;
            AbstractC9979u.m20291d(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    /* renamed from: d */
    public final C10487e.a m19346d(String str) {
        Iterator it = this.f22732f.iterator();
        while (it.hasNext()) {
            C10487e.a aVar = (C10487e.a) it.next();
            if (AbstractC9979u.m20289b(aVar.m21916d(), str)) {
                return aVar;
            }
        }
        Iterator it2 = this.f22731e.iterator();
        while (it2.hasNext()) {
            C10487e.a aVar2 = (C10487e.a) it2.next();
            if (AbstractC9979u.m20289b(aVar2.m21916d(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m19347e(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f22729c;
            C10786q c10786q = C10786q.f26013a;
        }
        if (m19350h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* renamed from: f */
    public final void m19348f(C10487e.a call) {
        AbstractC9979u.m20294g(call, "call");
        call.m21915c().decrementAndGet();
        m19347e(this.f22732f, call);
    }

    /* renamed from: g */
    public final void m19349g(C10487e call) {
        AbstractC9979u.m20294g(call, "call");
        m19347e(this.f22733g, call);
    }

    /* renamed from: h */
    public final boolean m19350h() {
        int i10;
        boolean z10;
        if (AbstractC9920d.f23248h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f22731e.iterator();
                AbstractC9979u.m20293f(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    C10487e.a asyncCall = (C10487e.a) it.next();
                    if (this.f22732f.size() >= this.f22727a) {
                        break;
                    }
                    if (asyncCall.m21915c().get() < this.f22728b) {
                        it.remove();
                        asyncCall.m21915c().incrementAndGet();
                        AbstractC9979u.m20293f(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.f22732f.add(asyncCall);
                    }
                }
                z10 = m19351i() > 0;
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((C10487e.a) arrayList.get(i10)).m21913a(m19345c());
        }
        return z10;
    }

    /* renamed from: i */
    public final synchronized int m19351i() {
        return this.f22732f.size() + this.f22733g.size();
    }

    /* renamed from: j */
    public final void m19352j(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(("max < 1: " + i10).toString());
        }
        synchronized (this) {
            this.f22727a = i10;
            C10786q c10786q = C10786q.f26013a;
        }
        m19350h();
    }

    /* renamed from: k */
    public final void m19353k(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(("max < 1: " + i10).toString());
        }
        synchronized (this) {
            this.f22728b = i10;
            C10786q c10786q = C10786q.f26013a;
        }
        m19350h();
    }
}
