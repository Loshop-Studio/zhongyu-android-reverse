package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableLong extends AbstractC0402b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableLong> CREATOR = new C0391a();

    /* renamed from: a */
    private long f2871a;

    /* renamed from: androidx.databinding.ObservableLong$a */
    static class C0391a implements Parcelable.Creator<ObservableLong> {
        C0391a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableLong createFromParcel(Parcel parcel) {
            return new ObservableLong(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableLong[] newArray(int i4) {
            return new ObservableLong[i4];
        }
    }

    public ObservableLong(long j4) {
        this.f2871a = j4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f2871a);
    }

    public ObservableLong() {
    }
}
