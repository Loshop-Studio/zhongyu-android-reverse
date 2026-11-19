package com.zykj.huiwei.launcher.bean.req;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.huiwei.launcher.bean.AppType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Keep
@Metadata(m7879d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/req/VersionInfoReq;", "", "packageName", "", "version", "", "appType", "Lcom/zykj/huiwei/launcher/bean/AppType;", "<init>", "(Ljava/lang/String;ILcom/zykj/huiwei/launcher/bean/AppType;)V", "getPackageName", "()Ljava/lang/String;", "getVersion", "()I", "getAppType", "()Lcom/zykj/huiwei/launcher/bean/AppType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VersionInfoReq {
    public static final int $stable = 0;
    private final AppType appType;
    private final String packageName;
    private final int version;

    public VersionInfoReq(String packageName, int i6, AppType appType) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.packageName = packageName;
        this.version = i6;
        this.appType = appType;
    }

    public static /* synthetic */ VersionInfoReq copy$default(VersionInfoReq versionInfoReq, String str, int i6, AppType appType, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = versionInfoReq.packageName;
        }
        if ((i7 & 2) != 0) {
            i6 = versionInfoReq.version;
        }
        if ((i7 & 4) != 0) {
            appType = versionInfoReq.appType;
        }
        return versionInfoReq.copy(str, i6, appType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: component3, reason: from getter */
    public final AppType getAppType() {
        return this.appType;
    }

    public final VersionInfoReq copy(String packageName, int version, AppType appType) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new VersionInfoReq(packageName, version, appType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VersionInfoReq)) {
            return false;
        }
        VersionInfoReq versionInfoReq = (VersionInfoReq) other;
        return Intrinsics.areEqual(this.packageName, versionInfoReq.packageName) && this.version == versionInfoReq.version && this.appType == versionInfoReq.appType;
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
