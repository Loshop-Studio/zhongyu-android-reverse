package com.tencent.bugly.crashreport.biz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.EnvironmentCompat;
import com.tencent.bugly.proguard.C5795ap;
import java.util.Map;

/* loaded from: classes3.dex */
public class UserInfoBean implements Parcelable {
    public static final Parcelable.Creator<UserInfoBean> CREATOR = new Parcelable.Creator<UserInfoBean>() { // from class: com.tencent.bugly.crashreport.biz.UserInfoBean.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UserInfoBean createFromParcel(Parcel parcel) {
            return new UserInfoBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UserInfoBean[] newArray(int i6) {
            return new UserInfoBean[i6];
        }
    };

    /* renamed from: a */
    public long f3734a;

    /* renamed from: b */
    public int f3735b;

    /* renamed from: c */
    public String f3736c;

    /* renamed from: d */
    public String f3737d;

    /* renamed from: e */
    public long f3738e;

    /* renamed from: f */
    public long f3739f;

    /* renamed from: g */
    public long f3740g;

    /* renamed from: h */
    public long f3741h;

    /* renamed from: i */
    public long f3742i;

    /* renamed from: j */
    public String f3743j;

    /* renamed from: k */
    public long f3744k;

    /* renamed from: l */
    public boolean f3745l;

    /* renamed from: m */
    public String f3746m;

    /* renamed from: n */
    public String f3747n;

    /* renamed from: o */
    public int f3748o;

    /* renamed from: p */
    public int f3749p;

    /* renamed from: q */
    public int f3750q;

    /* renamed from: r */
    public Map<String, String> f3751r;

    /* renamed from: s */
    public Map<String, String> f3752s;

    public UserInfoBean() {
        this.f3744k = 0L;
        this.f3745l = false;
        this.f3746m = EnvironmentCompat.MEDIA_UNKNOWN;
        this.f3749p = -1;
        this.f3750q = -1;
        this.f3751r = null;
        this.f3752s = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f3735b);
        parcel.writeString(this.f3736c);
        parcel.writeString(this.f3737d);
        parcel.writeLong(this.f3738e);
        parcel.writeLong(this.f3739f);
        parcel.writeLong(this.f3740g);
        parcel.writeLong(this.f3741h);
        parcel.writeLong(this.f3742i);
        parcel.writeString(this.f3743j);
        parcel.writeLong(this.f3744k);
        parcel.writeByte(this.f3745l ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f3746m);
        parcel.writeInt(this.f3749p);
        parcel.writeInt(this.f3750q);
        C5795ap.m3988b(parcel, this.f3751r);
        C5795ap.m3988b(parcel, this.f3752s);
        parcel.writeString(this.f3747n);
        parcel.writeInt(this.f3748o);
    }

    public UserInfoBean(Parcel parcel) {
        this.f3744k = 0L;
        this.f3745l = false;
        this.f3746m = EnvironmentCompat.MEDIA_UNKNOWN;
        this.f3749p = -1;
        this.f3750q = -1;
        this.f3751r = null;
        this.f3752s = null;
        this.f3735b = parcel.readInt();
        this.f3736c = parcel.readString();
        this.f3737d = parcel.readString();
        this.f3738e = parcel.readLong();
        this.f3739f = parcel.readLong();
        this.f3740g = parcel.readLong();
        this.f3741h = parcel.readLong();
        this.f3742i = parcel.readLong();
        this.f3743j = parcel.readString();
        this.f3744k = parcel.readLong();
        this.f3745l = parcel.readByte() == 1;
        this.f3746m = parcel.readString();
        this.f3749p = parcel.readInt();
        this.f3750q = parcel.readInt();
        this.f3751r = C5795ap.m3986b(parcel);
        this.f3752s = C5795ap.m3986b(parcel);
        this.f3747n = parcel.readString();
        this.f3748o = parcel.readInt();
    }
}
