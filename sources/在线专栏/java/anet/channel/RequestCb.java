package anet.channel;

import anet.channel.bytes.ByteArray;
import anet.channel.statist.RequestStatistic;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface RequestCb {
    void onDataReceive(ByteArray byteArray, boolean z3);

    void onFinish(int i4, String str, RequestStatistic requestStatistic);

    void onResponseCode(int i4, Map<String, List<String>> map);
}
