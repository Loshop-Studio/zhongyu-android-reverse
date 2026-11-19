package com.tencent.bugly.crashreport.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.proguard.C7783ap;
import java.util.Map;

/* loaded from: classes5.dex */
public class UserInfoBean implements Parcelable {
    public static final Parcelable.Creator<UserInfoBean> CREATOR = new C7757a();

    /* renamed from: a */
    public long f13455a;

    /* renamed from: b */
    public int f13456b;

    /* renamed from: c */
    public String f13457c;

    /* renamed from: d */
    public String f13458d;

    /* renamed from: e */
    public long f13459e;

    /* renamed from: f */
    public long f13460f;

    /* renamed from: g */
    public long f13461g;

    /* renamed from: h */
    public long f13462h;

    /* renamed from: i */
    public long f13463i;

    /* renamed from: j */
    public String f13464j;

    /* renamed from: k */
    public long f13465k;

    /* renamed from: l */
    public boolean f13466l;

    /* renamed from: m */
    public String f13467m;

    /* renamed from: n */
    public String f13468n;

    /* renamed from: o */
    public int f13469o;

    /* renamed from: p */
    public int f13470p;

    /* renamed from: q */
    public int f13471q;

    /* renamed from: r */
    public Map<String, String> f13472r;

    /* renamed from: s */
    public Map<String, String> f13473s;

    /* renamed from: com.tencent.bugly.crashreport.biz.UserInfoBean$a */
    public static class C7757a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new UserInfoBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
            return new UserInfoBean[i10];
        }
    }

    public UserInfoBean() {
        this.f13465k = 0L;
        this.f13466l = false;
        this.f13467m = "unknown";
        this.f13470p = -1;
        this.f13471q = -1;
        this.f13472r = null;
        this.f13473s = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f13456b);
        parcel.writeString(this.f13457c);
        parcel.writeString(this.f13458d);
        parcel.writeLong(this.f13459e);
        parcel.writeLong(this.f13460f);
        parcel.writeLong(this.f13461g);
        parcel.writeLong(this.f13462h);
        parcel.writeLong(this.f13463i);
        parcel.writeString(this.f13464j);
        parcel.writeLong(this.f13465k);
        parcel.writeByte(this.f13466l ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f13467m);
        parcel.writeInt(this.f13470p);
        parcel.writeInt(this.f13471q);
        C7783ap.m10673b(parcel, this.f13472r);
        C7783ap.m10673b(parcel, this.f13473s);
        parcel.writeString(this.f13468n);
        parcel.writeInt(this.f13469o);
    }

    public UserInfoBean(Parcel parcel) {
        this.f13465k = 0L;
        this.f13466l = false;
        this.f13467m = "unknown";
        this.f13470p = -1;
        this.f13471q = -1;
        this.f13472r = null;
        this.f13473s = null;
        this.f13456b = parcel.readInt();
        this.f13457c = parcel.readString();
        this.f13458d = parcel.readString();
        this.f13459e = parcel.readLong();
        this.f13460f = parcel.readLong();
        this.f13461g = parcel.readLong();
        this.f13462h = parcel.readLong();
        this.f13463i = parcel.readLong();
        this.f13464j = parcel.readString();
        this.f13465k = parcel.readLong();
        this.f13466l = parcel.readByte() == 1;
        this.f13467m = parcel.readString();
        this.f13470p = parcel.readInt();
        this.f13471q = parcel.readInt();
        this.f13472r = C7783ap.m10671b(parcel);
        this.f13473s = C7783ap.m10671b(parcel);
        this.f13468n = parcel.readString();
        this.f13469o = parcel.readInt();
    }
}
