package com.luck.picture.lib.style;

import android.os.Parcel;
import android.os.Parcelable;
import com.luck.picture.lib.R$anim;

/* loaded from: classes5.dex */
public class PictureWindowAnimationStyle implements Parcelable {
    public static final Parcelable.Creator<PictureWindowAnimationStyle> CREATOR = new C7496a();

    /* renamed from: c */
    public int f12499c;

    /* renamed from: d */
    public int f12500d;

    /* renamed from: e */
    public int f12501e;

    /* renamed from: f */
    public int f12502f;

    /* renamed from: com.luck.picture.lib.style.PictureWindowAnimationStyle$a */
    public class C7496a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PictureWindowAnimationStyle createFromParcel(Parcel parcel) {
            return new PictureWindowAnimationStyle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PictureWindowAnimationStyle[] newArray(int i10) {
            return new PictureWindowAnimationStyle[i10];
        }
    }

    public PictureWindowAnimationStyle(int i10, int i11) {
        this.f12499c = i10;
        this.f12500d = i11;
        this.f12501e = i10;
        this.f12502f = i11;
    }

    /* renamed from: a */
    public static PictureWindowAnimationStyle m9501a() {
        return new PictureWindowAnimationStyle(R$anim.ps_anim_enter, R$anim.ps_anim_exit);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12499c);
        parcel.writeInt(this.f12500d);
        parcel.writeInt(this.f12501e);
        parcel.writeInt(this.f12502f);
    }

    public PictureWindowAnimationStyle(Parcel parcel) {
        this.f12499c = parcel.readInt();
        this.f12500d = parcel.readInt();
        this.f12501e = parcel.readInt();
        this.f12502f = parcel.readInt();
    }
}
