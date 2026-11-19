package coil3.intercept;

import coil3.AbstractC5168b;
import coil3.intercept.InterfaceC5200a;
import java.util.List;
import p290y.C9886e;
import p290y.C9890i;
import p300z.C9958e;

/* loaded from: classes3.dex */
public final class RealInterceptorChain implements InterfaceC5200a.a {

    /* renamed from: a */
    public final C9886e f3111a;

    /* renamed from: b */
    public final List f3112b;

    /* renamed from: c */
    public final int f3113c;

    /* renamed from: d */
    public final C9886e f3114d;

    /* renamed from: e */
    public final C9958e f3115e;

    /* renamed from: f */
    public final AbstractC5168b f3116f;

    /* renamed from: g */
    public final boolean f3117g;

    public RealInterceptorChain(C9886e c9886e, List list, int i10, C9886e c9886e2, C9958e c9958e, AbstractC5168b abstractC5168b, boolean z9) {
        this.f3111a = c9886e;
        this.f3112b = list;
        this.f3113c = i10;
        this.f3114d = c9886e2;
        this.f3115e = c9958e;
        this.f3116f = abstractC5168b;
        this.f3117g = z9;
    }

    /* renamed from: f */
    public static /* synthetic */ RealInterceptorChain m3094f(RealInterceptorChain realInterceptorChain, int i10, C9886e c9886e, C9958e c9958e, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = realInterceptorChain.f3113c;
        }
        if ((i11 & 2) != 0) {
            c9886e = realInterceptorChain.mo3095a();
        }
        if ((i11 & 4) != 0) {
            c9958e = realInterceptorChain.getSize();
        }
        return realInterceptorChain.m3099e(i10, c9886e, c9958e);
    }

    @Override // coil3.intercept.InterfaceC5200a.a
    /* renamed from: a */
    public C9886e mo3095a() {
        return this.f3114d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.intercept.InterfaceC5200a.a
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo3096b(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof coil3.intercept.RealInterceptorChain$proceed$1
            if (r0 == 0) goto L13
            r0 = r12
            coil3.intercept.RealInterceptorChain$proceed$1 r0 = (coil3.intercept.RealInterceptorChain$proceed$1) r0
            int r1 = r0.f3122e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3122e = r1
            goto L18
        L13:
            coil3.intercept.RealInterceptorChain$proceed$1 r0 = new coil3.intercept.RealInterceptorChain$proceed$1
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f3120c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f3122e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f3119b
            coil3.intercept.RealInterceptorChain r1 = (coil3.intercept.RealInterceptorChain) r1
            java.lang.Object r0 = r0.f3118a
            coil3.intercept.a r0 = (coil3.intercept.InterfaceC5200a) r0
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
            java.util.List r12 = r11.f3112b
            int r2 = r11.f3113c
            java.lang.Object r12 = r12.get(r2)
            coil3.intercept.a r12 = (coil3.intercept.InterfaceC5200a) r12
            int r2 = r11.f3113c
            int r5 = r2 + 1
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4 = r11
            coil3.intercept.RealInterceptorChain r2 = m3094f(r4, r5, r6, r7, r8, r9)
            r0.f3118a = r12
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r0.f3119b = r5
            r0.f3122e = r3
            java.lang.Object r0 = r12.mo3083a(r2, r0)
            if (r0 != r1) goto L65
            return r1
        L65:
            r10 = r0
            r0 = r12
            r12 = r10
        L68:
            y.h r12 = (p290y.InterfaceC9889h) r12
            y.e r1 = r12.mo16611a()
            r11.m3098d(r1, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.RealInterceptorChain.mo3096b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // coil3.intercept.InterfaceC5200a.a
    /* renamed from: c */
    public InterfaceC5200a.a mo3097c(C9886e c9886e) {
        int i10 = this.f3113c;
        if (i10 > 0) {
            m3098d(c9886e, (InterfaceC5200a) this.f3112b.get(i10 - 1));
        }
        return m3094f(this, 0, c9886e, null, 5, null);
    }

    /* renamed from: d */
    public final void m3098d(C9886e c9886e, InterfaceC5200a interfaceC5200a) {
        if (c9886e.m16617c() != this.f3111a.m16617c()) {
            throw new IllegalStateException(("Interceptor '" + interfaceC5200a + "' cannot modify the request's context.").toString());
        }
        if (c9886e.m16618d() == C9890i.f17613a) {
            throw new IllegalStateException(("Interceptor '" + interfaceC5200a + "' cannot set the request's data to null.").toString());
        }
        if (c9886e.m16639y() != this.f3111a.m16639y()) {
            throw new IllegalStateException(("Interceptor '" + interfaceC5200a + "' cannot modify the request's target.").toString());
        }
        if (c9886e.m16638x() == this.f3111a.m16638x()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + interfaceC5200a + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* renamed from: e */
    public final RealInterceptorChain m3099e(int i10, C9886e c9886e, C9958e c9958e) {
        return new RealInterceptorChain(this.f3111a, this.f3112b, i10, c9886e, c9958e, this.f3116f, this.f3117g);
    }

    /* renamed from: g */
    public final AbstractC5168b m3100g() {
        return this.f3116f;
    }

    @Override // coil3.intercept.InterfaceC5200a.a
    public C9958e getSize() {
        return this.f3115e;
    }

    /* renamed from: h */
    public final boolean m3101h() {
        return this.f3117g;
    }
}
