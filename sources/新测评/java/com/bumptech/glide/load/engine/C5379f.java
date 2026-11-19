package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.C5344d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C5381h;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p073e1.InterfaceC7328e;
import p117i1.AbstractC7647f;
import p117i1.AbstractC7651j;
import p128j1.AbstractC7778a;
import p162m0.C8539d;
import p162m0.InterfaceC8537b;
import p184o0.AbstractC8683c;
import p184o0.C8685e;
import p184o0.C8686f;
import p184o0.C8688h;
import p184o0.C8692l;
import p184o0.InterfaceC8684d;
import p184o0.InterfaceC8690j;
import p206q0.C8867b;
import p206q0.InterfaceC8866a;
import p206q0.InterfaceC8873h;
import p217r0.ExecutorServiceC8995a;

/* renamed from: com.bumptech.glide.load.engine.f */
/* loaded from: classes3.dex */
public class C5379f implements InterfaceC8684d, InterfaceC8873h.a, C5381h.a {

    /* renamed from: i */
    public static final boolean f3630i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final C8688h f3631a;

    /* renamed from: b */
    public final C8686f f3632b;

    /* renamed from: c */
    public final InterfaceC8873h f3633c;

    /* renamed from: d */
    public final b f3634d;

    /* renamed from: e */
    public final C8692l f3635e;

    /* renamed from: f */
    public final c f3636f;

    /* renamed from: g */
    public final a f3637g;

    /* renamed from: h */
    public final C5374a f3638h;

    /* renamed from: com.bumptech.glide.load.engine.f$a */
    public static class a {

        /* renamed from: a */
        public final DecodeJob.InterfaceC5371e f3639a;

        /* renamed from: b */
        public final Pools.Pool f3640b = AbstractC7778a.m13137d(150, new C10131a());

        /* renamed from: c */
        public int f3641c;

        /* renamed from: com.bumptech.glide.load.engine.f$a$a, reason: collision with other inner class name */
        public class C10131a implements AbstractC7778a.d {
            public C10131a() {
            }

            @Override // p128j1.AbstractC7778a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DecodeJob create() {
                a aVar = a.this;
                return new DecodeJob(aVar.f3639a, aVar.f3640b);
            }
        }

        public a(DecodeJob.InterfaceC5371e interfaceC5371e) {
            this.f3639a = interfaceC5371e;
        }

        /* renamed from: a */
        public DecodeJob m3543a(C5344d c5344d, Object obj, C8685e c8685e, InterfaceC8537b interfaceC8537b, int i10, int i11, Class cls, Class cls2, Priority priority, AbstractC8683c abstractC8683c, Map map, boolean z9, boolean z10, boolean z11, C8539d c8539d, DecodeJob.InterfaceC5368b interfaceC5368b) {
            DecodeJob decodeJob = (DecodeJob) AbstractC7651j.m12683d((DecodeJob) this.f3640b.acquire());
            int i12 = this.f3641c;
            this.f3641c = i12 + 1;
            return decodeJob.m3453n(c5344d, obj, c8685e, interfaceC8537b, i10, i11, cls, cls2, priority, abstractC8683c, map, z9, z10, z11, c8539d, interfaceC5368b, i12);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$b */
    public static class b {

        /* renamed from: a */
        public final ExecutorServiceC8995a f3643a;

        /* renamed from: b */
        public final ExecutorServiceC8995a f3644b;

        /* renamed from: c */
        public final ExecutorServiceC8995a f3645c;

        /* renamed from: d */
        public final ExecutorServiceC8995a f3646d;

        /* renamed from: e */
        public final InterfaceC8684d f3647e;

        /* renamed from: f */
        public final C5381h.a f3648f;

        /* renamed from: g */
        public final Pools.Pool f3649g = AbstractC7778a.m13137d(150, new a());

        /* renamed from: com.bumptech.glide.load.engine.f$b$a */
        public class a implements AbstractC7778a.d {
            public a() {
            }

            @Override // p128j1.AbstractC7778a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C5380g create() {
                b bVar = b.this;
                return new C5380g(bVar.f3643a, bVar.f3644b, bVar.f3645c, bVar.f3646d, bVar.f3647e, bVar.f3648f, bVar.f3649g);
            }
        }

        public b(ExecutorServiceC8995a executorServiceC8995a, ExecutorServiceC8995a executorServiceC8995a2, ExecutorServiceC8995a executorServiceC8995a3, ExecutorServiceC8995a executorServiceC8995a4, InterfaceC8684d interfaceC8684d, C5381h.a aVar) {
            this.f3643a = executorServiceC8995a;
            this.f3644b = executorServiceC8995a2;
            this.f3645c = executorServiceC8995a3;
            this.f3646d = executorServiceC8995a4;
            this.f3647e = interfaceC8684d;
            this.f3648f = aVar;
        }

        /* renamed from: a */
        public C5380g m3545a(InterfaceC8537b interfaceC8537b, boolean z9, boolean z10, boolean z11, boolean z12) {
            return ((C5380g) AbstractC7651j.m12683d((C5380g) this.f3649g.acquire())).m3556l(interfaceC8537b, z9, z10, z11, z12);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$c */
    public static class c implements DecodeJob.InterfaceC5371e {

        /* renamed from: a */
        public final InterfaceC8866a.a f3651a;

        /* renamed from: b */
        public volatile InterfaceC8866a f3652b;

        public c(InterfaceC8866a.a aVar) {
            this.f3651a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5371e
        /* renamed from: a */
        public InterfaceC8866a mo3476a() {
            if (this.f3652b == null) {
                synchronized (this) {
                    try {
                        if (this.f3652b == null) {
                            this.f3652b = this.f3651a.build();
                        }
                        if (this.f3652b == null) {
                            this.f3652b = new C8867b();
                        }
                    } finally {
                    }
                }
            }
            return this.f3652b;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$d */
    public class d {

        /* renamed from: a */
        public final C5380g f3653a;

        /* renamed from: b */
        public final InterfaceC7328e f3654b;

        public d(InterfaceC7328e interfaceC7328e, C5380g c5380g) {
            this.f3654b = interfaceC7328e;
            this.f3653a = c5380g;
        }

        /* renamed from: a */
        public void m3547a() {
            synchronized (C5379f.this) {
                this.f3653a.m3561r(this.f3654b);
            }
        }
    }

    public C5379f(InterfaceC8873h interfaceC8873h, InterfaceC8866a.a aVar, ExecutorServiceC8995a executorServiceC8995a, ExecutorServiceC8995a executorServiceC8995a2, ExecutorServiceC8995a executorServiceC8995a3, ExecutorServiceC8995a executorServiceC8995a4, boolean z9) {
        this(interfaceC8873h, aVar, executorServiceC8995a, executorServiceC8995a2, executorServiceC8995a3, executorServiceC8995a4, null, null, null, null, null, null, z9);
    }

    /* renamed from: j */
    public static void m3531j(String str, long j10, InterfaceC8537b interfaceC8537b) {
        AbstractC7647f.m12666a(j10);
        Objects.toString(interfaceC8537b);
    }

    @Override // p184o0.InterfaceC8684d
    /* renamed from: a */
    public synchronized void mo3532a(C5380g c5380g, InterfaceC8537b interfaceC8537b, C5381h c5381h) {
        if (c5381h != null) {
            try {
                if (c5381h.m3572d()) {
                    this.f3638h.m3494a(interfaceC8537b, c5381h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3631a.m14289d(interfaceC8537b, c5380g);
    }

    @Override // p206q0.InterfaceC8873h.a
    /* renamed from: b */
    public void mo3533b(InterfaceC8690j interfaceC8690j) {
        this.f3635e.m14296a(interfaceC8690j, true);
    }

    @Override // com.bumptech.glide.load.engine.C5381h.a
    /* renamed from: c */
    public void mo3534c(InterfaceC8537b interfaceC8537b, C5381h c5381h) {
        this.f3638h.m3497d(interfaceC8537b);
        if (c5381h.m3572d()) {
            this.f3633c.mo14878c(interfaceC8537b, c5381h);
        } else {
            this.f3635e.m14296a(c5381h, false);
        }
    }

    @Override // p184o0.InterfaceC8684d
    /* renamed from: d */
    public synchronized void mo3535d(C5380g c5380g, InterfaceC8537b interfaceC8537b) {
        this.f3631a.m14289d(interfaceC8537b, c5380g);
    }

    /* renamed from: e */
    public final C5381h m3536e(InterfaceC8537b interfaceC8537b) {
        InterfaceC8690j interfaceC8690jMo14880e = this.f3633c.mo14880e(interfaceC8537b);
        if (interfaceC8690jMo14880e == null) {
            return null;
        }
        return interfaceC8690jMo14880e instanceof C5381h ? (C5381h) interfaceC8690jMo14880e : new C5381h(interfaceC8690jMo14880e, true, true, interfaceC8537b, this);
    }

    /* renamed from: f */
    public d m3537f(C5344d c5344d, Object obj, InterfaceC8537b interfaceC8537b, int i10, int i11, Class cls, Class cls2, Priority priority, AbstractC8683c abstractC8683c, Map map, boolean z9, boolean z10, C8539d c8539d, boolean z11, boolean z12, boolean z13, boolean z14, InterfaceC7328e interfaceC7328e, Executor executor) {
        long jM12667b = f3630i ? AbstractC7647f.m12667b() : 0L;
        C8685e c8685eM14285a = this.f3632b.m14285a(obj, interfaceC8537b, i10, i11, map, cls, cls2, c8539d);
        synchronized (this) {
            try {
                C5381h c5381hM3540i = m3540i(c8685eM14285a, z11, jM12667b);
                if (c5381hM3540i == null) {
                    return m3542l(c5344d, obj, interfaceC8537b, i10, i11, cls, cls2, priority, abstractC8683c, map, z9, z10, c8539d, z11, z12, z13, z14, interfaceC7328e, executor, c8685eM14285a, jM12667b);
                }
                interfaceC7328e.mo3717a(c5381hM3540i, DataSource.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final C5381h m3538g(InterfaceC8537b interfaceC8537b) {
        C5381h c5381hM3498e = this.f3638h.m3498e(interfaceC8537b);
        if (c5381hM3498e != null) {
            c5381hM3498e.m3570b();
        }
        return c5381hM3498e;
    }

    /* renamed from: h */
    public final C5381h m3539h(InterfaceC8537b interfaceC8537b) {
        C5381h c5381hM3536e = m3536e(interfaceC8537b);
        if (c5381hM3536e != null) {
            c5381hM3536e.m3570b();
            this.f3638h.m3494a(interfaceC8537b, c5381hM3536e);
        }
        return c5381hM3536e;
    }

    /* renamed from: i */
    public final C5381h m3540i(C8685e c8685e, boolean z9, long j10) {
        if (!z9) {
            return null;
        }
        C5381h c5381hM3538g = m3538g(c8685e);
        if (c5381hM3538g != null) {
            if (f3630i) {
                m3531j("Loaded resource from active resources", j10, c8685e);
            }
            return c5381hM3538g;
        }
        C5381h c5381hM3539h = m3539h(c8685e);
        if (c5381hM3539h == null) {
            return null;
        }
        if (f3630i) {
            m3531j("Loaded resource from cache", j10, c8685e);
        }
        return c5381hM3539h;
    }

    /* renamed from: k */
    public void m3541k(InterfaceC8690j interfaceC8690j) {
        if (!(interfaceC8690j instanceof C5381h)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C5381h) interfaceC8690j).m3573e();
    }

    /* renamed from: l */
    public final d m3542l(C5344d c5344d, Object obj, InterfaceC8537b interfaceC8537b, int i10, int i11, Class cls, Class cls2, Priority priority, AbstractC8683c abstractC8683c, Map map, boolean z9, boolean z10, C8539d c8539d, boolean z11, boolean z12, boolean z13, boolean z14, InterfaceC7328e interfaceC7328e, Executor executor, C8685e c8685e, long j10) {
        C5380g c5380gM14286a = this.f3631a.m14286a(c8685e, z14);
        if (c5380gM14286a != null) {
            c5380gM14286a.m3549b(interfaceC7328e, executor);
            if (f3630i) {
                m3531j("Added to existing load", j10, c8685e);
            }
            return new d(interfaceC7328e, c5380gM14286a);
        }
        C5380g c5380gM3545a = this.f3634d.m3545a(c8685e, z11, z12, z13, z14);
        DecodeJob decodeJobM3543a = this.f3637g.m3543a(c5344d, obj, c8685e, interfaceC8537b, i10, i11, cls, cls2, priority, abstractC8683c, map, z9, z10, z14, c8539d, c5380gM3545a);
        this.f3631a.m14288c(c8685e, c5380gM3545a);
        c5380gM3545a.m3549b(interfaceC7328e, executor);
        c5380gM3545a.m3562s(decodeJobM3543a);
        if (f3630i) {
            m3531j("Started new load", j10, c8685e);
        }
        return new d(interfaceC7328e, c5380gM3545a);
    }

    public C5379f(InterfaceC8873h interfaceC8873h, InterfaceC8866a.a aVar, ExecutorServiceC8995a executorServiceC8995a, ExecutorServiceC8995a executorServiceC8995a2, ExecutorServiceC8995a executorServiceC8995a3, ExecutorServiceC8995a executorServiceC8995a4, C8688h c8688h, C8686f c8686f, C5374a c5374a, b bVar, a aVar2, C8692l c8692l, boolean z9) {
        this.f3633c = interfaceC8873h;
        c cVar = new c(aVar);
        this.f3636f = cVar;
        C5374a c5374a2 = c5374a == null ? new C5374a(z9) : c5374a;
        this.f3638h = c5374a2;
        c5374a2.m3499f(this);
        this.f3632b = c8686f == null ? new C8686f() : c8686f;
        this.f3631a = c8688h == null ? new C8688h() : c8688h;
        this.f3634d = bVar == null ? new b(executorServiceC8995a, executorServiceC8995a2, executorServiceC8995a3, executorServiceC8995a4, this, this) : bVar;
        this.f3637g = aVar2 == null ? new a(cVar) : aVar2;
        this.f3635e = c8692l == null ? new C8692l() : c8692l;
        interfaceC8873h.mo14879d(this);
    }
}
