package kotlinx.coroutines.flow;

import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9544p;
import p379vd.InterfaceC11595d;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public final class FlowKt__ReduceKt$first$$inlined$collectWhile$2 implements InterfaceC11595d {

    /* renamed from: c */
    public final /* synthetic */ InterfaceC9544p f23761c;

    /* renamed from: d */
    public final /* synthetic */ Ref$ObjectRef f23762d;

    @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", m26211f = "Reduce.kt", m26212l = {PatchStatus.CODE_LOAD_LIB_CPUABIS}, m26213m = "emit")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1 */
    public static final class C100231 extends ContinuationImpl {

        /* renamed from: c */
        public Object f23763c;

        /* renamed from: d */
        public /* synthetic */ Object f23764d;

        /* renamed from: e */
        public int f23765e;

        /* renamed from: g */
        public Object f23767g;

        public C100231(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f23764d = obj;
            this.f23765e |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt$first$$inlined$collectWhile$2.this.emit(null, this);
        }
    }

    public FlowKt__ReduceKt$first$$inlined$collectWhile$2(InterfaceC9544p interfaceC9544p, Ref$ObjectRef ref$ObjectRef) {
        this.f23761c = interfaceC9544p;
        this.f23762d = ref$ObjectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p379vd.InterfaceC11595d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(java.lang.Object r5, vc.InterfaceC11588c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2.C100231
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2.C100231) r0
            int r1 = r0.f23765e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23765e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f23764d
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23765e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f23767g
            java.lang.Object r0 = r0.f23763c
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2) r0
            kotlin.AbstractC9924b.m20071b(r6)
            goto L52
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.AbstractC9924b.m20071b(r6)
            hd.p r6 = r4.f23761c
            r0.f23763c = r4
            r0.f23767g = r5
            r0.f23765e = r3
            r2 = 6
            kotlin.jvm.internal.AbstractC9977s.m20287c(r2)
            java.lang.Object r6 = r6.invoke(r5, r0)
            r0 = 7
            kotlin.jvm.internal.AbstractC9977s.m20287c(r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r4
        L52:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L5d
            qc.q r5 = p309qc.C10786q.f26013a
            return r5
        L5d:
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f23762d
            r6.f23402c = r5
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2.emit(java.lang.Object, vc.c):java.lang.Object");
    }
}
