package anet.channel.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import androidx.autofill.HintConstants;
import anet.channel.AwcnConfig;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C5085c;
import com.taobao.accs.utl.UtilityImpl;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: anet.channel.status.b */
/* loaded from: classes3.dex */
class C5052b {

    /* renamed from: t */
    private static Method f2615t;

    /* renamed from: m */
    private static String[] f2608m = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};

    /* renamed from: a */
    static volatile Context f2596a = null;

    /* renamed from: b */
    static volatile boolean f2597b = false;

    /* renamed from: c */
    static volatile NetworkStatusHelper.NetworkStatus f2598c = NetworkStatusHelper.NetworkStatus.NONE;

    /* renamed from: d */
    static volatile String f2599d = "unknown";

    /* renamed from: e */
    static volatile String f2600e = "";

    /* renamed from: f */
    static volatile String f2601f = "";

    /* renamed from: g */
    static volatile String f2602g = "";

    /* renamed from: h */
    static volatile String f2603h = "unknown";

    /* renamed from: i */
    static volatile String f2604i = "";

    /* renamed from: j */
    static volatile Pair<String, Integer> f2605j = null;

    /* renamed from: k */
    static volatile boolean f2606k = false;

    /* renamed from: l */
    static volatile List<InetAddress> f2607l = Collections.EMPTY_LIST;

    /* renamed from: n */
    private static volatile boolean f2609n = false;

    /* renamed from: o */
    private static volatile boolean f2610o = false;

    /* renamed from: p */
    private static ConnectivityManager f2611p = null;

    /* renamed from: q */
    private static TelephonyManager f2612q = null;

    /* renamed from: r */
    private static WifiManager f2613r = null;

    /* renamed from: s */
    private static SubscriptionManager f2614s = null;

    /* renamed from: u */
    private static BroadcastReceiver f2616u = new BroadcastReceiver() { // from class: anet.channel.status.NetworkStatusMonitor$2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (ALog.isPrintLog(1)) {
                ALog.m2527d("awcn.NetworkStatusMonitor", "receiver:" + intent.getAction(), null, new Object[0]);
            }
            ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC5054d(this));
        }
    };

    /* renamed from: a */
    public static void m2443a() {
        if (f2609n || f2596a == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            f2596a.registerReceiver(f2616u, intentFilter);
        } catch (Exception unused) {
            ALog.m2529e("awcn.NetworkStatusMonitor", "registerReceiver failed", null, new Object[0]);
        }
        m2448d();
        f2609n = true;
    }

    /* renamed from: b */
    public static void m2445b() {
        if (f2596a != null) {
            f2596a.unregisterReceiver(f2616u);
        }
    }

    /* renamed from: c */
    public static void m2447c() {
        if (f2610o) {
            return;
        }
        NetworkInfo networkInfoM2449e = m2449e();
        f2597b = networkInfoM2449e != null && networkInfoM2449e.isConnected();
        f2611p.registerDefaultNetworkCallback(new C5053c());
        f2610o = true;
    }

    /* renamed from: d */
    public static void m2448d() {
        NetworkInfo networkInfoM2449e;
        boolean z10;
        WifiInfo wifiInfoM2453i;
        ALog.m2527d("awcn.NetworkStatusMonitor", "[checkNetworkStatus]", null, new Object[0]);
        NetworkStatusHelper.NetworkStatus networkStatus = f2598c;
        String str = f2600e;
        String str2 = f2601f;
        try {
            try {
                networkInfoM2449e = m2449e();
                z10 = false;
            } catch (Exception e10) {
                ALog.m2528e("awcn.NetworkStatusMonitor", "getNetworkInfo exception", null, e10, new Object[0]);
                m2444a(NetworkStatusHelper.NetworkStatus.NONE, "unknown");
                networkInfoM2449e = null;
                z10 = true;
            }
            if (!z10) {
                if (networkInfoM2449e == null || !networkInfoM2449e.isConnected()) {
                    m2444a(NetworkStatusHelper.NetworkStatus.NO, "no network");
                    ALog.m2530i("awcn.NetworkStatusMonitor", "checkNetworkStatus", null, "no network");
                } else {
                    ALog.m2530i("awcn.NetworkStatusMonitor", "checkNetworkStatus", null, "info.isConnected", Boolean.valueOf(networkInfoM2449e.isConnected()), "info.isAvailable", Boolean.valueOf(networkInfoM2449e.isAvailable()), "info.getType", Integer.valueOf(networkInfoM2449e.getType()));
                    if (networkInfoM2449e.getType() == 0) {
                        String subtypeName = networkInfoM2449e.getSubtypeName();
                        String strReplace = TextUtils.isEmpty(subtypeName) ? "" : subtypeName.replace(" ", "");
                        m2444a(m2441a(networkInfoM2449e.getSubtype(), strReplace), strReplace);
                        f2600e = m2442a(networkInfoM2449e.getExtraInfo());
                        m2452h();
                    } else if (networkInfoM2449e.getType() == 1) {
                        m2444a(NetworkStatusHelper.NetworkStatus.WIFI, UtilityImpl.NET_TYPE_WIFI);
                        if (AwcnConfig.isWifiInfoEnable() && (wifiInfoM2453i = m2453i()) != null && m2446b("android.permission.ACCESS_FINE_LOCATION")) {
                            f2602g = wifiInfoM2453i.getBSSID();
                            f2601f = wifiInfoM2453i.getSSID();
                        }
                        f2603h = UtilityImpl.NET_TYPE_WIFI;
                        f2604i = UtilityImpl.NET_TYPE_WIFI;
                        f2605j = m2454j();
                    } else {
                        m2444a(NetworkStatusHelper.NetworkStatus.NONE, "unknown");
                    }
                    f2606k = networkInfoM2449e.isRoaming();
                    C5085c.m2543e();
                }
            }
            if (f2598c == networkStatus && f2600e.equalsIgnoreCase(str) && f2601f.equalsIgnoreCase(str2)) {
                return;
            }
            if (ALog.isPrintLog(2)) {
                NetworkStatusHelper.printNetworkDetail();
            }
            NetworkStatusHelper.notifyStatusChanged(f2598c);
        } catch (Exception e11) {
            ALog.m2528e("awcn.NetworkStatusMonitor", "checkNetworkStatus", null, e11, new Object[0]);
        }
    }

    /* renamed from: e */
    public static NetworkInfo m2449e() {
        if (f2611p == null) {
            f2611p = (ConnectivityManager) f2596a.getSystemService("connectivity");
        }
        return f2611p.getActiveNetworkInfo();
    }

    /* renamed from: f */
    public static String m2450f() throws NoSuchMethodException, SecurityException {
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            for (String str : f2608m) {
                String str2 = (String) method.invoke(null, str);
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: g */
    public static int m2451g() {
        if (f2611p != null) {
            return f2611p.getRestrictBackgroundStatus();
        }
        return -1;
    }

    /* renamed from: h */
    private static void m2452h() {
        try {
            if (AwcnConfig.isCarrierInfoEnable() && m2446b("android.permission.READ_PHONE_STATE")) {
                if (f2612q == null) {
                    f2612q = (TelephonyManager) f2596a.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                }
                f2604i = f2612q.getSimOperator();
                if (f2614s == null) {
                    SubscriptionManager subscriptionManagerFrom = SubscriptionManager.from(f2596a);
                    f2614s = subscriptionManagerFrom;
                    f2615t = subscriptionManagerFrom.getClass().getDeclaredMethod("getDefaultDataSubscriptionInfo", null);
                }
                Method method = f2615t;
                if (method != null) {
                    f2603h = ((SubscriptionInfo) method.invoke(f2614s, null)).getCarrierName().toString();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    private static WifiInfo m2453i() {
        try {
            if (f2613r == null) {
                f2613r = (WifiManager) f2596a.getSystemService(UtilityImpl.NET_TYPE_WIFI);
            }
            return f2613r.getConnectionInfo();
        } catch (Throwable th) {
            ALog.m2528e("awcn.NetworkStatusMonitor", "getWifiInfo", null, th, new Object[0]);
            return null;
        }
    }

    /* renamed from: j */
    private static Pair<String, Integer> m2454j() {
        try {
            String property = System.getProperty("http.proxyHost");
            if (TextUtils.isEmpty(property)) {
                return null;
            }
            return Pair.create(property, Integer.valueOf(Integer.parseInt(System.getProperty("http.proxyPort"))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m2446b(String str) {
        return f2596a.checkSelfPermission(str) == 0;
    }

    /* renamed from: a */
    private static void m2444a(NetworkStatusHelper.NetworkStatus networkStatus, String str) {
        f2598c = networkStatus;
        f2599d = str;
        f2600e = "";
        f2601f = "";
        f2602g = "";
        f2605j = null;
        f2603h = "";
        f2604i = "";
    }

    /* renamed from: a */
    private static NetworkStatusHelper.NetworkStatus m2441a(int i10, String str) {
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetworkStatusHelper.NetworkStatus.G2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return NetworkStatusHelper.NetworkStatus.G3;
            case 13:
            case 18:
            case 19:
                return NetworkStatusHelper.NetworkStatus.G4;
            case 20:
                return NetworkStatusHelper.NetworkStatus.G5;
            default:
                if (!str.equalsIgnoreCase("TD-SCDMA") && !str.equalsIgnoreCase("WCDMA") && !str.equalsIgnoreCase("CDMA2000")) {
                    return NetworkStatusHelper.NetworkStatus.NONE;
                }
                return NetworkStatusHelper.NetworkStatus.G3;
        }
    }

    /* renamed from: a */
    private static String m2442a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.contains("cmwap")) {
                return "cmwap";
            }
            if (lowerCase.contains("uniwap")) {
                return "uniwap";
            }
            if (lowerCase.contains("3gwap")) {
                return "3gwap";
            }
            if (lowerCase.contains("ctwap")) {
                return "ctwap";
            }
            if (lowerCase.contains("cmnet")) {
                return "cmnet";
            }
            if (lowerCase.contains("uninet")) {
                return "uninet";
            }
            if (lowerCase.contains("3gnet")) {
                return "3gnet";
            }
            if (lowerCase.contains("ctnet")) {
                return "ctnet";
            }
        }
        return "unknown";
    }
}
