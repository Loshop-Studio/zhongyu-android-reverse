package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.C5812d;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C5849h;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p109d1.AbstractC8905f;
import p109d1.AbstractC8909j;
import p125e1.AbstractC9069a;
import p168h0.C9438e;
import p168h0.InterfaceC9435b;
import p198j0.AbstractC9650c;
import p198j0.C9652e;
import p198j0.C9653f;
import p198j0.C9655h;
import p198j0.C9659l;
import p198j0.InterfaceC9651d;
import p198j0.InterfaceC9657j;
import p229l0.C10095b;
import p229l0.InterfaceC10094a;
import p229l0.InterfaceC10101h;
import p242m0.ExecutorServiceC10189a;
import p428z0.InterfaceC11956e;

/* renamed from: com.bumptech.glide.load.engine.f */
/* loaded from: classes3.dex */
public class C5847f implements InterfaceC9651d, InterfaceC10101h.a, C5849h.a {

    /* renamed from: i */
    public static final boolean f4833i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final C9655h f4834a;

    /* renamed from: b */
    public final C9653f f4835b;

    /* renamed from: c */
    public final InterfaceC10101h f4836c;

    /* renamed from: d */
    public final b f4837d;

    /* renamed from: e */
    public final C9659l f4838e;

    /* renamed from: f */
    public final c f4839f;

    /* renamed from: g */
    public final a f4840g;

    /* renamed from: h */
    public final C5842a f4841h;

    /* renamed from: com.bumptech.glide.load.engine.f$a */
    public static class a {

        /* renamed from: a */
        public final DecodeJob.InterfaceC5839e f4842a;

        /* renamed from: b */
        public final Pools.Pool f4843b = AbstractC9069a.m17858d(150, new C12100a());

        /* renamed from: c */
        public int f4844c;

        /* renamed from: com.bumptech.glide.load.engine.f$a$a, reason: collision with other inner class name */
        public class C12100a implements AbstractC9069a.d {
            public C12100a() {
            }

            @Override // p125e1.AbstractC9069a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DecodeJob create() {
                a aVar = a.this;
                return new DecodeJob(aVar.f4842a, aVar.f4843b);
            }
        }

        public a(DecodeJob.InterfaceC5839e interfaceC5839e) {
            this.f4842a = interfaceC5839e;
        }

        /* renamed from: a */
        public DecodeJob m4193a(C5812d c5812d, Object obj, C9652e c9652e, InterfaceC9435b interfaceC9435b, int i10, int i11, Class cls, Class cls2, Priority priority, AbstractC9650c abstractC9650c, Map map, boolean z10, boolean z11, boolean z12, C9438e c9438e, DecodeJob.InterfaceC5836b interfaceC5836b) {
            DecodeJob decodeJob = (DecodeJob) AbstractC8909j.m17468d((DecodeJob) this.f4843b.acquire());
            int i12 = this.f4844c;
            this.f4844c = i12 + 1;
            return decodeJob.m4103n(c5812d, obj, c9652e, interfaceC9435b, i10, i11, cls, cls2, priority, abstractC9650c, map, z10, z11, z12, c9438e, interfaceC5836b, i12);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$b */
    public static class b {

        /* renamed from: a */
        public final ExecutorServiceC10189a f4846a;

        /* renamed from: b */
        public final ExecutorServiceC10189a f4847b;

        /* renamed from: c */
        public final ExecutorServiceC10189a f4848c;

        /* renamed from: d */
        public final ExecutorServiceC10189a f4849d;

        /* renamed from: e */
        public final InterfaceC9651d f4850e;

        /* renamed from: f */
        public final C5849h.a f4851f;

        /* renamed from: g */
        public final Pools.Pool f4852g = AbstractC9069a.m17858d(150, new a());

        /* renamed from: com.bumptech.glide.load.engine.f$b$a */
        public class a implements AbstractC9069a.d {
            public a() {
            }

            @Override // p125e1.AbstractC9069a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C5848g create() {
                b bVar = b.this;
                return new C5848g(bVar.f4846a, bVar.f4847b, bVar.f4848c, bVar.f4849d, bVar.f4850e, bVar.f4851f, bVar.f4852g);
            }
        }

        public b(ExecutorServiceC10189a executorServiceC10189a, ExecutorServiceC10189a executorServiceC10189a2, ExecutorServiceC10189a executorServiceC10189a3, ExecutorServiceC10189a executorServiceC10189a4, InterfaceC9651d interfaceC9651d, C5849h.a aVar) {
            this.f4846a = executorServiceC10189a;
            this.f4847b = executorServiceC10189a2;
            this.f4848c = executorServiceC10189a3;
            this.f4849d = executorServiceC10189a4;
            this.f4850e = interfaceC9651d;
            this.f4851f = aVar;
        }

        /* renamed from: a */
        public C5848g m4195a(InterfaceC9435b interfaceC9435b, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((C5848g) AbstractC8909j.m17468d((C5848g) this.f4852g.acquire())).m4206l(interfaceC9435b, z10, z11, z12, z13);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$c */
    public static class c implements DecodeJob.InterfaceC5839e {

        /* renamed from: a */
        public final InterfaceC10094a.a f4854a;

        /* renamed from: b */
        public volatile InterfaceC10094a f4855b;

        public c(InterfaceC10094a.a aVar) {
            this.f4854a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC5839e
        /* renamed from: a */
        public InterfaceC10094a mo4126a() {
            if (this.f4855b == null) {
                synchronized (this) {
                    try {
                        if (this.f4855b == null) {
                            this.f4855b = this.f4854a.build();
                        }
                        if (this.f4855b == null) {
                            this.f4855b = new C10095b();
                        }
                    } finally {
                    }
                }
            }
            return this.f4855b;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$d */
    public class d {

        /* renamed from: a */
        public final C5848g f4856a;

        /* renamed from: b */
        public final InterfaceC11956e f4857b;

        public d(InterfaceC11956e interfaceC11956e, C5848g c5848g) {
            this.f4857b = interfaceC11956e;
            this.f4856a = c5848g;
        }

        /* renamed from: a */
        public void m4197a() {
            synchronized (C5847f.this) {
                this.f4856a.m4211r(this.f4857b);
            }
        }
    }

    public C5847f(InterfaceC10101h interfaceC10101h, InterfaceC10094a.a aVar, ExecutorServiceC10189a executorServiceC10189a, ExecutorServiceC10189a executorServiceC10189a2, ExecutorServiceC10189a executorServiceC10189a3, ExecutorServiceC10189a executorServiceC10189a4, boolean z10) {
        this(interfaceC10101h, aVar, executorServiceC10189a, executorServiceC10189a2, executorServiceC10189a3, executorServiceC10189a4, null, null, null, null, null, null, z10);
    }

    /* renamed from: j */
    public static void m4181j(String str, long j10, InterfaceC9435b interfaceC9435b) {
        AbstractC8905f.m17451a(j10);
        Objects.toString(interfaceC9435b);
    }

    @Override // com.bumptech.glide.load.engine.C5849h.a
    /* renamed from: a */
    public void mo4182a(InterfaceC9435b interfaceC9435b, C5849h c5849h) {
        this.f4841h.m4147d(interfaceC9435b);
        if (c5849h.m4222d()) {
            this.f4836c.mo21116c(interfaceC9435b, c5849h);
        } else {
            this.f4838e.m19060a(c5849h, false);
        }
    }

    @Override // p229l0.InterfaceC10101h.a
    /* renamed from: b */
    public void mo4183b(InterfaceC9657j interfaceC9657j) {
        this.f4838e.m19060a(interfaceC9657j, true);
    }

    @Override // p198j0.InterfaceC9651d
    /* renamed from: c */
    public synchronized void mo4184c(C5848g c5848g, InterfaceC9435b interfaceC9435b, C5849h c5849h) {
        if (c5849h != null) {
            try {
                if (c5849h.m4222d()) {
                    this.f4841h.m4144a(interfaceC9435b, c5849h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4834a.m19053d(interfaceC9435b, c5848g);
    }

    @Override // p198j0.InterfaceC9651d
    /* renamed from: d */
    public synchronized void mo4185d(C5848g c5848g, InterfaceC9435b interfaceC9435b) {
        this.f4834a.m19053d(interfaceC9435b, c5848g);
    }

    /* renamed from: e */
    public final C5849h m4186e(InterfaceC9435b interfaceC9435b) {
        InterfaceC9657j interfaceC9657jMo21118e = this.f4836c.mo21118e(interfaceC9435b);
        if (interfaceC9657jMo21118e == null) {
            return null;
        }
        return interfaceC9657jMo21118e instanceof C5849h ? (C5849h) interfaceC9657jMo21118e : new C5849h(interfaceC9657jMo21118e, true, true, interfaceC9435b, this);
    }

    /* renamed from: f */
    public d m4187f(C5812d c5812d, Object obj, InterfaceC9435b interfaceC9435b, int i10, int i11, Class cls, Class cls2, Priority priority, AbstractC9650c abstractC9650c, Map map, boolean z10, boolean z11, C9438e c9438e, boolean z12, boolean z13, boolean z14, boolean z15, InterfaceC11956e interfaceC11956e, Executor executor) {
        long jM17452b = f4833i ? AbstractC8905f.m17452b() : 0L;
        C9652e c9652eM19049a = this.f4835b.m19049a(obj, interfaceC9435b, i10, i11, map, cls, cls2, c9438e);
        synchronized (this) {
            try {
                C5849h c5849hM4190i = m4190i(c9652eM19049a, z12, jM17452b);
                if (c5849hM4190i == null) {
                    return m4192l(c5812d, obj, interfaceC9435b, i10, i11, cls, cls2, priority, abstractC9650c, map, z10, z11, c9438e, z12, z13, z14, z15, interfaceC11956e, executor, c9652eM19049a, jM17452b);
                }
                interfaceC11956e.mo4365c(c5849hM4190i, DataSource.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final C5849h m4188g(InterfaceC9435b interfaceC9435b) {
        C5849h c5849hM4148e = this.f4841h.m4148e(interfaceC9435b);
        if (c5849hM4148e != null) {
            c5849hM4148e.m4220b();
        }
        return c5849hM4148e;
    }

    /* renamed from: h */
    public final C5849h m4189h(InterfaceC9435b interfaceC9435b) {
        C5849h c5849hM4186e = m4186e(interfaceC9435b);
        if (c5849hM4186e != null) {
            c5849hM4186e.m4220b();
            this.f4841h.m4144a(interfaceC9435b, c5849hM4186e);
        }
        return c5849hM4186e;
    }

    /* renamed from: i */
    public final C5849h m4190i(C9652e c9652e, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        C5849h c5849hM4188g = m4188g(c9652e);
        if (c5849hM4188g != null) {
            if (f4833i) {
                m4181j("Loaded resource from active resources", j10, c9652e);
            }
            return c5849hM4188g;
        }
        C5849h c5849hM4189h = m4189h(c9652e);
        if (c5849hM4189h == null) {
            return null;
        }
        if (f4833i) {
            m4181j("Loaded resource from cache", j10, c9652e);
        }
        return c5849hM4189h;
    }

    /* renamed from: k */
    public void m4191k(InterfaceC9657j interfaceC9657j) {
        if (!(interfaceC9657j instanceof C5849h)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C5849h) interfaceC9657j).m4223e();
    }

    /* renamed from: l */
    public final d m4192l(C5812d c5812d, Object obj, InterfaceC9435b interfaceC9435b, int i10, int i11, Class cls, Class cls2, Priority priority, AbstractC9650c abstractC9650c, Map map, boolean z10, boolean z11, C9438e c9438e, boolean z12, boolean z13, boolean z14, boolean z15, InterfaceC11956e interfaceC11956e, Executor executor, C9652e c9652e, long j10) {
        C5848g c5848gM19050a = this.f4834a.m19050a(c9652e, z15);
        if (c5848gM19050a != null) {
            c5848gM19050a.m4199a(interfaceC11956e, executor);
            if (f4833i) {
                m4181j("Added to existing load", j10, c9652e);
            }
            return new d(interfaceC11956e, c5848gM19050a);
        }
        C5848g c5848gM4195a = this.f4837d.m4195a(c9652e, z12, z13, z14, z15);
        DecodeJob decodeJobM4193a = this.f4840g.m4193a(c5812d, obj, c9652e, interfaceC9435b, i10, i11, cls, cls2, priority, abstractC9650c, map, z10, z11, z15, c9438e, c5848gM4195a);
        this.f4834a.m19052c(c9652e, c5848gM4195a);
        c5848gM4195a.m4199a(interfaceC11956e, executor);
        c5848gM4195a.m4212s(decodeJobM4193a);
        if (f4833i) {
            m4181j("Started new load", j10, c9652e);
        }
        return new d(interfaceC11956e, c5848gM4195a);
    }

    public C5847f(InterfaceC10101h interfaceC10101h, InterfaceC10094a.a aVar, ExecutorServiceC10189a executorServiceC10189a, ExecutorServiceC10189a executorServiceC10189a2, ExecutorServiceC10189a executorServiceC10189a3, ExecutorServiceC10189a executorServiceC10189a4, C9655h c9655h, C9653f c9653f, C5842a c5842a, b bVar, a aVar2, C9659l c9659l, boolean z10) {
        this.f4836c = interfaceC10101h;
        c cVar = new c(aVar);
        this.f4839f = cVar;
        C5842a c5842a2 = c5842a == null ? new C5842a(z10) : c5842a;
        this.f4841h = c5842a2;
        c5842a2.m4149f(this);
        this.f4835b = c9653f == null ? new C9653f() : c9653f;
        this.f4834a = c9655h == null ? new C9655h() : c9655h;
        this.f4837d = bVar == null ? new b(executorServiceC10189a, executorServiceC10189a2, executorServiceC10189a3, executorServiceC10189a4, this, this) : bVar;
        this.f4840g = aVar2 == null ? new a(cVar) : aVar2;
        this.f4838e = c9659l == null ? new C9659l() : c9659l;
        interfaceC10101h.mo21117d(this);
    }
}
