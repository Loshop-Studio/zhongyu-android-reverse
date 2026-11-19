package androidx.paging;

import androidx.paging.PagingDataEvent;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1", m26211f = "AsyncPagingDataDiffer.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
/* renamed from: androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1 */
/* loaded from: classes3.dex */
public final class C4208xf113672d extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ PagingDataEvent.Refresh<T> $this_apply;
    int label;
    final /* synthetic */ AsyncPagingDataDiffer<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4208xf113672d(PagingDataEvent.Refresh<T> refresh, AsyncPagingDataDiffer<T> asyncPagingDataDiffer, InterfaceC11588c<? super C4208xf113672d> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$this_apply = refresh;
        this.this$0 = asyncPagingDataDiffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new C4208xf113672d(this.$this_apply, this.this$0, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        return PlaceholderPaddedListDiffHelperKt.computeDiff(this.$this_apply.getPreviousList(), this.$this_apply.getNewList(), ((AsyncPagingDataDiffer) this.this$0).diffCallback);
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super PlaceholderPaddedDiffResult> interfaceC11588c) {
        return ((C4208xf113672d) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
