package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public class ServerInfo implements Parcelable {
    public static final Parcelable.Creator<ServerInfo> CREATOR = new C8621a();

    /* renamed from: c */
    public Status f19818c;

    /* renamed from: d */
    public String f19819d;

    /* renamed from: e */
    public String f19820e;

    /* renamed from: f */
    public String f19821f;

    /* renamed from: g */
    public String f19822g;

    /* renamed from: com.zykj.message.server.bean.ServerInfo$a */
    public class C8621a implements Parcelable.Creator {
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
        this.f19818c = i10 == -1 ? null : Status.values()[i10];
        this.f19819d = parcel.readString();
        this.f19820e = parcel.readString();
        this.f19821f = parcel.readString();
        this.f19822g = parcel.readString();
    }

    /* renamed from: a */
    public String m16566a() {
        return this.f19819d;
    }

    /* renamed from: b */
    public Status m16567b() {
        return this.f19818c;
    }

    /* renamed from: c */
    public String m16568c() {
        return this.f19820e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ServerInfo{status=" + this.f19818c + ", serverUrl='" + this.f19819d + "', token='" + this.f19820e + "', imToken='" + this.f19821f + "', webServerUrl='" + this.f19822g + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Status status = this.f19818c;
        parcel.writeInt(status == null ? -1 : status.ordinal());
        parcel.writeString(this.f19819d);
        parcel.writeString(this.f19820e);
        parcel.writeString(this.f19821f);
        parcel.writeString(this.f19822g);
    }
}
