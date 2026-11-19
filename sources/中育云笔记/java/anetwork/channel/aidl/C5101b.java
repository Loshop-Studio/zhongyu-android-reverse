package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: anetwork.channel.aidl.b */
/* loaded from: classes3.dex */
final class C5101b implements Parcelable.Creator<DefaultProgressEvent> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public DefaultProgressEvent createFromParcel(Parcel parcel) {
        return DefaultProgressEvent.readFromParcel(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public DefaultProgressEvent[] newArray(int i10) {
        return new DefaultProgressEvent[i10];
    }
}
