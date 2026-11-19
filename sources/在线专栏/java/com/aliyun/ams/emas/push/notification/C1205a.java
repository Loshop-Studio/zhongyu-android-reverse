package com.aliyun.ams.emas.push.notification;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.aliyun.ams.emas.push.notification.a */
/* loaded from: classes.dex */
final class C1205a implements Parcelable.Creator<CPushMessage> {
    C1205a() {
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public CPushMessage createFromParcel(Parcel parcel) {
        return new CPushMessage(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CPushMessage[] newArray(int i4) {
        return new CPushMessage[i4];
    }
}
