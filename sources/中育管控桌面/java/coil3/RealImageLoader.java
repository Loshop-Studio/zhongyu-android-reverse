package coil3;

import android.content.Context;
import coil3.AbstractC4549b;
import coil3.C4548a;
import coil3.disk.InterfaceC4571a;
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
import p023c0.AbstractC4480y;
import p023c0.InterfaceC4479x;
import p152t.InterfaceC7708d;
import p187y.AbstractC7883p;
import p187y.C7872e;
import p187y.InterfaceC7870c;
import p187y.InterfaceC7882o;

/* loaded from: classes3.dex */
public final class RealImageLoader implements InterfaceC4574e {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1444g = AtomicIntegerFieldUpdater.newUpdater(RealImageLoader.class, "f");

    /* renamed from: a */
    public final C4547a f1445a;

    /* renamed from: b */
    public final CoroutineScope f1446b;

    /* renamed from: c */
    public final InterfaceC4479x f1447c;

    /* renamed from: d */
    public final InterfaceC7882o f1448d;

    /* renamed from: e */
    public final C4548a f1449e;

    /* renamed from: f */
    public volatile /* synthetic */ int f1450f;

    /* renamed from: coil3.RealImageLoader$a */
    public static final class C4547a {

        /* renamed from: a */
        public final Context f1451a;

        /* renamed from: b */
        public final C7872e.b f1452b;

        /* renamed from: c */
        public final Lazy f1453c;

        /* renamed from: d */
        public final Lazy f1454d;

        /* renamed from: e */
        public final Lazy f1455e;

        /* renamed from: f */
        public final AbstractC4549b.c f1456f;

        /* renamed from: g */
        public final C4548a f1457g;

        public C4547a(Context context, C7872e.b bVar, Lazy lazy, Lazy lazy2, Lazy lazy3, AbstractC4549b.c cVar, C4548a c4548a, Logger logger) {
            this.f1451a = context;
            this.f1452b = bVar;
            this.f1453c = lazy;
            this.f1454d = lazy2;
            this.f1455e = lazy3;
            this.f1456f = cVar;
            this.f1457g = c4548a;
        }

        /* renamed from: a */
        public final Context m1661a() {
            return this.f1451a;
        }

        /* renamed from: b */
        public final C4548a m1662b() {
            return this.f1457g;
        }

        /* renamed from: c */
        public final C7872e.b m1663c() {
            return this.f1452b;
        }

        /* renamed from: d */
        public final Lazy m1664d() {
            return this.f1455e;
        }

        /* renamed from: e */
        public final AbstractC4549b.c m1665e() {
            return this.f1456f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4547a)) {
                return false;
            }
            C4547a c4547a = (C4547a) obj;
            return Intrinsics.areEqual(this.f1451a, c4547a.f1451a) && Intrinsics.areEqual(this.f1452b, c4547a.f1452b) && Intrinsics.areEqual(this.f1453c, c4547a.f1453c) && Intrinsics.areEqual(this.f1454d, c4547a.f1454d) && Intrinsics.areEqual(this.f1455e, c4547a.f1455e) && Intrinsics.areEqual(this.f1456f, c4547a.f1456f) && Intrinsics.areEqual(this.f1457g, c4547a.f1457g) && Intrinsics.areEqual((Object) null, (Object) null);
        }

        /* renamed from: f */
        public final Logger m1666f() {
            return null;
        }

        /* renamed from: g */
        public final Lazy m1667g() {
            return this.f1453c;
        }

        /* renamed from: h */
        public final Lazy m1668h() {
            return this.f1454d;
        }

        public int hashCode() {
            return ((((((((((((this.f1451a.hashCode() * 31) + this.f1452b.hashCode()) * 31) + this.f1453c.hashCode()) * 31) + this.f1454d.hashCode()) * 31) + this.f1455e.hashCode()) * 31) + this.f1456f.hashCode()) * 31) + this.f1457g.hashCode()) * 31;
        }

        public String toString() {
            return "Options(application=" + this.f1451a + ", defaults=" + this.f1452b + ", mainCoroutineContextLazy=" + this.f1453c + ", memoryCacheLazy=" + this.f1454d + ", diskCacheLazy=" + this.f1455e + ", eventListenerFactory=" + this.f1456f + ", componentRegistry=" + this.f1457g + ", logger=" + ((Object) null) + ')';
        }
    }

    public RealImageLoader(C4547a c4547a) {
        this.f1445a = c4547a;
        c4547a.m1666f();
        this.f1446b = AbstractC4577h.m1894c(null);
        InterfaceC4479x interfaceC4479xM1576a = AbstractC4480y.m1576a(this);
        this.f1447c = interfaceC4479xM1576a;
        c4547a.m1666f();
        InterfaceC7882o interfaceC7882oM9671a = AbstractC7883p.m9671a(this, interfaceC4479xM1576a, null);
        this.f1448d = interfaceC7882oM9671a;
        c4547a.m1668h();
        c4547a.m1664d();
        C4548a.a aVarM1896e = AbstractC4577h.m1896e(AbstractC4583k.m1928a(AbstractC4582j.m1927a(AbstractC4578i.m1900a(AbstractC4577h.m1897f(c4547a.m1662b().m1679k(), c4547a), c4547a), c4547a), c4547a));
        c4547a.m1666f();
        this.f1449e = aVarM1896e.m1691h(new EngineInterceptor(this, interfaceC4479xM1576a, interfaceC7882oM9671a, null)).m1697p();
    }

    @Override // coil3.InterfaceC4574e
    /* renamed from: a */
    public InterfaceC4571a mo1650a() {
        return (InterfaceC4571a) this.f1445a.m1664d().getValue();
    }

    @Override // coil3.InterfaceC4574e
    /* renamed from: b */
    public C7872e.b mo1651b() {
        return this.f1445a.m1663c();
    }

    @Override // coil3.InterfaceC4574e
    /* renamed from: c */
    public Object mo1652c(C7872e c7872e, Continuation continuation) {
        return !AbstractC4578i.m1903d(c7872e) ? m1656h(c7872e, 1, continuation) : CoroutineScopeKt.coroutineScope(new RealImageLoader$execute$2(this, c7872e, null), continuation);
    }

    @Override // coil3.InterfaceC4574e
    /* renamed from: d */
    public InterfaceC7870c mo1653d(C7872e c7872e) {
        return AbstractC4578i.m1902c(c7872e, BuildersKt__Builders_commonKt.async$default(this.f1446b, (CoroutineContext) this.f1445a.m1667g().getValue(), null, new RealImageLoader$enqueue$job$1(this, c7872e, null), 2, null));
    }

    @Override // coil3.InterfaceC4574e
    /* renamed from: e */
    public C4548a mo1654e() {
        return this.f1449e;
    }

    @Override // coil3.InterfaceC4574e
    /* renamed from: f */
    public InterfaceC7708d mo1655f() {
        return (InterfaceC7708d) this.f1445a.m1668h().getValue();
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
    public final java.lang.Object m1656h(p187y.C7872e r17, int r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.m1656h(y.e, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: i */
    public final C4547a m1657i() {
        return this.f1445a;
    }

    /* renamed from: j */
    public final void m1658j(C7872e c7872e, AbstractC4549b abstractC4549b) {
        this.f1445a.m1666f();
        abstractC4549b.mo1703d(c7872e);
        C7872e.d dVarM9587p = c7872e.m9587p();
        if (dVarM9587p != null) {
            dVarM9587p.mo1703d(c7872e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1659k(p187y.C7871d r4, p001a0.InterfaceC0004a r5, coil3.AbstractC4549b r6) {
        /*
            r3 = this;
            y.e r0 = r4.mo9568a()
            coil3.RealImageLoader$a r1 = r3.f1445a
            r1.m1666f()
            boolean r1 = r5 instanceof p015b0.InterfaceC4398d
            if (r1 != 0) goto L17
            if (r5 == 0) goto L3e
        Lf:
            k.j r1 = r4.m9569b()
            r5.mo6b(r1)
            goto L3e
        L17:
            y.e r1 = r4.mo9568a()
            b0.c$a r1 = p187y.AbstractC7876i.m9656o(r1)
            r2 = r5
            b0.d r2 = (p015b0.InterfaceC4398d) r2
            b0.c r1 = r1.mo1404a(r2, r4)
            boolean r2 = r1 instanceof p015b0.C4396b
            if (r2 == 0) goto L2d
            if (r5 == 0) goto L3e
            goto Lf
        L2d:
            y.e r5 = r4.mo9568a()
            r6.m1717r(r5, r1)
            r1.mo1403a()
            y.e r5 = r4.mo9568a()
            r6.m1716q(r5, r1)
        L3e:
            r6.mo1701b(r0, r4)
            y.e$d r5 = r0.m9587p()
            if (r5 == 0) goto L4a
            r5.mo1701b(r0, r4)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.m1659k(y.d, a0.a, coil3.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0012  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1660l(p187y.C7884q r4, p001a0.InterfaceC0004a r5, coil3.AbstractC4549b r6) {
        /*
            r3 = this;
            y.e r0 = r4.mo9568a()
            r4.m9672b()
            coil3.RealImageLoader$a r1 = r3.f1445a
            r1.m1666f()
            boolean r1 = r5 instanceof p015b0.InterfaceC4398d
            if (r1 != 0) goto L1a
            if (r5 == 0) goto L41
        L12:
            k.j r1 = r4.m9674d()
            r5.mo5a(r1)
            goto L41
        L1a:
            y.e r1 = r4.mo9568a()
            b0.c$a r1 = p187y.AbstractC7876i.m9656o(r1)
            r2 = r5
            b0.d r2 = (p015b0.InterfaceC4398d) r2
            b0.c r1 = r1.mo1404a(r2, r4)
            boolean r2 = r1 instanceof p015b0.C4396b
            if (r2 == 0) goto L30
            if (r5 == 0) goto L41
            goto L12
        L30:
            y.e r5 = r4.mo9568a()
            r6.m1717r(r5, r1)
            r1.mo1403a()
            y.e r5 = r4.mo9568a()
            r6.m1716q(r5, r1)
        L41:
            r6.mo1700a(r0, r4)
            y.e$d r5 = r0.m9587p()
            if (r5 == 0) goto L4d
            r5.mo1700a(r0, r4)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.m1660l(y.q, a0.a, coil3.b):void");
    }
}
