package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.ac */
/* loaded from: classes4.dex */
public final class C6427ac {

    /* renamed from: a */
    public static int f4564a = 1000;

    /* renamed from: b */
    public static long f4565b = 259200000;

    /* renamed from: d */
    private static C6427ac f4566d;

    /* renamed from: i */
    private static String f4567i;

    /* renamed from: c */
    public final C6435ak f4568c;

    /* renamed from: e */
    private final List<AbstractC6486o> f4569e;

    /* renamed from: f */
    private final StrategyBean f4570f;

    /* renamed from: g */
    private StrategyBean f4571g = null;

    /* renamed from: h */
    private Context f4572h;

    private C6427ac(Context context, List<AbstractC6486o> list) {
        this.f4572h = context;
        if (C6425aa.m4148a(context) != null) {
            String str = C6425aa.m4148a(context).f4493H;
            if ("oversea".equals(str)) {
                StrategyBean.f4378a = "https://astat.bugly.qcloud.com/rqd/async";
                StrategyBean.f4379b = "https://astat.bugly.qcloud.com/rqd/async";
            } else if ("na_https".equals(str)) {
                StrategyBean.f4378a = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
                StrategyBean.f4379b = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
            }
        }
        this.f4570f = new StrategyBean();
        this.f4569e = list;
        this.f4568c = C6435ak.m4274a();
    }

    /* renamed from: d */
    public static StrategyBean m4216d() {
        byte[] bArr;
        List<C6496y> listM4673a = C6494w.m4656a().m4673a(2);
        if (listM4673a == null || listM4673a.size() <= 0 || (bArr = listM4673a.get(0).f5061g) == null) {
            return null;
        }
        return (StrategyBean) C6440ap.m4317a(bArr, StrategyBean.CREATOR);
    }

    /* renamed from: c */
    public final StrategyBean m4221c() {
        StrategyBean strategyBean = this.f4571g;
        if (strategyBean != null) {
            if (!C6440ap.m4354d(strategyBean.f4394q)) {
                this.f4571g.f4394q = StrategyBean.f4378a;
            }
            if (!C6440ap.m4354d(this.f4571g.f4395r)) {
                this.f4571g.f4395r = StrategyBean.f4379b;
            }
            return this.f4571g;
        }
        if (!C6440ap.m4346b(f4567i) && C6440ap.m4354d(f4567i)) {
            StrategyBean strategyBean2 = this.f4570f;
            String str = f4567i;
            strategyBean2.f4394q = str;
            strategyBean2.f4395r = str;
        }
        return this.f4570f;
    }

    /* renamed from: b */
    public final synchronized boolean m4220b() {
        return this.f4571g != null;
    }

    /* renamed from: a */
    public static synchronized C6427ac m4213a(Context context, List<AbstractC6486o> list) {
        try {
            if (f4566d == null) {
                f4566d = new C6427ac(context, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4566d;
    }

    /* renamed from: a */
    public static synchronized C6427ac m4212a() {
        return f4566d;
    }

    /* renamed from: a */
    public final void m4218a(StrategyBean strategyBean, boolean z10) {
        C6436al.m4287c("[Strategy] Notify %s", C6490s.class.getName());
        C6490s.m4620a(strategyBean, z10);
        for (AbstractC6486o abstractC6486o : this.f4569e) {
            try {
                C6436al.m4287c("[Strategy] Notify %s", abstractC6486o.getClass().getName());
                abstractC6486o.onServerStrategyChanged(strategyBean);
            } catch (Throwable th) {
                if (!C6436al.m4284a(th)) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m4214a(String str) {
        if (!C6440ap.m4346b(str) && C6440ap.m4354d(str)) {
            f4567i = str;
        } else {
            C6436al.m4288d("URL user set is invalid.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void m4219a(C6471bt c6471bt) throws NumberFormatException {
        int i10;
        if (c6471bt == null) {
            return;
        }
        StrategyBean strategyBean = this.f4571g;
        if (strategyBean == null || c6471bt.f4918h != strategyBean.f4392o) {
            StrategyBean strategyBean2 = new StrategyBean();
            strategyBean2.f4383f = c6471bt.f4911a;
            strategyBean2.f4385h = c6471bt.f4913c;
            strategyBean2.f4384g = c6471bt.f4912b;
            if (C6440ap.m4346b(f4567i) || !C6440ap.m4354d(f4567i)) {
                if (C6440ap.m4354d(c6471bt.f4914d)) {
                    C6436al.m4287c("[Strategy] Upload url changes to %s", c6471bt.f4914d);
                    strategyBean2.f4394q = c6471bt.f4914d;
                }
                if (C6440ap.m4354d(c6471bt.f4915e)) {
                    C6436al.m4287c("[Strategy] Exception upload url changes to %s", c6471bt.f4915e);
                    strategyBean2.f4395r = c6471bt.f4915e;
                }
            }
            C6470bs c6470bs = c6471bt.f4916f;
            if (c6470bs != null && !C6440ap.m4346b(c6470bs.f4906a)) {
                strategyBean2.f4396s = c6471bt.f4916f.f4906a;
            }
            long j10 = c6471bt.f4918h;
            if (j10 != 0) {
                strategyBean2.f4392o = j10;
            }
            Map<String, String> map = c6471bt.f4917g;
            if (map != null && map.size() > 0) {
                Map<String, String> map2 = c6471bt.f4917g;
                strategyBean2.f4397t = map2;
                String str = map2.get("B11");
                strategyBean2.f4386i = str != null && str.equals("1");
                String str2 = c6471bt.f4917g.get("B3");
                if (str2 != null) {
                    strategyBean2.f4400w = Long.parseLong(str2);
                }
                int i11 = c6471bt.f4922l;
                strategyBean2.f4393p = i11;
                strategyBean2.f4399v = i11;
                String str3 = c6471bt.f4917g.get("B27");
                if (str3 != null && str3.length() > 0) {
                    try {
                        int i12 = Integer.parseInt(str3);
                        if (i12 > 0) {
                            strategyBean2.f4398u = i12;
                        }
                    } catch (Exception e10) {
                        if (!C6436al.m4284a(e10)) {
                            e10.printStackTrace();
                        }
                    }
                }
                String str4 = c6471bt.f4917g.get("B25");
                strategyBean2.f4388k = str4 != null && str4.equals("1");
            }
            C6436al.m4283a("[Strategy] enableCrashReport:%b, enableQuery:%b, enableUserInfo:%b, enableAnr:%b, enableBlock:%b, enableSession:%b, enableSessionTimer:%b, sessionOverTime:%d, enableCocos:%b, strategyLastUpdateTime:%d", Boolean.valueOf(strategyBean2.f4383f), Boolean.valueOf(strategyBean2.f4385h), Boolean.valueOf(strategyBean2.f4384g), Boolean.valueOf(strategyBean2.f4386i), Boolean.valueOf(strategyBean2.f4387j), Boolean.valueOf(strategyBean2.f4390m), Boolean.valueOf(strategyBean2.f4391n), Long.valueOf(strategyBean2.f4393p), Boolean.valueOf(strategyBean2.f4388k), Long.valueOf(strategyBean2.f4392o));
            this.f4571g = strategyBean2;
            if (C6440ap.m4354d(c6471bt.f4914d)) {
                i10 = 0;
            } else {
                i10 = 0;
                C6436al.m4287c("[Strategy] download url is null", new Object[0]);
                this.f4571g.f4394q = "";
            }
            if (!C6440ap.m4354d(c6471bt.f4915e)) {
                C6436al.m4287c("[Strategy] download crashurl is null", new Object[i10]);
                this.f4571g.f4395r = "";
            }
            C6494w.m4656a().m4678b(2);
            C6496y c6496y = new C6496y();
            c6496y.f5056b = 2;
            c6496y.f5055a = strategyBean2.f4381d;
            c6496y.f5059e = strategyBean2.f4382e;
            c6496y.f5061g = C6440ap.m4335a(strategyBean2);
            C6494w.m4656a().m4677a(c6496y);
            m4218a(strategyBean2, true);
        }
    }
}
