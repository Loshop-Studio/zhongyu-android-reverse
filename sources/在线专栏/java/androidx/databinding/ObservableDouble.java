package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableDouble extends AbstractC0402b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new C0388a();

    /* renamed from: a */
    private double f2868a;

    /* renamed from: androidx.databinding.ObservableDouble$a */
    static class C0388a implements Parcelable.Creator<ObservableDouble> {
        C0388a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableDouble createFromParcel(Parcel parcel) {
            return new ObservableDouble(parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableDouble[] newArray(int i4) {
            return new ObservableDouble[i4];
        }
    }

    public ObservableDouble(double d4) {
        this.f2868a = d4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeDouble(this.f2868a);
    }

    public ObservableDouble() {
    }
}
