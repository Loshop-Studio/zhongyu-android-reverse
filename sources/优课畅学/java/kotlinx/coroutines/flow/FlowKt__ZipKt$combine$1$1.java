package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", m17801f = "Zip.kt", m17802l = {29, 29}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class FlowKt__ZipKt$combine$1$1 extends SuspendLambda implements InterfaceC10575q {

    /* renamed from: a */
    public int f17916a;

    /* renamed from: b */
    public /* synthetic */ Object f17917b;

    /* renamed from: c */
    public /* synthetic */ Object f17918c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC10575q f17919d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$1$1(InterfaceC10575q interfaceC10575q, InterfaceC9324c interfaceC9324c) {
        super(3, interfaceC9324c);
        this.f17919d = interfaceC10575q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L15;
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
            int r1 = r6.f17916a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.AbstractC9079b.m15926b(r7)
            goto L4c
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.f17917b
            l8.d r1 = (p169l8.InterfaceC9267d) r1
            kotlin.AbstractC9079b.m15926b(r7)
            goto L40
        L22:
            kotlin.AbstractC9079b.m15926b(r7)
            java.lang.Object r7 = r6.f17917b
            r1 = r7
            l8.d r1 = (p169l8.InterfaceC9267d) r1
            java.lang.Object r7 = r6.f17918c
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            x7.q r4 = r6.f17919d
            r5 = 0
            r5 = r7[r5]
            r7 = r7[r3]
            r6.f17917b = r1
            r6.f17916a = r3
            java.lang.Object r7 = r4.invoke(r5, r7, r6)
            if (r7 != r0) goto L40
            goto L4b
        L40:
            r3 = 0
            r6.f17917b = r3
            r6.f17916a = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L4c
        L4b:
            return r0
        L4c:
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p300x7.InterfaceC10575q
    public final Object invoke(InterfaceC9267d interfaceC9267d, Object[] objArr, InterfaceC9324c interfaceC9324c) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.f17919d, interfaceC9324c);
        flowKt__ZipKt$combine$1$1.f17917b = interfaceC9267d;
        flowKt__ZipKt$combine$1$1.f17918c = objArr;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(C8736p.f16368a);
    }
}
