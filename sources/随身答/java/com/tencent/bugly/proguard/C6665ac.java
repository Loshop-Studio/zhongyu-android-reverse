package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.ac */
/* loaded from: classes4.dex */
public final class C6665ac {

    /* renamed from: a */
    public static int f5798a = 1000;

    /* renamed from: b */
    public static long f5799b = 259200000;

    /* renamed from: d */
    private static C6665ac f5800d;

    /* renamed from: i */
    private static String f5801i;

    /* renamed from: c */
    public final C6673ak f5802c;

    /* renamed from: e */
    private final List<AbstractC6724o> f5803e;

    /* renamed from: f */
    private final StrategyBean f5804f;

    /* renamed from: g */
    private StrategyBean f5805g = null;

    /* renamed from: h */
    private Context f5806h;

    private C6665ac(Context context, List<AbstractC6724o> list) {
        this.f5806h = context;
        if (C6663aa.m4967a(context) != null) {
            String str = C6663aa.m4967a(context).f5727H;
            if ("oversea".equals(str)) {
                StrategyBean.f5612a = "https://astat.bugly.qcloud.com/rqd/async";
                StrategyBean.f5613b = "https://astat.bugly.qcloud.com/rqd/async";
            } else if ("na_https".equals(str)) {
                StrategyBean.f5612a = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
                StrategyBean.f5613b = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
            }
        }
        this.f5804f = new StrategyBean();
        this.f5803e = list;
        this.f5802c = C6673ak.m5093a();
    }

    /* renamed from: d */
    public static StrategyBean m5035d() {
        byte[] bArr;
        List<C6734y> listM5492a = C6732w.m5475a().m5492a(2);
        if (listM5492a == null || listM5492a.size() <= 0 || (bArr = listM5492a.get(0).f6295g) == null) {
            return null;
        }
        return (StrategyBean) C6678ap.m5136a(bArr, StrategyBean.CREATOR);
    }

    /* renamed from: c */
    public final StrategyBean m5040c() {
        StrategyBean strategyBean = this.f5805g;
        if (strategyBean != null) {
            if (!C6678ap.m5173d(strategyBean.f5628q)) {
                this.f5805g.f5628q = StrategyBean.f5612a;
            }
            if (!C6678ap.m5173d(this.f5805g.f5629r)) {
                this.f5805g.f5629r = StrategyBean.f5613b;
            }
            return this.f5805g;
        }
        if (!C6678ap.m5165b(f5801i) && C6678ap.m5173d(f5801i)) {
            StrategyBean strategyBean2 = this.f5804f;
            String str = f5801i;
            strategyBean2.f5628q = str;
            strategyBean2.f5629r = str;
        }
        return this.f5804f;
    }

    /* renamed from: b */
    public final synchronized boolean m5039b() {
        return this.f5805g != null;
    }

    /* renamed from: a */
    public static synchronized C6665ac m5032a(Context context, List<AbstractC6724o> list) {
        try {
            if (f5800d == null) {
                f5800d = new C6665ac(context, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5800d;
    }

    /* renamed from: a */
    public static synchronized C6665ac m5031a() {
        return f5800d;
    }

    /* renamed from: a */
    public final void m5037a(StrategyBean strategyBean, boolean z9) {
        C6674al.m5106c("[Strategy] Notify %s", C6728s.class.getName());
        C6728s.m5439a(strategyBean, z9);
        for (AbstractC6724o abstractC6724o : this.f5803e) {
            try {
                C6674al.m5106c("[Strategy] Notify %s", abstractC6724o.getClass().getName());
                abstractC6724o.onServerStrategyChanged(strategyBean);
            } catch (Throwable th) {
                if (!C6674al.m5103a(th)) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m5033a(String str) {
        if (!C6678ap.m5165b(str) && C6678ap.m5173d(str)) {
            f5801i = str;
        } else {
            C6674al.m5107d("URL user set is invalid.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void m5038a(C6709bt c6709bt) throws NumberFormatException {
        int i9;
        if (c6709bt == null) {
            return;
        }
        StrategyBean strategyBean = this.f5805g;
        if (strategyBean == null || c6709bt.f6152h != strategyBean.f5626o) {
            StrategyBean strategyBean2 = new StrategyBean();
            strategyBean2.f5617f = c6709bt.f6145a;
            strategyBean2.f5619h = c6709bt.f6147c;
            strategyBean2.f5618g = c6709bt.f6146b;
            if (C6678ap.m5165b(f5801i) || !C6678ap.m5173d(f5801i)) {
                if (C6678ap.m5173d(c6709bt.f6148d)) {
                    C6674al.m5106c("[Strategy] Upload url changes to %s", c6709bt.f6148d);
                    strategyBean2.f5628q = c6709bt.f6148d;
                }
                if (C6678ap.m5173d(c6709bt.f6149e)) {
                    C6674al.m5106c("[Strategy] Exception upload url changes to %s", c6709bt.f6149e);
                    strategyBean2.f5629r = c6709bt.f6149e;
                }
            }
            C6708bs c6708bs = c6709bt.f6150f;
            if (c6708bs != null && !C6678ap.m5165b(c6708bs.f6140a)) {
                strategyBean2.f5630s = c6709bt.f6150f.f6140a;
            }
            long j9 = c6709bt.f6152h;
            if (j9 != 0) {
                strategyBean2.f5626o = j9;
            }
            Map<String, String> map = c6709bt.f6151g;
            if (map != null && map.size() > 0) {
                Map<String, String> map2 = c6709bt.f6151g;
                strategyBean2.f5631t = map2;
                String str = map2.get("B11");
                strategyBean2.f5620i = str != null && str.equals("1");
                String str2 = c6709bt.f6151g.get("B3");
                if (str2 != null) {
                    strategyBean2.f5634w = Long.parseLong(str2);
                }
                int i10 = c6709bt.f6156l;
                strategyBean2.f5627p = i10;
                strategyBean2.f5633v = i10;
                String str3 = c6709bt.f6151g.get("B27");
                if (str3 != null && str3.length() > 0) {
                    try {
                        int i11 = Integer.parseInt(str3);
                        if (i11 > 0) {
                            strategyBean2.f5632u = i11;
                        }
                    } catch (Exception e10) {
                        if (!C6674al.m5103a(e10)) {
                            e10.printStackTrace();
                        }
                    }
                }
                String str4 = c6709bt.f6151g.get("B25");
                strategyBean2.f5622k = str4 != null && str4.equals("1");
            }
            C6674al.m5102a("[Strategy] enableCrashReport:%b, enableQuery:%b, enableUserInfo:%b, enableAnr:%b, enableBlock:%b, enableSession:%b, enableSessionTimer:%b, sessionOverTime:%d, enableCocos:%b, strategyLastUpdateTime:%d", Boolean.valueOf(strategyBean2.f5617f), Boolean.valueOf(strategyBean2.f5619h), Boolean.valueOf(strategyBean2.f5618g), Boolean.valueOf(strategyBean2.f5620i), Boolean.valueOf(strategyBean2.f5621j), Boolean.valueOf(strategyBean2.f5624m), Boolean.valueOf(strategyBean2.f5625n), Long.valueOf(strategyBean2.f5627p), Boolean.valueOf(strategyBean2.f5622k), Long.valueOf(strategyBean2.f5626o));
            this.f5805g = strategyBean2;
            if (C6678ap.m5173d(c6709bt.f6148d)) {
                i9 = 0;
            } else {
                i9 = 0;
                C6674al.m5106c("[Strategy] download url is null", new Object[0]);
                this.f5805g.f5628q = "";
            }
            if (!C6678ap.m5173d(c6709bt.f6149e)) {
                C6674al.m5106c("[Strategy] download crashurl is null", new Object[i9]);
                this.f5805g.f5629r = "";
            }
            C6732w.m5475a().m5497b(2);
            C6734y c6734y = new C6734y();
            c6734y.f6290b = 2;
            c6734y.f6289a = strategyBean2.f5615d;
            c6734y.f6293e = strategyBean2.f5616e;
            c6734y.f6295g = C6678ap.m5154a(strategyBean2);
            C6732w.m5475a().m5496a(c6734y);
            m5037a(strategyBean2, true);
        }
    }
}
