package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.ae */
/* loaded from: classes3.dex */
public final class C5784ae {
    /* renamed from: a */
    public static C5827bu m3873a(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        C5827bu c5827bu = new C5827bu();
        c5827bu.f4302a = userInfoBean.f3738e;
        c5827bu.f4306e = userInfoBean.f3743j;
        c5827bu.f4305d = userInfoBean.f3736c;
        c5827bu.f4304c = userInfoBean.f3737d;
        c5827bu.f4309h = userInfoBean.f3748o == 1;
        int i6 = userInfoBean.f3735b;
        if (i6 == 1) {
            c5827bu.f4303b = (byte) 1;
        } else if (i6 == 2) {
            c5827bu.f4303b = (byte) 4;
        } else if (i6 == 3) {
            c5827bu.f4303b = (byte) 2;
        } else if (i6 == 4) {
            c5827bu.f4303b = (byte) 3;
        } else if (i6 == 8) {
            c5827bu.f4303b = (byte) 8;
        } else {
            if (i6 < 10 || i6 >= 20) {
                C5791al.m3934e("unknown uinfo type %d ", Integer.valueOf(i6));
                return null;
            }
            c5827bu.f4303b = (byte) i6;
        }
        HashMap map = new HashMap();
        c5827bu.f4307f = map;
        if (userInfoBean.f3749p >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(userInfoBean.f3749p);
            map.put("C01", sb.toString());
        }
        if (userInfoBean.f3750q >= 0) {
            Map<String, String> map2 = c5827bu.f4307f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(userInfoBean.f3750q);
            map2.put("C02", sb2.toString());
        }
        Map<String, String> map3 = userInfoBean.f3751r;
        if (map3 != null && map3.size() > 0) {
            for (Map.Entry<String, String> entry : userInfoBean.f3751r.entrySet()) {
                c5827bu.f4307f.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map4 = userInfoBean.f3752s;
        if (map4 != null && map4.size() > 0) {
            for (Map.Entry<String, String> entry2 : userInfoBean.f3752s.entrySet()) {
                c5827bu.f4307f.put("C04_" + entry2.getKey(), entry2.getValue());
            }
        }
        Map<String, String> map5 = c5827bu.f4307f;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(true ^ userInfoBean.f3745l);
        map5.put("A36", sb3.toString());
        Map<String, String> map6 = c5827bu.f4307f;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(userInfoBean.f3740g);
        map6.put("F02", sb4.toString());
        Map<String, String> map7 = c5827bu.f4307f;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(userInfoBean.f3741h);
        map7.put("F03", sb5.toString());
        c5827bu.f4307f.put("F04", userInfoBean.f3743j);
        Map<String, String> map8 = c5827bu.f4307f;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(userInfoBean.f3742i);
        map8.put("F05", sb6.toString());
        c5827bu.f4307f.put("F06", userInfoBean.f3746m);
        Map<String, String> map9 = c5827bu.f4307f;
        StringBuilder sb7 = new StringBuilder();
        sb7.append(userInfoBean.f3744k);
        map9.put("F10", sb7.toString());
        C5791al.m3932c("summary type %d vm:%d", Byte.valueOf(c5827bu.f4303b), Integer.valueOf(c5827bu.f4307f.size()));
        return c5827bu;
    }

    /* renamed from: a */
    public static <T extends AbstractC5839m> T m3874a(byte[] bArr, Class<T> cls) {
        if (bArr != null && bArr.length > 0) {
            try {
                T tNewInstance = cls.newInstance();
                C5837k c5837k = new C5837k(bArr);
                c5837k.m4197a("utf-8");
                tNewInstance.mo4140a(c5837k);
                return tNewInstance;
            } catch (Throwable th) {
                if (!C5791al.m3931b(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C5823bq m3871a(Context context, int i6, byte[] bArr) {
        String str;
        C5780aa c5780aaM3795b = C5780aa.m3795b();
        StrategyBean strategyBeanM3866c = C5782ac.m3857a().m3866c();
        if (c5780aaM3795b != null && strategyBeanM3866c != null) {
            try {
                C5823bq c5823bq = new C5823bq();
                synchronized (c5780aaM3795b) {
                    try {
                        c5823bq.f4250a = c5780aaM3795b.f3914b;
                        c5823bq.f4251b = c5780aaM3795b.m3808e();
                        c5823bq.f4252c = c5780aaM3795b.f3915c;
                        c5823bq.f4253d = c5780aaM3795b.f3927o;
                        c5823bq.f4254e = c5780aaM3795b.f3931s;
                        c5823bq.f4255f = c5780aaM3795b.f3920h;
                        c5823bq.f4256g = i6;
                        if (bArr == null) {
                            bArr = "".getBytes();
                        }
                        c5823bq.f4257h = bArr;
                        c5823bq.f4258i = c5780aaM3795b.m3814h();
                        c5823bq.f4259j = c5780aaM3795b.f3923k;
                        c5823bq.f4260k = new HashMap();
                        c5823bq.f4261l = c5780aaM3795b.m3806d();
                        c5823bq.f4262m = strategyBeanM3866c.f3770o;
                        c5823bq.f4264o = c5780aaM3795b.m3812g();
                        c5823bq.f4265p = C5781ab.m3837c(context);
                        c5823bq.f4266q = System.currentTimeMillis();
                        c5823bq.f4268s = c5780aaM3795b.m3815i();
                        c5823bq.f4271v = c5780aaM3795b.m3812g();
                        c5823bq.f4272w = c5823bq.f4265p;
                        c5823bq.f4263n = "com.tencent.bugly";
                        c5823bq.f4260k.put("A26", c5780aaM3795b.m3824s());
                        Map<String, String> map = c5823bq.f4260k;
                        StringBuilder sb = new StringBuilder();
                        sb.append(C5780aa.m3788C());
                        map.put("A62", sb.toString());
                        Map<String, String> map2 = c5823bq.f4260k;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(C5780aa.m3789D());
                        map2.put("A63", sb2.toString());
                        Map<String, String> map3 = c5823bq.f4260k;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(c5780aaM3795b.f3873J);
                        map3.put("F11", sb3.toString());
                        Map<String, String> map4 = c5823bq.f4260k;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(c5780aaM3795b.f3872I);
                        map4.put("F12", sb4.toString());
                        c5823bq.f4260k.put("D3", c5780aaM3795b.f3929q);
                        List<AbstractC5841o> list = C5842p.f4356b;
                        if (list != null) {
                            for (AbstractC5841o abstractC5841o : list) {
                                String str2 = abstractC5841o.versionKey;
                                if (str2 != null && (str = abstractC5841o.version) != null) {
                                    c5823bq.f4260k.put(str2, str);
                                }
                            }
                        }
                        c5823bq.f4260k.put("G15", C5795ap.m3998d("G15", ""));
                        c5823bq.f4260k.put("G10", C5795ap.m3998d("G10", ""));
                        c5823bq.f4260k.put("D4", C5795ap.m3998d("D4", "0"));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Map<String, String> mapM3829x = c5780aaM3795b.m3829x();
                if (mapM3829x != null) {
                    for (Map.Entry<String, String> entry : mapM3829x.entrySet()) {
                        if (!TextUtils.isEmpty(entry.getValue())) {
                            c5823bq.f4260k.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                return c5823bq;
            } catch (Throwable th2) {
                if (!C5791al.m3931b(th2)) {
                    th2.printStackTrace();
                }
                return null;
            }
        }
        C5791al.m3934e("Can not create request pkg for parameters is invalid.", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static byte[] m3876a(Object obj) {
        try {
            C5831e c5831e = new C5831e();
            c5831e.mo4150b();
            c5831e.mo4144a("utf-8");
            c5831e.m4152c();
            c5831e.m4151b("RqdServer");
            c5831e.m4153c("sync");
            c5831e.mo4145a("detail", (String) obj);
            return c5831e.mo4147a();
        } catch (Throwable th) {
            if (C5791al.m3931b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static C5824br m3872a(byte[] bArr) {
        if (bArr != null) {
            try {
                C5831e c5831e = new C5831e();
                c5831e.mo4150b();
                c5831e.mo4144a("utf-8");
                c5831e.mo4146a(bArr);
                Object objM4149b = c5831e.m4149b("detail", new C5824br());
                if (C5824br.class.isInstance(objM4149b)) {
                    return (C5824br) C5824br.class.cast(objM4149b);
                }
                return null;
            } catch (Throwable th) {
                if (!C5791al.m3931b(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m3875a(AbstractC5839m abstractC5839m) {
        try {
            C5838l c5838l = new C5838l();
            c5838l.m4218a("utf-8");
            abstractC5839m.mo4141a(c5838l);
            byte[] bArr = new byte[c5838l.f4350a.position()];
            System.arraycopy(c5838l.f4350a.array(), 0, bArr, 0, c5838l.f4350a.position());
            return bArr;
        } catch (Throwable th) {
            if (C5791al.m3931b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
