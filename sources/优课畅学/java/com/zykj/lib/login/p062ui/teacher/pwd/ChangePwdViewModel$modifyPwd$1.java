package com.zykj.lib.login.p062ui.teacher.pwd;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.pwd.ChangePwdViewModel$modifyPwd$1", m17801f = "ChangePwdViewModel.kt", m17802l = {62, 63, 66}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ChangePwdViewModel$modifyPwd$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f10055a;

    /* renamed from: b */
    public int f10056b;

    /* renamed from: c */
    public final /* synthetic */ ChangePwdViewModel f10057c;

    /* renamed from: d */
    public final /* synthetic */ String f10058d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePwdViewModel$modifyPwd$1(ChangePwdViewModel changePwdViewModel, String str, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f10057c = changePwdViewModel;
        this.f10058d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ChangePwdViewModel$modifyPwd$1(this.f10057c, this.f10058d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ChangePwdViewModel$modifyPwd$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (r1.emit(r3, r6) != r0) goto L26;
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
            int r1 = r6.f10056b
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L2b
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r0 = r6.f10055a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.AbstractC9079b.m15926b(r7)     // Catch: java.lang.Throwable -> L1a
            goto L63
        L1a:
            r7 = move-exception
            goto L96
        L1d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L25:
            kotlin.AbstractC9079b.m15926b(r7)     // Catch: java.lang.Throwable -> L29
            goto L63
        L29:
            r7 = move-exception
            goto L71
        L2b:
            kotlin.AbstractC9079b.m15926b(r7)     // Catch: java.lang.Throwable -> L29
            goto L50
        L2f:
            kotlin.AbstractC9079b.m15926b(r7)
            com.zykj.lib.login.ui.teacher.pwd.ChangePwdViewModel r7 = r6.f10057c
            com.kunminx.architecture.ui.callback.UnPeekLiveData r7 = r7.isDialogVisible()
            java.lang.Boolean r1 = p201o7.AbstractC9536a.m17796a(r5)
            r7.setValue(r1)
            com.zykj.lib.login.ui.teacher.pwd.ChangePwdViewModel r7 = r6.f10057c     // Catch: java.lang.Throwable -> L29
            p3.a r7 = r7.m9349f()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r6.f10058d     // Catch: java.lang.Throwable -> L29
            r6.f10056b = r5     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r7.mo10316e(r1, r6)     // Catch: java.lang.Throwable -> L29
            if (r7 != r0) goto L50
            goto L92
        L50:
            com.zykj.lib.login.ui.teacher.pwd.ChangePwdViewModel r7 = r6.f10057c     // Catch: java.lang.Throwable -> L29
            l8.g r7 = com.zykj.lib.login.p062ui.teacher.pwd.ChangePwdViewModel.m9344a(r7)     // Catch: java.lang.Throwable -> L29
            java.lang.Boolean r1 = p201o7.AbstractC9536a.m17796a(r5)     // Catch: java.lang.Throwable -> L29
            r6.f10056b = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r7.emit(r1, r6)     // Catch: java.lang.Throwable -> L29
            if (r7 != r0) goto L63
            goto L92
        L63:
            com.zykj.lib.login.ui.teacher.pwd.ChangePwdViewModel r7 = r6.f10057c
            com.kunminx.architecture.ui.callback.UnPeekLiveData r7 = r7.isDialogVisible()
            java.lang.Boolean r0 = p201o7.AbstractC9536a.m17796a(r4)
            r7.setValue(r0)
            goto L93
        L71:
            com.zykj.lib.login.ui.teacher.pwd.ChangePwdViewModel r1 = r6.f10057c     // Catch: java.lang.Throwable -> L1a
            com.kunminx.architecture.ui.callback.UnPeekLiveData r3 = r1.getToastLiveData()     // Catch: java.lang.Throwable -> L1a
            r1.handlerThrowable(r7, r3)     // Catch: java.lang.Throwable -> L1a
            com.zykj.lib.login.ui.teacher.pwd.ChangePwdViewModel r1 = r6.f10057c     // Catch: java.lang.Throwable -> L1a
            l8.g r1 = com.zykj.lib.login.p062ui.teacher.pwd.ChangePwdViewModel.m9344a(r1)     // Catch: java.lang.Throwable -> L1a
            java.lang.Boolean r3 = p201o7.AbstractC9536a.m17796a(r4)     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r7 = p201o7.AbstractC9543h.m17814a(r7)     // Catch: java.lang.Throwable -> L1a
            r6.f10055a = r7     // Catch: java.lang.Throwable -> L1a
            r6.f10056b = r2     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r7 = r1.emit(r3, r6)     // Catch: java.lang.Throwable -> L1a
            if (r7 != r0) goto L63
        L92:
            return r0
        L93:
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        L96:
            com.zykj.lib.login.ui.teacher.pwd.ChangePwdViewModel r0 = r6.f10057c
            com.kunminx.architecture.ui.callback.UnPeekLiveData r0 = r0.isDialogVisible()
            java.lang.Boolean r1 = p201o7.AbstractC9536a.m17796a(r4)
            r0.setValue(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.lib.login.p062ui.teacher.pwd.ChangePwdViewModel$modifyPwd$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/lib/login/ui/teacher/pwd/ChangePwdViewModel$modifyPwd$1.smali:132
    }
}
