package com.zykj.study.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class FreeSubscribeReq implements Parcelable {
    private final long courseId;
    private String learnDateTimeEnd;
    private String learnDateTimeStart;
    private String name;
    private int pageSize;
    private Integer roleType;
    private int skipCount;
    public static final Parcelable.Creator<FreeSubscribeReq> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<FreeSubscribeReq> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FreeSubscribeReq createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new FreeSubscribeReq(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FreeSubscribeReq[] newArray(int i10) {
            return new FreeSubscribeReq[i10];
        }
    }

    public FreeSubscribeReq(long j10, String str, Integer num, String str2, String str3, int i10, int i11) {
        this.courseId = j10;
        this.name = str;
        this.roleType = num;
        this.learnDateTimeStart = str2;
        this.learnDateTimeEnd = str3;
        this.skipCount = i10;
        this.pageSize = i11;
    }

    public static /* synthetic */ FreeSubscribeReq copy$default(FreeSubscribeReq freeSubscribeReq, long j10, String str, Integer num, String str2, String str3, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j10 = freeSubscribeReq.courseId;
        }
        long j11 = j10;
        if ((i12 & 2) != 0) {
            str = freeSubscribeReq.name;
        }
        String str4 = str;
        if ((i12 & 4) != 0) {
            num = freeSubscribeReq.roleType;
        }
        Integer num2 = num;
        if ((i12 & 8) != 0) {
            str2 = freeSubscribeReq.learnDateTimeStart;
        }
        String str5 = str2;
        if ((i12 & 16) != 0) {
            str3 = freeSubscribeReq.learnDateTimeEnd;
        }
        return freeSubscribeReq.copy(j11, str4, num2, str5, str3, (i12 & 32) != 0 ? freeSubscribeReq.skipCount : i10, (i12 & 64) != 0 ? freeSubscribeReq.pageSize : i11);
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
        return this.learnDateTimeStart;
    }

    public final String component5() {
        return this.learnDateTimeEnd;
    }

    public final int component6() {
        return this.skipCount;
    }

    public final int component7() {
        return this.pageSize;
    }

    public final FreeSubscribeReq copy(long j10, String str, Integer num, String str2, String str3, int i10, int i11) {
        return new FreeSubscribeReq(j10, str, num, str2, str3, i10, i11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreeSubscribeReq)) {
            return false;
        }
        FreeSubscribeReq freeSubscribeReq = (FreeSubscribeReq) obj;
        return this.courseId == freeSubscribeReq.courseId && AbstractC9133u.m16128b(this.name, freeSubscribeReq.name) && AbstractC9133u.m16128b(this.roleType, freeSubscribeReq.roleType) && AbstractC9133u.m16128b(this.learnDateTimeStart, freeSubscribeReq.learnDateTimeStart) && AbstractC9133u.m16128b(this.learnDateTimeEnd, freeSubscribeReq.learnDateTimeEnd) && this.skipCount == freeSubscribeReq.skipCount && this.pageSize == freeSubscribeReq.pageSize;
    }

    public final long getCourseId() {
        return this.courseId;
    }

    public final String getLearnDateTimeEnd() {
        return this.learnDateTimeEnd;
    }

    public final String getLearnDateTimeStart() {
        return this.learnDateTimeStart;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final Integer getRoleType() {
        return this.roleType;
    }

    public final int getSkipCount() {
        return this.skipCount;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.courseId) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.roleType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.learnDateTimeStart;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.learnDateTimeEnd;
        return ((((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.skipCount)) * 31) + Integer.hashCode(this.pageSize);
    }

    public final void setLearnDateTimeEnd(String str) {
        this.learnDateTimeEnd = str;
    }

    public final void setLearnDateTimeStart(String str) {
        this.learnDateTimeStart = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPageSize(int i10) {
        this.pageSize = i10;
    }

    public final void setRoleType(Integer num) {
        this.roleType = num;
    }

    public final void setSkipCount(int i10) {
        this.skipCount = i10;
    }

    public String toString() {
        return "FreeSubscribeReq(courseId=" + this.courseId + ", name=" + this.name + ", roleType=" + this.roleType + ", learnDateTimeStart=" + this.learnDateTimeStart + ", learnDateTimeEnd=" + this.learnDateTimeEnd + ", skipCount=" + this.skipCount + ", pageSize=" + this.pageSize + ")";
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
        dest.writeString(this.learnDateTimeStart);
        dest.writeString(this.learnDateTimeEnd);
        dest.writeInt(this.skipCount);
        dest.writeInt(this.pageSize);
    }

    public /* synthetic */ FreeSubscribeReq(long j10, String str, Integer num, String str2, String str3, int i10, int i11, int i12, AbstractC9126n abstractC9126n) {
        this((i12 & 1) != 0 ? 0L : j10, str, num, str2, str3, (i12 & 32) != 0 ? 0 : i10, (i12 & 64) != 0 ? 0 : i11);
    }
}
