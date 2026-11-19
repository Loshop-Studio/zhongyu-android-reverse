package anet.channel.util;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.NetTypeStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.android.netutil.UdpConnectType;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;

/* renamed from: anet.channel.util.c */
/* loaded from: classes3.dex */
public class C5085c {
    public static final int IPV4_ONLY = 1;
    public static final int IPV6_ONLY = 2;
    public static final int IP_DUAL_STACK = 3;
    public static final int IP_STACK_UNKNOWN = 0;

    /* renamed from: b */
    static volatile String f2753b;

    /* renamed from: c */
    static C5088f f2754c;

    /* renamed from: a */
    static final byte[][] f2752a = {new byte[]{-64, 0, 0, -86}, new byte[]{-64, 0, 0, -85}};

    /* renamed from: d */
    static ConcurrentHashMap<String, C5088f> f2755d = new ConcurrentHashMap<>();

    /* renamed from: e */
    static ConcurrentHashMap<String, Integer> f2756e = new ConcurrentHashMap<>();

    static {
        f2753b = null;
        f2754c = null;
        try {
            f2754c = new C5088f((Inet6Address) InetAddress.getAllByName("64:ff9b::")[0], 96);
            f2753b = m2539b(NetworkStatusHelper.getStatus());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static boolean m2537a() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static String m2539b(NetworkStatusHelper.NetworkStatus networkStatus) {
        if (networkStatus.isWifi()) {
            String wifiBSSID = NetworkStatusHelper.getWifiBSSID();
            if (TextUtils.isEmpty(wifiBSSID)) {
                wifiBSSID = "";
            }
            return "WIFI$" + wifiBSSID;
        }
        if (!networkStatus.isMobile()) {
            return "UnknownNetwork";
        }
        return networkStatus.getType() + "$" + NetworkStatusHelper.getApn();
    }

    /* renamed from: c */
    public static int m2541c() {
        Integer num = f2756e.get(f2753b);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: d */
    public static C5088f m2542d() {
        C5088f c5088f = f2755d.get(f2753b);
        return c5088f == null ? f2754c : c5088f;
    }

    /* renamed from: e */
    public static void m2543e() {
        if (!AwcnConfig.isIpv6Enable()) {
            ALog.m2529e("awcn.Inet64Util", "[startIpStackDetect]ipv6Enable=false", null, new Object[0]);
            return;
        }
        f2753b = m2539b(NetworkStatusHelper.getStatus());
        if (f2756e.putIfAbsent(f2753b, 0) != null) {
            return;
        }
        int iM2548j = m2548j();
        f2756e.put(f2753b, Integer.valueOf(iM2548j));
        NetTypeStat netTypeStat = new NetTypeStat();
        netTypeStat.ipStackType = iM2548j;
        String str = f2753b;
        if (iM2548j == 2 || iM2548j == 3) {
            ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC5086d(str, netTypeStat), 1500L, TimeUnit.MILLISECONDS);
        } else if (GlobalAppRuntimeInfo.isTargetProcess()) {
            AppMonitor.getInstance().commitStat(netTypeStat);
        }
    }

    /* renamed from: h */
    private static int m2546h() {
        String str;
        TreeMap treeMap = new TreeMap();
        ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
        int size = list.size();
        int iIntValue = 0;
        int i10 = 0;
        while (true) {
            str = null;
            if (i10 >= size) {
                break;
            }
            Object obj = list.get(i10);
            i10++;
            NetworkInterface networkInterface = (NetworkInterface) obj;
            if (!networkInterface.getInterfaceAddresses().isEmpty()) {
                String displayName = networkInterface.getDisplayName();
                ALog.m2530i("awcn.Inet64Util", "find NetworkInterface:" + displayName, null, new Object[0]);
                Iterator<InterfaceAddress> it = networkInterface.getInterfaceAddresses().iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    InetAddress address = it.next().getAddress();
                    if (address instanceof Inet6Address) {
                        Inet6Address inet6Address = (Inet6Address) address;
                        if (!m2538a(inet6Address)) {
                            ALog.m2529e("awcn.Inet64Util", "Found IPv6 address:" + inet6Address.toString(), null, new Object[0]);
                            i11 |= 2;
                        }
                    } else if (address instanceof Inet4Address) {
                        Inet4Address inet4Address = (Inet4Address) address;
                        if (!m2538a((InetAddress) inet4Address) && !inet4Address.getHostAddress().startsWith("192.168.43.")) {
                            ALog.m2529e("awcn.Inet64Util", "Found IPv4 address:" + inet4Address.toString(), null, new Object[0]);
                            i11 |= 1;
                        }
                    }
                }
                if (i11 != 0) {
                    treeMap.put(displayName.toLowerCase(), Integer.valueOf(i11));
                }
            }
        }
        if (treeMap.isEmpty()) {
            return 0;
        }
        if (treeMap.size() == 1) {
            return ((Integer) treeMap.firstEntry().getValue()).intValue();
        }
        if (NetworkStatusHelper.getStatus().isWifi()) {
            str = "wlan";
        } else if (NetworkStatusHelper.getStatus().isMobile()) {
            str = "rmnet";
        }
        if (str != null) {
            Iterator it2 = treeMap.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (((String) entry.getKey()).startsWith(str)) {
                    iIntValue = ((Integer) entry.getValue()).intValue();
                    break;
                }
            }
        }
        return (iIntValue == 2 && treeMap.containsKey("v4-wlan0")) ? ((Integer) treeMap.remove("v4-wlan0")).intValue() | iIntValue : iIntValue;
    }

    /* renamed from: i */
    private static int m2547i() {
        SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        boolean zM22260a = UdpConnectType.m22260a();
        return UdpConnectType.m22261b() ? (zM22260a ? 1 : 0) | 2 : zM22260a ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* renamed from: j */
    public static int m2548j() {
        ?? IsIpStackDetectByUdpConnect;
        int iM2546h;
        try {
            IsIpStackDetectByUdpConnect = AwcnConfig.isIpStackDetectByUdpConnect();
            try {
                if (IsIpStackDetectByUdpConnect != 0) {
                    String str = "udp_connect";
                    iM2546h = m2547i();
                    IsIpStackDetectByUdpConnect = str;
                } else {
                    String str2 = "interfaces";
                    iM2546h = m2546h();
                    IsIpStackDetectByUdpConnect = str2;
                }
            } catch (Throwable th) {
                th = th;
                ALog.m2528e("awcn.Inet64Util", "[detectIpStack]error.", null, th, new Object[0]);
                iM2546h = 0;
                ALog.m2529e("awcn.Inet64Util", "startIpStackDetect", null, "ip stack", Integer.valueOf(iM2546h), "detectType", IsIpStackDetectByUdpConnect);
                return iM2546h;
            }
        } catch (Throwable th2) {
            th = th2;
            IsIpStackDetectByUdpConnect = 0;
        }
        ALog.m2529e("awcn.Inet64Util", "startIpStackDetect", null, "ip stack", Integer.valueOf(iM2546h), "detectType", IsIpStackDetectByUdpConnect);
        return iM2546h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static C5088f m2549k() throws UnknownHostException {
        InetAddress byName;
        byte b10;
        try {
            byName = InetAddress.getByName("ipv4only.arpa");
        } catch (Exception unused) {
            byName = null;
        }
        if (byName instanceof Inet6Address) {
            ALog.m2530i("awcn.Inet64Util", "Resolved AAAA: " + byName.toString(), null, new Object[0]);
            byte[] address = byName.getAddress();
            if (address.length != 16) {
                return null;
            }
            for (int i10 = 12; i10 >= 0; i10--) {
                byte b11 = address[i10];
                byte[][] bArr = f2752a;
                byte[] bArr2 = bArr[0];
                if ((b11 & bArr2[0]) != 0 && address[i10 + 1] == 0 && address[i10 + 2] == 0 && ((b10 = address[i10 + 3]) == bArr2[3] || b10 == bArr[1][3])) {
                    address[i10 + 3] = 0;
                    address[i10 + 2] = 0;
                    address[i10 + 1] = 0;
                    address[i10] = 0;
                    return new C5088f(Inet6Address.getByAddress("ipv4only.arpa", address, 0), i10 * 8);
                }
            }
        } else if (byName instanceof Inet4Address) {
            ALog.m2530i("awcn.Inet64Util", "Resolved A: " + byName.toString(), null, new Object[0]);
        }
        return null;
    }

    /* renamed from: a */
    public static String m2536a(Inet4Address inet4Address) throws Exception {
        if (inet4Address != null) {
            C5088f c5088fM2542d = m2542d();
            if (c5088fM2542d != null) {
                byte[] address = inet4Address.getAddress();
                byte[] address2 = c5088fM2542d.f2761b.getAddress();
                int i10 = c5088fM2542d.f2760a / 8;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int i13 = i11 + i10;
                    if (i13 > 15 || i12 >= 4) {
                        break;
                    }
                    if (i13 != 8) {
                        address2[i13] = (byte) (address[i12] | address2[i13]);
                        i12++;
                    }
                    i11++;
                }
                return InetAddress.getByAddress(address2).getHostAddress();
            }
            throw new Exception("cannot get nat64 prefix");
        }
        throw new InvalidParameterException("address in null");
    }

    /* renamed from: b */
    public static boolean m2540b() {
        Integer num = f2756e.get(f2753b);
        return num != null && num.intValue() == 1;
    }

    /* renamed from: a */
    public static String m2535a(String str) {
        return m2536a((Inet4Address) InetAddress.getByName(str));
    }

    /* renamed from: a */
    private static boolean m2538a(InetAddress inetAddress) {
        return inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isAnyLocalAddress();
    }
}
