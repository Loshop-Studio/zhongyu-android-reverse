package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p365ud.InterfaceC11395j;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", m26211f = "Delay.kt", m26212l = {307, 309, 310}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class FlowKt__DelayKt$fixedPeriodTicker$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f23648c;

    /* renamed from: d */
    public /* synthetic */ Object f23649d;

    /* renamed from: e */
    public final /* synthetic */ long f23650e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$fixedPeriodTicker$1(long j10, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f23650e = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        FlowKt__DelayKt$fixedPeriodTicker$1 flowKt__DelayKt$fixedPeriodTicker$1 = new FlowKt__DelayKt$fixedPeriodTicker$1(this.f23650e, interfaceC11588c);
        flowKt__DelayKt$fixedPeriodTicker$1.f23649d = obj;
        return flowKt__DelayKt$fixedPeriodTicker$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[PHI: r1
      0x0050: PHI (r1v4 ud.j) = (r1v3 ud.j), (r1v8 ud.j) binds: [B:16:0x004d, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:15:0x003f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r7.f23648c
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            goto L22
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            java.lang.Object r1 = r7.f23649d
            ud.j r1 = (p365ud.InterfaceC11395j) r1
            kotlin.AbstractC9924b.m20071b(r8)
            goto L50
        L22:
            java.lang.Object r1 = r7.f23649d
            ud.j r1 = (p365ud.InterfaceC11395j) r1
            kotlin.AbstractC9924b.m20071b(r8)
            goto L3f
        L2a:
            kotlin.AbstractC9924b.m20071b(r8)
            java.lang.Object r8 = r7.f23649d
            r1 = r8
            ud.j r1 = (p365ud.InterfaceC11395j) r1
            long r5 = r7.f23650e
            r7.f23649d = r1
            r7.f23648c = r4
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m20376b(r5, r7)
            if (r8 != r0) goto L3f
            goto L5c
        L3f:
            kotlinx.coroutines.channels.f r8 = r1.getChannel()
            qc.q r4 = p309qc.C10786q.f26013a
            r7.f23649d = r1
            r7.f23648c = r3
            java.lang.Object r8 = r8.send(r4, r7)
            if (r8 != r0) goto L50
            goto L5c
        L50:
            long r4 = r7.f23650e
            r7.f23649d = r1
            r7.f23648c = r2
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m20376b(r4, r7)
            if (r8 != r0) goto L3f
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11395j interfaceC11395j, InterfaceC11588c interfaceC11588c) {
        return ((FlowKt__DelayKt$fixedPeriodTicker$1) create(interfaceC11395j, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
