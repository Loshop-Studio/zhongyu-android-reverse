package p213p8;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import p077d8.AbstractC8323h;
import p191n8.AbstractC9444e0;
import p191n8.AbstractC9448g0;

/* renamed from: p8.a */
/* loaded from: classes5.dex */
public final class ExecutorC9761a extends ExecutorCoroutineDispatcher implements Executor {

    /* renamed from: b */
    public static final ExecutorC9761a f19482b = new ExecutorC9761a();

    /* renamed from: c */
    public static final CoroutineDispatcher f19483c = C9772l.f19503a.limitedParallelism(AbstractC9448g0.m17337e("kotlinx.coroutines.io.parallelism", AbstractC8323h.m13510e(64, AbstractC9444e0.m17321a()), 0, 0, 12, null));

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(InterfaceC9100d interfaceC9100d, Runnable runnable) {
        f19483c.dispatch(interfaceC9100d, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(InterfaceC9100d interfaceC9100d, Runnable runnable) {
        f19483c.dispatchYield(interfaceC9100d, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        dispatch(EmptyCoroutineContext.f17438a, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i10) {
        return C9772l.f19503a.limitedParallelism(i10);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    /* renamed from: i */
    public Executor mo16230i() {
        return this;
    }
}
