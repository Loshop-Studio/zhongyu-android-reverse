package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.C3320b;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.C3387d;
import com.umeng.analytics.pro.C3391h;
import com.umeng.analytics.pro.C3397n;
import com.umeng.analytics.pro.C3407x;
import com.umeng.analytics.process.UMProcessDBDatasSender;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.C3510b;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.t */
/* loaded from: classes2.dex */
public class C3403t implements C3407x.a {

    /* renamed from: a */
    public static final String f2321a = "session_start_time";

    /* renamed from: b */
    public static final String f2322b = "session_end_time";

    /* renamed from: c */
    public static final String f2323c = "session_id";

    /* renamed from: d */
    public static final String f2324d = "pre_session_id";

    /* renamed from: e */
    public static final String f2325e = "a_start_time";

    /* renamed from: f */
    public static final String f2326f = "a_end_time";

    /* renamed from: g */
    public static final String f2327g = "fg_count";

    /* renamed from: h */
    private static String f2328h = null;

    /* renamed from: i */
    private static Context f2329i = null;

    /* renamed from: j */
    private static boolean f2330j = false;

    /* renamed from: k */
    private static long f2331k = 0;

    /* renamed from: l */
    private static boolean f2332l = true;

    /* renamed from: m */
    private static long f2333m;

    /* renamed from: com.umeng.analytics.pro.t$a */
    public static class a {

        /* renamed from: a */
        private static final C3403t f2334a = new C3403t();

        private a() {
        }
    }

    /* renamed from: a */
    public static C3403t m3314a() {
        return a.f2334a;
    }

    /* renamed from: b */
    public static void m3317b(Context context) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2329i);
        if (sharedPreferences != null) {
            long j4 = sharedPreferences.getLong(f2327g, 0L);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit != null) {
                editorEdit.putLong(f2327g, j4 + 1);
                editorEdit.commit();
            }
        }
    }

    /* renamed from: d */
    private void m3318d(Context context) {
        try {
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(context).edit();
            editorEdit.putLong(f2327g, 0L);
            editorEdit.commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private String m3319e(Context context) {
        if (f2329i == null && context != null) {
            f2329i = context.getApplicationContext();
        }
        String strM3359d = C3407x.m3344a().m3359d(f2329i);
        try {
            m3320f(context);
            C3397n.m3225a(f2329i).m3271d((Object) null);
        } catch (Throwable unused) {
        }
        return strM3359d;
    }

    /* renamed from: f */
    private void m3320f(Context context) {
        C3397n.m3225a(context).m3266b(context);
        C3397n.m3225a(context).m3270d();
    }

    /* renamed from: c */
    public void m3332c(Context context, Object obj) {
        try {
            if (f2329i == null && context != null) {
                f2329i = context.getApplicationContext();
            }
            long jLongValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences == null) {
                return;
            }
            if (sharedPreferences.getLong(f2325e, 0L) == 0) {
                MLog.m3647e("onPause called before onResume");
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> onEndSessionInternal: write activity end time = " + jLongValue);
            editorEdit.putLong(f2326f, jLongValue);
            editorEdit.putLong(f2322b, jLongValue);
            editorEdit.commit();
        } catch (Throwable unused) {
        }
    }

    private C3403t() {
        C3407x.m3344a().m3354a(this);
    }

    /* renamed from: a */
    public static long m3313a(Context context) {
        try {
            return PreferenceWrapper.getDefault(context).getLong(f2327g, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: a */
    public void m3322a(Context context, long j4) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2329i);
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        editorEdit.putLong(f2321a, j4);
        editorEdit.commit();
    }

    /* renamed from: b */
    public void m3328b(Context context, Object obj) {
        long jLongValue;
        try {
            if (f2329i == null) {
                f2329i = UMGlobalContext.getAppContext(context);
            }
            if (obj == null) {
                jLongValue = System.currentTimeMillis();
            } else {
                jLongValue = ((Long) obj).longValue();
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2329i);
            if (sharedPreferences == null) {
                return;
            }
            f2331k = sharedPreferences.getLong(f2326f, 0L);
            UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime: " + f2331k);
            String string = sharedPreferences.getString(C3380c.f2008az, "");
            String appVersionName = UMUtils.getAppVersionName(f2329i);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit == null) {
                return;
            }
            if (!TextUtils.isEmpty(string) && !string.equals(appVersionName)) {
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> requestNewInstantSessionIf: version upgrade");
                editorEdit.putLong(f2321a, jLongValue);
                editorEdit.commit();
                C3397n.m3225a(f2329i).m3261a((Object) null, true);
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> force generate new session: session id = " + C3407x.m3344a().m3358c(f2329i));
                f2330j = true;
                m3321a(f2329i, jLongValue, true);
                return;
            }
            if (C3407x.m3344a().m3360e(f2329i)) {
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> More then 30 sec from last session.");
                f2330j = true;
                editorEdit.putLong(f2321a, jLongValue);
                editorEdit.commit();
                m3321a(f2329i, jLongValue, false);
                return;
            }
            UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> less then 30 sec from last session, do nothing.");
            f2330j = false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m3323a(Context context, Object obj) {
        SharedPreferences.Editor editorEdit;
        try {
            if (f2329i == null && context != null) {
                f2329i = context.getApplicationContext();
            }
            long jLongValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2329i);
            if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
                return;
            }
            String string = sharedPreferences.getString(C3380c.f2008az, "");
            String appVersionName = UMUtils.getAppVersionName(f2329i);
            if (TextUtils.isEmpty(string)) {
                editorEdit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(context)));
                editorEdit.putString(C3380c.f2008az, appVersionName);
                editorEdit.commit();
            } else if (!string.equals(appVersionName)) {
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> onStartSessionInternal: upgrade version: " + string + "-> " + appVersionName);
                int i4 = sharedPreferences.getInt("versioncode", 0);
                String string2 = sharedPreferences.getString("pre_date", "");
                String string3 = sharedPreferences.getString("pre_version", "");
                String string4 = sharedPreferences.getString(C3380c.f2008az, "");
                editorEdit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(context)));
                editorEdit.putString(C3380c.f2008az, appVersionName);
                editorEdit.putString("vers_date", string2);
                editorEdit.putString("vers_pre_version", string3);
                editorEdit.putString("cur_version", string4);
                editorEdit.putInt("vers_code", i4);
                editorEdit.putString("vers_name", string);
                editorEdit.commit();
                if (f2332l) {
                    f2332l = false;
                }
                if (f2330j) {
                    f2330j = false;
                    m3329b(f2329i, jLongValue, true);
                    m3327b(f2329i, jLongValue);
                    return;
                }
                return;
            }
            if (f2330j) {
                f2330j = false;
                if (f2332l) {
                    f2332l = false;
                }
                f2328h = m3319e(context);
                MLog.m3641d("创建新会话: " + f2328h);
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "mSessionChanged flag has been set, Start new session: " + f2328h);
                return;
            }
            f2328h = sharedPreferences.getString("session_id", null);
            editorEdit.putLong(f2325e, jLongValue);
            editorEdit.putLong(f2326f, 0L);
            editorEdit.commit();
            MLog.m3641d("延续上一个会话: " + f2328h);
            UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "Extend current session: " + f2328h);
            if (f2332l) {
                f2332l = false;
                if (FieldManager.allow(C3510b.f2970E)) {
                    Context context2 = f2329i;
                    UMWorkDispatch.sendEventEx(context2, C3397n.a.f2266C, CoreProtocol.getInstance(context2), null, 0L);
                }
            }
            m3320f(context);
            C3397n.m3225a(f2329i).m3262a(false);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public String m3331c(Context context) {
        try {
            if (f2328h == null) {
                return PreferenceWrapper.getDefault(context).getString("session_id", null);
            }
        } catch (Throwable unused) {
        }
        return f2328h;
    }

    /* renamed from: c */
    public String m3330c() {
        return m3331c(f2329i);
    }

    /* renamed from: b */
    public boolean m3329b(Context context, long j4, boolean z3) {
        String strM3351a;
        long j5;
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences == null || (strM3351a = C3407x.m3344a().m3351a(f2329i)) == null) {
                return false;
            }
            long j6 = sharedPreferences.getLong(f2325e, 0L);
            long j7 = sharedPreferences.getLong(f2326f, 0L);
            if (j6 <= 0 || j7 != 0) {
                return false;
            }
            try {
                if (z3) {
                    j5 = f2331k;
                    if (j5 == 0) {
                        UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime = 0, In-app upgrade, use currentTime: = " + j4);
                        j5 = j4;
                    } else {
                        UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime != 0, app upgrade, use lastActivityEndTime: = " + f2331k);
                    }
                    m3332c(f2329i, Long.valueOf(j5));
                } else {
                    m3332c(f2329i, Long.valueOf(j4));
                    j5 = j4;
                }
                JSONObject jSONObject = new JSONObject();
                if (z3) {
                    jSONObject.put(C3387d.d.a.f2095g, j5);
                } else {
                    jSONObject.put(C3387d.d.a.f2095g, j4);
                }
                JSONObject jSONObjectM2785b = C3320b.m2757a().m2785b();
                if (jSONObjectM2785b != null && jSONObjectM2785b.length() > 0) {
                    jSONObject.put("__sp", jSONObjectM2785b);
                }
                JSONObject jSONObjectM2790c = C3320b.m2757a().m2790c();
                if (jSONObjectM2790c != null && jSONObjectM2790c.length() > 0) {
                    jSONObject.put("__pp", jSONObjectM2790c);
                }
                if (FieldManager.allow(C3510b.f2970E)) {
                    UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>>*** foregroundCount = " + f2333m);
                    jSONObject.put(C3387d.d.a.f2096h, f2333m);
                    f2333m = 0L;
                } else {
                    jSONObject.put(C3387d.d.a.f2096h, 0L);
                }
                C3391h.m3158a(context).m3177a(strM3351a, jSONObject, C3391h.a.END);
                C3397n.m3225a(f2329i).m3272e();
            } catch (Throwable unused) {
            }
            return true;
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* renamed from: b */
    public void m3327b(Context context, long j4) {
        if (PreferenceWrapper.getDefault(context) == null) {
            return;
        }
        try {
            C3397n.m3225a(f2329i).m3269c((Object) null);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public String m3321a(Context context, long j4, boolean z3) {
        String strM3356b = C3407x.m3344a().m3356b(context);
        UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> onInstantSessionInternal: current session id = " + strM3356b);
        if (TextUtils.isEmpty(strM3356b)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__e", j4);
            JSONObject jSONObjectM2785b = C3320b.m2757a().m2785b();
            if (jSONObjectM2785b != null && jSONObjectM2785b.length() > 0) {
                jSONObject.put("__sp", jSONObjectM2785b);
            }
            JSONObject jSONObjectM2790c = C3320b.m2757a().m2790c();
            if (jSONObjectM2790c != null && jSONObjectM2790c.length() > 0) {
                jSONObject.put("__pp", jSONObjectM2790c);
            }
            C3391h.m3158a(context).m3177a(strM3356b, jSONObject, C3391h.a.INSTANTSESSIONBEGIN);
            C3397n.m3225a(context).m3261a(jSONObject, z3);
        } catch (Throwable unused) {
        }
        return strM3356b;
    }

    /* renamed from: b */
    public String m3326b() {
        return f2328h;
    }

    @Override // com.umeng.analytics.pro.C3407x.a
    /* renamed from: a */
    public void mo3325a(String str, String str2, long j4, long j5, long j6) throws JSONException {
        m3315a(f2329i, str2, j4, j5, j6);
        UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "saveSessionToDB: complete");
        if (AnalyticsConstants.SUB_PROCESS_EVENT) {
            Context context = f2329i;
            UMWorkDispatch.sendEvent(context, UMProcessDBDatasSender.UM_PROCESS_EVENT_KEY, UMProcessDBDatasSender.getInstance(context), Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.umeng.analytics.pro.C3407x.a
    /* renamed from: a */
    public void mo3324a(String str, long j4, long j5, long j6) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m3316a(str, j4);
    }

    /* renamed from: a */
    private void m3315a(Context context, String str, long j4, long j5, long j6) throws JSONException {
        if (TextUtils.isEmpty(f2328h)) {
            f2328h = C3407x.m3344a().m3351a(f2329i);
        }
        if (TextUtils.isEmpty(str) || str.equals(f2328h)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3387d.d.a.f2095g, j5);
            jSONObject.put(C3387d.d.a.f2096h, j6);
            JSONObject jSONObjectM2785b = C3320b.m2757a().m2785b();
            if (jSONObjectM2785b != null && jSONObjectM2785b.length() > 0) {
                jSONObject.put("__sp", jSONObjectM2785b);
            }
            JSONObject jSONObjectM2790c = C3320b.m2757a().m2790c();
            if (jSONObjectM2790c != null && jSONObjectM2790c.length() > 0) {
                jSONObject.put("__pp", jSONObjectM2790c);
            }
            C3391h.m3158a(context).m3177a(f2328h, jSONObject, C3391h.a.END);
        } catch (Exception unused) {
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__e", j4);
            C3391h.m3158a(context).m3177a(str, jSONObject2, C3391h.a.BEGIN);
            if (FieldManager.allow(C3510b.f2970E)) {
                f2333m = j6;
                m3318d(context);
                Context context2 = f2329i;
                UMWorkDispatch.sendEventEx(context2, C3397n.a.f2266C, CoreProtocol.getInstance(context2), null, 0L);
            }
        } catch (Exception unused2) {
        }
        f2328h = str;
    }

    /* renamed from: a */
    private void m3316a(String str, long j4) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2329i);
        if (sharedPreferences == null) {
            return;
        }
        long j5 = sharedPreferences.getLong(f2322b, 0L);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__ii", str);
            jSONObject.put("__e", j4);
            jSONObject.put(C3387d.d.a.f2095g, j5);
            double[] location = AnalyticsConfig.getLocation();
            if (location != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C3380c.f1950C, location[0]);
                jSONObject2.put(C3380c.f1951D, location[1]);
                jSONObject2.put("ts", System.currentTimeMillis());
                jSONObject.put(C3387d.d.a.f2093e, jSONObject2);
            }
            Class<?> cls = Class.forName("android.net.TrafficStats");
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("getUidRxBytes", cls2);
            Method method2 = cls.getMethod("getUidTxBytes", cls2);
            int i4 = f2329i.getApplicationInfo().uid;
            if (i4 == -1) {
                return;
            }
            long jLongValue = ((Long) method.invoke(null, Integer.valueOf(i4))).longValue();
            long jLongValue2 = ((Long) method2.invoke(null, Integer.valueOf(i4))).longValue();
            if (jLongValue > 0 && jLongValue2 > 0) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(C3380c.f1955H, jLongValue);
                jSONObject3.put(C3380c.f1954G, jLongValue2);
                jSONObject.put(C3387d.d.a.f2092d, jSONObject3);
            }
            C3391h.m3158a(f2329i).m3177a(str, jSONObject, C3391h.a.NEWSESSION);
            C3404u.m3334a(f2329i);
            C3394k.m3205c(f2329i);
        } catch (Throwable unused) {
        }
    }
}
