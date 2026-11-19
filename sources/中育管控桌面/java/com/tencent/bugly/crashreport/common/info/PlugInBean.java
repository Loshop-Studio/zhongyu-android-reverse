package com.tencent.bugly.crashreport.common.info;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class PlugInBean implements Parcelable {
    public static final Parcelable.Creator<PlugInBean> CREATOR = new Parcelable.Creator<PlugInBean>() { // from class: com.tencent.bugly.crashreport.common.info.PlugInBean.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PlugInBean createFromParcel(Parcel parcel) {
            return new PlugInBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PlugInBean[] newArray(int i6) {
            return new PlugInBean[i6];
        }
    };

    /* renamed from: a */
    public final String f3753a;

    /* renamed from: b */
    public final String f3754b;

    /* renamed from: c */
    public final String f3755c;

    public PlugInBean(String str, String str2, String str3) {
        this.f3753a = str;
        this.f3754b = str2;
        this.f3755c = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "plid:" + this.f3753a + " plV:" + this.f3754b + " plUUID:" + this.f3755c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f3753a);
        parcel.writeString(this.f3754b);
        parcel.writeString(this.f3755c);
    }

    public PlugInBean(Parcel parcel) {
        this.f3753a = parcel.readString();
        this.f3754b = parcel.readString();
        this.f3755c = parcel.readString();
    }
}
