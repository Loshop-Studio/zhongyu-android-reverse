package com.alibaba.sdk.android.push.common.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.alibaba.sdk.android.push.common.util.a */
/* loaded from: classes3.dex */
public class C5656a {
    /* renamed from: a */
    public static boolean m3627a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }
}
