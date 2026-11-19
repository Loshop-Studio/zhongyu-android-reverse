package p440zd;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import p265nd.AbstractC10410o;
import p410xd.AbstractC11841d0;
import p410xd.AbstractC11845f0;
import sd.AbstractC11106e0;
import sd.AbstractC11107e1;

/* renamed from: zd.a */
/* loaded from: classes6.dex */
public final class ExecutorC12040a extends AbstractC11107e1 implements Executor {

    /* renamed from: d */
    public static final ExecutorC12040a f28413d = new ExecutorC12040a();

    /* renamed from: e */
    public static final AbstractC11106e0 f28414e = AbstractC11106e0.limitedParallelism$default(C12049j.f28431c, AbstractC11845f0.m26265e("kotlinx.coroutines.io.parallelism", AbstractC10410o.m21752e(64, AbstractC11841d0.m26249a()), 0, 0, 12, null), null, 2, null);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // sd.AbstractC11106e0
    public void dispatch(InterfaceC9945d interfaceC9945d, Runnable runnable) {
        f28414e.dispatch(interfaceC9945d, runnable);
    }

    @Override // sd.AbstractC11106e0
    public void dispatchYield(InterfaceC9945d interfaceC9945d, Runnable runnable) {
        f28414e.dispatchYield(interfaceC9945d, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        dispatch(EmptyCoroutineContext.f23351c, runnable);
    }

    @Override // sd.AbstractC11106e0
    public AbstractC11106e0 limitedParallelism(int i10, String str) {
        return C12049j.f28431c.limitedParallelism(i10, str);
    }

    @Override // sd.AbstractC11106e0
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // sd.AbstractC11107e1
    /* renamed from: i */
    public Executor mo24697i() {
        return this;
    }
}
