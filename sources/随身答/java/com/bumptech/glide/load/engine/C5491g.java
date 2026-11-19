package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C5492h;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p002a1.InterfaceC0013e;
import p091e1.AbstractC7832d;
import p091e1.AbstractC7837i;
import p102f1.AbstractC7909a;
import p102f1.AbstractC7911c;
import p122h0.InterfaceC8082b;
import p152k0.InterfaceC8253d;
import p152k0.InterfaceC8259j;
import p184n0.ExecutorServiceC9082a;

/* renamed from: com.bumptech.glide.load.engine.g */
/* loaded from: classes3.dex */
public class C5491g implements DecodeJob.InterfaceC5479b, AbstractC7909a.f {

    /* renamed from: y */
    public static final c f3453y = new c();

    /* renamed from: a */
    public final e f3454a;

    /* renamed from: b */
    public final AbstractC7911c f3455b;

    /* renamed from: c */
    public final C5492h.a f3456c;

    /* renamed from: d */
    public final Pools.Pool f3457d;

    /* renamed from: e */
    public final c f3458e;

    /* renamed from: f */
    public final InterfaceC8253d f3459f;

    /* renamed from: g */
    public final ExecutorServiceC9082a f3460g;

    /* renamed from: h */
    public final ExecutorServiceC9082a f3461h;

    /* renamed from: i */
    public final ExecutorServiceC9082a f3462i;

    /* renamed from: j */
    public final ExecutorServiceC9082a f3463j;

    /* renamed from: k */
    public final AtomicInteger f3464k;

    /* renamed from: l */
    public InterfaceC8082b f3465l;

    /* renamed from: m */
    public boolean f3466m;

    /* renamed from: n */
    public boolean f3467n;

    /* renamed from: o */
    public boolean f3468o;

    /* renamed from: p */
    public boolean f3469p;

    /* renamed from: q */
    public InterfaceC8259j f3470q;

    /* renamed from: r */
    public DataSource f3471r;

    /* renamed from: s */
    public boolean f3472s;

    /* renamed from: t */
    public GlideException f3473t;

    /* renamed from: u */
    public boolean f3474u;

    /* renamed from: v */
    public C5492h f3475v;

    /* renamed from: w */
    public DecodeJob f3476w;

    /* renamed from: x */
    public volatile boolean f3477x;

    /* renamed from: com.bumptech.glide.load.engine.g$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final InterfaceC0013e f3478a;

        public a(InterfaceC0013e interfaceC0013e) {
            this.f3478a = interfaceC0013e;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f3478a.mo82f()) {
                synchronized (C5491g.this) {
                    try {
                        if (C5491g.this.f3454a.m3218b(this.f3478a)) {
                            C5491g.this.m3202f(this.f3478a);
                        }
                        C5491g.this.m3205i();
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
        public final InterfaceC0013e f3480a;

        public b(InterfaceC0013e interfaceC0013e) {
            this.f3480a = interfaceC0013e;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f3480a.mo82f()) {
                synchronized (C5491g.this) {
                    try {
                        if (C5491g.this.f3454a.m3218b(this.f3480a)) {
                            C5491g.this.f3475v.m3222b();
                            C5491g.this.m3203g(this.f3480a);
                            C5491g.this.m3213r(this.f3480a);
                        }
                        C5491g.this.m3205i();
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
        public C5492h m3215a(InterfaceC8259j interfaceC8259j, boolean z9, InterfaceC8082b interfaceC8082b, C5492h.a aVar) {
            return new C5492h(interfaceC8259j, z9, true, interfaceC8082b, aVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$d */
    public static final class d {

        /* renamed from: a */
        public final InterfaceC0013e f3482a;

        /* renamed from: b */
        public final Executor f3483b;

        public d(InterfaceC0013e interfaceC0013e, Executor executor) {
            this.f3482a = interfaceC0013e;
            this.f3483b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f3482a.equals(((d) obj).f3482a);
            }
            return false;
        }

        public int hashCode() {
            return this.f3482a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$e */
    public static final class e implements Iterable {

        /* renamed from: a */
        public final List f3484a;

        public e() {
            this(new ArrayList(2));
        }

        /* renamed from: d */
        public static d m3216d(InterfaceC0013e interfaceC0013e) {
            return new d(interfaceC0013e, AbstractC7832d.m12237a());
        }

        /* renamed from: a */
        public void m3217a(InterfaceC0013e interfaceC0013e, Executor executor) {
            this.f3484a.add(new d(interfaceC0013e, executor));
        }

        /* renamed from: b */
        public boolean m3218b(InterfaceC0013e interfaceC0013e) {
            return this.f3484a.contains(m3216d(interfaceC0013e));
        }

        /* renamed from: c */
        public e m3219c() {
            return new e(new ArrayList(this.f3484a));
        }

        public void clear() {
            this.f3484a.clear();
        }

        /* renamed from: e */
        public void m3220e(InterfaceC0013e interfaceC0013e) {
            this.f3484a.remove(m3216d(interfaceC0013e));
        }

        public boolean isEmpty() {
            return this.f3484a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f3484a.iterator();
        }

        public int size() {
            return this.f3484a.size();
        }

        public e(List list) {
            this.f3484a = list;
        }
    }

    public C5491g(ExecutorServiceC9082a executorServiceC9082a, ExecutorServiceC9082a executorServiceC9082a2, ExecutorServiceC9082a executorServiceC9082a3, ExecutorServiceC9082a executorServiceC9082a4, InterfaceC8253d interfaceC8253d, C5492h.a aVar, Pools.Pool pool) {
        this(executorServiceC9082a, executorServiceC9082a2, executorServiceC9082a3, executorServiceC9082a4, interfaceC8253d, aVar, pool, f3453y);
    }

    /* renamed from: q */
    private synchronized void m3200q() {
        if (this.f3465l == null) {
            throw new IllegalArgumentException();
        }
        this.f3454a.clear();
        this.f3465l = null;
        this.f3475v = null;
        this.f3470q = null;
        this.f3474u = false;
        this.f3477x = false;
        this.f3472s = false;
        this.f3476w.m3115w(false);
        this.f3476w = null;
        this.f3473t = null;
        this.f3471r = null;
        this.f3457d.release(this);
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5479b
    /* renamed from: a */
    public void mo3119a(InterfaceC8259j interfaceC8259j, DataSource dataSource) {
        synchronized (this) {
            this.f3470q = interfaceC8259j;
            this.f3471r = dataSource;
        }
        m3211o();
    }

    @Override // p102f1.AbstractC7909a.f
    /* renamed from: b */
    public AbstractC7911c mo3094b() {
        return this.f3455b;
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5479b
    /* renamed from: c */
    public void mo3120c(GlideException glideException) {
        synchronized (this) {
            this.f3473t = glideException;
        }
        m3210n();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5479b
    /* renamed from: d */
    public void mo3121d(DecodeJob decodeJob) {
        m3206j().execute(decodeJob);
    }

    /* renamed from: e */
    public synchronized void m3201e(InterfaceC0013e interfaceC0013e, Executor executor) {
        try {
            this.f3455b.mo12450c();
            this.f3454a.m3217a(interfaceC0013e, executor);
            if (this.f3472s) {
                m3207k(1);
                executor.execute(new b(interfaceC0013e));
            } else if (this.f3474u) {
                m3207k(1);
                executor.execute(new a(interfaceC0013e));
            } else {
                AbstractC7837i.m12253a(!this.f3477x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: f */
    public void m3202f(InterfaceC0013e interfaceC0013e) {
        try {
            interfaceC0013e.mo81c(this.f3473t);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* renamed from: g */
    public void m3203g(InterfaceC0013e interfaceC0013e) {
        try {
            interfaceC0013e.mo80a(this.f3475v, this.f3471r);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* renamed from: h */
    public void m3204h() {
        if (m3209m()) {
            return;
        }
        this.f3477x = true;
        this.f3476w.m3093a();
        this.f3459f.mo3186c(this, this.f3465l);
    }

    /* renamed from: i */
    public void m3205i() {
        C5492h c5492h;
        synchronized (this) {
            try {
                this.f3455b.mo12450c();
                AbstractC7837i.m12253a(m3209m(), "Not yet complete!");
                int iDecrementAndGet = this.f3464k.decrementAndGet();
                AbstractC7837i.m12253a(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    c5492h = this.f3475v;
                    m3200q();
                } else {
                    c5492h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c5492h != null) {
            c5492h.m3225e();
        }
    }

    /* renamed from: j */
    public final ExecutorServiceC9082a m3206j() {
        return this.f3467n ? this.f3462i : this.f3468o ? this.f3463j : this.f3461h;
    }

    /* renamed from: k */
    public synchronized void m3207k(int i9) {
        C5492h c5492h;
        AbstractC7837i.m12253a(m3209m(), "Not yet complete!");
        if (this.f3464k.getAndAdd(i9) == 0 && (c5492h = this.f3475v) != null) {
            c5492h.m3222b();
        }
    }

    /* renamed from: l */
    public synchronized C5491g m3208l(InterfaceC8082b interfaceC8082b, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f3465l = interfaceC8082b;
        this.f3466m = z9;
        this.f3467n = z10;
        this.f3468o = z11;
        this.f3469p = z12;
        return this;
    }

    /* renamed from: m */
    public final boolean m3209m() {
        return this.f3474u || this.f3472s || this.f3477x;
    }

    /* renamed from: n */
    public void m3210n() {
        synchronized (this) {
            try {
                this.f3455b.mo12450c();
                if (this.f3477x) {
                    m3200q();
                    return;
                }
                if (this.f3454a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f3474u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f3474u = true;
                InterfaceC8082b interfaceC8082b = this.f3465l;
                e eVarM3219c = this.f3454a.m3219c();
                m3207k(eVarM3219c.size() + 1);
                this.f3459f.mo3185b(this, interfaceC8082b, null);
                Iterator it = eVarM3219c.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f3483b.execute(new a(dVar.f3482a));
                }
                m3205i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: o */
    public void m3211o() {
        synchronized (this) {
            try {
                this.f3455b.mo12450c();
                if (this.f3477x) {
                    this.f3470q.recycle();
                    m3200q();
                    return;
                }
                if (this.f3454a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f3472s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f3475v = this.f3458e.m3215a(this.f3470q, this.f3466m, this.f3465l, this.f3456c);
                this.f3472s = true;
                e eVarM3219c = this.f3454a.m3219c();
                m3207k(eVarM3219c.size() + 1);
                this.f3459f.mo3185b(this, this.f3465l, this.f3475v);
                Iterator it = eVarM3219c.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f3483b.execute(new b(dVar.f3482a));
                }
                m3205i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: p */
    public boolean m3212p() {
        return this.f3469p;
    }

    /* renamed from: r */
    public synchronized void m3213r(InterfaceC0013e interfaceC0013e) {
        try {
            this.f3455b.mo12450c();
            this.f3454a.m3220e(interfaceC0013e);
            if (this.f3454a.isEmpty()) {
                m3204h();
                if (this.f3472s || this.f3474u) {
                    if (this.f3464k.get() == 0) {
                        m3200q();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: s */
    public synchronized void m3214s(DecodeJob decodeJob) {
        try {
            this.f3476w = decodeJob;
            (decodeJob.m3092C() ? this.f3460g : m3206j()).execute(decodeJob);
        } catch (Throwable th) {
            throw th;
        }
    }

    public C5491g(ExecutorServiceC9082a executorServiceC9082a, ExecutorServiceC9082a executorServiceC9082a2, ExecutorServiceC9082a executorServiceC9082a3, ExecutorServiceC9082a executorServiceC9082a4, InterfaceC8253d interfaceC8253d, C5492h.a aVar, Pools.Pool pool, c cVar) {
        this.f3454a = new e();
        this.f3455b = AbstractC7911c.m12448a();
        this.f3464k = new AtomicInteger();
        this.f3460g = executorServiceC9082a;
        this.f3461h = executorServiceC9082a2;
        this.f3462i = executorServiceC9082a3;
        this.f3463j = executorServiceC9082a4;
        this.f3459f = interfaceC8253d;
        this.f3456c = aVar;
        this.f3457d = pool;
        this.f3458e = cVar;
    }
}
