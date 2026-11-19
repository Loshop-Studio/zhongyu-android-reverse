package com.zykj.huiwei.launcher.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/CertificationInfo;", "", "device", "", "appsList", "", "Lcom/zykj/huiwei/launcher/bean/AppPackageInfo;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getDevice", "()Ljava/lang/String;", "setDevice", "(Ljava/lang/String;)V", "getAppsList", "()Ljava/util/List;", "setAppsList", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CertificationInfo {
    public static final int $stable = 8;
    private List<AppPackageInfo> appsList;
    private String device;

    /* JADX WARN: Multi-variable type inference failed */
    public CertificationInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CertificationInfo copy$default(CertificationInfo certificationInfo, String str, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = certificationInfo.device;
        }
        if ((i6 & 2) != 0) {
            list = certificationInfo.appsList;
        }
        return certificationInfo.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDevice() {
        return this.device;
    }

    public final List<AppPackageInfo> component2() {
        return this.appsList;
    }

    public final CertificationInfo copy(String device, List<AppPackageInfo> appsList) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(appsList, "appsList");
        return new CertificationInfo(device, appsList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CertificationInfo)) {
            return false;
        }
        CertificationInfo certificationInfo = (CertificationInfo) other;
        return Intrinsics.areEqual(this.device, certificationInfo.device) && Intrinsics.areEqual(this.appsList, certificationInfo.appsList);
    }

    public final List<AppPackageInfo> getAppsList() {
        return this.appsList;
    }

    public final String getDevice() {
        return this.device;
    }

    public int hashCode() {
        return (this.device.hashCode() * 31) + this.appsList.hashCode();
    }

    public final void setAppsList(List<AppPackageInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.appsList = list;
    }

    public final void setDevice(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.device = str;
    }

    public String toString() {
        return "CertificationInfo(device=" + this.device + ", appsList=" + this.appsList + ")";
    }

    public CertificationInfo(String device, List<AppPackageInfo> appsList) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(appsList, "appsList");
        this.device = device;
        this.appsList = appsList;
    }

    public /* synthetic */ CertificationInfo(String str, List list, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? new ArrayList() : list);
    }
}
