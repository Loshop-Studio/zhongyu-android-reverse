package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableChar extends AbstractC0402b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableChar> CREATOR = new C0387a();

    /* renamed from: a */
    private char f2867a;

    /* renamed from: androidx.databinding.ObservableChar$a */
    static class C0387a implements Parcelable.Creator<ObservableChar> {
        C0387a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableChar createFromParcel(Parcel parcel) {
            return new ObservableChar((char) parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableChar[] newArray(int i4) {
            return new ObservableChar[i4];
        }
    }

    public ObservableChar(char c4) {
        this.f2867a = c4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f2867a);
    }

    public ObservableChar() {
    }
}
