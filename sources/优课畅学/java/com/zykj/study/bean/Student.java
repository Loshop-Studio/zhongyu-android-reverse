package com.zykj.study.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class Student implements Parcelable {
    private final long groupId;
    private final String studentName;
    public static final Parcelable.Creator<Student> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<Student> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Student createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new Student(parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Student[] newArray(int i10) {
            return new Student[i10];
        }
    }

    public Student(long j10, String studentName) {
        AbstractC9133u.m16133g(studentName, "studentName");
        this.groupId = j10;
        this.studentName = studentName;
    }

    public static /* synthetic */ Student copy$default(Student student, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = student.groupId;
        }
        if ((i10 & 2) != 0) {
            str = student.studentName;
        }
        return student.copy(j10, str);
    }

    public final long component1() {
        return this.groupId;
    }

    public final String component2() {
        return this.studentName;
    }

    public final Student copy(long j10, String studentName) {
        AbstractC9133u.m16133g(studentName, "studentName");
        return new Student(j10, studentName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student student = (Student) obj;
        return this.groupId == student.groupId && AbstractC9133u.m16128b(this.studentName, student.studentName);
    }

    public final long getGroupId() {
        return this.groupId;
    }

    public final String getStudentName() {
        return this.studentName;
    }

    public int hashCode() {
        return (Long.hashCode(this.groupId) * 31) + this.studentName.hashCode();
    }

    public String toString() {
        return "Student(groupId=" + this.groupId + ", studentName=" + this.studentName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeLong(this.groupId);
        dest.writeString(this.studentName);
    }
}
