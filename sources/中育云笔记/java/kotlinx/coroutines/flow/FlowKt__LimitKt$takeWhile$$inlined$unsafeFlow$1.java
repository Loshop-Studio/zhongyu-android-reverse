package kotlinx.coroutines.flow;

import androidx.compose.material3.MenuKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p181hd.InterfaceC9544p;
import p379vd.InterfaceC11594c;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public final class FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 implements InterfaceC11594c {

    /* renamed from: c */
    public final /* synthetic */ InterfaceC11594c f23715c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC9544p f23716d;

    @InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", m26211f = "Limit.kt", m26212l = {MenuKt.InTransitionDuration}, m26213m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 */
    public static final class C100191 extends ContinuationImpl {

        /* renamed from: c */
        public /* synthetic */ Object f23717c;

        /* renamed from: d */
        public int f23718d;

        /* renamed from: f */
        public Object f23720f;

        public C100191(InterfaceC11588c interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f23717c = obj;
            this.f23718d |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(InterfaceC11594c interfaceC11594c, InterfaceC9544p interfaceC9544p) {
        this.f23715c = interfaceC11594c;
        this.f23716d = interfaceC9544p;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p379vd.InterfaceC11594c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(p379vd.InterfaceC11595d r6, vc.InterfaceC11588c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.C100191
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.C100191) r0
            int r1 = r0.f23718d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23718d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f23717c
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f23718d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f23720f
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 r6 = (kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) r6
            kotlin.AbstractC9924b.m20071b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L5a
        L2d:
            r7 = move-exception
            goto L50
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.AbstractC9924b.m20071b(r7)
            vd.c r7 = r5.f23715c
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 r2 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1
            hd.p r4 = r5.f23716d
            r2.<init>(r4, r6)
            r0.f23720f = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            r0.f23718d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            java.lang.Object r6 = r7.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            if (r6 != r1) goto L5a
            return r1
        L4e:
            r7 = move-exception
            r6 = r2
        L50:
            p394wd.AbstractC11733h.m25964a(r7, r6)
            kotlin.coroutines.d r6 = r0.getContext()
            sd.AbstractC11147o1.m24775i(r6)
        L5a:
            qc.q r6 = p309qc.C10786q.f26013a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.collect(vd.d, vc.c):java.lang.Object");
    }
}
