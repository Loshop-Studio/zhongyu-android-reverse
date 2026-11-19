package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class ServerInfo implements Parcelable {
    public static final Parcelable.Creator<ServerInfo> CREATOR = new C7237a();

    /* renamed from: a */
    public Status f10120a;

    /* renamed from: b */
    public String f10121b;

    /* renamed from: c */
    public String f10122c;

    /* renamed from: d */
    public String f10123d;

    /* renamed from: e */
    public String f10124e;

    /* renamed from: com.zykj.message.server.bean.ServerInfo$a */
    public class C7237a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ServerInfo createFromParcel(Parcel parcel) {
            return new ServerInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ServerInfo[] newArray(int i9) {
            return new ServerInfo[i9];
        }
    }

    public ServerInfo(Parcel parcel) {
        int i9 = parcel.readInt();
        this.f10120a = i9 == -1 ? null : Status.values()[i9];
        this.f10121b = parcel.readString();
        this.f10122c = parcel.readString();
        this.f10123d = parcel.readString();
        this.f10124e = parcel.readString();
    }

    /* renamed from: a */
    public String m9859a() {
        return this.f10121b;
    }

    /* renamed from: b */
    public Status m9860b() {
        return this.f10120a;
    }

    /* renamed from: c */
    public String m9861c() {
        return this.f10122c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ServerInfo{status=" + this.f10120a + ", serverUrl='" + this.f10121b + "', token='" + this.f10122c + "', imToken='" + this.f10123d + "', webServerUrl='" + this.f10124e + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        Status status = this.f10120a;
        parcel.writeInt(status == null ? -1 : status.ordinal());
        parcel.writeString(this.f10121b);
        parcel.writeString(this.f10122c);
        parcel.writeString(this.f10123d);
        parcel.writeString(this.f10124e);
    }
}
