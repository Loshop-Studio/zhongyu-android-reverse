package com.tencent.bugly.proguard;

import android.content.Context;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.au */
/* loaded from: classes4.dex */
public final class C6683au {

    /* renamed from: a */
    private static C6683au f5972a;

    /* renamed from: b */
    private C6665ac f5973b;

    /* renamed from: c */
    private C6663aa f5974c;

    /* renamed from: d */
    private C6681as f5975d;

    /* renamed from: e */
    private Context f5976e;

    private C6683au(Context context) {
        C6682at c6682atM5225a = C6682at.m5225a();
        if (c6682atM5225a == null) {
            return;
        }
        this.f5973b = C6665ac.m5031a();
        this.f5974c = C6663aa.m4967a(context);
        this.f5975d = c6682atM5225a.f5953s;
        this.f5976e = context;
        C6673ak.m5093a().m5095a(new Runnable() { // from class: com.tencent.bugly.proguard.au.1
            @Override // java.lang.Runnable
            public final void run() {
                C6683au.m5244a(C6683au.this);
            }
        });
    }

    /* renamed from: a */
    public static C6683au m5243a(Context context) {
        if (f5972a == null) {
            f5972a = new C6683au(context);
        }
        return f5972a;
    }

    /* renamed from: a */
    public static void m5246a(final Thread thread, final int i9, final String str, final String str2, final String str3, final Map<String, String> map) {
        C6673ak.m5093a().m5095a(new Runnable() { // from class: com.tencent.bugly.proguard.au.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (C6683au.f5972a == null) {
                        C6674al.m5108e("[ExtraCrashManager] Extra crash manager has not been initialized.", new Object[0]);
                    } else {
                        C6683au.m5245a(C6683au.f5972a, thread, i9, str, str2, str3, map);
                    }
                } catch (Throwable th) {
                    if (!C6674al.m5105b(th)) {
                        th.printStackTrace();
                    }
                    C6674al.m5108e("[ExtraCrashManager] Crash error %s %s %s", str, str2, str3);
                }
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m5244a(C6683au c6683au) {
        C6674al.m5106c("[ExtraCrashManager] Trying to notify Bugly agents.", new Object[0]);
        try {
            Class<?> cls = Class.forName("com.tencent.bugly.agent.GameAgent");
            c6683au.f5974c.getClass();
            C6678ap.m5150a(cls, "sdkPackageName", "com.tencent.bugly");
            C6674al.m5106c("[ExtraCrashManager] Bugly game agent has been notified.", new Object[0]);
        } catch (Throwable unused) {
            C6674al.m5102a("[ExtraCrashManager] no game agent", new Object[0]);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m5245a(C6683au c6683au, Thread thread, int i9, String str, String str2, String str3, Map map) {
        String str4;
        String str5;
        Thread threadCurrentThread = thread == null ? Thread.currentThread() : thread;
        if (i9 == 4) {
            str4 = "Unity";
        } else if (i9 == 5 || i9 == 6) {
            str4 = "Cocos";
        } else {
            if (i9 != 8) {
                C6674al.m5107d("[ExtraCrashManager] Unknown extra crash type: %d", Integer.valueOf(i9));
                return;
            }
            str4 = "H5";
        }
        C6674al.m5108e("[ExtraCrashManager] %s Crash Happen", str4);
        try {
            if (!c6683au.f5973b.m5039b()) {
                C6674al.m5107d("[ExtraCrashManager] There is no remote strategy, but still store it.", new Object[0]);
            }
            StrategyBean strategyBeanM5040c = c6683au.f5973b.m5040c();
            if (!strategyBeanM5040c.f5617f && c6683au.f5973b.m5039b()) {
                C6674al.m5108e("[ExtraCrashManager] Crash report was closed by remote. Will not upload to Bugly , print local for helpful!", new Object[0]);
                C6681as.m5192a(str4, C6678ap.m5137a(), c6683au.f5974c.f5772d, threadCurrentThread.getName(), str + AbsSection.SEP_ORIGIN_LINE_BREAK + str2 + AbsSection.SEP_ORIGIN_LINE_BREAK + str3, null);
                C6674al.m5108e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            if (i9 != 5 && i9 != 6) {
                if (i9 == 8 && !strategyBeanM5040c.f5623l) {
                    C6674al.m5108e("[ExtraCrashManager] %s report is disabled.", str4);
                    C6674al.m5108e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                    return;
                }
            } else if (!strategyBeanM5040c.f5622k) {
                C6674al.m5108e("[ExtraCrashManager] %s report is disabled.", str4);
                C6674al.m5108e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            int i10 = i9 != 8 ? i9 : 5;
            CrashDetailBean crashDetailBean = new CrashDetailBean();
            crashDetailBean.f5637C = C6664ab.m5018j();
            crashDetailBean.f5638D = C6664ab.m5014f();
            crashDetailBean.f5639E = C6664ab.m5020l();
            crashDetailBean.f5640F = c6683au.f5974c.m4991k();
            crashDetailBean.f5641G = c6683au.f5974c.m4990j();
            crashDetailBean.f5642H = c6683au.f5974c.m4992l();
            crashDetailBean.f5643I = C6664ab.m5008b(c6683au.f5976e);
            crashDetailBean.f5644J = C6664ab.m5015g();
            crashDetailBean.f5645K = C6664ab.m5016h();
            crashDetailBean.f5663b = i10;
            crashDetailBean.f5666e = c6683au.f5974c.m4986g();
            C6663aa c6663aa = c6683au.f5974c;
            crashDetailBean.f5667f = c6663aa.f5783o;
            crashDetailBean.f5668g = c6663aa.m4996q();
            crashDetailBean.f5674m = c6683au.f5974c.m4984f();
            crashDetailBean.f5675n = String.valueOf(str);
            crashDetailBean.f5676o = String.valueOf(str2);
            String str6 = "";
            if (str3 == null) {
                str5 = "";
            } else {
                String[] strArrSplit = str3.split(AbsSection.SEP_ORIGIN_LINE_BREAK);
                if (strArrSplit.length > 0) {
                    str6 = strArrSplit[0];
                }
                str5 = str3;
            }
            crashDetailBean.f5677p = str6;
            crashDetailBean.f5678q = str5;
            crashDetailBean.f5679r = System.currentTimeMillis();
            crashDetailBean.f5682u = C6678ap.m5167c(crashDetailBean.f5678q.getBytes());
            crashDetailBean.f5687z = C6678ap.m5148a(c6683au.f5974c.f5736Q, C6682at.f5938h);
            crashDetailBean.f5635A = c6683au.f5974c.f5772d;
            crashDetailBean.f5636B = threadCurrentThread.getName() + "(" + threadCurrentThread.getId() + ")";
            crashDetailBean.f5646L = c6683au.f5974c.m4998s();
            crashDetailBean.f5669h = c6683au.f5974c.m4995p();
            C6663aa c6663aa2 = c6683au.f5974c;
            crashDetailBean.f5651Q = c6663aa2.f5745a;
            crashDetailBean.f5652R = c6663aa2.m4975a();
            crashDetailBean.f5655U = c6683au.f5974c.m5005z();
            C6663aa c6663aa3 = c6683au.f5974c;
            crashDetailBean.f5656V = c6663aa3.f5792x;
            crashDetailBean.f5657W = c6663aa3.m4999t();
            crashDetailBean.f5658X = c6683au.f5974c.m5004y();
            crashDetailBean.f5686y = C6677ao.m5121a();
            if (crashDetailBean.f5653S == null) {
                crashDetailBean.f5653S = new LinkedHashMap();
            }
            if (map != null) {
                crashDetailBean.f5653S.putAll(map);
            }
            C6681as.m5192a(str4, C6678ap.m5137a(), c6683au.f5974c.f5772d, threadCurrentThread.getName(), str + AbsSection.SEP_ORIGIN_LINE_BREAK + str2 + AbsSection.SEP_ORIGIN_LINE_BREAK + str3, crashDetailBean);
            if (!c6683au.f5975d.m5221a(crashDetailBean, !C6682at.m5225a().f5951C)) {
                c6683au.f5975d.m5223b(crashDetailBean, false);
            }
            C6674al.m5108e("[ExtraCrashManager] Successfully handled.", new Object[0]);
        } catch (Throwable th) {
            try {
                if (!C6674al.m5103a(th)) {
                    th.printStackTrace();
                }
                C6674al.m5108e("[ExtraCrashManager] Successfully handled.", new Object[0]);
            } catch (Throwable th2) {
                C6674al.m5108e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                throw th2;
            }
        }
    }
}
