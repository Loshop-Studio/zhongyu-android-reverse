package androidx.paging;

import androidx.paging.FlowExtKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.paging.FlowExtKt$simpleScan$1$1", m13596f = "FlowExt.kt", m13597i = {0}, m13598l = {56, 57}, m13599m = "emit", m13600n = {"this"}, m13601s = {"L$0"})
/* loaded from: classes3.dex */
public final class FlowExtKt$simpleScan$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowExtKt.C42181.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowExtKt$simpleScan$1$1$emit$1(FlowExtKt.C42181.AnonymousClass1<? super T> anonymousClass1, Continuation<? super FlowExtKt$simpleScan$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
