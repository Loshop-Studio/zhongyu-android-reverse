package com.zykj.lib.login.p062ui.main;

import com.zykj.lib.login.proto.UserBean;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.main.LoginViewModel$setUserBean$2", m17801f = "LoginViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LoginViewModel$setUserBean$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f9937a;

    /* renamed from: b */
    public final /* synthetic */ UserBean f9938b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$setUserBean$2(UserBean userBean, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f9938b = userBean;
    }

    @Override // p300x7.InterfaceC10574p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(UserBean userBean, InterfaceC9324c interfaceC9324c) {
        return ((LoginViewModel$setUserBean$2) create(userBean, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new LoginViewModel$setUserBean$2(this.f9938b, interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f9937a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        return this.f9938b;
    }
}
