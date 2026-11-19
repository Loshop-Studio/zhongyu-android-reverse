package com.aliyun.ams.emas.push.notification;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class CPushMessage implements Parcelable {
    public static final Parcelable.Creator<CPushMessage> CREATOR = new C1205a();

    /* renamed from: a */
    private String f6950a;

    /* renamed from: b */
    private String f6951b;

    /* renamed from: c */
    private String f6952c;

    /* renamed from: d */
    private String f6953d;

    /* renamed from: e */
    private String f6954e;

    /* synthetic */ CPushMessage(Parcel parcel, C1205a c1205a) {
        this(parcel);
    }

    /* renamed from: a */
    public String m5401a() {
        return this.f6951b;
    }

    /* renamed from: b */
    public String m5402b() {
        return this.f6953d;
    }

    /* renamed from: c */
    public String m5403c() {
        return this.f6950a;
    }

    /* renamed from: d */
    public String m5404d() {
        return this.f6952c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String m5405e() {
        return this.f6954e;
    }

    /* renamed from: f */
    public void m5406f(String str) {
        this.f6951b = str;
    }

    /* renamed from: g */
    public void m5407g(String str) {
        this.f6953d = str;
    }

    /* renamed from: h */
    public void m5408h(String str) {
        this.f6950a = str;
    }

    /* renamed from: i */
    public void m5409i(String str) {
        this.f6952c = str;
    }

    /* renamed from: j */
    public void m5410j(String str) {
        this.f6954e = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f6951b);
        parcel.writeString(this.f6950a);
        parcel.writeString(this.f6952c);
        parcel.writeString(this.f6953d);
        parcel.writeString(this.f6954e);
    }

    public CPushMessage() {
    }

    private CPushMessage(Parcel parcel) {
        this.f6951b = parcel.readString();
        this.f6950a = parcel.readString();
        this.f6952c = parcel.readString();
        this.f6953d = parcel.readString();
        this.f6954e = parcel.readString();
    }
}
