package coil3.intercept;

import coil3.AbstractC5303b;
import coil3.intercept.InterfaceC5335a;
import java.util.List;
import p297y.C9924e;
import p297y.C9930k;
import p307z.C9975e;

/* loaded from: classes3.dex */
public final class RealInterceptorChain implements InterfaceC5335a.a {

    /* renamed from: a */
    public final C9924e f3015a;

    /* renamed from: b */
    public final List f3016b;

    /* renamed from: c */
    public final int f3017c;

    /* renamed from: d */
    public final C9924e f3018d;

    /* renamed from: e */
    public final C9975e f3019e;

    /* renamed from: f */
    public final AbstractC5303b f3020f;

    /* renamed from: g */
    public final boolean f3021g;

    public RealInterceptorChain(C9924e c9924e, List list, int i9, C9924e c9924e2, C9975e c9975e, AbstractC5303b abstractC5303b, boolean z9) {
        this.f3015a = c9924e;
        this.f3016b = list;
        this.f3017c = i9;
        this.f3018d = c9924e2;
        this.f3019e = c9975e;
        this.f3020f = abstractC5303b;
        this.f3021g = z9;
    }

    /* renamed from: d */
    public static /* synthetic */ RealInterceptorChain m2814d(RealInterceptorChain realInterceptorChain, int i9, C9924e c9924e, C9975e c9975e, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = realInterceptorChain.f3017c;
        }
        if ((i10 & 2) != 0) {
            c9924e = realInterceptorChain.mo2815a();
        }
        if ((i10 & 4) != 0) {
            c9975e = realInterceptorChain.getSize();
        }
        return realInterceptorChain.m2817c(i9, c9924e, c9975e);
    }

    @Override // coil3.intercept.InterfaceC5335a.a
    /* renamed from: a */
    public C9924e mo2815a() {
        return this.f3018d;
    }

    /* renamed from: b */
    public final void m2816b(C9924e c9924e, InterfaceC5335a interfaceC5335a) {
        if (c9924e.m17019c() != this.f3015a.m17019c()) {
            throw new IllegalStateException(("Interceptor '" + interfaceC5335a + "' cannot modify the request's context.").toString());
        }
        if (c9924e.m17020d() == C9930k.f17849a) {
            throw new IllegalStateException(("Interceptor '" + interfaceC5335a + "' cannot set the request's data to null.").toString());
        }
        if (c9924e.m17041y() != this.f3015a.m17041y()) {
            throw new IllegalStateException(("Interceptor '" + interfaceC5335a + "' cannot modify the request's target.").toString());
        }
        if (c9924e.m17040x() == this.f3015a.m17040x()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + interfaceC5335a + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* renamed from: c */
    public final RealInterceptorChain m2817c(int i9, C9924e c9924e, C9975e c9975e) {
        return new RealInterceptorChain(this.f3015a, this.f3016b, i9, c9924e, c9975e, this.f3020f, this.f3021g);
    }

    /* renamed from: e */
    public final AbstractC5303b m2818e() {
        return this.f3020f;
    }

    /* renamed from: f */
    public final boolean m2819f() {
        return this.f3021g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2820g(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof coil3.intercept.RealInterceptorChain$proceed$1
            if (r0 == 0) goto L13
            r0 = r12
            coil3.intercept.RealInterceptorChain$proceed$1 r0 = (coil3.intercept.RealInterceptorChain$proceed$1) r0
            int r1 = r0.f3025d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3025d = r1
            goto L18
        L13:
            coil3.intercept.RealInterceptorChain$proceed$1 r0 = new coil3.intercept.RealInterceptorChain$proceed$1
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f3023b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f3025d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f3022a
            coil3.intercept.a r0 = (coil3.intercept.InterfaceC5335a) r0
            kotlin.ResultKt.throwOnFailure(r12)
            r4 = r11
            goto L5e
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L36:
            kotlin.ResultKt.throwOnFailure(r12)
            java.util.List r12 = r11.f3016b
            int r2 = r11.f3017c
            java.lang.Object r12 = r12.get(r2)
            coil3.intercept.a r12 = (coil3.intercept.InterfaceC5335a) r12
            int r2 = r11.f3017c
            int r5 = r2 + 1
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4 = r11
            coil3.intercept.RealInterceptorChain r2 = m2814d(r4, r5, r6, r7, r8, r9)
            r0.f3022a = r12
            r0.f3025d = r3
            java.lang.Object r0 = r12.mo2803a(r2, r0)
            if (r0 != r1) goto L5b
            return r1
        L5b:
            r10 = r0
            r0 = r12
            r12 = r10
        L5e:
            y.j r12 = (p297y.InterfaceC9929j) r12
            y.e r1 = r12.mo17012a()
            r11.m2816b(r1, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.RealInterceptorChain.m2820g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // coil3.intercept.InterfaceC5335a.a
    public C9975e getSize() {
        return this.f3019e;
    }
}
