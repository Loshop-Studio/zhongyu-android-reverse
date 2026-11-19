package androidx.paging;

import androidx.paging.PageFetcherSnapshotState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.paging.PageFetcherSnapshotState$Holder", m17801f = "PageFetcherSnapshotState.kt", m17802l = {402}, m17803m = "withLock")
/* loaded from: classes3.dex */
public final class PageFetcherSnapshotState$Holder$withLock$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageFetcherSnapshotState.Holder<Key, Value> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshotState$Holder$withLock$1(PageFetcherSnapshotState.Holder<Key, Value> holder, InterfaceC9324c<? super PageFetcherSnapshotState$Holder$withLock$1> interfaceC9324c) {
        super(interfaceC9324c);
        this.this$0 = holder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.withLock(null, this);
    }
}
