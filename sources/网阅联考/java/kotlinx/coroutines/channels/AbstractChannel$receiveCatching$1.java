package kotlinx.coroutines.channels;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m5176k = 3, m5177mv = {1, 6, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5191c = "kotlinx.coroutines.channels.AbstractChannel", m5192f = "AbstractChannel.kt", m5193i = {}, m5194l = {633}, m5195m = "receiveCatching-JP2dKIU", m5196n = {}, m5197s = {})
/* loaded from: classes2.dex */
public final class AbstractChannel$receiveCatching$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractChannel<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractChannel$receiveCatching$1(AbstractChannel<E> abstractChannel, Continuation<? super AbstractChannel$receiveCatching$1> continuation) {
        super(continuation);
        this.this$0 = abstractChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo13304receiveCatchingJP2dKIU = this.this$0.mo13304receiveCatchingJP2dKIU(this);
        return objMo13304receiveCatchingJP2dKIU == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo13304receiveCatchingJP2dKIU : ChannelResult.m13311boximpl(objMo13304receiveCatchingJP2dKIU);
    }
}
