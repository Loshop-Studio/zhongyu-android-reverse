package anet.channel.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class StrategyTemplate {
    Map<String, ConnProtocol> templateMap = new ConcurrentHashMap();

    /* renamed from: anet.channel.strategy.StrategyTemplate$a */
    static class C0932a {

        /* renamed from: a */
        static StrategyTemplate f5375a = new StrategyTemplate();

        C0932a() {
        }
    }

    public static StrategyTemplate getInstance() {
        return C0932a.f5375a;
    }

    public ConnProtocol getConnProtocol(String str) {
        return this.templateMap.get(str);
    }

    public void registerConnProtocol(String str, ConnProtocol connProtocol) {
        if (connProtocol != null) {
            this.templateMap.put(str, connProtocol);
            try {
                IStrategyInstance strategyCenter = StrategyCenter.getInstance();
                if (strategyCenter instanceof C0942g) {
                    ((C0942g) strategyCenter).f5399b.f5360c.m4602a(str, connProtocol);
                }
            } catch (Exception unused) {
            }
        }
    }
}
