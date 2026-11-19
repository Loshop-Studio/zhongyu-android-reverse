package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class UserInfo implements Parcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new C7239a();

    /* renamed from: a */
    public Long f10130a;

    /* renamed from: b */
    public String f10131b;

    /* renamed from: c */
    public String f10132c;

    /* renamed from: d */
    public String f10133d;

    /* renamed from: e */
    public String f10134e;

    /* renamed from: f */
    public String f10135f;

    /* renamed from: g */
    public Integer f10136g;

    /* renamed from: com.zykj.message.server.bean.UserInfo$a */
    public class C7239a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserInfo createFromParcel(Parcel parcel) {
            return new UserInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public UserInfo[] newArray(int i9) {
            return new UserInfo[i9];
        }
    }

    public UserInfo(Parcel parcel) {
        this.f10130a = (Long) parcel.readValue(Long.class.getClassLoader());
        this.f10131b = parcel.readString();
        this.f10132c = parcel.readString();
        this.f10133d = parcel.readString();
        this.f10134e = parcel.readString();
        this.f10135f = parcel.readString();
        this.f10136g = Integer.valueOf(parcel.readInt());
    }

    /* renamed from: a */
    public Long m9866a() {
        return this.f10130a;
    }

    /* renamed from: b */
    public String m9867b() {
        return this.f10135f;
    }

    /* renamed from: c */
    public String m9868c() {
        return this.f10133d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "UserInfo{id=" + this.f10130a + ", schoolCode='" + this.f10131b + "', userName='" + this.f10132c + "', realName='" + this.f10133d + "', password='" + this.f10134e + "', photo='" + this.f10135f + "', role=" + this.f10136g + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeValue(this.f10130a);
        parcel.writeString(this.f10131b);
        parcel.writeString(this.f10132c);
        parcel.writeString(this.f10133d);
        parcel.writeString(this.f10134e);
        parcel.writeString(this.f10135f);
        parcel.writeInt(this.f10136g.intValue());
    }
}
