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
@Entity(tableName = "my_course_key")
/* loaded from: classes3.dex */
public final class MyCourseKeyEntity implements Parcelable {

    /* renamed from: id */
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private int f11020id;

    @ColumnInfo
    private Integer nextStartId;

    @ColumnInfo
    private int startId;

    @ColumnInfo
    private int take;

    @ColumnInfo
    private String userId;
    public static final Parcelable.Creator<MyCourseKeyEntity> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<MyCourseKeyEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MyCourseKeyEntity createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new MyCourseKeyEntity(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MyCourseKeyEntity[] newArray(int i10) {
            return new MyCourseKeyEntity[i10];
        }
    }

    public MyCourseKeyEntity(int i10, String userId, int i11, int i12, Integer num) {
        AbstractC9133u.m16133g(userId, "userId");
        this.f11020id = i10;
        this.userId = userId;
        this.startId = i11;
        this.take = i12;
        this.nextStartId = num;
    }

    public static /* synthetic */ MyCourseKeyEntity copy$default(MyCourseKeyEntity myCourseKeyEntity, int i10, String str, int i11, int i12, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = myCourseKeyEntity.f11020id;
        }
        if ((i13 & 2) != 0) {
            str = myCourseKeyEntity.userId;
        }
        if ((i13 & 4) != 0) {
            i11 = myCourseKeyEntity.startId;
        }
        if ((i13 & 8) != 0) {
            i12 = myCourseKeyEntity.take;
        }
        if ((i13 & 16) != 0) {
            num = myCourseKeyEntity.nextStartId;
        }
        Integer num2 = num;
        int i14 = i11;
        return myCourseKeyEntity.copy(i10, str, i14, i12, num2);
    }

    public final int component1() {
        return this.f11020id;
    }

    public final String component2() {
        return this.userId;
    }

    public final int component3() {
        return this.startId;
    }

    public final int component4() {
        return this.take;
    }

    public final Integer component5() {
        return this.nextStartId;
    }

    public final MyCourseKeyEntity copy(int i10, String userId, int i11, int i12, Integer num) {
        AbstractC9133u.m16133g(userId, "userId");
        return new MyCourseKeyEntity(i10, userId, i11, i12, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyCourseKeyEntity)) {
            return false;
        }
        MyCourseKeyEntity myCourseKeyEntity = (MyCourseKeyEntity) obj;
        return this.f11020id == myCourseKeyEntity.f11020id && AbstractC9133u.m16128b(this.userId, myCourseKeyEntity.userId) && this.startId == myCourseKeyEntity.startId && this.take == myCourseKeyEntity.take && AbstractC9133u.m16128b(this.nextStartId, myCourseKeyEntity.nextStartId);
    }

    public final int getId() {
        return this.f11020id;
    }

    public final Integer getNextStartId() {
        return this.nextStartId;
    }

    public final int getStartId() {
        return this.startId;
    }

    public final int getTake() {
        return this.take;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.f11020id) * 31) + this.userId.hashCode()) * 31) + Integer.hashCode(this.startId)) * 31) + Integer.hashCode(this.take)) * 31;
        Integer num = this.nextStartId;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final void setId(int i10) {
        this.f11020id = i10;
    }

    public final void setNextStartId(Integer num) {
        this.nextStartId = num;
    }

    public final void setStartId(int i10) {
        this.startId = i10;
    }

    public final void setTake(int i10) {
        this.take = i10;
    }

    public final void setUserId(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.userId = str;
    }

    public String toString() {
        return "MyCourseKeyEntity(id=" + this.f11020id + ", userId=" + this.userId + ", startId=" + this.startId + ", take=" + this.take + ", nextStartId=" + this.nextStartId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeInt(this.f11020id);
        dest.writeString(this.userId);
        dest.writeInt(this.startId);
        dest.writeInt(this.take);
        Integer num = this.nextStartId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    public /* synthetic */ MyCourseKeyEntity(int i10, String str, int i11, int i12, Integer num, int i13, AbstractC9126n abstractC9126n) {
        this(i10, (i13 & 2) != 0 ? "" : str, i11, i12, (i13 & 16) != 0 ? null : num);
    }
}
