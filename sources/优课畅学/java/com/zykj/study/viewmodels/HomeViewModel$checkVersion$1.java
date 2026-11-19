package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.HomeViewModel$checkVersion$1", m17801f = "HomeViewModel.kt", m17802l = {42, 45, 50}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class HomeViewModel$checkVersion$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f14190a;

    /* renamed from: b */
    public Object f14191b;

    /* renamed from: c */
    public int f14192c;

    /* renamed from: d */
    public int f14193d;

    /* renamed from: e */
    public final /* synthetic */ HomeViewModel f14194e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$checkVersion$1(HomeViewModel homeViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14194e = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new HomeViewModel$checkVersion$1(this.f14194e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((HomeViewModel$checkVersion$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        if (r4.emit(r11, r10) != r0) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r10.f14193d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L38
            if (r1 == r4) goto L34
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            java.lang.Object r0 = r10.f14191b
            com.zykj.lib.ota.bean.VersionInfo r0 = (com.zykj.lib.ota.bean.VersionInfo) r0
            java.lang.Object r0 = r10.f14190a
            com.zykj.lib.login.proto.UserBean r0 = (com.zykj.lib.login.proto.UserBean) r0
            kotlin.AbstractC9079b.m15926b(r11)     // Catch: java.lang.Exception -> Laa
            goto Laa
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            int r1 = r10.f14192c
            java.lang.Object r3 = r10.f14191b
            com.zykj.lib.login.proto.UserBean r3 = (com.zykj.lib.login.proto.UserBean) r3
            java.lang.Object r4 = r10.f14190a
            com.zykj.study.viewmodels.HomeViewModel r4 = (com.zykj.study.viewmodels.HomeViewModel) r4
            kotlin.AbstractC9079b.m15926b(r11)     // Catch: java.lang.Exception -> Laa
            goto L8d
        L34:
            kotlin.AbstractC9079b.m15926b(r11)
            goto L4e
        L38:
            kotlin.AbstractC9079b.m15926b(r11)
            com.zykj.study.viewmodels.HomeViewModel r11 = r10.f14194e
            androidx.datastore.core.DataStore r11 = r11.m12178e()
            l8.c r11 = r11.getData()
            r10.f14193d = r4
            java.lang.Object r11 = p169l8.AbstractC9268e.m17036z(r11, r10)
            if (r11 != r0) goto L4e
            goto La9
        L4e:
            com.zykj.lib.login.proto.UserBean r11 = (com.zykj.lib.login.proto.UserBean) r11
            if (r11 == 0) goto Laa
            com.zykj.study.viewmodels.HomeViewModel r1 = r10.f14194e
            java.lang.String r5 = r11.getId()
            java.lang.String r6 = "getId(...)"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r5, r6)
            int r5 = r5.length()
            if (r5 <= 0) goto Laa
            o4.k r5 = com.zykj.study.viewmodels.HomeViewModel.m12174a(r1)     // Catch: java.lang.Exception -> Laa
            java.lang.String r6 = "com.zhongyukejiao.learningexpert"
            com.zykj.lib.login.proto.RoleType r7 = r11.getRole()     // Catch: java.lang.Exception -> Laa
            com.zykj.lib.login.proto.RoleType r8 = com.zykj.lib.login.proto.RoleType.Student     // Catch: java.lang.Exception -> Laa
            r9 = 0
            if (r7 != r8) goto L73
            r4 = r9
        L73:
            r10.f14190a = r1     // Catch: java.lang.Exception -> Laa
            java.lang.Object r7 = p201o7.AbstractC9543h.m17814a(r11)     // Catch: java.lang.Exception -> Laa
            r10.f14191b = r7     // Catch: java.lang.Exception -> Laa
            r10.f14192c = r9     // Catch: java.lang.Exception -> Laa
            r10.f14193d = r3     // Catch: java.lang.Exception -> Laa
            r3 = 10103(0x2777, float:1.4157E-41)
            java.lang.Object r3 = r5.m17749a(r6, r3, r4, r10)     // Catch: java.lang.Exception -> Laa
            if (r3 != r0) goto L88
            goto La9
        L88:
            r4 = r3
            r3 = r11
            r11 = r4
            r4 = r1
            r1 = r9
        L8d:
            com.zykj.lib.ota.bean.VersionInfo r11 = (com.zykj.lib.ota.bean.VersionInfo) r11     // Catch: java.lang.Exception -> Laa
            l8.g r4 = r4.m12176c()     // Catch: java.lang.Exception -> Laa
            java.lang.Object r3 = p201o7.AbstractC9543h.m17814a(r3)     // Catch: java.lang.Exception -> Laa
            r10.f14190a = r3     // Catch: java.lang.Exception -> Laa
            java.lang.Object r3 = p201o7.AbstractC9543h.m17814a(r11)     // Catch: java.lang.Exception -> Laa
            r10.f14191b = r3     // Catch: java.lang.Exception -> Laa
            r10.f14192c = r1     // Catch: java.lang.Exception -> Laa
            r10.f14193d = r2     // Catch: java.lang.Exception -> Laa
            java.lang.Object r11 = r4.emit(r11, r10)     // Catch: java.lang.Exception -> Laa
            if (r11 != r0) goto Laa
        La9:
            return r0
        Laa:
            h7.p r11 = p123h7.C8736p.f16368a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.HomeViewModel$checkVersion$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/HomeViewModel$checkVersion$1.smali:127
    }
}
