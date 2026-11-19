package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.ac */
/* loaded from: classes3.dex */
public final class C4046ac {

    /* renamed from: a */
    public static int f3460a = 1000;

    /* renamed from: b */
    public static long f3461b = 259200000;

    /* renamed from: d */
    private static C4046ac f3462d;

    /* renamed from: i */
    private static String f3463i;

    /* renamed from: c */
    public final C4054ak f3464c;

    /* renamed from: e */
    private final List<AbstractC4127o> f3465e;

    /* renamed from: f */
    private final StrategyBean f3466f;

    /* renamed from: g */
    private StrategyBean f3467g = null;

    /* renamed from: h */
    private Context f3468h;

    private C4046ac(Context context, List<AbstractC4127o> list) {
        this.f3468h = context;
        if (C4044aa.m2888a(context) != null) {
            String str = C4044aa.m2888a(context).f3389H;
            if ("oversea".equals(str)) {
                StrategyBean.f3269a = "https://astat.bugly.qcloud.com/rqd/async";
                StrategyBean.f3270b = "https://astat.bugly.qcloud.com/rqd/async";
            } else if ("na_https".equals(str)) {
                StrategyBean.f3269a = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
                StrategyBean.f3270b = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
            }
        }
        this.f3466f = new StrategyBean();
        this.f3465e = list;
        this.f3464c = C4054ak.m3012a();
    }

    /* renamed from: d */
    public static StrategyBean m2955d() {
        byte[] bArr;
        List<C4147y> listM3410a = C4143w.m3393a().m3410a(2);
        if (listM3410a == null || listM3410a.size() <= 0 || (bArr = listM3410a.get(0).f3915g) == null) {
            return null;
        }
        return (StrategyBean) C4059ap.m3055a(bArr, StrategyBean.CREATOR);
    }

    /* renamed from: c */
    public final StrategyBean m2960c() {
        StrategyBean strategyBean = this.f3467g;
        if (strategyBean != null) {
            if (!C4059ap.m3092d(strategyBean.f3285q)) {
                this.f3467g.f3285q = StrategyBean.f3269a;
            }
            if (!C4059ap.m3092d(this.f3467g.f3286r)) {
                this.f3467g.f3286r = StrategyBean.f3270b;
            }
            return this.f3467g;
        }
        if (!C4059ap.m3084b(f3463i) && C4059ap.m3092d(f3463i)) {
            StrategyBean strategyBean2 = this.f3466f;
            String str = f3463i;
            strategyBean2.f3285q = str;
            strategyBean2.f3286r = str;
        }
        return this.f3466f;
    }

    /* renamed from: b */
    public final synchronized boolean m2959b() {
        return this.f3467g != null;
    }

    /* renamed from: a */
    public static synchronized C4046ac m2952a(Context context, List<AbstractC4127o> list) {
        try {
            if (f3462d == null) {
                f3462d = new C4046ac(context, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3462d;
    }

    /* renamed from: a */
    public static synchronized C4046ac m2951a() {
        return f3462d;
    }

    /* renamed from: a */
    public final void m2957a(StrategyBean strategyBean, boolean z8) {
        C4055al.m3025c("[Strategy] Notify %s", C4135s.class.getName());
        C4135s.m3357a(strategyBean, z8);
        for (AbstractC4127o abstractC4127o : this.f3465e) {
            try {
                C4055al.m3025c("[Strategy] Notify %s", abstractC4127o.getClass().getName());
                abstractC4127o.onServerStrategyChanged(strategyBean);
            } catch (Throwable th) {
                if (!C4055al.m3022a(th)) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2953a(String str) {
        if (!C4059ap.m3084b(str) && C4059ap.m3092d(str)) {
            f3463i = str;
        } else {
            C4055al.m3026d("URL user set is invalid.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void m2958a(C4092bt c4092bt) throws NumberFormatException {
        int i;
        if (c4092bt == null) {
            return;
        }
        StrategyBean strategyBean = this.f3467g;
        if (strategyBean == null || c4092bt.f3777h != strategyBean.f3283o) {
            StrategyBean strategyBean2 = new StrategyBean();
            strategyBean2.f3274f = c4092bt.f3770a;
            strategyBean2.f3276h = c4092bt.f3772c;
            strategyBean2.f3275g = c4092bt.f3771b;
            if (C4059ap.m3084b(f3463i) || !C4059ap.m3092d(f3463i)) {
                if (C4059ap.m3092d(c4092bt.f3773d)) {
                    C4055al.m3025c("[Strategy] Upload url changes to %s", c4092bt.f3773d);
                    strategyBean2.f3285q = c4092bt.f3773d;
                }
                if (C4059ap.m3092d(c4092bt.f3774e)) {
                    C4055al.m3025c("[Strategy] Exception upload url changes to %s", c4092bt.f3774e);
                    strategyBean2.f3286r = c4092bt.f3774e;
                }
            }
            C4091bs c4091bs = c4092bt.f3775f;
            if (c4091bs != null && !C4059ap.m3084b(c4091bs.f3765a)) {
                strategyBean2.f3287s = c4092bt.f3775f.f3765a;
            }
            long j7 = c4092bt.f3777h;
            if (j7 != 0) {
                strategyBean2.f3283o = j7;
            }
            Map<String, String> map = c4092bt.f3776g;
            if (map != null && map.size() > 0) {
                Map<String, String> map2 = c4092bt.f3776g;
                strategyBean2.f3288t = map2;
                String str = map2.get("B11");
                strategyBean2.f3277i = str != null && str.equals("1");
                String str2 = c4092bt.f3776g.get("B3");
                if (str2 != null) {
                    strategyBean2.f3291w = Long.parseLong(str2);
                }
                int i8 = c4092bt.f3781l;
                strategyBean2.f3284p = i8;
                strategyBean2.f3290v = i8;
                String str3 = c4092bt.f3776g.get("B27");
                if (str3 != null && str3.length() > 0) {
                    try {
                        int i9 = Integer.parseInt(str3);
                        if (i9 > 0) {
                            strategyBean2.f3289u = i9;
                        }
                    } catch (Exception e) {
                        if (!C4055al.m3022a(e)) {
                            e.printStackTrace();
                        }
                    }
                }
                String str4 = c4092bt.f3776g.get("B25");
                strategyBean2.f3279k = str4 != null && str4.equals("1");
            }
            C4055al.m3021a("[Strategy] enableCrashReport:%b, enableQuery:%b, enableUserInfo:%b, enableAnr:%b, enableBlock:%b, enableSession:%b, enableSessionTimer:%b, sessionOverTime:%d, enableCocos:%b, strategyLastUpdateTime:%d", Boolean.valueOf(strategyBean2.f3274f), Boolean.valueOf(strategyBean2.f3276h), Boolean.valueOf(strategyBean2.f3275g), Boolean.valueOf(strategyBean2.f3277i), Boolean.valueOf(strategyBean2.f3278j), Boolean.valueOf(strategyBean2.f3281m), Boolean.valueOf(strategyBean2.f3282n), Long.valueOf(strategyBean2.f3284p), Boolean.valueOf(strategyBean2.f3279k), Long.valueOf(strategyBean2.f3283o));
            this.f3467g = strategyBean2;
            if (C4059ap.m3092d(c4092bt.f3773d)) {
                i = 0;
            } else {
                i = 0;
                C4055al.m3025c("[Strategy] download url is null", new Object[0]);
                this.f3467g.f3285q = "";
            }
            if (!C4059ap.m3092d(c4092bt.f3774e)) {
                C4055al.m3025c("[Strategy] download crashurl is null", new Object[i]);
                this.f3467g.f3286r = "";
            }
            C4143w.m3393a().m3415b(2);
            C4147y c4147y = new C4147y();
            c4147y.f3910b = 2;
            c4147y.f3909a = strategyBean2.f3272d;
            c4147y.f3913e = strategyBean2.f3273e;
            c4147y.f3915g = C4059ap.m3073a(strategyBean2);
            C4143w.m3393a().m3414a(c4147y);
            m2957a(strategyBean2, true);
        }
    }
}
