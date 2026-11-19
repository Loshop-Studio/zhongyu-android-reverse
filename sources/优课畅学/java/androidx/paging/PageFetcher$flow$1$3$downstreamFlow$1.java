package androidx.paging;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1", m17801f = "PageFetcher.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PageFetcher$flow$1$3$downstreamFlow$1 extends SuspendLambda implements InterfaceC10574p {
    /* synthetic */ Object L$0;
    int label;

    public PageFetcher$flow$1$3$downstreamFlow$1(InterfaceC9324c<? super PageFetcher$flow$1$3$downstreamFlow$1> interfaceC9324c) {
        super(2, interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        PageFetcher$flow$1$3$downstreamFlow$1 pageFetcher$flow$1$3$downstreamFlow$1 = new PageFetcher$flow$1$3$downstreamFlow$1(interfaceC9324c);
        pageFetcher$flow$1$3$downstreamFlow$1.L$0 = obj;
        return pageFetcher$flow$1$3$downstreamFlow$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(PageEvent<Value> pageEvent, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((PageFetcher$flow$1$3$downstreamFlow$1) create(pageEvent, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        PageEvent pageEvent = (PageEvent) this.L$0;
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(2)) {
            pagingLogger.log(2, "Sent " + pageEvent, null);
        }
        return C8736p.f16368a;
    }
}
