package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableByte extends AbstractC0402b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableByte> CREATOR = new C0386a();

    /* renamed from: a */
    private byte f2866a;

    /* renamed from: androidx.databinding.ObservableByte$a */
    static class C0386a implements Parcelable.Creator<ObservableByte> {
        C0386a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableByte createFromParcel(Parcel parcel) {
            return new ObservableByte(parcel.readByte());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableByte[] newArray(int i4) {
            return new ObservableByte[i4];
        }
    }

    public ObservableByte(byte b4) {
        this.f2866a = b4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeByte(this.f2866a);
    }

    public ObservableByte() {
    }
}
