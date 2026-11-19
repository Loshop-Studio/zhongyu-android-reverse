package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.InterfaceC7278e;
import p161g5.InterfaceC9271a;

/* loaded from: classes5.dex */
public class UpSendMsgReq implements InterfaceC7278e {

    @InterfaceC9271a
    private String collapseKey;

    @InterfaceC9271a
    private String data;

    @InterfaceC9271a
    private String msgId;

    @InterfaceC9271a
    private String msgType;

    @InterfaceC9271a
    private String packageName;

    @InterfaceC9271a
    private int receiptMode;

    @InterfaceC9271a
    private int sendMode;

    /* renamed from: to */
    @InterfaceC9271a
    private String f11746to;

    @InterfaceC9271a
    private String token;

    @InterfaceC9271a
    private int ttl;

    public String getCollapseKey() {
        return this.collapseKey;
    }

    public String getData() {
        return this.data;
    }

    public String getMessageId() {
        return this.msgId;
    }

    public String getMessageType() {
        return this.msgType;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getReceiptMode() {
        return this.receiptMode;
    }

    public int getSendMode() {
        return this.sendMode;
    }

    public String getTo() {
        return this.f11746to;
    }

    public String getToken() {
        return this.token;
    }

    public int getTtl() {
        return this.ttl;
    }

    public void setCollapseKey(String str) {
        this.collapseKey = str;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setMessageId(String str) {
        this.msgId = str;
    }

    public void setMessageType(String str) {
        this.msgType = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setReceiptMode(int i10) {
        this.receiptMode = i10;
    }

    public void setSendMode(int i10) {
        this.sendMode = i10;
    }

    public void setTo(String str) {
        this.f11746to = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setTtl(int i10) {
        this.ttl = i10;
    }
}
