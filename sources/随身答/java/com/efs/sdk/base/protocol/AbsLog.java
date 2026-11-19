package com.efs.sdk.base.protocol;

/* loaded from: classes3.dex */
public abstract class AbsLog implements ILogProtocol {

    /* renamed from: cp */
    private String f4783cp = "none";

    /* renamed from: de */
    private byte f4784de = 1;
    private String logType;

    public AbsLog(String str) {
        this.logType = str;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public String getLogType() {
        return this.logType;
    }

    public boolean isCp() {
        return !this.f4783cp.equals("none");
    }

    public boolean isDe() {
        return this.f4784de != 1;
    }

    public void setCp(String str) {
        this.f4783cp = str;
    }

    public void setDe(byte b10) {
        this.f4784de = b10;
    }
}
