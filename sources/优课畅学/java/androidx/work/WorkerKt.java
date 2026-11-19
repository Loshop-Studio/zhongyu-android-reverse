package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class WorkerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> ListenableFuture<T> future(final Executor executor, final InterfaceC10559a interfaceC10559a) {
        ListenableFuture<T> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.work.k
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return WorkerKt.future$lambda$2(executor, interfaceC10559a, completer);
            }
        });
        AbstractC9133u.m16132f(future, "getFuture {\n        val …        }\n        }\n    }");
        return future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p future$lambda$2(Executor executor, final InterfaceC10559a interfaceC10559a, final CallbackToFutureAdapter.Completer it) {
        AbstractC9133u.m16133g(it, "it");
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
                WorkerKt.future$lambda$2$lambda$1(atomicBoolean, it, interfaceC10559a);
            }
        });
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void future$lambda$2$lambda$1(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, InterfaceC10559a interfaceC10559a) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            completer.set(interfaceC10559a.invoke());
        } catch (Throwable th) {
            completer.setException(th);
        }
    }
}
