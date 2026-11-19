package androidx.paging;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1$jumpHint$1", m26211f = "PageFetcherSnapshot.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 extends SuspendLambda implements InterfaceC9544p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC11588c<? super PageFetcherSnapshot$startConsumingHints$1$jumpHint$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 pageFetcherSnapshot$startConsumingHints$1$jumpHint$1 = new PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(this.this$0, interfaceC11588c);
        pageFetcherSnapshot$startConsumingHints$1$jumpHint$1.L$0 = obj;
        return pageFetcherSnapshot$startConsumingHints$1$jumpHint$1;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(ViewportHint viewportHint, InterfaceC11588c<? super Boolean> interfaceC11588c) {
        return ((PageFetcherSnapshot$startConsumingHints$1$jumpHint$1) create(viewportHint, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        ViewportHint viewportHint = (ViewportHint) this.L$0;
        return AbstractC11826a.m26206a(viewportHint.getPresentedItemsBefore() * (-1) > ((PageFetcherSnapshot) this.this$0).config.jumpThreshold || viewportHint.getPresentedItemsAfter() * (-1) > ((PageFetcherSnapshot) this.this$0).config.jumpThreshold);
    }
}
