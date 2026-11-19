package com.zykj.lib.login.p062ui.main;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import com.zykj.lib.login.proto.ServerBean;
import com.zykj.lib.login.proto.UserBean;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.main.LoginViewModel$exitLogin$1", m17801f = "LoginViewModel.kt", m17802l = {36, 44}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LoginViewModel$exitLogin$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f9929a;

    /* renamed from: b */
    public final /* synthetic */ LoginViewModel f9930b;

    @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.main.LoginViewModel$exitLogin$1$1", m17801f = "LoginViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.lib.login.ui.main.LoginViewModel$exitLogin$1$1 */
    public static final class C73321 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f9931a;

        /* renamed from: b */
        public /* synthetic */ Object f9932b;

        public C73321(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ServerBean serverBean, InterfaceC9324c interfaceC9324c) {
            return ((C73321) create(serverBean, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C73321 c73321 = new C73321(interfaceC9324c);
            c73321.f9932b = obj;
            return c73321;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ServerBean serverBean = (ServerBean) this.f9932b;
            AbstractC9434a.m17291f();
            if (this.f9931a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            ServerBean serverBeanBuild = serverBean.toBuilder().clearServerUrl().clearAccessToken().clearRefreshToken().clearWebServerUrl().build();
            AbstractC9133u.m16132f(serverBeanBuild, "build(...)");
            return serverBeanBuild;
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.main.LoginViewModel$exitLogin$1$2", m17801f = "LoginViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.lib.login.ui.main.LoginViewModel$exitLogin$1$2 */
    public static final class C73332 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f9933a;

        /* renamed from: b */
        public /* synthetic */ Object f9934b;

        public C73332(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(UserBean userBean, InterfaceC9324c interfaceC9324c) {
            return ((C73332) create(userBean, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C73332 c73332 = new C73332(interfaceC9324c);
            c73332.f9934b = obj;
            return c73332;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            UserBean userBean = (UserBean) this.f9934b;
            AbstractC9434a.m17291f();
            if (this.f9933a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            UserBean userBeanBuild = userBean.toBuilder().clearId().clearAvatar().clearRealName().clearRole().build();
            AbstractC9133u.m16132f(userBeanBuild, "build(...)");
            return userBeanBuild;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$exitLogin$1(LoginViewModel loginViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f9930b = loginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new LoginViewModel$exitLogin$1(this.f9930b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((LoginViewModel$exitLogin$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r6.updateData(r1, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r5.f9929a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            kotlin.AbstractC9079b.m15926b(r6)
            goto L4a
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            kotlin.AbstractC9079b.m15926b(r6)
            goto L36
        L1f:
            kotlin.AbstractC9079b.m15926b(r6)
            com.zykj.lib.login.ui.main.LoginViewModel r6 = r5.f9930b
            androidx.datastore.core.DataStore r6 = r6.m9294b()
            com.zykj.lib.login.ui.main.LoginViewModel$exitLogin$1$1 r1 = new com.zykj.lib.login.ui.main.LoginViewModel$exitLogin$1$1
            r1.<init>(r2)
            r5.f9929a = r4
            java.lang.Object r6 = r6.updateData(r1, r5)
            if (r6 != r0) goto L36
            goto L49
        L36:
            com.zykj.lib.login.ui.main.LoginViewModel r6 = r5.f9930b
            androidx.datastore.core.DataStore r6 = r6.m9295c()
            com.zykj.lib.login.ui.main.LoginViewModel$exitLogin$1$2 r1 = new com.zykj.lib.login.ui.main.LoginViewModel$exitLogin$1$2
            r1.<init>(r2)
            r5.f9929a = r3
            java.lang.Object r6 = r6.updateData(r1, r5)
            if (r6 != r0) goto L4a
        L49:
            return r0
        L4a:
            h7.p r6 = p123h7.C8736p.f16368a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.lib.login.p062ui.main.LoginViewModel$exitLogin$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/优课畅学/smali_classes4/com/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1.smali:120
    }
}
