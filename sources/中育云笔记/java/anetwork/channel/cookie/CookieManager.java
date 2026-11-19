package anetwork.channel.cookie;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.http.NetworkSdkSetting;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class CookieManager {
    public static final String TAG = "anet.CookieManager";

    /* renamed from: a */
    private static volatile boolean f2842a = false;

    /* renamed from: b */
    private static android.webkit.CookieManager f2843b = null;

    /* renamed from: c */
    private static boolean f2844c = true;

    /* renamed from: d */
    private static C5107a f2845d;

    /* renamed from: e */
    private static SharedPreferences f2846e;

    /* renamed from: anetwork.channel.cookie.CookieManager$a */
    public static class C5107a {

        /* renamed from: a */
        String f2847a;

        /* renamed from: b */
        String f2848b;

        /* renamed from: c */
        String f2849c;

        /* renamed from: d */
        String f2850d;

        /* renamed from: e */
        long f2851e;

        public C5107a(String str) {
            this.f2847a = str;
            String string = CookieManager.f2846e.getString("networksdk_cookie_monitor", null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (TextUtils.isEmpty(this.f2847a) || !this.f2847a.equals(jSONObject.getString("cookieName"))) {
                    return;
                }
                this.f2851e = jSONObject.getLong("time");
                if (System.currentTimeMillis() - this.f2851e >= 86400000) {
                    this.f2851e = 0L;
                    CookieManager.f2846e.edit().remove("networksdk_cookie_monitor").apply();
                } else {
                    this.f2848b = jSONObject.getString("cookieText");
                    this.f2849c = jSONObject.getString("setCookie");
                    this.f2850d = jSONObject.getString(DispatchConstants.DOMAIN);
                }
            } catch (JSONException e10) {
                ALog.m2528e(CookieManager.TAG, "cookie json parse error.", null, e10, new Object[0]);
            }
        }

        /* renamed from: a */
        public void m2588a() throws JSONException {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cookieName", this.f2847a);
                jSONObject.put("cookieText", this.f2848b);
                jSONObject.put("setCookie", this.f2849c);
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f2851e = jCurrentTimeMillis;
                jSONObject.put("time", jCurrentTimeMillis);
                jSONObject.put(DispatchConstants.DOMAIN, this.f2850d);
                CookieManager.f2846e.edit().putString("networksdk_cookie_monitor", jSONObject.toString()).apply();
            } catch (Exception e10) {
                ALog.m2528e(CookieManager.TAG, "cookie json save error.", null, e10, new Object[0]);
            }
        }
    }

    /* renamed from: d */
    private static boolean m2585d() {
        if (!f2842a && NetworkSdkSetting.getContext() != null) {
            setup(NetworkSdkSetting.getContext());
        }
        return f2842a;
    }

    /* renamed from: e */
    private static void m2586e() {
        ThreadPoolExecutorFactory.submitCookieMonitor(new RunnableC5108a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static String m2587f() {
        SharedPreferences sharedPreferences = f2846e;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString("networksdk_target_cookie_name", null);
    }

    public static synchronized String getCookie(String str) {
        String cookie = null;
        if (!NetworkConfigCenter.isCookieEnable()) {
            return null;
        }
        if (!m2585d() || !f2844c) {
            return null;
        }
        try {
            cookie = f2843b.getCookie(str);
        } catch (Throwable th) {
            ALog.m2528e(TAG, "get cookie failed. url=" + str, null, th, new Object[0]);
        }
        m2582a(str, cookie);
        return cookie;
    }

    public static synchronized void setCookie(String str, String str2) {
        if (NetworkConfigCenter.isCookieEnable()) {
            if (m2585d() && f2844c) {
                try {
                    f2843b.setCookie(str, str2);
                    f2843b.flush();
                } catch (Throwable th) {
                    ALog.m2528e(TAG, "set cookie failed.", null, th, "url", str, "cookies", str2);
                }
            }
        }
    }

    public static void setTargetMonitorCookieName(String str) {
        SharedPreferences sharedPreferences;
        if (str == null || (sharedPreferences = f2846e) == null) {
            return;
        }
        sharedPreferences.edit().putString("networksdk_target_cookie_name", str).apply();
    }

    public static synchronized void setup(Context context) {
        if (NetworkConfigCenter.isCookieEnable()) {
            if (f2842a) {
                return;
            }
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
                f2843b = cookieManager;
                cookieManager.setAcceptCookie(true);
                f2846e = PreferenceManager.getDefaultSharedPreferences(context);
                m2586e();
                ALog.m2529e(TAG, "CookieManager setup.", null, "cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            } catch (Throwable th) {
                f2844c = false;
                ALog.m2528e(TAG, "Cookie Manager setup failed!!!", null, th, new Object[0]);
            }
            f2842a = true;
        }
    }

    /* renamed from: a */
    private static void m2581a(String str) {
        ThreadPoolExecutorFactory.submitCookieMonitor(new RunnableC5109b(str));
    }

    /* renamed from: a */
    private static void m2582a(String str, String str2) {
        ThreadPoolExecutorFactory.submitCookieMonitor(new RunnableC5110c(str, str2));
    }

    public static void setCookie(String str, Map<String, List<String>> map) {
        if (!NetworkConfigCenter.isCookieEnable() || str == null || map == null) {
            return;
        }
        try {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null && (key.equalsIgnoreCase(HttpConstant.SET_COOKIE) || key.equalsIgnoreCase(HttpConstant.SET_COOKIE2))) {
                    for (String str2 : entry.getValue()) {
                        setCookie(str, str2);
                        m2581a(str2);
                    }
                }
            }
        } catch (Exception e10) {
            ALog.m2528e(TAG, "set cookie failed", null, e10, "url", str, "\nheaders", map);
        }
    }
}
