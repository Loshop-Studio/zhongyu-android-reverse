package androidx.work.multiprocess.parcelable;

import android.annotation.SuppressLint;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ParcelableRuntimeExtras implements Parcelable {
    public static final Parcelable.Creator<ParcelableRuntimeExtras> CREATOR = new Parcelable.Creator<ParcelableRuntimeExtras>() { // from class: androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public ParcelableRuntimeExtras createFromParcel(Parcel parcel) {
            return new ParcelableRuntimeExtras(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableRuntimeExtras[] newArray(int i9) {
            return new ParcelableRuntimeExtras[i9];
        }
    };
    private WorkerParameters.RuntimeExtras mRuntimeExtras;

    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        public static Parcelable castToParcelable(Network network) {
            return network;
        }
    }

    public ParcelableRuntimeExtras(@NonNull WorkerParameters.RuntimeExtras runtimeExtras) {
        this.mRuntimeExtras = runtimeExtras;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public WorkerParameters.RuntimeExtras getRuntimeExtras() {
        return this.mRuntimeExtras;
    }

    @Override // android.os.Parcelable
    @SuppressLint({"NewApi"})
    public void writeToParcel(@NonNull Parcel parcel, int i9) {
        Network network = Build.VERSION.SDK_INT >= 28 ? this.mRuntimeExtras.network : null;
        boolean z9 = false;
        boolean z10 = network != null;
        ParcelUtils.writeBooleanValue(parcel, z10);
        if (z10) {
            parcel.writeParcelable(Api21Impl.castToParcelable(network), i9);
        }
        WorkerParameters.RuntimeExtras runtimeExtras = this.mRuntimeExtras;
        List<Uri> list = runtimeExtras.triggeredContentUris;
        List<String> list2 = runtimeExtras.triggeredContentAuthorities;
        boolean z11 = (list == null || list.isEmpty()) ? false : true;
        ParcelUtils.writeBooleanValue(parcel, z11);
        if (z11) {
            int size = list.size();
            Uri[] uriArr = new Uri[size];
            for (int i10 = 0; i10 < size; i10++) {
                uriArr[i10] = list.get(i10);
            }
            parcel.writeParcelableArray(uriArr, i9);
        }
        if (list2 != null && !list2.isEmpty()) {
            z9 = true;
        }
        ParcelUtils.writeBooleanValue(parcel, z9);
        if (z9) {
            parcel.writeStringList(list2);
        }
    }

    public ParcelableRuntimeExtras(@NonNull Parcel parcel) {
        ArrayList arrayList;
        ClassLoader classLoader = getClass().getClassLoader();
        Network network = ParcelUtils.readBooleanValue(parcel) ? (Network) parcel.readParcelable(classLoader) : null;
        if (ParcelUtils.readBooleanValue(parcel)) {
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((Uri) parcelable);
            }
        } else {
            arrayList = null;
        }
        ArrayList<String> arrayListCreateStringArrayList = ParcelUtils.readBooleanValue(parcel) ? parcel.createStringArrayList() : null;
        WorkerParameters.RuntimeExtras runtimeExtras = new WorkerParameters.RuntimeExtras();
        this.mRuntimeExtras = runtimeExtras;
        if (Build.VERSION.SDK_INT >= 28) {
            runtimeExtras.network = network;
        }
        if (arrayList != null) {
            runtimeExtras.triggeredContentUris = arrayList;
        }
        if (arrayListCreateStringArrayList != null) {
            runtimeExtras.triggeredContentAuthorities = arrayListCreateStringArrayList;
        }
    }
}
