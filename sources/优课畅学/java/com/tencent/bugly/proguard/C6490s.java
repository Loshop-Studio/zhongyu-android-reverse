package com.tencent.bugly.proguard;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.C6489r.a;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.s */
/* loaded from: classes4.dex */
public class C6490s {

    /* renamed from: a */
    public static boolean f4997a = false;

    /* renamed from: b */
    public static C6489r f4998b = null;

    /* renamed from: c */
    private static int f4999c = 10;

    /* renamed from: d */
    private static long f5000d = 300000;

    /* renamed from: e */
    private static long f5001e = 30000;

    /* renamed from: f */
    private static long f5002f = 0;

    /* renamed from: g */
    private static int f5003g = 0;

    /* renamed from: h */
    private static long f5004h = 0;

    /* renamed from: i */
    private static long f5005i = 0;

    /* renamed from: j */
    private static long f5006j = 0;

    /* renamed from: k */
    private static Application.ActivityLifecycleCallbacks f5007k = null;

    /* renamed from: l */
    private static Class<?> f5008l = null;

    /* renamed from: m */
    private static boolean f5009m = true;

    /* renamed from: com.tencent.bugly.proguard.s$a */
    public static class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            String name = activity.getClass().getName();
            if (C6490s.f5008l == null || C6490s.f5008l.getName().equals(name)) {
                C6436al.m4287c(">>> %s onCreated <<<", name);
                C6425aa c6425aaM4150b = C6425aa.m4150b();
                if (c6425aaM4150b != null) {
                    c6425aaM4150b.f4497L.add(C6490s.m4615a(name, "onCreated"));
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            String name = activity.getClass().getName();
            if (C6490s.f5008l == null || C6490s.f5008l.getName().equals(name)) {
                C6436al.m4287c(">>> %s onDestroyed <<<", name);
                C6425aa c6425aaM4150b = C6425aa.m4150b();
                if (c6425aaM4150b != null) {
                    c6425aaM4150b.f4497L.add(C6490s.m4615a(name, "onDestroyed"));
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            String name = activity.getClass().getName();
            if (C6490s.f5008l == null || C6490s.f5008l.getName().equals(name)) {
                C6436al.m4287c(">>> %s onPaused <<<", name);
                C6425aa c6425aaM4150b = C6425aa.m4150b();
                if (c6425aaM4150b == null) {
                    return;
                }
                c6425aaM4150b.f4497L.add(C6490s.m4615a(name, "onPaused"));
                long jCurrentTimeMillis = System.currentTimeMillis();
                c6425aaM4150b.f4486A = jCurrentTimeMillis;
                c6425aaM4150b.f4487B = jCurrentTimeMillis - c6425aaM4150b.f4560z;
                long unused = C6490s.f5004h = jCurrentTimeMillis;
                if (c6425aaM4150b.f4487B < 0) {
                    c6425aaM4150b.f4487B = 0L;
                }
                c6425aaM4150b.f4559y = "background";
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            String name = activity.getClass().getName();
            if (C6490s.f5008l == null || C6490s.f5008l.getName().equals(name)) {
                C6436al.m4287c(">>> %s onResumed <<<", name);
                C6425aa c6425aaM4150b = C6425aa.m4150b();
                if (c6425aaM4150b == null) {
                    return;
                }
                c6425aaM4150b.f4497L.add(C6490s.m4615a(name, "onResumed"));
                c6425aaM4150b.f4559y = name;
                long jCurrentTimeMillis = System.currentTimeMillis();
                c6425aaM4150b.f4560z = jCurrentTimeMillis;
                c6425aaM4150b.f4488C = jCurrentTimeMillis - C6490s.f5005i;
                long j10 = c6425aaM4150b.f4560z - C6490s.f5004h;
                if (j10 > (C6490s.f5002f > 0 ? C6490s.f5002f : C6490s.f5001e)) {
                    c6425aaM4150b.m4159c();
                    C6490s.m4630g();
                    C6436al.m4283a("[session] launch app one times (app in background %d seconds and over %d seconds)", Long.valueOf(j10 / 1000), Long.valueOf(C6490s.f5001e / 1000));
                    if (C6490s.f5003g % C6490s.f4999c == 0) {
                        C6490s.f4998b.m4612a(4, C6490s.f5009m);
                        return;
                    }
                    C6490s.f4998b.m4612a(4, false);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (jCurrentTimeMillis2 - C6490s.f5006j > C6490s.f5000d) {
                        long unused = C6490s.f5006j = jCurrentTimeMillis2;
                        C6436al.m4283a("add a timer to upload hot start user info", new Object[0]);
                        if (C6490s.f5009m) {
                            C6435ak.m4274a().m4277a(C6490s.f4998b.new a(null, true), C6490s.f5000d);
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
            C6436al.m4287c(">>> %s onStart <<<", activity.getClass().getName());
            C6425aa.m4150b().m4153a(activity.hashCode(), true);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C6436al.m4287c(">>> %s onStop <<<", activity.getClass().getName());
            C6425aa.m4150b().m4153a(activity.hashCode(), false);
        }
    }

    /* renamed from: a */
    public static void m4619a(final Context context, final BuglyStrategy buglyStrategy) {
        long appReportDelay;
        if (f4997a) {
            return;
        }
        f5009m = C6425aa.m4148a(context).f4540f;
        f4998b = new C6489r(context, f5009m);
        f4997a = true;
        if (buglyStrategy != null) {
            f5008l = buglyStrategy.getUserInfoActivity();
            appReportDelay = buglyStrategy.getAppReportDelay();
        } else {
            appReportDelay = 0;
        }
        if (appReportDelay <= 0) {
            m4626c(context, buglyStrategy);
        } else {
            C6435ak.m4274a().m4277a(new Runnable() { // from class: com.tencent.bugly.proguard.s.1
                @Override // java.lang.Runnable
                public final void run() {
                    C6490s.m4626c(context, buglyStrategy);
                }
            }, appReportDelay);
        }
    }

    /* renamed from: g */
    public static /* synthetic */ int m4630g() {
        int i10 = f5003g;
        f5003g = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m4626c(Context context, BuglyStrategy buglyStrategy) {
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
            C6425aa c6425aaM4148a = C6425aa.m4148a(context);
            List<UserInfoBean> listM4597a = C6489r.m4597a(c6425aaM4148a.f4538d);
            if (listM4597a != null) {
                for (int i10 = 0; i10 < listM4597a.size(); i10++) {
                    UserInfoBean userInfoBean = listM4597a.get(i10);
                    if (userInfoBean.f4369n.equals(c6425aaM4148a.f4549o) && userInfoBean.f4357b == 1) {
                        long jM4338b = C6440ap.m4338b();
                        if (jM4338b <= 0) {
                            break;
                        }
                        if (userInfoBean.f4360e >= jM4338b) {
                            if (userInfoBean.f4361f <= 0) {
                                f4998b.m4614b();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            zIsEnableUserInfo = false;
        }
        C6425aa c6425aaM4150b = C6425aa.m4150b();
        if (c6425aaM4150b != null && C6497z.m4684a()) {
            c6425aaM4150b.m4153a(0, true);
        }
        if (zIsEnableUserInfo) {
            Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
            if (application != null) {
                try {
                    if (f5007k == null) {
                        f5007k = new a();
                    }
                    application.registerActivityLifecycleCallbacks(f5007k);
                } catch (Exception e10) {
                    if (!C6436al.m4284a(e10)) {
                        e10.printStackTrace();
                    }
                }
            }
        }
        if (f5009m) {
            f5005i = System.currentTimeMillis();
            f4998b.m4612a(1, false);
            C6436al.m4283a("[session] launch app, new start", new Object[0]);
            f4998b.m4611a();
            f4998b.m4613a(21600000L);
        }
    }

    /* renamed from: a */
    public static void m4617a(long j10) {
        if (j10 < 0) {
            j10 = C6427ac.m4212a().m4221c().f4393p;
        }
        f5002f = j10;
    }

    /* renamed from: a */
    public static void m4620a(StrategyBean strategyBean, boolean z10) {
        C6489r c6489r = f4998b;
        if (c6489r != null && !z10) {
            c6489r.m4614b();
        }
        if (strategyBean == null) {
            return;
        }
        long j10 = strategyBean.f4393p;
        if (j10 > 0) {
            f5001e = j10;
        }
        int i10 = strategyBean.f4398u;
        if (i10 > 0) {
            f4999c = i10;
        }
        long j11 = strategyBean.f4399v;
        if (j11 > 0) {
            f5000d = j11;
        }
    }

    /* renamed from: a */
    public static void m4616a() {
        C6489r c6489r = f4998b;
        if (c6489r != null) {
            c6489r.m4612a(2, false);
        }
    }

    /* renamed from: a */
    public static void m4618a(Context context) {
        if (!f4997a || context == null) {
            return;
        }
        Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
        if (application != null) {
            try {
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f5007k;
                if (activityLifecycleCallbacks != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            } catch (Exception e10) {
                if (!C6436al.m4284a(e10)) {
                    e10.printStackTrace();
                }
            }
        }
        f4997a = false;
    }

    /* renamed from: a */
    public static /* synthetic */ String m4615a(String str, String str2) {
        return C6440ap.m4318a() + "  " + str + "  " + str2 + SignParameters.NEW_LINE;
    }
}
