package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0038g;

/* loaded from: classes3.dex */
public enum Status implements Parcelable {
    LOGIN(1),
    LOGOUT(0),
    CRACK(-1);

    public static final Parcelable.Creator<Status> CREATOR = new C0038g(12);
    private final int status;

    Status(int i) {
        this.status = i;
    }

    public static Status getStatus(int i) {
        Status status = LOGOUT;
        for (Status status2 : values()) {
            if (status2.getStatusCode() == i) {
                return status2;
            }
        }
        return status;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getStatusCode() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
