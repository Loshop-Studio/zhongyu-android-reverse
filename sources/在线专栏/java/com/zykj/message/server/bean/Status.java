package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public enum Status implements Parcelable {
    LOGIN(1),
    LOGOUT(0),
    CRACK(-1);

    public static final Parcelable.Creator<Status> CREATOR = new Parcelable.Creator<Status>() { // from class: com.zykj.message.server.bean.Status.a
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Status createFromParcel(Parcel parcel) {
            return Status.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Status[] newArray(int i4) {
            return new Status[i4];
        }
    };

    /* renamed from: a */
    private final int f9819a;

    Status(int i4) {
        this.f9819a = i4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(name());
    }
}
