package kotlinx.coroutines.flow;

import p181hd.InterfaceC9544p;
import p379vd.InterfaceC11595d;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public final class SubscribedFlowCollector implements InterfaceC11595d {

    /* renamed from: c */
    public final InterfaceC11595d f23884c;

    /* renamed from: d */
    public final InterfaceC9544p f23885d;

    public SubscribedFlowCollector(InterfaceC11595d interfaceC11595d, InterfaceC9544p interfaceC9544p) {
        this.f23884c = interfaceC11595d;
        this.f23885d = interfaceC9544p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r7).m20874b(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m20874b(vc.InterfaceC11588c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = (kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1) r0
            int r1 = r0.f23890g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23890g = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = new kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f23888e
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23890g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.AbstractC9924b.m20071b(r7)
            goto L79
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f23887d
            kotlinx.coroutines.flow.internal.SafeCollector r2 = (kotlinx.coroutines.flow.internal.SafeCollector) r2
            java.lang.Object r4 = r0.f23886c
            kotlinx.coroutines.flow.SubscribedFlowCollector r4 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r4
            kotlin.AbstractC9924b.m20071b(r7)     // Catch: java.lang.Throwable -> L40
            goto L60
        L40:
            r7 = move-exception
            goto L7f
        L42:
            kotlin.AbstractC9924b.m20071b(r7)
            kotlinx.coroutines.flow.internal.SafeCollector r2 = new kotlinx.coroutines.flow.internal.SafeCollector
            vd.d r7 = r6.f23884c
            kotlin.coroutines.d r5 = r0.getContext()
            r2.<init>(r7, r5)
            hd.p r7 = r6.f23885d     // Catch: java.lang.Throwable -> L40
            r0.f23886c = r6     // Catch: java.lang.Throwable -> L40
            r0.f23887d = r2     // Catch: java.lang.Throwable -> L40
            r0.f23890g = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L5f
            goto L78
        L5f:
            r4 = r6
        L60:
            r2.releaseIntercepted()
            vd.d r7 = r4.f23884c
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector
            if (r2 == 0) goto L7c
            kotlinx.coroutines.flow.SubscribedFlowCollector r7 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r7
            r2 = 0
            r0.f23886c = r2
            r0.f23887d = r2
            r0.f23890g = r3
            java.lang.Object r7 = r7.m20874b(r0)
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        L7c:
            qc.q r7 = p309qc.C10786q.f26013a
            return r7
        L7f:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedFlowCollector.m20874b(vc.c):java.lang.Object");
    }

    @Override // p379vd.InterfaceC11595d
    public Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
        return this.f23884c.emit(obj, interfaceC11588c);
    }
}
