package anet.channel.status;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C5089g;
import anet.channel.util.StringUtils;
import com.taobao.accs.utl.BaseMonitor;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public class NetworkStatusHelper {
    private static final String TAG = "awcn.NetworkStatusHelper";
    static CopyOnWriteArraySet<INetworkStatusChangeListener> listeners = new CopyOnWriteArraySet<>();

    public interface INetworkStatusChangeListener {
        void onNetworkStatusChanged(NetworkStatus networkStatus);
    }

    public enum NetworkStatus {
        NONE,
        NO,
        G2,
        G3,
        G4,
        WIFI,
        G5;

        public String getType() {
            return this == G2 ? "2G" : this == G3 ? "3G" : this == G4 ? "4G" : this == G5 ? "5G" : toString();
        }

        public boolean isMobile() {
            return this == G2 || this == G3 || this == G4 || this == G5;
        }

        public boolean isWifi() {
            return this == WIFI;
        }
    }

    public static void addStatusChangeListener(INetworkStatusChangeListener iNetworkStatusChangeListener) {
        listeners.add(iNetworkStatusChangeListener);
    }

    public static String getApn() {
        return C5052b.f2600e;
    }

    public static String getCarrier() {
        return C5052b.f2603h;
    }

    public static String getDnsServerAddress() {
        return !C5052b.f2607l.isEmpty() ? C5052b.f2607l.get(0).getHostAddress() : C5052b.m2450f();
    }

    public static String getNetworkSubType() {
        return C5052b.f2599d;
    }

    public static String getProxyType() {
        NetworkStatus networkStatus = C5052b.f2598c;
        return (networkStatus != NetworkStatus.WIFI || getWifiProxy() == null) ? (networkStatus.isMobile() && C5052b.f2600e.contains("wap")) ? "wap" : (!networkStatus.isMobile() || C5089g.m2550a() == null) ? "" : BaseMonitor.ALARM_POINT_AUTH : "proxy";
    }

    public static int getRestrictBackgroundStatus() {
        return C5052b.m2451g();
    }

    public static String getSimOp() {
        return C5052b.f2604i;
    }

    public static NetworkStatus getStatus() {
        return C5052b.f2598c;
    }

    public static String getUniqueId(NetworkStatus networkStatus) {
        if (networkStatus.isWifi()) {
            String strMd5ToHex = StringUtils.md5ToHex(getWifiBSSID());
            return "WIFI$" + (TextUtils.isEmpty(strMd5ToHex) ? "" : strMd5ToHex);
        }
        if (!networkStatus.isMobile()) {
            return "";
        }
        return networkStatus.getType() + "$" + getApn();
    }

    public static String getWifiBSSID() {
        return C5052b.f2602g;
    }

    public static Pair<String, Integer> getWifiProxy() {
        if (C5052b.f2598c != NetworkStatus.WIFI) {
            return null;
        }
        return C5052b.f2605j;
    }

    public static String getWifiSSID() {
        return C5052b.f2601f;
    }

    public static boolean isConnected() {
        if (C5052b.f2597b) {
            return true;
        }
        try {
            NetworkInfo networkInfoM2449e = C5052b.m2449e();
            if (networkInfoM2449e != null) {
                return networkInfoM2449e.isConnected();
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isProxy() {
        NetworkStatus networkStatus = C5052b.f2598c;
        String str = C5052b.f2600e;
        if (networkStatus == NetworkStatus.WIFI && getWifiProxy() != null) {
            return true;
        }
        if (networkStatus.isMobile()) {
            return str.contains("wap") || C5089g.m2550a() != null;
        }
        return false;
    }

    public static boolean isRoaming() {
        return C5052b.f2606k;
    }

    public static void notifyStatusChanged(NetworkStatus networkStatus) {
        ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC5051a(networkStatus));
    }

    public static void printNetworkDetail() {
        try {
            NetworkStatus status = getStatus();
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("\nNetwork detail*******************************\n");
            sb2.append("Status: ");
            sb2.append(status.getType());
            sb2.append('\n');
            sb2.append("Subtype: ");
            sb2.append(getNetworkSubType());
            sb2.append('\n');
            if (status != NetworkStatus.NO) {
                if (status.isMobile()) {
                    sb2.append("Apn: ");
                    sb2.append(getApn());
                    sb2.append('\n');
                    sb2.append("Carrier: ");
                    sb2.append(getCarrier());
                    sb2.append('\n');
                } else {
                    sb2.append("BSSID: ");
                    sb2.append(getWifiBSSID());
                    sb2.append('\n');
                    sb2.append("SSID: ");
                    sb2.append(getWifiSSID());
                    sb2.append('\n');
                }
            }
            if (isProxy()) {
                sb2.append("Proxy: ");
                sb2.append(getProxyType());
                sb2.append('\n');
                Pair<String, Integer> wifiProxy = getWifiProxy();
                if (wifiProxy != null) {
                    sb2.append("ProxyHost: ");
                    sb2.append((String) wifiProxy.first);
                    sb2.append('\n');
                    sb2.append("ProxyPort: ");
                    sb2.append(wifiProxy.second);
                    sb2.append('\n');
                }
            }
            sb2.append("*********************************************");
            ALog.m2530i(TAG, sb2.toString(), null, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public static void removeStatusChangeListener(INetworkStatusChangeListener iNetworkStatusChangeListener) {
        listeners.remove(iNetworkStatusChangeListener);
    }

    public static synchronized void startListener(Context context) {
        if (context == null) {
            throw new NullPointerException("context is null");
        }
        C5052b.f2596a = context;
        C5052b.m2443a();
        C5052b.m2447c();
    }

    public void stopListener(Context context) {
        C5052b.m2445b();
    }
}
