package androidx.paging;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", m17801f = "PageFetcherSnapshot.kt", m17802l = {232, 98}, m17803m = "invokeSuspend")
/* renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 */
/* loaded from: classes3.dex */
public final class C4327xe29ec4fd extends SuspendLambda implements InterfaceC10575q {
    final /* synthetic */ LoadType $loadType$inlined;
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PageFetcherSnapshot this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4327xe29ec4fd(InterfaceC9324c interfaceC9324c, PageFetcherSnapshot pageFetcherSnapshot, LoadType loadType) {
        super(3, interfaceC9324c);
        this.this$0 = pageFetcherSnapshot;
        this.$loadType$inlined = loadType;
    }

    @Override // p300x7.InterfaceC10575q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC9267d) obj, (Integer) obj2, (InterfaceC9324c<? super C8736p>) obj3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        if (p169l8.AbstractC9268e.m17031u(r7, r12, r11) == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2e
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlin.AbstractC9079b.m15926b(r12)
            goto Lc8
        L14:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1c:
            int r1 = r11.I$0
            java.lang.Object r5 = r11.L$2
            r8.a r5 = (p235r8.InterfaceC9942a) r5
            java.lang.Object r6 = r11.L$1
            androidx.paging.PageFetcherSnapshotState$Holder r6 = (androidx.paging.PageFetcherSnapshotState.Holder) r6
            java.lang.Object r7 = r11.L$0
            l8.d r7 = (p169l8.InterfaceC9267d) r7
            kotlin.AbstractC9079b.m15926b(r12)
            goto L59
        L2e:
            kotlin.AbstractC9079b.m15926b(r12)
            java.lang.Object r12 = r11.L$0
            r7 = r12
            l8.d r7 = (p169l8.InterfaceC9267d) r7
            java.lang.Object r12 = r11.L$1
            java.lang.Number r12 = (java.lang.Number) r12
            int r1 = r12.intValue()
            androidx.paging.PageFetcherSnapshot r12 = r11.this$0
            androidx.paging.PageFetcherSnapshotState$Holder r6 = androidx.paging.PageFetcherSnapshot.access$getStateHolder$p(r12)
            r8.a r5 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r6)
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
            androidx.paging.MutableLoadStateCollection r6 = r12.getSourceLoadStates$paging_common_release()     // Catch: java.lang.Throwable -> L7e
            androidx.paging.LoadType r8 = r11.$loadType$inlined     // Catch: java.lang.Throwable -> L7e
            androidx.paging.LoadState r6 = r6.get(r8)     // Catch: java.lang.Throwable -> L7e
            androidx.paging.LoadState$NotLoading$Companion r8 = androidx.paging.LoadState.NotLoading.Companion     // Catch: java.lang.Throwable -> L7e
            androidx.paging.LoadState$NotLoading r9 = r8.getComplete$paging_common_release()     // Catch: java.lang.Throwable -> L7e
            boolean r6 = kotlin.jvm.internal.AbstractC9133u.m16128b(r6, r9)     // Catch: java.lang.Throwable -> L7e
            r9 = 0
            if (r6 == 0) goto L80
            androidx.paging.GenerationalViewportHint[] r12 = new androidx.paging.GenerationalViewportHint[r9]     // Catch: java.lang.Throwable -> L7e
            l8.c r12 = p169l8.AbstractC9268e.m16993E(r12)     // Catch: java.lang.Throwable -> L7e
            r5.unlock(r4)
            goto Lb9
        L7e:
            r12 = move-exception
            goto Lcb
        L80:
            androidx.paging.MutableLoadStateCollection r6 = r12.getSourceLoadStates$paging_common_release()     // Catch: java.lang.Throwable -> L7e
            androidx.paging.LoadType r10 = r11.$loadType$inlined     // Catch: java.lang.Throwable -> L7e
            androidx.paging.LoadState r6 = r6.get(r10)     // Catch: java.lang.Throwable -> L7e
            boolean r6 = r6 instanceof androidx.paging.LoadState.Error     // Catch: java.lang.Throwable -> L7e
            if (r6 != 0) goto L9b
            androidx.paging.MutableLoadStateCollection r12 = r12.getSourceLoadStates$paging_common_release()     // Catch: java.lang.Throwable -> L7e
            androidx.paging.LoadType r6 = r11.$loadType$inlined     // Catch: java.lang.Throwable -> L7e
            androidx.paging.LoadState$NotLoading r8 = r8.getIncomplete$paging_common_release()     // Catch: java.lang.Throwable -> L7e
            r12.set(r6, r8)     // Catch: java.lang.Throwable -> L7e
        L9b:
            h7.p r12 = p123h7.C8736p.f16368a     // Catch: java.lang.Throwable -> L7e
            r5.unlock(r4)
            androidx.paging.PageFetcherSnapshot r12 = r11.this$0
            androidx.paging.HintHandler r12 = androidx.paging.PageFetcherSnapshot.access$getHintHandler$p(r12)
            androidx.paging.LoadType r5 = r11.$loadType$inlined
            l8.c r12 = r12.hintFor(r5)
            if (r1 != 0) goto Laf
            r3 = r9
        Laf:
            l8.c r12 = p169l8.AbstractC9268e.m17028r(r12, r3)
            androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1 r3 = new androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$lambda$5$$inlined$map$1
            r3.<init>()
            r12 = r3
        Lb9:
            r11.L$0 = r4
            r11.L$1 = r4
            r11.L$2 = r4
            r11.label = r2
            java.lang.Object r12 = p169l8.AbstractC9268e.m17031u(r7, r12, r11)
            if (r12 != r0) goto Lc8
        Lc7:
            return r0
        Lc8:
            h7.p r12 = p123h7.C8736p.f16368a
            return r12
        Lcb:
            r5.unlock(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4327xe29ec4fd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(InterfaceC9267d interfaceC9267d, Integer num, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        C4327xe29ec4fd c4327xe29ec4fd = new C4327xe29ec4fd(interfaceC9324c, this.this$0, this.$loadType$inlined);
        c4327xe29ec4fd.L$0 = interfaceC9267d;
        c4327xe29ec4fd.L$1 = num;
        return c4327xe29ec4fd.invokeSuspend(C8736p.f16368a);
    }
}
