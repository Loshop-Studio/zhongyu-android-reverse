package com.tencent.bugly.crashreport.biz;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0038g;
import androidx.core.os.EnvironmentCompat;
import com.tencent.bugly.proguard.C4059ap;
import java.util.Map;

/* loaded from: classes3.dex */
public class UserInfoBean implements Parcelable {
    public static final Parcelable.Creator<UserInfoBean> CREATOR = new C0038g(14);

    /* renamed from: a */
    public long f3247a;

    /* renamed from: b */
    public int f3248b;

    /* renamed from: c */
    public String f3249c;

    /* renamed from: d */
    public String f3250d;

    /* renamed from: e */
    public long f3251e;

    /* renamed from: f */
    public long f3252f;

    /* renamed from: g */
    public long f3253g;

    /* renamed from: h */
    public long f3254h;

    /* renamed from: i */
    public long f3255i;

    /* renamed from: j */
    public String f3256j;

    /* renamed from: k */
    public long f3257k;

    /* renamed from: l */
    public boolean f3258l;

    /* renamed from: m */
    public String f3259m;

    /* renamed from: n */
    public String f3260n;

    /* renamed from: o */
    public int f3261o;

    /* renamed from: p */
    public int f3262p;

    /* renamed from: q */
    public int f3263q;

    /* renamed from: r */
    public Map<String, String> f3264r;

    /* renamed from: s */
    public Map<String, String> f3265s;

    public UserInfoBean() {
        this.f3257k = 0L;
        this.f3258l = false;
        this.f3259m = EnvironmentCompat.MEDIA_UNKNOWN;
        this.f3262p = -1;
        this.f3263q = -1;
        this.f3264r = null;
        this.f3265s = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3248b);
        parcel.writeString(this.f3249c);
        parcel.writeString(this.f3250d);
        parcel.writeLong(this.f3251e);
        parcel.writeLong(this.f3252f);
        parcel.writeLong(this.f3253g);
        parcel.writeLong(this.f3254h);
        parcel.writeLong(this.f3255i);
        parcel.writeString(this.f3256j);
        parcel.writeLong(this.f3257k);
        parcel.writeByte(this.f3258l ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f3259m);
        parcel.writeInt(this.f3262p);
        parcel.writeInt(this.f3263q);
        C4059ap.m3081b(parcel, this.f3264r);
        C4059ap.m3081b(parcel, this.f3265s);
        parcel.writeString(this.f3260n);
        parcel.writeInt(this.f3261o);
    }

    public UserInfoBean(Parcel parcel) {
        this.f3257k = 0L;
        this.f3258l = false;
        this.f3259m = EnvironmentCompat.MEDIA_UNKNOWN;
        this.f3262p = -1;
        this.f3263q = -1;
        this.f3264r = null;
        this.f3265s = null;
        this.f3248b = parcel.readInt();
        this.f3249c = parcel.readString();
        this.f3250d = parcel.readString();
        this.f3251e = parcel.readLong();
        this.f3252f = parcel.readLong();
        this.f3253g = parcel.readLong();
        this.f3254h = parcel.readLong();
        this.f3255i = parcel.readLong();
        this.f3256j = parcel.readString();
        this.f3257k = parcel.readLong();
        this.f3258l = parcel.readByte() == 1;
        this.f3259m = parcel.readString();
        this.f3262p = parcel.readInt();
        this.f3263q = parcel.readInt();
        this.f3264r = C4059ap.m3079b(parcel);
        this.f3265s = C4059ap.m3079b(parcel);
        this.f3260n = parcel.readString();
        this.f3261o = parcel.readInt();
    }
}
