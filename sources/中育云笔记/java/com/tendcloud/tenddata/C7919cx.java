package com.tendcloud.tenddata;

import java.net.InetAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.tendcloud.tenddata.cx */
/* loaded from: classes5.dex */
public final class C7919cx {

    /* renamed from: a */
    private static final String f14644a = "https://dns.qq.com";

    /* renamed from: b */
    private static final String f14645b = "biYRrllT";

    /* renamed from: c */
    private static final String f14646c = "3658";

    /* renamed from: d */
    private static final String f14647d = "DES";

    /* renamed from: e */
    private static final String f14648e = "DES/ECB/PKCS5Padding";

    /* renamed from: f */
    private static final String f14649f = "utf-8";

    /* renamed from: g */
    private static final String f14650g = "TD_ts_cache_profile";

    /* renamed from: h */
    private static final long f14651h = 86400000;

    /* renamed from: i */
    private static Map<String, Integer> f14652i = new ConcurrentHashMap();

    /* renamed from: a */
    public static String m11651a(String str) {
        try {
            return m11655e(m11654d(new String(C7921cz.m11666a(C7921cz.m11665a().url(f14644a + "/d?dn=" + m11656f(str) + "&id=" + f14646c).method(EnumC7926dd.GET).build()).m11687c(), "utf-8")));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static int m11652b(String str) {
        try {
            if (f14652i.get(str) == null) {
                f14652i.put(str, 0);
            }
        } catch (Throwable unused) {
        }
        return f14652i.get(str).intValue();
    }

    /* renamed from: c */
    public static boolean m11653c(String str) {
        try {
            return System.currentTimeMillis() - C7906ck.m11568b(C7843ab.f14307g, f14650g, C7912cq.m11618e(str), 0L) <= 86400000;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static String m11654d(String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(f14645b.getBytes("utf-8"), f14647d);
            Cipher cipher = Cipher.getInstance(f14648e);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(C7912cq.m11616d(str)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static String m11655e(String str) {
        try {
            if (C7912cq.m11608b(str)) {
                return null;
            }
            for (String str2 : str.split(";")) {
                if (!m11657g(str2)) {
                    return str2;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static String m11656f(String str) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(f14645b.getBytes("utf-8"), f14647d);
            Cipher cipher = Cipher.getInstance(f14648e);
            cipher.init(1, secretKeySpec);
            return C7912cq.m11589a(cipher.doFinal(str.getBytes("utf-8")));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m11657g(String str) {
        try {
            InetAddress byAddress = InetAddress.getByAddress(InetAddress.getByName(str).getAddress());
            if (!byAddress.isSiteLocalAddress() && !byAddress.isLoopbackAddress()) {
                if (!byAddress.isAnyLocalAddress()) {
                    return false;
                }
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    public static void updateFailureCountWithHost(String str) {
        f14652i.put(str, Integer.valueOf(m11652b(str) + 1));
    }

    public static void updateTimeStamp(String str) {
        try {
            C7906ck.m11566a(C7843ab.f14307g, f14650g, C7912cq.m11618e(str), System.currentTimeMillis());
        } catch (Throwable unused) {
        }
    }
}
