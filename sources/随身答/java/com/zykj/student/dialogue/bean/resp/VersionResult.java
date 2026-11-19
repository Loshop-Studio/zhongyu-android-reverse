package com.zykj.student.dialogue.bean.resp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;

@StabilityInferred(parameters = 1)
@Parcelize
@Metadata(m13412d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b2\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\nHÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0013HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J½\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0006HÆ\u0001J\u0006\u0010C\u001a\u00020\u0003J\u0013\u0010D\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020\u0003HÖ\u0001J\t\u0010H\u001a\u00020\u0006HÖ\u0001J\u0016\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0011\u0010\u0017\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001e¨\u0006N"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/VersionResult;", "Landroid/os/Parcelable;", "appType", "", "appVersionId", "creationTime", "", "creatorUserId", "description", "disabled", "", "downloads", "fileUrl", "forceUpdate", "icon", "id", HintConstants.AUTOFILL_HINT_NAME, "packageName", "score", "", "size", "summary", "versionCode", "versionName", "<init>", "(IILjava/lang/String;ILjava/lang/String;ZILjava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;DILjava/lang/String;ILjava/lang/String;)V", "getAppType", "()I", "getAppVersionId", "getCreationTime", "()Ljava/lang/String;", "getCreatorUserId", "getDescription", "getDisabled", "()Z", "getDownloads", "getFileUrl", "getForceUpdate", "getIcon", "getId", "getName", "getPackageName", "getScore", "()D", "getSize", "getSummary", "getVersionCode", "getVersionName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class VersionResult implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<VersionResult> CREATOR = new Creator();
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
    private final int id;
    private final String name;
    private final String packageName;
    private final double score;
    private final int size;
    private final String summary;
    private final int versionCode;
    private final String versionName;

    @Metadata(m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Creator implements Parcelable.Creator<VersionResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VersionResult createFromParcel(Parcel parcel) {
            boolean z9;
            boolean z10;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i9 = parcel.readInt();
            int i10 = parcel.readInt();
            String string = parcel.readString();
            int i11 = parcel.readInt();
            String string2 = parcel.readString();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z9 = false;
                z11 = true;
                z10 = true;
            } else {
                z9 = false;
                z10 = true;
            }
            int i12 = parcel.readInt();
            boolean z12 = z10;
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                z12 = z9;
            }
            return new VersionResult(i9, i10, string, i11, string2, z11, i12, string3, z12, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VersionResult[] newArray(int i9) {
            return new VersionResult[i9];
        }
    }

    public VersionResult(int i9, int i10, String creationTime, int i11, String description, boolean z9, int i12, String fileUrl, boolean z10, String icon, int i13, String name, String packageName, double d10, int i14, String summary, int i15, String versionName) {
        Intrinsics.checkNotNullParameter(creationTime, "creationTime");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        this.appType = i9;
        this.appVersionId = i10;
        this.creationTime = creationTime;
        this.creatorUserId = i11;
        this.description = description;
        this.disabled = z9;
        this.downloads = i12;
        this.fileUrl = fileUrl;
        this.forceUpdate = z10;
        this.icon = icon;
        this.id = i13;
        this.name = name;
        this.packageName = packageName;
        this.score = d10;
        this.size = i14;
        this.summary = summary;
        this.versionCode = i15;
        this.versionName = versionName;
    }

    public static /* synthetic */ VersionResult copy$default(VersionResult versionResult, int i9, int i10, String str, int i11, String str2, boolean z9, int i12, String str3, boolean z10, String str4, int i13, String str5, String str6, double d10, int i14, String str7, int i15, String str8, int i16, Object obj) {
        String str9;
        int i17;
        int i18 = (i16 & 1) != 0 ? versionResult.appType : i9;
        int i19 = (i16 & 2) != 0 ? versionResult.appVersionId : i10;
        String str10 = (i16 & 4) != 0 ? versionResult.creationTime : str;
        int i20 = (i16 & 8) != 0 ? versionResult.creatorUserId : i11;
        String str11 = (i16 & 16) != 0 ? versionResult.description : str2;
        boolean z11 = (i16 & 32) != 0 ? versionResult.disabled : z9;
        int i21 = (i16 & 64) != 0 ? versionResult.downloads : i12;
        String str12 = (i16 & 128) != 0 ? versionResult.fileUrl : str3;
        boolean z12 = (i16 & 256) != 0 ? versionResult.forceUpdate : z10;
        String str13 = (i16 & 512) != 0 ? versionResult.icon : str4;
        int i22 = (i16 & 1024) != 0 ? versionResult.id : i13;
        String str14 = (i16 & 2048) != 0 ? versionResult.name : str5;
        String str15 = (i16 & 4096) != 0 ? versionResult.packageName : str6;
        int i23 = i18;
        int i24 = i19;
        double d11 = (i16 & 8192) != 0 ? versionResult.score : d10;
        int i25 = (i16 & 16384) != 0 ? versionResult.size : i14;
        String str16 = (i16 & 32768) != 0 ? versionResult.summary : str7;
        int i26 = (i16 & 65536) != 0 ? versionResult.versionCode : i15;
        if ((i16 & 131072) != 0) {
            i17 = i26;
            str9 = versionResult.versionName;
        } else {
            str9 = str8;
            i17 = i26;
        }
        return versionResult.copy(i23, i24, str10, i20, str11, z11, i21, str12, z12, str13, i22, str14, str15, d11, i25, str16, i17, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAppType() {
        return this.appType;
    }

    /* renamed from: component10, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component11, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component12, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component13, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component14, reason: from getter */
    public final double getScore() {
        return this.score;
    }

    /* renamed from: component15, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* renamed from: component16, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: component17, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    /* renamed from: component18, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAppVersionId() {
        return this.appVersionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCreationTime() {
        return this.creationTime;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCreatorUserId() {
        return this.creatorUserId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    /* renamed from: component7, reason: from getter */
    public final int getDownloads() {
        return this.downloads;
    }

    /* renamed from: component8, reason: from getter */
    public final String getFileUrl() {
        return this.fileUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getForceUpdate() {
        return this.forceUpdate;
    }

    public final VersionResult copy(int appType, int appVersionId, String creationTime, int creatorUserId, String description, boolean disabled, int downloads, String fileUrl, boolean forceUpdate, String icon, int id, String name, String packageName, double score, int size, String summary, int versionCode, String versionName) {
        Intrinsics.checkNotNullParameter(creationTime, "creationTime");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        return new VersionResult(appType, appVersionId, creationTime, creatorUserId, description, disabled, downloads, fileUrl, forceUpdate, icon, id, name, packageName, score, size, summary, versionCode, versionName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VersionResult)) {
            return false;
        }
        VersionResult versionResult = (VersionResult) other;
        return this.appType == versionResult.appType && this.appVersionId == versionResult.appVersionId && Intrinsics.areEqual(this.creationTime, versionResult.creationTime) && this.creatorUserId == versionResult.creatorUserId && Intrinsics.areEqual(this.description, versionResult.description) && this.disabled == versionResult.disabled && this.downloads == versionResult.downloads && Intrinsics.areEqual(this.fileUrl, versionResult.fileUrl) && this.forceUpdate == versionResult.forceUpdate && Intrinsics.areEqual(this.icon, versionResult.icon) && this.id == versionResult.id && Intrinsics.areEqual(this.name, versionResult.name) && Intrinsics.areEqual(this.packageName, versionResult.packageName) && Double.compare(this.score, versionResult.score) == 0 && this.size == versionResult.size && Intrinsics.areEqual(this.summary, versionResult.summary) && this.versionCode == versionResult.versionCode && Intrinsics.areEqual(this.versionName, versionResult.versionName);
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
        return this.id;
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
        return (((((((((((((((((((((((((((((((((Integer.hashCode(this.appType) * 31) + Integer.hashCode(this.appVersionId)) * 31) + this.creationTime.hashCode()) * 31) + Integer.hashCode(this.creatorUserId)) * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.disabled)) * 31) + Integer.hashCode(this.downloads)) * 31) + this.fileUrl.hashCode()) * 31) + Boolean.hashCode(this.forceUpdate)) * 31) + this.icon.hashCode()) * 31) + Integer.hashCode(this.id)) * 31) + this.name.hashCode()) * 31) + this.packageName.hashCode()) * 31) + Double.hashCode(this.score)) * 31) + Integer.hashCode(this.size)) * 31) + this.summary.hashCode()) * 31) + Integer.hashCode(this.versionCode)) * 31) + this.versionName.hashCode();
    }

    public String toString() {
        return "VersionResult(appType=" + this.appType + ", appVersionId=" + this.appVersionId + ", creationTime=" + this.creationTime + ", creatorUserId=" + this.creatorUserId + ", description=" + this.description + ", disabled=" + this.disabled + ", downloads=" + this.downloads + ", fileUrl=" + this.fileUrl + ", forceUpdate=" + this.forceUpdate + ", icon=" + this.icon + ", id=" + this.id + ", name=" + this.name + ", packageName=" + this.packageName + ", score=" + this.score + ", size=" + this.size + ", summary=" + this.summary + ", versionCode=" + this.versionCode + ", versionName=" + this.versionName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.appType);
        dest.writeInt(this.appVersionId);
        dest.writeString(this.creationTime);
        dest.writeInt(this.creatorUserId);
        dest.writeString(this.description);
        dest.writeInt(this.disabled ? 1 : 0);
        dest.writeInt(this.downloads);
        dest.writeString(this.fileUrl);
        dest.writeInt(this.forceUpdate ? 1 : 0);
        dest.writeString(this.icon);
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeString(this.packageName);
        dest.writeDouble(this.score);
        dest.writeInt(this.size);
        dest.writeString(this.summary);
        dest.writeInt(this.versionCode);
        dest.writeString(this.versionName);
    }
}
