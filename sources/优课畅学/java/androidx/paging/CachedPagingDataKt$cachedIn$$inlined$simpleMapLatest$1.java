package androidx.paging;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", m17801f = "CachedPagingData.kt", m17802l = {TbsListener.ErrorCode.DISK_FULL}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 extends SuspendLambda implements InterfaceC10575q {
    final /* synthetic */ InterfaceC8822b0 $scope$inlined;
    final /* synthetic */ ActiveFlowTracker $tracker$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(InterfaceC9324c interfaceC9324c, InterfaceC8822b0 interfaceC8822b0, ActiveFlowTracker activeFlowTracker) {
        super(3, interfaceC9324c);
        this.$scope$inlined = interfaceC8822b0;
        this.$tracker$inlined = activeFlowTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9267d interfaceC9267d = (InterfaceC9267d) this.L$0;
            MulticastedPagingData multicastedPagingData = new MulticastedPagingData(this.$scope$inlined, (PagingData) this.L$1, this.$tracker$inlined);
            this.label = 1;
            if (interfaceC9267d.emit(multicastedPagingData, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }

    @Override // p300x7.InterfaceC10575q
    public final Object invoke(InterfaceC9267d interfaceC9267d, PagingData<T> pagingData, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 = new CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(interfaceC9324c, this.$scope$inlined, this.$tracker$inlined);
        cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.L$0 = interfaceC9267d;
        cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.L$1 = pagingData;
        return cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.invokeSuspend(C8736p.f16368a);
    }
}
