package com.tencent.bugly.crashreport.crash;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.proguard.C6418ap;
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
    public String f5058A;

    /* renamed from: B */
    public String f5059B;

    /* renamed from: C */
    public long f5060C;

    /* renamed from: D */
    public long f5061D;

    /* renamed from: E */
    public long f5062E;

    /* renamed from: F */
    public long f5063F;

    /* renamed from: G */
    public long f5064G;

    /* renamed from: H */
    public long f5065H;

    /* renamed from: I */
    public long f5066I;

    /* renamed from: J */
    public long f5067J;

    /* renamed from: K */
    public long f5068K;

    /* renamed from: L */
    public String f5069L;

    /* renamed from: M */
    public String f5070M;

    /* renamed from: N */
    public String f5071N;

    /* renamed from: O */
    public String f5072O;

    /* renamed from: P */
    public String f5073P;

    /* renamed from: Q */
    public long f5074Q;

    /* renamed from: R */
    public boolean f5075R;

    /* renamed from: S */
    public Map<String, String> f5076S;

    /* renamed from: T */
    public Map<String, String> f5077T;

    /* renamed from: U */
    public int f5078U;

    /* renamed from: V */
    public int f5079V;

    /* renamed from: W */
    public Map<String, String> f5080W;

    /* renamed from: X */
    public Map<String, String> f5081X;

    /* renamed from: Y */
    public byte[] f5082Y;

    /* renamed from: Z */
    public String f5083Z;

    /* renamed from: a */
    public long f5084a;

    /* renamed from: aa */
    public String f5085aa;

    /* renamed from: b */
    public int f5086b;

    /* renamed from: c */
    public String f5087c;

    /* renamed from: d */
    public boolean f5088d;

    /* renamed from: e */
    public String f5089e;

    /* renamed from: f */
    public String f5090f;

    /* renamed from: g */
    public String f5091g;

    /* renamed from: h */
    public Map<String, PlugInBean> f5092h;

    /* renamed from: i */
    public Map<String, PlugInBean> f5093i;

    /* renamed from: j */
    public boolean f5094j;

    /* renamed from: k */
    public boolean f5095k;

    /* renamed from: l */
    public int f5096l;

    /* renamed from: m */
    public String f5097m;

    /* renamed from: n */
    public String f5098n;

    /* renamed from: o */
    public String f5099o;

    /* renamed from: p */
    public String f5100p;

    /* renamed from: q */
    public String f5101q;

    /* renamed from: r */
    public long f5102r;

    /* renamed from: s */
    public String f5103s;

    /* renamed from: t */
    public int f5104t;

    /* renamed from: u */
    public String f5105u;

    /* renamed from: v */
    public String f5106v;

    /* renamed from: w */
    public String f5107w;

    /* renamed from: x */
    public String f5108x;

    /* renamed from: y */
    public byte[] f5109y;

    /* renamed from: z */
    public Map<String, String> f5110z;

    public CrashDetailBean() {
        this.f5084a = -1L;
        this.f5086b = 0;
        this.f5087c = UUID.randomUUID().toString();
        this.f5088d = false;
        this.f5089e = "";
        this.f5090f = "";
        this.f5091g = "";
        this.f5092h = null;
        this.f5093i = null;
        this.f5094j = false;
        this.f5095k = false;
        this.f5096l = 0;
        this.f5097m = "";
        this.f5098n = "";
        this.f5099o = "";
        this.f5100p = "";
        this.f5101q = "";
        this.f5102r = -1L;
        this.f5103s = null;
        this.f5104t = 0;
        this.f5105u = "";
        this.f5106v = "";
        this.f5107w = null;
        this.f5108x = null;
        this.f5109y = null;
        this.f5110z = null;
        this.f5058A = "";
        this.f5059B = "";
        this.f5060C = -1L;
        this.f5061D = -1L;
        this.f5062E = -1L;
        this.f5063F = -1L;
        this.f5064G = -1L;
        this.f5065H = -1L;
        this.f5066I = -1L;
        this.f5067J = -1L;
        this.f5068K = -1L;
        this.f5069L = "";
        this.f5070M = "";
        this.f5071N = "";
        this.f5072O = "";
        this.f5073P = "";
        this.f5074Q = -1L;
        this.f5075R = false;
        this.f5076S = null;
        this.f5077T = null;
        this.f5078U = -1;
        this.f5079V = -1;
        this.f5080W = null;
        this.f5081X = null;
        this.f5082Y = null;
        this.f5083Z = null;
        this.f5085aa = null;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(CrashDetailBean crashDetailBean) {
        CrashDetailBean crashDetailBean2 = crashDetailBean;
        if (crashDetailBean2 == null) {
            return 1;
        }
        long j10 = this.f5102r - crashDetailBean2.f5102r;
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
        parcel.writeInt(this.f5086b);
        parcel.writeString(this.f5087c);
        parcel.writeByte(this.f5088d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f5089e);
        parcel.writeString(this.f5090f);
        parcel.writeString(this.f5091g);
        parcel.writeByte(this.f5094j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5095k ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f5096l);
        parcel.writeString(this.f5097m);
        parcel.writeString(this.f5098n);
        parcel.writeString(this.f5099o);
        parcel.writeString(this.f5100p);
        parcel.writeString(this.f5101q);
        parcel.writeLong(this.f5102r);
        parcel.writeString(this.f5103s);
        parcel.writeInt(this.f5104t);
        parcel.writeString(this.f5105u);
        parcel.writeString(this.f5106v);
        parcel.writeString(this.f5107w);
        C6418ap.m4983b(parcel, this.f5110z);
        parcel.writeString(this.f5058A);
        parcel.writeString(this.f5059B);
        parcel.writeLong(this.f5060C);
        parcel.writeLong(this.f5061D);
        parcel.writeLong(this.f5062E);
        parcel.writeLong(this.f5063F);
        parcel.writeLong(this.f5064G);
        parcel.writeLong(this.f5065H);
        parcel.writeString(this.f5069L);
        parcel.writeString(this.f5070M);
        parcel.writeString(this.f5071N);
        parcel.writeString(this.f5072O);
        parcel.writeString(this.f5073P);
        parcel.writeLong(this.f5074Q);
        parcel.writeByte(this.f5075R ? (byte) 1 : (byte) 0);
        C6418ap.m4983b(parcel, this.f5076S);
        C6418ap.m4970a(parcel, this.f5092h);
        C6418ap.m4970a(parcel, this.f5093i);
        parcel.writeInt(this.f5078U);
        parcel.writeInt(this.f5079V);
        C6418ap.m4983b(parcel, this.f5080W);
        C6418ap.m4983b(parcel, this.f5081X);
        parcel.writeByteArray(this.f5082Y);
        parcel.writeByteArray(this.f5109y);
        parcel.writeString(this.f5083Z);
        parcel.writeString(this.f5085aa);
        parcel.writeString(this.f5108x);
        parcel.writeLong(this.f5066I);
        parcel.writeLong(this.f5067J);
        parcel.writeLong(this.f5068K);
    }

    public CrashDetailBean(Parcel parcel) {
        this.f5084a = -1L;
        this.f5086b = 0;
        this.f5087c = UUID.randomUUID().toString();
        this.f5088d = false;
        this.f5089e = "";
        this.f5090f = "";
        this.f5091g = "";
        this.f5092h = null;
        this.f5093i = null;
        this.f5094j = false;
        this.f5095k = false;
        this.f5096l = 0;
        this.f5097m = "";
        this.f5098n = "";
        this.f5099o = "";
        this.f5100p = "";
        this.f5101q = "";
        this.f5102r = -1L;
        this.f5103s = null;
        this.f5104t = 0;
        this.f5105u = "";
        this.f5106v = "";
        this.f5107w = null;
        this.f5108x = null;
        this.f5109y = null;
        this.f5110z = null;
        this.f5058A = "";
        this.f5059B = "";
        this.f5060C = -1L;
        this.f5061D = -1L;
        this.f5062E = -1L;
        this.f5063F = -1L;
        this.f5064G = -1L;
        this.f5065H = -1L;
        this.f5066I = -1L;
        this.f5067J = -1L;
        this.f5068K = -1L;
        this.f5069L = "";
        this.f5070M = "";
        this.f5071N = "";
        this.f5072O = "";
        this.f5073P = "";
        this.f5074Q = -1L;
        this.f5075R = false;
        this.f5076S = null;
        this.f5077T = null;
        this.f5078U = -1;
        this.f5079V = -1;
        this.f5080W = null;
        this.f5081X = null;
        this.f5082Y = null;
        this.f5083Z = null;
        this.f5085aa = null;
        this.f5086b = parcel.readInt();
        this.f5087c = parcel.readString();
        this.f5088d = parcel.readByte() == 1;
        this.f5089e = parcel.readString();
        this.f5090f = parcel.readString();
        this.f5091g = parcel.readString();
        this.f5094j = parcel.readByte() == 1;
        this.f5095k = parcel.readByte() == 1;
        this.f5096l = parcel.readInt();
        this.f5097m = parcel.readString();
        this.f5098n = parcel.readString();
        this.f5099o = parcel.readString();
        this.f5100p = parcel.readString();
        this.f5101q = parcel.readString();
        this.f5102r = parcel.readLong();
        this.f5103s = parcel.readString();
        this.f5104t = parcel.readInt();
        this.f5105u = parcel.readString();
        this.f5106v = parcel.readString();
        this.f5107w = parcel.readString();
        this.f5110z = C6418ap.m4981b(parcel);
        this.f5058A = parcel.readString();
        this.f5059B = parcel.readString();
        this.f5060C = parcel.readLong();
        this.f5061D = parcel.readLong();
        this.f5062E = parcel.readLong();
        this.f5063F = parcel.readLong();
        this.f5064G = parcel.readLong();
        this.f5065H = parcel.readLong();
        this.f5069L = parcel.readString();
        this.f5070M = parcel.readString();
        this.f5071N = parcel.readString();
        this.f5072O = parcel.readString();
        this.f5073P = parcel.readString();
        this.f5074Q = parcel.readLong();
        this.f5075R = parcel.readByte() == 1;
        this.f5076S = C6418ap.m4981b(parcel);
        this.f5092h = C6418ap.m4968a(parcel);
        this.f5093i = C6418ap.m4968a(parcel);
        this.f5078U = parcel.readInt();
        this.f5079V = parcel.readInt();
        this.f5080W = C6418ap.m4981b(parcel);
        this.f5081X = C6418ap.m4981b(parcel);
        this.f5082Y = parcel.createByteArray();
        this.f5109y = parcel.createByteArray();
        this.f5083Z = parcel.readString();
        this.f5085aa = parcel.readString();
        this.f5108x = parcel.readString();
        this.f5066I = parcel.readLong();
        this.f5067J = parcel.readLong();
        this.f5068K = parcel.readLong();
    }
}
