package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.InterfaceC7278e;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p161g5.InterfaceC9271a;

/* loaded from: classes5.dex */
public class ConnectResp implements InterfaceC7278e {

    @InterfaceC9271a
    public List<Integer> protocolVersion = Arrays.asList(1, 2);

    @InterfaceC9271a
    public String sessionId;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("protocol version:");
        Iterator<Integer> it = this.protocolVersion.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(',');
        }
        return sb2.toString();
    }
}
