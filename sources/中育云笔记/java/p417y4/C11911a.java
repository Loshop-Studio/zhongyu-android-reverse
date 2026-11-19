package p417y4;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.support.log.HMSLog;
import p031b5.C5165a;
import p043c5.C5401b;
import p129e5.AbstractC9104a;
import p129e5.C9105b;
import p333s5.AbstractC11061a;
import p333s5.AbstractC11064d;
import p333s5.AbstractC11066f;
import p333s5.AbstractC11069i;
import p333s5.C11065e;
import p333s5.C11067g;
import p385w4.AbstractC11704h;

/* renamed from: y4.a */
/* loaded from: classes5.dex */
public class C11911a {

    /* renamed from: d */
    public static final String f28223d = "HmsInstanceId";

    /* renamed from: a */
    public Context f28224a;

    /* renamed from: b */
    public C9105b f28225b;

    /* renamed from: c */
    public HuaweiApi f28226c;

    public C11911a(Context context) {
        this.f28224a = context.getApplicationContext();
        this.f28225b = new C9105b(context, "aaid");
        Api api = new Api(HuaweiApiAvailability.HMS_API_NAME_PUSH);
        if (context instanceof Activity) {
            this.f28226c = new HuaweiApi((Activity) context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, (AbstractClientBuilder) new C5401b());
        } else {
            this.f28226c = new HuaweiApi(context, (Api<Api.ApiOptions>) api, (Api.ApiOptions) null, new C5401b());
        }
        this.f28226c.setKitSdkVersion(61300300);
    }

    /* renamed from: f */
    public static C11911a m26438f(Context context) {
        Preconditions.checkNotNull(context);
        AbstractC11069i.m24553i(context);
        return new C11911a(context);
    }

    /* renamed from: a */
    public final String m26439a(TokenReq tokenReq, int i10) throws ApiException {
        C5165a.m2672b();
        m26441c(tokenReq.getSubjectId());
        String strM24532a = AbstractC11066f.m24532a(this.f28224a, "push.gettoken");
        try {
            HMSLog.m8722d(f28223d, "getToken req :" + tokenReq.toString());
            C11065e c11065e = new C11065e("push.gettoken", tokenReq, this.f28224a, strM24532a);
            c11065e.setApiLevel(i10);
            return ((TokenResult) AbstractC11704h.m25876a(this.f28226c.doWrite(c11065e))).getToken();
        } catch (Exception e10) {
            if (e10.getCause() instanceof ApiException) {
                ApiException apiException = (ApiException) e10.getCause();
                AbstractC11066f.m24534c(this.f28224a, "push.gettoken", strM24532a, apiException.getStatusCode());
                throw apiException;
            }
            Context context = this.f28224a;
            ErrorEnum errorEnum = ErrorEnum.ERROR_INTERNAL_ERROR;
            AbstractC11066f.m24535d(context, "push.gettoken", strM24532a, errorEnum);
            throw errorEnum.m8228f();
        }
    }

    /* renamed from: b */
    public final void m26440b() throws ApiException {
        if (AbstractC9104a.m17886e(this.f28224a)) {
            C5165a.m2672b();
            if (AbstractC9104a.m17888g(this.f28224a)) {
                return;
            }
            HMSLog.m8725e(f28223d, "Operations in child processes are not supported.");
            throw ErrorEnum.ERROR_OPER_IN_CHILD_PROCESS.m8228f();
        }
    }

    /* renamed from: c */
    public final void m26441c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!AbstractC11064d.m24527g(this.f28224a)) {
            C11067g.m24536k(this.f28224a).m17895f("subjectId");
            return;
        }
        String strM17894e = C11067g.m24536k(this.f28224a).m17894e("subjectId");
        if (TextUtils.isEmpty(strM17894e)) {
            C11067g.m24536k(this.f28224a).m17898i("subjectId", str);
            return;
        }
        if (strM17894e.contains(str)) {
            return;
        }
        C11067g.m24536k(this.f28224a).m17898i("subjectId", strM17894e + "," + str);
    }

    /* renamed from: d */
    public final void m26442d() throws ApiException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw ErrorEnum.ERROR_MAIN_THREAD.m8228f();
        }
    }

    /* renamed from: e */
    public String m26443e() {
        return AbstractC11061a.m24518c(this.f28224a);
    }

    /* renamed from: g */
    public String m26444g() {
        try {
            return m26445h(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    public String m26445h(String str, String str2) throws ApiException {
        m26442d();
        m26440b();
        TokenReq tokenReqM24516a = AbstractC11061a.m24516a(this.f28224a, null, str2);
        tokenReqM24516a.setAaid(m26443e());
        tokenReqM24516a.setMultiSender(false);
        C11067g.m24536k(this.f28224a).m17898i(this.f28224a.getPackageName(), "1");
        return m26439a(tokenReqM24516a, 1);
    }
}
