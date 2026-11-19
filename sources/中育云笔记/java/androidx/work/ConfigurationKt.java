package androidx.work;

import androidx.tracing.Trace;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.InterfaceC9944c;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import sd.AbstractC11106e0;
import sd.AbstractC11115g1;

/* loaded from: classes3.dex */
public final class ConfigurationKt {
    public static final int DEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor asExecutor(InterfaceC9945d interfaceC9945d) {
        InterfaceC9944c interfaceC9944c = interfaceC9945d != null ? (InterfaceC9944c) interfaceC9945d.get(InterfaceC9944c.f23354a0) : null;
        AbstractC11106e0 abstractC11106e0 = interfaceC9944c instanceof AbstractC11106e0 ? (AbstractC11106e0) interfaceC9944c : null;
        if (abstractC11106e0 != null) {
            return AbstractC11115g1.m24720a(abstractC11106e0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor createDefaultExecutor(final boolean z10) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() { // from class: androidx.work.ConfigurationKt$createDefaultExecutor$factory$1
            private final AtomicInteger threadCount = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                AbstractC9979u.m20294g(runnable, "runnable");
                return new Thread(runnable, (z10 ? "WM.task-" : "androidx.work-") + this.threadCount.incrementAndGet());
            }
        });
        AbstractC9979u.m20293f(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorServiceNewFixedThreadPool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tracer createDefaultTracer() {
        return new Tracer() { // from class: androidx.work.ConfigurationKt$createDefaultTracer$tracer$1
            @Override // androidx.work.Tracer
            public void beginAsyncSection(String methodName, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                AbstractC9979u.m20294g(methodName, "methodName");
                Trace.beginAsyncSection(methodName, i10);
            }

            @Override // androidx.work.Tracer
            public void beginSection(String label) {
                AbstractC9979u.m20294g(label, "label");
                Trace.beginSection(label);
            }

            @Override // androidx.work.Tracer
            public void endAsyncSection(String methodName, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                AbstractC9979u.m20294g(methodName, "methodName");
                Trace.endAsyncSection(methodName, i10);
            }

            @Override // androidx.work.Tracer
            public void endSection() {
                Trace.endSection();
            }

            @Override // androidx.work.Tracer
            public boolean isEnabled() {
                return Trace.isEnabled();
            }
        };
    }
}
