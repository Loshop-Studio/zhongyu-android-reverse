package com.tencent.bugly.proguard;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.C6727r.a;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.s */
/* loaded from: classes4.dex */
public class C6728s {

    /* renamed from: a */
    public static boolean f6231a = false;

    /* renamed from: b */
    public static C6727r f6232b = null;

    /* renamed from: c */
    private static int f6233c = 10;

    /* renamed from: d */
    private static long f6234d = 300000;

    /* renamed from: e */
    private static long f6235e = 30000;

    /* renamed from: f */
    private static long f6236f = 0;

    /* renamed from: g */
    private static int f6237g = 0;

    /* renamed from: h */
    private static long f6238h = 0;

    /* renamed from: i */
    private static long f6239i = 0;

    /* renamed from: j */
    private static long f6240j = 0;

    /* renamed from: k */
    private static Application.ActivityLifecycleCallbacks f6241k = null;

    /* renamed from: l */
    private static Class<?> f6242l = null;

    /* renamed from: m */
    private static boolean f6243m = true;

    /* renamed from: com.tencent.bugly.proguard.s$a */
    public static class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            String name = activity.getClass().getName();
            if (C6728s.f6242l == null || C6728s.f6242l.getName().equals(name)) {
                C6674al.m5106c(">>> %s onCreated <<<", name);
                C6663aa c6663aaM4969b = C6663aa.m4969b();
                if (c6663aaM4969b != null) {
                    c6663aaM4969b.f5731L.add(C6728s.m5434a(name, "onCreated"));
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            String name = activity.getClass().getName();
            if (C6728s.f6242l == null || C6728s.f6242l.getName().equals(name)) {
                C6674al.m5106c(">>> %s onDestroyed <<<", name);
                C6663aa c6663aaM4969b = C6663aa.m4969b();
                if (c6663aaM4969b != null) {
                    c6663aaM4969b.f5731L.add(C6728s.m5434a(name, "onDestroyed"));
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            String name = activity.getClass().getName();
            if (C6728s.f6242l == null || C6728s.f6242l.getName().equals(name)) {
                C6674al.m5106c(">>> %s onPaused <<<", name);
                C6663aa c6663aaM4969b = C6663aa.m4969b();
                if (c6663aaM4969b == null) {
                    return;
                }
                c6663aaM4969b.f5731L.add(C6728s.m5434a(name, "onPaused"));
                long jCurrentTimeMillis = System.currentTimeMillis();
                c6663aaM4969b.f5720A = jCurrentTimeMillis;
                c6663aaM4969b.f5721B = jCurrentTimeMillis - c6663aaM4969b.f5794z;
                long unused = C6728s.f6238h = jCurrentTimeMillis;
                if (c6663aaM4969b.f5721B < 0) {
                    c6663aaM4969b.f5721B = 0L;
                }
                c6663aaM4969b.f5793y = "background";
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            String name = activity.getClass().getName();
            if (C6728s.f6242l == null || C6728s.f6242l.getName().equals(name)) {
                C6674al.m5106c(">>> %s onResumed <<<", name);
                C6663aa c6663aaM4969b = C6663aa.m4969b();
                if (c6663aaM4969b == null) {
                    return;
                }
                c6663aaM4969b.f5731L.add(C6728s.m5434a(name, "onResumed"));
                c6663aaM4969b.f5793y = name;
                long jCurrentTimeMillis = System.currentTimeMillis();
                c6663aaM4969b.f5794z = jCurrentTimeMillis;
                c6663aaM4969b.f5722C = jCurrentTimeMillis - C6728s.f6239i;
                long j9 = c6663aaM4969b.f5794z - C6728s.f6238h;
                if (j9 > (C6728s.f6236f > 0 ? C6728s.f6236f : C6728s.f6235e)) {
                    c6663aaM4969b.m4978c();
                    C6728s.m5449g();
                    C6674al.m5102a("[session] launch app one times (app in background %d seconds and over %d seconds)", Long.valueOf(j9 / 1000), Long.valueOf(C6728s.f6235e / 1000));
                    if (C6728s.f6237g % C6728s.f6233c == 0) {
                        C6728s.f6232b.m5431a(4, C6728s.f6243m);
                        return;
                    }
                    C6728s.f6232b.m5431a(4, false);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (jCurrentTimeMillis2 - C6728s.f6240j > C6728s.f6234d) {
                        long unused = C6728s.f6240j = jCurrentTimeMillis2;
                        C6674al.m5102a("add a timer to upload hot start user info", new Object[0]);
                        if (C6728s.f6243m) {
                            C6673ak.m5093a().m5096a(C6728s.f6232b.new a(null, true), C6728s.f6234d);
                        }
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            C6674al.m5106c(">>> %s onStart <<<", activity.getClass().getName());
            C6663aa.m4969b().m4972a(activity.hashCode(), true);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C6674al.m5106c(">>> %s onStop <<<", activity.getClass().getName());
            C6663aa.m4969b().m4972a(activity.hashCode(), false);
        }
    }

    /* renamed from: a */
    public static void m5438a(final Context context, final BuglyStrategy buglyStrategy) {
        long appReportDelay;
        if (f6231a) {
            return;
        }
        f6243m = C6663aa.m4967a(context).f5774f;
        f6232b = new C6727r(context, f6243m);
        f6231a = true;
        if (buglyStrategy != null) {
            f6242l = buglyStrategy.getUserInfoActivity();
            appReportDelay = buglyStrategy.getAppReportDelay();
        } else {
            appReportDelay = 0;
        }
        if (appReportDelay <= 0) {
            m5445c(context, buglyStrategy);
        } else {
            C6673ak.m5093a().m5096a(new Runnable() { // from class: com.tencent.bugly.proguard.s.1
                @Override // java.lang.Runnable
                public final void run() {
                    C6728s.m5445c(context, buglyStrategy);
                }
            }, appReportDelay);
        }
    }

    /* renamed from: g */
    public static /* synthetic */ int m5449g() {
        int i9 = f6237g;
        f6237g = i9 + 1;
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m5445c(Context context, BuglyStrategy buglyStrategy) {
        boolean zIsEnableUserInfo;
        boolean zRecordUserInfoOnceADay;
        if (buglyStrategy != null) {
            zRecordUserInfoOnceADay = buglyStrategy.recordUserInfoOnceADay();
            zIsEnableUserInfo = buglyStrategy.isEnableUserInfo();
        } else {
            zIsEnableUserInfo = true;
            zRecordUserInfoOnceADay = false;
        }
        if (zRecordUserInfoOnceADay) {
            C6663aa c6663aaM4967a = C6663aa.m4967a(context);
            List<UserInfoBean> listM5416a = C6727r.m5416a(c6663aaM4967a.f5772d);
            if (listM5416a != null) {
                for (int i9 = 0; i9 < listM5416a.size(); i9++) {
                    UserInfoBean userInfoBean = listM5416a.get(i9);
                    if (userInfoBean.f5603n.equals(c6663aaM4967a.f5783o) && userInfoBean.f5591b == 1) {
                        long jM5157b = C6678ap.m5157b();
                        if (jM5157b <= 0) {
                            break;
                        }
                        if (userInfoBean.f5594e >= jM5157b) {
                            if (userInfoBean.f5595f <= 0) {
                                f6232b.m5433b();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            zIsEnableUserInfo = false;
        }
        C6663aa c6663aaM4969b = C6663aa.m4969b();
        if (c6663aaM4969b != null && C6735z.m5503a()) {
            c6663aaM4969b.m4972a(0, true);
        }
        if (zIsEnableUserInfo) {
            Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
            if (application != null) {
                try {
                    if (f6241k == null) {
                        f6241k = new a();
                    }
                    application.registerActivityLifecycleCallbacks(f6241k);
                } catch (Exception e10) {
                    if (!C6674al.m5103a(e10)) {
                        e10.printStackTrace();
                    }
                }
            }
        }
        if (f6243m) {
            f6239i = System.currentTimeMillis();
            f6232b.m5431a(1, false);
            C6674al.m5102a("[session] launch app, new start", new Object[0]);
            f6232b.m5430a();
            f6232b.m5432a(21600000L);
        }
    }

    /* renamed from: a */
    public static void m5436a(long j9) {
        if (j9 < 0) {
            j9 = C6665ac.m5031a().m5040c().f5627p;
        }
        f6236f = j9;
    }

    /* renamed from: a */
    public static void m5439a(StrategyBean strategyBean, boolean z9) {
        C6727r c6727r = f6232b;
        if (c6727r != null && !z9) {
            c6727r.m5433b();
        }
        if (strategyBean == null) {
            return;
        }
        long j9 = strategyBean.f5627p;
        if (j9 > 0) {
            f6235e = j9;
        }
        int i9 = strategyBean.f5632u;
        if (i9 > 0) {
            f6233c = i9;
        }
        long j10 = strategyBean.f5633v;
        if (j10 > 0) {
            f6234d = j10;
        }
    }

    /* renamed from: a */
    public static void m5435a() {
        C6727r c6727r = f6232b;
        if (c6727r != null) {
            c6727r.m5431a(2, false);
        }
    }

    /* renamed from: a */
    public static void m5437a(Context context) {
        if (!f6231a || context == null) {
            return;
        }
        Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
        if (application != null) {
            try {
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f6241k;
                if (activityLifecycleCallbacks != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            } catch (Exception e10) {
                if (!C6674al.m5103a(e10)) {
                    e10.printStackTrace();
                }
            }
        }
        f6231a = false;
    }

    /* renamed from: a */
    public static /* synthetic */ String m5434a(String str, String str2) {
        return C6678ap.m5137a() + "  " + str + "  " + str2 + AbsSection.SEP_ORIGIN_LINE_BREAK;
    }
}
