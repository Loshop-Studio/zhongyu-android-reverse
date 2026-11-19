package com.tencent.bugly.proguard;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.C6467r.a;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.s */
/* loaded from: classes4.dex */
public class C6468s {

    /* renamed from: a */
    public static boolean f5654a = false;

    /* renamed from: b */
    public static C6467r f5655b = null;

    /* renamed from: c */
    private static int f5656c = 10;

    /* renamed from: d */
    private static long f5657d = 300000;

    /* renamed from: e */
    private static long f5658e = 30000;

    /* renamed from: f */
    private static long f5659f = 0;

    /* renamed from: g */
    private static int f5660g = 0;

    /* renamed from: h */
    private static long f5661h = 0;

    /* renamed from: i */
    private static long f5662i = 0;

    /* renamed from: j */
    private static long f5663j = 0;

    /* renamed from: k */
    private static Application.ActivityLifecycleCallbacks f5664k = null;

    /* renamed from: l */
    private static Class<?> f5665l = null;

    /* renamed from: m */
    private static boolean f5666m = true;

    /* renamed from: com.tencent.bugly.proguard.s$a */
    public static class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            String name = activity.getClass().getName();
            if (C6468s.f5665l == null || C6468s.f5665l.getName().equals(name)) {
                C6414al.m4927c(">>> %s onCreated <<<", name);
                C6403aa c6403aaM4790b = C6403aa.m4790b();
                if (c6403aaM4790b != null) {
                    c6403aaM4790b.f5154L.add(C6468s.m5255a(name, "onCreated"));
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            String name = activity.getClass().getName();
            if (C6468s.f5665l == null || C6468s.f5665l.getName().equals(name)) {
                C6414al.m4927c(">>> %s onDestroyed <<<", name);
                C6403aa c6403aaM4790b = C6403aa.m4790b();
                if (c6403aaM4790b != null) {
                    c6403aaM4790b.f5154L.add(C6468s.m5255a(name, "onDestroyed"));
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            String name = activity.getClass().getName();
            if (C6468s.f5665l == null || C6468s.f5665l.getName().equals(name)) {
                C6414al.m4927c(">>> %s onPaused <<<", name);
                C6403aa c6403aaM4790b = C6403aa.m4790b();
                if (c6403aaM4790b == null) {
                    return;
                }
                c6403aaM4790b.f5154L.add(C6468s.m5255a(name, "onPaused"));
                long jCurrentTimeMillis = System.currentTimeMillis();
                c6403aaM4790b.f5143A = jCurrentTimeMillis;
                c6403aaM4790b.f5144B = jCurrentTimeMillis - c6403aaM4790b.f5217z;
                long unused = C6468s.f5661h = jCurrentTimeMillis;
                if (c6403aaM4790b.f5144B < 0) {
                    c6403aaM4790b.f5144B = 0L;
                }
                c6403aaM4790b.f5216y = "background";
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            String name = activity.getClass().getName();
            if (C6468s.f5665l == null || C6468s.f5665l.getName().equals(name)) {
                C6414al.m4927c(">>> %s onResumed <<<", name);
                C6403aa c6403aaM4790b = C6403aa.m4790b();
                if (c6403aaM4790b == null) {
                    return;
                }
                c6403aaM4790b.f5154L.add(C6468s.m5255a(name, "onResumed"));
                c6403aaM4790b.f5216y = name;
                long jCurrentTimeMillis = System.currentTimeMillis();
                c6403aaM4790b.f5217z = jCurrentTimeMillis;
                c6403aaM4790b.f5145C = jCurrentTimeMillis - C6468s.f5662i;
                long j10 = c6403aaM4790b.f5217z - C6468s.f5661h;
                if (j10 > (C6468s.f5659f > 0 ? C6468s.f5659f : C6468s.f5658e)) {
                    c6403aaM4790b.m4799c();
                    C6468s.m5270g();
                    C6414al.m4923a("[session] launch app one times (app in background %d seconds and over %d seconds)", Long.valueOf(j10 / 1000), Long.valueOf(C6468s.f5658e / 1000));
                    if (C6468s.f5660g % C6468s.f5656c == 0) {
                        C6468s.f5655b.m5252a(4, C6468s.f5666m);
                        return;
                    }
                    C6468s.f5655b.m5252a(4, false);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (jCurrentTimeMillis2 - C6468s.f5663j > C6468s.f5657d) {
                        long unused = C6468s.f5663j = jCurrentTimeMillis2;
                        C6414al.m4923a("add a timer to upload hot start user info", new Object[0]);
                        if (C6468s.f5666m) {
                            C6413ak.m4914a().m4917a(C6468s.f5655b.new a(null, true), C6468s.f5657d);
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
            C6414al.m4927c(">>> %s onStart <<<", activity.getClass().getName());
            C6403aa.m4790b().m4793a(activity.hashCode(), true);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C6414al.m4927c(">>> %s onStop <<<", activity.getClass().getName());
            C6403aa.m4790b().m4793a(activity.hashCode(), false);
        }
    }

    /* renamed from: a */
    public static void m5259a(final Context context, final BuglyStrategy buglyStrategy) {
        long appReportDelay;
        if (f5654a) {
            return;
        }
        f5666m = C6403aa.m4788a(context).f5197f;
        f5655b = new C6467r(context, f5666m);
        f5654a = true;
        if (buglyStrategy != null) {
            f5665l = buglyStrategy.getUserInfoActivity();
            appReportDelay = buglyStrategy.getAppReportDelay();
        } else {
            appReportDelay = 0;
        }
        if (appReportDelay <= 0) {
            m5266c(context, buglyStrategy);
        } else {
            C6413ak.m4914a().m4917a(new Runnable() { // from class: com.tencent.bugly.proguard.s.1
                @Override // java.lang.Runnable
                public final void run() {
                    C6468s.m5266c(context, buglyStrategy);
                }
            }, appReportDelay);
        }
    }

    /* renamed from: g */
    public static /* synthetic */ int m5270g() {
        int i10 = f5660g;
        f5660g = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m5266c(Context context, BuglyStrategy buglyStrategy) {
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
            C6403aa c6403aaM4788a = C6403aa.m4788a(context);
            List<UserInfoBean> listM5237a = C6467r.m5237a(c6403aaM4788a.f5195d);
            if (listM5237a != null) {
                for (int i10 = 0; i10 < listM5237a.size(); i10++) {
                    UserInfoBean userInfoBean = listM5237a.get(i10);
                    if (userInfoBean.f5026n.equals(c6403aaM4788a.f5206o) && userInfoBean.f5014b == 1) {
                        long jM4978b = C6418ap.m4978b();
                        if (jM4978b <= 0) {
                            break;
                        }
                        if (userInfoBean.f5017e >= jM4978b) {
                            if (userInfoBean.f5018f <= 0) {
                                f5655b.m5254b();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            zIsEnableUserInfo = false;
        }
        C6403aa c6403aaM4790b = C6403aa.m4790b();
        if (c6403aaM4790b != null && C6475z.m5324a()) {
            c6403aaM4790b.m4793a(0, true);
        }
        if (zIsEnableUserInfo) {
            Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
            if (application != null) {
                try {
                    if (f5664k == null) {
                        f5664k = new a();
                    }
                    application.registerActivityLifecycleCallbacks(f5664k);
                } catch (Exception e10) {
                    if (!C6414al.m4924a(e10)) {
                        e10.printStackTrace();
                    }
                }
            }
        }
        if (f5666m) {
            f5662i = System.currentTimeMillis();
            f5655b.m5252a(1, false);
            C6414al.m4923a("[session] launch app, new start", new Object[0]);
            f5655b.m5251a();
            f5655b.m5253a(21600000L);
        }
    }

    /* renamed from: a */
    public static void m5257a(long j10) {
        if (j10 < 0) {
            j10 = C6405ac.m4852a().m4861c().f5050p;
        }
        f5659f = j10;
    }

    /* renamed from: a */
    public static void m5260a(StrategyBean strategyBean, boolean z9) {
        C6467r c6467r = f5655b;
        if (c6467r != null && !z9) {
            c6467r.m5254b();
        }
        if (strategyBean == null) {
            return;
        }
        long j10 = strategyBean.f5050p;
        if (j10 > 0) {
            f5658e = j10;
        }
        int i10 = strategyBean.f5055u;
        if (i10 > 0) {
            f5656c = i10;
        }
        long j11 = strategyBean.f5056v;
        if (j11 > 0) {
            f5657d = j11;
        }
    }

    /* renamed from: a */
    public static void m5256a() {
        C6467r c6467r = f5655b;
        if (c6467r != null) {
            c6467r.m5252a(2, false);
        }
    }

    /* renamed from: a */
    public static void m5258a(Context context) {
        if (!f5654a || context == null) {
            return;
        }
        Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
        if (application != null) {
            try {
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f5664k;
                if (activityLifecycleCallbacks != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            } catch (Exception e10) {
                if (!C6414al.m4924a(e10)) {
                    e10.printStackTrace();
                }
            }
        }
        f5654a = false;
    }

    /* renamed from: a */
    public static /* synthetic */ String m5255a(String str, String str2) {
        return C6418ap.m4958a() + "  " + str + "  " + str2 + SignParameters.NEW_LINE;
    }
}
