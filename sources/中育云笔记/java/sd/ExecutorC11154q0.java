package sd;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import p410xd.AbstractC11850i;

/* renamed from: sd.q0 */
/* loaded from: classes6.dex */
public final class ExecutorC11154q0 implements Executor {

    /* renamed from: c */
    public final AbstractC11106e0 f26813c;

    public ExecutorC11154q0(AbstractC11106e0 abstractC11106e0) {
        this.f26813c = abstractC11106e0;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        AbstractC11106e0 abstractC11106e0 = this.f26813c;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f23351c;
        if (AbstractC11850i.m26280d(abstractC11106e0, emptyCoroutineContext)) {
            AbstractC11850i.m26279c(this.f26813c, emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f26813c.toString();
    }
}
