package com.huawei.hms.support.api.entity.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.core.aidl.InterfaceC7278e;

/* loaded from: classes5.dex */
public class PermissionInfo implements InterfaceC7278e, Parcelable {
    public static final Parcelable.Creator<PermissionInfo> CREATOR = new C7332a();

    /* renamed from: c */
    public String f11733c;

    /* renamed from: d */
    public String f11734d;

    /* renamed from: e */
    public String f11735e;

    /* renamed from: com.huawei.hms.support.api.entity.auth.PermissionInfo$a */
    public class C7332a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PermissionInfo createFromParcel(Parcel parcel) {
            return new PermissionInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PermissionInfo[] newArray(int i10) {
            return new PermissionInfo[i10];
        }
    }

    public PermissionInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermissionInfo)) {
            return false;
        }
        PermissionInfo permissionInfo = (PermissionInfo) obj;
        return Objects.equal(this.f11733c, permissionInfo.f11733c) && Objects.equal(this.f11734d, permissionInfo.f11734d) && Objects.equal(this.f11735e, permissionInfo.f11735e);
    }

    public String getAppID() {
        return this.f11733c;
    }

    public String getPackageName() {
        return this.f11734d;
    }

    public String getPermission() {
        return this.f11735e;
    }

    public int hashCode() {
        return Objects.hashCode(this.f11733c, this.f11734d, this.f11735e);
    }

    public void setAppID(String str) {
        this.f11733c = str;
    }

    public void setPackageName(String str) {
        this.f11734d = str;
    }

    public void setPermission(String str) {
        this.f11735e = str;
    }

    public PermissionInfo setPermissionUri(String str) {
        this.f11735e = str;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (parcel == null) {
            return;
        }
        parcel.writeString(this.f11733c);
        parcel.writeString(this.f11734d);
        parcel.writeString(this.f11735e);
    }

    public PermissionInfo(String str, String str2, String str3) {
        this.f11733c = str;
        this.f11734d = str2;
        this.f11735e = str3;
    }

    public PermissionInfo(Parcel parcel) {
        if (parcel == null) {
            return;
        }
        this.f11733c = parcel.readString();
        this.f11734d = parcel.readString();
        this.f11735e = parcel.readString();
    }
}
