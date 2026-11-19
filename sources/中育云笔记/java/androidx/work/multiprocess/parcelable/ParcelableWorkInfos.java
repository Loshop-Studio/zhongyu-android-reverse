package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ParcelableWorkInfos implements Parcelable {
    public static final Parcelable.Creator<ParcelableWorkInfos> CREATOR = new Parcelable.Creator<ParcelableWorkInfos>() { // from class: androidx.work.multiprocess.parcelable.ParcelableWorkInfos.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkInfos createFromParcel(Parcel parcel) {
            return new ParcelableWorkInfos(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableWorkInfos[] newArray(int i10) {
            return new ParcelableWorkInfos[i10];
        }
    };
    private final List<WorkInfo> mInfos;

    public ParcelableWorkInfos(@NonNull List<WorkInfo> list) {
        this.mInfos = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public List<WorkInfo> getWorkInfos() {
        return this.mInfos;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        ParcelableWorkInfo[] parcelableWorkInfoArr = new ParcelableWorkInfo[this.mInfos.size()];
        for (int i11 = 0; i11 < this.mInfos.size(); i11++) {
            parcelableWorkInfoArr[i11] = new ParcelableWorkInfo(this.mInfos.get(i11));
        }
        parcel.writeParcelableArray(parcelableWorkInfoArr, i10);
    }

    public ParcelableWorkInfos(@NonNull Parcel parcel) {
        Parcelable[] parcelableArray = parcel.readParcelableArray(getClass().getClassLoader());
        this.mInfos = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            this.mInfos.add(((ParcelableWorkInfo) parcelable).getWorkInfo());
        }
    }
}
