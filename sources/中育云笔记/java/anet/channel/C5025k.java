package anet.channel;

import anet.channel.util.HttpConstant;
import anetwork.channel.cache.CachePrediction;
import java.util.Map;

/* renamed from: anet.channel.k */
/* loaded from: classes3.dex */
class C5025k implements CachePrediction {

    /* renamed from: a */
    final /* synthetic */ RunnableC5024j f2460a;

    public C5025k(RunnableC5024j runnableC5024j) {
        this.f2460a = runnableC5024j;
    }

    @Override // anetwork.channel.cache.CachePrediction
    public boolean handleCache(String str, Map<String, String> map) {
        return "weex".equals(map.get(HttpConstant.F_REFER));
    }
}
