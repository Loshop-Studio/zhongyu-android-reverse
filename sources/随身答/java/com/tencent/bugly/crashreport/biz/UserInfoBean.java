package com.tencent.bugly.crashreport.biz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.EnvironmentCompat;
import com.tencent.bugly.proguard.C6678ap;
import java.util.Map;

/* loaded from: classes4.dex */
public class UserInfoBean implements Parcelable {
    public static final Parcelable.Creator<UserInfoBean> CREATOR = new Parcelable.Creator<UserInfoBean>() { // from class: com.tencent.bugly.crashreport.biz.UserInfoBean.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UserInfoBean createFromParcel(Parcel parcel) {
            return new UserInfoBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UserInfoBean[] newArray(int i9) {
            return new UserInfoBean[i9];
        }
    };

    /* renamed from: a */
    public long f5590a;

    /* renamed from: b */
    public int f5591b;

    /* renamed from: c */
    public String f5592c;

    /* renamed from: d */
    public String f5593d;

    /* renamed from: e */
    public long f5594e;

    /* renamed from: f */
    public long f5595f;

    /* renamed from: g */
    public long f5596g;

    /* renamed from: h */
    public long f5597h;

    /* renamed from: i */
    public long f5598i;

    /* renamed from: j */
    public String f5599j;

    /* renamed from: k */
    public long f5600k;

    /* renamed from: l */
    public boolean f5601l;

    /* renamed from: m */
    public String f5602m;

    /* renamed from: n */
    public String f5603n;

    /* renamed from: o */
    public int f5604o;

    /* renamed from: p */
    public int f5605p;

    /* renamed from: q */
    public int f5606q;

    /* renamed from: r */
    public Map<String, String> f5607r;

    /* renamed from: s */
    public Map<String, String> f5608s;

    public UserInfoBean() {
        this.f5600k = 0L;
        this.f5601l = false;
        this.f5602m = EnvironmentCompat.MEDIA_UNKNOWN;
        this.f5605p = -1;
        this.f5606q = -1;
        this.f5607r = null;
        this.f5608s = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f5591b);
        parcel.writeString(this.f5592c);
        parcel.writeString(this.f5593d);
        parcel.writeLong(this.f5594e);
        parcel.writeLong(this.f5595f);
        parcel.writeLong(this.f5596g);
        parcel.writeLong(this.f5597h);
        parcel.writeLong(this.f5598i);
        parcel.writeString(this.f5599j);
        parcel.writeLong(this.f5600k);
        parcel.writeByte(this.f5601l ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f5602m);
        parcel.writeInt(this.f5605p);
        parcel.writeInt(this.f5606q);
        C6678ap.m5162b(parcel, this.f5607r);
        C6678ap.m5162b(parcel, this.f5608s);
        parcel.writeString(this.f5603n);
        parcel.writeInt(this.f5604o);
    }

    public UserInfoBean(Parcel parcel) {
        this.f5600k = 0L;
        this.f5601l = false;
        this.f5602m = EnvironmentCompat.MEDIA_UNKNOWN;
        this.f5605p = -1;
        this.f5606q = -1;
        this.f5607r = null;
        this.f5608s = null;
        this.f5591b = parcel.readInt();
        this.f5592c = parcel.readString();
        this.f5593d = parcel.readString();
        this.f5594e = parcel.readLong();
        this.f5595f = parcel.readLong();
        this.f5596g = parcel.readLong();
        this.f5597h = parcel.readLong();
        this.f5598i = parcel.readLong();
        this.f5599j = parcel.readString();
        this.f5600k = parcel.readLong();
        this.f5601l = parcel.readByte() == 1;
        this.f5602m = parcel.readString();
        this.f5605p = parcel.readInt();
        this.f5606q = parcel.readInt();
        this.f5607r = C6678ap.m5160b(parcel);
        this.f5608s = C6678ap.m5160b(parcel);
        this.f5603n = parcel.readString();
        this.f5604o = parcel.readInt();
    }
}
