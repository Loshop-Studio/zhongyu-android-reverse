package com.umeng.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.filter.C1838a;
import com.umeng.analytics.filter.C1839b;
import com.umeng.analytics.pro.C1896c;
import com.umeng.analytics.pro.C1907h;
import com.umeng.analytics.pro.C1908i;
import com.umeng.analytics.pro.C1909j;
import com.umeng.analytics.pro.C1910k;
import com.umeng.analytics.pro.C1911l;
import com.umeng.analytics.pro.C1913n;
import com.umeng.analytics.pro.C1914o;
import com.umeng.analytics.pro.C1917r;
import com.umeng.analytics.pro.C1919t;
import com.umeng.analytics.pro.C1920u;
import com.umeng.analytics.pro.C1923x;
import com.umeng.analytics.pro.InterfaceC1912m;
import com.umeng.analytics.pro.InterfaceC1918s;
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
import com.umeng.commonsdk.utils.C2026b;
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
/* loaded from: classes.dex */
public class C1836b implements InterfaceC1912m, InterfaceC1918s {

    /* renamed from: A */
    private static final String f8163A = "umsp_2";

    /* renamed from: B */
    private static final String f8164B = "umsp_3";

    /* renamed from: C */
    private static final String f8165C = "umsp_4";

    /* renamed from: D */
    private static final String f8166D = "umsp_5";

    /* renamed from: a */
    private static Context f8167a = null;

    /* renamed from: h */
    private static final String f8168h = "sp_uapp";

    /* renamed from: i */
    private static final String f8169i = "prepp_uapp";

    /* renamed from: o */
    private static final int f8170o = 128;

    /* renamed from: p */
    private static final int f8171p = 256;

    /* renamed from: q */
    private static String f8172q = "";

    /* renamed from: r */
    private static String f8173r = "";

    /* renamed from: s */
    private static final String f8174s = "ekv_bl";

    /* renamed from: t */
    private static final String f8175t = "ekv_bl_ver";

    /* renamed from: v */
    private static final String f8176v = "ekv_wl";

    /* renamed from: w */
    private static final String f8177w = "ekv_wl_ver";

    /* renamed from: z */
    private static final String f8178z = "umsp_1";

    /* renamed from: b */
    private ISysListener f8179b;

    /* renamed from: c */
    private C1914o f8180c;

    /* renamed from: d */
    private C1920u f8181d;

    /* renamed from: e */
    private C1909j f8182e;

    /* renamed from: f */
    private C1919t f8183f;

    /* renamed from: g */
    private C1910k f8184g;

    /* renamed from: j */
    private boolean f8185j;

    /* renamed from: k */
    private volatile JSONObject f8186k;

    /* renamed from: l */
    private volatile JSONObject f8187l;

    /* renamed from: m */
    private volatile JSONObject f8188m;

    /* renamed from: n */
    private boolean f8189n;

    /* renamed from: u */
    private C1838a f8190u;

    /* renamed from: x */
    private C1839b f8191x;

    /* renamed from: y */
    private C1911l f8192y;

    /* renamed from: com.umeng.analytics.b$a */
    private static class a {

        /* renamed from: a */
        private static final C1836b f8193a = new C1836b();

        private a() {
        }
    }

    static {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            f8167a = appContext.getApplicationContext();
        }
    }

    /* renamed from: a */
    public static C1836b m6680a() {
        return a.f8193a;
    }

    /* renamed from: i */
    private void m6685i(Context context) {
        try {
            if (context == null) {
                MLog.m7570e("unexpected null context in getNativeSuperProperties");
                return;
            }
            if (f8167a == null) {
                f8167a = context.getApplicationContext();
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (this.f8186k == null) {
                this.f8186k = new JSONObject();
            }
            if (this.f8187l == null) {
                this.f8187l = new JSONObject();
            }
            String string = sharedPreferences.getString(f8169i, null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.f8188m = new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            if (this.f8188m == null) {
                this.f8188m = new JSONObject();
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    public JSONObject m6708b() {
        return this.f8186k;
    }

    /* renamed from: c */
    public JSONObject m6713c() {
        return this.f8188m;
    }

    /* renamed from: d */
    public JSONObject m6716d() {
        return this.f8187l;
    }

    /* renamed from: e */
    public void m6721e() {
        this.f8187l = null;
    }

    /* renamed from: f */
    public String m6722f() {
        if (UMUtils.isMainProgress(f8167a)) {
            return f8172q;
        }
        MLog.m7570e("getOnResumedActivityName can not be called in child process");
        return null;
    }

    /* renamed from: g */
    public String m6725g() {
        if (UMUtils.isMainProgress(f8167a)) {
            return f8173r;
        }
        MLog.m7570e("getOnPausedActivityName can not be called in child process");
        return null;
    }

    /* renamed from: h */
    public void m6728h() {
        try {
            Context context = f8167a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m7570e("onStartSessionInternal can not be called in child process");
                    return;
                }
                if (UMConfigure.isDebugLog() && !UMConfigure.getInitStatus()) {
                    UMLog.mutlInfo(C1908i.f8740H, 3, "", null, null);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                Context context2 = f8167a;
                UMWorkDispatch.sendEvent(context2, 4352, CoreProtocol.getInstance(context2), Long.valueOf(jCurrentTimeMillis));
                Context context3 = f8167a;
                UMWorkDispatch.sendEvent(context3, C1913n.a.f8865g, CoreProtocol.getInstance(context3), Long.valueOf(jCurrentTimeMillis));
            }
            ISysListener iSysListener = this.f8179b;
            if (iSysListener != null) {
                iSysListener.onAppResume();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: j */
    void m6730j() {
        try {
            Context context = f8167a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.m7570e("onProfileSignOff can not be called in child process");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ts", jCurrentTimeMillis);
            Context context2 = f8167a;
            UMWorkDispatch.sendEvent(context2, C1913n.a.f8864f, CoreProtocol.getInstance(context2), jSONObject);
            Context context3 = f8167a;
            UMWorkDispatch.sendEvent(context3, C1913n.a.f8873o, CoreProtocol.getInstance(context3), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m7572e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    /* renamed from: k */
    public synchronized void m6731k() {
        Context context;
        try {
            context = f8167a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m7570e("unregisterSuperPropertyByCoreProtocol can not be called in child process");
            return;
        }
        if (this.f8186k != null) {
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(f8167a).edit();
            editorEdit.putString(f8168h, this.f8186k.toString());
            editorEdit.commit();
        } else {
            this.f8186k = new JSONObject();
        }
    }

    /* renamed from: l */
    public synchronized JSONObject m6732l() {
        Context context;
        try {
            context = f8167a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return null;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m7570e("getSuperPropertiesJSONObject can not be called in child process");
            return null;
        }
        if (this.f8186k == null) {
            this.f8186k = new JSONObject();
        }
        return this.f8186k;
    }

    /* renamed from: m */
    public synchronized void m6733m() {
        try {
            Context context = f8167a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m7570e("clearSuperPropertiesByCoreProtocol can not be called in child process");
                } else {
                    SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(f8167a).edit();
                    editorEdit.remove(f8168h);
                    editorEdit.commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC1912m
    /* renamed from: n */
    public void mo6734n() {
        UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> onIntoBackground triggered.");
        if (AnalyticsConfig.enable && FieldManager.m7330b()) {
            if (!FieldManager.allow(C2026b.f9561D)) {
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> 退出发送策略: 云控控制字关闭。功能不生效");
            } else {
                if (UMWorkDispatch.eventHasExist(C1913n.a.f8884z)) {
                    return;
                }
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> 退出时发送策略 被触发！");
                Context context = f8167a;
                UMWorkDispatch.sendEvent(context, C1913n.a.f8884z, CoreProtocol.getInstance(context), null);
            }
        }
    }

    private C1836b() {
        this.f8180c = new C1914o();
        this.f8181d = new C1920u();
        this.f8182e = new C1909j();
        this.f8183f = C1919t.m7237a();
        this.f8184g = null;
        this.f8185j = false;
        this.f8186k = null;
        this.f8187l = null;
        this.f8188m = null;
        this.f8189n = false;
        this.f8190u = null;
        this.f8191x = null;
        this.f8192y = null;
        this.f8180c.m7209a(this);
    }

    /* renamed from: a */
    public void m6688a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f8167a == null) {
                f8167a = context.getApplicationContext();
            }
            if (this.f8190u == null) {
                C1838a c1838a = new C1838a("ekv_bl", "ekv_bl_ver");
                this.f8190u = c1838a;
                c1838a.register(f8167a);
            }
            if (this.f8191x == null) {
                C1839b c1839b = new C1839b("ekv_wl", "ekv_wl_ver");
                this.f8191x = c1839b;
                c1839b.register(f8167a);
            }
            if (UMUtils.isMainProgress(f8167a)) {
                if (!this.f8185j) {
                    this.f8185j = true;
                    m6685i(f8167a);
                }
                synchronized (this) {
                    if (!this.f8189n) {
                        C1910k c1910kM7118a = C1910k.m7118a(context);
                        this.f8184g = c1910kM7118a;
                        if (c1910kM7118a.m7135a()) {
                            this.f8189n = true;
                        }
                        this.f8192y = C1911l.m7140a();
                        try {
                            C1911l.m7141a(context);
                            this.f8192y.m7146a(this);
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (UMConfigure.isDebugLog()) {
                    UMLog.mutlInfo(C1908i.f8734B, 3, "", null, null);
                }
                UMWorkDispatch.registerConnStateObserver(CoreProtocol.getInstance(f8167a));
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    void m6712b(String str) {
        if (!UMUtils.isMainProgress(f8167a)) {
            MLog.m7570e("onPageEnd can not be called in child process");
            return;
        }
        try {
            if (C1910k.f8804b != MobclickAgent.PageMode.LEGACY_AUTO) {
                this.f8181d.m7260b(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    void m6714c(Context context) {
        if (context == null) {
            UMLog.m7349aq(C1908i.f8792p, 0, "\\|");
            return;
        }
        if (C1910k.f8804b == MobclickAgent.PageMode.AUTO) {
            return;
        }
        if (f8167a == null) {
            f8167a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f8167a)) {
            MLog.m7570e("onPause can not be called in child process");
            return;
        }
        if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
            UMLog.m7349aq(C1908i.f8793q, 2, "\\|");
        }
        try {
            if (!this.f8185j || !this.f8189n) {
                m6688a(context);
            }
            if (C1910k.f8804b != MobclickAgent.PageMode.LEGACY_MANUAL) {
                this.f8182e.m7260b(context.getClass().getName());
            }
            m6729i();
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m7572e("Exception occurred in Mobclick.onRause(). ", th);
            }
        }
        if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
            f8173r = context.getClass().getName();
        }
    }

    /* renamed from: d */
    void m6717d(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f8167a == null) {
                f8167a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f8167a)) {
                MLog.m7570e("onKillProcess can not be called in child process");
                return;
            }
            C1910k c1910k = this.f8184g;
            if (c1910k != null) {
                c1910k.m7138c();
            }
            C1910k.m7120a(context, "onKillProcess");
            C1909j c1909j = this.f8182e;
            if (c1909j != null) {
                c1909j.m7259b();
            }
            C1920u c1920u = this.f8181d;
            if (c1920u != null) {
                c1920u.m7259b();
            }
            Context context2 = f8167a;
            if (context2 != null) {
                C1919t c1919t = this.f8183f;
                if (c1919t != null) {
                    c1919t.m7255c(context2, Long.valueOf(System.currentTimeMillis()));
                }
                C1913n.m7148a(f8167a).m7193d();
                C1920u.m7257a(f8167a);
                if (C1910k.f8804b == MobclickAgent.PageMode.AUTO) {
                    C1910k.m7128c(f8167a);
                }
                PreferenceWrapper.getDefault(f8167a).edit().commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public synchronized Object m6719e(Context context, String str) {
        if (context == null) {
            UMLog.m7349aq(C1908i.f8768ai, 0, "\\|");
            return null;
        }
        if (f8167a == null) {
            f8167a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f8167a)) {
            MLog.m7570e("getSuperProperty can not be called in child process");
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            UMLog.m7349aq(C1908i.f8766ag, 0, "\\|");
            return null;
        }
        if (!str.equals(f8178z) && !str.equals(f8163A) && !str.equals(f8164B) && !str.equals(f8165C) && !str.equals(f8166D)) {
            MLog.m7570e("please check key or value, must be correct!");
            return null;
        }
        if (this.f8186k == null) {
            this.f8186k = new JSONObject();
        } else if (this.f8186k.has(str)) {
            return this.f8186k.opt(str);
        }
        return null;
    }

    /* renamed from: f */
    public synchronized void m6723f(Context context) {
        if (context == null) {
            UMLog.m7349aq(C1908i.f8767ah, 0, "\\|");
            return;
        }
        if (f8167a == null) {
            f8167a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f8167a)) {
            MLog.m7570e("clearSuperProperties can not be called in child process");
            return;
        }
        if (!this.f8185j || !this.f8189n) {
            m6688a(f8167a);
        }
        this.f8186k = new JSONObject();
        Context context2 = f8167a;
        UMWorkDispatch.sendEvent(context2, C1913n.a.f8877s, CoreProtocol.getInstance(context2), null);
    }

    /* renamed from: g */
    public synchronized void m6726g(Context context) {
        if (context == null) {
            UMLog.m7349aq(C1908i.f8775ap, 0, "\\|");
            return;
        }
        if (f8167a == null) {
            f8167a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f8167a)) {
            MLog.m7570e("clearPreProperties can not be called in child process");
            return;
        }
        if (!this.f8185j || !this.f8189n) {
            m6688a(f8167a);
        }
        if (this.f8188m.length() > 0) {
            Context context2 = f8167a;
            UMWorkDispatch.sendEvent(context2, C1913n.a.f8881w, CoreProtocol.getInstance(context2), null);
        }
        this.f8188m = new JSONObject();
    }

    /* renamed from: b */
    void m6709b(Context context) {
        if (context == null) {
            MLog.m7570e("unexpected null context in onResume");
            return;
        }
        if (C1910k.f8804b == MobclickAgent.PageMode.AUTO) {
            return;
        }
        if (f8167a == null) {
            f8167a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f8167a)) {
            MLog.m7570e("onResume can not be called in child process");
            return;
        }
        if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
            UMLog.m7349aq(C1908i.f8791o, 2, "\\|");
        }
        try {
            if (!this.f8185j || !this.f8189n) {
                m6688a(context);
            }
            if (C1910k.f8804b != MobclickAgent.PageMode.LEGACY_MANUAL) {
                this.f8182e.m7258a(context.getClass().getName());
            }
            m6728h();
            if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
                f8172q = context.getClass().getName();
            }
        } catch (Throwable th) {
            MLog.m7572e("Exception occurred in Mobclick.onResume(). ", th);
        }
    }

    /* renamed from: i */
    public void m6729i() {
        try {
            Context context = f8167a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m7570e("onEndSessionInternal can not be called in child process");
                    return;
                }
                Context context2 = f8167a;
                UMWorkDispatch.sendEvent(context2, C1913n.a.f8866h, CoreProtocol.getInstance(context2), Long.valueOf(System.currentTimeMillis()));
                Context context3 = f8167a;
                UMWorkDispatch.sendEvent(context3, C1913n.a.f8862d, CoreProtocol.getInstance(context3), null);
                Context context4 = f8167a;
                UMWorkDispatch.sendEvent(context4, C1913n.a.f8861c, CoreProtocol.getInstance(context4), null);
                Context context5 = f8167a;
                UMWorkDispatch.sendEvent(context5, C1913n.a.f8867i, CoreProtocol.getInstance(context5), null);
            }
        } catch (Throwable unused) {
        }
        ISysListener iSysListener = this.f8179b;
        if (iSysListener != null) {
            iSysListener.onAppPause();
        }
    }

    /* renamed from: h */
    public synchronized JSONObject m6727h(Context context) {
        if (context == null) {
            UMLog.m7349aq(C1908i.f8776aq, 0, "\\|");
            return null;
        }
        if (f8167a == null) {
            f8167a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f8167a)) {
            MLog.m7570e("getPreProperties can not be called in child process");
            return null;
        }
        if (!this.f8185j || !this.f8189n) {
            m6688a(f8167a);
        }
        if (this.f8188m == null) {
            this.f8188m = new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (this.f8188m.length() > 0) {
            try {
                jSONObject = new JSONObject(this.f8188m.toString());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: f */
    public synchronized void m6724f(Context context, String str) {
        if (context == null) {
            UMLog.m7349aq(C1908i.f8773an, 0, "\\|");
            return;
        }
        if (f8167a == null) {
            f8167a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f8167a)) {
            MLog.m7570e("unregisterPreProperty can not be called in child process");
            return;
        }
        if (!this.f8185j || !this.f8189n) {
            m6688a(f8167a);
        }
        if (this.f8188m == null) {
            this.f8188m = new JSONObject();
        }
        if (str != null && str.length() > 0) {
            if (this.f8188m.has(str)) {
                this.f8188m.remove(str);
                Context context2 = f8167a;
                UMWorkDispatch.sendEvent(context2, C1913n.a.f8880v, CoreProtocol.getInstance(context2), this.f8188m.toString());
            } else if (UMConfigure.isDebugLog()) {
                UMLog.m7349aq(C1908i.f8774ao, 0, "\\|");
            }
            return;
        }
        MLog.m7570e("please check propertics, property is null!");
    }

    /* renamed from: c */
    private boolean m6684c(String str) {
        if (this.f8190u.enabled() && this.f8190u.matchHit(str)) {
            return true;
        }
        if (!this.f8191x.enabled()) {
            return false;
        }
        if (!this.f8191x.matchHit(str)) {
            return true;
        }
        UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> white list match! id = " + str);
        return false;
    }

    /* renamed from: d */
    public synchronized void m6718d(Context context, String str) {
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (context == null) {
            UMLog.m7349aq(C1908i.f8767ah, 0, "\\|");
            return;
        }
        if (f8167a == null) {
            f8167a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f8167a)) {
            MLog.m7570e("unregisterSuperProperty can not be called in child process");
            return;
        }
        if (!this.f8185j || !this.f8189n) {
            m6688a(f8167a);
        }
        if (TextUtils.isEmpty(str)) {
            UMLog.m7349aq(C1908i.f8766ag, 0, "\\|");
            return;
        }
        if (!str.equals(f8178z) && !str.equals(f8163A) && !str.equals(f8164B) && !str.equals(f8165C) && !str.equals(f8166D)) {
            MLog.m7570e("please check key or value, must be correct!");
            return;
        }
        if (this.f8186k == null) {
            this.f8186k = new JSONObject();
        }
        if (this.f8186k.has(str)) {
            this.f8186k.remove(str);
            Context context2 = f8167a;
            UMWorkDispatch.sendEvent(context2, C1913n.a.f8878t, CoreProtocol.getInstance(context2), str);
        }
    }

    /* renamed from: b */
    public void m6710b(Context context, String str) {
        try {
            if (context == null) {
                UMLog.m7349aq(C1908i.f8746N, 0, "\\|");
                return;
            }
            if (f8167a == null) {
                f8167a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f8167a)) {
                MLog.m7570e("onDeepLinkReceived can not be called in child process");
                return;
            }
            if (!this.f8185j || !this.f8189n) {
                m6688a(f8167a);
            }
            if (!TextUtils.isEmpty(str)) {
                HashMap map = new HashMap();
                map.put(C1896c.f8571aE, str);
                m6681a(f8167a, C1896c.f8570aD, (Map<String, Object>) map, -1L, false);
                return;
            }
            UMLog.m7349aq(C1908i.f8747O, 0, "\\|");
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m7574e(th);
            }
        }
    }

    /* renamed from: e */
    public synchronized String m6720e(Context context) {
        if (context == null) {
            UMLog.m7349aq(C1908i.f8768ai, 0, "\\|");
            return null;
        }
        if (f8167a == null) {
            f8167a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f8167a)) {
            MLog.m7570e("getSuperProperties can not be called in child process");
            return null;
        }
        if (this.f8186k != null) {
            return this.f8186k.toString();
        }
        this.f8186k = new JSONObject();
        return null;
    }

    /* renamed from: c */
    void m6715c(Context context, String str) {
        if (context == null) {
            UMLog.m7349aq(C1908i.f8802z, 0, "\\|");
            return;
        }
        if (f8167a == null) {
            f8167a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f8167a)) {
            MLog.m7570e("setSecret can not be called in child process");
            return;
        }
        if (!this.f8185j || !this.f8189n) {
            m6688a(f8167a);
        }
        AnalyticsConfig.m6677a(f8167a, str);
    }

    /* renamed from: a */
    void m6703a(String str) {
        if (!UMUtils.isMainProgress(f8167a)) {
            MLog.m7570e("onPageStart can not be called in child process");
            return;
        }
        try {
            if (C1910k.f8804b != MobclickAgent.PageMode.LEGACY_AUTO) {
                this.f8181d.m7258a(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m6701a(ISysListener iSysListener) {
        if (!UMUtils.isMainProgress(f8167a)) {
            MLog.m7570e("setSysListener can not be called in child process");
        } else {
            this.f8179b = iSysListener;
        }
    }

    /* renamed from: a */
    public void m6689a(Context context, int i4) {
        if (context == null) {
            MLog.m7570e("unexpected null context in setVerticalType");
            return;
        }
        if (f8167a == null) {
            f8167a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f8167a)) {
            MLog.m7570e("setVerticalType can not be called in child process");
            return;
        }
        if (!this.f8185j || !this.f8189n) {
            m6688a(f8167a);
        }
        AnalyticsConfig.m6676a(f8167a, i4);
    }

    /* renamed from: b */
    public synchronized void m6711b(Object obj) {
        Context context;
        try {
            context = f8167a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m7570e("updateNativePrePropertiesByCoreProtocol can not be called in child process");
            return;
        }
        SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(f8167a).edit();
        if (obj != null) {
            String str = (String) obj;
            if (editorEdit != null && !TextUtils.isEmpty(str)) {
                editorEdit.putString(f8169i, str).commit();
            }
        } else if (editorEdit != null) {
            editorEdit.remove(f8169i).commit();
        }
    }

    /* renamed from: a */
    public void m6694a(Context context, String str, HashMap<String, Object> map) {
        if (context == null) {
            return;
        }
        try {
            if (f8167a == null) {
                f8167a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f8167a)) {
                MLog.m7570e("onGKVEvent can not be called in child process");
                return;
            }
            if (!this.f8185j || !this.f8189n) {
                m6688a(f8167a);
            }
            String string = "";
            if (this.f8186k == null) {
                this.f8186k = new JSONObject();
            } else {
                string = this.f8186k.toString();
            }
            C1917r.m7220a(f8167a).m7233a(str, map, string);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m7574e(th);
            }
        }
    }

    /* renamed from: b */
    private boolean m6683b(String str, Object obj) {
        int length;
        if (TextUtils.isEmpty(str)) {
            MLog.m7570e("key is " + str + ", please check key, illegal");
            return false;
        }
        try {
            length = str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            length = 0;
        }
        if (length > 128) {
            MLog.m7570e("key length is " + length + ", please check key, illegal");
            return false;
        }
        if (obj instanceof String) {
            if (((String) obj).getBytes("UTF-8").length <= 256) {
                return true;
            }
            MLog.m7570e("value length is " + ((String) obj).getBytes("UTF-8").length + ", please check value, illegal");
            return false;
        }
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float)) {
            return true;
        }
        MLog.m7570e("value is " + obj + ", please check value, type illegal");
        return false;
    }

    /* renamed from: a */
    void m6691a(Context context, String str) {
        if (context == null) {
            UMLog.m7349aq(C1908i.f8799w, 0, "\\|");
            return;
        }
        if (f8167a == null) {
            f8167a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f8167a)) {
            MLog.m7570e("reportError can not be called in child process");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            if (UMConfigure.isDebugLog()) {
                UMLog.m7349aq(C1908i.f8800x, 0, "\\|");
                return;
            }
            return;
        }
        try {
            if (!this.f8185j || !this.f8189n) {
                m6688a(f8167a);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ts", System.currentTimeMillis());
            jSONObject.put(C1896c.f8556Q, 2);
            jSONObject.put(C1896c.f8557R, str);
            jSONObject.put("__ii", this.f8183f.m7253c());
            Context context2 = f8167a;
            UMWorkDispatch.sendEvent(context2, C1913n.a.f8868j, CoreProtocol.getInstance(context2), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m7574e(th);
            }
        }
    }

    /* renamed from: a */
    void m6697a(Context context, Throwable th) {
        if (context != null && th != null) {
            if (f8167a == null) {
                f8167a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f8167a)) {
                MLog.m7570e("reportError can not be called in child process");
                return;
            }
            try {
                if (!this.f8185j || !this.f8189n) {
                    m6688a(f8167a);
                }
                m6691a(f8167a, DataHelper.convertExceptionToString(th));
                return;
            } catch (Exception e4) {
                if (MLog.DEBUG) {
                    MLog.m7574e(e4);
                    return;
                }
                return;
            }
        }
        UMLog.m7349aq(C1908i.f8801y, 0, "\\|");
    }

    /* renamed from: a */
    public void m6693a(Context context, String str, String str2, long j4, int i4) {
        if (context == null) {
            return;
        }
        try {
            if (f8167a == null) {
                f8167a = context.getApplicationContext();
            }
            if (!this.f8185j || !this.f8189n) {
                m6688a(f8167a);
            }
            if (m6684c(str)) {
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> filter ekv [" + str + "].");
                return;
            }
            String string = "";
            if (this.f8186k == null) {
                this.f8186k = new JSONObject();
            } else {
                string = this.f8186k.toString();
            }
            C1917r.m7220a(f8167a).m7231a(str, str2, j4, i4, string);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m7574e(th);
            }
        }
    }

    /* renamed from: a */
    void m6696a(Context context, String str, Map<String, Object> map, long j4) {
        try {
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m7574e(th);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if (Arrays.asList(C1896c.f8572aF).contains(str)) {
                UMLog.m7349aq(C1908i.f8778b, 0, "\\|");
                return;
            }
            if (map.isEmpty()) {
                UMLog.m7349aq(C1908i.f8780d, 0, "\\|");
                return;
            }
            Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (Arrays.asList(C1896c.f8572aF).contains(it.next().getKey())) {
                    UMLog.m7349aq(C1908i.f8781e, 0, "\\|");
                    return;
                }
            }
            m6681a(context, str, map, j4, false);
            return;
        }
        UMLog.m7349aq(C1908i.f8779c, 0, "\\|");
    }

    /* renamed from: a */
    public void m6695a(Context context, String str, Map<String, Object> map) {
        m6681a(context, str, map, -1L, true);
    }

    /* renamed from: a */
    private void m6681a(Context context, String str, Map<String, Object> map, long j4, boolean z3) {
        try {
            if (context == null) {
                MLog.m7570e("context is null in onEventNoCheck, please check!");
                return;
            }
            if (f8167a == null) {
                f8167a = context.getApplicationContext();
            }
            if (!this.f8185j || !this.f8189n) {
                m6688a(f8167a);
            }
            if (m6684c(str)) {
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> filter ekv [" + str + "].");
                return;
            }
            String string = "";
            if (this.f8186k == null) {
                this.f8186k = new JSONObject();
            } else {
                string = this.f8186k.toString();
            }
            C1917r.m7220a(f8167a).m7232a(str, map, j4, string, z3);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m7574e(th);
            }
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC1918s
    /* renamed from: a */
    public void mo6705a(Throwable th) throws JSONException {
        try {
            Context context = f8167a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.m7570e("onAppCrash can not be called in child process");
                return;
            }
            if (AnalyticsConfig.enable) {
                C1920u c1920u = this.f8181d;
                if (c1920u != null) {
                    c1920u.m7259b();
                }
                C1910k.m7120a(f8167a, "onAppCrash");
                C1909j c1909j = this.f8182e;
                if (c1909j != null) {
                    c1909j.m7259b();
                }
                C1910k c1910k = this.f8184g;
                if (c1910k != null) {
                    c1910k.m7138c();
                }
                C1919t c1919t = this.f8183f;
                if (c1919t != null) {
                    c1919t.m7255c(f8167a, Long.valueOf(System.currentTimeMillis()));
                }
                if (th != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ts", System.currentTimeMillis());
                    jSONObject.put(C1896c.f8556Q, 1);
                    jSONObject.put(C1896c.f8557R, DataHelper.convertExceptionToString(th));
                    C1907h.m7081a(f8167a).m7099a(this.f8183f.m7253c(), jSONObject.toString(), 1);
                }
                C1913n.m7148a(f8167a).m7193d();
                C1920u.m7257a(f8167a);
                if (C1910k.f8804b == MobclickAgent.PageMode.AUTO) {
                    C1910k.m7128c(f8167a);
                }
                PreferenceWrapper.getDefault(f8167a).edit().commit();
            }
        } catch (Exception e4) {
            if (MLog.DEBUG) {
                MLog.m7572e("Exception in onAppCrash", e4);
            }
        }
    }

    /* renamed from: a */
    void m6704a(String str, String str2) {
        try {
            Context context = f8167a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.m7570e("onProfileSignIn can not be called in child process");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C1896c.f8552M, str);
            jSONObject.put("uid", str2);
            jSONObject.put("ts", jCurrentTimeMillis);
            Context context2 = f8167a;
            UMWorkDispatch.sendEvent(context2, C1913n.a.f8863e, CoreProtocol.getInstance(context2), jSONObject);
            Context context3 = f8167a;
            UMWorkDispatch.sendEvent(context3, C1913n.a.f8873o, CoreProtocol.getInstance(context3), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m7572e(" Excepthon  in  onProfileSignIn", th);
            }
        }
    }

    /* renamed from: a */
    void m6707a(boolean z3) {
        Context context = f8167a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m7570e("setCatchUncaughtExceptions can not be called in child process");
        } else {
            if (AnalyticsConfig.CHANGE_CATCH_EXCEPTION_NOTALLOW) {
                return;
            }
            AnalyticsConfig.CATCH_EXCEPTION = z3;
        }
    }

    /* renamed from: a */
    void m6706a(GL10 gl10) {
        String[] gpu = UMUtils.getGPU(gl10);
        if (gpu.length == 2) {
            AnalyticsConfig.GPU_VENDER = gpu[0];
            AnalyticsConfig.GPU_RENDERER = gpu[1];
        }
    }

    /* renamed from: a */
    void m6700a(MobclickAgent.PageMode pageMode) {
        Context context = f8167a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m7570e("setPageCollectionMode can not be called in child process");
        } else {
            C1910k.f8804b = pageMode;
        }
    }

    /* renamed from: a */
    void m6686a(double d4, double d5) {
        Context context = f8167a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m7570e("setLocation can not be called in child process");
            return;
        }
        if (AnalyticsConfig.f8143a == null) {
            AnalyticsConfig.f8143a = new double[2];
        }
        double[] dArr = AnalyticsConfig.f8143a;
        dArr[0] = d4;
        dArr[1] = d5;
    }

    /* renamed from: a */
    void m6690a(Context context, MobclickAgent.EScenarioType eScenarioType) {
        if (context == null) {
            MLog.m7570e("unexpected null context in setScenarioType");
            return;
        }
        if (f8167a == null) {
            f8167a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f8167a)) {
            MLog.m7570e("setScenarioType can not be called in child process");
            return;
        }
        if (eScenarioType != null) {
            m6689a(f8167a, eScenarioType.toValue());
        }
        if (this.f8185j && this.f8189n) {
            return;
        }
        m6688a(f8167a);
    }

    /* renamed from: a */
    void m6687a(long j4) {
        Context context = f8167a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m7570e("setSessionContinueMillis can not be called in child process");
        } else {
            AnalyticsConfig.kContinueSessionMillis = j4;
            C1923x.m7267a().m7276a(AnalyticsConfig.kContinueSessionMillis);
        }
    }

    /* renamed from: a */
    public synchronized void m6692a(Context context, String str, Object obj) {
        int i4 = 0;
        if (context == null) {
            UMLog.m7349aq(C1908i.f8765af, 0, "\\|");
            return;
        }
        if (f8167a == null) {
            f8167a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f8167a)) {
            MLog.m7570e("registerSuperProperty can not be called in child process");
            return;
        }
        if (!this.f8185j || !this.f8189n) {
            m6688a(f8167a);
        }
        if (!TextUtils.isEmpty(str) && obj != null) {
            if (!str.equals(f8178z) && !str.equals(f8163A) && !str.equals(f8164B) && !str.equals(f8165C) && !str.equals(f8166D)) {
                MLog.m7570e("property name is " + str + ", please check key, must be correct!");
                return;
            }
            if ((obj instanceof String) && !HelperUtils.checkStrLen(obj.toString(), 256)) {
                MLog.m7570e("property value is " + obj + ", please check value, lawless!");
                return;
            }
            try {
                if (this.f8186k == null) {
                    this.f8186k = new JSONObject();
                }
                if (obj.getClass().isArray()) {
                    if (obj instanceof String[]) {
                        String[] strArr = (String[]) obj;
                        if (strArr.length > 10) {
                            MLog.m7570e("please check value, size is " + strArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray = new JSONArray();
                        while (i4 < strArr.length) {
                            if (strArr[i4] != null && HelperUtils.checkStrLen(strArr[i4], 256)) {
                                jSONArray.put(strArr[i4]);
                                i4++;
                            }
                            MLog.m7570e("please check value, length is " + strArr[i4].length() + ", overlength 256!");
                            return;
                        }
                        this.f8186k.put(str, jSONArray);
                    } else if (obj instanceof long[]) {
                        long[] jArr = (long[]) obj;
                        if (jArr.length > 10) {
                            MLog.m7570e("please check value, size is " + jArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray2 = new JSONArray();
                        while (i4 < jArr.length) {
                            jSONArray2.put(jArr[i4]);
                            i4++;
                        }
                        this.f8186k.put(str, jSONArray2);
                    } else if (obj instanceof int[]) {
                        int[] iArr = (int[]) obj;
                        if (iArr.length > 10) {
                            MLog.m7570e("please check value, size is " + iArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray3 = new JSONArray();
                        while (i4 < iArr.length) {
                            jSONArray3.put(iArr[i4]);
                            i4++;
                        }
                        this.f8186k.put(str, jSONArray3);
                    } else if (obj instanceof float[]) {
                        float[] fArr = (float[]) obj;
                        if (fArr.length > 10) {
                            MLog.m7570e("please check value, size is " + fArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray4 = new JSONArray();
                        while (i4 < fArr.length) {
                            jSONArray4.put(fArr[i4]);
                            i4++;
                        }
                        this.f8186k.put(str, jSONArray4);
                    } else if (obj instanceof double[]) {
                        double[] dArr = (double[]) obj;
                        if (dArr.length > 10) {
                            MLog.m7570e("please check value, size is " + dArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray5 = new JSONArray();
                        while (i4 < dArr.length) {
                            jSONArray5.put(dArr[i4]);
                            i4++;
                        }
                        this.f8186k.put(str, jSONArray5);
                    } else if (obj instanceof short[]) {
                        short[] sArr = (short[]) obj;
                        if (sArr.length > 10) {
                            MLog.m7570e("please check value, size is " + sArr.length + ", overstep 10!");
                            return;
                        }
                        JSONArray jSONArray6 = new JSONArray();
                        while (i4 < sArr.length) {
                            jSONArray6.put((int) sArr[i4]);
                            i4++;
                        }
                        this.f8186k.put(str, jSONArray6);
                    } else {
                        MLog.m7570e("please check value, illegal type!");
                        return;
                    }
                } else {
                    if (!(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Integer) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof Short)) {
                        MLog.m7570e("please check value, illegal type!");
                        return;
                    }
                    this.f8186k.put(str, obj);
                }
            } catch (Throwable unused) {
            }
            Context context2 = f8167a;
            UMWorkDispatch.sendEvent(context2, C1913n.a.f8876r, CoreProtocol.getInstance(context2), this.f8186k.toString());
            return;
        }
        UMLog.m7349aq(C1908i.f8766ag, 0, "\\|");
    }

    /* renamed from: a */
    private void m6682a(String str, Object obj) {
        try {
            if (this.f8186k == null) {
                this.f8186k = new JSONObject();
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
                        if (strArr[i4] != null && !HelperUtils.checkStrLen(strArr[i4], 256)) {
                            jSONArray.put(strArr[i4]);
                        }
                        i4++;
                    }
                    this.f8186k.put(str, jSONArray);
                    return;
                }
                if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    JSONArray jSONArray2 = new JSONArray();
                    while (i4 < jArr.length) {
                        jSONArray2.put(jArr[i4]);
                        i4++;
                    }
                    this.f8186k.put(str, jSONArray2);
                    return;
                }
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    JSONArray jSONArray3 = new JSONArray();
                    while (i4 < iArr.length) {
                        jSONArray3.put(iArr[i4]);
                        i4++;
                    }
                    this.f8186k.put(str, jSONArray3);
                    return;
                }
                if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    JSONArray jSONArray4 = new JSONArray();
                    while (i4 < fArr.length) {
                        jSONArray4.put(fArr[i4]);
                        i4++;
                    }
                    this.f8186k.put(str, jSONArray4);
                    return;
                }
                if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    JSONArray jSONArray5 = new JSONArray();
                    while (i4 < dArr.length) {
                        jSONArray5.put(dArr[i4]);
                        i4++;
                    }
                    this.f8186k.put(str, jSONArray5);
                    return;
                }
                if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    JSONArray jSONArray6 = new JSONArray();
                    while (i4 < sArr.length) {
                        jSONArray6.put((int) sArr[i4]);
                        i4++;
                    }
                    this.f8186k.put(str, jSONArray6);
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
                this.f8186k.put(str, jSONArray7);
                return;
            }
            if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                this.f8186k.put(str, obj);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public synchronized void m6702a(Object obj) {
        Context context;
        try {
            context = f8167a;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m7570e("registerSuperPropertyByCoreProtocol can not be called in child process");
            return;
        }
        if (obj != null) {
            String str = (String) obj;
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(f8167a).edit();
            if (editorEdit != null && !TextUtils.isEmpty(str)) {
                editorEdit.putString(f8168h, this.f8186k.toString()).commit();
            }
        }
    }

    /* renamed from: a */
    public synchronized void m6698a(Context context, List<String> list) {
        try {
        } catch (Throwable th) {
            MLog.m7574e(th);
        }
        if (context == null) {
            UMLog.m7349aq(C1908i.f8769aj, 0, "\\|");
            return;
        }
        if (f8167a == null) {
            f8167a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f8167a)) {
            MLog.m7570e("setFirstLaunchEvent can not be called in child process");
            return;
        }
        if (!this.f8185j || !this.f8189n) {
            m6688a(f8167a);
        }
        C1917r.m7220a(f8167a).m7234a(list);
    }

    /* renamed from: a */
    public synchronized void m6699a(Context context, JSONObject jSONObject) {
        String string;
        Object obj;
        if (context == null) {
            UMLog.m7349aq(C1908i.f8771al, 0, "\\|");
            return;
        }
        if (f8167a == null) {
            f8167a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f8167a)) {
            MLog.m7570e("registerPreProperties can not be called in child process");
            return;
        }
        if (!this.f8185j || !this.f8189n) {
            m6688a(f8167a);
        }
        if (this.f8188m == null) {
            this.f8188m = new JSONObject();
        }
        if (jSONObject != null && jSONObject.length() > 0) {
            JSONObject jSONObject2 = null;
            try {
                jSONObject2 = new JSONObject(this.f8188m.toString());
            } catch (Exception unused) {
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
                    if (m6683b(string, obj)) {
                        jSONObject2.put(string, obj);
                        if (jSONObject2.length() > 10) {
                            MLog.m7570e("please check propertics, size overlength!");
                            return;
                        }
                        continue;
                    } else {
                        return;
                    }
                }
            }
            this.f8188m = jSONObject2;
            if (this.f8188m.length() > 0) {
                Context context2 = f8167a;
                UMWorkDispatch.sendEvent(context2, C1913n.a.f8879u, CoreProtocol.getInstance(context2), this.f8188m.toString());
            }
            return;
        }
        UMLog.m7349aq(C1908i.f8772am, 0, "\\|");
    }
}
