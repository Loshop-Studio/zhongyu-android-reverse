package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableBoolean extends AbstractC0402b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new C0385a();

    /* renamed from: a */
    private boolean f2865a;

    /* renamed from: androidx.databinding.ObservableBoolean$a */
    static class C0385a implements Parcelable.Creator<ObservableBoolean> {
        C0385a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableBoolean createFromParcel(Parcel parcel) {
            return new ObservableBoolean(parcel.readInt() == 1);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableBoolean[] newArray(int i4) {
            return new ObservableBoolean[i4];
        }
    }

    public ObservableBoolean(boolean z3) {
        this.f2865a = z3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f2865a ? 1 : 0);
    }

    public ObservableBoolean() {
    }
}
