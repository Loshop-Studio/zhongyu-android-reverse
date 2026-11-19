package com.zykj.lib.ota.bean;

import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC9133u;

@Keep
/* loaded from: classes4.dex */
public final class VersionInfoReq {
    private final AppType appType;
    private final String packageName;
    private final int version;

    public VersionInfoReq(String packageName, int i10, AppType appType) {
        AbstractC9133u.m16133g(packageName, "packageName");
        AbstractC9133u.m16133g(appType, "appType");
        this.packageName = packageName;
        this.version = i10;
        this.appType = appType;
    }

    public static /* synthetic */ VersionInfoReq copy$default(VersionInfoReq versionInfoReq, String str, int i10, AppType appType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = versionInfoReq.packageName;
        }
        if ((i11 & 2) != 0) {
            i10 = versionInfoReq.version;
        }
        if ((i11 & 4) != 0) {
            appType = versionInfoReq.appType;
        }
        return versionInfoReq.copy(str, i10, appType);
    }

    public final String component1() {
        return this.packageName;
    }

    public final int component2() {
        return this.version;
    }

    public final AppType component3() {
        return this.appType;
    }

    public final VersionInfoReq copy(String packageName, int i10, AppType appType) {
        AbstractC9133u.m16133g(packageName, "packageName");
        AbstractC9133u.m16133g(appType, "appType");
        return new VersionInfoReq(packageName, i10, appType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VersionInfoReq)) {
            return false;
        }
        VersionInfoReq versionInfoReq = (VersionInfoReq) obj;
        return AbstractC9133u.m16128b(this.packageName, versionInfoReq.packageName) && this.version == versionInfoReq.version && this.appType == versionInfoReq.appType;
    }

    public final AppType getAppType() {
        return this.appType;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((this.packageName.hashCode() * 31) + Integer.hashCode(this.version)) * 31) + this.appType.hashCode();
    }

    public String toString() {
        return "VersionInfoReq(packageName=" + this.packageName + ", version=" + this.version + ", appType=" + this.appType + ")";
    }
}
