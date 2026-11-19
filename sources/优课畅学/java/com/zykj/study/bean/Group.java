package com.zykj.study.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class Group implements Parcelable {
    private final long groupId;
    private final String groupName;
    public static final Parcelable.Creator<Group> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<Group> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Group createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new Group(parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Group[] newArray(int i10) {
            return new Group[i10];
        }
    }

    public Group(long j10, String groupName) {
        AbstractC9133u.m16133g(groupName, "groupName");
        this.groupId = j10;
        this.groupName = groupName;
    }

    public static /* synthetic */ Group copy$default(Group group, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = group.groupId;
        }
        if ((i10 & 2) != 0) {
            str = group.groupName;
        }
        return group.copy(j10, str);
    }

    public final long component1() {
        return this.groupId;
    }

    public final String component2() {
        return this.groupName;
    }

    public final Group copy(long j10, String groupName) {
        AbstractC9133u.m16133g(groupName, "groupName");
        return new Group(j10, groupName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Group)) {
            return false;
        }
        Group group = (Group) obj;
        return this.groupId == group.groupId && AbstractC9133u.m16128b(this.groupName, group.groupName);
    }

    public final long getGroupId() {
        return this.groupId;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public int hashCode() {
        return (Long.hashCode(this.groupId) * 31) + this.groupName.hashCode();
    }

    public String toString() {
        return "Group(groupId=" + this.groupId + ", groupName=" + this.groupName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeLong(this.groupId);
        dest.writeString(this.groupName);
    }
}
