package com.zykj.study.data;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.zykj.study.bean.course.CourseBean;
import com.zykj.study.bean.course.CourseType;
import java.util.Date;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
@Entity(tableName = "my_course")
@SuppressLint({"ParcelCreator"})
/* loaded from: classes3.dex */
public final class MyCourseEntity extends CourseBean {

    @ColumnInfo
    private boolean isSuperviser;

    @ColumnInfo
    private int sort;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    public static final class CREATOR implements Parcelable.Creator<MyCourseEntity> {
        public /* synthetic */ CREATOR(AbstractC9126n abstractC9126n) {
            this();
        }

        private CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MyCourseEntity createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new MyCourseEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MyCourseEntity[] newArray(int i10) {
            return new MyCourseEntity[i10];
        }
    }

    public /* synthetic */ MyCourseEntity(int i10, String str, String str2, String str3, String str4, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11, CourseType courseType, Date date, int i16, int i17, AbstractC9126n abstractC9126n) {
        this(i10, (i17 & 2) != 0 ? "" : str, (i17 & 4) != 0 ? "" : str2, (i17 & 8) != 0 ? "" : str3, (i17 & 16) != 0 ? "" : str4, (i17 & 32) != 0 ? 0 : i11, (i17 & 64) != 0 ? 0 : i12, (i17 & 128) != 0 ? 0 : i13, (i17 & 256) != 0 ? 0 : i14, (i17 & 512) != 0 ? 0 : i15, (i17 & 1024) != 0 ? true : z10, (i17 & 2048) != 0 ? true : z11, courseType, date, (i17 & 16384) != 0 ? 0 : i16);
    }

    @Override // com.zykj.study.bean.course.CourseBean, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.zykj.study.bean.course.CourseBean
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyCourseEntity) || !super.equals(obj)) {
            return false;
        }
        MyCourseEntity myCourseEntity = (MyCourseEntity) obj;
        return this.isSuperviser == myCourseEntity.isSuperviser && this.sort == myCourseEntity.sort;
    }

    public final int getSort() {
        return this.sort;
    }

    @Override // com.zykj.study.bean.course.CourseBean
    public int hashCode() {
        return (((super.hashCode() * 31) + Boolean.hashCode(this.isSuperviser)) * 31) + Integer.hashCode(this.sort);
    }

    public final boolean isSuperviser() {
        return this.isSuperviser;
    }

    public final void setSort(int i10) {
        this.sort = i10;
    }

    public final void setSuperviser(boolean z10) {
        this.isSuperviser = z10;
    }

    @Override // com.zykj.study.bean.course.CourseBean
    public String toString() {
        return "MyCourseEntity(isSuperviser=" + this.isSuperviser + ",sort=" + this.sort + ") " + super.toString();
    }

    @Override // com.zykj.study.bean.course.CourseBean, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC9133u.m16133g(parcel, "parcel");
        parcel.writeInt(getId());
        parcel.writeString(getUserId());
        parcel.writeString(getCover());
        parcel.writeString(getTitle());
        parcel.writeString(getDescription());
        parcel.writeInt(getPeriodId());
        parcel.writeInt(getGradeId());
        parcel.writeInt(getSubjectId());
        parcel.writeInt(getLearning());
        parcel.writeInt(getLikes());
        parcel.writeByte(isPublic() ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSuperviser ? (byte) 1 : (byte) 0);
        parcel.writeInt(getStatus().ordinal());
        Date createTime = getCreateTime();
        parcel.writeLong(createTime != null ? createTime.getTime() : 0L);
        parcel.writeInt(this.sort);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyCourseEntity(int i10, String str, String str2, String str3, String str4, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11, CourseType status, Date date, int i16) {
        super(i10, str, str2, str3, str4, i11, i12, i13, i14, i15, z10, status, date);
        AbstractC9133u.m16133g(status, "status");
        this.isSuperviser = z11;
        this.sort = i16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MyCourseEntity(Parcel parcel) {
        boolean z10;
        AbstractC9133u.m16133g(parcel, "parcel");
        int i10 = parcel.readInt();
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        int i11 = parcel.readInt();
        int i12 = parcel.readInt();
        int i13 = parcel.readInt();
        int i14 = parcel.readInt();
        int i15 = parcel.readInt();
        boolean z11 = false;
        if (parcel.readByte() != 0) {
            z10 = false;
            z11 = true;
        } else {
            z10 = false;
        }
        this(i10, string, string2, string3, string4, i11, i12, i13, i14, i15, z11, parcel.readByte() == 0 ? z10 : true, (CourseType) CourseType.getEntries().get(parcel.readInt()), new Date(parcel.readLong()), parcel.readInt());
    }
}
