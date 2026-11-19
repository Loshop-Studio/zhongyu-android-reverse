package sd;

import kotlin.Result;
import p309qc.C10786q;
import vc.InterfaceC11588c;

/* renamed from: sd.z1 */
/* loaded from: classes6.dex */
public final class C11182z1 extends AbstractC11151p1 {

    /* renamed from: g */
    public final InterfaceC11588c f26851g;

    public C11182z1(InterfaceC11588c interfaceC11588c) {
        this.f26851g = interfaceC11588c;
    }

    @Override // sd.AbstractC11151p1
    /* renamed from: u */
    public boolean mo20468u() {
        return false;
    }

    @Override // sd.AbstractC11151p1
    /* renamed from: v */
    public void mo20469v(Throwable th) {
        InterfaceC11588c interfaceC11588c = this.f26851g;
        Result.C9921a c9921a = Result.f23263d;
        interfaceC11588c.resumeWith(Result.m20054c(C10786q.f26013a));
    }
}
