package com.blankj.utilcode.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class NetworkUtils$NetworkType {
    public static final NetworkUtils$NetworkType NETWORK_2G;
    public static final NetworkUtils$NetworkType NETWORK_3G;
    public static final NetworkUtils$NetworkType NETWORK_4G;
    public static final NetworkUtils$NetworkType NETWORK_5G;
    public static final NetworkUtils$NetworkType NETWORK_ETHERNET;
    public static final NetworkUtils$NetworkType NETWORK_NO;
    public static final NetworkUtils$NetworkType NETWORK_UNKNOWN;
    public static final NetworkUtils$NetworkType NETWORK_WIFI;

    /* renamed from: a */
    public static final /* synthetic */ NetworkUtils$NetworkType[] f2112a;

    static {
        NetworkUtils$NetworkType networkUtils$NetworkType = new NetworkUtils$NetworkType("NETWORK_ETHERNET", 0);
        NETWORK_ETHERNET = networkUtils$NetworkType;
        NetworkUtils$NetworkType networkUtils$NetworkType2 = new NetworkUtils$NetworkType("NETWORK_WIFI", 1);
        NETWORK_WIFI = networkUtils$NetworkType2;
        NetworkUtils$NetworkType networkUtils$NetworkType3 = new NetworkUtils$NetworkType("NETWORK_5G", 2);
        NETWORK_5G = networkUtils$NetworkType3;
        NetworkUtils$NetworkType networkUtils$NetworkType4 = new NetworkUtils$NetworkType("NETWORK_4G", 3);
        NETWORK_4G = networkUtils$NetworkType4;
        NetworkUtils$NetworkType networkUtils$NetworkType5 = new NetworkUtils$NetworkType("NETWORK_3G", 4);
        NETWORK_3G = networkUtils$NetworkType5;
        NetworkUtils$NetworkType networkUtils$NetworkType6 = new NetworkUtils$NetworkType("NETWORK_2G", 5);
        NETWORK_2G = networkUtils$NetworkType6;
        NetworkUtils$NetworkType networkUtils$NetworkType7 = new NetworkUtils$NetworkType("NETWORK_UNKNOWN", 6);
        NETWORK_UNKNOWN = networkUtils$NetworkType7;
        NetworkUtils$NetworkType networkUtils$NetworkType8 = new NetworkUtils$NetworkType("NETWORK_NO", 7);
        NETWORK_NO = networkUtils$NetworkType8;
        f2112a = new NetworkUtils$NetworkType[]{networkUtils$NetworkType, networkUtils$NetworkType2, networkUtils$NetworkType3, networkUtils$NetworkType4, networkUtils$NetworkType5, networkUtils$NetworkType6, networkUtils$NetworkType7, networkUtils$NetworkType8};
    }

    public static NetworkUtils$NetworkType valueOf(String str) {
        return (NetworkUtils$NetworkType) Enum.valueOf(NetworkUtils$NetworkType.class, str);
    }

    public static NetworkUtils$NetworkType[] values() {
        return (NetworkUtils$NetworkType[]) f2112a.clone();
    }
}
