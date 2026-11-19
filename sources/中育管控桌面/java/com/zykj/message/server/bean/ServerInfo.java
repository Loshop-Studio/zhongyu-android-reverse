package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class ServerInfo implements Parcelable {
    public static final Parcelable.Creator<ServerInfo> CREATOR = new C6198a();

    /* renamed from: a */
    public Status f7407a;

    /* renamed from: b */
    public String f7408b;

    /* renamed from: c */
    public String f7409c;

    /* renamed from: d */
    public String f7410d;

    /* renamed from: e */
    public String f7411e;

    /* renamed from: com.zykj.message.server.bean.ServerInfo$a */
    public class C6198a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ServerInfo createFromParcel(Parcel parcel) {
            return new ServerInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ServerInfo[] newArray(int i6) {
            return new ServerInfo[i6];
        }
    }

    public ServerInfo() {
        this.f7407a = Status.LOGOUT;
        this.f7408b = "";
        this.f7409c = "";
        this.f7410d = "";
        this.f7411e = "";
    }

    /* renamed from: a */
    public String m6221a() {
        return this.f7409c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ServerInfo{status=" + this.f7407a + ", serverUrl='" + this.f7408b + "', token='" + this.f7409c + "', imToken='" + this.f7410d + "', webServerUrl='" + this.f7411e + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        Status status = this.f7407a;
        parcel.writeInt(status == null ? -1 : status.ordinal());
        parcel.writeString(this.f7408b);
        parcel.writeString(this.f7409c);
        parcel.writeString(this.f7410d);
        parcel.writeString(this.f7411e);
    }

    public ServerInfo(Status status, String str, String str2, String str3, String str4) {
        this.f7407a = status;
        this.f7408b = str;
        this.f7409c = str2;
        this.f7410d = str3;
        this.f7411e = str4;
    }

    public ServerInfo(Parcel parcel) {
        int i6 = parcel.readInt();
        this.f7407a = i6 == -1 ? null : Status.values()[i6];
        this.f7408b = parcel.readString();
        this.f7409c = parcel.readString();
        this.f7410d = parcel.readString();
        this.f7411e = parcel.readString();
    }
}
