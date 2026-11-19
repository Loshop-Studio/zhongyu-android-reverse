package com.tencent.bugly.proguard;

import android.content.Context;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.LinkedHashMap;
import java.util.Map;
import p016b0.RunnableC3059a;

/* renamed from: com.tencent.bugly.proguard.au */
/* loaded from: classes3.dex */
public final class C4064au {

    /* renamed from: a */
    private static C4064au f3608a;

    /* renamed from: b */
    private C4046ac f3609b;

    /* renamed from: c */
    private C4044aa f3610c;

    /* renamed from: d */
    private C4062as f3611d;

    /* renamed from: e */
    private Context f3612e;

    private C4064au(Context context) {
        C4063at c4063atM3143a = C4063at.m3143a();
        if (c4063atM3143a == null) {
            return;
        }
        this.f3609b = C4046ac.m2951a();
        this.f3610c = C4044aa.m2888a(context);
        this.f3611d = c4063atM3143a.f3592s;
        this.f3612e = context;
        C4054ak.m3012a().m3014a(new RunnableC3059a(this, 9));
    }

    /* renamed from: a */
    public static C4064au m3161a(Context context) {
        if (f3608a == null) {
            f3608a = new C4064au(context);
        }
        return f3608a;
    }

    /* renamed from: a */
    public static void m3164a(Thread thread, int i, String str, String str2, String str3, Map<String, String> map) {
        C4054ak.m3012a().m3014a(new RunnableC4043a1(thread, i, str, str2, str3, map));
    }

    /* renamed from: a */
    public static /* synthetic */ void m3162a(C4064au c4064au) {
        C4055al.m3025c("[ExtraCrashManager] Trying to notify Bugly agents.", new Object[0]);
        try {
            Class<?> cls = Class.forName("com.tencent.bugly.agent.GameAgent");
            c4064au.f3610c.getClass();
            C4059ap.m3069a(cls, "sdkPackageName", "com.tencent.bugly");
            C4055al.m3025c("[ExtraCrashManager] Bugly game agent has been notified.", new Object[0]);
        } catch (Throwable unused) {
            C4055al.m3021a("[ExtraCrashManager] no game agent", new Object[0]);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m3163a(C4064au c4064au, Thread thread, int i, String str, String str2, String str3, Map map) {
        String str4;
        String str5;
        Thread threadCurrentThread = thread == null ? Thread.currentThread() : thread;
        if (i == 4) {
            str4 = "Unity";
        } else if (i == 5 || i == 6) {
            str4 = "Cocos";
        } else {
            if (i != 8) {
                C4055al.m3026d("[ExtraCrashManager] Unknown extra crash type: %d", Integer.valueOf(i));
                return;
            }
            str4 = "H5";
        }
        C4055al.m3027e("[ExtraCrashManager] %s Crash Happen", str4);
        try {
            if (!c4064au.f3609b.m2959b()) {
                C4055al.m3026d("[ExtraCrashManager] There is no remote strategy, but still store it.", new Object[0]);
            }
            StrategyBean strategyBeanM2960c = c4064au.f3609b.m2960c();
            if (!strategyBeanM2960c.f3274f && c4064au.f3609b.m2959b()) {
                C4055al.m3027e("[ExtraCrashManager] Crash report was closed by remote. Will not upload to Bugly , print local for helpful!", new Object[0]);
                C4062as.m3111a(str4, C4059ap.m3056a(), c4064au.f3610c.f3434d, threadCurrentThread.getName(), str + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + str3, null);
                C4055al.m3027e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            if (i != 5 && i != 6) {
                if (i == 8 && !strategyBeanM2960c.f3280l) {
                    C4055al.m3027e("[ExtraCrashManager] %s report is disabled.", str4);
                    C4055al.m3027e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                    return;
                }
            } else if (!strategyBeanM2960c.f3279k) {
                C4055al.m3027e("[ExtraCrashManager] %s report is disabled.", str4);
                C4055al.m3027e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            int i8 = i != 8 ? i : 5;
            CrashDetailBean crashDetailBean = new CrashDetailBean();
            crashDetailBean.f3294C = C4045ab.m2939j();
            crashDetailBean.f3295D = C4045ab.m2935f();
            crashDetailBean.f3296E = C4045ab.m2941l();
            crashDetailBean.f3297F = c4064au.f3610c.m2912k();
            crashDetailBean.f3298G = c4064au.f3610c.m2911j();
            crashDetailBean.f3299H = c4064au.f3610c.m2913l();
            crashDetailBean.f3300I = C4045ab.m2929b(c4064au.f3612e);
            crashDetailBean.f3301J = C4045ab.m2936g();
            crashDetailBean.f3302K = C4045ab.m2937h();
            crashDetailBean.f3320b = i8;
            crashDetailBean.f3323e = c4064au.f3610c.m2907g();
            C4044aa c4044aa = c4064au.f3610c;
            crashDetailBean.f3324f = c4044aa.f3445o;
            crashDetailBean.f3325g = c4044aa.m2917q();
            crashDetailBean.f3331m = c4064au.f3610c.m2905f();
            crashDetailBean.f3332n = String.valueOf(str);
            crashDetailBean.f3333o = String.valueOf(str2);
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
            crashDetailBean.f3334p = str6;
            crashDetailBean.f3335q = str5;
            crashDetailBean.f3336r = System.currentTimeMillis();
            crashDetailBean.f3339u = C4059ap.m3086c(crashDetailBean.f3335q.getBytes());
            crashDetailBean.f3344z = C4059ap.m3067a(c4064au.f3610c.f3398Q, C4063at.f3577h);
            crashDetailBean.f3292A = c4064au.f3610c.f3434d;
            crashDetailBean.f3293B = threadCurrentThread.getName() + "(" + threadCurrentThread.getId() + ")";
            crashDetailBean.f3303L = c4064au.f3610c.m2919s();
            crashDetailBean.f3326h = c4064au.f3610c.m2916p();
            C4044aa c4044aa2 = c4064au.f3610c;
            crashDetailBean.f3308Q = c4044aa2.f3407a;
            crashDetailBean.f3309R = c4044aa2.m2896a();
            crashDetailBean.f3312U = c4064au.f3610c.m2926z();
            C4044aa c4044aa3 = c4064au.f3610c;
            crashDetailBean.f3313V = c4044aa3.f3454x;
            crashDetailBean.f3314W = c4044aa3.m2920t();
            crashDetailBean.f3315X = c4064au.f3610c.m2925y();
            crashDetailBean.f3343y = C4058ao.m3040a();
            if (crashDetailBean.f3310S == null) {
                crashDetailBean.f3310S = new LinkedHashMap();
            }
            if (map != null) {
                crashDetailBean.f3310S.putAll(map);
            }
            C4062as.m3111a(str4, C4059ap.m3056a(), c4064au.f3610c.f3434d, threadCurrentThread.getName(), str + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + str3, crashDetailBean);
            if (!c4064au.f3611d.m3140a(crashDetailBean, !C4063at.m3143a().f3590C)) {
                c4064au.f3611d.m3142b(crashDetailBean, false);
            }
            C4055al.m3027e("[ExtraCrashManager] Successfully handled.", new Object[0]);
        } catch (Throwable th) {
            try {
                if (!C4055al.m3022a(th)) {
                    th.printStackTrace();
                }
                C4055al.m3027e("[ExtraCrashManager] Successfully handled.", new Object[0]);
            } catch (Throwable th2) {
                C4055al.m3027e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                throw th2;
            }
        }
    }
}
