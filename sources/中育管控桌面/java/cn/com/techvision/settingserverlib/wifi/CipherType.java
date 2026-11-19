package cn.com.techvision.settingserverlib.wifi;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public enum CipherType implements Parcelable {
    WPA(0),
    WEP(1),
    OPEN(2);

    public static final Parcelable.Creator<CipherType> CREATOR = new Parcelable.Creator() { // from class: cn.com.techvision.settingserverlib.wifi.CipherType.a
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CipherType createFromParcel(Parcel parcel) {
            return CipherType.values()[parcel.readInt()];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CipherType[] newArray(int i6) {
            return new CipherType[i6];
        }
    };

    /* renamed from: a */
    public final int f1420a;

    CipherType(int i6) {
        this.f1420a = i6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f1420a);
    }
}
