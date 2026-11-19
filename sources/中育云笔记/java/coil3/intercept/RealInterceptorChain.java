package coil3.intercept;

import coil3.AbstractC5453b;
import coil3.intercept.InterfaceC5477a;
import java.util.List;
import p380w.C11627g;
import p380w.C11632l;
import p396x.C11749e;

/* loaded from: classes3.dex */
public final class RealInterceptorChain implements InterfaceC5477a.a {

    /* renamed from: a */
    public final C11627g f3786a;

    /* renamed from: b */
    public final List f3787b;

    /* renamed from: c */
    public final int f3788c;

    /* renamed from: d */
    public final C11627g f3789d;

    /* renamed from: e */
    public final C11749e f3790e;

    /* renamed from: f */
    public final AbstractC5453b f3791f;

    /* renamed from: g */
    public final boolean f3792g;

    public RealInterceptorChain(C11627g c11627g, List list, int i10, C11627g c11627g2, C11749e c11749e, AbstractC5453b abstractC5453b, boolean z10) {
        this.f3786a = c11627g;
        this.f3787b = list;
        this.f3788c = i10;
        this.f3789d = c11627g2;
        this.f3790e = c11749e;
        this.f3791f = abstractC5453b;
        this.f3792g = z10;
    }

    /* renamed from: d */
    public static /* synthetic */ RealInterceptorChain m3185d(RealInterceptorChain realInterceptorChain, int i10, C11627g c11627g, C11749e c11749e, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = realInterceptorChain.f3788c;
        }
        if ((i11 & 2) != 0) {
            c11627g = realInterceptorChain.mo3186a();
        }
        if ((i11 & 4) != 0) {
            c11749e = realInterceptorChain.getSize();
        }
        return realInterceptorChain.m3188c(i10, c11627g, c11749e);
    }

    @Override // coil3.intercept.InterfaceC5477a.a
    /* renamed from: a */
    public C11627g mo3186a() {
        return this.f3789d;
    }

    /* renamed from: b */
    public final void m3187b(C11627g c11627g, InterfaceC5477a interfaceC5477a) {
        if (c11627g.m25647c() != this.f3786a.m25647c()) {
            throw new IllegalStateException(("Interceptor '" + interfaceC5477a + "' cannot modify the request's context.").toString());
        }
        if (c11627g.m25648d() == C11632l.f27624a) {
            throw new IllegalStateException(("Interceptor '" + interfaceC5477a + "' cannot set the request's data to null.").toString());
        }
        if (c11627g.m25669y() != this.f3786a.m25669y()) {
            throw new IllegalStateException(("Interceptor '" + interfaceC5477a + "' cannot modify the request's target.").toString());
        }
        if (c11627g.m25668x() == this.f3786a.m25668x()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + interfaceC5477a + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* renamed from: c */
    public final RealInterceptorChain m3188c(int i10, C11627g c11627g, C11749e c11749e) {
        return new RealInterceptorChain(this.f3786a, this.f3787b, i10, c11627g, c11749e, this.f3791f, this.f3792g);
    }

    /* renamed from: e */
    public final AbstractC5453b m3189e() {
        return this.f3791f;
    }

    /* renamed from: f */
    public final boolean m3190f() {
        return this.f3792g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m3191g(vc.InterfaceC11588c r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof coil3.intercept.RealInterceptorChain$proceed$1
            if (r0 == 0) goto L13
            r0 = r12
            coil3.intercept.RealInterceptorChain$proceed$1 r0 = (coil3.intercept.RealInterceptorChain$proceed$1) r0
            int r1 = r0.f3797g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3797g = r1
            goto L18
        L13:
            coil3.intercept.RealInterceptorChain$proceed$1 r0 = new coil3.intercept.RealInterceptorChain$proceed$1
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f3795e
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f3797g
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f3794d
            coil3.intercept.RealInterceptorChain r1 = (coil3.intercept.RealInterceptorChain) r1
            java.lang.Object r0 = r0.f3793c
            coil3.intercept.a r0 = (coil3.intercept.InterfaceC5477a) r0
            kotlin.AbstractC9924b.m20071b(r12)
            r4 = r11
            goto L68
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3a:
            kotlin.AbstractC9924b.m20071b(r12)
            java.util.List r12 = r11.f3787b
            int r2 = r11.f3788c
            java.lang.Object r12 = r12.get(r2)
            coil3.intercept.a r12 = (coil3.intercept.InterfaceC5477a) r12
            int r2 = r11.f3788c
            int r5 = r2 + 1
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4 = r11
            coil3.intercept.RealInterceptorChain r2 = m3185d(r4, r5, r6, r7, r8, r9)
            r0.f3793c = r12
            java.lang.Object r5 = p409xc.AbstractC11833h.m26224a(r2)
            r0.f3794d = r5
            r0.f3797g = r3
            java.lang.Object r0 = r12.mo3174a(r2, r0)
            if (r0 != r1) goto L65
            return r1
        L65:
            r10 = r0
            r0 = r12
            r12 = r10
        L68:
            w.k r12 = (p380w.InterfaceC11631k) r12
            w.g r1 = r12.mo25641a()
            r11.m3187b(r1, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.RealInterceptorChain.m3191g(vc.c):java.lang.Object");
    }

    @Override // coil3.intercept.InterfaceC5477a.a
    public C11749e getSize() {
        return this.f3790e;
    }
}
