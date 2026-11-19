package androidx.paging;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", m17801f = "CachedPageEventFlow.kt", m17802l = {62, ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CachedPageEventFlow$sharedForDownstream$1 extends SuspendLambda implements InterfaceC10574p {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CachedPageEventFlow<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$sharedForDownstream$1(CachedPageEventFlow<T> cachedPageEventFlow, InterfaceC9324c<? super CachedPageEventFlow$sharedForDownstream$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        CachedPageEventFlow$sharedForDownstream$1 cachedPageEventFlow$sharedForDownstream$1 = new CachedPageEventFlow$sharedForDownstream$1(this.this$0, interfaceC9324c);
        cachedPageEventFlow$sharedForDownstream$1.L$0 = obj;
        return cachedPageEventFlow$sharedForDownstream$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (r5 == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r4.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r4.L$0
            l8.d r3 = (p169l8.InterfaceC9267d) r3
            kotlin.AbstractC9079b.m15926b(r5)
            goto L54
        L1a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L22:
            java.lang.Object r1 = r4.L$0
            l8.d r1 = (p169l8.InterfaceC9267d) r1
            kotlin.AbstractC9079b.m15926b(r5)
            goto L43
        L2a:
            kotlin.AbstractC9079b.m15926b(r5)
            java.lang.Object r5 = r4.L$0
            r1 = r5
            l8.d r1 = (p169l8.InterfaceC9267d) r1
            androidx.paging.CachedPageEventFlow<T> r5 = r4.this$0
            androidx.paging.FlattenedPageController r5 = androidx.paging.CachedPageEventFlow.access$getPageController$p(r5)
            r4.L$0 = r1
            r4.label = r3
            java.lang.Object r5 = r5.getStateAsEvents(r4)
            if (r5 != r0) goto L43
            goto L6c
        L43:
            java.util.List r5 = (java.util.List) r5
            androidx.paging.CachedPageEventFlow<T> r3 = r4.this$0
            kotlinx.coroutines.n r3 = androidx.paging.CachedPageEventFlow.access$getJob$p(r3)
            r3.start()
            java.util.Iterator r5 = r5.iterator()
            r3 = r1
            r1 = r5
        L54:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r1.next()
            i7.j0 r5 = (p134i7.C8786j0) r5
            r4.L$0 = r3
            r4.L$1 = r1
            r4.label = r2
            java.lang.Object r5 = r3.emit(r5, r4)
            if (r5 != r0) goto L54
        L6c:
            return r0
        L6d:
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPageEventFlow$sharedForDownstream$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC9267d interfaceC9267d, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((CachedPageEventFlow$sharedForDownstream$1) create(interfaceC9267d, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
