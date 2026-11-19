package androidx.paging;

import androidx.paging.PageFetcherSnapshot$pageEventFlow$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1", m13596f = "PageFetcherSnapshot.kt", m13597i = {}, m13598l = {95}, m13599m = "emit", m13600n = {}, m13601s = {})
/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageFetcherSnapshot$pageEventFlow$1.C42492.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1(PageFetcherSnapshot$pageEventFlow$1.C42492.AnonymousClass1<? super T> anonymousClass1, Continuation<? super PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((PageEvent) null, (Continuation<? super Unit>) this);
    }
}
