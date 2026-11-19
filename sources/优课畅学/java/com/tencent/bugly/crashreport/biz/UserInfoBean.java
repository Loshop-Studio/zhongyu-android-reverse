package com.tencent.bugly.crashreport.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.proguard.C6440ap;
import java.util.Map;

/* loaded from: classes4.dex */
public class UserInfoBean implements Parcelable {
    public static final Parcelable.Creator<UserInfoBean> CREATOR = new Parcelable.Creator<UserInfoBean>() { // from class: com.tencent.bugly.crashreport.biz.UserInfoBean.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UserInfoBean createFromParcel(Parcel parcel) {
            return new UserInfoBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UserInfoBean[] newArray(int i10) {
            return new UserInfoBean[i10];
        }
    };

    /* renamed from: a */
    public long f4356a;

    /* renamed from: b */
    public int f4357b;

    /* renamed from: c */
    public String f4358c;

    /* renamed from: d */
    public String f4359d;

    /* renamed from: e */
    public long f4360e;

    /* renamed from: f */
    public long f4361f;

    /* renamed from: g */
    public long f4362g;

    /* renamed from: h */
    public long f4363h;

    /* renamed from: i */
    public long f4364i;

    /* renamed from: j */
    public String f4365j;

    /* renamed from: k */
    public long f4366k;

    /* renamed from: l */
    public boolean f4367l;

    /* renamed from: m */
    public String f4368m;

    /* renamed from: n */
    public String f4369n;

    /* renamed from: o */
    public int f4370o;

    /* renamed from: p */
    public int f4371p;

    /* renamed from: q */
    public int f4372q;

    /* renamed from: r */
    public Map<String, String> f4373r;

    /* renamed from: s */
    public Map<String, String> f4374s;

    public UserInfoBean() {
        this.f4366k = 0L;
        this.f4367l = false;
        this.f4368m = "unknown";
        this.f4371p = -1;
        this.f4372q = -1;
        this.f4373r = null;
        this.f4374s = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4357b);
        parcel.writeString(this.f4358c);
        parcel.writeString(this.f4359d);
        parcel.writeLong(this.f4360e);
        parcel.writeLong(this.f4361f);
        parcel.writeLong(this.f4362g);
        parcel.writeLong(this.f4363h);
        parcel.writeLong(this.f4364i);
        parcel.writeString(this.f4365j);
        parcel.writeLong(this.f4366k);
        parcel.writeByte(this.f4367l ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f4368m);
        parcel.writeInt(this.f4371p);
        parcel.writeInt(this.f4372q);
        C6440ap.m4343b(parcel, this.f4373r);
        C6440ap.m4343b(parcel, this.f4374s);
        parcel.writeString(this.f4369n);
        parcel.writeInt(this.f4370o);
    }

    public UserInfoBean(Parcel parcel) {
        this.f4366k = 0L;
        this.f4367l = false;
        this.f4368m = "unknown";
        this.f4371p = -1;
        this.f4372q = -1;
        this.f4373r = null;
        this.f4374s = null;
        this.f4357b = parcel.readInt();
        this.f4358c = parcel.readString();
        this.f4359d = parcel.readString();
        this.f4360e = parcel.readLong();
        this.f4361f = parcel.readLong();
        this.f4362g = parcel.readLong();
        this.f4363h = parcel.readLong();
        this.f4364i = parcel.readLong();
        this.f4365j = parcel.readString();
        this.f4366k = parcel.readLong();
        this.f4367l = parcel.readByte() == 1;
        this.f4368m = parcel.readString();
        this.f4371p = parcel.readInt();
        this.f4372q = parcel.readInt();
        this.f4373r = C6440ap.m4341b(parcel);
        this.f4374s = C6440ap.m4341b(parcel);
        this.f4369n = parcel.readString();
        this.f4370o = parcel.readInt();
    }
}
