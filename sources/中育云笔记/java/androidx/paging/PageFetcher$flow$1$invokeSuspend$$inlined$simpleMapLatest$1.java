package androidx.paging;

import androidx.paging.PageFetcher;
import com.tendcloud.tenddata.C7843ab;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1", m26211f = "PageFetcher.kt", m26212l = {C7843ab.b.API_MYNA_START}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 extends SuspendLambda implements InterfaceC9545q {
    final /* synthetic */ RemoteMediatorAccessor $remoteMediatorAccessor$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PageFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(InterfaceC11588c interfaceC11588c, PageFetcher pageFetcher, RemoteMediatorAccessor remoteMediatorAccessor) {
        super(3, interfaceC11588c);
        this.this$0 = pageFetcher;
        this.$remoteMediatorAccessor$inlined = remoteMediatorAccessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11595d interfaceC11595d = (InterfaceC11595d) this.L$0;
            PageFetcher.GenerationInfo generationInfo = (PageFetcher.GenerationInfo) this.L$1;
            InterfaceC11594c interfaceC11594cM25540K = AbstractC11596e.m25540K(this.this$0.injectRemoteEvents(generationInfo.getSnapshot(), generationInfo.getJob(), this.$remoteMediatorAccessor$inlined), new PageFetcher$flow$1$3$downstreamFlow$1(null));
            PageFetcher pageFetcher = this.this$0;
            PagingData pagingData = new PagingData(interfaceC11594cM25540K, new PageFetcher.PagerUiReceiver(pageFetcher, pageFetcher.retryEvents), new PageFetcher.PagerHintReceiver(this.this$0, generationInfo.getSnapshot()), null, 8, null);
            this.label = 1;
            if (interfaceC11595d.emit(pagingData, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9545q
    public final Object invoke(InterfaceC11595d interfaceC11595d, PageFetcher.GenerationInfo<Key, Value> generationInfo, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1 = new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(interfaceC11588c, this.this$0, this.$remoteMediatorAccessor$inlined);
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.L$0 = interfaceC11595d;
        pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.L$1 = generationInfo;
        return pageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1.invokeSuspend(C10786q.f26013a);
    }
}
