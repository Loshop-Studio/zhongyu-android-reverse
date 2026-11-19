package anet.channel;

import anet.channel.util.HttpConstant;
import anetwork.channel.cache.CachePrediction;
import java.util.Map;

/* renamed from: anet.channel.k */
/* loaded from: classes.dex */
class C0902k implements CachePrediction {

    /* renamed from: a */
    final /* synthetic */ RunnableC0901j f5182a;

    C0902k(RunnableC0901j runnableC0901j) {
        this.f5182a = runnableC0901j;
    }

    @Override // anetwork.channel.cache.CachePrediction
    public boolean handleCache(String str, Map<String, String> map) {
        return "weex".equals(map.get(HttpConstant.F_REFER));
    }
}
