package com.zykj.huiwei.launcher.bean.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.huiwei.launcher.bean.BaseAppInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/resp/AppData;", "", "appInfo", "Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;", "sort", "", "<init>", "(Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;I)V", "getAppInfo", "()Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;", "getSort", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AppData {
    public static final int $stable = 8;
    private final BaseAppInfo appInfo;
    private final int sort;

    public AppData(BaseAppInfo appInfo, int i6) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        this.appInfo = appInfo;
        this.sort = i6;
    }

    public static /* synthetic */ AppData copy$default(AppData appData, BaseAppInfo baseAppInfo, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            baseAppInfo = appData.appInfo;
        }
        if ((i7 & 2) != 0) {
            i6 = appData.sort;
        }
        return appData.copy(baseAppInfo, i6);
    }

    /* renamed from: component1, reason: from getter */
    public final BaseAppInfo getAppInfo() {
        return this.appInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    public final AppData copy(BaseAppInfo appInfo, int sort) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        return new AppData(appInfo, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppData)) {
            return false;
        }
        AppData appData = (AppData) other;
        return Intrinsics.areEqual(this.appInfo, appData.appInfo) && this.sort == appData.sort;
    }

    public final BaseAppInfo getAppInfo() {
        return this.appInfo;
    }

    public final int getSort() {
        return this.sort;
    }

    public int hashCode() {
        return (this.appInfo.hashCode() * 31) + Integer.hashCode(this.sort);
    }

    public String toString() {
        return "AppData(appInfo=" + this.appInfo + ", sort=" + this.sort + ")";
    }
}
