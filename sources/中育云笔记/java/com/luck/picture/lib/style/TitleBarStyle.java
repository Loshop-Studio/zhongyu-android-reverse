package com.luck.picture.lib.style;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public class TitleBarStyle implements Parcelable {
    public static final Parcelable.Creator<TitleBarStyle> CREATOR = new C7498a();

    /* renamed from: c */
    public boolean f12552c;

    /* renamed from: d */
    public int f12553d;

    /* renamed from: e */
    public int f12554e;

    /* renamed from: f */
    public String f12555f;

    /* renamed from: g */
    public int f12556g;

    /* renamed from: h */
    public int f12557h;

    /* renamed from: i */
    public int f12558i;

    /* renamed from: j */
    public int f12559j;

    /* renamed from: k */
    public int f12560k;

    /* renamed from: l */
    public int f12561l;

    /* renamed from: m */
    public boolean f12562m;

    /* renamed from: n */
    public int f12563n;

    /* renamed from: o */
    public int f12564o;

    /* renamed from: p */
    public boolean f12565p;

    /* renamed from: q */
    public int f12566q;

    /* renamed from: r */
    public String f12567r;

    /* renamed from: s */
    public int f12568s;

    /* renamed from: t */
    public int f12569t;

    /* renamed from: u */
    public int f12570u;

    /* renamed from: v */
    public boolean f12571v;

    /* renamed from: com.luck.picture.lib.style.TitleBarStyle$a */
    public class C7498a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TitleBarStyle createFromParcel(Parcel parcel) {
            return new TitleBarStyle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public TitleBarStyle[] newArray(int i10) {
            return new TitleBarStyle[i10];
        }
    }

    public TitleBarStyle() {
    }

    /* renamed from: a */
    public int m9555a() {
        return this.f12566q;
    }

    /* renamed from: b */
    public int m9556b() {
        return this.f12559j;
    }

    /* renamed from: c */
    public int m9557c() {
        return this.f12554e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public int m9558g() {
        return this.f12561l;
    }

    /* renamed from: h */
    public int m9559h() {
        return this.f12558i;
    }

    /* renamed from: i */
    public int m9560i() {
        return this.f12560k;
    }

    /* renamed from: j */
    public int m9561j() {
        return this.f12570u;
    }

    /* renamed from: k */
    public int m9562k() {
        return this.f12564o;
    }

    /* renamed from: l */
    public String m9563l() {
        return this.f12567r;
    }

    /* renamed from: m */
    public int m9564m() {
        return this.f12569t;
    }

    /* renamed from: n */
    public int m9565n() {
        return this.f12568s;
    }

    /* renamed from: o */
    public String m9566o() {
        return this.f12555f;
    }

    /* renamed from: p */
    public int m9567p() {
        return this.f12563n;
    }

    /* renamed from: q */
    public int m9568q() {
        return this.f12553d;
    }

    /* renamed from: r */
    public int m9569r() {
        return this.f12557h;
    }

    /* renamed from: s */
    public int m9570s() {
        return this.f12556g;
    }

    /* renamed from: t */
    public boolean m9571t() {
        return this.f12571v;
    }

    /* renamed from: u */
    public boolean m9572u() {
        return this.f12565p;
    }

    /* renamed from: v */
    public boolean m9573v() {
        return this.f12552c;
    }

    /* renamed from: w */
    public void m9574w(boolean z10) {
        this.f12565p = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f12552c ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f12553d);
        parcel.writeInt(this.f12554e);
        parcel.writeString(this.f12555f);
        parcel.writeInt(this.f12556g);
        parcel.writeInt(this.f12557h);
        parcel.writeInt(this.f12558i);
        parcel.writeInt(this.f12559j);
        parcel.writeInt(this.f12560k);
        parcel.writeInt(this.f12561l);
        parcel.writeByte(this.f12562m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f12563n);
        parcel.writeInt(this.f12564o);
        parcel.writeByte(this.f12565p ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f12566q);
        parcel.writeString(this.f12567r);
        parcel.writeInt(this.f12568s);
        parcel.writeInt(this.f12569t);
        parcel.writeInt(this.f12570u);
        parcel.writeByte(this.f12571v ? (byte) 1 : (byte) 0);
    }

    public TitleBarStyle(Parcel parcel) {
        this.f12552c = parcel.readByte() != 0;
        this.f12553d = parcel.readInt();
        this.f12554e = parcel.readInt();
        this.f12555f = parcel.readString();
        this.f12556g = parcel.readInt();
        this.f12557h = parcel.readInt();
        this.f12558i = parcel.readInt();
        this.f12559j = parcel.readInt();
        this.f12560k = parcel.readInt();
        this.f12561l = parcel.readInt();
        this.f12562m = parcel.readByte() != 0;
        this.f12563n = parcel.readInt();
        this.f12564o = parcel.readInt();
        this.f12565p = parcel.readByte() != 0;
        this.f12566q = parcel.readInt();
        this.f12567r = parcel.readString();
        this.f12568s = parcel.readInt();
        this.f12569t = parcel.readInt();
        this.f12570u = parcel.readInt();
        this.f12571v = parcel.readByte() != 0;
    }
}
