package com.tencent.bugly.crashreport.common.info;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class PlugInBean implements Parcelable {
    public static final Parcelable.Creator<PlugInBean> CREATOR = new Parcelable.Creator<PlugInBean>() { // from class: com.tencent.bugly.crashreport.common.info.PlugInBean.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PlugInBean createFromParcel(Parcel parcel) {
            return new PlugInBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PlugInBean[] newArray(int i10) {
            return new PlugInBean[i10];
        }
    };

    /* renamed from: a */
    public final String f4375a;

    /* renamed from: b */
    public final String f4376b;

    /* renamed from: c */
    public final String f4377c;

    public PlugInBean(String str, String str2, String str3) {
        this.f4375a = str;
        this.f4376b = str2;
        this.f4377c = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "plid:" + this.f4375a + " plV:" + this.f4376b + " plUUID:" + this.f4377c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4375a);
        parcel.writeString(this.f4376b);
        parcel.writeString(this.f4377c);
    }

    public PlugInBean(Parcel parcel) {
        this.f4375a = parcel.readString();
        this.f4376b = parcel.readString();
        this.f4377c = parcel.readString();
    }
}
