package androidx.paging;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.p071uc.crashsdk.export.ExitType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m13412d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¨\u0006\u0006"}, m13413d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "androidx/paging/FlowExtKt$simpleFlatMapLatest$1"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", m13451f = "PageFetcherSnapshot.kt", m13452i = {0, 0, 0}, m13453l = {232, ExitType.UNEXP_BACKGROUND_CRASH}, m13454m = "invokeSuspend", m13455n = {"this_$iv", "$this$withLock_u24default$iv$iv", "generationId"}, m13456s = {"L$1", "L$2", "I$0"})
@SourceDebugExtension({"SMAP\nFlowExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowExt.kt\nandroidx/paging/FlowExtKt$simpleFlatMapLatest$1\n+ 2 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot\n+ 3 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 4 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,224:1\n254#2:225\n258#2,2:236\n260#2,9:239\n390#3:226\n391#3:235\n120#4,8:227\n129#4:238\n53#5:248\n55#5:252\n50#6:249\n55#6:251\n107#7:250\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshot.kt\nandroidx/paging/PageFetcherSnapshot\n*L\n254#1:226\n254#1:235\n254#1:227,8\n254#1:238\n268#1:248\n268#1:252\n268#1:249\n268#1:251\n268#1:250\n*E\n"})
/* renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 */
/* loaded from: classes3.dex */
public final class C4388xe29ec4fd extends SuspendLambda implements Function3<FlowCollector<? super GenerationalViewportHint>, Integer, Continuation<? super Unit>, Object> {
    final /* synthetic */ LoadType $loadType$inlined;
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PageFetcherSnapshot this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4388xe29ec4fd(Continuation continuation, PageFetcherSnapshot pageFetcherSnapshot, LoadType loadType) {
        super(3, continuation);
        this.this$0 = pageFetcherSnapshot;
        this.$loadType$inlined = loadType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r7, r12, r11) == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2e
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlin.ResultKt.throwOnFailure(r12)
            goto Lc8
        L14:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1c:
            int r1 = r11.I$0
            java.lang.Object r5 = r11.L$2
            kotlinx.coroutines.sync.Mutex r5 = (kotlinx.coroutines.sync.Mutex) r5
            java.lang.Object r6 = r11.L$1
            androidx.paging.PageFetcherSnapshotState$Holder r6 = (androidx.paging.PageFetcherSnapshotState.Holder) r6
            java.lang.Object r7 = r11.L$0
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            kotlin.ResultKt.throwOnFailure(r12)
            goto L59
        L2e:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.L$0
            r7 = r12
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            java.lang.Object r12 = r11.L$1
            java.lang.Number r12 = (java.lang.Number) r12
            int r1 = r12.intValue()
            androidx.paging.PageFetcherSnapshot r12 = r11.this$0
            androidx.paging.PageFetcherSnapshotState$Holder r6 = androidx.paging.PageFetcherSnapshot.access$getStateHolder$p(r12)
            kotlinx.coroutines.sync.Mutex r5 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r6)
            r11.L$0 = r7
            r11.L$1 = r6
            r11.L$2 = r5
            r11.I$0 = r1
            r11.label = r3
            java.lang.Object r12 = r5.lock(r4, r11)
            if (r12 != r0) goto L59
            goto Lc7
        L59:
            androidx.paging.PageFetcherSnapshotState r12 = androidx.paging.PageFetcherSnapshotState.Holder.access$getState$p(r6)     // Catch: java.lang.Throwable -> L7e
            androidx.paging.MutableLoadStateCollection r6 = r12.getSourceLoadStates()     // Catch: java.lang.Throwable -> L7e
            androidx.paging.LoadType r8 = r11.$loadType$inlined     // Catch: java.lang.Throwable -> L7e
            androidx.paging.LoadState r6 = r6.get(r8)     // Catch: java.lang.Throwable -> L7e
            androidx.paging.LoadState$NotLoading$Companion r8 = androidx.paging.LoadState.NotLoading.INSTANCE     // Catch: java.lang.Throwable -> L7e
            androidx.paging.LoadState$NotLoading r9 = r8.getComplete$paging_common_release()     // Catch: java.lang.Throwable -> L7e
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r9)     // Catch: java.lang.Throwable -> L7e
            r9 = 0
            if (r6 == 0) goto L80
            androidx.paging.GenerationalViewportHint[] r12 = new androidx.paging.GenerationalViewportHint[r9]     // Catch: java.lang.Throwable -> L7e
            kotlinx.coroutines.flow.Flow r12 = kotlinx.coroutines.flow.FlowKt.flowOf(r12)     // Catch: java.lang.Throwable -> L7e
            r5.unlock(r4)
            goto Lb9
        L7e:
            r12 = move-exception
            goto Lcb
        L80:
            androidx.paging.MutableLoadStateCollection r6 = r12.getSourceLoadStates()     // Catch: java.lang.Throwable -> L7e
            androidx.paging.LoadType r10 = r11.$loadType$inlined     // Catch: java.lang.Throwable -> L7e
            androidx.paging.LoadState r6 = r6.get(r10)     // Catch: java.lang.Throwable -> L7e
            boolean r6 = r6 instanceof androidx.paging.LoadState.Error     // Catch: java.lang.Throwable -> L7e
            if (r6 != 0) goto L9b
            androidx.paging.MutableLoadStateCollection r12 = r12.getSourceLoadStates()     // Catch: java.lang.Throwable -> L7e
            androidx.paging.LoadType r6 = r11.$loadType$inlined     // Catch: java.lang.Throwable -> L7e
            androidx.paging.LoadState$NotLoading r8 = r8.getIncomplete$paging_common_release()     // Catch: java.lang.Throwable -> L7e
            r12.set(r6, r8)     // Catch: java.lang.Throwable -> L7e
        L9b:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7e
            r5.unlock(r4)
            androidx.paging.PageFetcherSnapshot r12 = r11.this$0
            androidx.paging.HintHandler r12 = androidx.paging.PageFetcherSnapshot.access$getHintHandler$p(r12)
            androidx.paging.LoadType r5 = r11.$loadType$inlined
            kotlinx.coroutines.flow.Flow r12 = r12.hintFor(r5)
            if (r1 != 0) goto Laf
            r3 = r9
        Laf:
            kotlinx.coroutines.flow.Flow r12 = kotlinx.coroutines.flow.FlowKt.drop(r12, r3)
            androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1 r3 = new androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1
            r3.<init>()
            r12 = r3
        Lb9:
            r11.L$0 = r4
            r11.L$1 = r4
            r11.L$2 = r4
            r11.label = r2
            java.lang.Object r12 = kotlinx.coroutines.flow.FlowKt.emitAll(r7, r12, r11)
            if (r12 != r0) goto Lc8
        Lc7:
            return r0
        Lc8:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        Lcb:
            r5.unlock(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4388xe29ec4fd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super GenerationalViewportHint> flowCollector, Integer num, Continuation<? super Unit> continuation) {
        C4388xe29ec4fd c4388xe29ec4fd = new C4388xe29ec4fd(continuation, this.this$0, this.$loadType$inlined);
        c4388xe29ec4fd.L$0 = flowCollector;
        c4388xe29ec4fd.L$1 = num;
        return c4388xe29ec4fd.invokeSuspend(Unit.INSTANCE);
    }
}
