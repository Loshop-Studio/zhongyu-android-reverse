package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ServerInfo implements Parcelable {
    public static final Parcelable.Creator<ServerInfo> CREATOR = new C7001a();

    /* renamed from: a */
    public Status f10678a;

    /* renamed from: b */
    public String f10679b;

    /* renamed from: c */
    public String f10680c;

    /* renamed from: d */
    public String f10681d;

    /* renamed from: e */
    public String f10682e;

    /* renamed from: com.zykj.message.server.bean.ServerInfo$a */
    public class C7001a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ServerInfo createFromParcel(Parcel parcel) {
            return new ServerInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ServerInfo[] newArray(int i10) {
            return new ServerInfo[i10];
        }
    }

    public ServerInfo(Parcel parcel) {
        int i10 = parcel.readInt();
        this.f10678a = i10 == -1 ? null : Status.values()[i10];
        this.f10679b = parcel.readString();
        this.f10680c = parcel.readString();
        this.f10681d = parcel.readString();
        this.f10682e = parcel.readString();
    }

    /* renamed from: a */
    public String m10595a() {
        return this.f10679b;
    }

    /* renamed from: b */
    public Status m10596b() {
        return this.f10678a;
    }

    /* renamed from: c */
    public String m10597c() {
        return this.f10680c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ServerInfo{status=" + this.f10678a + ", serverUrl='" + this.f10679b + "', token='" + this.f10680c + "', imToken='" + this.f10681d + "', webServerUrl='" + this.f10682e + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Status status = this.f10678a;
        parcel.writeInt(status == null ? -1 : status.ordinal());
        parcel.writeString(this.f10679b);
        parcel.writeString(this.f10680c);
        parcel.writeString(this.f10681d);
        parcel.writeString(this.f10682e);
    }
}
