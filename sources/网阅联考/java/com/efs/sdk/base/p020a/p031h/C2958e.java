package com.efs.sdk.base.p020a.p031h;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;

/* renamed from: com.efs.sdk.base.a.h.e */
/* loaded from: classes2.dex */
public final class C2958e {
    /* renamed from: a */
    public static NetworkInfo m2215a(Context context) {
        NetworkInfo[] allNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                C2957d.m2213a("efs.base", "get CONNECTIVITY_SERVICE is null", null);
                return null;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if ((activeNetworkInfo != null && activeNetworkInfo.isConnected()) || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null) {
                return activeNetworkInfo;
            }
            for (int i4 = 0; i4 < allNetworkInfo.length; i4++) {
                NetworkInfo networkInfo = allNetworkInfo[i4];
                if (networkInfo != null && networkInfo.isConnected()) {
                    return allNetworkInfo[i4];
                }
            }
            return activeNetworkInfo;
        } catch (Throwable th) {
            C2957d.m2214b("efs.base", "get network info error", th);
            return null;
        }
    }

    /* renamed from: b */
    public static String m2216b(Context context) {
        if (m2218d(context)) {
            return "denied";
        }
        NetworkInfo networkInfoM2215a = m2215a(context);
        if (networkInfoM2215a == null) {
            return "disconnected";
        }
        if (networkInfoM2215a.getType() == 1) {
            return "wifi";
        }
        int subtype = networkInfoM2215a.getSubtype();
        if (subtype == 20) {
            return "5g";
        }
        switch (subtype) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2g";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3g";
            case 13:
                return "4g";
            default:
                String subtypeName = networkInfoM2215a.getSubtypeName();
                return TextUtils.isEmpty(subtypeName) ? EnvironmentCompat.MEDIA_UNKNOWN : (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? "3g" : subtypeName;
        }
    }

    /* renamed from: c */
    private static boolean m2217c(Context context) {
        return context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0;
    }

    /* renamed from: d */
    private static boolean m2218d(Context context) {
        return !m2217c(context);
    }
}
