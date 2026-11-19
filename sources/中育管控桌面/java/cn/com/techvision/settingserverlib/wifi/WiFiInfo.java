package cn.com.techvision.settingserverlib.wifi;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class WiFiInfo implements Parcelable {
    public static final Parcelable.Creator<WiFiInfo> CREATOR = new C4544a();

    /* renamed from: a */
    public String f1430a;

    /* renamed from: b */
    public int f1431b;

    /* renamed from: c */
    public CipherType f1432c;

    /* renamed from: d */
    public SSIDState f1433d;

    /* renamed from: e */
    public boolean f1434e;

    /* renamed from: cn.com.techvision.settingserverlib.wifi.WiFiInfo$a */
    public class C4544a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WiFiInfo createFromParcel(Parcel parcel) {
            return new WiFiInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public WiFiInfo[] newArray(int i6) {
            return new WiFiInfo[i6];
        }
    }

    public WiFiInfo(Parcel parcel) {
        this.f1430a = parcel.readString();
        this.f1431b = parcel.readInt();
        this.f1432c = (CipherType) parcel.readParcelable(CipherType.class.getClassLoader());
        this.f1433d = (SSIDState) parcel.readParcelable(SSIDState.class.getClassLoader());
        this.f1434e = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f1430a);
        parcel.writeInt(this.f1431b);
        parcel.writeParcelable(this.f1432c, i6);
        parcel.writeParcelable(this.f1433d, i6);
        parcel.writeByte(this.f1434e ? (byte) 1 : (byte) 0);
    }
}
