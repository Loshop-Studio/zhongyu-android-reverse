package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class MonitorRequest {
    public static final int $stable = 8;
    private final String appName;
    private final String note;
    private final String packageName;
    private final List<String> pictures;
    private final int pornScore;

    public MonitorRequest(String appName, String packageName, List<String> pictures, String note, int i10) {
        AbstractC9979u.m20294g(appName, "appName");
        AbstractC9979u.m20294g(packageName, "packageName");
        AbstractC9979u.m20294g(pictures, "pictures");
        AbstractC9979u.m20294g(note, "note");
        this.appName = appName;
        this.packageName = packageName;
        this.pictures = pictures;
        this.note = note;
        this.pornScore = i10;
    }

    public static /* synthetic */ MonitorRequest copy$default(MonitorRequest monitorRequest, String str, String str2, List list, String str3, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = monitorRequest.appName;
        }
        if ((i11 & 2) != 0) {
            str2 = monitorRequest.packageName;
        }
        if ((i11 & 4) != 0) {
            list = monitorRequest.pictures;
        }
        if ((i11 & 8) != 0) {
            str3 = monitorRequest.note;
        }
        if ((i11 & 16) != 0) {
            i10 = monitorRequest.pornScore;
        }
        int i12 = i10;
        List list2 = list;
        return monitorRequest.copy(str, str2, list2, str3, i12);
    }

    public final String component1() {
        return this.appName;
    }

    public final String component2() {
        return this.packageName;
    }

    public final List<String> component3() {
        return this.pictures;
    }

    public final String component4() {
        return this.note;
    }

    public final int component5() {
        return this.pornScore;
    }

    public final MonitorRequest copy(String appName, String packageName, List<String> pictures, String note, int i10) {
        AbstractC9979u.m20294g(appName, "appName");
        AbstractC9979u.m20294g(packageName, "packageName");
        AbstractC9979u.m20294g(pictures, "pictures");
        AbstractC9979u.m20294g(note, "note");
        return new MonitorRequest(appName, packageName, pictures, note, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MonitorRequest)) {
            return false;
        }
        MonitorRequest monitorRequest = (MonitorRequest) obj;
        return AbstractC9979u.m20289b(this.appName, monitorRequest.appName) && AbstractC9979u.m20289b(this.packageName, monitorRequest.packageName) && AbstractC9979u.m20289b(this.pictures, monitorRequest.pictures) && AbstractC9979u.m20289b(this.note, monitorRequest.note) && this.pornScore == monitorRequest.pornScore;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final List<String> getPictures() {
        return this.pictures;
    }

    public final int getPornScore() {
        return this.pornScore;
    }

    public int hashCode() {
        return (((((((this.appName.hashCode() * 31) + this.packageName.hashCode()) * 31) + this.pictures.hashCode()) * 31) + this.note.hashCode()) * 31) + Integer.hashCode(this.pornScore);
    }

    public String toString() {
        return "MonitorRequest(appName=" + this.appName + ", packageName=" + this.packageName + ", pictures=" + this.pictures + ", note=" + this.note + ", pornScore=" + this.pornScore + ")";
    }
}
