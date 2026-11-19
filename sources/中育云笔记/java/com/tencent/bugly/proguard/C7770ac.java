package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.ac */
/* loaded from: classes5.dex */
public final class C7770ac {

    /* renamed from: a */
    public static int f13663a = 1000;

    /* renamed from: b */
    public static long f13664b = 259200000;

    /* renamed from: d */
    private static C7770ac f13665d;

    /* renamed from: i */
    private static String f13666i;

    /* renamed from: c */
    public final C7778ak f13667c;

    /* renamed from: e */
    private final List<AbstractC7829o> f13668e;

    /* renamed from: f */
    private final StrategyBean f13669f;

    /* renamed from: g */
    private StrategyBean f13670g = null;

    /* renamed from: h */
    private Context f13671h;

    private C7770ac(Context context, List<AbstractC7829o> list) {
        this.f13671h = context;
        if (C7768aa.m10478a(context) != null) {
            String str = C7768aa.m10478a(context).f13592H;
            if ("oversea".equals(str)) {
                StrategyBean.f13477a = "https://astat.bugly.qcloud.com/rqd/async";
                StrategyBean.f13478b = "https://astat.bugly.qcloud.com/rqd/async";
            } else if ("na_https".equals(str)) {
                StrategyBean.f13477a = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
                StrategyBean.f13478b = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
            }
        }
        this.f13669f = new StrategyBean();
        this.f13668e = list;
        this.f13667c = C7778ak.m10604a();
    }

    /* renamed from: d */
    public static StrategyBean m10546d() {
        byte[] bArr;
        List<C7839y> listM11003a = C7837w.m10986a().m11003a(2);
        if (listM11003a == null || listM11003a.size() <= 0 || (bArr = listM11003a.get(0).f14160g) == null) {
            return null;
        }
        return (StrategyBean) C7783ap.m10647a(bArr, StrategyBean.CREATOR);
    }

    /* renamed from: c */
    public final StrategyBean m10551c() {
        StrategyBean strategyBean = this.f13670g;
        if (strategyBean != null) {
            if (!C7783ap.m10684d(strategyBean.f13493q)) {
                this.f13670g.f13493q = StrategyBean.f13477a;
            }
            if (!C7783ap.m10684d(this.f13670g.f13494r)) {
                this.f13670g.f13494r = StrategyBean.f13478b;
            }
            return this.f13670g;
        }
        if (!C7783ap.m10676b(f13666i) && C7783ap.m10684d(f13666i)) {
            StrategyBean strategyBean2 = this.f13669f;
            String str = f13666i;
            strategyBean2.f13493q = str;
            strategyBean2.f13494r = str;
        }
        return this.f13669f;
    }

    /* renamed from: b */
    public final synchronized boolean m10550b() {
        return this.f13670g != null;
    }

    /* renamed from: a */
    public static synchronized C7770ac m10543a(Context context, List<AbstractC7829o> list) {
        try {
            if (f13665d == null) {
                f13665d = new C7770ac(context, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13665d;
    }

    /* renamed from: a */
    public static synchronized C7770ac m10542a() {
        return f13665d;
    }

    /* renamed from: a */
    public final void m10548a(StrategyBean strategyBean, boolean z10) {
        C7779al.m10617c("[Strategy] Notify %s", C7833s.class.getName());
        C7833s.m10950a(strategyBean, z10);
        for (AbstractC7829o abstractC7829o : this.f13668e) {
            try {
                C7779al.m10617c("[Strategy] Notify %s", abstractC7829o.getClass().getName());
                abstractC7829o.onServerStrategyChanged(strategyBean);
            } catch (Throwable th) {
                if (!C7779al.m10614a(th)) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m10544a(String str) {
        if (!C7783ap.m10676b(str) && C7783ap.m10684d(str)) {
            f13666i = str;
        } else {
            C7779al.m10618d("URL user set is invalid.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void m10549a(C7814bt c7814bt) throws NumberFormatException {
        int i10;
        if (c7814bt == null) {
            return;
        }
        StrategyBean strategyBean = this.f13670g;
        if (strategyBean == null || c7814bt.f14017h != strategyBean.f13491o) {
            StrategyBean strategyBean2 = new StrategyBean();
            strategyBean2.f13482f = c7814bt.f14010a;
            strategyBean2.f13484h = c7814bt.f14012c;
            strategyBean2.f13483g = c7814bt.f14011b;
            if (C7783ap.m10676b(f13666i) || !C7783ap.m10684d(f13666i)) {
                if (C7783ap.m10684d(c7814bt.f14013d)) {
                    C7779al.m10617c("[Strategy] Upload url changes to %s", c7814bt.f14013d);
                    strategyBean2.f13493q = c7814bt.f14013d;
                }
                if (C7783ap.m10684d(c7814bt.f14014e)) {
                    C7779al.m10617c("[Strategy] Exception upload url changes to %s", c7814bt.f14014e);
                    strategyBean2.f13494r = c7814bt.f14014e;
                }
            }
            C7813bs c7813bs = c7814bt.f14015f;
            if (c7813bs != null && !C7783ap.m10676b(c7813bs.f14005a)) {
                strategyBean2.f13495s = c7814bt.f14015f.f14005a;
            }
            long j10 = c7814bt.f14017h;
            if (j10 != 0) {
                strategyBean2.f13491o = j10;
            }
            Map<String, String> map = c7814bt.f14016g;
            if (map != null && map.size() > 0) {
                Map<String, String> map2 = c7814bt.f14016g;
                strategyBean2.f13496t = map2;
                String str = map2.get("B11");
                strategyBean2.f13485i = str != null && str.equals("1");
                String str2 = c7814bt.f14016g.get("B3");
                if (str2 != null) {
                    strategyBean2.f13499w = Long.parseLong(str2);
                }
                int i11 = c7814bt.f14021l;
                strategyBean2.f13492p = i11;
                strategyBean2.f13498v = i11;
                String str3 = c7814bt.f14016g.get("B27");
                if (str3 != null && str3.length() > 0) {
                    try {
                        int i12 = Integer.parseInt(str3);
                        if (i12 > 0) {
                            strategyBean2.f13497u = i12;
                        }
                    } catch (Exception e10) {
                        if (!C7779al.m10614a(e10)) {
                            e10.printStackTrace();
                        }
                    }
                }
                String str4 = c7814bt.f14016g.get("B25");
                strategyBean2.f13487k = str4 != null && str4.equals("1");
            }
            C7779al.m10613a("[Strategy] enableCrashReport:%b, enableQuery:%b, enableUserInfo:%b, enableAnr:%b, enableBlock:%b, enableSession:%b, enableSessionTimer:%b, sessionOverTime:%d, enableCocos:%b, strategyLastUpdateTime:%d", Boolean.valueOf(strategyBean2.f13482f), Boolean.valueOf(strategyBean2.f13484h), Boolean.valueOf(strategyBean2.f13483g), Boolean.valueOf(strategyBean2.f13485i), Boolean.valueOf(strategyBean2.f13486j), Boolean.valueOf(strategyBean2.f13489m), Boolean.valueOf(strategyBean2.f13490n), Long.valueOf(strategyBean2.f13492p), Boolean.valueOf(strategyBean2.f13487k), Long.valueOf(strategyBean2.f13491o));
            this.f13670g = strategyBean2;
            if (C7783ap.m10684d(c7814bt.f14013d)) {
                i10 = 0;
            } else {
                i10 = 0;
                C7779al.m10617c("[Strategy] download url is null", new Object[0]);
                this.f13670g.f13493q = "";
            }
            if (!C7783ap.m10684d(c7814bt.f14014e)) {
                C7779al.m10617c("[Strategy] download crashurl is null", new Object[i10]);
                this.f13670g.f13494r = "";
            }
            C7837w.m10986a().m11008b(2);
            C7839y c7839y = new C7839y();
            c7839y.f14155b = 2;
            c7839y.f14154a = strategyBean2.f13480d;
            c7839y.f14158e = strategyBean2.f13481e;
            c7839y.f14160g = C7783ap.m10665a(strategyBean2);
            C7837w.m10986a().m11007a(c7839y);
            m10548a(strategyBean2, true);
        }
    }
}
