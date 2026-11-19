package com.tencent.bugly.proguard;

import android.content.Context;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.au */
/* loaded from: classes4.dex */
public final class C6445au {

    /* renamed from: a */
    private static C6445au f4738a;

    /* renamed from: b */
    private C6427ac f4739b;

    /* renamed from: c */
    private C6425aa f4740c;

    /* renamed from: d */
    private C6443as f4741d;

    /* renamed from: e */
    private Context f4742e;

    private C6445au(Context context) {
        C6444at c6444atM4406a = C6444at.m4406a();
        if (c6444atM4406a == null) {
            return;
        }
        this.f4739b = C6427ac.m4212a();
        this.f4740c = C6425aa.m4148a(context);
        this.f4741d = c6444atM4406a.f4719s;
        this.f4742e = context;
        C6435ak.m4274a().m4276a(new Runnable() { // from class: com.tencent.bugly.proguard.au.1
            @Override // java.lang.Runnable
            public final void run() {
                C6445au.m4425a(C6445au.this);
            }
        });
    }

    /* renamed from: a */
    public static C6445au m4424a(Context context) {
        if (f4738a == null) {
            f4738a = new C6445au(context);
        }
        return f4738a;
    }

    /* renamed from: a */
    public static void m4427a(final Thread thread, final int i10, final String str, final String str2, final String str3, final Map<String, String> map) {
        C6435ak.m4274a().m4276a(new Runnable() { // from class: com.tencent.bugly.proguard.au.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (C6445au.f4738a == null) {
                        C6436al.m4289e("[ExtraCrashManager] Extra crash manager has not been initialized.", new Object[0]);
                    } else {
                        C6445au.m4426a(C6445au.f4738a, thread, i10, str, str2, str3, map);
                    }
                } catch (Throwable th) {
                    if (!C6436al.m4286b(th)) {
                        th.printStackTrace();
                    }
                    C6436al.m4289e("[ExtraCrashManager] Crash error %s %s %s", str, str2, str3);
                }
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m4425a(C6445au c6445au) {
        C6436al.m4287c("[ExtraCrashManager] Trying to notify Bugly agents.", new Object[0]);
        try {
            Class<?> cls = Class.forName("com.tencent.bugly.agent.GameAgent");
            c6445au.f4740c.getClass();
            C6440ap.m4331a(cls, "sdkPackageName", "com.tencent.bugly");
            C6436al.m4287c("[ExtraCrashManager] Bugly game agent has been notified.", new Object[0]);
        } catch (Throwable unused) {
            C6436al.m4283a("[ExtraCrashManager] no game agent", new Object[0]);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m4426a(C6445au c6445au, Thread thread, int i10, String str, String str2, String str3, Map map) {
        String str4;
        String str5;
        Thread threadCurrentThread = thread == null ? Thread.currentThread() : thread;
        if (i10 == 4) {
            str4 = "Unity";
        } else if (i10 == 5 || i10 == 6) {
            str4 = "Cocos";
        } else {
            if (i10 != 8) {
                C6436al.m4288d("[ExtraCrashManager] Unknown extra crash type: %d", Integer.valueOf(i10));
                return;
            }
            str4 = "H5";
        }
        C6436al.m4289e("[ExtraCrashManager] %s Crash Happen", str4);
        try {
            if (!c6445au.f4739b.m4220b()) {
                C6436al.m4288d("[ExtraCrashManager] There is no remote strategy, but still store it.", new Object[0]);
            }
            StrategyBean strategyBeanM4221c = c6445au.f4739b.m4221c();
            if (!strategyBeanM4221c.f4383f && c6445au.f4739b.m4220b()) {
                C6436al.m4289e("[ExtraCrashManager] Crash report was closed by remote. Will not upload to Bugly , print local for helpful!", new Object[0]);
                C6443as.m4373a(str4, C6440ap.m4318a(), c6445au.f4740c.f4538d, threadCurrentThread.getName(), str + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + str3, null);
                C6436al.m4289e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            if (i10 != 5 && i10 != 6) {
                if (i10 == 8 && !strategyBeanM4221c.f4389l) {
                    C6436al.m4289e("[ExtraCrashManager] %s report is disabled.", str4);
                    C6436al.m4289e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                    return;
                }
            } else if (!strategyBeanM4221c.f4388k) {
                C6436al.m4289e("[ExtraCrashManager] %s report is disabled.", str4);
                C6436al.m4289e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            int i11 = i10 != 8 ? i10 : 5;
            CrashDetailBean crashDetailBean = new CrashDetailBean();
            crashDetailBean.f4403C = C6426ab.m4199j();
            crashDetailBean.f4404D = C6426ab.m4195f();
            crashDetailBean.f4405E = C6426ab.m4201l();
            crashDetailBean.f4406F = c6445au.f4740c.m4172k();
            crashDetailBean.f4407G = c6445au.f4740c.m4171j();
            crashDetailBean.f4408H = c6445au.f4740c.m4173l();
            crashDetailBean.f4409I = C6426ab.m4189b(c6445au.f4742e);
            crashDetailBean.f4410J = C6426ab.m4196g();
            crashDetailBean.f4411K = C6426ab.m4197h();
            crashDetailBean.f4429b = i11;
            crashDetailBean.f4432e = c6445au.f4740c.m4167g();
            C6425aa c6425aa = c6445au.f4740c;
            crashDetailBean.f4433f = c6425aa.f4549o;
            crashDetailBean.f4434g = c6425aa.m4177q();
            crashDetailBean.f4440m = c6445au.f4740c.m4165f();
            crashDetailBean.f4441n = String.valueOf(str);
            crashDetailBean.f4442o = String.valueOf(str2);
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
            crashDetailBean.f4443p = str6;
            crashDetailBean.f4444q = str5;
            crashDetailBean.f4445r = System.currentTimeMillis();
            crashDetailBean.f4448u = C6440ap.m4348c(crashDetailBean.f4444q.getBytes());
            crashDetailBean.f4453z = C6440ap.m4329a(c6445au.f4740c.f4502Q, C6444at.f4704h);
            crashDetailBean.f4401A = c6445au.f4740c.f4538d;
            crashDetailBean.f4402B = threadCurrentThread.getName() + "(" + threadCurrentThread.getId() + ")";
            crashDetailBean.f4412L = c6445au.f4740c.m4179s();
            crashDetailBean.f4435h = c6445au.f4740c.m4176p();
            C6425aa c6425aa2 = c6445au.f4740c;
            crashDetailBean.f4417Q = c6425aa2.f4511a;
            crashDetailBean.f4418R = c6425aa2.m4156a();
            crashDetailBean.f4421U = c6445au.f4740c.m4186z();
            C6425aa c6425aa3 = c6445au.f4740c;
            crashDetailBean.f4422V = c6425aa3.f4558x;
            crashDetailBean.f4423W = c6425aa3.m4180t();
            crashDetailBean.f4424X = c6445au.f4740c.m4185y();
            crashDetailBean.f4452y = C6439ao.m4302a();
            if (crashDetailBean.f4419S == null) {
                crashDetailBean.f4419S = new LinkedHashMap();
            }
            if (map != null) {
                crashDetailBean.f4419S.putAll(map);
            }
            C6443as.m4373a(str4, C6440ap.m4318a(), c6445au.f4740c.f4538d, threadCurrentThread.getName(), str + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + str3, crashDetailBean);
            if (!c6445au.f4741d.m4402a(crashDetailBean, !C6444at.m4406a().f4717C)) {
                c6445au.f4741d.m4404b(crashDetailBean, false);
            }
            C6436al.m4289e("[ExtraCrashManager] Successfully handled.", new Object[0]);
        } catch (Throwable th) {
            try {
                if (!C6436al.m4284a(th)) {
                    th.printStackTrace();
                }
                C6436al.m4289e("[ExtraCrashManager] Successfully handled.", new Object[0]);
            } catch (Throwable th2) {
                C6436al.m4289e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                throw th2;
            }
        }
    }
}
