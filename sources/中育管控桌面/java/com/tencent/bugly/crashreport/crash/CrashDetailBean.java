package com.tencent.bugly.crashreport.crash;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.proguard.C5795ap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public class CrashDetailBean implements Parcelable, Comparable<CrashDetailBean> {
    public static final Parcelable.Creator<CrashDetailBean> CREATOR = new Parcelable.Creator<CrashDetailBean>() { // from class: com.tencent.bugly.crashreport.crash.CrashDetailBean.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CrashDetailBean createFromParcel(Parcel parcel) {
            return new CrashDetailBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CrashDetailBean[] newArray(int i6) {
            return new CrashDetailBean[i6];
        }
    };

    /* renamed from: A */
    public String f3779A;

    /* renamed from: B */
    public String f3780B;

    /* renamed from: C */
    public long f3781C;

    /* renamed from: D */
    public long f3782D;

    /* renamed from: E */
    public long f3783E;

    /* renamed from: F */
    public long f3784F;

    /* renamed from: G */
    public long f3785G;

    /* renamed from: H */
    public long f3786H;

    /* renamed from: I */
    public long f3787I;

    /* renamed from: J */
    public long f3788J;

    /* renamed from: K */
    public long f3789K;

    /* renamed from: L */
    public String f3790L;

    /* renamed from: M */
    public String f3791M;

    /* renamed from: N */
    public String f3792N;

    /* renamed from: O */
    public String f3793O;

    /* renamed from: P */
    public String f3794P;

    /* renamed from: Q */
    public long f3795Q;

    /* renamed from: R */
    public boolean f3796R;

    /* renamed from: S */
    public Map<String, String> f3797S;

    /* renamed from: T */
    public Map<String, String> f3798T;

    /* renamed from: U */
    public int f3799U;

    /* renamed from: V */
    public int f3800V;

    /* renamed from: W */
    public Map<String, String> f3801W;

    /* renamed from: X */
    public Map<String, String> f3802X;

    /* renamed from: Y */
    public byte[] f3803Y;

    /* renamed from: Z */
    public String f3804Z;

    /* renamed from: a */
    public long f3805a;

    /* renamed from: aa */
    public String f3806aa;

    /* renamed from: b */
    public int f3807b;

    /* renamed from: c */
    public String f3808c;

    /* renamed from: d */
    public boolean f3809d;

    /* renamed from: e */
    public String f3810e;

    /* renamed from: f */
    public String f3811f;

    /* renamed from: g */
    public String f3812g;

    /* renamed from: h */
    public Map<String, PlugInBean> f3813h;

    /* renamed from: i */
    public Map<String, PlugInBean> f3814i;

    /* renamed from: j */
    public boolean f3815j;

    /* renamed from: k */
    public boolean f3816k;

    /* renamed from: l */
    public int f3817l;

    /* renamed from: m */
    public String f3818m;

    /* renamed from: n */
    public String f3819n;

    /* renamed from: o */
    public String f3820o;

    /* renamed from: p */
    public String f3821p;

    /* renamed from: q */
    public String f3822q;

    /* renamed from: r */
    public long f3823r;

    /* renamed from: s */
    public String f3824s;

    /* renamed from: t */
    public int f3825t;

    /* renamed from: u */
    public String f3826u;

    /* renamed from: v */
    public String f3827v;

    /* renamed from: w */
    public String f3828w;

    /* renamed from: x */
    public String f3829x;

    /* renamed from: y */
    public byte[] f3830y;

    /* renamed from: z */
    public Map<String, String> f3831z;

    public CrashDetailBean() {
        this.f3805a = -1L;
        this.f3807b = 0;
        this.f3808c = UUID.randomUUID().toString();
        this.f3809d = false;
        this.f3810e = "";
        this.f3811f = "";
        this.f3812g = "";
        this.f3813h = null;
        this.f3814i = null;
        this.f3815j = false;
        this.f3816k = false;
        this.f3817l = 0;
        this.f3818m = "";
        this.f3819n = "";
        this.f3820o = "";
        this.f3821p = "";
        this.f3822q = "";
        this.f3823r = -1L;
        this.f3824s = null;
        this.f3825t = 0;
        this.f3826u = "";
        this.f3827v = "";
        this.f3828w = null;
        this.f3829x = null;
        this.f3830y = null;
        this.f3831z = null;
        this.f3779A = "";
        this.f3780B = "";
        this.f3781C = -1L;
        this.f3782D = -1L;
        this.f3783E = -1L;
        this.f3784F = -1L;
        this.f3785G = -1L;
        this.f3786H = -1L;
        this.f3787I = -1L;
        this.f3788J = -1L;
        this.f3789K = -1L;
        this.f3790L = "";
        this.f3791M = "";
        this.f3792N = "";
        this.f3793O = "";
        this.f3794P = "";
        this.f3795Q = -1L;
        this.f3796R = false;
        this.f3797S = null;
        this.f3798T = null;
        this.f3799U = -1;
        this.f3800V = -1;
        this.f3801W = null;
        this.f3802X = null;
        this.f3803Y = null;
        this.f3804Z = null;
        this.f3806aa = null;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(CrashDetailBean crashDetailBean) {
        CrashDetailBean crashDetailBean2 = crashDetailBean;
        if (crashDetailBean2 == null) {
            return 1;
        }
        long j6 = this.f3823r - crashDetailBean2.f3823r;
        if (j6 <= 0) {
            return j6 < 0 ? -1 : 0;
        }
        return 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f3807b);
        parcel.writeString(this.f3808c);
        parcel.writeByte(this.f3809d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f3810e);
        parcel.writeString(this.f3811f);
        parcel.writeString(this.f3812g);
        parcel.writeByte(this.f3815j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3816k ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f3817l);
        parcel.writeString(this.f3818m);
        parcel.writeString(this.f3819n);
        parcel.writeString(this.f3820o);
        parcel.writeString(this.f3821p);
        parcel.writeString(this.f3822q);
        parcel.writeLong(this.f3823r);
        parcel.writeString(this.f3824s);
        parcel.writeInt(this.f3825t);
        parcel.writeString(this.f3826u);
        parcel.writeString(this.f3827v);
        parcel.writeString(this.f3828w);
        C5795ap.m3988b(parcel, this.f3831z);
        parcel.writeString(this.f3779A);
        parcel.writeString(this.f3780B);
        parcel.writeLong(this.f3781C);
        parcel.writeLong(this.f3782D);
        parcel.writeLong(this.f3783E);
        parcel.writeLong(this.f3784F);
        parcel.writeLong(this.f3785G);
        parcel.writeLong(this.f3786H);
        parcel.writeString(this.f3790L);
        parcel.writeString(this.f3791M);
        parcel.writeString(this.f3792N);
        parcel.writeString(this.f3793O);
        parcel.writeString(this.f3794P);
        parcel.writeLong(this.f3795Q);
        parcel.writeByte(this.f3796R ? (byte) 1 : (byte) 0);
        C5795ap.m3988b(parcel, this.f3797S);
        C5795ap.m3975a(parcel, this.f3813h);
        C5795ap.m3975a(parcel, this.f3814i);
        parcel.writeInt(this.f3799U);
        parcel.writeInt(this.f3800V);
        C5795ap.m3988b(parcel, this.f3801W);
        C5795ap.m3988b(parcel, this.f3802X);
        parcel.writeByteArray(this.f3803Y);
        parcel.writeByteArray(this.f3830y);
        parcel.writeString(this.f3804Z);
        parcel.writeString(this.f3806aa);
        parcel.writeString(this.f3829x);
        parcel.writeLong(this.f3787I);
        parcel.writeLong(this.f3788J);
        parcel.writeLong(this.f3789K);
    }

    public CrashDetailBean(Parcel parcel) {
        this.f3805a = -1L;
        this.f3807b = 0;
        this.f3808c = UUID.randomUUID().toString();
        this.f3809d = false;
        this.f3810e = "";
        this.f3811f = "";
        this.f3812g = "";
        this.f3813h = null;
        this.f3814i = null;
        this.f3815j = false;
        this.f3816k = false;
        this.f3817l = 0;
        this.f3818m = "";
        this.f3819n = "";
        this.f3820o = "";
        this.f3821p = "";
        this.f3822q = "";
        this.f3823r = -1L;
        this.f3824s = null;
        this.f3825t = 0;
        this.f3826u = "";
        this.f3827v = "";
        this.f3828w = null;
        this.f3829x = null;
        this.f3830y = null;
        this.f3831z = null;
        this.f3779A = "";
        this.f3780B = "";
        this.f3781C = -1L;
        this.f3782D = -1L;
        this.f3783E = -1L;
        this.f3784F = -1L;
        this.f3785G = -1L;
        this.f3786H = -1L;
        this.f3787I = -1L;
        this.f3788J = -1L;
        this.f3789K = -1L;
        this.f3790L = "";
        this.f3791M = "";
        this.f3792N = "";
        this.f3793O = "";
        this.f3794P = "";
        this.f3795Q = -1L;
        this.f3796R = false;
        this.f3797S = null;
        this.f3798T = null;
        this.f3799U = -1;
        this.f3800V = -1;
        this.f3801W = null;
        this.f3802X = null;
        this.f3803Y = null;
        this.f3804Z = null;
        this.f3806aa = null;
        this.f3807b = parcel.readInt();
        this.f3808c = parcel.readString();
        this.f3809d = parcel.readByte() == 1;
        this.f3810e = parcel.readString();
        this.f3811f = parcel.readString();
        this.f3812g = parcel.readString();
        this.f3815j = parcel.readByte() == 1;
        this.f3816k = parcel.readByte() == 1;
        this.f3817l = parcel.readInt();
        this.f3818m = parcel.readString();
        this.f3819n = parcel.readString();
        this.f3820o = parcel.readString();
        this.f3821p = parcel.readString();
        this.f3822q = parcel.readString();
        this.f3823r = parcel.readLong();
        this.f3824s = parcel.readString();
        this.f3825t = parcel.readInt();
        this.f3826u = parcel.readString();
        this.f3827v = parcel.readString();
        this.f3828w = parcel.readString();
        this.f3831z = C5795ap.m3986b(parcel);
        this.f3779A = parcel.readString();
        this.f3780B = parcel.readString();
        this.f3781C = parcel.readLong();
        this.f3782D = parcel.readLong();
        this.f3783E = parcel.readLong();
        this.f3784F = parcel.readLong();
        this.f3785G = parcel.readLong();
        this.f3786H = parcel.readLong();
        this.f3790L = parcel.readString();
        this.f3791M = parcel.readString();
        this.f3792N = parcel.readString();
        this.f3793O = parcel.readString();
        this.f3794P = parcel.readString();
        this.f3795Q = parcel.readLong();
        this.f3796R = parcel.readByte() == 1;
        this.f3797S = C5795ap.m3986b(parcel);
        this.f3813h = C5795ap.m3973a(parcel);
        this.f3814i = C5795ap.m3973a(parcel);
        this.f3799U = parcel.readInt();
        this.f3800V = parcel.readInt();
        this.f3801W = C5795ap.m3986b(parcel);
        this.f3802X = C5795ap.m3986b(parcel);
        this.f3803Y = parcel.createByteArray();
        this.f3830y = parcel.createByteArray();
        this.f3804Z = parcel.readString();
        this.f3806aa = parcel.readString();
        this.f3829x = parcel.readString();
        this.f3787I = parcel.readLong();
        this.f3788J = parcel.readLong();
        this.f3789K = parcel.readLong();
    }
}
