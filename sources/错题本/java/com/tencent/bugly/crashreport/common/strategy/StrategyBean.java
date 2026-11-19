package com.tencent.bugly.crashreport.common.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.AbstractC0037f;
import android.support.v4.media.C0038g;
import com.tencent.bugly.proguard.C4059ap;
import java.util.Map;

/* loaded from: classes3.dex */
public class StrategyBean implements Parcelable {
    public static final Parcelable.Creator<StrategyBean> CREATOR = new C0038g(16);

    /* renamed from: a */
    public static String f3269a = "https://android.bugly.qq.com/rqd/async";

    /* renamed from: b */
    public static String f3270b = "https://android.bugly.qq.com/rqd/async";

    /* renamed from: c */
    public static String f3271c;

    /* renamed from: d */
    public long f3272d;

    /* renamed from: e */
    public long f3273e;

    /* renamed from: f */
    public boolean f3274f;

    /* renamed from: g */
    public boolean f3275g;

    /* renamed from: h */
    public boolean f3276h;

    /* renamed from: i */
    public boolean f3277i;

    /* renamed from: j */
    public boolean f3278j;

    /* renamed from: k */
    public boolean f3279k;

    /* renamed from: l */
    public boolean f3280l;

    /* renamed from: m */
    public boolean f3281m;

    /* renamed from: n */
    public boolean f3282n;

    /* renamed from: o */
    public long f3283o;

    /* renamed from: p */
    public long f3284p;

    /* renamed from: q */
    public String f3285q;

    /* renamed from: r */
    public String f3286r;

    /* renamed from: s */
    public String f3287s;

    /* renamed from: t */
    public Map<String, String> f3288t;

    /* renamed from: u */
    public int f3289u;

    /* renamed from: v */
    public long f3290v;

    /* renamed from: w */
    public long f3291w;

    public StrategyBean() {
        this.f3272d = -1L;
        this.f3273e = -1L;
        this.f3274f = true;
        this.f3275g = true;
        this.f3276h = true;
        this.f3277i = true;
        this.f3278j = false;
        this.f3279k = true;
        this.f3280l = true;
        this.f3281m = true;
        this.f3282n = true;
        this.f3284p = 30000L;
        this.f3285q = f3269a;
        this.f3286r = f3270b;
        this.f3289u = 10;
        this.f3290v = 300000L;
        this.f3291w = -1L;
        this.f3273e = System.currentTimeMillis();
        StringBuilder sbM97v = AbstractC0037f.m97v("S(@L@L@)");
        f3271c = sbM97v.toString();
        sbM97v.setLength(0);
        sbM97v.append("*^@K#K@!");
        this.f3287s = sbM97v.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f3273e);
        parcel.writeByte(this.f3274f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3275g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3276h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f3285q);
        parcel.writeString(this.f3286r);
        parcel.writeString(this.f3287s);
        C4059ap.m3081b(parcel, this.f3288t);
        parcel.writeByte(this.f3277i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3278j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3281m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3282n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f3284p);
        parcel.writeByte(this.f3279k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3280l ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f3283o);
        parcel.writeInt(this.f3289u);
        parcel.writeLong(this.f3290v);
        parcel.writeLong(this.f3291w);
    }

    public StrategyBean(Parcel parcel) {
        this.f3272d = -1L;
        this.f3273e = -1L;
        boolean z8 = true;
        this.f3274f = true;
        this.f3275g = true;
        this.f3276h = true;
        this.f3277i = true;
        this.f3278j = false;
        this.f3279k = true;
        this.f3280l = true;
        this.f3281m = true;
        this.f3282n = true;
        this.f3284p = 30000L;
        this.f3285q = f3269a;
        this.f3286r = f3270b;
        this.f3289u = 10;
        this.f3290v = 300000L;
        this.f3291w = -1L;
        try {
            f3271c = "S(@L@L@)";
            this.f3273e = parcel.readLong();
            this.f3274f = parcel.readByte() == 1;
            this.f3275g = parcel.readByte() == 1;
            this.f3276h = parcel.readByte() == 1;
            this.f3285q = parcel.readString();
            this.f3286r = parcel.readString();
            this.f3287s = parcel.readString();
            this.f3288t = C4059ap.m3079b(parcel);
            this.f3277i = parcel.readByte() == 1;
            this.f3278j = parcel.readByte() == 1;
            this.f3281m = parcel.readByte() == 1;
            this.f3282n = parcel.readByte() == 1;
            this.f3284p = parcel.readLong();
            this.f3279k = parcel.readByte() == 1;
            if (parcel.readByte() != 1) {
                z8 = false;
            }
            this.f3280l = z8;
            this.f3283o = parcel.readLong();
            this.f3289u = parcel.readInt();
            this.f3290v = parcel.readLong();
            this.f3291w = parcel.readLong();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
