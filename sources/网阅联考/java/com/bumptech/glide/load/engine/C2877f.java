package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.compose.material3.TextFieldImplKt;
import androidx.core.util.Pools;
import com.bumptech.glide.C2860e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C2879h;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.Map;
import java.util.concurrent.Executor;
import p016c0.InterfaceC2754e;
import p062g0.AbstractC3745e;
import p062g0.AbstractC3749i;
import p067h0.AbstractC3762a;
import p076j.C3794d;
import p076j.InterfaceC3792b;
import p093m.AbstractC4354c;
import p093m.C4356e;
import p093m.C4357f;
import p093m.C4359h;
import p093m.C4363l;
import p093m.InterfaceC4355d;
import p093m.InterfaceC4361j;
import p102o.C4411b;
import p102o.InterfaceC4410a;
import p102o.InterfaceC4417h;
import p106p.ExecutorServiceC4445a;

/* renamed from: com.bumptech.glide.load.engine.f */
/* loaded from: classes2.dex */
public class C2877f implements InterfaceC4355d, InterfaceC4417h.a, C2879h.a {

    /* renamed from: i */
    public static final boolean f773i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final C4359h f774a;

    /* renamed from: b */
    public final C4357f f775b;

    /* renamed from: c */
    public final InterfaceC4417h f776c;

    /* renamed from: d */
    public final b f777d;

    /* renamed from: e */
    public final C4363l f778e;

    /* renamed from: f */
    public final c f779f;

    /* renamed from: g */
    public final a f780g;

    /* renamed from: h */
    public final C2872a f781h;

    /* renamed from: com.bumptech.glide.load.engine.f$a */
    public static class a {

        /* renamed from: a */
        public final DecodeJob.InterfaceC2869e f782a;

        /* renamed from: b */
        public final Pools.Pool f783b = AbstractC3762a.m4853d(TextFieldImplKt.AnimationDuration, new C4752a());

        /* renamed from: c */
        public int f784c;

        /* renamed from: com.bumptech.glide.load.engine.f$a$a, reason: collision with other inner class name */
        public class C4752a implements AbstractC3762a.d {
            public C4752a() {
            }

            @Override // p067h0.AbstractC3762a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public DecodeJob mo1871a() {
                a aVar = a.this;
                return new DecodeJob(aVar.f782a, aVar.f783b);
            }
        }

        public a(DecodeJob.InterfaceC2869e interfaceC2869e) {
            this.f782a = interfaceC2869e;
        }

        /* renamed from: a */
        public DecodeJob m1870a(C2860e c2860e, Object obj, C4356e c4356e, InterfaceC3792b interfaceC3792b, int i4, int i5, Class cls, Class cls2, Priority priority, AbstractC4354c abstractC4354c, Map map, boolean z3, boolean z4, boolean z5, C3794d c3794d, DecodeJob.InterfaceC2866b interfaceC2866b) {
            DecodeJob decodeJob = (DecodeJob) AbstractC3749i.m4768d((DecodeJob) this.f783b.acquire());
            int i6 = this.f784c;
            this.f784c = i6 + 1;
            return decodeJob.m1781n(c2860e, obj, c4356e, interfaceC3792b, i4, i5, cls, cls2, priority, abstractC4354c, map, z3, z4, z5, c3794d, interfaceC2866b, i6);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$b */
    public static class b {

        /* renamed from: a */
        public final ExecutorServiceC4445a f786a;

        /* renamed from: b */
        public final ExecutorServiceC4445a f787b;

        /* renamed from: c */
        public final ExecutorServiceC4445a f788c;

        /* renamed from: d */
        public final ExecutorServiceC4445a f789d;

        /* renamed from: e */
        public final InterfaceC4355d f790e;

        /* renamed from: f */
        public final C2879h.a f791f;

        /* renamed from: g */
        public final Pools.Pool f792g = AbstractC3762a.m4853d(TextFieldImplKt.AnimationDuration, new a());

        /* renamed from: com.bumptech.glide.load.engine.f$b$a */
        public class a implements AbstractC3762a.d {
            public a() {
            }

            @Override // p067h0.AbstractC3762a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C2878g mo1871a() {
                b bVar = b.this;
                return new C2878g(bVar.f786a, bVar.f787b, bVar.f788c, bVar.f789d, bVar.f790e, bVar.f791f, bVar.f792g);
            }
        }

        public b(ExecutorServiceC4445a executorServiceC4445a, ExecutorServiceC4445a executorServiceC4445a2, ExecutorServiceC4445a executorServiceC4445a3, ExecutorServiceC4445a executorServiceC4445a4, InterfaceC4355d interfaceC4355d, C2879h.a aVar) {
            this.f786a = executorServiceC4445a;
            this.f787b = executorServiceC4445a2;
            this.f788c = executorServiceC4445a3;
            this.f789d = executorServiceC4445a4;
            this.f790e = interfaceC4355d;
            this.f791f = aVar;
        }

        /* renamed from: a */
        public C2878g m1873a(InterfaceC3792b interfaceC3792b, boolean z3, boolean z4, boolean z5, boolean z6) {
            return ((C2878g) AbstractC3749i.m4768d((C2878g) this.f792g.acquire())).m1883l(interfaceC3792b, z3, z4, z5, z6);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$c */
    public static class c implements DecodeJob.InterfaceC2869e {

        /* renamed from: a */
        public final InterfaceC4410a.a f794a;

        /* renamed from: b */
        public volatile InterfaceC4410a f795b;

        public c(InterfaceC4410a.a aVar) {
            this.f794a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.DecodeJob.InterfaceC2869e
        /* renamed from: a */
        public InterfaceC4410a mo1802a() {
            if (this.f795b == null) {
                synchronized (this) {
                    if (this.f795b == null) {
                        this.f795b = this.f794a.build();
                    }
                    if (this.f795b == null) {
                        this.f795b = new C4411b();
                    }
                }
            }
            return this.f795b;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$d */
    public class d {

        /* renamed from: a */
        public final C2878g f796a;

        /* renamed from: b */
        public final InterfaceC2754e f797b;

        public d(InterfaceC2754e interfaceC2754e, C2878g c2878g) {
            this.f797b = interfaceC2754e;
            this.f796a = c2878g;
        }

        /* renamed from: a */
        public void m1875a() {
            synchronized (C2877f.this) {
                this.f796a.m1889r(this.f797b);
            }
        }
    }

    public C2877f(InterfaceC4417h interfaceC4417h, InterfaceC4410a.a aVar, ExecutorServiceC4445a executorServiceC4445a, ExecutorServiceC4445a executorServiceC4445a2, ExecutorServiceC4445a executorServiceC4445a3, ExecutorServiceC4445a executorServiceC4445a4, boolean z3) {
        this(interfaceC4417h, aVar, executorServiceC4445a, executorServiceC4445a2, executorServiceC4445a3, executorServiceC4445a4, null, null, null, null, null, null, z3);
    }

    /* renamed from: j */
    public static void m1858j(String str, long j4, InterfaceC3792b interfaceC3792b) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(AbstractC3745e.m4751a(j4));
        sb.append("ms, key: ");
        sb.append(interfaceC3792b);
    }

    @Override // p102o.InterfaceC4417h.a
    /* renamed from: a */
    public void mo1859a(InterfaceC4361j interfaceC4361j) {
        this.f778e.m5380a(interfaceC4361j, true);
    }

    @Override // p093m.InterfaceC4355d
    /* renamed from: b */
    public synchronized void mo1860b(C2878g c2878g, InterfaceC3792b interfaceC3792b) {
        this.f774a.m5373d(interfaceC3792b, c2878g);
    }

    @Override // p093m.InterfaceC4355d
    /* renamed from: c */
    public synchronized void mo1861c(C2878g c2878g, InterfaceC3792b interfaceC3792b, C2879h c2879h) {
        if (c2879h != null) {
            if (c2879h.m1900d()) {
                this.f781h.m1820a(interfaceC3792b, c2879h);
            }
            this.f774a.m5373d(interfaceC3792b, c2878g);
        } else {
            this.f774a.m5373d(interfaceC3792b, c2878g);
        }
    }

    @Override // com.bumptech.glide.load.engine.C2879h.a
    /* renamed from: d */
    public void mo1862d(InterfaceC3792b interfaceC3792b, C2879h c2879h) {
        this.f781h.m1823d(interfaceC3792b);
        if (c2879h.m1900d()) {
            this.f776c.mo5507c(interfaceC3792b, c2879h);
        } else {
            this.f778e.m5380a(c2879h, false);
        }
    }

    /* renamed from: e */
    public final C2879h m1863e(InterfaceC3792b interfaceC3792b) {
        InterfaceC4361j interfaceC4361jMo5508d = this.f776c.mo5508d(interfaceC3792b);
        if (interfaceC4361jMo5508d == null) {
            return null;
        }
        return interfaceC4361jMo5508d instanceof C2879h ? (C2879h) interfaceC4361jMo5508d : new C2879h(interfaceC4361jMo5508d, true, true, interfaceC3792b, this);
    }

    /* renamed from: f */
    public d m1864f(C2860e c2860e, Object obj, InterfaceC3792b interfaceC3792b, int i4, int i5, Class cls, Class cls2, Priority priority, AbstractC4354c abstractC4354c, Map map, boolean z3, boolean z4, C3794d c3794d, boolean z5, boolean z6, boolean z7, boolean z8, InterfaceC2754e interfaceC2754e, Executor executor) {
        long jM4752b = f773i ? AbstractC3745e.m4752b() : 0L;
        C4356e c4356eM5368a = this.f775b.m5368a(obj, interfaceC3792b, i4, i5, map, cls, cls2, c3794d);
        synchronized (this) {
            C2879h c2879hM1867i = m1867i(c4356eM5368a, z5, jM4752b);
            if (c2879hM1867i == null) {
                return m1869l(c2860e, obj, interfaceC3792b, i4, i5, cls, cls2, priority, abstractC4354c, map, z3, z4, c3794d, z5, z6, z7, z8, interfaceC2754e, executor, c4356eM5368a, jM4752b);
            }
            interfaceC2754e.mo1622a(c2879hM1867i, DataSource.MEMORY_CACHE);
            return null;
        }
    }

    /* renamed from: g */
    public final C2879h m1865g(InterfaceC3792b interfaceC3792b) {
        C2879h c2879hM1824e = this.f781h.m1824e(interfaceC3792b);
        if (c2879hM1824e != null) {
            c2879hM1824e.m1897a();
        }
        return c2879hM1824e;
    }

    /* renamed from: h */
    public final C2879h m1866h(InterfaceC3792b interfaceC3792b) {
        C2879h c2879hM1863e = m1863e(interfaceC3792b);
        if (c2879hM1863e != null) {
            c2879hM1863e.m1897a();
            this.f781h.m1820a(interfaceC3792b, c2879hM1863e);
        }
        return c2879hM1863e;
    }

    /* renamed from: i */
    public final C2879h m1867i(C4356e c4356e, boolean z3, long j4) {
        if (!z3) {
            return null;
        }
        C2879h c2879hM1865g = m1865g(c4356e);
        if (c2879hM1865g != null) {
            if (f773i) {
                m1858j("Loaded resource from active resources", j4, c4356e);
            }
            return c2879hM1865g;
        }
        C2879h c2879hM1866h = m1866h(c4356e);
        if (c2879hM1866h == null) {
            return null;
        }
        if (f773i) {
            m1858j("Loaded resource from cache", j4, c4356e);
        }
        return c2879hM1866h;
    }

    /* renamed from: k */
    public void m1868k(InterfaceC4361j interfaceC4361j) {
        if (!(interfaceC4361j instanceof C2879h)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((C2879h) interfaceC4361j).m1901e();
    }

    /* renamed from: l */
    public final d m1869l(C2860e c2860e, Object obj, InterfaceC3792b interfaceC3792b, int i4, int i5, Class cls, Class cls2, Priority priority, AbstractC4354c abstractC4354c, Map map, boolean z3, boolean z4, C3794d c3794d, boolean z5, boolean z6, boolean z7, boolean z8, InterfaceC2754e interfaceC2754e, Executor executor, C4356e c4356e, long j4) {
        C2878g c2878gM5370a = this.f774a.m5370a(c4356e, z8);
        if (c2878gM5370a != null) {
            c2878gM5370a.m1876d(interfaceC2754e, executor);
            if (f773i) {
                m1858j("Added to existing load", j4, c4356e);
            }
            return new d(interfaceC2754e, c2878gM5370a);
        }
        C2878g c2878gM1873a = this.f777d.m1873a(c4356e, z5, z6, z7, z8);
        DecodeJob decodeJobM1870a = this.f780g.m1870a(c2860e, obj, c4356e, interfaceC3792b, i4, i5, cls, cls2, priority, abstractC4354c, map, z3, z4, z8, c3794d, c2878gM1873a);
        this.f774a.m5372c(c4356e, c2878gM1873a);
        c2878gM1873a.m1876d(interfaceC2754e, executor);
        c2878gM1873a.m1890s(decodeJobM1870a);
        if (f773i) {
            m1858j("Started new load", j4, c4356e);
        }
        return new d(interfaceC2754e, c2878gM1873a);
    }

    public C2877f(InterfaceC4417h interfaceC4417h, InterfaceC4410a.a aVar, ExecutorServiceC4445a executorServiceC4445a, ExecutorServiceC4445a executorServiceC4445a2, ExecutorServiceC4445a executorServiceC4445a3, ExecutorServiceC4445a executorServiceC4445a4, C4359h c4359h, C4357f c4357f, C2872a c2872a, b bVar, a aVar2, C4363l c4363l, boolean z3) {
        this.f776c = interfaceC4417h;
        c cVar = new c(aVar);
        this.f779f = cVar;
        C2872a c2872a2 = c2872a == null ? new C2872a(z3) : c2872a;
        this.f781h = c2872a2;
        c2872a2.m1825f(this);
        this.f775b = c4357f == null ? new C4357f() : c4357f;
        this.f774a = c4359h == null ? new C4359h() : c4359h;
        this.f777d = bVar == null ? new b(executorServiceC4445a, executorServiceC4445a2, executorServiceC4445a3, executorServiceC4445a4, this, this) : bVar;
        this.f780g = aVar2 == null ? new a(cVar) : aVar2;
        this.f778e = c4363l == null ? new C4363l() : c4363l;
        interfaceC4417h.mo5509e(this);
    }
}
