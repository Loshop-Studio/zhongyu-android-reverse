package p318r5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.hms.hatool.AbstractC7317o;
import com.huawei.hms.hatool.AbstractC7318r0;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: r5.o */
/* loaded from: classes5.dex */
public class C10885o {

    /* renamed from: b */
    public static C10885o f26266b;

    /* renamed from: c */
    public static Map f26267c = new HashMap();

    /* renamed from: a */
    public Context f26268a;

    /* renamed from: a */
    public static C10885o m23569a() {
        return m23570h();
    }

    /* renamed from: h */
    public static synchronized C10885o m23570h() {
        try {
            if (f26266b == null) {
                f26266b = new C10885o();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f26266b;
    }

    /* renamed from: b */
    public void m23571b(Context context) throws PackageManager.NameNotFoundException {
        this.f26268a = context;
        m23577i(context);
        C10908z0.m23741e().m23746d().m23647q(AbstractC7317o.m8636c());
    }

    /* renamed from: c */
    public void m23572c(String str, int i10) {
        if (this.f26268a == null) {
            AbstractC10861f1.m23440l("hmsSdk", "onReport() null context or SDK was not init.");
        } else {
            AbstractC10861f1.m23430b("hmsSdk", "onReport: Before calling runtaskhandler()");
            m23576g(str, AbstractC10886o0.m23580c(i10), AbstractC10900v0.m23678m());
        }
    }

    /* renamed from: d */
    public void m23573d(String str, int i10, String str2, JSONObject jSONObject) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (2 == i10) {
            jCurrentTimeMillis = AbstractC10886o0.m23578a("yyyy-MM-dd", jCurrentTimeMillis);
        }
        C10856e.m23404d().m23405b(new C10847b(str2, jSONObject, str, AbstractC10886o0.m23580c(i10), jCurrentTimeMillis));
    }

    /* renamed from: e */
    public void m23574e(String str, int i10, String str2, JSONObject jSONObject, long j10) {
        new C10907z(str, AbstractC10886o0.m23580c(i10), str2, jSONObject.toString(), j10).m23740a();
    }

    /* renamed from: f */
    public void m23575f(String str, String str2) {
        if (!AbstractC10850c.m23363b(str, str2)) {
            AbstractC10861f1.m23436h("hmsSdk", "auto report is closed tag:" + str);
            return;
        }
        long jM23372k = AbstractC10850c.m23372k(str, str2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jM23372k <= 30000) {
            AbstractC10861f1.m23441m("hmsSdk", "autoReport timeout. interval < 30s ");
            return;
        }
        AbstractC10861f1.m23430b("hmsSdk", "begin to call onReport!");
        AbstractC10850c.m23362a(str, str2, jCurrentTimeMillis);
        m23576g(str, str2, AbstractC10900v0.m23678m());
    }

    /* renamed from: g */
    public void m23576g(String str, String str2, String str3) {
        Context context = this.f26268a;
        if (context == null) {
            AbstractC10861f1.m23440l("hmsSdk", "onReport() null context or SDK was not init.");
            return;
        }
        String strM8647d = AbstractC7318r0.m8647d(context);
        if (AbstractC10850c.m23367f(str, str2) && !"WIFI".equals(strM8647d)) {
            AbstractC10861f1.m23436h("hmsSdk", "strNetworkType is :" + strM8647d);
            return;
        }
        if ("unknown".equals(strM8647d) || "none".equals(strM8647d) || "2G".equals(strM8647d)) {
            AbstractC10861f1.m23440l("hmsSdk", "The network is bad.");
        } else {
            C10856e.m23404d().m23405b(new C10858e1(str, str2, str3));
        }
    }

    /* renamed from: i */
    public final void m23577i(Context context) throws PackageManager.NameNotFoundException {
        String strM8643j = AbstractC7317o.m8643j(context);
        AbstractC10900v0.m23667b(strM8643j);
        if (!C10902w0.m23694b().m23695a()) {
            AbstractC10861f1.m23436h("hmsSdk", "userManager.isUserUnlocked() == false");
            return;
        }
        String strM23518b = AbstractC10877l.m23518b(context, "global_v2", "app_ver", "");
        AbstractC10877l.m23523g(context, "global_v2", "app_ver", strM8643j);
        AbstractC10900v0.m23669d(strM23518b);
        if (TextUtils.isEmpty(strM23518b)) {
            AbstractC10861f1.m23436h("hmsSdk", "app ver is first save!");
        } else {
            if (strM23518b.equals(strM8643j)) {
                return;
            }
            AbstractC10861f1.m23436h("hmsSdk", "the appVers are different!");
            m23569a().m23576g("", "alltype", strM23518b);
        }
    }
}
