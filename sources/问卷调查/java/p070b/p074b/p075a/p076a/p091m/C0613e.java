package p070b.p074b.p075a.p076a.p091m;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p070b.p074b.p075a.p076a.p091m.C0606a;

/* renamed from: b.b.a.a.m.e */
/* loaded from: classes.dex */
public class C0613e implements C0606a.c {
    public static final Parcelable.Creator<C0613e> CREATOR = new a();

    /* renamed from: b */
    public final long f3733b;

    /* renamed from: b.b.a.a.m.e$a */
    public static class a implements Parcelable.Creator<C0613e> {
        @Override // android.os.Parcelable.Creator
        public C0613e createFromParcel(Parcel parcel) {
            return new C0613e(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        public C0613e[] newArray(int i) {
            return new C0613e[i];
        }
    }

    public C0613e(long j) {
        this.f3733b = j;
    }

    public C0613e(long j, a aVar) {
        this.f3733b = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0613e) && this.f3733b == ((C0613e) obj).f3733b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3733b)});
    }

    @Override // p070b.p074b.p075a.p076a.p091m.C0606a.c
    /* renamed from: k */
    public boolean mo2176k(long j) {
        return j >= this.f3733b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f3733b);
    }
}
