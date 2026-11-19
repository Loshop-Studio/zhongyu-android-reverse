package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C2879h;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p016c0.InterfaceC2754e;
import p062g0.AbstractC3744d;
import p062g0.AbstractC3749i;
import p067h0.AbstractC3762a;
import p067h0.AbstractC3764c;
import p076j.InterfaceC3792b;
import p093m.InterfaceC4355d;
import p093m.InterfaceC4361j;
import p106p.ExecutorServiceC4445a;

/* renamed from: com.bumptech.glide.load.engine.g */
/* loaded from: classes2.dex */
public class C2878g implements DecodeJob.InterfaceC2866b, AbstractC3762a.f {

    /* renamed from: y */
    public static final c f799y = new c();

    /* renamed from: a */
    public final e f800a;

    /* renamed from: b */
    public final AbstractC3764c f801b;

    /* renamed from: c */
    public final C2879h.a f802c;

    /* renamed from: d */
    public final Pools.Pool f803d;

    /* renamed from: e */
    public final c f804e;

    /* renamed from: f */
    public final InterfaceC4355d f805f;

    /* renamed from: g */
    public final ExecutorServiceC4445a f806g;

    /* renamed from: h */
    public final ExecutorServiceC4445a f807h;

    /* renamed from: i */
    public final ExecutorServiceC4445a f808i;

    /* renamed from: j */
    public final ExecutorServiceC4445a f809j;

    /* renamed from: k */
    public final AtomicInteger f810k;

    /* renamed from: l */
    public InterfaceC3792b f811l;

    /* renamed from: m */
    public boolean f812m;

    /* renamed from: n */
    public boolean f813n;

    /* renamed from: o */
    public boolean f814o;

    /* renamed from: p */
    public boolean f815p;

    /* renamed from: q */
    public InterfaceC4361j f816q;

    /* renamed from: r */
    public DataSource f817r;

    /* renamed from: s */
    public boolean f818s;

    /* renamed from: t */
    public GlideException f819t;

    /* renamed from: u */
    public boolean f820u;

    /* renamed from: v */
    public C2879h f821v;

    /* renamed from: w */
    public DecodeJob f822w;

    /* renamed from: x */
    public volatile boolean f823x;

    /* renamed from: com.bumptech.glide.load.engine.g$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final InterfaceC2754e f824a;

        public a(InterfaceC2754e interfaceC2754e) {
            this.f824a = interfaceC2754e;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f824a.mo1624g()) {
                synchronized (C2878g.this) {
                    if (C2878g.this.f800a.m1894b(this.f824a)) {
                        C2878g.this.m1877f(this.f824a);
                    }
                    C2878g.this.m1880i();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final InterfaceC2754e f826a;

        public b(InterfaceC2754e interfaceC2754e) {
            this.f826a = interfaceC2754e;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f826a.mo1624g()) {
                synchronized (C2878g.this) {
                    if (C2878g.this.f800a.m1894b(this.f826a)) {
                        C2878g.this.f821v.m1897a();
                        C2878g.this.m1878g(this.f826a);
                        C2878g.this.m1889r(this.f826a);
                    }
                    C2878g.this.m1880i();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$c */
    public static class c {
        /* renamed from: a */
        public C2879h m1891a(InterfaceC4361j interfaceC4361j, boolean z3, InterfaceC3792b interfaceC3792b, C2879h.a aVar) {
            return new C2879h(interfaceC4361j, z3, true, interfaceC3792b, aVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$d */
    public static final class d {

        /* renamed from: a */
        public final InterfaceC2754e f828a;

        /* renamed from: b */
        public final Executor f829b;

        public d(InterfaceC2754e interfaceC2754e, Executor executor) {
            this.f828a = interfaceC2754e;
            this.f829b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f828a.equals(((d) obj).f828a);
            }
            return false;
        }

        public int hashCode() {
            return this.f828a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$e */
    public static final class e implements Iterable {

        /* renamed from: a */
        public final List f830a;

        public e() {
            this(new ArrayList(2));
        }

        /* renamed from: d */
        public static d m1892d(InterfaceC2754e interfaceC2754e) {
            return new d(interfaceC2754e, AbstractC3744d.m4749a());
        }

        /* renamed from: a */
        public void m1893a(InterfaceC2754e interfaceC2754e, Executor executor) {
            this.f830a.add(new d(interfaceC2754e, executor));
        }

        /* renamed from: b */
        public boolean m1894b(InterfaceC2754e interfaceC2754e) {
            return this.f830a.contains(m1892d(interfaceC2754e));
        }

        /* renamed from: c */
        public e m1895c() {
            return new e(new ArrayList(this.f830a));
        }

        public void clear() {
            this.f830a.clear();
        }

        /* renamed from: e */
        public void m1896e(InterfaceC2754e interfaceC2754e) {
            this.f830a.remove(m1892d(interfaceC2754e));
        }

        public boolean isEmpty() {
            return this.f830a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f830a.iterator();
        }

        public int size() {
            return this.f830a.size();
        }

        public e(List list) {
            this.f830a = list;
        }
    }

    public C2878g(ExecutorServiceC4445a executorServiceC4445a, ExecutorServiceC4445a executorServiceC4445a2, ExecutorServiceC4445a executorServiceC4445a3, ExecutorServiceC4445a executorServiceC4445a4, InterfaceC4355d interfaceC4355d, C2879h.a aVar, Pools.Pool pool) {
        this(executorServiceC4445a, executorServiceC4445a2, executorServiceC4445a3, executorServiceC4445a4, interfaceC4355d, aVar, pool, f799y);
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC2866b
    /* renamed from: a */
    public void mo1794a(InterfaceC4361j interfaceC4361j, DataSource dataSource) {
        synchronized (this) {
            this.f816q = interfaceC4361j;
            this.f817r = dataSource;
        }
        m1886o();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC2866b
    /* renamed from: b */
    public void mo1795b(GlideException glideException) {
        synchronized (this) {
            this.f819t = glideException;
        }
        m1885n();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC2866b
    /* renamed from: c */
    public void mo1796c(DecodeJob decodeJob) {
        m1881j().execute(decodeJob);
    }

    /* renamed from: d */
    public synchronized void m1876d(InterfaceC2754e interfaceC2754e, Executor executor) {
        this.f801b.mo4865c();
        this.f800a.m1893a(interfaceC2754e, executor);
        boolean z3 = true;
        if (this.f818s) {
            m1882k(1);
            executor.execute(new b(interfaceC2754e));
        } else if (this.f820u) {
            m1882k(1);
            executor.execute(new a(interfaceC2754e));
        } else {
            if (this.f823x) {
                z3 = false;
            }
            AbstractC3749i.m4765a(z3, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    @Override // p067h0.AbstractC3762a.f
    /* renamed from: e */
    public AbstractC3764c mo1772e() {
        return this.f801b;
    }

    /* renamed from: f */
    public void m1877f(InterfaceC2754e interfaceC2754e) {
        try {
            interfaceC2754e.mo1623b(this.f819t);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* renamed from: g */
    public void m1878g(InterfaceC2754e interfaceC2754e) {
        try {
            interfaceC2754e.mo1622a(this.f821v, this.f817r);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* renamed from: h */
    public void m1879h() {
        if (m1884m()) {
            return;
        }
        this.f823x = true;
        this.f822w.m1769b();
        this.f805f.mo1860b(this, this.f811l);
    }

    /* renamed from: i */
    public void m1880i() {
        C2879h c2879h;
        synchronized (this) {
            this.f801b.mo4865c();
            AbstractC3749i.m4765a(m1884m(), "Not yet complete!");
            int iDecrementAndGet = this.f810k.decrementAndGet();
            AbstractC3749i.m4765a(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                c2879h = this.f821v;
                m1888q();
            } else {
                c2879h = null;
            }
        }
        if (c2879h != null) {
            c2879h.m1901e();
        }
    }

    /* renamed from: j */
    public final ExecutorServiceC4445a m1881j() {
        return this.f813n ? this.f808i : this.f814o ? this.f809j : this.f807h;
    }

    /* renamed from: k */
    public synchronized void m1882k(int i4) {
        C2879h c2879h;
        AbstractC3749i.m4765a(m1884m(), "Not yet complete!");
        if (this.f810k.getAndAdd(i4) == 0 && (c2879h = this.f821v) != null) {
            c2879h.m1897a();
        }
    }

    /* renamed from: l */
    public synchronized C2878g m1883l(InterfaceC3792b interfaceC3792b, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f811l = interfaceC3792b;
        this.f812m = z3;
        this.f813n = z4;
        this.f814o = z5;
        this.f815p = z6;
        return this;
    }

    /* renamed from: m */
    public final boolean m1884m() {
        return this.f820u || this.f818s || this.f823x;
    }

    /* renamed from: n */
    public void m1885n() {
        synchronized (this) {
            this.f801b.mo4865c();
            if (this.f823x) {
                m1888q();
                return;
            }
            if (this.f800a.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.f820u) {
                throw new IllegalStateException("Already failed once");
            }
            this.f820u = true;
            InterfaceC3792b interfaceC3792b = this.f811l;
            e eVarM1895c = this.f800a.m1895c();
            m1882k(eVarM1895c.size() + 1);
            this.f805f.mo1861c(this, interfaceC3792b, null);
            Iterator it = eVarM1895c.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.f829b.execute(new a(dVar.f828a));
            }
            m1880i();
        }
    }

    /* renamed from: o */
    public void m1886o() {
        synchronized (this) {
            this.f801b.mo4865c();
            if (this.f823x) {
                this.f816q.recycle();
                m1888q();
                return;
            }
            if (this.f800a.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.f818s) {
                throw new IllegalStateException("Already have resource");
            }
            this.f821v = this.f804e.m1891a(this.f816q, this.f812m, this.f811l, this.f802c);
            this.f818s = true;
            e eVarM1895c = this.f800a.m1895c();
            m1882k(eVarM1895c.size() + 1);
            this.f805f.mo1861c(this, this.f811l, this.f821v);
            Iterator it = eVarM1895c.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                dVar.f829b.execute(new b(dVar.f828a));
            }
            m1880i();
        }
    }

    /* renamed from: p */
    public boolean m1887p() {
        return this.f815p;
    }

    /* renamed from: q */
    public final synchronized void m1888q() {
        if (this.f811l == null) {
            throw new IllegalArgumentException();
        }
        this.f800a.clear();
        this.f811l = null;
        this.f821v = null;
        this.f816q = null;
        this.f820u = false;
        this.f823x = false;
        this.f818s = false;
        this.f822w.m1790w(false);
        this.f822w = null;
        this.f819t = null;
        this.f817r = null;
        this.f803d.release(this);
    }

    /* renamed from: r */
    public synchronized void m1889r(InterfaceC2754e interfaceC2754e) {
        this.f801b.mo4865c();
        this.f800a.m1896e(interfaceC2754e);
        if (this.f800a.isEmpty()) {
            m1879h();
            if ((this.f818s || this.f820u) && this.f810k.get() == 0) {
                m1888q();
            }
        }
    }

    /* renamed from: s */
    public synchronized void m1890s(DecodeJob decodeJob) {
        this.f822w = decodeJob;
        (decodeJob.m1767C() ? this.f806g : m1881j()).execute(decodeJob);
    }

    public C2878g(ExecutorServiceC4445a executorServiceC4445a, ExecutorServiceC4445a executorServiceC4445a2, ExecutorServiceC4445a executorServiceC4445a3, ExecutorServiceC4445a executorServiceC4445a4, InterfaceC4355d interfaceC4355d, C2879h.a aVar, Pools.Pool pool, c cVar) {
        this.f800a = new e();
        this.f801b = AbstractC3764c.m4863a();
        this.f810k = new AtomicInteger();
        this.f806g = executorServiceC4445a;
        this.f807h = executorServiceC4445a2;
        this.f808i = executorServiceC4445a3;
        this.f809j = executorServiceC4445a4;
        this.f805f = interfaceC4355d;
        this.f802c = aVar;
        this.f803d = pool;
        this.f804e = cVar;
    }
}
