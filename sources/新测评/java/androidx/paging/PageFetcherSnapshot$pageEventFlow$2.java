package androidx.paging;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Add missing generic type declarations: [Value] */
@Metadata(m13557d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00060\u0005H\u008a@"}, m13558d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/paging/PageEvent;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", m13596f = "PageFetcherSnapshot.kt", m13597i = {0, 0}, m13598l = {646, 179}, m13599m = "invokeSuspend", m13600n = {"this_$iv", "$this$withLock_u24default$iv$iv"}, m13601s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nPageFetcherSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$pageEventFlow$2\n+ 2 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,639:1\n390#2:640\n391#2:649\n120#3,8:641\n129#3:650\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot$pageEventFlow$2\n*L\n179#1:640\n179#1:649\n179#1:641,8\n179#1:650\n*E\n"})
/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$pageEventFlow$2<Value> extends SuspendLambda implements Function2<FlowCollector<? super PageEvent<Value>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$pageEventFlow$2(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, Continuation<? super PageFetcherSnapshot$pageEventFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PageFetcherSnapshot$pageEventFlow$2 pageFetcherSnapshot$pageEventFlow$2 = new PageFetcherSnapshot$pageEventFlow$2(this.this$0, continuation);
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
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L1b
            if (r1 != r3) goto L13
            kotlin.ResultKt.throwOnFailure(r7)
            goto L70
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            java.lang.Object r1 = r6.L$2
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.Object r2 = r6.L$1
            kotlinx.coroutines.sync.Mutex r2 = (kotlinx.coroutines.sync.Mutex) r2
            java.lang.Object r5 = r6.L$0
            androidx.paging.PageFetcherSnapshotState$Holder r5 = (androidx.paging.PageFetcherSnapshotState.Holder) r5
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4d
        L2b:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.L$0
            r1 = r7
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            androidx.paging.PageFetcherSnapshot<Key, Value> r7 = r6.this$0
            androidx.paging.PageFetcherSnapshotState$Holder r5 = androidx.paging.PageFetcherSnapshot.access$getStateHolder$p(r7)
            kotlinx.coroutines.sync.Mutex r7 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r5)
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
            androidx.paging.MutableLoadStateCollection r7 = r7.getSourceLoadStates()     // Catch: java.lang.Throwable -> L73
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
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L73:
            r7 = move-exception
            r2.unlock(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super PageEvent<Value>> flowCollector, Continuation<? super Unit> continuation) {
        return ((PageFetcherSnapshot$pageEventFlow$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
