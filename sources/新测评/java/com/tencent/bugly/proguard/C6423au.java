package com.tencent.bugly.proguard;

import android.content.Context;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.au */
/* loaded from: classes4.dex */
public final class C6423au {

    /* renamed from: a */
    private static C6423au f5395a;

    /* renamed from: b */
    private C6405ac f5396b;

    /* renamed from: c */
    private C6403aa f5397c;

    /* renamed from: d */
    private C6421as f5398d;

    /* renamed from: e */
    private Context f5399e;

    private C6423au(Context context) {
        C6422at c6422atM5046a = C6422at.m5046a();
        if (c6422atM5046a == null) {
            return;
        }
        this.f5396b = C6405ac.m4852a();
        this.f5397c = C6403aa.m4788a(context);
        this.f5398d = c6422atM5046a.f5376s;
        this.f5399e = context;
        C6413ak.m4914a().m4916a(new Runnable() { // from class: com.tencent.bugly.proguard.au.1
            @Override // java.lang.Runnable
            public final void run() {
                C6423au.m5065a(C6423au.this);
            }
        });
    }

    /* renamed from: a */
    public static C6423au m5064a(Context context) {
        if (f5395a == null) {
            f5395a = new C6423au(context);
        }
        return f5395a;
    }

    /* renamed from: a */
    public static void m5067a(final Thread thread, final int i10, final String str, final String str2, final String str3, final Map<String, String> map) {
        C6413ak.m4914a().m4916a(new Runnable() { // from class: com.tencent.bugly.proguard.au.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (C6423au.f5395a == null) {
                        C6414al.m4929e("[ExtraCrashManager] Extra crash manager has not been initialized.", new Object[0]);
                    } else {
                        C6423au.m5066a(C6423au.f5395a, thread, i10, str, str2, str3, map);
                    }
                } catch (Throwable th) {
                    if (!C6414al.m4926b(th)) {
                        th.printStackTrace();
                    }
                    C6414al.m4929e("[ExtraCrashManager] Crash error %s %s %s", str, str2, str3);
                }
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m5065a(C6423au c6423au) {
        C6414al.m4927c("[ExtraCrashManager] Trying to notify Bugly agents.", new Object[0]);
        try {
            Class<?> cls = Class.forName("com.tencent.bugly.agent.GameAgent");
            c6423au.f5397c.getClass();
            C6418ap.m4971a(cls, "sdkPackageName", "com.tencent.bugly");
            C6414al.m4927c("[ExtraCrashManager] Bugly game agent has been notified.", new Object[0]);
        } catch (Throwable unused) {
            C6414al.m4923a("[ExtraCrashManager] no game agent", new Object[0]);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m5066a(C6423au c6423au, Thread thread, int i10, String str, String str2, String str3, Map map) {
        String str4;
        String str5;
        Thread threadCurrentThread = thread == null ? Thread.currentThread() : thread;
        if (i10 == 4) {
            str4 = "Unity";
        } else if (i10 == 5 || i10 == 6) {
            str4 = "Cocos";
        } else {
            if (i10 != 8) {
                C6414al.m4928d("[ExtraCrashManager] Unknown extra crash type: %d", Integer.valueOf(i10));
                return;
            }
            str4 = "H5";
        }
        C6414al.m4929e("[ExtraCrashManager] %s Crash Happen", str4);
        try {
            if (!c6423au.f5396b.m4860b()) {
                C6414al.m4928d("[ExtraCrashManager] There is no remote strategy, but still store it.", new Object[0]);
            }
            StrategyBean strategyBeanM4861c = c6423au.f5396b.m4861c();
            if (!strategyBeanM4861c.f5040f && c6423au.f5396b.m4860b()) {
                C6414al.m4929e("[ExtraCrashManager] Crash report was closed by remote. Will not upload to Bugly , print local for helpful!", new Object[0]);
                C6421as.m5013a(str4, C6418ap.m4958a(), c6423au.f5397c.f5195d, threadCurrentThread.getName(), str + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + str3, null);
                C6414al.m4929e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            if (i10 != 5 && i10 != 6) {
                if (i10 == 8 && !strategyBeanM4861c.f5046l) {
                    C6414al.m4929e("[ExtraCrashManager] %s report is disabled.", str4);
                    C6414al.m4929e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                    return;
                }
            } else if (!strategyBeanM4861c.f5045k) {
                C6414al.m4929e("[ExtraCrashManager] %s report is disabled.", str4);
                C6414al.m4929e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            int i11 = i10 != 8 ? i10 : 5;
            CrashDetailBean crashDetailBean = new CrashDetailBean();
            crashDetailBean.f5060C = C6404ab.m4839j();
            crashDetailBean.f5061D = C6404ab.m4835f();
            crashDetailBean.f5062E = C6404ab.m4841l();
            crashDetailBean.f5063F = c6423au.f5397c.m4812k();
            crashDetailBean.f5064G = c6423au.f5397c.m4811j();
            crashDetailBean.f5065H = c6423au.f5397c.m4813l();
            crashDetailBean.f5066I = C6404ab.m4829b(c6423au.f5399e);
            crashDetailBean.f5067J = C6404ab.m4836g();
            crashDetailBean.f5068K = C6404ab.m4837h();
            crashDetailBean.f5086b = i11;
            crashDetailBean.f5089e = c6423au.f5397c.m4807g();
            C6403aa c6403aa = c6423au.f5397c;
            crashDetailBean.f5090f = c6403aa.f5206o;
            crashDetailBean.f5091g = c6403aa.m4817q();
            crashDetailBean.f5097m = c6423au.f5397c.m4805f();
            crashDetailBean.f5098n = String.valueOf(str);
            crashDetailBean.f5099o = String.valueOf(str2);
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
            crashDetailBean.f5100p = str6;
            crashDetailBean.f5101q = str5;
            crashDetailBean.f5102r = System.currentTimeMillis();
            crashDetailBean.f5105u = C6418ap.m4988c(crashDetailBean.f5101q.getBytes());
            crashDetailBean.f5110z = C6418ap.m4969a(c6423au.f5397c.f5159Q, C6422at.f5361h);
            crashDetailBean.f5058A = c6423au.f5397c.f5195d;
            crashDetailBean.f5059B = threadCurrentThread.getName() + "(" + threadCurrentThread.getId() + ")";
            crashDetailBean.f5069L = c6423au.f5397c.m4819s();
            crashDetailBean.f5092h = c6423au.f5397c.m4816p();
            C6403aa c6403aa2 = c6423au.f5397c;
            crashDetailBean.f5074Q = c6403aa2.f5168a;
            crashDetailBean.f5075R = c6403aa2.m4796a();
            crashDetailBean.f5078U = c6423au.f5397c.m4826z();
            C6403aa c6403aa3 = c6423au.f5397c;
            crashDetailBean.f5079V = c6403aa3.f5215x;
            crashDetailBean.f5080W = c6403aa3.m4820t();
            crashDetailBean.f5081X = c6423au.f5397c.m4825y();
            crashDetailBean.f5109y = C6417ao.m4942a();
            if (crashDetailBean.f5076S == null) {
                crashDetailBean.f5076S = new LinkedHashMap();
            }
            if (map != null) {
                crashDetailBean.f5076S.putAll(map);
            }
            C6421as.m5013a(str4, C6418ap.m4958a(), c6423au.f5397c.f5195d, threadCurrentThread.getName(), str + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + str3, crashDetailBean);
            if (!c6423au.f5398d.m5042a(crashDetailBean, !C6422at.m5046a().f5374C)) {
                c6423au.f5398d.m5044b(crashDetailBean, false);
            }
            C6414al.m4929e("[ExtraCrashManager] Successfully handled.", new Object[0]);
        } catch (Throwable th) {
            try {
                if (!C6414al.m4924a(th)) {
                    th.printStackTrace();
                }
                C6414al.m4929e("[ExtraCrashManager] Successfully handled.", new Object[0]);
            } catch (Throwable th2) {
                C6414al.m4929e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                throw th2;
            }
        }
    }
}
