package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {2, 1, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "kotlinx.coroutines.channels.BufferedChannel", m13596f = "BufferedChannel.kt", m13597i = {0, 0, 0, 0}, m13598l = {3117}, m13599m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", m13600n = {"this", "segment", "index", "r"}, m13601s = {"L$0", "L$1", "I$0", "J$0"})
/* loaded from: classes5.dex */
public final class BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(BufferedChannel<E> bufferedChannel, Continuation<? super BufferedChannel$receiveCatchingOnNoWaiterSuspend$1> continuation) {
        super(continuation);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM25778receiveCatchingOnNoWaiterSuspendGKJJFZk = this.this$0.m25778receiveCatchingOnNoWaiterSuspendGKJJFZk(null, 0, 0L, this);
        return objM25778receiveCatchingOnNoWaiterSuspendGKJJFZk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM25778receiveCatchingOnNoWaiterSuspendGKJJFZk : ChannelResult.m25787boximpl(objM25778receiveCatchingOnNoWaiterSuspendGKJJFZk);
    }
}
