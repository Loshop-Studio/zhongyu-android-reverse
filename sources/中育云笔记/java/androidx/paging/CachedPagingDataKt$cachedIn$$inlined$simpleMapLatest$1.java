package androidx.paging;

import com.tendcloud.tenddata.C7843ab;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", m26211f = "CachedPagingData.kt", m26212l = {C7843ab.b.API_MYNA_START}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 extends SuspendLambda implements InterfaceC9545q {
    final /* synthetic */ InterfaceC11122i0 $scope$inlined;
    final /* synthetic */ ActiveFlowTracker $tracker$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(InterfaceC11588c interfaceC11588c, InterfaceC11122i0 interfaceC11122i0, ActiveFlowTracker activeFlowTracker) {
        super(3, interfaceC11588c);
        this.$scope$inlined = interfaceC11122i0;
        this.$tracker$inlined = activeFlowTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11595d interfaceC11595d = (InterfaceC11595d) this.L$0;
            MulticastedPagingData multicastedPagingData = new MulticastedPagingData(this.$scope$inlined, (PagingData) this.L$1, this.$tracker$inlined);
            this.label = 1;
            if (interfaceC11595d.emit(multicastedPagingData, this) == objM25952f) {
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
    public final Object invoke(InterfaceC11595d interfaceC11595d, PagingData<T> pagingData, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 = new CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(interfaceC11588c, this.$scope$inlined, this.$tracker$inlined);
        cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.L$0 = interfaceC11595d;
        cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.L$1 = pagingData;
        return cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.invokeSuspend(C10786q.f26013a);
    }
}
