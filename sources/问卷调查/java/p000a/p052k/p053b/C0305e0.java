package p000a.p052k.p053b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p000a.p052k.p053b.AbstractC0301c0;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: a.k.b.e0 */
/* loaded from: classes.dex */
public final class C0305e0 implements Parcelable {
    public static final Parcelable.Creator<C0305e0> CREATOR = new a();

    /* renamed from: b */
    public ArrayList<C0313i0> f1854b;

    /* renamed from: c */
    public ArrayList<String> f1855c;

    /* renamed from: d */
    public C0297b[] f1856d;

    /* renamed from: e */
    public int f1857e;

    /* renamed from: f */
    public String f1858f;

    /* renamed from: g */
    public ArrayList<String> f1859g;

    /* renamed from: h */
    public ArrayList<Bundle> f1860h;

    /* renamed from: i */
    public ArrayList<AbstractC0301c0.k> f1861i;

    /* renamed from: a.k.b.e0$a */
    public class a implements Parcelable.Creator<C0305e0> {
        @Override // android.os.Parcelable.Creator
        public C0305e0 createFromParcel(Parcel parcel) {
            return new C0305e0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0305e0[] newArray(int i) {
            return new C0305e0[i];
        }
    }

    public C0305e0() {
        this.f1858f = null;
        this.f1859g = new ArrayList<>();
        this.f1860h = new ArrayList<>();
    }

    public C0305e0(Parcel parcel) {
        this.f1858f = null;
        this.f1859g = new ArrayList<>();
        this.f1860h = new ArrayList<>();
        this.f1854b = parcel.createTypedArrayList(C0313i0.CREATOR);
        this.f1855c = parcel.createStringArrayList();
        this.f1856d = (C0297b[]) parcel.createTypedArray(C0297b.CREATOR);
        this.f1857e = parcel.readInt();
        this.f1858f = parcel.readString();
        this.f1859g = parcel.createStringArrayList();
        this.f1860h = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f1861i = parcel.createTypedArrayList(AbstractC0301c0.k.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f1854b);
        parcel.writeStringList(this.f1855c);
        parcel.writeTypedArray(this.f1856d, i);
        parcel.writeInt(this.f1857e);
        parcel.writeString(this.f1858f);
        parcel.writeStringList(this.f1859g);
        parcel.writeTypedList(this.f1860h);
        parcel.writeTypedList(this.f1861i);
    }
}
