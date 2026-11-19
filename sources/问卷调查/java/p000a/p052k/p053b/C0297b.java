package p000a.p052k.p053b;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p000a.p052k.p053b.AbstractC0319l0;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: a.k.b.b */
/* loaded from: classes.dex */
public final class C0297b implements Parcelable {
    public static final Parcelable.Creator<C0297b> CREATOR = new a();

    /* renamed from: b */
    public final int[] f1768b;

    /* renamed from: c */
    public final ArrayList<String> f1769c;

    /* renamed from: d */
    public final int[] f1770d;

    /* renamed from: e */
    public final int[] f1771e;

    /* renamed from: f */
    public final int f1772f;

    /* renamed from: g */
    public final String f1773g;

    /* renamed from: h */
    public final int f1774h;

    /* renamed from: i */
    public final int f1775i;

    /* renamed from: j */
    public final CharSequence f1776j;

    /* renamed from: k */
    public final int f1777k;

    /* renamed from: l */
    public final CharSequence f1778l;

    /* renamed from: m */
    public final ArrayList<String> f1779m;

    /* renamed from: n */
    public final ArrayList<String> f1780n;

    /* renamed from: o */
    public final boolean f1781o;

    /* renamed from: a.k.b.b$a */
    public class a implements Parcelable.Creator<C0297b> {
        @Override // android.os.Parcelable.Creator
        public C0297b createFromParcel(Parcel parcel) {
            return new C0297b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0297b[] newArray(int i) {
            return new C0297b[i];
        }
    }

    public C0297b(C0294a c0294a) {
        int size = c0294a.f1933a.size();
        this.f1768b = new int[size * 5];
        if (!c0294a.f1939g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1769c = new ArrayList<>(size);
        this.f1770d = new int[size];
        this.f1771e = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            AbstractC0319l0.a aVar = c0294a.f1933a.get(i);
            int i3 = i2 + 1;
            this.f1768b[i2] = aVar.f1948a;
            ArrayList<String> arrayList = this.f1769c;
            ComponentCallbacksC0320m componentCallbacksC0320m = aVar.f1949b;
            arrayList.add(componentCallbacksC0320m != null ? componentCallbacksC0320m.f1982g : null);
            int[] iArr = this.f1768b;
            int i4 = i3 + 1;
            iArr[i3] = aVar.f1950c;
            int i5 = i4 + 1;
            iArr[i4] = aVar.f1951d;
            int i6 = i5 + 1;
            iArr[i5] = aVar.f1952e;
            iArr[i6] = aVar.f1953f;
            this.f1770d[i] = aVar.f1954g.ordinal();
            this.f1771e[i] = aVar.f1955h.ordinal();
            i++;
            i2 = i6 + 1;
        }
        this.f1772f = c0294a.f1938f;
        this.f1773g = c0294a.f1940h;
        this.f1774h = c0294a.f1764r;
        this.f1775i = c0294a.f1941i;
        this.f1776j = c0294a.f1942j;
        this.f1777k = c0294a.f1943k;
        this.f1778l = c0294a.f1944l;
        this.f1779m = c0294a.f1945m;
        this.f1780n = c0294a.f1946n;
        this.f1781o = c0294a.f1947o;
    }

    public C0297b(Parcel parcel) {
        this.f1768b = parcel.createIntArray();
        this.f1769c = parcel.createStringArrayList();
        this.f1770d = parcel.createIntArray();
        this.f1771e = parcel.createIntArray();
        this.f1772f = parcel.readInt();
        this.f1773g = parcel.readString();
        this.f1774h = parcel.readInt();
        this.f1775i = parcel.readInt();
        this.f1776j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1777k = parcel.readInt();
        this.f1778l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1779m = parcel.createStringArrayList();
        this.f1780n = parcel.createStringArrayList();
        this.f1781o = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1768b);
        parcel.writeStringList(this.f1769c);
        parcel.writeIntArray(this.f1770d);
        parcel.writeIntArray(this.f1771e);
        parcel.writeInt(this.f1772f);
        parcel.writeString(this.f1773g);
        parcel.writeInt(this.f1774h);
        parcel.writeInt(this.f1775i);
        TextUtils.writeToParcel(this.f1776j, parcel, 0);
        parcel.writeInt(this.f1777k);
        TextUtils.writeToParcel(this.f1778l, parcel, 0);
        parcel.writeStringList(this.f1779m);
        parcel.writeStringList(this.f1780n);
        parcel.writeInt(this.f1781o ? 1 : 0);
    }
}
