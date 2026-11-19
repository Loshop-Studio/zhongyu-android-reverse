package com.tencent.bugly.crashreport.crash;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.proguard.C6440ap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes4.dex */
public class CrashDetailBean implements Parcelable, Comparable<CrashDetailBean> {
    public static final Parcelable.Creator<CrashDetailBean> CREATOR = new Parcelable.Creator<CrashDetailBean>() { // from class: com.tencent.bugly.crashreport.crash.CrashDetailBean.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CrashDetailBean createFromParcel(Parcel parcel) {
            return new CrashDetailBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CrashDetailBean[] newArray(int i10) {
            return new CrashDetailBean[i10];
        }
    };

    /* renamed from: A */
    public String f4401A;

    /* renamed from: B */
    public String f4402B;

    /* renamed from: C */
    public long f4403C;

    /* renamed from: D */
    public long f4404D;

    /* renamed from: E */
    public long f4405E;

    /* renamed from: F */
    public long f4406F;

    /* renamed from: G */
    public long f4407G;

    /* renamed from: H */
    public long f4408H;

    /* renamed from: I */
    public long f4409I;

    /* renamed from: J */
    public long f4410J;

    /* renamed from: K */
    public long f4411K;

    /* renamed from: L */
    public String f4412L;

    /* renamed from: M */
    public String f4413M;

    /* renamed from: N */
    public String f4414N;

    /* renamed from: O */
    public String f4415O;

    /* renamed from: P */
    public String f4416P;

    /* renamed from: Q */
    public long f4417Q;

    /* renamed from: R */
    public boolean f4418R;

    /* renamed from: S */
    public Map<String, String> f4419S;

    /* renamed from: T */
    public Map<String, String> f4420T;

    /* renamed from: U */
    public int f4421U;

    /* renamed from: V */
    public int f4422V;

    /* renamed from: W */
    public Map<String, String> f4423W;

    /* renamed from: X */
    public Map<String, String> f4424X;

    /* renamed from: Y */
    public byte[] f4425Y;

    /* renamed from: Z */
    public String f4426Z;

    /* renamed from: a */
    public long f4427a;

    /* renamed from: aa */
    public String f4428aa;

    /* renamed from: b */
    public int f4429b;

    /* renamed from: c */
    public String f4430c;

    /* renamed from: d */
    public boolean f4431d;

    /* renamed from: e */
    public String f4432e;

    /* renamed from: f */
    public String f4433f;

    /* renamed from: g */
    public String f4434g;

    /* renamed from: h */
    public Map<String, PlugInBean> f4435h;

    /* renamed from: i */
    public Map<String, PlugInBean> f4436i;

    /* renamed from: j */
    public boolean f4437j;

    /* renamed from: k */
    public boolean f4438k;

    /* renamed from: l */
    public int f4439l;

    /* renamed from: m */
    public String f4440m;

    /* renamed from: n */
    public String f4441n;

    /* renamed from: o */
    public String f4442o;

    /* renamed from: p */
    public String f4443p;

    /* renamed from: q */
    public String f4444q;

    /* renamed from: r */
    public long f4445r;

    /* renamed from: s */
    public String f4446s;

    /* renamed from: t */
    public int f4447t;

    /* renamed from: u */
    public String f4448u;

    /* renamed from: v */
    public String f4449v;

    /* renamed from: w */
    public String f4450w;

    /* renamed from: x */
    public String f4451x;

    /* renamed from: y */
    public byte[] f4452y;

    /* renamed from: z */
    public Map<String, String> f4453z;

    public CrashDetailBean() {
        this.f4427a = -1L;
        this.f4429b = 0;
        this.f4430c = UUID.randomUUID().toString();
        this.f4431d = false;
        this.f4432e = "";
        this.f4433f = "";
        this.f4434g = "";
        this.f4435h = null;
        this.f4436i = null;
        this.f4437j = false;
        this.f4438k = false;
        this.f4439l = 0;
        this.f4440m = "";
        this.f4441n = "";
        this.f4442o = "";
        this.f4443p = "";
        this.f4444q = "";
        this.f4445r = -1L;
        this.f4446s = null;
        this.f4447t = 0;
        this.f4448u = "";
        this.f4449v = "";
        this.f4450w = null;
        this.f4451x = null;
        this.f4452y = null;
        this.f4453z = null;
        this.f4401A = "";
        this.f4402B = "";
        this.f4403C = -1L;
        this.f4404D = -1L;
        this.f4405E = -1L;
        this.f4406F = -1L;
        this.f4407G = -1L;
        this.f4408H = -1L;
        this.f4409I = -1L;
        this.f4410J = -1L;
        this.f4411K = -1L;
        this.f4412L = "";
        this.f4413M = "";
        this.f4414N = "";
        this.f4415O = "";
        this.f4416P = "";
        this.f4417Q = -1L;
        this.f4418R = false;
        this.f4419S = null;
        this.f4420T = null;
        this.f4421U = -1;
        this.f4422V = -1;
        this.f4423W = null;
        this.f4424X = null;
        this.f4425Y = null;
        this.f4426Z = null;
        this.f4428aa = null;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(CrashDetailBean crashDetailBean) {
        CrashDetailBean crashDetailBean2 = crashDetailBean;
        if (crashDetailBean2 == null) {
            return 1;
        }
        long j10 = this.f4445r - crashDetailBean2.f4445r;
        if (j10 <= 0) {
            return j10 < 0 ? -1 : 0;
        }
        return 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4429b);
        parcel.writeString(this.f4430c);
        parcel.writeByte(this.f4431d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f4432e);
        parcel.writeString(this.f4433f);
        parcel.writeString(this.f4434g);
        parcel.writeByte(this.f4437j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4438k ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f4439l);
        parcel.writeString(this.f4440m);
        parcel.writeString(this.f4441n);
        parcel.writeString(this.f4442o);
        parcel.writeString(this.f4443p);
        parcel.writeString(this.f4444q);
        parcel.writeLong(this.f4445r);
        parcel.writeString(this.f4446s);
        parcel.writeInt(this.f4447t);
        parcel.writeString(this.f4448u);
        parcel.writeString(this.f4449v);
        parcel.writeString(this.f4450w);
        C6440ap.m4343b(parcel, this.f4453z);
        parcel.writeString(this.f4401A);
        parcel.writeString(this.f4402B);
        parcel.writeLong(this.f4403C);
        parcel.writeLong(this.f4404D);
        parcel.writeLong(this.f4405E);
        parcel.writeLong(this.f4406F);
        parcel.writeLong(this.f4407G);
        parcel.writeLong(this.f4408H);
        parcel.writeString(this.f4412L);
        parcel.writeString(this.f4413M);
        parcel.writeString(this.f4414N);
        parcel.writeString(this.f4415O);
        parcel.writeString(this.f4416P);
        parcel.writeLong(this.f4417Q);
        parcel.writeByte(this.f4418R ? (byte) 1 : (byte) 0);
        C6440ap.m4343b(parcel, this.f4419S);
        C6440ap.m4330a(parcel, this.f4435h);
        C6440ap.m4330a(parcel, this.f4436i);
        parcel.writeInt(this.f4421U);
        parcel.writeInt(this.f4422V);
        C6440ap.m4343b(parcel, this.f4423W);
        C6440ap.m4343b(parcel, this.f4424X);
        parcel.writeByteArray(this.f4425Y);
        parcel.writeByteArray(this.f4452y);
        parcel.writeString(this.f4426Z);
        parcel.writeString(this.f4428aa);
        parcel.writeString(this.f4451x);
        parcel.writeLong(this.f4409I);
        parcel.writeLong(this.f4410J);
        parcel.writeLong(this.f4411K);
    }

    public CrashDetailBean(Parcel parcel) {
        this.f4427a = -1L;
        this.f4429b = 0;
        this.f4430c = UUID.randomUUID().toString();
        this.f4431d = false;
        this.f4432e = "";
        this.f4433f = "";
        this.f4434g = "";
        this.f4435h = null;
        this.f4436i = null;
        this.f4437j = false;
        this.f4438k = false;
        this.f4439l = 0;
        this.f4440m = "";
        this.f4441n = "";
        this.f4442o = "";
        this.f4443p = "";
        this.f4444q = "";
        this.f4445r = -1L;
        this.f4446s = null;
        this.f4447t = 0;
        this.f4448u = "";
        this.f4449v = "";
        this.f4450w = null;
        this.f4451x = null;
        this.f4452y = null;
        this.f4453z = null;
        this.f4401A = "";
        this.f4402B = "";
        this.f4403C = -1L;
        this.f4404D = -1L;
        this.f4405E = -1L;
        this.f4406F = -1L;
        this.f4407G = -1L;
        this.f4408H = -1L;
        this.f4409I = -1L;
        this.f4410J = -1L;
        this.f4411K = -1L;
        this.f4412L = "";
        this.f4413M = "";
        this.f4414N = "";
        this.f4415O = "";
        this.f4416P = "";
        this.f4417Q = -1L;
        this.f4418R = false;
        this.f4419S = null;
        this.f4420T = null;
        this.f4421U = -1;
        this.f4422V = -1;
        this.f4423W = null;
        this.f4424X = null;
        this.f4425Y = null;
        this.f4426Z = null;
        this.f4428aa = null;
        this.f4429b = parcel.readInt();
        this.f4430c = parcel.readString();
        this.f4431d = parcel.readByte() == 1;
        this.f4432e = parcel.readString();
        this.f4433f = parcel.readString();
        this.f4434g = parcel.readString();
        this.f4437j = parcel.readByte() == 1;
        this.f4438k = parcel.readByte() == 1;
        this.f4439l = parcel.readInt();
        this.f4440m = parcel.readString();
        this.f4441n = parcel.readString();
        this.f4442o = parcel.readString();
        this.f4443p = parcel.readString();
        this.f4444q = parcel.readString();
        this.f4445r = parcel.readLong();
        this.f4446s = parcel.readString();
        this.f4447t = parcel.readInt();
        this.f4448u = parcel.readString();
        this.f4449v = parcel.readString();
        this.f4450w = parcel.readString();
        this.f4453z = C6440ap.m4341b(parcel);
        this.f4401A = parcel.readString();
        this.f4402B = parcel.readString();
        this.f4403C = parcel.readLong();
        this.f4404D = parcel.readLong();
        this.f4405E = parcel.readLong();
        this.f4406F = parcel.readLong();
        this.f4407G = parcel.readLong();
        this.f4408H = parcel.readLong();
        this.f4412L = parcel.readString();
        this.f4413M = parcel.readString();
        this.f4414N = parcel.readString();
        this.f4415O = parcel.readString();
        this.f4416P = parcel.readString();
        this.f4417Q = parcel.readLong();
        this.f4418R = parcel.readByte() == 1;
        this.f4419S = C6440ap.m4341b(parcel);
        this.f4435h = C6440ap.m4328a(parcel);
        this.f4436i = C6440ap.m4328a(parcel);
        this.f4421U = parcel.readInt();
        this.f4422V = parcel.readInt();
        this.f4423W = C6440ap.m4341b(parcel);
        this.f4424X = C6440ap.m4341b(parcel);
        this.f4425Y = parcel.createByteArray();
        this.f4452y = parcel.createByteArray();
        this.f4426Z = parcel.readString();
        this.f4428aa = parcel.readString();
        this.f4451x = parcel.readString();
        this.f4409I = parcel.readLong();
        this.f4410J = parcel.readLong();
        this.f4411K = parcel.readLong();
    }
}
