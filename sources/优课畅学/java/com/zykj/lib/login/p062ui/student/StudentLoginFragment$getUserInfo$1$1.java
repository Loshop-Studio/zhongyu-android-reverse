package com.zykj.lib.login.p062ui.student;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import androidx.databinding.library.baseAdapters.C3721BR;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.student.StudentLoginFragment$getUserInfo$1$1", m17801f = "StudentLoginFragment.kt", m17802l = {C3721BR.versionName, 66}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class StudentLoginFragment$getUserInfo$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f9950a;

    /* renamed from: b */
    public final /* synthetic */ StudentLoginFragment f9951b;

    /* renamed from: c */
    public final /* synthetic */ UserInfo f9952c;

    /* renamed from: d */
    public final /* synthetic */ ServerInfo f9953d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentLoginFragment$getUserInfo$1$1(StudentLoginFragment studentLoginFragment, UserInfo userInfo, ServerInfo serverInfo, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f9951b = studentLoginFragment;
        this.f9952c = userInfo;
        this.f9953d = serverInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new StudentLoginFragment$getUserInfo$1$1(this.f9951b, this.f9952c, this.f9953d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((StudentLoginFragment$getUserInfo$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b7, code lost:
    
        if (r7.m9297e(r1, r6) == r0) goto L18;
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
            int r1 = r6.f9950a
            java.lang.String r2 = "build(...)"
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            kotlin.AbstractC9079b.m15926b(r7)
            goto Lba
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.AbstractC9079b.m15926b(r7)
            goto L6c
        L21:
            kotlin.AbstractC9079b.m15926b(r7)
            com.zykj.lib.login.ui.student.StudentLoginFragment r7 = r6.f9951b
            com.zykj.lib.login.ui.main.LoginViewModel r7 = com.zykj.lib.login.p062ui.student.StudentLoginFragment.m9305i(r7)
            com.zykj.lib.login.proto.ServerBean$Builder r1 = com.zykj.lib.login.proto.ServerBean.newBuilder()
            com.zykj.message.server.bean.UserInfo r5 = r6.f9952c
            java.lang.String r5 = r5.m9606f()
            com.zykj.lib.login.proto.ServerBean$Builder r1 = r1.setSchoolCode(r5)
            com.zykj.message.server.bean.ServerInfo r5 = r6.f9953d
            java.lang.String r5 = r5.m9595a()
            com.zykj.lib.login.proto.ServerBean$Builder r1 = r1.setServerUrl(r5)
            com.zykj.message.server.bean.ServerInfo r5 = r6.f9953d
            java.lang.String r5 = r5.m9597d()
            com.zykj.lib.login.proto.ServerBean$Builder r1 = r1.setAccessToken(r5)
            com.zykj.message.server.bean.ServerInfo r5 = r6.f9953d
            java.lang.String r5 = r5.m9598f()
            if (r5 != 0) goto L56
            java.lang.String r5 = ""
        L56:
            com.zykj.lib.login.proto.ServerBean$Builder r1 = r1.setWebServerUrl(r5)
            com.google.protobuf.GeneratedMessageLite r1 = r1.build()
            kotlin.jvm.internal.AbstractC9133u.m16132f(r1, r2)
            com.zykj.lib.login.proto.ServerBean r1 = (com.zykj.lib.login.proto.ServerBean) r1
            r6.f9950a = r4
            java.lang.Object r7 = r7.m9296d(r1, r6)
            if (r7 != r0) goto L6c
            goto Lb9
        L6c:
            com.zykj.lib.login.ui.student.StudentLoginFragment r7 = r6.f9951b
            com.zykj.lib.login.ui.main.LoginViewModel r7 = com.zykj.lib.login.p062ui.student.StudentLoginFragment.m9305i(r7)
            com.zykj.lib.login.proto.UserBean$Builder r1 = com.zykj.lib.login.proto.UserBean.newBuilder()
            com.zykj.message.server.bean.UserInfo r4 = r6.f9952c
            java.lang.Long r4 = r4.m9603a()
            java.lang.String r4 = r4.toString()
            com.zykj.lib.login.proto.UserBean$Builder r1 = r1.setId(r4)
            com.zykj.message.server.bean.UserInfo r4 = r6.f9952c
            java.lang.String r4 = r4.m9607h()
            com.zykj.lib.login.proto.UserBean$Builder r1 = r1.setUserName(r4)
            com.zykj.message.server.bean.UserInfo r4 = r6.f9952c
            java.lang.String r4 = r4.m9605d()
            com.zykj.lib.login.proto.UserBean$Builder r1 = r1.setRealName(r4)
            com.zykj.message.server.bean.UserInfo r4 = r6.f9952c
            java.lang.String r4 = r4.m9604b()
            com.zykj.lib.login.proto.UserBean$Builder r1 = r1.setAvatar(r4)
            com.zykj.lib.login.proto.RoleType r4 = com.zykj.lib.login.proto.RoleType.Student
            com.zykj.lib.login.proto.UserBean$Builder r1 = r1.setRole(r4)
            com.google.protobuf.GeneratedMessageLite r1 = r1.build()
            kotlin.jvm.internal.AbstractC9133u.m16132f(r1, r2)
            com.zykj.lib.login.proto.UserBean r1 = (com.zykj.lib.login.proto.UserBean) r1
            r6.f9950a = r3
            java.lang.Object r7 = r7.m9297e(r1, r6)
            if (r7 != r0) goto Lba
        Lb9:
            return r0
        Lba:
            com.zykj.lib.login.ui.student.StudentLoginFragment r7 = r6.f9951b
            androidx.navigation.NavController r7 = androidx.navigation.fragment.FragmentKt.findNavController(r7)
            r7.navigateUp()
            h7.p r7 = p123h7.C8736p.f16368a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.lib.login.p062ui.student.StudentLoginFragment$getUserInfo$1$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/lib/login/ui/student/StudentLoginFragment$getUserInfo$1$1.smali:140
    }
}
