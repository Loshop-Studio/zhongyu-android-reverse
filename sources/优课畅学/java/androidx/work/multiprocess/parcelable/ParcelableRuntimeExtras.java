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
        public ParcelableRuntimeExtras[] newArray(int i10) {
            return new ParcelableRuntimeExtras[i10];
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
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        Network network = Build.VERSION.SDK_INT >= 28 ? this.mRuntimeExtras.network : null;
        boolean z10 = false;
        boolean z11 = network != null;
        ParcelUtils.writeBooleanValue(parcel, z11);
        if (z11) {
            parcel.writeParcelable(Api21Impl.castToParcelable(network), i10);
        }
        WorkerParameters.RuntimeExtras runtimeExtras = this.mRuntimeExtras;
        List<Uri> list = runtimeExtras.triggeredContentUris;
        List<String> list2 = runtimeExtras.triggeredContentAuthorities;
        boolean z12 = (list == null || list.isEmpty()) ? false : true;
        ParcelUtils.writeBooleanValue(parcel, z12);
        if (z12) {
            int size = list.size();
            Uri[] uriArr = new Uri[size];
            for (int i11 = 0; i11 < size; i11++) {
                uriArr[i11] = list.get(i11);
            }
            parcel.writeParcelableArray(uriArr, i10);
        }
        if (list2 != null && !list2.isEmpty()) {
            z10 = true;
        }
        ParcelUtils.writeBooleanValue(parcel, z10);
        if (z10) {
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
