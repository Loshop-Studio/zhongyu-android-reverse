package p058f5;

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
import p065g5.AbstractC6427k;
import p093k5.C6691n;

/* renamed from: f5.p */
/* loaded from: classes4.dex */
public final class C6377p {

    /* renamed from: c */
    public Runnable f7942c;

    /* renamed from: d */
    public ExecutorService f7943d;

    /* renamed from: a */
    public int f7940a = 64;

    /* renamed from: b */
    public int f7941b = 5;

    /* renamed from: e */
    public final ArrayDeque f7944e = new ArrayDeque();

    /* renamed from: f */
    public final ArrayDeque f7945f = new ArrayDeque();

    /* renamed from: g */
    public final ArrayDeque f7946g = new ArrayDeque();

    /* renamed from: a */
    public final void m6751a(C6691n.a call) {
        C6691n.a aVarM6754d;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            try {
                this.f7944e.add(call);
                if (!call.m7805d().m7791o() && (aVarM6754d = m6754d(call.m7807f())) != null) {
                    call.m7808g(aVarM6754d);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        m6758h();
    }

    /* renamed from: b */
    public final synchronized boolean m6752b(C6691n call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return this.f7946g.add(call);
    }

    /* renamed from: c */
    public final synchronized ExecutorService m6753c() {
        ExecutorService executorService;
        try {
            if (this.f7943d == null) {
                this.f7943d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), AbstractC6427k.m7028p(AbstractC6427k.f8101c + " Dispatcher", false));
            }
            executorService = this.f7943d;
            Intrinsics.checkNotNull(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    /* renamed from: d */
    public final C6691n.a m6754d(String str) {
        Iterator it = this.f7945f.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            C6691n.a aVar = (C6691n.a) it.next();
            if (Intrinsics.areEqual(aVar.m7807f(), str)) {
                return aVar;
            }
        }
        Iterator it2 = this.f7944e.iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            C6691n.a aVar2 = (C6691n.a) it2.next();
            if (Intrinsics.areEqual(aVar2.m7807f(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m6755e(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f7942c;
            Unit unit = Unit.INSTANCE;
        }
        if (m6758h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* renamed from: f */
    public final void m6756f(C6691n.a call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.m7806e().decrementAndGet();
        m6755e(this.f7945f, call);
    }

    /* renamed from: g */
    public final void m6757g(C6691n call) {
        Intrinsics.checkNotNullParameter(call, "call");
        m6755e(this.f7946g, call);
    }

    /* renamed from: h */
    public final boolean m6758h() {
        int i6;
        boolean z6;
        AbstractC6427k.m7017e(this);
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f7944e.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    C6691n.a aVar = (C6691n.a) it.next();
                    if (this.f7945f.size() >= this.f7940a) {
                        break;
                    }
                    if (aVar.m7806e().get() < this.f7941b) {
                        it.remove();
                        aVar.m7806e().incrementAndGet();
                        Intrinsics.checkNotNull(aVar);
                        arrayList.add(aVar);
                        this.f7945f.add(aVar);
                    }
                }
                i6 = 0;
                z6 = m6759i() > 0;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (m6753c().isShutdown()) {
            int size = arrayList.size();
            while (i6 < size) {
                C6691n.a aVar2 = (C6691n.a) arrayList.get(i6);
                aVar2.m7806e().decrementAndGet();
                synchronized (this) {
                    this.f7945f.remove(aVar2);
                }
                C6691n.a.m7802c(aVar2, null, 1, null);
                i6++;
            }
            Runnable runnable = this.f7942c;
            if (runnable != null) {
                runnable.run();
                return z6;
            }
        } else {
            int size2 = arrayList.size();
            while (i6 < size2) {
                ((C6691n.a) arrayList.get(i6)).m7803a(m6753c());
                i6++;
            }
        }
        return z6;
    }

    /* renamed from: i */
    public final synchronized int m6759i() {
        return this.f7945f.size() + this.f7946g.size();
    }

    /* renamed from: j */
    public final void m6760j(int i6) {
        if (i6 < 1) {
            throw new IllegalArgumentException(("max < 1: " + i6).toString());
        }
        synchronized (this) {
            this.f7940a = i6;
            Unit unit = Unit.INSTANCE;
        }
        m6758h();
    }

    /* renamed from: k */
    public final void m6761k(int i6) {
        if (i6 < 1) {
            throw new IllegalArgumentException(("max < 1: " + i6).toString());
        }
        synchronized (this) {
            this.f7941b = i6;
            Unit unit = Unit.INSTANCE;
        }
        m6758h();
    }
}
