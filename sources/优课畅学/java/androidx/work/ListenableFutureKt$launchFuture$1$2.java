package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.work.ListenableFutureKt$launchFuture$1$2", m17801f = "ListenableFuture.kt", m17802l = {42}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ListenableFutureKt$launchFuture$1$2 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC10574p $block;
    final /* synthetic */ CallbackToFutureAdapter.Completer<T> $completer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListenableFutureKt$launchFuture$1$2(InterfaceC10574p interfaceC10574p, CallbackToFutureAdapter.Completer<T> completer, InterfaceC9324c<? super ListenableFutureKt$launchFuture$1$2> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$block = interfaceC10574p;
        this.$completer = completer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        ListenableFutureKt$launchFuture$1$2 listenableFutureKt$launchFuture$1$2 = new ListenableFutureKt$launchFuture$1$2(this.$block, this.$completer, interfaceC9324c);
        listenableFutureKt$launchFuture$1$2.L$0 = obj;
        return listenableFutureKt$launchFuture$1$2;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((ListenableFutureKt$launchFuture$1$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
                InterfaceC10574p interfaceC10574p = this.$block;
                this.label = 1;
                obj = interfaceC10574p.invoke(interfaceC8822b0, this);
                if (obj == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            this.$completer.set(obj);
        } catch (CancellationException unused) {
            this.$completer.setCancelled();
        } catch (Throwable th) {
            this.$completer.setException(th);
        }
        return C8736p.f16368a;
    }
}
