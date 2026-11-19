package com.umeng.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.fragment.app.FragmentTransaction;
import com.p071uc.crashsdk.export.LogType;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.C6769d;
import com.umeng.analytics.pro.C6770e;
import com.umeng.analytics.pro.C6771f;
import com.umeng.analytics.pro.C6773h;
import com.umeng.commonsdk.config.C6780a;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p092e2.AbstractC7839a;
import p092e2.C7840b;
import p103f2.C7913b;
import p103f2.C7914c;
import p114g2.C8018h0;
import p114g2.C8020i0;
import p114g2.C8024k0;
import p114g2.C8026l0;
import p114g2.C8032o0;
import p114g2.InterfaceC8022j0;
import p114g2.InterfaceC8034p0;
import p154k2.AbstractC8263a;
import p176m2.AbstractC8959h;
import p176m2.C8957f;
import p186n2.AbstractC9089c;
import p240s2.C9468a;
import p270v2.AbstractC9753a;
import p270v2.AbstractC9756d;
import p290x2.AbstractC9866a;
import p310z2.AbstractC9993d;

/* renamed from: com.umeng.analytics.a */
/* loaded from: classes4.dex */
public class C6752a implements InterfaceC8022j0, InterfaceC8034p0 {

    /* renamed from: n */
    public static Context f6554n;

    /* renamed from: a */
    public C8026l0 f6555a;

    /* renamed from: b */
    public C6771f f6556b;

    /* renamed from: c */
    public C8018h0 f6557c;

    /* renamed from: d */
    public C6770e f6558d;

    /* renamed from: e */
    public C6769d f6559e;

    /* renamed from: f */
    public boolean f6560f;

    /* renamed from: g */
    public volatile JSONObject f6561g;

    /* renamed from: h */
    public volatile JSONObject f6562h;

    /* renamed from: i */
    public volatile JSONObject f6563i;

    /* renamed from: j */
    public boolean f6564j;

    /* renamed from: k */
    public C7913b f6565k;

    /* renamed from: l */
    public C7914c f6566l;

    /* renamed from: m */
    public C8020i0 f6567m;

    /* renamed from: com.umeng.analytics.a$b */
    public static class b {

        /* renamed from: a */
        public static final C6752a f6568a = new C6752a();
    }

    static {
        Context contextM15646a = C9468a.m15646a();
        if (contextM15646a != null) {
            f6554n = contextM15646a.getApplicationContext();
        }
    }

    /* renamed from: b */
    public static C6752a m5999b() {
        return b.f6568a;
    }

    @Override // p114g2.InterfaceC8034p0
    /* renamed from: a */
    public void mo6000a(Throwable th) throws JSONException {
        try {
            Context context = f6554n;
            if (context == null) {
                return;
            }
            if (!AbstractC9993d.m17334s(context)) {
                AbstractC9756d.m16404c("onAppCrash can not be called in child process");
                return;
            }
            if (AbstractC7839a.f13172i) {
                C6771f c6771f = this.f6556b;
                if (c6771f != null) {
                    c6771f.m6177c();
                }
                C6769d.m6133d(f6554n, "onAppCrash");
                C8018h0 c8018h0 = this.f6557c;
                if (c8018h0 != null) {
                    c8018h0.m6177c();
                }
                C6769d c6769d = this.f6559e;
                if (c6769d != null) {
                    c6769d.m6150n();
                }
                C6770e c6770e = this.f6558d;
                if (c6770e != null) {
                    c6770e.m6170q(f6554n, Long.valueOf(System.currentTimeMillis()));
                }
                if (th != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ts", System.currentTimeMillis());
                    jSONObject.put("error_source", 1);
                    jSONObject.put("context", AbstractC9753a.m16338d(th));
                    C6773h.m6194b(f6554n).m6210k(this.f6558d.m6168o(), jSONObject.toString(), 1);
                }
                C8024k0.m12622a(f6554n).m12665x();
                C6771f.m6175b(f6554n);
                if (C6769d.f6661m == MobclickAgent.PageMode.AUTO) {
                    C6769d.m6139p(f6554n);
                }
                AbstractC9866a.m16841a(f6554n).edit().commit();
            }
        } catch (Exception e10) {
            if (AbstractC9756d.f17273a) {
                AbstractC9756d.m16406e("Exception in onAppCrash", e10);
            }
        }
    }

    /* renamed from: c */
    public void m6001c(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f6554n == null) {
                f6554n = context.getApplicationContext();
            }
            if (this.f6565k == null) {
                C7913b c7913b = new C7913b("ekv_bl", "ekv_bl_ver");
                this.f6565k = c7913b;
                c7913b.m12457j(f6554n);
            }
            if (this.f6566l == null) {
                C7914c c7914c = new C7914c("ekv_wl", "ekv_wl_ver");
                this.f6566l = c7914c;
                c7914c.m12457j(f6554n);
            }
            if (AbstractC9993d.m17334s(f6554n)) {
                if (!this.f6560f) {
                    this.f6560f = true;
                    m6014p(f6554n);
                }
                synchronized (this) {
                    try {
                        if (!this.f6564j) {
                            C6769d c6769dM6132b = C6769d.m6132b(context);
                            this.f6559e = c6769dM6132b;
                            if (c6769dM6132b.m6146f()) {
                                this.f6564j = true;
                            }
                            this.f6567m = C8020i0.m12601a();
                            try {
                                C8020i0.m12602b(context);
                                this.f6567m.m12607c(this);
                            } catch (Throwable unused) {
                            }
                        }
                    } finally {
                    }
                }
                if (AbstractC8263a.m13312e()) {
                    C8957f.m14287h("统计SDK常见问题索引贴 详见链接 http://developer.umeng.com/docs/66650/cate/66650", 3, "", null, null);
                }
                AbstractC9089c.m14593j(C7840b.m12281f(f6554n));
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: d */
    public void m6002d(Context context, String str, Map map) {
        m6003e(context, str, map, -1L, true);
    }

    /* renamed from: e */
    public final void m6003e(Context context, String str, Map map, long j9, boolean z9) {
        try {
            if (context == null) {
                AbstractC9756d.m16404c("context is null in onEventNoCheck, please check!");
                return;
            }
            if (f6554n == null) {
                f6554n = context.getApplicationContext();
            }
            if (!this.f6560f || !this.f6564j) {
                m6001c(f6554n);
            }
            if (m6009k(str)) {
                AbstractC8959h.m14293c("MobclickRT", "--->>> filter ekv [" + str + "].");
                return;
            }
            String string = "";
            if (this.f6561g == null) {
                this.f6561g = new JSONObject();
            } else {
                string = this.f6561g.toString();
            }
            C8032o0.m12705a(f6554n).m12707c(str, map, j9, string, z9);
        } catch (Throwable th) {
            if (AbstractC9756d.f17273a) {
                AbstractC9756d.m16408g(th);
            }
        }
    }

    /* renamed from: f */
    public void m6004f(MobclickAgent.PageMode pageMode) {
        Context context = f6554n;
        if (context == null) {
            return;
        }
        if (AbstractC9993d.m17334s(context)) {
            C6769d.f6661m = pageMode;
        } else {
            AbstractC9756d.m16404c("setPageCollectionMode can not be called in child process");
        }
    }

    /* renamed from: g */
    public synchronized void m6005g(Object obj) {
        Context context;
        try {
            context = f6554n;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return;
        }
        if (!AbstractC9993d.m17334s(context)) {
            AbstractC9756d.m16404c("registerSuperPropertyByCoreProtocol can not be called in child process");
            return;
        }
        if (obj != null) {
            String str = (String) obj;
            SharedPreferences.Editor editorEdit = AbstractC9866a.m16841a(f6554n).edit();
            if (editorEdit != null && !TextUtils.isEmpty(str)) {
                editorEdit.putString("sp_uapp", this.f6561g.toString()).commit();
            }
        }
    }

    /* renamed from: h */
    public JSONObject m6006h() {
        return this.f6561g;
    }

    /* renamed from: i */
    public synchronized void m6007i(Object obj) {
        Context context;
        try {
            context = f6554n;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return;
        }
        if (!AbstractC9993d.m17334s(context)) {
            AbstractC9756d.m16404c("updateNativePrePropertiesByCoreProtocol can not be called in child process");
            return;
        }
        SharedPreferences.Editor editorEdit = AbstractC9866a.m16841a(f6554n).edit();
        if (obj != null) {
            String str = (String) obj;
            if (editorEdit != null && !TextUtils.isEmpty(str)) {
                editorEdit.putString("prepp_uapp", str).commit();
            }
        } else if (editorEdit != null) {
            editorEdit.remove("prepp_uapp").commit();
        }
    }

    /* renamed from: j */
    public JSONObject m6008j() {
        return this.f6563i;
    }

    /* renamed from: k */
    public final boolean m6009k(String str) {
        if (this.f6565k.m12454g() && this.f6565k.m12460m(str)) {
            return true;
        }
        if (!this.f6566l.m12454g()) {
            return false;
        }
        if (!this.f6566l.m12461m(str)) {
            return true;
        }
        AbstractC8959h.m14293c("MobclickRT", "--->>> white list match! id = " + str);
        return false;
    }

    /* renamed from: l */
    public void m6010l(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f6554n == null) {
                f6554n = context.getApplicationContext();
            }
            if (!AbstractC9993d.m17334s(f6554n)) {
                AbstractC9756d.m16404c("onKillProcess can not be called in child process");
                return;
            }
            C6769d c6769d = this.f6559e;
            if (c6769d != null) {
                c6769d.m6150n();
            }
            C6769d.m6133d(context, "onKillProcess");
            C8018h0 c8018h0 = this.f6557c;
            if (c8018h0 != null) {
                c8018h0.m6177c();
            }
            C6771f c6771f = this.f6556b;
            if (c6771f != null) {
                c6771f.m6177c();
            }
            Context context2 = f6554n;
            if (context2 != null) {
                C6770e c6770e = this.f6558d;
                if (c6770e != null) {
                    c6770e.m6170q(context2, Long.valueOf(System.currentTimeMillis()));
                }
                C8024k0.m12622a(f6554n).m12665x();
                C6771f.m6175b(f6554n);
                if (C6769d.f6661m == MobclickAgent.PageMode.AUTO) {
                    C6769d.m6139p(f6554n);
                }
                AbstractC9866a.m16841a(f6554n).edit().commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: m */
    public void m6011m() {
        try {
            Context context = f6554n;
            if (context != null) {
                if (!AbstractC9993d.m17334s(context)) {
                    AbstractC9756d.m16404c("onStartSessionInternal can not be called in child process");
                    return;
                }
                if (AbstractC8263a.m13312e() && !AbstractC8263a.m13310c()) {
                    C8957f.m14287h("检测到进入页面生命周期时尚未完成SDK初始化，请检查是否未在Application.onCreate函数中执行SDK初始化函数。", 3, "", null, null);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                Context context2 = f6554n;
                AbstractC9089c.m14596m(context2, LogType.UNEXP_KILL_PROCESS, C7840b.m12281f(context2), Long.valueOf(jCurrentTimeMillis));
                Context context3 = f6554n;
                AbstractC9089c.m14596m(context3, 4103, C7840b.m12281f(context3), Long.valueOf(jCurrentTimeMillis));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // p114g2.InterfaceC8022j0
    /* renamed from: n */
    public void mo6012n() {
        AbstractC8959h.m14293c("MobclickRT", "--->>> onIntoBackground triggered.");
        if (AbstractC7839a.f13172i && C6780a.m6261f()) {
            if (!C6780a.m6260e("header_ekv_send_on_exit")) {
                AbstractC8959h.m14293c("MobclickRT", "--->>> 退出发送策略: 云控控制字关闭。功能不生效");
            } else {
                if (AbstractC9089c.m14589f(8210)) {
                    return;
                }
                AbstractC8959h.m14293c("MobclickRT", "--->>> 退出时发送策略 被触发！");
                Context context = f6554n;
                AbstractC9089c.m14596m(context, 8210, C7840b.m12281f(context), null);
            }
        }
    }

    /* renamed from: o */
    public void m6013o() {
        try {
            Context context = f6554n;
            if (context != null) {
                if (!AbstractC9993d.m17334s(context)) {
                    AbstractC9756d.m16404c("onEndSessionInternal can not be called in child process");
                    return;
                }
                Context context2 = f6554n;
                AbstractC9089c.m14596m(context2, 4104, C7840b.m12281f(context2), Long.valueOf(System.currentTimeMillis()));
                Context context3 = f6554n;
                AbstractC9089c.m14596m(context3, FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN, C7840b.m12281f(context3), null);
                Context context4 = f6554n;
                AbstractC9089c.m14596m(context4, FragmentTransaction.TRANSIT_FRAGMENT_FADE, C7840b.m12281f(context4), null);
                Context context5 = f6554n;
                AbstractC9089c.m14596m(context5, 4105, C7840b.m12281f(context5), null);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: p */
    public final void m6014p(Context context) {
        try {
            if (context == null) {
                AbstractC9756d.m16404c("unexpected null context in getNativeSuperProperties");
                return;
            }
            if (f6554n == null) {
                f6554n = context.getApplicationContext();
            }
            SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(context);
            if (this.f6561g == null) {
                this.f6561g = new JSONObject();
            }
            if (this.f6562h == null) {
                this.f6562h = new JSONObject();
            }
            String string = sharedPreferencesM16841a.getString("prepp_uapp", null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.f6563i = new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            if (this.f6563i == null) {
                this.f6563i = new JSONObject();
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: q */
    public synchronized void m6015q() {
        Context context;
        try {
            context = f6554n;
        } catch (Throwable unused) {
        }
        if (context == null) {
            return;
        }
        if (!AbstractC9993d.m17334s(context)) {
            AbstractC9756d.m16404c("unregisterSuperPropertyByCoreProtocol can not be called in child process");
            return;
        }
        if (this.f6561g != null) {
            SharedPreferences.Editor editorEdit = AbstractC9866a.m16841a(f6554n).edit();
            editorEdit.putString("sp_uapp", this.f6561g.toString());
            editorEdit.commit();
        } else {
            this.f6561g = new JSONObject();
        }
    }

    /* renamed from: r */
    public synchronized void m6016r() {
        try {
            Context context = f6554n;
            if (context != null) {
                if (!AbstractC9993d.m17334s(context)) {
                    AbstractC9756d.m16404c("clearSuperPropertiesByCoreProtocol can not be called in child process");
                } else {
                    SharedPreferences.Editor editorEdit = AbstractC9866a.m16841a(f6554n).edit();
                    editorEdit.remove("sp_uapp");
                    editorEdit.commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public C6752a() {
        this.f6555a = new C8026l0();
        this.f6556b = new C6771f();
        this.f6557c = new C8018h0();
        this.f6558d = C6770e.m6155d();
        this.f6559e = null;
        this.f6560f = false;
        this.f6561g = null;
        this.f6562h = null;
        this.f6563i = null;
        this.f6564j = false;
        this.f6565k = null;
        this.f6566l = null;
        this.f6567m = null;
        this.f6555a.m12680a(this);
    }
}
