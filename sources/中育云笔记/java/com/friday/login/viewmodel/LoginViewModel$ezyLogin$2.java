package com.friday.login.viewmodel;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.login.viewmodel.LoginViewModel$ezyLogin$2", m26211f = "LoginViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LoginViewModel$ezyLogin$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9082c;

    /* renamed from: d */
    public /* synthetic */ Object f9083d;

    /* renamed from: e */
    public final /* synthetic */ LoginViewModel f9084e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$ezyLogin$2(LoginViewModel loginViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9084e = loginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        LoginViewModel$ezyLogin$2 loginViewModel$ezyLogin$2 = new LoginViewModel$ezyLogin$2(this.f9084e, interfaceC11588c);
        loginViewModel$ezyLogin$2.f9083d = obj;
        return loginViewModel$ezyLogin$2;
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Throwable th, InterfaceC11588c interfaceC11588c) {
        return ((LoginViewModel$ezyLogin$2) create(th, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th = (Throwable) this.f9083d;
        AbstractC11725a.m25952f();
        if (this.f9082c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        AbstractC11958b.m26588i(String.valueOf(th.getMessage()));
        th.printStackTrace();
        this.f9084e.m6909n().setValue(AbstractC11826a.m26206a(false));
        return C10786q.f26013a;
    }
}
