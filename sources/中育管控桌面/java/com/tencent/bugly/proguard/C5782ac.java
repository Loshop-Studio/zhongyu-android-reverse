package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.ac */
/* loaded from: classes3.dex */
public final class C5782ac {

    /* renamed from: a */
    public static int f3942a = 1000;

    /* renamed from: b */
    public static long f3943b = 259200000;

    /* renamed from: d */
    private static C5782ac f3944d;

    /* renamed from: i */
    private static String f3945i;

    /* renamed from: c */
    public final C5790ak f3946c;

    /* renamed from: e */
    private final List<AbstractC5841o> f3947e;

    /* renamed from: f */
    private final StrategyBean f3948f;

    /* renamed from: g */
    private StrategyBean f3949g = null;

    /* renamed from: h */
    private Context f3950h;

    private C5782ac(Context context, List<AbstractC5841o> list) {
        this.f3950h = context;
        if (C5780aa.m3793a(context) != null) {
            String str = C5780aa.m3793a(context).f3871H;
            if ("oversea".equals(str)) {
                StrategyBean.f3756a = "https://astat.bugly.qcloud.com/rqd/async";
                StrategyBean.f3757b = "https://astat.bugly.qcloud.com/rqd/async";
            } else if ("na_https".equals(str)) {
                StrategyBean.f3756a = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
                StrategyBean.f3757b = "https://astat.bugly.cros.wr.pvp.net/:8180/rqd/async";
            }
        }
        this.f3948f = new StrategyBean();
        this.f3947e = list;
        this.f3946c = C5790ak.m3919a();
    }

    /* renamed from: d */
    public static StrategyBean m3861d() {
        byte[] bArr;
        List<C5851y> listM4318a = C5849w.m4301a().m4318a(2);
        if (listM4318a == null || listM4318a.size() <= 0 || (bArr = listM4318a.get(0).f4439g) == null) {
            return null;
        }
        return (StrategyBean) C5795ap.m3962a(bArr, StrategyBean.CREATOR);
    }

    /* renamed from: c */
    public final StrategyBean m3866c() {
        StrategyBean strategyBean = this.f3949g;
        if (strategyBean != null) {
            if (!C5795ap.m3999d(strategyBean.f3772q)) {
                this.f3949g.f3772q = StrategyBean.f3756a;
            }
            if (!C5795ap.m3999d(this.f3949g.f3773r)) {
                this.f3949g.f3773r = StrategyBean.f3757b;
            }
            return this.f3949g;
        }
        if (!C5795ap.m3991b(f3945i) && C5795ap.m3999d(f3945i)) {
            StrategyBean strategyBean2 = this.f3948f;
            String str = f3945i;
            strategyBean2.f3772q = str;
            strategyBean2.f3773r = str;
        }
        return this.f3948f;
    }

    /* renamed from: b */
    public final synchronized boolean m3865b() {
        return this.f3949g != null;
    }

    /* renamed from: a */
    public static synchronized C5782ac m3858a(Context context, List<AbstractC5841o> list) {
        try {
            if (f3944d == null) {
                f3944d = new C5782ac(context, list);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3944d;
    }

    /* renamed from: a */
    public static synchronized C5782ac m3857a() {
        return f3944d;
    }

    /* renamed from: a */
    public final void m3863a(StrategyBean strategyBean, boolean z6) {
        C5791al.m3932c("[Strategy] Notify %s", C5845s.class.getName());
        C5845s.m4265a(strategyBean, z6);
        for (AbstractC5841o abstractC5841o : this.f3947e) {
            try {
                C5791al.m3932c("[Strategy] Notify %s", abstractC5841o.getClass().getName());
                abstractC5841o.onServerStrategyChanged(strategyBean);
            } catch (Throwable th) {
                if (!C5791al.m3929a(th)) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3859a(String str) {
        if (!C5795ap.m3991b(str) && C5795ap.m3999d(str)) {
            f3945i = str;
        } else {
            C5791al.m3933d("URL user set is invalid.", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void m3864a(C5826bt c5826bt) throws NumberFormatException {
        int i6;
        if (c5826bt == null) {
            return;
        }
        StrategyBean strategyBean = this.f3949g;
        if (strategyBean == null || c5826bt.f4296h != strategyBean.f3770o) {
            StrategyBean strategyBean2 = new StrategyBean();
            strategyBean2.f3761f = c5826bt.f4289a;
            strategyBean2.f3763h = c5826bt.f4291c;
            strategyBean2.f3762g = c5826bt.f4290b;
            if (C5795ap.m3991b(f3945i) || !C5795ap.m3999d(f3945i)) {
                if (C5795ap.m3999d(c5826bt.f4292d)) {
                    C5791al.m3932c("[Strategy] Upload url changes to %s", c5826bt.f4292d);
                    strategyBean2.f3772q = c5826bt.f4292d;
                }
                if (C5795ap.m3999d(c5826bt.f4293e)) {
                    C5791al.m3932c("[Strategy] Exception upload url changes to %s", c5826bt.f4293e);
                    strategyBean2.f3773r = c5826bt.f4293e;
                }
            }
            C5825bs c5825bs = c5826bt.f4294f;
            if (c5825bs != null && !C5795ap.m3991b(c5825bs.f4284a)) {
                strategyBean2.f3774s = c5826bt.f4294f.f4284a;
            }
            long j6 = c5826bt.f4296h;
            if (j6 != 0) {
                strategyBean2.f3770o = j6;
            }
            Map<String, String> map = c5826bt.f4295g;
            if (map != null && map.size() > 0) {
                Map<String, String> map2 = c5826bt.f4295g;
                strategyBean2.f3775t = map2;
                String str = map2.get("B11");
                strategyBean2.f3764i = str != null && str.equals("1");
                String str2 = c5826bt.f4295g.get("B3");
                if (str2 != null) {
                    strategyBean2.f3778w = Long.parseLong(str2);
                }
                int i7 = c5826bt.f4300l;
                strategyBean2.f3771p = i7;
                strategyBean2.f3777v = i7;
                String str3 = c5826bt.f4295g.get("B27");
                if (str3 != null && str3.length() > 0) {
                    try {
                        int i8 = Integer.parseInt(str3);
                        if (i8 > 0) {
                            strategyBean2.f3776u = i8;
                        }
                    } catch (Exception e6) {
                        if (!C5791al.m3929a(e6)) {
                            e6.printStackTrace();
                        }
                    }
                }
                String str4 = c5826bt.f4295g.get("B25");
                strategyBean2.f3766k = str4 != null && str4.equals("1");
            }
            C5791al.m3928a("[Strategy] enableCrashReport:%b, enableQuery:%b, enableUserInfo:%b, enableAnr:%b, enableBlock:%b, enableSession:%b, enableSessionTimer:%b, sessionOverTime:%d, enableCocos:%b, strategyLastUpdateTime:%d", Boolean.valueOf(strategyBean2.f3761f), Boolean.valueOf(strategyBean2.f3763h), Boolean.valueOf(strategyBean2.f3762g), Boolean.valueOf(strategyBean2.f3764i), Boolean.valueOf(strategyBean2.f3765j), Boolean.valueOf(strategyBean2.f3768m), Boolean.valueOf(strategyBean2.f3769n), Long.valueOf(strategyBean2.f3771p), Boolean.valueOf(strategyBean2.f3766k), Long.valueOf(strategyBean2.f3770o));
            this.f3949g = strategyBean2;
            if (C5795ap.m3999d(c5826bt.f4292d)) {
                i6 = 0;
            } else {
                i6 = 0;
                C5791al.m3932c("[Strategy] download url is null", new Object[0]);
                this.f3949g.f3772q = "";
            }
            if (!C5795ap.m3999d(c5826bt.f4293e)) {
                C5791al.m3932c("[Strategy] download crashurl is null", new Object[i6]);
                this.f3949g.f3773r = "";
            }
            C5849w.m4301a().m4323b(2);
            C5851y c5851y = new C5851y();
            c5851y.f4434b = 2;
            c5851y.f4433a = strategyBean2.f3759d;
            c5851y.f4437e = strategyBean2.f3760e;
            c5851y.f4439g = C5795ap.m3980a(strategyBean2);
            C5849w.m4301a().m4322a(c5851y);
            m3863a(strategyBean2, true);
        }
    }
}
