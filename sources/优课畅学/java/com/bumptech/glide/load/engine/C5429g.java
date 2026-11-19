package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C5430h;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p069d0.InterfaceC8273e;
import p116h0.AbstractC8700d;
import p116h0.AbstractC8706j;
import p127i0.AbstractC8748a;
import p127i0.AbstractC8750c;
import p160l.InterfaceC9228b;
import p182n.InterfaceC9351d;
import p182n.InterfaceC9357j;
import p215q.ExecutorServiceC9776a;

/* renamed from: com.bumptech.glide.load.engine.g */
/* loaded from: classes3.dex */
public class C5429g implements DecodeJob.InterfaceC5417b, AbstractC8748a.f {

    /* renamed from: z */
    public static final c f3089z = new c();

    /* renamed from: a */
    public final e f3090a;

    /* renamed from: b */
    public final AbstractC8750c f3091b;

    /* renamed from: c */
    public final C5430h.a f3092c;

    /* renamed from: d */
    public final Pools.Pool f3093d;

    /* renamed from: e */
    public final c f3094e;

    /* renamed from: f */
    public final InterfaceC9351d f3095f;

    /* renamed from: g */
    public final ExecutorServiceC9776a f3096g;

    /* renamed from: h */
    public final ExecutorServiceC9776a f3097h;

    /* renamed from: i */
    public final ExecutorServiceC9776a f3098i;

    /* renamed from: j */
    public final ExecutorServiceC9776a f3099j;

    /* renamed from: k */
    public final AtomicInteger f3100k;

    /* renamed from: l */
    public InterfaceC9228b f3101l;

    /* renamed from: m */
    public boolean f3102m;

    /* renamed from: n */
    public boolean f3103n;

    /* renamed from: o */
    public boolean f3104o;

    /* renamed from: p */
    public boolean f3105p;

    /* renamed from: q */
    public InterfaceC9357j f3106q;

    /* renamed from: r */
    public DataSource f3107r;

    /* renamed from: s */
    public boolean f3108s;

    /* renamed from: t */
    public GlideException f3109t;

    /* renamed from: u */
    public boolean f3110u;

    /* renamed from: v */
    public C5430h f3111v;

    /* renamed from: w */
    public DecodeJob f3112w;

    /* renamed from: x */
    public volatile boolean f3113x;

    /* renamed from: y */
    public boolean f3114y;

    /* renamed from: com.bumptech.glide.load.engine.g$a */
    public class a implements Runnable {

        /* renamed from: a */
        public final InterfaceC8273e f3115a;

        public a(InterfaceC8273e interfaceC8273e) {
            this.f3115a = interfaceC8273e;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f3115a.mo3165f()) {
                synchronized (C5429g.this) {
                    try {
                        if (C5429g.this.f3090a.m3012b(this.f3115a)) {
                            C5429g.this.m2996f(this.f3115a);
                        }
                        C5429g.this.m2999i();
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
        public final InterfaceC8273e f3117a;

        public b(InterfaceC8273e interfaceC8273e) {
            this.f3117a = interfaceC8273e;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f3117a.mo3165f()) {
                synchronized (C5429g.this) {
                    try {
                        if (C5429g.this.f3090a.m3012b(this.f3117a)) {
                            C5429g.this.f3111v.m3015a();
                            C5429g.this.m2997g(this.f3117a);
                            C5429g.this.m3007r(this.f3117a);
                        }
                        C5429g.this.m2999i();
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
        public C5430h m3009a(InterfaceC9357j interfaceC9357j, boolean z10, InterfaceC9228b interfaceC9228b, C5430h.a aVar) {
            return new C5430h(interfaceC9357j, z10, true, interfaceC9228b, aVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$d */
    public static final class d {

        /* renamed from: a */
        public final InterfaceC8273e f3119a;

        /* renamed from: b */
        public final Executor f3120b;

        public d(InterfaceC8273e interfaceC8273e, Executor executor) {
            this.f3119a = interfaceC8273e;
            this.f3120b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f3119a.equals(((d) obj).f3119a);
            }
            return false;
        }

        public int hashCode() {
            return this.f3119a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$e */
    public static final class e implements Iterable {

        /* renamed from: a */
        public final List f3121a;

        public e() {
            this(new ArrayList(2));
        }

        /* renamed from: d */
        public static d m3010d(InterfaceC8273e interfaceC8273e) {
            return new d(interfaceC8273e, AbstractC8700d.m14161a());
        }

        /* renamed from: a */
        public void m3011a(InterfaceC8273e interfaceC8273e, Executor executor) {
            this.f3121a.add(new d(interfaceC8273e, executor));
        }

        /* renamed from: b */
        public boolean m3012b(InterfaceC8273e interfaceC8273e) {
            return this.f3121a.contains(m3010d(interfaceC8273e));
        }

        /* renamed from: c */
        public e m3013c() {
            return new e(new ArrayList(this.f3121a));
        }

        public void clear() {
            this.f3121a.clear();
        }

        /* renamed from: e */
        public void m3014e(InterfaceC8273e interfaceC8273e) {
            this.f3121a.remove(m3010d(interfaceC8273e));
        }

        public boolean isEmpty() {
            return this.f3121a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f3121a.iterator();
        }

        public int size() {
            return this.f3121a.size();
        }

        public e(List list) {
            this.f3121a = list;
        }
    }

    public C5429g(ExecutorServiceC9776a executorServiceC9776a, ExecutorServiceC9776a executorServiceC9776a2, ExecutorServiceC9776a executorServiceC9776a3, ExecutorServiceC9776a executorServiceC9776a4, InterfaceC9351d interfaceC9351d, C5430h.a aVar, Pools.Pool pool) {
        this(executorServiceC9776a, executorServiceC9776a2, executorServiceC9776a3, executorServiceC9776a4, interfaceC9351d, aVar, pool, f3089z);
    }

    /* renamed from: q */
    private synchronized void m2994q() {
        if (this.f3101l == null) {
            throw new IllegalArgumentException();
        }
        this.f3090a.clear();
        this.f3101l = null;
        this.f3111v = null;
        this.f3106q = null;
        this.f3110u = false;
        this.f3113x = false;
        this.f3108s = false;
        this.f3114y = false;
        this.f3112w.m2908w(false);
        this.f3112w = null;
        this.f3109t = null;
        this.f3107r = null;
        this.f3093d.release(this);
    }

    @Override // p127i0.AbstractC8748a.f
    /* renamed from: a */
    public AbstractC8750c mo2886a() {
        return this.f3091b;
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5417b
    /* renamed from: b */
    public void mo2914b(InterfaceC9357j interfaceC9357j, DataSource dataSource, boolean z10) {
        synchronized (this) {
            this.f3106q = interfaceC9357j;
            this.f3107r = dataSource;
            this.f3114y = z10;
        }
        m3005o();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5417b
    /* renamed from: c */
    public void mo2915c(GlideException glideException) {
        synchronized (this) {
            this.f3109t = glideException;
        }
        m3004n();
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5417b
    /* renamed from: d */
    public void mo2916d(DecodeJob decodeJob) {
        m3000j().execute(decodeJob);
    }

    /* renamed from: e */
    public synchronized void m2995e(InterfaceC8273e interfaceC8273e, Executor executor) {
        try {
            this.f3091b.mo14423c();
            this.f3090a.m3011a(interfaceC8273e, executor);
            if (this.f3108s) {
                m3001k(1);
                executor.execute(new b(interfaceC8273e));
            } else if (this.f3110u) {
                m3001k(1);
                executor.execute(new a(interfaceC8273e));
            } else {
                AbstractC8706j.m14178a(!this.f3113x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: f */
    public void m2996f(InterfaceC8273e interfaceC8273e) {
        try {
            interfaceC8273e.mo3162c(this.f3109t);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* renamed from: g */
    public void m2997g(InterfaceC8273e interfaceC8273e) {
        try {
            interfaceC8273e.mo3161b(this.f3111v, this.f3107r, this.f3114y);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* renamed from: h */
    public void m2998h() {
        if (m3003m()) {
            return;
        }
        this.f3113x = true;
        this.f3112w.m2890e();
        this.f3095f.mo2979b(this, this.f3101l);
    }

    /* renamed from: i */
    public void m2999i() {
        C5430h c5430h;
        synchronized (this) {
            try {
                this.f3091b.mo14423c();
                AbstractC8706j.m14178a(m3003m(), "Not yet complete!");
                int iDecrementAndGet = this.f3100k.decrementAndGet();
                AbstractC8706j.m14178a(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    c5430h = this.f3111v;
                    m2994q();
                } else {
                    c5430h = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c5430h != null) {
            c5430h.m3019e();
        }
    }

    /* renamed from: j */
    public final ExecutorServiceC9776a m3000j() {
        return this.f3103n ? this.f3098i : this.f3104o ? this.f3099j : this.f3097h;
    }

    /* renamed from: k */
    public synchronized void m3001k(int i10) {
        C5430h c5430h;
        AbstractC8706j.m14178a(m3003m(), "Not yet complete!");
        if (this.f3100k.getAndAdd(i10) == 0 && (c5430h = this.f3111v) != null) {
            c5430h.m3015a();
        }
    }

    /* renamed from: l */
    public synchronized C5429g m3002l(InterfaceC9228b interfaceC9228b, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f3101l = interfaceC9228b;
        this.f3102m = z10;
        this.f3103n = z11;
        this.f3104o = z12;
        this.f3105p = z13;
        return this;
    }

    /* renamed from: m */
    public final boolean m3003m() {
        return this.f3110u || this.f3108s || this.f3113x;
    }

    /* renamed from: n */
    public void m3004n() {
        synchronized (this) {
            try {
                this.f3091b.mo14423c();
                if (this.f3113x) {
                    m2994q();
                    return;
                }
                if (this.f3090a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f3110u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f3110u = true;
                InterfaceC9228b interfaceC9228b = this.f3101l;
                e eVarM3013c = this.f3090a.m3013c();
                m3001k(eVarM3013c.size() + 1);
                this.f3095f.mo2978a(this, interfaceC9228b, null);
                Iterator it = eVarM3013c.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f3120b.execute(new a(dVar.f3119a));
                }
                m2999i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: o */
    public void m3005o() {
        synchronized (this) {
            try {
                this.f3091b.mo14423c();
                if (this.f3113x) {
                    this.f3106q.recycle();
                    m2994q();
                    return;
                }
                if (this.f3090a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f3108s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f3111v = this.f3094e.m3009a(this.f3106q, this.f3102m, this.f3101l, this.f3092c);
                this.f3108s = true;
                e eVarM3013c = this.f3090a.m3013c();
                m3001k(eVarM3013c.size() + 1);
                this.f3095f.mo2978a(this, this.f3101l, this.f3111v);
                Iterator it = eVarM3013c.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f3120b.execute(new b(dVar.f3119a));
                }
                m2999i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: p */
    public boolean m3006p() {
        return this.f3105p;
    }

    /* renamed from: r */
    public synchronized void m3007r(InterfaceC8273e interfaceC8273e) {
        try {
            this.f3091b.mo14423c();
            this.f3090a.m3014e(interfaceC8273e);
            if (this.f3090a.isEmpty()) {
                m2998h();
                if (this.f3108s || this.f3110u) {
                    if (this.f3100k.get() == 0) {
                        m2994q();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: s */
    public synchronized void m3008s(DecodeJob decodeJob) {
        try {
            this.f3112w = decodeJob;
            (decodeJob.m2885D() ? this.f3096g : m3000j()).execute(decodeJob);
        } catch (Throwable th) {
            throw th;
        }
    }

    public C5429g(ExecutorServiceC9776a executorServiceC9776a, ExecutorServiceC9776a executorServiceC9776a2, ExecutorServiceC9776a executorServiceC9776a3, ExecutorServiceC9776a executorServiceC9776a4, InterfaceC9351d interfaceC9351d, C5430h.a aVar, Pools.Pool pool, c cVar) {
        this.f3090a = new e();
        this.f3091b = AbstractC8750c.m14421a();
        this.f3100k = new AtomicInteger();
        this.f3096g = executorServiceC9776a;
        this.f3097h = executorServiceC9776a2;
        this.f3098i = executorServiceC9776a3;
        this.f3099j = executorServiceC9776a4;
        this.f3095f = interfaceC9351d;
        this.f3092c = aVar;
        this.f3093d = pool;
        this.f3094e = cVar;
    }
}
