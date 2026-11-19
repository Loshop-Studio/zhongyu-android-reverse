package cn.com.techvision.settingserverlib.wifi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes3.dex */
public class WiFiInformation implements Parcelable {
    public static final Parcelable.Creator<WiFiInformation> CREATOR = new C4545a();

    /* renamed from: a */
    public WiFiState f1435a;

    /* renamed from: b */
    public List f1436b;

    /* renamed from: cn.com.techvision.settingserverlib.wifi.WiFiInformation$a */
    public class C4545a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WiFiInformation createFromParcel(Parcel parcel) {
            return new WiFiInformation(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public WiFiInformation[] newArray(int i6) {
            return new WiFiInformation[i6];
        }
    }

    public WiFiInformation(Parcel parcel) {
        this.f1435a = (WiFiState) parcel.readParcelable(WiFiState.class.getClassLoader());
        this.f1436b = parcel.createTypedArrayList(WiFiInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeParcelable(this.f1435a, i6);
        parcel.writeTypedList(this.f1436b);
    }
}
