package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public enum Status implements Parcelable {
    LOGIN(1),
    LOGOUT(0),
    CRACK(-1);

    public static final Parcelable.Creator<Status> CREATOR = new Parcelable.Creator<Status>() { // from class: com.zykj.message.server.bean.Status.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Status createFromParcel(Parcel parcel) {
            return Status.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Status[] newArray(int i) {
            return new Status[i];
        }
    };
    private final int status;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    Status(int i) {
        this.status = i;
    }

    public int getStatusCode() {
        return this.status;
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
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
