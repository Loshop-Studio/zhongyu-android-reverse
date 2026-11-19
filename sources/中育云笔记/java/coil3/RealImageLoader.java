package coil3;

import android.content.Context;
import coil3.AbstractC5453b;
import coil3.C5452a;
import coil3.disk.InterfaceC5467a;
import coil3.intercept.EngineInterceptor;
import coil3.util.Logger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import p001a0.AbstractC0028y;
import p001a0.InterfaceC0027x;
import p309qc.InterfaceC10773d;
import p312r.InterfaceC10825d;
import p380w.AbstractC11637q;
import p380w.C11627g;
import p380w.InterfaceC11623c;
import p380w.InterfaceC11636p;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;

/* loaded from: classes3.dex */
public final class RealImageLoader implements InterfaceC5470e {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3539g = AtomicIntegerFieldUpdater.newUpdater(RealImageLoader.class, "f");

    /* renamed from: a */
    public final C5451a f3540a;

    /* renamed from: b */
    public final InterfaceC11122i0 f3541b;

    /* renamed from: c */
    public final InterfaceC0027x f3542c;

    /* renamed from: d */
    public final InterfaceC11636p f3543d;

    /* renamed from: e */
    public final C5452a f3544e;

    /* renamed from: f */
    public volatile /* synthetic */ int f3545f;

    /* renamed from: coil3.RealImageLoader$a */
    public static final class C5451a {

        /* renamed from: a */
        public final Context f3546a;

        /* renamed from: b */
        public final C11627g.b f3547b;

        /* renamed from: c */
        public final InterfaceC10773d f3548c;

        /* renamed from: d */
        public final InterfaceC10773d f3549d;

        /* renamed from: e */
        public final InterfaceC10773d f3550e;

        /* renamed from: f */
        public final AbstractC5453b.c f3551f;

        /* renamed from: g */
        public final C5452a f3552g;

        public C5451a(Context context, C11627g.b bVar, InterfaceC10773d interfaceC10773d, InterfaceC10773d interfaceC10773d2, InterfaceC10773d interfaceC10773d3, AbstractC5453b.c cVar, C5452a c5452a, Logger logger) {
            this.f3546a = context;
            this.f3547b = bVar;
            this.f3548c = interfaceC10773d;
            this.f3549d = interfaceC10773d2;
            this.f3550e = interfaceC10773d3;
            this.f3551f = cVar;
            this.f3552g = c5452a;
        }

        /* renamed from: a */
        public final Context m2986a() {
            return this.f3546a;
        }

        /* renamed from: b */
        public final C5452a m2987b() {
            return this.f3552g;
        }

        /* renamed from: c */
        public final C11627g.b m2988c() {
            return this.f3547b;
        }

        /* renamed from: d */
        public final InterfaceC10773d m2989d() {
            return this.f3550e;
        }

        /* renamed from: e */
        public final AbstractC5453b.c m2990e() {
            return this.f3551f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5451a)) {
                return false;
            }
            C5451a c5451a = (C5451a) obj;
            return AbstractC9979u.m20289b(this.f3546a, c5451a.f3546a) && AbstractC9979u.m20289b(this.f3547b, c5451a.f3547b) && AbstractC9979u.m20289b(this.f3548c, c5451a.f3548c) && AbstractC9979u.m20289b(this.f3549d, c5451a.f3549d) && AbstractC9979u.m20289b(this.f3550e, c5451a.f3550e) && AbstractC9979u.m20289b(this.f3551f, c5451a.f3551f) && AbstractC9979u.m20289b(this.f3552g, c5451a.f3552g) && AbstractC9979u.m20289b(null, null);
        }

        /* renamed from: f */
        public final Logger m2991f() {
            return null;
        }

        /* renamed from: g */
        public final InterfaceC10773d m2992g() {
            return this.f3548c;
        }

        /* renamed from: h */
        public final InterfaceC10773d m2993h() {
            return this.f3549d;
        }

        public int hashCode() {
            return ((((((((((((this.f3546a.hashCode() * 31) + this.f3547b.hashCode()) * 31) + this.f3548c.hashCode()) * 31) + this.f3549d.hashCode()) * 31) + this.f3550e.hashCode()) * 31) + this.f3551f.hashCode()) * 31) + this.f3552g.hashCode()) * 31;
        }

        public String toString() {
            return "Options(application=" + this.f3546a + ", defaults=" + this.f3547b + ", mainCoroutineContextLazy=" + this.f3548c + ", memoryCacheLazy=" + this.f3549d + ", diskCacheLazy=" + this.f3550e + ", eventListenerFactory=" + this.f3551f + ", componentRegistry=" + this.f3552g + ", logger=" + ((Object) null) + ')';
        }
    }

    public RealImageLoader(C5451a c5451a) {
        this.f3540a = c5451a;
        c5451a.m2991f();
        this.f3541b = AbstractC5473h.m3160c(null);
        InterfaceC0027x interfaceC0027xM59a = AbstractC0028y.m59a(this);
        this.f3542c = interfaceC0027xM59a;
        c5451a.m2991f();
        InterfaceC11636p interfaceC11636pM25753a = AbstractC11637q.m25753a(this, interfaceC0027xM59a, null);
        this.f3543d = interfaceC11636pM25753a;
        c5451a.m2993h();
        c5451a.m2989d();
        C5452a.a aVarM3162e = AbstractC5473h.m3162e(AbstractC5479k.m3193a(AbstractC5478j.m3192a(AbstractC5474i.m3166a(AbstractC5473h.m3163f(c5451a.m2987b().m3004k(), c5451a), c5451a), c5451a), c5451a));
        c5451a.m2991f();
        this.f3544e = aVarM3162e.m3016h(new EngineInterceptor(this, interfaceC0027xM59a, interfaceC11636pM25753a, null)).m3022p();
    }

    @Override // coil3.InterfaceC5470e
    /* renamed from: a */
    public InterfaceC5467a mo2976a() {
        return (InterfaceC5467a) this.f3540a.m2989d().getValue();
    }

    @Override // coil3.InterfaceC5470e
    /* renamed from: b */
    public C11627g.b mo2977b() {
        return this.f3540a.m2988c();
    }

    @Override // coil3.InterfaceC5470e
    /* renamed from: c */
    public InterfaceC11623c mo2978c(C11627g c11627g) {
        return AbstractC5474i.m3168c(c11627g, AbstractC11117h.m24724b(this.f3541b, (InterfaceC9945d) this.f3540a.m2992g().getValue(), null, new RealImageLoader$enqueue$job$1(this, c11627g, null), 2, null));
    }

    @Override // coil3.InterfaceC5470e
    /* renamed from: d */
    public C5452a mo2979d() {
        return this.f3544e;
    }

    @Override // coil3.InterfaceC5470e
    /* renamed from: e */
    public InterfaceC10825d mo2980e() {
        return (InterfaceC10825d) this.f3540a.m2993h().getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ae A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:15:0x0054, B:71:0x01a8, B:73:0x01ae, B:74:0x01b9, B:76:0x01bd, B:79:0x01cb, B:80:0x01d0), top: B:100:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b9 A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:15:0x0054, B:71:0x01a8, B:73:0x01ae, B:74:0x01b9, B:76:0x01bd, B:79:0x01cb, B:80:0x01d0), top: B:100:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2981g(p380w.C11627g r17, int r18, vc.InterfaceC11588c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.m2981g(w.g, int, vc.c):java.lang.Object");
    }

    /* renamed from: h */
    public final C5451a m2982h() {
        return this.f3540a;
    }

    /* renamed from: i */
    public final void m2983i(C11627g c11627g, AbstractC5453b abstractC5453b) {
        this.f3540a.m2991f();
        abstractC5453b.mo3025a(c11627g);
        C11627g.d dVarM25660p = c11627g.m25660p();
        if (dVarM25660p != null) {
            dVarM25660p.mo3025a(c11627g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2984j(p380w.C11624d r4, p412y.InterfaceC11879a r5, coil3.AbstractC5453b r6) {
        /*
            r3 = this;
            w.g r0 = r4.mo25641a()
            coil3.RealImageLoader$a r1 = r3.f3540a
            r1.m2991f()
            boolean r1 = r5 instanceof p427z.InterfaceC11951d
            if (r1 != 0) goto L17
            if (r5 == 0) goto L3e
        Lf:
            k.j r1 = r4.m25642b()
            r5.mo3280b(r1)
            goto L3e
        L17:
            w.g r1 = r4.mo25641a()
            z.c$a r1 = p380w.AbstractC11630j.m25738o(r1)
            r2 = r5
            z.d r2 = (p427z.InterfaceC11951d) r2
            z.c r1 = r1.mo26512a(r2, r4)
            boolean r2 = r1 instanceof p427z.C11949b
            if (r2 == 0) goto L2d
            if (r5 == 0) goto L3e
            goto Lf
        L2d:
            w.g r5 = r4.mo25641a()
            r6.m3042r(r5, r1)
            r1.mo26511a()
            w.g r5 = r4.mo25641a()
            r6.m3041q(r5, r1)
        L3e:
            r6.mo3028d(r0, r4)
            w.g$d r5 = r0.m25660p()
            if (r5 == 0) goto L4a
            r5.mo3028d(r0, r4)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.m2984j(w.d, y.a, coil3.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0012  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2985k(p380w.C11638r r4, p412y.InterfaceC11879a r5, coil3.AbstractC5453b r6) {
        /*
            r3 = this;
            w.g r0 = r4.mo25641a()
            r4.m25754b()
            coil3.RealImageLoader$a r1 = r3.f3540a
            r1.m2991f()
            boolean r1 = r5 instanceof p427z.InterfaceC11951d
            if (r1 != 0) goto L1a
            if (r5 == 0) goto L41
        L12:
            k.j r1 = r4.m25755c()
            r5.mo3279a(r1)
            goto L41
        L1a:
            w.g r1 = r4.mo25641a()
            z.c$a r1 = p380w.AbstractC11630j.m25738o(r1)
            r2 = r5
            z.d r2 = (p427z.InterfaceC11951d) r2
            z.c r1 = r1.mo26512a(r2, r4)
            boolean r2 = r1 instanceof p427z.C11949b
            if (r2 == 0) goto L30
            if (r5 == 0) goto L41
            goto L12
        L30:
            w.g r5 = r4.mo25641a()
            r6.m3042r(r5, r1)
            r1.mo26511a()
            w.g r5 = r4.mo25641a()
            r6.m3041q(r5, r1)
        L41:
            r6.mo3027c(r0, r4)
            w.g$d r5 = r0.m25660p()
            if (r5 == 0) goto L4d
            r5.mo3027c(r0, r4)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.m2985k(w.r, y.a, coil3.b):void");
    }
}
