package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class ServerInfo implements Parcelable {
    public static final Parcelable.Creator<ServerInfo> CREATOR = new C7412a();

    /* renamed from: a */
    public Status f10457a;

    /* renamed from: b */
    public String f10458b;

    /* renamed from: c */
    public String f10459c;

    /* renamed from: d */
    public String f10460d;

    /* renamed from: e */
    public String f10461e;

    /* renamed from: com.zykj.message.server.bean.ServerInfo$a */
    public class C7412a implements Parcelable.Creator {
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
        this.f10457a = i10 == -1 ? null : Status.values()[i10];
        this.f10458b = parcel.readString();
        this.f10459c = parcel.readString();
        this.f10460d = parcel.readString();
        this.f10461e = parcel.readString();
    }

    /* renamed from: a */
    public String m9595a() {
        return this.f10458b;
    }

    /* renamed from: b */
    public Status m9596b() {
        return this.f10457a;
    }

    /* renamed from: d */
    public String m9597d() {
        return this.f10459c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public String m9598f() {
        return this.f10461e;
    }

    public String toString() {
        return "ServerInfo{status=" + this.f10457a + ", serverUrl='" + this.f10458b + "', token='" + this.f10459c + "', imToken='" + this.f10460d + "', webServerUrl='" + this.f10461e + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Status status = this.f10457a;
        parcel.writeInt(status == null ? -1 : status.ordinal());
        parcel.writeString(this.f10458b);
        parcel.writeString(this.f10459c);
        parcel.writeString(this.f10460d);
        parcel.writeString(this.f10461e);
    }
}
