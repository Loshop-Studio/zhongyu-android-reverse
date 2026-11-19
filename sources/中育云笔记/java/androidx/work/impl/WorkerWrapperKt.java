package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.DirectExecutor;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class WorkerWrapperKt {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("WorkerWrapper");
        AbstractC9979u.m20293f(strTagWithPrefix, "tagWithPrefix(\"WorkerWrapper\")");
        TAG = strTagWithPrefix;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> Object awaitWithin(final ListenableFuture<T> listenableFuture, final ListenableWorker listenableWorker, InterfaceC11588c<? super T> interfaceC11588c) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return getUninterruptibly(listenableFuture);
            }
            C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
            c9997c.m20503F();
            listenableFuture.addListener(new ToContinuation(listenableFuture, c9997c), DirectExecutor.INSTANCE);
            c9997c.mo20536u(new InterfaceC9540l() { // from class: androidx.work.impl.WorkerWrapperKt$awaitWithin$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(Throwable th) {
                    if (th instanceof WorkerStoppedException) {
                        listenableWorker.stop(((WorkerStoppedException) th).getReason());
                    }
                    listenableFuture.cancel(false);
                }
            });
            Object objM20538x = c9997c.m20538x();
            if (objM20538x == AbstractC11725a.m25952f()) {
                AbstractC11831f.m26221c(interfaceC11588c);
            }
            return objM20538x;
        } catch (ExecutionException e10) {
            throw nonNullCause(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V> V getUninterruptibly(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable nonNullCause(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        AbstractC9979u.m20291d(cause);
        return cause;
    }
}
