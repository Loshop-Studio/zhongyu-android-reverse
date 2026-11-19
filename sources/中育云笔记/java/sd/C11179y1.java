package sd;

import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlinx.coroutines.C9997c;

/* renamed from: sd.y1 */
/* loaded from: classes6.dex */
public final class C11179y1 extends AbstractC11151p1 {

    /* renamed from: g */
    public final C9997c f26850g;

    public C11179y1(C9997c c9997c) {
        this.f26850g = c9997c;
    }

    @Override // sd.AbstractC11151p1
    /* renamed from: u */
    public boolean mo20468u() {
        return false;
    }

    @Override // sd.AbstractC11151p1
    /* renamed from: v */
    public void mo20469v(Throwable th) {
        Object objM20430X = m24787t().m20430X();
        if (objM20430X instanceof C11174x) {
            C9997c c9997c = this.f26850g;
            Result.C9921a c9921a = Result.f23263d;
            c9997c.resumeWith(Result.m20054c(AbstractC9924b.m20070a(((C11174x) objM20430X).f26837a)));
        } else {
            C9997c c9997c2 = this.f26850g;
            Result.C9921a c9921a2 = Result.f23263d;
            c9997c2.resumeWith(Result.m20054c(AbstractC11155q1.m24797h(objM20430X)));
        }
    }
}
