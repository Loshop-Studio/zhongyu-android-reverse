package com.luck.picture.lib.magical;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public class ViewParams implements Parcelable {
    public static final Parcelable.Creator<ViewParams> CREATOR = new C7493a();

    /* renamed from: c */
    public int f12468c;

    /* renamed from: d */
    public int f12469d;

    /* renamed from: e */
    public int f12470e;

    /* renamed from: f */
    public int f12471f;

    /* renamed from: com.luck.picture.lib.magical.ViewParams$a */
    public class C7493a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ViewParams createFromParcel(Parcel parcel) {
            return new ViewParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ViewParams[] newArray(int i10) {
            return new ViewParams[i10];
        }
    }

    public ViewParams() {
    }

    /* renamed from: a */
    public void m9463a(int i10) {
        this.f12471f = i10;
    }

    /* renamed from: b */
    public void m9464b(int i10) {
        this.f12468c = i10;
    }

    /* renamed from: c */
    public void m9465c(int i10) {
        this.f12469d = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public void m9466g(int i10) {
        this.f12470e = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12468c);
        parcel.writeInt(this.f12469d);
        parcel.writeInt(this.f12470e);
        parcel.writeInt(this.f12471f);
    }

    public ViewParams(Parcel parcel) {
        this.f12468c = parcel.readInt();
        this.f12469d = parcel.readInt();
        this.f12470e = parcel.readInt();
        this.f12471f = parcel.readInt();
    }
}
