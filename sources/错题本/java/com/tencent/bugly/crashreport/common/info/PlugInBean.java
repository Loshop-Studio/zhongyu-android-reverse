package com.tencent.bugly.crashreport.common.info;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0038g;

/* loaded from: classes3.dex */
public class PlugInBean implements Parcelable {
    public static final Parcelable.Creator<PlugInBean> CREATOR = new C0038g(15);

    /* renamed from: a */
    public final String f3266a;

    /* renamed from: b */
    public final String f3267b;

    /* renamed from: c */
    public final String f3268c;

    public PlugInBean(String str, String str2, String str3) {
        this.f3266a = str;
        this.f3267b = str2;
        this.f3268c = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "plid:" + this.f3266a + " plV:" + this.f3267b + " plUUID:" + this.f3268c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3266a);
        parcel.writeString(this.f3267b);
        parcel.writeString(this.f3268c);
    }

    public PlugInBean(Parcel parcel) {
        this.f3266a = parcel.readString();
        this.f3267b = parcel.readString();
        this.f3268c = parcel.readString();
    }
}
