package com.tencent.bugly.crashreport.common.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.PeriodicWorkRequest;
import com.tencent.bugly.proguard.C7783ap;
import java.util.Map;

/* loaded from: classes5.dex */
public class StrategyBean implements Parcelable {
    public static final Parcelable.Creator<StrategyBean> CREATOR = new C7759a();

    /* renamed from: a */
    public static String f13477a = "https://android.bugly.qq.com/rqd/async";

    /* renamed from: b */
    public static String f13478b = "https://android.bugly.qq.com/rqd/async";

    /* renamed from: c */
    public static String f13479c;

    /* renamed from: d */
    public long f13480d;

    /* renamed from: e */
    public long f13481e;

    /* renamed from: f */
    public boolean f13482f;

    /* renamed from: g */
    public boolean f13483g;

    /* renamed from: h */
    public boolean f13484h;

    /* renamed from: i */
    public boolean f13485i;

    /* renamed from: j */
    public boolean f13486j;

    /* renamed from: k */
    public boolean f13487k;

    /* renamed from: l */
    public boolean f13488l;

    /* renamed from: m */
    public boolean f13489m;

    /* renamed from: n */
    public boolean f13490n;

    /* renamed from: o */
    public long f13491o;

    /* renamed from: p */
    public long f13492p;

    /* renamed from: q */
    public String f13493q;

    /* renamed from: r */
    public String f13494r;

    /* renamed from: s */
    public String f13495s;

    /* renamed from: t */
    public Map<String, String> f13496t;

    /* renamed from: u */
    public int f13497u;

    /* renamed from: v */
    public long f13498v;

    /* renamed from: w */
    public long f13499w;

    /* renamed from: com.tencent.bugly.crashreport.common.strategy.StrategyBean$a */
    public static class C7759a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new StrategyBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
            return new StrategyBean[i10];
        }
    }

    public StrategyBean() {
        this.f13480d = -1L;
        this.f13481e = -1L;
        this.f13482f = true;
        this.f13483g = true;
        this.f13484h = true;
        this.f13485i = true;
        this.f13486j = false;
        this.f13487k = true;
        this.f13488l = true;
        this.f13489m = true;
        this.f13490n = true;
        this.f13492p = 30000L;
        this.f13493q = f13477a;
        this.f13494r = f13478b;
        this.f13497u = 10;
        this.f13498v = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        this.f13499w = -1L;
        this.f13481e = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("S(@L@L@)");
        f13479c = sb2.toString();
        sb2.setLength(0);
        sb2.append("*^@K#K@!");
        this.f13495s = sb2.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f13481e);
        parcel.writeByte(this.f13482f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f13483g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f13484h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f13493q);
        parcel.writeString(this.f13494r);
        parcel.writeString(this.f13495s);
        C7783ap.m10673b(parcel, this.f13496t);
        parcel.writeByte(this.f13485i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f13486j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f13489m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f13490n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f13492p);
        parcel.writeByte(this.f13487k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f13488l ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f13491o);
        parcel.writeInt(this.f13497u);
        parcel.writeLong(this.f13498v);
        parcel.writeLong(this.f13499w);
    }

    public StrategyBean(Parcel parcel) {
        this.f13480d = -1L;
        this.f13481e = -1L;
        boolean z10 = true;
        this.f13482f = true;
        this.f13483g = true;
        this.f13484h = true;
        this.f13485i = true;
        this.f13486j = false;
        this.f13487k = true;
        this.f13488l = true;
        this.f13489m = true;
        this.f13490n = true;
        this.f13492p = 30000L;
        this.f13493q = f13477a;
        this.f13494r = f13478b;
        this.f13497u = 10;
        this.f13498v = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        this.f13499w = -1L;
        try {
            f13479c = "S(@L@L@)";
            this.f13481e = parcel.readLong();
            this.f13482f = parcel.readByte() == 1;
            this.f13483g = parcel.readByte() == 1;
            this.f13484h = parcel.readByte() == 1;
            this.f13493q = parcel.readString();
            this.f13494r = parcel.readString();
            this.f13495s = parcel.readString();
            this.f13496t = C7783ap.m10671b(parcel);
            this.f13485i = parcel.readByte() == 1;
            this.f13486j = parcel.readByte() == 1;
            this.f13489m = parcel.readByte() == 1;
            this.f13490n = parcel.readByte() == 1;
            this.f13492p = parcel.readLong();
            this.f13487k = parcel.readByte() == 1;
            if (parcel.readByte() != 1) {
                z10 = false;
            }
            this.f13488l = z10;
            this.f13491o = parcel.readLong();
            this.f13497u = parcel.readInt();
            this.f13498v = parcel.readLong();
            this.f13499w = parcel.readLong();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
