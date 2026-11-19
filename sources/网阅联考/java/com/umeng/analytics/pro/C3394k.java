package com.umeng.analytics.pro;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.umeng.analytics.C3320b;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.C3387d;
import com.umeng.analytics.pro.C3391h;
import com.umeng.analytics.vshelper.InterfaceC3420a;
import com.umeng.analytics.vshelper.PageNameMonitor;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.C3510b;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.k */
/* loaded from: classes2.dex */
public class C3394k {

    /* renamed from: a */
    public static String f2211a;

    /* renamed from: c */
    boolean f2220c;

    /* renamed from: d */
    boolean f2221d;

    /* renamed from: g */
    InterfaceC3420a f2222g;

    /* renamed from: h */
    Application.ActivityLifecycleCallbacks f2223h;

    /* renamed from: i */
    private final Map<String, Long> f2224i;

    /* renamed from: m */
    private boolean f2225m;

    /* renamed from: n */
    private int f2226n;

    /* renamed from: o */
    private int f2227o;

    /* renamed from: j */
    private static JSONArray f2215j = new JSONArray();

    /* renamed from: k */
    private static Object f2216k = new Object();

    /* renamed from: l */
    private static Application f2217l = null;

    /* renamed from: b */
    public static MobclickAgent.PageMode f2212b = MobclickAgent.PageMode.AUTO;

    /* renamed from: e */
    static String f2213e = null;

    /* renamed from: f */
    static int f2214f = -1;

    /* renamed from: p */
    private static boolean f2218p = true;

    /* renamed from: q */
    private static Object f2219q = new Object();

    /* renamed from: com.umeng.analytics.pro.k$a */
    public static class a {

        /* renamed from: a */
        private static final C3394k f2229a = new C3394k();

        private a() {
        }
    }

    /* renamed from: a */
    public static /* synthetic */ int m3194a(C3394k c3394k) {
        int i4 = c3394k.f2227o;
        c3394k.f2227o = i4 - 1;
        return i4;
    }

    /* renamed from: b */
    public static /* synthetic */ int m3200b(C3394k c3394k) {
        int i4 = c3394k.f2226n;
        c3394k.f2226n = i4 - 1;
        return i4;
    }

    /* renamed from: e */
    public static /* synthetic */ int m3208e(C3394k c3394k) {
        int i4 = c3394k.f2227o;
        c3394k.f2227o = i4 + 1;
        return i4;
    }

    /* renamed from: f */
    public static /* synthetic */ int m3210f(C3394k c3394k) {
        int i4 = c3394k.f2226n;
        c3394k.f2226n = i4 + 1;
        return i4;
    }

    private C3394k() {
        this.f2224i = new HashMap();
        this.f2225m = false;
        this.f2220c = false;
        this.f2221d = false;
        this.f2226n = 0;
        this.f2227o = 0;
        this.f2222g = PageNameMonitor.getInstance();
        this.f2223h = new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.analytics.pro.k.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                if (FieldManager.allow(C3510b.f2971F)) {
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> onActivityPaused: FirstResumeTrigger enabled.");
                    synchronized (C3394k.f2219q) {
                        if (C3394k.f2218p) {
                            return;
                        }
                    }
                } else {
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> onActivityPaused: FirstResumeTrigger disabled.");
                }
                if (C3394k.f2212b != MobclickAgent.PageMode.AUTO) {
                    return;
                }
                C3394k.this.m3204c(activity);
                C3320b.m2757a().m2806i();
                C3394k.this.f2220c = false;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                if (!FieldManager.allow(C3510b.f2971F)) {
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> onActivityResumed: FirstResumeTrigger disabled.");
                    C3394k.this.m3196a(activity);
                    return;
                }
                UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> onActivityResumed: FirstResumeTrigger enabled.");
                synchronized (C3394k.f2219q) {
                    if (C3394k.f2218p) {
                        boolean unused = C3394k.f2218p = false;
                    }
                }
                C3394k.this.m3196a(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                if (activity != null) {
                    if (C3394k.this.f2226n <= 0) {
                        if (C3394k.f2213e == null) {
                            C3394k.f2213e = UUID.randomUUID().toString();
                        }
                        if (C3394k.f2214f == -1) {
                            C3394k.f2214f = activity.isTaskRoot() ? 1 : 0;
                        }
                        if (C3394k.f2214f == 0 && UMUtils.isMainProgress(activity)) {
                            HashMap map = new HashMap();
                            map.put("activityName", activity.toString());
                            map.put("pid", Integer.valueOf(Process.myPid()));
                            map.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            C3320b.m2757a().m2772a((Context) activity, "$$_onUMengEnterForegroundInitError", (Map<String, Object>) map);
                            C3394k.f2214f = -2;
                            if (UMConfigure.isDebugLog()) {
                                UMLog.mutlInfo(2, C3392i.f2185ar);
                            }
                        } else if (C3394k.f2214f == 1 || !UMUtils.isMainProgress(activity)) {
                            HashMap map2 = new HashMap();
                            map2.put("pairUUID", C3394k.f2213e);
                            map2.put("pid", Integer.valueOf(Process.myPid()));
                            map2.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            map2.put("activityName", activity.toString());
                            C3320b.m2757a().m2772a((Context) activity, "$$_onUMengEnterForeground", (Map<String, Object>) map2);
                        }
                    }
                    if (C3394k.this.f2227o < 0) {
                        C3394k.m3208e(C3394k.this);
                    } else {
                        C3394k.m3210f(C3394k.this);
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                String str = C3394k.f2211a;
                MobclickAgent.PageMode pageMode = MobclickAgent.PageMode.AUTO;
                if (activity != null) {
                    if (activity.isChangingConfigurations()) {
                        C3394k.m3194a(C3394k.this);
                        return;
                    }
                    C3394k.m3200b(C3394k.this);
                    if (C3394k.this.f2226n <= 0) {
                        if (C3394k.f2214f == 0 && UMUtils.isMainProgress(activity)) {
                            return;
                        }
                        int i4 = C3394k.f2214f;
                        if (i4 == 1 || (i4 == 0 && !UMUtils.isMainProgress(activity))) {
                            HashMap map = new HashMap();
                            map.put("pairUUID", C3394k.f2213e);
                            map.put("reason", "Normal");
                            map.put("pid", Integer.valueOf(Process.myPid()));
                            map.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            map.put("activityName", activity.toString());
                            C3320b.m2757a().m2772a((Context) activity, "$$_onUMengEnterBackground", (Map<String, Object>) map);
                            if (C3394k.f2213e != null) {
                                C3394k.f2213e = null;
                            }
                        }
                    }
                }
            }
        };
        synchronized (this) {
            if (f2217l != null) {
                m3211f();
            }
        }
    }

    /* renamed from: f */
    private void m3211f() {
        if (this.f2225m) {
            return;
        }
        this.f2225m = true;
        if (f2217l != null) {
            f2217l.registerActivityLifecycleCallbacks(this.f2223h);
        }
    }

    /* renamed from: c */
    public void m3215c() {
        m3204c((Activity) null);
        m3213b();
    }

    /* renamed from: b */
    public void m3214b(Context context) {
        synchronized (f2219q) {
            if (f2218p) {
                f2218p = false;
                Activity globleActivity = DeviceConfig.getGlobleActivity(context);
                if (globleActivity == null) {
                    UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: 无前台Activity，直接退出。");
                    return;
                }
                UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: 补救成功，前台Activity名：" + globleActivity.getLocalClassName());
                m3196a(globleActivity);
                return;
            }
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: firstResumeCall = false，直接返回。");
        }
    }

    /* renamed from: c */
    public static void m3205c(Context context) {
        String string;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f2216k) {
                    string = f2215j.toString();
                    f2215j = new JSONArray();
                }
                if (string.length() > 0) {
                    jSONObject.put(C3387d.d.a.f2091c, new JSONArray(string));
                    C3391h.m3158a(context).m3177a(C3403t.m3314a().m3330c(), jSONObject, C3391h.a.AUTOPAGE);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public boolean m3212a() {
        return this.f2225m;
    }

    /* renamed from: a */
    public static synchronized C3394k m3195a(Context context) {
        if (f2217l == null && context != null) {
            if (context instanceof Activity) {
                f2217l = ((Activity) context).getApplication();
            } else if (context instanceof Application) {
                f2217l = (Application) context;
            }
        }
        return a.f2229a;
    }

    /* renamed from: a */
    public static void m3197a(Context context, String str) {
        if (f2214f == 1 && UMUtils.isMainProgress(context)) {
            HashMap map = new HashMap();
            map.put("pairUUID", f2213e);
            map.put("reason", str);
            if (f2213e != null) {
                f2213e = null;
            }
            if (context != null) {
                map.put("pid", Integer.valueOf(Process.myPid()));
                map.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(context) ? 1 : 0));
                map.put("Context", context.toString());
                C3320b.m2757a().m2772a(context, "$$_onUMengEnterBackground", (Map<String, Object>) map);
            }
        }
    }

    /* renamed from: b */
    public void m3213b() {
        this.f2225m = false;
        if (f2217l != null) {
            f2217l.unregisterActivityLifecycleCallbacks(this.f2223h);
            f2217l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m3204c(Activity activity) {
        long jLongValue;
        long jCurrentTimeMillis;
        try {
            synchronized (this.f2224i) {
                if (f2211a == null && activity != null) {
                    f2211a = activity.getPackageName() + "." + activity.getLocalClassName();
                }
                if (TextUtils.isEmpty(f2211a) || !this.f2224i.containsKey(f2211a)) {
                    jLongValue = 0;
                    jCurrentTimeMillis = 0;
                } else {
                    jLongValue = this.f2224i.get(f2211a).longValue();
                    jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                    this.f2224i.remove(f2211a);
                }
            }
            synchronized (f2216k) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C3380c.f2029v, f2211a);
                    jSONObject.put("duration", jCurrentTimeMillis);
                    jSONObject.put(C3380c.f2031x, jLongValue);
                    jSONObject.put("type", 0);
                    f2215j.put(jSONObject);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    private void m3201b(Activity activity) {
        f2211a = activity.getPackageName() + "." + activity.getLocalClassName();
        synchronized (this.f2224i) {
            this.f2224i.put(f2211a, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m3196a(Activity activity) {
        if (f2212b == MobclickAgent.PageMode.AUTO && activity != null) {
            String str = activity.getPackageName() + "." + activity.getLocalClassName();
            this.f2222g.activityResume(str);
            if (this.f2220c) {
                this.f2220c = false;
                if (!TextUtils.isEmpty(f2211a)) {
                    if (f2211a.equals(str)) {
                        return;
                    }
                    m3201b(activity);
                    synchronized (f2219q) {
                        C3320b.m2757a().m2805h();
                    }
                    return;
                }
                f2211a = str;
                return;
            }
            m3201b(activity);
            synchronized (f2219q) {
                C3320b.m2757a().m2805h();
            }
        }
    }
}
