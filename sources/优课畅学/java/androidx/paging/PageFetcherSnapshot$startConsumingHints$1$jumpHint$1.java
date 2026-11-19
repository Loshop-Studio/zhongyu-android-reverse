package androidx.paging;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1", m17801f = "PageFetcherSnapshot.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 extends SuspendLambda implements InterfaceC10574p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC9324c<? super PageFetcherSnapshot$startConsumingHints$1$jumpHint$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 pageFetcherSnapshot$startConsumingHints$1$jumpHint$1 = new PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(this.this$0, interfaceC9324c);
        pageFetcherSnapshot$startConsumingHints$1$jumpHint$1.L$0 = obj;
        return pageFetcherSnapshot$startConsumingHints$1$jumpHint$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(ViewportHint viewportHint, InterfaceC9324c<? super Boolean> interfaceC9324c) {
        return ((PageFetcherSnapshot$startConsumingHints$1$jumpHint$1) create(viewportHint, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        ViewportHint viewportHint = (ViewportHint) this.L$0;
        return AbstractC9536a.m17796a(viewportHint.getPresentedItemsBefore() * (-1) > ((PageFetcherSnapshot) this.this$0).config.jumpThreshold || viewportHint.getPresentedItemsAfter() * (-1) > ((PageFetcherSnapshot) this.this$0).config.jumpThreshold);
    }
}
