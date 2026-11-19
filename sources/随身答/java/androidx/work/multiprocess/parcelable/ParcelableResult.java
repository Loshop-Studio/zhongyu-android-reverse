package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Data;
import androidx.work.ListenableWorker;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ParcelableResult implements Parcelable {
    public static final Parcelable.Creator<ParcelableResult> CREATOR = new Parcelable.Creator<ParcelableResult>() { // from class: androidx.work.multiprocess.parcelable.ParcelableResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public ParcelableResult createFromParcel(Parcel parcel) {
            return new ParcelableResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableResult[] newArray(int i9) {
            return new ParcelableResult[i9];
        }
    };
    private final ListenableWorker.Result mResult;

    public ParcelableResult(@NonNull ListenableWorker.Result result) {
        this.mResult = result;
    }

    @NonNull
    private static ListenableWorker.Result intToResultType(int i9, @NonNull Data data) {
        if (i9 == 1) {
            return ListenableWorker.Result.retry();
        }
        if (i9 == 2) {
            return ListenableWorker.Result.success(data);
        }
        if (i9 == 3) {
            return ListenableWorker.Result.failure(data);
        }
        throw new IllegalStateException("Unknown result type " + i9);
    }

    private static int resultTypeOf(ListenableWorker.Result result) {
        if (result instanceof ListenableWorker.Result.Retry) {
            return 1;
        }
        if (result instanceof ListenableWorker.Result.Success) {
            return 2;
        }
        if (result instanceof ListenableWorker.Result.Failure) {
            return 3;
        }
        throw new IllegalStateException("Unknown Result " + result);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public ListenableWorker.Result getResult() {
        return this.mResult;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i9) {
        parcel.writeInt(resultTypeOf(this.mResult));
        new ParcelableData(this.mResult.getOutputData()).writeToParcel(parcel, i9);
    }

    public ParcelableResult(@NonNull Parcel parcel) {
        this.mResult = intToResultType(parcel.readInt(), new ParcelableData(parcel).getData());
    }
}
