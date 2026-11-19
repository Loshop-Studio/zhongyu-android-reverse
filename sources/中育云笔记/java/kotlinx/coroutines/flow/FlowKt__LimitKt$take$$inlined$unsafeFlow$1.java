package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p379vd.InterfaceC11594c;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1 implements InterfaceC11594c {

    /* renamed from: c */
    public final /* synthetic */ InterfaceC11594c f23709c;

    /* renamed from: d */
    public final /* synthetic */ int f23710d;

    @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", m26211f = "Limit.kt", m26212l = {112}, m26213m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 */
    public static final class C100181 extends ContinuationImpl {

        /* renamed from: c */
        public /* synthetic */ Object f23711c;

        /* renamed from: d */
        public int f23712d;

        /* renamed from: f */
        public Object f23714f;

        public C100181(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f23711c = obj;
            this.f23712d |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$take$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__LimitKt$take$$inlined$unsafeFlow$1(InterfaceC11594c interfaceC11594c, int i10) {
        this.f23709c = interfaceC11594c;
        this.f23710d = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p379vd.InterfaceC11594c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(p379vd.InterfaceC11595d r9, vc.InterfaceC11588c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.C100181
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.C100181) r0
            int r1 = r0.f23712d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23712d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f23711c
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23712d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r9 = r0.f23714f
            kotlin.AbstractC9924b.m20071b(r10)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L5d
        L2b:
            r10 = move-exception
            goto L5a
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            kotlin.AbstractC9924b.m20071b(r10)
            java.lang.Object r10 = new java.lang.Object
            r10.<init>()
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            vd.c r4 = r8.f23709c     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1 r5 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            int r6 = r8.f23710d     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r5.<init>(r2, r6, r9, r10)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r0.f23714f = r10     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r0.f23712d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            java.lang.Object r9 = r4.collect(r5, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            if (r9 != r1) goto L5d
            return r1
        L56:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L5a:
            p394wd.AbstractC11733h.m25964a(r10, r9)
        L5d:
            qc.q r9 = p309qc.C10786q.f26013a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1.collect(vd.d, vc.c):java.lang.Object");
    }
}
