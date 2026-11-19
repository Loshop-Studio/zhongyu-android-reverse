package com.friday.login.viewmodel;

import com.friday.common.entity.SendSmsBean;
import com.taobao.sophix.PatchStatus;
import com.zykj.http.bean.ApiResp;
import com.zykj.http.bean.ErrorInfo;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p110d2.InterfaceC8919i;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.login.viewmodel.LoginViewModel$sendSms$1", m26211f = "LoginViewModel.kt", m26212l = {PatchStatus.CODE_LOAD_LIB_INJECT}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LoginViewModel$sendSms$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f9085c;

    /* renamed from: d */
    public Object f9086d;

    /* renamed from: e */
    public int f9087e;

    /* renamed from: f */
    public int f9088f;

    /* renamed from: g */
    public final /* synthetic */ LoginViewModel f9089g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$sendSms$1(LoginViewModel loginViewModel, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9089g = loginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new LoginViewModel$sendSms$1(this.f9089g, interfaceC11588c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LoginViewModel loginViewModel;
        String message;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9088f;
        try {
        } catch (Exception e10) {
            e10.printStackTrace();
            this.f9089g.m6906k().setValue(AbstractC11826a.m26206a(false));
        }
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            SendSmsBean sendSmsBean = (SendSmsBean) this.f9089g.m6907l().getValue();
            if (sendSmsBean != null) {
                LoginViewModel loginViewModel2 = this.f9089g;
                InterfaceC8919i interfaceC8919i = loginViewModel2.f9064b;
                SendSmsBean sendSmsBean2 = new SendSmsBean(sendSmsBean.getSchoolCode(), sendSmsBean.getUserId(), "", sendSmsBean.getSn());
                this.f9085c = loginViewModel2;
                this.f9086d = AbstractC11833h.m26224a(sendSmsBean);
                this.f9087e = 0;
                this.f9088f = 1;
                obj = interfaceC8919i.m17511d(sendSmsBean2, this);
                if (obj == objM25952f) {
                    return objM25952f;
                }
                loginViewModel = loginViewModel2;
            }
            return C10786q.f26013a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        loginViewModel = (LoginViewModel) this.f9085c;
        AbstractC9924b.m20071b(obj);
        ApiResp apiResp = (ApiResp) obj;
        loginViewModel.m6906k().setValue(AbstractC11826a.m26206a(apiResp.getSuccess()));
        if (!apiResp.getSuccess()) {
            ErrorInfo error = apiResp.getError();
            if (error == null || (message = error.getMessage()) == null) {
                message = "";
            }
            AbstractC11958b.m26588i(message);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((LoginViewModel$sendSms$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
