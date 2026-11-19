package com.tencent.bugly.crashreport.biz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.EnvironmentCompat;
import com.tencent.bugly.proguard.C6418ap;
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
    public long f5013a;

    /* renamed from: b */
    public int f5014b;

    /* renamed from: c */
    public String f5015c;

    /* renamed from: d */
    public String f5016d;

    /* renamed from: e */
    public long f5017e;

    /* renamed from: f */
    public long f5018f;

    /* renamed from: g */
    public long f5019g;

    /* renamed from: h */
    public long f5020h;

    /* renamed from: i */
    public long f5021i;

    /* renamed from: j */
    public String f5022j;

    /* renamed from: k */
    public long f5023k;

    /* renamed from: l */
    public boolean f5024l;

    /* renamed from: m */
    public String f5025m;

    /* renamed from: n */
    public String f5026n;

    /* renamed from: o */
    public int f5027o;

    /* renamed from: p */
    public int f5028p;

    /* renamed from: q */
    public int f5029q;

    /* renamed from: r */
    public Map<String, String> f5030r;

    /* renamed from: s */
    public Map<String, String> f5031s;

    public UserInfoBean() {
        this.f5023k = 0L;
        this.f5024l = false;
        this.f5025m = EnvironmentCompat.MEDIA_UNKNOWN;
        this.f5028p = -1;
        this.f5029q = -1;
        this.f5030r = null;
        this.f5031s = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f5014b);
        parcel.writeString(this.f5015c);
        parcel.writeString(this.f5016d);
        parcel.writeLong(this.f5017e);
        parcel.writeLong(this.f5018f);
        parcel.writeLong(this.f5019g);
        parcel.writeLong(this.f5020h);
        parcel.writeLong(this.f5021i);
        parcel.writeString(this.f5022j);
        parcel.writeLong(this.f5023k);
        parcel.writeByte(this.f5024l ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f5025m);
        parcel.writeInt(this.f5028p);
        parcel.writeInt(this.f5029q);
        C6418ap.m4983b(parcel, this.f5030r);
        C6418ap.m4983b(parcel, this.f5031s);
        parcel.writeString(this.f5026n);
        parcel.writeInt(this.f5027o);
    }

    public UserInfoBean(Parcel parcel) {
        this.f5023k = 0L;
        this.f5024l = false;
        this.f5025m = EnvironmentCompat.MEDIA_UNKNOWN;
        this.f5028p = -1;
        this.f5029q = -1;
        this.f5030r = null;
        this.f5031s = null;
        this.f5014b = parcel.readInt();
        this.f5015c = parcel.readString();
        this.f5016d = parcel.readString();
        this.f5017e = parcel.readLong();
        this.f5018f = parcel.readLong();
        this.f5019g = parcel.readLong();
        this.f5020h = parcel.readLong();
        this.f5021i = parcel.readLong();
        this.f5022j = parcel.readString();
        this.f5023k = parcel.readLong();
        this.f5024l = parcel.readByte() == 1;
        this.f5025m = parcel.readString();
        this.f5028p = parcel.readInt();
        this.f5029q = parcel.readInt();
        this.f5030r = C6418ap.m4981b(parcel);
        this.f5031s = C6418ap.m4981b(parcel);
        this.f5026n = parcel.readString();
        this.f5027o = parcel.readInt();
    }
}
