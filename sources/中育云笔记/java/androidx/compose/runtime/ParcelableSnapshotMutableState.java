package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
final class ParcelableSnapshotMutableState<T> extends SnapshotMutableStateImpl<T> implements Parcelable {
    private static final int PolicyNeverEquals = 0;
    private static final int PolicyReferentialEquality = 2;
    private static final int PolicyStructuralEquality = 1;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>>() { // from class: androidx.compose.runtime.ParcelableSnapshotMutableState$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableState<Object>[] newArray(int i10) {
            return new ParcelableSnapshotMutableState[i10];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            SnapshotMutationPolicy snapshotMutationPolicyNeverEqualPolicy;
            if (classLoader == null) {
                classLoader = ParcelableSnapshotMutableState$Companion$CREATOR$1.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i10 = parcel.readInt();
            if (i10 == 0) {
                snapshotMutationPolicyNeverEqualPolicy = SnapshotStateKt.neverEqualPolicy();
            } else if (i10 == 1) {
                snapshotMutationPolicyNeverEqualPolicy = SnapshotStateKt.structuralEqualityPolicy();
            } else if (i10 == 2) {
                snapshotMutationPolicyNeverEqualPolicy = SnapshotStateKt.referentialEqualityPolicy();
            } else {
                throw new IllegalStateException("Unsupported MutableState policy " + i10 + " was restored");
            }
            return new ParcelableSnapshotMutableState<>(value, snapshotMutationPolicyNeverEqualPolicy);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }

        private Companion() {
        }
    }

    public ParcelableSnapshotMutableState(T t10, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        super(t10, snapshotMutationPolicy);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11;
        parcel.writeValue(getValue());
        SnapshotMutationPolicy<T> policy = getPolicy();
        if (AbstractC9979u.m20289b(policy, SnapshotStateKt.neverEqualPolicy())) {
            i11 = 0;
        } else if (AbstractC9979u.m20289b(policy, SnapshotStateKt.structuralEqualityPolicy())) {
            i11 = 1;
        } else {
            if (!AbstractC9979u.m20289b(policy, SnapshotStateKt.referentialEqualityPolicy())) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
