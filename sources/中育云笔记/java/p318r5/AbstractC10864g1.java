package p318r5;

import android.text.TextUtils;
import com.huawei.hms.hatool.AbstractC7319w;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p433z5.AbstractC12022a;

/* renamed from: r5.g1 */
/* loaded from: classes5.dex */
public abstract class AbstractC10864g1 {
    /* renamed from: a */
    public static void m23455a(String str, String str2) {
        C10856e.m23402a().m23405b(new C10854d0(str, str2));
    }

    /* renamed from: b */
    public static boolean m23456b() throws NumberFormatException {
        String strM23666a = AbstractC10900v0.m23666a();
        if (TextUtils.isEmpty(strM23666a)) {
            strM23666a = AbstractC10877l.m23518b(AbstractC10900v0.m23682q(), "Privacy_MY", "public_key_time_interval", "");
            AbstractC10900v0.m23677l(strM23666a);
        }
        String strM23686u = AbstractC10900v0.m23686u();
        if (TextUtils.isEmpty(strM23686u)) {
            strM23686u = AbstractC10877l.m23518b(AbstractC10900v0.m23682q(), "Privacy_MY", "public_key_time_last", "");
            AbstractC10900v0.m23671f(strM23686u);
        }
        if (!TextUtils.isEmpty(strM23666a) && !TextUtils.isEmpty(strM23686u)) {
            try {
                return System.currentTimeMillis() - Long.parseLong(strM23686u) > ((long) Integer.parseInt(strM23666a));
            } catch (NumberFormatException e10) {
                AbstractC10861f1.m23440l("GetPublicKey", "checkCachePubKey NumberFormatException :" + e10.getMessage());
            }
        }
        return true;
    }

    /* renamed from: c */
    public static void m23457c(String str, String str2) {
        C10884n0 c10884n0M8651b;
        String str3;
        String strReplace = "{url}/getPublicKey?keytype=4".replace("{url}", AbstractC10850c.m23368g(str, str2));
        String strM23676k = AbstractC10900v0.m23676k();
        HashMap map = new HashMap();
        map.put("App-Id", strM23676k);
        try {
            c10884n0M8651b = AbstractC7319w.m8651b(strReplace, new byte[0], map);
        } catch (Exception e10) {
            AbstractC10861f1.m23440l("GetPublicKey", "get pubKey response Exception :" + e10.getMessage());
            c10884n0M8651b = null;
        }
        if (c10884n0M8651b == null) {
            str3 = "get pubKey response is null";
        } else if (c10884n0M8651b.m23568b() == 200) {
            if (TextUtils.isEmpty(c10884n0M8651b.m23567a())) {
                return;
            }
            m23459e(c10884n0M8651b.m23567a(), str2);
            return;
        } else {
            str3 = "get pubKey fail HttpCode :" + c10884n0M8651b.m23568b();
        }
        AbstractC10861f1.m23440l("GetPublicKey", str3);
    }

    /* renamed from: d */
    public static String m23458d(String str, String str2) {
        String strM23688w;
        String strM23670e = AbstractC10900v0.m23670e();
        if (TextUtils.isEmpty(strM23670e)) {
            strM23670e = AbstractC10877l.m23518b(AbstractC10900v0.m23682q(), "Privacy_MY", "public_key_version", "");
            AbstractC10900v0.m23679n(strM23670e);
        }
        if (!"2.0".equals(strM23670e)) {
            m23455a(str, str2);
            return null;
        }
        if ("maint".equals(str2)) {
            strM23688w = AbstractC10900v0.m23687v();
            if (TextUtils.isEmpty(strM23688w)) {
                strM23688w = AbstractC12022a.m26619f("HiAnalytics_Sdk_Public_Sp_Key", AbstractC10877l.m23518b(AbstractC10900v0.m23682q(), "Privacy_MY", "public_key_maint", ""));
                AbstractC10900v0.m23673h(strM23688w);
            }
        } else {
            strM23688w = AbstractC10900v0.m23688w();
            if (TextUtils.isEmpty(strM23688w)) {
                strM23688w = AbstractC12022a.m26619f("HiAnalytics_Sdk_Public_Sp_Key", AbstractC10877l.m23518b(AbstractC10900v0.m23682q(), "Privacy_MY", "public_key_oper", ""));
                AbstractC10900v0.m23675j(strM23688w);
            }
        }
        if (!TextUtils.isEmpty(strM23688w) && !m23456b()) {
            return strM23688w;
        }
        m23455a(str, str2);
        return null;
    }

    /* renamed from: e */
    public static void m23459e(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("publicKey");
            String strOptString2 = jSONObject.optString("publicKeyOM");
            String strOptString3 = jSONObject.optString("pubkey_version");
            String str3 = System.currentTimeMillis() + "";
            String strOptString4 = jSONObject.optString("timeInterval");
            AbstractC10877l.m23523g(AbstractC10900v0.m23682q(), "Privacy_MY", "public_key_oper", AbstractC12022a.m26622i("HiAnalytics_Sdk_Public_Sp_Key", strOptString));
            AbstractC10877l.m23523g(AbstractC10900v0.m23682q(), "Privacy_MY", "public_key_maint", AbstractC12022a.m26622i("HiAnalytics_Sdk_Public_Sp_Key", strOptString2));
            AbstractC10877l.m23523g(AbstractC10900v0.m23682q(), "Privacy_MY", "public_key_time_interval", strOptString4);
            AbstractC10877l.m23523g(AbstractC10900v0.m23682q(), "Privacy_MY", "public_key_version", strOptString3);
            AbstractC10877l.m23523g(AbstractC10900v0.m23682q(), "Privacy_MY", "public_key_time_last", str3);
            AbstractC10900v0.m23675j(strOptString);
            AbstractC10900v0.m23673h(strOptString2);
            AbstractC10900v0.m23679n(strOptString3);
            AbstractC10900v0.m23671f(str3);
            AbstractC10900v0.m23677l(strOptString4);
        } catch (JSONException e10) {
            AbstractC10861f1.m23440l("GetPublicKey", "get pubKey parse json JSONException :" + e10.getMessage());
        }
    }
}
