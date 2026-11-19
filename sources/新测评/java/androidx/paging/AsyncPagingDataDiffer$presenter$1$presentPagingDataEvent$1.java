package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.paging.AsyncPagingDataDiffer$presenter$1", m13596f = "AsyncPagingDataDiffer.kt", m13597i = {0, 0}, m13598l = {183}, m13599m = "presentPagingDataEvent", m13600n = {"this", "$this$presentPagingDataEvent_u24lambda_u240"}, m13601s = {"L$0", "L$3"})
/* loaded from: classes3.dex */
public final class AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AsyncPagingDataDiffer$presenter$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1(AsyncPagingDataDiffer$presenter$1 asyncPagingDataDiffer$presenter$1, Continuation continuation) {
        super(continuation);
        this.this$0 = asyncPagingDataDiffer$presenter$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.presentPagingDataEvent(null, this);
    }
}
