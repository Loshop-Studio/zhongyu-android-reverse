package com.tencent.bugly.proguard;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.C5844r.a;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.s */
/* loaded from: classes3.dex */
public class C5845s {

    /* renamed from: a */
    public static boolean f4375a = false;

    /* renamed from: b */
    public static C5844r f4376b = null;

    /* renamed from: c */
    private static int f4377c = 10;

    /* renamed from: d */
    private static long f4378d = 300000;

    /* renamed from: e */
    private static long f4379e = 30000;

    /* renamed from: f */
    private static long f4380f = 0;

    /* renamed from: g */
    private static int f4381g = 0;

    /* renamed from: h */
    private static long f4382h = 0;

    /* renamed from: i */
    private static long f4383i = 0;

    /* renamed from: j */
    private static long f4384j = 0;

    /* renamed from: k */
    private static Application.ActivityLifecycleCallbacks f4385k = null;

    /* renamed from: l */
    private static Class<?> f4386l = null;

    /* renamed from: m */
    private static boolean f4387m = true;

    /* renamed from: com.tencent.bugly.proguard.s$a */
    public static class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            String name = activity.getClass().getName();
            if (C5845s.f4386l == null || C5845s.f4386l.getName().equals(name)) {
                C5791al.m3932c(">>> %s onCreated <<<", name);
                C5780aa c5780aaM3795b = C5780aa.m3795b();
                if (c5780aaM3795b != null) {
                    c5780aaM3795b.f3875L.add(C5845s.m4260a(name, "onCreated"));
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            String name = activity.getClass().getName();
            if (C5845s.f4386l == null || C5845s.f4386l.getName().equals(name)) {
                C5791al.m3932c(">>> %s onDestroyed <<<", name);
                C5780aa c5780aaM3795b = C5780aa.m3795b();
                if (c5780aaM3795b != null) {
                    c5780aaM3795b.f3875L.add(C5845s.m4260a(name, "onDestroyed"));
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            String name = activity.getClass().getName();
            if (C5845s.f4386l == null || C5845s.f4386l.getName().equals(name)) {
                C5791al.m3932c(">>> %s onPaused <<<", name);
                C5780aa c5780aaM3795b = C5780aa.m3795b();
                if (c5780aaM3795b == null) {
                    return;
                }
                c5780aaM3795b.f3875L.add(C5845s.m4260a(name, "onPaused"));
                long jCurrentTimeMillis = System.currentTimeMillis();
                c5780aaM3795b.f3864A = jCurrentTimeMillis;
                c5780aaM3795b.f3865B = jCurrentTimeMillis - c5780aaM3795b.f3938z;
                long unused = C5845s.f4382h = jCurrentTimeMillis;
                if (c5780aaM3795b.f3865B < 0) {
                    c5780aaM3795b.f3865B = 0L;
                }
                c5780aaM3795b.f3937y = "background";
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            String name = activity.getClass().getName();
            if (C5845s.f4386l == null || C5845s.f4386l.getName().equals(name)) {
                C5791al.m3932c(">>> %s onResumed <<<", name);
                C5780aa c5780aaM3795b = C5780aa.m3795b();
                if (c5780aaM3795b == null) {
                    return;
                }
                c5780aaM3795b.f3875L.add(C5845s.m4260a(name, "onResumed"));
                c5780aaM3795b.f3937y = name;
                long jCurrentTimeMillis = System.currentTimeMillis();
                c5780aaM3795b.f3938z = jCurrentTimeMillis;
                c5780aaM3795b.f3866C = jCurrentTimeMillis - C5845s.f4383i;
                long j6 = c5780aaM3795b.f3938z - C5845s.f4382h;
                if (j6 > (C5845s.f4380f > 0 ? C5845s.f4380f : C5845s.f4379e)) {
                    c5780aaM3795b.m3804c();
                    C5845s.m4275g();
                    C5791al.m3928a("[session] launch app one times (app in background %d seconds and over %d seconds)", Long.valueOf(j6 / 1000), Long.valueOf(C5845s.f4379e / 1000));
                    if (C5845s.f4381g % C5845s.f4377c == 0) {
                        C5845s.f4376b.m4257a(4, C5845s.f4387m);
                        return;
                    }
                    C5845s.f4376b.m4257a(4, false);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (jCurrentTimeMillis2 - C5845s.f4384j > C5845s.f4378d) {
                        long unused = C5845s.f4384j = jCurrentTimeMillis2;
                        C5791al.m3928a("add a timer to upload hot start user info", new Object[0]);
                        if (C5845s.f4387m) {
                            C5790ak.m3919a().m3922a(C5845s.f4376b.new a(null, true), C5845s.f4378d);
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
            C5791al.m3932c(">>> %s onStart <<<", activity.getClass().getName());
            C5780aa.m3795b().m3798a(activity.hashCode(), true);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C5791al.m3932c(">>> %s onStop <<<", activity.getClass().getName());
            C5780aa.m3795b().m3798a(activity.hashCode(), false);
        }
    }

    /* renamed from: a */
    public static void m4264a(final Context context, final BuglyStrategy buglyStrategy) {
        long appReportDelay;
        if (f4375a) {
            return;
        }
        f4387m = C5780aa.m3793a(context).f3918f;
        f4376b = new C5844r(context, f4387m);
        f4375a = true;
        if (buglyStrategy != null) {
            f4386l = buglyStrategy.getUserInfoActivity();
            appReportDelay = buglyStrategy.getAppReportDelay();
        } else {
            appReportDelay = 0;
        }
        if (appReportDelay <= 0) {
            m4271c(context, buglyStrategy);
        } else {
            C5790ak.m3919a().m3922a(new Runnable() { // from class: com.tencent.bugly.proguard.s.1
                @Override // java.lang.Runnable
                public final void run() {
                    C5845s.m4271c(context, buglyStrategy);
                }
            }, appReportDelay);
        }
    }

    /* renamed from: g */
    public static /* synthetic */ int m4275g() {
        int i6 = f4381g;
        f4381g = i6 + 1;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m4271c(Context context, BuglyStrategy buglyStrategy) {
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
            C5780aa c5780aaM3793a = C5780aa.m3793a(context);
            List<UserInfoBean> listM4242a = C5844r.m4242a(c5780aaM3793a.f3916d);
            if (listM4242a != null) {
                for (int i6 = 0; i6 < listM4242a.size(); i6++) {
                    UserInfoBean userInfoBean = listM4242a.get(i6);
                    if (userInfoBean.f3747n.equals(c5780aaM3793a.f3927o) && userInfoBean.f3735b == 1) {
                        long jM3983b = C5795ap.m3983b();
                        if (jM3983b <= 0) {
                            break;
                        }
                        if (userInfoBean.f3738e >= jM3983b) {
                            if (userInfoBean.f3739f <= 0) {
                                f4376b.m4259b();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            zIsEnableUserInfo = false;
        }
        C5780aa c5780aaM3795b = C5780aa.m3795b();
        if (c5780aaM3795b != null && C5852z.m4329a()) {
            c5780aaM3795b.m3798a(0, true);
        }
        if (zIsEnableUserInfo) {
            Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
            if (application != null) {
                try {
                    if (f4385k == null) {
                        f4385k = new a();
                    }
                    application.registerActivityLifecycleCallbacks(f4385k);
                } catch (Exception e6) {
                    if (!C5791al.m3929a(e6)) {
                        e6.printStackTrace();
                    }
                }
            }
        }
        if (f4387m) {
            f4383i = System.currentTimeMillis();
            f4376b.m4257a(1, false);
            C5791al.m3928a("[session] launch app, new start", new Object[0]);
            f4376b.m4256a();
            f4376b.m4258a(21600000L);
        }
    }

    /* renamed from: a */
    public static void m4262a(long j6) {
        if (j6 < 0) {
            j6 = C5782ac.m3857a().m3866c().f3771p;
        }
        f4380f = j6;
    }

    /* renamed from: a */
    public static void m4265a(StrategyBean strategyBean, boolean z6) {
        C5844r c5844r = f4376b;
        if (c5844r != null && !z6) {
            c5844r.m4259b();
        }
        if (strategyBean == null) {
            return;
        }
        long j6 = strategyBean.f3771p;
        if (j6 > 0) {
            f4379e = j6;
        }
        int i6 = strategyBean.f3776u;
        if (i6 > 0) {
            f4377c = i6;
        }
        long j7 = strategyBean.f3777v;
        if (j7 > 0) {
            f4378d = j7;
        }
    }

    /* renamed from: a */
    public static void m4261a() {
        C5844r c5844r = f4376b;
        if (c5844r != null) {
            c5844r.m4257a(2, false);
        }
    }

    /* renamed from: a */
    public static void m4263a(Context context) {
        if (!f4375a || context == null) {
            return;
        }
        Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
        if (application != null) {
            try {
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f4385k;
                if (activityLifecycleCallbacks != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            } catch (Exception e6) {
                if (!C5791al.m3929a(e6)) {
                    e6.printStackTrace();
                }
            }
        }
        f4375a = false;
    }

    /* renamed from: a */
    public static /* synthetic */ String m4260a(String str, String str2) {
        return C5795ap.m3963a() + "  " + str + "  " + str2 + SignParameters.NEW_LINE;
    }
}
