package com.huawei.hms.support.api.entity.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.core.aidl.InterfaceC7278e;

/* loaded from: classes5.dex */
public class Scope implements InterfaceC7278e, Parcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C7333a();

    /* renamed from: c */
    public String f11736c;

    /* renamed from: com.huawei.hms.support.api.entity.auth.Scope$a */
    public class C7333a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Scope createFromParcel(Parcel parcel) {
            return new Scope(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Scope[] newArray(int i10) {
            return new Scope[i10];
        }
    }

    public Scope() {
        this.f11736c = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return Objects.equal(this.f11736c, ((Scope) obj).f11736c);
        }
        return false;
    }

    @Deprecated
    public boolean equeals(Object obj) {
        return equals(obj);
    }

    public String getScopeUri() {
        return this.f11736c;
    }

    public final int hashCode() {
        String str = this.f11736c;
        return str == null ? super.hashCode() : str.hashCode();
    }

    public final String toString() {
        return this.f11736c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11736c);
    }

    public Scope(String str) {
        this.f11736c = str;
    }

    public Scope(Parcel parcel) {
        this.f11736c = parcel.readString();
    }
}
