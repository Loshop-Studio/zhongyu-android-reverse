package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p169x0.AbstractC3456y;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableWorkRequests implements Parcelable {
    public static final Parcelable.Creator<ParcelableWorkRequests> CREATOR = new C0844a();

    /* renamed from: a */
    private final List<AbstractC3456y> f4938a;

    /* renamed from: androidx.work.multiprocess.parcelable.ParcelableWorkRequests$a */
    class C0844a implements Parcelable.Creator<ParcelableWorkRequests> {
        C0844a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableWorkRequests createFromParcel(Parcel parcel) {
            return new ParcelableWorkRequests(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableWorkRequests[] newArray(int i4) {
            return new ParcelableWorkRequests[i4];
        }
    }

    protected ParcelableWorkRequests(Parcel parcel) {
        Parcelable[] parcelableArray = parcel.readParcelableArray(getClass().getClassLoader());
        this.f4938a = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            this.f4938a.add(((ParcelableWorkRequest) parcelable).m4330a());
        }
    }

    /* renamed from: a */
    public List<AbstractC3456y> m4333a() {
        return this.f4938a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        ParcelableWorkRequest[] parcelableWorkRequestArr = new ParcelableWorkRequest[this.f4938a.size()];
        for (int i5 = 0; i5 < this.f4938a.size(); i5++) {
            parcelableWorkRequestArr[i5] = new ParcelableWorkRequest(this.f4938a.get(i5));
        }
        parcel.writeParcelableArray(parcelableWorkRequestArr, i4);
    }
}
