package anet.channel.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class StrategyTemplate {
    Map<String, ConnProtocol> templateMap = new ConcurrentHashMap();

    /* renamed from: anet.channel.strategy.StrategyTemplate$a */
    public static class C5055a {

        /* renamed from: a */
        static StrategyTemplate f2653a = new StrategyTemplate();
    }

    public static StrategyTemplate getInstance() {
        return C5055a.f2653a;
    }

    public ConnProtocol getConnProtocol(String str) {
        return this.templateMap.get(str);
    }

    public void registerConnProtocol(String str, ConnProtocol connProtocol) {
        if (connProtocol != null) {
            this.templateMap.put(str, connProtocol);
            try {
                IStrategyInstance strategyCenter = StrategyCenter.getInstance();
                if (strategyCenter instanceof C5065g) {
                    ((C5065g) strategyCenter).f2677b.f2638c.m2493a(str, connProtocol);
                }
            } catch (Exception unused) {
            }
        }
    }
}
