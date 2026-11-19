package androidx.paging;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", m17801f = "PageFetcherSnapshot.kt", m17802l = {646, 179}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$pageEventFlow$2 extends SuspendLambda implements InterfaceC10574p {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$pageEventFlow$2(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC9324c<? super PageFetcherSnapshot$pageEventFlow$2> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        PageFetcherSnapshot$pageEventFlow$2 pageFetcherSnapshot$pageEventFlow$2 = new PageFetcherSnapshot$pageEventFlow$2(this.this$0, interfaceC9324c);
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
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r6.label
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L1b
            if (r1 != r3) goto L13
            kotlin.AbstractC9079b.m15926b(r7)
            goto L70
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            java.lang.Object r1 = r6.L$2
            l8.d r1 = (p169l8.InterfaceC9267d) r1
            java.lang.Object r2 = r6.L$1
            r8.a r2 = (p235r8.InterfaceC9942a) r2
            java.lang.Object r5 = r6.L$0
            androidx.paging.PageFetcherSnapshotState$Holder r5 = (androidx.paging.PageFetcherSnapshotState.Holder) r5
            kotlin.AbstractC9079b.m15926b(r7)
            goto L4d
        L2b:
            kotlin.AbstractC9079b.m15926b(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            l8.d r1 = (p169l8.InterfaceC9267d) r1
            androidx.paging.PageFetcherSnapshot<Key, Value> r7 = r6.this$0
            androidx.paging.PageFetcherSnapshotState$Holder r5 = androidx.paging.PageFetcherSnapshot.access$getStateHolder$p(r7)
            r8.a r7 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r5)
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
            androidx.paging.MutableLoadStateCollection r7 = r7.getSourceLoadStates$paging_common_release()     // Catch: java.lang.Throwable -> L73
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
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        L73:
            r7 = move-exception
            r2.unlock(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC9267d interfaceC9267d, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((PageFetcherSnapshot$pageEventFlow$2) create(interfaceC9267d, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
