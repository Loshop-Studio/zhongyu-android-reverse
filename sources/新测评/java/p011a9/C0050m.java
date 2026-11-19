package p011a9;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p028b9.AbstractC5070d;
import p092f9.C7501e;

/* renamed from: a9.m */
/* loaded from: classes5.dex */
public final class C0050m {

    /* renamed from: c */
    public Runnable f148c;

    /* renamed from: d */
    public ExecutorService f149d;

    /* renamed from: a */
    public int f146a = 64;

    /* renamed from: b */
    public int f147b = 5;

    /* renamed from: e */
    public final ArrayDeque f150e = new ArrayDeque();

    /* renamed from: f */
    public final ArrayDeque f151f = new ArrayDeque();

    /* renamed from: g */
    public final ArrayDeque f152g = new ArrayDeque();

    /* renamed from: a */
    public final void m134a(C7501e.a call) {
        C7501e.a aVarM137d;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            try {
                this.f150e.add(call);
                if (!call.m12188b().m12176p() && (aVarM137d = m137d(call.m12190d())) != null) {
                    call.m12191e(aVarM137d);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        m141h();
    }

    /* renamed from: b */
    public final synchronized void m135b(C7501e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f152g.add(call);
    }

    /* renamed from: c */
    public final synchronized ExecutorService m136c() {
        ExecutorService executorService;
        try {
            if (this.f149d == null) {
                this.f149d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), AbstractC5070d.m2622M(AbstractC5070d.f2641i + " Dispatcher", false));
            }
            executorService = this.f149d;
            Intrinsics.checkNotNull(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    /* renamed from: d */
    public final C7501e.a m137d(String str) {
        Iterator it = this.f151f.iterator();
        while (it.hasNext()) {
            C7501e.a aVar = (C7501e.a) it.next();
            if (Intrinsics.areEqual(aVar.m12190d(), str)) {
                return aVar;
            }
        }
        Iterator it2 = this.f150e.iterator();
        while (it2.hasNext()) {
            C7501e.a aVar2 = (C7501e.a) it2.next();
            if (Intrinsics.areEqual(aVar2.m12190d(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m138e(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f148c;
            Unit unit = Unit.INSTANCE;
        }
        if (m141h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* renamed from: f */
    public final void m139f(C7501e.a call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.m12189c().decrementAndGet();
        m138e(this.f151f, call);
    }

    /* renamed from: g */
    public final void m140g(C7501e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        m138e(this.f152g, call);
    }

    /* renamed from: h */
    public final boolean m141h() {
        int i10;
        boolean z9;
        if (AbstractC5070d.f2640h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f150e.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    C7501e.a asyncCall = (C7501e.a) it.next();
                    if (this.f151f.size() >= this.f146a) {
                        break;
                    }
                    if (asyncCall.m12189c().get() < this.f147b) {
                        it.remove();
                        asyncCall.m12189c().incrementAndGet();
                        Intrinsics.checkNotNullExpressionValue(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.f151f.add(asyncCall);
                    }
                }
                z9 = m142i() > 0;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((C7501e.a) arrayList.get(i10)).m12187a(m136c());
        }
        return z9;
    }

    /* renamed from: i */
    public final synchronized int m142i() {
        return this.f151f.size() + this.f152g.size();
    }

    /* renamed from: j */
    public final void m143j(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(("max < 1: " + i10).toString());
        }
        synchronized (this) {
            this.f146a = i10;
            Unit unit = Unit.INSTANCE;
        }
        m141h();
    }

    /* renamed from: k */
    public final void m144k(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(("max < 1: " + i10).toString());
        }
        synchronized (this) {
            this.f147b = i10;
            Unit unit = Unit.INSTANCE;
        }
        m141h();
    }
}
