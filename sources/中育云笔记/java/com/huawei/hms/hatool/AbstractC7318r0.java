package com.huawei.hms.hatool;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p318r5.AbstractC10861f1;

/* renamed from: com.huawei.hms.hatool.r0 */
/* loaded from: classes5.dex */
public abstract class AbstractC7318r0 {

    /* renamed from: a */
    public static final int[] f11680a = {1, 6, 7, 9};

    /* renamed from: b */
    public static final int[] f11681b = {0, 2, 3, 4, 5};

    /* renamed from: c */
    public static final Map f11682c = new a();

    /* renamed from: com.huawei.hms.hatool.r0$a */
    public static class a extends HashMap<Integer, String> {
        public a() {
            put(1, "2G");
            put(2, "2G");
            put(4, "2G");
            put(7, "2G");
            put(11, "2G");
            put(3, "3G");
            put(8, "3G");
            put(9, "3G");
            put(10, "3G");
            put(15, "3G");
            put(5, "3G");
            put(6, "3G");
            put(12, "3G");
            put(14, "3G");
            put(13, "4G");
            if (Build.VERSION.SDK_INT >= 29) {
                put(20, "5G");
            }
        }
    }

    /* renamed from: a */
    public static NetworkInfo m8644a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                return connectivityManager.getActiveNetworkInfo();
            }
            return null;
        } catch (Throwable th) {
            AbstractC10861f1.m23433e("hmsSdk", "cannot get network state, ensure permission android.permission.ACCESS_NETWORK_STATE in the manifest: " + th.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public static String m8645b(int i10) {
        Map map = f11682c;
        String str = map.containsKey(Integer.valueOf(i10)) ? (String) map.get(Integer.valueOf(i10)) : "unknown";
        return (!"unknown".equals(str) || Build.VERSION.SDK_INT < 25) ? str : i10 != 16 ? i10 != 17 ? "unknown" : "3G" : "2G";
    }

    /* renamed from: c */
    public static boolean m8646c(NetworkInfo networkInfo) {
        return (networkInfo == null || Arrays.binarySearch(f11681b, networkInfo.getType()) == -1) ? false : true;
    }

    /* renamed from: d */
    public static String m8647d(Context context) {
        NetworkInfo networkInfoM8644a;
        if (context == null) {
            return "unknown";
        }
        try {
            networkInfoM8644a = m8644a(context);
        } catch (Throwable unused) {
        }
        if (!m8648e(networkInfoM8644a)) {
            return "none";
        }
        if (m8649f(networkInfoM8644a)) {
            return "WIFI";
        }
        if (m8646c(networkInfoM8644a)) {
            return m8645b(networkInfoM8644a.getSubtype());
        }
        return "unknown";
    }

    /* renamed from: e */
    public static boolean m8648e(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnected();
    }

    /* renamed from: f */
    public static boolean m8649f(NetworkInfo networkInfo) {
        return (networkInfo == null || Arrays.binarySearch(f11680a, networkInfo.getType()) == -1) ? false : true;
    }
}
