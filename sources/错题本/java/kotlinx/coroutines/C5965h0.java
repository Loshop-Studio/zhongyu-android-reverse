package kotlinx.coroutines;

import kotlin.AbstractC5774b;
import kotlin.Result;
import p152r6.InterfaceC6471c;

/* renamed from: kotlinx.coroutines.h0 */
/* loaded from: classes4.dex */
public final class C5965h0 extends AbstractC6017y0 {

    /* renamed from: e */
    public final /* synthetic */ int f9454e;

    /* renamed from: f */
    public final Object f9455f;

    public /* synthetic */ C5965h0(Object obj, int i) {
        this.f9454e = i;
        this.f9455f = obj;
    }

    @Override // kotlinx.coroutines.AbstractC6017y0
    /* renamed from: i */
    public final boolean mo5426i() {
        switch (this.f9454e) {
        }
        return false;
    }

    @Override // kotlinx.coroutines.AbstractC6017y0
    /* renamed from: j */
    public final void mo5427j(Throwable th) {
        switch (this.f9454e) {
            case 0:
                ((InterfaceC5962g0) this.f9455f).dispose();
                break;
            case 1:
                ((InterfaceC6471c) this.f9455f).invoke(th);
                break;
            default:
                C6019z0 c6019z0 = (C6019z0) this.f9455f;
                Object obj = C5871c1.f9288a.get(m5657h());
                if (!(obj instanceof C5989p)) {
                    c6019z0.resumeWith(Result.m13956constructorimpl(AbstractC6014x.m5624D(obj)));
                    break;
                } else {
                    c6019z0.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(((C5989p) obj).f9486a)));
                    break;
                }
        }
    }
}
