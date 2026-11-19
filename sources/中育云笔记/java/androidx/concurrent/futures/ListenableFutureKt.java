package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class ListenableFutureKt {
    public static final <T> Object await(final ListenableFuture<T> listenableFuture, InterfaceC11588c<? super T> interfaceC11588c) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return AbstractResolvableFuture.getUninterruptibly(listenableFuture);
            }
            C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
            c9997c.m20503F();
            listenableFuture.addListener(new ToContinuation(listenableFuture, c9997c), DirectExecutor.INSTANCE);
            c9997c.mo20536u(new InterfaceC9540l() { // from class: androidx.concurrent.futures.ListenableFutureKt$await$2$1
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

    public static final Throwable nonNullCause(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        AbstractC9979u.m20291d(cause);
        return cause;
    }
}
