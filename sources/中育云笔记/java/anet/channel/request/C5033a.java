package anet.channel.request;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: anet.channel.request.a */
/* loaded from: classes3.dex */
final class C5033a implements Parcelable.Creator<ByteArrayEntry> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ByteArrayEntry createFromParcel(Parcel parcel) {
        ByteArrayEntry byteArrayEntry = new ByteArrayEntry((C5033a) null);
        byteArrayEntry.bytes = new byte[parcel.readInt()];
        parcel.readByteArray(byteArrayEntry.bytes);
        byteArrayEntry.offset = parcel.readInt();
        byteArrayEntry.count = parcel.readInt();
        byteArrayEntry.contentType = parcel.readString();
        return byteArrayEntry;
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ByteArrayEntry[] newArray(int i10) {
        return new ByteArrayEntry[i10];
    }
}
