package com.friday.login.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.blankj.utilcode.util.PathUtils;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.UserDao;
import com.friday.common.entity.EzyLoginRequest;
import com.friday.common.entity.LoginResp;
import com.friday.common.entity.User;
import com.friday.common.helper.C5962b;
import com.zykj.http.bean.HeaderBean;
import java.io.File;
import kotlin.jvm.internal.AbstractC9979u;
import p110d2.InterfaceC8919i;
import p215k2.C9797o;
import p379vd.InterfaceC11603l;
import sd.AbstractC11117h;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class LoginViewModel extends BaseViewModel {

    /* renamed from: b */
    public final InterfaceC8919i f9064b;

    /* renamed from: c */
    public final UserDao f9065c;

    /* renamed from: d */
    public final InterfaceC11603l f9066d;

    /* renamed from: e */
    public final MutableLiveData f9067e;

    /* renamed from: f */
    public final MutableLiveData f9068f;

    /* renamed from: g */
    public final MutableLiveData f9069g;

    /* renamed from: h */
    public final MutableLiveData f9070h;

    /* renamed from: i */
    public final MutableLiveData f9071i;

    public LoginViewModel(InterfaceC8919i service, UserDao userDao, InterfaceC11603l headerBeanFlow) {
        AbstractC9979u.m20294g(service, "service");
        AbstractC9979u.m20294g(userDao, "userDao");
        AbstractC9979u.m20294g(headerBeanFlow, "headerBeanFlow");
        this.f9064b = service;
        this.f9065c = userDao;
        this.f9066d = headerBeanFlow;
        this.f9067e = new MutableLiveData();
        this.f9068f = new MutableLiveData();
        this.f9069g = new MutableLiveData();
        this.f9070h = new MutableLiveData();
        this.f9071i = new MutableLiveData();
    }

    /* renamed from: i */
    public final void m6904i(String schoolCode, String account, String password) {
        AbstractC9979u.m20294g(schoolCode, "schoolCode");
        AbstractC9979u.m20294g(account, "account");
        AbstractC9979u.m20294g(password, "password");
        String strM19795a = C9797o.f22992a.m19795a(schoolCode, account);
        if (strM19795a == null) {
            strM19795a = "unknown";
        }
        BaseViewModel.m4802c(this, new LoginViewModel$ezyLogin$1(this, schoolCode, new EzyLoginRequest(schoolCode, account, password, strM19795a, "", 0, 32, null), account, null), new LoginViewModel$ezyLogin$2(this, null), null, 4, null);
    }

    /* renamed from: j */
    public final MutableLiveData m6905j() {
        return this.f9069g;
    }

    /* renamed from: k */
    public final MutableLiveData m6906k() {
        return this.f9070h;
    }

    /* renamed from: l */
    public final MutableLiveData m6907l() {
        return this.f9068f;
    }

    /* renamed from: m */
    public final MutableLiveData m6908m() {
        return this.f9071i;
    }

    /* renamed from: n */
    public final MutableLiveData m6909n() {
        return this.f9067e;
    }

    /* renamed from: o */
    public final void m6910o() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new LoginViewModel$sendSms$1(this, null), 3, null);
    }

    /* renamed from: p */
    public final User m6911p(LoginResp loginResp, String str, String str2) {
        C5962b.a aVar = C5962b.f6082a;
        aVar.m5299a().m5269G(loginResp.getAccessToken());
        aVar.m5299a().m5271I("");
        aVar.m5299a().m5273K(loginResp.getRoleType());
        aVar.m5299a().m5270H(loginResp.getUserId());
        aVar.m5299a().m5263A(str);
        String str3 = str2;
        aVar.m5299a().m5297y(str3);
        String externalAppDataPath = PathUtils.getExternalAppDataPath();
        String str4 = File.separator;
        String str5 = externalAppDataPath + str4 + "userNote" + str4 + loginResp.getUserId() + str4;
        aVar.m5299a().m5266D(str5 + "note" + str4);
        InterfaceC11603l interfaceC11603l = this.f9066d;
        while (true) {
            Object value = interfaceC11603l.getValue();
            C5962b.a aVar2 = C5962b.f6082a;
            if (interfaceC11603l.mo20870e(value, HeaderBean.copy$default((HeaderBean) value, null, null, aVar2.m5299a().m5290r(), aVar2.m5299a().m5291s(), null, 19, null))) {
                return new User(loginResp.getUserId(), str3, "", "", "", false, false, false, 224, null);
            }
            str3 = str2;
        }
    }

    /* renamed from: q */
    public final void m6912q(String schoolCode, String account, String password, String smsCode) {
        AbstractC9979u.m20294g(schoolCode, "schoolCode");
        AbstractC9979u.m20294g(account, "account");
        AbstractC9979u.m20294g(password, "password");
        AbstractC9979u.m20294g(smsCode, "smsCode");
        String strM19795a = C9797o.f22992a.m19795a(schoolCode, account);
        if (strM19795a == null) {
            strM19795a = "unknown";
        }
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new LoginViewModel$verifySmsCode$1(this, new EzyLoginRequest(schoolCode, account, password, strM19795a, smsCode, 0, 32, null), schoolCode, account, null), 3, null);
    }
}
