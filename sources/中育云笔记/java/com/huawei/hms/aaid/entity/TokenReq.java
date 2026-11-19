package com.huawei.hms.aaid.entity;

import com.huawei.hms.core.aidl.InterfaceC7278e;
import p161g5.InterfaceC9271a;

/* loaded from: classes5.dex */
public class TokenReq implements InterfaceC7278e {

    @InterfaceC9271a
    private String aaid;

    @InterfaceC9271a
    private String appId;

    @InterfaceC9271a
    private boolean firstTime;

    @InterfaceC9271a
    private String packageName;

    @InterfaceC9271a
    private String projectId;

    @InterfaceC9271a
    private String scope;

    @InterfaceC9271a
    private String subjectId;

    @InterfaceC9271a
    private boolean isMultiSender = false;

    @InterfaceC9271a
    private boolean isFastApp = false;

    public String getAaid() {
        return this.aaid;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getPackageName() {
        return this.packageName;
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

    public boolean isFastApp() {
        return this.isFastApp;
    }

    public boolean isFirstTime() {
        return this.firstTime;
    }

    public boolean isMultiSender() {
        return this.isMultiSender;
    }

    public void setAaid(String str) {
        this.aaid = str;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setFastApp(boolean z10) {
        this.isFastApp = z10;
    }

    public void setFirstTime(boolean z10) {
        this.firstTime = z10;
    }

    public void setMultiSender(boolean z10) {
        this.isMultiSender = z10;
    }

    public void setPackageName(String str) {
        this.packageName = str;
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

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass().getName());
        stringBuffer.append("{");
        stringBuffer.append("pkgName: ");
        stringBuffer.append(this.packageName);
        stringBuffer.append(",isFirstTime: ");
        stringBuffer.append(this.firstTime);
        stringBuffer.append(",scope:");
        stringBuffer.append(this.scope);
        stringBuffer.append(",appId:");
        stringBuffer.append(this.appId);
        stringBuffer.append(",projectId:");
        stringBuffer.append(this.projectId);
        stringBuffer.append(",subjectId:");
        stringBuffer.append(this.subjectId);
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
