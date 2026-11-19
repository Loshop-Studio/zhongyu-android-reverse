package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.ae */
/* loaded from: classes5.dex */
public final class C7772ae {
    /* renamed from: a */
    public static C7815bu m10558a(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        C7815bu c7815bu = new C7815bu();
        c7815bu.f14023a = userInfoBean.f13459e;
        c7815bu.f14027e = userInfoBean.f13464j;
        c7815bu.f14026d = userInfoBean.f13457c;
        c7815bu.f14025c = userInfoBean.f13458d;
        c7815bu.f14030h = userInfoBean.f13469o == 1;
        int i10 = userInfoBean.f13456b;
        if (i10 == 1) {
            c7815bu.f14024b = (byte) 1;
        } else if (i10 == 2) {
            c7815bu.f14024b = (byte) 4;
        } else if (i10 == 3) {
            c7815bu.f14024b = (byte) 2;
        } else if (i10 == 4) {
            c7815bu.f14024b = (byte) 3;
        } else if (i10 == 8) {
            c7815bu.f14024b = (byte) 8;
        } else {
            if (i10 < 10 || i10 >= 20) {
                C7779al.m10619e("unknown uinfo type %d ", Integer.valueOf(i10));
                return null;
            }
            c7815bu.f14024b = (byte) i10;
        }
        HashMap map = new HashMap();
        c7815bu.f14028f = map;
        if (userInfoBean.f13470p >= 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(userInfoBean.f13470p);
            map.put("C01", sb2.toString());
        }
        if (userInfoBean.f13471q >= 0) {
            Map<String, String> map2 = c7815bu.f14028f;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(userInfoBean.f13471q);
            map2.put("C02", sb3.toString());
        }
        Map<String, String> map3 = userInfoBean.f13472r;
        if (map3 != null && map3.size() > 0) {
            for (Map.Entry<String, String> entry : userInfoBean.f13472r.entrySet()) {
                c7815bu.f14028f.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map4 = userInfoBean.f13473s;
        if (map4 != null && map4.size() > 0) {
            for (Map.Entry<String, String> entry2 : userInfoBean.f13473s.entrySet()) {
                c7815bu.f14028f.put("C04_" + entry2.getKey(), entry2.getValue());
            }
        }
        Map<String, String> map5 = c7815bu.f14028f;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(true ^ userInfoBean.f13466l);
        map5.put("A36", sb4.toString());
        Map<String, String> map6 = c7815bu.f14028f;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(userInfoBean.f13461g);
        map6.put("F02", sb5.toString());
        Map<String, String> map7 = c7815bu.f14028f;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(userInfoBean.f13462h);
        map7.put("F03", sb6.toString());
        c7815bu.f14028f.put("F04", userInfoBean.f13464j);
        Map<String, String> map8 = c7815bu.f14028f;
        StringBuilder sb7 = new StringBuilder();
        sb7.append(userInfoBean.f13463i);
        map8.put("F05", sb7.toString());
        c7815bu.f14028f.put("F06", userInfoBean.f13467m);
        Map<String, String> map9 = c7815bu.f14028f;
        StringBuilder sb8 = new StringBuilder();
        sb8.append(userInfoBean.f13465k);
        map9.put("F10", sb8.toString());
        C7779al.m10617c("summary type %d vm:%d", Byte.valueOf(c7815bu.f14024b), Integer.valueOf(c7815bu.f14028f.size()));
        return c7815bu;
    }

    /* renamed from: a */
    public static <T extends AbstractC7827m> T m10559a(byte[] bArr, Class<T> cls) {
        if (bArr != null && bArr.length > 0) {
            try {
                T tNewInstance = cls.newInstance();
                C7825k c7825k = new C7825k(bArr);
                c7825k.m10882a("utf-8");
                tNewInstance.mo10825a(c7825k);
                return tNewInstance;
            } catch (Throwable th) {
                if (!C7779al.m10616b(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C7811bq m10556a(Context context, int i10, byte[] bArr) {
        String str;
        C7768aa c7768aaM10480b = C7768aa.m10480b();
        StrategyBean strategyBeanM10551c = C7770ac.m10542a().m10551c();
        if (c7768aaM10480b != null && strategyBeanM10551c != null) {
            try {
                C7811bq c7811bq = new C7811bq();
                synchronized (c7768aaM10480b) {
                    try {
                        c7811bq.f13971a = c7768aaM10480b.f13635b;
                        c7811bq.f13972b = c7768aaM10480b.m10493e();
                        c7811bq.f13973c = c7768aaM10480b.f13636c;
                        c7811bq.f13974d = c7768aaM10480b.f13648o;
                        c7811bq.f13975e = c7768aaM10480b.f13652s;
                        c7811bq.f13976f = c7768aaM10480b.f13641h;
                        c7811bq.f13977g = i10;
                        if (bArr == null) {
                            bArr = "".getBytes();
                        }
                        c7811bq.f13978h = bArr;
                        c7811bq.f13979i = c7768aaM10480b.m10499h();
                        c7811bq.f13980j = c7768aaM10480b.f13644k;
                        c7811bq.f13981k = new HashMap();
                        c7811bq.f13982l = c7768aaM10480b.m10491d();
                        c7811bq.f13983m = strategyBeanM10551c.f13491o;
                        c7811bq.f13985o = c7768aaM10480b.m10497g();
                        c7811bq.f13986p = C7769ab.m10522c(context);
                        c7811bq.f13987q = System.currentTimeMillis();
                        c7811bq.f13989s = c7768aaM10480b.m10500i();
                        c7811bq.f13992v = c7768aaM10480b.m10497g();
                        c7811bq.f13993w = c7811bq.f13986p;
                        c7811bq.f13984n = "com.tencent.bugly";
                        c7811bq.f13981k.put("A26", c7768aaM10480b.m10509s());
                        Map<String, String> map = c7811bq.f13981k;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(C7768aa.m10473C());
                        map.put("A62", sb2.toString());
                        Map<String, String> map2 = c7811bq.f13981k;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(C7768aa.m10474D());
                        map2.put("A63", sb3.toString());
                        Map<String, String> map3 = c7811bq.f13981k;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(c7768aaM10480b.f13594J);
                        map3.put("F11", sb4.toString());
                        Map<String, String> map4 = c7811bq.f13981k;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(c7768aaM10480b.f13593I);
                        map4.put("F12", sb5.toString());
                        c7811bq.f13981k.put("D3", c7768aaM10480b.f13650q);
                        List<AbstractC7829o> list = C7830p.f14077b;
                        if (list != null) {
                            for (AbstractC7829o abstractC7829o : list) {
                                String str2 = abstractC7829o.versionKey;
                                if (str2 != null && (str = abstractC7829o.version) != null) {
                                    c7811bq.f13981k.put(str2, str);
                                }
                            }
                        }
                        c7811bq.f13981k.put("G15", C7783ap.m10683d("G15", ""));
                        c7811bq.f13981k.put("G10", C7783ap.m10683d("G10", ""));
                        c7811bq.f13981k.put("D4", C7783ap.m10683d("D4", "0"));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Map<String, String> mapM10514x = c7768aaM10480b.m10514x();
                if (mapM10514x != null) {
                    for (Map.Entry<String, String> entry : mapM10514x.entrySet()) {
                        if (!TextUtils.isEmpty(entry.getValue())) {
                            c7811bq.f13981k.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                return c7811bq;
            } catch (Throwable th2) {
                if (!C7779al.m10616b(th2)) {
                    th2.printStackTrace();
                }
                return null;
            }
        }
        C7779al.m10619e("Can not create request pkg for parameters is invalid.", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static byte[] m10561a(Object obj) {
        try {
            C7819e c7819e = new C7819e();
            c7819e.mo10835b();
            c7819e.mo10829a("utf-8");
            c7819e.m10837c();
            c7819e.m10836b("RqdServer");
            c7819e.m10838c("sync");
            c7819e.mo10830a("detail", obj);
            return c7819e.mo10832a();
        } catch (Throwable th) {
            if (C7779al.m10616b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static C7812br m10557a(byte[] bArr) {
        if (bArr != null) {
            try {
                C7819e c7819e = new C7819e();
                c7819e.mo10835b();
                c7819e.mo10829a("utf-8");
                c7819e.mo10831a(bArr);
                Object objM10834b = c7819e.m10834b("detail", (String) new C7812br());
                if (C7812br.class.isInstance(objM10834b)) {
                    return (C7812br) C7812br.class.cast(objM10834b);
                }
                return null;
            } catch (Throwable th) {
                if (!C7779al.m10616b(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m10560a(AbstractC7827m abstractC7827m) {
        try {
            C7826l c7826l = new C7826l();
            c7826l.m10903a("utf-8");
            abstractC7827m.mo10826a(c7826l);
            byte[] bArr = new byte[c7826l.f14071a.position()];
            System.arraycopy(c7826l.f14071a.array(), 0, bArr, 0, c7826l.f14071a.position());
            return bArr;
        } catch (Throwable th) {
            if (C7779al.m10616b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
