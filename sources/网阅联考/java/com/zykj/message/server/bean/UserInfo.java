package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class UserInfo implements Parcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new C3687a();

    /* renamed from: a */
    public Long f4281a;

    /* renamed from: b */
    public String f4282b;

    /* renamed from: c */
    public String f4283c;

    /* renamed from: d */
    public String f4284d;

    /* renamed from: e */
    public String f4285e;

    /* renamed from: f */
    public String f4286f;

    /* renamed from: g */
    public Integer f4287g;

    /* renamed from: com.zykj.message.server.bean.UserInfo$a */
    public class C3687a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserInfo createFromParcel(Parcel parcel) {
            return new UserInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public UserInfo[] newArray(int i4) {
            return new UserInfo[i4];
        }
    }

    public UserInfo(Parcel parcel) {
        this.f4281a = (Long) parcel.readValue(Long.class.getClassLoader());
        this.f4282b = parcel.readString();
        this.f4283c = parcel.readString();
        this.f4284d = parcel.readString();
        this.f4285e = parcel.readString();
        this.f4286f = parcel.readString();
        this.f4287g = Integer.valueOf(parcel.readInt());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "UserInfo{id=" + this.f4281a + ", schoolCode='" + this.f4282b + "', userName='" + this.f4283c + "', realName='" + this.f4284d + "', password='" + this.f4285e + "', photo='" + this.f4286f + "', role=" + this.f4287g + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeValue(this.f4281a);
        parcel.writeString(this.f4282b);
        parcel.writeString(this.f4283c);
        parcel.writeString(this.f4284d);
        parcel.writeString(this.f4285e);
        parcel.writeString(this.f4286f);
        parcel.writeInt(this.f4287g.intValue());
    }
}
