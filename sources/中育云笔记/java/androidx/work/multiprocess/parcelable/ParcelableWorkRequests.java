package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ParcelableWorkRequests implements Parcelable {
    public static final Parcelable.Creator<ParcelableWorkRequests> CREATOR = new Parcelable.Creator<ParcelableWorkRequests>() { // from class: androidx.work.multiprocess.parcelable.ParcelableWorkRequests.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkRequests createFromParcel(Parcel parcel) {
            return new ParcelableWorkRequests(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkRequests[] newArray(int i10) {
            return new ParcelableWorkRequests[i10];
        }
    };
    private final List<WorkRequest> mRequests;

    public ParcelableWorkRequests(@NonNull List<WorkRequest> list) {
        this.mRequests = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public List<WorkRequest> getRequests() {
        return this.mRequests;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        ParcelableWorkRequest[] parcelableWorkRequestArr = new ParcelableWorkRequest[this.mRequests.size()];
        for (int i11 = 0; i11 < this.mRequests.size(); i11++) {
            parcelableWorkRequestArr[i11] = new ParcelableWorkRequest(this.mRequests.get(i11));
        }
        parcel.writeParcelableArray(parcelableWorkRequestArr, i10);
    }

    public ParcelableWorkRequests(@NonNull Parcel parcel) {
        Parcelable[] parcelableArray = parcel.readParcelableArray(getClass().getClassLoader());
        this.mRequests = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            this.mRequests.add(((ParcelableWorkRequest) parcelable).getWorkRequest());
        }
    }
}
