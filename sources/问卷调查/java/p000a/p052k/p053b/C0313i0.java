package p000a.p052k.p053b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: a.k.b.i0 */
/* loaded from: classes.dex */
public final class C0313i0 implements Parcelable {
    public static final Parcelable.Creator<C0313i0> CREATOR = new a();

    /* renamed from: b */
    public final String f1888b;

    /* renamed from: c */
    public final String f1889c;

    /* renamed from: d */
    public final boolean f1890d;

    /* renamed from: e */
    public final int f1891e;

    /* renamed from: f */
    public final int f1892f;

    /* renamed from: g */
    public final String f1893g;

    /* renamed from: h */
    public final boolean f1894h;

    /* renamed from: i */
    public final boolean f1895i;

    /* renamed from: j */
    public final boolean f1896j;

    /* renamed from: k */
    public final Bundle f1897k;

    /* renamed from: l */
    public final boolean f1898l;

    /* renamed from: m */
    public final int f1899m;

    /* renamed from: n */
    public Bundle f1900n;

    /* renamed from: a.k.b.i0$a */
    public class a implements Parcelable.Creator<C0313i0> {
        @Override // android.os.Parcelable.Creator
        public C0313i0 createFromParcel(Parcel parcel) {
            return new C0313i0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0313i0[] newArray(int i) {
            return new C0313i0[i];
        }
    }

    public C0313i0(ComponentCallbacksC0320m componentCallbacksC0320m) {
        this.f1888b = componentCallbacksC0320m.getClass().getName();
        this.f1889c = componentCallbacksC0320m.f1982g;
        this.f1890d = componentCallbacksC0320m.f1990o;
        this.f1891e = componentCallbacksC0320m.f1999x;
        this.f1892f = componentCallbacksC0320m.f2000y;
        this.f1893g = componentCallbacksC0320m.f2001z;
        this.f1894h = componentCallbacksC0320m.f1959C;
        this.f1895i = componentCallbacksC0320m.f1989n;
        this.f1896j = componentCallbacksC0320m.f1958B;
        this.f1897k = componentCallbacksC0320m.f1983h;
        this.f1898l = componentCallbacksC0320m.f1957A;
        this.f1899m = componentCallbacksC0320m.f1971O.ordinal();
    }

    public C0313i0(Parcel parcel) {
        this.f1888b = parcel.readString();
        this.f1889c = parcel.readString();
        this.f1890d = parcel.readInt() != 0;
        this.f1891e = parcel.readInt();
        this.f1892f = parcel.readInt();
        this.f1893g = parcel.readString();
        this.f1894h = parcel.readInt() != 0;
        this.f1895i = parcel.readInt() != 0;
        this.f1896j = parcel.readInt() != 0;
        this.f1897k = parcel.readBundle();
        this.f1898l = parcel.readInt() != 0;
        this.f1900n = parcel.readBundle();
        this.f1899m = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1888b);
        sb.append(" (");
        sb.append(this.f1889c);
        sb.append(")}:");
        if (this.f1890d) {
            sb.append(" fromLayout");
        }
        if (this.f1892f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1892f));
        }
        String str = this.f1893g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1893g);
        }
        if (this.f1894h) {
            sb.append(" retainInstance");
        }
        if (this.f1895i) {
            sb.append(" removing");
        }
        if (this.f1896j) {
            sb.append(" detached");
        }
        if (this.f1898l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1888b);
        parcel.writeString(this.f1889c);
        parcel.writeInt(this.f1890d ? 1 : 0);
        parcel.writeInt(this.f1891e);
        parcel.writeInt(this.f1892f);
        parcel.writeString(this.f1893g);
        parcel.writeInt(this.f1894h ? 1 : 0);
        parcel.writeInt(this.f1895i ? 1 : 0);
        parcel.writeInt(this.f1896j ? 1 : 0);
        parcel.writeBundle(this.f1897k);
        parcel.writeInt(this.f1898l ? 1 : 0);
        parcel.writeBundle(this.f1900n);
        parcel.writeInt(this.f1899m);
    }
}
