package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.C1836b;
import com.umeng.analytics.C1837c;
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
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ReportPolicy;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.utils.C2026b;
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
import org.android.agoo.message.MessageService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.n */
/* loaded from: classes.dex */
public class C1913n {

    /* renamed from: a */
    private static Context f8830a = null;

    /* renamed from: l */
    private static final String f8831l = "first_activate_time";

    /* renamed from: m */
    private static final String f8832m = "ana_is_f";

    /* renamed from: n */
    private static final String f8833n = "thtstart";

    /* renamed from: o */
    private static final String f8834o = "dstk_last_time";

    /* renamed from: p */
    private static final String f8835p = "dstk_cnt";

    /* renamed from: q */
    private static final String f8836q = "gkvc";

    /* renamed from: r */
    private static final String f8837r = "ekvc";

    /* renamed from: t */
    private static final String f8838t = "-1";

    /* renamed from: x */
    private static final String f8839x = "com.umeng.umcrash.UMCrashUtils";

    /* renamed from: y */
    private static Class<?> f8840y;

    /* renamed from: z */
    private static Method f8841z;

    /* renamed from: b */
    private c f8842b;

    /* renamed from: c */
    private SharedPreferences f8843c;

    /* renamed from: d */
    private String f8844d;

    /* renamed from: e */
    private String f8845e;

    /* renamed from: f */
    private int f8846f;

    /* renamed from: g */
    private JSONArray f8847g;

    /* renamed from: h */
    private final int f8848h;

    /* renamed from: i */
    private int f8849i;

    /* renamed from: j */
    private int f8850j;

    /* renamed from: k */
    private long f8851k;

    /* renamed from: s */
    private final long f8852s;

    /* renamed from: u */
    private boolean f8853u;

    /* renamed from: v */
    private boolean f8854v;

    /* renamed from: w */
    private Object f8855w;

    /* renamed from: com.umeng.analytics.pro.n$a */
    public static class a {

        /* renamed from: A */
        public static final int f8856A = 8211;

        /* renamed from: B */
        public static final int f8857B = 8212;

        /* renamed from: C */
        public static final int f8858C = 8213;

        /* renamed from: a */
        public static final int f8859a = 4097;

        /* renamed from: b */
        public static final int f8860b = 4098;

        /* renamed from: c */
        public static final int f8861c = 4099;

        /* renamed from: d */
        public static final int f8862d = 4100;

        /* renamed from: e */
        public static final int f8863e = 4101;

        /* renamed from: f */
        public static final int f8864f = 4102;

        /* renamed from: g */
        public static final int f8865g = 4103;

        /* renamed from: h */
        public static final int f8866h = 4104;

        /* renamed from: i */
        public static final int f8867i = 4105;

        /* renamed from: j */
        public static final int f8868j = 4106;

        /* renamed from: k */
        public static final int f8869k = 4352;

        /* renamed from: l */
        public static final int f8870l = 4353;

        /* renamed from: m */
        public static final int f8871m = 4354;

        /* renamed from: n */
        public static final int f8872n = 4355;

        /* renamed from: o */
        public static final int f8873o = 4356;

        /* renamed from: p */
        public static final int f8874p = 8193;

        /* renamed from: q */
        public static final int f8875q = 8194;

        /* renamed from: r */
        public static final int f8876r = 8195;

        /* renamed from: s */
        public static final int f8877s = 8196;

        /* renamed from: t */
        public static final int f8878t = 8197;

        /* renamed from: u */
        public static final int f8879u = 8199;

        /* renamed from: v */
        public static final int f8880v = 8200;

        /* renamed from: w */
        public static final int f8881w = 8201;

        /* renamed from: x */
        public static final int f8882x = 8208;

        /* renamed from: y */
        public static final int f8883y = 8209;

        /* renamed from: z */
        public static final int f8884z = 8210;
    }

    /* renamed from: com.umeng.analytics.pro.n$b */
    private static class b {

        /* renamed from: a */
        private static final C1913n f8885a = new C1913n();

        private b() {
        }
    }

    static {
        m7167h();
    }

    /* renamed from: a */
    public static C1913n m7148a(Context context) {
        if (f8830a == null && context != null) {
            f8830a = context.getApplicationContext();
        }
        return b.f8885a;
    }

    /* renamed from: b */
    private void m7155b(JSONObject jSONObject) {
        JSONObject jSONObjectM7110f;
        if (C1907h.m7081a(UMGlobalContext.getAppContext(f8830a)).m7106c() || (jSONObjectM7110f = C1907h.m7081a(UMGlobalContext.getAppContext(f8830a)).m7110f()) == null) {
            return;
        }
        String strOptString = jSONObjectM7110f.optString("__av");
        String strOptString2 = jSONObjectM7110f.optString("__vc");
        try {
            if (TextUtils.isEmpty(strOptString)) {
                jSONObject.put("app_version", UMUtils.getAppVersionName(f8830a));
            } else {
                jSONObject.put("app_version", strOptString);
            }
            if (TextUtils.isEmpty(strOptString2)) {
                jSONObject.put("version_code", UMUtils.getAppVersionCode(f8830a));
            } else {
                jSONObject.put("version_code", strOptString2);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private void m7160e(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (2050 == jSONObject.getInt("__t")) {
                if (!m7151a(this.f8851k, this.f8849i)) {
                    return;
                } else {
                    this.f8849i++;
                }
            } else if (2049 == jSONObject.getInt("__t")) {
                if (!m7151a(this.f8851k, this.f8850j)) {
                    return;
                } else {
                    this.f8850j++;
                }
            }
            if (this.f8847g.length() >= this.f8846f) {
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>>*** 超过10个事件，事件落库。");
                C1907h.m7081a(f8830a).m7096a(this.f8847g);
                this.f8847g = new JSONArray();
            }
            if (this.f8851k == 0) {
                this.f8851k = System.currentTimeMillis();
            }
            this.f8847g.put(jSONObject);
        } catch (Throwable th) {
            MLog.m7574e(th);
        }
    }

    /* renamed from: f */
    private void m7163f(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        try {
            if (!jSONObject.getJSONObject("header").has(C1896c.f8568aB)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has("analytics") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("analytics")) != null && jSONObjectOptJSONObject.length() > 0 && jSONObjectOptJSONObject.has(C1896c.f8613n)) {
                    C1907h.m7081a(f8830a).m7098a(true, false);
                }
                C1907h.m7081a(f8830a).m7102b();
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has("analytics")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("analytics");
                if (jSONObject2.has(C1896c.f8613n) && (jSONObjectOptJSONObject2 = jSONObject2.getJSONArray(C1896c.f8613n).optJSONObject(0)) != null) {
                    String strOptString = jSONObjectOptJSONObject2.optString("id");
                    if (!TextUtils.isEmpty(strOptString)) {
                        UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> removeAllInstantData: really delete instant session data");
                        C1907h.m7081a(f8830a).m7103b(strOptString);
                    }
                }
            }
            C1907h.m7081a(f8830a).m7102b();
            UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> removeAllInstantData: send INSTANT_SESSION_START_CONTINUE event because OVERSIZE.");
            Context context = f8830a;
            UMWorkDispatch.sendEvent(context, a.f8870l, CoreProtocol.getInstance(context), null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    private static void m7167h() {
        try {
            f8840y = UMCrashUtils.class;
            Method declaredMethod = UMCrashUtils.class.getDeclaredMethod("setPuidAndProvider", String.class, String.class);
            if (declaredMethod != null) {
                f8841z = declaredMethod;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: i */
    private void m7169i() throws JSONException {
        JSONObject jSONObjectM7186b = m7186b(UMEnvelopeBuild.maxDataSpace(f8830a));
        if (jSONObjectM7186b == null || jSONObjectM7186b.length() < 1) {
            return;
        }
        JSONObject jSONObject = (JSONObject) jSONObjectM7186b.opt("header");
        JSONObject jSONObject2 = (JSONObject) jSONObjectM7186b.opt("content");
        if (f8830a == null || jSONObject == null || jSONObject2 == null) {
            return;
        }
        UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> constructInstantMessage: request build envelope.");
        JSONObject jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(f8830a, jSONObject, jSONObject2);
        if (jSONObjectBuildEnvelopeWithExtHeader != null) {
            try {
                if (jSONObjectBuildEnvelopeWithExtHeader.has("exception")) {
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "Build envelope error code: " + jSONObjectBuildEnvelopeWithExtHeader.getInt("exception"));
                }
            } catch (Throwable unused) {
            }
            if (UMConfigure.isDebugLog()) {
                m7161e(jSONObjectBuildEnvelopeWithExtHeader);
            }
            m7190b((Object) jSONObjectBuildEnvelopeWithExtHeader);
        }
    }

    /* renamed from: j */
    private void m7170j() {
        JSONObject jSONObjectBuildEnvelopeWithExtHeader;
        JSONObject jSONObjectM7180a = m7180a(UMEnvelopeBuild.maxDataSpace(f8830a));
        if (jSONObjectM7180a == null || jSONObjectM7180a.length() < 1) {
            return;
        }
        JSONObject jSONObject = (JSONObject) jSONObjectM7180a.opt("header");
        JSONObject jSONObject2 = (JSONObject) jSONObjectM7180a.opt("content");
        Context context = f8830a;
        if (context == null || jSONObject == null || jSONObject2 == null || (jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, jSONObject2)) == null) {
            return;
        }
        try {
            if (jSONObjectBuildEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "Build envelope error code: " + jSONObjectBuildEnvelopeWithExtHeader.getInt("exception"));
            }
        } catch (Throwable unused) {
        }
        if (UMConfigure.isDebugLog()) {
            m7158d(jSONObjectBuildEnvelopeWithExtHeader);
        }
        m7182a((Object) jSONObjectBuildEnvelopeWithExtHeader);
    }

    /* renamed from: k */
    private JSONObject m7171k() {
        JSONObject jSONObjectM7172l = m7172l();
        if (jSONObjectM7172l != null) {
            try {
                jSONObjectM7172l.put("st", "1");
            } catch (Throwable unused) {
            }
        }
        return jSONObjectM7172l;
    }

    /* renamed from: l */
    private JSONObject m7172l() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            if (AnalyticsConfig.mWrapperType != null && (str = AnalyticsConfig.mWrapperVersion) != null) {
                jSONObject.put("wrapper_version", str);
                jSONObject.put("wrapper_type", AnalyticsConfig.mWrapperType);
            }
            int verticalType = AnalyticsConfig.getVerticalType(f8830a);
            jSONObject.put(C1896c.f8608i, verticalType);
            String str2 = "9.3.7";
            if (verticalType == 1) {
                String gameSdkVersion = AnalyticsConfig.getGameSdkVersion(f8830a);
                if (!TextUtils.isEmpty(gameSdkVersion)) {
                    str2 = gameSdkVersion;
                }
                jSONObject.put("sdk_version", str2);
            } else {
                jSONObject.put("sdk_version", "9.3.7");
            }
            String strMD5 = HelperUtils.MD5(AnalyticsConfig.getSecretKey(f8830a));
            if (!TextUtils.isEmpty(strMD5)) {
                jSONObject.put("secret", strMD5);
            }
            String strImprintProperty = UMEnvelopeBuild.imprintProperty(f8830a, "pr_ve", null);
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8830a);
            String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(f8830a, C1896c.f8588an, "");
            if (!TextUtils.isEmpty(strImprintProperty2)) {
                if (AnalyticsConfig.CLEAR_EKV_BL) {
                    jSONObject.put(C1896c.f8590ap, "");
                } else {
                    jSONObject.put(C1896c.f8590ap, strImprintProperty2);
                }
            }
            String strImprintProperty3 = UMEnvelopeBuild.imprintProperty(f8830a, C1896c.f8589ao, "");
            if (!TextUtils.isEmpty(strImprintProperty3)) {
                if (AnalyticsConfig.CLEAR_EKV_WL) {
                    jSONObject.put(C1896c.f8591aq, "");
                } else {
                    jSONObject.put(C1896c.f8591aq, strImprintProperty3);
                }
            }
            jSONObject.put(C1896c.f8582ah, "1.0.0");
            if (m7179s()) {
                jSONObject.put(C1896c.f8584aj, "1");
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putLong(f8832m, 0L).commit();
                }
            }
            jSONObject.put(C1896c.f8611l, m7173m());
            jSONObject.put(C1896c.f8612m, m7174n());
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("vers_name", "");
                if (!TextUtils.isEmpty(string)) {
                    String str3 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (TextUtils.isEmpty(strImprintProperty)) {
                        jSONObject.put(C1896c.f8611l, sharedPreferences.getString("vers_pre_version", MessageService.MSG_DB_READY_REPORT));
                        jSONObject.put(C1896c.f8612m, sharedPreferences.getString("vers_date", str3));
                    }
                    sharedPreferences.edit().putString("pre_version", string).putString("cur_version", DeviceConfig.getAppVersionName(f8830a)).putString("pre_date", str3).remove("vers_name").remove("vers_code").remove("vers_date").remove("vers_pre_version").commit();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: m */
    private String m7173m() {
        String strImprintProperty = null;
        try {
            strImprintProperty = UMEnvelopeBuild.imprintProperty(f8830a, "pr_ve", null);
            if (TextUtils.isEmpty(strImprintProperty)) {
                if (!TextUtils.isEmpty(this.f8844d)) {
                    return this.f8844d;
                }
                if (this.f8843c == null) {
                    this.f8843c = PreferenceWrapper.getDefault(f8830a);
                }
                String string = this.f8843c.getString("pre_version", "");
                String appVersionName = DeviceConfig.getAppVersionName(f8830a);
                if (TextUtils.isEmpty(string)) {
                    this.f8843c.edit().putString("pre_version", MessageService.MSG_DB_READY_REPORT).putString("cur_version", appVersionName).commit();
                    strImprintProperty = MessageService.MSG_DB_READY_REPORT;
                } else {
                    String string2 = this.f8843c.getString("cur_version", "");
                    if (appVersionName.equals(string2)) {
                        strImprintProperty = string;
                    } else {
                        this.f8843c.edit().putString("pre_version", string2).putString("cur_version", appVersionName).commit();
                        strImprintProperty = string2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.f8844d = strImprintProperty;
        return strImprintProperty;
    }

    /* renamed from: n */
    private String m7174n() {
        String strImprintProperty = null;
        try {
            strImprintProperty = UMEnvelopeBuild.imprintProperty(f8830a, "ud_da", null);
            if (TextUtils.isEmpty(strImprintProperty)) {
                if (!TextUtils.isEmpty(this.f8845e)) {
                    return this.f8845e;
                }
                if (this.f8843c == null) {
                    this.f8843c = PreferenceWrapper.getDefault(f8830a);
                }
                String string = this.f8843c.getString("pre_date", "");
                if (TextUtils.isEmpty(string)) {
                    string = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    this.f8843c.edit().putString("pre_date", string).commit();
                } else {
                    String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (!string.equals(str)) {
                        this.f8843c.edit().putString("pre_date", str).commit();
                        strImprintProperty = str;
                    }
                }
                strImprintProperty = string;
            }
        } catch (Throwable unused) {
        }
        this.f8845e = strImprintProperty;
        return strImprintProperty;
    }

    /* renamed from: o */
    private void m7175o() {
        try {
            this.f8849i = 0;
            this.f8850j = 0;
            this.f8851k = System.currentTimeMillis();
            PreferenceWrapper.getDefault(f8830a).edit().putLong(f8834o, System.currentTimeMillis()).putInt(f8835p, 0).commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: p */
    private boolean m7176p() {
        try {
            if (!TextUtils.isEmpty(C1919t.m7237a().m7249b())) {
                m7189b(f8830a);
            }
            if (this.f8847g.length() <= 0) {
                return false;
            }
            for (int i4 = 0; i4 < this.f8847g.length(); i4++) {
                JSONObject jSONObjectOptJSONObject = this.f8847g.optJSONObject(i4);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                    String strOptString = jSONObjectOptJSONObject.optString("__i");
                    if (TextUtils.isEmpty(strOptString) || f8838t.equals(strOptString)) {
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
    private void m7177q() {
        if (this.f8847g.length() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i4 = 0; i4 < this.f8847g.length(); i4++) {
                try {
                    JSONObject jSONObject = this.f8847g.getJSONObject(i4);
                    if (jSONObject == null || jSONObject.length() <= 0) {
                        jSONArray.put(jSONObject);
                    } else {
                        String strOptString = jSONObject.optString("__i");
                        boolean zIsEmpty = TextUtils.isEmpty(strOptString);
                        String str = f8838t;
                        if (zIsEmpty || f8838t.equals(strOptString)) {
                            String strM7249b = C1919t.m7237a().m7249b();
                            if (!TextUtils.isEmpty(strM7249b)) {
                                str = strM7249b;
                            }
                            jSONObject.put("__i", str);
                        }
                        jSONArray.put(jSONObject);
                    }
                } catch (Throwable unused) {
                }
            }
            this.f8847g = jSONArray;
        }
    }

    /* renamed from: r */
    private void m7178r() {
        Context context;
        SharedPreferences sharedPreferences;
        try {
            if (!m7179s() || (context = f8830a) == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null || sharedPreferences.getLong(f8831l, 0L) != 0) {
                return;
            }
            sharedPreferences.edit().putLong(f8831l, System.currentTimeMillis()).commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: s */
    private boolean m7179s() {
        SharedPreferences sharedPreferences;
        try {
            Context context = f8830a;
            if (context == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null) {
                return false;
            }
            return sharedPreferences.getLong(f8832m, -1L) != 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public void m7188b() {
    }

    /* renamed from: c */
    public void m7191c() {
        m7189b(f8830a);
        m7193d();
        m7185a(true);
    }

    /* renamed from: d */
    public void m7193d() {
        try {
            if (this.f8847g.length() > 0) {
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>>*** flushMemoryData: 事件落库。");
                C1907h.m7081a(f8830a).m7096a(this.f8847g);
                this.f8847g = new JSONArray();
            }
            PreferenceWrapper.getDefault(f8830a).edit().putLong(f8833n, this.f8851k).putInt(f8836q, this.f8849i).putInt(f8837r, this.f8850j).commit();
        } catch (Throwable unused) {
        }
    }

    private C1913n() {
        this.f8842b = null;
        this.f8843c = null;
        this.f8844d = null;
        this.f8845e = null;
        this.f8846f = 10;
        this.f8847g = new JSONArray();
        this.f8848h = 5000;
        this.f8849i = 0;
        this.f8850j = 0;
        this.f8851k = 0L;
        this.f8852s = 28800000L;
        this.f8853u = false;
        this.f8854v = false;
        this.f8855w = new Object();
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8830a);
            this.f8851k = sharedPreferences.getLong(f8833n, 0L);
            this.f8849i = sharedPreferences.getInt(f8836q, 0);
            this.f8850j = sharedPreferences.getInt(f8837r, 0);
            this.f8842b = new c();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: g */
    private void m7166g(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        try {
            if (jSONObject.getJSONObject("header").has(C1896c.f8568aB)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has("analytics")) {
                    if (!jSONObject.getJSONObject("analytics").has(C1896c.f8613n)) {
                        UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> Error, Should not go to this branch.");
                        return;
                    }
                    C1907h.m7081a(f8830a).m7113i();
                    C1907h.m7081a(f8830a).m7112h();
                    C1907h.m7081a(f8830a).m7104b(true, false);
                    C1907h.m7081a(f8830a).m7095a();
                    return;
                }
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has("analytics") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("analytics")) != null && jSONObjectOptJSONObject.length() > 0) {
                if (jSONObjectOptJSONObject.has(C1896c.f8613n)) {
                    C1907h.m7081a(f8830a).m7104b(true, false);
                }
                if (jSONObjectOptJSONObject.has("ekv") || jSONObjectOptJSONObject.has(C1896c.f8559T)) {
                    C1907h.m7081a(f8830a).m7112h();
                }
                if (jSONObjectOptJSONObject.has("error")) {
                    C1907h.m7081a(f8830a).m7113i();
                }
            }
            C1907h.m7081a(f8830a).m7095a();
        } catch (Exception unused) {
        }
    }

    /* renamed from: com.umeng.analytics.pro.n$c */
    public static class c {

        /* renamed from: a */
        private ReportPolicy.ReportStrategy f8886a = null;

        /* renamed from: b */
        private int f8887b = -1;

        /* renamed from: c */
        private int f8888c = -1;

        /* renamed from: d */
        private int f8889d = -1;

        /* renamed from: e */
        private int f8890e = -1;

        /* renamed from: f */
        private ABTest f8891f;

        public c() {
            this.f8891f = null;
            this.f8891f = ABTest.getService(C1913n.f8830a);
        }

        /* renamed from: a */
        public void m7200a() {
            try {
                int[] iArrM7201a = m7201a(-1, -1);
                this.f8887b = iArrM7201a[0];
                this.f8888c = iArrM7201a[1];
            } catch (Throwable unused) {
            }
        }

        /* renamed from: b */
        protected void m7202b() {
            int iM7199a;
            Defcon service = Defcon.getService(C1913n.f8830a);
            if (service.isOpen()) {
                ReportPolicy.ReportStrategy reportStrategy = this.f8886a;
                this.f8886a = (reportStrategy instanceof ReportPolicy.DefconPolicy) && reportStrategy.isValid() ? this.f8886a : new ReportPolicy.DefconPolicy(StatTracer.getInstance(C1913n.f8830a), service);
            } else {
                boolean z3 = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C1913n.f8830a, "integrated_test", C1913n.f8838t)).intValue() == 1;
                if (UMConfigure.isDebugLog() && z3 && !MLog.DEBUG) {
                    UMLog.mutlInfo(C1908i.f8743K, 3, "\\|", null, null);
                }
                if (MLog.DEBUG && z3) {
                    this.f8886a = new ReportPolicy.DebugPolicy(StatTracer.getInstance(C1913n.f8830a));
                } else if (this.f8891f.isInTest() && "RPT".equals(this.f8891f.getTestName())) {
                    if (this.f8891f.getTestPolicy() == 6) {
                        if (Integer.valueOf(UMEnvelopeBuild.imprintProperty(C1913n.f8830a, "test_report_interval", C1913n.f8838t)).intValue() != -1) {
                            iM7199a = m7199a(90000);
                        } else {
                            iM7199a = this.f8888c;
                            if (iM7199a <= 0) {
                                iM7199a = this.f8890e;
                            }
                        }
                    } else {
                        iM7199a = 0;
                    }
                    this.f8886a = m7198b(this.f8891f.getTestPolicy(), iM7199a);
                } else {
                    int i4 = this.f8889d;
                    int i5 = this.f8890e;
                    int i6 = this.f8887b;
                    if (i6 != -1) {
                        i5 = this.f8888c;
                        i4 = i6;
                    }
                    this.f8886a = m7198b(i4, i5);
                }
            }
            if (UMConfigure.isDebugLog()) {
                try {
                    ReportPolicy.ReportStrategy reportStrategy2 = this.f8886a;
                    if (reportStrategy2 instanceof ReportPolicy.ReportAtLaunch) {
                        UMLog.mutlInfo(C1908i.f8741I, 3, "", null, null);
                    } else if (reportStrategy2 instanceof ReportPolicy.ReportByInterval) {
                        UMLog.mutlInfo(C1908i.f8742J, 3, "", new String[]{"@"}, new String[]{String.valueOf(((ReportPolicy.ReportByInterval) reportStrategy2).getReportInterval() / 1000)});
                    } else if (reportStrategy2 instanceof ReportPolicy.DebugPolicy) {
                        UMLog.mutlInfo(C1908i.f8744L, 3, "", null, null);
                    } else if (reportStrategy2 instanceof ReportPolicy.ReportQuasiRealtime) {
                        String[] strArr = {String.valueOf(((ReportPolicy.ReportQuasiRealtime) reportStrategy2).getReportInterval() / 1000)};
                        UMLog uMLog = UMConfigure.umDebugLog;
                        UMLog.mutlInfo(C1908i.f8745M, 3, "", new String[]{"@"}, strArr);
                    } else {
                        boolean z4 = reportStrategy2 instanceof ReportPolicy.DefconPolicy;
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* renamed from: c */
        public ReportPolicy.ReportStrategy m7203c() {
            m7202b();
            return this.f8886a;
        }

        /* renamed from: a */
        public int[] m7201a(int i4, int i5) {
            int iIntValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C1913n.f8830a, "report_policy", C1913n.f8838t)).intValue();
            int iIntValue2 = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C1913n.f8830a, "report_interval", C1913n.f8838t)).intValue();
            if (iIntValue == -1 || !ReportPolicy.isValid(iIntValue)) {
                return new int[]{i4, i5};
            }
            if (6 == iIntValue) {
                if (iIntValue2 == -1 || iIntValue2 < 90 || iIntValue2 > 86400) {
                    iIntValue2 = 90;
                }
                return new int[]{iIntValue, iIntValue2 * 1000};
            }
            if (11 != iIntValue) {
                return new int[]{i4, i5};
            }
            if (iIntValue2 == -1 || iIntValue2 < 15 || iIntValue2 > 3600) {
                iIntValue2 = 15;
            }
            return new int[]{iIntValue, iIntValue2 * 1000};
        }

        /* renamed from: a */
        public int m7199a(int i4) {
            int iIntValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C1913n.f8830a, "test_report_interval", C1913n.f8838t)).intValue();
            return (iIntValue == -1 || iIntValue < 90 || iIntValue > 86400) ? i4 : iIntValue * 1000;
        }

        /* renamed from: b */
        private ReportPolicy.ReportStrategy m7198b(int i4, int i5) {
            if (i4 == 0) {
                ReportPolicy.ReportStrategy reportStrategy = this.f8886a;
                return reportStrategy instanceof ReportPolicy.ReportRealtime ? reportStrategy : new ReportPolicy.ReportRealtime();
            }
            if (i4 == 1) {
                ReportPolicy.ReportStrategy reportStrategy2 = this.f8886a;
                return reportStrategy2 instanceof ReportPolicy.ReportAtLaunch ? reportStrategy2 : new ReportPolicy.ReportAtLaunch();
            }
            if (i4 == 4) {
                ReportPolicy.ReportStrategy reportStrategy3 = this.f8886a;
                return reportStrategy3 instanceof ReportPolicy.ReportDaily ? reportStrategy3 : new ReportPolicy.ReportDaily(StatTracer.getInstance(C1913n.f8830a));
            }
            if (i4 == 5) {
                ReportPolicy.ReportStrategy reportStrategy4 = this.f8886a;
                return reportStrategy4 instanceof ReportPolicy.ReportWifiOnly ? reportStrategy4 : new ReportPolicy.ReportWifiOnly(C1913n.f8830a);
            }
            if (i4 == 6) {
                ReportPolicy.ReportStrategy reportStrategy5 = this.f8886a;
                if (reportStrategy5 instanceof ReportPolicy.ReportByInterval) {
                    ((ReportPolicy.ReportByInterval) reportStrategy5).setReportInterval(i5);
                    return reportStrategy5;
                }
                return new ReportPolicy.ReportByInterval(StatTracer.getInstance(C1913n.f8830a), i5);
            }
            if (i4 == 8) {
                ReportPolicy.ReportStrategy reportStrategy6 = this.f8886a;
                return reportStrategy6 instanceof ReportPolicy.SmartPolicy ? reportStrategy6 : new ReportPolicy.SmartPolicy(StatTracer.getInstance(C1913n.f8830a));
            }
            if (i4 != 11) {
                ReportPolicy.ReportStrategy reportStrategy7 = this.f8886a;
                return reportStrategy7 instanceof ReportPolicy.ReportAtLaunch ? reportStrategy7 : new ReportPolicy.ReportAtLaunch();
            }
            ReportPolicy.ReportStrategy reportStrategy8 = this.f8886a;
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
    private void m7156c(JSONObject jSONObject) {
        try {
            if (!C1907h.m7081a(f8830a).m7109e()) {
                JSONObject jSONObjectM7111g = C1907h.m7081a(f8830a).m7111g();
                if (jSONObjectM7111g != null) {
                    String strOptString = jSONObjectM7111g.optString("__av");
                    String strOptString2 = jSONObjectM7111g.optString("__vc");
                    if (TextUtils.isEmpty(strOptString)) {
                        jSONObject.put("app_version", UMUtils.getAppVersionName(f8830a));
                    } else {
                        jSONObject.put("app_version", strOptString);
                    }
                    if (TextUtils.isEmpty(strOptString2)) {
                        jSONObject.put("version_code", UMUtils.getAppVersionCode(f8830a));
                        return;
                    } else {
                        jSONObject.put("version_code", strOptString2);
                        return;
                    }
                }
                return;
            }
            jSONObject.put("app_version", UMUtils.getAppVersionName(f8830a));
            jSONObject.put("version_code", UMUtils.getAppVersionCode(f8830a));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m7181a() {
        if (f8830a != null) {
            synchronized (this.f8855w) {
                if (this.f8853u) {
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> network is now available, rebuild instant session data packet.");
                    Context context = f8830a;
                    UMWorkDispatch.sendEvent(context, a.f8870l, CoreProtocol.getInstance(context), null);
                }
            }
            synchronized (this.f8855w) {
                if (this.f8854v) {
                    Context context2 = f8830a;
                    UMWorkDispatch.sendEvent(context2, a.f8871m, CoreProtocol.getInstance(context2), null);
                }
            }
        }
    }

    /* renamed from: com.umeng.analytics.pro.n$d */
    public static class d {

        /* renamed from: a */
        private Map<String, Object> f8892a;

        /* renamed from: b */
        private String f8893b;

        /* renamed from: c */
        private String f8894c;

        /* renamed from: d */
        private long f8895d;

        private d() {
            this.f8892a = null;
            this.f8893b = null;
            this.f8894c = null;
            this.f8895d = 0L;
        }

        /* renamed from: a */
        public Map<String, Object> m7204a() {
            return this.f8892a;
        }

        /* renamed from: b */
        public String m7205b() {
            return this.f8894c;
        }

        /* renamed from: c */
        public String m7206c() {
            return this.f8893b;
        }

        /* renamed from: d */
        public long m7207d() {
            return this.f8895d;
        }

        public d(String str, Map<String, Object> map, String str2, long j4) {
            this.f8892a = map;
            this.f8893b = str;
            this.f8895d = j4;
            this.f8894c = str2;
        }
    }

    /* renamed from: h */
    private void m7168h(Object obj) {
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
            C1907h.m7081a(f8830a).m7099a(strOptString, obj.toString(), 2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private void m7158d(JSONObject jSONObject) {
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
                        MLog.m7564d("事件:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                } else {
                    str = "version_code";
                }
                if (jSONObject4.has(C1896c.f8559T)) {
                    jSONObject3.put(C1896c.f8559T, jSONObject4.getJSONArray(C1896c.f8559T));
                    if (jSONObject3.length() > 0) {
                        MLog.m7564d("游戏事件:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has("error")) {
                    jSONObject3.put("error", jSONObject4.getJSONArray("error"));
                    if (jSONObject3.length() > 0) {
                        MLog.m7564d("错误:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(C1896c.f8613n)) {
                    JSONArray jSONArray = jSONObject4.getJSONArray(C1896c.f8613n);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i4);
                        if (jSONObject5 != null && jSONObject5.length() > 0) {
                            if (jSONObject5.has(C1896c.f8620u)) {
                                jSONObject5.remove(C1896c.f8620u);
                            }
                            jSONArray2.put(jSONObject5);
                        }
                    }
                    jSONObject3.put(C1896c.f8613n, jSONArray2);
                    if (jSONObject3.length() > 0) {
                        MLog.m7564d("会话:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(C1896c.f8548I)) {
                    jSONObject3.put(C1896c.f8548I, jSONObject4.getJSONObject(C1896c.f8548I));
                }
                if (jSONObject4.has(C1896c.f8551L)) {
                    jSONObject3.put(C1896c.f8551L, jSONObject4.getJSONObject(C1896c.f8551L));
                    if (jSONObject3.length() > 0) {
                        MLog.m7564d("账号:" + jSONObject3.toString());
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
                    jSONObject3.put(Constants.SP_KEY_VERSION, jSONObject2.getInt(str2));
                }
                if (jSONObject2.has("appkey")) {
                    jSONObject3.put("appkey", jSONObject2.getString("appkey"));
                }
                if (jSONObject2.has("channel")) {
                    jSONObject3.put("channel", jSONObject2.getString("channel"));
                }
                if (jSONObject3.length() > 0) {
                    MLog.m7564d("基础信息:" + jSONObject3.toString());
                    jSONObject3 = new JSONObject();
                }
            }
            jSONObject3.length();
        } catch (Throwable th) {
            MLog.m7574e(th);
        }
    }

    /* renamed from: b */
    public JSONObject m7186b(long j4) throws JSONException {
        if (TextUtils.isEmpty(C1923x.m7267a().m7282d(UMGlobalContext.getAppContext(f8830a)))) {
            return null;
        }
        JSONObject jSONObjectM7101b = C1907h.m7081a(UMGlobalContext.getAppContext(f8830a)).m7101b(false);
        String[] strArrM6737a = C1837c.m6737a(f8830a);
        if (strArrM6737a != null && !TextUtils.isEmpty(strArrM6737a[0]) && !TextUtils.isEmpty(strArrM6737a[1])) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C1896c.f8552M, strArrM6737a[0]);
                jSONObject.put(C1896c.f8553N, strArrM6737a[1]);
                if (jSONObject.length() > 0) {
                    jSONObjectM7101b.put(C1896c.f8551L, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        int iM7217a = C1916q.m7213a().m7217a(f8830a);
        if (jSONObjectM7101b.length() == 1 && jSONObjectM7101b.optJSONObject(C1896c.f8551L) != null && iM7217a != 3) {
            return null;
        }
        C1916q.m7213a().m7219b(jSONObjectM7101b, f8830a);
        if (jSONObjectM7101b.length() <= 0 && iM7217a != 3) {
            return null;
        }
        JSONObject jSONObjectM7171k = m7171k();
        if (jSONObjectM7171k != null) {
            m7155b(jSONObjectM7171k);
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            if (iM7217a == 3) {
                jSONObject3.put("analytics", new JSONObject());
            } else if (jSONObjectM7101b.length() > 0) {
                jSONObject3.put("analytics", jSONObjectM7101b);
            }
            if (jSONObjectM7171k != null && jSONObjectM7171k.length() > 0) {
                jSONObject2.put("header", jSONObjectM7171k);
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("content", jSONObject3);
            }
            return m7154b(jSONObject2, j4);
        } catch (Throwable unused2) {
            return jSONObject2;
        }
    }

    /* renamed from: c */
    private boolean m7157c(boolean z3) {
        if (m7179s()) {
            return true;
        }
        if (this.f8842b == null) {
            this.f8842b = new c();
        }
        this.f8842b.m7200a();
        ReportPolicy.ReportStrategy reportStrategyM7203c = this.f8842b.m7203c();
        boolean zShouldSendMessage = reportStrategyM7203c.shouldSendMessage(z3);
        if (zShouldSendMessage) {
            if (((reportStrategyM7203c instanceof ReportPolicy.ReportByInterval) || (reportStrategyM7203c instanceof ReportPolicy.DebugPolicy) || (reportStrategyM7203c instanceof ReportPolicy.ReportQuasiRealtime)) && m7176p()) {
                m7193d();
            }
            if ((reportStrategyM7203c instanceof ReportPolicy.DefconPolicy) && m7176p()) {
                m7193d();
            }
            if (UMConfigure.isDebugLog()) {
                MLog.m7564d("数据发送策略 : " + reportStrategyM7203c.getClass().getSimpleName());
            }
        }
        return zShouldSendMessage;
    }

    /* renamed from: e */
    private void m7161e(JSONObject jSONObject) {
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
                if (jSONObject4.has(C1896c.f8613n)) {
                    JSONArray jSONArray = jSONObject4.getJSONArray(C1896c.f8613n);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i4);
                        if (jSONObject5 != null && jSONObject5.length() > 0) {
                            jSONArray2.put(jSONObject5);
                        }
                    }
                    jSONObject3.put(C1896c.f8613n, jSONArray2);
                    if (jSONObject3.length() > 0) {
                        MLog.m7564d("本次启动会话:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(C1896c.f8551L)) {
                    jSONObject3.put(C1896c.f8551L, jSONObject4.getJSONObject(C1896c.f8551L));
                    if (jSONObject3.length() > 0) {
                        MLog.m7564d("本次启动账号:" + jSONObject3.toString());
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
                    jSONObject3.put(Constants.SP_KEY_VERSION, jSONObject2.getInt("version_code"));
                }
                if (jSONObject2.has("appkey")) {
                    jSONObject3.put("appkey", jSONObject2.getString("appkey"));
                }
                if (jSONObject2.has("channel")) {
                    jSONObject3.put("channel", jSONObject2.getString("channel"));
                }
                if (jSONObject3.length() > 0) {
                    MLog.m7564d("本次启动基础信息:" + jSONObject3.toString());
                    jSONObject3 = new JSONObject();
                }
            }
            jSONObject3.length();
        } catch (Throwable th) {
            MLog.m7574e(th);
        }
    }

    /* renamed from: a */
    private void m7150a(String str, String str2) {
        Method method;
        Class<?> cls = f8840y;
        if (cls == null || (method = f8841z) == null) {
            return;
        }
        try {
            method.invoke(cls, str, str2);
        } catch (Throwable unused) {
            UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> reflect call setPuidAndProvider method of crash lib failed.");
        }
    }

    /* renamed from: a */
    public void m7183a(Object obj, int i4) {
        if (AnalyticsConfig.enable) {
            if (i4 != 8213) {
                try {
                    switch (i4) {
                        case a.f8859a /* 4097 */:
                            if (UMUtils.isMainProgress(f8830a)) {
                                if (obj != null) {
                                    m7160e(obj);
                                }
                                if (f8838t.equals(((JSONObject) obj).optString("__i"))) {
                                    return;
                                }
                                m7185a(false);
                                return;
                            }
                            UMProcessDBHelper.getInstance(f8830a).insertEventsInSubProcess(UMFrUtils.getSubProcessName(f8830a), new JSONArray().put(obj));
                            return;
                        case a.f8860b /* 4098 */:
                            if (obj != null) {
                                m7160e(obj);
                            }
                            if (f8838t.equals(((JSONObject) obj).optString("__i"))) {
                                return;
                            }
                            m7185a(false);
                            return;
                        case a.f8861c /* 4099 */:
                            C1920u.m7257a(f8830a);
                            return;
                        case a.f8862d /* 4100 */:
                            C1910k.m7128c(f8830a);
                            return;
                        case a.f8863e /* 4101 */:
                            UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_SIGNIN");
                            m7184a((Object) null, true);
                            m7165g(obj);
                            return;
                        case a.f8864f /* 4102 */:
                            UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_SIGNOFF");
                            m7184a((Object) null, true);
                            m7162f(obj);
                            return;
                        case a.f8865g /* 4103 */:
                            UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> START_SESSION");
                            C1919t.m7237a().m7246a(f8830a, obj);
                            synchronized (this.f8855w) {
                                this.f8854v = true;
                            }
                            return;
                        case a.f8866h /* 4104 */:
                            C1919t.m7237a().m7255c(f8830a, obj);
                            return;
                        case a.f8867i /* 4105 */:
                            m7193d();
                            return;
                        case a.f8868j /* 4106 */:
                            m7168h(obj);
                            return;
                        default:
                            switch (i4) {
                                case 4352:
                                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> INSTANT_SESSION_START");
                                    C1919t.m7237a().m7251b(f8830a, obj);
                                    synchronized (this.f8855w) {
                                        this.f8853u = true;
                                    }
                                    return;
                                case a.f8870l /* 4353 */:
                                    m7184a(obj, true);
                                    return;
                                case a.f8871m /* 4354 */:
                                    m7191c();
                                    return;
                                case a.f8872n /* 4355 */:
                                    if (!UMUtils.isMainProgress(f8830a)) {
                                        UMProcessDBHelper.getInstance(f8830a).insertEventsInSubProcess(UMFrUtils.getSubProcessName(f8830a), new JSONArray().put(obj));
                                        return;
                                    } else {
                                        if (obj != null) {
                                            m7160e(obj);
                                            m7193d();
                                            return;
                                        }
                                        return;
                                    }
                                case a.f8873o /* 4356 */:
                                    if (obj == null || f8840y == null || f8841z == null) {
                                        return;
                                    }
                                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_CHANGE_NOTIFY");
                                    String string = "";
                                    String string2 = "";
                                    if (obj instanceof JSONObject) {
                                        JSONObject jSONObject = (JSONObject) obj;
                                        if (jSONObject.has("uid") && jSONObject.has(C1896c.f8552M)) {
                                            string = jSONObject.getString(C1896c.f8552M);
                                            string2 = jSONObject.getString("uid");
                                        }
                                        m7150a(string2, string);
                                        return;
                                    }
                                    return;
                                default:
                                    switch (i4) {
                                        case a.f8876r /* 8195 */:
                                            C1836b.m6680a().m6702a(obj);
                                            return;
                                        case a.f8877s /* 8196 */:
                                            C1836b.m6680a().m6733m();
                                            return;
                                        case a.f8878t /* 8197 */:
                                            C1836b.m6680a().m6731k();
                                            return;
                                        default:
                                            switch (i4) {
                                                case a.f8879u /* 8199 */:
                                                case a.f8880v /* 8200 */:
                                                    C1836b.m6680a().m6711b(obj);
                                                    return;
                                                case a.f8881w /* 8201 */:
                                                    C1836b.m6680a().m6711b((Object) null);
                                                    return;
                                                default:
                                                    switch (i4) {
                                                        case a.f8882x /* 8208 */:
                                                            UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> receive DELAY_BUILD_ENVELOPE event.");
                                                            Context context = f8830a;
                                                            UMWorkDispatch.sendEvent(context, a.f8883y, CoreProtocol.getInstance(context), null);
                                                            Context context2 = f8830a;
                                                            UMWorkDispatch.sendEvent(context2, a.f8871m, CoreProtocol.getInstance(context2), null);
                                                            return;
                                                        case a.f8883y /* 8209 */:
                                                            m7184a(obj, false);
                                                            return;
                                                        case a.f8884z /* 8210 */:
                                                            UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> recv BUILD_ENVELOPE_IMMEDIATELY.");
                                                            if (!UMUtils.isMainProgress(f8830a) || (this.f8842b.m7203c() instanceof ReportPolicy.ReportQuasiRealtime)) {
                                                                return;
                                                            }
                                                            m7185a(true);
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
            if (FieldManager.allow(C2026b.f9562E)) {
                if (DeviceConfig.getGlobleActivity(f8830a) != null) {
                    C1919t.m7240b(f8830a);
                }
                Context context3 = f8830a;
                UMWorkDispatch.sendEventEx(context3, a.f8858C, CoreProtocol.getInstance(context3), null, 5000L);
            }
        }
    }

    /* renamed from: g */
    private void m7165g(Object obj) {
        try {
            m7189b(f8830a);
            m7193d();
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                String string = jSONObject.getString(C1896c.f8552M);
                String string2 = jSONObject.getString("uid");
                long j4 = jSONObject.getLong("ts");
                String[] strArrM6737a = C1837c.m6737a(f8830a);
                if (strArrM6737a != null && string.equals(strArrM6737a[0]) && string2.equals(strArrM6737a[1])) {
                    return;
                }
                C1919t.m7237a().m7245a(f8830a, j4);
                String strM7281c = C1923x.m7267a().m7281c(f8830a);
                boolean zM7252b = C1919t.m7237a().m7252b(f8830a, j4, false);
                C1837c.m6736a(f8830a, string, string2);
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> onProfileSignIn: force generate new session: session id = " + strM7281c);
                C1919t.m7237a().m7244a(f8830a, j4, true);
                if (zM7252b) {
                    C1919t.m7237a().m7250b(f8830a, j4);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    public long m7196f() {
        SharedPreferences sharedPreferences;
        long jCurrentTimeMillis = 0;
        try {
            Context context = f8830a;
            if (context == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null) {
                return 0L;
            }
            long j4 = sharedPreferences.getLong(f8831l, 0L);
            if (j4 == 0) {
                try {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    sharedPreferences.edit().putLong(f8831l, jCurrentTimeMillis).commit();
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
    public void m7192c(Object obj) {
        m7189b(f8830a);
        m7193d();
        if (m7159d(false)) {
            m7170j();
        }
    }

    /* renamed from: f */
    private void m7162f(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                long j4 = jSONObject.getLong("ts");
                m7189b(f8830a);
                m7193d();
                String[] strArrM6737a = C1837c.m6737a(f8830a);
                if (strArrM6737a == null || TextUtils.isEmpty(strArrM6737a[0]) || TextUtils.isEmpty(strArrM6737a[1])) {
                    return;
                }
                C1919t.m7237a().m7245a(f8830a, j4);
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> onProfileSignIn: force generate new session: session id = " + C1923x.m7267a().m7281c(f8830a));
                boolean zM7252b = C1919t.m7237a().m7252b(f8830a, j4, false);
                C1837c.m6738b(f8830a);
                C1919t.m7237a().m7244a(f8830a, j4, true);
                if (zM7252b) {
                    C1919t.m7237a().m7250b(f8830a, j4);
                }
            }
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m7572e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    /* renamed from: b */
    private JSONObject m7154b(JSONObject jSONObject, long j4) {
        try {
            if (C1915p.m7211a(jSONObject) <= j4) {
                return jSONObject;
            }
            jSONObject = null;
            C1907h.m7081a(f8830a).m7098a(true, false);
            C1907h.m7081a(f8830a).m7102b();
            UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> Instant session packet overload !!! ");
            return null;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: b */
    public JSONObject m7187b(boolean z3) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObjectM7094a = null;
        try {
            jSONObjectM7094a = C1907h.m7081a(f8830a).m7094a(z3);
            if (jSONObjectM7094a == null) {
                jSONObjectM7094a = new JSONObject();
            } else {
                try {
                    boolean zHas = jSONObjectM7094a.has(C1896c.f8613n);
                    jSONObjectM7094a = jSONObjectM7094a;
                    if (zHas) {
                        JSONArray jSONArray3 = jSONObjectM7094a.getJSONArray(C1896c.f8613n);
                        JSONArray jSONArray4 = new JSONArray();
                        int i4 = 0;
                        while (i4 < jSONArray3.length()) {
                            JSONObject jSONObject = (JSONObject) jSONArray3.get(i4);
                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(C1896c.f8619t);
                            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(C1896c.f8620u);
                            if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 != null) {
                                jSONObject.put(C1896c.f8619t, jSONArrayOptJSONArray2);
                                jSONObject.remove(C1896c.f8620u);
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
                                jSONArraySortUtil.setCompareKey(C1896c.f8623x);
                                Collections.sort(arrayList, jSONArraySortUtil);
                                JSONArray jSONArray5 = new JSONArray();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    jSONArray5.put((JSONObject) it.next());
                                }
                                jSONObject.put(C1896c.f8619t, jSONArray5);
                                jSONObject.remove(C1896c.f8620u);
                            }
                            if (jSONObject.has(C1896c.f8619t)) {
                                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(C1896c.f8619t);
                                int i7 = 0;
                                while (i7 < jSONArrayOptJSONArray3.length()) {
                                    JSONObject jSONObject2 = jSONArrayOptJSONArray3.getJSONObject(i7);
                                    if (jSONObject2.has(C1896c.f8623x)) {
                                        jSONArray2 = jSONArray3;
                                        jSONObject2.put("ts", jSONObject2.getLong(C1896c.f8623x));
                                        jSONObject2.remove(C1896c.f8623x);
                                    } else {
                                        jSONArray2 = jSONArray3;
                                    }
                                    i7++;
                                    jSONArray3 = jSONArray2;
                                }
                                jSONArray = jSONArray3;
                                jSONObject.put(C1896c.f8619t, jSONArrayOptJSONArray3);
                                jSONObject.put(C1896c.f8625z, jSONArrayOptJSONArray3.length());
                            } else {
                                jSONArray = jSONArray3;
                                jSONObject.put(C1896c.f8625z, 0);
                            }
                            jSONArray4.put(jSONObject);
                            i4++;
                            jSONArray3 = jSONArray;
                        }
                        jSONObjectM7094a.put(C1896c.f8613n, jSONArray4);
                        jSONObjectM7094a = jSONObjectM7094a;
                    }
                } catch (Exception e4) {
                    MLog.m7570e("merge pages error");
                    e4.printStackTrace();
                    jSONObjectM7094a = jSONObjectM7094a;
                }
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8830a);
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("userlevel", "");
                if (!TextUtils.isEmpty(string)) {
                    jSONObjectM7094a.put("userlevel", string);
                }
            }
            String[] strArrM6737a = C1837c.m6737a(f8830a);
            if (strArrM6737a != null && !TextUtils.isEmpty(strArrM6737a[0]) && !TextUtils.isEmpty(strArrM6737a[1])) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(C1896c.f8552M, strArrM6737a[0]);
                jSONObject3.put(C1896c.f8553N, strArrM6737a[1]);
                if (jSONObject3.length() > 0) {
                    jSONObjectM7094a.put(C1896c.f8551L, jSONObject3);
                }
            }
            if (ABTest.getService(f8830a).isInTest()) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(ABTest.getService(f8830a).getTestName(), ABTest.getService(f8830a).getGroupInfo());
                jSONObjectM7094a.put(C1896c.f8550K, jSONObject4);
            }
            C1916q.m7213a().m7218a(jSONObjectM7094a, f8830a);
        } catch (Throwable unused) {
        }
        return jSONObjectM7094a;
    }

    /* renamed from: e */
    public void m7195e() {
        if (m7159d(false)) {
            m7170j();
        }
    }

    /* renamed from: d */
    public void m7194d(Object obj) {
        m7178r();
        m7173m();
        m7174n();
        m7185a(true);
    }

    /* renamed from: d */
    private boolean m7159d(boolean z3) {
        if (this.f8842b == null) {
            this.f8842b = new c();
        }
        ReportPolicy.ReportStrategy reportStrategyM7203c = this.f8842b.m7203c();
        if (!(reportStrategyM7203c instanceof ReportPolicy.DefconPolicy)) {
            return true;
        }
        if (z3) {
            return ((ReportPolicy.DefconPolicy) reportStrategyM7203c).shouldSendMessageByInstant();
        }
        return reportStrategyM7203c.shouldSendMessage(false);
    }

    /* renamed from: b */
    public void m7190b(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0 && (!jSONObject.has("exception") || 101 != jSONObject.getInt("exception"))) {
                    m7163f(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void m7185a(boolean z3) {
        if (m7157c(z3)) {
            if (!(this.f8842b.m7203c() instanceof ReportPolicy.ReportQuasiRealtime)) {
                if (UMEnvelopeBuild.isReadyBuild(f8830a, UMLogDataProtocol.UMBusinessType.U_APP)) {
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> constructMessage()");
                    m7170j();
                    return;
                }
                return;
            }
            if (z3) {
                if (UMEnvelopeBuild.isOnline(f8830a)) {
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> send session start in policy ReportQuasiRealtime.");
                    m7170j();
                    return;
                }
                return;
            }
            if (UMEnvelopeBuild.isReadyBuild(f8830a, UMLogDataProtocol.UMBusinessType.U_APP)) {
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> send normal data in policy ReportQuasiRealtime.");
                m7170j();
            }
        }
    }

    /* renamed from: b */
    public void m7189b(Context context) {
        try {
            C1907h.m7081a(context).m7108d();
            m7177q();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private boolean m7152a(JSONArray jSONArray) {
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
    private boolean m7153a(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ekv");
        int length = jSONArrayOptJSONArray.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i5);
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(itKeys.next());
                    if (jSONArrayOptJSONArray2 != null && m7152a(jSONArrayOptJSONArray2)) {
                        i4++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return i4 >= length;
    }

    /* renamed from: a */
    public JSONObject m7180a(long j4) {
        if (TextUtils.isEmpty(C1923x.m7267a().m7282d(f8830a))) {
            return null;
        }
        JSONObject jSONObjectM7187b = m7187b(false);
        int iM7217a = C1916q.m7213a().m7217a(f8830a);
        if (jSONObjectM7187b.length() > 0) {
            if (jSONObjectM7187b.length() == 1) {
                if (jSONObjectM7187b.optJSONObject(C1896c.f8551L) != null && iM7217a != 3) {
                    return null;
                }
                if (!TextUtils.isEmpty(jSONObjectM7187b.optString("userlevel")) && iM7217a != 3) {
                    return null;
                }
            } else if (jSONObjectM7187b.length() == 2 && jSONObjectM7187b.optJSONObject(C1896c.f8551L) != null && !TextUtils.isEmpty(jSONObjectM7187b.optString("userlevel")) && iM7217a != 3) {
                return null;
            }
            String strOptString = jSONObjectM7187b.optString(C1896c.f8613n);
            String strOptString2 = jSONObjectM7187b.optString(C1896c.f8559T);
            String strOptString3 = jSONObjectM7187b.optString("ekv");
            if (TextUtils.isEmpty(strOptString) && TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && m7153a(jSONObjectM7187b)) {
                return null;
            }
        } else if (iM7217a != 3) {
            return null;
        }
        JSONObject jSONObjectM7172l = m7172l();
        if (jSONObjectM7172l != null) {
            m7156c(jSONObjectM7172l);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (iM7217a == 3) {
                jSONObject2.put("analytics", new JSONObject());
            } else if (jSONObjectM7187b.length() > 0) {
                jSONObject2.put("analytics", jSONObjectM7187b);
            }
            if (jSONObjectM7172l != null && jSONObjectM7172l.length() > 0) {
                jSONObject.put("header", jSONObjectM7172l);
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("content", jSONObject2);
            }
            return m7149a(jSONObject, j4);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: a */
    private JSONObject m7149a(JSONObject jSONObject, long j4) {
        try {
            if (C1915p.m7211a(jSONObject) <= j4) {
                return jSONObject;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("header");
            jSONObject2.put(C1896c.f8568aB, C1915p.m7211a(jSONObject));
            jSONObject.put("header", jSONObject2);
            return C1915p.m7212a(f8830a, j4, jSONObject);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* renamed from: a */
    private boolean m7151a(long j4, int i4) {
        if (j4 == 0) {
            return true;
        }
        if (System.currentTimeMillis() - j4 <= 28800000) {
            return i4 < 5000;
        }
        m7175o();
        return true;
    }

    /* renamed from: a */
    public void m7182a(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0 && (!jSONObject.has("exception") || 101 != jSONObject.getInt("exception"))) {
                    m7166g(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public void m7184a(Object obj, boolean z3) throws JSONException {
        if (z3) {
            if (m7159d(true)) {
                m7169i();
            }
        } else if (UMEnvelopeBuild.isOnline(f8830a) && m7159d(true)) {
            m7169i();
        }
    }
}
