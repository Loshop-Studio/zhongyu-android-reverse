package com.huawei.hms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;

@Deprecated
/* loaded from: classes5.dex */
public class Feature extends AbstractSafeParcelable {
    public static final int ARGS_NAME = 1;
    public static final int ARGS_SVC_VER = 2;
    public static final int ARGS_VER = 3;
    public static final Parcelable.Creator<Feature> CREATOR = new FeatureCreator();

    /* renamed from: c */
    public final String f11443c;

    /* renamed from: d */
    public final int f11444d;

    /* renamed from: e */
    public final long f11445e;

    public Feature(String str, long j10) {
        this(str, -1, j10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        return this.f11443c.equals(feature.getName()) && getVersion() == feature.getVersion();
    }

    public String getName() {
        return this.f11443c;
    }

    public long getVersion() {
        long j10 = this.f11445e;
        return -1 == j10 ? this.f11444d : j10;
    }

    public int hashCode() {
        return Objects.hashCode(getName(), Long.valueOf(getVersion()));
    }

    public String toString() {
        return Objects.toStringHelper(this).add(HintConstants.AUTOFILL_HINT_NAME, getName()).add("version", Long.valueOf(getVersion())).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (parcel == null) {
            return;
        }
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getName(), false);
        SafeParcelWriter.writeInt(parcel, 2, this.f11444d);
        SafeParcelWriter.writeLong(parcel, 3, getVersion());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public Feature(String str, int i10, long j10) {
        this.f11443c = str;
        this.f11444d = i10;
        this.f11445e = j10;
    }
}
