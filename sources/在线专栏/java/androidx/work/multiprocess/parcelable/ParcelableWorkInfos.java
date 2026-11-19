package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p169x0.C3453v;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableWorkInfos implements Parcelable {
    public static final Parcelable.Creator<ParcelableWorkInfos> CREATOR = new C0841a();

    /* renamed from: a */
    private final List<C3453v> f4935a;

    /* renamed from: androidx.work.multiprocess.parcelable.ParcelableWorkInfos$a */
    class C0841a implements Parcelable.Creator<ParcelableWorkInfos> {
        C0841a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableWorkInfos createFromParcel(Parcel parcel) {
            return new ParcelableWorkInfos(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableWorkInfos[] newArray(int i4) {
            return new ParcelableWorkInfos[i4];
        }
    }

    public ParcelableWorkInfos(List<C3453v> list) {
        this.f4935a = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        ParcelableWorkInfo[] parcelableWorkInfoArr = new ParcelableWorkInfo[this.f4935a.size()];
        for (int i5 = 0; i5 < this.f4935a.size(); i5++) {
            parcelableWorkInfoArr[i5] = new ParcelableWorkInfo(this.f4935a.get(i5));
        }
        parcel.writeParcelableArray(parcelableWorkInfoArr, i4);
    }

    protected ParcelableWorkInfos(Parcel parcel) {
        Parcelable[] parcelableArray = parcel.readParcelableArray(getClass().getClassLoader());
        this.f4935a = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            this.f4935a.add(((ParcelableWorkInfo) parcelable).m4322a());
        }
    }
}
