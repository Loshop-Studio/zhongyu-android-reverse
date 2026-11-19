package kotlinx.coroutines.channels;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "kotlinx.coroutines.channels.BufferedChannel", m13451f = "BufferedChannel.kt", m13452i = {0, 0, 0, 0}, m13453l = {3117}, m13454m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", m13455n = {"this", "segment", "index", "r"}, m13456s = {"L$0", "L$1", "I$0", "J$0"})
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
        Object objM26237receiveCatchingOnNoWaiterSuspendGKJJFZk = this.this$0.m26237receiveCatchingOnNoWaiterSuspendGKJJFZk(null, 0, 0L, this);
        return objM26237receiveCatchingOnNoWaiterSuspendGKJJFZk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM26237receiveCatchingOnNoWaiterSuspendGKJJFZk : ChannelResult.m26246boximpl(objM26237receiveCatchingOnNoWaiterSuspendGKJJFZk);
    }
}
