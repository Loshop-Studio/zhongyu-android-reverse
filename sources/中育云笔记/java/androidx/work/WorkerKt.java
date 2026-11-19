package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;

/* loaded from: classes3.dex */
public final class WorkerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> ListenableFuture<T> future(final Executor executor, final InterfaceC9529a interfaceC9529a) {
        ListenableFuture<T> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.work.k
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return WorkerKt.future$lambda$2(executor, interfaceC9529a, completer);
            }
        });
        AbstractC9979u.m20293f(future, "getFuture {\n        val …        }\n        }\n    }");
        return future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q future$lambda$2(Executor executor, final InterfaceC9529a interfaceC9529a, final CallbackToFutureAdapter.Completer it) {
        AbstractC9979u.m20294g(it, "it");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        it.addCancellationListener(new Runnable() { // from class: androidx.work.i
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(true);
            }
        }, DirectExecutor.INSTANCE);
        executor.execute(new Runnable() { // from class: androidx.work.j
            @Override // java.lang.Runnable
            public final void run() {
                WorkerKt.future$lambda$2$lambda$1(atomicBoolean, it, interfaceC9529a);
            }
        });
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void future$lambda$2$lambda$1(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, InterfaceC9529a interfaceC9529a) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            completer.set(interfaceC9529a.invoke());
        } catch (Throwable th) {
            completer.setException(th);
        }
    }
}
