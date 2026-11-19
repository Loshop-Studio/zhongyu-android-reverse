package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public enum Status implements Parcelable {
    LOGIN(1),
    LOGOUT(0),
    CRACK(-1);

    public static final Parcelable.Creator<Status> CREATOR = new Parcelable.Creator() { // from class: com.zykj.message.server.bean.Status.a
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Status createFromParcel(Parcel parcel) {
            return Status.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Status[] newArray(int i10) {
            return new Status[i10];
        }
    };

    /* renamed from: a */
    public final int f10687a;

    Status(int i10) {
        this.f10687a = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(name());
    }
}
