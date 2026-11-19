package androidx.paging;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11595d;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", m26211f = "PageFetcherSnapshot.kt", m26212l = {694, 194}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$pageEventFlow$2 extends SuspendLambda implements InterfaceC9544p {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$pageEventFlow$2(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC11588c<? super PageFetcherSnapshot$pageEventFlow$2> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        PageFetcherSnapshot$pageEventFlow$2 pageFetcherSnapshot$pageEventFlow$2 = new PageFetcherSnapshot$pageEventFlow$2(this.this$0, interfaceC11588c);
        pageFetcherSnapshot$pageEventFlow$2.L$0 = obj;
        return pageFetcherSnapshot$pageEventFlow$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r1.emit(r2, r6) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r6.label
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L1b
            if (r1 != r3) goto L13
            kotlin.AbstractC9924b.m20071b(r7)
            goto L70
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            java.lang.Object r1 = r6.L$2
            vd.d r1 = (p379vd.InterfaceC11595d) r1
            java.lang.Object r2 = r6.L$1
            be.a r2 = (be.InterfaceC5189a) r2
            java.lang.Object r5 = r6.L$0
            androidx.paging.PageFetcherSnapshotState$Holder r5 = (androidx.paging.PageFetcherSnapshotState.Holder) r5
            kotlin.AbstractC9924b.m20071b(r7)
            goto L4d
        L2b:
            kotlin.AbstractC9924b.m20071b(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            vd.d r1 = (p379vd.InterfaceC11595d) r1
            androidx.paging.PageFetcherSnapshot<Key, Value> r7 = r6.this$0
            androidx.paging.PageFetcherSnapshotState$Holder r5 = androidx.paging.PageFetcherSnapshot.access$getStateHolder$p(r7)
            be.a r7 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r5)
            r6.L$0 = r5
            r6.L$1 = r7
            r6.L$2 = r1
            r6.label = r2
            java.lang.Object r2 = r7.lock(r4, r6)
            if (r2 != r0) goto L4c
            goto L6f
        L4c:
            r2 = r7
        L4d:
            androidx.paging.PageFetcherSnapshotState r7 = androidx.paging.PageFetcherSnapshotState.Holder.access$getState$p(r5)     // Catch: java.lang.Throwable -> L73
            androidx.paging.MutableLoadStateCollection r7 = r7.getSourceLoadStates$paging_common()     // Catch: java.lang.Throwable -> L73
            androidx.paging.LoadStates r7 = r7.snapshot()     // Catch: java.lang.Throwable -> L73
            r2.unlock(r4)
            androidx.paging.PageEvent$LoadStateUpdate r2 = new androidx.paging.PageEvent$LoadStateUpdate
            r2.<init>(r7, r4, r3, r4)
            r6.L$0 = r4
            r6.L$1 = r4
            r6.L$2 = r4
            r6.label = r3
            java.lang.Object r7 = r1.emit(r2, r6)
            if (r7 != r0) goto L70
        L6f:
            return r0
        L70:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        L73:
            r7 = move-exception
            r2.unlock(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11595d interfaceC11595d, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((PageFetcherSnapshot$pageEventFlow$2) create(interfaceC11595d, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
