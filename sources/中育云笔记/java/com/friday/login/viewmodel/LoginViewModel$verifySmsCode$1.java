package com.friday.login.viewmodel;

import com.alibaba.fastjson.asm.Opcodes;
import com.blankj.utilcode.util.AppUtils;
import com.friday.common.dao.UserDao;
import com.friday.common.entity.ErrorRemote;
import com.friday.common.entity.EzyLoginRequest;
import com.friday.common.entity.LoginResp;
import com.friday.common.entity.TokenResponse;
import com.friday.common.entity.User;
import com.friday.common.helper.C5961a;
import com.friday.login.R$string;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p110d2.InterfaceC8919i;
import p126e2.C9072a;
import p141f2.C9166c;
import p181hd.InterfaceC9544p;
import p215k2.C9797o;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.login.viewmodel.LoginViewModel$verifySmsCode$1", m26211f = "LoginViewModel.kt", m26212l = {Opcodes.IF_ICMPGE, Opcodes.NEWARRAY}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class LoginViewModel$verifySmsCode$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f9090c;

    /* renamed from: d */
    public Object f9091d;

    /* renamed from: e */
    public boolean f9092e;

    /* renamed from: f */
    public int f9093f;

    /* renamed from: g */
    public final /* synthetic */ LoginViewModel f9094g;

    /* renamed from: h */
    public final /* synthetic */ EzyLoginRequest f9095h;

    /* renamed from: i */
    public final /* synthetic */ String f9096i;

    /* renamed from: j */
    public final /* synthetic */ String f9097j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel$verifySmsCode$1(LoginViewModel loginViewModel, EzyLoginRequest ezyLoginRequest, String str, String str2, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9094g = loginViewModel;
        this.f9095h = ezyLoginRequest;
        this.f9096i = str;
        this.f9097j = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new LoginViewModel$verifySmsCode$1(this.f9094g, this.f9095h, this.f9096i, this.f9097j, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        Exception exc;
        LoginViewModel$verifySmsCode$1 loginViewModel$verifySmsCode$1;
        String message;
        String clientCode;
        TokenResponse tokenResponse;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9093f;
        try {
        } catch (Exception e10) {
            exc = e10;
            loginViewModel$verifySmsCode$1 = this;
        }
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            try {
                if (!C9166c.f21406a.m18061e()) {
                    this.f9094g.m6909n().setValue(AbstractC11826a.m26206a(false));
                    AbstractC11958b.m26587h(R$string.connect_network_please);
                    return C10786q.f26013a;
                }
                InterfaceC8919i interfaceC8919i = this.f9094g.f9064b;
                EzyLoginRequest ezyLoginRequest = this.f9095h;
                String appPackageName = AppUtils.getAppPackageName();
                AbstractC9979u.m20293f(appPackageName, "getAppPackageName(...)");
                int appVersionCode = AppUtils.getAppVersionCode();
                String strM19795a = C9797o.f22992a.m19795a(this.f9096i, this.f9097j);
                if (strM19795a == null) {
                    strM19795a = "unknown";
                }
                String str = strM19795a;
                this.f9093f = 1;
                loginViewModel$verifySmsCode$1 = this;
                try {
                    obj = interfaceC8919i.m17510c(ezyLoginRequest, appPackageName, appVersionCode, str, loginViewModel$verifySmsCode$1);
                    if (obj == objM25952f) {
                    }
                    return objM25952f;
                } catch (Exception e11) {
                    e = e11;
                    exc = e;
                    exc.printStackTrace();
                    loginViewModel$verifySmsCode$1.f9094g.m6908m().setValue(AbstractC11826a.m26206a(false));
                    return C10786q.f26013a;
                }
            } catch (Exception e12) {
                e = e12;
                loginViewModel$verifySmsCode$1 = this;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tokenResponse = (TokenResponse) this.f9090c;
                AbstractC9924b.m20071b(obj);
                loginViewModel$verifySmsCode$1 = this;
                C5961a c5961a = C5961a.f6080a;
                LoginResp result = tokenResponse.getResult();
                AbstractC9979u.m20291d(result);
                c5961a.m5260b(result.getUserId());
                loginViewModel$verifySmsCode$1.f9094g.m6908m().setValue(AbstractC11826a.m26206a(true));
                return C10786q.f26013a;
            }
            AbstractC9924b.m20071b(obj);
            loginViewModel$verifySmsCode$1 = this;
        }
        TokenResponse tokenResponse2 = (TokenResponse) obj;
        if (!tokenResponse2.getSuccess()) {
            ErrorRemote error = tokenResponse2.getError();
            if (error != null && (message = error.getMessage()) != null) {
                AbstractC11958b.m26588i(message);
            }
            loginViewModel$verifySmsCode$1.f9094g.m6908m().setValue(AbstractC11826a.m26206a(false));
            return C10786q.f26013a;
        }
        LoginResp result2 = tokenResponse2.getResult();
        if (result2 != null && result2.getRoleType() == 1) {
            loginViewModel$verifySmsCode$1.f9094g.m6905j().setValue(new C9072a(AbstractC11826a.m26206a(true)));
            AbstractC11958b.m26587h(R$string.login_role_type_error);
            return C10786q.f26013a;
        }
        C9797o c9797o = C9797o.f22992a;
        String str2 = loginViewModel$verifySmsCode$1.f9096i;
        String str3 = loginViewModel$verifySmsCode$1.f9097j;
        LoginResp result3 = tokenResponse2.getResult();
        if (result3 == null || (clientCode = result3.getClientCode()) == null) {
            clientCode = "";
        }
        boolean zM19797c = c9797o.m19797c(str2, str3, clientCode);
        if (zM19797c) {
            loginViewModel$verifySmsCode$1.f9094g.m6909n().setValue(AbstractC11826a.m26206a(true));
        } else {
            AbstractC11958b.m26588i("保存设备码失败");
            loginViewModel$verifySmsCode$1.f9094g.m6908m().setValue(AbstractC11826a.m26206a(false));
        }
        if (tokenResponse2.getResult() == null) {
            throw new Exception("获取用户信息失败");
        }
        LoginViewModel loginViewModel = loginViewModel$verifySmsCode$1.f9094g;
        LoginResp result4 = tokenResponse2.getResult();
        AbstractC9979u.m20291d(result4);
        User userM6911p = loginViewModel.m6911p(result4, loginViewModel$verifySmsCode$1.f9096i, loginViewModel$verifySmsCode$1.f9097j);
        UserDao userDao = loginViewModel$verifySmsCode$1.f9094g.f9065c;
        loginViewModel$verifySmsCode$1.f9090c = tokenResponse2;
        loginViewModel$verifySmsCode$1.f9091d = AbstractC11833h.m26224a(userM6911p);
        loginViewModel$verifySmsCode$1.f9092e = zM19797c;
        loginViewModel$verifySmsCode$1.f9093f = 2;
        if (userDao.mo5211h(userM6911p, this) != objM25952f) {
            tokenResponse = tokenResponse2;
            C5961a c5961a2 = C5961a.f6080a;
            LoginResp result5 = tokenResponse.getResult();
            AbstractC9979u.m20291d(result5);
            c5961a2.m5260b(result5.getUserId());
            loginViewModel$verifySmsCode$1.f9094g.m6908m().setValue(AbstractC11826a.m26206a(true));
            return C10786q.f26013a;
        }
        return objM25952f;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((LoginViewModel$verifySmsCode$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
