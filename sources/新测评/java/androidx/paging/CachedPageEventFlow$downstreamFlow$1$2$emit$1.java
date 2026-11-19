package androidx.paging;

import androidx.paging.CachedPageEventFlow$downstreamFlow$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$2", m13596f = "CachedPageEventFlow.kt", m13597i = {0, 0}, m13598l = {105}, m13599m = "emit", m13600n = {"this", "indexedValue"}, m13601s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class CachedPageEventFlow$downstreamFlow$1$2$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CachedPageEventFlow$downstreamFlow$1.C42002<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CachedPageEventFlow$downstreamFlow$1$2$emit$1(CachedPageEventFlow$downstreamFlow$1.C42002<? super T> c42002, Continuation<? super CachedPageEventFlow$downstreamFlow$1$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = c42002;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((IndexedValue) null, (Continuation<? super Unit>) this);
    }
}
