package cn.com.techvision.settingserverlib.wifi;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public enum WiFiState implements Parcelable {
    DISABLED(0),
    DISABLING(1),
    ENABLED(2),
    ENABLING(3),
    UNKNOWN(4);

    public static final Parcelable.Creator<WiFiState> CREATOR = new Parcelable.Creator() { // from class: cn.com.techvision.settingserverlib.wifi.WiFiState.a
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WiFiState createFromParcel(Parcel parcel) {
            return WiFiState.values()[parcel.readInt()];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public WiFiState[] newArray(int i6) {
            return new WiFiState[i6];
        }
    };

    /* renamed from: a */
    public final int f1443a;

    WiFiState(int i6) {
        this.f1443a = i6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f1443a);
    }
}
