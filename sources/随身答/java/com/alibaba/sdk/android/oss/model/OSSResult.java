package com.alibaba.sdk.android.oss.model;

import java.util.Map;

/* loaded from: classes3.dex */
public class OSSResult {
    private Long clientCRC;
    private String requestId;
    private Map<String, String> responseHeader;
    private Long serverCRC;
    private int statusCode;

    public Long getClientCRC() {
        return this.clientCRC;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public Map<String, String> getResponseHeader() {
        return this.responseHeader;
    }

    public Long getServerCRC() {
        return this.serverCRC;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setClientCRC(Long l9) {
        if (l9 == null || l9.longValue() == 0) {
            return;
        }
        this.clientCRC = l9;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setResponseHeader(Map<String, String> map) {
        this.responseHeader = map;
    }

    public void setServerCRC(Long l9) {
        if (l9 == null || l9.longValue() == 0) {
            return;
        }
        this.serverCRC = l9;
    }

    public void setStatusCode(int i9) {
        this.statusCode = i9;
    }

    public String toString() {
        return String.format("OSSResult<%s>: \nstatusCode:%d,\nresponseHeader:%s,\nrequestId:%s", super.toString(), Integer.valueOf(this.statusCode), this.responseHeader.toString(), this.requestId);
    }
}
