package com.tencent.bugly.crashreport.common.info;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public class PlugInBean implements Parcelable {
    public static final Parcelable.Creator<PlugInBean> CREATOR = new C7758a();

    /* renamed from: a */
    public final String f13474a;

    /* renamed from: b */
    public final String f13475b;

    /* renamed from: c */
    public final String f13476c;

    /* renamed from: com.tencent.bugly.crashreport.common.info.PlugInBean$a */
    public static class C7758a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new PlugInBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
            return new PlugInBean[i10];
        }
    }

    public PlugInBean(String str, String str2, String str3) {
        this.f13474a = str;
        this.f13475b = str2;
        this.f13476c = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "plid:" + this.f13474a + " plV:" + this.f13475b + " plUUID:" + this.f13476c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13474a);
        parcel.writeString(this.f13475b);
        parcel.writeString(this.f13476c);
    }

    public PlugInBean(Parcel parcel) {
        this.f13474a = parcel.readString();
        this.f13475b = parcel.readString();
        this.f13476c = parcel.readString();
    }
}
