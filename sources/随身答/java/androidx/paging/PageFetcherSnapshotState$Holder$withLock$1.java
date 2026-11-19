package androidx.paging;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.paging.PageFetcherSnapshotState;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = 176)
@DebugMetadata(m13450c = "androidx.paging.PageFetcherSnapshotState$Holder", m13451f = "PageFetcherSnapshotState.kt", m13452i = {0, 0, 0}, m13453l = {TypedValues.CycleType.TYPE_VISIBILITY}, m13454m = "withLock", m13455n = {"this", "block", "$this$withLock_u24default$iv"}, m13456s = {"L$0", "L$1", "L$2"})
@SourceDebugExtension({"SMAP\nPageFetcherSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder$withLock$1\n*L\n1#1,396:1\n*E\n"})
/* loaded from: classes3.dex */
public final class PageFetcherSnapshotState$Holder$withLock$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageFetcherSnapshotState.Holder<Key, Value> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshotState$Holder$withLock$1(PageFetcherSnapshotState.Holder<Key, Value> holder, Continuation<? super PageFetcherSnapshotState$Holder$withLock$1> continuation) {
        super(continuation);
        this.this$0 = holder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.withLock(null, this);
    }
}
