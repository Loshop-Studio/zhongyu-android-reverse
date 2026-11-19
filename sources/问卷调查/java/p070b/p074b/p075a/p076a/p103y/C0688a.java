package p070b.p074b.p075a.p076a.p103y;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000a.p021e.C0136h;
import p000a.p049j.p050a.AbstractC0287a;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: b.b.a.a.y.a */
/* loaded from: classes.dex */
public class C0688a extends AbstractC0287a {
    public static final Parcelable.Creator<C0688a> CREATOR = new a();

    /* renamed from: d */
    public final C0136h<String, Bundle> f4115d;

    /* renamed from: b.b.a.a.y.a$a */
    public static class a implements Parcelable.ClassLoaderCreator<C0688a> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new C0688a(parcel, null, null);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C0688a[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public C0688a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C0688a(parcel, classLoader, null);
        }
    }

    public C0688a(Parcel parcel, ClassLoader classLoader, a aVar) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f4115d = new C0136h<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f4115d.put(strArr[i2], bundleArr[i2]);
        }
    }

    public String toString() {
        StringBuilder sbM2079g = C0561a.m2079g("ExtendableSavedState{");
        sbM2079g.append(Integer.toHexString(System.identityHashCode(this)));
        sbM2079g.append(" states=");
        sbM2079g.append(this.f4115d);
        sbM2079g.append("}");
        return sbM2079g.toString();
    }

    @Override // p000a.p049j.p050a.AbstractC0287a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1718b, i);
        int i2 = this.f4115d.f950d;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = this.f4115d.m514h(i3);
            bundleArr[i3] = this.f4115d.m517k(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
