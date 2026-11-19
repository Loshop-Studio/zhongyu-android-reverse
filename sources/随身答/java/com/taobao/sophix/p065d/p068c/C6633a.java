package com.taobao.sophix.p065d.p068c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.taobao.sophix.p060b.C6622b;

/* renamed from: com.taobao.sophix.d.c.a */
/* loaded from: classes4.dex */
public class C6633a {

    /* renamed from: a */
    private int f5533a;

    /* renamed from: b */
    private String f5534b;

    /* renamed from: c */
    private String f5535c;

    /* renamed from: com.taobao.sophix.d.c.a$a */
    public static final class a {

        /* renamed from: a */
        private static final C6633a f5536a = new C6633a();
    }

    /* renamed from: a */
    public static C6633a m4848a() {
        return a.f5536a;
    }

    /* renamed from: e */
    private String m4852e(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) C6622b.f5489b.getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getBSSID();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    private int m4853f(Context context) {
        ConnectivityManager connectivityManager;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception unused) {
        }
        if (connectivityManager == null) {
            return 0;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
            if (activeNetworkInfo.getType() != 0) {
                return 0;
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 2;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 15:
                    return 3;
                case 12:
                case 14:
                default:
                    return 0;
                case 13:
                    return 4;
            }
        }
        return 255;
    }

    /* renamed from: b */
    public String m4855b() {
        return this.f5534b;
    }

    /* renamed from: c */
    public int m4856c() {
        return this.f5533a;
    }

    /* renamed from: d */
    public String m4857d() {
        int iM4856c = m4848a().m4856c();
        return iM4856c != 1 ? iM4856c != 2 ? iM4856c != 3 ? iM4856c != 4 ? "UNKNOWN" : "4G" : "3G" : "2G" : "WIFI";
    }

    private C6633a() {
        this.f5533a = 0;
        this.f5534b = "UNKNOWN";
        this.f5535c = "UNKNOWN";
    }

    /* renamed from: b */
    private void m4849b(Context context) {
        int iM4853f = m4853f(context);
        this.f5533a = iM4853f;
        if (iM4853f == 1) {
            this.f5534b = m4851d(context);
            this.f5535c = m4852e(context);
        } else if (iM4853f == 2 || iM4853f == 3 || iM4853f == 4) {
            this.f5534b = m4850c(context);
        }
        if (TextUtils.isEmpty(this.f5534b)) {
            this.f5534b = "UNKNOWN";
        }
    }

    /* renamed from: c */
    private String m4850c(Context context) {
        try {
            String simOperator = ((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getSimOperator();
            if (!TextUtils.isEmpty(simOperator)) {
                return simOperator;
            }
        } catch (Throwable unused) {
        }
        return String.valueOf(0);
    }

    /* renamed from: a */
    public void m4854a(Context context) {
        m4849b(context);
    }

    /* renamed from: d */
    private String m4851d(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) C6622b.f5489b.getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getSSID();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
