package kotlinx.coroutines.flow;

import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p181hd.InterfaceC9544p;
import p379vd.InterfaceC11595d;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public final class FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 implements InterfaceC11595d {

    /* renamed from: c */
    public final /* synthetic */ InterfaceC9544p f23721c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC11595d f23722d;

    @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", m26211f = "Limit.kt", m26212l = {PatchStatus.CODE_LOAD_LIB_CPUABIS, PatchStatus.CODE_LOAD_LIB_JSON}, m26213m = "emit")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1 */
    public static final class C100201 extends ContinuationImpl {

        /* renamed from: c */
        public Object f23723c;

        /* renamed from: d */
        public /* synthetic */ Object f23724d;

        /* renamed from: e */
        public int f23725e;

        /* renamed from: g */
        public Object f23727g;

        public C100201(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f23724d = obj;
            this.f23725e |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.this.emit(null, this);
        }
    }

    public FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1(InterfaceC9544p interfaceC9544p, InterfaceC11595d interfaceC11595d) {
        this.f23721c = interfaceC9544p;
        this.f23722d = interfaceC11595d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p379vd.InterfaceC11595d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(java.lang.Object r8, vc.InterfaceC11588c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.C100201
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.C100201) r0
            int r1 = r0.f23725e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23725e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f23724d
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23725e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r8 = r0.f23723c
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 r8 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) r8
            kotlin.AbstractC9924b.m20071b(r9)
            goto L7c
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.f23727g
            java.lang.Object r2 = r0.f23723c
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 r2 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) r2
            kotlin.AbstractC9924b.m20071b(r9)
            r6 = r9
            r9 = r8
            r8 = r2
            r2 = r6
            goto L63
        L46:
            kotlin.AbstractC9924b.m20071b(r9)
            hd.p r9 = r7.f23721c
            r0.f23723c = r7
            r0.f23727g = r8
            r0.f23725e = r4
            r2 = 6
            kotlin.jvm.internal.AbstractC9977s.m20287c(r2)
            java.lang.Object r9 = r9.invoke(r8, r0)
            r2 = 7
            kotlin.jvm.internal.AbstractC9977s.m20287c(r2)
            if (r9 != r1) goto L60
            goto L7a
        L60:
            r2 = r9
            r9 = r8
            r8 = r7
        L63:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L7b
            vd.d r2 = r8.f23722d
            r0.f23723c = r8
            r5 = 0
            r0.f23727g = r5
            r0.f23725e = r3
            java.lang.Object r9 = r2.emit(r9, r0)
            if (r9 != r1) goto L7c
        L7a:
            return r1
        L7b:
            r4 = 0
        L7c:
            if (r4 == 0) goto L81
            qc.q r8 = p309qc.C10786q.f26013a
            return r8
        L81:
            kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.emit(java.lang.Object, vc.c):java.lang.Object");
    }
}
