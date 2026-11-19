package coil3;

import android.content.Context;
import coil3.AbstractC5168b;
import coil3.C5167a;
import coil3.disk.InterfaceC5190a;
import coil3.intercept.EngineInterceptor;
import coil3.util.Logger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import p030c0.AbstractC5100y;
import p030c0.InterfaceC5099x;
import p238t.InterfaceC9363d;
import p290y.AbstractC9895n;
import p290y.C9886e;
import p290y.InterfaceC9884c;
import p290y.InterfaceC9894m;

/* loaded from: classes3.dex */
public final class RealImageLoader implements InterfaceC5193e {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2760g = AtomicIntegerFieldUpdater.newUpdater(RealImageLoader.class, "f");

    /* renamed from: a */
    public final C5166a f2761a;

    /* renamed from: b */
    public final CoroutineScope f2762b;

    /* renamed from: c */
    public final InterfaceC5099x f2763c;

    /* renamed from: d */
    public final InterfaceC9894m f2764d;

    /* renamed from: e */
    public final C5167a f2765e;

    /* renamed from: f */
    public volatile /* synthetic */ int f2766f;

    /* renamed from: coil3.RealImageLoader$a */
    public static final class C5166a {

        /* renamed from: a */
        public final Context f2767a;

        /* renamed from: b */
        public final C9886e.b f2768b;

        /* renamed from: c */
        public final Lazy f2769c;

        /* renamed from: d */
        public final Lazy f2770d;

        /* renamed from: e */
        public final Lazy f2771e;

        /* renamed from: f */
        public final AbstractC5168b.c f2772f;

        /* renamed from: g */
        public final C5167a f2773g;

        public C5166a(Context context, C9886e.b bVar, Lazy lazy, Lazy lazy2, Lazy lazy3, AbstractC5168b.c cVar, C5167a c5167a, Logger logger) {
            this.f2767a = context;
            this.f2768b = bVar;
            this.f2769c = lazy;
            this.f2770d = lazy2;
            this.f2771e = lazy3;
            this.f2772f = cVar;
            this.f2773g = c5167a;
        }

        /* renamed from: a */
        public final Context m2827a() {
            return this.f2767a;
        }

        /* renamed from: b */
        public final C5167a m2828b() {
            return this.f2773g;
        }

        /* renamed from: c */
        public final C9886e.b m2829c() {
            return this.f2768b;
        }

        /* renamed from: d */
        public final Lazy m2830d() {
            return this.f2771e;
        }

        /* renamed from: e */
        public final AbstractC5168b.c m2831e() {
            return this.f2772f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5166a)) {
                return false;
            }
            C5166a c5166a = (C5166a) obj;
            return Intrinsics.areEqual(this.f2767a, c5166a.f2767a) && Intrinsics.areEqual(this.f2768b, c5166a.f2768b) && Intrinsics.areEqual(this.f2769c, c5166a.f2769c) && Intrinsics.areEqual(this.f2770d, c5166a.f2770d) && Intrinsics.areEqual(this.f2771e, c5166a.f2771e) && Intrinsics.areEqual(this.f2772f, c5166a.f2772f) && Intrinsics.areEqual(this.f2773g, c5166a.f2773g) && Intrinsics.areEqual((Object) null, (Object) null);
        }

        /* renamed from: f */
        public final Logger m2832f() {
            return null;
        }

        /* renamed from: g */
        public final Lazy m2833g() {
            return this.f2769c;
        }

        /* renamed from: h */
        public final Lazy m2834h() {
            return this.f2770d;
        }

        public int hashCode() {
            return ((((((((((((this.f2767a.hashCode() * 31) + this.f2768b.hashCode()) * 31) + this.f2769c.hashCode()) * 31) + this.f2770d.hashCode()) * 31) + this.f2771e.hashCode()) * 31) + this.f2772f.hashCode()) * 31) + this.f2773g.hashCode()) * 31;
        }

        public String toString() {
            return "Options(application=" + this.f2767a + ", defaults=" + this.f2768b + ", mainCoroutineContextLazy=" + this.f2769c + ", memoryCacheLazy=" + this.f2770d + ", diskCacheLazy=" + this.f2771e + ", eventListenerFactory=" + this.f2772f + ", componentRegistry=" + this.f2773g + ", logger=" + ((Object) null) + ')';
        }
    }

    public RealImageLoader(C5166a c5166a) {
        this.f2761a = c5166a;
        c5166a.m2832f();
        this.f2762b = AbstractC5196h.m3068c(null);
        InterfaceC5099x interfaceC5099xM2718a = AbstractC5100y.m2718a(this);
        this.f2763c = interfaceC5099xM2718a;
        c5166a.m2832f();
        InterfaceC9894m interfaceC9894mM16710a = AbstractC9895n.m16710a(this, interfaceC5099xM2718a, null);
        this.f2764d = interfaceC9894mM16710a;
        c5166a.m2834h();
        c5166a.m2830d();
        C5167a.a aVarM3070e = AbstractC5196h.m3070e(AbstractC5202k.m3103a(AbstractC5201j.m3102a(AbstractC5197i.m3074a(AbstractC5196h.m3071f(c5166a.m2828b().m2845k(), c5166a), c5166a), c5166a), c5166a));
        c5166a.m2832f();
        this.f2765e = aVarM3070e.m2857h(new EngineInterceptor(this, interfaceC5099xM2718a, interfaceC9894mM16710a, null)).m2863p();
    }

    @Override // coil3.InterfaceC5193e
    /* renamed from: a */
    public InterfaceC5190a mo2816a() {
        return (InterfaceC5190a) this.f2761a.m2830d().getValue();
    }

    @Override // coil3.InterfaceC5193e
    /* renamed from: b */
    public C9886e.b mo2817b() {
        return this.f2761a.m2829c();
    }

    @Override // coil3.InterfaceC5193e
    /* renamed from: c */
    public Object mo2818c(C9886e c9886e, Continuation continuation) {
        return !AbstractC5197i.m3077d(c9886e) ? m2822h(c9886e, 1, continuation) : CoroutineScopeKt.coroutineScope(new RealImageLoader$execute$2(this, c9886e, null), continuation);
    }

    @Override // coil3.InterfaceC5193e
    /* renamed from: d */
    public InterfaceC9884c mo2819d(C9886e c9886e) {
        return AbstractC5197i.m3076c(c9886e, BuildersKt__Builders_commonKt.async$default(this.f2762b, (CoroutineContext) this.f2761a.m2833g().getValue(), null, new RealImageLoader$enqueue$job$1(this, c9886e, null), 2, null));
    }

    @Override // coil3.InterfaceC5193e
    /* renamed from: e */
    public C5167a mo2820e() {
        return this.f2765e;
    }

    @Override // coil3.InterfaceC5193e
    /* renamed from: f */
    public InterfaceC9363d mo2821f() {
        return (InterfaceC9363d) this.f2761a.m2834h().getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ae A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:15:0x0054, B:71:0x01a8, B:73:0x01ae, B:74:0x01b9, B:76:0x01bd, B:79:0x01cb, B:80:0x01d0), top: B:100:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b9 A[Catch: all -> 0x0059, TryCatch #3 {all -> 0x0059, blocks: (B:15:0x0054, B:71:0x01a8, B:73:0x01ae, B:74:0x01b9, B:76:0x01bd, B:79:0x01cb, B:80:0x01d0), top: B:100:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2822h(p290y.C9886e r17, int r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.m2822h(y.e, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: i */
    public final C5166a m2823i() {
        return this.f2761a;
    }

    /* renamed from: j */
    public final void m2824j(C9886e c9886e, AbstractC5168b abstractC5168b) {
        this.f2761a.m2832f();
        abstractC5168b.mo2869d(c9886e);
        C9886e.d dVarM16630p = c9886e.m16630p();
        if (dVarM16630p != null) {
            dVarM16630p.mo2869d(c9886e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2825k(p290y.C9885d r4, p002a0.InterfaceC0006a r5, coil3.AbstractC5168b r6) {
        /*
            r3 = this;
            y.e r0 = r4.mo16611a()
            coil3.RealImageLoader$a r1 = r3.f2761a
            r1.m2832f()
            boolean r1 = r5 instanceof p019b0.InterfaceC4941d
            if (r1 != 0) goto L17
            if (r5 == 0) goto L3e
        Lf:
            k.j r1 = r4.getImage()
            r5.mo14b(r1)
            goto L3e
        L17:
            y.e r1 = r4.mo16611a()
            b0.c$a r1 = p290y.AbstractC9888g.m16697k(r1)
            r2 = r5
            b0.d r2 = (p019b0.InterfaceC4941d) r2
            b0.c r1 = r1.mo2327a(r2, r4)
            boolean r2 = r1 instanceof p019b0.C4939b
            if (r2 == 0) goto L2d
            if (r5 == 0) goto L3e
            goto Lf
        L2d:
            y.e r5 = r4.mo16611a()
            r6.m2883r(r5, r1)
            r1.mo2326a()
            y.e r5 = r4.mo16611a()
            r6.m2882q(r5, r1)
        L3e:
            r6.mo2867b(r0, r4)
            y.e$d r5 = r0.m16630p()
            if (r5 == 0) goto L4a
            r5.mo2867b(r0, r4)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.m2825k(y.d, a0.a, coil3.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0012  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2826l(p290y.C9896o r4, p002a0.InterfaceC0006a r5, coil3.AbstractC5168b r6) {
        /*
            r3 = this;
            y.e r0 = r4.mo16611a()
            r4.m16711b()
            coil3.RealImageLoader$a r1 = r3.f2761a
            r1.m2832f()
            boolean r1 = r5 instanceof p019b0.InterfaceC4941d
            if (r1 != 0) goto L1a
            if (r5 == 0) goto L41
        L12:
            k.j r1 = r4.getImage()
            r5.mo13a(r1)
            goto L41
        L1a:
            y.e r1 = r4.mo16611a()
            b0.c$a r1 = p290y.AbstractC9888g.m16697k(r1)
            r2 = r5
            b0.d r2 = (p019b0.InterfaceC4941d) r2
            b0.c r1 = r1.mo2327a(r2, r4)
            boolean r2 = r1 instanceof p019b0.C4939b
            if (r2 == 0) goto L30
            if (r5 == 0) goto L41
            goto L12
        L30:
            y.e r5 = r4.mo16611a()
            r6.m2883r(r5, r1)
            r1.mo2326a()
            y.e r5 = r4.mo16611a()
            r6.m2882q(r5, r1)
        L41:
            r6.mo2866a(r0, r4)
            y.e$d r5 = r0.m16630p()
            if (r5 == 0) goto L4d
            r5.mo2866a(r0, r4)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.m2826l(y.o, a0.a, coil3.b):void");
    }
}
