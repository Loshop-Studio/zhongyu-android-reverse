package com.efs.sdk.base.p035a.p046h;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.taobao.accs.utl.UtilityImpl;

/* renamed from: com.efs.sdk.base.a.h.e */
/* loaded from: classes.dex */
public final class C1330e {
    /* renamed from: a */
    public static NetworkInfo m5574a(Context context) {
        NetworkInfo[] allNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                C1329d.m5572a("efs.base", "get CONNECTIVITY_SERVICE is null", null);
                return null;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if ((activeNetworkInfo != null && activeNetworkInfo.isConnected()) || (allNetworkInfo = connectivityManager.getAllNetworkInfo()) == null) {
                return activeNetworkInfo;
            }
            for (int i4 = 0; i4 < allNetworkInfo.length; i4++) {
                if (allNetworkInfo[i4] != null && allNetworkInfo[i4].isConnected()) {
                    return allNetworkInfo[i4];
                }
            }
            return activeNetworkInfo;
        } catch (Throwable th) {
            C1329d.m5573b("efs.base", "get network info error", th);
            return null;
        }
    }

    /* renamed from: b */
    public static String m5575b(Context context) {
        if (m5577d(context)) {
            return "denied";
        }
        NetworkInfo networkInfoM5574a = m5574a(context);
        if (networkInfoM5574a == null) {
            return "disconnected";
        }
        if (networkInfoM5574a.getType() == 1) {
            return UtilityImpl.NET_TYPE_WIFI;
        }
        int subtype = networkInfoM5574a.getSubtype();
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
                String subtypeName = networkInfoM5574a.getSubtypeName();
                return TextUtils.isEmpty(subtypeName) ? UtilityImpl.NET_TYPE_UNKNOWN : (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? "3g" : subtypeName;
        }
    }

    /* renamed from: c */
    private static boolean m5576c(Context context) {
        return context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0;
    }

    /* renamed from: d */
    private static boolean m5577d(Context context) {
        return !m5576c(context);
    }
}
