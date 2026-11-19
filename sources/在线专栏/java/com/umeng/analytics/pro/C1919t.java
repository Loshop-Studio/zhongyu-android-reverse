package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.C1836b;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.C1903d;
import com.umeng.analytics.pro.C1907h;
import com.umeng.analytics.pro.C1913n;
import com.umeng.analytics.pro.C1923x;
import com.umeng.analytics.process.UMProcessDBDatasSender;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.C2026b;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.t */
/* loaded from: classes.dex */
public class C1919t implements C1923x.a {

    /* renamed from: a */
    public static final String f8913a = "session_start_time";

    /* renamed from: b */
    public static final String f8914b = "session_end_time";

    /* renamed from: c */
    public static final String f8915c = "session_id";

    /* renamed from: d */
    public static final String f8916d = "pre_session_id";

    /* renamed from: e */
    public static final String f8917e = "a_start_time";

    /* renamed from: f */
    public static final String f8918f = "a_end_time";

    /* renamed from: g */
    public static final String f8919g = "fg_count";

    /* renamed from: h */
    private static String f8920h = null;

    /* renamed from: i */
    private static Context f8921i = null;

    /* renamed from: j */
    private static boolean f8922j = false;

    /* renamed from: k */
    private static long f8923k = 0;

    /* renamed from: l */
    private static boolean f8924l = true;

    /* renamed from: m */
    private static long f8925m;

    /* renamed from: com.umeng.analytics.pro.t$a */
    private static class a {

        /* renamed from: a */
        private static final C1919t f8926a = new C1919t();

        private a() {
        }
    }

    /* renamed from: a */
    public static C1919t m7237a() {
        return a.f8926a;
    }

    /* renamed from: b */
    public static void m7240b(Context context) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8921i);
        if (sharedPreferences != null) {
            long j4 = sharedPreferences.getLong(f8919g, 0L);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit != null) {
                editorEdit.putLong(f8919g, j4 + 1);
                editorEdit.commit();
            }
        }
    }

    /* renamed from: d */
    private void m7241d(Context context) {
        try {
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(context).edit();
            editorEdit.putLong(f8919g, 0L);
            editorEdit.commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private String m7242e(Context context) {
        if (f8921i == null && context != null) {
            f8921i = context.getApplicationContext();
        }
        String strM7282d = C1923x.m7267a().m7282d(f8921i);
        try {
            m7243f(context);
            C1913n.m7148a(f8921i).m7194d((Object) null);
        } catch (Throwable unused) {
        }
        return strM7282d;
    }

    /* renamed from: f */
    private void m7243f(Context context) {
        C1913n.m7148a(context).m7189b(context);
        C1913n.m7148a(context).m7193d();
    }

    /* renamed from: c */
    public void m7255c(Context context, Object obj) {
        try {
            if (f8921i == null && context != null) {
                f8921i = context.getApplicationContext();
            }
            long jLongValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences == null) {
                return;
            }
            if (sharedPreferences.getLong(f8917e, 0L) == 0) {
                MLog.m7570e("onPause called before onResume");
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> onEndSessionInternal: write activity end time = " + jLongValue);
            editorEdit.putLong(f8918f, jLongValue);
            editorEdit.putLong(f8914b, jLongValue);
            editorEdit.commit();
        } catch (Throwable unused) {
        }
    }

    private C1919t() {
        C1923x.m7267a().m7277a(this);
    }

    /* renamed from: a */
    public static long m7236a(Context context) {
        try {
            return PreferenceWrapper.getDefault(context).getLong(f8919g, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: a */
    public void m7245a(Context context, long j4) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8921i);
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        editorEdit.putLong(f8913a, j4);
        editorEdit.commit();
    }

    /* renamed from: b */
    public void m7251b(Context context, Object obj) {
        long jLongValue;
        try {
            if (f8921i == null) {
                f8921i = UMGlobalContext.getAppContext(context);
            }
            if (obj == null) {
                jLongValue = System.currentTimeMillis();
            } else {
                jLongValue = ((Long) obj).longValue();
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8921i);
            if (sharedPreferences == null) {
                return;
            }
            f8923k = sharedPreferences.getLong(f8918f, 0L);
            UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime: " + f8923k);
            String string = sharedPreferences.getString(C1896c.f8600az, "");
            String appVersionName = UMUtils.getAppVersionName(f8921i);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit == null) {
                return;
            }
            if (!TextUtils.isEmpty(string) && !string.equals(appVersionName)) {
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> requestNewInstantSessionIf: version upgrade");
                editorEdit.putLong(f8913a, jLongValue);
                editorEdit.commit();
                C1913n.m7148a(f8921i).m7184a((Object) null, true);
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> force generate new session: session id = " + C1923x.m7267a().m7281c(f8921i));
                f8922j = true;
                m7244a(f8921i, jLongValue, true);
                return;
            }
            if (C1923x.m7267a().m7283e(f8921i)) {
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> More then 30 sec from last session.");
                f8922j = true;
                editorEdit.putLong(f8913a, jLongValue);
                editorEdit.commit();
                m7244a(f8921i, jLongValue, false);
                return;
            }
            UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> less then 30 sec from last session, do nothing.");
            f8922j = false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m7246a(Context context, Object obj) {
        SharedPreferences.Editor editorEdit;
        try {
            if (f8921i == null && context != null) {
                f8921i = context.getApplicationContext();
            }
            long jLongValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8921i);
            if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
                return;
            }
            String string = sharedPreferences.getString(C1896c.f8600az, "");
            String appVersionName = UMUtils.getAppVersionName(f8921i);
            if (TextUtils.isEmpty(string)) {
                editorEdit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(context)));
                editorEdit.putString(C1896c.f8600az, appVersionName);
                editorEdit.commit();
            } else if (!string.equals(appVersionName)) {
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> onStartSessionInternal: upgrade version: " + string + "-> " + appVersionName);
                int i4 = sharedPreferences.getInt("versioncode", 0);
                String string2 = sharedPreferences.getString("pre_date", "");
                String string3 = sharedPreferences.getString("pre_version", "");
                String string4 = sharedPreferences.getString(C1896c.f8600az, "");
                editorEdit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(context)));
                editorEdit.putString(C1896c.f8600az, appVersionName);
                editorEdit.putString("vers_date", string2);
                editorEdit.putString("vers_pre_version", string3);
                editorEdit.putString("cur_version", string4);
                editorEdit.putInt("vers_code", i4);
                editorEdit.putString("vers_name", string);
                editorEdit.commit();
                if (f8924l) {
                    f8924l = false;
                }
                if (f8922j) {
                    f8922j = false;
                    m7252b(f8921i, jLongValue, true);
                    m7250b(f8921i, jLongValue);
                    return;
                }
                return;
            }
            if (f8922j) {
                f8922j = false;
                if (f8924l) {
                    f8924l = false;
                }
                f8920h = m7242e(context);
                MLog.m7564d("创建新会话: " + f8920h);
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "mSessionChanged flag has been set, Start new session: " + f8920h);
                return;
            }
            f8920h = sharedPreferences.getString("session_id", null);
            editorEdit.putLong(f8917e, jLongValue);
            editorEdit.putLong(f8918f, 0L);
            editorEdit.commit();
            MLog.m7564d("延续上一个会话: " + f8920h);
            UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "Extend current session: " + f8920h);
            if (f8924l) {
                f8924l = false;
                if (FieldManager.allow(C2026b.f9562E)) {
                    Context context2 = f8921i;
                    UMWorkDispatch.sendEventEx(context2, C1913n.a.f8858C, CoreProtocol.getInstance(context2), null, 0L);
                }
            }
            m7243f(context);
            C1913n.m7148a(f8921i).m7185a(false);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public String m7254c(Context context) {
        try {
            if (f8920h == null) {
                return PreferenceWrapper.getDefault(context).getString("session_id", null);
            }
        } catch (Throwable unused) {
        }
        return f8920h;
    }

    /* renamed from: c */
    public String m7253c() {
        return m7254c(f8921i);
    }

    /* renamed from: b */
    public boolean m7252b(Context context, long j4, boolean z3) {
        SharedPreferences sharedPreferences;
        String strM7274a;
        long j5;
        boolean z4 = false;
        try {
            sharedPreferences = PreferenceWrapper.getDefault(context);
        } catch (Throwable unused) {
        }
        if (sharedPreferences == null || (strM7274a = C1923x.m7267a().m7274a(f8921i)) == null) {
            return false;
        }
        long j6 = sharedPreferences.getLong(f8917e, 0L);
        long j7 = sharedPreferences.getLong(f8918f, 0L);
        if (j6 > 0 && j7 == 0) {
            z4 = true;
            if (z3) {
                j5 = f8923k;
                if (j5 == 0) {
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime = 0, In-app upgrade, use currentTime: = " + j4);
                    j5 = j4;
                } else {
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime != 0, app upgrade, use lastActivityEndTime: = " + f8923k);
                }
                m7255c(f8921i, Long.valueOf(j5));
            } else {
                m7255c(f8921i, Long.valueOf(j4));
                j5 = j4;
            }
            JSONObject jSONObject = new JSONObject();
            if (z3) {
                jSONObject.put(C1903d.d.a.f8687g, j5);
            } else {
                jSONObject.put(C1903d.d.a.f8687g, j4);
            }
            JSONObject jSONObjectM6708b = C1836b.m6680a().m6708b();
            if (jSONObjectM6708b != null && jSONObjectM6708b.length() > 0) {
                jSONObject.put("__sp", jSONObjectM6708b);
            }
            JSONObject jSONObjectM6713c = C1836b.m6680a().m6713c();
            if (jSONObjectM6713c != null && jSONObjectM6713c.length() > 0) {
                jSONObject.put("__pp", jSONObjectM6713c);
            }
            if (FieldManager.allow(C2026b.f9562E)) {
                UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>>*** foregroundCount = " + f8925m);
                jSONObject.put(C1903d.d.a.f8688h, f8925m);
                f8925m = 0L;
            } else {
                jSONObject.put(C1903d.d.a.f8688h, 0L);
            }
            C1907h.m7081a(context).m7100a(strM7274a, jSONObject, C1907h.a.END);
            C1913n.m7148a(f8921i).m7195e();
        }
        return z4;
    }

    /* renamed from: b */
    public void m7250b(Context context, long j4) {
        if (PreferenceWrapper.getDefault(context) == null) {
            return;
        }
        try {
            C1913n.m7148a(f8921i).m7192c((Object) null);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public String m7244a(Context context, long j4, boolean z3) {
        String strM7279b = C1923x.m7267a().m7279b(context);
        UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> onInstantSessionInternal: current session id = " + strM7279b);
        if (TextUtils.isEmpty(strM7279b)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__e", j4);
            JSONObject jSONObjectM6708b = C1836b.m6680a().m6708b();
            if (jSONObjectM6708b != null && jSONObjectM6708b.length() > 0) {
                jSONObject.put("__sp", jSONObjectM6708b);
            }
            JSONObject jSONObjectM6713c = C1836b.m6680a().m6713c();
            if (jSONObjectM6713c != null && jSONObjectM6713c.length() > 0) {
                jSONObject.put("__pp", jSONObjectM6713c);
            }
            C1907h.m7081a(context).m7100a(strM7279b, jSONObject, C1907h.a.INSTANTSESSIONBEGIN);
            C1913n.m7148a(context).m7184a(jSONObject, z3);
        } catch (Throwable unused) {
        }
        return strM7279b;
    }

    /* renamed from: b */
    public String m7249b() {
        return f8920h;
    }

    @Override // com.umeng.analytics.pro.C1923x.a
    /* renamed from: a */
    public void mo7248a(String str, String str2, long j4, long j5, long j6) throws JSONException {
        m7238a(f8921i, str2, j4, j5, j6);
        UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "saveSessionToDB: complete");
        if (AnalyticsConstants.SUB_PROCESS_EVENT) {
            Context context = f8921i;
            UMWorkDispatch.sendEvent(context, UMProcessDBDatasSender.UM_PROCESS_EVENT_KEY, UMProcessDBDatasSender.getInstance(context), Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.umeng.analytics.pro.C1923x.a
    /* renamed from: a */
    public void mo7247a(String str, long j4, long j5, long j6) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m7239a(str, j4);
    }

    /* renamed from: a */
    private void m7238a(Context context, String str, long j4, long j5, long j6) throws JSONException {
        if (TextUtils.isEmpty(f8920h)) {
            f8920h = C1923x.m7267a().m7274a(f8921i);
        }
        if (TextUtils.isEmpty(str) || str.equals(f8920h)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C1903d.d.a.f8687g, j5);
            jSONObject.put(C1903d.d.a.f8688h, j6);
            JSONObject jSONObjectM6708b = C1836b.m6680a().m6708b();
            if (jSONObjectM6708b != null && jSONObjectM6708b.length() > 0) {
                jSONObject.put("__sp", jSONObjectM6708b);
            }
            JSONObject jSONObjectM6713c = C1836b.m6680a().m6713c();
            if (jSONObjectM6713c != null && jSONObjectM6713c.length() > 0) {
                jSONObject.put("__pp", jSONObjectM6713c);
            }
            C1907h.m7081a(context).m7100a(f8920h, jSONObject, C1907h.a.END);
        } catch (Exception unused) {
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__e", j4);
            C1907h.m7081a(context).m7100a(str, jSONObject2, C1907h.a.BEGIN);
            if (FieldManager.allow(C2026b.f9562E)) {
                f8925m = j6;
                m7241d(context);
                Context context2 = f8921i;
                UMWorkDispatch.sendEventEx(context2, C1913n.a.f8858C, CoreProtocol.getInstance(context2), null, 0L);
            }
        } catch (Exception unused2) {
        }
        f8920h = str;
    }

    /* renamed from: a */
    private void m7239a(String str, long j4) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f8921i);
        if (sharedPreferences == null) {
            return;
        }
        long j5 = sharedPreferences.getLong(f8914b, 0L);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__ii", str);
            jSONObject.put("__e", j4);
            jSONObject.put(C1903d.d.a.f8687g, j5);
            double[] location = AnalyticsConfig.getLocation();
            if (location != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("lat", location[0]);
                jSONObject2.put("lng", location[1]);
                jSONObject2.put("ts", System.currentTimeMillis());
                jSONObject.put(C1903d.d.a.f8685e, jSONObject2);
            }
            Class<?> cls = Class.forName("android.net.TrafficStats");
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("getUidRxBytes", cls2);
            Method method2 = cls.getMethod("getUidTxBytes", cls2);
            int i4 = f8921i.getApplicationInfo().uid;
            if (i4 == -1) {
                return;
            }
            long jLongValue = ((Long) method.invoke(null, Integer.valueOf(i4))).longValue();
            long jLongValue2 = ((Long) method2.invoke(null, Integer.valueOf(i4))).longValue();
            if (jLongValue > 0 && jLongValue2 > 0) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(C1896c.f8547H, jLongValue);
                jSONObject3.put(C1896c.f8546G, jLongValue2);
                jSONObject.put(C1903d.d.a.f8684d, jSONObject3);
            }
            C1907h.m7081a(f8921i).m7100a(str, jSONObject, C1907h.a.NEWSESSION);
            C1920u.m7257a(f8921i);
            C1910k.m7128c(f8921i);
        } catch (Throwable unused) {
        }
    }
}
