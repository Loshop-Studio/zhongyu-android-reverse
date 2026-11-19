package com.zykj.lib.ota.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@Keep
/* loaded from: classes4.dex */
public final class VersionInfo implements Parcelable {
    public static final Parcelable.Creator<VersionInfo> CREATOR = new C7375a();
    private String description;
    private String fileUrl;
    private boolean forceUpdate;
    private String name;
    private int size;
    private int versionCode;
    private String versionName;

    /* renamed from: com.zykj.lib.ota.bean.VersionInfo$a */
    public static final class C7375a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VersionInfo createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new VersionInfo(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VersionInfo[] newArray(int i10) {
            return new VersionInfo[i10];
        }
    }

    public VersionInfo(int i10, String name, int i11, String versionName, String fileUrl, String str, boolean z10) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(versionName, "versionName");
        AbstractC9133u.m16133g(fileUrl, "fileUrl");
        this.size = i10;
        this.name = name;
        this.versionCode = i11;
        this.versionName = versionName;
        this.fileUrl = fileUrl;
        this.description = str;
        this.forceUpdate = z10;
    }

    public static /* synthetic */ VersionInfo copy$default(VersionInfo versionInfo, int i10, String str, int i11, String str2, String str3, String str4, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = versionInfo.size;
        }
        if ((i12 & 2) != 0) {
            str = versionInfo.name;
        }
        if ((i12 & 4) != 0) {
            i11 = versionInfo.versionCode;
        }
        if ((i12 & 8) != 0) {
            str2 = versionInfo.versionName;
        }
        if ((i12 & 16) != 0) {
            str3 = versionInfo.fileUrl;
        }
        if ((i12 & 32) != 0) {
            str4 = versionInfo.description;
        }
        if ((i12 & 64) != 0) {
            z10 = versionInfo.forceUpdate;
        }
        String str5 = str4;
        boolean z11 = z10;
        String str6 = str3;
        int i13 = i11;
        return versionInfo.copy(i10, str, i13, str2, str6, str5, z11);
    }

    public final int component1() {
        return this.size;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.versionCode;
    }

    public final String component4() {
        return this.versionName;
    }

    public final String component5() {
        return this.fileUrl;
    }

    public final String component6() {
        return this.description;
    }

    public final boolean component7() {
        return this.forceUpdate;
    }

    public final VersionInfo copy(int i10, String name, int i11, String versionName, String fileUrl, String str, boolean z10) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(versionName, "versionName");
        AbstractC9133u.m16133g(fileUrl, "fileUrl");
        return new VersionInfo(i10, name, i11, versionName, fileUrl, str, z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VersionInfo)) {
            return false;
        }
        VersionInfo versionInfo = (VersionInfo) obj;
        return this.size == versionInfo.size && AbstractC9133u.m16128b(this.name, versionInfo.name) && this.versionCode == versionInfo.versionCode && AbstractC9133u.m16128b(this.versionName, versionInfo.versionName) && AbstractC9133u.m16128b(this.fileUrl, versionInfo.fileUrl) && AbstractC9133u.m16128b(this.description, versionInfo.description) && this.forceUpdate == versionInfo.forceUpdate;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final boolean getForceUpdate() {
        return this.forceUpdate;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        int iHashCode = ((((((((Integer.hashCode(this.size) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.versionCode)) * 31) + this.versionName.hashCode()) * 31) + this.fileUrl.hashCode()) * 31;
        String str = this.description;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.forceUpdate);
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setFileUrl(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.fileUrl = str;
    }

    public final void setForceUpdate(boolean z10) {
        this.forceUpdate = z10;
    }

    public final void setName(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.name = str;
    }

    public final void setSize(int i10) {
        this.size = i10;
    }

    public final void setVersionCode(int i10) {
        this.versionCode = i10;
    }

    public final void setVersionName(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.versionName = str;
    }

    public String toString() {
        return "VersionInfo(size=" + this.size + ", name=" + this.name + ", versionCode=" + this.versionCode + ", versionName=" + this.versionName + ", fileUrl=" + this.fileUrl + ", description=" + this.description + ", forceUpdate=" + this.forceUpdate + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeInt(this.size);
        dest.writeString(this.name);
        dest.writeInt(this.versionCode);
        dest.writeString(this.versionName);
        dest.writeString(this.fileUrl);
        dest.writeString(this.description);
        dest.writeInt(this.forceUpdate ? 1 : 0);
    }

    public /* synthetic */ VersionInfo(int i10, String str, int i11, String str2, String str3, String str4, boolean z10, int i12, AbstractC9126n abstractC9126n) {
        this((i12 & 1) != 0 ? 0 : i10, str, i11, str2, str3, str4, z10);
    }
}
