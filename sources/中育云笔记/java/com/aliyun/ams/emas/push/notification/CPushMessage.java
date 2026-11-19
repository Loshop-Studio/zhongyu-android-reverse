package com.aliyun.ams.emas.push.notification;

import android.os.Parcel;
import android.os.Parcelable;
import p124e0.C9064d;

/* loaded from: classes3.dex */
public class CPushMessage implements Parcelable {
    public static final Parcelable.Creator<CPushMessage> CREATOR = new C9064d();

    /* renamed from: c */
    public String f4537c;

    /* renamed from: d */
    public String f4538d;

    /* renamed from: e */
    public String f4539e;

    /* renamed from: f */
    public String f4540f;

    /* renamed from: g */
    public String f4541g;

    public /* synthetic */ CPushMessage(Parcel parcel, C9064d c9064d) {
        this(parcel);
    }

    /* renamed from: a */
    public String m3875a() {
        return this.f4538d;
    }

    /* renamed from: b */
    public String m3876b() {
        return this.f4540f;
    }

    /* renamed from: c */
    public String m3877c() {
        return this.f4537c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public String m3878g() {
        return this.f4539e;
    }

    /* renamed from: h */
    public String m3879h() {
        return this.f4541g;
    }

    /* renamed from: i */
    public void m3880i(String str) {
        this.f4538d = str;
    }

    /* renamed from: j */
    public void m3881j(String str) {
        this.f4540f = str;
    }

    /* renamed from: k */
    public void m3882k(String str) {
        this.f4537c = str;
    }

    /* renamed from: l */
    public void m3883l(String str) {
        this.f4539e = str;
    }

    /* renamed from: m */
    public void m3884m(String str) {
        this.f4541g = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4538d);
        parcel.writeString(this.f4537c);
        parcel.writeString(this.f4539e);
        parcel.writeString(this.f4540f);
        parcel.writeString(this.f4541g);
    }

    public CPushMessage() {
    }

    public CPushMessage(Parcel parcel) {
        this.f4538d = parcel.readString();
        this.f4537c = parcel.readString();
        this.f4539e = parcel.readString();
        this.f4540f = parcel.readString();
        this.f4541g = parcel.readString();
    }
}
