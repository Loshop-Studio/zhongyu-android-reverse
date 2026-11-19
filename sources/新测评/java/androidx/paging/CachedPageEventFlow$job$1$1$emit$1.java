package androidx.paging;

import androidx.paging.CachedPageEventFlow$job$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.paging.CachedPageEventFlow$job$1$1", m13596f = "CachedPageEventFlow.kt", m13597i = {0, 0}, m13598l = {77, 78}, m13599m = "emit", m13600n = {"this", "it"}, m13601s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class CachedPageEventFlow$job$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CachedPageEventFlow$job$1.C42011<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CachedPageEventFlow$job$1$1$emit$1(CachedPageEventFlow$job$1.C42011<? super T> c42011, Continuation<? super CachedPageEventFlow$job$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = c42011;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((IndexedValue) null, (Continuation<? super Unit>) this);
    }
}
