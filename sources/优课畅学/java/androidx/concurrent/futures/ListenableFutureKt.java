package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.C9155c;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class ListenableFutureKt {
    public static final <T> Object await(final ListenableFuture<T> listenableFuture, InterfaceC9324c<? super T> interfaceC9324c) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return AbstractResolvableFuture.getUninterruptibly(listenableFuture);
            }
            C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
            c9155c.m16343D();
            listenableFuture.addListener(new ToContinuation(listenableFuture, c9155c), DirectExecutor.INSTANCE);
            c9155c.mo14873r(new InterfaceC10570l() { // from class: androidx.concurrent.futures.ListenableFutureKt$await$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C8736p.f16368a;
                }

                public final void invoke(Throwable th) {
                    listenableFuture.cancel(false);
                }
            });
            Object objM16372x = c9155c.m16372x();
            if (objM16372x == AbstractC9434a.m17291f()) {
                AbstractC9541f.m17811c(interfaceC9324c);
            }
            return objM16372x;
        } catch (ExecutionException e10) {
            throw nonNullCause(e10);
        }
    }

    public static final Throwable nonNullCause(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        AbstractC9133u.m16130d(cause);
        return cause;
    }
}
