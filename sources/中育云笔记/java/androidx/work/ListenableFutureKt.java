package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import sd.AbstractC11117h;

/* loaded from: classes3.dex */
public final class ListenableFutureKt {
    public static final <V> ListenableFuture<V> executeAsync(final Executor executor, final String debugTag, final InterfaceC9529a block) {
        AbstractC9979u.m20294g(executor, "<this>");
        AbstractC9979u.m20294g(debugTag, "debugTag");
        AbstractC9979u.m20294g(block, "block");
        ListenableFuture<V> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.work.a
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return ListenableFutureKt.executeAsync$lambda$4(executor, debugTag, block, completer);
            }
        });
        AbstractC9979u.m20293f(future, "getFuture { completer ->… }\n        debugTag\n    }");
        return future;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object executeAsync$lambda$4(Executor executor, String str, final InterfaceC9529a interfaceC9529a, final CallbackToFutureAdapter.Completer completer) {
        AbstractC9979u.m20294g(completer, "completer");
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
                ListenableFutureKt.executeAsync$lambda$4$lambda$3(atomicBoolean, completer, interfaceC9529a);
            }
        });
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeAsync$lambda$4$lambda$3(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, InterfaceC9529a interfaceC9529a) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            completer.set(interfaceC9529a.invoke());
        } catch (Throwable th) {
            completer.setException(th);
        }
    }

    public static final <T> ListenableFuture<T> launchFuture(final InterfaceC9945d context, final CoroutineStart start, final InterfaceC9544p block) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(start, "start");
        AbstractC9979u.m20294g(block, "block");
        ListenableFuture<T> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.work.b
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return ListenableFutureKt.launchFuture$lambda$1(context, start, block, completer);
            }
        });
        AbstractC9979u.m20293f(future, "getFuture { completer ->…owable)\n        }\n    }\n}");
        return future;
    }

    public static /* synthetic */ ListenableFuture launchFuture$default(InterfaceC9945d interfaceC9945d, CoroutineStart coroutineStart, InterfaceC9544p interfaceC9544p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9945d = EmptyCoroutineContext.f23351c;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.f23476c;
        }
        return launchFuture(interfaceC9945d, coroutineStart, interfaceC9544p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object launchFuture$lambda$1(InterfaceC9945d interfaceC9945d, CoroutineStart coroutineStart, InterfaceC9544p interfaceC9544p, CallbackToFutureAdapter.Completer completer) {
        AbstractC9979u.m20294g(completer, "completer");
        final InterfaceC10045g interfaceC10045g = (InterfaceC10045g) interfaceC9945d.get(InterfaceC10045g.f23976b0);
        completer.addCancellationListener(new Runnable() { // from class: androidx.work.e
            @Override // java.lang.Runnable
            public final void run() {
                ListenableFutureKt.launchFuture$lambda$1$lambda$0(interfaceC10045g);
            }
        }, DirectExecutor.INSTANCE);
        return AbstractC11117h.m24726d(AbstractC10006d.m20744a(interfaceC9945d), null, coroutineStart, new ListenableFutureKt$launchFuture$1$2(interfaceC9544p, completer, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchFuture$lambda$1$lambda$0(InterfaceC10045g interfaceC10045g) {
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
    }
}
