package com.huawei.hms.support.api.entity.push;

import android.content.Context;
import com.huawei.hms.core.aidl.InterfaceC7278e;
import com.huawei.hms.utils.Util;
import p161g5.InterfaceC9271a;
import p344t5.AbstractC11230d;

/* loaded from: classes5.dex */
public class SubscribeReq implements InterfaceC7278e {

    @InterfaceC9271a
    private String appId;

    @InterfaceC9271a
    private boolean isFastApp = false;

    @InterfaceC9271a
    private String operation;

    @InterfaceC9271a
    private String packageName;

    @InterfaceC9271a
    private String projectId;

    @InterfaceC9271a
    private String subjectId;

    @InterfaceC9271a
    private String token;

    @InterfaceC9271a
    private String topic;

    public SubscribeReq() {
    }

    public String getAppId() {
        return this.appId;
    }

    public String getOperation() {
        return this.operation;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public String getSubjectId() {
        return this.subjectId;
    }

    public String getToken() {
        return this.token;
    }

    public String getTopic() {
        return this.topic;
    }

    public boolean isFastApp() {
        return this.isFastApp;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setFastApp(boolean z10) {
        this.isFastApp = z10;
    }

    public void setOperation(String str) {
        this.operation = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setProjectId(String str) {
        this.projectId = str;
    }

    public void setSubjectId(String str) {
        this.subjectId = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setTopic(String str) {
        this.topic = str;
    }

    public String toString() {
        return "SubscribeReq{packageName='" + this.packageName + "', operation='" + this.operation + "'}";
    }

    public SubscribeReq(Context context, String str, String str2) {
        this.packageName = context.getPackageName();
        this.operation = str;
        this.topic = str2;
        this.appId = Util.getAppId(context);
        this.projectId = AbstractC11230d.m24993b(context);
    }
}
