package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes5.dex */
public final class FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 implements InterfaceC9267d {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10574p f17841a;

    /* renamed from: b */
    public final /* synthetic */ Ref$ObjectRef f17842b;

    @InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", m17801f = "Reduce.kt", m17802l = {139}, m17803m = "emit")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 */
    public static final class C91811 extends ContinuationImpl {

        /* renamed from: a */
        public Object f17843a;

        /* renamed from: b */
        public /* synthetic */ Object f17844b;

        /* renamed from: c */
        public int f17845c;

        /* renamed from: e */
        public Object f17847e;

        public C91811(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f17844b = obj;
            this.f17845c |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.this.emit(null, this);
        }
    }

    public FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(InterfaceC10574p interfaceC10574p, Ref$ObjectRef ref$ObjectRef) {
        this.f17841a = interfaceC10574p;
        this.f17842b = ref$ObjectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p169l8.InterfaceC9267d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(java.lang.Object r5, p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.C91811
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.C91811) r0
            int r1 = r0.f17845c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17845c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f17844b
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f17845c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f17847e
            java.lang.Object r0 = r0.f17843a
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) r0
            kotlin.AbstractC9079b.m15926b(r6)
            goto L52
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.AbstractC9079b.m15926b(r6)
            x7.p r6 = r4.f17841a
            r0.f17843a = r4
            r0.f17847e = r5
            r0.f17845c = r3
            r2 = 6
            kotlin.jvm.internal.AbstractC9131s.m16126c(r2)
            java.lang.Object r6 = r6.invoke(r5, r0)
            r0 = 7
            kotlin.jvm.internal.AbstractC9131s.m16126c(r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r4
        L52:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L5d
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        L5d:
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f17842b
            r6.f17473a = r5
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.emit(java.lang.Object, m7.c):java.lang.Object");
    }
}
