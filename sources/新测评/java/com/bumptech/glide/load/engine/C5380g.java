package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C5381h;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p073e1.InterfaceC7328e;
import p117i1.AbstractC7645d;
import p117i1.AbstractC7651j;
import p128j1.AbstractC7778a;
import p128j1.AbstractC7780c;
import p162m0.InterfaceC8537b;
import p184o0.InterfaceC8684d;
import p184o0.InterfaceC8690j;
import p217r0.ExecutorServiceC8995a;

/* renamed from: com.bumptech.glide.load.engine.g */
/* loaded from: classes3.dex */
public class C5380g implements DecodeJob.InterfaceC5368b, AbstractC7778a.f {

    /* renamed from: z */
    public static final c f3656z = new c();

    /* renamed from: a */
    public final e f3657a;

    /* renamed from: b */
    public final AbstractC7780c f3658b;

    /* renamed from: c */
    public final C5381h.a f3659c;

    /* renamed from: d */
    public final Pools.Pool f3660d;

    /* renamed from: e */
    public final c f3661e;

    /* renamed from: f */
    public final InterfaceC8684d f3662f;

    /* renamed from: g */
    public final ExecutorServiceC8995a f3663g;

    /* renamed from: h */
    public final ExecutorServiceC8995a f3664h;

    /* renamed from: i */
    public final ExecutorServiceC8995a f3665i;

    /* renamed from: j */
    public final ExecutorServiceC8995a f3666j;

    /* renamed from: k */
    public final AtomicInteger f3667k;

    /* renamed from: l */
    public InterfaceC8537b f3668l;

    /* renamed from: m */
    public boolean f3669m;

    /* renamed from: n */
    public boolean f3670n;

    /* renamed from: o */
    public boolean f3671o;

    /* renamed from: p */
    public boolean f3672p;

    /* renamed from: q */
    public InterfaceC8690j f3673q;

    /* renamed from: r */
    public DataSource f3674r;

    /* renamed from: s */
    public boolean f3675s;

    /* renamed from: t */
    public GlideException f3676t;

    /* renamed from: u */
    public boolean f3677u;

    /* renamed from: v */
    public C5381h f3678v;

    /* renamed from: w */
    public DecodeJob f3679w;

    /* renamed from: x */
    public volatile boolean f3680x;

    /* renamed from: y */
    public boolean f3681y;

    /* renamed from: com.bumptech.glide.load.engine.g$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final InterfaceC7328e f3682a;

        public a(InterfaceC7328e interfaceC7328e) {
            this.f3682a = interfaceC7328e;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f3682a.mo3722g()) {
                synchronized (C5380g.this) {
                    try {
                        if (C5380g.this.f3657a.m3566b(this.f3682a)) {
                            C5380g.this.m3550f(this.f3682a);
                        }
                        C5380g.this.m3553i();
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
        public final InterfaceC7328e f3684a;

        public b(InterfaceC7328e interfaceC7328e) {
            this.f3684a = interfaceC7328e;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f3684a.mo3722g()) {
                synchronized (C5380g.this) {
                    try {
                        if (C5380g.this.f3657a.m3566b(this.f3684a)) {
                            C5380g.this.f3678v.m3570b();
                            C5380g.this.m3551g(this.f3684a);
                            C5380g.this.m3561r(this.f3684a);
                        }
                        C5380g.this.m3553i();
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
        public C5381h m3563a(InterfaceC8690j interfaceC8690j, boolean z9, InterfaceC8537b interfaceC8537b, C5381h.a aVar) {
            return new C5381h(interfaceC8690j, z9, true, interfaceC8537b, aVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$d */
    public static final class d {

        /* renamed from: a */
        public final InterfaceC7328e f3686a;

        /* renamed from: b */
        public final Executor f3687b;

        public d(InterfaceC7328e interfaceC7328e, Executor executor) {
            this.f3686a = interfaceC7328e;
            this.f3687b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f3686a.equals(((d) obj).f3686a);
            }
            return false;
        }

        public int hashCode() {
            return this.f3686a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$e */
    public static final class e implements Iterable {

        /* renamed from: a */
        public final List f3688a;

        public e() {
            this(new ArrayList(2));
        }

        /* renamed from: d */
        public static d m3564d(InterfaceC7328e interfaceC7328e) {
            return new d(interfaceC7328e, AbstractC7645d.m12663a());
        }

        /* renamed from: a */
        public void m3565a(InterfaceC7328e interfaceC7328e, Executor executor) {
            this.f3688a.add(new d(interfaceC7328e, executor));
        }

        /* renamed from: b */
        public boolean m3566b(InterfaceC7328e interfaceC7328e) {
            return this.f3688a.contains(m3564d(interfaceC7328e));
        }

        /* renamed from: c */
        public e m3567c() {
            return new e(new ArrayList(this.f3688a));
        }

        public void clear() {
            this.f3688a.clear();
        }

        /* renamed from: e */
        public void m3568e(InterfaceC7328e interfaceC7328e) {
            this.f3688a.remove(m3564d(interfaceC7328e));
        }

        public boolean isEmpty() {
            return this.f3688a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f3688a.iterator();
        }

        public int size() {
            return this.f3688a.size();
        }

        public e(List list) {
            this.f3688a = list;
        }
    }

    public C5380g(ExecutorServiceC8995a executorServiceC8995a, ExecutorServiceC8995a executorServiceC8995a2, ExecutorServiceC8995a executorServiceC8995a3, ExecutorServiceC8995a executorServiceC8995a4, InterfaceC8684d interfaceC8684d, C5381h.a aVar, Pools.Pool pool) {
        this(executorServiceC8995a, executorServiceC8995a2, executorServiceC8995a3, executorServiceC8995a4, interfaceC8684d, aVar, pool, f3656z);
    }

    /* renamed from: q */
    private synchronized void m3548q() {
        if (this.f3668l == null) {
            throw new IllegalArgumentException();
        }
        this.f3657a.clear();
        this.f3668l = null;
        this.f3678v = null;
        this.f3673q = null;
        this.f3677u = false;
        this.f3680x = false;
        this.f3675s = false;
        this.f3681y = false;
        this.f3679w.m3462w(false);
        this.f3679w = null;
        this.f3676t = null;
        this.f3674r = null;
        this.f3660d.release(this);
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5368b
    /* renamed from: a */
    public void mo3468a(InterfaceC8690j interfaceC8690j, DataSource dataSource, boolean z9) {
        synchronized (this) {
            this.f3673q = interfaceC8690j;
            this.f3674r = dataSource;
            this.f3681y = z9;
        }
        m3559o();
    }

    /* renamed from: b */
    public synchronized void m3549b(InterfaceC7328e interfaceC7328e, Executor executor) {
        try {
            this.f3658b.mo13151c();
            this.f3657a.m3565a(interfaceC7328e, executor);
            if (this.f3675s) {
                m3555k(1);
                executor.execute(new b(interfaceC7328e));
            } else if (this.f3677u) {
                m3555k(1);
                executor.execute(new a(interfaceC7328e));
            } else {
                AbstractC7651j.m12680a(!this.f3680x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5368b
    /* renamed from: c */
    public void mo3469c(GlideException glideException) {
        synchronized (this) {
            this.f3676t = glideException;
        }
        m3558n();
    }

    @Override // p128j1.AbstractC7778a.f
    /* renamed from: d */
    public AbstractC7780c mo3443d() {
        return this.f3658b;
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5368b
    /* renamed from: e */
    public void mo3470e(DecodeJob decodeJob) {
        m3554j().execute(decodeJob);
    }

    /* renamed from: f */
    public void m3550f(InterfaceC7328e interfaceC7328e) {
        try {
            interfaceC7328e.mo3718c(this.f3676t);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* renamed from: g */
    public void m3551g(InterfaceC7328e interfaceC7328e) {
        try {
            interfaceC7328e.mo3717a(this.f3678v, this.f3674r, this.f3681y);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* renamed from: h */
    public void m3552h() {
        if (m3557m()) {
            return;
        }
        this.f3680x = true;
        this.f3679w.m3444e();
        this.f3662f.mo3535d(this, this.f3668l);
    }

    /* renamed from: i */
    public void m3553i() {
        C5381h c5381h;
        synchronized (this) {
            try {
                this.f3658b.mo13151c();
                AbstractC7651j.m12680a(m3557m(), "Not yet complete!");
                int iDecrementAndGet = this.f3667k.decrementAndGet();
                AbstractC7651j.m12680a(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    c5381h = this.f3678v;
                    m3548q();
                } else {
                    c5381h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c5381h != null) {
            c5381h.m3573e();
        }
    }

    /* renamed from: j */
    public final ExecutorServiceC8995a m3554j() {
        return this.f3670n ? this.f3665i : this.f3671o ? this.f3666j : this.f3664h;
    }

    /* renamed from: k */
    public synchronized void m3555k(int i10) {
        C5381h c5381h;
        AbstractC7651j.m12680a(m3557m(), "Not yet complete!");
        if (this.f3667k.getAndAdd(i10) == 0 && (c5381h = this.f3678v) != null) {
            c5381h.m3570b();
        }
    }

    /* renamed from: l */
    public synchronized C5380g m3556l(InterfaceC8537b interfaceC8537b, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f3668l = interfaceC8537b;
        this.f3669m = z9;
        this.f3670n = z10;
        this.f3671o = z11;
        this.f3672p = z12;
        return this;
    }

    /* renamed from: m */
    public final boolean m3557m() {
        return this.f3677u || this.f3675s || this.f3680x;
    }

    /* renamed from: n */
    public void m3558n() {
        synchronized (this) {
            try {
                this.f3658b.mo13151c();
                if (this.f3680x) {
                    m3548q();
                    return;
                }
                if (this.f3657a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f3677u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f3677u = true;
                InterfaceC8537b interfaceC8537b = this.f3668l;
                e eVarM3567c = this.f3657a.m3567c();
                m3555k(eVarM3567c.size() + 1);
                this.f3662f.mo3532a(this, interfaceC8537b, null);
                Iterator it = eVarM3567c.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f3687b.execute(new a(dVar.f3686a));
                }
                m3553i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: o */
    public void m3559o() {
        synchronized (this) {
            try {
                this.f3658b.mo13151c();
                if (this.f3680x) {
                    this.f3673q.recycle();
                    m3548q();
                    return;
                }
                if (this.f3657a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f3675s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f3678v = this.f3661e.m3563a(this.f3673q, this.f3669m, this.f3668l, this.f3659c);
                this.f3675s = true;
                e eVarM3567c = this.f3657a.m3567c();
                m3555k(eVarM3567c.size() + 1);
                this.f3662f.mo3532a(this, this.f3668l, this.f3678v);
                Iterator it = eVarM3567c.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f3687b.execute(new b(dVar.f3686a));
                }
                m3553i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: p */
    public boolean m3560p() {
        return this.f3672p;
    }

    /* renamed from: r */
    public synchronized void m3561r(InterfaceC7328e interfaceC7328e) {
        try {
            this.f3658b.mo13151c();
            this.f3657a.m3568e(interfaceC7328e);
            if (this.f3657a.isEmpty()) {
                m3552h();
                if (this.f3675s || this.f3677u) {
                    if (this.f3667k.get() == 0) {
                        m3548q();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: s */
    public synchronized void m3562s(DecodeJob decodeJob) {
        try {
            this.f3679w = decodeJob;
            (decodeJob.m3439D() ? this.f3663g : m3554j()).execute(decodeJob);
        } catch (Throwable th) {
            throw th;
        }
    }

    public C5380g(ExecutorServiceC8995a executorServiceC8995a, ExecutorServiceC8995a executorServiceC8995a2, ExecutorServiceC8995a executorServiceC8995a3, ExecutorServiceC8995a executorServiceC8995a4, InterfaceC8684d interfaceC8684d, C5381h.a aVar, Pools.Pool pool, c cVar) {
        this.f3657a = new e();
        this.f3658b = AbstractC7780c.m13149a();
        this.f3667k = new AtomicInteger();
        this.f3663g = executorServiceC8995a;
        this.f3664h = executorServiceC8995a2;
        this.f3665i = executorServiceC8995a3;
        this.f3666j = executorServiceC8995a4;
        this.f3662f = interfaceC8684d;
        this.f3659c = aVar;
        this.f3660d = pool;
        this.f3661e = cVar;
    }
}
