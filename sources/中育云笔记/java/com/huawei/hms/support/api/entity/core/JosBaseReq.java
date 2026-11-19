package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.InterfaceC7278e;
import p161g5.InterfaceC9271a;

/* loaded from: classes5.dex */
public class JosBaseReq implements InterfaceC7278e {

    @InterfaceC9271a
    private String channelId;

    @InterfaceC9271a
    private String cpId;

    @InterfaceC9271a
    private String hmsSdkVersionName;

    private static <T> T get(T t10) {
        return t10;
    }

    public String getChannelId() {
        return (String) get(this.channelId);
    }

    public String getCpID() {
        return (String) get(this.cpId);
    }

    public String getHmsSdkVersionName() {
        return (String) get(this.hmsSdkVersionName);
    }

    public void setChannelId(String str) {
        this.channelId = str;
    }

    public void setCpID(String str) {
        this.cpId = str;
    }

    public void setHmsSdkVersionName(String str) {
        this.hmsSdkVersionName = str;
    }
}
