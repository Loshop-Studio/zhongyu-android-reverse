package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableShort extends AbstractC0402b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableShort> CREATOR = new C0393a();

    /* renamed from: a */
    private short f2872a;

    /* renamed from: androidx.databinding.ObservableShort$a */
    static class C0393a implements Parcelable.Creator<ObservableShort> {
        C0393a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableShort createFromParcel(Parcel parcel) {
            return new ObservableShort((short) parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableShort[] newArray(int i4) {
            return new ObservableShort[i4];
        }
    }

    public ObservableShort(short s3) {
        this.f2872a = s3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f2872a);
    }

    public ObservableShort() {
    }
}
