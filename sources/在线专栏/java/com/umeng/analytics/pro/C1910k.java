package com.umeng.analytics.pro;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.umeng.analytics.C1836b;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.C1903d;
import com.umeng.analytics.pro.C1907h;
import com.umeng.analytics.vshelper.InterfaceC1936a;
import com.umeng.analytics.vshelper.PageNameMonitor;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.C2026b;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.k */
/* loaded from: classes.dex */
public class C1910k {

    /* renamed from: a */
    public static String f8803a;

    /* renamed from: c */
    boolean f8812c;

    /* renamed from: d */
    boolean f8813d;

    /* renamed from: g */
    InterfaceC1936a f8814g;

    /* renamed from: h */
    Application.ActivityLifecycleCallbacks f8815h;

    /* renamed from: i */
    private final Map<String, Long> f8816i;

    /* renamed from: m */
    private boolean f8817m;

    /* renamed from: n */
    private int f8818n;

    /* renamed from: o */
    private int f8819o;

    /* renamed from: j */
    private static JSONArray f8807j = new JSONArray();

    /* renamed from: k */
    private static Object f8808k = new Object();

    /* renamed from: l */
    private static Application f8809l = null;

    /* renamed from: b */
    public static MobclickAgent.PageMode f8804b = MobclickAgent.PageMode.AUTO;

    /* renamed from: e */
    static String f8805e = null;

    /* renamed from: f */
    static int f8806f = -1;

    /* renamed from: p */
    private static boolean f8810p = true;

    /* renamed from: q */
    private static Object f8811q = new Object();

    /* renamed from: com.umeng.analytics.pro.k$a */
    private static class a {

        /* renamed from: a */
        private static final C1910k f8821a = new C1910k();

        private a() {
        }
    }

    /* renamed from: a */
    static /* synthetic */ int m7117a(C1910k c1910k) {
        int i4 = c1910k.f8819o;
        c1910k.f8819o = i4 - 1;
        return i4;
    }

    /* renamed from: b */
    static /* synthetic */ int m7123b(C1910k c1910k) {
        int i4 = c1910k.f8818n;
        c1910k.f8818n = i4 - 1;
        return i4;
    }

    /* renamed from: e */
    static /* synthetic */ int m7131e(C1910k c1910k) {
        int i4 = c1910k.f8819o;
        c1910k.f8819o = i4 + 1;
        return i4;
    }

    /* renamed from: f */
    static /* synthetic */ int m7133f(C1910k c1910k) {
        int i4 = c1910k.f8818n;
        c1910k.f8818n = i4 + 1;
        return i4;
    }

    private C1910k() {
        this.f8816i = new HashMap();
        this.f8817m = false;
        this.f8812c = false;
        this.f8813d = false;
        this.f8818n = 0;
        this.f8819o = 0;
        this.f8814g = PageNameMonitor.getInstance();
        this.f8815h = new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.analytics.pro.k.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                if (FieldManager.allow(C2026b.f9563F)) {
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> onActivityPaused: FirstResumeTrigger enabled.");
                    synchronized (C1910k.f8811q) {
                        if (C1910k.f8810p) {
                            return;
                        }
                    }
                } else {
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> onActivityPaused: FirstResumeTrigger disabled.");
                }
                if (C1910k.f8804b != MobclickAgent.PageMode.AUTO) {
                    return;
                }
                C1910k.this.m7127c(activity);
                C1836b.m6680a().m6729i();
                C1910k.this.f8812c = false;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                if (!FieldManager.allow(C2026b.f9563F)) {
                    UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> onActivityResumed: FirstResumeTrigger disabled.");
                    C1910k.this.m7119a(activity);
                    return;
                }
                UMRTLog.m7356i(UMRTLog.RTLOG_TAG, "--->>> onActivityResumed: FirstResumeTrigger enabled.");
                synchronized (C1910k.f8811q) {
                    if (C1910k.f8810p) {
                        boolean unused = C1910k.f8810p = false;
                    }
                }
                C1910k.this.m7119a(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                if (activity != null) {
                    if (C1910k.this.f8818n <= 0) {
                        if (C1910k.f8805e == null) {
                            C1910k.f8805e = UUID.randomUUID().toString();
                        }
                        if (C1910k.f8806f == -1) {
                            C1910k.f8806f = activity.isTaskRoot() ? 1 : 0;
                        }
                        if (C1910k.f8806f == 0 && UMUtils.isMainProgress(activity)) {
                            HashMap map = new HashMap();
                            map.put("activityName", activity.toString());
                            map.put("pid", Integer.valueOf(Process.myPid()));
                            map.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            C1836b.m6680a().m6695a((Context) activity, "$$_onUMengEnterForegroundInitError", (Map<String, Object>) map);
                            C1910k.f8806f = -2;
                            if (UMConfigure.isDebugLog()) {
                                UMLog.mutlInfo(2, C1908i.f8777ar);
                            }
                        } else if (C1910k.f8806f == 1 || !UMUtils.isMainProgress(activity)) {
                            HashMap map2 = new HashMap();
                            map2.put("pairUUID", C1910k.f8805e);
                            map2.put("pid", Integer.valueOf(Process.myPid()));
                            map2.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            map2.put("activityName", activity.toString());
                            C1836b.m6680a().m6695a((Context) activity, "$$_onUMengEnterForeground", (Map<String, Object>) map2);
                        }
                    }
                    if (C1910k.this.f8819o < 0) {
                        C1910k.m7131e(C1910k.this);
                    } else {
                        C1910k.m7133f(C1910k.this);
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                MobclickAgent.PageMode pageMode = C1910k.f8804b;
                MobclickAgent.PageMode pageMode2 = MobclickAgent.PageMode.AUTO;
                if (activity != null) {
                    if (activity.isChangingConfigurations()) {
                        C1910k.m7117a(C1910k.this);
                        return;
                    }
                    C1910k.m7123b(C1910k.this);
                    if (C1910k.this.f8818n <= 0) {
                        if (C1910k.f8806f == 0 && UMUtils.isMainProgress(activity)) {
                            return;
                        }
                        int i4 = C1910k.f8806f;
                        if (i4 == 1 || (i4 == 0 && !UMUtils.isMainProgress(activity))) {
                            HashMap map = new HashMap();
                            map.put("pairUUID", C1910k.f8805e);
                            map.put("reason", "Normal");
                            map.put("pid", Integer.valueOf(Process.myPid()));
                            map.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            map.put("activityName", activity.toString());
                            C1836b.m6680a().m6695a((Context) activity, "$$_onUMengEnterBackground", (Map<String, Object>) map);
                            if (C1910k.f8805e != null) {
                                C1910k.f8805e = null;
                            }
                        }
                    }
                }
            }
        };
        synchronized (this) {
            if (f8809l != null) {
                m7134f();
            }
        }
    }

    /* renamed from: f */
    private void m7134f() {
        if (this.f8817m) {
            return;
        }
        this.f8817m = true;
        if (f8809l != null) {
            f8809l.registerActivityLifecycleCallbacks(this.f8815h);
        }
    }

    /* renamed from: c */
    public void m7138c() {
        m7127c((Activity) null);
        m7136b();
    }

    /* renamed from: b */
    public void m7137b(Context context) {
        synchronized (f8811q) {
            if (f8810p) {
                f8810p = false;
                Activity globleActivity = DeviceConfig.getGlobleActivity(context);
                if (globleActivity == null) {
                    UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: 无前台Activity，直接退出。");
                    return;
                }
                UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: 补救成功，前台Activity名：" + globleActivity.getLocalClassName());
                m7119a(globleActivity);
                return;
            }
            UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: firstResumeCall = false，直接返回。");
        }
    }

    /* renamed from: c */
    public static void m7128c(Context context) {
        String string;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f8808k) {
                    string = f8807j.toString();
                    f8807j = new JSONArray();
                }
                if (string.length() > 0) {
                    jSONObject.put(C1903d.d.a.f8683c, new JSONArray(string));
                    C1907h.m7081a(context).m7100a(C1919t.m7237a().m7253c(), jSONObject, C1907h.a.AUTOPAGE);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public boolean m7135a() {
        return this.f8817m;
    }

    /* renamed from: a */
    public static synchronized C1910k m7118a(Context context) {
        if (f8809l == null && context != null) {
            if (context instanceof Activity) {
                f8809l = ((Activity) context).getApplication();
            } else if (context instanceof Application) {
                f8809l = (Application) context;
            }
        }
        return a.f8821a;
    }

    /* renamed from: a */
    public static void m7120a(Context context, String str) {
        if (f8806f == 1 && UMUtils.isMainProgress(context)) {
            HashMap map = new HashMap();
            map.put("pairUUID", f8805e);
            map.put("reason", str);
            if (f8805e != null) {
                f8805e = null;
            }
            if (context != null) {
                map.put("pid", Integer.valueOf(Process.myPid()));
                map.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(context) ? 1 : 0));
                map.put("Context", context.toString());
                C1836b.m6680a().m6695a(context, "$$_onUMengEnterBackground", (Map<String, Object>) map);
            }
        }
    }

    /* renamed from: b */
    public void m7136b() {
        this.f8817m = false;
        if (f8809l != null) {
            f8809l.unregisterActivityLifecycleCallbacks(this.f8815h);
            f8809l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m7127c(Activity activity) {
        long j4;
        long j5;
        try {
            synchronized (this.f8816i) {
                if (f8803a == null && activity != null) {
                    f8803a = activity.getPackageName() + "." + activity.getLocalClassName();
                }
                j4 = 0;
                if (TextUtils.isEmpty(f8803a) || !this.f8816i.containsKey(f8803a)) {
                    j5 = 0;
                } else {
                    long jLongValue = this.f8816i.get(f8803a).longValue();
                    long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                    this.f8816i.remove(f8803a);
                    j4 = jCurrentTimeMillis;
                    j5 = jLongValue;
                }
            }
            synchronized (f8808k) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C1896c.f8621v, f8803a);
                    jSONObject.put("duration", j4);
                    jSONObject.put(C1896c.f8623x, j5);
                    jSONObject.put("type", 0);
                    f8807j.put(jSONObject);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    private void m7124b(Activity activity) {
        f8803a = activity.getPackageName() + "." + activity.getLocalClassName();
        synchronized (this.f8816i) {
            this.f8816i.put(f8803a, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7119a(Activity activity) {
        if (f8804b == MobclickAgent.PageMode.AUTO && activity != null) {
            String str = activity.getPackageName() + "." + activity.getLocalClassName();
            this.f8814g.activityResume(str);
            if (this.f8812c) {
                this.f8812c = false;
                if (!TextUtils.isEmpty(f8803a)) {
                    if (f8803a.equals(str)) {
                        return;
                    }
                    m7124b(activity);
                    synchronized (f8811q) {
                        C1836b.m6680a().m6728h();
                    }
                    return;
                }
                f8803a = str;
                return;
            }
            m7124b(activity);
            synchronized (f8811q) {
                C1836b.m6680a().m6728h();
            }
        }
    }
}
