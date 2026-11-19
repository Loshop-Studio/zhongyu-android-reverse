package com.huawei.hms.support.api.client;

import com.huawei.hms.core.aidl.InterfaceC7277d;
import java.util.List;

/* loaded from: classes5.dex */
public interface AidlApiClient extends ApiClient {
    List<String> getApiNameList();

    InterfaceC7277d getService();
}
