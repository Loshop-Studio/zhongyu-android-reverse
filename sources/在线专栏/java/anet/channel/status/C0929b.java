package anet.channel.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.AwcnConfig;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C0962c;
import com.taobao.accs.utl.UtilityImpl;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: anet.channel.status.b */
/* loaded from: classes.dex */
class C0929b {

    /* renamed from: t */
    private static Method f5337t;

    /* renamed from: m */
    private static String[] f5330m = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};

    /* renamed from: a */
    static volatile Context f5318a = null;

    /* renamed from: b */
    static volatile boolean f5319b = false;

    /* renamed from: c */
    static volatile NetworkStatusHelper.NetworkStatus f5320c = NetworkStatusHelper.NetworkStatus.NONE;

    /* renamed from: d */
    static volatile String f5321d = UtilityImpl.NET_TYPE_UNKNOWN;

    /* renamed from: e */
    static volatile String f5322e = "";

    /* renamed from: f */
    static volatile String f5323f = "";

    /* renamed from: g */
    static volatile String f5324g = "";

    /* renamed from: h */
    static volatile String f5325h = UtilityImpl.NET_TYPE_UNKNOWN;

    /* renamed from: i */
    static volatile String f5326i = "";

    /* renamed from: j */
    static volatile Pair<String, Integer> f5327j = null;

    /* renamed from: k */
    static volatile boolean f5328k = false;

    /* renamed from: l */
    static volatile List<InetAddress> f5329l = Collections.EMPTY_LIST;

    /* renamed from: n */
    private static volatile boolean f5331n = false;

    /* renamed from: o */
    private static volatile boolean f5332o = false;

    /* renamed from: p */
    private static ConnectivityManager f5333p = null;

    /* renamed from: q */
    private static TelephonyManager f5334q = null;

    /* renamed from: r */
    private static WifiManager f5335r = null;

    /* renamed from: s */
    private static SubscriptionManager f5336s = null;

    /* renamed from: u */
    private static BroadcastReceiver f5338u = new BroadcastReceiver() { // from class: anet.channel.status.NetworkStatusMonitor$2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (ALog.isPrintLog(1)) {
                ALog.m4636d("awcn.NetworkStatusMonitor", "receiver:" + intent.getAction(), null, new Object[0]);
            }
            ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0931d(this));
        }
    };

    C0929b() {
    }

    /* renamed from: a */
    static void m4552a() {
        if (f5331n || f5318a == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            f5318a.registerReceiver(f5338u, intentFilter);
        } catch (Exception unused) {
            ALog.m4638e("awcn.NetworkStatusMonitor", "registerReceiver failed", null, new Object[0]);
        }
        m4557d();
        f5331n = true;
    }

    /* renamed from: b */
    static void m4554b() {
        if (f5318a != null) {
            f5318a.unregisterReceiver(f5338u);
        }
    }

    /* renamed from: c */
    static void m4556c() {
        if (Build.VERSION.SDK_INT < 24 || f5332o) {
            return;
        }
        NetworkInfo networkInfoM4558e = m4558e();
        f5319b = networkInfoM4558e != null && networkInfoM4558e.isConnected();
        f5333p.registerDefaultNetworkCallback(new C0930c());
        f5332o = true;
    }

    /* renamed from: d */
    static void m4557d() {
        NetworkInfo networkInfoM4558e;
        boolean z3;
        WifiInfo wifiInfoM4562i;
        ALog.m4636d("awcn.NetworkStatusMonitor", "[checkNetworkStatus]", null, new Object[0]);
        NetworkStatusHelper.NetworkStatus networkStatus = f5320c;
        String str = f5322e;
        String str2 = f5323f;
        try {
            try {
                networkInfoM4558e = m4558e();
                z3 = false;
            } catch (Exception e4) {
                ALog.m4637e("awcn.NetworkStatusMonitor", "getNetworkInfo exception", null, e4, new Object[0]);
                m4553a(NetworkStatusHelper.NetworkStatus.NONE, UtilityImpl.NET_TYPE_UNKNOWN);
                networkInfoM4558e = null;
                z3 = true;
            }
            if (!z3) {
                if (networkInfoM4558e == null || !networkInfoM4558e.isConnected()) {
                    m4553a(NetworkStatusHelper.NetworkStatus.NO, "no network");
                    ALog.m4639i("awcn.NetworkStatusMonitor", "checkNetworkStatus", null, "no network");
                } else {
                    ALog.m4639i("awcn.NetworkStatusMonitor", "checkNetworkStatus", null, "info.isConnected", Boolean.valueOf(networkInfoM4558e.isConnected()), "info.isAvailable", Boolean.valueOf(networkInfoM4558e.isAvailable()), "info.getType", Integer.valueOf(networkInfoM4558e.getType()));
                    if (networkInfoM4558e.getType() == 0) {
                        String subtypeName = networkInfoM4558e.getSubtypeName();
                        String strReplace = TextUtils.isEmpty(subtypeName) ? "" : subtypeName.replace(" ", "");
                        m4553a(m4550a(networkInfoM4558e.getSubtype(), strReplace), strReplace);
                        f5322e = m4551a(networkInfoM4558e.getExtraInfo());
                        m4561h();
                    } else if (networkInfoM4558e.getType() == 1) {
                        m4553a(NetworkStatusHelper.NetworkStatus.WIFI, UtilityImpl.NET_TYPE_WIFI);
                        if (AwcnConfig.isWifiInfoEnable() && (wifiInfoM4562i = m4562i()) != null && m4555b("android.permission.ACCESS_FINE_LOCATION")) {
                            f5324g = wifiInfoM4562i.getBSSID();
                            f5323f = wifiInfoM4562i.getSSID();
                        }
                        f5325h = UtilityImpl.NET_TYPE_WIFI;
                        f5326i = UtilityImpl.NET_TYPE_WIFI;
                        f5327j = m4563j();
                    } else {
                        m4553a(NetworkStatusHelper.NetworkStatus.NONE, UtilityImpl.NET_TYPE_UNKNOWN);
                    }
                    f5328k = networkInfoM4558e.isRoaming();
                    C0962c.m4652e();
                }
            }
            if (f5320c == networkStatus && f5322e.equalsIgnoreCase(str) && f5323f.equalsIgnoreCase(str2)) {
                return;
            }
            if (ALog.isPrintLog(2)) {
                NetworkStatusHelper.printNetworkDetail();
            }
            NetworkStatusHelper.notifyStatusChanged(f5320c);
        } catch (Exception e5) {
            ALog.m4637e("awcn.NetworkStatusMonitor", "checkNetworkStatus", null, e5, new Object[0]);
        }
    }

    /* renamed from: e */
    static NetworkInfo m4558e() {
        if (f5333p == null) {
            f5333p = (ConnectivityManager) f5318a.getSystemService("connectivity");
        }
        return f5333p.getActiveNetworkInfo();
    }

    /* renamed from: f */
    static String m4559f() throws NoSuchMethodException, SecurityException {
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            for (String str : f5330m) {
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
    static int m4560g() {
        if (f5333p == null || Build.VERSION.SDK_INT < 24) {
            return -1;
        }
        return f5333p.getRestrictBackgroundStatus();
    }

    /* renamed from: h */
    private static void m4561h() {
        try {
            if (AwcnConfig.isCarrierInfoEnable() && m4555b("android.permission.READ_PHONE_STATE")) {
                if (f5334q == null) {
                    f5334q = (TelephonyManager) f5318a.getSystemService("phone");
                }
                f5326i = f5334q.getSimOperator();
                if (f5336s == null) {
                    SubscriptionManager subscriptionManagerFrom = SubscriptionManager.from(f5318a);
                    f5336s = subscriptionManagerFrom;
                    f5337t = subscriptionManagerFrom.getClass().getDeclaredMethod("getDefaultDataSubscriptionInfo", new Class[0]);
                }
                Method method = f5337t;
                if (method != null) {
                    f5325h = ((SubscriptionInfo) method.invoke(f5336s, new Object[0])).getCarrierName().toString();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    private static WifiInfo m4562i() {
        try {
            if (f5335r == null) {
                f5335r = (WifiManager) f5318a.getSystemService(UtilityImpl.NET_TYPE_WIFI);
            }
            return f5335r.getConnectionInfo();
        } catch (Throwable th) {
            ALog.m4637e("awcn.NetworkStatusMonitor", "getWifiInfo", null, th, new Object[0]);
            return null;
        }
    }

    /* renamed from: j */
    private static Pair<String, Integer> m4563j() {
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
    private static boolean m4555b(String str) {
        return Build.VERSION.SDK_INT >= 23 && f5318a.checkSelfPermission(str) == 0;
    }

    /* renamed from: a */
    private static void m4553a(NetworkStatusHelper.NetworkStatus networkStatus, String str) {
        f5320c = networkStatus;
        f5321d = str;
        f5322e = "";
        f5323f = "";
        f5324g = "";
        f5327j = null;
        f5325h = "";
        f5326i = "";
    }

    /* renamed from: a */
    private static NetworkStatusHelper.NetworkStatus m4550a(int i4, String str) {
        switch (i4) {
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
    private static String m4551a(String str) {
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
        return UtilityImpl.NET_TYPE_UNKNOWN;
    }
}
