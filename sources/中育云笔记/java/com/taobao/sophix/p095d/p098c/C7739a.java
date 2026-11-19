package com.taobao.sophix.p095d.p098c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.sophix.p090b.C7728b;

/* renamed from: com.taobao.sophix.d.c.a */
/* loaded from: classes5.dex */
public class C7739a {

    /* renamed from: a */
    private int f13398a;

    /* renamed from: b */
    private String f13399b;

    /* renamed from: c */
    private String f13400c;

    /* renamed from: com.taobao.sophix.d.c.a$a */
    public static final class a {

        /* renamed from: a */
        private static final C7739a f13401a = new C7739a();
    }

    /* renamed from: a */
    public static C7739a m10360a() {
        return a.f13401a;
    }

    /* renamed from: e */
    private String m10364e(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) C7728b.f13354b.getSystemService(UtilityImpl.NET_TYPE_WIFI)).getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getBSSID();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    private int m10365f(Context context) {
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
    public String m10367b() {
        return this.f13399b;
    }

    /* renamed from: c */
    public int m10368c() {
        return this.f13398a;
    }

    /* renamed from: d */
    public String m10369d() {
        int iM10368c = m10360a().m10368c();
        return iM10368c != 1 ? iM10368c != 2 ? iM10368c != 3 ? iM10368c != 4 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "4G" : "3G" : "2G" : "WIFI";
    }

    private C7739a() {
        this.f13398a = 0;
        this.f13399b = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        this.f13400c = GrsBaseInfo.CountryCodeSource.UNKNOWN;
    }

    /* renamed from: b */
    private void m10361b(Context context) {
        int iM10365f = m10365f(context);
        this.f13398a = iM10365f;
        if (iM10365f == 1) {
            this.f13399b = m10363d(context);
            this.f13400c = m10364e(context);
        } else if (iM10365f == 2 || iM10365f == 3 || iM10365f == 4) {
            this.f13399b = m10362c(context);
        }
        if (TextUtils.isEmpty(this.f13399b)) {
            this.f13399b = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    /* renamed from: c */
    private String m10362c(Context context) {
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
    public void m10366a(Context context) {
        m10361b(context);
    }

    /* renamed from: d */
    private String m10363d(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) C7728b.f13354b.getSystemService(UtilityImpl.NET_TYPE_WIFI)).getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getSSID();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
