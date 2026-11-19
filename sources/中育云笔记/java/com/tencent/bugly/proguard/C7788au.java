package com.tencent.bugly.proguard;

import android.content.Context;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.au */
/* loaded from: classes5.dex */
public final class C7788au {

    /* renamed from: a */
    private static C7788au f13837a;

    /* renamed from: b */
    private C7770ac f13838b;

    /* renamed from: c */
    private C7768aa f13839c;

    /* renamed from: d */
    private C7786as f13840d;

    /* renamed from: e */
    private Context f13841e;

    /* renamed from: com.tencent.bugly.proguard.au$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7788au.m10755a(C7788au.this);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.au$b */
    public static class b implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ Thread f13843c;

        /* renamed from: d */
        public final /* synthetic */ int f13844d;

        /* renamed from: e */
        public final /* synthetic */ String f13845e;

        /* renamed from: f */
        public final /* synthetic */ String f13846f;

        /* renamed from: g */
        public final /* synthetic */ String f13847g;

        /* renamed from: h */
        public final /* synthetic */ Map f13848h;

        public b(Thread thread, int i10, String str, String str2, String str3, Map map) {
            this.f13843c = thread;
            this.f13844d = i10;
            this.f13845e = str;
            this.f13846f = str2;
            this.f13847g = str3;
            this.f13848h = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (C7788au.f13837a == null) {
                    C7779al.m10619e("[ExtraCrashManager] Extra crash manager has not been initialized.", new Object[0]);
                } else {
                    C7788au.m10756a(C7788au.f13837a, this.f13843c, this.f13844d, this.f13845e, this.f13846f, this.f13847g, this.f13848h);
                }
            } catch (Throwable th) {
                if (!C7779al.m10616b(th)) {
                    th.printStackTrace();
                }
                C7779al.m10619e("[ExtraCrashManager] Crash error %s %s %s", this.f13845e, this.f13846f, this.f13847g);
            }
        }
    }

    private C7788au(Context context) {
        C7787at c7787atM10736a = C7787at.m10736a();
        if (c7787atM10736a == null) {
            return;
        }
        this.f13838b = C7770ac.m10542a();
        this.f13839c = C7768aa.m10478a(context);
        this.f13840d = c7787atM10736a.f13818s;
        this.f13841e = context;
        C7778ak.m10604a().m10606a(new a());
    }

    /* renamed from: a */
    public static C7788au m10754a(Context context) {
        if (f13837a == null) {
            f13837a = new C7788au(context);
        }
        return f13837a;
    }

    /* renamed from: a */
    public static void m10757a(Thread thread, int i10, String str, String str2, String str3, Map<String, String> map) {
        C7778ak.m10604a().m10606a(new b(thread, i10, str, str2, str3, map));
    }

    /* renamed from: a */
    public static /* synthetic */ void m10755a(C7788au c7788au) {
        C7779al.m10617c("[ExtraCrashManager] Trying to notify Bugly agents.", new Object[0]);
        try {
            Class<?> cls = Class.forName("com.tencent.bugly.agent.GameAgent");
            c7788au.f13839c.getClass();
            C7783ap.m10661a(cls, "sdkPackageName", "com.tencent.bugly");
            C7779al.m10617c("[ExtraCrashManager] Bugly game agent has been notified.", new Object[0]);
        } catch (Throwable unused) {
            C7779al.m10613a("[ExtraCrashManager] no game agent", new Object[0]);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m10756a(C7788au c7788au, Thread thread, int i10, String str, String str2, String str3, Map map) {
        String str4;
        String str5;
        Thread threadCurrentThread = thread == null ? Thread.currentThread() : thread;
        if (i10 == 4) {
            str4 = "Unity";
        } else if (i10 == 5 || i10 == 6) {
            str4 = "Cocos";
        } else {
            if (i10 != 8) {
                C7779al.m10618d("[ExtraCrashManager] Unknown extra crash type: %d", Integer.valueOf(i10));
                return;
            }
            str4 = "H5";
        }
        C7779al.m10619e("[ExtraCrashManager] %s Crash Happen", str4);
        try {
            if (!c7788au.f13838b.m10550b()) {
                C7779al.m10618d("[ExtraCrashManager] There is no remote strategy, but still store it.", new Object[0]);
            }
            StrategyBean strategyBeanM10551c = c7788au.f13838b.m10551c();
            if (!strategyBeanM10551c.f13482f && c7788au.f13838b.m10550b()) {
                C7779al.m10619e("[ExtraCrashManager] Crash report was closed by remote. Will not upload to Bugly , print local for helpful!", new Object[0]);
                C7786as.m10703a(str4, C7783ap.m10648a(), c7788au.f13839c.f13637d, threadCurrentThread.getName(), str + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + str3, null);
                C7779al.m10619e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            if (i10 != 5 && i10 != 6) {
                if (i10 == 8 && !strategyBeanM10551c.f13488l) {
                    C7779al.m10619e("[ExtraCrashManager] %s report is disabled.", str4);
                    C7779al.m10619e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                    return;
                }
            } else if (!strategyBeanM10551c.f13487k) {
                C7779al.m10619e("[ExtraCrashManager] %s report is disabled.", str4);
                C7779al.m10619e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            int i11 = i10 != 8 ? i10 : 5;
            CrashDetailBean crashDetailBean = new CrashDetailBean();
            crashDetailBean.f13502C = C7769ab.m10529j();
            crashDetailBean.f13503D = C7769ab.m10525f();
            crashDetailBean.f13504E = C7769ab.m10531l();
            crashDetailBean.f13505F = c7788au.f13839c.m10502k();
            crashDetailBean.f13506G = c7788au.f13839c.m10501j();
            crashDetailBean.f13507H = c7788au.f13839c.m10503l();
            crashDetailBean.f13508I = C7769ab.m10519b(c7788au.f13841e);
            crashDetailBean.f13509J = C7769ab.m10526g();
            crashDetailBean.f13510K = C7769ab.m10527h();
            crashDetailBean.f13528b = i11;
            crashDetailBean.f13531e = c7788au.f13839c.m10497g();
            C7768aa c7768aa = c7788au.f13839c;
            crashDetailBean.f13532f = c7768aa.f13648o;
            crashDetailBean.f13533g = c7768aa.m10507q();
            crashDetailBean.f13539m = c7788au.f13839c.m10495f();
            crashDetailBean.f13540n = String.valueOf(str);
            crashDetailBean.f13541o = String.valueOf(str2);
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
            crashDetailBean.f13542p = str6;
            crashDetailBean.f13543q = str5;
            crashDetailBean.f13544r = System.currentTimeMillis();
            crashDetailBean.f13547u = C7783ap.m10678c(crashDetailBean.f13543q.getBytes());
            crashDetailBean.f13552z = C7783ap.m10659a(c7788au.f13839c.f13601Q, C7787at.f13803h);
            crashDetailBean.f13500A = c7788au.f13839c.f13637d;
            crashDetailBean.f13501B = threadCurrentThread.getName() + "(" + threadCurrentThread.getId() + ")";
            crashDetailBean.f13511L = c7788au.f13839c.m10509s();
            crashDetailBean.f13534h = c7788au.f13839c.m10506p();
            C7768aa c7768aa2 = c7788au.f13839c;
            crashDetailBean.f13516Q = c7768aa2.f13610a;
            crashDetailBean.f13517R = c7768aa2.m10486a();
            crashDetailBean.f13520U = c7788au.f13839c.m10516z();
            C7768aa c7768aa3 = c7788au.f13839c;
            crashDetailBean.f13521V = c7768aa3.f13657x;
            crashDetailBean.f13522W = c7768aa3.m10510t();
            crashDetailBean.f13523X = c7788au.f13839c.m10515y();
            crashDetailBean.f13551y = C7782ao.m10632a();
            if (crashDetailBean.f13518S == null) {
                crashDetailBean.f13518S = new LinkedHashMap();
            }
            if (map != null) {
                crashDetailBean.f13518S.putAll(map);
            }
            C7786as.m10703a(str4, C7783ap.m10648a(), c7788au.f13839c.f13637d, threadCurrentThread.getName(), str + SignParameters.NEW_LINE + str2 + SignParameters.NEW_LINE + str3, crashDetailBean);
            if (!c7788au.f13840d.m10732a(crashDetailBean, !C7787at.m10736a().f13816C)) {
                c7788au.f13840d.m10734b(crashDetailBean, false);
            }
            C7779al.m10619e("[ExtraCrashManager] Successfully handled.", new Object[0]);
        } catch (Throwable th) {
            try {
                if (!C7779al.m10614a(th)) {
                    th.printStackTrace();
                }
                C7779al.m10619e("[ExtraCrashManager] Successfully handled.", new Object[0]);
            } catch (Throwable th2) {
                C7779al.m10619e("[ExtraCrashManager] Successfully handled.", new Object[0]);
                throw th2;
            }
        }
    }
}
