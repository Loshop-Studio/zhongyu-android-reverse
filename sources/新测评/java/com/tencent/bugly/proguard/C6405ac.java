package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.ac */
/* loaded from: classes4.dex */
public final class C6405ac {

    /* renamed from: a */
    public static int f5221a = 1000;

    /* renamed from: b */
    public static long f5222b = 259200000;

    /* renamed from: d */
    private static C6405ac f5223d;

    /* renamed from: i */
    private static String f5224i;

    /* renamed from: c */
    public final C6413ak f5225c;

    /* renamed from: e */
    private final List<AbstractC6464o> f5226e;

    /* renamed from: f */
    private final StrategyBean f5227f;

    /* renamed from: g */
    private StrategyBean f5228g = null;

    /* renamed from: h */
    private Context f5229h;

    private C6405ac(Context context, List<AbstractC6464o> list) {
        this.f5229h = context;
        if (C6403aa.m4788a(context) != null) {
            String str = C6403aa.m4788a(context).f5150H;
            if ("oversea".equals(str)) {
                StrategyBean.f5035a = "https://astat.bugly.qcloud.com/rqd/async";
                StrategyBean.f5036b = "https://astat.bugly.qcloud.com/rqd/async";
            } else if ("na_https".equals(str)) {
                StrategyBean.f5035a = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
                StrategyBean.f5036b = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
            }
        }
        this.f5227f = new StrategyBean();
        this.f5226e = list;
        this.f5225c = C6413ak.m4914a();
    }

    /* renamed from: d */
    public static StrategyBean m4856d() {
        byte[] bArr;
        List<C6474y> listM5313a = C6472w.m5296a().m5313a(2);
        if (listM5313a == null || listM5313a.size() <= 0 || (bArr = listM5313a.get(0).f5718g) == null) {
            return null;
        }
        return (StrategyBean) C6418ap.m4957a(bArr, StrategyBean.CREATOR);
    }

    /* renamed from: c */
    public final StrategyBean m4861c() {
        StrategyBean strategyBean = this.f5228g;
        if (strategyBean != null) {
            if (!C6418ap.m4994d(strategyBean.f5051q)) {
                this.f5228g.f5051q = StrategyBean.f5035a;
            }
            if (!C6418ap.m4994d(this.f5228g.f5052r)) {
                this.f5228g.f5052r = StrategyBean.f5036b;
            }
            return this.f5228g;
        }
        if (!C6418ap.m4986b(f5224i) && C6418ap.m4994d(f5224i)) {
            StrategyBean strategyBean2 = this.f5227f;
            String str = f5224i;
            strategyBean2.f5051q = str;
            strategyBean2.f5052r = str;
        }
        return this.f5227f;
    }

    /* renamed from: b */
    public final synchronized boolean m4860b() {
        return this.f5228g != null;
    }

    /* renamed from: a */
    public static synchronized C6405ac m4853a(Context context, List<AbstractC6464o> list) {
        try {
            if (f5223d == null) {
                f5223d = new C6405ac(context, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5223d;
    }

    /* renamed from: a */
    public static synchronized C6405ac m4852a() {
        return f5223d;
    }

    /* renamed from: a */
    public final void m4858a(StrategyBean strategyBean, boolean z9) {
        C6414al.m4927c("[Strategy] Notify %s", C6468s.class.getName());
        C6468s.m5260a(strategyBean, z9);
        for (AbstractC6464o abstractC6464o : this.f5226e) {
            try {
                C6414al.m4927c("[Strategy] Notify %s", abstractC6464o.getClass().getName());
                abstractC6464o.onServerStrategyChanged(strategyBean);
            } catch (Throwable th) {
                if (!C6414al.m4924a(th)) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m4854a(String str) {
        if (!C6418ap.m4986b(str) && C6418ap.m4994d(str)) {
            f5224i = str;
        } else {
            C6414al.m4928d("URL user set is invalid.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void m4859a(C6449bt c6449bt) throws NumberFormatException {
        int i10;
        if (c6449bt == null) {
            return;
        }
        StrategyBean strategyBean = this.f5228g;
        if (strategyBean == null || c6449bt.f5575h != strategyBean.f5049o) {
            StrategyBean strategyBean2 = new StrategyBean();
            strategyBean2.f5040f = c6449bt.f5568a;
            strategyBean2.f5042h = c6449bt.f5570c;
            strategyBean2.f5041g = c6449bt.f5569b;
            if (C6418ap.m4986b(f5224i) || !C6418ap.m4994d(f5224i)) {
                if (C6418ap.m4994d(c6449bt.f5571d)) {
                    C6414al.m4927c("[Strategy] Upload url changes to %s", c6449bt.f5571d);
                    strategyBean2.f5051q = c6449bt.f5571d;
                }
                if (C6418ap.m4994d(c6449bt.f5572e)) {
                    C6414al.m4927c("[Strategy] Exception upload url changes to %s", c6449bt.f5572e);
                    strategyBean2.f5052r = c6449bt.f5572e;
                }
            }
            C6448bs c6448bs = c6449bt.f5573f;
            if (c6448bs != null && !C6418ap.m4986b(c6448bs.f5563a)) {
                strategyBean2.f5053s = c6449bt.f5573f.f5563a;
            }
            long j10 = c6449bt.f5575h;
            if (j10 != 0) {
                strategyBean2.f5049o = j10;
            }
            Map<String, String> map = c6449bt.f5574g;
            if (map != null && map.size() > 0) {
                Map<String, String> map2 = c6449bt.f5574g;
                strategyBean2.f5054t = map2;
                String str = map2.get("B11");
                strategyBean2.f5043i = str != null && str.equals("1");
                String str2 = c6449bt.f5574g.get("B3");
                if (str2 != null) {
                    strategyBean2.f5057w = Long.parseLong(str2);
                }
                int i11 = c6449bt.f5579l;
                strategyBean2.f5050p = i11;
                strategyBean2.f5056v = i11;
                String str3 = c6449bt.f5574g.get("B27");
                if (str3 != null && str3.length() > 0) {
                    try {
                        int i12 = Integer.parseInt(str3);
                        if (i12 > 0) {
                            strategyBean2.f5055u = i12;
                        }
                    } catch (Exception e10) {
                        if (!C6414al.m4924a(e10)) {
                            e10.printStackTrace();
                        }
                    }
                }
                String str4 = c6449bt.f5574g.get("B25");
                strategyBean2.f5045k = str4 != null && str4.equals("1");
            }
            C6414al.m4923a("[Strategy] enableCrashReport:%b, enableQuery:%b, enableUserInfo:%b, enableAnr:%b, enableBlock:%b, enableSession:%b, enableSessionTimer:%b, sessionOverTime:%d, enableCocos:%b, strategyLastUpdateTime:%d", Boolean.valueOf(strategyBean2.f5040f), Boolean.valueOf(strategyBean2.f5042h), Boolean.valueOf(strategyBean2.f5041g), Boolean.valueOf(strategyBean2.f5043i), Boolean.valueOf(strategyBean2.f5044j), Boolean.valueOf(strategyBean2.f5047m), Boolean.valueOf(strategyBean2.f5048n), Long.valueOf(strategyBean2.f5050p), Boolean.valueOf(strategyBean2.f5045k), Long.valueOf(strategyBean2.f5049o));
            this.f5228g = strategyBean2;
            if (C6418ap.m4994d(c6449bt.f5571d)) {
                i10 = 0;
            } else {
                i10 = 0;
                C6414al.m4927c("[Strategy] download url is null", new Object[0]);
                this.f5228g.f5051q = "";
            }
            if (!C6418ap.m4994d(c6449bt.f5572e)) {
                C6414al.m4927c("[Strategy] download crashurl is null", new Object[i10]);
                this.f5228g.f5052r = "";
            }
            C6472w.m5296a().m5318b(2);
            C6474y c6474y = new C6474y();
            c6474y.f5713b = 2;
            c6474y.f5712a = strategyBean2.f5038d;
            c6474y.f5716e = strategyBean2.f5039e;
            c6474y.f5718g = C6418ap.m4975a(strategyBean2);
            C6472w.m5296a().m5317a(c6474y);
            m4858a(strategyBean2, true);
        }
    }
}
