package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class UserInfo implements Parcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new C7414a();

    /* renamed from: a */
    public Long f10467a;

    /* renamed from: b */
    public String f10468b;

    /* renamed from: c */
    public String f10469c;

    /* renamed from: d */
    public String f10470d;

    /* renamed from: e */
    public String f10471e;

    /* renamed from: f */
    public String f10472f;

    /* renamed from: g */
    public Integer f10473g;

    /* renamed from: com.zykj.message.server.bean.UserInfo$a */
    public class C7414a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserInfo createFromParcel(Parcel parcel) {
            return new UserInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public UserInfo[] newArray(int i10) {
            return new UserInfo[i10];
        }
    }

    public UserInfo(Parcel parcel) {
        this.f10467a = (Long) parcel.readValue(Long.class.getClassLoader());
        this.f10468b = parcel.readString();
        this.f10469c = parcel.readString();
        this.f10470d = parcel.readString();
        this.f10471e = parcel.readString();
        this.f10472f = parcel.readString();
        this.f10473g = Integer.valueOf(parcel.readInt());
    }

    /* renamed from: a */
    public Long m9603a() {
        return this.f10467a;
    }

    /* renamed from: b */
    public String m9604b() {
        return this.f10472f;
    }

    /* renamed from: d */
    public String m9605d() {
        return this.f10470d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public String m9606f() {
        return this.f10468b;
    }

    /* renamed from: h */
    public String m9607h() {
        return this.f10469c;
    }

    public String toString() {
        return "UserInfo{id=" + this.f10467a + ", schoolCode='" + this.f10468b + "', userName='" + this.f10469c + "', realName='" + this.f10470d + "', password='" + this.f10471e + "', photo='" + this.f10472f + "', role=" + this.f10473g + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(this.f10467a);
        parcel.writeString(this.f10468b);
        parcel.writeString(this.f10469c);
        parcel.writeString(this.f10470d);
        parcel.writeString(this.f10471e);
        parcel.writeString(this.f10472f);
        parcel.writeInt(this.f10473g.intValue());
    }
}
