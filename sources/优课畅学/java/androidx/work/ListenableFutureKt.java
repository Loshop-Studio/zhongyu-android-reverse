package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.AbstractC9165e;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC9212n;
import p135i8.AbstractC8839h;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class ListenableFutureKt {
    public static final <V> ListenableFuture<V> executeAsync(final Executor executor, final String debugTag, final InterfaceC10559a block) {
        AbstractC9133u.m16133g(executor, "<this>");
        AbstractC9133u.m16133g(debugTag, "debugTag");
        AbstractC9133u.m16133g(block, "block");
        ListenableFuture<V> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.work.a
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return ListenableFutureKt.executeAsync$lambda$4(executor, debugTag, block, completer);
            }
        });
        AbstractC9133u.m16132f(future, "getFuture { completer ->… }\n        debugTag\n    }");
        return future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object executeAsync$lambda$4(Executor executor, String str, final InterfaceC10559a interfaceC10559a, final CallbackToFutureAdapter.Completer completer) {
        AbstractC9133u.m16133g(completer, "completer");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.addCancellationListener(new Runnable() { // from class: androidx.work.c
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(true);
            }
        }, DirectExecutor.INSTANCE);
        executor.execute(new Runnable() { // from class: androidx.work.d
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFutureKt.executeAsync$lambda$4$lambda$3(atomicBoolean, completer, interfaceC10559a);
            }
        });
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeAsync$lambda$4$lambda$3(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, InterfaceC10559a interfaceC10559a) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            completer.set(interfaceC10559a.invoke());
        } catch (Throwable th) {
            completer.setException(th);
        }
    }

    public static final <T> ListenableFuture<T> launchFuture(final InterfaceC9100d context, final CoroutineStart start, final InterfaceC10574p block) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(start, "start");
        AbstractC9133u.m16133g(block, "block");
        ListenableFuture<T> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.work.b
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return ListenableFutureKt.launchFuture$lambda$1(context, start, block, completer);
            }
        });
        AbstractC9133u.m16132f(future, "getFuture { completer ->…owable)\n        }\n    }\n}");
        return future;
    }

    public static /* synthetic */ ListenableFuture launchFuture$default(InterfaceC9100d interfaceC9100d, CoroutineStart coroutineStart, InterfaceC10574p interfaceC10574p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9100d = EmptyCoroutineContext.f17438a;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.f17552a;
        }
        return launchFuture(interfaceC9100d, coroutineStart, interfaceC10574p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object launchFuture$lambda$1(InterfaceC9100d interfaceC9100d, CoroutineStart coroutineStart, InterfaceC10574p interfaceC10574p, CallbackToFutureAdapter.Completer completer) {
        AbstractC9133u.m16133g(completer, "completer");
        final InterfaceC9212n interfaceC9212n = (InterfaceC9212n) interfaceC9100d.get(InterfaceC9212n.f18095c0);
        completer.addCancellationListener(new Runnable() { // from class: androidx.work.e
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFutureKt.launchFuture$lambda$1$lambda$0(interfaceC9212n);
            }
        }, DirectExecutor.INSTANCE);
        return AbstractC8839h.m14861d(AbstractC9165e.m16552a(interfaceC9100d), null, coroutineStart, new ListenableFutureKt$launchFuture$1$2(interfaceC10574p, completer, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchFuture$lambda$1$lambda$0(InterfaceC9212n interfaceC9212n) {
        if (interfaceC9212n != null) {
            InterfaceC9212n.a.m16777a(interfaceC9212n, null, 1, null);
        }
    }
}
