package com.huawei.hms.aaid.entity;

import com.huawei.hms.core.aidl.InterfaceC7278e;
import p161g5.InterfaceC9271a;

/* loaded from: classes5.dex */
public class DeleteTokenReq implements InterfaceC7278e {

    @InterfaceC9271a
    private String appId;

    @InterfaceC9271a
    private String pkgName;

    @InterfaceC9271a
    private String projectId;

    @InterfaceC9271a
    private String scope;

    @InterfaceC9271a
    private String subjectId;

    @InterfaceC9271a
    private String token;

    @InterfaceC9271a
    private boolean isMultiSender = false;

    @InterfaceC9271a
    private int deleteType = 0;

    @InterfaceC9271a
    private boolean isFastApp = false;

    public String getAppId() {
        return this.appId;
    }

    public int getDeleteType() {
        return this.deleteType;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public String getScope() {
        return this.scope;
    }

    public String getSubjectId() {
        return this.subjectId;
    }

    public String getToken() {
        return this.token;
    }

    public boolean isFastApp() {
        return this.isFastApp;
    }

    public boolean isMultiSender() {
        return this.isMultiSender;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setDeleteType(int i10) {
        this.deleteType = i10;
    }

    public void setFastApp(boolean z10) {
        this.isFastApp = z10;
    }

    public void setMultiSender(boolean z10) {
        this.isMultiSender = z10;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setProjectId(String str) {
        this.projectId = str;
    }

    public void setScope(String str) {
        this.scope = str;
    }

    public void setSubjectId(String str) {
        this.subjectId = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass().getName());
        stringBuffer.append("{");
        stringBuffer.append("pkgName: ");
        stringBuffer.append(this.pkgName);
        stringBuffer.append(",scope:");
        stringBuffer.append(this.scope);
        stringBuffer.append(",appId:");
        stringBuffer.append(this.appId);
        stringBuffer.append(",projectId:");
        stringBuffer.append(this.projectId);
        stringBuffer.append(",subjectId:");
        stringBuffer.append(this.subjectId);
        stringBuffer.append(",subjectId:");
        stringBuffer.append(this.subjectId);
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
