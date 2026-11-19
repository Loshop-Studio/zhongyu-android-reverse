package com.luck.picture.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class LocalMediaFolder implements Parcelable {
    public static final Parcelable.Creator<LocalMediaFolder> CREATOR = new C7486a();

    /* renamed from: c */
    public long f12429c;

    /* renamed from: d */
    public String f12430d;

    /* renamed from: e */
    public String f12431e;

    /* renamed from: f */
    public String f12432f;

    /* renamed from: g */
    public int f12433g;

    /* renamed from: h */
    public boolean f12434h;

    /* renamed from: i */
    public ArrayList f12435i;

    /* renamed from: j */
    public int f12436j;

    /* renamed from: k */
    public boolean f12437k;

    /* renamed from: com.luck.picture.lib.entity.LocalMediaFolder$a */
    public class C7486a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LocalMediaFolder createFromParcel(Parcel parcel) {
            return new LocalMediaFolder(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public LocalMediaFolder[] newArray(int i10) {
            return new LocalMediaFolder[i10];
        }
    }

    public LocalMediaFolder() {
        this.f12429c = -1L;
        this.f12435i = new ArrayList();
        this.f12436j = 1;
    }

    /* renamed from: a */
    public long m9406a() {
        return this.f12429c;
    }

    /* renamed from: b */
    public int m9407b() {
        return this.f12436j;
    }

    /* renamed from: c */
    public ArrayList m9408c() {
        ArrayList arrayList = this.f12435i;
        return arrayList != null ? arrayList : new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public String m9409g() {
        return this.f12431e;
    }

    /* renamed from: h */
    public String m9410h() {
        return this.f12432f;
    }

    /* renamed from: i */
    public String m9411i() {
        return TextUtils.isEmpty(this.f12430d) ? "unknown" : this.f12430d;
    }

    /* renamed from: j */
    public int m9412j() {
        return this.f12433g;
    }

    /* renamed from: k */
    public boolean m9413k() {
        return this.f12437k;
    }

    /* renamed from: l */
    public boolean m9414l() {
        return this.f12434h;
    }

    /* renamed from: m */
    public void m9415m(long j10) {
        this.f12429c = j10;
    }

    /* renamed from: n */
    public void m9416n(int i10) {
        this.f12436j = i10;
    }

    /* renamed from: o */
    public void m9417o(ArrayList arrayList) {
        this.f12435i = arrayList;
    }

    /* renamed from: p */
    public void m9418p(String str) {
        this.f12431e = str;
    }

    /* renamed from: q */
    public void m9419q(String str) {
        this.f12432f = str;
    }

    /* renamed from: r */
    public void m9420r(String str) {
        this.f12430d = str;
    }

    /* renamed from: s */
    public void m9421s(int i10) {
        this.f12433g = i10;
    }

    /* renamed from: t */
    public void m9422t(boolean z10) {
        this.f12437k = z10;
    }

    /* renamed from: u */
    public void m9423u(boolean z10) {
        this.f12434h = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f12429c);
        parcel.writeString(this.f12430d);
        parcel.writeString(this.f12431e);
        parcel.writeString(this.f12432f);
        parcel.writeInt(this.f12433g);
        parcel.writeByte(this.f12434h ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(this.f12435i);
        parcel.writeInt(this.f12436j);
        parcel.writeByte(this.f12437k ? (byte) 1 : (byte) 0);
    }

    public LocalMediaFolder(Parcel parcel) {
        this.f12429c = -1L;
        this.f12435i = new ArrayList();
        this.f12436j = 1;
        this.f12429c = parcel.readLong();
        this.f12430d = parcel.readString();
        this.f12431e = parcel.readString();
        this.f12432f = parcel.readString();
        this.f12433g = parcel.readInt();
        this.f12434h = parcel.readByte() != 0;
        this.f12435i = parcel.createTypedArrayList(LocalMedia.CREATOR);
        this.f12436j = parcel.readInt();
        this.f12437k = parcel.readByte() != 0;
    }
}
