package com.tencent.bugly.crashreport.common.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import com.tencent.bugly.proguard.C6678ap;
import java.util.Map;

/* loaded from: classes4.dex */
public class StrategyBean implements Parcelable {
    public static final Parcelable.Creator<StrategyBean> CREATOR = new Parcelable.Creator<StrategyBean>() { // from class: com.tencent.bugly.crashreport.common.strategy.StrategyBean.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StrategyBean createFromParcel(Parcel parcel) {
            return new StrategyBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StrategyBean[] newArray(int i9) {
            return new StrategyBean[i9];
        }
    };

    /* renamed from: a */
    public static String f5612a = "https://android.bugly.qq.com/rqd/async";

    /* renamed from: b */
    public static String f5613b = "https://android.bugly.qq.com/rqd/async";

    /* renamed from: c */
    public static String f5614c;

    /* renamed from: d */
    public long f5615d;

    /* renamed from: e */
    public long f5616e;

    /* renamed from: f */
    public boolean f5617f;

    /* renamed from: g */
    public boolean f5618g;

    /* renamed from: h */
    public boolean f5619h;

    /* renamed from: i */
    public boolean f5620i;

    /* renamed from: j */
    public boolean f5621j;

    /* renamed from: k */
    public boolean f5622k;

    /* renamed from: l */
    public boolean f5623l;

    /* renamed from: m */
    public boolean f5624m;

    /* renamed from: n */
    public boolean f5625n;

    /* renamed from: o */
    public long f5626o;

    /* renamed from: p */
    public long f5627p;

    /* renamed from: q */
    public String f5628q;

    /* renamed from: r */
    public String f5629r;

    /* renamed from: s */
    public String f5630s;

    /* renamed from: t */
    public Map<String, String> f5631t;

    /* renamed from: u */
    public int f5632u;

    /* renamed from: v */
    public long f5633v;

    /* renamed from: w */
    public long f5634w;

    public StrategyBean() {
        this.f5615d = -1L;
        this.f5616e = -1L;
        this.f5617f = true;
        this.f5618g = true;
        this.f5619h = true;
        this.f5620i = true;
        this.f5621j = false;
        this.f5622k = true;
        this.f5623l = true;
        this.f5624m = true;
        this.f5625n = true;
        this.f5627p = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.f5628q = f5612a;
        this.f5629r = f5613b;
        this.f5632u = 10;
        this.f5633v = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        this.f5634w = -1L;
        this.f5616e = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("S(@L@L@)");
        f5614c = sb.toString();
        sb.setLength(0);
        sb.append("*^@K#K@!");
        this.f5630s = sb.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f5616e);
        parcel.writeByte(this.f5617f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5618g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5619h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f5628q);
        parcel.writeString(this.f5629r);
        parcel.writeString(this.f5630s);
        C6678ap.m5162b(parcel, this.f5631t);
        parcel.writeByte(this.f5620i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5621j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5624m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5625n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f5627p);
        parcel.writeByte(this.f5622k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f5623l ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f5626o);
        parcel.writeInt(this.f5632u);
        parcel.writeLong(this.f5633v);
        parcel.writeLong(this.f5634w);
    }

    public StrategyBean(Parcel parcel) {
        this.f5615d = -1L;
        this.f5616e = -1L;
        boolean z9 = true;
        this.f5617f = true;
        this.f5618g = true;
        this.f5619h = true;
        this.f5620i = true;
        this.f5621j = false;
        this.f5622k = true;
        this.f5623l = true;
        this.f5624m = true;
        this.f5625n = true;
        this.f5627p = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.f5628q = f5612a;
        this.f5629r = f5613b;
        this.f5632u = 10;
        this.f5633v = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        this.f5634w = -1L;
        try {
            f5614c = "S(@L@L@)";
            this.f5616e = parcel.readLong();
            this.f5617f = parcel.readByte() == 1;
            this.f5618g = parcel.readByte() == 1;
            this.f5619h = parcel.readByte() == 1;
            this.f5628q = parcel.readString();
            this.f5629r = parcel.readString();
            this.f5630s = parcel.readString();
            this.f5631t = C6678ap.m5160b(parcel);
            this.f5620i = parcel.readByte() == 1;
            this.f5621j = parcel.readByte() == 1;
            this.f5624m = parcel.readByte() == 1;
            this.f5625n = parcel.readByte() == 1;
            this.f5627p = parcel.readLong();
            this.f5622k = parcel.readByte() == 1;
            if (parcel.readByte() != 1) {
                z9 = false;
            }
            this.f5623l = z9;
            this.f5626o = parcel.readLong();
            this.f5632u = parcel.readInt();
            this.f5633v = parcel.readLong();
            this.f5634w = parcel.readLong();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
