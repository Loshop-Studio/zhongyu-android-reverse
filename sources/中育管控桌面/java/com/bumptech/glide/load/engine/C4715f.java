package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.C4680e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C4717h;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p016b1.AbstractC4404f;
import p016b1.AbstractC4408j;
import p024c1.AbstractC4482a;
import p053f0.C6285d;
import p053f0.InterfaceC6283b;
import p067h0.AbstractC6433c;
import p067h0.C6435e;
import p067h0.C6436f;
import p067h0.C6438h;
import p067h0.C6442l;
import p067h0.InterfaceC6434d;
import p067h0.InterfaceC6440j;
import p081j0.C6574b;
import p081j0.InterfaceC6573a;
import p081j0.InterfaceC6580h;
import p088k0.ExecutorServiceC6624a;
import p181x0.InterfaceC7827e;

/* renamed from: com.bumptech.glide.load.engine.f */
/* loaded from: classes3.dex */
public class C4715f implements InterfaceC6434d, InterfaceC6580h.a, C4717h.a {

    /* renamed from: i */
    public static final boolean f2421i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final C6438h f2422a;

    /* renamed from: b */
    public final C6436f f2423b;

    /* renamed from: c */
    public final InterfaceC6580h f2424c;

    /* renamed from: d */
    public final b f2425d;

    /* renamed from: e */
    public final C6442l f2426e;

    /* renamed from: f */
    public final c f2427f;

    /* renamed from: g */
    public final a f2428g;

    /* renamed from: h */
    public final C4710a f2429h;

    /* renamed from: com.bumptech.glide.load.engine.f$a */
    public static class a {

        /* renamed from: a */
        public final DecodeJob.InterfaceC4707e f2430a;

        /* renamed from: b */
        public final Pools.Pool f2431b = AbstractC4482a.m1580d(150, new C8022a());

        /* renamed from: c */
        public int f2432c;

        /* renamed from: com.bumptech.glide.load.engine.f$a$a, reason: collision with other inner class name */
        public class C8022a implements AbstractC4482a.d {
            public C8022a() {
            }

            @Override // p024c1.AbstractC4482a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DecodeJob create() {
                a aVar = a.this;
                return new DecodeJob(aVar.f2430a, aVar.f2431b);
            }
        }

        public a(DecodeJob.InterfaceC4707e interfaceC4707e) {
            this.f2430a = interfaceC4707e;
        }

        /* renamed from: a */
        public DecodeJob m2723a(C4680e c4680e, Object obj, C6435e c6435e, InterfaceC6283b interfaceC6283b, int i6, int i7, Class cls, Class cls2, Priority priority, AbstractC6433c abstractC6433c, Map map, boolean z6, boolean z7, boolean z8, C6285d c6285d, DecodeJob.InterfaceC4704b interfaceC4704b) {
            DecodeJob decodeJob = (DecodeJob) AbstractC4408j.m1438d((DecodeJob) this.f2431b.acquire());
            int i8 = this.f2432c;
            this.f2432c = i8 + 1;
            return decodeJob.m2633n(c4680e, obj, c6435e, interfaceC6283b, i6, i7, cls, cls2, priority, abstractC6433c, map, z6, z7, z8, c6285d, interfaceC4704b, i8);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$b */
    public static class b {

        /* renamed from: a */
        public final ExecutorServiceC6624a f2434a;

        /* renamed from: b */
        public final ExecutorServiceC6624a f2435b;

        /* renamed from: c */
        public final ExecutorServiceC6624a f2436c;

        /* renamed from: d */
        public final ExecutorServiceC6624a f2437d;

        /* renamed from: e */
        public final InterfaceC6434d f2438e;

        /* renamed from: f */
        public final C4717h.a f2439f;

        /* renamed from: g */
        public final Pools.Pool f2440g = AbstractC4482a.m1580d(150, new a());

        /* renamed from: com.bumptech.glide.load.engine.f$b$a */
        public class a implements AbstractC4482a.d {
            public a() {
            }

            @Override // p024c1.AbstractC4482a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C4716g create() {
                b bVar = b.this;
                return new C4716g(bVar.f2434a, bVar.f2435b, bVar.f2436c, bVar.f2437d, bVar.f2438e, bVar.f2439f, bVar.f2440g);
            }
        }

        public b(ExecutorServiceC6624a executorServiceC6624a, ExecutorServiceC6624a executorServiceC6624a2, ExecutorServiceC6624a executorServiceC6624a3, ExecutorServiceC6624a executorServiceC6624a4, InterfaceC6434d interfaceC6434d, C4717h.a aVar) {
            this.f2434a = executorServiceC6624a;
            this.f2435b = executorServiceC6624a2;
            this.f2436c = executorServiceC6624a3;
            this.f2437d = executorServiceC6624a4;
            this.f2438e = interfaceC6434d;
            this.f2439f = aVar;
        }

        /* renamed from: a */
        public C4716g m2725a(InterfaceC6283b interfaceC6283b, boolean z6, boolean z7, boolean z8, boolean z9) {
            return ((C4716g) AbstractC4408j.m1438d((C4716g) this.f2440g.acquire())).m2736l(interfaceC6283b, z6, z7, z8, z9);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$c */
    public static class c implements DecodeJob.InterfaceC4707e {

        /* renamed from: a */
        public final InterfaceC6573a.a f2442a;

        /* renamed from: b */
        public volatile InterfaceC6573a f2443b;

        public c(InterfaceC6573a.a aVar) {
            this.f2442a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC4707e
        /* renamed from: a */
        public InterfaceC6573a mo2656a() {
            if (this.f2443b == null) {
                synchronized (this) {
                    try {
                        if (this.f2443b == null) {
                            this.f2443b = this.f2442a.build();
                        }
                        if (this.f2443b == null) {
                            this.f2443b = new C6574b();
                        }
                    } finally {
                    }
                }
            }
            return this.f2443b;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$d */
    public class d {

        /* renamed from: a */
        public final C4716g f2444a;

        /* renamed from: b */
        public final InterfaceC7827e f2445b;

        public d(InterfaceC7827e interfaceC7827e, C4716g c4716g) {
            this.f2445b = interfaceC7827e;
            this.f2444a = c4716g;
        }

        /* renamed from: a */
        public void m2727a() {
            synchronized (C4715f.this) {
                this.f2444a.m2741r(this.f2445b);
            }
        }
    }

    public C4715f(InterfaceC6580h interfaceC6580h, InterfaceC6573a.a aVar, ExecutorServiceC6624a executorServiceC6624a, ExecutorServiceC6624a executorServiceC6624a2, ExecutorServiceC6624a executorServiceC6624a3, ExecutorServiceC6624a executorServiceC6624a4, boolean z6) {
        this(interfaceC6580h, aVar, executorServiceC6624a, executorServiceC6624a2, executorServiceC6624a3, executorServiceC6624a4, null, null, null, null, null, null, z6);
    }

    /* renamed from: j */
    public static void m2711j(String str, long j6, InterfaceC6283b interfaceC6283b) {
        AbstractC4404f.m1421a(j6);
        Objects.toString(interfaceC6283b);
    }

    @Override // p081j0.InterfaceC6580h.a
    /* renamed from: a */
    public void mo2712a(InterfaceC6440j interfaceC6440j) {
        this.f2426e.m7055a(interfaceC6440j, true);
    }

    @Override // p067h0.InterfaceC6434d
    /* renamed from: b */
    public synchronized void mo2713b(C4716g c4716g, InterfaceC6283b interfaceC6283b, C4717h c4717h) {
        if (c4717h != null) {
            try {
                if (c4717h.m2752d()) {
                    this.f2429h.m2674a(interfaceC6283b, c4717h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2422a.m7048d(interfaceC6283b, c4716g);
    }

    @Override // com.bumptech.glide.load.engine.C4717h.a
    /* renamed from: c */
    public void mo2714c(InterfaceC6283b interfaceC6283b, C4717h c4717h) {
        this.f2429h.m2677d(interfaceC6283b);
        if (c4717h.m2752d()) {
            this.f2424c.mo7451e(interfaceC6283b, c4717h);
        } else {
            this.f2426e.m7055a(c4717h, false);
        }
    }

    @Override // p067h0.InterfaceC6434d
    /* renamed from: d */
    public synchronized void mo2715d(C4716g c4716g, InterfaceC6283b interfaceC6283b) {
        this.f2422a.m7048d(interfaceC6283b, c4716g);
    }

    /* renamed from: e */
    public final C4717h m2716e(InterfaceC6283b interfaceC6283b) {
        InterfaceC6440j interfaceC6440jMo7449c = this.f2424c.mo7449c(interfaceC6283b);
        if (interfaceC6440jMo7449c == null) {
            return null;
        }
        return interfaceC6440jMo7449c instanceof C4717h ? (C4717h) interfaceC6440jMo7449c : new C4717h(interfaceC6440jMo7449c, true, true, interfaceC6283b, this);
    }

    /* renamed from: f */
    public d m2717f(C4680e c4680e, Object obj, InterfaceC6283b interfaceC6283b, int i6, int i7, Class cls, Class cls2, Priority priority, AbstractC6433c abstractC6433c, Map map, boolean z6, boolean z7, C6285d c6285d, boolean z8, boolean z9, boolean z10, boolean z11, InterfaceC7827e interfaceC7827e, Executor executor) {
        long jM1422b = f2421i ? AbstractC4404f.m1422b() : 0L;
        C6435e c6435eM7044a = this.f2423b.m7044a(obj, interfaceC6283b, i6, i7, map, cls, cls2, c6285d);
        synchronized (this) {
            try {
                C4717h c4717hM2720i = m2720i(c6435eM7044a, z8, jM1422b);
                if (c4717hM2720i == null) {
                    return m2722l(c4680e, obj, interfaceC6283b, i6, i7, cls, cls2, priority, abstractC6433c, map, z6, z7, c6285d, z8, z9, z10, z11, interfaceC7827e, executor, c6435eM7044a, jM1422b);
                }
                interfaceC7827e.mo2897b(c4717hM2720i, DataSource.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final C4717h m2718g(InterfaceC6283b interfaceC6283b) {
        C4717h c4717hM2678e = this.f2429h.m2678e(interfaceC6283b);
        if (c4717hM2678e != null) {
            c4717hM2678e.m2750b();
        }
        return c4717hM2678e;
    }

    /* renamed from: h */
    public final C4717h m2719h(InterfaceC6283b interfaceC6283b) {
        C4717h c4717hM2716e = m2716e(interfaceC6283b);
        if (c4717hM2716e != null) {
            c4717hM2716e.m2750b();
            this.f2429h.m2674a(interfaceC6283b, c4717hM2716e);
        }
        return c4717hM2716e;
    }

    /* renamed from: i */
    public final C4717h m2720i(C6435e c6435e, boolean z6, long j6) {
        if (!z6) {
            return null;
        }
        C4717h c4717hM2718g = m2718g(c6435e);
        if (c4717hM2718g != null) {
            if (f2421i) {
                m2711j("Loaded resource from active resources", j6, c6435e);
            }
            return c4717hM2718g;
        }
        C4717h c4717hM2719h = m2719h(c6435e);
        if (c4717hM2719h == null) {
            return null;
        }
        if (f2421i) {
            m2711j("Loaded resource from cache", j6, c6435e);
        }
        return c4717hM2719h;
    }

    /* renamed from: k */
    public void m2721k(InterfaceC6440j interfaceC6440j) {
        if (!(interfaceC6440j instanceof C4717h)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C4717h) interfaceC6440j).m2753e();
    }

    /* renamed from: l */
    public final d m2722l(C4680e c4680e, Object obj, InterfaceC6283b interfaceC6283b, int i6, int i7, Class cls, Class cls2, Priority priority, AbstractC6433c abstractC6433c, Map map, boolean z6, boolean z7, C6285d c6285d, boolean z8, boolean z9, boolean z10, boolean z11, InterfaceC7827e interfaceC7827e, Executor executor, C6435e c6435e, long j6) {
        C4716g c4716gM7045a = this.f2422a.m7045a(c6435e, z11);
        if (c4716gM7045a != null) {
            c4716gM7045a.m2729a(interfaceC7827e, executor);
            if (f2421i) {
                m2711j("Added to existing load", j6, c6435e);
            }
            return new d(interfaceC7827e, c4716gM7045a);
        }
        C4716g c4716gM2725a = this.f2425d.m2725a(c6435e, z8, z9, z10, z11);
        DecodeJob decodeJobM2723a = this.f2428g.m2723a(c4680e, obj, c6435e, interfaceC6283b, i6, i7, cls, cls2, priority, abstractC6433c, map, z6, z7, z11, c6285d, c4716gM2725a);
        this.f2422a.m7047c(c6435e, c4716gM2725a);
        c4716gM2725a.m2729a(interfaceC7827e, executor);
        c4716gM2725a.m2742s(decodeJobM2723a);
        if (f2421i) {
            m2711j("Started new load", j6, c6435e);
        }
        return new d(interfaceC7827e, c4716gM2725a);
    }

    public C4715f(InterfaceC6580h interfaceC6580h, InterfaceC6573a.a aVar, ExecutorServiceC6624a executorServiceC6624a, ExecutorServiceC6624a executorServiceC6624a2, ExecutorServiceC6624a executorServiceC6624a3, ExecutorServiceC6624a executorServiceC6624a4, C6438h c6438h, C6436f c6436f, C4710a c4710a, b bVar, a aVar2, C6442l c6442l, boolean z6) {
        this.f2424c = interfaceC6580h;
        c cVar = new c(aVar);
        this.f2427f = cVar;
        C4710a c4710a2 = c4710a == null ? new C4710a(z6) : c4710a;
        this.f2429h = c4710a2;
        c4710a2.m2679f(this);
        this.f2423b = c6436f == null ? new C6436f() : c6436f;
        this.f2422a = c6438h == null ? new C6438h() : c6438h;
        this.f2425d = bVar == null ? new b(executorServiceC6624a, executorServiceC6624a2, executorServiceC6624a3, executorServiceC6624a4, this, this) : bVar;
        this.f2428g = aVar2 == null ? new a(cVar) : aVar2;
        this.f2426e = c6442l == null ? new C6442l() : c6442l;
        interfaceC6580h.mo7450d(this);
    }
}
