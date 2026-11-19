package com.zykj.study.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
@Entity(tableName = TypedValues.CycleType.S_WAVE_PERIOD)
/* loaded from: classes3.dex */
public final class PeriodEntity implements Parcelable {

    /* renamed from: id */
    @PrimaryKey
    @ColumnInfo
    private int f11022id;

    @ColumnInfo
    private String name;
    public static final Parcelable.Creator<PeriodEntity> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<PeriodEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PeriodEntity createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new PeriodEntity(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PeriodEntity[] newArray(int i10) {
            return new PeriodEntity[i10];
        }
    }

    public PeriodEntity(int i10, String name) {
        AbstractC9133u.m16133g(name, "name");
        this.f11022id = i10;
        this.name = name;
    }

    public static /* synthetic */ PeriodEntity copy$default(PeriodEntity periodEntity, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = periodEntity.f11022id;
        }
        if ((i11 & 2) != 0) {
            str = periodEntity.name;
        }
        return periodEntity.copy(i10, str);
    }

    public final int component1() {
        return this.f11022id;
    }

    public final String component2() {
        return this.name;
    }

    public final PeriodEntity copy(int i10, String name) {
        AbstractC9133u.m16133g(name, "name");
        return new PeriodEntity(i10, name);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeriodEntity)) {
            return false;
        }
        PeriodEntity periodEntity = (PeriodEntity) obj;
        return this.f11022id == periodEntity.f11022id && AbstractC9133u.m16128b(this.name, periodEntity.name);
    }

    public final int getId() {
        return this.f11022id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f11022id) * 31) + this.name.hashCode();
    }

    public final void setId(int i10) {
        this.f11022id = i10;
    }

    public final void setName(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.name = str;
    }

    public String toString() {
        return "PeriodEntity(id=" + this.f11022id + ", name=" + this.name + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeInt(this.f11022id);
        dest.writeString(this.name);
    }
}
