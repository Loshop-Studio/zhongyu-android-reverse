package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.work.ListenableFutureKt$launchFuture$1$2", m26211f = "ListenableFuture.kt", m26212l = {42}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ListenableFutureKt$launchFuture$1$2 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC9544p $block;
    final /* synthetic */ CallbackToFutureAdapter.Completer<T> $completer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListenableFutureKt$launchFuture$1$2(InterfaceC9544p interfaceC9544p, CallbackToFutureAdapter.Completer<T> completer, InterfaceC11588c<? super ListenableFutureKt$launchFuture$1$2> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$block = interfaceC9544p;
        this.$completer = completer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        ListenableFutureKt$launchFuture$1$2 listenableFutureKt$launchFuture$1$2 = new ListenableFutureKt$launchFuture$1$2(this.$block, this.$completer, interfaceC11588c);
        listenableFutureKt$launchFuture$1$2.L$0 = obj;
        return listenableFutureKt$launchFuture$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                InterfaceC9544p interfaceC9544p = this.$block;
                this.label = 1;
                obj = interfaceC9544p.invoke(interfaceC11122i0, this);
                if (obj == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            this.$completer.set(obj);
        } catch (CancellationException unused) {
            this.$completer.setCancelled();
        } catch (Throwable th) {
            this.$completer.setException(th);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((ListenableFutureKt$launchFuture$1$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
