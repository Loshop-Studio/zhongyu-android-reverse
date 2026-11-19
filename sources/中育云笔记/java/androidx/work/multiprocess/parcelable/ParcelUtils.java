package androidx.work.multiprocess.parcelable;

import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class ParcelUtils {
    private ParcelUtils() {
    }

    public static boolean readBooleanValue(@NonNull Parcel parcel) {
        return parcel.readInt() == 1;
    }

    public static void writeBooleanValue(@NonNull Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }
}
