package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ObservableParcelable<T extends Parcelable> extends C0405e<T> implements Parcelable {
    public static final Parcelable.Creator<ObservableParcelable> CREATOR = new C0392a();

    /* renamed from: androidx.databinding.ObservableParcelable$a */
    static class C0392a implements Parcelable.Creator<ObservableParcelable> {
        C0392a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableParcelable createFromParcel(Parcel parcel) {
            return new ObservableParcelable(parcel.readParcelable(C0392a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableParcelable[] newArray(int i4) {
            return new ObservableParcelable[i4];
        }
    }

    public ObservableParcelable(T t3) {
        super(t3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(m2308a(), 0);
    }

    public ObservableParcelable() {
    }
}
