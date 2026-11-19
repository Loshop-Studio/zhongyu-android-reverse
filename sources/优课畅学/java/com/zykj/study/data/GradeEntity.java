package com.zykj.study.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
@Entity(tableName = "grade")
/* loaded from: classes3.dex */
public final class GradeEntity implements Parcelable {

    /* renamed from: id */
    @PrimaryKey
    @ColumnInfo
    private int f11019id;

    @ColumnInfo
    private String name;

    @ColumnInfo
    private int parentId;
    public static final Parcelable.Creator<GradeEntity> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<GradeEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GradeEntity createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new GradeEntity(parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GradeEntity[] newArray(int i10) {
            return new GradeEntity[i10];
        }
    }

    public GradeEntity(int i10, String name, int i11) {
        AbstractC9133u.m16133g(name, "name");
        this.f11019id = i10;
        this.name = name;
        this.parentId = i11;
    }

    public static /* synthetic */ GradeEntity copy$default(GradeEntity gradeEntity, int i10, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = gradeEntity.f11019id;
        }
        if ((i12 & 2) != 0) {
            str = gradeEntity.name;
        }
        if ((i12 & 4) != 0) {
            i11 = gradeEntity.parentId;
        }
        return gradeEntity.copy(i10, str, i11);
    }

    public final int component1() {
        return this.f11019id;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.parentId;
    }

    public final GradeEntity copy(int i10, String name, int i11) {
        AbstractC9133u.m16133g(name, "name");
        return new GradeEntity(i10, name, i11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GradeEntity)) {
            return false;
        }
        GradeEntity gradeEntity = (GradeEntity) obj;
        return this.f11019id == gradeEntity.f11019id && AbstractC9133u.m16128b(this.name, gradeEntity.name) && this.parentId == gradeEntity.parentId;
    }

    public final int getId() {
        return this.f11019id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getParentId() {
        return this.parentId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f11019id) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.parentId);
    }

    public final void setId(int i10) {
        this.f11019id = i10;
    }

    public final void setName(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.name = str;
    }

    public final void setParentId(int i10) {
        this.parentId = i10;
    }

    public String toString() {
        return "GradeEntity(id=" + this.f11019id + ", name=" + this.name + ", parentId=" + this.parentId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeInt(this.f11019id);
        dest.writeString(this.name);
        dest.writeInt(this.parentId);
    }
}
