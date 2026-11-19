package com.tencent.bugly.crashreport.common.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import com.tencent.bugly.proguard.C5795ap;
import java.util.Map;

/* loaded from: classes3.dex */
public class StrategyBean implements Parcelable {
    public static final Parcelable.Creator<StrategyBean> CREATOR = new Parcelable.Creator<StrategyBean>() { // from class: com.tencent.bugly.crashreport.common.strategy.StrategyBean.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StrategyBean createFromParcel(Parcel parcel) {
            return new StrategyBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StrategyBean[] newArray(int i6) {
            return new StrategyBean[i6];
        }
    };

    /* renamed from: a */
    public static String f3756a = "https://android.bugly.qq.com/rqd/async";

    /* renamed from: b */
    public static String f3757b = "https://android.bugly.qq.com/rqd/async";

    /* renamed from: c */
    public static String f3758c;

    /* renamed from: d */
    public long f3759d;

    /* renamed from: e */
    public long f3760e;

    /* renamed from: f */
    public boolean f3761f;

    /* renamed from: g */
    public boolean f3762g;

    /* renamed from: h */
    public boolean f3763h;

    /* renamed from: i */
    public boolean f3764i;

    /* renamed from: j */
    public boolean f3765j;

    /* renamed from: k */
    public boolean f3766k;

    /* renamed from: l */
    public boolean f3767l;

    /* renamed from: m */
    public boolean f3768m;

    /* renamed from: n */
    public boolean f3769n;

    /* renamed from: o */
    public long f3770o;

    /* renamed from: p */
    public long f3771p;

    /* renamed from: q */
    public String f3772q;

    /* renamed from: r */
    public String f3773r;

    /* renamed from: s */
    public String f3774s;

    /* renamed from: t */
    public Map<String, String> f3775t;

    /* renamed from: u */
    public int f3776u;

    /* renamed from: v */
    public long f3777v;

    /* renamed from: w */
    public long f3778w;

    public StrategyBean() {
        this.f3759d = -1L;
        this.f3760e = -1L;
        this.f3761f = true;
        this.f3762g = true;
        this.f3763h = true;
        this.f3764i = true;
        this.f3765j = false;
        this.f3766k = true;
        this.f3767l = true;
        this.f3768m = true;
        this.f3769n = true;
        this.f3771p = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.f3772q = f3756a;
        this.f3773r = f3757b;
        this.f3776u = 10;
        this.f3777v = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        this.f3778w = -1L;
        this.f3760e = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("S(@L@L@)");
        f3758c = sb.toString();
        sb.setLength(0);
        sb.append("*^@K#K@!");
        this.f3774s = sb.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeLong(this.f3760e);
        parcel.writeByte(this.f3761f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3762g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3763h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f3772q);
        parcel.writeString(this.f3773r);
        parcel.writeString(this.f3774s);
        C5795ap.m3988b(parcel, this.f3775t);
        parcel.writeByte(this.f3764i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3765j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3768m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3769n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f3771p);
        parcel.writeByte(this.f3766k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f3767l ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f3770o);
        parcel.writeInt(this.f3776u);
        parcel.writeLong(this.f3777v);
        parcel.writeLong(this.f3778w);
    }

    public StrategyBean(Parcel parcel) {
        this.f3759d = -1L;
        this.f3760e = -1L;
        boolean z6 = true;
        this.f3761f = true;
        this.f3762g = true;
        this.f3763h = true;
        this.f3764i = true;
        this.f3765j = false;
        this.f3766k = true;
        this.f3767l = true;
        this.f3768m = true;
        this.f3769n = true;
        this.f3771p = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        this.f3772q = f3756a;
        this.f3773r = f3757b;
        this.f3776u = 10;
        this.f3777v = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        this.f3778w = -1L;
        try {
            f3758c = "S(@L@L@)";
            this.f3760e = parcel.readLong();
            this.f3761f = parcel.readByte() == 1;
            this.f3762g = parcel.readByte() == 1;
            this.f3763h = parcel.readByte() == 1;
            this.f3772q = parcel.readString();
            this.f3773r = parcel.readString();
            this.f3774s = parcel.readString();
            this.f3775t = C5795ap.m3986b(parcel);
            this.f3764i = parcel.readByte() == 1;
            this.f3765j = parcel.readByte() == 1;
            this.f3768m = parcel.readByte() == 1;
            this.f3769n = parcel.readByte() == 1;
            this.f3771p = parcel.readLong();
            this.f3766k = parcel.readByte() == 1;
            if (parcel.readByte() != 1) {
                z6 = false;
            }
            this.f3767l = z6;
            this.f3770o = parcel.readLong();
            this.f3776u = parcel.readInt();
            this.f3777v = parcel.readLong();
            this.f3778w = parcel.readLong();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }
}
