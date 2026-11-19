package p068g7;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC5990p0;
import kotlinx.coroutines.AbstractC5995r;
import p054e7.AbstractC5469a;
import p054e7.AbstractC5487s;
import p075h6.InterfaceC5636h;

/* renamed from: g7.d */
/* loaded from: classes4.dex */
public final class ExecutorC5608d extends AbstractC5990p0 implements Executor {

    /* renamed from: a */
    public static final ExecutorC5608d f8730a = new ExecutorC5608d();

    /* renamed from: b */
    public static final AbstractC5995r f8731b;

    static {
        C5616l c5616l = C5616l.f8744a;
        int i = AbstractC5487s.f8482a;
        if (64 >= i) {
            i = 64;
        }
        f8731b = AbstractC5995r.limitedParallelism$default(c5616l, AbstractC5469a.m4836l(i, 12, "kotlinx.coroutines.io.parallelism"), null, 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final void dispatch(InterfaceC5636h interfaceC5636h, Runnable runnable) {
        f8731b.dispatch(interfaceC5636h, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final void dispatchYield(InterfaceC5636h interfaceC5636h, Runnable runnable) {
        f8731b.dispatchYield(interfaceC5636h, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final AbstractC5995r limitedParallelism(int i, String str) {
        return C5616l.f8744a.limitedParallelism(i, str);
    }

    @Override // kotlinx.coroutines.AbstractC5995r
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // kotlinx.coroutines.AbstractC5990p0
    /* renamed from: d */
    public final Executor mo4933d() {
        return this;
    }
}
