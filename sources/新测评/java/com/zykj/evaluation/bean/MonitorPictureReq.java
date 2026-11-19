package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m13558d2 = {"Lcom/zykj/evaluation/bean/MonitorPictureReq;", "", "appName", "", "packageName", "pictures", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAppName", "()Ljava/lang/String;", "getPackageName", "getPictures", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MonitorPictureReq {
    public static final int $stable = 8;
    private final String appName;
    private final String packageName;
    private final List<String> pictures;

    public MonitorPictureReq(String appName, String packageName, List<String> pictures) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(pictures, "pictures");
        this.appName = appName;
        this.packageName = packageName;
        this.pictures = pictures;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MonitorPictureReq copy$default(MonitorPictureReq monitorPictureReq, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = monitorPictureReq.appName;
        }
        if ((i10 & 2) != 0) {
            str2 = monitorPictureReq.packageName;
        }
        if ((i10 & 4) != 0) {
            list = monitorPictureReq.pictures;
        }
        return monitorPictureReq.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    public final List<String> component3() {
        return this.pictures;
    }

    public final MonitorPictureReq copy(String appName, String packageName, List<String> pictures) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(pictures, "pictures");
        return new MonitorPictureReq(appName, packageName, pictures);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonitorPictureReq)) {
            return false;
        }
        MonitorPictureReq monitorPictureReq = (MonitorPictureReq) other;
        return Intrinsics.areEqual(this.appName, monitorPictureReq.appName) && Intrinsics.areEqual(this.packageName, monitorPictureReq.packageName) && Intrinsics.areEqual(this.pictures, monitorPictureReq.pictures);
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final List<String> getPictures() {
        return this.pictures;
    }

    public int hashCode() {
        return (((this.appName.hashCode() * 31) + this.packageName.hashCode()) * 31) + this.pictures.hashCode();
    }

    public String toString() {
        return "MonitorPictureReq(appName=" + this.appName + ", packageName=" + this.packageName + ", pictures=" + this.pictures + ")";
    }
}
