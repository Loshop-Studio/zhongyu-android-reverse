package anetwork.channel.interceptor;

import anet.channel.bytes.ByteArray;
import anetwork.channel.aidl.DefaultFinishEvent;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface Callback {
    void onDataReceiveSize(int i4, int i5, ByteArray byteArray);

    void onFinish(DefaultFinishEvent defaultFinishEvent);

    void onResponseCode(int i4, Map<String, List<String>> map);
}
