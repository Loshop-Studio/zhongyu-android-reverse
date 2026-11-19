package coil3;

import android.content.Context;
import coil3.AbstractC5303b;
import coil3.C5302a;
import coil3.disk.InterfaceC5325a;
import coil3.intercept.EngineInterceptor;
import coil3.util.Logger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p090e0.AbstractC7826x;
import p090e0.InterfaceC7825w;
import p247t.InterfaceC9595d;
import p297y.AbstractC9935p;
import p297y.C9924e;
import p297y.InterfaceC9922c;
import p297y.InterfaceC9934o;

/* loaded from: classes3.dex */
public final class RealImageLoader implements InterfaceC5328e {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2701g = AtomicIntegerFieldUpdater.newUpdater(RealImageLoader.class, "f");

    /* renamed from: a */
    public final C5301a f2702a;

    /* renamed from: b */
    public final CoroutineScope f2703b;

    /* renamed from: c */
    public final InterfaceC7825w f2704c;

    /* renamed from: d */
    public final InterfaceC9934o f2705d;

    /* renamed from: e */
    public final C5302a f2706e;

    /* renamed from: f */
    public volatile /* synthetic */ int f2707f;

    /* renamed from: coil3.RealImageLoader$a */
    public static final class C5301a {

        /* renamed from: a */
        public final Context f2708a;

        /* renamed from: b */
        public final C9924e.b f2709b;

        /* renamed from: c */
        public final Lazy f2710c;

        /* renamed from: d */
        public final Lazy f2711d;

        /* renamed from: e */
        public final AbstractC5303b.c f2712e;

        /* renamed from: f */
        public final C5302a f2713f;

        public C5301a(Context context, C9924e.b bVar, Lazy lazy, Lazy lazy2, AbstractC5303b.c cVar, C5302a c5302a, Logger logger) {
            this.f2708a = context;
            this.f2709b = bVar;
            this.f2710c = lazy;
            this.f2711d = lazy2;
            this.f2712e = cVar;
            this.f2713f = c5302a;
        }

        /* renamed from: a */
        public final Context m2556a() {
            return this.f2708a;
        }

        /* renamed from: b */
        public final C5302a m2557b() {
            return this.f2713f;
        }

        /* renamed from: c */
        public final C9924e.b m2558c() {
            return this.f2709b;
        }

        /* renamed from: d */
        public final Lazy m2559d() {
            return this.f2711d;
        }

        /* renamed from: e */
        public final AbstractC5303b.c m2560e() {
            return this.f2712e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5301a)) {
                return false;
            }
            C5301a c5301a = (C5301a) obj;
            return Intrinsics.areEqual(this.f2708a, c5301a.f2708a) && Intrinsics.areEqual(this.f2709b, c5301a.f2709b) && Intrinsics.areEqual(this.f2710c, c5301a.f2710c) && Intrinsics.areEqual(this.f2711d, c5301a.f2711d) && Intrinsics.areEqual(this.f2712e, c5301a.f2712e) && Intrinsics.areEqual(this.f2713f, c5301a.f2713f) && Intrinsics.areEqual((Object) null, (Object) null);
        }

        /* renamed from: f */
        public final Logger m2561f() {
            return null;
        }

        /* renamed from: g */
        public final Lazy m2562g() {
            return this.f2710c;
        }

        public int hashCode() {
            return ((((((((((this.f2708a.hashCode() * 31) + this.f2709b.hashCode()) * 31) + this.f2710c.hashCode()) * 31) + this.f2711d.hashCode()) * 31) + this.f2712e.hashCode()) * 31) + this.f2713f.hashCode()) * 31;
        }

        public String toString() {
            return "Options(application=" + this.f2708a + ", defaults=" + this.f2709b + ", memoryCacheLazy=" + this.f2710c + ", diskCacheLazy=" + this.f2711d + ", eventListenerFactory=" + this.f2712e + ", componentRegistry=" + this.f2713f + ", logger=" + ((Object) null) + ')';
        }
    }

    public RealImageLoader(C5301a c5301a) {
        this.f2702a = c5301a;
        c5301a.m2561f();
        this.f2703b = AbstractC5331h.m2788c(null);
        InterfaceC7825w interfaceC7825wM12224a = AbstractC7826x.m12224a(this);
        this.f2704c = interfaceC7825wM12224a;
        c5301a.m2561f();
        InterfaceC9934o interfaceC9934oM17118a = AbstractC9935p.m17118a(this, interfaceC7825wM12224a, null);
        this.f2705d = interfaceC9934oM17118a;
        c5301a.m2562g();
        c5301a.m2559d();
        C5302a.a aVarM2790e = AbstractC5331h.m2790e(AbstractC5337k.m2822a(AbstractC5336j.m2821a(AbstractC5332i.m2794a(AbstractC5331h.m2791f(c5301a.m2557b().m2573k(), c5301a), c5301a), c5301a), c5301a));
        c5301a.m2561f();
        this.f2706e = aVarM2790e.m2585h(new EngineInterceptor(this, interfaceC7825wM12224a, interfaceC9934oM17118a, null)).m2591p();
    }

    @Override // coil3.InterfaceC5328e
    /* renamed from: a */
    public InterfaceC5325a mo2545a() {
        return (InterfaceC5325a) this.f2702a.m2559d().getValue();
    }

    @Override // coil3.InterfaceC5328e
    /* renamed from: b */
    public C9924e.b mo2546b() {
        return this.f2702a.m2558c();
    }

    @Override // coil3.InterfaceC5328e
    /* renamed from: c */
    public Object mo2547c(C9924e c9924e, Continuation continuation) {
        return !AbstractC5332i.m2797d(c9924e) ? m2551h(c9924e, 1, continuation) : CoroutineScopeKt.coroutineScope(new RealImageLoader$execute$2(c9924e, this, null), continuation);
    }

    @Override // coil3.InterfaceC5328e
    /* renamed from: d */
    public InterfaceC9922c mo2548d(C9924e c9924e) {
        return AbstractC5332i.m2796c(c9924e, BuildersKt__Builders_commonKt.async$default(this.f2703b, Dispatchers.getMain().getImmediate(), null, new RealImageLoader$enqueue$job$1(this, c9924e, null), 2, null));
    }

    @Override // coil3.InterfaceC5328e
    /* renamed from: e */
    public C5302a mo2549e() {
        return this.f2706e;
    }

    @Override // coil3.InterfaceC5328e
    /* renamed from: f */
    public InterfaceC9595d mo2550f() {
        return (InterfaceC9595d) this.f2702a.m2562g().getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015e A[Catch: all -> 0x0044, TryCatch #3 {all -> 0x0044, blocks: (B:15:0x003f, B:76:0x0158, B:78:0x015e, B:79:0x0169, B:81:0x016d, B:84:0x017b, B:85:0x0180, B:22:0x005f), top: B:107:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0169 A[Catch: all -> 0x0044, TryCatch #3 {all -> 0x0044, blocks: (B:15:0x003f, B:76:0x0158, B:78:0x015e, B:79:0x0169, B:81:0x016d, B:84:0x017b, B:85:0x0180, B:22:0x005f), top: B:107:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0193 A[Catch: all -> 0x01a2, TRY_LEAVE, TryCatch #2 {all -> 0x01a2, blocks: (B:92:0x018f, B:94:0x0193, B:99:0x01a4, B:100:0x01a7), top: B:106:0x018f }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a4 A[Catch: all -> 0x01a2, TRY_ENTER, TryCatch #2 {all -> 0x01a2, blocks: (B:92:0x018f, B:94:0x0193, B:99:0x01a4, B:100:0x01a7), top: B:106:0x018f }] */
    /* JADX WARN: Type inference failed for: r13v0, types: [coil3.RealImageLoader] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12, types: [coil3.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v21, types: [coil3.b] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v4, types: [coil3.b] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [y.e] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [y.n] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2551h(p297y.C9924e r14, int r15, kotlin.coroutines.Continuation r16) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.m2551h(y.e, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: i */
    public final C5301a m2552i() {
        return this.f2702a;
    }

    /* renamed from: j */
    public final void m2553j(C9924e c9924e, AbstractC5303b abstractC5303b) {
        this.f2702a.m2561f();
        abstractC5303b.mo2597d(c9924e);
        C9924e.d dVarM17032p = c9924e.m17032p();
        if (dVarM17032p != null) {
            dVarM17032p.mo2597d(c9924e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2554k(p297y.C9923d r4, p029c0.InterfaceC5217a r5, coil3.AbstractC5303b r6) {
        /*
            r3 = this;
            y.e r0 = r4.mo17012a()
            coil3.RealImageLoader$a r1 = r3.f2702a
            r1.m2561f()
            boolean r1 = r5 instanceof p079d0.InterfaceC7735d
            if (r1 != 0) goto L10
            if (r5 == 0) goto L3c
            goto L23
        L10:
            y.e r1 = r4.mo17012a()
            d0.c$a r1 = p297y.AbstractC9928i.m17102o(r1)
            r2 = r5
            d0.d r2 = (p079d0.InterfaceC7735d) r2
            d0.c r1 = r1.mo12080a(r2, r4)
            boolean r2 = r1 instanceof p079d0.C7733b
            if (r2 == 0) goto L2b
        L23:
            k.j r1 = r4.m17013b()
            r5.mo2308b(r1)
            goto L3c
        L2b:
            y.e r5 = r4.mo17012a()
            r6.m2611r(r5, r1)
            r1.mo12079a()
            y.e r5 = r4.mo17012a()
            r6.m2610q(r5, r1)
        L3c:
            r6.mo2595b(r0, r4)
            y.e$d r5 = r0.m17032p()
            if (r5 == 0) goto L48
            r5.mo2595b(r0, r4)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.m2554k(y.d, c0.a, coil3.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2555l(p297y.C9936q r4, p029c0.InterfaceC5217a r5, coil3.AbstractC5303b r6) {
        /*
            r3 = this;
            y.e r0 = r4.mo17012a()
            r4.m17119b()
            coil3.RealImageLoader$a r1 = r3.f2702a
            r1.m2561f()
            boolean r1 = r5 instanceof p079d0.InterfaceC7735d
            if (r1 != 0) goto L13
            if (r5 == 0) goto L3f
            goto L26
        L13:
            y.e r1 = r4.mo17012a()
            d0.c$a r1 = p297y.AbstractC9928i.m17102o(r1)
            r2 = r5
            d0.d r2 = (p079d0.InterfaceC7735d) r2
            d0.c r1 = r1.mo12080a(r2, r4)
            boolean r2 = r1 instanceof p079d0.C7733b
            if (r2 == 0) goto L2e
        L26:
            k.j r1 = r4.m17120c()
            r5.mo2307a(r1)
            goto L3f
        L2e:
            y.e r5 = r4.mo17012a()
            r6.m2611r(r5, r1)
            r1.mo12079a()
            y.e r5 = r4.mo17012a()
            r6.m2610q(r5, r1)
        L3f:
            r6.mo2594a(r0, r4)
            y.e$d r5 = r0.m17032p()
            if (r5 == 0) goto L4b
            r5.mo2594a(r0, r4)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.m2555l(y.q, c0.a, coil3.b):void");
    }
}
