package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class UserInfo implements Parcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new C6200a();

    /* renamed from: a */
    public Long f7417a;

    /* renamed from: b */
    public String f7418b;

    /* renamed from: c */
    public String f7419c;

    /* renamed from: d */
    public String f7420d;

    /* renamed from: e */
    public String f7421e;

    /* renamed from: f */
    public String f7422f;

    /* renamed from: g */
    public Integer f7423g;

    /* renamed from: com.zykj.message.server.bean.UserInfo$a */
    public class C6200a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserInfo createFromParcel(Parcel parcel) {
            return new UserInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public UserInfo[] newArray(int i6) {
            return new UserInfo[i6];
        }
    }

    public UserInfo(Long l6, String str, String str2, String str3, String str4, String str5, Integer num) {
        this.f7417a = l6;
        this.f7418b = str;
        this.f7419c = str2;
        this.f7420d = str3;
        this.f7421e = str4;
        this.f7422f = str5;
        this.f7423g = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "UserInfo{id=" + this.f7417a + ", schoolCode='" + this.f7418b + "', userName='" + this.f7419c + "', realName='" + this.f7420d + "', password='" + this.f7421e + "', photo='" + this.f7422f + "', role=" + this.f7423g + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeValue(this.f7417a);
        parcel.writeString(this.f7418b);
        parcel.writeString(this.f7419c);
        parcel.writeString(this.f7420d);
        parcel.writeString(this.f7421e);
        parcel.writeString(this.f7422f);
        parcel.writeInt(this.f7423g.intValue());
    }

    public UserInfo(Parcel parcel) {
        this.f7417a = (Long) parcel.readValue(Long.class.getClassLoader());
        this.f7418b = parcel.readString();
        this.f7419c = parcel.readString();
        this.f7420d = parcel.readString();
        this.f7421e = parcel.readString();
        this.f7422f = parcel.readString();
        this.f7423g = Integer.valueOf(parcel.readInt());
    }
}
