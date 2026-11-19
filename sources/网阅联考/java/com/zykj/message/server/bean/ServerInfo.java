package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class ServerInfo implements Parcelable {
    public static final Parcelable.Creator<ServerInfo> CREATOR = new C3685a();

    /* renamed from: a */
    public Status f4272a;

    /* renamed from: b */
    public String f4273b;

    /* renamed from: c */
    public String f4274c;

    /* renamed from: d */
    public String f4275d;

    /* renamed from: com.zykj.message.server.bean.ServerInfo$a */
    public class C3685a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ServerInfo createFromParcel(Parcel parcel) {
            return new ServerInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ServerInfo[] newArray(int i4) {
            return new ServerInfo[i4];
        }
    }

    public ServerInfo(Parcel parcel) {
        int i4 = parcel.readInt();
        this.f4272a = i4 == -1 ? null : Status.values()[i4];
        this.f4273b = parcel.readString();
        this.f4274c = parcel.readString();
        this.f4275d = parcel.readString();
    }

    /* renamed from: b */
    public String m4654b() {
        return this.f4273b;
    }

    /* renamed from: d */
    public Status m4655d() {
        return this.f4272a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String m4656e() {
        return this.f4274c;
    }

    public String toString() {
        return "ServerInfo{status=" + this.f4272a + ", serverUrl='" + this.f4273b + "', token='" + this.f4274c + "', imToken='" + this.f4275d + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        Status status = this.f4272a;
        parcel.writeInt(status == null ? -1 : status.ordinal());
        parcel.writeString(this.f4273b);
        parcel.writeString(this.f4274c);
        parcel.writeString(this.f4275d);
    }
}
