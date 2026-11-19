package anetwork.channel.stat;

/* loaded from: classes3.dex */
public class NetworkStat {
    public static INetworkStat getNetworkStat() {
        return NetworkStatCache.getInstance();
    }
}
