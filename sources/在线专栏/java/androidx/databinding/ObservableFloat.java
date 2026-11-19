package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableFloat extends AbstractC0402b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new C0389a();

    /* renamed from: a */
    private float f2869a;

    /* renamed from: androidx.databinding.ObservableFloat$a */
    static class C0389a implements Parcelable.Creator<ObservableFloat> {
        C0389a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableFloat createFromParcel(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableFloat[] newArray(int i4) {
            return new ObservableFloat[i4];
        }
    }

    public ObservableFloat(float f4) {
        this.f2869a = f4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeFloat(this.f2869a);
    }

    public ObservableFloat() {
    }
}
