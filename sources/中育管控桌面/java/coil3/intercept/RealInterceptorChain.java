package coil3.intercept;

import coil3.AbstractC4549b;
import coil3.intercept.InterfaceC4581a;
import java.util.List;
import p187y.C7872e;
import p187y.C7878k;
import p194z.C7923e;

/* loaded from: classes3.dex */
public final class RealInterceptorChain implements InterfaceC4581a.a {

    /* renamed from: a */
    public final C7872e f1795a;

    /* renamed from: b */
    public final List f1796b;

    /* renamed from: c */
    public final int f1797c;

    /* renamed from: d */
    public final C7872e f1798d;

    /* renamed from: e */
    public final C7923e f1799e;

    /* renamed from: f */
    public final AbstractC4549b f1800f;

    /* renamed from: g */
    public final boolean f1801g;

    public RealInterceptorChain(C7872e c7872e, List list, int i6, C7872e c7872e2, C7923e c7923e, AbstractC4549b abstractC4549b, boolean z6) {
        this.f1795a = c7872e;
        this.f1796b = list;
        this.f1797c = i6;
        this.f1798d = c7872e2;
        this.f1799e = c7923e;
        this.f1800f = abstractC4549b;
        this.f1801g = z6;
    }

    /* renamed from: d */
    public static /* synthetic */ RealInterceptorChain m1920d(RealInterceptorChain realInterceptorChain, int i6, C7872e c7872e, C7923e c7923e, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i6 = realInterceptorChain.f1797c;
        }
        if ((i7 & 2) != 0) {
            c7872e = realInterceptorChain.mo1921a();
        }
        if ((i7 & 4) != 0) {
            c7923e = realInterceptorChain.getSize();
        }
        return realInterceptorChain.m1923c(i6, c7872e, c7923e);
    }

    @Override // coil3.intercept.InterfaceC4581a.a
    /* renamed from: a */
    public C7872e mo1921a() {
        return this.f1798d;
    }

    /* renamed from: b */
    public final void m1922b(C7872e c7872e, InterfaceC4581a interfaceC4581a) {
        if (c7872e.m9574c() != this.f1795a.m9574c()) {
            throw new IllegalStateException(("Interceptor '" + interfaceC4581a + "' cannot modify the request's context.").toString());
        }
        if (c7872e.m9575d() == C7878k.f10588a) {
            throw new IllegalStateException(("Interceptor '" + interfaceC4581a + "' cannot set the request's data to null.").toString());
        }
        if (c7872e.m9596y() != this.f1795a.m9596y()) {
            throw new IllegalStateException(("Interceptor '" + interfaceC4581a + "' cannot modify the request's target.").toString());
        }
        if (c7872e.m9595x() == this.f1795a.m9595x()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + interfaceC4581a + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* renamed from: c */
    public final RealInterceptorChain m1923c(int i6, C7872e c7872e, C7923e c7923e) {
        return new RealInterceptorChain(this.f1795a, this.f1796b, i6, c7872e, c7923e, this.f1800f, this.f1801g);
    }

    /* renamed from: e */
    public final AbstractC4549b m1924e() {
        return this.f1800f;
    }

    /* renamed from: f */
    public final boolean m1925f() {
        return this.f1801g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m1926g(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof coil3.intercept.RealInterceptorChain$proceed$1
            if (r0 == 0) goto L13
            r0 = r12
            coil3.intercept.RealInterceptorChain$proceed$1 r0 = (coil3.intercept.RealInterceptorChain$proceed$1) r0
            int r1 = r0.f1806e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1806e = r1
            goto L18
        L13:
            coil3.intercept.RealInterceptorChain$proceed$1 r0 = new coil3.intercept.RealInterceptorChain$proceed$1
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f1804c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1806e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f1803b
            coil3.intercept.RealInterceptorChain r1 = (coil3.intercept.RealInterceptorChain) r1
            java.lang.Object r0 = r0.f1802a
            coil3.intercept.a r0 = (coil3.intercept.InterfaceC4581a) r0
            kotlin.ResultKt.throwOnFailure(r12)
            r4 = r11
            goto L68
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3a:
            kotlin.ResultKt.throwOnFailure(r12)
            java.util.List r12 = r11.f1796b
            int r2 = r11.f1797c
            java.lang.Object r12 = r12.get(r2)
            coil3.intercept.a r12 = (coil3.intercept.InterfaceC4581a) r12
            int r2 = r11.f1797c
            int r5 = r2 + 1
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4 = r11
            coil3.intercept.RealInterceptorChain r2 = m1920d(r4, r5, r6, r7, r8, r9)
            r0.f1802a = r12
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r0.f1803b = r5
            r0.f1806e = r3
            java.lang.Object r0 = r12.mo1909a(r2, r0)
            if (r0 != r1) goto L65
            return r1
        L65:
            r10 = r0
            r0 = r12
            r12 = r10
        L68:
            y.j r12 = (p187y.InterfaceC7877j) r12
            y.e r1 = r12.mo9568a()
            r11.m1922b(r1, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.RealInterceptorChain.m1926g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // coil3.intercept.InterfaceC4581a.a
    public C7923e getSize() {
        return this.f1799e;
    }
}
