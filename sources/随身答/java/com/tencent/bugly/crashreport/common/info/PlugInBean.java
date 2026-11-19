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
        public final /* bridge */ /* synthetic */ PlugInBean[] newArray(int i9) {
            return new PlugInBean[i9];
        }
    };

    /* renamed from: a */
    public final String f5609a;

    /* renamed from: b */
    public final String f5610b;

    /* renamed from: c */
    public final String f5611c;

    public PlugInBean(String str, String str2, String str3) {
        this.f5609a = str;
        this.f5610b = str2;
        this.f5611c = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "plid:" + this.f5609a + " plV:" + this.f5610b + " plUUID:" + this.f5611c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f5609a);
        parcel.writeString(this.f5610b);
        parcel.writeString(this.f5611c);
    }

    public PlugInBean(Parcel parcel) {
        this.f5609a = parcel.readString();
        this.f5610b = parcel.readString();
        this.f5611c = parcel.readString();
    }
}
