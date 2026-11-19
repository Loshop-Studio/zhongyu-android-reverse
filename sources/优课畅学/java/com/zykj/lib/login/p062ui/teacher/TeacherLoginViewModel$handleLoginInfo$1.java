package com.zykj.lib.login.p062ui.teacher;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import com.tencent.smtt.sdk.TbsListener;
import com.zykj.lib.login.bean.LoginInfo;
import com.zykj.lib.login.proto.ServerBean;
import com.zykj.lib.login.proto.UserBean;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.TeacherLoginViewModel$handleLoginInfo$1", m17801f = "TeacherLoginViewModel.kt", m17802l = {96, 101, TbsListener.ErrorCode.DISK_FULL, 108, TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TeacherLoginViewModel$handleLoginInfo$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f9996a;

    /* renamed from: b */
    public int f9997b;

    /* renamed from: c */
    public final /* synthetic */ LoginInfo f9998c;

    /* renamed from: d */
    public final /* synthetic */ TeacherLoginViewModel f9999d;

    @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.TeacherLoginViewModel$handleLoginInfo$1$1", m17801f = "TeacherLoginViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.lib.login.ui.teacher.TeacherLoginViewModel$handleLoginInfo$1$1 */
    public static final class C73411 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f10000a;

        /* renamed from: b */
        public final /* synthetic */ TeacherLoginViewModel f10001b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C73411(TeacherLoginViewModel teacherLoginViewModel, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f10001b = teacherLoginViewModel;
        }

        @Override // p300x7.InterfaceC10574p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(UserBean userBean, InterfaceC9324c interfaceC9324c) {
            return ((C73411) create(userBean, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C73411(this.f10001b, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f10000a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return this.f10001b.m9318c().mo10315d();
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.teacher.TeacherLoginViewModel$handleLoginInfo$1$2", m17801f = "TeacherLoginViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.lib.login.ui.teacher.TeacherLoginViewModel$handleLoginInfo$1$2 */
    public static final class C73422 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f10002a;

        /* renamed from: b */
        public final /* synthetic */ TeacherLoginViewModel f10003b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C73422(TeacherLoginViewModel teacherLoginViewModel, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f10003b = teacherLoginViewModel;
        }

        @Override // p300x7.InterfaceC10574p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ServerBean serverBean, InterfaceC9324c interfaceC9324c) {
            return ((C73422) create(serverBean, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C73422(this.f10003b, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f10002a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return this.f10003b.m9318c().mo10314c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeacherLoginViewModel$handleLoginInfo$1(LoginInfo loginInfo, TeacherLoginViewModel teacherLoginViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f9998c = loginInfo;
        this.f9999d = teacherLoginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new TeacherLoginViewModel$handleLoginInfo$1(this.f9998c, this.f9999d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((TeacherLoginViewModel$handleLoginInfo$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r9.emit(r1, r8) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (r1.emit(r2, r8) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cb, code lost:
    
        if (r9.emit(r1, r8) != r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r8.f9997b
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L37
            if (r1 == r7) goto L33
            if (r1 == r6) goto L2f
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L25
            if (r1 != r3) goto L1d
            kotlin.AbstractC9079b.m15926b(r9)
            goto Lce
        L1d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L25:
            kotlin.AbstractC9079b.m15926b(r9)
            goto Lbb
        L2a:
            kotlin.AbstractC9079b.m15926b(r9)
            goto La5
        L2f:
            kotlin.AbstractC9079b.m15926b(r9)
            goto L8c
        L33:
            kotlin.AbstractC9079b.m15926b(r9)
            goto L65
        L37:
            kotlin.AbstractC9079b.m15926b(r9)
            com.zykj.lib.login.bean.LoginInfo r9 = r8.f9998c
            boolean r9 = r9.isTeacher()
            if (r9 != 0) goto L4c
            com.zykj.base.utils.XToastUtils r9 = com.zykj.base.utils.XToastUtils.INSTANCE
            int r0 = com.zykj.lib.login.R$string.student_center_login
            r9.warning(r0)
            h7.p r9 = p123h7.C8736p.f16368a
            return r9
        L4c:
            com.zykj.lib.login.bean.LoginInfo r9 = r8.f9998c
            boolean r9 = r9.getNeedSendSms()
            if (r9 == 0) goto L68
            com.zykj.lib.login.ui.teacher.TeacherLoginViewModel r9 = r8.f9999d
            l8.g r9 = com.zykj.lib.login.p062ui.teacher.TeacherLoginViewModel.m9316a(r9)
            com.zykj.lib.login.ui.teacher.a$b r1 = com.zykj.lib.login.p062ui.teacher.AbstractC7343a.b.f10010a
            r8.f9997b = r7
            java.lang.Object r9 = r9.emit(r1, r8)
            if (r9 != r0) goto L65
            goto Lcd
        L65:
            h7.p r9 = p123h7.C8736p.f16368a
            return r9
        L68:
            com.zykj.lib.login.bean.LoginInfo r9 = r8.f9998c
            boolean r9 = r9.getNeedChangePwd()
            if (r9 == 0) goto L8f
            com.zykj.lib.login.bean.LoginInfo r9 = r8.f9998c
            int r9 = r9.getPasswordStrength()
            com.zykj.lib.login.ui.teacher.TeacherLoginViewModel r1 = r8.f9999d
            l8.g r1 = com.zykj.lib.login.p062ui.teacher.TeacherLoginViewModel.m9316a(r1)
            com.zykj.lib.login.ui.teacher.a$a r2 = new com.zykj.lib.login.ui.teacher.a$a
            r2.<init>(r9)
            r8.f9996a = r9
            r8.f9997b = r6
            java.lang.Object r9 = r1.emit(r2, r8)
            if (r9 != r0) goto L8c
            goto Lcd
        L8c:
            h7.p r9 = p123h7.C8736p.f16368a
            return r9
        L8f:
            com.zykj.lib.login.ui.teacher.TeacherLoginViewModel r9 = r8.f9999d
            androidx.datastore.core.DataStore r9 = r9.m9323h()
            com.zykj.lib.login.ui.teacher.TeacherLoginViewModel$handleLoginInfo$1$1 r1 = new com.zykj.lib.login.ui.teacher.TeacherLoginViewModel$handleLoginInfo$1$1
            com.zykj.lib.login.ui.teacher.TeacherLoginViewModel r6 = r8.f9999d
            r1.<init>(r6, r2)
            r8.f9997b = r5
            java.lang.Object r9 = r9.updateData(r1, r8)
            if (r9 != r0) goto La5
            goto Lcd
        La5:
            com.zykj.lib.login.ui.teacher.TeacherLoginViewModel r9 = r8.f9999d
            androidx.datastore.core.DataStore r9 = r9.m9322g()
            com.zykj.lib.login.ui.teacher.TeacherLoginViewModel$handleLoginInfo$1$2 r1 = new com.zykj.lib.login.ui.teacher.TeacherLoginViewModel$handleLoginInfo$1$2
            com.zykj.lib.login.ui.teacher.TeacherLoginViewModel r5 = r8.f9999d
            r1.<init>(r5, r2)
            r8.f9997b = r4
            java.lang.Object r9 = r9.updateData(r1, r8)
            if (r9 != r0) goto Lbb
            goto Lcd
        Lbb:
            com.zykj.lib.login.ui.teacher.TeacherLoginViewModel r9 = r8.f9999d
            l8.g r9 = com.zykj.lib.login.p062ui.teacher.TeacherLoginViewModel.m9317b(r9)
            java.lang.Boolean r1 = p201o7.AbstractC9536a.m17796a(r7)
            r8.f9997b = r3
            java.lang.Object r9 = r9.emit(r1, r8)
            if (r9 != r0) goto Lce
        Lcd:
            return r0
        Lce:
            h7.p r9 = p123h7.C8736p.f16368a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.lib.login.p062ui.teacher.TeacherLoginViewModel$handleLoginInfo$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/lib/login/ui/teacher/TeacherLoginViewModel$handleLoginInfo$1.smali:135
    }
}
