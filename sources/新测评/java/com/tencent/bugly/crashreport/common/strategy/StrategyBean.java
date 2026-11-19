package com.tencent.bugly.crashreport.common.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import com.tencent.bugly.proguard.C6418ap;
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
    public static String f5035a = "https://android.bugly.qq.com/rqd/async";

    /* renamed from: b */
    public static String f5036b = "https://android.bugly.qq.com/rqd/async";

    /* renamed from: c */
    public static String f5037c;

    /* renamed from: d */
    public long f5038d;

    /* renamed from: e */
    public long f5039e;

    /* renamed from: f */
    public boolean f5040f;

    /* renamed from: g */
    public boolean f5041g;

    /* renamed from: h */
    public boolean f5042h;

    /* renamed from: i */
    public boolean f5043i;

    /* renamed from: j */
    public boolean f5044j;

    /* renamed from: k */
    public boolean f5045k;

    /* renamed from: l */
    public boolean f5046l;

    /* renamed from: m */
    public boolean f5047m;

    /* renamed from: n */
    public boolean f5048n;

    /* renamed from: o */
    public long f5049o;

    /* renamed from: p */
    public long f5050p;

    /* renamed from: q */
    public String f5051q;

    /* renamed from: r */
    public String f5052r;

    /* renamed from: s */
    public String f5053s;

    /* renamed from: t */
    public Map<String, String> f5054t;

    /* renamed from: u */
    public int f5055u;

    /* renamed from: v */
    public long f5056v;

    /* renamed from: w */
    public long f5057w;

    public StrategyBean() {
        this.f5038d = -1L;
        this.f5039e = -1L;
        this.f5040f = true;
        this.f5041g = true;
        this.f5042h = true;
        this.f5043i = true;
        this.f5044j = false;
        this.f5045k = true;
        this.f5046l = true;
        this.f5047m = true;
        this.f5048n = true;
        this.f5050p = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.f5051q = f5035a;
        this.f5052r = f5036b;
        this.f5055u = 10;
        this.f5056v = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        this.f5057w = -1L;
        this.f5039e = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("S(@L@L@)");
        f5037c = sb.toString();
        sb.setLength(0);
        sb.append("*^@K#K@!");
        this.f5053s = sb.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f5039e);
        parcel.writeByte(this.f5040f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5041g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5042h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f5051q);
        parcel.writeString(this.f5052r);
        parcel.writeString(this.f5053s);
        C6418ap.m4983b(parcel, this.f5054t);
        parcel.writeByte(this.f5043i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5044j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5047m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5048n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f5050p);
        parcel.writeByte(this.f5045k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5046l ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f5049o);
        parcel.writeInt(this.f5055u);
        parcel.writeLong(this.f5056v);
        parcel.writeLong(this.f5057w);
    }

    public StrategyBean(Parcel parcel) {
        this.f5038d = -1L;
        this.f5039e = -1L;
        boolean z9 = true;
        this.f5040f = true;
        this.f5041g = true;
        this.f5042h = true;
        this.f5043i = true;
        this.f5044j = false;
        this.f5045k = true;
        this.f5046l = true;
        this.f5047m = true;
        this.f5048n = true;
        this.f5050p = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.f5051q = f5035a;
        this.f5052r = f5036b;
        this.f5055u = 10;
        this.f5056v = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        this.f5057w = -1L;
        try {
            f5037c = "S(@L@L@)";
            this.f5039e = parcel.readLong();
            this.f5040f = parcel.readByte() == 1;
            this.f5041g = parcel.readByte() == 1;
            this.f5042h = parcel.readByte() == 1;
            this.f5051q = parcel.readString();
            this.f5052r = parcel.readString();
            this.f5053s = parcel.readString();
            this.f5054t = C6418ap.m4981b(parcel);
            this.f5043i = parcel.readByte() == 1;
            this.f5044j = parcel.readByte() == 1;
            this.f5047m = parcel.readByte() == 1;
            this.f5048n = parcel.readByte() == 1;
            this.f5050p = parcel.readLong();
            this.f5045k = parcel.readByte() == 1;
            if (parcel.readByte() != 1) {
                z9 = false;
            }
            this.f5046l = z9;
            this.f5049o = parcel.readLong();
            this.f5055u = parcel.readInt();
            this.f5056v = parcel.readLong();
            this.f5057w = parcel.readLong();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
