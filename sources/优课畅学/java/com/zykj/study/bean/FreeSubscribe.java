package com.zykj.study.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class FreeSubscribe implements Parcelable {

    /* renamed from: id */
    private final String f10986id;
    private final String name;
    private final String role;
    private final String subTime;
    public static final Parcelable.Creator<FreeSubscribe> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<FreeSubscribe> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FreeSubscribe createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new FreeSubscribe(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FreeSubscribe[] newArray(int i10) {
            return new FreeSubscribe[i10];
        }
    }

    public FreeSubscribe(String id, String name, String role, String subTime) {
        AbstractC9133u.m16133g(id, "id");
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(role, "role");
        AbstractC9133u.m16133g(subTime, "subTime");
        this.f10986id = id;
        this.name = name;
        this.role = role;
        this.subTime = subTime;
    }

    public static /* synthetic */ FreeSubscribe copy$default(FreeSubscribe freeSubscribe, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = freeSubscribe.f10986id;
        }
        if ((i10 & 2) != 0) {
            str2 = freeSubscribe.name;
        }
        if ((i10 & 4) != 0) {
            str3 = freeSubscribe.role;
        }
        if ((i10 & 8) != 0) {
            str4 = freeSubscribe.subTime;
        }
        return freeSubscribe.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.f10986id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.role;
    }

    public final String component4() {
        return this.subTime;
    }

    public final FreeSubscribe copy(String id, String name, String role, String subTime) {
        AbstractC9133u.m16133g(id, "id");
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(role, "role");
        AbstractC9133u.m16133g(subTime, "subTime");
        return new FreeSubscribe(id, name, role, subTime);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreeSubscribe)) {
            return false;
        }
        FreeSubscribe freeSubscribe = (FreeSubscribe) obj;
        return AbstractC9133u.m16128b(this.f10986id, freeSubscribe.f10986id) && AbstractC9133u.m16128b(this.name, freeSubscribe.name) && AbstractC9133u.m16128b(this.role, freeSubscribe.role) && AbstractC9133u.m16128b(this.subTime, freeSubscribe.subTime);
    }

    public final String getId() {
        return this.f10986id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getSubTime() {
        return this.subTime;
    }

    public int hashCode() {
        return (((((this.f10986id.hashCode() * 31) + this.name.hashCode()) * 31) + this.role.hashCode()) * 31) + this.subTime.hashCode();
    }

    public String toString() {
        return "FreeSubscribe(id=" + this.f10986id + ", name=" + this.name + ", role=" + this.role + ", subTime=" + this.subTime + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeString(this.f10986id);
        dest.writeString(this.name);
        dest.writeString(this.role);
        dest.writeString(this.subTime);
    }
}
