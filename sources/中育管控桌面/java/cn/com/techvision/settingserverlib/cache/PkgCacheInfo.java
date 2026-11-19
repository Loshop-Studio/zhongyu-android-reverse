package cn.com.techvision.settingserverlib.cache;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class PkgCacheInfo implements Parcelable {
    public static final Parcelable.Creator<PkgCacheInfo> CREATOR = new C4540a();

    /* renamed from: a */
    public String f1411a;

    /* renamed from: b */
    public String f1412b;

    /* renamed from: c */
    public long f1413c;

    /* renamed from: d */
    public String f1414d;

    /* renamed from: cn.com.techvision.settingserverlib.cache.PkgCacheInfo$a */
    public class C4540a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PkgCacheInfo createFromParcel(Parcel parcel) {
            return new PkgCacheInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PkgCacheInfo[] newArray(int i6) {
            return new PkgCacheInfo[i6];
        }
    }

    public PkgCacheInfo(Parcel parcel) {
        this.f1411a = parcel.readString();
        this.f1412b = parcel.readString();
        this.f1413c = parcel.readLong();
        this.f1414d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f1411a);
        parcel.writeString(this.f1412b);
        parcel.writeLong(this.f1413c);
        parcel.writeString(this.f1414d);
    }
}
