package com.zykj.study.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
@Entity(tableName = "subject")
/* loaded from: classes3.dex */
public final class SubjectEntity implements Parcelable {

    /* renamed from: id */
    @PrimaryKey
    @ColumnInfo
    private int f11024id;

    @ColumnInfo
    private String name;
    public static final Parcelable.Creator<SubjectEntity> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<SubjectEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubjectEntity createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new SubjectEntity(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubjectEntity[] newArray(int i10) {
            return new SubjectEntity[i10];
        }
    }

    public SubjectEntity(int i10, String name) {
        AbstractC9133u.m16133g(name, "name");
        this.f11024id = i10;
        this.name = name;
    }

    public static /* synthetic */ SubjectEntity copy$default(SubjectEntity subjectEntity, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = subjectEntity.f11024id;
        }
        if ((i11 & 2) != 0) {
            str = subjectEntity.name;
        }
        return subjectEntity.copy(i10, str);
    }

    public final int component1() {
        return this.f11024id;
    }

    public final String component2() {
        return this.name;
    }

    public final SubjectEntity copy(int i10, String name) {
        AbstractC9133u.m16133g(name, "name");
        return new SubjectEntity(i10, name);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubjectEntity)) {
            return false;
        }
        SubjectEntity subjectEntity = (SubjectEntity) obj;
        return this.f11024id == subjectEntity.f11024id && AbstractC9133u.m16128b(this.name, subjectEntity.name);
    }

    public final int getId() {
        return this.f11024id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f11024id) * 31) + this.name.hashCode();
    }

    public final void setId(int i10) {
        this.f11024id = i10;
    }

    public final void setName(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.name = str;
    }

    public String toString() {
        return "SubjectEntity(id=" + this.f11024id + ", name=" + this.name + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeInt(this.f11024id);
        dest.writeString(this.name);
    }
}
