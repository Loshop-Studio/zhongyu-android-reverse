package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.work.Data;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class ParcelableData implements Parcelable {
    private final Data data;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ParcelableData> CREATOR = new Parcelable.Creator<ParcelableData>() { // from class: androidx.work.multiprocess.parcelable.ParcelableData$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableData createFromParcel(Parcel inParcel) {
            AbstractC9133u.m16133g(inParcel, "inParcel");
            return new ParcelableData(inParcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableData[] newArray(int i10) {
            return new ParcelableData[i10];
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public ParcelableData(Data data) {
        AbstractC9133u.m16133g(data, "data");
        this.data = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Data getData() {
        return this.data;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC9133u.m16133g(parcel, "parcel");
        parcel.writeByteArray(this.data.toByteArray());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ParcelableData(Parcel inParcel) {
        Data dataFromByteArray;
        AbstractC9133u.m16133g(inParcel, "inParcel");
        byte[] bArrCreateByteArray = inParcel.createByteArray();
        this((bArrCreateByteArray == null || (dataFromByteArray = Data.Companion.fromByteArray(bArrCreateByteArray)) == null) ? Data.EMPTY : dataFromByteArray);
    }
}
