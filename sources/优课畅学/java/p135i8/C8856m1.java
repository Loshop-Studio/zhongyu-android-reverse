package p135i8;

import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlinx.coroutines.C9155c;

/* renamed from: i8.m1 */
/* loaded from: classes5.dex */
public final class C8856m1 extends AbstractC8829d1 {

    /* renamed from: e */
    public final C9155c f16523e;

    public C8856m1(C9155c c9155c) {
        this.f16523e = c9155c;
    }

    @Override // kotlinx.coroutines.InterfaceC9211m
    /* renamed from: a */
    public void mo14884a(Throwable th) {
        Object objM16276X = m14829t().m16276X();
        if (objM16276X instanceof C8884w) {
            C9155c c9155c = this.f16523e;
            Result.C9076a c9076a = Result.f17350b;
            c9155c.resumeWith(Result.m15909b(AbstractC9079b.m15925a(((C8884w) objM16276X).f16545a)));
        } else {
            C9155c c9155c2 = this.f16523e;
            Result.C9076a c9076a2 = Result.f17350b;
            c9155c2.resumeWith(Result.m15909b(AbstractC8832e1.m14841h(objM16276X)));
        }
    }
}
