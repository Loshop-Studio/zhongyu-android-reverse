package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public class DataBuffer implements Parcelable {
    public static final Parcelable.Creator<DataBuffer> CREATOR = new C7273a();

    /* renamed from: c */
    public String f11600c;

    /* renamed from: d */
    public Bundle f11601d;

    /* renamed from: e */
    public int f11602e;

    /* renamed from: f */
    public Bundle f11603f;

    /* renamed from: com.huawei.hms.core.aidl.DataBuffer$a */
    public class C7273a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DataBuffer createFromParcel(Parcel parcel) {
            return new DataBuffer(parcel, (C7273a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public DataBuffer[] newArray(int i10) {
            return new DataBuffer[i10];
        }
    }

    public /* synthetic */ DataBuffer(Parcel parcel, C7273a c7273a) {
        this(parcel);
    }

    /* renamed from: a */
    public static ClassLoader m8505a(Class cls) {
        return cls.getClassLoader();
    }

    /* renamed from: b */
    public final void m8506b(Parcel parcel) {
        this.f11602e = parcel.readInt();
        this.f11600c = parcel.readString();
        this.f11601d = parcel.readBundle(m8505a(Bundle.class));
        this.f11603f = parcel.readBundle(m8505a(Bundle.class));
    }

    /* renamed from: c */
    public DataBuffer m8507c(Bundle bundle) {
        this.f11603f = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public Bundle m8508g() {
        return this.f11603f;
    }

    /* renamed from: h */
    public int m8509h() {
        return this.f11603f == null ? 0 : 1;
    }

    /* renamed from: i */
    public int m8510i() {
        return this.f11602e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (parcel == null) {
            return;
        }
        parcel.writeInt(this.f11602e);
        parcel.writeString(this.f11600c);
        parcel.writeBundle(this.f11601d);
        parcel.writeBundle(this.f11603f);
    }

    public DataBuffer(Parcel parcel) {
        this.f11601d = null;
        this.f11602e = 1;
        this.f11603f = null;
        m8506b(parcel);
    }

    public DataBuffer(String str, int i10) {
        this.f11601d = null;
        this.f11603f = null;
        this.f11600c = str;
        this.f11602e = i10;
    }
}
