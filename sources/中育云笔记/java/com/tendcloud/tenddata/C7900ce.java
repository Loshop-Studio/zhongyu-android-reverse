package com.tendcloud.tenddata;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UtilityImpl;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;

/* renamed from: com.tendcloud.tenddata.ce */
/* loaded from: classes5.dex */
public final class C7900ce {

    /* renamed from: a */
    private static TelephonyManager f14530a = null;

    /* renamed from: b */
    private static String f14531b = null;

    /* renamed from: c */
    private static boolean f14532c = false;

    /* renamed from: d */
    private static final HashMap<String, String> f14533d;

    static {
        HashMap<String, String> map = new HashMap<>();
        f14533d = map;
        try {
            Context context = C7843ab.f14307g;
            if (context != null) {
                f14530a = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                map.put("imei1", m11480a(C7843ab.f14307g, 0));
                map.put("meid1", m11478a(0));
                if (C7903ch.m11504B(C7843ab.f14307g) == 2) {
                    map.put("imei2", m11480a(C7843ab.f14307g, 1));
                    map.put("meid2", m11478a(1));
                }
                map.put(Constants.KEY_IMSI, m11497g(C7843ab.f14307g));
                map.put("androidId", m11494e(C7843ab.f14307g));
                map.put("mac", m11492d(C7843ab.f14307g));
                map.put("ethMac", m11488c());
                map.put("dummy0", m11484b());
                map.put("serialNo", m11490c(C7843ab.f14307g));
            }
        } catch (Throwable unused) {
        }
    }

    private C7900ce() {
    }

    /* renamed from: c */
    public static String m11490c(Context context) {
        try {
            if (C7912cq.m11595a(9) && C7912cq.m11605b(26)) {
                return Build.SERIAL;
            }
            if (C7912cq.m11595a(26) && C7912cq.m11607b(context, "android.permission.READ_PHONE_STATE")) {
                return Build.getSerial();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static String m11492d(Context context) {
        try {
            String strM11493e = C7912cq.m11595a(23) ? m11493e() : m11500j(context);
            try {
                if (C7912cq.m11624j(strM11493e)) {
                    return null;
                }
                return strM11493e;
            } catch (Throwable unused) {
                return strM11493e;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: e */
    public static String m11494e(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static String m11496f(Context context) {
        HashMap<String, String> map;
        String str;
        try {
            if (C7903ch.m11504B(context) == 2) {
                map = f14533d;
                str = "imei2";
            } else {
                map = f14533d;
                str = "imei1";
            }
            return map.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static String m11497g(Context context) {
        try {
            if (C7912cq.m11607b(context, "android.permission.READ_PHONE_STATE")) {
                return f14530a.getSubscriberId();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: h */
    private static String m11498h(Context context) {
        try {
            if (!C7912cq.m11607b(context, "android.permission.READ_PHONE_STATE")) {
                return null;
            }
            String str = "";
            if (C7903ch.m11504B(context) == 2) {
                try {
                    HashMap<String, String> map = f14533d;
                    map.get("imei1");
                    str = map.get("imei2");
                } catch (Exception unused) {
                }
            }
            return C7912cq.m11608b(str) ? f14533d.get("imei1") : str;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: i */
    private static String m11499i(Context context) {
        try {
            if (C7912cq.m11607b(context, "android.permission.READ_PHONE_STATE")) {
                return f14530a.getSimSerialNumber();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: j */
    private static String m11500j(Context context) {
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        String macAddress;
        try {
            if (!C7912cq.m11607b(context, "android.permission.ACCESS_WIFI_STATE") || (wifiManager = (WifiManager) context.getApplicationContext().getSystemService(UtilityImpl.NET_TYPE_WIFI)) == null || !wifiManager.isWifiEnabled() || (connectionInfo = wifiManager.getConnectionInfo()) == null || (macAddress = connectionInfo.getMacAddress()) == null) {
                return null;
            }
            return macAddress.toUpperCase().trim();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m11482a() {
        try {
            if (C7912cq.m11614c(C7843ab.f14307g, "android.permission.READ_PHONE_STATE")) {
                C7903ch.tryGetDoubleSimInfoReCheck(C7843ab.f14307g);
                C7999fw.m12011b().m12015a();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static String m11486b(final Context context) {
        try {
            if (!f14532c) {
                C7910co.f14599a.execute(new Runnable() { // from class: com.tendcloud.tenddata.ce.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            boolean unused = C7900ce.f14532c = true;
                            String unused2 = C7900ce.f14531b = (String) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("getId", null).invoke(Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context), null);
                        } catch (Throwable unused3) {
                        }
                    }
                });
            }
            return f14531b;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static String m11493e() {
        try {
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = list.get(i10);
                i10++;
                NetworkInterface networkInterface = (NetworkInterface) obj;
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b10 : hardwareAddress) {
                        sb2.append(String.format("%02X:", Byte.valueOf(b10)));
                    }
                    if (sb2.length() > 0) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                    return sb2.toString().toUpperCase().trim();
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static String m11495f() {
        try {
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = list.get(i10);
                i10++;
                NetworkInterface networkInterface = (NetworkInterface) obj;
                if (networkInterface.getName().equalsIgnoreCase("eth0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b10 : hardwareAddress) {
                        sb2.append(String.format("%02X:", Byte.valueOf(b10)));
                    }
                    if (sb2.length() > 0) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                    return sb2.toString().toUpperCase().trim();
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m11481a(String str) {
        return f14533d.get(str);
    }

    /* renamed from: b */
    public static String m11484b() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (networkInterfaceNextElement.getName().toLowerCase().startsWith("dummy")) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        String hostAddress = inetAddresses.nextElement().getHostAddress();
                        if (hostAddress.contains("dummy")) {
                            return hostAddress.split("%")[0];
                        }
                    }
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static String m11491d() {
        try {
            return C7994fr.m11998a().m11999c();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m11479a(Context context) {
        try {
            String strM11481a = m11481a("mac");
            if (!C7912cq.m11608b(strM11481a)) {
                strM11481a = String.valueOf(Long.parseLong(strM11481a.replaceAll(":", ""), 16));
            }
            String strM11481a2 = m11481a("androidId");
            String strM11481a3 = m11481a("imeis");
            String strM11481a4 = m11481a(Constants.KEY_IMSI);
            String strM11481a5 = m11481a("simId");
            String strM11411a = C7898cc.m11411a(context);
            String strM11491d = m11491d();
            String strM11481a6 = m11481a("serialNo");
            StringBuilder sb2 = new StringBuilder(170);
            sb2.append(2);
            sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb2.append(strM11481a);
            sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb2.append(strM11481a2);
            sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb2.append(strM11481a3);
            sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb2.append(strM11481a4);
            sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb2.append(strM11481a5);
            sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb2.append(strM11411a);
            sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb2.append(strM11491d);
            sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb2.append(strM11481a6);
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m11488c() {
        try {
            String strM11495f = m11495f();
            try {
                if (C7912cq.m11624j(strM11495f)) {
                    return null;
                }
                return strM11495f;
            } catch (Throwable unused) {
                return strM11495f;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m11489c(int i10) {
        String str = "meid1";
        if (i10 == 1) {
            str = "meid2";
        }
        try {
            String strM11481a = m11481a(str);
            if (C7912cq.m11608b(strM11481a)) {
                return null;
            }
            return C7912cq.m11612c(strM11481a);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m11485b(int i10) {
        String strM11481a;
        try {
            if (i10 == 1) {
                strM11481a = m11481a("imei2");
            } else {
                strM11481a = m11481a("imei1");
            }
            if (C7912cq.m11608b(strM11481a)) {
                return null;
            }
            return C7912cq.m11612c(strM11481a);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m11480a(Context context, int i10) {
        if (C7912cq.m11607b(context, "android.permission.READ_PHONE_STATE")) {
            if (C7912cq.m11595a(26)) {
                try {
                    return f14530a.getImei(i10);
                } catch (Throwable unused) {
                    return "";
                }
            }
            if (C7912cq.m11595a(23)) {
                return f14530a.getDeviceId(i10);
            }
            return f14530a.getDeviceId();
        }
        return "";
    }

    /* renamed from: a */
    public static String m11478a(int i10) {
        if (C7912cq.m11595a(26)) {
            try {
                return f14530a.getMeid(i10);
            } catch (Throwable unused) {
                return "";
            }
        }
        return "";
    }
}
