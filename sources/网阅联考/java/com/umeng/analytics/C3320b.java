package com.umeng.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.filter.C3322a;
import com.umeng.analytics.filter.C3323b;
import com.umeng.analytics.pro.C3380c;
import com.umeng.analytics.pro.C3391h;
import com.umeng.analytics.pro.C3392i;
import com.umeng.analytics.pro.C3393j;
import com.umeng.analytics.pro.C3394k;
import com.umeng.analytics.pro.C3395l;
import com.umeng.analytics.pro.C3397n;
import com.umeng.analytics.pro.C3398o;
import com.umeng.analytics.pro.C3401r;
import com.umeng.analytics.pro.C3403t;
import com.umeng.analytics.pro.C3404u;
import com.umeng.analytics.pro.C3407x;
import com.umeng.analytics.pro.InterfaceC3396m;
import com.umeng.analytics.pro.InterfaceC3402s;
import com.umeng.common.ISysListener;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.C3510b;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.b */
/* loaded from: classes2.dex */
public class C3320b implements InterfaceC3396m, InterfaceC3402s {

    /* renamed from: A */
    private static final String f1571A = "umsp_2";

    /* renamed from: B */
    private static final String f1572B = "umsp_3";

    /* renamed from: C */
    private static final String f1573C = "umsp_4";

    /* renamed from: D */
    private static final String f1574D = "umsp_5";

    /* renamed from: a */
    private static Context f1575a = null;

    /* renamed from: h */
    private static final String f1576h = "sp_uapp";

    /* renamed from: i */
    private static final String f1577i = "prepp_uapp";

    /* renamed from: o */
    private static final int f1578o = 128;

    /* renamed from: p */
    private static final int f1579p = 256;

    /* renamed from: q */
    private static String f1580q = "";

    /* renamed from: r */
    private static String f1581r = "";

    /* renamed from: s */
    private static final String f1582s = "ekv_bl";

    /* renamed from: t */
    private static final String f1583t = "ekv_bl_ver";

    /* renamed from: v */
    private static final String f1584v = "ekv_wl";

    /* renamed from: w */
    private static final String f1585w = "ekv_wl_ver";

    /* renamed from: z */
    private static final String f1586z = "umsp_1";

    /* renamed from: b */
    private ISysListener f1587b;

    /* renamed from: c */
    private C3398o f1588c;

    /* renamed from: d */
    private C3404u f1589d;

    /* renamed from: e */
    private C3393j f1590e;

    /* renamed from: f */
    private C3403t f1591f;

    /* renamed from: g */
    private C3394k f1592g;

    /* renamed from: j */
    private boolean f1593j;

    /* renamed from: k */
    private volatile JSONObject f1594k;

    /* renamed from: l */
    private volatile JSONObject f1595l;

    /* renamed from: m */
    private volatile JSONObject f1596m;

    /* renamed from: n */
    private boolean f1597n;

    /* renamed from: u */
    private C3322a f1598u;

    /* renamed from: x */
    private C3323b f1599x;

    /* renamed from: y */
    private C3395l f1600y;

    /* renamed from: com.umeng.analytics.b$a */
    public static class a {

        /* renamed from: a */
        private static final C3320b f1601a = new C3320b();

        private a() {
        }
    }

    static {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            f1575a = appContext.getApplicationContext();
        }
    }

    /* renamed from: a */
    public static C3320b m2757a() {
        return a.f1601a;
    }

    /* renamed from: i */
    private void m2762i(Context context) {
        try {
            if (context == null) {
                MLog.m3647e("unexpected null context in getNativeSuperProperties");
                return;
            }
            if (f1575a == null) {
                f1575a = context.getApplicationContext();
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (this.f1594k == null) {
                this.f1594k = new JSONObject();
            }
            if (this.f1595l == null) {
                this.f1595l = new JSONObject();
            }
            String string = sharedPreferences.getString(f1577i, null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.f1596m = new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            if (this.f1596m == null) {
                this.f1596m = new JSONObject();
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    public JSONObject m2785b() {
        return this.f1594k;
    }

    /* renamed from: c */
    public JSONObject m2790c() {
        return this.f1596m;
    }

    /* renamed from: d */
    public JSONObject m2793d() {
        return this.f1595l;
    }

    /* renamed from: e */
    public void m2798e() {
        this.f1595l = null;
    }

    /* renamed from: f */
    public String m2799f() {
        if (UMUtils.isMainProgress(f1575a)) {
            return f1580q;
        }
        MLog.m3647e("getOnResumedActivityName can not be called in child process");
        return null;
    }

    /* renamed from: g */
    public String m2802g() {
        if (UMUtils.isMainProgress(f1575a)) {
            return f1581r;
        }
        MLog.m3647e("getOnPausedActivityName can not be called in child process");
        return null;
    }

    /* renamed from: h */
    public void m2805h() {
        try {
            Context context = f1575a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m3647e("onStartSessionInternal can not be called in child process");
                    return;
                }
                if (UMConfigure.isDebugLog() && !UMConfigure.getInitStatus()) {
                    UMLog.mutlInfo(C3392i.f2148H, 3, "", null, null);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                Context context2 = f1575a;
                UMWorkDispatch.sendEvent(context2, 4352, CoreProtocol.getInstance(context2), Long.valueOf(jCurrentTimeMillis));
                Context context3 = f1575a;
                UMWorkDispatch.sendEvent(context3, C3397n.a.f2273g, CoreProtocol.getInstance(context3), Long.valueOf(jCurrentTimeMillis));
            }
            ISysListener iSysListener = this.f1587b;
            if (iSysListener != null) {
                iSysListener.onAppResume();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: j */
    public void m2807j() {
        try {
            Context context = f1575a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.m3647e("onProfileSignOff can not be called in child process");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ts", jCurrentTimeMillis);
            Context context2 = f1575a;
            UMWorkDispatch.sendEvent(context2, C3397n.a.f2272f, CoreProtocol.getInstance(context2), jSONObject);
            Context context3 = f1575a;
            UMWorkDispatch.sendEvent(context3, C3397n.a.f2281o, CoreProtocol.getInstance(context3), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m3649e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    /* renamed from: k */
    public synchronized void m2808k() {
        Context context;
        try {
            context = f1575a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m3647e("unregisterSuperPropertyByCoreProtocol can not be called in child process");
            return;
        }
        if (this.f1594k != null) {
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(f1575a).edit();
            editorEdit.putString(f1576h, this.f1594k.toString());
            editorEdit.commit();
        } else {
            this.f1594k = new JSONObject();
        }
    }

    /* renamed from: l */
    public synchronized JSONObject m2809l() {
        Context context;
        try {
            context = f1575a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return null;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m3647e("getSuperPropertiesJSONObject can not be called in child process");
            return null;
        }
        if (this.f1594k == null) {
            this.f1594k = new JSONObject();
        }
        return this.f1594k;
    }

    /* renamed from: m */
    public synchronized void m2810m() {
        try {
            Context context = f1575a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m3647e("clearSuperPropertiesByCoreProtocol can not be called in child process");
                } else {
                    SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(f1575a).edit();
                    editorEdit.remove(f1576h);
                    editorEdit.commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC3396m
    /* renamed from: n */
    public void mo2811n() {
        UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> onIntoBackground triggered.");
        if (AnalyticsConfig.enable && FieldManager.m3407b()) {
            if (!FieldManager.allow(C3510b.f2969D)) {
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> 退出发送策略: 云控控制字关闭。功能不生效");
            } else {
                if (UMWorkDispatch.eventHasExist(C3397n.a.f2292z)) {
                    return;
                }
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> 退出时发送策略 被触发！");
                Context context = f1575a;
                UMWorkDispatch.sendEvent(context, C3397n.a.f2292z, CoreProtocol.getInstance(context), null);
            }
        }
    }

    private C3320b() {
        this.f1588c = new C3398o();
        this.f1589d = new C3404u();
        this.f1590e = new C3393j();
        this.f1591f = C3403t.m3314a();
        this.f1592g = null;
        this.f1593j = false;
        this.f1594k = null;
        this.f1595l = null;
        this.f1596m = null;
        this.f1597n = false;
        this.f1598u = null;
        this.f1599x = null;
        this.f1600y = null;
        this.f1588c.m3286a(this);
    }

    /* renamed from: a */
    public void m2765a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f1575a == null) {
                f1575a = context.getApplicationContext();
            }
            if (this.f1598u == null) {
                C3322a c3322a = new C3322a("ekv_bl", "ekv_bl_ver");
                this.f1598u = c3322a;
                c3322a.register(f1575a);
            }
            if (this.f1599x == null) {
                C3323b c3323b = new C3323b("ekv_wl", "ekv_wl_ver");
                this.f1599x = c3323b;
                c3323b.register(f1575a);
            }
            if (UMUtils.isMainProgress(f1575a)) {
                if (!this.f1593j) {
                    this.f1593j = true;
                    m2762i(f1575a);
                }
                synchronized (this) {
                    if (!this.f1597n) {
                        C3394k c3394kM3195a = C3394k.m3195a(context);
                        this.f1592g = c3394kM3195a;
                        if (c3394kM3195a.m3212a()) {
                            this.f1597n = true;
                        }
                        this.f1600y = C3395l.m3217a();
                        try {
                            C3395l.m3218a(context);
                            this.f1600y.m3223a(this);
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (UMConfigure.isDebugLog()) {
                    UMLog.mutlInfo(C3392i.f2142B, 3, "", null, null);
                }
                UMWorkDispatch.registerConnStateObserver(CoreProtocol.getInstance(f1575a));
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    public void m2789b(String str) {
        if (!UMUtils.isMainProgress(f1575a)) {
            MLog.m3647e("onPageEnd can not be called in child process");
            return;
        }
        try {
            if (C3394k.f2212b != MobclickAgent.PageMode.LEGACY_AUTO) {
                this.f1589d.m3337b(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public void m2791c(Context context) {
        if (context == null) {
            UMLog.m3426aq(C3392i.f2200p, 0, "\\|");
            return;
        }
        if (C3394k.f2212b == MobclickAgent.PageMode.AUTO) {
            return;
        }
        if (f1575a == null) {
            f1575a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f1575a)) {
            MLog.m3647e("onPause can not be called in child process");
            return;
        }
        if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
            UMLog.m3426aq(C3392i.f2201q, 2, "\\|");
        }
        try {
            if (!this.f1593j || !this.f1597n) {
                m2765a(context);
            }
            if (C3394k.f2212b != MobclickAgent.PageMode.LEGACY_MANUAL) {
                this.f1590e.m3337b(context.getClass().getName());
            }
            m2806i();
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m3649e("Exception occurred in Mobclick.onRause(). ", th);
            }
        }
        if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
            f1581r = context.getClass().getName();
        }
    }

    /* renamed from: d */
    public void m2794d(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f1575a == null) {
                f1575a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f1575a)) {
                MLog.m3647e("onKillProcess can not be called in child process");
                return;
            }
            C3394k c3394k = this.f1592g;
            if (c3394k != null) {
                c3394k.m3215c();
            }
            C3394k.m3197a(context, "onKillProcess");
            C3393j c3393j = this.f1590e;
            if (c3393j != null) {
                c3393j.m3336b();
            }
            C3404u c3404u = this.f1589d;
            if (c3404u != null) {
                c3404u.m3336b();
            }
            Context context2 = f1575a;
            if (context2 != null) {
                C3403t c3403t = this.f1591f;
                if (c3403t != null) {
                    c3403t.m3332c(context2, Long.valueOf(System.currentTimeMillis()));
                }
                C3397n.m3225a(f1575a).m3270d();
                C3404u.m3334a(f1575a);
                if (C3394k.f2212b == MobclickAgent.PageMode.AUTO) {
                    C3394k.m3205c(f1575a);
                }
                PreferenceWrapper.getDefault(f1575a).edit().commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public synchronized Object m2796e(Context context, String str) {
        if (context == null) {
            UMLog.m3426aq(C3392i.f2176ai, 0, "\\|");
            return null;
        }
        if (f1575a == null) {
            f1575a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f1575a)) {
            MLog.m3647e("getSuperProperty can not be called in child process");
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            UMLog.m3426aq(C3392i.f2174ag, 0, "\\|");
            return null;
        }
        if (!str.equals(f1586z) && !str.equals(f1571A) && !str.equals(f1572B) && !str.equals(f1573C) && !str.equals(f1574D)) {
            MLog.m3647e("please check key or value, must be correct!");
            return null;
        }
        if (this.f1594k == null) {
            this.f1594k = new JSONObject();
        } else if (this.f1594k.has(str)) {
            return this.f1594k.opt(str);
        }
        return null;
    }

    /* renamed from: f */
    public synchronized void m2800f(Context context) {
        if (context == null) {
            UMLog.m3426aq(C3392i.f2175ah, 0, "\\|");
            return;
        }
        if (f1575a == null) {
            f1575a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f1575a)) {
            MLog.m3647e("clearSuperProperties can not be called in child process");
            return;
        }
        if (!this.f1593j || !this.f1597n) {
            m2765a(f1575a);
        }
        this.f1594k = new JSONObject();
        Context context2 = f1575a;
        UMWorkDispatch.sendEvent(context2, C3397n.a.f2285s, CoreProtocol.getInstance(context2), null);
    }

    /* renamed from: g */
    public synchronized void m2803g(Context context) {
        if (context == null) {
            UMLog.m3426aq(C3392i.f2183ap, 0, "\\|");
            return;
        }
        if (f1575a == null) {
            f1575a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f1575a)) {
            MLog.m3647e("clearPreProperties can not be called in child process");
            return;
        }
        if (!this.f1593j || !this.f1597n) {
            m2765a(f1575a);
        }
        if (this.f1596m.length() > 0) {
            Context context2 = f1575a;
            UMWorkDispatch.sendEvent(context2, C3397n.a.f2289w, CoreProtocol.getInstance(context2), null);
        }
        this.f1596m = new JSONObject();
    }

    /* renamed from: b */
    public void m2786b(Context context) {
        if (context == null) {
            MLog.m3647e("unexpected null context in onResume");
            return;
        }
        if (C3394k.f2212b == MobclickAgent.PageMode.AUTO) {
            return;
        }
        if (f1575a == null) {
            f1575a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f1575a)) {
            MLog.m3647e("onResume can not be called in child process");
            return;
        }
        if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
            UMLog.m3426aq(C3392i.f2199o, 2, "\\|");
        }
        try {
            if (!this.f1593j || !this.f1597n) {
                m2765a(context);
            }
            if (C3394k.f2212b != MobclickAgent.PageMode.LEGACY_MANUAL) {
                this.f1590e.m3335a(context.getClass().getName());
            }
            m2805h();
            if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
                f1580q = context.getClass().getName();
            }
        } catch (Throwable th) {
            MLog.m3649e("Exception occurred in Mobclick.onResume(). ", th);
        }
    }

    /* renamed from: i */
    public void m2806i() {
        try {
            Context context = f1575a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m3647e("onEndSessionInternal can not be called in child process");
                    return;
                }
                Context context2 = f1575a;
                UMWorkDispatch.sendEvent(context2, C3397n.a.f2274h, CoreProtocol.getInstance(context2), Long.valueOf(System.currentTimeMillis()));
                Context context3 = f1575a;
                UMWorkDispatch.sendEvent(context3, 4100, CoreProtocol.getInstance(context3), null);
                Context context4 = f1575a;
                UMWorkDispatch.sendEvent(context4, 4099, CoreProtocol.getInstance(context4), null);
                Context context5 = f1575a;
                UMWorkDispatch.sendEvent(context5, C3397n.a.f2275i, CoreProtocol.getInstance(context5), null);
            }
        } catch (Throwable unused) {
        }
        ISysListener iSysListener = this.f1587b;
        if (iSysListener != null) {
            iSysListener.onAppPause();
        }
    }

    /* renamed from: h */
    public synchronized JSONObject m2804h(Context context) {
        if (context == null) {
            UMLog.m3426aq(C3392i.f2184aq, 0, "\\|");
            return null;
        }
        if (f1575a == null) {
            f1575a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f1575a)) {
            MLog.m3647e("getPreProperties can not be called in child process");
            return null;
        }
        if (!this.f1593j || !this.f1597n) {
            m2765a(f1575a);
        }
        if (this.f1596m == null) {
            this.f1596m = new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (this.f1596m.length() > 0) {
            try {
                jSONObject = new JSONObject(this.f1596m.toString());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: f */
    public synchronized void m2801f(Context context, String str) {
        if (context == null) {
            UMLog.m3426aq(C3392i.f2181an, 0, "\\|");
            return;
        }
        if (f1575a == null) {
            f1575a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f1575a)) {
            MLog.m3647e("unregisterPreProperty can not be called in child process");
            return;
        }
        if (!this.f1593j || !this.f1597n) {
            m2765a(f1575a);
        }
        if (this.f1596m == null) {
            this.f1596m = new JSONObject();
        }
        if (str != null && str.length() > 0) {
            if (this.f1596m.has(str)) {
                this.f1596m.remove(str);
                Context context2 = f1575a;
                UMWorkDispatch.sendEvent(context2, C3397n.a.f2288v, CoreProtocol.getInstance(context2), this.f1596m.toString());
            } else if (UMConfigure.isDebugLog()) {
                UMLog.m3426aq(C3392i.f2182ao, 0, "\\|");
            }
            return;
        }
        MLog.m3647e("please check propertics, property is null!");
    }

    /* renamed from: c */
    private boolean m2761c(String str) {
        if (this.f1598u.enabled() && this.f1598u.matchHit(str)) {
            return true;
        }
        if (!this.f1599x.enabled()) {
            return false;
        }
        if (!this.f1599x.matchHit(str)) {
            return true;
        }
        UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> white list match! id = " + str);
        return false;
    }

    /* renamed from: d */
    public synchronized void m2795d(Context context, String str) {
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (context == null) {
            UMLog.m3426aq(C3392i.f2175ah, 0, "\\|");
            return;
        }
        if (f1575a == null) {
            f1575a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f1575a)) {
            MLog.m3647e("unregisterSuperProperty can not be called in child process");
            return;
        }
        if (!this.f1593j || !this.f1597n) {
            m2765a(f1575a);
        }
        if (TextUtils.isEmpty(str)) {
            UMLog.m3426aq(C3392i.f2174ag, 0, "\\|");
            return;
        }
        if (!str.equals(f1586z) && !str.equals(f1571A) && !str.equals(f1572B) && !str.equals(f1573C) && !str.equals(f1574D)) {
            MLog.m3647e("please check key or value, must be correct!");
            return;
        }
        if (this.f1594k == null) {
            this.f1594k = new JSONObject();
        }
        if (this.f1594k.has(str)) {
            this.f1594k.remove(str);
            Context context2 = f1575a;
            UMWorkDispatch.sendEvent(context2, 8197, CoreProtocol.getInstance(context2), str);
        }
    }

    /* renamed from: b */
    public void m2787b(Context context, String str) {
        try {
            if (context == null) {
                UMLog.m3426aq(C3392i.f2154N, 0, "\\|");
                return;
            }
            if (f1575a == null) {
                f1575a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f1575a)) {
                MLog.m3647e("onDeepLinkReceived can not be called in child process");
                return;
            }
            if (!this.f1593j || !this.f1597n) {
                m2765a(f1575a);
            }
            if (!TextUtils.isEmpty(str)) {
                HashMap map = new HashMap();
                map.put(C3380c.f1979aE, str);
                m2758a(f1575a, C3380c.f1978aD, (Map<String, Object>) map, -1L, false);
                return;
            }
            UMLog.m3426aq(C3392i.f2155O, 0, "\\|");
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m3651e(th);
            }
        }
    }

    /* renamed from: e */
    public synchronized String m2797e(Context context) {
        if (context == null) {
            UMLog.m3426aq(C3392i.f2176ai, 0, "\\|");
            return null;
        }
        if (f1575a == null) {
            f1575a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f1575a)) {
            MLog.m3647e("getSuperProperties can not be called in child process");
            return null;
        }
        if (this.f1594k != null) {
            return this.f1594k.toString();
        }
        this.f1594k = new JSONObject();
        return null;
    }

    /* renamed from: c */
    public void m2792c(Context context, String str) {
        if (context == null) {
            UMLog.m3426aq(C3392i.f2210z, 0, "\\|");
            return;
        }
        if (f1575a == null) {
            f1575a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f1575a)) {
            MLog.m3647e("setSecret can not be called in child process");
            return;
        }
        if (!this.f1593j || !this.f1597n) {
            m2765a(f1575a);
        }
        AnalyticsConfig.m2754a(f1575a, str);
    }

    /* renamed from: a */
    public void m2780a(String str) {
        if (!UMUtils.isMainProgress(f1575a)) {
            MLog.m3647e("onPageStart can not be called in child process");
            return;
        }
        try {
            if (C3394k.f2212b != MobclickAgent.PageMode.LEGACY_AUTO) {
                this.f1589d.m3335a(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m2778a(ISysListener iSysListener) {
        if (!UMUtils.isMainProgress(f1575a)) {
            MLog.m3647e("setSysListener can not be called in child process");
        } else {
            this.f1587b = iSysListener;
        }
    }

    /* renamed from: a */
    public void m2766a(Context context, int i4) {
        if (context == null) {
            MLog.m3647e("unexpected null context in setVerticalType");
            return;
        }
        if (f1575a == null) {
            f1575a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f1575a)) {
            MLog.m3647e("setVerticalType can not be called in child process");
            return;
        }
        if (!this.f1593j || !this.f1597n) {
            m2765a(f1575a);
        }
        AnalyticsConfig.m2753a(f1575a, i4);
    }

    /* renamed from: b */
    public synchronized void m2788b(Object obj) {
        Context context;
        try {
            context = f1575a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m3647e("updateNativePrePropertiesByCoreProtocol can not be called in child process");
            return;
        }
        SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(f1575a).edit();
        if (obj != null) {
            String str = (String) obj;
            if (editorEdit != null && !TextUtils.isEmpty(str)) {
                editorEdit.putString(f1577i, str).commit();
            }
        } else if (editorEdit != null) {
            editorEdit.remove(f1577i).commit();
        }
    }

    /* renamed from: a */
    public void m2771a(Context context, String str, HashMap<String, Object> map) {
        if (context == null) {
            return;
        }
        try {
            if (f1575a == null) {
                f1575a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f1575a)) {
                MLog.m3647e("onGKVEvent can not be called in child process");
                return;
            }
            if (!this.f1593j || !this.f1597n) {
                m2765a(f1575a);
            }
            String string = "";
            if (this.f1594k == null) {
                this.f1594k = new JSONObject();
            } else {
                string = this.f1594k.toString();
            }
            C3401r.m3297a(f1575a).m3310a(str, map, string);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m3651e(th);
            }
        }
    }

    /* renamed from: b */
    private boolean m2760b(String str, Object obj) {
        int length;
        if (TextUtils.isEmpty(str)) {
            MLog.m3647e("key is " + str + ", please check key, illegal");
            return false;
        }
        try {
            length = str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            length = 0;
        }
        if (length > 128) {
            MLog.m3647e("key length is " + length + ", please check key, illegal");
            return false;
        }
        if (obj instanceof String) {
            if (((String) obj).getBytes("UTF-8").length <= 256) {
                return true;
            }
            MLog.m3647e("value length is " + ((String) obj).getBytes("UTF-8").length + ", please check value, illegal");
            return false;
        }
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float)) {
            return true;
        }
        MLog.m3647e("value is " + obj + ", please check value, type illegal");
        return false;
    }

    /* renamed from: a */
    public void m2768a(Context context, String str) {
        if (context == null) {
            UMLog.m3426aq(C3392i.f2207w, 0, "\\|");
            return;
        }
        if (f1575a == null) {
            f1575a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f1575a)) {
            MLog.m3647e("reportError can not be called in child process");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            if (UMConfigure.isDebugLog()) {
                UMLog.m3426aq(C3392i.f2208x, 0, "\\|");
                return;
            }
            return;
        }
        try {
            if (!this.f1593j || !this.f1597n) {
                m2765a(f1575a);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ts", System.currentTimeMillis());
            jSONObject.put(C3380c.f1964Q, 2);
            jSONObject.put(C3380c.f1965R, str);
            jSONObject.put("__ii", this.f1591f.m3330c());
            Context context2 = f1575a;
            UMWorkDispatch.sendEvent(context2, C3397n.a.f2276j, CoreProtocol.getInstance(context2), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m3651e(th);
            }
        }
    }

    /* renamed from: a */
    public void m2774a(Context context, Throwable th) {
        if (context != null && th != null) {
            if (f1575a == null) {
                f1575a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f1575a)) {
                MLog.m3647e("reportError can not be called in child process");
                return;
            }
            try {
                if (!this.f1593j || !this.f1597n) {
                    m2765a(f1575a);
                }
                m2768a(f1575a, DataHelper.convertExceptionToString(th));
                return;
            } catch (Exception e4) {
                if (MLog.DEBUG) {
                    MLog.m3651e(e4);
                    return;
                }
                return;
            }
        }
        UMLog.m3426aq(C3392i.f2209y, 0, "\\|");
    }

    /* renamed from: a */
    public void m2770a(Context context, String str, String str2, long j4, int i4) {
        if (context == null) {
            return;
        }
        try {
            if (f1575a == null) {
                f1575a = context.getApplicationContext();
            }
            if (!this.f1593j || !this.f1597n) {
                m2765a(f1575a);
            }
            if (m2761c(str)) {
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> filter ekv [" + str + "].");
                return;
            }
            String string = "";
            if (this.f1594k == null) {
                this.f1594k = new JSONObject();
            } else {
                string = this.f1594k.toString();
            }
            C3401r.m3297a(f1575a).m3308a(str, str2, j4, i4, string);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m3651e(th);
            }
        }
    }

    /* renamed from: a */
    public void m2773a(Context context, String str, Map<String, Object> map, long j4) {
        try {
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m3651e(th);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if (Arrays.asList(C3380c.f1980aF).contains(str)) {
                UMLog.m3426aq(C3392i.f2186b, 0, "\\|");
                return;
            }
            if (map.isEmpty()) {
                UMLog.m3426aq(C3392i.f2188d, 0, "\\|");
                return;
            }
            Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (Arrays.asList(C3380c.f1980aF).contains(it.next().getKey())) {
                    UMLog.m3426aq(C3392i.f2189e, 0, "\\|");
                    return;
                }
            }
            m2758a(context, str, map, j4, false);
            return;
        }
        UMLog.m3426aq(C3392i.f2187c, 0, "\\|");
    }

    /* renamed from: a */
    public void m2772a(Context context, String str, Map<String, Object> map) {
        m2758a(context, str, map, -1L, true);
    }

    /* renamed from: a */
    private void m2758a(Context context, String str, Map<String, Object> map, long j4, boolean z3) {
        try {
            if (context == null) {
                MLog.m3647e("context is null in onEventNoCheck, please check!");
                return;
            }
            if (f1575a == null) {
                f1575a = context.getApplicationContext();
            }
            if (!this.f1593j || !this.f1597n) {
                m2765a(f1575a);
            }
            if (m2761c(str)) {
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> filter ekv [" + str + "].");
                return;
            }
            String string = "";
            if (this.f1594k == null) {
                this.f1594k = new JSONObject();
            } else {
                string = this.f1594k.toString();
            }
            C3401r.m3297a(f1575a).m3309a(str, map, j4, string, z3);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m3651e(th);
            }
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC3402s
    /* renamed from: a */
    public void mo2782a(Throwable th) throws JSONException {
        try {
            Context context = f1575a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.m3647e("onAppCrash can not be called in child process");
                return;
            }
            if (AnalyticsConfig.enable) {
                C3404u c3404u = this.f1589d;
                if (c3404u != null) {
                    c3404u.m3336b();
                }
                C3394k.m3197a(f1575a, "onAppCrash");
                C3393j c3393j = this.f1590e;
                if (c3393j != null) {
                    c3393j.m3336b();
                }
                C3394k c3394k = this.f1592g;
                if (c3394k != null) {
                    c3394k.m3215c();
                }
                C3403t c3403t = this.f1591f;
                if (c3403t != null) {
                    c3403t.m3332c(f1575a, Long.valueOf(System.currentTimeMillis()));
                }
                if (th != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ts", System.currentTimeMillis());
                    jSONObject.put(C3380c.f1964Q, 1);
                    jSONObject.put(C3380c.f1965R, DataHelper.convertExceptionToString(th));
                    C3391h.m3158a(f1575a).m3176a(this.f1591f.m3330c(), jSONObject.toString(), 1);
                }
                C3397n.m3225a(f1575a).m3270d();
                C3404u.m3334a(f1575a);
                if (C3394k.f2212b == MobclickAgent.PageMode.AUTO) {
                    C3394k.m3205c(f1575a);
                }
                PreferenceWrapper.getDefault(f1575a).edit().commit();
            }
        } catch (Exception e4) {
            if (MLog.DEBUG) {
                MLog.m3649e("Exception in onAppCrash", e4);
            }
        }
    }

    /* renamed from: a */
    public void m2781a(String str, String str2) {
        try {
            Context context = f1575a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.m3647e("onProfileSignIn can not be called in child process");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3380c.f1960M, str);
            jSONObject.put("uid", str2);
            jSONObject.put("ts", jCurrentTimeMillis);
            Context context2 = f1575a;
            UMWorkDispatch.sendEvent(context2, C3397n.a.f2271e, CoreProtocol.getInstance(context2), jSONObject);
            Context context3 = f1575a;
            UMWorkDispatch.sendEvent(context3, C3397n.a.f2281o, CoreProtocol.getInstance(context3), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m3649e(" Excepthon  in  onProfileSignIn", th);
            }
        }
    }

    /* renamed from: a */
    public void m2784a(boolean z3) {
        Context context = f1575a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m3647e("setCatchUncaughtExceptions can not be called in child process");
        } else {
            if (AnalyticsConfig.CHANGE_CATCH_EXCEPTION_NOTALLOW) {
                return;
            }
            AnalyticsConfig.CATCH_EXCEPTION = z3;
        }
    }

    /* renamed from: a */
    public void m2783a(GL10 gl10) {
        String[] gpu = UMUtils.getGPU(gl10);
        if (gpu.length == 2) {
            AnalyticsConfig.GPU_VENDER = gpu[0];
            AnalyticsConfig.GPU_RENDERER = gpu[1];
        }
    }

    /* renamed from: a */
    public void m2777a(MobclickAgent.PageMode pageMode) {
        Context context = f1575a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m3647e("setPageCollectionMode can not be called in child process");
        } else {
            C3394k.f2212b = pageMode;
        }
    }

    /* renamed from: a */
    public void m2763a(double d4, double d5) {
        Context context = f1575a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m3647e("setLocation can not be called in child process");
            return;
        }
        if (AnalyticsConfig.f1551a == null) {
            AnalyticsConfig.f1551a = new double[2];
        }
        double[] dArr = AnalyticsConfig.f1551a;
        dArr[0] = d4;
        dArr[1] = d5;
    }

    /* renamed from: a */
    public void m2767a(Context context, MobclickAgent.EScenarioType eScenarioType) {
        if (context == null) {
            MLog.m3647e("unexpected null context in setScenarioType");
            return;
        }
        if (f1575a == null) {
            f1575a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f1575a)) {
            MLog.m3647e("setScenarioType can not be called in child process");
            return;
        }
        if (eScenarioType != null) {
            m2766a(f1575a, eScenarioType.toValue());
        }
        if (this.f1593j && this.f1597n) {
            return;
        }
        m2765a(f1575a);
    }

    /* renamed from: a */
    public void m2764a(long j4) {
        Context context = f1575a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m3647e("setSessionContinueMillis can not be called in child process");
        } else {
            AnalyticsConfig.kContinueSessionMillis = j4;
            C3407x.m3344a().m3353a(AnalyticsConfig.kContinueSessionMillis);
        }
    }

    /* renamed from: a */
    public synchronized void m2769a(Context context, String str, Object obj) {
        int i4 = 0;
        if (context == null) {
            UMLog.m3426aq(C3392i.f2173af, 0, "\\|");
            return;
        }
        if (f1575a == null) {
            f1575a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f1575a)) {
            MLog.m3647e("registerSuperProperty can not be called in child process");
            return;
        }
        if (!this.f1593j || !this.f1597n) {
            m2765a(f1575a);
        }
        if (!TextUtils.isEmpty(str) && obj != null) {
            if (!str.equals(f1586z) && !str.equals(f1571A) && !str.equals(f1572B) && !str.equals(f1573C) && !str.equals(f1574D)) {
                MLog.m3647e("property name is " + str + ", please check key, must be correct!");
                return;
            }
            if ((obj instanceof String) && !HelperUtils.checkStrLen(obj.toString(), 256)) {
                MLog.m3647e("property value is " + obj + ", please check value, lawless!");
                return;
            }
            try {
                if (this.f1594k == null) {
                    this.f1594k = new JSONObject();
                }
                if (obj.getClass().isArray()) {
                    if (obj instanceof String[]) {
                        String[] strArr = (String[]) obj;
                        if (strArr.length > 10) {
                            MLog.m3647e("please check value, size is " + strArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray = new JSONArray();
                        while (i4 < strArr.length) {
                            String str2 = strArr[i4];
                            if (str2 != null && HelperUtils.checkStrLen(str2, 256)) {
                                jSONArray.put(strArr[i4]);
                                i4++;
                            }
                            MLog.m3647e("please check value, length is " + strArr[i4].length() + ", overlength 256!");
                            return;
                        }
                        this.f1594k.put(str, jSONArray);
                    } else if (obj instanceof long[]) {
                        long[] jArr = (long[]) obj;
                        if (jArr.length > 10) {
                            MLog.m3647e("please check value, size is " + jArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray2 = new JSONArray();
                        while (i4 < jArr.length) {
                            jSONArray2.put(jArr[i4]);
                            i4++;
                        }
                        this.f1594k.put(str, jSONArray2);
                    } else if (obj instanceof int[]) {
                        int[] iArr = (int[]) obj;
                        if (iArr.length > 10) {
                            MLog.m3647e("please check value, size is " + iArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray3 = new JSONArray();
                        while (i4 < iArr.length) {
                            jSONArray3.put(iArr[i4]);
                            i4++;
                        }
                        this.f1594k.put(str, jSONArray3);
                    } else if (obj instanceof float[]) {
                        float[] fArr = (float[]) obj;
                        if (fArr.length > 10) {
                            MLog.m3647e("please check value, size is " + fArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray4 = new JSONArray();
                        while (i4 < fArr.length) {
                            jSONArray4.put(fArr[i4]);
                            i4++;
                        }
                        this.f1594k.put(str, jSONArray4);
                    } else if (obj instanceof double[]) {
                        double[] dArr = (double[]) obj;
                        if (dArr.length > 10) {
                            MLog.m3647e("please check value, size is " + dArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray5 = new JSONArray();
                        while (i4 < dArr.length) {
                            jSONArray5.put(dArr[i4]);
                            i4++;
                        }
                        this.f1594k.put(str, jSONArray5);
                    } else if (obj instanceof short[]) {
                        short[] sArr = (short[]) obj;
                        if (sArr.length > 10) {
                            MLog.m3647e("please check value, size is " + sArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray6 = new JSONArray();
                        while (i4 < sArr.length) {
                            jSONArray6.put((int) sArr[i4]);
                            i4++;
                        }
                        this.f1594k.put(str, jSONArray6);
                    } else {
                        MLog.m3647e("please check value, illegal type!");
                        return;
                    }
                } else {
                    if (!(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Integer) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof Short)) {
                        MLog.m3647e("please check value, illegal type!");
                        return;
                    }
                    this.f1594k.put(str, obj);
                }
            } catch (Throwable unused) {
            }
            Context context2 = f1575a;
            UMWorkDispatch.sendEvent(context2, C3397n.a.f2284r, CoreProtocol.getInstance(context2), this.f1594k.toString());
            return;
        }
        UMLog.m3426aq(C3392i.f2174ag, 0, "\\|");
    }

    /* renamed from: a */
    private void m2759a(String str, Object obj) {
        try {
            if (this.f1594k == null) {
                this.f1594k = new JSONObject();
            }
            int i4 = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof String[]) {
                    String[] strArr = (String[]) obj;
                    if (strArr.length > 10) {
                        return;
                    }
                    JSONArray jSONArray = new JSONArray();
                    while (i4 < strArr.length) {
                        String str2 = strArr[i4];
                        if (str2 != null && !HelperUtils.checkStrLen(str2, 256)) {
                            jSONArray.put(strArr[i4]);
                        }
                        i4++;
                    }
                    this.f1594k.put(str, jSONArray);
                    return;
                }
                if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    JSONArray jSONArray2 = new JSONArray();
                    while (i4 < jArr.length) {
                        jSONArray2.put(jArr[i4]);
                        i4++;
                    }
                    this.f1594k.put(str, jSONArray2);
                    return;
                }
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    JSONArray jSONArray3 = new JSONArray();
                    while (i4 < iArr.length) {
                        jSONArray3.put(iArr[i4]);
                        i4++;
                    }
                    this.f1594k.put(str, jSONArray3);
                    return;
                }
                if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    JSONArray jSONArray4 = new JSONArray();
                    while (i4 < fArr.length) {
                        jSONArray4.put(fArr[i4]);
                        i4++;
                    }
                    this.f1594k.put(str, jSONArray4);
                    return;
                }
                if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    JSONArray jSONArray5 = new JSONArray();
                    while (i4 < dArr.length) {
                        jSONArray5.put(dArr[i4]);
                        i4++;
                    }
                    this.f1594k.put(str, jSONArray5);
                    return;
                }
                if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    JSONArray jSONArray6 = new JSONArray();
                    while (i4 < sArr.length) {
                        jSONArray6.put((int) sArr[i4]);
                        i4++;
                    }
                    this.f1594k.put(str, jSONArray6);
                    return;
                }
                return;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                JSONArray jSONArray7 = new JSONArray();
                while (i4 < list.size()) {
                    Object obj2 = list.get(i4);
                    if ((obj2 instanceof String) || (obj2 instanceof Long) || (obj2 instanceof Integer) || (obj2 instanceof Float) || (obj2 instanceof Double) || (obj2 instanceof Short)) {
                        jSONArray7.put(list.get(i4));
                    }
                    i4++;
                }
                this.f1594k.put(str, jSONArray7);
                return;
            }
            if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                this.f1594k.put(str, obj);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public synchronized void m2779a(Object obj) {
        Context context;
        try {
            context = f1575a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m3647e("registerSuperPropertyByCoreProtocol can not be called in child process");
            return;
        }
        if (obj != null) {
            String str = (String) obj;
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(f1575a).edit();
            if (editorEdit != null && !TextUtils.isEmpty(str)) {
                editorEdit.putString(f1576h, this.f1594k.toString()).commit();
            }
        }
    }

    /* renamed from: a */
    public synchronized void m2775a(Context context, List<String> list) {
        try {
        } catch (Throwable th) {
            MLog.m3651e(th);
        }
        if (context == null) {
            UMLog.m3426aq(C3392i.f2177aj, 0, "\\|");
            return;
        }
        if (f1575a == null) {
            f1575a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f1575a)) {
            MLog.m3647e("setFirstLaunchEvent can not be called in child process");
            return;
        }
        if (!this.f1593j || !this.f1597n) {
            m2765a(f1575a);
        }
        C3401r.m3297a(f1575a).m3311a(list);
    }

    /* renamed from: a */
    public synchronized void m2776a(Context context, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String string;
        Object obj;
        if (context == null) {
            UMLog.m3426aq(C3392i.f2179al, 0, "\\|");
            return;
        }
        if (f1575a == null) {
            f1575a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f1575a)) {
            MLog.m3647e("registerPreProperties can not be called in child process");
            return;
        }
        if (!this.f1593j || !this.f1597n) {
            m2765a(f1575a);
        }
        if (this.f1596m == null) {
            this.f1596m = new JSONObject();
        }
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                jSONObject2 = new JSONObject(this.f1596m.toString());
            } catch (Exception unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            Iterator<String> itKeys = jSONObject.keys();
            if (itKeys != null) {
                while (itKeys.hasNext()) {
                    try {
                        string = itKeys.next().toString();
                        obj = jSONObject.get(string);
                    } catch (Exception unused2) {
                    }
                    if (m2760b(string, obj)) {
                        jSONObject2.put(string, obj);
                        if (jSONObject2.length() > 10) {
                            MLog.m3647e("please check propertics, size overlength!");
                            return;
                        }
                        continue;
                    } else {
                        return;
                    }
                }
            }
            this.f1596m = jSONObject2;
            if (this.f1596m.length() > 0) {
                Context context2 = f1575a;
                UMWorkDispatch.sendEvent(context2, C3397n.a.f2287u, CoreProtocol.getInstance(context2), this.f1596m.toString());
            }
            return;
        }
        UMLog.m3426aq(C3392i.f2180am, 0, "\\|");
    }
}
