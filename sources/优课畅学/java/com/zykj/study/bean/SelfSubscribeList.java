package com.zykj.study.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SelfSubscribeList implements Parcelable {
    private final List<Group> groups;
    private final boolean isSupervise;
    private final List<Student> students;
    public static final Parcelable.Creator<SelfSubscribeList> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<SelfSubscribeList> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelfSubscribeList createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            boolean z10 = parcel.readInt() != 0;
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(Group.CREATOR.createFromParcel(parcel));
            }
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList2.add(Student.CREATOR.createFromParcel(parcel));
            }
            return new SelfSubscribeList(z10, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SelfSubscribeList[] newArray(int i10) {
            return new SelfSubscribeList[i10];
        }
    }

    public SelfSubscribeList(boolean z10, List<Group> groups, List<Student> students) {
        AbstractC9133u.m16133g(groups, "groups");
        AbstractC9133u.m16133g(students, "students");
        this.isSupervise = z10;
        this.groups = groups;
        this.students = students;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelfSubscribeList copy$default(SelfSubscribeList selfSubscribeList, boolean z10, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = selfSubscribeList.isSupervise;
        }
        if ((i10 & 2) != 0) {
            list = selfSubscribeList.groups;
        }
        if ((i10 & 4) != 0) {
            list2 = selfSubscribeList.students;
        }
        return selfSubscribeList.copy(z10, list, list2);
    }

    public final boolean component1() {
        return this.isSupervise;
    }

    public final List<Group> component2() {
        return this.groups;
    }

    public final List<Student> component3() {
        return this.students;
    }

    public final SelfSubscribeList copy(boolean z10, List<Group> groups, List<Student> students) {
        AbstractC9133u.m16133g(groups, "groups");
        AbstractC9133u.m16133g(students, "students");
        return new SelfSubscribeList(z10, groups, students);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelfSubscribeList)) {
            return false;
        }
        SelfSubscribeList selfSubscribeList = (SelfSubscribeList) obj;
        return this.isSupervise == selfSubscribeList.isSupervise && AbstractC9133u.m16128b(this.groups, selfSubscribeList.groups) && AbstractC9133u.m16128b(this.students, selfSubscribeList.students);
    }

    public final List<Group> getGroups() {
        return this.groups;
    }

    public final List<Student> getStudents() {
        return this.students;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isSupervise) * 31) + this.groups.hashCode()) * 31) + this.students.hashCode();
    }

    public final boolean isSupervise() {
        return this.isSupervise;
    }

    public String toString() {
        return "SelfSubscribeList(isSupervise=" + this.isSupervise + ", groups=" + this.groups + ", students=" + this.students + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeInt(this.isSupervise ? 1 : 0);
        List<Group> list = this.groups;
        dest.writeInt(list.size());
        Iterator<Group> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, i10);
        }
        List<Student> list2 = this.students;
        dest.writeInt(list2.size());
        Iterator<Student> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, i10);
        }
    }
}
