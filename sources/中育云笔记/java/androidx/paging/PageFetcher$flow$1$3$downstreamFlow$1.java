package androidx.paging;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1", m26211f = "PageFetcher.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class PageFetcher$flow$1$3$downstreamFlow$1 extends SuspendLambda implements InterfaceC9544p {
    /* synthetic */ Object L$0;
    int label;

    public PageFetcher$flow$1$3$downstreamFlow$1(InterfaceC11588c<? super PageFetcher$flow$1$3$downstreamFlow$1> interfaceC11588c) {
        super(2, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        PageFetcher$flow$1$3$downstreamFlow$1 pageFetcher$flow$1$3$downstreamFlow$1 = new PageFetcher$flow$1$3$downstreamFlow$1(interfaceC11588c);
        pageFetcher$flow$1$3$downstreamFlow$1.L$0 = obj;
        return pageFetcher$flow$1$3$downstreamFlow$1;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(PageEvent<Value> pageEvent, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((PageFetcher$flow$1$3$downstreamFlow$1) create(pageEvent, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        PageEvent pageEvent = (PageEvent) this.L$0;
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(2)) {
            pagingLogger.log(2, "Sent " + pageEvent, null);
        }
        return C10786q.f26013a;
    }
}
