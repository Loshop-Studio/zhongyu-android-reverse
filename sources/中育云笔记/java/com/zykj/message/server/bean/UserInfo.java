package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public class UserInfo implements Parcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new C8623a();

    /* renamed from: c */
    public Long f19828c;

    /* renamed from: d */
    public String f19829d;

    /* renamed from: e */
    public String f19830e;

    /* renamed from: f */
    public String f19831f;

    /* renamed from: g */
    public String f19832g;

    /* renamed from: h */
    public String f19833h;

    /* renamed from: i */
    public Integer f19834i;

    /* renamed from: com.zykj.message.server.bean.UserInfo$a */
    public class C8623a implements Parcelable.Creator {
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
        this.f19828c = (Long) parcel.readValue(Long.class.getClassLoader());
        this.f19829d = parcel.readString();
        this.f19830e = parcel.readString();
        this.f19831f = parcel.readString();
        this.f19832g = parcel.readString();
        this.f19833h = parcel.readString();
        this.f19834i = Integer.valueOf(parcel.readInt());
    }

    /* renamed from: a */
    public Long m16573a() {
        return this.f19828c;
    }

    /* renamed from: b */
    public String m16574b() {
        return this.f19831f;
    }

    /* renamed from: c */
    public Integer m16575c() {
        return this.f19834i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public String m16576g() {
        return this.f19829d;
    }

    /* renamed from: h */
    public String m16577h() {
        return this.f19830e;
    }

    public String toString() {
        return "UserInfo{id=" + this.f19828c + ", schoolCode='" + this.f19829d + "', userName='" + this.f19830e + "', realName='" + this.f19831f + "', password='" + this.f19832g + "', photo='" + this.f19833h + "', role=" + this.f19834i + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(this.f19828c);
        parcel.writeString(this.f19829d);
        parcel.writeString(this.f19830e);
        parcel.writeString(this.f19831f);
        parcel.writeString(this.f19832g);
        parcel.writeString(this.f19833h);
        parcel.writeInt(this.f19834i.intValue());
    }
}
