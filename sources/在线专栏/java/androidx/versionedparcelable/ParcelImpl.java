package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import p161v0.InterfaceC3417a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0763a();

    /* renamed from: a */
    private final InterfaceC3417a f4595a;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C0763a implements Parcelable.Creator<ParcelImpl> {
        C0763a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelImpl[] newArray(int i4) {
            return new ParcelImpl[i4];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f4595a = new C0765b(parcel).m4030u();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new C0765b(parcel).m4011L(this.f4595a);
    }
}
