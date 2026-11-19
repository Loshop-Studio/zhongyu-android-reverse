package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.ae */
/* loaded from: classes4.dex */
public final class C6429ae {
    /* renamed from: a */
    public static C6472bu m4228a(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        C6472bu c6472bu = new C6472bu();
        c6472bu.f4924a = userInfoBean.f4360e;
        c6472bu.f4928e = userInfoBean.f4365j;
        c6472bu.f4927d = userInfoBean.f4358c;
        c6472bu.f4926c = userInfoBean.f4359d;
        c6472bu.f4931h = userInfoBean.f4370o == 1;
        int i10 = userInfoBean.f4357b;
        if (i10 == 1) {
            c6472bu.f4925b = (byte) 1;
        } else if (i10 == 2) {
            c6472bu.f4925b = (byte) 4;
        } else if (i10 == 3) {
            c6472bu.f4925b = (byte) 2;
        } else if (i10 == 4) {
            c6472bu.f4925b = (byte) 3;
        } else if (i10 == 8) {
            c6472bu.f4925b = (byte) 8;
        } else {
            if (i10 < 10 || i10 >= 20) {
                C6436al.m4289e("unknown uinfo type %d ", Integer.valueOf(i10));
                return null;
            }
            c6472bu.f4925b = (byte) i10;
        }
        HashMap map = new HashMap();
        c6472bu.f4929f = map;
        if (userInfoBean.f4371p >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(userInfoBean.f4371p);
            map.put("C01", sb.toString());
        }
        if (userInfoBean.f4372q >= 0) {
            Map<String, String> map2 = c6472bu.f4929f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(userInfoBean.f4372q);
            map2.put("C02", sb2.toString());
        }
        Map<String, String> map3 = userInfoBean.f4373r;
        if (map3 != null && map3.size() > 0) {
            for (Map.Entry<String, String> entry : userInfoBean.f4373r.entrySet()) {
                c6472bu.f4929f.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map4 = userInfoBean.f4374s;
        if (map4 != null && map4.size() > 0) {
            for (Map.Entry<String, String> entry2 : userInfoBean.f4374s.entrySet()) {
                c6472bu.f4929f.put("C04_" + entry2.getKey(), entry2.getValue());
            }
        }
        Map<String, String> map5 = c6472bu.f4929f;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(true ^ userInfoBean.f4367l);
        map5.put("A36", sb3.toString());
        Map<String, String> map6 = c6472bu.f4929f;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(userInfoBean.f4362g);
        map6.put("F02", sb4.toString());
        Map<String, String> map7 = c6472bu.f4929f;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(userInfoBean.f4363h);
        map7.put("F03", sb5.toString());
        c6472bu.f4929f.put("F04", userInfoBean.f4365j);
        Map<String, String> map8 = c6472bu.f4929f;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(userInfoBean.f4364i);
        map8.put("F05", sb6.toString());
        c6472bu.f4929f.put("F06", userInfoBean.f4368m);
        Map<String, String> map9 = c6472bu.f4929f;
        StringBuilder sb7 = new StringBuilder();
        sb7.append(userInfoBean.f4366k);
        map9.put("F10", sb7.toString());
        C6436al.m4287c("summary type %d vm:%d", Byte.valueOf(c6472bu.f4925b), Integer.valueOf(c6472bu.f4929f.size()));
        return c6472bu;
    }

    /* renamed from: a */
    public static <T extends AbstractC6484m> T m4229a(byte[] bArr, Class<T> cls) {
        if (bArr != null && bArr.length > 0) {
            try {
                T tNewInstance = cls.newInstance();
                C6482k c6482k = new C6482k(bArr);
                c6482k.m4552a("utf-8");
                tNewInstance.mo4495a(c6482k);
                return tNewInstance;
            } catch (Throwable th) {
                if (!C6436al.m4286b(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C6468bq m4226a(Context context, int i10, byte[] bArr) {
        String str;
        C6425aa c6425aaM4150b = C6425aa.m4150b();
        StrategyBean strategyBeanM4221c = C6427ac.m4212a().m4221c();
        if (c6425aaM4150b != null && strategyBeanM4221c != null) {
            try {
                C6468bq c6468bq = new C6468bq();
                synchronized (c6425aaM4150b) {
                    try {
                        c6468bq.f4872a = c6425aaM4150b.f4536b;
                        c6468bq.f4873b = c6425aaM4150b.m4163e();
                        c6468bq.f4874c = c6425aaM4150b.f4537c;
                        c6468bq.f4875d = c6425aaM4150b.f4549o;
                        c6468bq.f4876e = c6425aaM4150b.f4553s;
                        c6468bq.f4877f = c6425aaM4150b.f4542h;
                        c6468bq.f4878g = i10;
                        if (bArr == null) {
                            bArr = "".getBytes();
                        }
                        c6468bq.f4879h = bArr;
                        c6468bq.f4880i = c6425aaM4150b.m4169h();
                        c6468bq.f4881j = c6425aaM4150b.f4545k;
                        c6468bq.f4882k = new HashMap();
                        c6468bq.f4883l = c6425aaM4150b.m4161d();
                        c6468bq.f4884m = strategyBeanM4221c.f4392o;
                        c6468bq.f4886o = c6425aaM4150b.m4167g();
                        c6468bq.f4887p = C6426ab.m4192c(context);
                        c6468bq.f4888q = System.currentTimeMillis();
                        c6468bq.f4890s = c6425aaM4150b.m4170i();
                        c6468bq.f4893v = c6425aaM4150b.m4167g();
                        c6468bq.f4894w = c6468bq.f4887p;
                        c6468bq.f4885n = "com.tencent.bugly";
                        c6468bq.f4882k.put("A26", c6425aaM4150b.m4179s());
                        Map<String, String> map = c6468bq.f4882k;
                        StringBuilder sb = new StringBuilder();
                        sb.append(C6425aa.m4143C());
                        map.put("A62", sb.toString());
                        Map<String, String> map2 = c6468bq.f4882k;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(C6425aa.m4144D());
                        map2.put("A63", sb2.toString());
                        Map<String, String> map3 = c6468bq.f4882k;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(c6425aaM4150b.f4495J);
                        map3.put("F11", sb3.toString());
                        Map<String, String> map4 = c6468bq.f4882k;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(c6425aaM4150b.f4494I);
                        map4.put("F12", sb4.toString());
                        c6468bq.f4882k.put("D3", c6425aaM4150b.f4551q);
                        List<AbstractC6486o> list = C6487p.f4978b;
                        if (list != null) {
                            for (AbstractC6486o abstractC6486o : list) {
                                String str2 = abstractC6486o.versionKey;
                                if (str2 != null && (str = abstractC6486o.version) != null) {
                                    c6468bq.f4882k.put(str2, str);
                                }
                            }
                        }
                        c6468bq.f4882k.put("G15", C6440ap.m4353d("G15", ""));
                        c6468bq.f4882k.put("G10", C6440ap.m4353d("G10", ""));
                        c6468bq.f4882k.put("D4", C6440ap.m4353d("D4", "0"));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Map<String, String> mapM4184x = c6425aaM4150b.m4184x();
                if (mapM4184x != null) {
                    for (Map.Entry<String, String> entry : mapM4184x.entrySet()) {
                        if (!TextUtils.isEmpty(entry.getValue())) {
                            c6468bq.f4882k.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                return c6468bq;
            } catch (Throwable th2) {
                if (!C6436al.m4286b(th2)) {
                    th2.printStackTrace();
                }
                return null;
            }
        }
        C6436al.m4289e("Can not create request pkg for parameters is invalid.", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static byte[] m4231a(Object obj) {
        try {
            C6476e c6476e = new C6476e();
            c6476e.mo4505b();
            c6476e.mo4499a("utf-8");
            c6476e.m4507c();
            c6476e.m4506b("RqdServer");
            c6476e.m4508c("sync");
            c6476e.mo4500a("detail", (String) obj);
            return c6476e.mo4502a();
        } catch (Throwable th) {
            if (C6436al.m4286b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static C6469br m4227a(byte[] bArr) {
        if (bArr != null) {
            try {
                C6476e c6476e = new C6476e();
                c6476e.mo4505b();
                c6476e.mo4499a("utf-8");
                c6476e.mo4501a(bArr);
                Object objM4504b = c6476e.m4504b("detail", new C6469br());
                if (C6469br.class.isInstance(objM4504b)) {
                    return (C6469br) C6469br.class.cast(objM4504b);
                }
                return null;
            } catch (Throwable th) {
                if (!C6436al.m4286b(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m4230a(AbstractC6484m abstractC6484m) {
        try {
            C6483l c6483l = new C6483l();
            c6483l.m4573a("utf-8");
            abstractC6484m.mo4496a(c6483l);
            byte[] bArr = new byte[c6483l.f4972a.position()];
            System.arraycopy(c6483l.f4972a.array(), 0, bArr, 0, c6483l.f4972a.position());
            return bArr;
        } catch (Throwable th) {
            if (C6436al.m4286b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
