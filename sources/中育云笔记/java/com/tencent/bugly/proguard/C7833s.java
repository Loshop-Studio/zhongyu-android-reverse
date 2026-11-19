package com.tencent.bugly.proguard;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.C7832r.c;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.s */
/* loaded from: classes5.dex */
public class C7833s {

    /* renamed from: a */
    public static boolean f14096a = false;

    /* renamed from: b */
    public static C7832r f14097b = null;

    /* renamed from: c */
    private static int f14098c = 10;

    /* renamed from: d */
    private static long f14099d = 300000;

    /* renamed from: e */
    private static long f14100e = 30000;

    /* renamed from: f */
    private static long f14101f = 0;

    /* renamed from: g */
    private static int f14102g = 0;

    /* renamed from: h */
    private static long f14103h = 0;

    /* renamed from: i */
    private static long f14104i = 0;

    /* renamed from: j */
    private static long f14105j = 0;

    /* renamed from: k */
    private static Application.ActivityLifecycleCallbacks f14106k = null;

    /* renamed from: l */
    private static Class<?> f14107l = null;

    /* renamed from: m */
    private static boolean f14108m = true;

    /* renamed from: com.tencent.bugly.proguard.s$a */
    public static class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Context f14109c;

        /* renamed from: d */
        public final /* synthetic */ BuglyStrategy f14110d;

        public a(Context context, BuglyStrategy buglyStrategy) {
            this.f14109c = context;
            this.f14110d = buglyStrategy;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7833s.m10956c(this.f14109c, this.f14110d);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.s$b */
    public static class b implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            String name = activity.getClass().getName();
            if (C7833s.f14107l == null || C7833s.f14107l.getName().equals(name)) {
                C7779al.m10617c(">>> %s onCreated <<<", name);
                C7768aa c7768aaM10480b = C7768aa.m10480b();
                if (c7768aaM10480b != null) {
                    c7768aaM10480b.f13596L.add(C7833s.m10945a(name, "onCreated"));
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            String name = activity.getClass().getName();
            if (C7833s.f14107l == null || C7833s.f14107l.getName().equals(name)) {
                C7779al.m10617c(">>> %s onDestroyed <<<", name);
                C7768aa c7768aaM10480b = C7768aa.m10480b();
                if (c7768aaM10480b != null) {
                    c7768aaM10480b.f13596L.add(C7833s.m10945a(name, "onDestroyed"));
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            String name = activity.getClass().getName();
            if (C7833s.f14107l == null || C7833s.f14107l.getName().equals(name)) {
                C7779al.m10617c(">>> %s onPaused <<<", name);
                C7768aa c7768aaM10480b = C7768aa.m10480b();
                if (c7768aaM10480b == null) {
                    return;
                }
                c7768aaM10480b.f13596L.add(C7833s.m10945a(name, "onPaused"));
                long jCurrentTimeMillis = System.currentTimeMillis();
                c7768aaM10480b.f13585A = jCurrentTimeMillis;
                c7768aaM10480b.f13586B = jCurrentTimeMillis - c7768aaM10480b.f13659z;
                long unused = C7833s.f14103h = jCurrentTimeMillis;
                if (c7768aaM10480b.f13586B < 0) {
                    c7768aaM10480b.f13586B = 0L;
                }
                c7768aaM10480b.f13658y = "background";
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            String name = activity.getClass().getName();
            if (C7833s.f14107l == null || C7833s.f14107l.getName().equals(name)) {
                C7779al.m10617c(">>> %s onResumed <<<", name);
                C7768aa c7768aaM10480b = C7768aa.m10480b();
                if (c7768aaM10480b == null) {
                    return;
                }
                c7768aaM10480b.f13596L.add(C7833s.m10945a(name, "onResumed"));
                c7768aaM10480b.f13658y = name;
                long jCurrentTimeMillis = System.currentTimeMillis();
                c7768aaM10480b.f13659z = jCurrentTimeMillis;
                c7768aaM10480b.f13587C = jCurrentTimeMillis - C7833s.f14104i;
                long j10 = c7768aaM10480b.f13659z - C7833s.f14103h;
                if (j10 > (C7833s.f14101f > 0 ? C7833s.f14101f : C7833s.f14100e)) {
                    c7768aaM10480b.m10489c();
                    C7833s.m10960g();
                    C7779al.m10613a("[session] launch app one times (app in background %d seconds and over %d seconds)", Long.valueOf(j10 / 1000), Long.valueOf(C7833s.f14100e / 1000));
                    if (C7833s.f14102g % C7833s.f14098c == 0) {
                        C7833s.f14097b.m10942a(4, C7833s.f14108m);
                        return;
                    }
                    C7833s.f14097b.m10942a(4, false);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (jCurrentTimeMillis2 - C7833s.f14105j > C7833s.f14099d) {
                        long unused = C7833s.f14105j = jCurrentTimeMillis2;
                        C7779al.m10613a("add a timer to upload hot start user info", new Object[0]);
                        if (C7833s.f14108m) {
                            C7778ak.m10604a().m10607a(C7833s.f14097b.new c(null, true), C7833s.f14099d);
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
            C7779al.m10617c(">>> %s onStart <<<", activity.getClass().getName());
            C7768aa.m10480b().m10483a(activity.hashCode(), true);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            C7779al.m10617c(">>> %s onStop <<<", activity.getClass().getName());
            C7768aa.m10480b().m10483a(activity.hashCode(), false);
        }
    }

    /* renamed from: a */
    public static void m10949a(Context context, BuglyStrategy buglyStrategy) {
        long appReportDelay;
        if (f14096a) {
            return;
        }
        f14108m = C7768aa.m10478a(context).f13639f;
        f14097b = new C7832r(context, f14108m);
        f14096a = true;
        if (buglyStrategy != null) {
            f14107l = buglyStrategy.getUserInfoActivity();
            appReportDelay = buglyStrategy.getAppReportDelay();
        } else {
            appReportDelay = 0;
        }
        if (appReportDelay <= 0) {
            m10956c(context, buglyStrategy);
        } else {
            C7778ak.m10604a().m10607a(new a(context, buglyStrategy), appReportDelay);
        }
    }

    /* renamed from: g */
    public static /* synthetic */ int m10960g() {
        int i10 = f14102g;
        f14102g = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m10956c(Context context, BuglyStrategy buglyStrategy) {
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
            C7768aa c7768aaM10478a = C7768aa.m10478a(context);
            List<UserInfoBean> listM10927a = C7832r.m10927a(c7768aaM10478a.f13637d);
            if (listM10927a != null) {
                for (int i10 = 0; i10 < listM10927a.size(); i10++) {
                    UserInfoBean userInfoBean = listM10927a.get(i10);
                    if (userInfoBean.f13468n.equals(c7768aaM10478a.f13648o) && userInfoBean.f13456b == 1) {
                        long jM10668b = C7783ap.m10668b();
                        if (jM10668b <= 0) {
                            break;
                        }
                        if (userInfoBean.f13459e >= jM10668b) {
                            if (userInfoBean.f13460f <= 0) {
                                f14097b.m10944b();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            zIsEnableUserInfo = false;
        }
        C7768aa c7768aaM10480b = C7768aa.m10480b();
        if (c7768aaM10480b != null && C7840z.m11014a()) {
            c7768aaM10480b.m10483a(0, true);
        }
        if (zIsEnableUserInfo) {
            Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
            if (application != null) {
                try {
                    if (f14106k == null) {
                        f14106k = new b();
                    }
                    application.registerActivityLifecycleCallbacks(f14106k);
                } catch (Exception e10) {
                    if (!C7779al.m10614a(e10)) {
                        e10.printStackTrace();
                    }
                }
            }
        }
        if (f14108m) {
            f14104i = System.currentTimeMillis();
            f14097b.m10942a(1, false);
            C7779al.m10613a("[session] launch app, new start", new Object[0]);
            f14097b.m10941a();
            f14097b.m10943a(21600000L);
        }
    }

    /* renamed from: a */
    public static void m10947a(long j10) {
        if (j10 < 0) {
            j10 = C7770ac.m10542a().m10551c().f13492p;
        }
        f14101f = j10;
    }

    /* renamed from: a */
    public static void m10950a(StrategyBean strategyBean, boolean z10) {
        C7832r c7832r = f14097b;
        if (c7832r != null && !z10) {
            c7832r.m10944b();
        }
        if (strategyBean == null) {
            return;
        }
        long j10 = strategyBean.f13492p;
        if (j10 > 0) {
            f14100e = j10;
        }
        int i10 = strategyBean.f13497u;
        if (i10 > 0) {
            f14098c = i10;
        }
        long j11 = strategyBean.f13498v;
        if (j11 > 0) {
            f14099d = j11;
        }
    }

    /* renamed from: a */
    public static void m10946a() {
        C7832r c7832r = f14097b;
        if (c7832r != null) {
            c7832r.m10942a(2, false);
        }
    }

    /* renamed from: a */
    public static void m10948a(Context context) {
        if (!f14096a || context == null) {
            return;
        }
        Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
        if (application != null) {
            try {
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f14106k;
                if (activityLifecycleCallbacks != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            } catch (Exception e10) {
                if (!C7779al.m10614a(e10)) {
                    e10.printStackTrace();
                }
            }
        }
        f14096a = false;
    }

    /* renamed from: a */
    public static /* synthetic */ String m10945a(String str, String str2) {
        return C7783ap.m10648a() + "  " + str + "  " + str2 + SignParameters.NEW_LINE;
    }
}
