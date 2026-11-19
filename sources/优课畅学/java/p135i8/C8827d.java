package p135i8;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.AbstractC9152a;

/* renamed from: i8.d */
/* loaded from: classes5.dex */
public final class C8827d extends AbstractC9152a {

    /* renamed from: d */
    public final Thread f16496d;

    /* renamed from: e */
    public final AbstractC8861o0 f16497e;

    public C8827d(InterfaceC9100d interfaceC9100d, Thread thread, AbstractC8861o0 abstractC8861o0) {
        super(interfaceC9100d, true, true);
        this.f16496d = thread;
        this.f16497e = abstractC8861o0;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: B */
    public void mo14824B(Object obj) {
        if (AbstractC9133u.m16128b(Thread.currentThread(), this.f16496d)) {
            return;
        }
        Thread thread = this.f16496d;
        AbstractC8821b.m14804a();
        LockSupport.unpark(thread);
    }

    /* renamed from: K0 */
    public final Object m14825K0() throws Throwable {
        AbstractC8821b.m14804a();
        try {
            AbstractC8861o0 abstractC8861o0 = this.f16497e;
            if (abstractC8861o0 != null) {
                AbstractC8861o0.m14886v(abstractC8861o0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC8861o0 abstractC8861o02 = this.f16497e;
                    long jMo14895y = abstractC8861o02 != null ? abstractC8861o02.mo14895y() : Long.MAX_VALUE;
                    if (mo16289l()) {
                        AbstractC8861o0 abstractC8861o03 = this.f16497e;
                        if (abstractC8861o03 != null) {
                            AbstractC8861o0.m14885m(abstractC8861o03, false, 1, null);
                        }
                        AbstractC8821b.m14804a();
                        Object objM14841h = AbstractC8832e1.m14841h(m16276X());
                        C8884w c8884w = objM14841h instanceof C8884w ? (C8884w) objM14841h : null;
                        if (c8884w == null) {
                            return objM14841h;
                        }
                        throw c8884w.f16545a;
                    }
                    AbstractC8821b.m14804a();
                    LockSupport.parkNanos(this, jMo14895y);
                } catch (Throwable th) {
                    AbstractC8861o0 abstractC8861o04 = this.f16497e;
                    if (abstractC8861o04 != null) {
                        AbstractC8861o0.m14885m(abstractC8861o04, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            m16259E(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractC8821b.m14804a();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: e0 */
    public boolean mo14826e0() {
        return true;
    }
}
