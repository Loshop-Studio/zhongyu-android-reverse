package androidx.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshot", m26211f = "PageFetcherSnapshot.kt", m26212l = {694}, m26213m = "getLoadKey$paging_common", m26214v = 1)
/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$getLoadKey$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$getLoadKey$1(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC11588c<? super PageFetcherSnapshot$getLoadKey$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getLoadKey$paging_common(null, this);
    }
}
