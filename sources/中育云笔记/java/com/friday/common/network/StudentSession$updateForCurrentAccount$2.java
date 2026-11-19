package com.friday.common.network;

import com.taobao.sophix.PatchStatus;
import com.zykj.message.server.bean.ServerInfo;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.common.network.StudentSession$updateForCurrentAccount$2", m26211f = "StudentSession.kt", m26212l = {PatchStatus.CODE_LOAD_LIB_UNDEFINED, 103}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class StudentSession$updateForCurrentAccount$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f6138c;

    /* renamed from: d */
    public Object f6139d;

    /* renamed from: e */
    public Object f6140e;

    /* renamed from: f */
    public Object f6141f;

    /* renamed from: g */
    public int f6142g;

    /* renamed from: h */
    public int f6143h;

    /* renamed from: i */
    public int f6144i;

    /* renamed from: j */
    public final /* synthetic */ StudentSession f6145j;

    /* renamed from: k */
    public final /* synthetic */ ServerInfo f6146k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentSession$updateForCurrentAccount$2(StudentSession studentSession, ServerInfo serverInfo, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f6145j = studentSession;
        this.f6146k = serverInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new StudentSession$updateForCurrentAccount$2(this.f6145j, this.f6146k, interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0097 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0020, B:22:0x008f, B:24:0x0097, B:25:0x00b3), top: B:32:0x0020 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r14.f6144i
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L46
            if (r1 == r4) goto L32
            if (r1 != r3) goto L2a
            java.lang.Object r0 = r14.f6141f
            com.zykj.http.bean.HeaderBean r0 = (com.zykj.http.bean.HeaderBean) r0
            java.lang.Object r1 = r14.f6140e
            com.zykj.message.server.bean.ServerInfo r1 = (com.zykj.message.server.bean.ServerInfo) r1
            java.lang.Object r2 = r14.f6139d
            com.friday.common.network.StudentSession r2 = (com.friday.common.network.StudentSession) r2
            java.lang.Object r3 = r14.f6138c
            be.a r3 = (be.InterfaceC5189a) r3
            kotlin.AbstractC9924b.m20071b(r15)     // Catch: java.lang.Throwable -> L26
            r6 = r0
            goto L8f
        L26:
            r0 = move-exception
            r15 = r0
            goto Lbe
        L2a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L32:
            int r1 = r14.f6142g
            java.lang.Object r4 = r14.f6140e
            com.zykj.message.server.bean.ServerInfo r4 = (com.zykj.message.server.bean.ServerInfo) r4
            java.lang.Object r6 = r14.f6139d
            com.friday.common.network.StudentSession r6 = (com.friday.common.network.StudentSession) r6
            java.lang.Object r7 = r14.f6138c
            be.a r7 = (be.InterfaceC5189a) r7
            kotlin.AbstractC9924b.m20071b(r15)
            r15 = r1
            r1 = r4
            goto L69
        L46:
            kotlin.AbstractC9924b.m20071b(r15)
            com.friday.common.network.StudentSession r15 = r14.f6145j
            be.a r15 = com.friday.common.network.StudentSession.m5361e(r15)
            com.friday.common.network.StudentSession r1 = r14.f6145j
            com.zykj.message.server.bean.ServerInfo r6 = r14.f6146k
            r14.f6138c = r15
            r14.f6139d = r1
            r14.f6140e = r6
            r14.f6142g = r2
            r14.f6144i = r4
            java.lang.Object r4 = r15.lock(r5, r14)
            if (r4 != r0) goto L64
            goto L8b
        L64:
            r7 = r6
            r6 = r1
            r1 = r7
            r7 = r15
            r15 = r2
        L69:
            vd.l r4 = com.friday.common.network.StudentSession.m5360d(r6)     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> Lbb
            com.zykj.http.bean.HeaderBean r4 = (com.zykj.http.bean.HeaderBean) r4     // Catch: java.lang.Throwable -> Lbb
            hd.l r8 = com.friday.common.network.StudentSession.m5362f(r6)     // Catch: java.lang.Throwable -> Lbb
            r14.f6138c = r7     // Catch: java.lang.Throwable -> Lbb
            r14.f6139d = r6     // Catch: java.lang.Throwable -> Lbb
            r14.f6140e = r1     // Catch: java.lang.Throwable -> Lbb
            r14.f6141f = r4     // Catch: java.lang.Throwable -> Lbb
            r14.f6142g = r15     // Catch: java.lang.Throwable -> Lbb
            r14.f6143h = r2     // Catch: java.lang.Throwable -> Lbb
            r14.f6144i = r3     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r15 = r8.invoke(r14)     // Catch: java.lang.Throwable -> Lbb
            if (r15 != r0) goto L8c
        L8b:
            return r0
        L8c:
            r2 = r6
            r3 = r7
            r6 = r4
        L8f:
            java.lang.Boolean r15 = (java.lang.Boolean) r15     // Catch: java.lang.Throwable -> L26
            boolean r15 = r15.booleanValue()     // Catch: java.lang.Throwable -> L26
            if (r15 == 0) goto Lb3
            vd.l r15 = com.friday.common.network.StudentSession.m5360d(r2)     // Catch: java.lang.Throwable -> L26
            kotlin.jvm.internal.AbstractC9979u.m20291d(r1)     // Catch: java.lang.Throwable -> L26
            java.lang.String r9 = r1.m16566a()     // Catch: java.lang.Throwable -> L26
            java.lang.String r10 = r1.m16568c()     // Catch: java.lang.Throwable -> L26
            r12 = 19
            r13 = 0
            r7 = 0
            r8 = 0
            r11 = 0
            com.zykj.http.bean.HeaderBean r0 = com.zykj.http.bean.HeaderBean.copy$default(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L26
            r15.mo20870e(r6, r0)     // Catch: java.lang.Throwable -> L26
        Lb3:
            qc.q r15 = p309qc.C10786q.f26013a     // Catch: java.lang.Throwable -> L26
            r3.unlock(r5)
            qc.q r15 = p309qc.C10786q.f26013a
            return r15
        Lbb:
            r0 = move-exception
            r15 = r0
            r3 = r7
        Lbe:
            r3.unlock(r5)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.network.StudentSession$updateForCurrentAccount$2.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/network/StudentSession$updateForCurrentAccount$2.smali:141
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((StudentSession$updateForCurrentAccount$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
