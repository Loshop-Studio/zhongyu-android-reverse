package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.AbstractC9208j;
import p135i8.AbstractC8821b;
import p135i8.AbstractC8861o0;

/* renamed from: kotlinx.coroutines.k */
/* loaded from: classes5.dex */
public abstract class AbstractC9209k extends AbstractC8861o0 {
    /* renamed from: B */
    public abstract Thread mo14831B();

    /* renamed from: C */
    public void mo16560C(long j10, AbstractC9208j.c cVar) {
        RunnableC9166f.f17681g.m16764P(j10, cVar);
    }

    /* renamed from: D */
    public final void m16774D() {
        Thread threadMo14831B = mo14831B();
        if (Thread.currentThread() != threadMo14831B) {
            AbstractC8821b.m14804a();
            LockSupport.unpark(threadMo14831B);
        }
    }
}
