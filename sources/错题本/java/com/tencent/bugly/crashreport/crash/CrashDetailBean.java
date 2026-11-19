package com.tencent.bugly.crashreport.crash;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0038g;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.proguard.C4059ap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public class CrashDetailBean implements Parcelable, Comparable<CrashDetailBean> {
    public static final Parcelable.Creator<CrashDetailBean> CREATOR = new C0038g(17);

    /* renamed from: A */
    public String f3292A;

    /* renamed from: B */
    public String f3293B;

    /* renamed from: C */
    public long f3294C;

    /* renamed from: D */
    public long f3295D;

    /* renamed from: E */
    public long f3296E;

    /* renamed from: F */
    public long f3297F;

    /* renamed from: G */
    public long f3298G;

    /* renamed from: H */
    public long f3299H;

    /* renamed from: I */
    public long f3300I;

    /* renamed from: J */
    public long f3301J;

    /* renamed from: K */
    public long f3302K;

    /* renamed from: L */
    public String f3303L;

    /* renamed from: M */
    public String f3304M;

    /* renamed from: N */
    public String f3305N;

    /* renamed from: O */
    public String f3306O;

    /* renamed from: P */
    public String f3307P;

    /* renamed from: Q */
    public long f3308Q;

    /* renamed from: R */
    public boolean f3309R;

    /* renamed from: S */
    public Map<String, String> f3310S;

    /* renamed from: T */
    public Map<String, String> f3311T;

    /* renamed from: U */
    public int f3312U;

    /* renamed from: V */
    public int f3313V;

    /* renamed from: W */
    public Map<String, String> f3314W;

    /* renamed from: X */
    public Map<String, String> f3315X;

    /* renamed from: Y */
    public byte[] f3316Y;

    /* renamed from: Z */
    public String f3317Z;

    /* renamed from: a */
    public long f3318a;

    /* renamed from: aa */
    public String f3319aa;

    /* renamed from: b */
    public int f3320b;

    /* renamed from: c */
    public String f3321c;

    /* renamed from: d */
    public boolean f3322d;

    /* renamed from: e */
    public String f3323e;

    /* renamed from: f */
    public String f3324f;

    /* renamed from: g */
    public String f3325g;

    /* renamed from: h */
    public Map<String, PlugInBean> f3326h;

    /* renamed from: i */
    public Map<String, PlugInBean> f3327i;

    /* renamed from: j */
    public boolean f3328j;

    /* renamed from: k */
    public boolean f3329k;

    /* renamed from: l */
    public int f3330l;

    /* renamed from: m */
    public String f3331m;

    /* renamed from: n */
    public String f3332n;

    /* renamed from: o */
    public String f3333o;

    /* renamed from: p */
    public String f3334p;

    /* renamed from: q */
    public String f3335q;

    /* renamed from: r */
    public long f3336r;

    /* renamed from: s */
    public String f3337s;

    /* renamed from: t */
    public int f3338t;

    /* renamed from: u */
    public String f3339u;

    /* renamed from: v */
    public String f3340v;

    /* renamed from: w */
    public String f3341w;

    /* renamed from: x */
    public String f3342x;

    /* renamed from: y */
    public byte[] f3343y;

    /* renamed from: z */
    public Map<String, String> f3344z;

    public CrashDetailBean() {
        this.f3318a = -1L;
        this.f3320b = 0;
        this.f3321c = UUID.randomUUID().toString();
        this.f3322d = false;
        this.f3323e = "";
        this.f3324f = "";
        this.f3325g = "";
        this.f3326h = null;
        this.f3327i = null;
        this.f3328j = false;
        this.f3329k = false;
        this.f3330l = 0;
        this.f3331m = "";
        this.f3332n = "";
        this.f3333o = "";
        this.f3334p = "";
        this.f3335q = "";
        this.f3336r = -1L;
        this.f3337s = null;
        this.f3338t = 0;
        this.f3339u = "";
        this.f3340v = "";
        this.f3341w = null;
        this.f3342x = null;
        this.f3343y = null;
        this.f3344z = null;
        this.f3292A = "";
        this.f3293B = "";
        this.f3294C = -1L;
        this.f3295D = -1L;
        this.f3296E = -1L;
        this.f3297F = -1L;
        this.f3298G = -1L;
        this.f3299H = -1L;
        this.f3300I = -1L;
        this.f3301J = -1L;
        this.f3302K = -1L;
        this.f3303L = "";
        this.f3304M = "";
        this.f3305N = "";
        this.f3306O = "";
        this.f3307P = "";
        this.f3308Q = -1L;
        this.f3309R = false;
        this.f3310S = null;
        this.f3311T = null;
        this.f3312U = -1;
        this.f3313V = -1;
        this.f3314W = null;
        this.f3315X = null;
        this.f3316Y = null;
        this.f3317Z = null;
        this.f3319aa = null;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(CrashDetailBean crashDetailBean) {
        CrashDetailBean crashDetailBean2 = crashDetailBean;
        if (crashDetailBean2 == null) {
            return 1;
        }
        long j7 = this.f3336r - crashDetailBean2.f3336r;
        if (j7 <= 0) {
            return j7 < 0 ? -1 : 0;
        }
        return 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3320b);
        parcel.writeString(this.f3321c);
        parcel.writeByte(this.f3322d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f3323e);
        parcel.writeString(this.f3324f);
        parcel.writeString(this.f3325g);
        parcel.writeByte(this.f3328j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3329k ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f3330l);
        parcel.writeString(this.f3331m);
        parcel.writeString(this.f3332n);
        parcel.writeString(this.f3333o);
        parcel.writeString(this.f3334p);
        parcel.writeString(this.f3335q);
        parcel.writeLong(this.f3336r);
        parcel.writeString(this.f3337s);
        parcel.writeInt(this.f3338t);
        parcel.writeString(this.f3339u);
        parcel.writeString(this.f3340v);
        parcel.writeString(this.f3341w);
        C4059ap.m3081b(parcel, this.f3344z);
        parcel.writeString(this.f3292A);
        parcel.writeString(this.f3293B);
        parcel.writeLong(this.f3294C);
        parcel.writeLong(this.f3295D);
        parcel.writeLong(this.f3296E);
        parcel.writeLong(this.f3297F);
        parcel.writeLong(this.f3298G);
        parcel.writeLong(this.f3299H);
        parcel.writeString(this.f3303L);
        parcel.writeString(this.f3304M);
        parcel.writeString(this.f3305N);
        parcel.writeString(this.f3306O);
        parcel.writeString(this.f3307P);
        parcel.writeLong(this.f3308Q);
        parcel.writeByte(this.f3309R ? (byte) 1 : (byte) 0);
        C4059ap.m3081b(parcel, this.f3310S);
        C4059ap.m3068a(parcel, this.f3326h);
        C4059ap.m3068a(parcel, this.f3327i);
        parcel.writeInt(this.f3312U);
        parcel.writeInt(this.f3313V);
        C4059ap.m3081b(parcel, this.f3314W);
        C4059ap.m3081b(parcel, this.f3315X);
        parcel.writeByteArray(this.f3316Y);
        parcel.writeByteArray(this.f3343y);
        parcel.writeString(this.f3317Z);
        parcel.writeString(this.f3319aa);
        parcel.writeString(this.f3342x);
        parcel.writeLong(this.f3300I);
        parcel.writeLong(this.f3301J);
        parcel.writeLong(this.f3302K);
    }

    public CrashDetailBean(Parcel parcel) {
        this.f3318a = -1L;
        this.f3320b = 0;
        this.f3321c = UUID.randomUUID().toString();
        this.f3322d = false;
        this.f3323e = "";
        this.f3324f = "";
        this.f3325g = "";
        this.f3326h = null;
        this.f3327i = null;
        this.f3328j = false;
        this.f3329k = false;
        this.f3330l = 0;
        this.f3331m = "";
        this.f3332n = "";
        this.f3333o = "";
        this.f3334p = "";
        this.f3335q = "";
        this.f3336r = -1L;
        this.f3337s = null;
        this.f3338t = 0;
        this.f3339u = "";
        this.f3340v = "";
        this.f3341w = null;
        this.f3342x = null;
        this.f3343y = null;
        this.f3344z = null;
        this.f3292A = "";
        this.f3293B = "";
        this.f3294C = -1L;
        this.f3295D = -1L;
        this.f3296E = -1L;
        this.f3297F = -1L;
        this.f3298G = -1L;
        this.f3299H = -1L;
        this.f3300I = -1L;
        this.f3301J = -1L;
        this.f3302K = -1L;
        this.f3303L = "";
        this.f3304M = "";
        this.f3305N = "";
        this.f3306O = "";
        this.f3307P = "";
        this.f3308Q = -1L;
        this.f3309R = false;
        this.f3310S = null;
        this.f3311T = null;
        this.f3312U = -1;
        this.f3313V = -1;
        this.f3314W = null;
        this.f3315X = null;
        this.f3316Y = null;
        this.f3317Z = null;
        this.f3319aa = null;
        this.f3320b = parcel.readInt();
        this.f3321c = parcel.readString();
        this.f3322d = parcel.readByte() == 1;
        this.f3323e = parcel.readString();
        this.f3324f = parcel.readString();
        this.f3325g = parcel.readString();
        this.f3328j = parcel.readByte() == 1;
        this.f3329k = parcel.readByte() == 1;
        this.f3330l = parcel.readInt();
        this.f3331m = parcel.readString();
        this.f3332n = parcel.readString();
        this.f3333o = parcel.readString();
        this.f3334p = parcel.readString();
        this.f3335q = parcel.readString();
        this.f3336r = parcel.readLong();
        this.f3337s = parcel.readString();
        this.f3338t = parcel.readInt();
        this.f3339u = parcel.readString();
        this.f3340v = parcel.readString();
        this.f3341w = parcel.readString();
        this.f3344z = C4059ap.m3079b(parcel);
        this.f3292A = parcel.readString();
        this.f3293B = parcel.readString();
        this.f3294C = parcel.readLong();
        this.f3295D = parcel.readLong();
        this.f3296E = parcel.readLong();
        this.f3297F = parcel.readLong();
        this.f3298G = parcel.readLong();
        this.f3299H = parcel.readLong();
        this.f3303L = parcel.readString();
        this.f3304M = parcel.readString();
        this.f3305N = parcel.readString();
        this.f3306O = parcel.readString();
        this.f3307P = parcel.readString();
        this.f3308Q = parcel.readLong();
        this.f3309R = parcel.readByte() == 1;
        this.f3310S = C4059ap.m3079b(parcel);
        this.f3326h = C4059ap.m3066a(parcel);
        this.f3327i = C4059ap.m3066a(parcel);
        this.f3312U = parcel.readInt();
        this.f3313V = parcel.readInt();
        this.f3314W = C4059ap.m3079b(parcel);
        this.f3315X = C4059ap.m3079b(parcel);
        this.f3316Y = parcel.createByteArray();
        this.f3343y = parcel.createByteArray();
        this.f3317Z = parcel.readString();
        this.f3319aa = parcel.readString();
        this.f3342x = parcel.readString();
        this.f3300I = parcel.readLong();
        this.f3301J = parcel.readLong();
        this.f3302K = parcel.readLong();
    }
}
