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
public final class C6667ae {
    /* renamed from: a */
    public static C6710bu m5047a(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        C6710bu c6710bu = new C6710bu();
        c6710bu.f6158a = userInfoBean.f5594e;
        c6710bu.f6162e = userInfoBean.f5599j;
        c6710bu.f6161d = userInfoBean.f5592c;
        c6710bu.f6160c = userInfoBean.f5593d;
        c6710bu.f6165h = userInfoBean.f5604o == 1;
        int i9 = userInfoBean.f5591b;
        if (i9 == 1) {
            c6710bu.f6159b = (byte) 1;
        } else if (i9 == 2) {
            c6710bu.f6159b = (byte) 4;
        } else if (i9 == 3) {
            c6710bu.f6159b = (byte) 2;
        } else if (i9 == 4) {
            c6710bu.f6159b = (byte) 3;
        } else if (i9 == 8) {
            c6710bu.f6159b = (byte) 8;
        } else {
            if (i9 < 10 || i9 >= 20) {
                C6674al.m5108e("unknown uinfo type %d ", Integer.valueOf(i9));
                return null;
            }
            c6710bu.f6159b = (byte) i9;
        }
        HashMap map = new HashMap();
        c6710bu.f6163f = map;
        if (userInfoBean.f5605p >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(userInfoBean.f5605p);
            map.put("C01", sb.toString());
        }
        if (userInfoBean.f5606q >= 0) {
            Map<String, String> map2 = c6710bu.f6163f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(userInfoBean.f5606q);
            map2.put("C02", sb2.toString());
        }
        Map<String, String> map3 = userInfoBean.f5607r;
        if (map3 != null && map3.size() > 0) {
            for (Map.Entry<String, String> entry : userInfoBean.f5607r.entrySet()) {
                c6710bu.f6163f.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map4 = userInfoBean.f5608s;
        if (map4 != null && map4.size() > 0) {
            for (Map.Entry<String, String> entry2 : userInfoBean.f5608s.entrySet()) {
                c6710bu.f6163f.put("C04_" + entry2.getKey(), entry2.getValue());
            }
        }
        Map<String, String> map5 = c6710bu.f6163f;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(true ^ userInfoBean.f5601l);
        map5.put("A36", sb3.toString());
        Map<String, String> map6 = c6710bu.f6163f;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(userInfoBean.f5596g);
        map6.put("F02", sb4.toString());
        Map<String, String> map7 = c6710bu.f6163f;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(userInfoBean.f5597h);
        map7.put("F03", sb5.toString());
        c6710bu.f6163f.put("F04", userInfoBean.f5599j);
        Map<String, String> map8 = c6710bu.f6163f;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(userInfoBean.f5598i);
        map8.put("F05", sb6.toString());
        c6710bu.f6163f.put("F06", userInfoBean.f5602m);
        Map<String, String> map9 = c6710bu.f6163f;
        StringBuilder sb7 = new StringBuilder();
        sb7.append(userInfoBean.f5600k);
        map9.put("F10", sb7.toString());
        C6674al.m5106c("summary type %d vm:%d", Byte.valueOf(c6710bu.f6159b), Integer.valueOf(c6710bu.f6163f.size()));
        return c6710bu;
    }

    /* renamed from: a */
    public static <T extends AbstractC6722m> T m5048a(byte[] bArr, Class<T> cls) {
        if (bArr != null && bArr.length > 0) {
            try {
                T tNewInstance = cls.newInstance();
                C6720k c6720k = new C6720k(bArr);
                c6720k.m5371a("utf-8");
                tNewInstance.mo5314a(c6720k);
                return tNewInstance;
            } catch (Throwable th) {
                if (!C6674al.m5105b(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C6706bq m5045a(Context context, int i9, byte[] bArr) {
        String str;
        C6663aa c6663aaM4969b = C6663aa.m4969b();
        StrategyBean strategyBeanM5040c = C6665ac.m5031a().m5040c();
        if (c6663aaM4969b != null && strategyBeanM5040c != null) {
            try {
                C6706bq c6706bq = new C6706bq();
                synchronized (c6663aaM4969b) {
                    try {
                        c6706bq.f6106a = c6663aaM4969b.f5770b;
                        c6706bq.f6107b = c6663aaM4969b.m4982e();
                        c6706bq.f6108c = c6663aaM4969b.f5771c;
                        c6706bq.f6109d = c6663aaM4969b.f5783o;
                        c6706bq.f6110e = c6663aaM4969b.f5787s;
                        c6706bq.f6111f = c6663aaM4969b.f5776h;
                        c6706bq.f6112g = i9;
                        if (bArr == null) {
                            bArr = "".getBytes();
                        }
                        c6706bq.f6113h = bArr;
                        c6706bq.f6114i = c6663aaM4969b.m4988h();
                        c6706bq.f6115j = c6663aaM4969b.f5779k;
                        c6706bq.f6116k = new HashMap();
                        c6706bq.f6117l = c6663aaM4969b.m4980d();
                        c6706bq.f6118m = strategyBeanM5040c.f5626o;
                        c6706bq.f6120o = c6663aaM4969b.m4986g();
                        c6706bq.f6121p = C6664ab.m5011c(context);
                        c6706bq.f6122q = System.currentTimeMillis();
                        c6706bq.f6124s = c6663aaM4969b.m4989i();
                        c6706bq.f6127v = c6663aaM4969b.m4986g();
                        c6706bq.f6128w = c6706bq.f6121p;
                        c6706bq.f6119n = "com.tencent.bugly";
                        c6706bq.f6116k.put("A26", c6663aaM4969b.m4998s());
                        Map<String, String> map = c6706bq.f6116k;
                        StringBuilder sb = new StringBuilder();
                        sb.append(C6663aa.m4962C());
                        map.put("A62", sb.toString());
                        Map<String, String> map2 = c6706bq.f6116k;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(C6663aa.m4963D());
                        map2.put("A63", sb2.toString());
                        Map<String, String> map3 = c6706bq.f6116k;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(c6663aaM4969b.f5729J);
                        map3.put("F11", sb3.toString());
                        Map<String, String> map4 = c6706bq.f6116k;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(c6663aaM4969b.f5728I);
                        map4.put("F12", sb4.toString());
                        c6706bq.f6116k.put("D3", c6663aaM4969b.f5785q);
                        List<AbstractC6724o> list = C6725p.f6212b;
                        if (list != null) {
                            for (AbstractC6724o abstractC6724o : list) {
                                String str2 = abstractC6724o.versionKey;
                                if (str2 != null && (str = abstractC6724o.version) != null) {
                                    c6706bq.f6116k.put(str2, str);
                                }
                            }
                        }
                        c6706bq.f6116k.put("G15", C6678ap.m5172d("G15", ""));
                        c6706bq.f6116k.put("G10", C6678ap.m5172d("G10", ""));
                        c6706bq.f6116k.put("D4", C6678ap.m5172d("D4", "0"));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Map<String, String> mapM5003x = c6663aaM4969b.m5003x();
                if (mapM5003x != null) {
                    for (Map.Entry<String, String> entry : mapM5003x.entrySet()) {
                        if (!TextUtils.isEmpty(entry.getValue())) {
                            c6706bq.f6116k.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                return c6706bq;
            } catch (Throwable th2) {
                if (!C6674al.m5105b(th2)) {
                    th2.printStackTrace();
                }
                return null;
            }
        }
        C6674al.m5108e("Can not create request pkg for parameters is invalid.", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static byte[] m5050a(Object obj) {
        try {
            C6714e c6714e = new C6714e();
            c6714e.mo5324b();
            c6714e.mo5318a("utf-8");
            c6714e.m5326c();
            c6714e.m5325b("RqdServer");
            c6714e.m5327c("sync");
            c6714e.mo5319a("detail", (String) obj);
            return c6714e.mo5321a();
        } catch (Throwable th) {
            if (C6674al.m5105b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static C6707br m5046a(byte[] bArr) {
        if (bArr != null) {
            try {
                C6714e c6714e = new C6714e();
                c6714e.mo5324b();
                c6714e.mo5318a("utf-8");
                c6714e.mo5320a(bArr);
                Object objM5323b = c6714e.m5323b("detail", new C6707br());
                if (C6707br.class.isInstance(objM5323b)) {
                    return (C6707br) C6707br.class.cast(objM5323b);
                }
                return null;
            } catch (Throwable th) {
                if (!C6674al.m5105b(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m5049a(AbstractC6722m abstractC6722m) {
        try {
            C6721l c6721l = new C6721l();
            c6721l.m5392a("utf-8");
            abstractC6722m.mo5315a(c6721l);
            byte[] bArr = new byte[c6721l.f6206a.position()];
            System.arraycopy(c6721l.f6206a.array(), 0, bArr, 0, c6721l.f6206a.position());
            return bArr;
        } catch (Throwable th) {
            if (C6674al.m5105b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
