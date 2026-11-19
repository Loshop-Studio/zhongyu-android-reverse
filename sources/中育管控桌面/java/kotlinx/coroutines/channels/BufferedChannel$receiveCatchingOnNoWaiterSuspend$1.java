package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 1, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "kotlinx.coroutines.channels.BufferedChannel", m7918f = "BufferedChannel.kt", m7919i = {0, 0, 0, 0}, m7920l = {3117}, m7921m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", m7922n = {"this", "segment", "index", "r"}, m7923s = {"L$0", "L$1", "I$0", "J$0"})
/* loaded from: classes4.dex */
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
        Object objM18662receiveCatchingOnNoWaiterSuspendGKJJFZk = this.this$0.m18662receiveCatchingOnNoWaiterSuspendGKJJFZk(null, 0, 0L, this);
        return objM18662receiveCatchingOnNoWaiterSuspendGKJJFZk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM18662receiveCatchingOnNoWaiterSuspendGKJJFZk : ChannelResult.m18671boximpl(objM18662receiveCatchingOnNoWaiterSuspendGKJJFZk);
    }
}
