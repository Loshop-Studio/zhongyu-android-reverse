package com.zykj.study.provide;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.zykj.lib.login.proto.ServerBean;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.bean.ClientCodeLiveData;
import com.zykj.study.bean.UpdatePwdReq;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.C8356e;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.C8843i0;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p198o4.InterfaceC9518a;
import p198o4.InterfaceC9522e;
import p208p3.InterfaceC9643a;

/* loaded from: classes3.dex */
public final class AccountRepositoryImp implements InterfaceC9643a {

    /* renamed from: a */
    public final InterfaceC9518a f11244a;

    /* renamed from: b */
    public final InterfaceC9522e f11245b;

    /* renamed from: c */
    public final InterfaceC9271h f11246c;

    /* renamed from: d */
    public final ClientCodeLiveData f11247d;

    /* renamed from: e */
    public UserBean f11248e;

    /* renamed from: f */
    public ServerBean f11249f;

    /* renamed from: g */
    public String f11250g;

    /* renamed from: h */
    public String f11251h;

    /* renamed from: i */
    public String f11252i;

    public AccountRepositoryImp(InterfaceC9518a accountApi, InterfaceC9522e gatewayService, InterfaceC9271h headerBeanFlow, ClientCodeLiveData clientCodeLiveData) {
        AbstractC9133u.m16133g(accountApi, "accountApi");
        AbstractC9133u.m16133g(gatewayService, "gatewayService");
        AbstractC9133u.m16133g(headerBeanFlow, "headerBeanFlow");
        AbstractC9133u.m16133g(clientCodeLiveData, "clientCodeLiveData");
        this.f11244a = accountApi;
        this.f11245b = gatewayService;
        this.f11246c = headerBeanFlow;
        this.f11247d = clientCodeLiveData;
        UserBean defaultInstance = UserBean.getDefaultInstance();
        AbstractC9133u.m16132f(defaultInstance, "getDefaultInstance(...)");
        this.f11248e = defaultInstance;
        ServerBean defaultInstance2 = ServerBean.getDefaultInstance();
        AbstractC9133u.m16132f(defaultInstance2, "getDefaultInstance(...)");
        this.f11249f = defaultInstance2;
        this.f11250g = "";
        this.f11251h = "";
        this.f11252i = "";
    }

    @Override // p208p3.InterfaceC9643a
    /* renamed from: a */
    public String mo10312a() {
        return this.f11250g;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e2  */
    @Override // p208p3.InterfaceC9643a
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo10313b(java.lang.String r30, java.lang.String r31, java.lang.String r32, p179m7.InterfaceC9324c r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.provide.AccountRepositoryImp.mo10313b(java.lang.String, java.lang.String, java.lang.String, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/provide/AccountRepositoryImp.smali:183
    }

    @Override // p208p3.InterfaceC9643a
    /* renamed from: c */
    public ServerBean mo10314c() {
        return this.f11249f;
    }

    @Override // p208p3.InterfaceC9643a
    /* renamed from: d */
    public UserBean mo10315d() {
        return this.f11248e;
    }

    @Override // p208p3.InterfaceC9643a
    /* renamed from: e */
    public Object mo10316e(String str, InterfaceC9324c interfaceC9324c) {
        Object objM17681c = this.f11244a.m17681c(new UpdatePwdReq(this.f11251h, str), interfaceC9324c);
        return objM17681c == AbstractC9434a.m17291f() ? objM17681c : C8736p.f16368a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // p208p3.InterfaceC9643a
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo10317f(java.lang.String r28, p179m7.InterfaceC9324c r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.provide.AccountRepositoryImp.mo10317f(java.lang.String, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/provide/AccountRepositoryImp.smali:1917
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p208p3.InterfaceC9643a
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo10318g(p179m7.InterfaceC9324c r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.zykj.study.provide.AccountRepositoryImp$sendSms$1
            if (r0 == 0) goto L13
            r0 = r12
            com.zykj.study.provide.AccountRepositoryImp$sendSms$1 r0 = (com.zykj.study.provide.AccountRepositoryImp$sendSms$1) r0
            int r1 = r0.f11270c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11270c = r1
            goto L18
        L13:
            com.zykj.study.provide.AccountRepositoryImp$sendSms$1 r0 = new com.zykj.study.provide.AccountRepositoryImp$sendSms$1
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f11268a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11270c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r12)
            goto L68
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L31:
            kotlin.AbstractC9079b.m15926b(r12)
            o4.a r12 = r11.f11244a
            com.zykj.study.bean.SmsReq r4 = new com.zykj.study.bean.SmsReq
            long r5 = p086e5.AbstractC8365n.m13647a()
            e5.h r2 = p086e5.C8359h.f15883a
            java.lang.String r8 = r2.m13627a()
            r9 = 2
            r10 = 0
            r7 = 0
            r4.<init>(r5, r7, r8, r9, r10)
            com.zykj.lib.login.proto.ServerBean r2 = r11.f11249f
            java.lang.String r2 = r2.getAccessToken()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Bearer "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r0.f11270c = r3
            java.lang.Object r12 = r12.m17679a(r4, r2, r0)
            if (r12 != r1) goto L68
            return r1
        L68:
            com.zykj.http.bean.ApiResp r12 = (com.zykj.http.bean.ApiResp) r12
            boolean r0 = r12.getSuccess()
            if (r0 != 0) goto L9a
            com.zykj.http.exception.RemoteCodeException r0 = new com.zykj.http.exception.RemoteCodeException
            com.zykj.lib.error.code.ErrorCodeInfo r1 = new com.zykj.lib.error.code.ErrorCodeInfo
            com.zykj.http.bean.ErrorInfo r2 = r12.getError()
            if (r2 == 0) goto L7f
            int r2 = r2.getCode()
            goto L80
        L7f:
            r2 = 0
        L80:
            com.zykj.http.bean.ErrorInfo r12 = r12.getError()
            if (r12 == 0) goto L8c
            java.lang.String r12 = r12.getMessage()
        L8a:
            r5 = r12
            goto L8e
        L8c:
            r12 = 0
            goto L8a
        L8e:
            r6 = 4
            r7 = 0
            java.lang.String r3 = "验证码发送失败"
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            throw r0
        L9a:
            java.lang.Boolean r12 = p201o7.AbstractC9536a.m17796a(r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.provide.AccountRepositoryImp.mo10318g(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/provide/AccountRepositoryImp.smali:3256
    }

    /* renamed from: i */
    public final Object m10319i(String str, String str2, InterfaceC9324c interfaceC9324c) {
        String str3 = this.f11252i;
        if (str3.length() != 0) {
            return str3;
        }
        Object objM14848g = AbstractC8833f.m14848g(C8843i0.m14867b(), new AccountRepositoryImp$getDeviceId$2$1(str, str2, null), interfaceC9324c);
        return objM14848g == AbstractC9434a.m17291f() ? objM14848g : (String) objM14848g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10320j(p179m7.InterfaceC9324c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.zykj.study.provide.AccountRepositoryImp$getUserInfo$1
            if (r0 == 0) goto L13
            r0 = r9
            com.zykj.study.provide.AccountRepositoryImp$getUserInfo$1 r0 = (com.zykj.study.provide.AccountRepositoryImp$getUserInfo$1) r0
            int r1 = r0.f11258c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11258c = r1
            goto L18
        L13:
            com.zykj.study.provide.AccountRepositoryImp$getUserInfo$1 r0 = new com.zykj.study.provide.AccountRepositoryImp$getUserInfo$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f11256a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f11258c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            kotlin.AbstractC9079b.m15926b(r9)
            o4.a r9 = r8.f11244a
            r0.f11258c = r3
            java.lang.Object r9 = r9.m17680b(r0)
            if (r9 != r1) goto L3f
            return r1
        L3f:
            com.zykj.study.bean.UserResponse r9 = (com.zykj.study.bean.UserResponse) r9
            int r0 = r9.getCode()
            if (r0 != 0) goto L52
            com.zykj.study.bean.UserInfo r0 = r9.getResult()
            if (r0 == 0) goto L52
            com.zykj.study.bean.UserInfo r9 = r9.getResult()
            return r9
        L52:
            com.zykj.http.exception.RemoteCodeException r0 = new com.zykj.http.exception.RemoteCodeException
            com.zykj.lib.error.code.ErrorCodeInfo r1 = new com.zykj.lib.error.code.ErrorCodeInfo
            int r2 = r9.getCode()
            java.lang.String r5 = r9.getMessage()
            r6 = 4
            r7 = 0
            java.lang.String r3 = "用户信息获取失败"
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.provide.AccountRepositoryImp.m10320j(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/provide/AccountRepositoryImp.smali:3676
    }

    /* renamed from: k */
    public final void m10321k(String str, boolean z10) {
        C8356e c8356e = C8356e.f15876a;
        c8356e.m13623e(str);
        String str2 = AbstractC9133u.m16128b(str, "dev") ? "http://ykcx-pad-dev.xxg.zyyx.cc:8010/" : z10 ? "https://ykcx-pad.zyai.cc/" : "http://ykcx-pad.school.zykj.org/";
        c8356e.m13623e(str);
        c8356e.m13624f(str2);
    }
}
