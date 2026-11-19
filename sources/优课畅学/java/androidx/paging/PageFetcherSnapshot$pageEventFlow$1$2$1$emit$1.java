package androidx.paging;

import androidx.paging.PageFetcherSnapshot$pageEventFlow$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1", m17801f = "PageFetcherSnapshot.kt", m17802l = {95}, m17803m = "emit")
/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageFetcherSnapshot$pageEventFlow$1.C43352.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1(PageFetcherSnapshot$pageEventFlow$1.C43352.AnonymousClass1<? super T> anonymousClass1, InterfaceC9324c<? super PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1> interfaceC9324c) {
        super(interfaceC9324c);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((PageEvent) null, (InterfaceC9324c<? super C8736p>) this);
    }
}
