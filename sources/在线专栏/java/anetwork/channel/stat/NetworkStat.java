package anetwork.channel.stat;

/* loaded from: classes.dex */
public class NetworkStat {
    public static INetworkStat getNetworkStat() {
        return NetworkStatCache.getInstance();
    }
}
