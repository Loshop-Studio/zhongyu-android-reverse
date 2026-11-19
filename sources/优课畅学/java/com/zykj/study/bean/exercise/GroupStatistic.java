package com.zykj.study.bean.exercise;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class GroupStatistic implements Parcelable {
    private final int groupId;
    private final String groupName;
    private final long members;
    private final List<ExerciseBean> questionGroups;
    public static final Parcelable.Creator<GroupStatistic> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<GroupStatistic> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupStatistic createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AbstractC9133u.m16133g(parcel, "parcel");
            int i10 = parcel.readInt();
            String string = parcel.readString();
            long j10 = parcel.readLong();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(ExerciseBean.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new GroupStatistic(i10, string, j10, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupStatistic[] newArray(int i10) {
            return new GroupStatistic[i10];
        }
    }

    public GroupStatistic(int i10, String groupName, long j10, List<ExerciseBean> list) {
        AbstractC9133u.m16133g(groupName, "groupName");
        this.groupId = i10;
        this.groupName = groupName;
        this.members = j10;
        this.questionGroups = list;
    }

    public static /* synthetic */ GroupStatistic copy$default(GroupStatistic groupStatistic, int i10, String str, long j10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = groupStatistic.groupId;
        }
        if ((i11 & 2) != 0) {
            str = groupStatistic.groupName;
        }
        if ((i11 & 4) != 0) {
            j10 = groupStatistic.members;
        }
        if ((i11 & 8) != 0) {
            list = groupStatistic.questionGroups;
        }
        List list2 = list;
        return groupStatistic.copy(i10, str, j10, list2);
    }

    public final int component1() {
        return this.groupId;
    }

    public final String component2() {
        return this.groupName;
    }

    public final long component3() {
        return this.members;
    }

    public final List<ExerciseBean> component4() {
        return this.questionGroups;
    }

    public final GroupStatistic copy(int i10, String groupName, long j10, List<ExerciseBean> list) {
        AbstractC9133u.m16133g(groupName, "groupName");
        return new GroupStatistic(i10, groupName, j10, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupStatistic)) {
            return false;
        }
        GroupStatistic groupStatistic = (GroupStatistic) obj;
        return this.groupId == groupStatistic.groupId && AbstractC9133u.m16128b(this.groupName, groupStatistic.groupName) && this.members == groupStatistic.members && AbstractC9133u.m16128b(this.questionGroups, groupStatistic.questionGroups);
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final long getMembers() {
        return this.members;
    }

    public final List<ExerciseBean> getQuestionGroups() {
        return this.questionGroups;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.groupId) * 31) + this.groupName.hashCode()) * 31) + Long.hashCode(this.members)) * 31;
        List<ExerciseBean> list = this.questionGroups;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "GroupStatistic(groupId=" + this.groupId + ", groupName=" + this.groupName + ", members=" + this.members + ", questionGroups=" + this.questionGroups + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeInt(this.groupId);
        dest.writeString(this.groupName);
        dest.writeLong(this.members);
        List<ExerciseBean> list = this.questionGroups;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<ExerciseBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, i10);
        }
    }
}
