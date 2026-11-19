package com.zykj.huiwei.launcher.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/AppPackageInfo;", "", "packageName", "", "firstInstallTime", "", "size", "<init>", "(Ljava/lang/String;JJ)V", "getPackageName", "()Ljava/lang/String;", "getFirstInstallTime", "()J", "getSize", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AppPackageInfo {
    public static final int $stable = 0;
    private final long firstInstallTime;
    private final String packageName;
    private final long size;

    public AppPackageInfo(String packageName, long j6, long j7) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.packageName = packageName;
        this.firstInstallTime = j6;
        this.size = j7;
    }

    public static /* synthetic */ AppPackageInfo copy$default(AppPackageInfo appPackageInfo, String str, long j6, long j7, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = appPackageInfo.packageName;
        }
        if ((i6 & 2) != 0) {
            j6 = appPackageInfo.firstInstallTime;
        }
        if ((i6 & 4) != 0) {
            j7 = appPackageInfo.size;
        }
        return appPackageInfo.copy(str, j6, j7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component2, reason: from getter */
    public final long getFirstInstallTime() {
        return this.firstInstallTime;
    }

    /* renamed from: component3, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final AppPackageInfo copy(String packageName, long firstInstallTime, long size) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return new AppPackageInfo(packageName, firstInstallTime, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppPackageInfo)) {
            return false;
        }
        AppPackageInfo appPackageInfo = (AppPackageInfo) other;
        return Intrinsics.areEqual(this.packageName, appPackageInfo.packageName) && this.firstInstallTime == appPackageInfo.firstInstallTime && this.size == appPackageInfo.size;
    }

    public final long getFirstInstallTime() {
        return this.firstInstallTime;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((this.packageName.hashCode() * 31) + Long.hashCode(this.firstInstallTime)) * 31) + Long.hashCode(this.size);
    }

    public String toString() {
        return "AppPackageInfo(packageName=" + this.packageName + ", firstInstallTime=" + this.firstInstallTime + ", size=" + this.size + ")";
    }
}
