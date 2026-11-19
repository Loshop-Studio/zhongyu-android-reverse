package androidx.paging;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11595d;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", m26211f = "CachedPageEventFlow.kt", m26212l = {61, 66}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class CachedPageEventFlow$sharedForDownstream$1 extends SuspendLambda implements InterfaceC9544p {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CachedPageEventFlow<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$sharedForDownstream$1(CachedPageEventFlow<T> cachedPageEventFlow, InterfaceC11588c<? super CachedPageEventFlow$sharedForDownstream$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = cachedPageEventFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        CachedPageEventFlow$sharedForDownstream$1 cachedPageEventFlow$sharedForDownstream$1 = new CachedPageEventFlow$sharedForDownstream$1(this.this$0, interfaceC11588c);
        cachedPageEventFlow$sharedForDownstream$1.L$0 = obj;
        return cachedPageEventFlow$sharedForDownstream$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (r5 == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r4.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r4.L$0
            vd.d r3 = (p379vd.InterfaceC11595d) r3
            kotlin.AbstractC9924b.m20071b(r5)
            goto L56
        L1a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L22:
            java.lang.Object r1 = r4.L$0
            vd.d r1 = (p379vd.InterfaceC11595d) r1
            kotlin.AbstractC9924b.m20071b(r5)
            goto L43
        L2a:
            kotlin.AbstractC9924b.m20071b(r5)
            java.lang.Object r5 = r4.L$0
            r1 = r5
            vd.d r1 = (p379vd.InterfaceC11595d) r1
            androidx.paging.CachedPageEventFlow<T> r5 = r4.this$0
            androidx.paging.FlattenedPageController r5 = androidx.paging.CachedPageEventFlow.access$getPageController$p(r5)
            r4.L$0 = r1
            r4.label = r3
            java.lang.Object r5 = r5.getStateAsEvents(r4)
            if (r5 != r0) goto L43
            goto L6e
        L43:
            java.util.List r5 = (java.util.List) r5
            androidx.paging.CachedPageEventFlow<T> r3 = r4.this$0
            kotlinx.coroutines.g r3 = androidx.paging.CachedPageEventFlow.access$getJob$p(r3)
            r3.start()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r3 = r1
            r1 = r5
        L56:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L6f
            java.lang.Object r5 = r1.next()
            rc.k0 r5 = (p325rc.C10955k0) r5
            r4.L$0 = r3
            r4.L$1 = r1
            r4.label = r2
            java.lang.Object r5 = r3.emit(r5, r4)
            if (r5 != r0) goto L56
        L6e:
            return r0
        L6f:
            qc.q r5 = p309qc.C10786q.f26013a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CachedPageEventFlow$sharedForDownstream$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11595d interfaceC11595d, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((CachedPageEventFlow$sharedForDownstream$1) create(interfaceC11595d, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
