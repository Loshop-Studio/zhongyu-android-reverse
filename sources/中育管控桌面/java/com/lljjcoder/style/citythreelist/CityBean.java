package com.lljjcoder.style.citythreelist;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class CityBean implements Parcelable {
    public static final Parcelable.Creator<CityBean> CREATOR = new Parcelable.Creator<CityBean>() { // from class: com.lljjcoder.style.citythreelist.CityBean.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CityBean createFromParcel(Parcel parcel) {
            return new CityBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CityBean[] newArray(int i6) {
            return new CityBean[i6];
        }
    };

    /* renamed from: id */
    private String f3683id;
    private String name;

    public CityBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getId() {
        String str = this.f3683id;
        return str == null ? "" : str;
    }

    public String getName() {
        String str = this.name;
        return str == null ? "" : str;
    }

    public void setId(String str) {
        this.f3683id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f3683id);
        parcel.writeString(this.name);
    }

    public CityBean(Parcel parcel) {
        this.f3683id = parcel.readString();
        this.name = parcel.readString();
    }
}
