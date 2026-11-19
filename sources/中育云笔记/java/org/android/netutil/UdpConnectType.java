package org.android.netutil;

/* loaded from: classes6.dex */
public class UdpConnectType {
    /* renamed from: a */
    public static boolean m22260a() {
        return nativeTestUdpConnectIpv4() != 0;
    }

    /* renamed from: b */
    public static boolean m22261b() {
        return nativeTestUdpConnectIpv6() != 0;
    }

    private static native int nativeTestUdpConnectIpv4();

    private static native int nativeTestUdpConnectIpv6();
}
