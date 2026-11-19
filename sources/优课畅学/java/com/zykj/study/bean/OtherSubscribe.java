package com.zykj.study.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class OtherSubscribe implements Parcelable {
    private String name;
    private final long superviseId;
    public static final Parcelable.Creator<OtherSubscribe> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<OtherSubscribe> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OtherSubscribe createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new OtherSubscribe(parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OtherSubscribe[] newArray(int i10) {
            return new OtherSubscribe[i10];
        }
    }

    public OtherSubscribe(long j10, String name) {
        AbstractC9133u.m16133g(name, "name");
        this.superviseId = j10;
        this.name = name;
    }

    public static /* synthetic */ OtherSubscribe copy$default(OtherSubscribe otherSubscribe, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = otherSubscribe.superviseId;
        }
        if ((i10 & 2) != 0) {
            str = otherSubscribe.name;
        }
        return otherSubscribe.copy(j10, str);
    }

    public final long component1() {
        return this.superviseId;
    }

    public final String component2() {
        return this.name;
    }

    public final OtherSubscribe copy(long j10, String name) {
        AbstractC9133u.m16133g(name, "name");
        return new OtherSubscribe(j10, name);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtherSubscribe)) {
            return false;
        }
        OtherSubscribe otherSubscribe = (OtherSubscribe) obj;
        return this.superviseId == otherSubscribe.superviseId && AbstractC9133u.m16128b(this.name, otherSubscribe.name);
    }

    public final String getName() {
        return this.name;
    }

    public final long getSuperviseId() {
        return this.superviseId;
    }

    public int hashCode() {
        return (Long.hashCode(this.superviseId) * 31) + this.name.hashCode();
    }

    public final void setName(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.name = str;
    }

    public String toString() {
        return "OtherSubscribe(superviseId=" + this.superviseId + ", name=" + this.name + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeLong(this.superviseId);
        dest.writeString(this.name);
    }
}
