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
public final class C4048ae {
    /* renamed from: a */
    public static C4093bu m2967a(UserInfoBean userInfoBean) {
        if (userInfoBean == null) {
            return null;
        }
        C4093bu c4093bu = new C4093bu();
        c4093bu.f3783a = userInfoBean.f3251e;
        c4093bu.f3787e = userInfoBean.f3256j;
        c4093bu.f3786d = userInfoBean.f3249c;
        c4093bu.f3785c = userInfoBean.f3250d;
        c4093bu.f3790h = userInfoBean.f3261o == 1;
        int i = userInfoBean.f3248b;
        if (i == 1) {
            c4093bu.f3784b = (byte) 1;
        } else if (i == 2) {
            c4093bu.f3784b = (byte) 4;
        } else if (i == 3) {
            c4093bu.f3784b = (byte) 2;
        } else if (i == 4) {
            c4093bu.f3784b = (byte) 3;
        } else if (i == 8) {
            c4093bu.f3784b = (byte) 8;
        } else {
            if (i < 10 || i >= 20) {
                C4055al.m3027e("unknown uinfo type %d ", Integer.valueOf(i));
                return null;
            }
            c4093bu.f3784b = (byte) i;
        }
        HashMap map = new HashMap();
        c4093bu.f3788f = map;
        if (userInfoBean.f3262p >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(userInfoBean.f3262p);
            map.put("C01", sb.toString());
        }
        if (userInfoBean.f3263q >= 0) {
            Map<String, String> map2 = c4093bu.f3788f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(userInfoBean.f3263q);
            map2.put("C02", sb2.toString());
        }
        Map<String, String> map3 = userInfoBean.f3264r;
        if (map3 != null && map3.size() > 0) {
            for (Map.Entry<String, String> entry : userInfoBean.f3264r.entrySet()) {
                c4093bu.f3788f.put("C03_" + entry.getKey(), entry.getValue());
            }
        }
        Map<String, String> map4 = userInfoBean.f3265s;
        if (map4 != null && map4.size() > 0) {
            for (Map.Entry<String, String> entry2 : userInfoBean.f3265s.entrySet()) {
                c4093bu.f3788f.put("C04_" + entry2.getKey(), entry2.getValue());
            }
        }
        Map<String, String> map5 = c4093bu.f3788f;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(true ^ userInfoBean.f3258l);
        map5.put("A36", sb3.toString());
        Map<String, String> map6 = c4093bu.f3788f;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(userInfoBean.f3253g);
        map6.put("F02", sb4.toString());
        Map<String, String> map7 = c4093bu.f3788f;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(userInfoBean.f3254h);
        map7.put("F03", sb5.toString());
        c4093bu.f3788f.put("F04", userInfoBean.f3256j);
        Map<String, String> map8 = c4093bu.f3788f;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(userInfoBean.f3255i);
        map8.put("F05", sb6.toString());
        c4093bu.f3788f.put("F06", userInfoBean.f3259m);
        Map<String, String> map9 = c4093bu.f3788f;
        StringBuilder sb7 = new StringBuilder();
        sb7.append(userInfoBean.f3257k);
        map9.put("F10", sb7.toString());
        C4055al.m3025c("summary type %d vm:%d", Byte.valueOf(c4093bu.f3784b), Integer.valueOf(c4093bu.f3788f.size()));
        return c4093bu;
    }

    /* renamed from: a */
    public static <T extends AbstractC4123m> T m2968a(byte[] bArr, Class<T> cls) {
        if (bArr != null && bArr.length > 0) {
            try {
                T tNewInstance = cls.newInstance();
                C4119k c4119k = new C4119k(bArr);
                c4119k.m3288a("utf-8");
                tNewInstance.mo3232a(c4119k);
                return tNewInstance;
            } catch (Throwable th) {
                if (!C4055al.m3024b(th)) {
                    th.printStackTrace();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C4089bq m2965a(Context context, int i, byte[] bArr) {
        String str;
        C4044aa c4044aaM2890b = C4044aa.m2890b();
        StrategyBean strategyBeanM2960c = C4046ac.m2951a().m2960c();
        if (c4044aaM2890b != null && strategyBeanM2960c != null) {
            try {
                C4089bq c4089bq = new C4089bq();
                synchronized (c4044aaM2890b) {
                    try {
                        c4089bq.f3731a = c4044aaM2890b.f3432b;
                        c4089bq.f3732b = c4044aaM2890b.m2903e();
                        c4089bq.f3733c = c4044aaM2890b.f3433c;
                        c4089bq.f3734d = c4044aaM2890b.f3445o;
                        c4089bq.f3735e = c4044aaM2890b.f3449s;
                        c4089bq.f3736f = c4044aaM2890b.f3438h;
                        c4089bq.f3737g = i;
                        if (bArr == null) {
                            bArr = "".getBytes();
                        }
                        c4089bq.f3738h = bArr;
                        c4089bq.f3739i = c4044aaM2890b.m2909h();
                        c4089bq.f3740j = c4044aaM2890b.f3441k;
                        c4089bq.f3741k = new HashMap();
                        c4089bq.f3742l = c4044aaM2890b.m2901d();
                        c4089bq.f3743m = strategyBeanM2960c.f3283o;
                        c4089bq.f3745o = c4044aaM2890b.m2907g();
                        c4089bq.f3746p = C4045ab.m2932c(context);
                        c4089bq.f3747q = System.currentTimeMillis();
                        c4089bq.f3749s = c4044aaM2890b.m2910i();
                        c4089bq.f3752v = c4044aaM2890b.m2907g();
                        c4089bq.f3753w = c4089bq.f3746p;
                        c4089bq.f3744n = "com.tencent.bugly";
                        c4089bq.f3741k.put("A26", c4044aaM2890b.m2919s());
                        Map<String, String> map = c4089bq.f3741k;
                        StringBuilder sb = new StringBuilder();
                        sb.append(C4044aa.m2883C());
                        map.put("A62", sb.toString());
                        Map<String, String> map2 = c4089bq.f3741k;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(C4044aa.m2884D());
                        map2.put("A63", sb2.toString());
                        Map<String, String> map3 = c4089bq.f3741k;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(c4044aaM2890b.f3391J);
                        map3.put("F11", sb3.toString());
                        Map<String, String> map4 = c4089bq.f3741k;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(c4044aaM2890b.f3390I);
                        map4.put("F12", sb4.toString());
                        c4089bq.f3741k.put("D3", c4044aaM2890b.f3447q);
                        List<AbstractC4127o> list = C4129p.f3863b;
                        if (list != null) {
                            for (AbstractC4127o abstractC4127o : list) {
                                String str2 = abstractC4127o.versionKey;
                                if (str2 != null && (str = abstractC4127o.version) != null) {
                                    c4089bq.f3741k.put(str2, str);
                                }
                            }
                        }
                        c4089bq.f3741k.put("G15", C4059ap.m3091d("G15", ""));
                        c4089bq.f3741k.put("G10", C4059ap.m3091d("G10", ""));
                        c4089bq.f3741k.put("D4", C4059ap.m3091d("D4", "0"));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Map<String, String> mapM2924x = c4044aaM2890b.m2924x();
                if (mapM2924x != null) {
                    for (Map.Entry<String, String> entry : mapM2924x.entrySet()) {
                        if (!TextUtils.isEmpty(entry.getValue())) {
                            c4089bq.f3741k.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                return c4089bq;
            } catch (Throwable th2) {
                if (!C4055al.m3024b(th2)) {
                    th2.printStackTrace();
                }
                return null;
            }
        }
        C4055al.m3027e("Can not create request pkg for parameters is invalid.", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static byte[] m2970a(Object obj) {
        try {
            C4101e c4101e = new C4101e();
            c4101e.mo3241b();
            c4101e.m3236a("utf-8");
            c4101e.m3243c();
            c4101e.m3242b("RqdServer");
            c4101e.m3244c("sync");
            c4101e.mo3237a("detail", obj);
            return c4101e.mo3239a();
        } catch (Throwable th) {
            if (C4055al.m3024b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static C4090br m2966a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            C4101e c4101e = new C4101e();
            c4101e.mo3241b();
            c4101e.m3236a("utf-8");
            c4101e.mo3238a(bArr);
            Object objM3240b = c4101e.m3240b("detail", new C4090br());
            if (C4090br.class.isInstance(objM3240b)) {
                return (C4090br) C4090br.class.cast(objM3240b);
            }
            return null;
        } catch (Throwable th) {
            if (C4055al.m3024b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m2969a(AbstractC4123m abstractC4123m) {
        try {
            C4121l c4121l = new C4121l();
            c4121l.m3309a("utf-8");
            abstractC4123m.mo3233a(c4121l);
            byte[] bArr = new byte[c4121l.f3848a.position()];
            System.arraycopy(c4121l.f3848a.array(), 0, bArr, 0, c4121l.f3848a.position());
            return bArr;
        } catch (Throwable th) {
            if (C4055al.m3024b(th)) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
