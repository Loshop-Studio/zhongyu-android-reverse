package p135i8;

import java.util.concurrent.Executor;
import kotlinx.coroutines.C9210l;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* renamed from: i8.s0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8873s0 {
    /* renamed from: a */
    public static final Executor m14907a(CoroutineDispatcher coroutineDispatcher) {
        Executor executorMo16230i;
        ExecutorCoroutineDispatcher executorCoroutineDispatcher = coroutineDispatcher instanceof ExecutorCoroutineDispatcher ? (ExecutorCoroutineDispatcher) coroutineDispatcher : null;
        return (executorCoroutineDispatcher == null || (executorMo16230i = executorCoroutineDispatcher.mo16230i()) == null) ? new ExecutorC8840h0(coroutineDispatcher) : executorMo16230i;
    }

    /* renamed from: b */
    public static final CoroutineDispatcher m14908b(Executor executor) {
        CoroutineDispatcher coroutineDispatcher;
        ExecutorC8840h0 executorC8840h0 = executor instanceof ExecutorC8840h0 ? (ExecutorC8840h0) executor : null;
        return (executorC8840h0 == null || (coroutineDispatcher = executorC8840h0.f16511a) == null) ? new C9210l(executor) : coroutineDispatcher;
    }
}
