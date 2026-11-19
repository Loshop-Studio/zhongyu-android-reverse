package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m7881k = 3, m7882mv = {2, 1, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "kotlinx.coroutines.channels.BufferedChannel", m7918f = "BufferedChannel.kt", m7919i = {}, m7920l = {759}, m7921m = "receiveCatching-JP2dKIU$suspendImpl", m7922n = {}, m7923s = {})
/* loaded from: classes4.dex */
public final class BufferedChannel$receiveCatching$1<E> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BufferedChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(BufferedChannel<E> bufferedChannel, Continuation<? super BufferedChannel$receiveCatching$1> continuation) {
        super(continuation);
        this.this$0 = bufferedChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM18661receiveCatchingJP2dKIU$suspendImpl = BufferedChannel.m18661receiveCatchingJP2dKIU$suspendImpl(this.this$0, this);
        return objM18661receiveCatchingJP2dKIU$suspendImpl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM18661receiveCatchingJP2dKIU$suspendImpl : ChannelResult.m18671boximpl(objM18661receiveCatchingJP2dKIU$suspendImpl);
    }
}
