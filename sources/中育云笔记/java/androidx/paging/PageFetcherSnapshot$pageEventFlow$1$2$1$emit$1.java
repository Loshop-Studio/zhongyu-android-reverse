package androidx.paging;

import androidx.paging.PageFetcherSnapshot$pageEventFlow$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1", m26211f = "PageFetcherSnapshot.kt", m26212l = {97}, m26213m = "emit", m26214v = 1)
/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageFetcherSnapshot$pageEventFlow$1.C42542.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1(PageFetcherSnapshot$pageEventFlow$1.C42542.AnonymousClass1<? super T> anonymousClass1, InterfaceC11588c<? super PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((PageEvent) null, (InterfaceC11588c<? super C10786q>) this);
    }
}
