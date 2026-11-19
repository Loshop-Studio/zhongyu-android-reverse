package com.tencent.bugly.proguard;

import android.app.Application;
import android.content.Context;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.blankj.utilcode.util.RunnableC3379a0;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.s */
/* loaded from: classes3.dex */
public class C4135s {

    /* renamed from: a */
    public static boolean f3876a = false;

    /* renamed from: b */
    public static C4133r f3877b = null;

    /* renamed from: c */
    private static int f3878c = 10;

    /* renamed from: d */
    private static long f3879d = 300000;

    /* renamed from: e */
    private static long f3880e = 30000;

    /* renamed from: f */
    private static long f3881f = 0;

    /* renamed from: g */
    private static int f3882g = 0;

    /* renamed from: h */
    private static long f3883h = 0;

    /* renamed from: i */
    private static long f3884i = 0;

    /* renamed from: j */
    private static long f3885j = 0;

    /* renamed from: k */
    private static Application.ActivityLifecycleCallbacks f3886k = null;

    /* renamed from: l */
    private static Class<?> f3887l = null;

    /* renamed from: m */
    private static boolean f3888m = true;

    /* renamed from: a */
    public static void m3356a(Context context, BuglyStrategy buglyStrategy) {
        long appReportDelay;
        if (f3876a) {
            return;
        }
        boolean z8 = C4044aa.m2888a(context).f3436f;
        f3888m = z8;
        f3877b = new C4133r(context, z8);
        f3876a = true;
        if (buglyStrategy != null) {
            f3887l = buglyStrategy.getUserInfoActivity();
            appReportDelay = buglyStrategy.getAppReportDelay();
        } else {
            appReportDelay = 0;
        }
        if (appReportDelay <= 0) {
            m3363c(context, buglyStrategy);
        } else {
            C4054ak.m3012a().m3015a(new RunnableC3379a0(4, context, buglyStrategy), appReportDelay);
        }
    }

    /* renamed from: g */
    public static /* synthetic */ int m3367g() {
        int i = f3882g;
        f3882g = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m3363c(Context context, BuglyStrategy buglyStrategy) {
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
            C4044aa c4044aaM2888a = C4044aa.m2888a(context);
            List<UserInfoBean> listM3334a = C4133r.m3334a(c4044aaM2888a.f3434d);
            if (listM3334a != null) {
                for (int i = 0; i < listM3334a.size(); i++) {
                    UserInfoBean userInfoBean = listM3334a.get(i);
                    if (userInfoBean.f3260n.equals(c4044aaM2888a.f3445o) && userInfoBean.f3248b == 1) {
                        long jM3076b = C4059ap.m3076b();
                        if (jM3076b <= 0) {
                            break;
                        }
                        if (userInfoBean.f3251e >= jM3076b) {
                            if (userInfoBean.f3252f <= 0) {
                                f3877b.m3351b();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            zIsEnableUserInfo = false;
        }
        C4044aa c4044aaM2890b = C4044aa.m2890b();
        if (c4044aaM2890b != null && C4149z.m3420a()) {
            c4044aaM2890b.m2893a(0, true);
        }
        if (zIsEnableUserInfo) {
            Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
            if (application != null) {
                try {
                    if (f3886k == null) {
                        f3886k = new C4112h1();
                    }
                    application.registerActivityLifecycleCallbacks(f3886k);
                } catch (Exception e) {
                    if (!C4055al.m3022a(e)) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (f3888m) {
            f3884i = System.currentTimeMillis();
            f3877b.m3349a(1, false);
            C4055al.m3021a("[session] launch app, new start", new Object[0]);
            f3877b.m3348a();
            f3877b.m3350a(21600000L);
        }
    }

    /* renamed from: a */
    public static void m3354a(long j7) {
        if (j7 < 0) {
            j7 = C4046ac.m2951a().m2960c().f3284p;
        }
        f3881f = j7;
    }

    /* renamed from: a */
    public static void m3357a(StrategyBean strategyBean, boolean z8) {
        C4133r c4133r = f3877b;
        if (c4133r != null && !z8) {
            c4133r.m3351b();
        }
        if (strategyBean == null) {
            return;
        }
        long j7 = strategyBean.f3284p;
        if (j7 > 0) {
            f3880e = j7;
        }
        int i = strategyBean.f3289u;
        if (i > 0) {
            f3878c = i;
        }
        long j8 = strategyBean.f3290v;
        if (j8 > 0) {
            f3879d = j8;
        }
    }

    /* renamed from: a */
    public static void m3353a() {
        C4133r c4133r = f3877b;
        if (c4133r != null) {
            c4133r.m3349a(2, false);
        }
    }

    /* renamed from: a */
    public static void m3355a(Context context) {
        if (!f3876a || context == null) {
            return;
        }
        Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
        if (application != null) {
            try {
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f3886k;
                if (activityLifecycleCallbacks != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            } catch (Exception e) {
                if (!C4055al.m3022a(e)) {
                    e.printStackTrace();
                }
            }
        }
        f3876a = false;
    }

    /* renamed from: a */
    public static /* synthetic */ String m3352a(String str, String str2) {
        return C4059ap.m3056a() + "  " + str + "  " + str2 + SignParameters.NEW_LINE;
    }
}
