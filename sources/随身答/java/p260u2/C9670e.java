package p260u2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.umeng.analytics.pro.C6757b;
import com.umeng.commonsdk.config.C6780a;
import com.umeng.commonsdk.framework.AbstractC6782a;
import com.umeng.commonsdk.framework.AbstractC6783b;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p210p2.AbstractC9318a;
import p250t2.AbstractC9612d;
import p250t2.C9610b;
import p270v2.AbstractC9753a;
import p270v2.AbstractC9754b;
import p270v2.AbstractC9758f;
import p280w2.C9801a;
import p280w2.C9802b;
import p280w2.C9807g;
import p290x2.AbstractC9866a;
import p310z2.AbstractC9993d;

/* renamed from: u2.e */
/* loaded from: classes4.dex */
public class C9670e {

    /* renamed from: b */
    public static String f17087b = "";

    /* renamed from: c */
    public static String f17088c = "";

    /* renamed from: d */
    public static String f17089d = null;

    /* renamed from: e */
    public static String f17090e = null;

    /* renamed from: f */
    public static String f17091f = "";

    /* renamed from: g */
    public static boolean f17092g;

    /* renamed from: a */
    public int f17093a = 0;

    /* renamed from: b */
    public static long m16116b(Context context) {
        long j9 = AbstractC9753a.f17263c - AbstractC9753a.f17262b;
        if (AbstractC9758f.f17293a) {
            Log.i("EnvelopeManager", "free size is " + j9);
        }
        return j9;
    }

    /* renamed from: h */
    public static void m16117h() {
        if (f17089d != null) {
            f17089d = null;
            C9807g.m16653b();
        }
    }

    /* renamed from: i */
    public static JSONObject m16118i(Context context) {
        SharedPreferences sharedPreferencesM16841a;
        JSONObject jSONObject;
        try {
            sharedPreferencesM16841a = AbstractC9866a.m16841a(context);
            if (TextUtils.isEmpty(f17089d)) {
                AbstractC9993d.m17335t();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("app_signature", AbstractC9754b.m16370e(context));
                jSONObject2.put("app_sig_sha1", AbstractC9754b.m16372g(context));
                jSONObject2.put("app_sig_sha", AbstractC9754b.m16369d(context));
                jSONObject2.put("app_version", AbstractC9754b.m16374i(context));
                jSONObject2.put("version_code", Integer.parseInt(AbstractC9754b.m16373h(context)));
                jSONObject2.put("idmd5", AbstractC9754b.m16380o(context));
                jSONObject2.put("cpu", AbstractC9754b.m16376k());
                String strM16346A = AbstractC9754b.m16346A(context);
                if (TextUtils.isEmpty(strM16346A)) {
                    jSONObject2.put("mccmnc", "");
                } else {
                    jSONObject2.put("mccmnc", strM16346A);
                    f17091f = strM16346A;
                }
                String strM16358M = AbstractC9754b.m16358M(context);
                if (!TextUtils.isEmpty(strM16358M)) {
                    jSONObject2.put("sub_os_name", strM16358M);
                }
                String strM16359N = AbstractC9754b.m16359N(context);
                if (!TextUtils.isEmpty(strM16359N)) {
                    jSONObject2.put("sub_os_version", strM16359N);
                }
                String strM16381p = AbstractC9754b.m16381p(context);
                if (!TextUtils.isEmpty(strM16381p)) {
                    jSONObject2.put("device_type", strM16381p);
                }
                jSONObject2.put("package_name", AbstractC9754b.m16354I(context));
                jSONObject2.put("sdk_type", "Android");
                jSONObject2.put("device_id", AbstractC9754b.m16377l(context));
                jSONObject2.put("device_model", Build.MODEL);
                jSONObject2.put("device_board", Build.BOARD);
                jSONObject2.put("device_brand", Build.BRAND);
                jSONObject2.put("device_manutime", Build.TIME);
                jSONObject2.put("device_manufacturer", Build.MANUFACTURER);
                jSONObject2.put("device_manuid", Build.ID);
                jSONObject2.put("device_name", Build.DEVICE);
                jSONObject2.put("os_version", Build.VERSION.RELEASE);
                jSONObject2.put("os", "Android");
                int[] iArrM16355J = AbstractC9754b.m16355J(context);
                if (iArrM16355J != null) {
                    jSONObject2.put("resolution", iArrM16355J[1] + "*" + iArrM16355J[0]);
                }
                jSONObject2.put("mc", AbstractC9754b.m16347B(context));
                jSONObject2.put("timezone", AbstractC9754b.m16360O(context));
                String[] strArrM16391z = AbstractC9754b.m16391z(context);
                jSONObject2.put("country", strArrM16391z[0]);
                jSONObject2.put("language", strArrM16391z[1]);
                jSONObject2.put("carrier", AbstractC9754b.m16351F(context));
                jSONObject2.put("display_name", AbstractC9754b.m16371f(context));
                String[] strArrM16350E = AbstractC9754b.m16350E(context);
                if ("Wi-Fi".equals(strArrM16350E[0])) {
                    jSONObject2.put("access", "wifi");
                } else if ("2G/3G".equals(strArrM16350E[0])) {
                    jSONObject2.put("access", "2G/3G");
                } else {
                    jSONObject2.put("access", "unknow");
                }
                if (!"".equals(strArrM16350E[1])) {
                    jSONObject2.put("access_subtype", strArrM16350E[1]);
                }
                if (C6780a.m6260e("header_local_ip")) {
                    jSONObject2.put("local_ip", AbstractC9754b.m16386u(context));
                }
                jSONObject2.put("network_type", AbstractC9754b.m16352G(context));
                jSONObject2.put("com_ver", "9.3.7");
                jSONObject2.put("com_type", AbstractC9667b.f17073a);
                jSONObject2.put("mini_ver", "1");
                if (!TextUtils.isEmpty(f17090e)) {
                    jSONObject2.put("module", f17090e);
                }
                jSONObject2.put("api_level", Build.VERSION.SDK_INT);
                if (!TextUtils.isEmpty(AbstractC9993d.f17999j)) {
                    jSONObject2.put("urec_ver", AbstractC9993d.f17999j);
                }
                try {
                    String strM17332q = AbstractC9993d.m17332q(context);
                    if (TextUtils.isEmpty(strM17332q)) {
                        AbstractC9993d.m17340y(context);
                        strM17332q = AbstractC9993d.m17332q(context);
                    }
                    jSONObject2.put("session_id", strM17332q);
                } catch (Throwable unused) {
                }
                f17089d = jSONObject2.toString();
                jSONObject = jSONObject2;
            } else {
                try {
                    jSONObject = new JSONObject(f17089d);
                } catch (Exception unused2) {
                    jSONObject = null;
                }
            }
        } catch (Throwable th) {
            AbstractC9318a.m15200b(context, th);
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject.put("oaid_required_time", AbstractC9993d.m17329n(context));
        } catch (Exception unused3) {
        }
        try {
            jSONObject.put("successful_requests", sharedPreferencesM16841a.getInt("successful_request", 0));
            jSONObject.put("failed_requests", sharedPreferencesM16841a.getInt("failed_requests", 0));
            jSONObject.put("req_time", sharedPreferencesM16841a.getInt("last_request_spent_ms", 0));
            String strM17333r = AbstractC9993d.m17333r(context);
            if (!TextUtils.isEmpty(strM17333r)) {
                jSONObject.put("zid", strM17333r);
            }
            if (!TextUtils.isEmpty(AbstractC9993d.f18001l)) {
                jSONObject.put("zid_sdk_version", AbstractC9993d.f18001l);
            }
        } catch (Exception unused4) {
        }
        jSONObject.put("channel", AbstractC9993d.m17323h(context));
        jSONObject.put("appkey", AbstractC9993d.m17321f(context));
        try {
            String strM17326k = AbstractC9993d.m17326k(context);
            if (!TextUtils.isEmpty(strM17326k)) {
                jSONObject.put("devicetoken", strM17326k);
            }
        } catch (Exception e10) {
            AbstractC9318a.m15200b(context, e10);
        }
        try {
            String strM6274h = AbstractC6782a.m6274h(context, "umid", null);
            if (!TextUtils.isEmpty(strM6274h)) {
                jSONObject.put("umid", strM6274h);
            }
        } catch (Exception e11) {
            AbstractC9318a.m15200b(context, e11);
        }
        try {
            jSONObject.put("wrapper_type", AbstractC9669d.f17085a);
            jSONObject.put("wrapper_version", AbstractC9669d.f17086b);
        } catch (Exception unused5) {
        }
        try {
            int iM17331p = AbstractC9993d.m17331p(context);
            boolean zM17317b = AbstractC9993d.m17317b(context, "android.permission.READ_PHONE_STATE");
            jSONObject.put("targetSdkVer", iM17331p);
            if (zM17317b) {
                jSONObject.put("rps_pr", "yes");
            } else {
                jSONObject.put("rps_pr", "no");
            }
        } catch (Throwable unused6) {
        }
        try {
            if (m16119j()) {
                jSONObject.put("umTaskId", f17087b);
                jSONObject.put("umCaseId", f17088c);
            }
        } catch (Throwable unused7) {
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("i_ver", "1.2.0");
            if (!TextUtils.isEmpty(AbstractC9993d.f17992c)) {
                jSONObject3.put("a_ver", AbstractC9993d.f17992c);
            }
            if (!TextUtils.isEmpty(AbstractC9993d.f17993d)) {
                jSONObject3.put("g_ver", AbstractC9993d.f17993d);
            }
            if (!TextUtils.isEmpty(AbstractC9993d.f17994e)) {
                jSONObject3.put("p_ver", AbstractC9993d.f17994e);
            }
            if (!TextUtils.isEmpty(AbstractC9993d.f17995f)) {
                jSONObject3.put("s_ver", AbstractC9993d.f17995f);
            }
            if (!TextUtils.isEmpty(AbstractC9993d.f17996g)) {
                jSONObject3.put("c_ver", AbstractC9993d.f17996g);
            }
            if (!TextUtils.isEmpty(AbstractC9993d.f17997h)) {
                jSONObject3.put("n_ver", AbstractC9993d.f17997h);
            }
            if (!TextUtils.isEmpty(AbstractC9993d.f17998i)) {
                jSONObject3.put("m_ver", AbstractC9993d.f17998i);
            }
            if (!TextUtils.isEmpty(AbstractC9993d.f17999j)) {
                jSONObject3.put("u_ver", AbstractC9993d.f17999j);
            }
            if (!TextUtils.isEmpty(AbstractC9993d.f18000k)) {
                jSONObject3.put("v_ver", AbstractC9993d.f18000k);
            }
            if (!TextUtils.isEmpty(AbstractC9993d.f18001l)) {
                jSONObject3.put("z_ver", AbstractC9993d.f18001l);
            }
            if (!TextUtils.isEmpty(AbstractC9993d.f18002m)) {
                jSONObject3.put("l_ver", AbstractC9993d.f18002m);
            }
            if (!TextUtils.isEmpty(AbstractC9993d.f18003n)) {
                jSONObject3.put("t_ver", AbstractC9993d.f18003n);
            }
            jSONObject.put("module_ver", jSONObject3);
        } catch (Throwable unused8) {
        }
        byte[] bArrM16627k = C9802b.m16620u(context).m16627k();
        if (bArrM16627k != null && bArrM16627k.length > 0) {
            try {
                jSONObject.put("imprint", Base64.encodeToString(bArrM16627k, 0));
            } catch (JSONException e12) {
                AbstractC9318a.m15200b(context, e12);
            }
        }
        if (jSONObject.length() > 0) {
            return new JSONObject().put("header", jSONObject);
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m16119j() {
        f17087b = AbstractC9993d.m17330o("debug.umeng.umTaskId", "");
        f17088c = AbstractC9993d.m17330o("debug.umeng.umCaseId", "");
        return (!TextUtils.isEmpty(f17087b) && !"empty".equals(f17087b)) && (!TextUtils.isEmpty(f17088c) && !"empty".equals(f17088c));
    }

    /* renamed from: a */
    public final int m16120a(Context context, C9801a c9801a, String str, String str2, String str3) {
        if (context == null || c9801a == null || TextUtils.isEmpty(str)) {
            return 101;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = AbstractC9754b.m16374i(context);
        }
        String strM15898g = AbstractC9612d.m15898g(str3);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("&&");
        sb.append(str2);
        sb.append("_");
        sb.append(System.currentTimeMillis());
        sb.append("_");
        sb.append(strM15898g);
        sb.append(".log");
        byte[] bArrM16616m = c9801a.m16616m();
        return (str.startsWith("z") || str.startsWith("i") || str.startsWith("a") || str.startsWith("t")) ? AbstractC6783b.m6294o(context, sb.toString(), bArrM16616m) : AbstractC9612d.m15892a(context, ".emitter", sb.toString(), bArrM16616m);
    }

    /* renamed from: c */
    public final JSONObject m16121c(int i9, JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            try {
                jSONObject.put("exception", i9);
            } catch (Exception unused) {
            }
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("exception", i9);
        } catch (Exception unused2) {
        }
        return jSONObject2;
    }

    /* renamed from: d */
    public JSONObject m16122d(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Context context2;
        Throwable th;
        C9801a c9801a;
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("header", new JSONObject());
            try {
                if (m16119j()) {
                    jSONObject.put("umTaskId", f17087b);
                    jSONObject.put("umCaseId", f17088c);
                }
            } catch (Throwable unused) {
            }
            if (jSONObject != null) {
                try {
                    jSONObject3 = m16124f(jSONObject3, jSONObject);
                } catch (Throwable th2) {
                    th = th2;
                    context2 = context;
                    AbstractC9318a.m15200b(context2, th);
                    return m16121c(110, new JSONObject());
                }
            }
            if (jSONObject3 != null && jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && (next instanceof String)) {
                        String str2 = next;
                        if (jSONObject2.opt(str2) != null) {
                            try {
                                jSONObject3.put(str2, jSONObject2.opt(str2));
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            }
            if (jSONObject3 != null && AbstractC9753a.m16343i(jSONObject3.toString().getBytes().length, AbstractC9753a.f17263c)) {
                SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(context);
                if (sharedPreferencesM16841a != null) {
                    sharedPreferencesM16841a.edit().putInt("serial", sharedPreferencesM16841a.getInt("serial", 1) + 1).commit();
                }
                return m16121c(113, jSONObject3);
            }
            if (jSONObject3 != null) {
                C9801a c9801aM16125g = m16125g(context, jSONObject3.toString().getBytes());
                if (c9801aM16125g == null) {
                    return m16121c(111, jSONObject3);
                }
                c9801a = c9801aM16125g;
            } else {
                c9801a = null;
            }
            if (c9801a != null && AbstractC9753a.m16343i(c9801a.m16616m().length, AbstractC9753a.f17264d)) {
                return m16121c(114, jSONObject3);
            }
            context2 = context;
            try {
                int iM16120a = m16120a(context2, c9801a, "z==1.2.0", jSONObject3 != null ? jSONObject3.optJSONObject("header").optString("app_version") : null, str);
                if (iM16120a != 0) {
                    return m16121c(iM16120a, jSONObject3);
                }
                if (AbstractC9758f.f17293a) {
                    Log.i("EnvelopeManager", "constructHeader size is " + jSONObject3.toString().getBytes().length);
                }
                return jSONObject3;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                AbstractC9318a.m15200b(context2, th);
                return m16121c(110, new JSONObject());
            }
        } catch (Throwable th4) {
            th = th4;
            context2 = context;
        }
    }

    /* renamed from: e */
    public JSONObject m16123e(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject3;
        String strSubstring;
        C9801a c9801a;
        if (AbstractC9758f.f17293a && jSONObject != null && jSONObject2 != null) {
            Log.i("EnvelopeManager", "headerJSONObject size is " + jSONObject.toString().getBytes().length);
            Log.i("EnvelopeManager", "bodyJSONObject size is " + jSONObject2.toString().getBytes().length);
        }
        JSONObject jSONObject4 = null;
        if (context == null || jSONObject2 == null) {
            return m16121c(110, null);
        }
        try {
            JSONObject jSONObjectM16118i = m16118i(context);
            if (jSONObjectM16118i != null && jSONObject != null) {
                jSONObjectM16118i = m16124f(jSONObjectM16118i, jSONObject);
            }
            JSONObject jSONObject5 = jSONObjectM16118i;
            if (jSONObject5 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && (next instanceof String)) {
                        String str4 = next;
                        if (jSONObject2.opt(str4) != null) {
                            try {
                                jSONObject5.put(str4, jSONObject2.opt(str4));
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            String str5 = TextUtils.isEmpty(str2) ? "u" : str2;
            String str6 = TextUtils.isEmpty(str3) ? "1.0.0" : str3;
            if (jSONObject5 != null) {
                strSubstring = str5 + "==" + str6 + "&=";
                if (TextUtils.isEmpty(strSubstring)) {
                    return m16121c(101, jSONObject5);
                }
                if (strSubstring.endsWith("&=")) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                }
            } else {
                strSubstring = null;
            }
            if (jSONObject5 != null) {
                try {
                    C9807g c9807gM16652a = C9807g.m16652a(context);
                    if (c9807gM16652a != null) {
                        c9807gM16652a.m16656e();
                        String strEncodeToString = Base64.encodeToString(new C6757b().m6068a(c9807gM16652a.m16658g()), 0);
                        if (!TextUtils.isEmpty(strEncodeToString)) {
                            JSONObject jSONObject6 = jSONObject5.getJSONObject("header");
                            jSONObject6.put("id_tracking", strEncodeToString);
                            jSONObject5.put("header", jSONObject6);
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            if (jSONObject5 != null && AbstractC9753a.m16343i(jSONObject5.toString().getBytes().length, AbstractC9753a.f17263c)) {
                SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(context);
                if (sharedPreferencesM16841a != null) {
                    sharedPreferencesM16841a.edit().putInt("serial", sharedPreferencesM16841a.getInt("serial", 1) + 1).commit();
                }
                return m16121c(113, jSONObject5);
            }
            if (jSONObject5 != null) {
                C9801a c9801aM16125g = m16125g(context, jSONObject5.toString().getBytes());
                if (c9801aM16125g == null) {
                    return m16121c(111, jSONObject5);
                }
                c9801a = c9801aM16125g;
            } else {
                c9801a = null;
            }
            if (c9801a != null && AbstractC9753a.m16343i(c9801a.m16616m().length, AbstractC9753a.f17264d)) {
                return m16121c(114, jSONObject5);
            }
            int iM16120a = m16120a(context, c9801a, strSubstring, jSONObject5 != null ? jSONObject5.optJSONObject("header").optString("app_version") : null, str);
            if (iM16120a != 0) {
                return m16121c(iM16120a, jSONObject5);
            }
            if (AbstractC9758f.f17293a) {
                Log.i("EnvelopeManager", "constructHeader size is " + jSONObject5.toString().getBytes().length);
            }
            if (!strSubstring.startsWith("z") && !strSubstring.startsWith("i") && !strSubstring.startsWith("t") && !strSubstring.startsWith("a") && !C9610b.m15870c()) {
                new C9610b(context);
                C9610b.m15872e();
            }
            return jSONObject5;
        } catch (Throwable th) {
            AbstractC9318a.m15200b(context, th);
            if (jSONObject != null) {
                try {
                    jSONObject3 = new JSONObject();
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    jSONObject3.put("header", jSONObject);
                } catch (JSONException unused3) {
                } catch (Exception e11) {
                    e = e11;
                    jSONObject4 = jSONObject3;
                    AbstractC9318a.m15200b(context, e);
                    return m16121c(110, jSONObject4);
                }
                jSONObject4 = jSONObject3;
            }
            if (jSONObject4 == null) {
                jSONObject4 = new JSONObject();
            }
            Iterator<String> itKeys2 = jSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                if (next2 != null && (next2 instanceof String)) {
                    String str7 = next2;
                    if (jSONObject2.opt(str7) != null) {
                        try {
                            jSONObject4.put(str7, jSONObject2.opt(str7));
                        } catch (Exception unused4) {
                        }
                    }
                }
            }
            return m16121c(110, jSONObject4);
        }
    }

    /* renamed from: f */
    public final JSONObject m16124f(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        if (jSONObject != null && jSONObject2 != null && jSONObject.opt("header") != null && (jSONObject.opt("header") instanceof JSONObject)) {
            JSONObject jSONObject3 = (JSONObject) jSONObject.opt("header");
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && (next instanceof String)) {
                    String str = next;
                    if (jSONObject2.opt(str) != null) {
                        try {
                            jSONObject3.put(str, jSONObject2.opt(str));
                            if (str.equals("vertical_type") && (jSONObject2.opt(str) instanceof Integer)) {
                                this.f17093a = ((Integer) jSONObject2.opt(str)).intValue();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: g */
    public final C9801a m16125g(Context context, byte[] bArr) {
        String strM6274h = AbstractC6782a.m6274h(context, "codex", null);
        int iIntValue = -1;
        try {
            if (!TextUtils.isEmpty(strM6274h)) {
                iIntValue = Integer.valueOf(strM6274h).intValue();
            }
        } catch (NumberFormatException e10) {
            AbstractC9318a.m15200b(context, e10);
        }
        return iIntValue == 0 ? C9801a.m16605d(context, AbstractC9993d.m17321f(context), bArr) : iIntValue == 1 ? C9801a.m16604c(context, AbstractC9993d.m17321f(context), bArr) : f17092g ? C9801a.m16604c(context, AbstractC9993d.m17321f(context), bArr) : C9801a.m16605d(context, AbstractC9993d.m17321f(context), bArr);
    }
}
