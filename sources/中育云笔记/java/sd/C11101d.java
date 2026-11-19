package sd;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC9995a;

/* renamed from: sd.d */
/* loaded from: classes6.dex */
public final class C11101d extends AbstractC9995a {

    /* renamed from: f */
    public final Thread f26775f;

    /* renamed from: g */
    public final AbstractC11175x0 f26776g;

    public C11101d(InterfaceC9945d interfaceC9945d, Thread thread, AbstractC11175x0 abstractC11175x0) {
        super(interfaceC9945d, true, true);
        this.f26775f = thread;
        this.f26776g = abstractC11175x0;
    }

    /* renamed from: J0 */
    public final Object m24693J0() throws Throwable {
        AbstractC11093b.m24675a();
        try {
            AbstractC11175x0 abstractC11175x0 = this.f26776g;
            if (abstractC11175x0 != null) {
                AbstractC11175x0.m24817u(abstractC11175x0, false, 1, null);
            }
            while (true) {
                try {
                    AbstractC11175x0 abstractC11175x02 = this.f26776g;
                    long jMo24818B = abstractC11175x02 != null ? abstractC11175x02.mo24818B() : Long.MAX_VALUE;
                    if (isCompleted()) {
                        break;
                    }
                    AbstractC11093b.m24675a();
                    LockSupport.parkNanos(this, jMo24818B);
                    if (Thread.interrupted()) {
                        m20410E(new InterruptedException());
                    }
                } catch (Throwable th) {
                    AbstractC11175x0 abstractC11175x03 = this.f26776g;
                    if (abstractC11175x03 != null) {
                        AbstractC11175x0.m24816j(abstractC11175x03, false, 1, null);
                    }
                    throw th;
                }
            }
            AbstractC11175x0 abstractC11175x04 = this.f26776g;
            if (abstractC11175x04 != null) {
                AbstractC11175x0.m24816j(abstractC11175x04, false, 1, null);
            }
            AbstractC11093b.m24675a();
            Object objM24797h = AbstractC11155q1.m24797h(m20430X());
            C11174x c11174x = objM24797h instanceof C11174x ? (C11174x) objM24797h : null;
            if (c11174x == null) {
                return objM24797h;
            }
            throw c11174x.f26837a;
        } catch (Throwable th2) {
            AbstractC11093b.m24675a();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: e0 */
    public boolean mo20435e0() {
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: w */
    public void mo20460w(Object obj) {
        if (AbstractC9979u.m20289b(Thread.currentThread(), this.f26775f)) {
            return;
        }
        Thread thread = this.f26775f;
        AbstractC11093b.m24675a();
        LockSupport.unpark(thread);
    }
}
