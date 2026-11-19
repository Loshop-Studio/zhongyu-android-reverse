package androidx.paging;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.paging.ContiguousPagedList$deferBoundaryCallbacks$1", m17801f = "ContiguousPagedList.jvm.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ContiguousPagedList$deferBoundaryCallbacks$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ boolean $deferBegin;
    final /* synthetic */ boolean $deferEmpty;
    final /* synthetic */ boolean $deferEnd;
    int label;
    final /* synthetic */ ContiguousPagedList<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContiguousPagedList$deferBoundaryCallbacks$1(boolean z10, ContiguousPagedList<K, V> contiguousPagedList, boolean z11, boolean z12, InterfaceC9324c<? super ContiguousPagedList$deferBoundaryCallbacks$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$deferEmpty = z10;
        this.this$0 = contiguousPagedList;
        this.$deferBegin = z11;
        this.$deferEnd = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new ContiguousPagedList$deferBoundaryCallbacks$1(this.$deferEmpty, this.this$0, this.$deferBegin, this.$deferEnd, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((ContiguousPagedList$deferBoundaryCallbacks$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        if (this.$deferEmpty) {
            this.this$0.getBoundaryCallback$paging_common_release().onZeroItemsLoaded();
        }
        if (this.$deferBegin) {
            ((ContiguousPagedList) this.this$0).boundaryCallbackBeginDeferred = true;
        }
        if (this.$deferEnd) {
            ((ContiguousPagedList) this.this$0).boundaryCallbackEndDeferred = true;
        }
        this.this$0.tryDispatchBoundaryCallbacks(false);
        return C8736p.f16368a;
    }
}
