package cn.com.techvision.settingserverlib.cache;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes3.dex */
public class PkgCacheInfoList implements Parcelable {
    public static final Parcelable.Creator<PkgCacheInfoList> CREATOR = new C4541a();

    /* renamed from: a */
    public List f1415a;

    /* renamed from: cn.com.techvision.settingserverlib.cache.PkgCacheInfoList$a */
    public class C4541a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PkgCacheInfoList createFromParcel(Parcel parcel) {
            return new PkgCacheInfoList(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PkgCacheInfoList[] newArray(int i6) {
            return new PkgCacheInfoList[i6];
        }
    }

    public PkgCacheInfoList(Parcel parcel) {
        this.f1415a = parcel.createTypedArrayList(PkgCacheInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeTypedList(this.f1415a);
    }
}
