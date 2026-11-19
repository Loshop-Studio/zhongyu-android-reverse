package com.zykj.lib.login.p062ui.main;

import com.zykj.lib.login.proto.ServerBean;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.lib.login.ui.main.LoginViewModel$setServerBean$2", m17801f = "LoginViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LoginViewModel$setServerBean$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f9935a;

    /* renamed from: b */
    public final /* synthetic */ ServerBean f9936b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$setServerBean$2(ServerBean serverBean, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f9936b = serverBean;
    }

    @Override // p300x7.InterfaceC10574p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(ServerBean serverBean, InterfaceC9324c interfaceC9324c) {
        return ((LoginViewModel$setServerBean$2) create(serverBean, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new LoginViewModel$setServerBean$2(this.f9936b, interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f9935a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        return this.f9936b;
    }
}
