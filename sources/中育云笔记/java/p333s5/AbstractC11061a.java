package p333s5;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.utils.Util;
import java.util.UUID;
import p129e5.C9105b;
import p332s4.AbstractC11057a;

/* renamed from: s5.a */
/* loaded from: classes5.dex */
public abstract class AbstractC11061a {
    /* renamed from: a */
    public static TokenReq m24516a(Context context, String str, String str2) {
        return m24517b(context, str, null, null, str2);
    }

    /* renamed from: b */
    public static TokenReq m24517b(Context context, String str, String str2, String str3, String str4) {
        TokenReq tokenReq = new TokenReq();
        tokenReq.setPackageName(context.getPackageName());
        tokenReq.setAppId(str);
        tokenReq.setScope(str4);
        tokenReq.setProjectId(str2);
        tokenReq.setSubjectId(str3);
        tokenReq.setMultiSender(false);
        if (TextUtils.isEmpty(str)) {
            tokenReq.setAppId(Util.getAppId(context));
        }
        if (TextUtils.isEmpty(str2)) {
            tokenReq.setProjectId(m24519d(context));
        }
        if (TextUtils.isEmpty(str4)) {
            tokenReq.setScope("HCM");
        }
        C11067g c11067gM24536k = C11067g.m24536k(context);
        if (c11067gM24536k.m17893d("hasRequestAgreement")) {
            tokenReq.setFirstTime(false);
            return tokenReq;
        }
        tokenReq.setFirstTime(true);
        c11067gM24536k.m17896g("hasRequestAgreement", true);
        return tokenReq;
    }

    /* renamed from: c */
    public static synchronized String m24518c(Context context) {
        String string;
        try {
            C9105b c9105b = new C9105b(context, "aaid");
            if (c9105b.m17892c("aaid")) {
                string = c9105b.m17894e("aaid");
            } else {
                string = UUID.randomUUID().toString();
                c9105b.m17898i("aaid", string);
                c9105b.m17897h("creationTime", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return string;
    }

    /* renamed from: d */
    public static String m24519d(Context context) {
        return AbstractC11057a.m24512b(context).getString("client/project_id");
    }
}
