package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class UserInfo implements Parcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new C2417a();

    /* renamed from: a */
    private Long f9820a;

    /* renamed from: b */
    private String f9821b;

    /* renamed from: c */
    private String f9822c;

    /* renamed from: d */
    private String f9823d;

    /* renamed from: e */
    private String f9824e;

    /* renamed from: f */
    private String f9825f;

    /* renamed from: g */
    private Integer f9826g;

    /* renamed from: com.zykj.message.server.bean.UserInfo$a */
    class C2417a implements Parcelable.Creator<UserInfo> {
        C2417a() {
        }

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

    public UserInfo() {
        this.f9820a = 0L;
        this.f9821b = "";
        this.f9822c = "";
        this.f9823d = "";
        this.f9824e = "";
        this.f9825f = "";
        this.f9826g = 0;
    }

    /* renamed from: a */
    public String m8017a() {
        return this.f9823d;
    }

    /* renamed from: b */
    public String m8018b() {
        return this.f9821b;
    }

    /* renamed from: c */
    public String m8019c() {
        return this.f9822c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "UserInfo{id=" + this.f9820a + ", schoolCode='" + this.f9821b + "', userName='" + this.f9822c + "', realName='" + this.f9823d + "', password='" + this.f9824e + "', photo='" + this.f9825f + "', role=" + this.f9826g + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeValue(this.f9820a);
        parcel.writeString(this.f9821b);
        parcel.writeString(this.f9822c);
        parcel.writeString(this.f9823d);
        parcel.writeString(this.f9824e);
        parcel.writeString(this.f9825f);
        parcel.writeInt(this.f9826g.intValue());
    }

    protected UserInfo(Parcel parcel) {
        this.f9820a = (Long) parcel.readValue(Long.class.getClassLoader());
        this.f9821b = parcel.readString();
        this.f9822c = parcel.readString();
        this.f9823d = parcel.readString();
        this.f9824e = parcel.readString();
        this.f9825f = parcel.readString();
        this.f9826g = Integer.valueOf(parcel.readInt());
    }
}
