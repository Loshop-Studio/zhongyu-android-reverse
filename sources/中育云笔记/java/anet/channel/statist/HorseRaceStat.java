package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C5070l;
import anet.channel.strategy.ConnProtocol;
import anet.channel.util.C5085c;

@Monitor(module = "networkPrefer", monitorPoint = "horseRace")
/* loaded from: classes3.dex */
public class HorseRaceStat extends StatObject {

    @Dimension
    public volatile int connErrorCode;

    @Measure
    public volatile long connTime;

    @Dimension
    public volatile String host;

    /* renamed from: ip */
    @Dimension
    public volatile String f2584ip;

    @Dimension
    public volatile String localIP;

    @Dimension
    public volatile String path;

    @Dimension
    public volatile int pingSuccessCount;

    @Dimension
    public volatile int pingTimeoutCount;

    @Dimension
    public volatile int port;

    @Dimension
    public volatile String protocol;

    @Dimension
    public volatile int reqErrorCode;

    @Measure
    public volatile long reqTime;

    @Dimension
    public volatile int connRet = 0;

    @Dimension
    public volatile int reqRet = 0;

    @Dimension
    public volatile String nettype = NetworkStatusHelper.getNetworkSubType();

    @Dimension
    public volatile String mnc = NetworkStatusHelper.getSimOp();

    @Dimension
    public volatile String bssid = NetworkStatusHelper.getWifiBSSID();

    @Dimension
    public volatile int ipStackType = C5085c.m2541c();

    public HorseRaceStat(String str, C5070l.e eVar) {
        this.host = str;
        this.f2584ip = eVar.f2718a;
        this.port = eVar.f2719b.f2688a;
        this.protocol = ConnProtocol.valueOf(eVar.f2719b).name;
        this.path = eVar.f2720c;
    }
}
