package com.p074ta.p075a.p078c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.ta.a.c.d */
/* loaded from: classes5.dex */
public class C7583d {
    /* renamed from: b */
    public static boolean m9788b(Context context) {
        if (context == null) {
            return true;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
                return true;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception e10) {
            C7585f.m9795a("", e10, new Object[0]);
            return true;
        }
    }
}
