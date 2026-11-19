package androidx.paging;

import androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 176)
@DebugMetadata(m13595c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1$1", m13596f = "FlowExt.kt", m13597i = {}, m13598l = {148, 151}, m13599m = "emit", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1\n*L\n1#1,224:1\n*E\n"})
/* loaded from: classes3.dex */
public final class FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowExtKt$combineWithoutBatching$2$1$1.C42141<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1(FlowExtKt$combineWithoutBatching$2$1$1.C42141<? super T> c42141, Continuation<? super FlowExtKt$combineWithoutBatching$2$1$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = c42141;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
