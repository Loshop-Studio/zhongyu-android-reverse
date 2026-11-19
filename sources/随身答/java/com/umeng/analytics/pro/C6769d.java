package com.umeng.analytics.pro;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.C6752a;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.C6773h;
import com.umeng.commonsdk.config.C6780a;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
import p134i2.C8130a;
import p134i2.InterfaceC8131b;
import p154k2.AbstractC8263a;
import p176m2.AbstractC8959h;
import p176m2.C8957f;
import p270v2.AbstractC9754b;
import p310z2.AbstractC9993d;

/* renamed from: com.umeng.analytics.pro.d */
/* loaded from: classes4.dex */
public class C6769d {

    /* renamed from: i */
    public static String f6657i;

    /* renamed from: j */
    public static JSONArray f6658j = new JSONArray();

    /* renamed from: k */
    public static Object f6659k = new Object();

    /* renamed from: l */
    public static Application f6660l = null;

    /* renamed from: m */
    public static MobclickAgent.PageMode f6661m = MobclickAgent.PageMode.AUTO;

    /* renamed from: n */
    public static String f6662n = null;

    /* renamed from: o */
    public static int f6663o = -1;

    /* renamed from: p */
    public static boolean f6664p = true;

    /* renamed from: q */
    public static Object f6665q = new Object();

    /* renamed from: a */
    public final Map f6666a;

    /* renamed from: b */
    public boolean f6667b;

    /* renamed from: c */
    public boolean f6668c;

    /* renamed from: d */
    public boolean f6669d;

    /* renamed from: e */
    public int f6670e;

    /* renamed from: f */
    public int f6671f;

    /* renamed from: g */
    public InterfaceC8131b f6672g;

    /* renamed from: h */
    public Application.ActivityLifecycleCallbacks f6673h;

    /* renamed from: com.umeng.analytics.pro.d$a */
    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (C6780a.m6260e("header_first_resume")) {
                AbstractC8959h.m14293c("MobclickRT", "--->>> onActivityPaused: FirstResumeTrigger enabled.");
                synchronized (C6769d.f6665q) {
                    try {
                        if (C6769d.f6664p) {
                            return;
                        }
                    } finally {
                    }
                }
            } else {
                AbstractC8959h.m14293c("MobclickRT", "--->>> onActivityPaused: FirstResumeTrigger disabled.");
            }
            if (C6769d.f6661m != MobclickAgent.PageMode.AUTO) {
                return;
            }
            C6769d.this.m6151o(activity);
            C6752a.m5999b().m6013o();
            C6769d.this.f6668c = false;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (!C6780a.m6260e("header_first_resume")) {
                AbstractC8959h.m14293c("MobclickRT", "--->>> onActivityResumed: FirstResumeTrigger disabled.");
                C6769d.this.m6145c(activity);
                return;
            }
            AbstractC8959h.m14293c("MobclickRT", "--->>> onActivityResumed: FirstResumeTrigger enabled.");
            synchronized (C6769d.f6665q) {
                try {
                    if (C6769d.f6664p) {
                        boolean unused = C6769d.f6664p = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C6769d.this.m6145c(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (activity != null) {
                if (C6769d.this.f6670e <= 0) {
                    if (C6769d.f6662n == null) {
                        C6769d.f6662n = UUID.randomUUID().toString();
                    }
                    if (C6769d.f6663o == -1) {
                        C6769d.f6663o = activity.isTaskRoot() ? 1 : 0;
                    }
                    if (C6769d.f6663o == 0 && AbstractC9993d.m17334s(activity)) {
                        HashMap map = new HashMap();
                        map.put("activityName", activity.toString());
                        map.put("pid", Integer.valueOf(Process.myPid()));
                        map.put("isMainProcess", Integer.valueOf(AbstractC9993d.m17334s(activity) ? 1 : 0));
                        C6752a.m5999b().m6002d(activity, "$$_onUMengEnterForegroundInitError", map);
                        C6769d.f6663o = -2;
                        if (AbstractC8263a.m13312e()) {
                            C8957f.m14285f(2, "请在Application.onCreate函数中使用UMConfigure.preInit函数初始化友盟sdk");
                        }
                    } else if (C6769d.f6663o == 1 || !AbstractC9993d.m17334s(activity)) {
                        HashMap map2 = new HashMap();
                        map2.put("pairUUID", C6769d.f6662n);
                        map2.put("pid", Integer.valueOf(Process.myPid()));
                        map2.put("isMainProcess", Integer.valueOf(AbstractC9993d.m17334s(activity) ? 1 : 0));
                        map2.put("activityName", activity.toString());
                        C6752a.m5999b().m6002d(activity, "$$_onUMengEnterForeground", map2);
                    }
                }
                if (C6769d.this.f6671f < 0) {
                    C6769d.m6142s(C6769d.this);
                } else {
                    C6769d.m6144u(C6769d.this);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            String str = C6769d.f6657i;
            MobclickAgent.PageMode pageMode = MobclickAgent.PageMode.AUTO;
            if (activity != null) {
                if (activity.isChangingConfigurations()) {
                    C6769d.m6131a(C6769d.this);
                    return;
                }
                C6769d.m6136h(C6769d.this);
                if (C6769d.this.f6670e <= 0) {
                    if (C6769d.f6663o == 0 && AbstractC9993d.m17334s(activity)) {
                        return;
                    }
                    int i9 = C6769d.f6663o;
                    if (i9 == 1 || (i9 == 0 && !AbstractC9993d.m17334s(activity))) {
                        HashMap map = new HashMap();
                        map.put("pairUUID", C6769d.f6662n);
                        map.put("reason", "Normal");
                        map.put("pid", Integer.valueOf(Process.myPid()));
                        map.put("isMainProcess", Integer.valueOf(AbstractC9993d.m17334s(activity) ? 1 : 0));
                        map.put("activityName", activity.toString());
                        C6752a.m5999b().m6002d(activity, "$$_onUMengEnterBackground", map);
                        if (C6769d.f6662n != null) {
                            C6769d.f6662n = null;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.umeng.analytics.pro.d$b */
    public static class b {

        /* renamed from: a */
        public static final C6769d f6675a = new C6769d(null);
    }

    public /* synthetic */ C6769d(a aVar) {
        this();
    }

    /* renamed from: a */
    public static /* synthetic */ int m6131a(C6769d c6769d) {
        int i9 = c6769d.f6671f;
        c6769d.f6671f = i9 - 1;
        return i9;
    }

    /* renamed from: b */
    public static synchronized C6769d m6132b(Context context) {
        try {
            if (f6660l == null && context != null) {
                if (context instanceof Activity) {
                    f6660l = ((Activity) context).getApplication();
                } else if (context instanceof Application) {
                    f6660l = (Application) context;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return b.f6675a;
    }

    /* renamed from: d */
    public static void m6133d(Context context, String str) {
        if (f6663o == 1 && AbstractC9993d.m17334s(context)) {
            HashMap map = new HashMap();
            map.put("pairUUID", f6662n);
            map.put("reason", str);
            if (f6662n != null) {
                f6662n = null;
            }
            if (context != null) {
                map.put("pid", Integer.valueOf(Process.myPid()));
                map.put("isMainProcess", Integer.valueOf(AbstractC9993d.m17334s(context) ? 1 : 0));
                map.put("Context", context.toString());
                C6752a.m5999b().m6002d(context, "$$_onUMengEnterBackground", map);
            }
        }
    }

    /* renamed from: h */
    public static /* synthetic */ int m6136h(C6769d c6769d) {
        int i9 = c6769d.f6670e;
        c6769d.f6670e = i9 - 1;
        return i9;
    }

    /* renamed from: p */
    public static void m6139p(Context context) {
        String string;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f6659k) {
                    string = f6658j.toString();
                    f6658j = new JSONArray();
                }
                if (string.length() > 0) {
                    jSONObject.put("__b", new JSONArray(string));
                    C6773h.m6194b(context).m6211l(C6770e.m6155d().m6168o(), jSONObject, C6773h.a.AUTOPAGE);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: s */
    public static /* synthetic */ int m6142s(C6769d c6769d) {
        int i9 = c6769d.f6671f;
        c6769d.f6671f = i9 + 1;
        return i9;
    }

    /* renamed from: u */
    public static /* synthetic */ int m6144u(C6769d c6769d) {
        int i9 = c6769d.f6670e;
        c6769d.f6670e = i9 + 1;
        return i9;
    }

    /* renamed from: c */
    public final void m6145c(Activity activity) {
        if (f6661m == MobclickAgent.PageMode.AUTO && activity != null) {
            String str = activity.getPackageName() + "." + activity.getLocalClassName();
            this.f6672g.mo13026a(str);
            if (!this.f6668c) {
                m6148j(activity);
                synchronized (f6665q) {
                    C6752a.m5999b().m6011m();
                }
                return;
            }
            this.f6668c = false;
            if (TextUtils.isEmpty(f6657i)) {
                f6657i = str;
            } else {
                if (f6657i.equals(str)) {
                    return;
                }
                m6148j(activity);
                synchronized (f6665q) {
                    C6752a.m5999b().m6011m();
                }
            }
        }
    }

    /* renamed from: f */
    public boolean m6146f() {
        return this.f6667b;
    }

    /* renamed from: i */
    public void m6147i() {
        this.f6667b = false;
        if (f6660l != null) {
            f6660l.unregisterActivityLifecycleCallbacks(this.f6673h);
            f6660l = null;
        }
    }

    /* renamed from: j */
    public final void m6148j(Activity activity) {
        f6657i = activity.getPackageName() + "." + activity.getLocalClassName();
        synchronized (this.f6666a) {
            this.f6666a.put(f6657i, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: k */
    public void m6149k(Context context) {
        synchronized (f6665q) {
            if (!f6664p) {
                AbstractC8959h.m14292b("MobclickRT", "--->>> init触发onResume: firstResumeCall = false，直接返回。");
                return;
            }
            f6664p = false;
            Activity activityM16384s = AbstractC9754b.m16384s(context);
            if (activityM16384s == null) {
                AbstractC8959h.m14292b("MobclickRT", "--->>> init触发onResume: 无前台Activity，直接退出。");
                return;
            }
            AbstractC8959h.m14292b("MobclickRT", "--->>> init触发onResume: 补救成功，前台Activity名：" + activityM16384s.getLocalClassName());
            m6145c(activityM16384s);
        }
    }

    /* renamed from: n */
    public void m6150n() {
        m6151o(null);
        m6147i();
    }

    /* renamed from: o */
    public final void m6151o(Activity activity) {
        long jLongValue;
        long jCurrentTimeMillis;
        try {
            synchronized (this.f6666a) {
                try {
                    if (f6657i == null && activity != null) {
                        f6657i = activity.getPackageName() + "." + activity.getLocalClassName();
                    }
                    if (TextUtils.isEmpty(f6657i) || !this.f6666a.containsKey(f6657i)) {
                        jLongValue = 0;
                        jCurrentTimeMillis = 0;
                    } else {
                        jLongValue = ((Long) this.f6666a.get(f6657i)).longValue();
                        jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                        this.f6666a.remove(f6657i);
                    }
                } finally {
                }
            }
            synchronized (f6659k) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("page_name", f6657i);
                    jSONObject.put(TypedValues.TransitionType.S_DURATION, jCurrentTimeMillis);
                    jSONObject.put("page_start", jLongValue);
                    jSONObject.put("type", 0);
                    f6658j.put(jSONObject);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: v */
    public final void m6152v() {
        if (this.f6667b) {
            return;
        }
        this.f6667b = true;
        if (f6660l != null) {
            f6660l.registerActivityLifecycleCallbacks(this.f6673h);
        }
    }

    public C6769d() {
        this.f6666a = new HashMap();
        this.f6667b = false;
        this.f6668c = false;
        this.f6669d = false;
        this.f6670e = 0;
        this.f6671f = 0;
        this.f6672g = C8130a.m13025b();
        this.f6673h = new a();
        synchronized (this) {
            try {
                if (f6660l != null) {
                    m6152v();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
