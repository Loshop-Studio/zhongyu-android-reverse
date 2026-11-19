package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.InterfaceC7278e;
import p161g5.InterfaceC9271a;

/* loaded from: classes5.dex */
public class AttributionReportReq implements InterfaceC7278e {

    @InterfaceC9271a
    String appVersion;

    @InterfaceC9271a
    String campaignId;

    @InterfaceC9271a
    int eventId;

    @InterfaceC9271a
    String haStorageId;

    @InterfaceC9271a
    String msgId;

    @InterfaceC9271a
    String pkgName;

    @InterfaceC9271a
    String reqPermission;

    @InterfaceC9271a
    long timeStamp;

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getCampaignId() {
        return this.campaignId;
    }

    public int getEventId() {
        return this.eventId;
    }

    public String getHaStorageId() {
        return this.haStorageId;
    }

    public String getMsgId() {
        return this.msgId;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public String getReqPermission() {
        return this.reqPermission;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setCampaignId(String str) {
        this.campaignId = str;
    }

    public void setEventId(int i10) {
        this.eventId = i10;
    }

    public void setHaStorageId(String str) {
        this.haStorageId = str;
    }

    public void setMsgId(String str) {
        this.msgId = str;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setReqPermission(String str) {
        this.reqPermission = str;
    }

    public void setTimeStamp(long j10) {
        this.timeStamp = j10;
    }

    public String toString() {
        return " { eventId:" + this.eventId + " pkgName:" + this.pkgName + "}";
    }
}
