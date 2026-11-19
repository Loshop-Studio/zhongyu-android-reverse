package com.tencent.bugly.crashreport.common.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import com.tencent.bugly.proguard.C6440ap;
import java.util.Map;

/* loaded from: classes4.dex */
public class StrategyBean implements Parcelable {
    public static final Parcelable.Creator<StrategyBean> CREATOR = new Parcelable.Creator<StrategyBean>() { // from class: com.tencent.bugly.crashreport.common.strategy.StrategyBean.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StrategyBean createFromParcel(Parcel parcel) {
            return new StrategyBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StrategyBean[] newArray(int i10) {
            return new StrategyBean[i10];
        }
    };

    /* renamed from: a */
    public static String f4378a = "https://android.bugly.qq.com/rqd/async";

    /* renamed from: b */
    public static String f4379b = "https://android.bugly.qq.com/rqd/async";

    /* renamed from: c */
    public static String f4380c;

    /* renamed from: d */
    public long f4381d;

    /* renamed from: e */
    public long f4382e;

    /* renamed from: f */
    public boolean f4383f;

    /* renamed from: g */
    public boolean f4384g;

    /* renamed from: h */
    public boolean f4385h;

    /* renamed from: i */
    public boolean f4386i;

    /* renamed from: j */
    public boolean f4387j;

    /* renamed from: k */
    public boolean f4388k;

    /* renamed from: l */
    public boolean f4389l;

    /* renamed from: m */
    public boolean f4390m;

    /* renamed from: n */
    public boolean f4391n;

    /* renamed from: o */
    public long f4392o;

    /* renamed from: p */
    public long f4393p;

    /* renamed from: q */
    public String f4394q;

    /* renamed from: r */
    public String f4395r;

    /* renamed from: s */
    public String f4396s;

    /* renamed from: t */
    public Map<String, String> f4397t;

    /* renamed from: u */
    public int f4398u;

    /* renamed from: v */
    public long f4399v;

    /* renamed from: w */
    public long f4400w;

    public StrategyBean() {
        this.f4381d = -1L;
        this.f4382e = -1L;
        this.f4383f = true;
        this.f4384g = true;
        this.f4385h = true;
        this.f4386i = true;
        this.f4387j = false;
        this.f4388k = true;
        this.f4389l = true;
        this.f4390m = true;
        this.f4391n = true;
        this.f4393p = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.f4394q = f4378a;
        this.f4395r = f4379b;
        this.f4398u = 10;
        this.f4399v = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        this.f4400w = -1L;
        this.f4382e = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("S(@L@L@)");
        f4380c = sb.toString();
        sb.setLength(0);
        sb.append("*^@K#K@!");
        this.f4396s = sb.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f4382e);
        parcel.writeByte(this.f4383f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4384g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4385h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f4394q);
        parcel.writeString(this.f4395r);
        parcel.writeString(this.f4396s);
        C6440ap.m4343b(parcel, this.f4397t);
        parcel.writeByte(this.f4386i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4387j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4390m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4391n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f4393p);
        parcel.writeByte(this.f4388k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4389l ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f4392o);
        parcel.writeInt(this.f4398u);
        parcel.writeLong(this.f4399v);
        parcel.writeLong(this.f4400w);
    }

    public StrategyBean(Parcel parcel) {
        this.f4381d = -1L;
        this.f4382e = -1L;
        boolean z10 = true;
        this.f4383f = true;
        this.f4384g = true;
        this.f4385h = true;
        this.f4386i = true;
        this.f4387j = false;
        this.f4388k = true;
        this.f4389l = true;
        this.f4390m = true;
        this.f4391n = true;
        this.f4393p = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.f4394q = f4378a;
        this.f4395r = f4379b;
        this.f4398u = 10;
        this.f4399v = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        this.f4400w = -1L;
        try {
            f4380c = "S(@L@L@)";
            this.f4382e = parcel.readLong();
            this.f4383f = parcel.readByte() == 1;
            this.f4384g = parcel.readByte() == 1;
            this.f4385h = parcel.readByte() == 1;
            this.f4394q = parcel.readString();
            this.f4395r = parcel.readString();
            this.f4396s = parcel.readString();
            this.f4397t = C6440ap.m4341b(parcel);
            this.f4386i = parcel.readByte() == 1;
            this.f4387j = parcel.readByte() == 1;
            this.f4390m = parcel.readByte() == 1;
            this.f4391n = parcel.readByte() == 1;
            this.f4393p = parcel.readLong();
            this.f4388k = parcel.readByte() == 1;
            if (parcel.readByte() != 1) {
                z10 = false;
            }
            this.f4389l = z10;
            this.f4392o = parcel.readLong();
            this.f4398u = parcel.readInt();
            this.f4399v = parcel.readLong();
            this.f4400w = parcel.readLong();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
