package p135i8;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* renamed from: i8.h0 */
/* loaded from: classes5.dex */
public final class ExecutorC8840h0 implements Executor {

    /* renamed from: a */
    public final CoroutineDispatcher f16511a;

    public ExecutorC8840h0(CoroutineDispatcher coroutineDispatcher) {
        this.f16511a = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        CoroutineDispatcher coroutineDispatcher = this.f16511a;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f17438a;
        if (coroutineDispatcher.isDispatchNeeded(emptyCoroutineContext)) {
            this.f16511a.dispatch(emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f16511a.toString();
    }
}
