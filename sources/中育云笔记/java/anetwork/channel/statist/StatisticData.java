package anetwork.channel.statist;

import anet.channel.statist.RequestStatistic;
import anet.channel.util.StringUtils;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class StatisticData implements Serializable, Cloneable {
    private static final long serialVersionUID = -3538602124202475612L;
    public String locationUrl;
    public String netStatSum;

    @Deprecated
    public String quicConnectionID;

    @Deprecated
    public int redirectTime;
    public int retryTime;
    public String connectionType = "";
    public boolean isRequestSuccess = false;
    public int resultCode = 0;
    public String host = "";

    @Deprecated
    public String api_v = "";
    public String ip_port = "";

    @Deprecated
    public boolean isSpdy = false;
    public boolean isSSL = false;

    @Deprecated
    public int dnsTime = 0;

    @Deprecated
    public int isDNSTimeout = 0;

    @Deprecated
    public long tcpLinkDate = 0;

    @Deprecated
    public long tcpConnTime = 0;
    public long oneWayTime_ANet = 0;
    public long cacheTime = 0;

    @Deprecated
    public long oneWayTime_AEngine = 0;

    @Deprecated
    public long oneWayTime_Jni = 0;
    public long postBodyTime = 0;

    @Deprecated
    public long spdyWaitTime = 0;
    public long processTime = 0;
    public long sendBeforeTime = 0;
    public long firstDataTime = 0;
    public long recDataTime = 0;

    @Deprecated
    public long receiveDataTime = 0;
    public long serverRT = 0;
    public long rtt = 0;

    @Deprecated
    public long netTime = 0;
    public long sendSize = 0;
    public long totalSize = 0;

    @Deprecated
    public long responseBodySize = 0;
    public long dataSpeed = 0;

    @Deprecated
    public String timeoutType = "";

    public void filledBy(RequestStatistic requestStatistic) {
        if (requestStatistic != null) {
            this.resultCode = requestStatistic.statusCode;
            this.connectionType = requestStatistic.protocolType;
            this.isRequestSuccess = requestStatistic.ret == 1;
            this.host = requestStatistic.host;
            if (requestStatistic.f2587ip != null && requestStatistic.port != 0) {
                this.ip_port = String.format("%s:%d", requestStatistic.f2587ip, Integer.valueOf(requestStatistic.port));
            }
            this.retryTime = requestStatistic.retryTimes;
            this.isSSL = requestStatistic.isSSL;
            this.oneWayTime_ANet = requestStatistic.oneWayTime;
            this.cacheTime = requestStatistic.cacheTime;
            this.processTime = requestStatistic.processTime;
            this.sendBeforeTime = requestStatistic.sendBeforeTime;
            this.firstDataTime = requestStatistic.firstDataTime;
            this.recDataTime = requestStatistic.recDataTime;
            this.sendSize = requestStatistic.sendDataSize;
            this.totalSize = requestStatistic.recDataSize;
            this.serverRT = requestStatistic.serverRT;
            long j10 = this.recDataTime;
            this.dataSpeed = j10 != 0 ? this.totalSize / j10 : this.totalSize;
            this.locationUrl = requestStatistic.locationUrl;
        }
    }

    public String sumNetStat() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("isSuccess=");
        sb2.append(this.isRequestSuccess);
        sb2.append(",host=");
        sb2.append(this.host);
        sb2.append(",resultCode=");
        sb2.append(this.resultCode);
        sb2.append(",connType=");
        sb2.append(this.connectionType);
        sb2.append(",oneWayTime_ANet=");
        sb2.append(this.oneWayTime_ANet);
        sb2.append(",ip_port=");
        sb2.append(this.ip_port);
        sb2.append(",isSSL=");
        sb2.append(this.isSSL);
        sb2.append(",cacheTime=");
        sb2.append(this.cacheTime);
        sb2.append(",processTime=");
        sb2.append(this.processTime);
        sb2.append(",sendBeforeTime=");
        sb2.append(this.sendBeforeTime);
        sb2.append(",postBodyTime=");
        sb2.append(this.postBodyTime);
        sb2.append(",firstDataTime=");
        sb2.append(this.firstDataTime);
        sb2.append(",recDataTime=");
        sb2.append(this.recDataTime);
        sb2.append(",serverRT=");
        sb2.append(this.serverRT);
        sb2.append(",rtt=");
        sb2.append(this.rtt);
        sb2.append(",sendSize=");
        sb2.append(this.sendSize);
        sb2.append(",totalSize=");
        sb2.append(this.totalSize);
        sb2.append(",dataSpeed=");
        sb2.append(this.dataSpeed);
        sb2.append(",retryTime=");
        sb2.append(this.retryTime);
        return sb2.toString();
    }

    public String toString() {
        if (StringUtils.isBlank(this.netStatSum)) {
            this.netStatSum = sumNetStat();
        }
        return "StatisticData [" + this.netStatSum + "]";
    }
}
