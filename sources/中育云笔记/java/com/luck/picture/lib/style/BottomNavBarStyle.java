package com.luck.picture.lib.style;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public class BottomNavBarStyle implements Parcelable {
    public static final Parcelable.Creator<BottomNavBarStyle> CREATOR = new C7495a();

    /* renamed from: c */
    public int f12480c;

    /* renamed from: d */
    public int f12481d;

    /* renamed from: e */
    public int f12482e;

    /* renamed from: f */
    public String f12483f;

    /* renamed from: g */
    public int f12484g;

    /* renamed from: h */
    public int f12485h;

    /* renamed from: i */
    public String f12486i;

    /* renamed from: j */
    public int f12487j;

    /* renamed from: k */
    public String f12488k;

    /* renamed from: l */
    public int f12489l;

    /* renamed from: m */
    public int f12490m;

    /* renamed from: n */
    public int f12491n;

    /* renamed from: o */
    public String f12492o;

    /* renamed from: p */
    public int f12493p;

    /* renamed from: q */
    public int f12494q;

    /* renamed from: r */
    public int f12495r;

    /* renamed from: s */
    public int f12496s;

    /* renamed from: t */
    public int f12497t;

    /* renamed from: u */
    public boolean f12498u;

    /* renamed from: com.luck.picture.lib.style.BottomNavBarStyle$a */
    public class C7495a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BottomNavBarStyle createFromParcel(Parcel parcel) {
            return new BottomNavBarStyle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BottomNavBarStyle[] newArray(int i10) {
            return new BottomNavBarStyle[i10];
        }
    }

    public BottomNavBarStyle() {
        this.f12498u = true;
    }

    /* renamed from: a */
    public String m9480a() {
        return this.f12488k;
    }

    /* renamed from: b */
    public int m9481b() {
        return this.f12490m;
    }

    /* renamed from: c */
    public int m9482c() {
        return this.f12489l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public int m9483g() {
        return this.f12480c;
    }

    /* renamed from: h */
    public int m9484h() {
        return this.f12482e;
    }

    /* renamed from: i */
    public int m9485i() {
        return this.f12491n;
    }

    /* renamed from: j */
    public String m9486j() {
        return this.f12492o;
    }

    /* renamed from: k */
    public int m9487k() {
        return this.f12494q;
    }

    /* renamed from: l */
    public int m9488l() {
        return this.f12493p;
    }

    /* renamed from: m */
    public int m9489m() {
        return this.f12481d;
    }

    /* renamed from: n */
    public String m9490n() {
        return this.f12483f;
    }

    /* renamed from: o */
    public int m9491o() {
        return this.f12485h;
    }

    /* renamed from: p */
    public int m9492p() {
        return this.f12484g;
    }

    /* renamed from: q */
    public String m9493q() {
        return this.f12486i;
    }

    /* renamed from: r */
    public int m9494r() {
        return this.f12487j;
    }

    /* renamed from: s */
    public int m9495s() {
        return this.f12495r;
    }

    /* renamed from: t */
    public int m9496t() {
        return this.f12497t;
    }

    /* renamed from: u */
    public int m9497u() {
        return this.f12496s;
    }

    /* renamed from: v */
    public boolean m9498v() {
        return this.f12498u;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12480c);
        parcel.writeInt(this.f12481d);
        parcel.writeInt(this.f12482e);
        parcel.writeString(this.f12483f);
        parcel.writeInt(this.f12484g);
        parcel.writeInt(this.f12485h);
        parcel.writeString(this.f12486i);
        parcel.writeInt(this.f12487j);
        parcel.writeString(this.f12488k);
        parcel.writeInt(this.f12489l);
        parcel.writeInt(this.f12490m);
        parcel.writeInt(this.f12491n);
        parcel.writeString(this.f12492o);
        parcel.writeInt(this.f12493p);
        parcel.writeInt(this.f12494q);
        parcel.writeInt(this.f12495r);
        parcel.writeInt(this.f12496s);
        parcel.writeInt(this.f12497t);
        parcel.writeByte(this.f12498u ? (byte) 1 : (byte) 0);
    }

    public BottomNavBarStyle(Parcel parcel) {
        this.f12498u = true;
        this.f12480c = parcel.readInt();
        this.f12481d = parcel.readInt();
        this.f12482e = parcel.readInt();
        this.f12483f = parcel.readString();
        this.f12484g = parcel.readInt();
        this.f12485h = parcel.readInt();
        this.f12486i = parcel.readString();
        this.f12487j = parcel.readInt();
        this.f12488k = parcel.readString();
        this.f12489l = parcel.readInt();
        this.f12490m = parcel.readInt();
        this.f12491n = parcel.readInt();
        this.f12492o = parcel.readString();
        this.f12493p = parcel.readInt();
        this.f12494q = parcel.readInt();
        this.f12495r = parcel.readInt();
        this.f12496s = parcel.readInt();
        this.f12497t = parcel.readInt();
        this.f12498u = parcel.readByte() != 0;
    }
}
