package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.C5393d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C5430h;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p069d0.InterfaceC8273e;
import p116h0.AbstractC8702f;
import p116h0.AbstractC8706j;
import p127i0.AbstractC8748a;
import p160l.C9230d;
import p160l.InterfaceC9228b;
import p182n.AbstractC9350c;
import p182n.C9352e;
import p182n.C9353f;
import p182n.C9355h;
import p182n.C9359l;
import p182n.InterfaceC9351d;
import p182n.InterfaceC9357j;
import p204p.C9625b;
import p204p.InterfaceC9624a;
import p204p.InterfaceC9631h;
import p215q.ExecutorServiceC9776a;

/* renamed from: com.bumptech.glide.load.engine.f */
/* loaded from: classes3.dex */
public class C5428f implements InterfaceC9351d, InterfaceC9631h.a, C5430h.a {

    /* renamed from: i */
    public static final boolean f3063i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final C9355h f3064a;

    /* renamed from: b */
    public final C9353f f3065b;

    /* renamed from: c */
    public final InterfaceC9631h f3066c;

    /* renamed from: d */
    public final b f3067d;

    /* renamed from: e */
    public final C9359l f3068e;

    /* renamed from: f */
    public final c f3069f;

    /* renamed from: g */
    public final a f3070g;

    /* renamed from: h */
    public final C5423a f3071h;

    /* renamed from: com.bumptech.glide.load.engine.f$a */
    public static class a {

        /* renamed from: a */
        public final DecodeJob.InterfaceC5420e f3072a;

        /* renamed from: b */
        public final Pools.Pool f3073b = AbstractC8748a.m14409d(150, new C10788a());

        /* renamed from: c */
        public int f3074c;

        /* renamed from: com.bumptech.glide.load.engine.f$a$a, reason: collision with other inner class name */
        public class C10788a implements AbstractC8748a.d {
            public C10788a() {
            }

            @Override // p127i0.AbstractC8748a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DecodeJob create() {
                a aVar = a.this;
                return new DecodeJob(aVar.f3072a, aVar.f3073b);
            }
        }

        public a(DecodeJob.InterfaceC5420e interfaceC5420e) {
            this.f3072a = interfaceC5420e;
        }

        /* renamed from: a */
        public DecodeJob m2989a(C5393d c5393d, Object obj, C9352e c9352e, InterfaceC9228b interfaceC9228b, int i10, int i11, Class cls, Class cls2, Priority priority, AbstractC9350c abstractC9350c, Map map, boolean z10, boolean z11, boolean z12, C9230d c9230d, DecodeJob.InterfaceC5417b interfaceC5417b) {
            DecodeJob decodeJob = (DecodeJob) AbstractC8706j.m14181d((DecodeJob) this.f3073b.acquire());
            int i12 = this.f3074c;
            this.f3074c = i12 + 1;
            return decodeJob.m2899n(c5393d, obj, c9352e, interfaceC9228b, i10, i11, cls, cls2, priority, abstractC9350c, map, z10, z11, z12, c9230d, interfaceC5417b, i12);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$b */
    public static class b {

        /* renamed from: a */
        public final ExecutorServiceC9776a f3076a;

        /* renamed from: b */
        public final ExecutorServiceC9776a f3077b;

        /* renamed from: c */
        public final ExecutorServiceC9776a f3078c;

        /* renamed from: d */
        public final ExecutorServiceC9776a f3079d;

        /* renamed from: e */
        public final InterfaceC9351d f3080e;

        /* renamed from: f */
        public final C5430h.a f3081f;

        /* renamed from: g */
        public final Pools.Pool f3082g = AbstractC8748a.m14409d(150, new a());

        /* renamed from: com.bumptech.glide.load.engine.f$b$a */
        public class a implements AbstractC8748a.d {
            public a() {
            }

            @Override // p127i0.AbstractC8748a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C5429g create() {
                b bVar = b.this;
                return new C5429g(bVar.f3076a, bVar.f3077b, bVar.f3078c, bVar.f3079d, bVar.f3080e, bVar.f3081f, bVar.f3082g);
            }
        }

        public b(ExecutorServiceC9776a executorServiceC9776a, ExecutorServiceC9776a executorServiceC9776a2, ExecutorServiceC9776a executorServiceC9776a3, ExecutorServiceC9776a executorServiceC9776a4, InterfaceC9351d interfaceC9351d, C5430h.a aVar) {
            this.f3076a = executorServiceC9776a;
            this.f3077b = executorServiceC9776a2;
            this.f3078c = executorServiceC9776a3;
            this.f3079d = executorServiceC9776a4;
            this.f3080e = interfaceC9351d;
            this.f3081f = aVar;
        }

        /* renamed from: a */
        public C5429g m2991a(InterfaceC9228b interfaceC9228b, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((C5429g) AbstractC8706j.m14181d((C5429g) this.f3082g.acquire())).m3002l(interfaceC9228b, z10, z11, z12, z13);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$c */
    public static class c implements DecodeJob.InterfaceC5420e {

        /* renamed from: a */
        public final InterfaceC9624a.a f3084a;

        /* renamed from: b */
        public volatile InterfaceC9624a f3085b;

        public c(InterfaceC9624a.a aVar) {
            this.f3084a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5420e
        /* renamed from: a */
        public InterfaceC9624a mo2922a() {
            if (this.f3085b == null) {
                synchronized (this) {
                    try {
                        if (this.f3085b == null) {
                            this.f3085b = this.f3084a.build();
                        }
                        if (this.f3085b == null) {
                            this.f3085b = new C9625b();
                        }
                    } finally {
                    }
                }
            }
            return this.f3085b;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$d */
    public class d {

        /* renamed from: a */
        public final C5429g f3086a;

        /* renamed from: b */
        public final InterfaceC8273e f3087b;

        public d(InterfaceC8273e interfaceC8273e, C5429g c5429g) {
            this.f3087b = interfaceC8273e;
            this.f3086a = c5429g;
        }

        /* renamed from: a */
        public void m2993a() {
            synchronized (C5428f.this) {
                this.f3086a.m3007r(this.f3087b);
            }
        }
    }

    public C5428f(InterfaceC9631h interfaceC9631h, InterfaceC9624a.a aVar, ExecutorServiceC9776a executorServiceC9776a, ExecutorServiceC9776a executorServiceC9776a2, ExecutorServiceC9776a executorServiceC9776a3, ExecutorServiceC9776a executorServiceC9776a4, boolean z10) {
        this(interfaceC9631h, aVar, executorServiceC9776a, executorServiceC9776a2, executorServiceC9776a3, executorServiceC9776a4, null, null, null, null, null, null, z10);
    }

    /* renamed from: j */
    public static void m2977j(String str, long j10, InterfaceC9228b interfaceC9228b) {
        AbstractC8702f.m14164a(j10);
        Objects.toString(interfaceC9228b);
    }

    @Override // p182n.InterfaceC9351d
    /* renamed from: a */
    public synchronized void mo2978a(C5429g c5429g, InterfaceC9228b interfaceC9228b, C5430h c5430h) {
        if (c5430h != null) {
            try {
                if (c5430h.m3018d()) {
                    this.f3071h.m2940a(interfaceC9228b, c5430h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3064a.m17235d(interfaceC9228b, c5429g);
    }

    @Override // p182n.InterfaceC9351d
    /* renamed from: b */
    public synchronized void mo2979b(C5429g c5429g, InterfaceC9228b interfaceC9228b) {
        this.f3064a.m17235d(interfaceC9228b, c5429g);
    }

    @Override // p204p.InterfaceC9631h.a
    /* renamed from: c */
    public void mo2980c(InterfaceC9357j interfaceC9357j) {
        this.f3068e.m17242a(interfaceC9357j, true);
    }

    @Override // com.bumptech.glide.load.engine.C5430h.a
    /* renamed from: d */
    public void mo2981d(InterfaceC9228b interfaceC9228b, C5430h c5430h) {
        this.f3071h.m2943d(interfaceC9228b);
        if (c5430h.m3018d()) {
            this.f3066c.mo18179b(interfaceC9228b, c5430h);
        } else {
            this.f3068e.m17242a(c5430h, false);
        }
    }

    /* renamed from: e */
    public final C5430h m2982e(InterfaceC9228b interfaceC9228b) {
        InterfaceC9357j interfaceC9357jMo18181d = this.f3066c.mo18181d(interfaceC9228b);
        if (interfaceC9357jMo18181d == null) {
            return null;
        }
        return interfaceC9357jMo18181d instanceof C5430h ? (C5430h) interfaceC9357jMo18181d : new C5430h(interfaceC9357jMo18181d, true, true, interfaceC9228b, this);
    }

    /* renamed from: f */
    public d m2983f(C5393d c5393d, Object obj, InterfaceC9228b interfaceC9228b, int i10, int i11, Class cls, Class cls2, Priority priority, AbstractC9350c abstractC9350c, Map map, boolean z10, boolean z11, C9230d c9230d, boolean z12, boolean z13, boolean z14, boolean z15, InterfaceC8273e interfaceC8273e, Executor executor) {
        long jM14165b = f3063i ? AbstractC8702f.m14165b() : 0L;
        C9352e c9352eM17231a = this.f3065b.m17231a(obj, interfaceC9228b, i10, i11, map, cls, cls2, c9230d);
        synchronized (this) {
            try {
                C5430h c5430hM2986i = m2986i(c9352eM17231a, z12, jM14165b);
                if (c5430hM2986i == null) {
                    return m2988l(c5393d, obj, interfaceC9228b, i10, i11, cls, cls2, priority, abstractC9350c, map, z10, z11, c9230d, z12, z13, z14, z15, interfaceC8273e, executor, c9352eM17231a, jM14165b);
                }
                interfaceC8273e.mo3161b(c5430hM2986i, DataSource.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final C5430h m2984g(InterfaceC9228b interfaceC9228b) {
        C5430h c5430hM2944e = this.f3071h.m2944e(interfaceC9228b);
        if (c5430hM2944e != null) {
            c5430hM2944e.m3015a();
        }
        return c5430hM2944e;
    }

    /* renamed from: h */
    public final C5430h m2985h(InterfaceC9228b interfaceC9228b) {
        C5430h c5430hM2982e = m2982e(interfaceC9228b);
        if (c5430hM2982e != null) {
            c5430hM2982e.m3015a();
            this.f3071h.m2940a(interfaceC9228b, c5430hM2982e);
        }
        return c5430hM2982e;
    }

    /* renamed from: i */
    public final C5430h m2986i(C9352e c9352e, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        C5430h c5430hM2984g = m2984g(c9352e);
        if (c5430hM2984g != null) {
            if (f3063i) {
                m2977j("Loaded resource from active resources", j10, c9352e);
            }
            return c5430hM2984g;
        }
        C5430h c5430hM2985h = m2985h(c9352e);
        if (c5430hM2985h == null) {
            return null;
        }
        if (f3063i) {
            m2977j("Loaded resource from cache", j10, c9352e);
        }
        return c5430hM2985h;
    }

    /* renamed from: k */
    public void m2987k(InterfaceC9357j interfaceC9357j) {
        if (!(interfaceC9357j instanceof C5430h)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C5430h) interfaceC9357j).m3019e();
    }

    /* renamed from: l */
    public final d m2988l(C5393d c5393d, Object obj, InterfaceC9228b interfaceC9228b, int i10, int i11, Class cls, Class cls2, Priority priority, AbstractC9350c abstractC9350c, Map map, boolean z10, boolean z11, C9230d c9230d, boolean z12, boolean z13, boolean z14, boolean z15, InterfaceC8273e interfaceC8273e, Executor executor, C9352e c9352e, long j10) {
        C5429g c5429gM17232a = this.f3064a.m17232a(c9352e, z15);
        if (c5429gM17232a != null) {
            c5429gM17232a.m2995e(interfaceC8273e, executor);
            if (f3063i) {
                m2977j("Added to existing load", j10, c9352e);
            }
            return new d(interfaceC8273e, c5429gM17232a);
        }
        C5429g c5429gM2991a = this.f3067d.m2991a(c9352e, z12, z13, z14, z15);
        DecodeJob decodeJobM2989a = this.f3070g.m2989a(c5393d, obj, c9352e, interfaceC9228b, i10, i11, cls, cls2, priority, abstractC9350c, map, z10, z11, z15, c9230d, c5429gM2991a);
        this.f3064a.m17234c(c9352e, c5429gM2991a);
        c5429gM2991a.m2995e(interfaceC8273e, executor);
        c5429gM2991a.m3008s(decodeJobM2989a);
        if (f3063i) {
            m2977j("Started new load", j10, c9352e);
        }
        return new d(interfaceC8273e, c5429gM2991a);
    }

    public C5428f(InterfaceC9631h interfaceC9631h, InterfaceC9624a.a aVar, ExecutorServiceC9776a executorServiceC9776a, ExecutorServiceC9776a executorServiceC9776a2, ExecutorServiceC9776a executorServiceC9776a3, ExecutorServiceC9776a executorServiceC9776a4, C9355h c9355h, C9353f c9353f, C5423a c5423a, b bVar, a aVar2, C9359l c9359l, boolean z10) {
        this.f3066c = interfaceC9631h;
        c cVar = new c(aVar);
        this.f3069f = cVar;
        C5423a c5423a2 = c5423a == null ? new C5423a(z10) : c5423a;
        this.f3071h = c5423a2;
        c5423a2.m2945f(this);
        this.f3065b = c9353f == null ? new C9353f() : c9353f;
        this.f3064a = c9355h == null ? new C9355h() : c9355h;
        this.f3067d = bVar == null ? new b(executorServiceC9776a, executorServiceC9776a2, executorServiceC9776a3, executorServiceC9776a4, this, this) : bVar;
        this.f3070g = aVar2 == null ? new a(cVar) : aVar2;
        this.f3068e = c9359l == null ? new C9359l() : c9359l;
        interfaceC9631h.mo18180c(this);
    }
}
