package anetwork.channel.stat;

import anet.channel.util.StringUtils;
import anetwork.channel.statist.StatisticData;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
class NetworkStatCache implements INetworkStat {
    private static final int MAX_SIZE = 100;
    private static final String RESET_STAT = "{\"oneWayTime\" : 0, \"totalSize\" : 0}";
    private Map<String, String> lruCache;

    public static class holder {
        public static NetworkStatCache instance = new NetworkStatCache();

        private holder() {
        }
    }

    public static NetworkStatCache getInstance() {
        return holder.instance;
    }

    @Override // anetwork.channel.stat.INetworkStat
    public String get(String str) {
        return this.lruCache.get(str);
    }

    @Override // anetwork.channel.stat.INetworkStat
    public void put(String str, StatisticData statisticData) {
        if (StringUtils.isBlank(str)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("{\"oneWayTime\" : ");
        sb2.append(statisticData.oneWayTime_ANet);
        sb2.append(", \"totalSize\" : ");
        sb2.append(statisticData.totalSize);
        sb2.append("}");
        this.lruCache.put(str, sb2.toString());
    }

    @Override // anetwork.channel.stat.INetworkStat
    public void reset(String str) {
        if (this.lruCache.containsKey(str)) {
            this.lruCache.put(str, RESET_STAT);
        }
    }

    private NetworkStatCache() {
        this.lruCache = Collections.synchronizedMap(new LinkedHashMap<String, String>() { // from class: anetwork.channel.stat.NetworkStatCache.1
            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<String, String> entry) {
                return size() > 100;
            }
        });
    }
}
