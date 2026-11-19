package p070b.p146d.p147a.p150d.p151c;

import android.os.Parcel;
import android.os.Parcelable;
import io.github.inflationx.calligraphy3.BuildConfig;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: b.d.a.d.c.a */
/* loaded from: classes.dex */
public class C0891a implements Parcelable {
    public static final Parcelable.Creator<C0891a> CREATOR = new a();

    /* renamed from: b */
    public EnumC0892b f4730b;

    /* renamed from: c */
    public String f4731c;

    /* renamed from: d */
    public String f4732d;

    /* renamed from: e */
    public String f4733e;

    /* renamed from: f */
    public String f4734f;

    /* renamed from: b.d.a.d.c.a$a */
    public class a implements Parcelable.Creator<C0891a> {
        @Override // android.os.Parcelable.Creator
        public C0891a createFromParcel(Parcel parcel) {
            return new C0891a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0891a[] newArray(int i) {
            return new C0891a[i];
        }
    }

    public C0891a() {
        this.f4730b = EnumC0892b.LOGOUT;
        this.f4731c = BuildConfig.FLAVOR;
        this.f4732d = BuildConfig.FLAVOR;
        this.f4733e = BuildConfig.FLAVOR;
        this.f4734f = BuildConfig.FLAVOR;
    }

    public C0891a(Parcel parcel) {
        int i = parcel.readInt();
        this.f4730b = i == -1 ? null : EnumC0892b.values()[i];
        this.f4731c = parcel.readString();
        this.f4732d = parcel.readString();
        this.f4733e = parcel.readString();
        this.f4734f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbM2079g = C0561a.m2079g("ServerInfo{status=");
        sbM2079g.append(this.f4730b);
        sbM2079g.append(", serverUrl='");
        sbM2079g.append(this.f4731c);
        sbM2079g.append('\'');
        sbM2079g.append(", token='");
        sbM2079g.append(this.f4732d);
        sbM2079g.append('\'');
        sbM2079g.append(", imToken='");
        sbM2079g.append(this.f4733e);
        sbM2079g.append('\'');
        sbM2079g.append(", webServerUrl='");
        sbM2079g.append(this.f4734f);
        sbM2079g.append('\'');
        sbM2079g.append('}');
        return sbM2079g.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        EnumC0892b enumC0892b = this.f4730b;
        parcel.writeInt(enumC0892b == null ? -1 : enumC0892b.ordinal());
        parcel.writeString(this.f4731c);
        parcel.writeString(this.f4732d);
        parcel.writeString(this.f4733e);
        parcel.writeString(this.f4734f);
    }
}
