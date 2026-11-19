package com.huawei.hms.common.internal;

import com.huawei.hms.core.aidl.InterfaceC7278e;

/* loaded from: classes5.dex */
public interface AnyClient {

    public interface CallBack {
        void onCallback(InterfaceC7278e interfaceC7278e, String str);
    }

    void connect(int i10);

    void connect(int i10, boolean z10);

    void disconnect();

    int getRequestHmsVersionCode();

    String getSessionId();

    boolean isConnected();

    boolean isConnecting();

    void post(InterfaceC7278e interfaceC7278e, String str, CallBack callBack);
}
