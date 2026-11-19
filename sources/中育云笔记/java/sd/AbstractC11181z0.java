package sd;

import java.util.concurrent.locks.LockSupport;
import sd.AbstractC11178y0;

/* renamed from: sd.z0 */
/* loaded from: classes6.dex */
public abstract class AbstractC11181z0 extends AbstractC11175x0 {
    /* renamed from: E */
    public abstract Thread mo24694E();

    /* renamed from: F */
    public void mo24741F(long j10, AbstractC11178y0.c cVar) {
        RunnableC11130k0.f26794i.m24842T(j10, cVar);
    }

    /* renamed from: G */
    public final void m24852G() {
        Thread threadMo24694E = mo24694E();
        if (Thread.currentThread() != threadMo24694E) {
            AbstractC11093b.m24675a();
            LockSupport.unpark(threadMo24694E);
        }
    }
}
