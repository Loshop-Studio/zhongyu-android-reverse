package com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.InterfaceC7278e;
import p161g5.InterfaceC9271a;

/* loaded from: classes5.dex */
public class ProfileReq implements InterfaceC7278e {

    @InterfaceC9271a
    private int operation;

    @InterfaceC9271a
    private String pkgName;

    @InterfaceC9271a
    private String profileId;

    @InterfaceC9271a
    private String subjectId;

    @InterfaceC9271a
    private int type;

    public int getOperation() {
        return this.operation;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public String getProfileId() {
        return this.profileId;
    }

    public String getSubjectId() {
        return this.subjectId;
    }

    public int getType() {
        return this.type;
    }

    public void setOperation(int i10) {
        this.operation = i10;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setProfileId(String str) {
        this.profileId = str;
    }

    public void setSubjectId(String str) {
        this.subjectId = str;
    }

    public void setType(int i10) {
        this.type = i10;
    }

    public String toString() {
        return getClass().getName() + "{ pkgName: " + this.pkgName + ",subjectId: " + this.subjectId + ",operation: " + this.operation + " type: " + this.type + "}";
    }
}
