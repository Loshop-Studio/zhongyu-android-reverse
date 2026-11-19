package p105j1;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j1.a */
/* loaded from: classes.dex */
public final class C2690a {
    /* renamed from: a */
    public static byte[] m9001a(Parcelable parcelable) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    /* renamed from: b */
    public static <T> T m9002b(byte[] bArr, Parcelable.Creator<T> creator) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return creator.createFromParcel(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }
}
