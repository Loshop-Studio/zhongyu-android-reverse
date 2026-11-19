package kotlinx.coroutines;

import p054e7.C5475g;

/* renamed from: kotlinx.coroutines.a1 */
/* loaded from: classes4.dex */
public final class C5865a1 extends AbstractC6017y0 {

    /* renamed from: e */
    public final C5871c1 f9277e;

    /* renamed from: f */
    public final C5868b1 f9278f;

    /* renamed from: g */
    public final C5974k f9279g;

    /* renamed from: h */
    public final Object f9280h;

    public C5865a1(C5871c1 c5871c1, C5868b1 c5868b1, C5974k c5974k, Object obj) {
        this.f9277e = c5871c1;
        this.f9278f = c5868b1;
        this.f9279g = c5974k;
        this.f9280h = obj;
    }

    @Override // kotlinx.coroutines.AbstractC6017y0
    /* renamed from: i */
    public final boolean mo5426i() {
        return false;
    }

    @Override // kotlinx.coroutines.AbstractC6017y0
    /* renamed from: j */
    public final void mo5427j(Throwable th) {
        C5974k c5974k = this.f9279g;
        C5974k c5974kM5433Q = C5871c1.m5433Q(c5974k);
        C5871c1 c5871c1 = this.f9277e;
        C5868b1 c5868b1 = this.f9278f;
        Object obj = this.f9280h;
        if (c5974kM5433Q == null || !c5871c1.m5455Z(c5868b1, c5974kM5433Q, obj)) {
            c5868b1.f9285a.m5590c(new C5475g(2), 2);
            C5974k c5974kM5433Q2 = C5871c1.m5433Q(c5974k);
            if (c5974kM5433Q2 == null || !c5871c1.m5455Z(c5868b1, c5974kM5433Q2, obj)) {
                c5871c1.mo4860s(c5871c1.m5437C(c5868b1, obj));
            }
        }
    }
}
