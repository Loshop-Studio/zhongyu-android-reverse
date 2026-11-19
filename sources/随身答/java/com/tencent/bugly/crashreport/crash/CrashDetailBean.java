package com.tencent.bugly.crashreport.crash;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.proguard.C6678ap;
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
        public final /* bridge */ /* synthetic */ CrashDetailBean[] newArray(int i9) {
            return new CrashDetailBean[i9];
        }
    };

    /* renamed from: A */
    public String f5635A;

    /* renamed from: B */
    public String f5636B;

    /* renamed from: C */
    public long f5637C;

    /* renamed from: D */
    public long f5638D;

    /* renamed from: E */
    public long f5639E;

    /* renamed from: F */
    public long f5640F;

    /* renamed from: G */
    public long f5641G;

    /* renamed from: H */
    public long f5642H;

    /* renamed from: I */
    public long f5643I;

    /* renamed from: J */
    public long f5644J;

    /* renamed from: K */
    public long f5645K;

    /* renamed from: L */
    public String f5646L;

    /* renamed from: M */
    public String f5647M;

    /* renamed from: N */
    public String f5648N;

    /* renamed from: O */
    public String f5649O;

    /* renamed from: P */
    public String f5650P;

    /* renamed from: Q */
    public long f5651Q;

    /* renamed from: R */
    public boolean f5652R;

    /* renamed from: S */
    public Map<String, String> f5653S;

    /* renamed from: T */
    public Map<String, String> f5654T;

    /* renamed from: U */
    public int f5655U;

    /* renamed from: V */
    public int f5656V;

    /* renamed from: W */
    public Map<String, String> f5657W;

    /* renamed from: X */
    public Map<String, String> f5658X;

    /* renamed from: Y */
    public byte[] f5659Y;

    /* renamed from: Z */
    public String f5660Z;

    /* renamed from: a */
    public long f5661a;

    /* renamed from: aa */
    public String f5662aa;

    /* renamed from: b */
    public int f5663b;

    /* renamed from: c */
    public String f5664c;

    /* renamed from: d */
    public boolean f5665d;

    /* renamed from: e */
    public String f5666e;

    /* renamed from: f */
    public String f5667f;

    /* renamed from: g */
    public String f5668g;

    /* renamed from: h */
    public Map<String, PlugInBean> f5669h;

    /* renamed from: i */
    public Map<String, PlugInBean> f5670i;

    /* renamed from: j */
    public boolean f5671j;

    /* renamed from: k */
    public boolean f5672k;

    /* renamed from: l */
    public int f5673l;

    /* renamed from: m */
    public String f5674m;

    /* renamed from: n */
    public String f5675n;

    /* renamed from: o */
    public String f5676o;

    /* renamed from: p */
    public String f5677p;

    /* renamed from: q */
    public String f5678q;

    /* renamed from: r */
    public long f5679r;

    /* renamed from: s */
    public String f5680s;

    /* renamed from: t */
    public int f5681t;

    /* renamed from: u */
    public String f5682u;

    /* renamed from: v */
    public String f5683v;

    /* renamed from: w */
    public String f5684w;

    /* renamed from: x */
    public String f5685x;

    /* renamed from: y */
    public byte[] f5686y;

    /* renamed from: z */
    public Map<String, String> f5687z;

    public CrashDetailBean() {
        this.f5661a = -1L;
        this.f5663b = 0;
        this.f5664c = UUID.randomUUID().toString();
        this.f5665d = false;
        this.f5666e = "";
        this.f5667f = "";
        this.f5668g = "";
        this.f5669h = null;
        this.f5670i = null;
        this.f5671j = false;
        this.f5672k = false;
        this.f5673l = 0;
        this.f5674m = "";
        this.f5675n = "";
        this.f5676o = "";
        this.f5677p = "";
        this.f5678q = "";
        this.f5679r = -1L;
        this.f5680s = null;
        this.f5681t = 0;
        this.f5682u = "";
        this.f5683v = "";
        this.f5684w = null;
        this.f5685x = null;
        this.f5686y = null;
        this.f5687z = null;
        this.f5635A = "";
        this.f5636B = "";
        this.f5637C = -1L;
        this.f5638D = -1L;
        this.f5639E = -1L;
        this.f5640F = -1L;
        this.f5641G = -1L;
        this.f5642H = -1L;
        this.f5643I = -1L;
        this.f5644J = -1L;
        this.f5645K = -1L;
        this.f5646L = "";
        this.f5647M = "";
        this.f5648N = "";
        this.f5649O = "";
        this.f5650P = "";
        this.f5651Q = -1L;
        this.f5652R = false;
        this.f5653S = null;
        this.f5654T = null;
        this.f5655U = -1;
        this.f5656V = -1;
        this.f5657W = null;
        this.f5658X = null;
        this.f5659Y = null;
        this.f5660Z = null;
        this.f5662aa = null;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(CrashDetailBean crashDetailBean) {
        CrashDetailBean crashDetailBean2 = crashDetailBean;
        if (crashDetailBean2 == null) {
            return 1;
        }
        long j9 = this.f5679r - crashDetailBean2.f5679r;
        if (j9 <= 0) {
            return j9 < 0 ? -1 : 0;
        }
        return 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f5663b);
        parcel.writeString(this.f5664c);
        parcel.writeByte(this.f5665d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f5666e);
        parcel.writeString(this.f5667f);
        parcel.writeString(this.f5668g);
        parcel.writeByte(this.f5671j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5672k ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f5673l);
        parcel.writeString(this.f5674m);
        parcel.writeString(this.f5675n);
        parcel.writeString(this.f5676o);
        parcel.writeString(this.f5677p);
        parcel.writeString(this.f5678q);
        parcel.writeLong(this.f5679r);
        parcel.writeString(this.f5680s);
        parcel.writeInt(this.f5681t);
        parcel.writeString(this.f5682u);
        parcel.writeString(this.f5683v);
        parcel.writeString(this.f5684w);
        C6678ap.m5162b(parcel, this.f5687z);
        parcel.writeString(this.f5635A);
        parcel.writeString(this.f5636B);
        parcel.writeLong(this.f5637C);
        parcel.writeLong(this.f5638D);
        parcel.writeLong(this.f5639E);
        parcel.writeLong(this.f5640F);
        parcel.writeLong(this.f5641G);
        parcel.writeLong(this.f5642H);
        parcel.writeString(this.f5646L);
        parcel.writeString(this.f5647M);
        parcel.writeString(this.f5648N);
        parcel.writeString(this.f5649O);
        parcel.writeString(this.f5650P);
        parcel.writeLong(this.f5651Q);
        parcel.writeByte(this.f5652R ? (byte) 1 : (byte) 0);
        C6678ap.m5162b(parcel, this.f5653S);
        C6678ap.m5149a(parcel, this.f5669h);
        C6678ap.m5149a(parcel, this.f5670i);
        parcel.writeInt(this.f5655U);
        parcel.writeInt(this.f5656V);
        C6678ap.m5162b(parcel, this.f5657W);
        C6678ap.m5162b(parcel, this.f5658X);
        parcel.writeByteArray(this.f5659Y);
        parcel.writeByteArray(this.f5686y);
        parcel.writeString(this.f5660Z);
        parcel.writeString(this.f5662aa);
        parcel.writeString(this.f5685x);
        parcel.writeLong(this.f5643I);
        parcel.writeLong(this.f5644J);
        parcel.writeLong(this.f5645K);
    }

    public CrashDetailBean(Parcel parcel) {
        this.f5661a = -1L;
        this.f5663b = 0;
        this.f5664c = UUID.randomUUID().toString();
        this.f5665d = false;
        this.f5666e = "";
        this.f5667f = "";
        this.f5668g = "";
        this.f5669h = null;
        this.f5670i = null;
        this.f5671j = false;
        this.f5672k = false;
        this.f5673l = 0;
        this.f5674m = "";
        this.f5675n = "";
        this.f5676o = "";
        this.f5677p = "";
        this.f5678q = "";
        this.f5679r = -1L;
        this.f5680s = null;
        this.f5681t = 0;
        this.f5682u = "";
        this.f5683v = "";
        this.f5684w = null;
        this.f5685x = null;
        this.f5686y = null;
        this.f5687z = null;
        this.f5635A = "";
        this.f5636B = "";
        this.f5637C = -1L;
        this.f5638D = -1L;
        this.f5639E = -1L;
        this.f5640F = -1L;
        this.f5641G = -1L;
        this.f5642H = -1L;
        this.f5643I = -1L;
        this.f5644J = -1L;
        this.f5645K = -1L;
        this.f5646L = "";
        this.f5647M = "";
        this.f5648N = "";
        this.f5649O = "";
        this.f5650P = "";
        this.f5651Q = -1L;
        this.f5652R = false;
        this.f5653S = null;
        this.f5654T = null;
        this.f5655U = -1;
        this.f5656V = -1;
        this.f5657W = null;
        this.f5658X = null;
        this.f5659Y = null;
        this.f5660Z = null;
        this.f5662aa = null;
        this.f5663b = parcel.readInt();
        this.f5664c = parcel.readString();
        this.f5665d = parcel.readByte() == 1;
        this.f5666e = parcel.readString();
        this.f5667f = parcel.readString();
        this.f5668g = parcel.readString();
        this.f5671j = parcel.readByte() == 1;
        this.f5672k = parcel.readByte() == 1;
        this.f5673l = parcel.readInt();
        this.f5674m = parcel.readString();
        this.f5675n = parcel.readString();
        this.f5676o = parcel.readString();
        this.f5677p = parcel.readString();
        this.f5678q = parcel.readString();
        this.f5679r = parcel.readLong();
        this.f5680s = parcel.readString();
        this.f5681t = parcel.readInt();
        this.f5682u = parcel.readString();
        this.f5683v = parcel.readString();
        this.f5684w = parcel.readString();
        this.f5687z = C6678ap.m5160b(parcel);
        this.f5635A = parcel.readString();
        this.f5636B = parcel.readString();
        this.f5637C = parcel.readLong();
        this.f5638D = parcel.readLong();
        this.f5639E = parcel.readLong();
        this.f5640F = parcel.readLong();
        this.f5641G = parcel.readLong();
        this.f5642H = parcel.readLong();
        this.f5646L = parcel.readString();
        this.f5647M = parcel.readString();
        this.f5648N = parcel.readString();
        this.f5649O = parcel.readString();
        this.f5650P = parcel.readString();
        this.f5651Q = parcel.readLong();
        this.f5652R = parcel.readByte() == 1;
        this.f5653S = C6678ap.m5160b(parcel);
        this.f5669h = C6678ap.m5147a(parcel);
        this.f5670i = C6678ap.m5147a(parcel);
        this.f5655U = parcel.readInt();
        this.f5656V = parcel.readInt();
        this.f5657W = C6678ap.m5160b(parcel);
        this.f5658X = C6678ap.m5160b(parcel);
        this.f5659Y = parcel.createByteArray();
        this.f5686y = parcel.createByteArray();
        this.f5660Z = parcel.readString();
        this.f5662aa = parcel.readString();
        this.f5685x = parcel.readString();
        this.f5643I = parcel.readLong();
        this.f5644J = parcel.readLong();
        this.f5645K = parcel.readLong();
    }
}
