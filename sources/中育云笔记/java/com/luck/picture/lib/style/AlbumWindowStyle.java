package com.luck.picture.lib.style;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public class AlbumWindowStyle implements Parcelable {
    public static final Parcelable.Creator<AlbumWindowStyle> CREATOR = new C7494a();

    /* renamed from: c */
    public int f12476c;

    /* renamed from: d */
    public int f12477d;

    /* renamed from: e */
    public int f12478e;

    /* renamed from: f */
    public int f12479f;

    /* renamed from: com.luck.picture.lib.style.AlbumWindowStyle$a */
    public class C7494a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AlbumWindowStyle createFromParcel(Parcel parcel) {
            return new AlbumWindowStyle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AlbumWindowStyle[] newArray(int i10) {
            return new AlbumWindowStyle[i10];
        }
    }

    public AlbumWindowStyle() {
    }

    /* renamed from: a */
    public int m9474a() {
        return this.f12476c;
    }

    /* renamed from: b */
    public int m9475b() {
        return this.f12477d;
    }

    /* renamed from: c */
    public int m9476c() {
        return this.f12479f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public int m9477g() {
        return this.f12478e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12476c);
        parcel.writeInt(this.f12477d);
        parcel.writeInt(this.f12478e);
        parcel.writeInt(this.f12479f);
    }

    public AlbumWindowStyle(Parcel parcel) {
        this.f12476c = parcel.readInt();
        this.f12477d = parcel.readInt();
        this.f12478e = parcel.readInt();
        this.f12479f = parcel.readInt();
    }
}
