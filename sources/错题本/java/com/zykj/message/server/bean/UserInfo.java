package com.zykj.message.server.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0038g;

/* loaded from: classes3.dex */
public class UserInfo implements Parcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new C0038g(13);

    /* renamed from: a */
    public Long f5734a;

    /* renamed from: b */
    public String f5735b;

    /* renamed from: c */
    public String f5736c;

    /* renamed from: d */
    public String f5737d;

    /* renamed from: e */
    public String f5738e;

    /* renamed from: f */
    public String f5739f;

    /* renamed from: g */
    public Integer f5740g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "UserInfo{id=" + this.f5734a + ", schoolCode='" + this.f5735b + "', userName='" + this.f5736c + "', realName='" + this.f5737d + "', password='" + this.f5738e + "', photo='" + this.f5739f + "', role=" + this.f5740g + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f5734a);
        parcel.writeString(this.f5735b);
        parcel.writeString(this.f5736c);
        parcel.writeString(this.f5737d);
        parcel.writeString(this.f5738e);
        parcel.writeString(this.f5739f);
        parcel.writeInt(this.f5740g.intValue());
    }
}
