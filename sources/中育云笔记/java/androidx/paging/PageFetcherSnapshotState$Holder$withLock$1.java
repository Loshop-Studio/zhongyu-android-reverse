package androidx.paging;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.paging.PageFetcherSnapshotState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshotState$Holder", m26211f = "PageFetcherSnapshotState.kt", m26212l = {TypedValues.PositionType.TYPE_PERCENT_Y}, m26213m = "withLock", m26214v = 1)
/* loaded from: classes3.dex */
public final class PageFetcherSnapshotState$Holder$withLock$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageFetcherSnapshotState.Holder<Key, Value> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshotState$Holder$withLock$1(PageFetcherSnapshotState.Holder<Key, Value> holder, InterfaceC11588c<? super PageFetcherSnapshotState$Holder$withLock$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = holder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.withLock(null, this);
    }
}
