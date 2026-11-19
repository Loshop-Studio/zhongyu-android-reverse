package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ServerInfo implements Parcelable {
    public static final Parcelable.Creator<ServerInfo> CREATOR = new C2415a();

    /* renamed from: a */
    private Status f9810a;

    /* renamed from: b */
    private String f9811b;

    /* renamed from: c */
    private String f9812c;

    /* renamed from: d */
    private String f9813d;

    /* renamed from: e */
    private String f9814e;

    /* renamed from: com.zykj.message.server.bean.ServerInfo$a */
    class C2415a implements Parcelable.Creator<ServerInfo> {
        C2415a() {
        }

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

    public ServerInfo() {
        this.f9810a = Status.LOGOUT;
        this.f9811b = "";
        this.f9812c = "";
        this.f9813d = "";
        this.f9814e = "";
    }

    /* renamed from: a */
    public String m8008a() {
        return this.f9811b;
    }

    /* renamed from: b */
    public Status m8009b() {
        return this.f9810a;
    }

    /* renamed from: c */
    public String m8010c() {
        return this.f9812c;
    }

    /* renamed from: d */
    public String m8011d() {
        return this.f9814e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void m8012e(String str) {
        this.f9812c = str;
    }

    public String toString() {
        return "ServerInfo{status=" + this.f9810a + ", serverUrl='" + this.f9811b + "', token='" + this.f9812c + "', imToken='" + this.f9813d + "', webServerUrl='" + this.f9814e + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        Status status = this.f9810a;
        parcel.writeInt(status == null ? -1 : status.ordinal());
        parcel.writeString(this.f9811b);
        parcel.writeString(this.f9812c);
        parcel.writeString(this.f9813d);
        parcel.writeString(this.f9814e);
    }

    protected ServerInfo(Parcel parcel) {
        int i4 = parcel.readInt();
        this.f9810a = i4 == -1 ? null : Status.values()[i4];
        this.f9811b = parcel.readString();
        this.f9812c = parcel.readString();
        this.f9813d = parcel.readString();
        this.f9814e = parcel.readString();
    }
}
