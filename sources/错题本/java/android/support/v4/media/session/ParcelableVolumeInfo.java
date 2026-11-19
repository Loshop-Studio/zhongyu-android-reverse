package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0038g;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0038g(7);

    /* renamed from: a */
    public int f107a;

    /* renamed from: b */
    public int f108b;

    /* renamed from: c */
    public int f109c;

    /* renamed from: d */
    public int f110d;

    /* renamed from: e */
    public int f111e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f107a);
        parcel.writeInt(this.f109c);
        parcel.writeInt(this.f110d);
        parcel.writeInt(this.f111e);
        parcel.writeInt(this.f108b);
    }
}
