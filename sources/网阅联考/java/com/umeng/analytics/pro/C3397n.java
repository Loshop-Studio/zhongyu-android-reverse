package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.C3320b;
import com.umeng.analytics.C3321c;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.process.UMProcessDBHelper;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ReportPolicy;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.utils.C3510b;
import com.umeng.commonsdk.utils.JSONArraySortUtil;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.umcrash.UMCrashUtils;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.n */
/* loaded from: classes2.dex */
public class C3397n {

    /* renamed from: a */
    private static Context f2238a = null;

    /* renamed from: l */
    private static final String f2239l = "first_activate_time";

    /* renamed from: m */
    private static final String f2240m = "ana_is_f";

    /* renamed from: n */
    private static final String f2241n = "thtstart";

    /* renamed from: o */
    private static final String f2242o = "dstk_last_time";

    /* renamed from: p */
    private static final String f2243p = "dstk_cnt";

    /* renamed from: q */
    private static final String f2244q = "gkvc";

    /* renamed from: r */
    private static final String f2245r = "ekvc";

    /* renamed from: t */
    private static final String f2246t = "-1";

    /* renamed from: x */
    private static final String f2247x = "com.umeng.umcrash.UMCrashUtils";

    /* renamed from: y */
    private static Class<?> f2248y;

    /* renamed from: z */
    private static Method f2249z;

    /* renamed from: b */
    private c f2250b;

    /* renamed from: c */
    private SharedPreferences f2251c;

    /* renamed from: d */
    private String f2252d;

    /* renamed from: e */
    private String f2253e;

    /* renamed from: f */
    private int f2254f;

    /* renamed from: g */
    private JSONArray f2255g;

    /* renamed from: h */
    private final int f2256h;

    /* renamed from: i */
    private int f2257i;

    /* renamed from: j */
    private int f2258j;

    /* renamed from: k */
    private long f2259k;

    /* renamed from: s */
    private final long f2260s;

    /* renamed from: u */
    private boolean f2261u;

    /* renamed from: v */
    private boolean f2262v;

    /* renamed from: w */
    private Object f2263w;

    /* renamed from: com.umeng.analytics.pro.n$a */
    public static class a {

        /* renamed from: A */
        public static final int f2264A = 8211;

        /* renamed from: B */
        public static final int f2265B = 8212;

        /* renamed from: C */
        public static final int f2266C = 8213;

        /* renamed from: a */
        public static final int f2267a = 4097;

        /* renamed from: b */
        public static final int f2268b = 4098;

        /* renamed from: c */
        public static final int f2269c = 4099;

        /* renamed from: d */
        public static final int f2270d = 4100;

        /* renamed from: e */
        public static final int f2271e = 4101;

        /* renamed from: f */
        public static final int f2272f = 4102;

        /* renamed from: g */
        public static final int f2273g = 4103;

        /* renamed from: h */
        public static final int f2274h = 4104;

        /* renamed from: i */
        public static final int f2275i = 4105;

        /* renamed from: j */
        public static final int f2276j = 4106;

        /* renamed from: k */
        public static final int f2277k = 4352;

        /* renamed from: l */
        public static final int f2278l = 4353;

        /* renamed from: m */
        public static final int f2279m = 4354;

        /* renamed from: n */
        public static final int f2280n = 4355;

        /* renamed from: o */
        public static final int f2281o = 4356;

        /* renamed from: p */
        public static final int f2282p = 8193;

        /* renamed from: q */
        public static final int f2283q = 8194;

        /* renamed from: r */
        public static final int f2284r = 8195;

        /* renamed from: s */
        public static final int f2285s = 8196;

        /* renamed from: t */
        public static final int f2286t = 8197;

        /* renamed from: u */
        public static final int f2287u = 8199;

        /* renamed from: v */
        public static final int f2288v = 8200;

        /* renamed from: w */
        public static final int f2289w = 8201;

        /* renamed from: x */
        public static final int f2290x = 8208;

        /* renamed from: y */
        public static final int f2291y = 8209;

        /* renamed from: z */
        public static final int f2292z = 8210;
    }

    /* renamed from: com.umeng.analytics.pro.n$b */
    public static class b {

        /* renamed from: a */
        private static final C3397n f2293a = new C3397n();

        private b() {
        }
    }

    static {
        m3244h();
    }

    /* renamed from: a */
    public static C3397n m3225a(Context context) {
        if (f2238a == null && context != null) {
            f2238a = context.getApplicationContext();
        }
        return b.f2293a;
    }

    /* renamed from: e */
    private void m3237e(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (2050 == jSONObject.getInt("__t")) {
                if (!m3228a(this.f2259k, this.f2257i)) {
                    return;
                } else {
                    this.f2257i++;
                }
            } else if (2049 == jSONObject.getInt("__t")) {
                if (!m3228a(this.f2259k, this.f2258j)) {
                    return;
                } else {
                    this.f2258j++;
                }
            }
            if (this.f2255g.length() >= this.f2254f) {
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>>*** 超过10个事件，事件落库。");
                C3391h.m3158a(f2238a).m3173a(this.f2255g);
                this.f2255g = new JSONArray();
            }
            if (this.f2259k == 0) {
                this.f2259k = System.currentTimeMillis();
            }
            this.f2255g.put(jSONObject);
        } catch (Throwable th) {
            MLog.m3651e(th);
        }
    }

    /* renamed from: f */
    private void m3240f(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        try {
            if (!jSONObject.getJSONObject("header").has(C3380c.f1976aB)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has("analytics") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("analytics")) != null && jSONObjectOptJSONObject.length() > 0 && jSONObjectOptJSONObject.has(C3380c.f2021n)) {
                    C3391h.m3158a(f2238a).m3175a(true, false);
                }
                C3391h.m3158a(f2238a).m3179b();
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has("analytics")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("analytics");
                if (jSONObject2.has(C3380c.f2021n) && (jSONObjectOptJSONObject2 = jSONObject2.getJSONArray(C3380c.f2021n).optJSONObject(0)) != null) {
                    String strOptString = jSONObjectOptJSONObject2.optString("id");
                    if (!TextUtils.isEmpty(strOptString)) {
                        UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> removeAllInstantData: really delete instant session data");
                        C3391h.m3158a(f2238a).m3180b(strOptString);
                    }
                }
            }
            C3391h.m3158a(f2238a).m3179b();
            UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> removeAllInstantData: send INSTANT_SESSION_START_CONTINUE event because OVERSIZE.");
            Context context = f2238a;
            UMWorkDispatch.sendEvent(context, a.f2278l, CoreProtocol.getInstance(context), null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    private static void m3244h() {
        try {
            f2248y = UMCrashUtils.class;
            Method declaredMethod = UMCrashUtils.class.getDeclaredMethod("setPuidAndProvider", String.class, String.class);
            if (declaredMethod != null) {
                f2249z = declaredMethod;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: i */
    private void m3246i() throws JSONException {
        JSONObject jSONObjectM3263b = m3263b(UMEnvelopeBuild.maxDataSpace(f2238a));
        if (jSONObjectM3263b == null || jSONObjectM3263b.length() < 1) {
            return;
        }
        JSONObject jSONObject = (JSONObject) jSONObjectM3263b.opt("header");
        JSONObject jSONObject2 = (JSONObject) jSONObjectM3263b.opt("content");
        if (f2238a == null || jSONObject == null || jSONObject2 == null) {
            return;
        }
        UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> constructInstantMessage: request build envelope.");
        JSONObject jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(f2238a, jSONObject, jSONObject2);
        if (jSONObjectBuildEnvelopeWithExtHeader != null) {
            try {
                if (jSONObjectBuildEnvelopeWithExtHeader.has("exception")) {
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "Build envelope error code: " + jSONObjectBuildEnvelopeWithExtHeader.getInt("exception"));
                }
            } catch (Throwable unused) {
            }
            if (UMConfigure.isDebugLog()) {
                m3238e(jSONObjectBuildEnvelopeWithExtHeader);
            }
            m3267b((Object) jSONObjectBuildEnvelopeWithExtHeader);
        }
    }

    /* renamed from: j */
    private void m3247j() {
        JSONObject jSONObjectBuildEnvelopeWithExtHeader;
        JSONObject jSONObjectM3257a = m3257a(UMEnvelopeBuild.maxDataSpace(f2238a));
        if (jSONObjectM3257a == null || jSONObjectM3257a.length() < 1) {
            return;
        }
        JSONObject jSONObject = (JSONObject) jSONObjectM3257a.opt("header");
        JSONObject jSONObject2 = (JSONObject) jSONObjectM3257a.opt("content");
        Context context = f2238a;
        if (context == null || jSONObject == null || jSONObject2 == null || (jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, jSONObject2)) == null) {
            return;
        }
        try {
            if (jSONObjectBuildEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "Build envelope error code: " + jSONObjectBuildEnvelopeWithExtHeader.getInt("exception"));
            }
        } catch (Throwable unused) {
        }
        if (UMConfigure.isDebugLog()) {
            m3235d(jSONObjectBuildEnvelopeWithExtHeader);
        }
        m3259a((Object) jSONObjectBuildEnvelopeWithExtHeader);
    }

    /* renamed from: k */
    private JSONObject m3248k() {
        JSONObject jSONObjectM3249l = m3249l();
        if (jSONObjectM3249l != null) {
            try {
                jSONObjectM3249l.put("st", SdkVersion.MINI_VERSION);
            } catch (Throwable unused) {
            }
        }
        return jSONObjectM3249l;
    }

    /* renamed from: l */
    private JSONObject m3249l() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            if (AnalyticsConfig.mWrapperType != null && (str = AnalyticsConfig.mWrapperVersion) != null) {
                jSONObject.put("wrapper_version", str);
                jSONObject.put("wrapper_type", AnalyticsConfig.mWrapperType);
            }
            int verticalType = AnalyticsConfig.getVerticalType(f2238a);
            jSONObject.put(C3380c.f2016i, verticalType);
            String str2 = "9.3.7";
            if (verticalType == 1) {
                String gameSdkVersion = AnalyticsConfig.getGameSdkVersion(f2238a);
                if (!TextUtils.isEmpty(gameSdkVersion)) {
                    str2 = gameSdkVersion;
                }
                jSONObject.put("sdk_version", str2);
            } else {
                jSONObject.put("sdk_version", "9.3.7");
            }
            String strMD5 = HelperUtils.MD5(AnalyticsConfig.getSecretKey(f2238a));
            if (!TextUtils.isEmpty(strMD5)) {
                jSONObject.put("secret", strMD5);
            }
            String strImprintProperty = UMEnvelopeBuild.imprintProperty(f2238a, "pr_ve", null);
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2238a);
            String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(f2238a, C3380c.f1996an, "");
            if (!TextUtils.isEmpty(strImprintProperty2)) {
                if (AnalyticsConfig.CLEAR_EKV_BL) {
                    jSONObject.put(C3380c.f1998ap, "");
                } else {
                    jSONObject.put(C3380c.f1998ap, strImprintProperty2);
                }
            }
            String strImprintProperty3 = UMEnvelopeBuild.imprintProperty(f2238a, C3380c.f1997ao, "");
            if (!TextUtils.isEmpty(strImprintProperty3)) {
                if (AnalyticsConfig.CLEAR_EKV_WL) {
                    jSONObject.put(C3380c.f1999aq, "");
                } else {
                    jSONObject.put(C3380c.f1999aq, strImprintProperty3);
                }
            }
            jSONObject.put(C3380c.f1990ah, "1.0.0");
            if (m3256s()) {
                jSONObject.put(C3380c.f1992aj, SdkVersion.MINI_VERSION);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putLong(f2240m, 0L).commit();
                }
            }
            jSONObject.put(C3380c.f2019l, m3250m());
            jSONObject.put(C3380c.f2020m, m3251n());
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("vers_name", "");
                if (!TextUtils.isEmpty(string)) {
                    String str3 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (TextUtils.isEmpty(strImprintProperty)) {
                        jSONObject.put(C3380c.f2019l, sharedPreferences.getString("vers_pre_version", "0"));
                        jSONObject.put(C3380c.f2020m, sharedPreferences.getString("vers_date", str3));
                    }
                    sharedPreferences.edit().putString("pre_version", string).putString("cur_version", DeviceConfig.getAppVersionName(f2238a)).putString("pre_date", str3).remove("vers_name").remove("vers_code").remove("vers_date").remove("vers_pre_version").commit();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: m */
    private String m3250m() {
        String string = "0";
        String strImprintProperty = null;
        try {
            strImprintProperty = UMEnvelopeBuild.imprintProperty(f2238a, "pr_ve", null);
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(strImprintProperty)) {
            string = strImprintProperty;
        } else {
            if (!TextUtils.isEmpty(this.f2252d)) {
                return this.f2252d;
            }
            if (this.f2251c == null) {
                this.f2251c = PreferenceWrapper.getDefault(f2238a);
            }
            String string2 = this.f2251c.getString("pre_version", "");
            String appVersionName = DeviceConfig.getAppVersionName(f2238a);
            if (TextUtils.isEmpty(string2)) {
                this.f2251c.edit().putString("pre_version", "0").putString("cur_version", appVersionName).commit();
            } else {
                string = this.f2251c.getString("cur_version", "");
                if (appVersionName.equals(string)) {
                    string = string2;
                } else {
                    this.f2251c.edit().putString("pre_version", string).putString("cur_version", appVersionName).commit();
                }
            }
        }
        this.f2252d = string;
        return string;
    }

    /* renamed from: n */
    private String m3251n() {
        String strImprintProperty = null;
        try {
            strImprintProperty = UMEnvelopeBuild.imprintProperty(f2238a, "ud_da", null);
            if (TextUtils.isEmpty(strImprintProperty)) {
                if (!TextUtils.isEmpty(this.f2253e)) {
                    return this.f2253e;
                }
                if (this.f2251c == null) {
                    this.f2251c = PreferenceWrapper.getDefault(f2238a);
                }
                String string = this.f2251c.getString("pre_date", "");
                if (TextUtils.isEmpty(string)) {
                    string = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    this.f2251c.edit().putString("pre_date", string).commit();
                } else {
                    String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (!string.equals(str)) {
                        this.f2251c.edit().putString("pre_date", str).commit();
                        strImprintProperty = str;
                    }
                }
                strImprintProperty = string;
            }
        } catch (Throwable unused) {
        }
        this.f2253e = strImprintProperty;
        return strImprintProperty;
    }

    /* renamed from: o */
    private void m3252o() {
        try {
            this.f2257i = 0;
            this.f2258j = 0;
            this.f2259k = System.currentTimeMillis();
            PreferenceWrapper.getDefault(f2238a).edit().putLong(f2242o, System.currentTimeMillis()).putInt(f2243p, 0).commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: p */
    private boolean m3253p() {
        try {
            if (!TextUtils.isEmpty(C3403t.m3314a().m3326b())) {
                m3266b(f2238a);
            }
            if (this.f2255g.length() <= 0) {
                return false;
            }
            for (int i4 = 0; i4 < this.f2255g.length(); i4++) {
                JSONObject jSONObjectOptJSONObject = this.f2255g.optJSONObject(i4);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                    String strOptString = jSONObjectOptJSONObject.optString("__i");
                    if (TextUtils.isEmpty(strOptString) || f2246t.equals(strOptString)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: q */
    private void m3254q() {
        if (this.f2255g.length() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i4 = 0; i4 < this.f2255g.length(); i4++) {
                try {
                    JSONObject jSONObject = this.f2255g.getJSONObject(i4);
                    if (jSONObject == null || jSONObject.length() <= 0) {
                        jSONArray.put(jSONObject);
                    } else {
                        String strOptString = jSONObject.optString("__i");
                        boolean zIsEmpty = TextUtils.isEmpty(strOptString);
                        String str = f2246t;
                        if (zIsEmpty || f2246t.equals(strOptString)) {
                            String strM3326b = C3403t.m3314a().m3326b();
                            if (!TextUtils.isEmpty(strM3326b)) {
                                str = strM3326b;
                            }
                            jSONObject.put("__i", str);
                        }
                        jSONArray.put(jSONObject);
                    }
                } catch (Throwable unused) {
                }
            }
            this.f2255g = jSONArray;
        }
    }

    /* renamed from: r */
    private void m3255r() {
        Context context;
        SharedPreferences sharedPreferences;
        try {
            if (!m3256s() || (context = f2238a) == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null || sharedPreferences.getLong(f2239l, 0L) != 0) {
                return;
            }
            sharedPreferences.edit().putLong(f2239l, System.currentTimeMillis()).commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: s */
    private boolean m3256s() {
        SharedPreferences sharedPreferences;
        try {
            Context context = f2238a;
            if (context == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null) {
                return false;
            }
            return sharedPreferences.getLong(f2240m, -1L) != 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public void m3265b() {
    }

    /* renamed from: c */
    public void m3268c() {
        m3266b(f2238a);
        m3270d();
        m3262a(true);
    }

    /* renamed from: d */
    public void m3270d() {
        try {
            if (this.f2255g.length() > 0) {
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>>*** flushMemoryData: 事件落库。");
                C3391h.m3158a(f2238a).m3173a(this.f2255g);
                this.f2255g = new JSONArray();
            }
            PreferenceWrapper.getDefault(f2238a).edit().putLong(f2241n, this.f2259k).putInt(f2244q, this.f2257i).putInt(f2245r, this.f2258j).commit();
        } catch (Throwable unused) {
        }
    }

    private C3397n() {
        this.f2250b = null;
        this.f2251c = null;
        this.f2252d = null;
        this.f2253e = null;
        this.f2254f = 10;
        this.f2255g = new JSONArray();
        this.f2256h = 5000;
        this.f2257i = 0;
        this.f2258j = 0;
        this.f2259k = 0L;
        this.f2260s = 28800000L;
        this.f2261u = false;
        this.f2262v = false;
        this.f2263w = new Object();
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2238a);
            this.f2259k = sharedPreferences.getLong(f2241n, 0L);
            this.f2257i = sharedPreferences.getInt(f2244q, 0);
            this.f2258j = sharedPreferences.getInt(f2245r, 0);
            this.f2250b = new c();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private void m3232b(JSONObject jSONObject) {
        JSONObject jSONObjectM3187f;
        if (C3391h.m3158a(UMGlobalContext.getAppContext(f2238a)).m3183c() || (jSONObjectM3187f = C3391h.m3158a(UMGlobalContext.getAppContext(f2238a)).m3187f()) == null) {
            return;
        }
        String strOptString = jSONObjectM3187f.optString("__av");
        String strOptString2 = jSONObjectM3187f.optString("__vc");
        try {
            if (TextUtils.isEmpty(strOptString)) {
                jSONObject.put("app_version", UMUtils.getAppVersionName(f2238a));
            } else {
                jSONObject.put("app_version", strOptString);
            }
            if (TextUtils.isEmpty(strOptString2)) {
                jSONObject.put("version_code", UMUtils.getAppVersionCode(f2238a));
            } else {
                jSONObject.put("version_code", strOptString2);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    private void m3243g(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        try {
            if (jSONObject.getJSONObject("header").has(C3380c.f1976aB)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has("analytics")) {
                    if (!jSONObject.getJSONObject("analytics").has(C3380c.f2021n)) {
                        UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> Error, Should not go to this branch.");
                        return;
                    }
                    C3391h.m3158a(f2238a).m3190i();
                    C3391h.m3158a(f2238a).m3189h();
                    C3391h.m3158a(f2238a).m3181b(true, false);
                    C3391h.m3158a(f2238a).m3172a();
                    return;
                }
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has("analytics") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("analytics")) != null && jSONObjectOptJSONObject.length() > 0) {
                if (jSONObjectOptJSONObject.has(C3380c.f2021n)) {
                    C3391h.m3158a(f2238a).m3181b(true, false);
                }
                if (jSONObjectOptJSONObject.has("ekv") || jSONObjectOptJSONObject.has(C3380c.f1967T)) {
                    C3391h.m3158a(f2238a).m3189h();
                }
                if (jSONObjectOptJSONObject.has(C3380c.f1962O)) {
                    C3391h.m3158a(f2238a).m3190i();
                }
            }
            C3391h.m3158a(f2238a).m3172a();
        } catch (Exception unused) {
        }
    }

    /* renamed from: com.umeng.analytics.pro.n$c */
    public static class c {

        /* renamed from: a */
        private ReportPolicy.ReportStrategy f2294a = null;

        /* renamed from: b */
        private int f2295b = -1;

        /* renamed from: c */
        private int f2296c = -1;

        /* renamed from: d */
        private int f2297d = -1;

        /* renamed from: e */
        private int f2298e = -1;

        /* renamed from: f */
        private ABTest f2299f;

        public c() {
            this.f2299f = null;
            this.f2299f = ABTest.getService(C3397n.f2238a);
        }

        /* renamed from: a */
        public void m3277a() {
            try {
                int[] iArrM3278a = m3278a(-1, -1);
                this.f2295b = iArrM3278a[0];
                this.f2296c = iArrM3278a[1];
            } catch (Throwable unused) {
            }
        }

        /* renamed from: b */
        public void m3279b() {
            int iM3276a;
            Defcon service = Defcon.getService(C3397n.f2238a);
            if (service.isOpen()) {
                ReportPolicy.ReportStrategy reportStrategy = this.f2294a;
                this.f2294a = (reportStrategy instanceof ReportPolicy.DefconPolicy) && reportStrategy.isValid() ? this.f2294a : new ReportPolicy.DefconPolicy(StatTracer.getInstance(C3397n.f2238a), service);
            } else {
                boolean z3 = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3397n.f2238a, "integrated_test", C3397n.f2246t)).intValue() == 1;
                if (UMConfigure.isDebugLog() && z3 && !MLog.DEBUG) {
                    UMLog.mutlInfo(C3392i.f2151K, 3, "\\|", null, null);
                }
                if (MLog.DEBUG && z3) {
                    this.f2294a = new ReportPolicy.DebugPolicy(StatTracer.getInstance(C3397n.f2238a));
                } else if (this.f2299f.isInTest() && "RPT".equals(this.f2299f.getTestName())) {
                    if (this.f2299f.getTestPolicy() == 6) {
                        if (Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3397n.f2238a, "test_report_interval", C3397n.f2246t)).intValue() != -1) {
                            iM3276a = m3276a(90000);
                        } else {
                            iM3276a = this.f2296c;
                            if (iM3276a <= 0) {
                                iM3276a = this.f2298e;
                            }
                        }
                    } else {
                        iM3276a = 0;
                    }
                    this.f2294a = m3275b(this.f2299f.getTestPolicy(), iM3276a);
                } else {
                    int i4 = this.f2297d;
                    int i5 = this.f2298e;
                    int i6 = this.f2295b;
                    if (i6 != -1) {
                        i5 = this.f2296c;
                        i4 = i6;
                    }
                    this.f2294a = m3275b(i4, i5);
                }
            }
            if (UMConfigure.isDebugLog()) {
                try {
                    ReportPolicy.ReportStrategy reportStrategy2 = this.f2294a;
                    if (reportStrategy2 instanceof ReportPolicy.ReportAtLaunch) {
                        UMLog.mutlInfo(C3392i.f2149I, 3, "", null, null);
                    } else if (reportStrategy2 instanceof ReportPolicy.ReportByInterval) {
                        UMLog.mutlInfo(C3392i.f2150J, 3, "", new String[]{"@"}, new String[]{String.valueOf(((ReportPolicy.ReportByInterval) reportStrategy2).getReportInterval() / 1000)});
                    } else if (reportStrategy2 instanceof ReportPolicy.DebugPolicy) {
                        UMLog.mutlInfo(C3392i.f2152L, 3, "", null, null);
                    } else if (reportStrategy2 instanceof ReportPolicy.ReportQuasiRealtime) {
                        UMLog.mutlInfo(C3392i.f2153M, 3, "", new String[]{"@"}, new String[]{String.valueOf(((ReportPolicy.ReportQuasiRealtime) reportStrategy2).getReportInterval() / 1000)});
                    } else {
                        boolean z4 = reportStrategy2 instanceof ReportPolicy.DefconPolicy;
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* renamed from: c */
        public ReportPolicy.ReportStrategy m3280c() {
            m3279b();
            return this.f2294a;
        }

        /* renamed from: a */
        public int[] m3278a(int i4, int i5) {
            int iIntValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3397n.f2238a, "report_policy", C3397n.f2246t)).intValue();
            int iIntValue2 = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3397n.f2238a, "report_interval", C3397n.f2246t)).intValue();
            if (iIntValue == -1 || !ReportPolicy.isValid(iIntValue)) {
                return new int[]{i4, i5};
            }
            if (6 == iIntValue) {
                if (iIntValue2 == -1 || iIntValue2 < 90 || iIntValue2 > 86400) {
                    iIntValue2 = 90;
                }
                return new int[]{iIntValue, iIntValue2 * 1000};
            }
            if (11 == iIntValue) {
                if (iIntValue2 == -1 || iIntValue2 < 15 || iIntValue2 > 3600) {
                    iIntValue2 = 15;
                }
                return new int[]{iIntValue, iIntValue2 * 1000};
            }
            return new int[]{i4, i5};
        }

        /* renamed from: a */
        public int m3276a(int i4) {
            int iIntValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C3397n.f2238a, "test_report_interval", C3397n.f2246t)).intValue();
            return (iIntValue == -1 || iIntValue < 90 || iIntValue > 86400) ? i4 : iIntValue * 1000;
        }

        /* renamed from: b */
        private ReportPolicy.ReportStrategy m3275b(int i4, int i5) {
            if (i4 == 0) {
                ReportPolicy.ReportStrategy reportStrategy = this.f2294a;
                return reportStrategy instanceof ReportPolicy.ReportRealtime ? reportStrategy : new ReportPolicy.ReportRealtime();
            }
            if (i4 == 1) {
                ReportPolicy.ReportStrategy reportStrategy2 = this.f2294a;
                return reportStrategy2 instanceof ReportPolicy.ReportAtLaunch ? reportStrategy2 : new ReportPolicy.ReportAtLaunch();
            }
            if (i4 == 4) {
                ReportPolicy.ReportStrategy reportStrategy3 = this.f2294a;
                return reportStrategy3 instanceof ReportPolicy.ReportDaily ? reportStrategy3 : new ReportPolicy.ReportDaily(StatTracer.getInstance(C3397n.f2238a));
            }
            if (i4 == 5) {
                ReportPolicy.ReportStrategy reportStrategy4 = this.f2294a;
                return reportStrategy4 instanceof ReportPolicy.ReportWifiOnly ? reportStrategy4 : new ReportPolicy.ReportWifiOnly(C3397n.f2238a);
            }
            if (i4 == 6) {
                ReportPolicy.ReportStrategy reportStrategy5 = this.f2294a;
                if (reportStrategy5 instanceof ReportPolicy.ReportByInterval) {
                    ((ReportPolicy.ReportByInterval) reportStrategy5).setReportInterval(i5);
                    return reportStrategy5;
                }
                return new ReportPolicy.ReportByInterval(StatTracer.getInstance(C3397n.f2238a), i5);
            }
            if (i4 == 8) {
                ReportPolicy.ReportStrategy reportStrategy6 = this.f2294a;
                return reportStrategy6 instanceof ReportPolicy.SmartPolicy ? reportStrategy6 : new ReportPolicy.SmartPolicy(StatTracer.getInstance(C3397n.f2238a));
            }
            if (i4 != 11) {
                ReportPolicy.ReportStrategy reportStrategy7 = this.f2294a;
                return reportStrategy7 instanceof ReportPolicy.ReportAtLaunch ? reportStrategy7 : new ReportPolicy.ReportAtLaunch();
            }
            ReportPolicy.ReportStrategy reportStrategy8 = this.f2294a;
            if (reportStrategy8 instanceof ReportPolicy.ReportQuasiRealtime) {
                ((ReportPolicy.ReportQuasiRealtime) reportStrategy8).setReportInterval(i5);
                return reportStrategy8;
            }
            ReportPolicy.ReportQuasiRealtime reportQuasiRealtime = new ReportPolicy.ReportQuasiRealtime();
            reportQuasiRealtime.setReportInterval(i5);
            return reportQuasiRealtime;
        }
    }

    /* renamed from: c */
    private void m3233c(JSONObject jSONObject) {
        try {
            if (!C3391h.m3158a(f2238a).m3186e()) {
                JSONObject jSONObjectM3188g = C3391h.m3158a(f2238a).m3188g();
                if (jSONObjectM3188g != null) {
                    String strOptString = jSONObjectM3188g.optString("__av");
                    String strOptString2 = jSONObjectM3188g.optString("__vc");
                    if (TextUtils.isEmpty(strOptString)) {
                        jSONObject.put("app_version", UMUtils.getAppVersionName(f2238a));
                    } else {
                        jSONObject.put("app_version", strOptString);
                    }
                    if (TextUtils.isEmpty(strOptString2)) {
                        jSONObject.put("version_code", UMUtils.getAppVersionCode(f2238a));
                        return;
                    } else {
                        jSONObject.put("version_code", strOptString2);
                        return;
                    }
                }
                return;
            }
            jSONObject.put("app_version", UMUtils.getAppVersionName(f2238a));
            jSONObject.put("version_code", UMUtils.getAppVersionCode(f2238a));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m3258a() {
        if (f2238a != null) {
            synchronized (this.f2263w) {
                if (this.f2261u) {
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> network is now available, rebuild instant session data packet.");
                    Context context = f2238a;
                    UMWorkDispatch.sendEvent(context, a.f2278l, CoreProtocol.getInstance(context), null);
                }
            }
            synchronized (this.f2263w) {
                if (this.f2262v) {
                    Context context2 = f2238a;
                    UMWorkDispatch.sendEvent(context2, a.f2279m, CoreProtocol.getInstance(context2), null);
                }
            }
        }
    }

    /* renamed from: com.umeng.analytics.pro.n$d */
    public static class d {

        /* renamed from: a */
        private Map<String, Object> f2300a;

        /* renamed from: b */
        private String f2301b;

        /* renamed from: c */
        private String f2302c;

        /* renamed from: d */
        private long f2303d;

        private d() {
            this.f2300a = null;
            this.f2301b = null;
            this.f2302c = null;
            this.f2303d = 0L;
        }

        /* renamed from: a */
        public Map<String, Object> m3281a() {
            return this.f2300a;
        }

        /* renamed from: b */
        public String m3282b() {
            return this.f2302c;
        }

        /* renamed from: c */
        public String m3283c() {
            return this.f2301b;
        }

        /* renamed from: d */
        public long m3284d() {
            return this.f2303d;
        }

        public d(String str, Map<String, Object> map, String str2, long j4) {
            this.f2300a = map;
            this.f2301b = str;
            this.f2303d = j4;
            this.f2302c = str2;
        }
    }

    /* renamed from: h */
    private void m3245h(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null || jSONObject.length() <= 0 || !jSONObject.has("__ii")) {
                return;
            }
            String strOptString = jSONObject.optString("__ii");
            jSONObject.remove("__ii");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            C3391h.m3158a(f2238a).m3176a(strOptString, obj.toString(), 2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private void m3235d(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.length() <= 0) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("analytics")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("analytics");
                if (jSONObject4.has("ekv")) {
                    str = "version_code";
                    jSONObject3.put("ekv", jSONObject4.getJSONArray("ekv"));
                    if (jSONObject3.length() > 0) {
                        MLog.m3641d("事件:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                } else {
                    str = "version_code";
                }
                if (jSONObject4.has(C3380c.f1967T)) {
                    jSONObject3.put(C3380c.f1967T, jSONObject4.getJSONArray(C3380c.f1967T));
                    if (jSONObject3.length() > 0) {
                        MLog.m3641d("游戏事件:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(C3380c.f1962O)) {
                    jSONObject3.put(C3380c.f1962O, jSONObject4.getJSONArray(C3380c.f1962O));
                    if (jSONObject3.length() > 0) {
                        MLog.m3641d("错误:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(C3380c.f2021n)) {
                    JSONArray jSONArray = jSONObject4.getJSONArray(C3380c.f2021n);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i4);
                        if (jSONObject5 != null && jSONObject5.length() > 0) {
                            if (jSONObject5.has(C3380c.f2028u)) {
                                jSONObject5.remove(C3380c.f2028u);
                            }
                            jSONArray2.put(jSONObject5);
                        }
                    }
                    jSONObject3.put(C3380c.f2021n, jSONArray2);
                    if (jSONObject3.length() > 0) {
                        MLog.m3641d("会话:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(C3380c.f1956I)) {
                    jSONObject3.put(C3380c.f1956I, jSONObject4.getJSONObject(C3380c.f1956I));
                }
                if (jSONObject4.has(C3380c.f1959L)) {
                    jSONObject3.put(C3380c.f1959L, jSONObject4.getJSONObject(C3380c.f1959L));
                    if (jSONObject3.length() > 0) {
                        MLog.m3641d("账号:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
            } else {
                str = "version_code";
            }
            if (jSONObject.has("dplus")) {
                jSONObject3.put("dplus", jSONObject.getJSONObject("dplus"));
            }
            if (jSONObject.has("header") && jSONObject.has("header") && (jSONObject2 = jSONObject.getJSONObject("header")) != null && jSONObject2.length() > 0) {
                if (jSONObject2.has("sdk_version")) {
                    jSONObject3.put("sdk_version", jSONObject2.getString("sdk_version"));
                }
                if (jSONObject2.has("device_id")) {
                    jSONObject3.put("device_id", jSONObject2.getString("device_id"));
                }
                if (jSONObject2.has("device_model")) {
                    jSONObject3.put("device_model", jSONObject2.getString("device_model"));
                }
                String str2 = str;
                if (jSONObject2.has(str2)) {
                    jSONObject3.put("version", jSONObject2.getInt(str2));
                }
                if (jSONObject2.has("appkey")) {
                    jSONObject3.put("appkey", jSONObject2.getString("appkey"));
                }
                if (jSONObject2.has("channel")) {
                    jSONObject3.put("channel", jSONObject2.getString("channel"));
                }
                if (jSONObject3.length() > 0) {
                    MLog.m3641d("基础信息:" + jSONObject3.toString());
                    jSONObject3 = new JSONObject();
                }
            }
            jSONObject3.length();
        } catch (Throwable th) {
            MLog.m3651e(th);
        }
    }

    /* renamed from: b */
    public JSONObject m3263b(long j4) throws JSONException {
        if (TextUtils.isEmpty(C3407x.m3344a().m3359d(UMGlobalContext.getAppContext(f2238a)))) {
            return null;
        }
        JSONObject jSONObjectM3178b = C3391h.m3158a(UMGlobalContext.getAppContext(f2238a)).m3178b(false);
        String[] strArrM2814a = C3321c.m2814a(f2238a);
        if (strArrM2814a != null && !TextUtils.isEmpty(strArrM2814a[0]) && !TextUtils.isEmpty(strArrM2814a[1])) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C3380c.f1960M, strArrM2814a[0]);
                jSONObject.put(C3380c.f1961N, strArrM2814a[1]);
                if (jSONObject.length() > 0) {
                    jSONObjectM3178b.put(C3380c.f1959L, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        int iM3294a = C3400q.m3290a().m3294a(f2238a);
        if (jSONObjectM3178b.length() == 1 && jSONObjectM3178b.optJSONObject(C3380c.f1959L) != null && iM3294a != 3) {
            return null;
        }
        C3400q.m3290a().m3296b(jSONObjectM3178b, f2238a);
        if (jSONObjectM3178b.length() <= 0 && iM3294a != 3) {
            return null;
        }
        JSONObject jSONObjectM3248k = m3248k();
        if (jSONObjectM3248k != null) {
            m3232b(jSONObjectM3248k);
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            if (iM3294a == 3) {
                jSONObject3.put("analytics", new JSONObject());
            } else if (jSONObjectM3178b.length() > 0) {
                jSONObject3.put("analytics", jSONObjectM3178b);
            }
            if (jSONObjectM3248k != null && jSONObjectM3248k.length() > 0) {
                jSONObject2.put("header", jSONObjectM3248k);
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("content", jSONObject3);
            }
            return m3231b(jSONObject2, j4);
        } catch (Throwable unused2) {
            return jSONObject2;
        }
    }

    /* renamed from: c */
    private boolean m3234c(boolean z3) {
        if (m3256s()) {
            return true;
        }
        if (this.f2250b == null) {
            this.f2250b = new c();
        }
        this.f2250b.m3277a();
        ReportPolicy.ReportStrategy reportStrategyM3280c = this.f2250b.m3280c();
        boolean zShouldSendMessage = reportStrategyM3280c.shouldSendMessage(z3);
        if (zShouldSendMessage) {
            if (((reportStrategyM3280c instanceof ReportPolicy.ReportByInterval) || (reportStrategyM3280c instanceof ReportPolicy.DebugPolicy) || (reportStrategyM3280c instanceof ReportPolicy.ReportQuasiRealtime)) && m3253p()) {
                m3270d();
            }
            if ((reportStrategyM3280c instanceof ReportPolicy.DefconPolicy) && m3253p()) {
                m3270d();
            }
            if (UMConfigure.isDebugLog()) {
                MLog.m3641d("数据发送策略 : " + reportStrategyM3280c.getClass().getSimpleName());
            }
        }
        return zShouldSendMessage;
    }

    /* renamed from: e */
    private void m3238e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.length() <= 0) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has("analytics")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("analytics");
                if (jSONObject4.has(C3380c.f2021n)) {
                    JSONArray jSONArray = jSONObject4.getJSONArray(C3380c.f2021n);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i4);
                        if (jSONObject5 != null && jSONObject5.length() > 0) {
                            jSONArray2.put(jSONObject5);
                        }
                    }
                    jSONObject3.put(C3380c.f2021n, jSONArray2);
                    if (jSONObject3.length() > 0) {
                        MLog.m3641d("本次启动会话:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(C3380c.f1959L)) {
                    jSONObject3.put(C3380c.f1959L, jSONObject4.getJSONObject(C3380c.f1959L));
                    if (jSONObject3.length() > 0) {
                        MLog.m3641d("本次启动账号:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
            }
            if (jSONObject.has("header") && jSONObject.has("header") && (jSONObject2 = jSONObject.getJSONObject("header")) != null && jSONObject2.length() > 0) {
                if (jSONObject2.has("sdk_version")) {
                    jSONObject3.put("sdk_version", jSONObject2.getString("sdk_version"));
                }
                if (jSONObject2.has("device_id")) {
                    jSONObject3.put("device_id", jSONObject2.getString("device_id"));
                }
                if (jSONObject2.has("device_model")) {
                    jSONObject3.put("device_model", jSONObject2.getString("device_model"));
                }
                if (jSONObject2.has("version_code")) {
                    jSONObject3.put("version", jSONObject2.getInt("version_code"));
                }
                if (jSONObject2.has("appkey")) {
                    jSONObject3.put("appkey", jSONObject2.getString("appkey"));
                }
                if (jSONObject2.has("channel")) {
                    jSONObject3.put("channel", jSONObject2.getString("channel"));
                }
                if (jSONObject3.length() > 0) {
                    MLog.m3641d("本次启动基础信息:" + jSONObject3.toString());
                    jSONObject3 = new JSONObject();
                }
            }
            jSONObject3.length();
        } catch (Throwable th) {
            MLog.m3651e(th);
        }
    }

    /* renamed from: a */
    private void m3227a(String str, String str2) {
        Method method;
        Class<?> cls = f2248y;
        if (cls == null || (method = f2249z) == null) {
            return;
        }
        try {
            method.invoke(cls, str, str2);
        } catch (Throwable unused) {
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> reflect call setPuidAndProvider method of crash lib failed.");
        }
    }

    /* renamed from: a */
    public void m3260a(Object obj, int i4) {
        if (AnalyticsConfig.enable) {
            if (i4 != 8213) {
                try {
                    switch (i4) {
                        case 4097:
                            if (UMUtils.isMainProgress(f2238a)) {
                                if (obj != null) {
                                    m3237e(obj);
                                }
                                if (f2246t.equals(((JSONObject) obj).optString("__i"))) {
                                    return;
                                }
                                m3262a(false);
                                return;
                            }
                            UMProcessDBHelper.getInstance(f2238a).insertEventsInSubProcess(UMFrUtils.getSubProcessName(f2238a), new JSONArray().put(obj));
                            return;
                        case 4098:
                            if (obj != null) {
                                m3237e(obj);
                            }
                            if (f2246t.equals(((JSONObject) obj).optString("__i"))) {
                                return;
                            }
                            m3262a(false);
                            return;
                        case 4099:
                            C3404u.m3334a(f2238a);
                            return;
                        case 4100:
                            C3394k.m3205c(f2238a);
                            return;
                        case a.f2271e /* 4101 */:
                            UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_SIGNIN");
                            m3261a((Object) null, true);
                            m3242g(obj);
                            return;
                        case a.f2272f /* 4102 */:
                            UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_SIGNOFF");
                            m3261a((Object) null, true);
                            m3239f(obj);
                            return;
                        case a.f2273g /* 4103 */:
                            UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> START_SESSION");
                            C3403t.m3314a().m3323a(f2238a, obj);
                            synchronized (this.f2263w) {
                                this.f2262v = true;
                            }
                            return;
                        case a.f2274h /* 4104 */:
                            C3403t.m3314a().m3332c(f2238a, obj);
                            return;
                        case a.f2275i /* 4105 */:
                            m3270d();
                            return;
                        case a.f2276j /* 4106 */:
                            m3245h(obj);
                            return;
                        default:
                            switch (i4) {
                                case 4352:
                                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> INSTANT_SESSION_START");
                                    C3403t.m3314a().m3328b(f2238a, obj);
                                    synchronized (this.f2263w) {
                                        this.f2261u = true;
                                    }
                                    return;
                                case a.f2278l /* 4353 */:
                                    m3261a(obj, true);
                                    return;
                                case a.f2279m /* 4354 */:
                                    m3268c();
                                    return;
                                case a.f2280n /* 4355 */:
                                    if (!UMUtils.isMainProgress(f2238a)) {
                                        UMProcessDBHelper.getInstance(f2238a).insertEventsInSubProcess(UMFrUtils.getSubProcessName(f2238a), new JSONArray().put(obj));
                                        return;
                                    } else {
                                        if (obj != null) {
                                            m3237e(obj);
                                            m3270d();
                                            return;
                                        }
                                        return;
                                    }
                                case a.f2281o /* 4356 */:
                                    if (obj == null || f2248y == null || f2249z == null) {
                                        return;
                                    }
                                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_CHANGE_NOTIFY");
                                    String string = "";
                                    String string2 = "";
                                    if (obj instanceof JSONObject) {
                                        JSONObject jSONObject = (JSONObject) obj;
                                        if (jSONObject.has("uid") && jSONObject.has(C3380c.f1960M)) {
                                            string = jSONObject.getString(C3380c.f1960M);
                                            string2 = jSONObject.getString("uid");
                                        }
                                        m3227a(string2, string);
                                        return;
                                    }
                                    return;
                                default:
                                    switch (i4) {
                                        case a.f2284r /* 8195 */:
                                            C3320b.m2757a().m2779a(obj);
                                            return;
                                        case a.f2285s /* 8196 */:
                                            C3320b.m2757a().m2810m();
                                            return;
                                        case 8197:
                                            C3320b.m2757a().m2808k();
                                            return;
                                        default:
                                            switch (i4) {
                                                case a.f2287u /* 8199 */:
                                                case a.f2288v /* 8200 */:
                                                    C3320b.m2757a().m2788b(obj);
                                                    return;
                                                case a.f2289w /* 8201 */:
                                                    C3320b.m2757a().m2788b((Object) null);
                                                    return;
                                                default:
                                                    switch (i4) {
                                                        case a.f2290x /* 8208 */:
                                                            UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> receive DELAY_BUILD_ENVELOPE event.");
                                                            Context context = f2238a;
                                                            UMWorkDispatch.sendEvent(context, a.f2291y, CoreProtocol.getInstance(context), null);
                                                            Context context2 = f2238a;
                                                            UMWorkDispatch.sendEvent(context2, a.f2279m, CoreProtocol.getInstance(context2), null);
                                                            return;
                                                        case a.f2291y /* 8209 */:
                                                            m3261a(obj, false);
                                                            return;
                                                        case a.f2292z /* 8210 */:
                                                            UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> recv BUILD_ENVELOPE_IMMEDIATELY.");
                                                            if (!UMUtils.isMainProgress(f2238a) || (this.f2250b.m3280c() instanceof ReportPolicy.ReportQuasiRealtime)) {
                                                                return;
                                                            }
                                                            m3262a(true);
                                                            return;
                                                        default:
                                                            return;
                                                    }
                                            }
                                    }
                            }
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
            if (FieldManager.allow(C3510b.f2970E)) {
                if (DeviceConfig.getGlobleActivity(f2238a) != null) {
                    C3403t.m3317b(f2238a);
                }
                Context context3 = f2238a;
                UMWorkDispatch.sendEventEx(context3, a.f2266C, CoreProtocol.getInstance(context3), null, 5000L);
            }
        }
    }

    /* renamed from: g */
    private void m3242g(Object obj) {
        try {
            m3266b(f2238a);
            m3270d();
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                String string = jSONObject.getString(C3380c.f1960M);
                String string2 = jSONObject.getString("uid");
                long j4 = jSONObject.getLong("ts");
                String[] strArrM2814a = C3321c.m2814a(f2238a);
                if (strArrM2814a != null && string.equals(strArrM2814a[0]) && string2.equals(strArrM2814a[1])) {
                    return;
                }
                C3403t.m3314a().m3322a(f2238a, j4);
                String strM3358c = C3407x.m3344a().m3358c(f2238a);
                boolean zM3329b = C3403t.m3314a().m3329b(f2238a, j4, false);
                C3321c.m2813a(f2238a, string, string2);
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> onProfileSignIn: force generate new session: session id = " + strM3358c);
                C3403t.m3314a().m3321a(f2238a, j4, true);
                if (zM3329b) {
                    C3403t.m3314a().m3327b(f2238a, j4);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    public long m3273f() {
        SharedPreferences sharedPreferences;
        long jCurrentTimeMillis = 0;
        try {
            Context context = f2238a;
            if (context == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null) {
                return 0L;
            }
            long j4 = sharedPreferences.getLong(f2239l, 0L);
            if (j4 == 0) {
                try {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    sharedPreferences.edit().putLong(f2239l, jCurrentTimeMillis).commit();
                    return jCurrentTimeMillis;
                } catch (Throwable unused) {
                }
            }
            return j4;
        } catch (Throwable unused2) {
            return jCurrentTimeMillis;
        }
    }

    /* renamed from: c */
    public void m3269c(Object obj) {
        m3266b(f2238a);
        m3270d();
        if (m3236d(false)) {
            m3247j();
        }
    }

    /* renamed from: f */
    private void m3239f(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                long j4 = jSONObject.getLong("ts");
                m3266b(f2238a);
                m3270d();
                String[] strArrM2814a = C3321c.m2814a(f2238a);
                if (strArrM2814a == null || TextUtils.isEmpty(strArrM2814a[0]) || TextUtils.isEmpty(strArrM2814a[1])) {
                    return;
                }
                C3403t.m3314a().m3322a(f2238a, j4);
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> onProfileSignIn: force generate new session: session id = " + C3407x.m3344a().m3358c(f2238a));
                boolean zM3329b = C3403t.m3314a().m3329b(f2238a, j4, false);
                C3321c.m2815b(f2238a);
                C3403t.m3314a().m3321a(f2238a, j4, true);
                if (zM3329b) {
                    C3403t.m3314a().m3327b(f2238a, j4);
                }
            }
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m3649e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    /* renamed from: b */
    private JSONObject m3231b(JSONObject jSONObject, long j4) {
        try {
            if (C3399p.m3288a(jSONObject) <= j4) {
                return jSONObject;
            }
            jSONObject = null;
            C3391h.m3158a(f2238a).m3175a(true, false);
            C3391h.m3158a(f2238a).m3179b();
            UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> Instant session packet overload !!! ");
            return null;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: b */
    public JSONObject m3264b(boolean z3) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObjectM3171a = null;
        try {
            jSONObjectM3171a = C3391h.m3158a(f2238a).m3171a(z3);
            if (jSONObjectM3171a == null) {
                jSONObjectM3171a = new JSONObject();
            } else {
                try {
                    boolean zHas = jSONObjectM3171a.has(C3380c.f2021n);
                    jSONObjectM3171a = jSONObjectM3171a;
                    if (zHas) {
                        JSONArray jSONArray3 = jSONObjectM3171a.getJSONArray(C3380c.f2021n);
                        JSONArray jSONArray4 = new JSONArray();
                        int i4 = 0;
                        while (i4 < jSONArray3.length()) {
                            JSONObject jSONObject = (JSONObject) jSONArray3.get(i4);
                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(C3380c.f2027t);
                            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(C3380c.f2028u);
                            if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 != null) {
                                jSONObject.put(C3380c.f2027t, jSONArrayOptJSONArray2);
                                jSONObject.remove(C3380c.f2028u);
                            }
                            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 != null) {
                                ArrayList arrayList = new ArrayList();
                                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                                    arrayList.add((JSONObject) jSONArrayOptJSONArray.get(i5));
                                }
                                for (int i6 = 0; i6 < jSONArrayOptJSONArray2.length(); i6++) {
                                    arrayList.add((JSONObject) jSONArrayOptJSONArray2.get(i6));
                                }
                                JSONArraySortUtil jSONArraySortUtil = new JSONArraySortUtil();
                                jSONArraySortUtil.setCompareKey(C3380c.f2031x);
                                Collections.sort(arrayList, jSONArraySortUtil);
                                JSONArray jSONArray5 = new JSONArray();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    jSONArray5.put((JSONObject) it.next());
                                }
                                jSONObject.put(C3380c.f2027t, jSONArray5);
                                jSONObject.remove(C3380c.f2028u);
                            }
                            if (jSONObject.has(C3380c.f2027t)) {
                                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(C3380c.f2027t);
                                int i7 = 0;
                                while (i7 < jSONArrayOptJSONArray3.length()) {
                                    JSONObject jSONObject2 = jSONArrayOptJSONArray3.getJSONObject(i7);
                                    if (jSONObject2.has(C3380c.f2031x)) {
                                        jSONArray2 = jSONArray3;
                                        jSONObject2.put("ts", jSONObject2.getLong(C3380c.f2031x));
                                        jSONObject2.remove(C3380c.f2031x);
                                    } else {
                                        jSONArray2 = jSONArray3;
                                    }
                                    i7++;
                                    jSONArray3 = jSONArray2;
                                }
                                jSONArray = jSONArray3;
                                jSONObject.put(C3380c.f2027t, jSONArrayOptJSONArray3);
                                jSONObject.put(C3380c.f2033z, jSONArrayOptJSONArray3.length());
                            } else {
                                jSONArray = jSONArray3;
                                jSONObject.put(C3380c.f2033z, 0);
                            }
                            jSONArray4.put(jSONObject);
                            i4++;
                            jSONArray3 = jSONArray;
                        }
                        jSONObjectM3171a.put(C3380c.f2021n, jSONArray4);
                        jSONObjectM3171a = jSONObjectM3171a;
                    }
                } catch (Exception e4) {
                    MLog.m3647e("merge pages error");
                    e4.printStackTrace();
                    jSONObjectM3171a = jSONObjectM3171a;
                }
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2238a);
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("userlevel", "");
                if (!TextUtils.isEmpty(string)) {
                    jSONObjectM3171a.put("userlevel", string);
                }
            }
            String[] strArrM2814a = C3321c.m2814a(f2238a);
            if (strArrM2814a != null && !TextUtils.isEmpty(strArrM2814a[0]) && !TextUtils.isEmpty(strArrM2814a[1])) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(C3380c.f1960M, strArrM2814a[0]);
                jSONObject3.put(C3380c.f1961N, strArrM2814a[1]);
                if (jSONObject3.length() > 0) {
                    jSONObjectM3171a.put(C3380c.f1959L, jSONObject3);
                }
            }
            if (ABTest.getService(f2238a).isInTest()) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(ABTest.getService(f2238a).getTestName(), ABTest.getService(f2238a).getGroupInfo());
                jSONObjectM3171a.put(C3380c.f1958K, jSONObject4);
            }
            C3400q.m3290a().m3295a(jSONObjectM3171a, f2238a);
        } catch (Throwable unused) {
        }
        return jSONObjectM3171a;
    }

    /* renamed from: e */
    public void m3272e() {
        if (m3236d(false)) {
            m3247j();
        }
    }

    /* renamed from: d */
    public void m3271d(Object obj) {
        m3255r();
        m3250m();
        m3251n();
        m3262a(true);
    }

    /* renamed from: d */
    private boolean m3236d(boolean z3) {
        if (this.f2250b == null) {
            this.f2250b = new c();
        }
        ReportPolicy.ReportStrategy reportStrategyM3280c = this.f2250b.m3280c();
        if (!(reportStrategyM3280c instanceof ReportPolicy.DefconPolicy)) {
            return true;
        }
        if (z3) {
            return ((ReportPolicy.DefconPolicy) reportStrategyM3280c).shouldSendMessageByInstant();
        }
        return reportStrategyM3280c.shouldSendMessage(false);
    }

    /* renamed from: b */
    public void m3267b(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0 && (!jSONObject.has("exception") || 101 != jSONObject.getInt("exception"))) {
                    m3240f(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void m3262a(boolean z3) {
        if (m3234c(z3)) {
            if (!(this.f2250b.m3280c() instanceof ReportPolicy.ReportQuasiRealtime)) {
                if (UMEnvelopeBuild.isReadyBuild(f2238a, UMLogDataProtocol.UMBusinessType.U_APP)) {
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> constructMessage()");
                    m3247j();
                    return;
                }
                return;
            }
            if (z3) {
                if (UMEnvelopeBuild.isOnline(f2238a)) {
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> send session start in policy ReportQuasiRealtime.");
                    m3247j();
                    return;
                }
                return;
            }
            if (UMEnvelopeBuild.isReadyBuild(f2238a, UMLogDataProtocol.UMBusinessType.U_APP)) {
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> send normal data in policy ReportQuasiRealtime.");
                m3247j();
            }
        }
    }

    /* renamed from: b */
    public void m3266b(Context context) {
        try {
            C3391h.m3158a(context).m3185d();
            m3254q();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private boolean m3229a(JSONArray jSONArray) {
        int length = jSONArray.length();
        List listAsList = Arrays.asList("$$_onUMengEnterForeground", "$$_onUMengEnterBackground", "$$_onUMengEnterForegroundInitError");
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i5);
                if (jSONObjectOptJSONObject != null && listAsList.contains(jSONObjectOptJSONObject.optString("id"))) {
                    i4++;
                }
            } catch (Throwable unused) {
            }
        }
        return i4 >= length;
    }

    /* renamed from: a */
    private boolean m3230a(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ekv");
        int length = jSONArrayOptJSONArray.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i5);
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(itKeys.next());
                    if (jSONArrayOptJSONArray2 != null && m3229a(jSONArrayOptJSONArray2)) {
                        i4++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return i4 >= length;
    }

    /* renamed from: a */
    public JSONObject m3257a(long j4) {
        if (TextUtils.isEmpty(C3407x.m3344a().m3359d(f2238a))) {
            return null;
        }
        JSONObject jSONObjectM3264b = m3264b(false);
        int iM3294a = C3400q.m3290a().m3294a(f2238a);
        if (jSONObjectM3264b.length() > 0) {
            if (jSONObjectM3264b.length() == 1) {
                if (jSONObjectM3264b.optJSONObject(C3380c.f1959L) != null && iM3294a != 3) {
                    return null;
                }
                if (!TextUtils.isEmpty(jSONObjectM3264b.optString("userlevel")) && iM3294a != 3) {
                    return null;
                }
            } else if (jSONObjectM3264b.length() == 2 && jSONObjectM3264b.optJSONObject(C3380c.f1959L) != null && !TextUtils.isEmpty(jSONObjectM3264b.optString("userlevel")) && iM3294a != 3) {
                return null;
            }
            String strOptString = jSONObjectM3264b.optString(C3380c.f2021n);
            String strOptString2 = jSONObjectM3264b.optString(C3380c.f1967T);
            String strOptString3 = jSONObjectM3264b.optString("ekv");
            if (TextUtils.isEmpty(strOptString) && TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && m3230a(jSONObjectM3264b)) {
                return null;
            }
        } else if (iM3294a != 3) {
            return null;
        }
        JSONObject jSONObjectM3249l = m3249l();
        if (jSONObjectM3249l != null) {
            m3233c(jSONObjectM3249l);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (iM3294a == 3) {
                jSONObject2.put("analytics", new JSONObject());
            } else if (jSONObjectM3264b.length() > 0) {
                jSONObject2.put("analytics", jSONObjectM3264b);
            }
            if (jSONObjectM3249l != null && jSONObjectM3249l.length() > 0) {
                jSONObject.put("header", jSONObjectM3249l);
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("content", jSONObject2);
            }
            return m3226a(jSONObject, j4);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: a */
    private JSONObject m3226a(JSONObject jSONObject, long j4) {
        try {
            if (C3399p.m3288a(jSONObject) <= j4) {
                return jSONObject;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("header");
            jSONObject2.put(C3380c.f1976aB, C3399p.m3288a(jSONObject));
            jSONObject.put("header", jSONObject2);
            return C3399p.m3289a(f2238a, j4, jSONObject);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: a */
    private boolean m3228a(long j4, int i4) {
        if (j4 == 0) {
            return true;
        }
        if (System.currentTimeMillis() - j4 <= 28800000) {
            return i4 < 5000;
        }
        m3252o();
        return true;
    }

    /* renamed from: a */
    public void m3259a(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0 && (!jSONObject.has("exception") || 101 != jSONObject.getInt("exception"))) {
                    m3243g(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void m3261a(Object obj, boolean z3) throws JSONException {
        if (z3) {
            if (m3236d(true)) {
                m3246i();
            }
        } else if (UMEnvelopeBuild.isOnline(f2238a) && m3236d(true)) {
            m3246i();
        }
    }
}
