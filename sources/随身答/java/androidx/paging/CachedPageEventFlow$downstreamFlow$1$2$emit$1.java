package androidx.paging;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.paging.CachedPageEventFlow$downstreamFlow$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$2", m13451f = "CachedPageEventFlow.kt", m13452i = {0, 0}, m13453l = {105}, m13454m = "emit", m13455n = {"this", "indexedValue"}, m13456s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class CachedPageEventFlow$downstreamFlow$1$2$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CachedPageEventFlow$downstreamFlow$1.C43472<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CachedPageEventFlow$downstreamFlow$1$2$emit$1(CachedPageEventFlow$downstreamFlow$1.C43472<? super T> c43472, Continuation<? super CachedPageEventFlow$downstreamFlow$1$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = c43472;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((IndexedValue) null, (Continuation<? super Unit>) this);
    }
}
