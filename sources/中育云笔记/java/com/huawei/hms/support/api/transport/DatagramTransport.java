package com.huawei.hms.support.api.transport;

import com.huawei.hms.core.aidl.InterfaceC7278e;
import com.huawei.hms.support.api.client.ApiClient;

/* loaded from: classes5.dex */
public interface DatagramTransport {

    /* renamed from: com.huawei.hms.support.api.transport.DatagramTransport$a */
    public interface InterfaceC7338a {
        /* renamed from: a */
        void mo8680a(int i10, InterfaceC7278e interfaceC7278e);
    }

    void post(ApiClient apiClient, InterfaceC7338a interfaceC7338a);

    void send(ApiClient apiClient, InterfaceC7338a interfaceC7338a);
}
