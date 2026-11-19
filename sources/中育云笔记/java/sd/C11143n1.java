package sd;

import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.JobSupport;
import p309qc.C10786q;

/* renamed from: sd.n1 */
/* loaded from: classes6.dex */
public class C11143n1 extends JobSupport implements InterfaceC11168v {

    /* renamed from: e */
    public final boolean f26807e;

    public C11143n1(InterfaceC10045g interfaceC10045g) {
        super(true);
        m20433c0(interfaceC10045g);
        this.f26807e = m24764F0();
    }

    /* renamed from: F0 */
    public final boolean m24764F0() {
        JobSupport jobSupportM24787t;
        InterfaceC11149p interfaceC11149pM20429W = m20429W();
        C11153q c11153q = interfaceC11149pM20429W instanceof C11153q ? (C11153q) interfaceC11149pM20429W : null;
        if (c11153q != null && (jobSupportM24787t = c11153q.m24787t()) != null) {
            while (!jobSupportM24787t.mo20425S()) {
                InterfaceC11149p interfaceC11149pM20429W2 = jobSupportM24787t.m20429W();
                C11153q c11153q2 = interfaceC11149pM20429W2 instanceof C11153q ? (C11153q) interfaceC11149pM20429W2 : null;
                if (c11153q2 == null || (jobSupportM24787t = c11153q2.m24787t()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: S */
    public boolean mo20425S() {
        return this.f26807e;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: T */
    public boolean mo20426T() {
        return true;
    }

    @Override // sd.InterfaceC11168v
    /* renamed from: a */
    public boolean mo24765a(Throwable th) {
        return m20441i0(new C11174x(th, false, 2, null));
    }

    @Override // sd.InterfaceC11168v
    public boolean complete() {
        return m20441i0(C10786q.f26013a);
    }
}
