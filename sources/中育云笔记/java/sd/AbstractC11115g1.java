package sd;

import java.util.concurrent.Executor;

/* renamed from: sd.g1 */
/* loaded from: classes6.dex */
public abstract class AbstractC11115g1 {
    /* renamed from: a */
    public static final Executor m24720a(AbstractC11106e0 abstractC11106e0) {
        Executor executorMo24697i;
        AbstractC11107e1 abstractC11107e1 = abstractC11106e0 instanceof AbstractC11107e1 ? (AbstractC11107e1) abstractC11106e0 : null;
        return (abstractC11107e1 == null || (executorMo24697i = abstractC11107e1.mo24697i()) == null) ? new ExecutorC11154q0(abstractC11106e0) : executorMo24697i;
    }

    /* renamed from: b */
    public static final AbstractC11106e0 m24721b(Executor executor) {
        AbstractC11106e0 abstractC11106e0;
        ExecutorC11154q0 executorC11154q0 = executor instanceof ExecutorC11154q0 ? (ExecutorC11154q0) executor : null;
        return (executorC11154q0 == null || (abstractC11106e0 = executorC11154q0.f26813c) == null) ? new C11111f1(executor) : abstractC11106e0;
    }
}
