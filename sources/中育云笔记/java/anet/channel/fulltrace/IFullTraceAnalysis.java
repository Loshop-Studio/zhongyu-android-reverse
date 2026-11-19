package anet.channel.fulltrace;

import anet.channel.statist.RequestStatistic;

/* loaded from: classes3.dex */
public interface IFullTraceAnalysis {
    void commitRequest(String str, RequestStatistic requestStatistic);

    String createRequest();

    C5017b getSceneInfo();
}
