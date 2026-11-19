package kotlinx.coroutines.flow;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p379vd.InterfaceC11595d;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", m26211f = "SharingStarted.kt", m26212l = {174, Opcodes.ARETURN, Opcodes.GETSTATIC, 179, Opcodes.PUTFIELD}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class StartedWhileSubscribed$command$1 extends SuspendLambda implements InterfaceC9545q {

    /* renamed from: c */
    public int f23868c;

    /* renamed from: d */
    public /* synthetic */ Object f23869d;

    /* renamed from: e */
    public /* synthetic */ int f23870e;

    /* renamed from: f */
    public final /* synthetic */ StartedWhileSubscribed f23871f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(StartedWhileSubscribed startedWhileSubscribed, InterfaceC11588c interfaceC11588c) {
        super(3, interfaceC11588c);
        this.f23871f = startedWhileSubscribed;
    }

    /* renamed from: g */
    public final Object m20867g(InterfaceC11595d interfaceC11595d, int i10, InterfaceC11588c interfaceC11588c) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.f23871f, interfaceC11588c);
        startedWhileSubscribed$command$1.f23869d = interfaceC11595d;
        startedWhileSubscribed$command$1.f23870e = i10;
        return startedWhileSubscribed$command$1.invokeSuspend(C10786q.f26013a);
    }

    @Override // p181hd.InterfaceC9545q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m20867g((InterfaceC11595d) obj, ((Number) obj2).intValue(), (InterfaceC11588c) obj3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r1.emit(r10, r9) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r1.emit(r10, r9) != r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[PHI: r1
      0x008e: PHI (r1v5 vd.d) = (r1v3 vd.d), (r1v4 vd.d), (r1v11 vd.d) binds: [B:25:0x006e, B:30:0x008b, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r9.f23868c
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L3c
            if (r1 == r6) goto L38
            if (r1 == r5) goto L30
            if (r1 == r4) goto L28
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            goto L38
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            java.lang.Object r1 = r9.f23869d
            vd.d r1 = (p379vd.InterfaceC11595d) r1
            kotlin.AbstractC9924b.m20071b(r10)
            goto L8e
        L28:
            java.lang.Object r1 = r9.f23869d
            vd.d r1 = (p379vd.InterfaceC11595d) r1
            kotlin.AbstractC9924b.m20071b(r10)
            goto L7d
        L30:
            java.lang.Object r1 = r9.f23869d
            vd.d r1 = (p379vd.InterfaceC11595d) r1
            kotlin.AbstractC9924b.m20071b(r10)
            goto L64
        L38:
            kotlin.AbstractC9924b.m20071b(r10)
            goto L9c
        L3c:
            kotlin.AbstractC9924b.m20071b(r10)
            java.lang.Object r10 = r9.f23869d
            r1 = r10
            vd.d r1 = (p379vd.InterfaceC11595d) r1
            int r10 = r9.f23870e
            if (r10 <= 0) goto L53
            kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.f23853c
            r9.f23868c = r6
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L9c
            goto L9b
        L53:
            kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.f23871f
            long r6 = kotlinx.coroutines.flow.StartedWhileSubscribed.m20866c(r10)
            r9.f23869d = r1
            r9.f23868c = r5
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.m20376b(r6, r9)
            if (r10 != r0) goto L64
            goto L9b
        L64:
            kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.f23871f
            long r5 = kotlinx.coroutines.flow.StartedWhileSubscribed.m20865b(r10)
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L8e
            kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.f23854d
            r9.f23869d = r1
            r9.f23868c = r4
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L7d
            goto L9b
        L7d:
            kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.f23871f
            long r4 = kotlinx.coroutines.flow.StartedWhileSubscribed.m20865b(r10)
            r9.f23869d = r1
            r9.f23868c = r3
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.m20376b(r4, r9)
            if (r10 != r0) goto L8e
            goto L9b
        L8e:
            kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.f23855e
            r3 = 0
            r9.f23869d = r3
            r9.f23868c = r2
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L9c
        L9b:
            return r0
        L9c:
            qc.q r10 = p309qc.C10786q.f26013a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
