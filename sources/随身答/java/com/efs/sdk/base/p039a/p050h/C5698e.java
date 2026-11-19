package com.efs.sdk.base.p039a.p050h;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;

/* renamed from: com.efs.sdk.base.a.h.e */
/* loaded from: classes3.dex */
public final class C5698e {
    /* renamed from: a */
    public static NetworkInfo m4184a(Context context) {
        NetworkInfo[] allNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                C5697d.m4182a("efs.base", "get CONNECTIVITY_SERVICE is null", null);
                return null;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if ((activeNetworkInfo == null || !activeNetworkInfo.isConnected()) && (allNetworkInfo = connectivityManager.getAllNetworkInfo()) != null) {
                for (int i9 = 0; i9 < allNetworkInfo.length; i9++) {
                    NetworkInfo networkInfo = allNetworkInfo[i9];
                    if (networkInfo != null && networkInfo.isConnected()) {
                        return allNetworkInfo[i9];
                    }
                }
            }
            return activeNetworkInfo;
        } catch (Throwable th) {
            C5697d.m4183b("efs.base", "get network info error", th);
            return null;
        }
    }

    /* renamed from: b */
    public static String m4185b(Context context) {
        if (m4187d(context)) {
            return "denied";
        }
        NetworkInfo networkInfoM4184a = m4184a(context);
        if (networkInfoM4184a == null) {
            return "disconnected";
        }
        if (networkInfoM4184a.getType() == 1) {
            return "wifi";
        }
        int subtype = networkInfoM4184a.getSubtype();
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
                String subtypeName = networkInfoM4184a.getSubtypeName();
                return TextUtils.isEmpty(subtypeName) ? EnvironmentCompat.MEDIA_UNKNOWN : (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? "3g" : subtypeName;
        }
    }

    /* renamed from: c */
    private static boolean m4186c(Context context) {
        return context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0;
    }

    /* renamed from: d */
    private static boolean m4187d(Context context) {
        return !m4186c(context);
    }
}
