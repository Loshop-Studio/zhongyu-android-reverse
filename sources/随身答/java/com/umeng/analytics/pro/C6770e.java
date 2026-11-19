package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.C6752a;
import com.umeng.analytics.pro.C6772g;
import com.umeng.analytics.pro.C6773h;
import com.umeng.analytics.process.C6779b;
import com.umeng.commonsdk.config.C6780a;
import java.lang.reflect.Method;
import org.json.JSONException;
import org.json.JSONObject;
import p092e2.AbstractC7839a;
import p092e2.C7840b;
import p114g2.C8024k0;
import p176m2.AbstractC8959h;
import p186n2.AbstractC9089c;
import p240s2.C9468a;
import p260u2.AbstractC9666a;
import p270v2.AbstractC9756d;
import p290x2.AbstractC9866a;
import p310z2.AbstractC9993d;

/* renamed from: com.umeng.analytics.pro.e */
/* loaded from: classes4.dex */
public class C6770e implements C6772g.a {

    /* renamed from: a */
    public static String f6676a = null;

    /* renamed from: b */
    public static Context f6677b = null;

    /* renamed from: c */
    public static boolean f6678c = false;

    /* renamed from: d */
    public static long f6679d = 0;

    /* renamed from: e */
    public static boolean f6680e = true;

    /* renamed from: f */
    public static long f6681f;

    /* renamed from: com.umeng.analytics.pro.e$b */
    public static class b {

        /* renamed from: a */
        public static final C6770e f6682a = new C6770e();
    }

    /* renamed from: c */
    public static long m6154c(Context context) {
        try {
            return AbstractC9866a.m16841a(context).getLong("fg_count", 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: d */
    public static C6770e m6155d() {
        return b.f6682a;
    }

    /* renamed from: k */
    public static void m6156k(Context context) {
        SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(f6677b);
        if (sharedPreferencesM16841a != null) {
            long j9 = sharedPreferencesM16841a.getLong("fg_count", 0L);
            SharedPreferences.Editor editorEdit = sharedPreferencesM16841a.edit();
            if (editorEdit != null) {
                editorEdit.putLong("fg_count", j9 + 1);
                editorEdit.commit();
            }
        }
    }

    @Override // com.umeng.analytics.pro.C6772g.a
    /* renamed from: a */
    public void mo6157a(String str, String str2, long j9, long j10, long j11) throws JSONException {
        m6162h(f6677b, str2, j9, j10, j11);
        AbstractC8959h.m14293c("MobclickRT", "saveSessionToDB: complete");
        if (AbstractC9666a.f17069a) {
            Context context = f6677b;
            AbstractC9089c.m14596m(context, 36945, C6779b.m6250i(context), Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.umeng.analytics.pro.C6772g.a
    /* renamed from: b */
    public void mo6158b(String str, long j9, long j10, long j11) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m6163i(str, j9);
    }

    /* renamed from: e */
    public String m6159e(Context context, long j9, boolean z9) {
        String strM6185g = C6772g.m6179b().m6185g(context);
        AbstractC8959h.m14293c("MobclickRT", "--->>> onInstantSessionInternal: current session id = " + strM6185g);
        if (TextUtils.isEmpty(strM6185g)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__e", j9);
            JSONObject jSONObjectM6006h = C6752a.m5999b().m6006h();
            if (jSONObjectM6006h != null && jSONObjectM6006h.length() > 0) {
                jSONObject.put("__sp", jSONObjectM6006h);
            }
            JSONObject jSONObjectM6008j = C6752a.m5999b().m6008j();
            if (jSONObjectM6008j != null && jSONObjectM6008j.length() > 0) {
                jSONObject.put("__pp", jSONObjectM6008j);
            }
            C6773h.m6194b(context).m6211l(strM6185g, jSONObject, C6773h.a.INSTANTSESSIONBEGIN);
            C8024k0.m12622a(context).m12648g(jSONObject, z9);
        } catch (Throwable unused) {
        }
        return strM6185g;
    }

    /* renamed from: f */
    public void m6160f(Context context, long j9) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(f6677b);
        if (sharedPreferencesM16841a == null || (editorEdit = sharedPreferencesM16841a.edit()) == null) {
            return;
        }
        editorEdit.putLong("session_start_time", j9);
        editorEdit.commit();
    }

    /* renamed from: g */
    public void m6161g(Context context, Object obj) {
        SharedPreferences.Editor editorEdit;
        try {
            if (f6677b == null && context != null) {
                f6677b = context.getApplicationContext();
            }
            long jLongValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(f6677b);
            if (sharedPreferencesM16841a != null && (editorEdit = sharedPreferencesM16841a.edit()) != null) {
                String string = sharedPreferencesM16841a.getString("versionname", "");
                String strM17320e = AbstractC9993d.m17320e(f6677b);
                if (TextUtils.isEmpty(string)) {
                    editorEdit.putInt("versioncode", Integer.parseInt(AbstractC9993d.m17319d(context)));
                    editorEdit.putString("versionname", strM17320e);
                    editorEdit.commit();
                } else if (!string.equals(strM17320e)) {
                    AbstractC8959h.m14293c("MobclickRT", "--->>> onStartSessionInternal: upgrade version: " + string + "-> " + strM17320e);
                    int i9 = sharedPreferencesM16841a.getInt("versioncode", 0);
                    String string2 = sharedPreferencesM16841a.getString("pre_date", "");
                    String string3 = sharedPreferencesM16841a.getString("pre_version", "");
                    String string4 = sharedPreferencesM16841a.getString("versionname", "");
                    editorEdit.putInt("versioncode", Integer.parseInt(AbstractC9993d.m17319d(context)));
                    editorEdit.putString("versionname", strM17320e);
                    editorEdit.putString("vers_date", string2);
                    editorEdit.putString("vers_pre_version", string3);
                    editorEdit.putString("cur_version", string4);
                    editorEdit.putInt("vers_code", i9);
                    editorEdit.putString("vers_name", string);
                    editorEdit.commit();
                    if (f6680e) {
                        f6680e = false;
                    }
                    if (f6678c) {
                        f6678c = false;
                        m6167n(f6677b, jLongValue, true);
                        m6165l(f6677b, jLongValue);
                        return;
                    }
                    return;
                }
                if (f6678c) {
                    f6678c = false;
                    if (f6680e) {
                        f6680e = false;
                    }
                    f6676a = m6172s(context);
                    AbstractC9756d.m16402a("创建新会话: " + f6676a);
                    AbstractC8959h.m14293c("MobclickRT", "mSessionChanged flag has been set, Start new session: " + f6676a);
                    return;
                }
                f6676a = sharedPreferencesM16841a.getString("session_id", null);
                editorEdit.putLong("a_start_time", jLongValue);
                editorEdit.putLong("a_end_time", 0L);
                editorEdit.commit();
                AbstractC9756d.m16402a("延续上一个会话: " + f6676a);
                AbstractC8959h.m14293c("MobclickRT", "Extend current session: " + f6676a);
                if (f6680e) {
                    f6680e = false;
                    if (C6780a.m6260e("header_foreground_count")) {
                        Context context2 = f6677b;
                        AbstractC9089c.m14597n(context2, 8213, C7840b.m12281f(context2), null, 0L);
                    }
                }
                m6173t(context);
                C8024k0.m12622a(f6677b).m12650i(false);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: h */
    public final void m6162h(Context context, String str, long j9, long j10, long j11) throws JSONException {
        if (TextUtils.isEmpty(f6676a)) {
            f6676a = C6772g.m6179b().m6181c(f6677b);
        }
        if (TextUtils.isEmpty(str) || str.equals(f6676a)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__f", j10);
            jSONObject.put("__g", j11);
            JSONObject jSONObjectM6006h = C6752a.m5999b().m6006h();
            if (jSONObjectM6006h != null && jSONObjectM6006h.length() > 0) {
                jSONObject.put("__sp", jSONObjectM6006h);
            }
            JSONObject jSONObjectM6008j = C6752a.m5999b().m6008j();
            if (jSONObjectM6008j != null && jSONObjectM6008j.length() > 0) {
                jSONObject.put("__pp", jSONObjectM6008j);
            }
            C6773h.m6194b(context).m6211l(f6676a, jSONObject, C6773h.a.END);
        } catch (Exception unused) {
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__e", j9);
            C6773h.m6194b(context).m6211l(str, jSONObject2, C6773h.a.BEGIN);
            if (C6780a.m6260e("header_foreground_count")) {
                f6681f = j11;
                m6171r(context);
                Context context2 = f6677b;
                AbstractC9089c.m14597n(context2, 8213, C7840b.m12281f(context2), null, 0L);
            }
        } catch (Exception unused2) {
        }
        f6676a = str;
    }

    /* renamed from: i */
    public final void m6163i(String str, long j9) {
        SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(f6677b);
        if (sharedPreferencesM16841a == null) {
            return;
        }
        long j10 = sharedPreferencesM16841a.getLong("session_end_time", 0L);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__ii", str);
            jSONObject.put("__e", j9);
            jSONObject.put("__f", j10);
            double[] dArrM12278b = AbstractC7839a.m12278b();
            if (dArrM12278b != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("lat", dArrM12278b[0]);
                jSONObject2.put("lng", dArrM12278b[1]);
                jSONObject2.put("ts", System.currentTimeMillis());
                jSONObject.put("__d", jSONObject2);
            }
            Class<?> cls = Class.forName("android.net.TrafficStats");
            Class cls2 = Integer.TYPE;
            Method method = cls.getMethod("getUidRxBytes", cls2);
            Method method2 = cls.getMethod("getUidTxBytes", cls2);
            int i9 = f6677b.getApplicationInfo().uid;
            if (i9 == -1) {
                return;
            }
            long jLongValue = ((Long) method.invoke(null, Integer.valueOf(i9))).longValue();
            long jLongValue2 = ((Long) method2.invoke(null, Integer.valueOf(i9))).longValue();
            if (jLongValue > 0 && jLongValue2 > 0) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("download_traffic", jLongValue);
                jSONObject3.put("upload_traffic", jLongValue2);
                jSONObject.put("__c", jSONObject3);
            }
            C6773h.m6194b(f6677b).m6211l(str, jSONObject, C6773h.a.NEWSESSION);
            C6771f.m6175b(f6677b);
            C6769d.m6139p(f6677b);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: j */
    public String m6164j() {
        return f6676a;
    }

    /* renamed from: l */
    public void m6165l(Context context, long j9) {
        if (AbstractC9866a.m16841a(context) == null) {
            return;
        }
        try {
            C8024k0.m12622a(f6677b).m12662u(null);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: m */
    public void m6166m(Context context, Object obj) {
        try {
            if (f6677b == null) {
                f6677b = C9468a.m15647b(context);
            }
            long jCurrentTimeMillis = obj == null ? System.currentTimeMillis() : ((Long) obj).longValue();
            SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(f6677b);
            if (sharedPreferencesM16841a == null) {
                return;
            }
            f6679d = sharedPreferencesM16841a.getLong("a_end_time", 0L);
            AbstractC8959h.m14293c("MobclickRT", "------>>> lastActivityEndTime: " + f6679d);
            String string = sharedPreferencesM16841a.getString("versionname", "");
            String strM17320e = AbstractC9993d.m17320e(f6677b);
            SharedPreferences.Editor editorEdit = sharedPreferencesM16841a.edit();
            if (editorEdit == null) {
                return;
            }
            if (TextUtils.isEmpty(string) || string.equals(strM17320e)) {
                if (!C6772g.m6179b().m6188j(f6677b)) {
                    AbstractC8959h.m14293c("MobclickRT", "--->>> less then 30 sec from last session, do nothing.");
                    f6678c = false;
                    return;
                }
                AbstractC8959h.m14293c("MobclickRT", "--->>> More then 30 sec from last session.");
                f6678c = true;
                editorEdit.putLong("session_start_time", jCurrentTimeMillis);
                editorEdit.commit();
                m6159e(f6677b, jCurrentTimeMillis, false);
                return;
            }
            AbstractC8959h.m14293c("MobclickRT", "--->>> requestNewInstantSessionIf: version upgrade");
            editorEdit.putLong("session_start_time", jCurrentTimeMillis);
            editorEdit.commit();
            C8024k0.m12622a(f6677b).m12648g(null, true);
            AbstractC8959h.m14293c("MobclickRT", "--->>> force generate new session: session id = " + C6772g.m6179b().m6186h(f6677b));
            f6678c = true;
            m6159e(f6677b, jCurrentTimeMillis, true);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: n */
    public boolean m6167n(Context context, long j9, boolean z9) {
        String strM6181c;
        long j10;
        try {
            SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(context);
            if (sharedPreferencesM16841a != null && (strM6181c = C6772g.m6179b().m6181c(f6677b)) != null) {
                long j11 = sharedPreferencesM16841a.getLong("a_start_time", 0L);
                long j12 = sharedPreferencesM16841a.getLong("a_end_time", 0L);
                if (j11 <= 0 || j12 != 0) {
                    return false;
                }
                try {
                    if (z9) {
                        j10 = f6679d;
                        if (j10 == 0) {
                            AbstractC8959h.m14293c("MobclickRT", "------>>> lastActivityEndTime = 0, In-app upgrade, use currentTime: = " + j9);
                            j10 = j9;
                        } else {
                            AbstractC8959h.m14293c("MobclickRT", "------>>> lastActivityEndTime != 0, app upgrade, use lastActivityEndTime: = " + f6679d);
                        }
                        m6170q(f6677b, Long.valueOf(j10));
                    } else {
                        m6170q(f6677b, Long.valueOf(j9));
                        j10 = j9;
                    }
                    JSONObject jSONObject = new JSONObject();
                    if (z9) {
                        jSONObject.put("__f", j10);
                    } else {
                        jSONObject.put("__f", j9);
                    }
                    JSONObject jSONObjectM6006h = C6752a.m5999b().m6006h();
                    if (jSONObjectM6006h != null && jSONObjectM6006h.length() > 0) {
                        jSONObject.put("__sp", jSONObjectM6006h);
                    }
                    JSONObject jSONObjectM6008j = C6752a.m5999b().m6008j();
                    if (jSONObjectM6008j != null && jSONObjectM6008j.length() > 0) {
                        jSONObject.put("__pp", jSONObjectM6008j);
                    }
                    if (C6780a.m6260e("header_foreground_count")) {
                        AbstractC8959h.m14292b("MobclickRT", "--->>>*** foregroundCount = " + f6681f);
                        jSONObject.put("__g", f6681f);
                        f6681f = 0L;
                    } else {
                        jSONObject.put("__g", 0L);
                    }
                    C6773h.m6194b(context).m6211l(strM6181c, jSONObject, C6773h.a.END);
                    C8024k0.m12622a(f6677b).m12624B();
                } catch (Throwable unused) {
                }
                return true;
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* renamed from: o */
    public String m6168o() {
        return m6169p(f6677b);
    }

    /* renamed from: p */
    public String m6169p(Context context) {
        try {
            if (f6676a == null) {
                return AbstractC9866a.m16841a(context).getString("session_id", null);
            }
        } catch (Throwable unused) {
        }
        return f6676a;
    }

    /* renamed from: q */
    public void m6170q(Context context, Object obj) {
        try {
            if (f6677b == null && context != null) {
                f6677b = context.getApplicationContext();
            }
            long jLongValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(context);
            if (sharedPreferencesM16841a == null) {
                return;
            }
            if (sharedPreferencesM16841a.getLong("a_start_time", 0L) == 0) {
                AbstractC9756d.m16404c("onPause called before onResume");
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesM16841a.edit();
            AbstractC8959h.m14293c("MobclickRT", "--->>> onEndSessionInternal: write activity end time = " + jLongValue);
            editorEdit.putLong("a_end_time", jLongValue);
            editorEdit.putLong("session_end_time", jLongValue);
            editorEdit.commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: r */
    public final void m6171r(Context context) {
        try {
            SharedPreferences.Editor editorEdit = AbstractC9866a.m16841a(context).edit();
            editorEdit.putLong("fg_count", 0L);
            editorEdit.commit();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: s */
    public final String m6172s(Context context) {
        if (f6677b == null && context != null) {
            f6677b = context.getApplicationContext();
        }
        String strM6187i = C6772g.m6179b().m6187i(f6677b);
        try {
            m6173t(context);
            C8024k0.m12622a(f6677b).m12666y(null);
        } catch (Throwable unused) {
        }
        return strM6187i;
    }

    /* renamed from: t */
    public final void m6173t(Context context) {
        C8024k0.m12622a(context).m12658q(context);
        C8024k0.m12622a(context).m12665x();
    }

    public C6770e() {
        C6772g.m6179b().m6184f(this);
    }
}
