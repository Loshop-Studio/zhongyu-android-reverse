package com.zykj.study.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
@Entity(tableName = "course_study_key")
/* loaded from: classes3.dex */
public final class CourseStudyKeyEntity implements Parcelable {

    /* renamed from: id */
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private int f11018id;

    @ColumnInfo
    private Integer nextPage;

    @ColumnInfo
    private int pageIndex;

    @ColumnInfo
    private String userId;
    public static final Parcelable.Creator<CourseStudyKeyEntity> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<CourseStudyKeyEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CourseStudyKeyEntity createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new CourseStudyKeyEntity(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CourseStudyKeyEntity[] newArray(int i10) {
            return new CourseStudyKeyEntity[i10];
        }
    }

    public CourseStudyKeyEntity(int i10, String userId, int i11, Integer num) {
        AbstractC9133u.m16133g(userId, "userId");
        this.f11018id = i10;
        this.userId = userId;
        this.pageIndex = i11;
        this.nextPage = num;
    }

    public static /* synthetic */ CourseStudyKeyEntity copy$default(CourseStudyKeyEntity courseStudyKeyEntity, int i10, String str, int i11, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = courseStudyKeyEntity.f11018id;
        }
        if ((i12 & 2) != 0) {
            str = courseStudyKeyEntity.userId;
        }
        if ((i12 & 4) != 0) {
            i11 = courseStudyKeyEntity.pageIndex;
        }
        if ((i12 & 8) != 0) {
            num = courseStudyKeyEntity.nextPage;
        }
        return courseStudyKeyEntity.copy(i10, str, i11, num);
    }

    public final int component1() {
        return this.f11018id;
    }

    public final String component2() {
        return this.userId;
    }

    public final int component3() {
        return this.pageIndex;
    }

    public final Integer component4() {
        return this.nextPage;
    }

    public final CourseStudyKeyEntity copy(int i10, String userId, int i11, Integer num) {
        AbstractC9133u.m16133g(userId, "userId");
        return new CourseStudyKeyEntity(i10, userId, i11, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CourseStudyKeyEntity)) {
            return false;
        }
        CourseStudyKeyEntity courseStudyKeyEntity = (CourseStudyKeyEntity) obj;
        return this.f11018id == courseStudyKeyEntity.f11018id && AbstractC9133u.m16128b(this.userId, courseStudyKeyEntity.userId) && this.pageIndex == courseStudyKeyEntity.pageIndex && AbstractC9133u.m16128b(this.nextPage, courseStudyKeyEntity.nextPage);
    }

    public final int getId() {
        return this.f11018id;
    }

    public final Integer getNextPage() {
        return this.nextPage;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.f11018id) * 31) + this.userId.hashCode()) * 31) + Integer.hashCode(this.pageIndex)) * 31;
        Integer num = this.nextPage;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final void setId(int i10) {
        this.f11018id = i10;
    }

    public final void setNextPage(Integer num) {
        this.nextPage = num;
    }

    public final void setPageIndex(int i10) {
        this.pageIndex = i10;
    }

    public final void setUserId(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.userId = str;
    }

    public String toString() {
        return "CourseStudyKeyEntity(id=" + this.f11018id + ", userId=" + this.userId + ", pageIndex=" + this.pageIndex + ", nextPage=" + this.nextPage + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeInt(this.f11018id);
        dest.writeString(this.userId);
        dest.writeInt(this.pageIndex);
        Integer num = this.nextPage;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public /* synthetic */ CourseStudyKeyEntity(int i10, String str, int i11, Integer num, int i12, AbstractC9126n abstractC9126n) {
        this(i10, (i12 & 2) != 0 ? "" : str, i11, (i12 & 8) != 0 ? null : num);
    }
}
