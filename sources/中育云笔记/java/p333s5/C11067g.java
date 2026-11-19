package p333s5;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import p129e5.C9105b;
import p432z4.AbstractC12021a;

/* renamed from: s5.g */
/* loaded from: classes5.dex */
public class C11067g extends C9105b {

    /* renamed from: c */
    public static final String f26699c = "i";

    /* renamed from: b */
    public Context f26700b;

    public C11067g(Context context) {
        super(context, "push_client_self_info");
        this.f26700b = context;
    }

    /* renamed from: k */
    public static C11067g m24536k(Context context) {
        return new C11067g(context);
    }

    /* renamed from: j */
    public String m24537j(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return AbstractC12021a.m26612a(this.f26700b, m17894e(str));
        } catch (Exception e10) {
            HMSLog.m8725e(f26699c, "getSecureData" + e10.getMessage());
            return "";
        }
    }

    /* renamed from: l */
    public boolean m24538l(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return m17898i(str, AbstractC12021a.m26613b(this.f26700b, str2));
        } catch (Exception e10) {
            HMSLog.m8725e(f26699c, "saveSecureData" + e10.getMessage());
            return false;
        }
    }

    /* renamed from: m */
    public String m24539m(String str) {
        try {
            return TextUtils.isEmpty(str) ? m24537j("token_info_v2") : m24537j(str);
        } catch (Exception e10) {
            HMSLog.m8725e(f26699c, "getSecureData" + e10.getMessage());
            return "";
        }
    }

    /* renamed from: n */
    public boolean m24540n(String str, String str2) {
        try {
            return TextUtils.isEmpty(str) ? m24538l("token_info_v2", str2) : m24538l(str, str2);
        } catch (Exception e10) {
            HMSLog.m8725e(f26699c, "saveSecureData" + e10.getMessage());
            return false;
        }
    }
}
