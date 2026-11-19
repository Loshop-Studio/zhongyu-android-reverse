package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.InterfaceC7278e;
import p161g5.InterfaceC9271a;

/* loaded from: classes5.dex */
public class SubscribeNotificationReq implements InterfaceC7278e {

    @InterfaceC9271a
    private String entityIds;

    @InterfaceC9271a
    private String token;

    public String getEntityIds() {
        return this.entityIds;
    }

    public String getToken() {
        return this.token;
    }

    public void setEntityIds(String str) {
        this.entityIds = str;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
