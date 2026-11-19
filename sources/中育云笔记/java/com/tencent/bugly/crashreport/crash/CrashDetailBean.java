package com.tencent.bugly.crashreport.crash;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.proguard.C7783ap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes5.dex */
public class CrashDetailBean implements Parcelable, Comparable<CrashDetailBean> {
    public static final Parcelable.Creator<CrashDetailBean> CREATOR = new C7760a();

    /* renamed from: A */
    public String f13500A;

    /* renamed from: B */
    public String f13501B;

    /* renamed from: C */
    public long f13502C;

    /* renamed from: D */
    public long f13503D;

    /* renamed from: E */
    public long f13504E;

    /* renamed from: F */
    public long f13505F;

    /* renamed from: G */
    public long f13506G;

    /* renamed from: H */
    public long f13507H;

    /* renamed from: I */
    public long f13508I;

    /* renamed from: J */
    public long f13509J;

    /* renamed from: K */
    public long f13510K;

    /* renamed from: L */
    public String f13511L;

    /* renamed from: M */
    public String f13512M;

    /* renamed from: N */
    public String f13513N;

    /* renamed from: O */
    public String f13514O;

    /* renamed from: P */
    public String f13515P;

    /* renamed from: Q */
    public long f13516Q;

    /* renamed from: R */
    public boolean f13517R;

    /* renamed from: S */
    public Map<String, String> f13518S;

    /* renamed from: T */
    public Map<String, String> f13519T;

    /* renamed from: U */
    public int f13520U;

    /* renamed from: V */
    public int f13521V;

    /* renamed from: W */
    public Map<String, String> f13522W;

    /* renamed from: X */
    public Map<String, String> f13523X;

    /* renamed from: Y */
    public byte[] f13524Y;

    /* renamed from: Z */
    public String f13525Z;

    /* renamed from: a */
    public long f13526a;

    /* renamed from: aa */
    public String f13527aa;

    /* renamed from: b */
    public int f13528b;

    /* renamed from: c */
    public String f13529c;

    /* renamed from: d */
    public boolean f13530d;

    /* renamed from: e */
    public String f13531e;

    /* renamed from: f */
    public String f13532f;

    /* renamed from: g */
    public String f13533g;

    /* renamed from: h */
    public Map<String, PlugInBean> f13534h;

    /* renamed from: i */
    public Map<String, PlugInBean> f13535i;

    /* renamed from: j */
    public boolean f13536j;

    /* renamed from: k */
    public boolean f13537k;

    /* renamed from: l */
    public int f13538l;

    /* renamed from: m */
    public String f13539m;

    /* renamed from: n */
    public String f13540n;

    /* renamed from: o */
    public String f13541o;

    /* renamed from: p */
    public String f13542p;

    /* renamed from: q */
    public String f13543q;

    /* renamed from: r */
    public long f13544r;

    /* renamed from: s */
    public String f13545s;

    /* renamed from: t */
    public int f13546t;

    /* renamed from: u */
    public String f13547u;

    /* renamed from: v */
    public String f13548v;

    /* renamed from: w */
    public String f13549w;

    /* renamed from: x */
    public String f13550x;

    /* renamed from: y */
    public byte[] f13551y;

    /* renamed from: z */
    public Map<String, String> f13552z;

    /* renamed from: com.tencent.bugly.crashreport.crash.CrashDetailBean$a */
    public static class C7760a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CrashDetailBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
            return new CrashDetailBean[i10];
        }
    }

    public CrashDetailBean() {
        this.f13526a = -1L;
        this.f13528b = 0;
        this.f13529c = UUID.randomUUID().toString();
        this.f13530d = false;
        this.f13531e = "";
        this.f13532f = "";
        this.f13533g = "";
        this.f13534h = null;
        this.f13535i = null;
        this.f13536j = false;
        this.f13537k = false;
        this.f13538l = 0;
        this.f13539m = "";
        this.f13540n = "";
        this.f13541o = "";
        this.f13542p = "";
        this.f13543q = "";
        this.f13544r = -1L;
        this.f13545s = null;
        this.f13546t = 0;
        this.f13547u = "";
        this.f13548v = "";
        this.f13549w = null;
        this.f13550x = null;
        this.f13551y = null;
        this.f13552z = null;
        this.f13500A = "";
        this.f13501B = "";
        this.f13502C = -1L;
        this.f13503D = -1L;
        this.f13504E = -1L;
        this.f13505F = -1L;
        this.f13506G = -1L;
        this.f13507H = -1L;
        this.f13508I = -1L;
        this.f13509J = -1L;
        this.f13510K = -1L;
        this.f13511L = "";
        this.f13512M = "";
        this.f13513N = "";
        this.f13514O = "";
        this.f13515P = "";
        this.f13516Q = -1L;
        this.f13517R = false;
        this.f13518S = null;
        this.f13519T = null;
        this.f13520U = -1;
        this.f13521V = -1;
        this.f13522W = null;
        this.f13523X = null;
        this.f13524Y = null;
        this.f13525Z = null;
        this.f13527aa = null;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(CrashDetailBean crashDetailBean) {
        CrashDetailBean crashDetailBean2 = crashDetailBean;
        if (crashDetailBean2 == null) {
            return 1;
        }
        long j10 = this.f13544r - crashDetailBean2.f13544r;
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
        parcel.writeInt(this.f13528b);
        parcel.writeString(this.f13529c);
        parcel.writeByte(this.f13530d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f13531e);
        parcel.writeString(this.f13532f);
        parcel.writeString(this.f13533g);
        parcel.writeByte(this.f13536j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f13537k ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f13538l);
        parcel.writeString(this.f13539m);
        parcel.writeString(this.f13540n);
        parcel.writeString(this.f13541o);
        parcel.writeString(this.f13542p);
        parcel.writeString(this.f13543q);
        parcel.writeLong(this.f13544r);
        parcel.writeString(this.f13545s);
        parcel.writeInt(this.f13546t);
        parcel.writeString(this.f13547u);
        parcel.writeString(this.f13548v);
        parcel.writeString(this.f13549w);
        C7783ap.m10673b(parcel, this.f13552z);
        parcel.writeString(this.f13500A);
        parcel.writeString(this.f13501B);
        parcel.writeLong(this.f13502C);
        parcel.writeLong(this.f13503D);
        parcel.writeLong(this.f13504E);
        parcel.writeLong(this.f13505F);
        parcel.writeLong(this.f13506G);
        parcel.writeLong(this.f13507H);
        parcel.writeString(this.f13511L);
        parcel.writeString(this.f13512M);
        parcel.writeString(this.f13513N);
        parcel.writeString(this.f13514O);
        parcel.writeString(this.f13515P);
        parcel.writeLong(this.f13516Q);
        parcel.writeByte(this.f13517R ? (byte) 1 : (byte) 0);
        C7783ap.m10673b(parcel, this.f13518S);
        C7783ap.m10660a(parcel, this.f13534h);
        C7783ap.m10660a(parcel, this.f13535i);
        parcel.writeInt(this.f13520U);
        parcel.writeInt(this.f13521V);
        C7783ap.m10673b(parcel, this.f13522W);
        C7783ap.m10673b(parcel, this.f13523X);
        parcel.writeByteArray(this.f13524Y);
        parcel.writeByteArray(this.f13551y);
        parcel.writeString(this.f13525Z);
        parcel.writeString(this.f13527aa);
        parcel.writeString(this.f13550x);
        parcel.writeLong(this.f13508I);
        parcel.writeLong(this.f13509J);
        parcel.writeLong(this.f13510K);
    }

    public CrashDetailBean(Parcel parcel) {
        this.f13526a = -1L;
        this.f13528b = 0;
        this.f13529c = UUID.randomUUID().toString();
        this.f13530d = false;
        this.f13531e = "";
        this.f13532f = "";
        this.f13533g = "";
        this.f13534h = null;
        this.f13535i = null;
        this.f13536j = false;
        this.f13537k = false;
        this.f13538l = 0;
        this.f13539m = "";
        this.f13540n = "";
        this.f13541o = "";
        this.f13542p = "";
        this.f13543q = "";
        this.f13544r = -1L;
        this.f13545s = null;
        this.f13546t = 0;
        this.f13547u = "";
        this.f13548v = "";
        this.f13549w = null;
        this.f13550x = null;
        this.f13551y = null;
        this.f13552z = null;
        this.f13500A = "";
        this.f13501B = "";
        this.f13502C = -1L;
        this.f13503D = -1L;
        this.f13504E = -1L;
        this.f13505F = -1L;
        this.f13506G = -1L;
        this.f13507H = -1L;
        this.f13508I = -1L;
        this.f13509J = -1L;
        this.f13510K = -1L;
        this.f13511L = "";
        this.f13512M = "";
        this.f13513N = "";
        this.f13514O = "";
        this.f13515P = "";
        this.f13516Q = -1L;
        this.f13517R = false;
        this.f13518S = null;
        this.f13519T = null;
        this.f13520U = -1;
        this.f13521V = -1;
        this.f13522W = null;
        this.f13523X = null;
        this.f13524Y = null;
        this.f13525Z = null;
        this.f13527aa = null;
        this.f13528b = parcel.readInt();
        this.f13529c = parcel.readString();
        this.f13530d = parcel.readByte() == 1;
        this.f13531e = parcel.readString();
        this.f13532f = parcel.readString();
        this.f13533g = parcel.readString();
        this.f13536j = parcel.readByte() == 1;
        this.f13537k = parcel.readByte() == 1;
        this.f13538l = parcel.readInt();
        this.f13539m = parcel.readString();
        this.f13540n = parcel.readString();
        this.f13541o = parcel.readString();
        this.f13542p = parcel.readString();
        this.f13543q = parcel.readString();
        this.f13544r = parcel.readLong();
        this.f13545s = parcel.readString();
        this.f13546t = parcel.readInt();
        this.f13547u = parcel.readString();
        this.f13548v = parcel.readString();
        this.f13549w = parcel.readString();
        this.f13552z = C7783ap.m10671b(parcel);
        this.f13500A = parcel.readString();
        this.f13501B = parcel.readString();
        this.f13502C = parcel.readLong();
        this.f13503D = parcel.readLong();
        this.f13504E = parcel.readLong();
        this.f13505F = parcel.readLong();
        this.f13506G = parcel.readLong();
        this.f13507H = parcel.readLong();
        this.f13511L = parcel.readString();
        this.f13512M = parcel.readString();
        this.f13513N = parcel.readString();
        this.f13514O = parcel.readString();
        this.f13515P = parcel.readString();
        this.f13516Q = parcel.readLong();
        this.f13517R = parcel.readByte() == 1;
        this.f13518S = C7783ap.m10671b(parcel);
        this.f13534h = C7783ap.m10658a(parcel);
        this.f13535i = C7783ap.m10658a(parcel);
        this.f13520U = parcel.readInt();
        this.f13521V = parcel.readInt();
        this.f13522W = C7783ap.m10671b(parcel);
        this.f13523X = C7783ap.m10671b(parcel);
        this.f13524Y = parcel.createByteArray();
        this.f13551y = parcel.createByteArray();
        this.f13525Z = parcel.readString();
        this.f13527aa = parcel.readString();
        this.f13550x = parcel.readString();
        this.f13508I = parcel.readLong();
        this.f13509J = parcel.readLong();
        this.f13510K = parcel.readLong();
    }
}
