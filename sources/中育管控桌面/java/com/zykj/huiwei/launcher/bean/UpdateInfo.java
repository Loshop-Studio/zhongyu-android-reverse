package com.zykj.huiwei.launcher.bean;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b7\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0010HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010?\u001a\u00020\fHÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÏ\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010C\u001a\u00020\f2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\u0003HÖ\u0001J\t\u0010F\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001d¨\u0006G"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/UpdateInfo;", "", "appVersionId", "", "summary", "", "creatorUserId", "creationTime", "lastModificationTime", "icon", "description", "forceUpdate", "", "versionName", "versionCode", "score", "", "size", "downloads", HintConstants.AUTOFILL_HINT_NAME, "fileUrl", "disabled", "id", "packageName", "<init>", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IFIILjava/lang/String;Ljava/lang/String;ZILjava/lang/String;)V", "getAppVersionId", "()I", "getSummary", "()Ljava/lang/String;", "getCreatorUserId", "getCreationTime", "getLastModificationTime", "getIcon", "getDescription", "getForceUpdate", "()Z", "getVersionName", "getVersionCode", "getScore", "()F", "getSize", "getDownloads", "getName", "getFileUrl", "getDisabled", "getId", "getPackageName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "other", "hashCode", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateInfo {
    public static final int $stable = 0;
    private final int appVersionId;
    private final String creationTime;
    private final int creatorUserId;
    private final String description;
    private final boolean disabled;
    private final int downloads;
    private final String fileUrl;
    private final boolean forceUpdate;
    private final String icon;
    private final int id;
    private final String lastModificationTime;
    private final String name;
    private final String packageName;
    private final float score;
    private final int size;
    private final String summary;
    private final int versionCode;
    private final String versionName;

    public UpdateInfo() {
        this(0, null, 0, null, null, null, null, false, null, 0, 0.0f, 0, 0, null, null, false, 0, null, 262143, null);
    }

    public static /* synthetic */ UpdateInfo copy$default(UpdateInfo updateInfo, int i6, String str, int i7, String str2, String str3, String str4, String str5, boolean z6, String str6, int i8, float f6, int i9, int i10, String str7, String str8, boolean z7, int i11, String str9, int i12, Object obj) {
        String str10;
        int i13;
        int i14 = (i12 & 1) != 0 ? updateInfo.appVersionId : i6;
        String str11 = (i12 & 2) != 0 ? updateInfo.summary : str;
        int i15 = (i12 & 4) != 0 ? updateInfo.creatorUserId : i7;
        String str12 = (i12 & 8) != 0 ? updateInfo.creationTime : str2;
        String str13 = (i12 & 16) != 0 ? updateInfo.lastModificationTime : str3;
        String str14 = (i12 & 32) != 0 ? updateInfo.icon : str4;
        String str15 = (i12 & 64) != 0 ? updateInfo.description : str5;
        boolean z8 = (i12 & 128) != 0 ? updateInfo.forceUpdate : z6;
        String str16 = (i12 & 256) != 0 ? updateInfo.versionName : str6;
        int i16 = (i12 & 512) != 0 ? updateInfo.versionCode : i8;
        float f7 = (i12 & 1024) != 0 ? updateInfo.score : f6;
        int i17 = (i12 & 2048) != 0 ? updateInfo.size : i9;
        int i18 = (i12 & 4096) != 0 ? updateInfo.downloads : i10;
        String str17 = (i12 & 8192) != 0 ? updateInfo.name : str7;
        int i19 = i14;
        String str18 = (i12 & 16384) != 0 ? updateInfo.fileUrl : str8;
        boolean z9 = (i12 & 32768) != 0 ? updateInfo.disabled : z7;
        int i20 = (i12 & 65536) != 0 ? updateInfo.id : i11;
        if ((i12 & 131072) != 0) {
            i13 = i20;
            str10 = updateInfo.packageName;
        } else {
            str10 = str9;
            i13 = i20;
        }
        return updateInfo.copy(i19, str11, i15, str12, str13, str14, str15, z8, str16, i16, f7, i17, i18, str17, str18, z9, i13, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAppVersionId() {
        return this.appVersionId;
    }

    /* renamed from: component10, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    /* renamed from: component11, reason: from getter */
    public final float getScore() {
        return this.score;
    }

    /* renamed from: component12, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* renamed from: component13, reason: from getter */
    public final int getDownloads() {
        return this.downloads;
    }

    /* renamed from: component14, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component15, reason: from getter */
    public final String getFileUrl() {
        return this.fileUrl;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    /* renamed from: component17, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component18, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCreatorUserId() {
        return this.creatorUserId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCreationTime() {
        return this.creationTime;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getForceUpdate() {
        return this.forceUpdate;
    }

    /* renamed from: component9, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    public final UpdateInfo copy(int appVersionId, String summary, int creatorUserId, String creationTime, String lastModificationTime, String icon, String description, boolean forceUpdate, String versionName, int versionCode, float score, int size, int downloads, String name, String fileUrl, boolean disabled, int id, String packageName) {
        return new UpdateInfo(appVersionId, summary, creatorUserId, creationTime, lastModificationTime, icon, description, forceUpdate, versionName, versionCode, score, size, downloads, name, fileUrl, disabled, id, packageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateInfo)) {
            return false;
        }
        UpdateInfo updateInfo = (UpdateInfo) other;
        return this.appVersionId == updateInfo.appVersionId && Intrinsics.areEqual(this.summary, updateInfo.summary) && this.creatorUserId == updateInfo.creatorUserId && Intrinsics.areEqual(this.creationTime, updateInfo.creationTime) && Intrinsics.areEqual(this.lastModificationTime, updateInfo.lastModificationTime) && Intrinsics.areEqual(this.icon, updateInfo.icon) && Intrinsics.areEqual(this.description, updateInfo.description) && this.forceUpdate == updateInfo.forceUpdate && Intrinsics.areEqual(this.versionName, updateInfo.versionName) && this.versionCode == updateInfo.versionCode && Float.compare(this.score, updateInfo.score) == 0 && this.size == updateInfo.size && this.downloads == updateInfo.downloads && Intrinsics.areEqual(this.name, updateInfo.name) && Intrinsics.areEqual(this.fileUrl, updateInfo.fileUrl) && this.disabled == updateInfo.disabled && this.id == updateInfo.id && Intrinsics.areEqual(this.packageName, updateInfo.packageName);
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
        return this.id;
    }

    public final String getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final float getScore() {
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
        int iHashCode = Integer.hashCode(this.appVersionId) * 31;
        String str = this.summary;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.creatorUserId)) * 31;
        String str2 = this.creationTime;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastModificationTime;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Boolean.hashCode(this.forceUpdate)) * 31;
        String str6 = this.versionName;
        int iHashCode7 = (((((((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + Integer.hashCode(this.versionCode)) * 31) + Float.hashCode(this.score)) * 31) + Integer.hashCode(this.size)) * 31) + Integer.hashCode(this.downloads)) * 31;
        String str7 = this.name;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.fileUrl;
        int iHashCode9 = (((((iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + Boolean.hashCode(this.disabled)) * 31) + Integer.hashCode(this.id)) * 31;
        String str9 = this.packageName;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "UpdateInfo(appVersionId=" + this.appVersionId + ", summary=" + this.summary + ", creatorUserId=" + this.creatorUserId + ", creationTime=" + this.creationTime + ", lastModificationTime=" + this.lastModificationTime + ", icon=" + this.icon + ", description=" + this.description + ", forceUpdate=" + this.forceUpdate + ", versionName=" + this.versionName + ", versionCode=" + this.versionCode + ", score=" + this.score + ", size=" + this.size + ", downloads=" + this.downloads + ", name=" + this.name + ", fileUrl=" + this.fileUrl + ", disabled=" + this.disabled + ", id=" + this.id + ", packageName=" + this.packageName + ")";
    }

    public UpdateInfo(int i6, String str, int i7, String str2, String str3, String str4, String str5, boolean z6, String str6, int i8, float f6, int i9, int i10, String str7, String str8, boolean z7, int i11, String str9) {
        this.appVersionId = i6;
        this.summary = str;
        this.creatorUserId = i7;
        this.creationTime = str2;
        this.lastModificationTime = str3;
        this.icon = str4;
        this.description = str5;
        this.forceUpdate = z6;
        this.versionName = str6;
        this.versionCode = i8;
        this.score = f6;
        this.size = i9;
        this.downloads = i10;
        this.name = str7;
        this.fileUrl = str8;
        this.disabled = z7;
        this.id = i11;
        this.packageName = str9;
    }

    public /* synthetic */ UpdateInfo(int i6, String str, int i7, String str2, String str3, String str4, String str5, boolean z6, String str6, int i8, float f6, int i9, int i10, String str7, String str8, boolean z7, int i11, String str9, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i6, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? 0 : i7, (i12 & 8) != 0 ? "" : str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? "" : str4, (i12 & 64) != 0 ? "" : str5, (i12 & 128) != 0 ? false : z6, (i12 & 256) != 0 ? "" : str6, (i12 & 512) != 0 ? 0 : i8, (i12 & 1024) != 0 ? 0.0f : f6, (i12 & 2048) != 0 ? 0 : i9, (i12 & 4096) != 0 ? 0 : i10, (i12 & 8192) != 0 ? "" : str7, (i12 & 16384) != 0 ? "" : str8, (i12 & 32768) != 0 ? false : z7, (i12 & 65536) != 0 ? 0 : i11, (i12 & 131072) != 0 ? "" : str9);
    }
}
