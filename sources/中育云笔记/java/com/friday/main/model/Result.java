package com.friday.main.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class Result {
    public static final int $stable = 8;
    private final int appType;
    private final int appVersionId;
    private final String creationTime;
    private final int creatorUserId;
    private final String description;
    private final boolean disabled;
    private final int downloads;
    private final String fileUrl;
    private final boolean forceUpdate;
    private final String icon;

    /* renamed from: id */
    private final int f9240id;
    private final Object lastModificationTime;
    private final String name;
    private final String packageName;
    private final double score;
    private final int size;
    private final String summary;
    private final int versionCode;
    private final String versionName;

    public Result(int i10, int i11, String creationTime, int i12, String description, boolean z10, int i13, String fileUrl, boolean z11, String icon, int i14, Object lastModificationTime, String name, String packageName, double d10, int i15, String summary, int i16, String versionName) {
        AbstractC9979u.m20294g(creationTime, "creationTime");
        AbstractC9979u.m20294g(description, "description");
        AbstractC9979u.m20294g(fileUrl, "fileUrl");
        AbstractC9979u.m20294g(icon, "icon");
        AbstractC9979u.m20294g(lastModificationTime, "lastModificationTime");
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(packageName, "packageName");
        AbstractC9979u.m20294g(summary, "summary");
        AbstractC9979u.m20294g(versionName, "versionName");
        this.appType = i10;
        this.appVersionId = i11;
        this.creationTime = creationTime;
        this.creatorUserId = i12;
        this.description = description;
        this.disabled = z10;
        this.downloads = i13;
        this.fileUrl = fileUrl;
        this.forceUpdate = z11;
        this.icon = icon;
        this.f9240id = i14;
        this.lastModificationTime = lastModificationTime;
        this.name = name;
        this.packageName = packageName;
        this.score = d10;
        this.size = i15;
        this.summary = summary;
        this.versionCode = i16;
        this.versionName = versionName;
    }

    public static /* synthetic */ Result copy$default(Result result, int i10, int i11, String str, int i12, String str2, boolean z10, int i13, String str3, boolean z11, String str4, int i14, Object obj, String str5, String str6, double d10, int i15, String str7, int i16, String str8, int i17, Object obj2) {
        String str9;
        int i18;
        int i19 = (i17 & 1) != 0 ? result.appType : i10;
        int i20 = (i17 & 2) != 0 ? result.appVersionId : i11;
        String str10 = (i17 & 4) != 0 ? result.creationTime : str;
        int i21 = (i17 & 8) != 0 ? result.creatorUserId : i12;
        String str11 = (i17 & 16) != 0 ? result.description : str2;
        boolean z12 = (i17 & 32) != 0 ? result.disabled : z10;
        int i22 = (i17 & 64) != 0 ? result.downloads : i13;
        String str12 = (i17 & 128) != 0 ? result.fileUrl : str3;
        boolean z13 = (i17 & 256) != 0 ? result.forceUpdate : z11;
        String str13 = (i17 & 512) != 0 ? result.icon : str4;
        int i23 = (i17 & 1024) != 0 ? result.f9240id : i14;
        Object obj3 = (i17 & 2048) != 0 ? result.lastModificationTime : obj;
        String str14 = (i17 & 4096) != 0 ? result.name : str5;
        String str15 = (i17 & 8192) != 0 ? result.packageName : str6;
        int i24 = i19;
        double d11 = (i17 & 16384) != 0 ? result.score : d10;
        int i25 = (i17 & 32768) != 0 ? result.size : i15;
        String str16 = (i17 & 65536) != 0 ? result.summary : str7;
        int i26 = i25;
        int i27 = (i17 & 131072) != 0 ? result.versionCode : i16;
        if ((i17 & 262144) != 0) {
            i18 = i27;
            str9 = result.versionName;
        } else {
            str9 = str8;
            i18 = i27;
        }
        return result.copy(i24, i20, str10, i21, str11, z12, i22, str12, z13, str13, i23, obj3, str14, str15, d11, i26, str16, i18, str9);
    }

    public final int component1() {
        return this.appType;
    }

    public final String component10() {
        return this.icon;
    }

    public final int component11() {
        return this.f9240id;
    }

    public final Object component12() {
        return this.lastModificationTime;
    }

    public final String component13() {
        return this.name;
    }

    public final String component14() {
        return this.packageName;
    }

    public final double component15() {
        return this.score;
    }

    public final int component16() {
        return this.size;
    }

    public final String component17() {
        return this.summary;
    }

    public final int component18() {
        return this.versionCode;
    }

    public final String component19() {
        return this.versionName;
    }

    public final int component2() {
        return this.appVersionId;
    }

    public final String component3() {
        return this.creationTime;
    }

    public final int component4() {
        return this.creatorUserId;
    }

    public final String component5() {
        return this.description;
    }

    public final boolean component6() {
        return this.disabled;
    }

    public final int component7() {
        return this.downloads;
    }

    public final String component8() {
        return this.fileUrl;
    }

    public final boolean component9() {
        return this.forceUpdate;
    }

    public final Result copy(int i10, int i11, String creationTime, int i12, String description, boolean z10, int i13, String fileUrl, boolean z11, String icon, int i14, Object lastModificationTime, String name, String packageName, double d10, int i15, String summary, int i16, String versionName) {
        AbstractC9979u.m20294g(creationTime, "creationTime");
        AbstractC9979u.m20294g(description, "description");
        AbstractC9979u.m20294g(fileUrl, "fileUrl");
        AbstractC9979u.m20294g(icon, "icon");
        AbstractC9979u.m20294g(lastModificationTime, "lastModificationTime");
        AbstractC9979u.m20294g(name, "name");
        AbstractC9979u.m20294g(packageName, "packageName");
        AbstractC9979u.m20294g(summary, "summary");
        AbstractC9979u.m20294g(versionName, "versionName");
        return new Result(i10, i11, creationTime, i12, description, z10, i13, fileUrl, z11, icon, i14, lastModificationTime, name, packageName, d10, i15, summary, i16, versionName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Result)) {
            return false;
        }
        Result result = (Result) obj;
        return this.appType == result.appType && this.appVersionId == result.appVersionId && AbstractC9979u.m20289b(this.creationTime, result.creationTime) && this.creatorUserId == result.creatorUserId && AbstractC9979u.m20289b(this.description, result.description) && this.disabled == result.disabled && this.downloads == result.downloads && AbstractC9979u.m20289b(this.fileUrl, result.fileUrl) && this.forceUpdate == result.forceUpdate && AbstractC9979u.m20289b(this.icon, result.icon) && this.f9240id == result.f9240id && AbstractC9979u.m20289b(this.lastModificationTime, result.lastModificationTime) && AbstractC9979u.m20289b(this.name, result.name) && AbstractC9979u.m20289b(this.packageName, result.packageName) && Double.compare(this.score, result.score) == 0 && this.size == result.size && AbstractC9979u.m20289b(this.summary, result.summary) && this.versionCode == result.versionCode && AbstractC9979u.m20289b(this.versionName, result.versionName);
    }

    public final int getAppType() {
        return this.appType;
    }

    public final int getAppVersionId() {
        return this.appVersionId;
    }

    public final String getCreationTime() {
        return this.creationTime;
    }

    public final int getCreatorUserId() {
        return this.creatorUserId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final int getDownloads() {
        return this.downloads;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final boolean getForceUpdate() {
        return this.forceUpdate;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.f9240id;
    }

    public final Object getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final double getScore() {
        return this.score;
    }

    public final int getSize() {
        return this.size;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((Integer.hashCode(this.appType) * 31) + Integer.hashCode(this.appVersionId)) * 31) + this.creationTime.hashCode()) * 31) + Integer.hashCode(this.creatorUserId)) * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.disabled)) * 31) + Integer.hashCode(this.downloads)) * 31) + this.fileUrl.hashCode()) * 31) + Boolean.hashCode(this.forceUpdate)) * 31) + this.icon.hashCode()) * 31) + Integer.hashCode(this.f9240id)) * 31) + this.lastModificationTime.hashCode()) * 31) + this.name.hashCode()) * 31) + this.packageName.hashCode()) * 31) + Double.hashCode(this.score)) * 31) + Integer.hashCode(this.size)) * 31) + this.summary.hashCode()) * 31) + Integer.hashCode(this.versionCode)) * 31) + this.versionName.hashCode();
    }

    public String toString() {
        return "Result(appType=" + this.appType + ", appVersionId=" + this.appVersionId + ", creationTime=" + this.creationTime + ", creatorUserId=" + this.creatorUserId + ", description=" + this.description + ", disabled=" + this.disabled + ", downloads=" + this.downloads + ", fileUrl=" + this.fileUrl + ", forceUpdate=" + this.forceUpdate + ", icon=" + this.icon + ", id=" + this.f9240id + ", lastModificationTime=" + this.lastModificationTime + ", name=" + this.name + ", packageName=" + this.packageName + ", score=" + this.score + ", size=" + this.size + ", summary=" + this.summary + ", versionCode=" + this.versionCode + ", versionName=" + this.versionName + ")";
    }
}
