package com.huawei.hms.support.api.entity.auth;

import com.huawei.hms.core.aidl.InterfaceC7278e;

/* loaded from: classes5.dex */
public abstract class AbstractResp implements InterfaceC7278e {

    /* renamed from: c */
    public int f11730c = 0;

    /* renamed from: d */
    public String f11731d;

    public String getErrorReason() {
        return this.f11731d;
    }

    public int getRtnCode() {
        return this.f11730c;
    }

    public void setErrorReason(String str) {
        this.f11731d = str;
    }

    public void setRtnCode(int i10) {
        this.f11730c = i10;
    }
}
