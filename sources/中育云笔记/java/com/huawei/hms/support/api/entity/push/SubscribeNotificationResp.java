package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.InterfaceC7278e;
import p161g5.InterfaceC9271a;

/* loaded from: classes5.dex */
public class SubscribeNotificationResp implements InterfaceC7278e {

    @InterfaceC9271a
    private int retCode = -1;

    @InterfaceC9271a
    private String subscribeResults;

    public int getRetCode() {
        return this.retCode;
    }

    public String getSubscribeResults() {
        return this.subscribeResults;
    }

    public void setRetCode(int i10) {
        this.retCode = i10;
    }

    public void setSubscribeResults(String str) {
        this.subscribeResults = str;
    }
}
