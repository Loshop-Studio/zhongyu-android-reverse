package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: anetwork.channel.aidl.a */
/* loaded from: classes3.dex */
final class C5094a implements Parcelable.Creator<DefaultFinishEvent> {
    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public DefaultFinishEvent createFromParcel(Parcel parcel) {
        return DefaultFinishEvent.m2555a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public DefaultFinishEvent[] newArray(int i10) {
        return new DefaultFinishEvent[i10];
    }
}
