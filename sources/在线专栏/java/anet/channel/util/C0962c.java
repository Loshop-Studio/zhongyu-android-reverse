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
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.InvalidParameterException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.android.netutil.UdpConnectType;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;

/* renamed from: anet.channel.util.c */
/* loaded from: classes.dex */
public class C0962c {
    public static final int IPV4_ONLY = 1;
    public static final int IPV6_ONLY = 2;
    public static final int IP_DUAL_STACK = 3;
    public static final int IP_STACK_UNKNOWN = 0;

    /* renamed from: b */
    static volatile String f5475b;

    /* renamed from: c */
    static C0965f f5476c;

    /* renamed from: a */
    static final byte[][] f5474a = {new byte[]{-64, 0, 0, -86}, new byte[]{-64, 0, 0, -85}};

    /* renamed from: d */
    static ConcurrentHashMap<String, C0965f> f5477d = new ConcurrentHashMap<>();

    /* renamed from: e */
    static ConcurrentHashMap<String, Integer> f5478e = new ConcurrentHashMap<>();

    static {
        f5475b = null;
        f5476c = null;
        try {
            f5476c = new C0965f((Inet6Address) InetAddress.getAllByName("64:ff9b::")[0], 96);
            f5475b = m4648b(NetworkStatusHelper.getStatus());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static boolean m4646a() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static String m4648b(NetworkStatusHelper.NetworkStatus networkStatus) {
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
    public static int m4650c() {
        Integer num = f5478e.get(f5475b);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: d */
    public static C0965f m4651d() {
        C0965f c0965f = f5477d.get(f5475b);
        return c0965f == null ? f5476c : c0965f;
    }

    /* renamed from: e */
    public static void m4652e() {
        if (!AwcnConfig.isIpv6Enable()) {
            ALog.m4638e("awcn.Inet64Util", "[startIpStackDetect]ipv6Enable=false", null, new Object[0]);
            return;
        }
        f5475b = m4648b(NetworkStatusHelper.getStatus());
        if (f5478e.putIfAbsent(f5475b, 0) != null) {
            return;
        }
        int iM4657j = m4657j();
        f5478e.put(f5475b, Integer.valueOf(iM4657j));
        NetTypeStat netTypeStat = new NetTypeStat();
        netTypeStat.ipStackType = iM4657j;
        String str = f5475b;
        if (iM4657j == 2 || iM4657j == 3) {
            ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0963d(str, netTypeStat), 1500L, TimeUnit.MILLISECONDS);
        } else if (GlobalAppRuntimeInfo.isTargetProcess()) {
            AppMonitor.getInstance().commitStat(netTypeStat);
        }
    }

    /* renamed from: h */
    private static int m4655h() throws SocketException {
        String str;
        int iIntValue;
        TreeMap treeMap = new TreeMap();
        Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
        while (true) {
            str = null;
            iIntValue = 0;
            if (!it.hasNext()) {
                break;
            }
            NetworkInterface networkInterface = (NetworkInterface) it.next();
            if (!networkInterface.getInterfaceAddresses().isEmpty()) {
                String displayName = networkInterface.getDisplayName();
                ALog.m4639i("awcn.Inet64Util", "find NetworkInterface:" + displayName, null, new Object[0]);
                Iterator<InterfaceAddress> it2 = networkInterface.getInterfaceAddresses().iterator();
                int i4 = 0;
                while (it2.hasNext()) {
                    InetAddress address = it2.next().getAddress();
                    if (address instanceof Inet6Address) {
                        Inet6Address inet6Address = (Inet6Address) address;
                        if (!m4647a(inet6Address)) {
                            ALog.m4638e("awcn.Inet64Util", "Found IPv6 address:" + inet6Address.toString(), null, new Object[0]);
                            i4 |= 2;
                        }
                    } else if (address instanceof Inet4Address) {
                        Inet4Address inet4Address = (Inet4Address) address;
                        if (!m4647a((InetAddress) inet4Address) && !inet4Address.getHostAddress().startsWith("192.168.43.")) {
                            ALog.m4638e("awcn.Inet64Util", "Found IPv4 address:" + inet4Address.toString(), null, new Object[0]);
                            i4 |= 1;
                        }
                    }
                }
                if (i4 != 0) {
                    treeMap.put(displayName.toLowerCase(), Integer.valueOf(i4));
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
            Iterator it3 = treeMap.entrySet().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it3.next();
                if (((String) entry.getKey()).startsWith(str)) {
                    iIntValue = ((Integer) entry.getValue()).intValue();
                    break;
                }
            }
        }
        return (iIntValue == 2 && treeMap.containsKey("v4-wlan0")) ? iIntValue | ((Integer) treeMap.remove("v4-wlan0")).intValue() : iIntValue;
    }

    /* renamed from: i */
    private static int m4656i() throws SpdyErrorException, UnsatisfiedLinkError {
        SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        boolean zTestUdpConnectIpv4 = UdpConnectType.testUdpConnectIpv4();
        return UdpConnectType.testUdpConnectIpv6() ? (zTestUdpConnectIpv4 ? 1 : 0) | 2 : zTestUdpConnectIpv4 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object[]] */
    /* renamed from: j */
    public static int m4657j() {
        ?? IsIpStackDetectByUdpConnect;
        int iM4655h;
        try {
            IsIpStackDetectByUdpConnect = AwcnConfig.isIpStackDetectByUdpConnect();
            try {
                if (IsIpStackDetectByUdpConnect != 0) {
                    String str = "udp_connect";
                    iM4655h = m4656i();
                    IsIpStackDetectByUdpConnect = str;
                } else {
                    String str2 = "interfaces";
                    iM4655h = m4655h();
                    IsIpStackDetectByUdpConnect = str2;
                }
            } catch (Throwable th) {
                th = th;
                ALog.m4637e("awcn.Inet64Util", "[detectIpStack]error.", null, th, new Object[0]);
                iM4655h = 0;
                ALog.m4638e("awcn.Inet64Util", "startIpStackDetect", null, new Object[]{"ip stack", Integer.valueOf(iM4655h), "detectType", IsIpStackDetectByUdpConnect});
                return iM4655h;
            }
        } catch (Throwable th2) {
            th = th2;
            IsIpStackDetectByUdpConnect = 0;
        }
        ALog.m4638e("awcn.Inet64Util", "startIpStackDetect", null, new Object[]{"ip stack", Integer.valueOf(iM4655h), "detectType", IsIpStackDetectByUdpConnect});
        return iM4655h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static C0965f m4658k() throws UnknownHostException {
        InetAddress byName;
        boolean z3;
        try {
            byName = InetAddress.getByName("ipv4only.arpa");
        } catch (Exception unused) {
            byName = null;
        }
        if (byName instanceof Inet6Address) {
            ALog.m4639i("awcn.Inet64Util", "Resolved AAAA: " + byName.toString(), null, new Object[0]);
            byte[] address = byName.getAddress();
            if (address.length != 16) {
                return null;
            }
            int i4 = 12;
            while (true) {
                z3 = true;
                if (i4 < 0) {
                    z3 = false;
                    break;
                }
                byte b4 = address[i4];
                byte[][] bArr = f5474a;
                if ((b4 & bArr[0][0]) != 0 && address[i4 + 1] == 0 && address[i4 + 2] == 0) {
                    int i5 = i4 + 3;
                    if (address[i5] == bArr[0][3] || address[i5] == bArr[1][3]) {
                        break;
                    }
                }
                i4--;
            }
            if (z3) {
                address[i4 + 3] = 0;
                address[i4 + 2] = 0;
                address[i4 + 1] = 0;
                address[i4] = 0;
                return new C0965f(Inet6Address.getByAddress("ipv4only.arpa", address, 0), i4 * 8);
            }
        } else if (byName instanceof Inet4Address) {
            ALog.m4639i("awcn.Inet64Util", "Resolved A: " + byName.toString(), null, new Object[0]);
        }
        return null;
    }

    /* renamed from: a */
    public static String m4645a(Inet4Address inet4Address) throws Exception {
        if (inet4Address == null) {
            throw new InvalidParameterException("address in null");
        }
        C0965f c0965fM4651d = m4651d();
        if (c0965fM4651d == null) {
            throw new Exception("cannot get nat64 prefix");
        }
        byte[] address = inet4Address.getAddress();
        byte[] address2 = c0965fM4651d.f5483b.getAddress();
        int i4 = c0965fM4651d.f5482a / 8;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = i5 + i4;
            if (i7 > 15 || i6 >= 4) {
                break;
            }
            if (i7 != 8) {
                address2[i7] = (byte) (address[i6] | address2[i7]);
                i6++;
            }
            i5++;
        }
        return InetAddress.getByAddress(address2).getHostAddress();
    }

    /* renamed from: b */
    public static boolean m4649b() {
        Integer num = f5478e.get(f5475b);
        return num != null && num.intValue() == 1;
    }

    /* renamed from: a */
    public static String m4644a(String str) throws Exception {
        return m4645a((Inet4Address) Inet4Address.getByName(str));
    }

    /* renamed from: a */
    private static boolean m4647a(InetAddress inetAddress) {
        return inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isAnyLocalAddress();
    }
}
