package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C5849h;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p109d1.AbstractC8903d;
import p109d1.AbstractC8909j;
import p125e1.AbstractC9069a;
import p125e1.AbstractC9071c;
import p168h0.InterfaceC9435b;
import p198j0.InterfaceC9651d;
import p198j0.InterfaceC9657j;
import p242m0.ExecutorServiceC10189a;
import p428z0.InterfaceC11956e;

/* renamed from: com.bumptech.glide.load.engine.g */
/* loaded from: classes3.dex */
public class C5848g implements DecodeJob.InterfaceC5836b, AbstractC9069a.f {

    /* renamed from: B */
    public static final c f4859B = new c();

    /* renamed from: A */
    public boolean f4860A;

    /* renamed from: c */
    public final e f4861c;

    /* renamed from: d */
    public final AbstractC9071c f4862d;

    /* renamed from: e */
    public final C5849h.a f4863e;

    /* renamed from: f */
    public final Pools.Pool f4864f;

    /* renamed from: g */
    public final c f4865g;

    /* renamed from: h */
    public final InterfaceC9651d f4866h;

    /* renamed from: i */
    public final ExecutorServiceC10189a f4867i;

    /* renamed from: j */
    public final ExecutorServiceC10189a f4868j;

    /* renamed from: k */
    public final ExecutorServiceC10189a f4869k;

    /* renamed from: l */
    public final ExecutorServiceC10189a f4870l;

    /* renamed from: m */
    public final AtomicInteger f4871m;

    /* renamed from: n */
    public InterfaceC9435b f4872n;

    /* renamed from: o */
    public boolean f4873o;

    /* renamed from: p */
    public boolean f4874p;

    /* renamed from: q */
    public boolean f4875q;

    /* renamed from: r */
    public boolean f4876r;

    /* renamed from: s */
    public InterfaceC9657j f4877s;

    /* renamed from: t */
    public DataSource f4878t;

    /* renamed from: u */
    public boolean f4879u;

    /* renamed from: v */
    public GlideException f4880v;

    /* renamed from: w */
    public boolean f4881w;

    /* renamed from: x */
    public C5849h f4882x;

    /* renamed from: y */
    public DecodeJob f4883y;

    /* renamed from: z */
    public volatile boolean f4884z;

    /* renamed from: com.bumptech.glide.load.engine.g$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final InterfaceC11956e f4885c;

        public a(InterfaceC11956e interfaceC11956e) {
            this.f4885c = interfaceC11956e;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f4885c.mo4367f()) {
                synchronized (C5848g.this) {
                    try {
                        if (C5848g.this.f4861c.m4216b(this.f4885c)) {
                            C5848g.this.m4200f(this.f4885c);
                        }
                        C5848g.this.m4203i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$b */
    public class b implements Runnable {

        /* renamed from: c */
        public final InterfaceC11956e f4887c;

        public b(InterfaceC11956e interfaceC11956e) {
            this.f4887c = interfaceC11956e;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f4887c.mo4367f()) {
                synchronized (C5848g.this) {
                    try {
                        if (C5848g.this.f4861c.m4216b(this.f4887c)) {
                            C5848g.this.f4882x.m4220b();
                            C5848g.this.m4201g(this.f4887c);
                            C5848g.this.m4211r(this.f4887c);
                        }
                        C5848g.this.m4203i();
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
        public C5849h m4213a(InterfaceC9657j interfaceC9657j, boolean z10, InterfaceC9435b interfaceC9435b, C5849h.a aVar) {
            return new C5849h(interfaceC9657j, z10, true, interfaceC9435b, aVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$d */
    public static final class d {

        /* renamed from: a */
        public final InterfaceC11956e f4889a;

        /* renamed from: b */
        public final Executor f4890b;

        public d(InterfaceC11956e interfaceC11956e, Executor executor) {
            this.f4889a = interfaceC11956e;
            this.f4890b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f4889a.equals(((d) obj).f4889a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4889a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$e */
    public static final class e implements Iterable {

        /* renamed from: c */
        public final List f4891c;

        public e() {
            this(new ArrayList(2));
        }

        /* renamed from: d */
        public static d m4214d(InterfaceC11956e interfaceC11956e) {
            return new d(interfaceC11956e, AbstractC8903d.m17448a());
        }

        /* renamed from: a */
        public void m4215a(InterfaceC11956e interfaceC11956e, Executor executor) {
            this.f4891c.add(new d(interfaceC11956e, executor));
        }

        /* renamed from: b */
        public boolean m4216b(InterfaceC11956e interfaceC11956e) {
            return this.f4891c.contains(m4214d(interfaceC11956e));
        }

        /* renamed from: c */
        public e m4217c() {
            return new e(new ArrayList(this.f4891c));
        }

        public void clear() {
            this.f4891c.clear();
        }

        /* renamed from: e */
        public void m4218e(InterfaceC11956e interfaceC11956e) {
            this.f4891c.remove(m4214d(interfaceC11956e));
        }

        public boolean isEmpty() {
            return this.f4891c.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f4891c.iterator();
        }

        public int size() {
            return this.f4891c.size();
        }

        public e(List list) {
            this.f4891c = list;
        }
    }

    public C5848g(ExecutorServiceC10189a executorServiceC10189a, ExecutorServiceC10189a executorServiceC10189a2, ExecutorServiceC10189a executorServiceC10189a3, ExecutorServiceC10189a executorServiceC10189a4, InterfaceC9651d interfaceC9651d, C5849h.a aVar, Pools.Pool pool) {
        this(executorServiceC10189a, executorServiceC10189a2, executorServiceC10189a3, executorServiceC10189a4, interfaceC9651d, aVar, pool, f4859B);
    }

    /* renamed from: q */
    private synchronized void m4198q() {
        if (this.f4872n == null) {
            throw new IllegalArgumentException();
        }
        this.f4861c.clear();
        this.f4872n = null;
        this.f4882x = null;
        this.f4877s = null;
        this.f4881w = false;
        this.f4884z = false;
        this.f4879u = false;
        this.f4860A = false;
        this.f4883y.m4112w(false);
        this.f4883y = null;
        this.f4880v = null;
        this.f4878t = null;
        this.f4864f.release(this);
    }

    /* renamed from: a */
    public synchronized void m4199a(InterfaceC11956e interfaceC11956e, Executor executor) {
        try {
            this.f4862d.mo17872c();
            this.f4861c.m4215a(interfaceC11956e, executor);
            if (this.f4879u) {
                m4205k(1);
                executor.execute(new b(interfaceC11956e));
            } else if (this.f4881w) {
                m4205k(1);
                executor.execute(new a(interfaceC11956e));
            } else {
                AbstractC8909j.m17465a(!this.f4884z, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5836b
    /* renamed from: b */
    public void mo4118b(GlideException glideException) {
        synchronized (this) {
            this.f4880v = glideException;
        }
        m4208n();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5836b
    /* renamed from: c */
    public void mo4119c(InterfaceC9657j interfaceC9657j, DataSource dataSource, boolean z10) {
        synchronized (this) {
            this.f4877s = interfaceC9657j;
            this.f4878t = dataSource;
            this.f4860A = z10;
        }
        m4209o();
    }

    @Override // p125e1.AbstractC9069a.f
    /* renamed from: d */
    public AbstractC9071c mo4093d() {
        return this.f4862d;
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5836b
    /* renamed from: e */
    public void mo4120e(DecodeJob decodeJob) {
        m4204j().execute(decodeJob);
    }

    /* renamed from: f */
    public void m4200f(InterfaceC11956e interfaceC11956e) {
        try {
            interfaceC11956e.mo4364b(this.f4880v);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* renamed from: g */
    public void m4201g(InterfaceC11956e interfaceC11956e) {
        try {
            interfaceC11956e.mo4365c(this.f4882x, this.f4878t, this.f4860A);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* renamed from: h */
    public void m4202h() {
        if (m4207m()) {
            return;
        }
        this.f4884z = true;
        this.f4883y.m4092c();
        this.f4866h.mo4185d(this, this.f4872n);
    }

    /* renamed from: i */
    public void m4203i() {
        C5849h c5849h;
        synchronized (this) {
            try {
                this.f4862d.mo17872c();
                AbstractC8909j.m17465a(m4207m(), "Not yet complete!");
                int iDecrementAndGet = this.f4871m.decrementAndGet();
                AbstractC8909j.m17465a(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    c5849h = this.f4882x;
                    m4198q();
                } else {
                    c5849h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c5849h != null) {
            c5849h.m4223e();
        }
    }

    /* renamed from: j */
    public final ExecutorServiceC10189a m4204j() {
        return this.f4874p ? this.f4869k : this.f4875q ? this.f4870l : this.f4868j;
    }

    /* renamed from: k */
    public synchronized void m4205k(int i10) {
        C5849h c5849h;
        AbstractC8909j.m17465a(m4207m(), "Not yet complete!");
        if (this.f4871m.getAndAdd(i10) == 0 && (c5849h = this.f4882x) != null) {
            c5849h.m4220b();
        }
    }

    /* renamed from: l */
    public synchronized C5848g m4206l(InterfaceC9435b interfaceC9435b, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f4872n = interfaceC9435b;
        this.f4873o = z10;
        this.f4874p = z11;
        this.f4875q = z12;
        this.f4876r = z13;
        return this;
    }

    /* renamed from: m */
    public final boolean m4207m() {
        return this.f4881w || this.f4879u || this.f4884z;
    }

    /* renamed from: n */
    public void m4208n() {
        synchronized (this) {
            try {
                this.f4862d.mo17872c();
                if (this.f4884z) {
                    m4198q();
                    return;
                }
                if (this.f4861c.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f4881w) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f4881w = true;
                InterfaceC9435b interfaceC9435b = this.f4872n;
                e eVarM4217c = this.f4861c.m4217c();
                m4205k(eVarM4217c.size() + 1);
                this.f4866h.mo4184c(this, interfaceC9435b, null);
                Iterator it = eVarM4217c.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f4890b.execute(new a(dVar.f4889a));
                }
                m4203i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: o */
    public void m4209o() {
        synchronized (this) {
            try {
                this.f4862d.mo17872c();
                if (this.f4884z) {
                    this.f4877s.recycle();
                    m4198q();
                    return;
                }
                if (this.f4861c.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f4879u) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f4882x = this.f4865g.m4213a(this.f4877s, this.f4873o, this.f4872n, this.f4863e);
                this.f4879u = true;
                e eVarM4217c = this.f4861c.m4217c();
                m4205k(eVarM4217c.size() + 1);
                this.f4866h.mo4184c(this, this.f4872n, this.f4882x);
                Iterator it = eVarM4217c.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f4890b.execute(new b(dVar.f4889a));
                }
                m4203i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: p */
    public boolean m4210p() {
        return this.f4876r;
    }

    /* renamed from: r */
    public synchronized void m4211r(InterfaceC11956e interfaceC11956e) {
        try {
            this.f4862d.mo17872c();
            this.f4861c.m4218e(interfaceC11956e);
            if (this.f4861c.isEmpty()) {
                m4202h();
                if (this.f4879u || this.f4881w) {
                    if (this.f4871m.get() == 0) {
                        m4198q();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: s */
    public synchronized void m4212s(DecodeJob decodeJob) {
        try {
            this.f4883y = decodeJob;
            (decodeJob.m4089D() ? this.f4867i : m4204j()).execute(decodeJob);
        } catch (Throwable th) {
            throw th;
        }
    }

    public C5848g(ExecutorServiceC10189a executorServiceC10189a, ExecutorServiceC10189a executorServiceC10189a2, ExecutorServiceC10189a executorServiceC10189a3, ExecutorServiceC10189a executorServiceC10189a4, InterfaceC9651d interfaceC9651d, C5849h.a aVar, Pools.Pool pool, c cVar) {
        this.f4861c = new e();
        this.f4862d = AbstractC9071c.m17870a();
        this.f4871m = new AtomicInteger();
        this.f4867i = executorServiceC10189a;
        this.f4868j = executorServiceC10189a2;
        this.f4869k = executorServiceC10189a3;
        this.f4870l = executorServiceC10189a4;
        this.f4866h = interfaceC9651d;
        this.f4863e = aVar;
        this.f4864f = pool;
        this.f4865g = cVar;
    }
}
