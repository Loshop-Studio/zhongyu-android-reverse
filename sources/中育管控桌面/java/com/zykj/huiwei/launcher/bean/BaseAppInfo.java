package com.zykj.huiwei.launcher.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;", "", "label", "", "icon", "packageName", "activityName", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getIcon", "()Ljava/lang/Object;", "getPackageName", "getActivityName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BaseAppInfo {
    public static final int $stable = 8;
    private final String activityName;
    private final Object icon;
    private final String label;
    private final String packageName;

    public BaseAppInfo(String label, Object icon, String packageName, String activityName) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        this.label = label;
        this.icon = icon;
        this.packageName = packageName;
        this.activityName = activityName;
    }

    public static /* synthetic */ BaseAppInfo copy$default(BaseAppInfo baseAppInfo, String str, Object obj, String str2, String str3, int i6, Object obj2) {
        if ((i6 & 1) != 0) {
            str = baseAppInfo.label;
        }
        if ((i6 & 2) != 0) {
            obj = baseAppInfo.icon;
        }
        if ((i6 & 4) != 0) {
            str2 = baseAppInfo.packageName;
        }
        if ((i6 & 8) != 0) {
            str3 = baseAppInfo.activityName;
        }
        return baseAppInfo.copy(str, obj, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    public final BaseAppInfo copy(String label, Object icon, String packageName, String activityName) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        return new BaseAppInfo(label, icon, packageName, activityName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseAppInfo)) {
            return false;
        }
        BaseAppInfo baseAppInfo = (BaseAppInfo) other;
        return Intrinsics.areEqual(this.label, baseAppInfo.label) && Intrinsics.areEqual(this.icon, baseAppInfo.icon) && Intrinsics.areEqual(this.packageName, baseAppInfo.packageName) && Intrinsics.areEqual(this.activityName, baseAppInfo.activityName);
    }

    public final String getActivityName() {
        return this.activityName;
    }

    public final Object getIcon() {
        return this.icon;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return (((((this.label.hashCode() * 31) + this.icon.hashCode()) * 31) + this.packageName.hashCode()) * 31) + this.activityName.hashCode();
    }

    public String toString() {
        return "BaseAppInfo(label=" + this.label + ", icon=" + this.icon + ", packageName=" + this.packageName + ", activityName=" + this.activityName + ")";
    }
}
