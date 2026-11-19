package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C4717h;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p016b1.AbstractC4402d;
import p016b1.AbstractC4408j;
import p024c1.AbstractC4482a;
import p024c1.AbstractC4484c;
import p053f0.InterfaceC6283b;
import p067h0.InterfaceC6434d;
import p067h0.InterfaceC6440j;
import p088k0.ExecutorServiceC6624a;
import p181x0.InterfaceC7827e;

/* renamed from: com.bumptech.glide.load.engine.g */
/* loaded from: classes3.dex */
public class C4716g implements DecodeJob.InterfaceC4704b, AbstractC4482a.f {

    /* renamed from: z */
    public static final c f2447z = new c();

    /* renamed from: a */
    public final e f2448a;

    /* renamed from: b */
    public final AbstractC4484c f2449b;

    /* renamed from: c */
    public final C4717h.a f2450c;

    /* renamed from: d */
    public final Pools.Pool f2451d;

    /* renamed from: e */
    public final c f2452e;

    /* renamed from: f */
    public final InterfaceC6434d f2453f;

    /* renamed from: g */
    public final ExecutorServiceC6624a f2454g;

    /* renamed from: h */
    public final ExecutorServiceC6624a f2455h;

    /* renamed from: i */
    public final ExecutorServiceC6624a f2456i;

    /* renamed from: j */
    public final ExecutorServiceC6624a f2457j;

    /* renamed from: k */
    public final AtomicInteger f2458k;

    /* renamed from: l */
    public InterfaceC6283b f2459l;

    /* renamed from: m */
    public boolean f2460m;

    /* renamed from: n */
    public boolean f2461n;

    /* renamed from: o */
    public boolean f2462o;

    /* renamed from: p */
    public boolean f2463p;

    /* renamed from: q */
    public InterfaceC6440j f2464q;

    /* renamed from: r */
    public DataSource f2465r;

    /* renamed from: s */
    public boolean f2466s;

    /* renamed from: t */
    public GlideException f2467t;

    /* renamed from: u */
    public boolean f2468u;

    /* renamed from: v */
    public C4717h f2469v;

    /* renamed from: w */
    public DecodeJob f2470w;

    /* renamed from: x */
    public volatile boolean f2471x;

    /* renamed from: y */
    public boolean f2472y;

    /* renamed from: com.bumptech.glide.load.engine.g$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final InterfaceC7827e f2473a;

        public a(InterfaceC7827e interfaceC7827e) {
            this.f2473a = interfaceC7827e;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f2473a.mo2901f()) {
                synchronized (C4716g.this) {
                    try {
                        if (C4716g.this.f2448a.m2746b(this.f2473a)) {
                            C4716g.this.m2730f(this.f2473a);
                        }
                        C4716g.this.m2733i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final InterfaceC7827e f2475a;

        public b(InterfaceC7827e interfaceC7827e) {
            this.f2475a = interfaceC7827e;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f2475a.mo2901f()) {
                synchronized (C4716g.this) {
                    try {
                        if (C4716g.this.f2448a.m2746b(this.f2475a)) {
                            C4716g.this.f2469v.m2750b();
                            C4716g.this.m2731g(this.f2475a);
                            C4716g.this.m2741r(this.f2475a);
                        }
                        C4716g.this.m2733i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$c */
    public static class c {
        /* renamed from: a */
        public C4717h m2743a(InterfaceC6440j interfaceC6440j, boolean z6, InterfaceC6283b interfaceC6283b, C4717h.a aVar) {
            return new C4717h(interfaceC6440j, z6, true, interfaceC6283b, aVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$d */
    public static final class d {

        /* renamed from: a */
        public final InterfaceC7827e f2477a;

        /* renamed from: b */
        public final Executor f2478b;

        public d(InterfaceC7827e interfaceC7827e, Executor executor) {
            this.f2477a = interfaceC7827e;
            this.f2478b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f2477a.equals(((d) obj).f2477a);
            }
            return false;
        }

        public int hashCode() {
            return this.f2477a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$e */
    public static final class e implements Iterable {

        /* renamed from: a */
        public final List f2479a;

        public e() {
            this(new ArrayList(2));
        }

        /* renamed from: d */
        public static d m2744d(InterfaceC7827e interfaceC7827e) {
            return new d(interfaceC7827e, AbstractC4402d.m1418a());
        }

        /* renamed from: a */
        public void m2745a(InterfaceC7827e interfaceC7827e, Executor executor) {
            this.f2479a.add(new d(interfaceC7827e, executor));
        }

        /* renamed from: b */
        public boolean m2746b(InterfaceC7827e interfaceC7827e) {
            return this.f2479a.contains(m2744d(interfaceC7827e));
        }

        /* renamed from: c */
        public e m2747c() {
            return new e(new ArrayList(this.f2479a));
        }

        public void clear() {
            this.f2479a.clear();
        }

        /* renamed from: e */
        public void m2748e(InterfaceC7827e interfaceC7827e) {
            this.f2479a.remove(m2744d(interfaceC7827e));
        }

        public boolean isEmpty() {
            return this.f2479a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f2479a.iterator();
        }

        public int size() {
            return this.f2479a.size();
        }

        public e(List list) {
            this.f2479a = list;
        }
    }

    public C4716g(ExecutorServiceC6624a executorServiceC6624a, ExecutorServiceC6624a executorServiceC6624a2, ExecutorServiceC6624a executorServiceC6624a3, ExecutorServiceC6624a executorServiceC6624a4, InterfaceC6434d interfaceC6434d, C4717h.a aVar, Pools.Pool pool) {
        this(executorServiceC6624a, executorServiceC6624a2, executorServiceC6624a3, executorServiceC6624a4, interfaceC6434d, aVar, pool, f2447z);
    }

    /* renamed from: q */
    private synchronized void m2728q() {
        if (this.f2459l == null) {
            throw new IllegalArgumentException();
        }
        this.f2448a.clear();
        this.f2459l = null;
        this.f2469v = null;
        this.f2464q = null;
        this.f2468u = false;
        this.f2471x = false;
        this.f2466s = false;
        this.f2472y = false;
        this.f2470w.m2642w(false);
        this.f2470w = null;
        this.f2467t = null;
        this.f2465r = null;
        this.f2451d.release(this);
    }

    /* renamed from: a */
    public synchronized void m2729a(InterfaceC7827e interfaceC7827e, Executor executor) {
        try {
            this.f2449b.mo1595c();
            this.f2448a.m2745a(interfaceC7827e, executor);
            if (this.f2466s) {
                m2735k(1);
                executor.execute(new b(interfaceC7827e));
            } else if (this.f2468u) {
                m2735k(1);
                executor.execute(new a(interfaceC7827e));
            } else {
                AbstractC4408j.m1435a(!this.f2471x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC4704b
    /* renamed from: b */
    public void mo2648b(InterfaceC6440j interfaceC6440j, DataSource dataSource, boolean z6) {
        synchronized (this) {
            this.f2464q = interfaceC6440j;
            this.f2465r = dataSource;
            this.f2472y = z6;
        }
        m2739o();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC4704b
    /* renamed from: c */
    public void mo2649c(GlideException glideException) {
        synchronized (this) {
            this.f2467t = glideException;
        }
        m2738n();
    }

    @Override // p024c1.AbstractC4482a.f
    /* renamed from: d */
    public AbstractC4484c mo1586d() {
        return this.f2449b;
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC4704b
    /* renamed from: e */
    public void mo2650e(DecodeJob decodeJob) {
        m2734j().execute(decodeJob);
    }

    /* renamed from: f */
    public void m2730f(InterfaceC7827e interfaceC7827e) {
        try {
            interfaceC7827e.mo2898c(this.f2467t);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* renamed from: g */
    public void m2731g(InterfaceC7827e interfaceC7827e) {
        try {
            interfaceC7827e.mo2897b(this.f2469v, this.f2465r, this.f2472y);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* renamed from: h */
    public void m2732h() {
        if (m2737m()) {
            return;
        }
        this.f2471x = true;
        this.f2470w.m2624e();
        this.f2453f.mo2715d(this, this.f2459l);
    }

    /* renamed from: i */
    public void m2733i() {
        C4717h c4717h;
        synchronized (this) {
            try {
                this.f2449b.mo1595c();
                AbstractC4408j.m1435a(m2737m(), "Not yet complete!");
                int iDecrementAndGet = this.f2458k.decrementAndGet();
                AbstractC4408j.m1435a(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    c4717h = this.f2469v;
                    m2728q();
                } else {
                    c4717h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c4717h != null) {
            c4717h.m2753e();
        }
    }

    /* renamed from: j */
    public final ExecutorServiceC6624a m2734j() {
        return this.f2461n ? this.f2456i : this.f2462o ? this.f2457j : this.f2455h;
    }

    /* renamed from: k */
    public synchronized void m2735k(int i6) {
        C4717h c4717h;
        AbstractC4408j.m1435a(m2737m(), "Not yet complete!");
        if (this.f2458k.getAndAdd(i6) == 0 && (c4717h = this.f2469v) != null) {
            c4717h.m2750b();
        }
    }

    /* renamed from: l */
    public synchronized C4716g m2736l(InterfaceC6283b interfaceC6283b, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f2459l = interfaceC6283b;
        this.f2460m = z6;
        this.f2461n = z7;
        this.f2462o = z8;
        this.f2463p = z9;
        return this;
    }

    /* renamed from: m */
    public final boolean m2737m() {
        return this.f2468u || this.f2466s || this.f2471x;
    }

    /* renamed from: n */
    public void m2738n() {
        synchronized (this) {
            try {
                this.f2449b.mo1595c();
                if (this.f2471x) {
                    m2728q();
                    return;
                }
                if (this.f2448a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f2468u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f2468u = true;
                InterfaceC6283b interfaceC6283b = this.f2459l;
                e eVarM2747c = this.f2448a.m2747c();
                m2735k(eVarM2747c.size() + 1);
                this.f2453f.mo2713b(this, interfaceC6283b, null);
                Iterator it = eVarM2747c.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f2478b.execute(new a(dVar.f2477a));
                }
                m2733i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: o */
    public void m2739o() {
        synchronized (this) {
            try {
                this.f2449b.mo1595c();
                if (this.f2471x) {
                    this.f2464q.recycle();
                    m2728q();
                    return;
                }
                if (this.f2448a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f2466s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f2469v = this.f2452e.m2743a(this.f2464q, this.f2460m, this.f2459l, this.f2450c);
                this.f2466s = true;
                e eVarM2747c = this.f2448a.m2747c();
                m2735k(eVarM2747c.size() + 1);
                this.f2453f.mo2713b(this, this.f2459l, this.f2469v);
                Iterator it = eVarM2747c.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f2478b.execute(new b(dVar.f2477a));
                }
                m2733i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: p */
    public boolean m2740p() {
        return this.f2463p;
    }

    /* renamed from: r */
    public synchronized void m2741r(InterfaceC7827e interfaceC7827e) {
        try {
            this.f2449b.mo1595c();
            this.f2448a.m2748e(interfaceC7827e);
            if (this.f2448a.isEmpty()) {
                m2732h();
                if (this.f2466s || this.f2468u) {
                    if (this.f2458k.get() == 0) {
                        m2728q();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: s */
    public synchronized void m2742s(DecodeJob decodeJob) {
        try {
            this.f2470w = decodeJob;
            (decodeJob.m2620D() ? this.f2454g : m2734j()).execute(decodeJob);
        } catch (Throwable th) {
            throw th;
        }
    }

    public C4716g(ExecutorServiceC6624a executorServiceC6624a, ExecutorServiceC6624a executorServiceC6624a2, ExecutorServiceC6624a executorServiceC6624a3, ExecutorServiceC6624a executorServiceC6624a4, InterfaceC6434d interfaceC6434d, C4717h.a aVar, Pools.Pool pool, c cVar) {
        this.f2448a = new e();
        this.f2449b = AbstractC4484c.m1593a();
        this.f2458k = new AtomicInteger();
        this.f2454g = executorServiceC6624a;
        this.f2455h = executorServiceC6624a2;
        this.f2456i = executorServiceC6624a3;
        this.f2457j = executorServiceC6624a4;
        this.f2453f = interfaceC6434d;
        this.f2450c = aVar;
        this.f2451d = pool;
        this.f2452e = cVar;
    }
}
