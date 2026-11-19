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
import org.android.agoo.common.AgooConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CookieManager {
    public static final String TAG = "anet.CookieManager";

    /* renamed from: a */
    private static volatile boolean f5564a = false;

    /* renamed from: b */
    private static android.webkit.CookieManager f5565b = null;

    /* renamed from: c */
    private static boolean f5566c = true;

    /* renamed from: d */
    private static C0984a f5567d;

    /* renamed from: e */
    private static SharedPreferences f5568e;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: anetwork.channel.cookie.CookieManager$a */
    static class C0984a {

        /* renamed from: a */
        String f5569a;

        /* renamed from: b */
        String f5570b;

        /* renamed from: c */
        String f5571c;

        /* renamed from: d */
        String f5572d;

        /* renamed from: e */
        long f5573e;

        C0984a(String str) {
            this.f5569a = str;
            String string = CookieManager.f5568e.getString("networksdk_cookie_monitor", null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (!TextUtils.isEmpty(this.f5569a) && this.f5569a.equals(jSONObject.getString("cookieName"))) {
                    this.f5573e = jSONObject.getLong(AgooConstants.MESSAGE_TIME);
                    if (System.currentTimeMillis() - this.f5573e < 86400000) {
                        this.f5570b = jSONObject.getString("cookieText");
                        this.f5571c = jSONObject.getString("setCookie");
                        this.f5572d = jSONObject.getString(DispatchConstants.DOMAIN);
                    } else {
                        this.f5573e = 0L;
                        CookieManager.f5568e.edit().remove("networksdk_cookie_monitor").apply();
                    }
                }
            } catch (JSONException e4) {
                ALog.m4637e(CookieManager.TAG, "cookie json parse error.", null, e4, new Object[0]);
            }
        }

        /* renamed from: a */
        void m4697a() throws JSONException {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("cookieName", this.f5569a);
                jSONObject.put("cookieText", this.f5570b);
                jSONObject.put("setCookie", this.f5571c);
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f5573e = jCurrentTimeMillis;
                jSONObject.put(AgooConstants.MESSAGE_TIME, jCurrentTimeMillis);
                jSONObject.put(DispatchConstants.DOMAIN, this.f5572d);
                CookieManager.f5568e.edit().putString("networksdk_cookie_monitor", jSONObject.toString()).apply();
            } catch (Exception e4) {
                ALog.m4637e(CookieManager.TAG, "cookie json save error.", null, e4, new Object[0]);
            }
        }
    }

    /* renamed from: d */
    private static boolean m4694d() {
        if (!f5564a && NetworkSdkSetting.getContext() != null) {
            setup(NetworkSdkSetting.getContext());
        }
        return f5564a;
    }

    /* renamed from: e */
    private static void m4695e() {
        ThreadPoolExecutorFactory.submitCookieMonitor(new RunnableC0985a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static String m4696f() {
        SharedPreferences sharedPreferences = f5568e;
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
        if (!m4694d() || !f5566c) {
            return null;
        }
        try {
            cookie = f5565b.getCookie(str);
        } catch (Throwable th) {
            ALog.m4637e(TAG, "get cookie failed. url=" + str, null, th, new Object[0]);
        }
        m4691a(str, cookie);
        return cookie;
    }

    public static synchronized void setCookie(String str, String str2) {
        if (NetworkConfigCenter.isCookieEnable()) {
            if (m4694d() && f5566c) {
                try {
                    f5565b.setCookie(str, str2);
                    f5565b.flush();
                } catch (Throwable th) {
                    ALog.m4637e(TAG, "set cookie failed.", null, th, AgooConstants.OPEN_URL, str, "cookies", str2);
                }
            }
        }
    }

    public static void setTargetMonitorCookieName(String str) {
        SharedPreferences sharedPreferences;
        if (str == null || (sharedPreferences = f5568e) == null) {
            return;
        }
        sharedPreferences.edit().putString("networksdk_target_cookie_name", str).apply();
    }

    public static synchronized void setup(Context context) {
        if (NetworkConfigCenter.isCookieEnable()) {
            if (f5564a) {
                return;
            }
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
                f5565b = cookieManager;
                cookieManager.setAcceptCookie(true);
                f5568e = PreferenceManager.getDefaultSharedPreferences(context);
                m4695e();
                ALog.m4638e(TAG, "CookieManager setup.", null, "cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            } catch (Throwable th) {
                f5566c = false;
                ALog.m4637e(TAG, "Cookie Manager setup failed!!!", null, th, new Object[0]);
            }
            f5564a = true;
        }
    }

    /* renamed from: a */
    private static void m4690a(String str) {
        ThreadPoolExecutorFactory.submitCookieMonitor(new RunnableC0986b(str));
    }

    /* renamed from: a */
    private static void m4691a(String str, String str2) {
        ThreadPoolExecutorFactory.submitCookieMonitor(new RunnableC0987c(str, str2));
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
                        m4690a(str2);
                    }
                }
            }
        } catch (Exception e4) {
            ALog.m4637e(TAG, "set cookie failed", null, e4, AgooConstants.OPEN_URL, str, "\nheaders", map);
        }
    }
}
