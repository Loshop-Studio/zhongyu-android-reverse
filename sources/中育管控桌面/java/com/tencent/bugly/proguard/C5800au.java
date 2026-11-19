package com.tencent.bugly.proguard;

import android.content.Context;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.au */
/* loaded from: classes3.dex */
public final class C5800au {

    /* renamed from: a */
    private static C5800au f4116a;

    /* renamed from: b */
    private C5782ac f4117b;

    /* renamed from: c */
    private C5780aa f4118c;

    /* renamed from: d */
    private C5798as f4119d;

    /* renamed from: e */
    private Context f4120e;

    private C5800au(Context context) {
        C5799at c5799atM4051a = C5799at.m4051a();
        if (c5799atM4051a == null) {
            return;
        }
        this.f4117b = C5782ac.m3857a();
        this.f4118c = C5780aa.m3793a(context);
        this.f4119d = c5799atM4051a.f4097s;
        this.f4120e = context;
        C5790ak.m3919a().m3921a(new Runnable() { // from class: com.tencent.bugly.proguard.au.1
            @Override // java.lang.Runnable
            public final void run() {
                C5800au.m4070a(C5800au.this);
            }
        });
    }

    /* renamed from: a */
    public static C5800au m4069a(Context context) {
        if (f4116a == null) {
            f4116a = new C5800au(context);
        }
        return f4116a;
    }

    /* renamed from: a */
    public static void m4072a(final Thread thread, final int i6, final String str, final String str2, final String str3, final Map<String, String> map) {
        C5790ak.m3919a().m3921a(new Runnable() { // from class: com.tencent.bugly.proguard.au.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (C5800au.f4116a == null) {
                        C5791al.m3934e("[ExtraCrashManager] Extra crash manager has not been initialized.", new Object[0]);
                    } else {
                        C5800au.m4071a(C5800au.f4116a, thread, i6, str, str2, str3, map);
                    }
                } catch (Throwable th) {
                    if (!C5791al.m3931b(th)) {
                        th.printStackTrace();
                    }
                    C5791al.m3934e("[ExtraCrashManager] Crash error %s %s %s", str, str2, str3);
                }
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m4070a(C5800au c5800au) {
        C5791al.m3932c("[ExtraCrashManager] Trying to notify Bugly agents.", new Object[0]);
        try {
            Class<?> cls = Class.forName("com.tencent.bugly.agent.GameAgent");
            c5800au.f4118c.getClass();
            C5795ap.m3976a(cls, "sdkPackageName", "com.tencent.bugly");
            C5791al.m3932c("[ExtraCrashManager] Bugly game agent has been notified.", new Object[0]);
        } catch (Throwable unused) {
            C5791al.m3928a("[ExtraCrashManager] no game agent", new Object[0]);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m4071a(C5800au c5800au, Thread thread, int i6, String str, String str2, String str3, Map map) {
        String str4;
        String str5;
        Thread threadCurrentThread = thread == null ? Thread.currentThread() : thread;
        if (i6 == 4) {
            str4 = "Unity";
        } else if (i6 == 5 || i6 == 6) {
            str4 = "Cocos";
        } else {
            if (i6 != 8) {
                C5791al.m3933d("[ExtraCrashManager] Unknown extra crash type: %d", Integer.valueOf(i6));
                return;
            }
            str4 = "H5";
        }
        C5791al.m3934e("[ExtraCrashManager] %s Crash Happen", str4);
        try {
            if (!c5800au.f4117b.m3865b()) {
                C5791al.m3933d("[ExtraCrashManager] There is no remote strategy, but still store it.", new Object[0]);
            }
            StrategyBean strategyBeanM3866c = c5800au.f4117b.m3866c();
            if (!strategyBeanM3866c.f3761f && c5800au.f4117b.m3865b()) {
                C5791al.m3934e("[ExtraCrashManager] Crash report was closed by remote. Will not upload to Bugly , print local for helpful!", new Object[0]);
                C5798as.m4018a(str4, C5795ap.m3963a(), c5800au.f4118c.f3916d, threadCurrentThread.getName(), str + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + str3, null);
                C5791al.m3934e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            if (i6 != 5 && i6 != 6) {
                if (i6 == 8 && !strategyBeanM3866c.f3767l) {
                    C5791al.m3934e("[ExtraCrashManager] %s report is disabled.", str4);
                    C5791al.m3934e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                    return;
                }
            } else if (!strategyBeanM3866c.f3766k) {
                C5791al.m3934e("[ExtraCrashManager] %s report is disabled.", str4);
                C5791al.m3934e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            int i7 = i6 != 8 ? i6 : 5;
            CrashDetailBean crashDetailBean = new CrashDetailBean();
            crashDetailBean.f3781C = C5781ab.m3844j();
            crashDetailBean.f3782D = C5781ab.m3840f();
            crashDetailBean.f3783E = C5781ab.m3846l();
            crashDetailBean.f3784F = c5800au.f4118c.m3817k();
            crashDetailBean.f3785G = c5800au.f4118c.m3816j();
            crashDetailBean.f3786H = c5800au.f4118c.m3818l();
            crashDetailBean.f3787I = C5781ab.m3834b(c5800au.f4120e);
            crashDetailBean.f3788J = C5781ab.m3841g();
            crashDetailBean.f3789K = C5781ab.m3842h();
            crashDetailBean.f3807b = i7;
            crashDetailBean.f3810e = c5800au.f4118c.m3812g();
            C5780aa c5780aa = c5800au.f4118c;
            crashDetailBean.f3811f = c5780aa.f3927o;
            crashDetailBean.f3812g = c5780aa.m3822q();
            crashDetailBean.f3818m = c5800au.f4118c.m3810f();
            crashDetailBean.f3819n = String.valueOf(str);
            crashDetailBean.f3820o = String.valueOf(str2);
            String str6 = "";
            if (str3 == null) {
                str5 = "";
            } else {
                String[] strArrSplit = str3.split(SignParameters.NEW_LINE);
                if (strArrSplit.length > 0) {
                    str6 = strArrSplit[0];
                }
                str5 = str3;
            }
            crashDetailBean.f3821p = str6;
            crashDetailBean.f3822q = str5;
            crashDetailBean.f3823r = System.currentTimeMillis();
            crashDetailBean.f3826u = C5795ap.m3993c(crashDetailBean.f3822q.getBytes());
            crashDetailBean.f3831z = C5795ap.m3974a(c5800au.f4118c.f3880Q, C5799at.f4082h);
            crashDetailBean.f3779A = c5800au.f4118c.f3916d;
            crashDetailBean.f3780B = threadCurrentThread.getName() + "(" + threadCurrentThread.getId() + ")";
            crashDetailBean.f3790L = c5800au.f4118c.m3824s();
            crashDetailBean.f3813h = c5800au.f4118c.m3821p();
            C5780aa c5780aa2 = c5800au.f4118c;
            crashDetailBean.f3795Q = c5780aa2.f3889a;
            crashDetailBean.f3796R = c5780aa2.m3801a();
            crashDetailBean.f3799U = c5800au.f4118c.m3831z();
            C5780aa c5780aa3 = c5800au.f4118c;
            crashDetailBean.f3800V = c5780aa3.f3936x;
            crashDetailBean.f3801W = c5780aa3.m3825t();
            crashDetailBean.f3802X = c5800au.f4118c.m3830y();
            crashDetailBean.f3830y = C5794ao.m3947a();
            if (crashDetailBean.f3797S == null) {
                crashDetailBean.f3797S = new LinkedHashMap();
            }
            if (map != null) {
                crashDetailBean.f3797S.putAll(map);
            }
            C5798as.m4018a(str4, C5795ap.m3963a(), c5800au.f4118c.f3916d, threadCurrentThread.getName(), str + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + str3, crashDetailBean);
            if (!c5800au.f4119d.m4047a(crashDetailBean, !C5799at.m4051a().f4095C)) {
                c5800au.f4119d.m4049b(crashDetailBean, false);
            }
            C5791al.m3934e("[ExtraCrashManager] Successfully handled.", new Object[0]);
        } catch (Throwable th) {
            try {
                if (!C5791al.m3929a(th)) {
                    th.printStackTrace();
                }
                C5791al.m3934e("[ExtraCrashManager] Successfully handled.", new Object[0]);
            } catch (Throwable th2) {
                C5791al.m3934e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                throw th2;
            }
        }
    }
}
