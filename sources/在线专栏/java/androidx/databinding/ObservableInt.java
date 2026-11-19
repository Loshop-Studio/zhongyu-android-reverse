package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableInt extends AbstractC0402b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableInt> CREATOR = new C0390a();

    /* renamed from: a */
    private int f2870a;

    /* renamed from: androidx.databinding.ObservableInt$a */
    static class C0390a implements Parcelable.Creator<ObservableInt> {
        C0390a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableInt createFromParcel(Parcel parcel) {
            return new ObservableInt(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableInt[] newArray(int i4) {
            return new ObservableInt[i4];
        }
    }

    public ObservableInt(int i4) {
        this.f2870a = i4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f2870a);
    }

    public ObservableInt() {
    }
}
