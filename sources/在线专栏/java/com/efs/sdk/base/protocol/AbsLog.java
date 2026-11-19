package com.efs.sdk.base.protocol;

import com.efs.sdk.base.Constants;

/* loaded from: classes.dex */
public abstract class AbsLog implements ILogProtocol {

    /* renamed from: cp */
    private String f7149cp = Constants.CP_NONE;

    /* renamed from: de */
    private byte f7150de = 1;
    private String logType;

    public AbsLog(String str) {
        this.logType = str;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public String getLogType() {
        return this.logType;
    }

    public boolean isCp() {
        return !this.f7149cp.equals(Constants.CP_NONE);
    }

    public boolean isDe() {
        return this.f7150de != 1;
    }

    public void setCp(String str) {
        this.f7149cp = str;
    }

    public void setDe(byte b4) {
        this.f7150de = b4;
    }
}
