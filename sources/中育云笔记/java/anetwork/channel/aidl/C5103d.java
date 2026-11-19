package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: anetwork.channel.aidl.d */
/* loaded from: classes3.dex */
final class C5103d implements Parcelable.Creator<ParcelableHeader> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ParcelableHeader createFromParcel(Parcel parcel) {
        return ParcelableHeader.m2558a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ParcelableHeader[] newArray(int i10) {
        return new ParcelableHeader[i10];
    }
}
