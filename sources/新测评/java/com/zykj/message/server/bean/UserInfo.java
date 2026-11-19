package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class UserInfo implements Parcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new C7003a();

    /* renamed from: a */
    public Long f10688a;

    /* renamed from: b */
    public String f10689b;

    /* renamed from: c */
    public String f10690c;

    /* renamed from: d */
    public String f10691d;

    /* renamed from: e */
    public String f10692e;

    /* renamed from: f */
    public String f10693f;

    /* renamed from: g */
    public Integer f10694g;

    /* renamed from: com.zykj.message.server.bean.UserInfo$a */
    public class C7003a implements Parcelable.Creator {
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

    public UserInfo() {
        this.f10688a = 0L;
        this.f10689b = "";
        this.f10690c = "";
        this.f10691d = "";
        this.f10692e = "";
        this.f10693f = "";
        this.f10694g = 0;
    }

    /* renamed from: a */
    public Long m10602a() {
        return this.f10688a;
    }

    /* renamed from: b */
    public String m10603b() {
        return this.f10693f;
    }

    /* renamed from: c */
    public String m10604c() {
        return this.f10691d;
    }

    /* renamed from: d */
    public String m10605d() {
        return this.f10690c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "UserInfo{id=" + this.f10688a + ", schoolCode='" + this.f10689b + "', userName='" + this.f10690c + "', realName='" + this.f10691d + "', password='" + this.f10692e + "', photo='" + this.f10693f + "', role=" + this.f10694g + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(this.f10688a);
        parcel.writeString(this.f10689b);
        parcel.writeString(this.f10690c);
        parcel.writeString(this.f10691d);
        parcel.writeString(this.f10692e);
        parcel.writeString(this.f10693f);
        parcel.writeInt(this.f10694g.intValue());
    }

    public UserInfo(Parcel parcel) {
        this.f10688a = (Long) parcel.readValue(Long.class.getClassLoader());
        this.f10689b = parcel.readString();
        this.f10690c = parcel.readString();
        this.f10691d = parcel.readString();
        this.f10692e = parcel.readString();
        this.f10693f = parcel.readString();
        this.f10694g = Integer.valueOf(parcel.readInt());
    }
}
