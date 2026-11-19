package com.huawei.hms.aaid.entity;

import com.huawei.hms.support.api.client.Result;
import p161g5.InterfaceC9271a;

/* loaded from: classes5.dex */
public class TokenResult extends Result {

    @InterfaceC9271a
    private String belongId;

    @InterfaceC9271a
    private String token = "";

    @InterfaceC9271a
    private int retCode = 0;

    public String getBelongId() {
        return this.belongId;
    }

    public int getRetCode() {
        return this.retCode;
    }

    public String getToken() {
        return this.token;
    }

    public void setBelongId(String str) {
        this.belongId = str;
    }

    public void setRetCode(int i10) {
        this.retCode = i10;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
