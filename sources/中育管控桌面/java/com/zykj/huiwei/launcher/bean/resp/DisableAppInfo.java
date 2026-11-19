package com.zykj.huiwei.launcher.bean.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/resp/DisableAppInfo;", "", "appName", "", "packageName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAppName", "()Ljava/lang/String;", "getPackageName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DisableAppInfo {
    public static final int $stable = 0;
    private final String appName;
    private final String packageName;

    public DisableAppInfo(String appName, String packageName) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.appName = appName;
        this.packageName = packageName;
    }

    public static /* synthetic */ DisableAppInfo copy$default(DisableAppInfo disableAppInfo, String str, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = disableAppInfo.appName;
        }
        if ((i6 & 2) != 0) {
            str2 = disableAppInfo.packageName;
        }
        return disableAppInfo.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    public final DisableAppInfo copy(String appName, String packageName) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return new DisableAppInfo(appName, packageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisableAppInfo)) {
            return false;
        }
        DisableAppInfo disableAppInfo = (DisableAppInfo) other;
        return Intrinsics.areEqual(this.appName, disableAppInfo.appName) && Intrinsics.areEqual(this.packageName, disableAppInfo.packageName);
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return (this.appName.hashCode() * 31) + this.packageName.hashCode();
    }

    public String toString() {
        return "DisableAppInfo(appName=" + this.appName + ", packageName=" + this.packageName + ")";
    }
}
