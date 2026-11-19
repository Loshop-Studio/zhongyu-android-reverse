package kotlinx.coroutines.flow;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", m17801f = "Merge.kt", m17802l = {TbsListener.ErrorCode.COPY_SRCDIR_ERROR, TbsListener.ErrorCode.COPY_SRCDIR_ERROR}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class FlowKt__MergeKt$mapLatest$1 extends SuspendLambda implements InterfaceC10575q {

    /* renamed from: a */
    public int f17830a;

    /* renamed from: b */
    public /* synthetic */ Object f17831b;

    /* renamed from: c */
    public /* synthetic */ Object f17832c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC10574p f17833d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MergeKt$mapLatest$1(InterfaceC10574p interfaceC10574p, InterfaceC9324c interfaceC9324c) {
        super(3, interfaceC9324c);
        this.f17833d = interfaceC10574p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r5.f17830a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.AbstractC9079b.m15926b(r6)
            goto L45
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.f17831b
            l8.d r1 = (p169l8.InterfaceC9267d) r1
            kotlin.AbstractC9079b.m15926b(r6)
            goto L39
        L22:
            kotlin.AbstractC9079b.m15926b(r6)
            java.lang.Object r6 = r5.f17831b
            r1 = r6
            l8.d r1 = (p169l8.InterfaceC9267d) r1
            java.lang.Object r6 = r5.f17832c
            x7.p r4 = r5.f17833d
            r5.f17831b = r1
            r5.f17830a = r3
            java.lang.Object r6 = r4.invoke(r6, r5)
            if (r6 != r0) goto L39
            goto L44
        L39:
            r3 = 0
            r5.f17831b = r3
            r5.f17830a = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L45
        L44:
            return r0
        L45:
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p300x7.InterfaceC10575q
    public final Object invoke(InterfaceC9267d interfaceC9267d, Object obj, InterfaceC9324c interfaceC9324c) {
        FlowKt__MergeKt$mapLatest$1 flowKt__MergeKt$mapLatest$1 = new FlowKt__MergeKt$mapLatest$1(this.f17833d, interfaceC9324c);
        flowKt__MergeKt$mapLatest$1.f17831b = interfaceC9267d;
        flowKt__MergeKt$mapLatest$1.f17832c = obj;
        return flowKt__MergeKt$mapLatest$1.invokeSuspend(C8736p.f16368a);
    }
}
