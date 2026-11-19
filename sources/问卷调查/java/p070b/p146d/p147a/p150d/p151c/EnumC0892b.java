package p070b.p146d.p147a.p150d.p151c;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.d.a.d.c.b */
/* loaded from: classes.dex */
public enum EnumC0892b implements Parcelable {
    LOGIN(1),
    LOGOUT(0),
    CRACK(-1);

    public static final Parcelable.Creator<EnumC0892b> CREATOR = new Parcelable.Creator<EnumC0892b>() { // from class: b.d.a.d.c.b.a
        @Override // android.os.Parcelable.Creator
        public EnumC0892b createFromParcel(Parcel parcel) {
            return EnumC0892b.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public EnumC0892b[] newArray(int i) {
            return new EnumC0892b[i];
        }
    };

    EnumC0892b(int i) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
