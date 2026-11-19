package com.zykj.study.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class DeleteSubBatchReq implements Parcelable {
    private final String LearnDateTimeEnd;
    private final String LearnDateTimeStart;
    private final long courseId;
    private final String name;
    private final Integer roleType;
    public static final Parcelable.Creator<DeleteSubBatchReq> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<DeleteSubBatchReq> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeleteSubBatchReq createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new DeleteSubBatchReq(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeleteSubBatchReq[] newArray(int i10) {
            return new DeleteSubBatchReq[i10];
        }
    }

    public DeleteSubBatchReq(long j10, String str, Integer num, String str2, String str3) {
        this.courseId = j10;
        this.name = str;
        this.roleType = num;
        this.LearnDateTimeStart = str2;
        this.LearnDateTimeEnd = str3;
    }

    public static /* synthetic */ DeleteSubBatchReq copy$default(DeleteSubBatchReq deleteSubBatchReq, long j10, String str, Integer num, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = deleteSubBatchReq.courseId;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            str = deleteSubBatchReq.name;
        }
        String str4 = str;
        if ((i10 & 4) != 0) {
            num = deleteSubBatchReq.roleType;
        }
        Integer num2 = num;
        if ((i10 & 8) != 0) {
            str2 = deleteSubBatchReq.LearnDateTimeStart;
        }
        String str5 = str2;
        if ((i10 & 16) != 0) {
            str3 = deleteSubBatchReq.LearnDateTimeEnd;
        }
        return deleteSubBatchReq.copy(j11, str4, num2, str5, str3);
    }

    public final long component1() {
        return this.courseId;
    }

    public final String component2() {
        return this.name;
    }

    public final Integer component3() {
        return this.roleType;
    }

    public final String component4() {
        return this.LearnDateTimeStart;
    }

    public final String component5() {
        return this.LearnDateTimeEnd;
    }

    public final DeleteSubBatchReq copy(long j10, String str, Integer num, String str2, String str3) {
        return new DeleteSubBatchReq(j10, str, num, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSubBatchReq)) {
            return false;
        }
        DeleteSubBatchReq deleteSubBatchReq = (DeleteSubBatchReq) obj;
        return this.courseId == deleteSubBatchReq.courseId && AbstractC9133u.m16128b(this.name, deleteSubBatchReq.name) && AbstractC9133u.m16128b(this.roleType, deleteSubBatchReq.roleType) && AbstractC9133u.m16128b(this.LearnDateTimeStart, deleteSubBatchReq.LearnDateTimeStart) && AbstractC9133u.m16128b(this.LearnDateTimeEnd, deleteSubBatchReq.LearnDateTimeEnd);
    }

    public final long getCourseId() {
        return this.courseId;
    }

    public final String getLearnDateTimeEnd() {
        return this.LearnDateTimeEnd;
    }

    public final String getLearnDateTimeStart() {
        return this.LearnDateTimeStart;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getRoleType() {
        return this.roleType;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.courseId) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.roleType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LearnDateTimeStart;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LearnDateTimeEnd;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "DeleteSubBatchReq(courseId=" + this.courseId + ", name=" + this.name + ", roleType=" + this.roleType + ", LearnDateTimeStart=" + this.LearnDateTimeStart + ", LearnDateTimeEnd=" + this.LearnDateTimeEnd + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        int iIntValue;
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeLong(this.courseId);
        dest.writeString(this.name);
        Integer num = this.roleType;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.LearnDateTimeStart);
        dest.writeString(this.LearnDateTimeEnd);
    }
}
