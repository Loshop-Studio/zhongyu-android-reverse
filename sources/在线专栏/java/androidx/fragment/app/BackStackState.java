package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractC0470s;
import androidx.lifecycle.AbstractC0496f;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C0412a();

    /* renamed from: a */
    final int[] f2952a;

    /* renamed from: b */
    final ArrayList<String> f2953b;

    /* renamed from: c */
    final int[] f2954c;

    /* renamed from: d */
    final int[] f2955d;

    /* renamed from: e */
    final int f2956e;

    /* renamed from: f */
    final String f2957f;

    /* renamed from: g */
    final int f2958g;

    /* renamed from: h */
    final int f2959h;

    /* renamed from: i */
    final CharSequence f2960i;

    /* renamed from: j */
    final int f2961j;

    /* renamed from: k */
    final CharSequence f2962k;

    /* renamed from: l */
    final ArrayList<String> f2963l;

    /* renamed from: m */
    final ArrayList<String> f2964m;

    /* renamed from: n */
    final boolean f2965n;

    /* renamed from: androidx.fragment.app.BackStackState$a */
    class C0412a implements Parcelable.Creator<BackStackState> {
        C0412a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackState[] newArray(int i4) {
            return new BackStackState[i4];
        }
    }

    public BackStackState(C0451a c0451a) {
        int size = c0451a.f3219c.size();
        this.f2952a = new int[size * 5];
        if (!c0451a.f3225i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2953b = new ArrayList<>(size);
        this.f2954c = new int[size];
        this.f2955d = new int[size];
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            AbstractC0470s.a aVar = c0451a.f3219c.get(i4);
            int i6 = i5 + 1;
            this.f2952a[i5] = aVar.f3236a;
            ArrayList<String> arrayList = this.f2953b;
            Fragment fragment = aVar.f3237b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f2952a;
            int i7 = i6 + 1;
            iArr[i6] = aVar.f3238c;
            int i8 = i7 + 1;
            iArr[i7] = aVar.f3239d;
            int i9 = i8 + 1;
            iArr[i8] = aVar.f3240e;
            iArr[i9] = aVar.f3241f;
            this.f2954c[i4] = aVar.f3242g.ordinal();
            this.f2955d[i4] = aVar.f3243h.ordinal();
            i4++;
            i5 = i9 + 1;
        }
        this.f2956e = c0451a.f3224h;
        this.f2957f = c0451a.f3227k;
        this.f2958g = c0451a.f3118v;
        this.f2959h = c0451a.f3228l;
        this.f2960i = c0451a.f3229m;
        this.f2961j = c0451a.f3230n;
        this.f2962k = c0451a.f3231o;
        this.f2963l = c0451a.f3232p;
        this.f2964m = c0451a.f3233q;
        this.f2965n = c0451a.f3234r;
    }

    /* renamed from: a */
    public C0451a m2365a(FragmentManager fragmentManager) {
        C0451a c0451a = new C0451a(fragmentManager);
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.f2952a.length) {
            AbstractC0470s.a aVar = new AbstractC0470s.a();
            int i6 = i4 + 1;
            aVar.f3236a = this.f2952a[i4];
            if (FragmentManager.m2388H0(2)) {
                Log.v("FragmentManager", "Instantiate " + c0451a + " op #" + i5 + " base fragment #" + this.f2952a[i6]);
            }
            String str = this.f2953b.get(i5);
            if (str != null) {
                aVar.f3237b = fragmentManager.m2478h0(str);
            } else {
                aVar.f3237b = null;
            }
            aVar.f3242g = AbstractC0496f.c.values()[this.f2954c[i5]];
            aVar.f3243h = AbstractC0496f.c.values()[this.f2955d[i5]];
            int[] iArr = this.f2952a;
            int i7 = i6 + 1;
            int i8 = iArr[i6];
            aVar.f3238c = i8;
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            aVar.f3239d = i10;
            int i11 = i9 + 1;
            int i12 = iArr[i9];
            aVar.f3240e = i12;
            int i13 = iArr[i11];
            aVar.f3241f = i13;
            c0451a.f3220d = i8;
            c0451a.f3221e = i10;
            c0451a.f3222f = i12;
            c0451a.f3223g = i13;
            c0451a.m2703f(aVar);
            i5++;
            i4 = i11 + 1;
        }
        c0451a.f3224h = this.f2956e;
        c0451a.f3227k = this.f2957f;
        c0451a.f3118v = this.f2958g;
        c0451a.f3225i = true;
        c0451a.f3228l = this.f2959h;
        c0451a.f3229m = this.f2960i;
        c0451a.f3230n = this.f2961j;
        c0451a.f3231o = this.f2962k;
        c0451a.f3232p = this.f2963l;
        c0451a.f3233q = this.f2964m;
        c0451a.f3234r = this.f2965n;
        c0451a.m2560v(1);
        return c0451a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeIntArray(this.f2952a);
        parcel.writeStringList(this.f2953b);
        parcel.writeIntArray(this.f2954c);
        parcel.writeIntArray(this.f2955d);
        parcel.writeInt(this.f2956e);
        parcel.writeString(this.f2957f);
        parcel.writeInt(this.f2958g);
        parcel.writeInt(this.f2959h);
        TextUtils.writeToParcel(this.f2960i, parcel, 0);
        parcel.writeInt(this.f2961j);
        TextUtils.writeToParcel(this.f2962k, parcel, 0);
        parcel.writeStringList(this.f2963l);
        parcel.writeStringList(this.f2964m);
        parcel.writeInt(this.f2965n ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f2952a = parcel.createIntArray();
        this.f2953b = parcel.createStringArrayList();
        this.f2954c = parcel.createIntArray();
        this.f2955d = parcel.createIntArray();
        this.f2956e = parcel.readInt();
        this.f2957f = parcel.readString();
        this.f2958g = parcel.readInt();
        this.f2959h = parcel.readInt();
        this.f2960i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2961j = parcel.readInt();
        this.f2962k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2963l = parcel.createStringArrayList();
        this.f2964m = parcel.createStringArrayList();
        this.f2965n = parcel.readInt() != 0;
    }
}
