package kotlinx.coroutines.flow;

import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public final class SubscribedFlowCollector implements InterfaceC9267d {

    /* renamed from: a */
    public final InterfaceC9267d f17972a;

    /* renamed from: b */
    public final InterfaceC10574p f17973b;

    public SubscribedFlowCollector(InterfaceC9267d interfaceC9267d, InterfaceC10574p interfaceC10574p) {
        this.f17972a = interfaceC9267d;
        this.f17973b = interfaceC10574p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r7).m16690c(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m16690c(p179m7.InterfaceC9324c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = (kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1) r0
            int r1 = r0.f17978e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17978e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = new kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f17976c
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17978e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.AbstractC9079b.m15926b(r7)
            goto L79
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f17975b
            kotlinx.coroutines.flow.internal.SafeCollector r2 = (kotlinx.coroutines.flow.internal.SafeCollector) r2
            java.lang.Object r4 = r0.f17974a
            kotlinx.coroutines.flow.SubscribedFlowCollector r4 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r4
            kotlin.AbstractC9079b.m15926b(r7)     // Catch: java.lang.Throwable -> L40
            goto L60
        L40:
            r7 = move-exception
            goto L7f
        L42:
            kotlin.AbstractC9079b.m15926b(r7)
            kotlinx.coroutines.flow.internal.SafeCollector r2 = new kotlinx.coroutines.flow.internal.SafeCollector
            l8.d r7 = r6.f17972a
            kotlin.coroutines.d r5 = r0.getContext()
            r2.<init>(r7, r5)
            x7.p r7 = r6.f17973b     // Catch: java.lang.Throwable -> L40
            r0.f17974a = r6     // Catch: java.lang.Throwable -> L40
            r0.f17975b = r2     // Catch: java.lang.Throwable -> L40
            r0.f17978e = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L5f
            goto L78
        L5f:
            r4 = r6
        L60:
            r2.releaseIntercepted()
            l8.d r7 = r4.f17972a
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector
            if (r2 == 0) goto L7c
            kotlinx.coroutines.flow.SubscribedFlowCollector r7 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r7
            r2 = 0
            r0.f17974a = r2
            r0.f17975b = r2
            r0.f17978e = r3
            java.lang.Object r7 = r7.m16690c(r0)
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        L7c:
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        L7f:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedFlowCollector.m16690c(m7.c):java.lang.Object");
    }

    @Override // p169l8.InterfaceC9267d
    public Object emit(Object obj, InterfaceC9324c interfaceC9324c) {
        return this.f17972a.emit(obj, interfaceC9324c);
    }
}
