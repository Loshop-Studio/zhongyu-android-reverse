package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.C5473d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C5492h;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p002a1.InterfaceC0013e;
import p091e1.AbstractC7833e;
import p091e1.AbstractC7837i;
import p102f1.AbstractC7909a;
import p122h0.C8084d;
import p122h0.InterfaceC8082b;
import p152k0.AbstractC8252c;
import p152k0.C8254e;
import p152k0.C8255f;
import p152k0.C8257h;
import p152k0.C8261l;
import p152k0.InterfaceC8253d;
import p152k0.InterfaceC8259j;
import p174m0.C8940b;
import p174m0.InterfaceC8939a;
import p174m0.InterfaceC8946h;
import p184n0.ExecutorServiceC9082a;

/* renamed from: com.bumptech.glide.load.engine.f */
/* loaded from: classes3.dex */
public class C5490f implements InterfaceC8253d, InterfaceC8946h.a, C5492h.a {

    /* renamed from: i */
    public static final boolean f3427i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final C8257h f3428a;

    /* renamed from: b */
    public final C8255f f3429b;

    /* renamed from: c */
    public final InterfaceC8946h f3430c;

    /* renamed from: d */
    public final b f3431d;

    /* renamed from: e */
    public final C8261l f3432e;

    /* renamed from: f */
    public final c f3433f;

    /* renamed from: g */
    public final a f3434g;

    /* renamed from: h */
    public final C5485a f3435h;

    /* renamed from: com.bumptech.glide.load.engine.f$a */
    public static class a {

        /* renamed from: a */
        public final DecodeJob.InterfaceC5482e f3436a;

        /* renamed from: b */
        public final Pools.Pool f3437b = AbstractC7909a.m12438d(150, new C10053a());

        /* renamed from: c */
        public int f3438c;

        /* renamed from: com.bumptech.glide.load.engine.f$a$a, reason: collision with other inner class name */
        public class C10053a implements AbstractC7909a.d {
            public C10053a() {
            }

            @Override // p102f1.AbstractC7909a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DecodeJob create() {
                a aVar = a.this;
                return new DecodeJob(aVar.f3436a, aVar.f3437b);
            }
        }

        public a(DecodeJob.InterfaceC5482e interfaceC5482e) {
            this.f3436a = interfaceC5482e;
        }

        /* renamed from: a */
        public DecodeJob m3195a(C5473d c5473d, Object obj, C8254e c8254e, InterfaceC8082b interfaceC8082b, int i9, int i10, Class cls, Class cls2, Priority priority, AbstractC8252c abstractC8252c, Map map, boolean z9, boolean z10, boolean z11, C8084d c8084d, DecodeJob.InterfaceC5479b interfaceC5479b) {
            DecodeJob decodeJob = (DecodeJob) AbstractC7837i.m12256d((DecodeJob) this.f3437b.acquire());
            int i11 = this.f3438c;
            this.f3438c = i11 + 1;
            return decodeJob.m3106n(c5473d, obj, c8254e, interfaceC8082b, i9, i10, cls, cls2, priority, abstractC8252c, map, z9, z10, z11, c8084d, interfaceC5479b, i11);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$b */
    public static class b {

        /* renamed from: a */
        public final ExecutorServiceC9082a f3440a;

        /* renamed from: b */
        public final ExecutorServiceC9082a f3441b;

        /* renamed from: c */
        public final ExecutorServiceC9082a f3442c;

        /* renamed from: d */
        public final ExecutorServiceC9082a f3443d;

        /* renamed from: e */
        public final InterfaceC8253d f3444e;

        /* renamed from: f */
        public final C5492h.a f3445f;

        /* renamed from: g */
        public final Pools.Pool f3446g = AbstractC7909a.m12438d(150, new a());

        /* renamed from: com.bumptech.glide.load.engine.f$b$a */
        public class a implements AbstractC7909a.d {
            public a() {
            }

            @Override // p102f1.AbstractC7909a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C5491g create() {
                b bVar = b.this;
                return new C5491g(bVar.f3440a, bVar.f3441b, bVar.f3442c, bVar.f3443d, bVar.f3444e, bVar.f3445f, bVar.f3446g);
            }
        }

        public b(ExecutorServiceC9082a executorServiceC9082a, ExecutorServiceC9082a executorServiceC9082a2, ExecutorServiceC9082a executorServiceC9082a3, ExecutorServiceC9082a executorServiceC9082a4, InterfaceC8253d interfaceC8253d, C5492h.a aVar) {
            this.f3440a = executorServiceC9082a;
            this.f3441b = executorServiceC9082a2;
            this.f3442c = executorServiceC9082a3;
            this.f3443d = executorServiceC9082a4;
            this.f3444e = interfaceC8253d;
            this.f3445f = aVar;
        }

        /* renamed from: a */
        public C5491g m3197a(InterfaceC8082b interfaceC8082b, boolean z9, boolean z10, boolean z11, boolean z12) {
            return ((C5491g) AbstractC7837i.m12256d((C5491g) this.f3446g.acquire())).m3208l(interfaceC8082b, z9, z10, z11, z12);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$c */
    public static class c implements DecodeJob.InterfaceC5482e {

        /* renamed from: a */
        public final InterfaceC8939a.a f3448a;

        /* renamed from: b */
        public volatile InterfaceC8939a f3449b;

        public c(InterfaceC8939a.a aVar) {
            this.f3448a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5482e
        /* renamed from: a */
        public InterfaceC8939a mo3127a() {
            if (this.f3449b == null) {
                synchronized (this) {
                    try {
                        if (this.f3449b == null) {
                            this.f3449b = this.f3448a.build();
                        }
                        if (this.f3449b == null) {
                            this.f3449b = new C8940b();
                        }
                    } finally {
                    }
                }
            }
            return this.f3449b;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$d */
    public class d {

        /* renamed from: a */
        public final C5491g f3450a;

        /* renamed from: b */
        public final InterfaceC0013e f3451b;

        public d(InterfaceC0013e interfaceC0013e, C5491g c5491g) {
            this.f3451b = interfaceC0013e;
            this.f3450a = c5491g;
        }

        /* renamed from: a */
        public void m3199a() {
            synchronized (C5490f.this) {
                this.f3450a.m3213r(this.f3451b);
            }
        }
    }

    public C5490f(InterfaceC8946h interfaceC8946h, InterfaceC8939a.a aVar, ExecutorServiceC9082a executorServiceC9082a, ExecutorServiceC9082a executorServiceC9082a2, ExecutorServiceC9082a executorServiceC9082a3, ExecutorServiceC9082a executorServiceC9082a4, boolean z9) {
        this(interfaceC8946h, aVar, executorServiceC9082a, executorServiceC9082a2, executorServiceC9082a3, executorServiceC9082a4, null, null, null, null, null, null, z9);
    }

    /* renamed from: j */
    public static void m3183j(String str, long j9, InterfaceC8082b interfaceC8082b) {
        AbstractC7833e.m12239a(j9);
        Objects.toString(interfaceC8082b);
    }

    @Override // com.bumptech.glide.load.engine.C5492h.a
    /* renamed from: a */
    public void mo3184a(InterfaceC8082b interfaceC8082b, C5492h c5492h) {
        this.f3435h.m3148d(interfaceC8082b);
        if (c5492h.m3224d()) {
            this.f3430c.mo14261d(interfaceC8082b, c5492h);
        } else {
            this.f3432e.m13307a(c5492h, false);
        }
    }

    @Override // p152k0.InterfaceC8253d
    /* renamed from: b */
    public synchronized void mo3185b(C5491g c5491g, InterfaceC8082b interfaceC8082b, C5492h c5492h) {
        if (c5492h != null) {
            try {
                if (c5492h.m3224d()) {
                    this.f3435h.m3145a(interfaceC8082b, c5492h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3428a.m13300d(interfaceC8082b, c5491g);
    }

    @Override // p152k0.InterfaceC8253d
    /* renamed from: c */
    public synchronized void mo3186c(C5491g c5491g, InterfaceC8082b interfaceC8082b) {
        this.f3428a.m13300d(interfaceC8082b, c5491g);
    }

    @Override // p174m0.InterfaceC8946h.a
    /* renamed from: d */
    public void mo3187d(InterfaceC8259j interfaceC8259j) {
        this.f3432e.m13307a(interfaceC8259j, true);
    }

    /* renamed from: e */
    public final C5492h m3188e(InterfaceC8082b interfaceC8082b) {
        InterfaceC8259j interfaceC8259jMo14260c = this.f3430c.mo14260c(interfaceC8082b);
        if (interfaceC8259jMo14260c == null) {
            return null;
        }
        return interfaceC8259jMo14260c instanceof C5492h ? (C5492h) interfaceC8259jMo14260c : new C5492h(interfaceC8259jMo14260c, true, true, interfaceC8082b, this);
    }

    /* renamed from: f */
    public d m3189f(C5473d c5473d, Object obj, InterfaceC8082b interfaceC8082b, int i9, int i10, Class cls, Class cls2, Priority priority, AbstractC8252c abstractC8252c, Map map, boolean z9, boolean z10, C8084d c8084d, boolean z11, boolean z12, boolean z13, boolean z14, InterfaceC0013e interfaceC0013e, Executor executor) {
        long jM12240b = f3427i ? AbstractC7833e.m12240b() : 0L;
        C8254e c8254eM13296a = this.f3429b.m13296a(obj, interfaceC8082b, i9, i10, map, cls, cls2, c8084d);
        synchronized (this) {
            try {
                C5492h c5492hM3192i = m3192i(c8254eM13296a, z11, jM12240b);
                if (c5492hM3192i == null) {
                    return m3194l(c5473d, obj, interfaceC8082b, i9, i10, cls, cls2, priority, abstractC8252c, map, z9, z10, c8084d, z11, z12, z13, z14, interfaceC0013e, executor, c8254eM13296a, jM12240b);
                }
                interfaceC0013e.mo80a(c5492hM3192i, DataSource.MEMORY_CACHE);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final C5492h m3190g(InterfaceC8082b interfaceC8082b) {
        C5492h c5492hM3149e = this.f3435h.m3149e(interfaceC8082b);
        if (c5492hM3149e != null) {
            c5492hM3149e.m3222b();
        }
        return c5492hM3149e;
    }

    /* renamed from: h */
    public final C5492h m3191h(InterfaceC8082b interfaceC8082b) {
        C5492h c5492hM3188e = m3188e(interfaceC8082b);
        if (c5492hM3188e != null) {
            c5492hM3188e.m3222b();
            this.f3435h.m3145a(interfaceC8082b, c5492hM3188e);
        }
        return c5492hM3188e;
    }

    /* renamed from: i */
    public final C5492h m3192i(C8254e c8254e, boolean z9, long j9) {
        if (!z9) {
            return null;
        }
        C5492h c5492hM3190g = m3190g(c8254e);
        if (c5492hM3190g != null) {
            if (f3427i) {
                m3183j("Loaded resource from active resources", j9, c8254e);
            }
            return c5492hM3190g;
        }
        C5492h c5492hM3191h = m3191h(c8254e);
        if (c5492hM3191h == null) {
            return null;
        }
        if (f3427i) {
            m3183j("Loaded resource from cache", j9, c8254e);
        }
        return c5492hM3191h;
    }

    /* renamed from: k */
    public void m3193k(InterfaceC8259j interfaceC8259j) {
        if (!(interfaceC8259j instanceof C5492h)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C5492h) interfaceC8259j).m3225e();
    }

    /* renamed from: l */
    public final d m3194l(C5473d c5473d, Object obj, InterfaceC8082b interfaceC8082b, int i9, int i10, Class cls, Class cls2, Priority priority, AbstractC8252c abstractC8252c, Map map, boolean z9, boolean z10, C8084d c8084d, boolean z11, boolean z12, boolean z13, boolean z14, InterfaceC0013e interfaceC0013e, Executor executor, C8254e c8254e, long j9) {
        C5491g c5491gM13297a = this.f3428a.m13297a(c8254e, z14);
        if (c5491gM13297a != null) {
            c5491gM13297a.m3201e(interfaceC0013e, executor);
            if (f3427i) {
                m3183j("Added to existing load", j9, c8254e);
            }
            return new d(interfaceC0013e, c5491gM13297a);
        }
        C5491g c5491gM3197a = this.f3431d.m3197a(c8254e, z11, z12, z13, z14);
        DecodeJob decodeJobM3195a = this.f3434g.m3195a(c5473d, obj, c8254e, interfaceC8082b, i9, i10, cls, cls2, priority, abstractC8252c, map, z9, z10, z14, c8084d, c5491gM3197a);
        this.f3428a.m13299c(c8254e, c5491gM3197a);
        c5491gM3197a.m3201e(interfaceC0013e, executor);
        c5491gM3197a.m3214s(decodeJobM3195a);
        if (f3427i) {
            m3183j("Started new load", j9, c8254e);
        }
        return new d(interfaceC0013e, c5491gM3197a);
    }

    public C5490f(InterfaceC8946h interfaceC8946h, InterfaceC8939a.a aVar, ExecutorServiceC9082a executorServiceC9082a, ExecutorServiceC9082a executorServiceC9082a2, ExecutorServiceC9082a executorServiceC9082a3, ExecutorServiceC9082a executorServiceC9082a4, C8257h c8257h, C8255f c8255f, C5485a c5485a, b bVar, a aVar2, C8261l c8261l, boolean z9) {
        this.f3430c = interfaceC8946h;
        c cVar = new c(aVar);
        this.f3433f = cVar;
        C5485a c5485a2 = c5485a == null ? new C5485a(z9) : c5485a;
        this.f3435h = c5485a2;
        c5485a2.m3150f(this);
        this.f3429b = c8255f == null ? new C8255f() : c8255f;
        this.f3428a = c8257h == null ? new C8257h() : c8257h;
        this.f3431d = bVar == null ? new b(executorServiceC9082a, executorServiceC9082a2, executorServiceC9082a3, executorServiceC9082a4, this, this) : bVar;
        this.f3434g = aVar2 == null ? new a(cVar) : aVar2;
        this.f3432e = c8261l == null ? new C8261l() : c8261l;
        interfaceC8946h.mo14262e(this);
    }
}
