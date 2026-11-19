package androidx.paging;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.ContiguousPagedList$deferBoundaryCallbacks$1", m26211f = "ContiguousPagedList.jvmAndAndroid.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class ContiguousPagedList$deferBoundaryCallbacks$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ boolean $deferBegin;
    final /* synthetic */ boolean $deferEmpty;
    final /* synthetic */ boolean $deferEnd;
    int label;
    final /* synthetic */ ContiguousPagedList<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContiguousPagedList$deferBoundaryCallbacks$1(boolean z10, ContiguousPagedList<K, V> contiguousPagedList, boolean z11, boolean z12, InterfaceC11588c<? super ContiguousPagedList$deferBoundaryCallbacks$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$deferEmpty = z10;
        this.this$0 = contiguousPagedList;
        this.$deferBegin = z11;
        this.$deferEnd = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new ContiguousPagedList$deferBoundaryCallbacks$1(this.$deferEmpty, this.this$0, this.$deferBegin, this.$deferEnd, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        if (this.$deferEmpty) {
            this.this$0.getBoundaryCallback$paging_common().onZeroItemsLoaded();
        }
        if (this.$deferBegin) {
            ((ContiguousPagedList) this.this$0).boundaryCallbackBeginDeferred = true;
        }
        if (this.$deferEnd) {
            ((ContiguousPagedList) this.this$0).boundaryCallbackEndDeferred = true;
        }
        this.this$0.tryDispatchBoundaryCallbacks(false);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((ContiguousPagedList$deferBoundaryCallbacks$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
