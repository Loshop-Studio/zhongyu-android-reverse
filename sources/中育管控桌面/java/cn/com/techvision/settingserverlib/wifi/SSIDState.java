package cn.com.techvision.settingserverlib.wifi;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public enum SSIDState implements Parcelable {
    CONNECTED(0),
    CONNECTING(1),
    DISCONNECTING(2),
    DISCONNECTED(3),
    SUSPENDED(4),
    SAVED(5),
    NONE(6);

    public static final Parcelable.Creator<SSIDState> CREATOR = new Parcelable.Creator() { // from class: cn.com.techvision.settingserverlib.wifi.SSIDState.a
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SSIDState createFromParcel(Parcel parcel) {
            return SSIDState.values()[parcel.readInt()];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SSIDState[] newArray(int i6) {
            return new SSIDState[i6];
        }
    };

    /* renamed from: a */
    public final int f1429a;

    SSIDState(int i6) {
        this.f1429a = i6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f1429a);
    }
}
