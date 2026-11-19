package com.taobao.sophix.p048d.p051c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.taobao.sophix.p043b.C6362b;

/* renamed from: com.taobao.sophix.d.c.a */
/* loaded from: classes4.dex */
public class C6373a {

    /* renamed from: a */
    private int f4956a;

    /* renamed from: b */
    private String f4957b;

    /* renamed from: c */
    private String f4958c;

    /* renamed from: com.taobao.sophix.d.c.a$a */
    public static final class a {

        /* renamed from: a */
        private static final C6373a f4959a = new C6373a();
    }

    /* renamed from: a */
    public static C6373a m4669a() {
        return a.f4959a;
    }

    /* renamed from: e */
    private String m4673e(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) C6362b.f4912b.getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getBSSID();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    private int m4674f(Context context) {
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
    public String m4676b() {
        return this.f4957b;
    }

    /* renamed from: c */
    public int m4677c() {
        return this.f4956a;
    }

    /* renamed from: d */
    public String m4678d() {
        int iM4677c = m4669a().m4677c();
        return iM4677c != 1 ? iM4677c != 2 ? iM4677c != 3 ? iM4677c != 4 ? "UNKNOWN" : "4G" : "3G" : "2G" : "WIFI";
    }

    private C6373a() {
        this.f4956a = 0;
        this.f4957b = "UNKNOWN";
        this.f4958c = "UNKNOWN";
    }

    /* renamed from: b */
    private void m4670b(Context context) {
        int iM4674f = m4674f(context);
        this.f4956a = iM4674f;
        if (iM4674f == 1) {
            this.f4957b = m4672d(context);
            this.f4958c = m4673e(context);
        } else if (iM4674f == 2 || iM4674f == 3 || iM4674f == 4) {
            this.f4957b = m4671c(context);
        }
        if (TextUtils.isEmpty(this.f4957b)) {
            this.f4957b = "UNKNOWN";
        }
    }

    /* renamed from: c */
    private String m4671c(Context context) {
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
    public void m4675a(Context context) {
        m4670b(context);
    }

    /* renamed from: d */
    private String m4672d(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) C6362b.f4912b.getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getSSID();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
