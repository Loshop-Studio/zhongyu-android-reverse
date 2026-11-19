package p000a.p049j.p050a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.j.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0287a implements Parcelable {

    /* renamed from: b */
    public final Parcelable f1718b;

    /* renamed from: c */
    public static final AbstractC0287a f1717c = new a();
    public static final Parcelable.Creator<AbstractC0287a> CREATOR = new b();

    /* renamed from: a.j.a.a$a */
    public static class a extends AbstractC0287a {
        public a() {
            super((a) null);
        }
    }

    /* renamed from: a.j.a.a$b */
    public static class b implements Parcelable.ClassLoaderCreator<AbstractC0287a> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return AbstractC0287a.f1717c;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new AbstractC0287a[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public AbstractC0287a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC0287a.f1717c;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public AbstractC0287a(a aVar) {
        this.f1718b = null;
    }

    public AbstractC0287a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f1718b = parcelable == null ? f1717c : parcelable;
    }

    public AbstractC0287a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f1718b = parcelable == f1717c ? null : parcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1718b, i);
    }
}
