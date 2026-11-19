package com.zykj.lib.login.p062ui.teacher.sms;

import com.tencent.ijk.media.player.IjkMediaMeta;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.sms.SendSmsViewModel$verifyCode$1", m17801f = "SendSmsViewModel.kt", m17802l = {IjkMediaMeta.FF_PROFILE_H264_MAIN, 78}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SendSmsViewModel$verifyCode$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f10146a;

    /* renamed from: b */
    public int f10147b;

    /* renamed from: c */
    public int f10148c;

    /* renamed from: d */
    public final /* synthetic */ SendSmsViewModel f10149d;

    /* renamed from: e */
    public final /* synthetic */ String f10150e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendSmsViewModel$verifyCode$1(SendSmsViewModel sendSmsViewModel, String str, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f10149d = sendSmsViewModel;
        this.f10150e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SendSmsViewModel$verifyCode$1(this.f10149d, this.f10150e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SendSmsViewModel$verifyCode$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r4.f10148c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r4.f10146a
            com.zykj.lib.login.bean.LoginInfo r0 = (com.zykj.lib.login.bean.LoginInfo) r0
            kotlin.AbstractC9079b.m15926b(r5)
            goto L52
        L16:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1e:
            kotlin.AbstractC9079b.m15926b(r5)
            goto L36
        L22:
            kotlin.AbstractC9079b.m15926b(r5)
            com.zykj.lib.login.ui.teacher.sms.SendSmsViewModel r5 = r4.f10149d
            p3.a r5 = r5.m9406f()
            java.lang.String r1 = r4.f10150e
            r4.f10148c = r3
            java.lang.Object r5 = r5.mo10317f(r1, r4)
            if (r5 != r0) goto L36
            goto L51
        L36:
            com.zykj.lib.login.bean.LoginInfo r5 = (com.zykj.lib.login.bean.LoginInfo) r5
            if (r5 == 0) goto L52
            com.zykj.lib.login.ui.teacher.sms.SendSmsViewModel r1 = r4.f10149d
            l8.g r1 = com.zykj.lib.login.p062ui.teacher.sms.SendSmsViewModel.m9401a(r1)
            java.lang.Object r3 = p201o7.AbstractC9543h.m17814a(r5)
            r4.f10146a = r3
            r3 = 0
            r4.f10147b = r3
            r4.f10148c = r2
            java.lang.Object r5 = r1.emit(r5, r4)
            if (r5 != r0) goto L52
        L51:
            return r0
        L52:
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.lib.login.p062ui.teacher.sms.SendSmsViewModel$verifyCode$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/lib/login/ui/teacher/sms/SendSmsViewModel$verifyCode$1.smali:133
    }
}
