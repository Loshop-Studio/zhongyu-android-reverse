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
public final class C6407ae {
    /* renamed from: a */
    public static C6450bu m4868a(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        C6450bu c6450bu = new C6450bu();
        c6450bu.f5581a = userInfoBean.f5017e;
        c6450bu.f5585e = userInfoBean.f5022j;
        c6450bu.f5584d = userInfoBean.f5015c;
        c6450bu.f5583c = userInfoBean.f5016d;
        c6450bu.f5588h = userInfoBean.f5027o == 1;
        int i10 = userInfoBean.f5014b;
        if (i10 == 1) {
            c6450bu.f5582b = (byte) 1;
        } else if (i10 == 2) {
            c6450bu.f5582b = (byte) 4;
        } else if (i10 == 3) {
            c6450bu.f5582b = (byte) 2;
        } else if (i10 == 4) {
            c6450bu.f5582b = (byte) 3;
        } else if (i10 == 8) {
            c6450bu.f5582b = (byte) 8;
        } else {
            if (i10 < 10 || i10 >= 20) {
                C6414al.m4929e("unknown uinfo type %d ", Integer.valueOf(i10));
                return null;
            }
            c6450bu.f5582b = (byte) i10;
        }
        HashMap map = new HashMap();
        c6450bu.f5586f = map;
        if (userInfoBean.f5028p >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(userInfoBean.f5028p);
            map.put("C01", sb.toString());
        }
        if (userInfoBean.f5029q >= 0) {
            Map<String, String> map2 = c6450bu.f5586f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(userInfoBean.f5029q);
            map2.put("C02", sb2.toString());
        }
        Map<String, String> map3 = userInfoBean.f5030r;
        if (map3 != null && map3.size() > 0) {
            for (Map.Entry<String, String> entry : userInfoBean.f5030r.entrySet()) {
                c6450bu.f5586f.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map4 = userInfoBean.f5031s;
        if (map4 != null && map4.size() > 0) {
            for (Map.Entry<String, String> entry2 : userInfoBean.f5031s.entrySet()) {
                c6450bu.f5586f.put("C04_" + entry2.getKey(), entry2.getValue());
            }
        }
        Map<String, String> map5 = c6450bu.f5586f;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(true ^ userInfoBean.f5024l);
        map5.put("A36", sb3.toString());
        Map<String, String> map6 = c6450bu.f5586f;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(userInfoBean.f5019g);
        map6.put("F02", sb4.toString());
        Map<String, String> map7 = c6450bu.f5586f;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(userInfoBean.f5020h);
        map7.put("F03", sb5.toString());
        c6450bu.f5586f.put("F04", userInfoBean.f5022j);
        Map<String, String> map8 = c6450bu.f5586f;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(userInfoBean.f5021i);
        map8.put("F05", sb6.toString());
        c6450bu.f5586f.put("F06", userInfoBean.f5025m);
        Map<String, String> map9 = c6450bu.f5586f;
        StringBuilder sb7 = new StringBuilder();
        sb7.append(userInfoBean.f5023k);
        map9.put("F10", sb7.toString());
        C6414al.m4927c("summary type %d vm:%d", Byte.valueOf(c6450bu.f5582b), Integer.valueOf(c6450bu.f5586f.size()));
        return c6450bu;
    }

    /* renamed from: a */
    public static <T extends AbstractC6462m> T m4869a(byte[] bArr, Class<T> cls) {
        if (bArr != null && bArr.length > 0) {
            try {
                T tNewInstance = cls.newInstance();
                C6460k c6460k = new C6460k(bArr);
                c6460k.m5192a("utf-8");
                tNewInstance.mo5135a(c6460k);
                return tNewInstance;
            } catch (Throwable th) {
                if (!C6414al.m4926b(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C6446bq m4866a(Context context, int i10, byte[] bArr) {
        String str;
        C6403aa c6403aaM4790b = C6403aa.m4790b();
        StrategyBean strategyBeanM4861c = C6405ac.m4852a().m4861c();
        if (c6403aaM4790b != null && strategyBeanM4861c != null) {
            try {
                C6446bq c6446bq = new C6446bq();
                synchronized (c6403aaM4790b) {
                    try {
                        c6446bq.f5529a = c6403aaM4790b.f5193b;
                        c6446bq.f5530b = c6403aaM4790b.m4803e();
                        c6446bq.f5531c = c6403aaM4790b.f5194c;
                        c6446bq.f5532d = c6403aaM4790b.f5206o;
                        c6446bq.f5533e = c6403aaM4790b.f5210s;
                        c6446bq.f5534f = c6403aaM4790b.f5199h;
                        c6446bq.f5535g = i10;
                        if (bArr == null) {
                            bArr = "".getBytes();
                        }
                        c6446bq.f5536h = bArr;
                        c6446bq.f5537i = c6403aaM4790b.m4809h();
                        c6446bq.f5538j = c6403aaM4790b.f5202k;
                        c6446bq.f5539k = new HashMap();
                        c6446bq.f5540l = c6403aaM4790b.m4801d();
                        c6446bq.f5541m = strategyBeanM4861c.f5049o;
                        c6446bq.f5543o = c6403aaM4790b.m4807g();
                        c6446bq.f5544p = C6404ab.m4832c(context);
                        c6446bq.f5545q = System.currentTimeMillis();
                        c6446bq.f5547s = c6403aaM4790b.m4810i();
                        c6446bq.f5550v = c6403aaM4790b.m4807g();
                        c6446bq.f5551w = c6446bq.f5544p;
                        c6446bq.f5542n = "com.tencent.bugly";
                        c6446bq.f5539k.put("A26", c6403aaM4790b.m4819s());
                        Map<String, String> map = c6446bq.f5539k;
                        StringBuilder sb = new StringBuilder();
                        sb.append(C6403aa.m4783C());
                        map.put("A62", sb.toString());
                        Map<String, String> map2 = c6446bq.f5539k;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(C6403aa.m4784D());
                        map2.put("A63", sb2.toString());
                        Map<String, String> map3 = c6446bq.f5539k;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(c6403aaM4790b.f5152J);
                        map3.put("F11", sb3.toString());
                        Map<String, String> map4 = c6446bq.f5539k;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(c6403aaM4790b.f5151I);
                        map4.put("F12", sb4.toString());
                        c6446bq.f5539k.put("D3", c6403aaM4790b.f5208q);
                        List<AbstractC6464o> list = C6465p.f5635b;
                        if (list != null) {
                            for (AbstractC6464o abstractC6464o : list) {
                                String str2 = abstractC6464o.versionKey;
                                if (str2 != null && (str = abstractC6464o.version) != null) {
                                    c6446bq.f5539k.put(str2, str);
                                }
                            }
                        }
                        c6446bq.f5539k.put("G15", C6418ap.m4993d("G15", ""));
                        c6446bq.f5539k.put("G10", C6418ap.m4993d("G10", ""));
                        c6446bq.f5539k.put("D4", C6418ap.m4993d("D4", "0"));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Map<String, String> mapM4824x = c6403aaM4790b.m4824x();
                if (mapM4824x != null) {
                    for (Map.Entry<String, String> entry : mapM4824x.entrySet()) {
                        if (!TextUtils.isEmpty(entry.getValue())) {
                            c6446bq.f5539k.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                return c6446bq;
            } catch (Throwable th2) {
                if (!C6414al.m4926b(th2)) {
                    th2.printStackTrace();
                }
                return null;
            }
        }
        C6414al.m4929e("Can not create request pkg for parameters is invalid.", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static byte[] m4871a(Object obj) {
        try {
            C6454e c6454e = new C6454e();
            c6454e.mo5145b();
            c6454e.mo5139a("utf-8");
            c6454e.m5147c();
            c6454e.m5146b("RqdServer");
            c6454e.m5148c("sync");
            c6454e.mo5140a("detail", (String) obj);
            return c6454e.mo5142a();
        } catch (Throwable th) {
            if (C6414al.m4926b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static C6447br m4867a(byte[] bArr) {
        if (bArr != null) {
            try {
                C6454e c6454e = new C6454e();
                c6454e.mo5145b();
                c6454e.mo5139a("utf-8");
                c6454e.mo5141a(bArr);
                Object objM5144b = c6454e.m5144b("detail", new C6447br());
                if (C6447br.class.isInstance(objM5144b)) {
                    return (C6447br) C6447br.class.cast(objM5144b);
                }
                return null;
            } catch (Throwable th) {
                if (!C6414al.m4926b(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m4870a(AbstractC6462m abstractC6462m) {
        try {
            C6461l c6461l = new C6461l();
            c6461l.m5213a("utf-8");
            abstractC6462m.mo5136a(c6461l);
            byte[] bArr = new byte[c6461l.f5629a.position()];
            System.arraycopy(c6461l.f5629a.array(), 0, bArr, 0, c6461l.f5629a.position());
            return bArr;
        } catch (Throwable th) {
            if (C6414al.m4926b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
