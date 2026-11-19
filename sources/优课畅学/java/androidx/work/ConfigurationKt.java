package androidx.work;

import androidx.tracing.Trace;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.InterfaceC9099c;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineDispatcher;
import p135i8.AbstractC8873s0;

/* loaded from: classes3.dex */
public final class ConfigurationKt {
    public static final int DEFAULT_CONTENT_URI_TRIGGERS_WORKERS_LIMIT = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor asExecutor(InterfaceC9100d interfaceC9100d) {
        InterfaceC9099c interfaceC9099c = interfaceC9100d != null ? (InterfaceC9099c) interfaceC9100d.get(InterfaceC9099c.f17441b0) : null;
        CoroutineDispatcher coroutineDispatcher = interfaceC9099c instanceof CoroutineDispatcher ? (CoroutineDispatcher) interfaceC9099c : null;
        if (coroutineDispatcher != null) {
            return AbstractC8873s0.m14907a(coroutineDispatcher);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor createDefaultExecutor(final boolean z10) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactory() { // from class: androidx.work.ConfigurationKt$createDefaultExecutor$factory$1
            private final AtomicInteger threadCount = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                AbstractC9133u.m16133g(runnable, "runnable");
                return new Thread(runnable, (z10 ? "WM.task-" : "androidx.work-") + this.threadCount.incrementAndGet());
            }
        });
        AbstractC9133u.m16132f(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorServiceNewFixedThreadPool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tracer createDefaultTracer() {
        return new Tracer() { // from class: androidx.work.ConfigurationKt$createDefaultTracer$tracer$1
            @Override // androidx.work.Tracer
            public void beginAsyncSection(String methodName, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                AbstractC9133u.m16133g(methodName, "methodName");
                Trace.beginAsyncSection(methodName, i10);
            }

            @Override // androidx.work.Tracer
            public void beginSection(String label) {
                AbstractC9133u.m16133g(label, "label");
                Trace.beginSection(label);
            }

            @Override // androidx.work.Tracer
            public void endAsyncSection(String methodName, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                AbstractC9133u.m16133g(methodName, "methodName");
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
